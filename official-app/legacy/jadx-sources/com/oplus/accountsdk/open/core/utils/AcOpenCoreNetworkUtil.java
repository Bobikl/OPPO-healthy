package com.oplus.accountsdk.open.core.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.net.interceptor.AcSdkCode301Interceptor;
import com.oplus.accountsdk.open.core.interceptor.AcOpenCorePreHeaderInterceptor;
import com.oplus.accountsdk.open.core.interceptor.AcOpenCoreTokenExpiredInterceptor;
import com.oplus.accountsdk.open.core.interceptor.AcOpenTokenInvalidInterceptor;
import com.oplus.accountsdk.open.core.storage.AcOpenStorageHelper;
import com.oplus.aiunit.vision.fd;
import com.oplus.aiunit.vision.jc;
import com.oplus.aiunit.vision.jd;
import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.jj;
import com.oplus.aiunit.vision.lj;
import com.oplus.aiunit.vision.s7;
import com.oplus.aiunit.vision.uc;
import com.oplus.aiunit.vision.yi;
import com.platform.usercenter.ac.env.AccountUrlManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenCoreNetworkUtil extends s7 {
    private static final String TAG = "AcOpenCoreNetworkUtil";
    private static volatile AcOpenCoreNetworkUtil mInstance = null;
    private static boolean needReset = false;

    private AcOpenCoreNetworkUtil(Context context) {
        super(context, AccountUrlManager.getServerUrl(jc.i()));
    }

    public static AcOpenCoreNetworkUtil getInstance(Context context) {
        if (mInstance == null) {
            synchronized (AcOpenCoreNetworkUtil.class) {
                if (mInstance == null) {
                    mInstance = new AcOpenCoreNetworkUtil(context);
                }
            }
        }
        if (needReset) {
            mInstance.reinit(context);
        }
        return mInstance;
    }

    private void reinit(Context context) {
        if (AcOpenStorageHelper.getInstance(context).getAcOpenAccountToken() == null) {
            setUserRegion(uc.c().a().getCountry());
        }
        setNeedReset(false);
    }

    public static void setNeedReset(boolean z) {
        needReset = z;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppK() {
        return AccountUrlManager.getOpenAB();
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppSecret() {
        return AccountUrlManager.getOpenAS();
    }

    public String getHostByCurrentRegion() {
        String strA = jj.c().a();
        return TextUtils.isEmpty(strA) ? AccountUrlManager.getServerUrl() : strA;
    }

    @Override // com.oplus.aiunit.vision.s7
    public List<jea> getInterceptors(Context context) {
        List<jea> interceptors = super.getInterceptors(context);
        interceptors.add(new jd(context));
        interceptors.add(new AcOpenCoreTokenExpiredInterceptor(context));
        interceptors.add(new AcOpenCorePreHeaderInterceptor(context));
        interceptors.add(new fd(context));
        interceptors.add(new lj(context, this));
        interceptors.add(new AcSdkCode301Interceptor(context));
        interceptors.add(new yi());
        interceptors.add(new AcOpenTokenInvalidInterceptor(context));
        return interceptors;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getRegion() {
        return jj.c().d();
    }

    public String setRegionAndGetHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return AccountUrlManager.getServerUrl();
        }
        jj.c().g(str);
        return getHostByCurrentRegion();
    }

    public void setUserRegion(String str) {
        jj.c().g(str);
    }
}
