package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.oplus.aiunit.vision.b60;
import com.oplus.aiunit.vision.lka;
import com.oplus.aiunit.vision.nc3;
import com.oplus.aiunit.vision.oc1;
import com.oplus.aiunit.vision.yna;
import com.oplus.aiunit.vision.zna;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes13.dex */
public class StdKeyDeserializers implements zna, Serializable {
    private static final long serialVersionUID = 1;

    private static yna _constructCreatorKeyDeserializer(DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember instanceof AnnotatedConstructor) {
            Constructor<?> annotated = ((AnnotatedConstructor) annotatedMember).getAnnotated();
            if (deserializationConfig.canOverrideAccessModifiers()) {
                nc3.g(annotated, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(annotated);
        }
        Method annotated2 = ((AnnotatedMethod) annotatedMember).getAnnotated();
        if (deserializationConfig.canOverrideAccessModifiers()) {
            nc3.g(annotated2, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(annotated2);
    }

    private static AnnotatedMethod _findExplicitStringFactoryMethod(List<b60<AnnotatedMethod, JsonCreator.Mode>> list) throws JsonMappingException {
        AnnotatedMethod annotatedMethod = null;
        for (b60<AnnotatedMethod, JsonCreator.Mode> b60Var : list) {
            if (b60Var.b != null) {
                if (annotatedMethod != null) {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + nc3.X(((AnnotatedMethod) b60Var.a).getDeclaringClass()));
                }
                annotatedMethod = (AnnotatedMethod) b60Var.a;
            }
        }
        return annotatedMethod;
    }

    private static b60<AnnotatedConstructor, JsonCreator.Mode> _findStringConstructor(oc1 oc1Var) {
        for (b60<AnnotatedConstructor, JsonCreator.Mode> b60Var : oc1Var.v()) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) b60Var.a;
            if (annotatedConstructor.getParameterCount() == 1 && String.class == annotatedConstructor.getRawParameterType(0)) {
                return b60Var;
            }
        }
        return null;
    }

    public static yna constructDelegatingKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, lka<?> lkaVar) {
        return new StdKeyDeserializer.DelegatingKD(javaType.getRawClass(), lkaVar);
    }

    public static yna constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    public static yna findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        oc1 oc1VarIntrospectForCreation = deserializationConfig.introspectForCreation(javaType);
        b60<AnnotatedConstructor, JsonCreator.Mode> b60Var_findStringConstructor = _findStringConstructor(oc1VarIntrospectForCreation);
        if (b60Var_findStringConstructor != null && b60Var_findStringConstructor.b != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, (AnnotatedMember) b60Var_findStringConstructor.a);
        }
        List<b60<AnnotatedMethod, JsonCreator.Mode>> listX = oc1VarIntrospectForCreation.x();
        listX.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.roi
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return StdKeyDeserializers.lambda$findStringBasedKeyDeserializer$0((b60) obj);
            }
        });
        AnnotatedMethod annotatedMethod_findExplicitStringFactoryMethod = _findExplicitStringFactoryMethod(listX);
        if (annotatedMethod_findExplicitStringFactoryMethod != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, annotatedMethod_findExplicitStringFactoryMethod);
        }
        if (b60Var_findStringConstructor != null) {
            return _constructCreatorKeyDeserializer(deserializationConfig, (AnnotatedMember) b60Var_findStringConstructor.a);
        }
        if (listX.isEmpty()) {
            return null;
        }
        return _constructCreatorKeyDeserializer(deserializationConfig, (AnnotatedMember) listX.get(0).a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$findStringBasedKeyDeserializer$0(b60 b60Var) {
        return (((AnnotatedMethod) b60Var.a).getParameterCount() == 1 && ((AnnotatedMethod) b60Var.a).getRawParameterType(0) == String.class && b60Var.b != JsonCreator.Mode.PROPERTIES) ? false : true;
    }

    @Override // com.oplus.aiunit.vision.zna
    public yna findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, oc1 oc1Var) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = nc3.o0(rawClass);
        }
        return StdKeyDeserializer.forType(rawClass);
    }

    public static yna constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }
}
