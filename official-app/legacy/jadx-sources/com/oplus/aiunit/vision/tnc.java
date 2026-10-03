package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.settings.me.upgrade.UpgradeMonitorService;
import com.heytap.upgrade.UpgradeSDK;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class tnc {
    public static void a() {
        b(e().getAbsolutePath());
    }

    public static void b(String str) {
        UpgradeMonitorService.p(str);
    }

    public static void c(String str, int i) {
        UpgradeMonitorService.q(str, i);
    }

    public static boolean d(Context context) {
        return gkk.A(context).D();
    }

    public static File e() {
        return new File(ld7.j() + ekk.UPGRADE_DIR);
    }

    public static boolean f() {
        return UpgradeSDK.instance.isDownloading(b78.a().getPackageName());
    }

    public static void g() {
        UpgradeMonitorService.l();
    }
}
