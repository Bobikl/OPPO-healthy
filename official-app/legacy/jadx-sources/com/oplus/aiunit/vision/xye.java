package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes15.dex */
public class xye {
    public static Map<String, Properties> a = new HashMap();

    public static Properties a(Context context, String str) {
        Properties propertiesB = a.get(str);
        if (propertiesB == null && (propertiesB = b(context, str)) != null) {
            a.put(str, propertiesB);
        }
        return propertiesB;
    }

    public static Properties b(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                properties.load(inputStreamOpen);
                if (inputStreamOpen != null) {
                    sqk.j(inputStreamOpen);
                }
                return properties;
            } catch (Exception unused) {
                if (inputStreamOpen != null) {
                    sqk.j(inputStreamOpen);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                if (inputStream != null) {
                    sqk.j(inputStream);
                }
                throw th;
            }
        } catch (Exception unused2) {
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
