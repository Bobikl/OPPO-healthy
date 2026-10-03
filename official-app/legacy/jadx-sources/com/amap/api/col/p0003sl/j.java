package com.amap.api.col.p0003sl;

import android.content.Context;
import com.oplus.aiunit.vision.b0n;
import com.oplus.aiunit.vision.n0n;
import com.oplus.aiunit.vision.o0n;
import com.oplus.aiunit.vision.w0n;
import com.oplus.aiunit.vision.xsm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends b0n<String, a> {

    public static class a {
        public byte[] a;
        public int b = -1;
    }

    public j(Context context, String str) {
        super(context, str);
        this.u = "/map/styles";
    }

    public static a o(byte[] bArr) throws ic {
        a aVar = new a();
        aVar.a = bArr;
        return aVar;
    }

    public final void b(String str) {
        this.u = str;
    }

    @Override // com.oplus.aiunit.vision.b0n
    public final /* bridge */ /* synthetic */ a e(String str) throws ic {
        return null;
    }

    @Override // com.oplus.aiunit.vision.b0n
    public final /* synthetic */ a f(byte[] bArr) throws ic {
        return o(bArr);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return xsm.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        HashMap map = new HashMap(16);
        map.put("key", n0n.j(this.t));
        map.put("output", "bin");
        String strA = o0n.a();
        String strC = o0n.c(this.t, strA, w0n.q(map));
        map.put("ts", strA);
        map.put("scode", strC);
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.u;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }
}
