package com.heytap.log.util;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.util.OSUtils;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes19.dex */
public class BrandPBuildUtil {
    public static final int UNKNOWN = 0;
    private static final String[] VERSIONS = {null, null, null, null, null, null, null, null, null, null, "9.0", "9.5", "10.0", "10.5", null};

    public static class VERSION {
        public static final String RELEASE = BrandPBuildUtil.getVersionName(OSUtils.KEY_ONEPLUS_OS_VERSION);
    }

    public static int getOSVERSION() {
        Log.v("BrandPBuild", " getOSVERSION " + VERSION.RELEASE);
        for (int length = VERSIONS.length + (-2); length >= 0; length--) {
            StringBuilder sb = new StringBuilder();
            sb.append(" VERSIONS[ ");
            sb.append(length);
            sb.append("]");
            String[] strArr = VERSIONS;
            sb.append(strArr[length]);
            Log.v("BrandPBuild", sb.toString());
            String str = VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strArr[length])) {
                if (!str.startsWith(strArr[length])) {
                    if (!str.startsWith(EraseBrandUtil.BRAND_H2OS + strArr[length])) {
                        if (str.startsWith(EraseBrandUtil.BRAND_O2OS + strArr[length])) {
                        }
                    }
                }
                return length + 1;
            }
        }
        return 0;
    }

    public static String getVersionName() {
        return getVersionName(OSUtils.KEY_ONEPLUS_OS_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getVersionName(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(ParserTag.TAG_GET, String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return "unknown";
        }
    }
}
