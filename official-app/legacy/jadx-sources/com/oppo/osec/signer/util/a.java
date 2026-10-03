package com.oppo.osec.signer.util;

import com.oplus.aiunit.vision.nfk;
import com.oplus.aiunit.vision.w2h;
import com.oppo.osec.signer.http.HttpMethodName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static final Pattern a = Pattern.compile(Pattern.quote("+") + "|" + Pattern.quote("*") + "|" + Pattern.quote("%7E") + "|" + Pattern.quote("%2F"));

    public static String a(String str, String str2) {
        return b(str, str2, false);
    }

    public static String b(String str, String str2, boolean z) {
        if (str2 == null || str2.length() <= 0) {
            if (str.endsWith("/")) {
                return str;
            }
            return str + "/";
        }
        if (str2.startsWith("/")) {
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (z) {
            return str + str2.replace("//", "/%2F");
        }
        return str + str2;
    }

    public static String c(w2h<?> w2hVar) {
        Map<String, List<String>> parameters = w2hVar.getParameters();
        if (parameters.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : parameters.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(new BasicNameValuePair(key, it.next()));
            }
        }
        return nfk.c(arrayList, "UTF-8");
    }

    public static String d(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = URLEncoder.encode(str, "UTF-8");
            Matcher matcher = a.matcher(strEncode);
            StringBuffer stringBuffer = new StringBuffer(strEncode.length());
            while (matcher.find()) {
                String strGroup = matcher.group(0);
                if ("+".equals(strGroup)) {
                    strGroup = "%20";
                } else if ("*".equals(strGroup)) {
                    strGroup = "%2A";
                } else if ("%7E".equals(strGroup)) {
                    strGroup = "~";
                } else if (z && "%2F".equals(strGroup)) {
                    strGroup = "/";
                }
                matcher.appendReplacement(stringBuffer, strGroup);
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean e(w2h<?> w2hVar) {
        return HttpMethodName.POST.equals(w2hVar.c()) && (w2hVar.getContent() == null);
    }
}
