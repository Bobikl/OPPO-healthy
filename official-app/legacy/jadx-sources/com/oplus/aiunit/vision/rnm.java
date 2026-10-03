package com.oplus.aiunit.vision;

import android.content.Context;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes12.dex */
public class rnm {
    public static final rnm c_c = new rnm();
    public qnm[] a = null;
    public long b;

    public final JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        try {
            for (qnm qnmVar : this.a) {
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                qnmVar.a(jsonObject);
            }
        } catch (Exception e2) {
            gnm.a(e2.toString());
        }
        return jsonObject;
    }

    public synchronized JsonObject b(Context context) {
        JsonObject jsonObjectA;
        if (this.a == null || System.currentTimeMillis() - this.b > 20000) {
            this.b = System.currentTimeMillis();
            qnm[] qnmVarArr = {new nnm(), new snm(), new pnm()};
            this.a = qnmVarArr;
            for (int i = 0; i < 3; i++) {
                try {
                    qnm qnmVar = qnmVarArr[i];
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    System.currentTimeMillis();
                    qnmVar.b(context);
                    System.currentTimeMillis();
                } catch (Exception e2) {
                    gnm.a(e2.toString());
                }
            }
            jsonObjectA = a();
            for (qnm qnmVar2 : this.a) {
                try {
                    qnmVar2.getClass();
                } catch (Exception e3) {
                    gnm.a(e3.toString());
                }
            }
        } else {
            jsonObjectA = a();
        }
        jsonObjectA.toString();
        return jsonObjectA;
    }
}
