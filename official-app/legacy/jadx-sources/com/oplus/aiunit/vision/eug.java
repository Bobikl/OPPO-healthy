package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public abstract class eug extends e05 {
    protected static final boolean CACHE_UNKNOWN_MAPPINGS = false;
    public static final yla<Object> DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    protected static final yla<Object> DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
    protected transient ContextAttributes _attributes;
    protected final SerializationConfig _config;
    protected DateFormat _dateFormat;
    protected yla<Object> _keySerializer;
    protected final wbf _knownSerializers;
    protected yla<Object> _nullKeySerializer;
    protected yla<Object> _nullValueSerializer;
    protected final Class<?> _serializationView;
    protected final cug _serializerCache;
    protected final dug _serializerFactory;
    protected final boolean _stdNullValueSerializer;
    protected yla<Object> _unknownTypeSerializer;

    public eug() {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializerFactory = null;
        this._serializerCache = new cug();
        this._knownSerializers = null;
        this._serializationView = null;
        this._attributes = null;
        this._stdNullValueSerializer = true;
    }

    public yla<Object> _createAndCacheUntypedSerializer(Class<?> cls) throws JsonMappingException {
        yla<Object> ylaVar_createUntypedSerializer;
        JavaType javaTypeConstructType = this._config.constructType(cls);
        try {
            ylaVar_createUntypedSerializer = _createUntypedSerializer(javaTypeConstructType);
        } catch (IllegalArgumentException e2) {
            reportBadDefinition(javaTypeConstructType, nc3.o(e2));
            ylaVar_createUntypedSerializer = null;
        }
        if (ylaVar_createUntypedSerializer != null) {
            this._serializerCache.c(cls, javaTypeConstructType, ylaVar_createUntypedSerializer, this);
        }
        return ylaVar_createUntypedSerializer;
    }

    public yla<Object> _createUntypedSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createSerializer(this, javaType);
    }

    public final DateFormat _dateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public yla<Object> _findExplicitUntypedSerializer(Class<?> cls) throws JsonMappingException {
        yla<Object> ylaVarF = this._knownSerializers.f(cls);
        if (ylaVarF == null && (ylaVarF = this._serializerCache.l(cls)) == null) {
            ylaVarF = _createAndCacheUntypedSerializer(cls);
        }
        if (isUnknownTypeSerializer(ylaVarF)) {
            return null;
        }
        return ylaVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yla<Object> _handleContextualResolvable(yla<?> ylaVar, BeanProperty beanProperty) throws JsonMappingException {
        if (ylaVar instanceof rsf) {
            ((rsf) ylaVar).resolve(this);
        }
        return handleSecondaryContextualization(ylaVar, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yla<Object> _handleResolvable(yla<?> ylaVar) throws JsonMappingException {
        if (ylaVar instanceof rsf) {
            ((rsf) ylaVar).resolve(this);
        }
        return ylaVar;
    }

    public void _reportIncompatibleRootType(Object obj, JavaType javaType) throws IOException {
        if (javaType.isPrimitive() && nc3.o0(javaType.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(javaType, String.format("Incompatible types: declared root type (%s) vs %s", javaType, nc3.h(obj)));
    }

    public j1k bufferForValueConversion(yad yadVar) {
        return new j1k(yadVar, false);
    }

    @Override // com.oplus.aiunit.vision.e05
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    @Override // com.oplus.aiunit.vision.e05
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().constructSpecializedType(javaType, cls, true);
    }

    public void defaultSerializeDateKey(long j2, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.S(String.valueOf(j2));
        } else {
            jsonGenerator.S(_dateFormat().format(new Date(j2)));
        }
    }

    public final void defaultSerializeDateValue(long j2, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.X(j2);
        } else {
            jsonGenerator.t0(_dateFormat().format(new Date(j2)));
        }
    }

    public final void defaultSerializeField(String str, Object obj, JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.S(str);
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.T();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeNull(JsonGenerator jsonGenerator) throws IOException {
        if (this._stdNullValueSerializer) {
            jsonGenerator.T();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public final void defaultSerializeValue(Object obj, JsonGenerator jsonGenerator) throws IOException {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(obj, jsonGenerator, this);
        } else if (this._stdNullValueSerializer) {
            jsonGenerator.T();
        } else {
            this._nullValueSerializer.serialize(null, jsonGenerator, this);
        }
    }

    public yla<Object> findContentValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarE = this._knownSerializers.e(javaType);
        return (ylaVarE == null && (ylaVarE = this._serializerCache.k(javaType)) == null && (ylaVarE = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handleSecondaryContextualization(ylaVarE, beanProperty);
    }

    public yla<Object> findKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return _handleContextualResolvable(this._serializerFactory.createKeySerializer(this, javaType, this._keySerializer), beanProperty);
    }

    public yla<Object> findNullKeySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return this._nullKeySerializer;
    }

    public yla<Object> findNullValueSerializer(BeanProperty beanProperty) throws JsonMappingException {
        return this._nullValueSerializer;
    }

    public abstract n4m findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public yla<Object> findPrimaryPropertySerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarE = this._knownSerializers.e(javaType);
        return (ylaVarE == null && (ylaVarE = this._serializerCache.k(javaType)) == null && (ylaVarE = _createAndCacheUntypedSerializer(javaType)) == null) ? getUnknownTypeSerializer(javaType.getRawClass()) : handlePrimaryContextualization(ylaVarE, beanProperty);
    }

    public wdk findTypeSerializer(JavaType javaType) throws JsonMappingException {
        return this._serializerFactory.createTypeSerializer(this._config, javaType);
    }

    public yla<Object> findTypedValueSerializer(Class<?> cls, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarD = this._knownSerializers.d(cls);
        if (ylaVarD != null) {
            return ylaVarD;
        }
        yla<Object> ylaVarJ = this._serializerCache.j(cls);
        if (ylaVarJ != null) {
            return ylaVarJ;
        }
        yla<Object> ylaVarFindValueSerializer = findValueSerializer(cls, beanProperty);
        dug dugVar = this._serializerFactory;
        SerializationConfig serializationConfig = this._config;
        wdk wdkVarCreateTypeSerializer = dugVar.createTypeSerializer(serializationConfig, serializationConfig.constructType(cls));
        if (wdkVarCreateTypeSerializer != null) {
            ylaVarFindValueSerializer = new zdk(wdkVarCreateTypeSerializer.a(beanProperty), ylaVarFindValueSerializer);
        }
        if (z) {
            this._serializerCache.e(cls, ylaVarFindValueSerializer);
        }
        return ylaVarFindValueSerializer;
    }

    public yla<Object> findValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarF = this._knownSerializers.f(cls);
        return (ylaVarF == null && (ylaVarF = this._serializerCache.l(cls)) == null && (ylaVarF = this._serializerCache.k(this._config.constructType(cls))) == null && (ylaVarF = _createAndCacheUntypedSerializer(cls)) == null) ? getUnknownTypeSerializer(cls) : handleSecondaryContextualization(ylaVarF, beanProperty);
    }

    @Override // com.oplus.aiunit.vision.e05
    public final Class<?> getActiveView() {
        return this._serializationView;
    }

    @Override // com.oplus.aiunit.vision.e05
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    @Override // com.oplus.aiunit.vision.e05
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public yla<Object> getDefaultNullKeySerializer() {
        return this._nullKeySerializer;
    }

    public yla<Object> getDefaultNullValueSerializer() {
        return this._nullValueSerializer;
    }

    @Override // com.oplus.aiunit.vision.e05
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        return this._config.getDefaultPropertyInclusion(cls);
    }

    public final ee7 getFilterProvider() {
        return this._config.getFilterProvider();
    }

    public JsonGenerator getGenerator() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.e05
    public Locale getLocale() {
        return this._config.getLocale();
    }

    @Override // com.oplus.aiunit.vision.e05
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.oplus.aiunit.vision.e05
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public yla<Object> getUnknownTypeSerializer(Class<?> cls) {
        return cls == Object.class ? this._unknownTypeSerializer : new UnknownSerializer(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yla<?> handlePrimaryContextualization(yla<?> ylaVar, BeanProperty beanProperty) throws JsonMappingException {
        return (ylaVar == 0 || !(ylaVar instanceof h94)) ? ylaVar : ((h94) ylaVar).createContextual(this, beanProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yla<?> handleSecondaryContextualization(yla<?> ylaVar, BeanProperty beanProperty) throws JsonMappingException {
        return (ylaVar == 0 || !(ylaVar instanceof h94)) ? ylaVar : ((h94) ylaVar).createContextual(this, beanProperty);
    }

    public final boolean hasSerializationFeatures(int i) {
        return this._config.hasSerializationFeatures(i);
    }

    public abstract Object includeFilterInstance(rc1 rc1Var, Class<?> cls) throws JsonMappingException;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException;

    @Override // com.oplus.aiunit.vision.e05
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(null, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, nc3.G(javaType)), str2), javaType, str);
    }

    @Override // com.oplus.aiunit.vision.e05
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isUnknownTypeSerializer(yla<?> ylaVar) {
        if (ylaVar == this._unknownTypeSerializer || ylaVar == null) {
            return true;
        }
        return isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && ylaVar.getClass() == UnknownSerializer.class;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr));
    }

    @Override // com.oplus.aiunit.vision.e05
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType);
    }

    public <T> T reportBadPropertyDefinition(oc1 oc1Var, rc1 rc1Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid definition for property %s (of type %s): %s", rc1Var != null ? _quotedString(rc1Var.getName()) : "N/A", oc1Var != null ? nc3.X(oc1Var.r()) : "N/A", _format(str, objArr)), oc1Var, rc1Var);
    }

    public <T> T reportBadTypeDefinition(oc1 oc1Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), String.format("Invalid type definition for type %s: %s", oc1Var != null ? nc3.X(oc1Var.r()) : "N/A", _format(str, objArr)), oc1Var, (rc1) null);
    }

    public void reportMappingProblem(String str, Object... objArr) throws JsonMappingException {
        throw mappingException(str, objArr);
    }

    public abstract yla<Object> serializerInstance(a60 a60Var, Object obj) throws JsonMappingException;

    public void setDefaultKeySerializer(yla<Object> ylaVar) {
        if (ylaVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._keySerializer = ylaVar;
    }

    public void setNullKeySerializer(yla<Object> ylaVar) {
        if (ylaVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullKeySerializer = ylaVar;
    }

    public void setNullValueSerializer(yla<Object> ylaVar) {
        if (ylaVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this._nullValueSerializer = ylaVar;
    }

    public final j1k bufferForValueConversion() {
        return bufferForValueConversion(null);
    }

    @Override // com.oplus.aiunit.vision.e05
    public final SerializationConfig getConfig() {
        return this._config;
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    @Deprecated
    public JsonMappingException mappingException(Throwable th, String str, Object... objArr) {
        return JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    public <T> T reportBadDefinition(JavaType javaType, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, javaType).withCause(th);
    }

    public void reportMappingProblem(Throwable th, String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getGenerator(), _format(str, objArr), th);
    }

    @Override // com.oplus.aiunit.vision.e05
    public eug setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public yla<Object> findKeySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        return findKeySerializer(this._config.constructType(cls), beanProperty);
    }

    public void defaultSerializeDateKey(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            jsonGenerator.S(String.valueOf(date.getTime()));
        } else {
            jsonGenerator.S(_dateFormat().format(date));
        }
    }

    public final void defaultSerializeDateValue(Date date, JsonGenerator jsonGenerator) throws IOException {
        if (isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)) {
            jsonGenerator.X(date.getTime());
        } else {
            jsonGenerator.t0(_dateFormat().format(date));
        }
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th) throws JsonMappingException {
        throw InvalidDefinitionException.from(getGenerator(), str, constructType(cls)).withCause(th);
    }

    public yla<Object> _createAndCacheUntypedSerializer(JavaType javaType) throws JsonMappingException {
        yla<Object> ylaVar_createUntypedSerializer;
        try {
            ylaVar_createUntypedSerializer = _createUntypedSerializer(javaType);
        } catch (IllegalArgumentException e2) {
            reportMappingProblem(e2, nc3.o(e2), new Object[0]);
            ylaVar_createUntypedSerializer = null;
        }
        if (ylaVar_createUntypedSerializer != null) {
            this._serializerCache.b(javaType, ylaVar_createUntypedSerializer, this);
        }
        return ylaVar_createUntypedSerializer;
    }

    public yla<Object> findContentValueSerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarF = this._knownSerializers.f(cls);
        if (ylaVarF == null && (ylaVarF = this._serializerCache.l(cls)) == null && (ylaVarF = this._serializerCache.k(this._config.constructType(cls))) == null && (ylaVarF = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handleSecondaryContextualization(ylaVarF, beanProperty);
    }

    public yla<Object> findPrimaryPropertySerializer(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarF = this._knownSerializers.f(cls);
        if (ylaVarF == null && (ylaVarF = this._serializerCache.l(cls)) == null && (ylaVarF = this._serializerCache.k(this._config.constructType(cls))) == null && (ylaVarF = _createAndCacheUntypedSerializer(cls)) == null) {
            return getUnknownTypeSerializer(cls);
        }
        return handlePrimaryContextualization(ylaVarF, beanProperty);
    }

    public yla<Object> findValueSerializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        yla<Object> ylaVarE = this._knownSerializers.e(javaType);
        if (ylaVarE == null && (ylaVarE = this._serializerCache.k(javaType)) == null && (ylaVarE = _createAndCacheUntypedSerializer(javaType)) == null) {
            return getUnknownTypeSerializer(javaType.getRawClass());
        }
        return handleSecondaryContextualization(ylaVarE, beanProperty);
    }

    public yla<Object> findTypedValueSerializer(JavaType javaType, boolean z, BeanProperty beanProperty) throws JsonMappingException {
        yla<Object> ylaVarC = this._knownSerializers.c(javaType);
        if (ylaVarC != null) {
            return ylaVarC;
        }
        yla<Object> ylaVarI = this._serializerCache.i(javaType);
        if (ylaVarI != null) {
            return ylaVarI;
        }
        yla<Object> ylaVarFindValueSerializer = findValueSerializer(javaType, beanProperty);
        wdk wdkVarCreateTypeSerializer = this._serializerFactory.createTypeSerializer(this._config, javaType);
        if (wdkVarCreateTypeSerializer != null) {
            ylaVarFindValueSerializer = new zdk(wdkVarCreateTypeSerializer.a(beanProperty), ylaVarFindValueSerializer);
        }
        if (z) {
            this._serializerCache.d(javaType, ylaVarFindValueSerializer);
        }
        return ylaVarFindValueSerializer;
    }

    public eug(eug eugVar, SerializationConfig serializationConfig, dug dugVar) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        yla<Object> ylaVar = DEFAULT_NULL_KEY_SERIALIZER;
        this._nullKeySerializer = ylaVar;
        this._serializerFactory = dugVar;
        this._config = serializationConfig;
        cug cugVar = eugVar._serializerCache;
        this._serializerCache = cugVar;
        this._unknownTypeSerializer = eugVar._unknownTypeSerializer;
        this._keySerializer = eugVar._keySerializer;
        yla<Object> ylaVar2 = eugVar._nullValueSerializer;
        this._nullValueSerializer = ylaVar2;
        this._nullKeySerializer = eugVar._nullKeySerializer;
        this._stdNullValueSerializer = ylaVar2 == ylaVar;
        this._serializationView = serializationConfig.getActiveView();
        this._attributes = serializationConfig.getAttributes();
        this._knownSerializers = cugVar.g();
    }

    public yla<Object> findValueSerializer(Class<?> cls) throws JsonMappingException {
        yla<Object> ylaVarF = this._knownSerializers.f(cls);
        if (ylaVarF != null) {
            return ylaVarF;
        }
        yla<Object> ylaVarL = this._serializerCache.l(cls);
        if (ylaVarL != null) {
            return ylaVarL;
        }
        yla<Object> ylaVarK = this._serializerCache.k(this._config.constructType(cls));
        if (ylaVarK != null) {
            return ylaVarK;
        }
        yla<Object> ylaVar_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(cls);
        return ylaVar_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(cls) : ylaVar_createAndCacheUntypedSerializer;
    }

    public yla<Object> findValueSerializer(JavaType javaType) throws JsonMappingException {
        yla<Object> ylaVarE = this._knownSerializers.e(javaType);
        if (ylaVarE != null) {
            return ylaVarE;
        }
        yla<Object> ylaVarK = this._serializerCache.k(javaType);
        if (ylaVarK != null) {
            return ylaVarK;
        }
        yla<Object> ylaVar_createAndCacheUntypedSerializer = _createAndCacheUntypedSerializer(javaType);
        return ylaVar_createAndCacheUntypedSerializer == null ? getUnknownTypeSerializer(javaType.getRawClass()) : ylaVar_createAndCacheUntypedSerializer;
    }

    public eug(eug eugVar) {
        this._unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
        this._nullValueSerializer = NullSerializer.instance;
        this._nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
        this._config = null;
        this._serializationView = null;
        this._serializerFactory = null;
        this._knownSerializers = null;
        this._serializerCache = new cug();
        this._unknownTypeSerializer = eugVar._unknownTypeSerializer;
        this._keySerializer = eugVar._keySerializer;
        this._nullValueSerializer = eugVar._nullValueSerializer;
        this._nullKeySerializer = eugVar._nullKeySerializer;
        this._stdNullValueSerializer = eugVar._stdNullValueSerializer;
    }
}
