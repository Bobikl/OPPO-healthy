package com.oplus.pay.opensdk.model;

import androidx.annotation.Keep;
import com.client.platform.opensdk.pay.PayXorUtils;
import com.oplus.aiunit.vision.qae;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
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
    public String launchModel = "pay";
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
            } catch (Exception e2) {
                qae.f("convert error. exception : " + e2.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public String toString() {
        return convert();
    }
}
