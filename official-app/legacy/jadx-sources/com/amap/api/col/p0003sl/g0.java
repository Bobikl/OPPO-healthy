package com.amap.api.col.p0003sl;

import com.oplus.aiunit.vision.p1n;
import com.oplus.aiunit.vision.s0n;
import com.oplus.aiunit.vision.t0n;
import com.oplus.aiunit.vision.w0n;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends s0n {
    public byte[] r;
    public String s;

    public g0(byte[] bArr, String str) {
        this.s = "1";
        this.r = (byte[]) bArr.clone();
        this.s = str;
        setDegradeAbility(la.a.SINGLE);
        setHttpProtocol(la.c.HTTP);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.r;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/zip");
        map.put("Content-Length", String.valueOf(this.r.length));
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        String strT = w0n.t(p1n.b);
        String str = this.s;
        byte[] bArrN = w0n.n(p1n.a);
        byte[] bArr = new byte[bArrN.length + 50];
        System.arraycopy(this.r, 0, bArr, 0, 50);
        System.arraycopy(bArrN, 0, bArr, 50, bArrN.length);
        return String.format(strT, "1", str, "1", "open", t0n.b(bArr));
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isHostToIP() {
        return false;
    }
}
