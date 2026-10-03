package com.heytap.health.settings.me.upgrade;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.core.router.setting.AppUpgradeService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ekk;
import com.oplus.aiunit.vision.g6j;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lza;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/settings/appUpgrade")
public class AppUpgradeServiceImpl implements AppUpgradeService {
    @Override // com.heytap.health.core.router.setting.AppUpgradeService
    public void D7(Context context) {
        c(context, ekk.g().getAbsolutePath());
    }

    @Override // com.heytap.health.core.router.setting.AppUpgradeService
    public boolean I4(Context context) {
        return ekk.d(context);
    }

    public void c(Context context, String str) {
        ekk.a(context, str);
    }

    @Override // com.heytap.health.core.router.setting.AppUpgradeService
    public void destroy() {
        ekk.f();
        ekk.e();
    }

    public void h1(Context context, String str, int i) {
        ekk.c(context, str, i);
    }

    @Override // com.heytap.health.core.router.setting.AppUpgradeService
    public void h6(Context context, int i) {
        h1(context, ekk.g().getAbsolutePath(), i);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ekk.e();
    }

    @Override // com.heytap.health.core.router.setting.AppUpgradeService
    public boolean m2() {
        int i;
        boolean z;
        if (ilj.B()) {
            return true;
        }
        if (ilj.u() || ilj.w()) {
            i = 1;
            z = false;
        } else {
            if (ilj.y()) {
                i = 2;
            } else if (ilj.s()) {
                i = 3;
            } else if (ilj.C()) {
                i = 4;
            } else if (ilj.E()) {
                i = 5;
            } else if (ilj.v()) {
                i = 6;
            } else {
                z = true;
                i = 0;
            }
            z = true;
        }
        String strB = g6j.c().b(46);
        a7b.f("AppUpgradeServiceImpl", "switchType = " + i);
        StringBuilder sb = new StringBuilder();
        sb.append("sau switch config is { ");
        sb.append(strB);
        sb.append(" }");
        if (strB != null) {
            List listC = GsonUtil.c(strB, SauSettingBean.class);
            if (!lza.a(listC)) {
                for (int i2 = 0; i2 < listC.size(); i2++) {
                    if (((SauSettingBean) listC.get(i2)).getSwitchType() == i) {
                        a7b.f("AppUpgradeServiceImpl", "switchType = " + i + ",value = " + ((SauSettingBean) listC.get(i2)).getSwitchStatus());
                        z = ((SauSettingBean) listC.get(i2)).getSwitchStatus() == 1;
                    }
                }
            }
        } else {
            g6j.c().d();
        }
        return z;
    }
}
