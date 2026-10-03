package com.oplus.accountsdk.base.common.net.data;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AcHostUrlConfig {
    public Map<String, String> a = new ConcurrentHashMap();

    public static AcHostUrlConfig c(String str) {
        AcHostUrlConfig acHostUrlConfig = new AcHostUrlConfig();
        if (TextUtils.isEmpty(str)) {
            return acHostUrlConfig;
        }
        acHostUrlConfig.e((Map) new Gson().fromJson(str, new TypeToken<Map<String, String>>() { // from class: com.oplus.accountsdk.base.common.net.data.AcHostUrlConfig.1
        }.getType()));
        return acHostUrlConfig;
    }

    public static String d(Map<String, String> map) {
        return new Gson().toJson(map);
    }

    public String a(String str) {
        return b(str, "default");
    }

    public final String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return this.a.get(str2);
        }
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            String key = entry.getKey();
            Locale locale = Locale.ROOT;
            if (key.toUpperCase(locale).contains(str.toUpperCase(locale))) {
                return entry.getValue();
            }
        }
        return this.a.get(str2);
    }

    public void e(Map<String, String> map) {
        this.a.putAll(map);
    }
}
