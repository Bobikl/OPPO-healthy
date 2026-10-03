package com.platform.sdk.center.sdk.mvvm.model.net.param;

import android.content.Context;
import com.platform.sdk.center.cons.AcConstants;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.algorithm.MD5Util;
import com.platform.usercenter.tools.algorithm.UCSignHelper;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcInfoParam {
    public String feature;
    public String memberPackage;
    public Boolean needCheckMemberPackage;

    @NoSign
    public String sign;
    public String userToken;
    public String bizk = AcConstants.APP_K;
    public String timestamp = System.currentTimeMillis() + "";
    public String ucSdkVersion = String.valueOf(303000);

    public AcInfoParam(Context context, String str) {
        this.userToken = str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("payUrlVer", "1.0");
            jSONObject.put("appPackage", context.getPackageName());
        } catch (JSONException e2) {
            UCLogUtil.e(e2);
        }
        this.needCheckMemberPackage = Boolean.TRUE;
        this.memberPackage = ApkInfoHelper.getUcPackage(context);
        this.feature = jSONObject.toString();
        this.sign = MD5Util.md5Hex(UCSignHelper.signWithAnnotation(this) + AcConstants.APP_S);
    }
}
