package com.amap.api.col.p0003sl;

import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.c9n;
import com.oplus.aiunit.vision.n0n;
import com.oplus.aiunit.vision.o0n;
import com.oplus.aiunit.vision.qdm;
import com.oplus.aiunit.vision.u0n;
import com.oplus.aiunit.vision.xsm;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m extends l {
    public m() {
        setProxy(u0n.a(qdm.a));
        setConnectionTimeout(5000);
        setSoTimeout(50000);
    }

    private static String a(String str) {
        String[] strArrSplit = str.split("&");
        Arrays.sort(strArrSplit);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(b(str2));
            stringBuffer.append("&");
        }
        String string = stringBuffer.toString();
        return string.length() > 1 ? (String) string.subSequence(0, string.length() - 1) : str;
    }

    private static String b(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            c2n.r(e2, "AbstractProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e3) {
            c2n.r(e3, "AbstractProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    public String appendTsScode(String str) {
        String strA = a(str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        String strA2 = o0n.a();
        stringBuffer.append("&ts=".concat(String.valueOf(strA2)));
        stringBuffer.append("&scode=" + o0n.c(qdm.a, strA2, strA));
        return stringBuffer.toString();
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getIPV6URL() {
        String url = getURL();
        return (url == null || !url.contains("http://restsdk.amap.com/v4/gridmap?")) ? url : xsm.y(url);
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.la
    public Map<String, String> getRequestHead() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("User-Agent", c9n.d);
        hashtable.put("Accept-Encoding", "gzip");
        hashtable.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", "10.1.600", "3dmap"));
        hashtable.put("x-INFO", o0n.b(qdm.a));
        hashtable.put("key", n0n.j(qdm.a));
        hashtable.put("logversion", "2.1");
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public boolean isSupportIPV6() {
        String url = getURL();
        return url != null && url.contains("http://restsdk.amap.com/v4/gridmap?");
    }
}
