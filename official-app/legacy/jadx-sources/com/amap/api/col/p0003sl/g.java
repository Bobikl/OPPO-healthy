package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.AMapException;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.xsm;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g<T, V> {
    public T a;
    public int b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f732c;

    public g(Context context, T t) {
        d(context, t);
    }

    public abstract V a(JSONObject jSONObject) throws AMapException;

    public abstract String b();

    public abstract JSONObject c(e0.c cVar);

    public final void d(Context context, T t) {
        this.f732c = context;
        this.a = t;
    }

    public abstract Map<String, String> e();

    public final V f() throws AMapException {
        if (this.a != null) {
            return g();
        }
        return null;
    }

    public final V g() throws AMapException {
        int i = 0;
        V vA = null;
        e0.c cVarC = null;
        while (i < this.b) {
            try {
                cVarC = e0.c(this.f732c, xsm.t(), b(), e());
                vA = a(c(cVarC));
                i = this.b;
            } catch (Throwable th) {
                c2n.r(th, "AbstractProtocalHandler", "getDataMayThrow AMapException");
                th.printStackTrace();
                i++;
                if (i < this.b) {
                    continue;
                } else {
                    if (cVarC != null && cVarC.f688c != null) {
                        throw new AMapException(cVarC.f688c);
                    }
                    vA = null;
                }
            }
        }
        return vA;
    }
}
