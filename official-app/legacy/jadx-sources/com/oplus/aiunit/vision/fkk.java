package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.upgrade.UpgradeSDK;
import com.heytap.upgrade.model.UpgradeInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class fkk {
    public static final String CHANNEL_ID = "Foreground Notification";
    public static final int UPGRADE_TYPE_AUTO = 0;
    public static final int UPGRADE_TYPE_MANUAL = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile fkk f11416j;
    public Context a;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nz9 f11418e;
    public int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, UpgradeInfo> f11417c = new HashMap<>();
    public y7a f = y7a.a();
    public o93 g = o93.a(null, null, null);
    public t26 h = t26.a(null, null, null);
    public o93.a i = new o93.a();

    public fkk(Context context) {
        this.a = context.getApplicationContext();
        this.d = rqk.j(this.a);
    }

    public static fkk d(Context context) {
        if (f11416j == null) {
            synchronized (fkk.class) {
                if (f11416j == null) {
                    f11416j = new fkk(context);
                }
            }
        }
        return f11416j;
    }

    public void a(@NonNull String str) {
        UpgradeSDK.instance.cancelDownload(str);
    }

    public void b() {
        a(this.d);
        nz9 nz9Var = this.f11418e;
        if (nz9Var != null) {
            nz9Var.F1(e());
        }
    }

    public nz9 c() {
        return this.f11418e;
    }

    public UpgradeInfo e() {
        return this.f11417c.get(this.d);
    }

    public boolean f() {
        return UpgradeSDK.instance.isDownloading(this.d);
    }
}
