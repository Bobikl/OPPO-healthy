package com.oplus.aiunit.vision;

import java.util.Hashtable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class unm extends com.amap.api.col.p0003sl.l {
    public String r;

    public unm(String str) {
        this.r = str;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return getURL();
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(32);
        hashtable.put("User-Agent", "MAC=channel:amapapi");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.r;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return false;
    }
}
