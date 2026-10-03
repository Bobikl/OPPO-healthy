package com.heytap.nearx.protobuff.wire;

import com.oplus.aiunit.vision.f1f;
import com.oplus.aiunit.vision.uyl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public final class c<E extends uyl> extends ProtoAdapter<E> {
    public final Class<E> a;
    public Method b;

    public c(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
        this.a = cls;
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public E decode(f1f f1fVar) throws IOException {
        int iL = f1fVar.l();
        try {
            E e2 = (E) d().invoke(null, Integer.valueOf(iL));
            if (e2 != null) {
                return e2;
            }
            throw new ProtoAdapter.EnumConstantNotFoundException(iL, this.a);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void encode(b bVar, E e2) throws IOException {
        bVar.q(e2.getValue());
    }

    @Override // com.heytap.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int encodedSize(E e2) {
        return b.i(e2.getValue());
    }

    public final Method d() {
        Method method = this.b;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.a.getMethod("fromValue", Integer.TYPE);
            this.b = method2;
            return method2;
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).a == this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
