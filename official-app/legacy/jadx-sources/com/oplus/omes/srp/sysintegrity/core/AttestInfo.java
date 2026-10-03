package com.oplus.omes.srp.sysintegrity.core;

import com.oplus.omes.srp.sysintegrity.SrpConstant;
import com.oplus.omes.srp.sysintegrity.SrpException;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class AttestInfo {
    private static final String KEY_NONCE = "nonce";
    private String jsonResult;
    private byte[] nonce;

    private AttestInfo() {
    }

    public static AttestInfo createFrom(AttestResponse attestResponse) {
        return createFrom(attestResponse, true);
    }

    public String getJsonResult() {
        return this.jsonResult;
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public void setJsonResult(String str) {
        this.jsonResult = str;
    }

    public static AttestInfo createFrom(AttestResponse attestResponse, boolean z) {
        byte[] bArr;
        AttestInfo attestInfo = new AttestInfo();
        if (attestResponse.getNonce() != null) {
            String nonce = attestResponse.getNonce();
            if (nonce == null || nonce.length() < 1) {
                LogUtil.e(SrpException.ERROR_PARSE_NONCE_ERROR);
                bArr = null;
            } else {
                if (nonce.length() % 2 == 1) {
                    nonce = "0" + nonce;
                }
                bArr = new byte[nonce.length() / 2];
                int i = 0;
                int i2 = 0;
                while (i < nonce.length()) {
                    int i3 = i + 2;
                    bArr[i2] = (byte) Integer.parseInt(nonce.substring(i, i3), 16);
                    i2++;
                    i = i3;
                }
            }
            attestInfo.nonce = bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(attestResponse.toJson());
            if (!z) {
                jSONObject.remove("sysIntegrity");
            }
            attestInfo.jsonResult = jSONObject.toString();
            LogUtil.splitContent(SrpConstant.DEBUG_JSON_RESULT, "jResult len:" + attestInfo.jsonResult.length() + " content:" + attestInfo.jsonResult);
        } catch (Exception e2) {
            LogUtil.e(80215, e2.getMessage());
        }
        return attestInfo;
    }
}
