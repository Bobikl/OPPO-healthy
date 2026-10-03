package com.heytap.health.device_app_store.impl.service;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.device_app_store.impl.service.AppInstallStatusServiceImpl;
import com.heytap.health.device_app_store.install.AppStatusInfo;
import com.heytap.health.device_app_store.install.IAppInstallStatusService;
import com.oplus.aiunit.vision.kb0;
import com.oplus.aiunit.vision.qc0;
import com.oplus.aiunit.vision.rt9;
import com.oplus.aiunit.vision.vgd;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/device_app_store/AppInstallStatusService")
public class AppInstallStatusServiceImpl implements IAppInstallStatusService {
    public static /* synthetic */ void h1(rt9 rt9Var, AppStatusInfo appStatusInfo) {
        AppStatusInfo appStatusInfo2 = new AppStatusInfo(appStatusInfo.getPkgName(), appStatusInfo.getVersion(), appStatusInfo.getStatus(), appStatusInfo.getReason(), appStatusInfo.getFrom());
        appStatusInfo2.setProgress(appStatusInfo.getProgress());
        appStatusInfo2.setCurrStatus(appStatusInfo.getCurrStatus());
        rt9Var.a(appStatusInfo2);
    }

    @Override // com.heytap.health.device_app_store.install.IAppInstallStatusService
    public void D() {
        kb0.h().i();
    }

    @Override // com.heytap.health.device_app_store.install.IAppInstallStatusService
    public void I3(@NonNull Activity activity, @NonNull final rt9 rt9Var) {
        kb0.h().f(activity, new rt9() { // from class: com.oplus.aiunit.vision.lb0
            @Override // com.oplus.aiunit.vision.rt9
            public final void a(AppStatusInfo appStatusInfo) {
                AppInstallStatusServiceImpl.h1(rt9Var, appStatusInfo);
            }
        });
    }

    @Override // com.heytap.health.device_app_store.install.IAppInstallStatusService
    public boolean J(String str) {
        return kb0.h().m(str);
    }

    @Override // com.heytap.health.device_app_store.install.IAppInstallStatusService
    public void d8(String str, final vgd vgdVar) {
        kb0 kb0VarH = kb0.h();
        Objects.requireNonNull(vgdVar);
        kb0VarH.g(str, new vgd() { // from class: com.oplus.aiunit.vision.mb0
            @Override // com.oplus.aiunit.vision.vgd
            public final void a(boolean z, boolean z2) {
                vgdVar.a(z, z2);
            }
        });
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@NonNull Context context) {
    }

    @Override // com.heytap.health.device_app_store.install.IAppInstallStatusService
    public void p3(@NonNull Activity activity) {
        kb0.h().q(activity);
    }

    @Override // com.heytap.health.device_app_store.install.IAppInstallStatusService
    public boolean p8(String str) {
        return qc0.a(str).D2();
    }
}
