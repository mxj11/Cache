package com.cache;

import com.cache.entity.CacheObject;

public interface Cache {
    /**
     * 保存数据
     *
     * @param region 缓存的数据区域
     * @param key    缓存的key值
     * @param value  缓存的值
     */
    void put(String region, String key, Object value);

    /**
     * 获取缓存数据
     *
     * @param region 缓存的数据区域
     * @param key    缓存的key值
     * @return CacheObject对象
     */
    CacheObject get(String region, String key);

    /**
     * 更新缓存数据
     *
     * @param region 缓存的数据区域
     * @param key    缓存的key值
     * @param value  缓存的值
     */
    void update(String region, String key, Object value);

    /**
     * 删除缓存数据
     *
     * @param region 缓存的数据区域
     * @param key    缓存的key值
     */
    void delete(String region, String key);
}
