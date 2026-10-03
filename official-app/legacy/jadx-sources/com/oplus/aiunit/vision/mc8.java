package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes18.dex */
public final class mc8 extends ma4.a {
    public final Gson a;

    public mc8(Gson gson) {
        this.a = gson;
    }

    public static mc8 a() {
        return b(new Gson());
    }

    public static mc8 b(Gson gson) {
        if (gson != null) {
            return new mc8(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    public ma4<?, gqf> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, evf evfVar) {
        return new oc8(this.a, this.a.getAdapter(TypeToken.get(type)));
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    public ma4<cuf, ?> responseBodyConverter(Type type, Annotation[] annotationArr, evf evfVar) {
        return new qc8(this.a, this.a.getAdapter(TypeToken.get(type)));
    }
}
