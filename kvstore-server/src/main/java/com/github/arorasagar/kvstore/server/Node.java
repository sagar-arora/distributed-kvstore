package com.github.arorasagar.kvstore.server;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class Node {
    @NonNull private final String host = "";
    private int port;
    private int id;
}
