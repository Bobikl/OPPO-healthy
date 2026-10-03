package com.platform.usercenter.basic.provider;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.oplus.aiunit.vision.ooi;
import com.oplus.aiunit.vision.poi;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class InternalOpenIdProvider<T> implements IOpenIdProvider<OpenIdBean> {
    private static final String NULL_OUID_MARK = "0000000000000000000000000000000000000000000000000000000000000000";
    private static final String TAG = "InternalOpenIdProvider";
    private final Context mContext;

    public InternalOpenIdProvider(Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.platform.usercenter.basic.provider.IOpenIdProvider
    public OpenIdBean create() {
        String str;
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                UCLogUtil.i(TAG, "StdIDSDK Cannot run on MainThread");
                return null;
            }
            poi.j(this.mContext);
            if (!poi.k()) {
                UCLogUtil.i(TAG, "isSupported stdId = false");
                return null;
            }
            ooi ooiVarI = poi.i(this.mContext, ooi.Type_GUID | ooi.Type_OUID | ooi.Type_AUID | ooi.Type_APID);
            if (ooiVarI == null) {
                UCLogUtil.i(TAG, "StdIDInfo = null");
                return null;
            }
            String str2 = ooiVarI.a;
            if (TextUtils.isEmpty(str2)) {
                UCLogUtil.i(TAG, "1 is NULL");
                str2 = "";
            }
            String str3 = ooiVarI.b;
            if (TextUtils.isEmpty(str3) || TextUtils.equals(NULL_OUID_MARK, str3)) {
                UCLogUtil.i(TAG, "2 is NULL");
                str3 = "";
            }
            String str4 = ooiVarI.f;
            if (TextUtils.isEmpty(str4)) {
                UCLogUtil.i(TAG, "4 is NULL");
                str4 = "";
            }
            String str5 = ooiVarI.f15008e;
            if (TextUtils.isEmpty(str5)) {
                UCLogUtil.i(TAG, "5 is NULL");
                str = "";
            } else {
                str = str5;
            }
            poi.a(this.mContext);
            return new OpenIdBean(str2, str3, "", str4, str);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        } catch (NoClassDefFoundError e3) {
            UCLogUtil.e(TAG, e3.getMessage());
            return null;
        }
    }
}
