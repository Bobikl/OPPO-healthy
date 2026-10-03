package com.oplus.nearx.protobuff.wire;

import com.oplus.aiunit.vision.e1f;
import com.oplus.aiunit.vision.tyl;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
final class RuntimeEnumAdapter<E extends tyl> extends ProtoAdapter<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<E> f19907e;
    public Method f;

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && ((RuntimeEnumAdapter) obj).f19907e == this.f19907e;
    }

    public int hashCode() {
        return this.f19907e.hashCode();
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public E e(e1f e1fVar) throws IOException {
        int iL = e1fVar.l();
        try {
            E e2 = (E) x().invoke(null, Integer.valueOf(iL));
            if (e2 != null) {
                return e2;
            }
            throw new ProtoAdapter.EnumConstantNotFoundException(iL, this.f19907e);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void h(b bVar, E e2) throws IOException {
        bVar.q(e2.getValue());
    }

    @Override // com.oplus.nearx.protobuff.wire.ProtoAdapter
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int m(E e2) {
        return b.i(e2.getValue());
    }

    public final Method x() {
        Method method = this.f;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.f19907e.getMethod("fromValue", Integer.TYPE);
            this.f = method2;
            return method2;
        } catch (NoSuchMethodException e2) {
            throw new AssertionError(e2);
        }
    }
}
