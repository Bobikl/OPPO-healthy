package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.net.interceptor.AcSdkCode301Interceptor;
import com.oplus.accountsdk.service.common.net.interceptor.AcIdSdkPreHeaderInterceptor;
import com.platform.usercenter.ac.env.AccountUrlManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ca extends s7 {
    public static final String IDSDK_K = ml.b("><>?mi0mim:0<j?;=llin;:l8n;;k<0:", 8);
    public static final String IDSDK_S = ml.b("i9:n<;lm<:lil0<<=jl>89>0819j89<i", 8);
    public static volatile ca a;

    public ca(Context context) {
        super(context, AccountUrlManager.getServerUrl(m8.f(context)));
    }

    public static ca a(Context context) {
        if (a == null) {
            synchronized (ca.class) {
                if (a == null) {
                    a = new ca(context);
                }
            }
        }
        return a;
    }

    public void b(Context context, String str) {
        jj.c().g(str);
        aa.B().y(context, str);
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppK() {
        return IDSDK_K;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppSecret() {
        return IDSDK_S;
    }

    @Override // com.oplus.aiunit.vision.s7
    public List<jea> getInterceptors(Context context) {
        List<jea> interceptors = super.getInterceptors(context);
        interceptors.add(new AcIdSdkPreHeaderInterceptor(context));
        interceptors.add(new lj(context, this));
        interceptors.add(new AcSdkCode301Interceptor(context));
        interceptors.add(new yi());
        interceptors.add(new n8());
        return interceptors;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getRegion() {
        return jj.c().d();
    }
}
