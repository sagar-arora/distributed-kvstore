package com.github.arorasagar.kvstore.server.metadata;

import com.github.arorasagar.kvstore.server.KeyspaceMetadata;

public interface MetadataStorage {

    KeyspaceMetadata read();

    void write(KeyspaceMetadata keyspaceMetadata);
}
