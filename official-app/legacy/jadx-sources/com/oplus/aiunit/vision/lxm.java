package com.oplus.aiunit.vision;

import android.content.Context;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lxm<T, V> extends com.amap.api.col.p0003sl.t<T, V> {
    public lxm(Context context, T t) {
        super(context, t);
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            qxm.g(e2, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (Exception e3) {
            qxm.g(e3, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    public static String r(String str) {
        String[] strArrSplit = str.split("&");
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(s(str2));
            stringBuffer.append("&");
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    public static String s(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            qxm.g(e2, "ProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e3) {
            qxm.g(e3, "ProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public byte[] getEntityBytes() {
        try {
            String strQ = q();
            StringBuffer stringBuffer = new StringBuffer();
            if (strQ != null) {
                stringBuffer.append(strQ);
                stringBuffer.append("&");
            }
            stringBuffer.append("language=");
            stringBuffer.append(qvg.b().c());
            String string = stringBuffer.toString();
            String strR = r(string);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(string);
            String strA = o0n.a();
            stringBuffer2.append("&ts=".concat(String.valueOf(strA)));
            stringBuffer2.append("&scode=" + o0n.c(this.v, strA, strR));
            return stringBuffer2.toString().getBytes("utf-8");
        } catch (Throwable th) {
            qxm.g(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        HashMap map = new HashMap();
        map.put("Content-Type", FileSyncModel.FormMime);
        map.put("Accept-Encoding", "gzip");
        map.put("User-Agent", "AMAP SDK Android Search 9.7.4");
        map.put("X-INFO", o0n.i(this.v));
        map.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "9.7.4", "sea"));
        map.put("logversion", "2.1");
        return map;
    }

    public abstract String q();
}
