package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.common.utils.DensityUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ii0 {
    public static final String DEFAULT_DENSITY = "476x402";
    public String a;

    public static class b {
        public static ii0 a = new ii0();
    }

    public static ii0 c() {
        return b.a;
    }

    public InputStream a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(this.a)) {
                this.a = b(context);
            }
            return context.getAssets().open(d(context, String.format(Locale.getDefault(), "%s_%s.json", str, this.a)) ? String.format(Locale.getDefault(), "%s/%s_%s.json", "configs", str, this.a) : String.format(Locale.getDefault(), "%s/%s.json", "configs", str));
        } catch (IOException e2) {
            SdkDebugLog.e("AssetsUtil", "[getAssetsInputStream] --> " + e2.getMessage());
            return null;
        }
    }

    public final String b(Context context) {
        int screenHeight = DensityUtil.getScreenHeight(context);
        int screenWidth = DensityUtil.getScreenWidth(context);
        return (screenHeight == 476 && screenWidth == 402) ? DEFAULT_DENSITY : String.format(Locale.getDefault(), "%dx%d", Integer.valueOf(screenHeight), Integer.valueOf(screenWidth));
    }

    public final boolean d(Context context, String str) {
        try {
            return Arrays.asList(context.getAssets().list("configs")).contains(str);
        } catch (IOException e2) {
            SdkDebugLog.e("AssetsUtil", "[isFileExists] --> " + e2.getMessage());
            return false;
        }
    }

    public ii0() {
    }
}
