package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class mvc {
    public static boolean a(Node node) {
        return node.getExtra().getBoolean("NODE_EXTRA_WATCH_BT_OFF", false);
    }

    public static void b(Node node, boolean z) {
        node.getExtra().putBoolean("NODE_EXTRA_WATCH_BT_OFF", z);
    }
}
