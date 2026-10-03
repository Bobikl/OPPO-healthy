package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.service.common.net.interceptor.AcIdSdkPreHeaderInterceptor;
import com.platform.usercenter.ac.env.AccountUrlManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class pk extends s7 {
    public static volatile pk a;

    public pk(Context context) {
        super(context, AccountUrlManager.getTrackHost());
    }

    public static pk a(Context context) {
        if (a == null) {
            synchronized (pk.class) {
                if (a == null) {
                    a = new pk(context);
                }
            }
        }
        return a;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppK() {
        return ca.IDSDK_K;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getAppSecret() {
        return ca.IDSDK_S;
    }

    @Override // com.oplus.aiunit.vision.s7
    public List<jea> getInterceptors(Context context) {
        List<jea> interceptors = super.getInterceptors(context);
        interceptors.add(new AcIdSdkPreHeaderInterceptor(context));
        interceptors.add(new n8());
        return interceptors;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getRegion() {
        return jj.c().d();
    }
}
