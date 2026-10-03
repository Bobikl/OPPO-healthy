package com.oplus.aiunit.vision;

import android.os.Looper;
import com.oplus.weatherservicesdk.data.Weather;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class j7h implements rs9 {
    public final long a;
    public final String b;
    public final qsl c;
    public final String d;

    public j7h(long j, String str, qsl qslVar, String str2) {
        this.a = j;
        this.b = str;
        this.c = qslVar;
        this.d = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj, String str, JSONObject jSONObject) {
        y8b.a("SimpleCallback", "invoke method: " + this.d + "\n code: " + obj + "\n message: " + str + Weather.SEPARATOR);
        try {
            this.c.g(this.a, this.b, new JSONObject().put("code", obj).put("msg", str).put("data", jSONObject));
        } catch (Exception e) {
            y8b.g("SimpleCallback", e);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", obj);
                jSONObject2.put("msg", e.getMessage());
            } catch (Exception unused) {
                y8b.g("SimpleCallback", e);
            }
            this.c.g(this.a, this.b, jSONObject2);
        }
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void a(final Object obj, final String str, final JSONObject jSONObject) {
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.h7h
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d(obj, str, jSONObject);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            o0k.j(runnable);
        }
    }

    public void c(Object obj, String str) {
        a(obj, str, new JSONObject());
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void fail(Object obj, String str) {
        c(obj, str);
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void success(JSONObject jSONObject) {
        a(0, rs9.SUCCESS_MESSAGE, jSONObject);
    }

    @Override // com.oplus.aiunit.vision.rs9
    public void success() {
        a(0, rs9.SUCCESS_MESSAGE, new JSONObject());
    }
}
