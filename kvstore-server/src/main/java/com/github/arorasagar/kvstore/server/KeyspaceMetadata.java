package com.github.arorasagar.kvstore.server;

import com.github.arorasagar.kvstore.server.partitioner.Hasher;
import lombok.Builder;
import lombok.NonNull;

import java.io.Serializable;

@Builder
public class KeyspaceMetadata implements Serializable {
    private Consistency consistency;

    @NonNull
    @private final Configuration configuration;

    private Hasher hasher;

    public KeyspaceMetadata() {

    }
}

