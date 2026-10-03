package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.bytedance.sdk.open.aweme.authorize.model.VerifyObject;
import com.platform.usercenter.account.router.LinkConstants;
import io.netty.util.internal.StringUtil;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ihm {
    public static String a(Context context, Authorization.Request request, String str, String str2, String str3) {
        String string;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(request.optionalScope1)) {
            for (String str4 : request.optionalScope1.split(",")) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str4 + ",1");
            }
        }
        if (!TextUtils.isEmpty(request.optionalScope0)) {
            for (String str5 : request.optionalScope0.split(",")) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str5 + ",0");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String str6 = request.scope;
        if (str6 != null) {
            sb2.append(str6);
        }
        VerifyObject verifyObject = request.verifyObject;
        if (verifyObject != null && verifyObject.verifyScope != null) {
            if (sb2.length() > 0) {
                sb2.append(StringUtil.COMMA);
            }
            sb2.append(request.verifyObject.verifyScope);
        }
        List<String> listA = d3h.a(context, request.getCallerPackage());
        Bundle bundle = request.extras;
        String str7 = "";
        if (bundle != null) {
            String string2 = bundle.getString("live_enter_from", "");
            string = bundle.getString(LinkConstants.EXTRA_PARAM_ENTER_FROM, "");
            str7 = string2;
        } else {
            string = "";
        }
        return new Uri.Builder().scheme(str).authority(str2).path(str3).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", request.redirectUri).appendQueryParameter(ram.f16142j, request.getClientKey()).appendQueryParameter("state", request.state).appendQueryParameter("from", "opensdk").appendQueryParameter("scope", sb2.toString()).appendQueryParameter("optionalScope", sb.toString()).appendQueryParameter("signature", d3h.b(listA)).appendQueryParameter("app_identity", opb.a(request.getCallerPackage())).appendQueryParameter("device_platform", "android").appendQueryParameter("live_enter_from", str7).appendQueryParameter(LinkConstants.EXTRA_PARAM_ENTER_FROM, string).build().toString();
    }
}
