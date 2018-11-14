package com.wjy.util.redis.two;

import com.wjy.util.redis.JedisUtil;

import redis.clients.jedis.Jedis;

public class Test {

	public static void main(String[] args) {

		Jedis jedis = JedisUtil.getJedis();

		for (int i = 1; i <= 10; i++) {

			int t = (int) (Math.random() * 60 + 1);

			String orderID = "OrderID:" + i;

			jedis.setex(orderID, t, orderID);

			System.out.println("订单：" + orderID + " - " + t);

		}

	}

}
