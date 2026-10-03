package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.net.interceptor.AcSdkCode301Interceptor;
import com.oplus.accountsdk.open.AcOpenAccountManager;
import com.oplus.accountsdk.open.interceptor.AcOpenSdkPreHeaderInterceptor;
import com.platform.usercenter.ac.env.AccountUrlManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class kg extends s7 {
    public static volatile kg a;

    public kg(Context context) {
        super(context, AccountUrlManager.getServerUrl(AcOpenAccountManager.getInstance().isOverseaOnePlus()));
    }

    public static kg a(Context context) {
        if (a == null) {
            synchronized (kg.class) {
                if (a == null) {
                    a = new kg(context);
                }
            }
        }
        return a;
    }

    public void b(Context context, String str) {
        jj.c().g(str);
        jf.B().y(context, str);
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppK() {
        return AccountUrlManager.getOpenAB();
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppSecret() {
        return AccountUrlManager.getOpenAS();
    }

    @Override // com.oplus.aiunit.vision.s7
    public List<jea> getInterceptors(Context context) {
        List<jea> interceptors = super.getInterceptors(context);
        interceptors.add(new AcOpenSdkPreHeaderInterceptor(context));
        interceptors.add(new lj(context, this));
        interceptors.add(new AcSdkCode301Interceptor(context));
        interceptors.add(new yi());
        return interceptors;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getRegion() {
        return jj.c().d();
    }
}
