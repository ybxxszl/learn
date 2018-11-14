package com.wjy.util.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisUtil {

	private static final String HOST = "127.0.0.1";
	private static final int PORT = 6379;
	private static JedisPool jedisPool = new JedisPool(HOST, PORT);

	public static Jedis getJedis() {
		return jedisPool.getResource();
	}

}
