package com.autonavi.aps.amapapi.trans;

import android.text.TextUtils;
import com.oplus.aiunit.vision.s0n;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends s0n {
    Map<String, String> a = null;
    Map<String, String> b = null;
    String g = "";
    byte[] h = null;
    private String i = null;

    public final void a(Map<String, String> map) {
        this.a = map;
    }

    public final void b(Map<String, String> map) {
        this.b = map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        return this.h;
    }

    @Override // com.oplus.aiunit.vision.s0n, com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return !TextUtils.isEmpty(this.i) ? this.i : super.getIPV6URL();
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.b;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return this.a;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.g;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final void a(byte[] bArr) {
        this.h = bArr;
    }
}
