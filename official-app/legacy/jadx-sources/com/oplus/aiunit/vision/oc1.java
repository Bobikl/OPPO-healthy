package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public abstract class oc1 {
    public final JavaType a;

    public oc1(JavaType javaType) {
        this.a = javaType;
    }

    public JavaType A() {
        return this.a;
    }

    public abstract boolean B();

    public abstract Object C(boolean z);

    public boolean D() {
        return t().m();
    }

    public abstract AnnotatedMember a();

    public abstract AnnotatedMember b();

    public abstract List<rc1> c();

    public abstract AnnotatedConstructor d();

    public abstract Class<?>[] e();

    public abstract ka4<Object, Object> f();

    public abstract JsonFormat.Value g(JsonFormat.Value value);

    public abstract Map<Object, AnnotatedMember> h();

    public abstract AnnotatedMember i();

    public abstract AnnotatedMember j();

    @Deprecated
    public abstract AnnotatedMethod k();

    public abstract AnnotatedMethod l(String str, Class<?>[] clsArr);

    public abstract Class<?> m();

    public abstract jla.a n();

    public abstract List<rc1> o();

    public abstract JsonInclude.Value p(JsonInclude.Value value);

    public abstract ka4<Object, Object> q();

    public Class<?> r() {
        return this.a.getRawClass();
    }

    public abstract j60 s();

    public abstract com.fasterxml.jackson.databind.introspect.a t();

    public abstract List<AnnotatedConstructor> u();

    public abstract List<b60<AnnotatedConstructor, JsonCreator.Mode>> v();

    public abstract List<AnnotatedMethod> w();

    public abstract List<b60<AnnotatedMethod, JsonCreator.Mode>> x();

    public abstract Set<String> y();

    public abstract cbd z();
}
