package com.wjy.util.redis.two;

import redis.clients.jedis.JedisPubSub;

public class MyJedisPubSub extends JedisPubSub {

	@Override
	public void onMessage(String channel, String message) {
		System.out.println(channel + ": " + message);
	}

}
