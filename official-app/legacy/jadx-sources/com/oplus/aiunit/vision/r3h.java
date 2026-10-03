package com.oplus.aiunit.vision;

import android.os.Looper;
import com.oplus.weatherservicesdk.data.Weather;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class r3h implements lr9 {
    public final long a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sol f16049c;
    public final String d;

    public r3h(long j2, String str, sol solVar, String str2) {
        this.a = j2;
        this.b = str;
        this.f16049c = solVar;
        this.d = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj, String str, JSONObject jSONObject) {
        m7b.a("SimpleCallback", "invoke method: " + this.d + "\n code: " + obj + "\n message: " + str + Weather.SEPARATOR);
        try {
            this.f16049c.g(this.a, this.b, new JSONObject().put("code", obj).put("msg", str).put("data", jSONObject));
        } catch (Exception e2) {
            m7b.g("SimpleCallback", e2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", obj);
                jSONObject2.put("msg", e2.getMessage());
            } catch (Exception unused) {
                m7b.g("SimpleCallback", e2);
            }
            this.f16049c.g(this.a, this.b, jSONObject2);
        }
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void a(final Object obj, final String str, final JSONObject jSONObject) {
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.p3h
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d(obj, str, jSONObject);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            mwj.j(runnable);
        }
    }

    public void c(Object obj, String str) {
        a(obj, str, new JSONObject());
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void fail(Object obj, String str) {
        c(obj, str);
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void success(JSONObject jSONObject) {
        a(0, "success!", jSONObject);
    }

    @Override // com.oplus.aiunit.vision.lr9
    public void success() {
        a(0, "success!", new JSONObject());
    }
}
