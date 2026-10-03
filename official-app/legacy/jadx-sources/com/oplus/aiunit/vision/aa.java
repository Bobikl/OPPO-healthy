package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;

/* JADX INFO: loaded from: classes19.dex */
public class aa extends ya {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile aa f9266e;
    public static final Object f = new Object();

    public aa() {
        super(AcBaseConstants.a.ID_SDK_TYPE_VALUE);
    }

    public static aa B() {
        if (f9266e == null) {
            synchronized (aa.class) {
                if (f9266e == null) {
                    f9266e = new aa();
                }
            }
        }
        return f9266e;
    }

    @Override // com.oplus.aiunit.vision.ya
    public void b(Context context) {
        super.b(context);
        da.e().b(context).a(context);
        ca.a(context).b(context, m8.b());
    }

    @Override // com.oplus.aiunit.vision.ya
    public void c(Context context, String str) {
        super.c(context, str);
        da.e().b(context).a(context);
        ca.a(context).b(context, m8.b());
    }

    @Override // com.oplus.aiunit.vision.ya
    public void q(Context context, AcAuthResponse acAuthResponse, String str) {
        String strB = mi.b(acAuthResponse);
        if (TextUtils.isEmpty(strB) && !TextUtils.isEmpty(acAuthResponse.getIdToken())) {
            strB = m8.b();
        }
        acAuthResponse.setIdToken(mi.a(acAuthResponse));
        ca.a(context).b(context, strB);
        int iF = a7.f(context);
        if (iF != 0) {
            w(context, iF);
        }
        r(context, acAuthResponse, f("AC_ACCOUNT_AUTH_FILE_NAME"), str);
    }

    @Override // com.oplus.aiunit.vision.ya
    public void z(Context context, AcAccountInfo acAccountInfo) {
        if (acAccountInfo == null) {
            AcLogUtil.e("AcIdLocalCacheUtils", "saveUserInfoCache info, but is null");
            return;
        }
        if (!a7.k(context)) {
            AcLogUtil.i("AcIdLocalCacheUtils", "saveUserInfoCache account info not changed");
            return;
        }
        ca.a(context).b(context, TextUtils.isEmpty(acAccountInfo.getCountry()) ? m8.b() : acAccountInfo.getCountry());
        int iG = a7.g(context);
        if (iG == 0) {
            AcLogUtil.i("AcIdLocalCacheUtils", "saveUserInfoCache ac version not support");
            p();
            return;
        }
        AcLogUtil.i("AcIdLocalCacheUtils", "save hash: " + iG);
        synchronized (f) {
            if (!a7.k(context)) {
                AcLogUtil.i("AcIdLocalCacheUtils", "saveUserInfoCache account info not changed synchronized");
                return;
            }
            r(context, Integer.valueOf(iG), f(AcBaseConstants.b.SETTINGS_HASH_FILE), AcBaseConstants.b.SETTINGS_INFO_HASH_VALUE);
            t(context, acAccountInfo);
            p();
        }
    }
}
