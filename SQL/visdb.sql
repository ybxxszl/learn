一、查询订单要货日期和次数（订单ID 订单编号 要货编号 订单日期 要货日期 要货次数）
SELECT
	opi.protocol_id,
	opi.protocol_code,
	group_concat( oi.order_code ),
	opi.protocol_date,
	group_concat( oi.order_date ),
	count( oi.protocol_id ) AS c 
FROM
	order_protocol_info opi
	LEFT JOIN order_info oi ON opi.protocol_id = oi.protocol_id 
WHERE
	opi.corp_id = '1021a228-a311-4acc-b30e-457876d35788' 
	AND opi.state = 4 
GROUP BY
	opi.protocol_id 
ORDER BY
	c DESC;

二、查询订单总吨数（订单ID 总吨数）
SELECT
	opi.protocol_id,
	sum( opib.produce_quantity ) AS c 
FROM
	order_protocol_info opi
	JOIN order_protocol_info_b opib ON opi.protocol_id = opib.protocol_id 
WHERE
	opi.corp_id = '1021a228-a311-4acc-b30e-457876d35788' 
	AND opi.state = 4 
GROUP BY
	opi.protocol_id 
ORDER BY
	c DESC;

三、查询某订单要货日期及吨数（订单ID 订单编号 要货编号 订单日期 要货日期 要货吨数）
SELECT
	oi.protocol_id,
	opi.protocol_code,
	oi.order_code,
	opi.protocol_date,
	oi.order_date,
	sum( oib.produce_quantity )
FROM
	order_info oi
	JOIN order_info_b oib ON oi.order_id = oib.order_id
	JOIN order_protocol_info opi ON opi.protocol_id = oi.protocol_id 
WHERE
	oi.protocol_id = 'ce86171b-f996-0705-2af9-d66d0ccb02a5' 
GROUP BY
	oi.order_id 
ORDER BY
	oi.order_date DESC;