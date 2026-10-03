package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class vi9 {
    public static final Map<String, String> a = b();
    public static final Pattern b = Pattern.compile("^&#[Xx]?");

    public static String a(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            String str2 = a.get(str.substring(1, str.length() - 1));
            return str2 != null ? str2 : str;
        }
        try {
            int i = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
            return i == 0 ? "�" : new String(Character.toChars(i));
        } catch (IllegalArgumentException unused) {
            return "�";
        }
    }

    public static Map<String, String> b() {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(vi9.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", Weather.SEPARATOR);
                        return map;
                    }
                    if (line.length() != 0) {
                        int iIndexOf = line.indexOf(HttpUtils.EQUAL_SIGN);
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e2) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e2);
        }
    }
}
