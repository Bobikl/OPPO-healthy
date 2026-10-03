package com.oplus.aiunit.vision;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes18.dex */
public class z0f extends ma4.a {
    public static z0f a() {
        return new z0f();
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    public ma4<?, gqf> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, evf evfVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (Message.class.isAssignableFrom(cls)) {
            return new g1f(ProtoAdapter.get(cls));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    public ma4<cuf, ?> responseBodyConverter(Type type, Annotation[] annotationArr, evf evfVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (Message.class.isAssignableFrom(cls)) {
            return new h1f(ProtoAdapter.get(cls));
        }
        return null;
    }
}
