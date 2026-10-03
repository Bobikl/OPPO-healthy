package com.oplus.aiunit.vision;

import com.heytap.health.core.router.setting.AppUpgradeService;

/* JADX INFO: loaded from: classes16.dex */
public class xjk extends zz0 {
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18658e;

    public xjk() {
        AppUpgradeService appUpgradeService = (AppUpgradeService) x0.d().b("/settings/appUpgrade").navigation();
        if (appUpgradeService.m2()) {
            this.d = appUpgradeService.I4(b78.a());
            this.f18658e = v9g.x("health_share_preference_settings").r("setting_upgrade_badge_operation", false);
        }
    }

    @Override // com.oplus.aiunit.vision.zz0
    public void a() {
        a7b.f("BaseBadgeInterceptor", "UpgradeBadgeIntercept check begin, badgeCount:" + this.a + ", haveUpgrade:" + this.d);
        if (this.d && !this.f18658e) {
            this.a++;
            a7b.f("BaseBadgeInterceptor", "UpgradeBadgeIntercept check, badgeCount" + this.a);
        }
        this.f19603c.postValue(Integer.valueOf(this.a));
        super.a();
    }
}
