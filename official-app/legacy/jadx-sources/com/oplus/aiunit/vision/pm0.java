package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class pm0 {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15404c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15405e;
    public String f;

    public pm0(Map<String, String> map, boolean z) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, j3n.a)) {
                this.a = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.b = map.get(str);
            } else if (TextUtils.equals(str, j3n.b)) {
                this.f15404c = map.get(str);
            }
        }
        for (String str2 : this.b.split("&")) {
            if (str2.startsWith("alipay_open_id")) {
                this.f = e(d("alipay_open_id=", str2), z);
            } else if (str2.startsWith(ProtocolEventManager.Event.AUTH_CODE)) {
                this.f15405e = e(d("auth_code=", str2), z);
            } else if (str2.startsWith("result_code")) {
                this.d = e(d("result_code=", str2), z);
            }
        }
    }

    public String a() {
        return this.f15405e;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public final String d(String str, String str2) {
        return str2.substring(str.length());
    }

    public final String e(String str, boolean z) {
        if (!z || TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"")) {
            str = str.replaceFirst("\"", "");
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public String toString() {
        return "authCode={" + this.f15405e + "}; resultStatus={" + this.a + "}; memo={" + this.f15404c + "}; result={" + this.b + "}";
    }
}
