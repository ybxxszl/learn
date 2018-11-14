package com.wjy.util.redis.two;

import com.wjy.util.redis.JedisUtil;
import redis.clients.jedis.Jedis;

public class Init {

	public static void main(String[] args) {

		Jedis jedis = JedisUtil.getJedis();

		jedis.subscribe(new MyJedisPubSub(), "__keyevent@0__:expired");

	}

}
