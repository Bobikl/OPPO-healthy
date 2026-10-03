package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.bean.AcLoginParam;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oa {
    public kl9 a;
    public IAcIpcUriProvider b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sl9 f14856c;
    public final o7 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y8 f14857e;
    public final ti f;
    public final ya g;
    public final tj h;

    public oa(kl9 kl9Var, IAcIpcUriProvider iAcIpcUriProvider, sl9 sl9Var, ya yaVar, tj tjVar) {
        this.a = kl9Var;
        this.b = iAcIpcUriProvider;
        this.f14856c = sl9Var;
        this.g = yaVar;
        this.h = tjVar;
        this.d = new o7(kl9Var, iAcIpcUriProvider, sl9Var, yaVar, tjVar);
        this.f14857e = new y8(kl9Var, iAcIpcUriProvider, sl9Var, tjVar);
        this.f = new ti(kl9Var, iAcIpcUriProvider, sl9Var, tjVar);
    }

    public long a() {
        return this.d.e();
    }

    public void b(pa paVar, boolean z, AcLoginParam acLoginParam, AcBaseConstants.RequestApiType requestApiType, c8<AcApiResponse<AcAccountToken>> c8Var) {
        this.d.h(paVar, z, acLoginParam, requestApiType, c8Var);
    }

    public AcApiResponse<AcAccountInfo> c(pa paVar) {
        return d(paVar, false);
    }

    public AcApiResponse<AcAccountInfo> d(pa paVar, boolean z) {
        Context contextG = paVar.g();
        AcApiResponse<AcAccountInfo> acApiResponseF = this.f14857e.f(paVar, z);
        if (acApiResponseF.isSuccess() && acApiResponseF.getData() != null) {
            AcLogUtil.i("AcIpcManagerBase", "save data");
            this.g.z(contextG, acApiResponseF.getData());
        }
        return acApiResponseF;
    }

    public void e(pa paVar, boolean z, AcLoginParam acLoginParam, AcBaseConstants.RequestApiType requestApiType, c8<AcApiResponse<String>> c8Var) {
        this.f.b(paVar, z, acLoginParam, requestApiType, c8Var);
    }

    public AcApiResponse<AcAccountToken> f(AcApiResponse<AcAuthResponse> acApiResponse, String str) {
        return this.d.j(acApiResponse, str);
    }
}
