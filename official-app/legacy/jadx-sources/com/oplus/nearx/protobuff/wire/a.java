package com.oplus.nearx.protobuff.wire;

import com.oplus.nearx.protobuff.wire.Message;
import com.oplus.nearx.protobuff.wire.Message.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class a<M extends Message<M, B>, B extends Message.a<M, B>> {
    public final WireField$Label a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19909c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19910e;
    public final boolean f;
    public final Field g;
    public final Field h;
    public final Method i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProtoAdapter<?> f19911j;
    public ProtoAdapter<?> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProtoAdapter<Object> f19912l;

    public ProtoAdapter<Object> a() {
        ProtoAdapter<Object> protoAdapter = this.f19912l;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapterQ = d() ? ProtoAdapter.q(e(), g()) : g().t(this.a);
        this.f19912l = protoAdapterQ;
        return protoAdapterQ;
    }

    public Object b(M m) {
        try {
            return this.g.get(m);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object c(B b) {
        try {
            return this.h.get(b);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean d() {
        return !this.d.isEmpty();
    }

    public ProtoAdapter<?> e() {
        ProtoAdapter<?> protoAdapter = this.k;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapterP = ProtoAdapter.p(this.d);
        this.k = protoAdapterP;
        return protoAdapterP;
    }

    public void f(B b, Object obj) {
        try {
            if (this.a.isOneOf()) {
                this.i.invoke(b, obj);
            } else {
                this.h.set(b, obj);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    public ProtoAdapter<?> g() {
        ProtoAdapter<?> protoAdapter = this.f19911j;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapterP = ProtoAdapter.p(this.f19910e);
        this.f19911j = protoAdapterP;
        return protoAdapterP;
    }

    public void h(B b, Object obj) {
        if (this.a.isRepeated()) {
            ((List) c(b)).add(obj);
        } else if (this.d.isEmpty()) {
            f(b, obj);
        } else {
            ((Map) c(b)).putAll((Map) obj);
        }
    }
}
