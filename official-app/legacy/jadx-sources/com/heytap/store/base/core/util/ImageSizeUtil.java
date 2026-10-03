package com.heytap.store.base.core.util;

import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.platform.tools.ContextGetterUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class ImageSizeUtil {
    static final String IMAGE_H = "_h_";
    static final String IMAGE_W = "_w_";

    private static int analyze(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (isNumeric(str)) {
            return Integer.parseInt(str);
        }
        if (str.contains("?")) {
            String strSubstring = str.substring(0, str.indexOf("?"));
            if (isNumeric(strSubstring)) {
                return Integer.parseInt(strSubstring);
            }
        }
        return 0;
    }

    public static int getImageOriginalHeight(String str) {
        if (str == null) {
            return 0;
        }
        return analyze(Uri.parse(str).getQueryParameter(IMAGE_H));
    }

    public static int getImageOriginalWight(String str) {
        if (str == null) {
            return 0;
        }
        return analyze(Uri.parse(str).getQueryParameter(IMAGE_W));
    }

    public static int getImageScaleHeight(String str) {
        return getImageScaleHeight(str, 0);
    }

    public static int[] getImageSize(String str) {
        return new int[]{getImageOriginalWight(str), getImageOriginalHeight(str)};
    }

    private static float handlerImageScale(int i, int i2) {
        if (i == 0) {
            return 0.0f;
        }
        float screenWidth = (DisplayUtil.getScreenWidth(ContextGetterUtils.INSTANCE.getApp()) - i2) / i;
        if (screenWidth == 0.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    private static boolean isNumeric(String str) {
        return Pattern.compile("^[0-9]+(.[0-9]+)?$").matcher(str).matches();
    }

    public static int getImageScaleHeight(String str, int i) {
        return Math.round(getImageOriginalHeight(str) * handlerImageScale(getImageOriginalWight(str), i));
    }
}
