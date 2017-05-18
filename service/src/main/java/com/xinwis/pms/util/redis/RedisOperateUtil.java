package com.xinwis.pms.util.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.SortingParams;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
*      
* description：   
* creator：yingjie
* createtime：2016年3月28日 下午4:33:49       
*
 */
@Component
public class RedisOperateUtil {
	
	@Autowired
	public IfoRedisPool jedisPool;
	
	private Jedis getResource(){
		Jedis jedis = jedisPool.getResource();
    	return jedis;
	}
	
    /**
     * 判断key是否存在Redis
     * @param key
     * @return
     */
	public boolean keyExists(String key){
		Jedis jedis = getResource();
		boolean result = jedis.exists(key);
		jedis.close();
		return result;
	}
	/**
	 * 存入(已存在的时候值会被覆盖)
	 * @param key
	 * @param value
	 * @return
	 */
	public String set(String key,String value){
		Jedis jedis = getResource();
		String result = jedis.set(key,value);
		jedis.close();
		return result;
	}
	/**
	 * 存入并设置生命周期
	 * @param key
	 * @param seconds
	 * @param value
	 * @return
	 */
	public String setValueAndLifeCycle(String key,int seconds,String value){
		Jedis jedis = getResource();
		String result = jedis.setex(key, seconds, value);
		jedis.close();
		return result;
	}
	/**
	 * 获取原来的值并进行更新
	 * @param key
	 * @param newValue
	 * @return
	 */
	public String getAndUpdate(String key,String newValue){
		Jedis jedis = getResource();
		String result = jedis.getSet(key, newValue);
		jedis.close();
		return result;
	}
	/**
	 * 获取key的值并进行字符串裁剪
	 * @param key
	 * @param startOffset
	 * @param endOffset
	 * @return
	 */
	public String getAndSubStr(String key,int startOffset,int endOffset){
		Jedis jedis = getResource();
		String result = jedis.getrange(key, startOffset, endOffset);
		jedis.close();
		return result;
	}
	/**
	 * 存入(已存在的时候值不会被覆盖)
	 * @param key
	 * @param value
	 * @return
	 */
	public Long setNotCover(String key,String value){
		Jedis jedis = getResource();
		Long result = jedis.setnx(key, value);
		jedis.close();
		return result;
	}
	/**
	 * 取值key值
	 * @param key
	 * @return
	 */
	public String get(String key){
		Jedis jedis = getResource();
		String result = jedis.get(key);
		jedis.close();
		return result;
	}
	
	
	/**
	 * 列出Redis中所有存在的key
	 * @return
	 */
	public  Set<String> listKey(){
		Jedis jedis = getResource();
		Set<String> result = jedis.keys("*"); 
		jedis.close();
		return result;
	}
	/**
	 * 删除Redis中的key与其对于值
	 * @param key
	 * @return
	 */
	public Long deleteKey(String key){
		Jedis jedis = getResource();
		Long result = jedis.del(key);
		jedis.close();
		return result;
	}
	/**
	 * 设置key的生命周期
	 * @param key
	 * @param seconds
	 * @return
	 */
	public Long setKeyLifeCycle(String key,int seconds){
		Jedis jedis = getResource();
		Long result = jedis.expire(key, seconds);
		jedis.close();
		return result;
	}
	/**
	 * 查看key的生命周期
	 * @param key
	 * @return
	 */
	public Long getKeyLifeCycle(String key){
		Jedis jedis = getResource();
		Long result = jedis.ttl(key);
		jedis.close();
		return result;
	}
	/**
	 * 查看key所储存的值的类型
	 * @param key
	 * @return
	 */
	public String getKeyType(String key){
		Jedis jedis = getResource();
		String result = jedis.type(key);
		jedis.close();
		return result;
	}
	
	/**
	 * 原来值后面追加
	 * @param key
	 * @param value
	 * @return
	 */
	public Long append(String key,String value){
		Jedis jedis = getResource();
		Long result = jedis.append(key, value);
		jedis.close();
		return result;
	}
	/**
	 * 存入一系列key和values
	 * @param keysvalues
	 * @return
	 */
	public String setKVs(String... keysvalues){
		Jedis jedis = getResource();
		String result = jedis.mset(keysvalues);
		jedis.close();
		return result;
	}
	/**
	 * 获取一系列key对应的值
	 * @param keys
	 * @return
	 */
	public List<String> getKs(String... keys){
		Jedis jedis = getResource();
		List<String> result = jedis.mget(keys);
		jedis.close();
		return result;
	}
	/**
	 * 批量删除keys
	 * @param keys
	 * @return
	 */
	public Long deleteKeys(String... keys){
		Jedis jedis = getResource();
		Long result = jedis.del(keys);
		jedis.close();
		return result;
	}
	/**
	 * 清空数据库里面的所有值
	 * @return
	 */
	public String flushDB(){
		Jedis jedis = getResource();
		String result = jedis.flushDB();
		jedis.close();
		return result;
	}
	/**
	 * 插入list
	 * @param key
	 * @param valueList
	 * @return
	 */
	public Long setList(String key,List<String> valueList){
		Jedis jedis = getResource();
		Long valueCont = 0l;
		for(String value : valueList){
			valueCont += jedis.lpush(key, value);
		}
		jedis.close();
		return valueCont;
	}
	/**
	 * 遍历list里面的所有元素
	 * @param key
	 * @return
	 */
	public List<String> getList(String key){
		Jedis jedis = getResource();
		List<String> result = jedis.lrange(key, 0, -1);
		jedis.close();
		return result;
	}
	/**
	 * 根据下标范围获取list里面的值
	 * @param key
	 * @param startOffset
	 * @param endOffset  -1代表最后一个元素
	 * @return
	 */
	public List<String> getListByRange(String key,int startOffset,int endOffset){
		Jedis jedis = getResource();
		List<String> result = jedis.lrange(key, startOffset, endOffset);
		jedis.close();
		return result;
	}
	
	/**
	 * 删除列表指定的值 ，第二个参数为删除的个数（有重复时），后add进去的值先被删，类似于出栈
	 * @param key
	 * @param count
	 * @param value
	 * @return
	 */
	public Long deleteListByValue(String key,int count,String value){
		Jedis jedis = getResource();
		Long result = jedis.lrem(key, count,value); 
		jedis.close();
		return result;
	}
	/**
	 * 只保留下标范围的List的值
	 * @param key
	 * @param startOffset
	 * @param endOffset
	 * @return
	 */
	public String keepListByIndex(String key,int startOffset,int endOffset){
		Jedis jedis = getResource();
		String result = jedis.ltrim(key, startOffset, endOffset);
		jedis.close();
		return result;
	}
	/**
	 * 列表元素出栈 
	 * @param key
	 * @return
	 */
	public String popList(String key){
		Jedis jedis = getResource();
		String result = jedis.lpop(key);
		jedis.close();
		return result;
	}
	/**
	 * 修改指定下标的list值
	 * @param key
	 * @param index
	 * @param value
	 * @return
	 */
	public String updateListByIndex(String key,int index,String value){
		Jedis jedis = getResource();
		String result = jedis.lset(key, index, value);
		jedis.close();
		return result;
	}
	/**
	 * 获取指定key的List长度
	 * @param key
	 * @return
	 */
	public Long getListSize(String key){
		Jedis jedis = getResource();
		Long result = jedis.llen(key);
		jedis.close();
		return result;
	}
	/**
	 * 获取列表指定下标的值 
	 * @param key
	 * @param index
	 * @return
	 */
	public String getListByIndex(String key,int index){
		Jedis jedis = getResource();
		String result = jedis.lindex(key, index);
		jedis.close();
		return result;
	}
	/**
	 * 升序排序字符类型的list
	 * @param key
	 * @return
	 */
	public List<String> sortStringAsc(String key){
		SortingParams sortingParameters = new SortingParams();
        sortingParameters.alpha();
        Jedis jedis = getResource();
		List<String> result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	/**
	 * 升序排序字符类型的list（分页）
	 * @param key
	 * @param startOffset
	 * @param count
	 * @return
	 */
	public List<String> sortStringAscAndLimit(String key,int startOffset,int count){
		
		SortingParams sortingParameters = new SortingParams();
        sortingParameters.alpha();
        sortingParameters.limit(startOffset, count);
        Jedis jedis = getResource();
		List<String> result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	
	/**
	 * 降序排序字符类型的list
	 * @param key
	 * @return
	 */
	public List<String> sortStringDesc(String key){
		SortingParams sortingParameters = new SortingParams();
        sortingParameters.alpha();
		sortingParameters.desc();
		Jedis jedis = getResource();
		List<String> result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	/**
	 * 降序排序字符类型的list（分页）
	 * @param key
	 * @param startOffset
	 * @param count
	 * @return
	 */
	public List<String> sortStringDescAndLimit(String key,int startOffset,int count){
		SortingParams sortingParameters = new SortingParams();
        sortingParameters.alpha();
        sortingParameters.desc();
        sortingParameters.limit(startOffset, count);
        Jedis jedis = getResource();
        List<String> result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	
	/**
	 * 升序排序字符类型的list
	 * @param key
	 * @return
	 */
	public List<String> sortNumAsc(String key){
		Jedis jedis = getResource();
		List<String> result = jedis.sort(key);
		jedis.close();
		return result;
	}
	/**
	 * 升序排序字符类型的list（分页）
	 * @param key
	 * @param startOffset
	 * @param count
	 * @return
	 */
	public List<String> sortNumAscAndLimit(String key,int startOffset,int count){
		SortingParams sortingParameters = new SortingParams();
        sortingParameters.limit(startOffset, count);
        Jedis jedis = getResource();
        List<String> result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	
	/**
	 * 降序排序字符类型的list
	 * @param key
	 * @return
	 */
	public List<String> sortNumDesc(String key){
		SortingParams sortingParameters = new SortingParams();
		sortingParameters.desc();
		Jedis jedis = getResource();
		List<String>  result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	/**
	 * 降序排序字符类型的list（分页）
	 * @param key
	 * @param startOffset
	 * @param count
	 * @return
	 */
	public List<String> sortNumDescAndLimit(String key,int startOffset,int count){
		SortingParams sortingParameters = new SortingParams();
        sortingParameters.desc();
        sortingParameters.limit(startOffset, count);
        Jedis jedis = getResource();
        List<String> result = jedis.sort(key,sortingParameters);
		jedis.close();
		return result;
	}
	/**
	 * 插入集合
	 * @param key
	 * @param set
	 * @return
	 */
	public Long setSets(String key,Set<String> set){
		Jedis jedis = getResource();
		Long count = 0l;
		for(String setValue:set){
			count += jedis.sadd(key,setValue);
		}
		jedis.close();
		return count;
	}
	
	/**
	 * 插入集合并设置权重
	 * @param key
	 * @param map（String = 值，Double = 权重）
	 * @return
	 */
	public Long setSetsAndSetWeight(String key,Map<String,Double> map){
		Jedis jedis = getResource();
		Long count = 0l;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
		    String mapkey = it.next();
		    count += jedis.zadd(key,map.get(mapkey),mapkey);
		}
		jedis.close();
		return count;
	}
	public Long deleteSortSetValue(String key,String value){
		Jedis jedis = getResource();
		Long result = jedis.zrem(key,value);
		jedis.close();
		return result;
	}
	/**
	 * 按照权重排序Set
	 * @param key
	 * @return
	 */
	public Set<String> sortSetByWeight(String key){
		Jedis jedis = getResource();
		Set<String> result = jedis.zrange(key,0,-1);
		jedis.close();
		return result;
	}
	
	/**
	 * 遍历set里面的所有元素
	 * @param key
	 * @return
	 */
	public Set<String> getSet(String key){
		Jedis jedis = getResource();
		Set<String> result = jedis.smembers(key);
		jedis.close();
		return result;
	}
	/**
	 * 根据值，删除集合的元素
	 * @param key
	 * @param value
	 * @return
	 */
	public Long deleteSetByValue(String key,String value){
		Jedis jedis = getResource();
		Long result = jedis.srem(key, value);
		jedis.close();
		return result;
	}
	/**
	 * 随机获取一个set的值
	 * @param key
	 * @return
	 */
	public String getSetRandomValue(String key){
		Jedis jedis = getResource();
		String result = jedis.spop(key);
		jedis.close();
		return result;
	}
	/**
	 * 判断element001是否在集合sets中
	 * @param key
	 * @param value
	 * @return
	 */
	public Boolean valueSetExists(String key,String value){
		Jedis jedis = getResource();
		Boolean result = jedis.sismember(key, value);
		jedis.close();
		return result;
	}
	/**
	 * 获得两个的交集
	 * @param keys
	 * @return
	 */
	public Set<String> getIntersectionByKey(String... keys){
		Jedis jedis = getResource();
		Set<String> result = jedis.sinter(keys);
		jedis.close();
		return result;
	} 
	/**
	 * 获得集合的差集
	 * @param keys
	 * @return
	 */
	public Set<String> getDifferentByKey(String... keys){
		Jedis jedis = getResource();
		Set<String> result = jedis.sdiff(keys);
		jedis.close();
		return result;
	}
	/**
	 * 获得集合的并集
	 * @param keys
	 * @return
	 */
	public Set<String> getUnionSetByKey(String... keys){
		Jedis jedis = getResource();
		Set<String> result = jedis.sunion(keys);
		jedis.close();
		return result;
	}
	/**
	 * 获得set的元素大小
	 * @param key
	 * @return
	 */
	public Long getSetSize(String key){
		Jedis jedis = getResource();
		Long result = jedis.zcard(key);
		jedis.close();
		return result;
	}
	/**
	 * 获取权重范围内的set的值个数
	 * @param key
	 * @param min
	 * @param max
	 * @return
	 */
	public Long getValueByWeightRange(String key,int min,int max){
		Jedis jedis = getResource();
		Long result = jedis.zcount(key,min,max);
		jedis.close();
		return result;
	}
	/**
	 * 获取set中值的权重
	 * @param key
	 * @param value
	 * @return
	 */
	public Double getValueWeight(String key,String value){
		Jedis jedis = getResource();
		Double result = jedis.zscore(key, value);
		jedis.close();
		return result;
	}
	/**
	 * 根据元素下标获得set的值
	 * @param key
	 * @param startOffset
	 * @param endOffset
	 * @return
	 */
	public Set<String> getSetByRange(String key, int startOffset,int endOffset){
		Jedis jedis = getResource();
		Set<String> result = jedis.zrange(key, startOffset, endOffset);
		jedis.close();
		return result;
	}
	/**
	 * 插入Map
	 */
	public Long addMap(String key,Map<String,String> map){
		Jedis jedis = getResource();
		Long count = 0l;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String _key = it.next();
			String _value = map.get(_key);
			count += jedis.hset(key, _key, _value);
		}
		jedis.close();
		return count;
	}
	/**
	 * 遍历map
	 * @param key
	 * @return
	 */
	public List<String> listMap(String key){
		Jedis jedis = getResource();
		List<String> result = jedis.hvals(key);
		jedis.close();
		return result;
	}
	/**
	 * 根据值删除map的元素
	 * @param key
	 * @param value
	 * @return
	 */
	public Long deleteMapByValue(String key,String value){
		Jedis jedis = getResource();
		Long result = jedis.hdel(key,value);
		jedis.close();
		return result;
	}
	
	/**
	 * 判断值是否存在map中
	 * @param key
	 * @return
	 */
	public Boolean valueMapExists(String key,String value){
		Jedis jedis = getResource();
		Boolean result = jedis.hexists(key,value);
		jedis.close();
		return result;
	}
	/**
	 * 根据key获得map内的值
	 * @param key
	 * @param valueKey
	 * @return
	 */
	public String getMapValueByKey(String key,String valueKey){
		Jedis jedis = getResource();
		String result = jedis.hget(key, valueKey);
		jedis.close();
		return result;
	}
	
	/**
	 * 根据key获得map内的值
	 * @param key
	 * @param valueKeys
	 * @return
	 */
	public List<String> getMapValueByKey(String key,String... valueKeys){
		Jedis jedis = getResource();
		List<String> result = jedis.hmget(key, valueKeys);
		jedis.close();
		return result;
	}
	/**
	 * 遍历map中的所有key
	 * @param key
	 * @return
	 */
	public Set<String> listMapKey(String key){
		Jedis jedis = getResource();
		Set<String> result = jedis.hkeys(key);
		jedis.close();
		return result;
	}
	/**
	 * 遍历map中的所有value
	 * @param key
	 * @return
	 */
	public List<String> listMapValue(String key){
		Jedis jedis = getResource();
		List<String> result = jedis.hvals(key);
		jedis.close();
		return result;
	}
	/**
	 * 获取map的元素个数
	 * @param key
	 * @return
	 */
	public Long getMapSize(String key){
		Jedis jedis = getResource();
		Long result = jedis.hlen(key);
		jedis.close();
		return result;
	}
	
	/**
	 * 自减1
	 * @param key
	 * @return
	 */
	public Long decr(String key){
		Jedis jedis = getResource();
		Long result=jedis.decr(key);
		jedis.close();
		return result;
	}
	
	/**
	 * 自增1
	 * @param key
	 * @return
	 */
	public Long incr(String key){
		Jedis jedis = getResource();
		Long result=jedis.incr(key);
		jedis.close();
		return result;
	}
	
}
