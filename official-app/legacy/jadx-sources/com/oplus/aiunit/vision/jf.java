package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.AcOpenAccountManager;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;
import com.platform.usercenter.account.ams.ipc.AcAuthResponse;

/* JADX INFO: loaded from: classes6.dex */
public class jf extends ya {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile jf f12865e = null;
    public static final Object f = new Object();
    public static long get_info_sdk2core_interval_time = 600000;

    public jf() {
        super(AcBaseConstants.a.OPEN_SDK_TYPE_VALUE);
    }

    public static jf B() {
        if (f12865e == null) {
            synchronized (jf.class) {
                if (f12865e == null) {
                    f12865e = new jf();
                }
            }
        }
        return f12865e;
    }

    public long C(Context context) {
        return ((Long) lg.e().a(context).b(vc.KEY_ACCOUNT_INFO_LAST_REQUEST_TIME, 0L)).longValue();
    }

    public void D(Context context, long j2) {
        lg.e().a(context).c(vc.KEY_ACCOUNT_INFO_LAST_REQUEST_TIME, Long.valueOf(j2));
    }

    @Override // com.oplus.aiunit.vision.ya
    public void c(Context context, String str) {
        super.c(context, str);
        lg.e().b(context).a(context);
        AcOpenAccountConfig config = AcOpenAccountManager.getInstance().getConfig();
        if (config != null) {
            kg.a(context).b(context, config.getCountry());
        } else {
            kg.a(context).b(context, "");
        }
    }

    @Override // com.oplus.aiunit.vision.ya
    public void q(Context context, AcAuthResponse acAuthResponse, String str) {
        AcOpenAccountConfig config;
        String strC = ni.c(acAuthResponse);
        if (TextUtils.isEmpty(strC) && !TextUtils.isEmpty(acAuthResponse.getIdToken()) && (config = AcOpenAccountManager.getInstance().getConfig()) != null) {
            strC = config.getCountry();
        }
        acAuthResponse.setIdToken(ni.a(acAuthResponse));
        kg.a(context).b(context, strC);
        String strC2 = ec.c(context);
        if (strC2 != null && !"0".equals(strC2)) {
            x(context, strC2);
        }
        r(context, acAuthResponse, f("AC_ACCOUNT_AUTH_FILE_NAME"), str);
    }

    @Override // com.oplus.aiunit.vision.ya
    public void z(Context context, AcAccountInfo acAccountInfo) {
        if (acAccountInfo == null) {
            AcLogUtil.e("AcOpenLocalCacheUtils", "saveUserInfoCache info, but is null");
            return;
        }
        if (!ec.j(context)) {
            AcLogUtil.i("AcOpenLocalCacheUtils", "saveUserInfoCache account info not changed");
            return;
        }
        String country = "";
        if (TextUtils.isEmpty(acAccountInfo.getCountry())) {
            AcOpenAccountConfig config = AcOpenAccountManager.getInstance().getConfig();
            if (config != null) {
                country = config.getCountry();
            } else {
                AcLogUtil.e("AcOpenLocalCacheUtils", "config is null");
            }
        } else {
            country = acAccountInfo.getCountry();
        }
        kg.a(context).b(context, country);
        String strD = ec.d(context);
        if (strD == null || "0".equals(strD)) {
            AcLogUtil.i("AcOpenLocalCacheUtils", "saveUserInfoCache ac version not support");
            p();
            return;
        }
        synchronized (f) {
            if (!ec.j(context)) {
                AcLogUtil.i("AcOpenLocalCacheUtils", "saveUserInfoCache account info not changed synchronized");
                return;
            }
            u(context, strD);
            t(context, acAccountInfo);
            p();
        }
    }
}
