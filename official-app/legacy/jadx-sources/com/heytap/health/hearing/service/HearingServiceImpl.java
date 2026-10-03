package com.heytap.health.hearing.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityOptionsCompat;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.health.hearing.HearingService;
import com.heytap.health.hearing.service.HearingServiceImpl;
import com.heytap.health.hearing.util.HearingSettingUtil;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b04;
import com.oplus.aiunit.vision.bdd;
import com.oplus.aiunit.vision.ccd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.lz8;
import com.oplus.aiunit.vision.mmd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.zw8;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/hearing/HearingService")
public class HearingServiceImpl implements HearingService {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f4630j;
    public static boolean k;
    public final lz8 i = new lz8();

    public static /* synthetic */ void Q2(ccd ccdVar) throws Throwable {
        ccdVar.onNext(zw8.c());
        ccdVar.onComplete();
    }

    public static /* synthetic */ void l3(Throwable th) throws Throwable {
        a7b.b(b04.TAG, "getFirstDataTime failed message : " + th.getMessage());
    }

    @Override // com.heytap.health.health.hearing.HearingService
    public void A3(Context context, ActivityOptionsCompat activityOptionsCompat, Intent intent) {
        String strD = v9g.w().D("user_ssoid");
        if (v9g.w().y("first_time_to_volume_" + strD) != -1) {
            context.startActivity(intent, activityOptionsCompat.toBundle());
            return;
        }
        mmd.c().a(Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=health-guide/index.html?steerCode=hearing"), null);
        v9g.w().S("first_time_to_volume_" + strD, 1);
    }

    @Override // com.heytap.health.health.hearing.HearingService
    public void Ua() {
        if (f4630j) {
            try {
                lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.mz8
                    @Override // com.oplus.aiunit.vision.bdd
                    public final void a(ccd ccdVar) throws Throwable {
                        HearingServiceImpl.Q2(ccdVar);
                    }
                }).L0(su8.c()).b(new o14() { // from class: com.oplus.aiunit.vision.nz8
                    @Override // com.oplus.aiunit.vision.o14
                    public final void accept(Object obj) {
                        o09.m(((Long) obj).longValue());
                    }
                }, new o14() { // from class: com.oplus.aiunit.vision.oz8
                    @Override // com.oplus.aiunit.vision.o14
                    public final void accept(Object obj) throws Throwable {
                        HearingServiceImpl.l3((Throwable) obj);
                    }
                });
            } catch (Exception e2) {
                a7b.b(b04.TAG, e2.toString());
            }
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        f4630j = zw8.g();
    }

    @Override // com.heytap.health.health.hearing.HearingService
    public boolean k8() {
        return k;
    }

    @Override // com.heytap.health.health.hearing.HearingService
    public void z0() {
        if (f4630j) {
            HearingSettingUtil.a();
        }
    }

    @Override // com.heytap.health.health.hearing.HearingService
    public boolean z6() {
        return f4630j;
    }
}
