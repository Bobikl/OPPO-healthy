package com.heytap.store.business.component.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.base.core.util.DataParserUtil;
import com.heytap.store.base.core.util.DisplayUtil;

/* JADX INFO: loaded from: classes4.dex */
public class OStoreImageSizeUtil {
    static final String IMAGE_H = "_h_";
    static final String IMAGE_W = "_w_";

    private static int analyze(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (DataParserUtil.isNumeric(str)) {
            return Integer.parseInt(str);
        }
        if (str.contains("?")) {
            String strSubstring = str.substring(0, str.indexOf("?"));
            if (DataParserUtil.isNumeric(strSubstring)) {
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

    public static int getImageScaleHeight(String str, Context context) {
        return getImageScaleHeight(str, 0, context);
    }

    public static int[] getImageSize(String str) {
        return new int[]{getImageOriginalWight(str), getImageOriginalHeight(str)};
    }

    private static float handlerImageScale(int i, int i2, Context context) {
        if (i == 0) {
            return 0.0f;
        }
        float screenWidth = (DisplayUtil.getScreenWidth(context) - i2) / i;
        if (screenWidth == 0.0f) {
            return 1.0f;
        }
        return screenWidth;
    }

    public static int getImageScaleHeight(String str, int i, Context context) {
        return Math.round(getImageOriginalHeight(str) * handlerImageScale(getImageOriginalWight(str), i, context));
    }
}
