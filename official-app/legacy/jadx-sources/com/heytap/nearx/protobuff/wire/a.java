package com.heytap.nearx.protobuff.wire;

import com.heytap.nearx.protobuff.wire.Message;
import com.heytap.nearx.protobuff.wire.Message.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class a<M extends Message<M, B>, B extends Message.a<M, B>> {
    public final WireField.Label a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7412c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7413e;
    public final boolean f;
    public final Field g;
    public final Field h;
    public final Method i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ProtoAdapter<?> f7414j;
    public ProtoAdapter<?> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ProtoAdapter<Object> f7415l;

    public a(WireField wireField, Field field, Class<B> cls) {
        this.a = wireField.label();
        String name = field.getName();
        this.b = name;
        this.f7412c = wireField.tag();
        this.d = wireField.keyAdapter();
        this.f7413e = wireField.adapter();
        this.f = wireField.redacted();
        this.g = field;
        this.h = c(cls, name);
        this.i = d(cls, name, field.getType());
    }

    public static Field c(Class<?> cls, String str) {
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + "." + str);
        }
    }

    public static Method d(Class<?> cls, String str, Class<?> cls2) {
        try {
            return cls.getMethod(str, cls2);
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("No builder method " + cls.getName() + "." + str + "(" + cls2.getName() + ")");
        }
    }

    public ProtoAdapter<Object> a() {
        ProtoAdapter<Object> protoAdapter = this.f7415l;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapterNewMapAdapter = f() ? ProtoAdapter.newMapAdapter(g(), i()) : i().withLabel(this.a);
        this.f7415l = protoAdapterNewMapAdapter;
        return protoAdapterNewMapAdapter;
    }

    public Object b(M m) {
        try {
            return this.g.get(m);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object e(B b) {
        try {
            return this.h.get(b);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean f() {
        return !this.d.isEmpty();
    }

    public ProtoAdapter<?> g() {
        ProtoAdapter<?> protoAdapter = this.k;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.d);
        this.k = protoAdapter2;
        return protoAdapter2;
    }

    public void h(B b, Object obj) {
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

    public ProtoAdapter<?> i() {
        ProtoAdapter<?> protoAdapter = this.f7414j;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.f7413e);
        this.f7414j = protoAdapter2;
        return protoAdapter2;
    }

    public void j(B b, Object obj) {
        if (this.a.isRepeated()) {
            ((List) e(b)).add(obj);
        } else if (this.d.isEmpty()) {
            h(b, obj);
        } else {
            ((Map) e(b)).putAll((Map) obj);
        }
    }
}
