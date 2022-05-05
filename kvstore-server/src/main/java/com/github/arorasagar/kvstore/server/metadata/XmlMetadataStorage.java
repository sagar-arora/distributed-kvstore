package com.github.arorasagar.kvstore.server.metadata;

import com.github.arorasagar.kvstore.server.Configuration;
import com.github.arorasagar.kvstore.server.KeyspaceMetadata;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;

public class XmlMetadataStorage {

    Configuration configuration;
    public XmlMetadataStorage(Configuration configuration) {
        this.configuration = configuration;
    }

    public void write(KeyspaceMetadata keyspaceMetadata) {
        XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new `));
    }
}
