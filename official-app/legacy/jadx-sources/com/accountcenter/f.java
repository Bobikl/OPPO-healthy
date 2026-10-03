package com.accountcenter;

import android.content.Context;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.heytap.usercenter.accountsdk.tools.UCStatisticsHelper;
import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ztf;
import com.platform.sdk.center.sdk.mvvm.model.data.AcInfo;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements at2<CoreResponse<AcInfo>> {
    public final /* synthetic */ AccountEntity a;
    public final /* synthetic */ Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AcAccountResultCallback f481c;
    public final /* synthetic */ String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UCStatisticsHelper.StatBuilder f482e;

    public f(AccountEntity accountEntity, Context context, AcAccountResultCallback acAccountResultCallback, String str, UCStatisticsHelper.StatBuilder statBuilder) {
        this.a = accountEntity;
        this.b = context;
        this.f481c = acAccountResultCallback;
        this.d = str;
        this.f482e = statBuilder;
    }

    @Override // com.oplus.aiunit.vision.at2
    public final void onFailure(xr2<CoreResponse<AcInfo>> xr2Var, Throwable th) {
        AcAccountResultCallback acAccountResultCallback = this.f481c;
        if (acAccountResultCallback != null) {
            acAccountResultCallback.onError(xr2Var, th, th.getMessage());
        }
        this.f482e.putInfo("onFailure", th == null ? "" : th.getMessage()).statistics();
    }

    @Override // com.oplus.aiunit.vision.at2
    public final void onResponse(xr2<CoreResponse<AcInfo>> xr2Var, ztf<CoreResponse<AcInfo>> ztfVar) {
        if (ztfVar.g()) {
            AccountEntity accountEntity = this.a;
            if (accountEntity != null) {
                h.a(this.b, accountEntity, ztfVar.a(), this.f481c);
            } else {
                new e(this, this.b, this.d, ztfVar);
            }
        } else {
            AcAccountResultCallback acAccountResultCallback = this.f481c;
            if (acAccountResultCallback != null) {
                acAccountResultCallback.onError(xr2Var, null, ztfVar.h());
            }
        }
        if (!ztfVar.g()) {
            this.f482e.putInfo(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, ztfVar.b() + "  " + ztfVar.h()).statistics();
            return;
        }
        if (ztfVar.a() == null || ztfVar.a().error == null) {
            return;
        }
        this.f482e.putInfo(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, ztfVar.a().error.code + "  " + ztfVar.a().error.message).statistics();
    }
}
