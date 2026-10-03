package com.heytap.health.bodyfat.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.bodyfat.R$string;
import com.heytap.health.health.bodyfat.IBodyFatSettingService;
import com.oplus.aiunit.vision.c12;
import com.oplus.aiunit.vision.py1;
import com.oplus.aiunit.vision.um;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/bodyfat/BodyFatSettingService")
public class BodyFatSettingServiceImpl implements IBodyFatSettingService {
    public Context i;

    public static String c() {
        return um.c().getSsoid();
    }

    @Override // com.heytap.health.health.bodyfat.IBodyFatSettingService
    public String K5(float f) {
        return new BigDecimal(Float.toString(l3(f))).setScale(Math.max(0, h1()), RoundingMode.HALF_UP).toPlainString();
    }

    public int Q2() {
        return py1.b(c(), 0);
    }

    @Override // com.heytap.health.health.bodyfat.IBodyFatSettingService
    public String Za() {
        int i;
        if (this.i == null) {
            return "";
        }
        int iQ2 = Q2();
        if (iQ2 != 1) {
            i = iQ2 != 2 ? R$string.health_body_fat_unit_kg : R$string.health_body_fat_unit_lb;
        } else {
            i = R$string.health_body_fat_unit_500g;
        }
        return this.i.getString(i);
    }

    public int h1() {
        return py1.a(c(), 1);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        if (context != null) {
            this.i = context.getApplicationContext();
        }
    }

    public float l3(float f) {
        return c12.h(f, Q2());
    }
}
