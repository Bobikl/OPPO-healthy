package com.oplus.aiunit.vision;

import android.content.Context;
import com.google.gson.JsonObject;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes8.dex */
public class l7a {
    public static final l7a d = new l7a();
    public k7a[] a = null;
    public long b = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13558c;

    public static l7a f() {
        return d;
    }

    public final JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        try {
            for (k7a k7aVar : this.a) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                k7aVar.c(jsonObject);
            }
        } catch (Exception e2) {
            v6b.b(e2.toString());
        }
        return jsonObject;
    }

    public final void b(Context context) {
        for (k7a k7aVar : this.a) {
            try {
                k7aVar.a(context);
            } catch (Exception e2) {
                v6b.b(e2.toString());
            }
        }
    }

    public synchronized JsonObject c(Context context) {
        JsonObject jsonObjectA;
        if (this.a == null || System.currentTimeMillis() - this.f13558c > this.b) {
            StringBuilder sb = new StringBuilder();
            sb.append("mInfos is null ? ");
            sb.append(this.a == null);
            v6b.a(sb.toString());
            d(context);
            JsonObject jsonObjectA2 = a();
            b(context);
            jsonObjectA = jsonObjectA2;
        } else {
            v6b.a("getCached infos");
            jsonObjectA = a();
        }
        return jsonObjectA;
    }

    public final void d(Context context) {
        this.f13558c = System.currentTimeMillis();
        k7a[] k7aVarArr = {new ckj(), new q95(), new umc(), new wo6(), new gh8(), new ltd()};
        this.a = k7aVarArr;
        try {
            for (k7a k7aVar : k7aVarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                k7aVar.b(context);
                v6b.a("gather " + k7aVar.getClass().getSimpleName() + " cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
        } catch (Exception e2) {
            v6b.b(e2.toString());
        }
    }

    public String e(Context context) {
        String strEncode;
        JsonObject jsonObjectC = c(context);
        v6b.a("raw allInfos size: " + jsonObjectC.toString().getBytes().length);
        v6b.a("==Raw allInfos== " + jsonObjectC.toString());
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            strEncode = URLEncoder.encode(jsonObjectC.toString(), "UTF-8");
            v6b.a("URLEncoded allInfos size: " + strEncode.getBytes().length);
        } catch (Exception e2) {
            v6b.b(e2.toString());
            strEncode = null;
        }
        v6b.a("Encode time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return strEncode;
    }
}
