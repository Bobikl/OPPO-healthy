package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.Module;

/* JADX INFO: loaded from: classes5.dex */
public class wtc {
    public static Node a(int i, String str) {
        Node node = new Node(str);
        Module module = new Module();
        module.setMacAddress(str);
        module.setConnectionType(i);
        module.setNodeId(str);
        node.setMainModule(module);
        return node;
    }

    public static Node b(int i, String str, int i2, String str2) {
        return new Node.b().b(str, i).c(str2, i2).a();
    }
}
