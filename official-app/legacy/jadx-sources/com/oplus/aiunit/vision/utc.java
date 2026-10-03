package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;

/* JADX INFO: loaded from: classes5.dex */
public class utc {
    public static boolean a(Node node) {
        return node.getExtra().getBoolean("NODE_EXTRA_WATCH_BT_OFF", false);
    }

    public static void b(Node node, boolean z) {
        node.getExtra().putBoolean("NODE_EXTRA_WATCH_BT_OFF", z);
    }
}
