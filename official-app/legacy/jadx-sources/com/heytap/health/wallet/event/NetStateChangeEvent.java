package com.heytap.health.wallet.event;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.rpc;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class NetStateChangeEvent {
    public String networkType;

    public NetStateChangeEvent(String str) {
        this.networkType = str;
    }

    public boolean isNoneNet() {
        return !rpc.c();
    }
}
