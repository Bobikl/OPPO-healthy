package com.oplus.aiunit.vision;

import com.heytap.upgrade.UpgradeSDK;
import com.heytap.upgrade.model.UpgradeInfo;

/* JADX INFO: loaded from: classes19.dex */
public class t26 {
    public String a;
    public UpgradeInfo b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16863c;
    public nz9 d;

    public static t26 a(String str, UpgradeInfo upgradeInfo, nz9 nz9Var) {
        return new t26().g(str).h(upgradeInfo).f(nz9Var);
    }

    public nz9 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.f16863c;
    }

    public UpgradeInfo e() {
        return this.b;
    }

    public t26 f(nz9 nz9Var) {
        this.d = nz9Var;
        UpgradeSDK.instance.addDownloadListener(nz9Var);
        return this;
    }

    public t26 g(String str) {
        this.a = str;
        return this;
    }

    public t26 h(UpgradeInfo upgradeInfo) {
        this.b = upgradeInfo;
        return this;
    }
}
