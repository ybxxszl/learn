package com.wjy.util.redis.one;

import com.wjy.util.redis.JedisUtil;

import redis.clients.jedis.Jedis;

public class Producer {

	// 生产者
	public static void main(String[] args) throws Exception {

		Jedis jedis = JedisUtil.getJedis();

		for (int i = 1; i <= 100; i++) {

			Thread.sleep(5000);

			String orderID = "OrderID:" + i;

			jedis.zadd("Order", System.currentTimeMillis() / 1000, orderID);

			// System.out.println("订单：" + orderID);

		}

	}

}
