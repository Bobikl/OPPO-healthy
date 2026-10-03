package com.heytap.msp.sdk.common.net;

import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;

/* JADX INFO: loaded from: classes19.dex */
public enum NetworkType {
    NETWORK_WIFI("WiFi"),
    NETWORK_4G(EventRuleEntity.ACCEPT_NET_4G),
    NETWORK_3G("3G"),
    NETWORK_2G("2G"),
    NETWORK_UNKNOWN("Unknown"),
    NETWORK_NO("No network");

    private String desc;

    NetworkType(String str) {
        this.desc = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.desc;
    }
}
