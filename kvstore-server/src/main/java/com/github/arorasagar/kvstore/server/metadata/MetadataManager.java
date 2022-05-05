package com.github.arorasagar.kvstore.server.metadata;

import com.github.arorasagar.kvstore.server.KeyspaceMetadata;

public interface MetadataManager {

    KeyspaceMetadata getKeyspaceMetadata(String keyspace);

    KeyspaceMetadata createOrUpdateKeyspace(String keyspace);
}
