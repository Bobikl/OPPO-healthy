package com.oplus.accountsdk.open.interceptor;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.account.config.AcOpenAccountConfig;
import com.oplus.accountsdk.base.common.constants.AcBaseConstants;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.AcOpenAccountManager;
import com.oplus.aiunit.vision.jea;
import com.oplus.aiunit.vision.k7;
import com.oplus.aiunit.vision.o8;
import com.oplus.aiunit.vision.r7;
import com.oplus.aiunit.vision.ytf;
import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenSdkPreHeaderInterceptor extends r7 {
    private static final String TAG = "AcIntercept._AcOpenSdkPreHeaderInterceptor";
    private final Context mContext;

    public AcOpenSdkPreHeaderInterceptor(Context context) {
        this.mContext = context;
    }

    @Override // com.oplus.aiunit.vision.jea
    @NonNull
    public ytf intercept(jea.a aVar) throws IOException {
        Request.Builder builderN = aVar.request().n();
        try {
            AcOpenAccountConfig config = AcOpenAccountManager.getInstance().getConfig();
            StringBuilder sb = new StringBuilder();
            sb.append(!TextUtils.equals(config.getCountry(), "CN"));
            sb.append("");
            builderN.addHeader(AcBaseConstants.a.HEADER_APP_OVERSEA_CLIENT, sb.toString());
            builderN.addHeader(AcBaseConstants.a.HEADER_X_CONTEXT_COUNTRY, config.getCountry());
            builderN.addHeader(AcBaseConstants.a.HEADER_X_CONTEXT_MASK_REGION, config.getCountry());
            builderN.addHeader(AcBaseConstants.a.HEADER_X_DEVICE_BRAND, config.getBrand());
            builderN.addHeader(AcBaseConstants.a.HEADER_BIZ_PACKAGE, k7.a(this.mContext));
            builderN.addHeader(AcBaseConstants.a.HEADER_BIZ_VERSION, o8.e(this.mContext));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            Context context = this.mContext;
            sb2.append(k7.b(context, context.getPackageName()));
            builderN.addHeader(AcBaseConstants.a.HEADER_BIZ_VERSION_CODE, sb2.toString());
            builderN.addHeader(AcBaseConstants.a.X_SDK_VERSION, "30006");
            builderN.addHeader(AcBaseConstants.a.X_SDK_TYPE, AcBaseConstants.a.OPEN_SDK_TYPE_VALUE);
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "intercept exception e = " + e2);
        }
        return aVar.c(builderN.build());
    }
}
