package com.oplus.aiunit.vision;

import androidx.annotation.UiThread;
import com.oplus.web.container.comunication.jsapi.JsApiRegister;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class qka {
    public final us9 a;
    public final Map<String, aw6> b = new HashMap();
    public final p60 c;

    public qka(us9 us9Var) {
        this.a = us9Var;
        this.c = new p60(us9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(aw6 aw6Var, String str, rs9 rs9Var) {
        aw6Var.a().execute(this.a, str != null ? ska.e(str) : new ska(), rs9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(aw6 aw6Var, JSONObject jSONObject, rs9 rs9Var) {
        aw6Var.a().execute(this.a, jSONObject != null ? new ska(jSONObject) : new ska(), rs9Var);
    }

    @UiThread
    public void c(String str, final String str2, final rs9 rs9Var) {
        if (this.a.getActivity() != null) {
            final aw6 aw6VarD = d(str);
            o0k.d(aw6VarD.b(), new Runnable() { // from class: com.oplus.aiunit.vision.nka
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.e(aw6VarD, str2, rs9Var);
                }
            });
        }
    }

    public final aw6 d(String str) {
        if (str == null) {
            str = "";
        }
        aw6 aw6VarA = this.b.get(str);
        if (aw6VarA == null) {
            aw6VarA = this.c.a(str);
            if (aw6VarA == null) {
                aw6VarA = g(str);
            }
            if (aw6VarA == null) {
                aw6VarA = new aw6(new enk(), true);
            }
            this.b.put(str, aw6VarA);
        }
        return aw6VarA;
    }

    public final aw6 g(String str) {
        Class<? extends ss9> jsApiExecutor = JsApiRegister.getInstance().getJsApiExecutor(str);
        if (jsApiExecutor == null) {
            return null;
        }
        mka mkaVar = (mka) jsApiExecutor.getAnnotation(mka.class);
        try {
            return new aw6(jsApiExecutor.newInstance(), mkaVar != null ? mkaVar.uiThread() : true);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void h(String str, final JSONObject jSONObject, final rs9 rs9Var) {
        final aw6 aw6VarD = d(str);
        o0k.g(aw6VarD.b(), new Runnable() { // from class: com.oplus.aiunit.vision.oka
            @Override // java.lang.Runnable
            public final void run() {
                this.i.f(aw6VarD, jSONObject, rs9Var);
            }
        });
    }
}
