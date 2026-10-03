package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e0n<T, V> extends b0n<T, V> {
    public e0n(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        try {
            return o().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.b0n, com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap(16);
        map.put("Content-Type", " application/json");
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android Trace 10.1.600");
        map.put("x-INFO", o0n.i(this.t));
        map.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "10.1.600", UTraceSQLiteHelperKt.TRACE_TABLE_NAME));
        map.put("logversion", "2.1");
        return map;
    }

    public abstract String o();
}
