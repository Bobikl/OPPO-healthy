package com.oplus.statistics.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.oplus.statistics.record.ContentProviderRecorder;
import com.oplus.statistics.util.VersionUtil;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class VersionUtil {
    public static final String a = new String(Base64.decode(Constant.DCS_PKG, 0), StandardCharsets.UTF_8);

    public static /* synthetic */ String b(PackageManager.NameNotFoundException nameNotFoundException) {
        return "getDataCollectionAppVersion exception: " + nameNotFoundException.toString();
    }

    public static long getDataCollectionAppVersion(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a, 1).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.w("VersionUtil", new Supplier() { // from class: com.oplus.aiunit.vision.czk
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return VersionUtil.b(e);
                }
            });
            return -1L;
        }
    }

    public static boolean isContentProviderRecorder(@NonNull Context context) {
        return ContentProviderRecorder.isSupport(context);
    }

    public static boolean isSupportPeriodData(@NonNull Context context) {
        long dataCollectionAppVersion = getDataCollectionAppVersion(context);
        return dataCollectionAppVersion >= 5118000 || dataCollectionAppVersion == -1;
    }
}
