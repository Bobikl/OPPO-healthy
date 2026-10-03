package com.amap.api.col.p0003sl;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends la {
    public byte[] r;
    public Map<String, String> s;

    public h0(byte[] bArr, Map<String, String> map) {
        this.r = bArr;
        this.s = map;
        setDegradeAbility(la.a.SINGLE);
        setHttpProtocol(la.c.HTTPS);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.r;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.s;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "https://adiu.amap.com/ws/device/adius";
    }
}
