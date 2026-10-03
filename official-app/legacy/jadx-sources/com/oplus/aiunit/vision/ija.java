package com.oplus.aiunit.vision;

import androidx.annotation.UiThread;
import com.oplus.web.container.comunication.jsapi.JsApiRegister;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ija {
    public final or9 a;
    public final Map<String, zu6> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f60 f12563c;

    public ija(or9 or9Var) {
        this.a = or9Var;
        this.f12563c = new f60(or9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(zu6 zu6Var, String str, lr9 lr9Var) {
        zu6Var.a().execute(this.a, str != null ? kja.e(str) : new kja(), lr9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(zu6 zu6Var, JSONObject jSONObject, lr9 lr9Var) {
        zu6Var.a().execute(this.a, jSONObject != null ? new kja(jSONObject) : new kja(), lr9Var);
    }

    @UiThread
    public void c(String str, final String str2, final lr9 lr9Var) {
        if (this.a.getActivity() != null) {
            final zu6 zu6VarD = d(str);
            mwj.d(zu6VarD.b(), new Runnable() { // from class: com.oplus.aiunit.vision.fja
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(zu6VarD, str2, lr9Var);
                }
            });
        }
    }

    public final zu6 d(String str) {
        if (str == null) {
            str = "";
        }
        zu6 zu6VarA = this.b.get(str);
        if (zu6VarA == null) {
            zu6VarA = this.f12563c.a(str);
            if (zu6VarA == null) {
                zu6VarA = g(str);
            }
            if (zu6VarA == null) {
                zu6VarA = new zu6(new cjk(), true);
            }
            this.b.put(str, zu6VarA);
        }
        return zu6VarA;
    }

    public final zu6 g(String str) {
        Class<? extends mr9> jsApiExecutor = JsApiRegister.getInstance().getJsApiExecutor(str);
        if (jsApiExecutor == null) {
            return null;
        }
        eja ejaVar = (eja) jsApiExecutor.getAnnotation(eja.class);
        try {
            return new zu6(jsApiExecutor.newInstance(), ejaVar != null ? ejaVar.uiThread() : true);
        } catch (IllegalAccessException | InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void h(String str, final JSONObject jSONObject, final lr9 lr9Var) {
        final zu6 zu6VarD = d(str);
        mwj.g(zu6VarD.b(), new Runnable() { // from class: com.oplus.aiunit.vision.gja
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f(zu6VarD, jSONObject, lr9Var);
            }
        });
    }
}
