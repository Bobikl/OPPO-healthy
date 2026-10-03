package com.oplus.aiunit.vision;

import com.heytap.upgrade.exception.UpgradeException;
import com.heytap.upgrade.model.UpgradeInfo;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class r26 {
    public nz9 a;
    public long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16026c = 0;
    public t26 d;

    public r26(t26 t26Var, nz9 nz9Var) {
        this.d = t26Var;
        this.a = nz9Var;
    }

    public final void a(UpgradeException upgradeException) {
        int i;
        if (upgradeException.getErrorCode() == 20013) {
            i = 22;
        } else {
            i = upgradeException.getErrorCode() == 20002 ? 23 : 20;
        }
        nz9 nz9Var = this.a;
        if (nz9Var != null) {
            nz9Var.S4(i);
        }
    }

    public boolean b(long j2) {
        t26 t26Var = this.d;
        if (t26Var == null || t26Var.d() <= 0) {
            return false;
        }
        return this.d.d() <= j2 - this.f16026c;
    }

    public void c(UpgradeException upgradeException) {
        e6b.a("upgrade_download_callback", "onDownloadFail : " + upgradeException);
        a(upgradeException);
    }

    public void d(File file) {
        e6b.a("upgrade_download_callback", "onDownloadSuccess : " + file.getAbsolutePath());
        nz9 nz9Var = this.a;
        if (nz9Var != null) {
            nz9Var.g(file);
        }
    }

    public void e() {
        e6b.a("upgrade_download_callback", "onStartDownload");
        nz9 nz9Var = this.a;
        if (nz9Var != null) {
            nz9Var.M3();
        }
    }

    public void f(int i, long j2) {
        long j3 = i;
        if (j3 > this.b || b(j2)) {
            nz9 nz9Var = this.a;
            if (nz9Var != null) {
                nz9Var.f0(i, j2);
            }
            this.b = j3;
            this.f16026c = j2;
            if (rqk.r()) {
                e6b.a("upgrade_download_callback", "onUpdateDownloadProgress progress : " + i + " size : " + j2);
            }
        }
    }

    public void g(UpgradeInfo upgradeInfo) {
        if (rqk.r()) {
            e6b.a("upgrade_download_callback", "onUpgradeCancel : " + upgradeInfo);
        } else {
            e6b.a("upgrade_download_callback", "onUpgradeCancel");
        }
        nz9 nz9Var = this.a;
        if (nz9Var != null) {
            nz9Var.F1(upgradeInfo);
        }
    }
}
