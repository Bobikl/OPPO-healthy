package com.oplus.aiunit.vision;

import android.content.Context;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.store.base.core.http.HttpUtils;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class r2n extends s0n {
    public JSONObject r = null;
    public Context s = null;

    @Override // com.amap.api.col.p0003sl.la
    public final byte[] getEntityBytes() {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            JSONObject jSONObject = this.r;
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    stringBuffer.append(next + HttpUtils.EQUAL_SIGN + URLEncoder.encode(this.r.get(next).toString(), "utf-8") + "&");
                }
            }
            stringBuffer.append("output=json");
            String strJ = n0n.j(this.s);
            stringBuffer.append("&key=".concat(String.valueOf(strJ)));
            String strA = o0n.a();
            stringBuffer.append("&ts=".concat(String.valueOf(strA)));
            stringBuffer.append("&scode=" + o0n.c(this.s, strA, "key=".concat(String.valueOf(strJ))));
            return stringBuffer.toString().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", FileSyncModel.FormMime);
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android core 4.3.15");
        map.put("X-INFO", o0n.i(this.s));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.3.15", "core"));
        map.put("logversion", "2.1");
        return map;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getSDKName() {
        return "core";
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return r0n.a().g() ? "https://restsdk.amap.com/sdk/compliance/params" : "http://restsdk.amap.com/sdk/compliance/params";
    }
}
