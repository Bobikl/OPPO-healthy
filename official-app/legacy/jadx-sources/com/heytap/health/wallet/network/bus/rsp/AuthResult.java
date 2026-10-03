package com.heytap.health.wallet.network.bus.rsp;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.oplus.aiunit.vision.j3n;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class AuthResult {
    private String alipayOpenId;
    private String authCode;
    private String memo;
    private String result;
    private String resultCode;
    private String resultStatus;

    public AuthResult(Map<String, String> map, boolean z) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, j3n.a)) {
                this.resultStatus = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.result = map.get(str);
            } else if (TextUtils.equals(str, j3n.b)) {
                this.memo = map.get(str);
            }
        }
        for (String str2 : this.result.split("&")) {
            if (str2.startsWith("alipay_open_id")) {
                this.alipayOpenId = removeBrackets(getValue("alipay_open_id=", str2), z);
            } else if (str2.startsWith(ProtocolEventManager.Event.AUTH_CODE)) {
                this.authCode = removeBrackets(getValue("auth_code=", str2), z);
            } else if (str2.startsWith("result_code")) {
                this.resultCode = removeBrackets(getValue("result_code=", str2), z);
            }
        }
    }

    private String getValue(String str, String str2) {
        return str2.substring(str.length(), str2.length());
    }

    private String removeBrackets(String str, boolean z) {
        if (!z || TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"")) {
            str = str.replaceFirst("\"", "");
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public String getAlipayOpenId() {
        return this.alipayOpenId;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public String getMemo() {
        return this.memo;
    }

    public String getResult() {
        return this.result;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultStatus() {
        return this.resultStatus;
    }

    public String toString() {
        return "resultStatus={" + this.resultStatus + "};memo={" + this.memo + "};result={" + this.result + "}";
    }
}
