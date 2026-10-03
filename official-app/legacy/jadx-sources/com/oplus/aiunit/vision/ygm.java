package com.oplus.aiunit.vision;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ygm {
    public final String a;
    public final String b;

    public ygm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        try {
            return new JSONObject(this.b);
        } catch (Exception e2) {
            qrm.d(e2);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.a, this.b);
    }
}
