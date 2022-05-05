package com.github.arorasagar.kvstore.server;

public interface KVStore {

    void put(String key, Object val);

    Object get(String key);
}
