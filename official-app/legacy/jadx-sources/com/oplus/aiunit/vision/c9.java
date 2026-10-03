package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class c9<T> implements ma4<cuf, T> {
    public Gson a;
    public Type b;

    public c9(Gson gson, Type type) {
        this.a = gson;
        this.b = type;
    }

    @Override // com.oplus.aiunit.vision.ma4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(cuf cufVar) throws IOException {
        try {
            return (T) this.a.fromJson(cufVar.s(), this.b);
        } catch (Exception e2) {
            mb.a("AcIntercept.RespBodyConverter", "convert Exception " + e2.getMessage());
            return null;
        } finally {
            cufVar.close();
        }
    }
}
