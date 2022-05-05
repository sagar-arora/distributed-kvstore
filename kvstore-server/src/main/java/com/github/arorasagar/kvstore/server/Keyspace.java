package com.github.arorasagar.kvstore.server;

import lombok.*;

@Getter
@Setter
@Builder
public class Keyspace {
    private final KeyspaceMetadata keyspaceMetadata;
    private final KVStore kvStore;
}
