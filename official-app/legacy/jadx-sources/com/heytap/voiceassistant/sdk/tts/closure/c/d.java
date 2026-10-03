package com.heytap.voiceassistant.sdk.tts.closure.c;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class d {
    public HashMap<String, String> a = new HashMap<>();

    public int a(String str, int i) {
        String str2 = this.a.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            return Integer.parseInt(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return i;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(HttpUtils.EQUAL_SIGN);
            stringBuffer.append(entry.getValue());
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public d a() {
        d dVar = new d();
        dVar.a = (HashMap) this.a.clone();
        return dVar;
    }

    public Boolean a(String str) {
        return Boolean.valueOf(this.a.remove(str) != null);
    }

    public void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (z || !this.a.containsKey(str)) {
            this.a.put(str, str2);
        }
    }

    public void a(String[][] strArr) {
        if (strArr != null) {
            for (String[] strArr2 : strArr) {
                if (this.a.containsKey(strArr2[0])) {
                    String str = this.a.get(strArr2[0]);
                    this.a.remove(strArr2[0]);
                    for (int i = 1; i < strArr2.length; i++) {
                        this.a.put(strArr2[i], str);
                    }
                }
            }
        }
    }

    public boolean a(String str, boolean z) {
        String str2 = this.a.get(str);
        if (str2 == null) {
            return z;
        }
        if (SpeechConstant.TRUE_STR.equals(str2) || "1".equals(str2)) {
            return true;
        }
        if (SpeechConstant.FALSE_STR.equals(str2) || "0".equals(str2)) {
            return false;
        }
        return z;
    }
}
