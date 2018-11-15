package com.wjy.util.redis;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class RedisUtil {

	public static Map<String, Double> zrangeByScoreWithScores(String key) {

		Jedis jedis = JedisUtil.getJedis();

		Set<Tuple> set = jedis.zrangeByScoreWithScores(key, "-inf", "+inf");

		Map<String, Double> map = new HashMap<String, Double>();

		for (Tuple tuple : set) {

			map.put(tuple.getElement(), tuple.getScore());

		}

		return map;

	}

	public static Map<String, Double> zrangeByScoreWithScores(String key, String min, String max) {

		Jedis jedis = JedisUtil.getJedis();

		Set<Tuple> set = jedis.zrangeByScoreWithScores(key, min, max);

		Map<String, Double> map = new HashMap<String, Double>();

		for (Tuple tuple : set) {

			map.put(tuple.getElement(), tuple.getScore());

		}

		return map;

	}

	public static Map<String, Double> zrangeByScoreWithScores(String key, double min, double max) {

		Jedis jedis = JedisUtil.getJedis();

		Set<Tuple> set = jedis.zrangeByScoreWithScores(key, min, max);

		Map<String, Double> map = new HashMap<String, Double>();

		for (Tuple tuple : set) {

			map.put(tuple.getElement(), tuple.getScore());

		}

		return map;

	}

	public static Map<String, Double> zrangeByScoreWithScores(String key, int offset, int count) {

		Jedis jedis = JedisUtil.getJedis();

		Set<Tuple> set = jedis.zrangeByScoreWithScores(key, "-inf", "+inf", offset, count);

		Map<String, Double> map = new HashMap<String, Double>();

		for (Tuple tuple : set) {

			map.put(tuple.getElement(), tuple.getScore());

		}

		return map;

	}

	public static Map<String, Double> zrangeByScoreWithScores(String key, String min, String max, int offset,
			int count) {

		Jedis jedis = JedisUtil.getJedis();

		Set<Tuple> set = jedis.zrangeByScoreWithScores(key, min, max, offset, count);

		Map<String, Double> map = new HashMap<String, Double>();

		for (Tuple tuple : set) {

			map.put(tuple.getElement(), tuple.getScore());

		}

		return map;

	}

	public static Map<String, Double> zrangeByScoreWithScores(String key, double min, double max, int offset,
			int count) {

		Jedis jedis = JedisUtil.getJedis();

		Set<Tuple> set = jedis.zrangeByScoreWithScores(key, min, max, offset, count);

		Map<String, Double> map = new HashMap<String, Double>();

		for (Tuple tuple : set) {

			map.put(tuple.getElement(), tuple.getScore());

		}

		return map;

	}

	/**
	 * 根据key获取有序集合的数据总条数
	 * 
	 * @param key
	 * @return Long 有序集合的数据总条数
	 */
	public static Long zcard(String key) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zcard(key);

	}

	/**
	 * 获取score在min和max中的数据的总条数，包含min和max
	 * 
	 * @param key
	 * @param min
	 * @param max
	 * @return Long 总条数
	 */
	public static Long zcount(String key, String min, String max) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zcount(key, min, max);

	}

	/**
	 * 获取score在min和max中的数据的总条数，包含min和max
	 * 
	 * @param key
	 * @param min
	 * @param max
	 * @return Long 总条数
	 */
	public static Long zcount(String key, double min, double max) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zcount(key, min, max);

	}

	/**
	 * 根据key和value获取数据在有序集合中的索引
	 * 
	 * @param key
	 * @param value
	 * @return Long 索引
	 */
	public static Long zrank(String key, String value) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zrank(key, value);

	}

	/**
	 * 根据key和value获取score
	 * 
	 * @param key
	 * @param value
	 * @return Double score
	 */
	public static Double zscore(String key, String value) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zscore(key, value);

	}

	/**
	 * 添加一条数据到有序集合
	 * 
	 * @param key
	 * @param value
	 * @param score
	 * @return Long 添加的条数
	 */
	public static Long zadd(String key, String value, double score) {

		Map<String, Double> map = new HashMap<String, Double>();

		map.put(value, score);

		return zadd(key, map);

	}

	/**
	 * 以Map集合的方式添加多条数据到有序集合
	 * 
	 * @param key
	 * @param map
	 * @return Long 添加的条数
	 */
	public static Long zadd(String key, Map<String, Double> map) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zadd(key, map);

	}

	/**
	 * 根据key和value将score=score+add
	 * 
	 * @param key
	 * @param value
	 * @param add
	 * @return Double score
	 */
	public static Double zincrby(String key, String value, double add) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zincrby(key, add, value);

	}

	/**
	 * 根据key和value删除一至多条数据
	 * 
	 * @param key
	 * @param values
	 * @return Long 删除的条数
	 */
	public static Long zrem(String key, String... values) {

		Jedis jedis = JedisUtil.getJedis();

		return jedis.zrem(key, values);

	}

}
