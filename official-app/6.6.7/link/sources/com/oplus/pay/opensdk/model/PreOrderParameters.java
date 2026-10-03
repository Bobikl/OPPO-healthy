package com.oplus.pay.opensdk.model;

import androidx.annotation.Keep;
import com.client.platform.opensdk.pay.PayXorUtils;
import com.oplus.aiunit.vision.pce;
import com.oplus.pay.opensdk.msp.pay.PayConstant;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class PreOrderParameters extends ObtainParameters {
    public String acrossScreen;
    public String inputParameters;
    public String mAutoOrderChannel;
    public String mChannelId;
    public String mCountryCode;
    public String mCurrencyName;
    public String mToken;
    public String prePayToken;
    public String mAttach = "";
    public String launchModel = PayConstant.MethodName.PAY;
    public String defaultStrategy = "";
    public String mPartnerId = "";
    public String userRegisterCountry = "";
    public String schemePackageName = "";

    public String convert() {
        JSONObject jSONObject = new JSONObject();
        for (Field field : getClass().getFields()) {
            field.setAccessible(true);
            try {
                if ("mTagKey".equals(field.getName())) {
                    jSONObject.put(PayXorUtils.payEncrypt("eIxxCmq", 8), field.get(this));
                } else {
                    jSONObject.put(field.getName(), field.get(this));
                }
            } catch (Exception e) {
                pce.f("convert error. exception : " + e.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public String toString() {
        return convert();
    }
}
