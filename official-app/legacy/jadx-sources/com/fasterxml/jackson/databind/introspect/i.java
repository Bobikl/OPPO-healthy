package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public interface i {

    public static class a implements i {
        public final TypeFactory i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TypeBindings f2285j;

        public a(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.i = typeFactory;
            this.f2285j = typeBindings;
        }

        @Override // com.fasterxml.jackson.databind.introspect.i
        public JavaType a(Type type) {
            return this.i.resolveMemberType(type, this.f2285j);
        }
    }

    JavaType a(Type type);
}
