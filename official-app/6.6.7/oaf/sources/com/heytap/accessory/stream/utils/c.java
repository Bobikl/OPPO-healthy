package com.heytap.accessory.stream.utils;

import com.heytap.accessory.BaseSocket;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static final String b = "c";
    public BaseSocket a;

    public c(BaseSocket baseSocket) {
        if (baseSocket == null) {
            com.heytap.accessory.base.logging.a.e(b, "TransportTypeChecker constructor, BaseSocket parameter is null.");
        }
        this.a = baseSocket;
    }

    public int a() {
        BaseSocket baseSocket = this.a;
        if (baseSocket != null && baseSocket.isConnected()) {
            return this.a.getConnectedPeerAgent().getAccessory().getTransportType();
        }
        com.heytap.accessory.base.logging.a.e(b, "No Service Connection");
        return -1;
    }
}
