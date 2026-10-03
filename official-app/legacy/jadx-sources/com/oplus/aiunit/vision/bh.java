package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.open.interceptor.AcOpenSdkPreHeaderInterceptor;
import com.platform.usercenter.ac.env.AccountUrlManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class bh extends s7 {
    public static volatile bh a;

    public bh(Context context) {
        super(context, AccountUrlManager.getTrackHost());
    }

    public static bh a(Context context) {
        if (a == null) {
            synchronized (bh.class) {
                if (a == null) {
                    a = new bh(context);
                }
            }
        }
        return a;
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
        interceptors.add(new n8());
        return interceptors;
    }

    @Override // com.oplus.aiunit.vision.s7
    public String getRegion() {
        return jj.c().d();
    }
}
