package com.oplus.aiunit.vision;

import android.content.res.Resources;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class gi0 {

    public static class a {
        public static gi0 a = new gi0();
    }

    public static gi0 c() {
        return a.a;
    }

    public InputStream a(Resources resources, String str, Proto$DeviceInfo proto$DeviceInfo) {
        try {
            String strB = b(proto$DeviceInfo);
            return resources.getAssets().open(d(resources, String.format(Locale.getDefault(), "%s_%s.json", str, strB)) ? String.format(Locale.getDefault(), "%s/%s_%s.json", "configs", str, strB) : String.format(Locale.getDefault(), "%s/%s.json", "configs", str));
        } catch (Exception e2) {
            ltl.b("AssetsUtil", "[getAssetsInputStream] --> " + e2.getMessage());
            return null;
        }
    }

    public final String b(Proto$DeviceInfo proto$DeviceInfo) {
        int screenWidth = proto$DeviceInfo.getScreenWidth();
        return String.format(Locale.getDefault(), "%dx%d", Integer.valueOf(proto$DeviceInfo.getScreenHeight()), Integer.valueOf(screenWidth));
    }

    public final boolean d(Resources resources, String str) {
        try {
            String[] list = resources.getAssets().list("configs");
            if (list != null) {
                return Arrays.asList(list).contains(str);
            }
            ltl.b("AssetsUtil", "[isFileExists] --> getAssets() empty");
            return false;
        } catch (Exception e2) {
            ltl.b("AssetsUtil", "[isFileExists] --> " + e2.getMessage());
            return false;
        }
    }

    public gi0() {
    }
}
