package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.a;
import com.fasterxml.jackson.databind.introspect.f;
import com.fasterxml.jackson.databind.jsontype.DefaultBaseTypeLimitingValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.oplus.aiunit.vision.a60;
import com.oplus.aiunit.vision.e3j;
import com.oplus.aiunit.vision.nc3;
import com.oplus.aiunit.vision.oc1;
import com.oplus.aiunit.vision.odk;
import com.oplus.aiunit.vision.pt3;
import com.oplus.aiunit.vision.udk;
import com.oplus.aiunit.vision.vdk;
import com.oplus.aiunit.vision.wtg;
import com.oplus.aiunit.vision.yt3;
import com.oplus.aiunit.vision.zg8;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements f.a, Serializable {
    private static final long serialVersionUID = 2;
    protected final BaseSettings _base;
    protected final long _mapperFeatures;
    protected static final JsonInclude.Value EMPTY_INCLUDE = JsonInclude.Value.empty();
    protected static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();

    public MapperConfig(BaseSettings baseSettings, long j2) {
        this._base = baseSettings;
        this._mapperFeatures = j2;
    }

    public static <F extends Enum<F> & pt3> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            pt3 pt3Var = (pt3) obj;
            if (pt3Var.enabledByDefault()) {
                mask |= pt3Var.getMask();
            }
        }
        return mask;
    }

    public final boolean canOverrideAccessModifiers() {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public wtg compileString(String str) {
        return new SerializedString(str);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        return getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public final JavaType constructType(Class<?> cls) {
        return getTypeFactory().constructType(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.f.a
    public abstract /* synthetic */ f.a copy();

    public abstract yt3 findConfigOverride(Class<?> cls);

    @Override // com.fasterxml.jackson.databind.introspect.f.a
    public abstract /* synthetic */ Class findMixInClassFor(Class cls);

    public abstract PropertyName findRootName(JavaType javaType);

    public abstract PropertyName findRootName(Class<?> cls);

    public final AccessorNamingStrategy.Provider getAccessorNaming() {
        return this._base.getAccessorNaming();
    }

    public abstract Class<?> getActiveView();

    public AnnotationIntrospector getAnnotationIntrospector() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS) ? this._base.getAnnotationIntrospector() : NopAnnotationIntrospector.instance;
    }

    public abstract ContextAttributes getAttributes();

    public Base64Variant getBase64Variant() {
        return this._base.getBase64Variant();
    }

    public f getClassIntrospector() {
        return this._base.getClassIntrospector();
    }

    public abstract yt3 getConfigOverride(Class<?> cls);

    public final DateFormat getDateFormat() {
        return this._base.getDateFormat();
    }

    public abstract JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2);

    public JsonInclude.Value getDefaultInclusion(Class<?> cls, Class<?> cls2, JsonInclude.Value value) {
        return JsonInclude.Value.mergeAll(value, getConfigOverride(cls).getInclude(), getConfigOverride(cls2).getIncludeAsProperty());
    }

    public abstract Boolean getDefaultMergeable();

    public abstract Boolean getDefaultMergeable(Class<?> cls);

    public abstract JsonFormat.Value getDefaultPropertyFormat(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls);

    public abstract JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class<?> cls, a aVar);

    public abstract JsonInclude.Value getDefaultPropertyInclusion();

    public abstract JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls);

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include = getConfigOverride(cls).getInclude();
        return include != null ? include : value;
    }

    public abstract JsonIncludeProperties.Value getDefaultPropertyInclusions(Class<?> cls, a aVar);

    public abstract JsonSetter.Value getDefaultSetterInfo();

    public final vdk<?> getDefaultTyper(JavaType javaType) {
        return this._base.getTypeResolverBuilder();
    }

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker();

    public abstract VisibilityChecker<?> getDefaultVisibilityChecker(Class<?> cls, a aVar);

    public final zg8 getHandlerInstantiator() {
        this._base.getHandlerInstantiator();
        return null;
    }

    public final Locale getLocale() {
        return this._base.getLocale();
    }

    public PolymorphicTypeValidator getPolymorphicTypeValidator() {
        PolymorphicTypeValidator polymorphicTypeValidator = this._base.getPolymorphicTypeValidator();
        return (polymorphicTypeValidator == LaissezFaireSubTypeValidator.instance && isEnabled(MapperFeature.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new DefaultBaseTypeLimitingValidator() : polymorphicTypeValidator;
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy() {
        return this._base.getPropertyNamingStrategy();
    }

    public abstract e3j getSubtypeResolver();

    public final TimeZone getTimeZone() {
        return this._base.getTimeZone();
    }

    public final TypeFactory getTypeFactory() {
        return this._base.getTypeFactory();
    }

    public boolean hasExplicitTimeZone() {
        return this._base.hasExplicitTimeZone();
    }

    @Deprecated
    public final boolean hasMapperFeatures(int i) {
        long j2 = this._mapperFeatures;
        long j3 = i;
        return (j2 & j3) == j3;
    }

    public oc1 introspectClassAnnotations(Class<?> cls) {
        return introspectClassAnnotations(constructType(cls));
    }

    public oc1 introspectDirectClassAnnotations(Class<?> cls) {
        return introspectDirectClassAnnotations(constructType(cls));
    }

    public final boolean isAnnotationProcessingEnabled() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this._mapperFeatures);
    }

    public final boolean shouldSortPropertiesAlphabetically() {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public odk typeIdResolverInstance(a60 a60Var, Class<? extends odk> cls) {
        getHandlerInstantiator();
        return (odk) nc3.l(cls, canOverrideAccessModifiers());
    }

    public vdk<?> typeResolverBuilderInstance(a60 a60Var, Class<? extends vdk<?>> cls) {
        getHandlerInstantiator();
        return (vdk) nc3.l(cls, canOverrideAccessModifiers());
    }

    public abstract boolean useRootWrapping();

    public abstract T with(MapperFeature mapperFeature, boolean z);

    public abstract T with(MapperFeature... mapperFeatureArr);

    public abstract T without(MapperFeature... mapperFeatureArr);

    public final JavaType constructType(udk<?> udkVar) {
        getTypeFactory();
        throw null;
    }

    public oc1 introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public final oc1 introspectDirectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forDirectClassAnnotations(this, javaType, this);
    }

    public MapperConfig(MapperConfig<T> mapperConfig, long j2) {
        this._base = mapperConfig._base;
        this._mapperFeatures = j2;
    }

    public MapperConfig(MapperConfig<T> mapperConfig, BaseSettings baseSettings) {
        this._base = baseSettings;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }

    public MapperConfig(MapperConfig<T> mapperConfig) {
        this._base = mapperConfig._base;
        this._mapperFeatures = mapperConfig._mapperFeatures;
    }
}
