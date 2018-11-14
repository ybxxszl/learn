package com.wjy.util.redis.one;

import java.util.Set;

import com.wjy.util.redis.JedisUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class Consumer {

	// 消费者
	public static void main(String[] args) throws Exception {

		Jedis jedis = JedisUtil.getJedis();

		while (true) {

			Set<Tuple> item = jedis.zrangeWithScores("Order", 0, 1);

			if (item == null || item.isEmpty()) {

				Thread.sleep(1000);

			} else {

				double now = System.currentTimeMillis() / 1000;

				double score = ((Tuple) item.toArray()[0]).getScore();

				if (now >= score) {

					String key = ((Tuple) item.toArray()[0]).getElement();

					Long num = jedis.zrem("Order", key);

					if (num != null && num > 0) {

						System.out.println("订单：" + key);

					}

				}

			}

		}

	}

}
