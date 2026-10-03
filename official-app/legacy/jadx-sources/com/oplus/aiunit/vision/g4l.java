package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.oppo.lib.common.R$string;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class g4l {

    public static class a {
        public BaseResp a;
        public BaseReq b;

        public a(BaseResp baseResp, BaseReq baseReq) {
            this.a = baseResp;
            this.b = baseReq;
        }

        public static void a(Context context, BaseResp baseResp, BaseReq baseReq, cbe cbeVar) {
            if (baseResp == null) {
                cbeVar.failed(-1, "response is null !");
                return;
            }
            if (!(baseResp instanceof PayResp)) {
                cbeVar.failed(baseResp.errCode, "no a pay response :" + baseResp.errStr);
                return;
            }
            PayResp payResp = (PayResp) baseResp;
            t6b.b("WChatPayHelper", "prepayid:" + payResp.prepayId + ", errCode = " + payResp.errCode + ",mPackageName=" + context.getPackageName() + ",extData=" + payResp.extData);
            String string = payResp.errStr;
            int i = payResp.errCode;
            if (i == -5) {
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(R$string.error_wx_unsupport);
                }
                cbeVar.failed(i, string);
                return;
            }
            if (i == -4) {
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(R$string.error_wx_auth_denied);
                }
                cbeVar.failed(i, string);
                return;
            }
            if (i == -3) {
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(R$string.error_wx_send_fail);
                }
                cbeVar.failed(i, string);
            } else {
                if (i == -2) {
                    cbeVar.cancel();
                    return;
                }
                if (i == -1) {
                    if (TextUtils.isEmpty(string)) {
                        string = context.getString(R$string.error_wx_unkown);
                    }
                    cbeVar.failed(i, string);
                } else {
                    if (i == 0) {
                        cbeVar.success();
                        return;
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = context.getString(R$string.error_wx_unkown);
                    }
                    cbeVar.failed(i, string);
                }
            }
        }
    }

    public static PayReq a(String str) {
        PayReq payReq = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            PayReq payReq2 = new PayReq();
            try {
                payReq2.appId = jSONObject.optString("appid");
                payReq2.partnerId = jSONObject.optString("partnerid");
                payReq2.prepayId = jSONObject.optString("prepayid");
                payReq2.nonceStr = jSONObject.optString("noncestr");
                payReq2.timeStamp = jSONObject.optString("timestamp");
                payReq2.packageValue = jSONObject.optString("package");
                payReq2.sign = jSONObject.optString("sign");
                t6b.b("WChatPayHelper", "json = " + jSONObject.toString());
                return payReq2;
            } catch (JSONException e2) {
                e = e2;
                payReq = payReq2;
                t6b.d("WChatPayHelper", Thread.currentThread().getStackTrace()[1].getMethodName() + e.getMessage());
                return payReq;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public static void b(Context context, PayReq payReq) {
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(context, null);
        iwxapiCreateWXAPI.registerApp(payReq.appId);
        t6b.c("checkArgs =" + payReq.checkArgs());
        if (iwxapiCreateWXAPI.isWXAppInstalled()) {
            iwxapiCreateWXAPI.sendReq(payReq);
        } else {
            new HealthAlertDialogBuilder(context).setTitle(R$string.wchat_uninstalled).setMessage(R$string.weixin_uninstalled_tip).setPositiveButton(R$string.sure, null).show();
        }
    }
}
