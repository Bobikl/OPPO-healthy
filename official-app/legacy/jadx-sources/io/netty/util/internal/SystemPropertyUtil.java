package io.netty.util.internal;

import com.caverock.androidsvg.SVGParser;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes10.dex */
public final class SystemPropertyUtil {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) SystemPropertyUtil.class);

    private SystemPropertyUtil() {
    }

    public static boolean contains(String str) {
        return get(str) != null;
    }

    public static String get(String str) {
        return get(str, null);
    }

    public static boolean getBoolean(String str, boolean z) {
        String str2 = get(str);
        if (str2 == null) {
            return z;
        }
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return z;
        }
        if (SpeechConstant.TRUE_STR.equals(lowerCase) || "yes".equals(lowerCase) || "1".equals(lowerCase)) {
            return true;
        }
        if (SpeechConstant.FALSE_STR.equals(lowerCase) || SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO.equals(lowerCase) || "0".equals(lowerCase)) {
            return false;
        }
        logger.warn("Unable to parse the boolean system property '{}':{} - using the default value: {}", str, lowerCase, Boolean.valueOf(z));
        return z;
    }

    public static int getInt(String str, int i) {
        String str2 = get(str);
        if (str2 == null) {
            return i;
        }
        String strTrim = str2.trim();
        try {
            return Integer.parseInt(strTrim);
        } catch (Exception unused) {
            logger.warn("Unable to parse the integer system property '{}':{} - using the default value: {}", str, strTrim, Integer.valueOf(i));
            return i;
        }
    }

    public static long getLong(String str, long j2) {
        String str2 = get(str);
        if (str2 == null) {
            return j2;
        }
        String strTrim = str2.trim();
        try {
            return Long.parseLong(strTrim);
        } catch (Exception unused) {
            logger.warn("Unable to parse the long integer system property '{}':{} - using the default value: {}", str, strTrim, Long.valueOf(j2));
            return j2;
        }
    }

    public static String get(final String str, String str2) {
        ObjectUtil.checkNonEmpty(str, "key");
        try {
            str = System.getSecurityManager() == null ? System.getProperty(str) : (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: io.netty.util.internal.SystemPropertyUtil.1
                @Override // java.security.PrivilegedAction
                public String run() {
                    return System.getProperty(str);
                }
            });
        } catch (SecurityException e2) {
            logger.warn("Unable to retrieve a system property '{}'; default values will be used.", str, e2);
            str = null;
        }
        return str == null ? str2 : str;
    }
}
