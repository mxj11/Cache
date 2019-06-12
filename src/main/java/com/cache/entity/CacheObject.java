package com.cache.entity;

public class CacheObject {
    private String region;

    private String key;

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
