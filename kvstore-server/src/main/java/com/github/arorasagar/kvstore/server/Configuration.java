package com.github.arorasagar.kvstore.server;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Configuration {

    private String localDirectory;
    private int transportPort;
    private String host;
    private boolean isLocal;
    public List<Node> nodes;
}
