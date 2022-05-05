package com.github.arorasagar.kvstore.server.partitioner;

public interface Hasher {
    long getHash(String key, long seed);
}
