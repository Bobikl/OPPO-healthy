package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.bean.AcEncryptSsoidResponse;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;

/* JADX INFO: loaded from: classes19.dex */
public class z9 extends f7 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile z9 f19324l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z8 f19325j;
    public final sj k;

    public z9() {
        super(new n9(), new m9(), new ea(), aa.B(), new ba(), da.e());
        this.f19325j = new z8(this.b);
        this.k = new sj(this.b);
    }

    public static z9 i() {
        if (f19324l == null) {
            synchronized (z9.class) {
                if (f19324l == null) {
                    f19324l = new z9();
                }
            }
        }
        return f19324l;
    }

    public static /* synthetic */ void k(c8 c8Var, AcIpcResponse acIpcResponse) {
        AcLogUtil.i("AcIdApiManager", "requestEncryptSsoid: " + acIpcResponse.getMsg());
        AcApiResponse acApiResponseA = sa.a(AcEncryptSsoidResponse.class, acIpcResponse);
        if (!acApiResponseA.isSuccess() || acApiResponseA.getData() == null) {
            c8Var.call(new AcApiResponse(acApiResponseA.getCode(), acApiResponseA.getMsg(), null));
        } else {
            c8Var.call(new AcApiResponse(acApiResponseA.getCode(), acApiResponseA.getMsg(), ((AcEncryptSsoidResponse) acApiResponseA.getData()).encryptSsoid));
        }
    }

    public static /* synthetic */ void l(c8 c8Var, AcIpcResponse acIpcResponse) {
        c8Var.call(new AcApiResponse(acIpcResponse.getCode(), acIpcResponse.getMsg(), acIpcResponse.getData().getResponseJson()));
    }

    public void j(Context context, final c8<AcApiResponse<String>> c8Var) {
        this.f19325j.a(context, "", new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.y9
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                z9.k(c8Var, (AcIpcResponse) obj);
            }
        });
    }

    public AcApiResponse<AcAccountToken> m(Context context, String str, String str2, String str3, String str4) {
        AcApiResponse<AcAuthResponse> acApiResponseC = this.i.c(context, str, str2, str3, str4);
        AcLogUtil.i("AcIdApiManager", "refreshToken response " + acApiResponseC.getCode() + ", appI: " + str, str3);
        return f(acApiResponseC, str3);
    }

    public void n(Context context, String str, String str2, String str3, final c8<AcApiResponse<String>> c8Var) {
        this.k.a(context, str, str2, str3, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.x9
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                z9.l(c8Var, (AcIpcResponse) obj);
            }
        });
    }
}
