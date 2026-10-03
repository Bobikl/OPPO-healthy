package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.oplus.aiunit.vision.a60;
import com.oplus.aiunit.vision.e05;
import com.oplus.aiunit.vision.eck;
import com.oplus.aiunit.vision.eia;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.f94;
import com.oplus.aiunit.vision.g94;
import com.oplus.aiunit.vision.j1k;
import com.oplus.aiunit.vision.j95;
import com.oplus.aiunit.vision.lka;
import com.oplus.aiunit.vision.mdk;
import com.oplus.aiunit.vision.nc3;
import com.oplus.aiunit.vision.oc1;
import com.oplus.aiunit.vision.odk;
import com.oplus.aiunit.vision.rc1;
import com.oplus.aiunit.vision.xad;
import com.oplus.aiunit.vision.xya;
import com.oplus.aiunit.vision.yg0;
import com.oplus.aiunit.vision.yna;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DeserializationContext extends e05 implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient yg0 _arrayBuilders;
    protected transient ContextAttributes _attributes;
    protected final DeserializerCache _cache;
    protected final DeserializationConfig _config;
    protected xya<JavaType> _currentType;
    protected transient DateFormat _dateFormat;
    protected final com.fasterxml.jackson.databind.deser.a _factory;
    protected final int _featureFlags;
    protected final InjectableValues _injectableValues;
    protected transient xad _objectBuffer;
    protected transient JsonParser _parser;
    protected final eia<StreamReadCapability> _readCapabilities;
    protected final Class<?> _view;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[JsonToken.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[JsonToken.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[JsonToken.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[JsonToken.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public DeserializationContext(com.fasterxml.jackson.databind.deser.a aVar) {
        this(aVar, (DeserializerCache) null);
    }

    private eck _treeAsTokens(ela elaVar) throws IOException {
        JsonParser jsonParser = this._parser;
        eck eckVar = new eck(elaVar, jsonParser == null ? null : jsonParser.w());
        eckVar.l0();
        return eckVar;
    }

    public DateFormat _getDateFormat() {
        DateFormat dateFormat = this._dateFormat;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this._config.getDateFormat().clone();
        this._dateFormat = dateFormat2;
        return dateFormat2;
    }

    public boolean _isCompatible(Class<?> cls, Object obj) {
        if (obj == null || cls.isInstance(obj)) {
            return true;
        }
        return cls.isPrimitive() && nc3.o0(cls).isInstance(obj);
    }

    public String _shapeForToken(JsonToken jsonToken) {
        if (jsonToken == null) {
            return "<end of input>";
        }
        switch (a.a[jsonToken.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    public j1k bufferAsCopyOfValue(JsonParser jsonParser) throws IOException {
        j1k j1kVarBufferForInputBuffering = bufferForInputBuffering(jsonParser);
        j1kVarBufferForInputBuffering.O0(jsonParser);
        return j1kVarBufferForInputBuffering;
    }

    public j1k bufferForInputBuffering(JsonParser jsonParser) {
        return new j1k(jsonParser, this);
    }

    @Override // com.oplus.aiunit.vision.e05
    public final boolean canOverrideAccessModifiers() {
        return this._config.canOverrideAccessModifiers();
    }

    public abstract void checkUnresolvedObjectId() throws UnresolvedForwardReference;

    public Calendar constructCalendar(Date date) {
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(date);
        return calendar;
    }

    @Override // com.oplus.aiunit.vision.e05
    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return javaType.hasRawClass(cls) ? javaType : getConfig().getTypeFactory().constructSpecializedType(javaType, cls, false);
    }

    public final JavaType constructType(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return this._config.constructType(cls);
    }

    public abstract lka<Object> deserializerInstance(a60 a60Var, Object obj) throws JsonMappingException;

    @Deprecated
    public JsonMappingException endOfInputException(Class<?> cls) {
        return MismatchedInputException.from(this._parser, cls, "Unexpected end-of-input when trying to deserialize a " + cls.getName());
    }

    public String extractScalarFromObject(JsonParser jsonParser, lka<?> lkaVar, Class<?> cls) throws IOException {
        return (String) handleUnexpectedToken(cls, jsonParser);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        return getTypeFactory().findClass(str);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._config.findCoercionAction(logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._config.findCoercionFromBlankString(logicalType, cls, coercionAction);
    }

    public final lka<Object> findContextualValueDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        lka<Object> lkaVarFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        return lkaVarFindValueDeserializer != null ? handleSecondaryContextualization(lkaVarFindValueDeserializer, beanProperty, javaType) : lkaVarFindValueDeserializer;
    }

    public final Object findInjectableValue(Object obj, BeanProperty beanProperty, Object obj2) throws JsonMappingException {
        InjectableValues injectableValues = this._injectableValues;
        return injectableValues == null ? reportBadDefinition(nc3.i(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj)) : injectableValues.findInjectableValue(obj, this, beanProperty, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yna findKeyDeserializer(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        yna ynaVarFindKeyDeserializer;
        try {
            ynaVarFindKeyDeserializer = this._cache.findKeyDeserializer(this, this._factory, javaType);
        } catch (IllegalArgumentException e2) {
            reportBadDefinition(javaType, nc3.o(e2));
            ynaVarFindKeyDeserializer = 0;
        }
        return ynaVarFindKeyDeserializer instanceof g94 ? ((g94) ynaVarFindKeyDeserializer).createContextual(this, beanProperty) : ynaVarFindKeyDeserializer;
    }

    public final lka<Object> findNonContextualValueDeserializer(JavaType javaType) throws JsonMappingException {
        return this._cache.findValueDeserializer(this, this._factory, javaType);
    }

    public abstract com.fasterxml.jackson.databind.deser.impl.a findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator, com.fasterxml.jackson.annotation.a aVar);

    public final lka<Object> findRootValueDeserializer(JavaType javaType) throws JsonMappingException {
        lka<Object> lkaVarFindValueDeserializer = this._cache.findValueDeserializer(this, this._factory, javaType);
        if (lkaVarFindValueDeserializer == null) {
            return null;
        }
        lka<?> lkaVarHandleSecondaryContextualization = handleSecondaryContextualization(lkaVarFindValueDeserializer, null, javaType);
        mdk mdkVarFindTypeDeserializer = this._factory.findTypeDeserializer(this._config, javaType);
        return mdkVarFindTypeDeserializer != null ? new TypeWrappedDeserializer(mdkVarFindTypeDeserializer.forProperty(null), lkaVarHandleSecondaryContextualization) : lkaVarHandleSecondaryContextualization;
    }

    @Override // com.oplus.aiunit.vision.e05
    public final Class<?> getActiveView() {
        return this._view;
    }

    @Override // com.oplus.aiunit.vision.e05
    public final AnnotationIntrospector getAnnotationIntrospector() {
        return this._config.getAnnotationIntrospector();
    }

    public final yg0 getArrayBuilders() {
        if (this._arrayBuilders == null) {
            this._arrayBuilders = new yg0();
        }
        return this._arrayBuilders;
    }

    @Override // com.oplus.aiunit.vision.e05
    public Object getAttribute(Object obj) {
        return this._attributes.getAttribute(obj);
    }

    public final Base64Variant getBase64Variant() {
        return this._config.getBase64Variant();
    }

    public JavaType getContextualType() {
        xya<JavaType> xyaVar = this._currentType;
        if (xyaVar == null) {
            return null;
        }
        return xyaVar.d();
    }

    @Deprecated
    public DateFormat getDateFormat() {
        return _getDateFormat();
    }

    @Override // com.oplus.aiunit.vision.e05
    public final JsonFormat.Value getDefaultPropertyFormat(Class<?> cls) {
        return this._config.getDefaultPropertyFormat(cls);
    }

    public final int getDeserializationFeatures() {
        return this._featureFlags;
    }

    public com.fasterxml.jackson.databind.deser.a getFactory() {
        return this._factory;
    }

    @Override // com.oplus.aiunit.vision.e05
    public Locale getLocale() {
        return this._config.getLocale();
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._config.getNodeFactory();
    }

    public final JsonParser getParser() {
        return this._parser;
    }

    @Override // com.oplus.aiunit.vision.e05
    public TimeZone getTimeZone() {
        return this._config.getTimeZone();
    }

    @Override // com.oplus.aiunit.vision.e05
    public final TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public void handleBadMerge(lka<?> lkaVar) throws JsonMappingException {
        if (isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType javaTypeConstructType = constructType(lkaVar.handledType());
        throw InvalidDefinitionException.from(getParser(), String.format("Invalid configuration: values of type %s cannot be merged", nc3.G(javaTypeConstructType)), javaTypeConstructType);
    }

    public Object handleInstantiationProblem(Class<?> cls, Object obj, Throwable th) throws IOException {
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objA = problemHandlers.d().a(this, cls, obj, th);
            if (objA != j95.NOT_HANDLED) {
                if (_isCompatible(cls, objA)) {
                    return objA;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", nc3.y(cls), nc3.h(objA)));
            }
        }
        nc3.i0(th);
        if (!isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            nc3.j0(th);
        }
        throw instantiationException(cls, th);
    }

    public Object handleMissingInstantiator(Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        if (jsonParser == null) {
            jsonParser = getParser();
        }
        String str_format = _format(str, objArr);
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objC = problemHandlers.d().c(this, cls, valueInstantiator, jsonParser, str_format);
            if (objC != j95.NOT_HANDLED) {
                if (_isCompatible(cls, objC)) {
                    return objC;
                }
                reportBadDefinition(constructType(cls), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", nc3.y(cls), nc3.y(objC)));
            }
        }
        if (valueInstantiator == null) {
            return reportBadDefinition(cls, String.format("Cannot construct instance of %s: %s", nc3.X(cls), str_format));
        }
        return !valueInstantiator.canInstantiate() ? reportBadDefinition(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", nc3.X(cls), str_format)) : reportInputMismatch(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", nc3.X(cls), str_format), new Object[0]);
    }

    public JavaType handleMissingTypeId(JavaType javaType, odk odkVar, String str) throws IOException {
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            JavaType javaTypeD = problemHandlers.d().d(this, javaType, odkVar, str);
            if (javaTypeD != null) {
                if (javaTypeD.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeD.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeD;
                }
                throw invalidTypeIdException(javaType, null, "problem handler tried to resolve into non-subtype: " + nc3.G(javaTypeD));
            }
        }
        throw missingTypeIdException(javaType, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lka<?> handlePrimaryContextualization(lka<?> lkaVar, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = lkaVar instanceof f94;
        lka<?> lkaVar2 = lkaVar;
        if (z) {
            this._currentType = new xya<>(javaType, this._currentType);
            try {
                lka<?> lkaVarCreateContextual = ((f94) lkaVar).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.c();
            }
        }
        return lkaVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lka<?> handleSecondaryContextualization(lka<?> lkaVar, BeanProperty beanProperty, JavaType javaType) throws JsonMappingException {
        boolean z = lkaVar instanceof f94;
        lka<?> lkaVar2 = lkaVar;
        if (z) {
            this._currentType = new xya<>(javaType, this._currentType);
            try {
                lka<?> lkaVarCreateContextual = ((f94) lkaVar).createContextual(this, beanProperty);
            } finally {
                this._currentType = this._currentType.c();
            }
        }
        return lkaVar2;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonParser.n(), jsonParser, (String) null, new Object[0]);
    }

    public boolean handleUnknownProperty(JsonParser jsonParser, lka<?> lkaVar, Object obj, String str) throws IOException {
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            if (problemHandlers.d().g(this, jsonParser, lkaVar, obj, str)) {
                return true;
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, lkaVar == null ? null : lkaVar.getKnownPropertyNames());
        }
        jsonParser.u0();
        return true;
    }

    public JavaType handleUnknownTypeId(JavaType javaType, String str, odk odkVar, String str2) throws IOException {
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            JavaType javaTypeH = problemHandlers.d().h(this, javaType, str, odkVar, str2);
            if (javaTypeH != null) {
                if (javaTypeH.hasRawClass(Void.class)) {
                    return null;
                }
                if (javaTypeH.isTypeOrSubTypeOf(javaType.getRawClass())) {
                    return javaTypeH;
                }
                throw invalidTypeIdException(javaType, str, "problem handler tried to resolve into non-subtype: " + nc3.G(javaTypeH));
            }
        }
        if (isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
            throw invalidTypeIdException(javaType, str, str2);
        }
        return null;
    }

    public Object handleWeirdKey(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objI = problemHandlers.d().i(this, cls, str, str_format);
            if (objI != j95.NOT_HANDLED) {
                if (objI == null || cls.isInstance(objI)) {
                    return objI;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", nc3.y(cls), nc3.y(objI)));
            }
        }
        throw weirdKeyException(cls, str, str_format);
    }

    public Object handleWeirdNativeValue(JavaType javaType, Object obj, JsonParser jsonParser) throws IOException {
        Class<?> rawClass = javaType.getRawClass();
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objJ = problemHandlers.d().j(this, javaType, obj, jsonParser);
            if (objJ != j95.NOT_HANDLED) {
                if (objJ == null || rawClass.isInstance(objJ)) {
                    return objJ;
                }
                throw JsonMappingException.from(jsonParser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", nc3.y(javaType), nc3.y(objJ)));
            }
        }
        throw weirdNativeValueException(obj, rawClass);
    }

    public Object handleWeirdNumberValue(Class<?> cls, Number number, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objK = problemHandlers.d().k(this, cls, number, str_format);
            if (objK != j95.NOT_HANDLED) {
                if (_isCompatible(cls, objK)) {
                    return objK;
                }
                throw weirdNumberException(number, cls, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", nc3.y(cls), nc3.y(objK)));
            }
        }
        throw weirdNumberException(number, cls, str_format);
    }

    public Object handleWeirdStringValue(Class<?> cls, String str, String str2, Object... objArr) throws IOException {
        String str_format = _format(str2, objArr);
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objL = problemHandlers.d().l(this, cls, str, str_format);
            if (objL != j95.NOT_HANDLED) {
                if (_isCompatible(cls, objL)) {
                    return objL;
                }
                throw weirdStringException(str, cls, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", nc3.y(cls), nc3.y(objL)));
            }
        }
        throw weirdStringException(str, cls, str_format);
    }

    public final boolean hasDeserializationFeatures(int i) {
        return (this._featureFlags & i) == i;
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (this._featureFlags & i) != 0;
    }

    public boolean hasValueDeserializerFor(JavaType javaType, AtomicReference<Throwable> atomicReference) {
        try {
            return this._cache.hasValueDeserializerFor(this, this._factory, javaType);
        } catch (DatabindException e2) {
            if (atomicReference == null) {
                return false;
            }
            atomicReference.set(e2);
            return false;
        } catch (RuntimeException e3) {
            if (atomicReference == null) {
                throw e3;
            }
            atomicReference.set(e3);
            return false;
        }
    }

    public JsonMappingException instantiationException(Class<?> cls, Throwable th) {
        String strO;
        if (th == null) {
            strO = "N/A";
        } else {
            strO = nc3.o(th);
            if (strO == null) {
                strO = nc3.X(th.getClass());
            }
        }
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s, problem: %s", nc3.X(cls), strO), constructType(cls), th);
    }

    @Override // com.oplus.aiunit.vision.e05
    public JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", str, nc3.G(javaType)), str2), javaType, str);
    }

    @Override // com.oplus.aiunit.vision.e05
    public final boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public abstract yna keyDeserializerInstance(a60 a60Var, Object obj) throws JsonMappingException;

    public final xad leaseObjectBuffer() {
        xad xadVar = this._objectBuffer;
        if (xadVar == null) {
            return new xad();
        }
        this._objectBuffer = null;
        return xadVar;
    }

    @Deprecated
    public JsonMappingException mappingException(String str) {
        return JsonMappingException.from(getParser(), str);
    }

    public JsonMappingException missingTypeIdException(JavaType javaType, String str) {
        return InvalidTypeIdException.from(this._parser, _colonConcat(String.format("Could not resolve subtype of %s", javaType), str), javaType, null);
    }

    public Date parseDate(String str) throws IllegalArgumentException {
        try {
            return _getDateFormat().parse(str);
        } catch (ParseException e2) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, nc3.o(e2)));
        }
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, Class<T> cls) throws IOException {
        return (T) readPropertyValue(jsonParser, beanProperty, getTypeFactory().constructType(cls));
    }

    public ela readTree(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenN = jsonParser.n();
        if (jsonTokenN == null && (jsonTokenN = jsonParser.l0()) == null) {
            return getNodeFactory().missingNode();
        }
        return jsonTokenN == JsonToken.VALUE_NULL ? getNodeFactory().m4554nullNode() : (ela) findRootValueDeserializer(this._config.constructType(ela.class)).deserialize(jsonParser, this);
    }

    public <T> T readTreeAsValue(ela elaVar, Class<T> cls) throws IOException {
        if (elaVar == null) {
            return null;
        }
        eck eckVar_treeAsTokens = _treeAsTokens(elaVar);
        try {
            T t = (T) readValue(eckVar_treeAsTokens, cls);
            if (eckVar_treeAsTokens != null) {
                eckVar_treeAsTokens.close();
            }
            return t;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (eckVar_treeAsTokens != null) {
                    try {
                        eckVar_treeAsTokens.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        return (T) readValue(jsonParser, getTypeFactory().constructType(cls));
    }

    public <T> T reportBadCoercion(lka<?> lkaVar, Class<?> cls, Object obj, String str, Object... objArr) throws JsonMappingException {
        throw InvalidFormatException.from(getParser(), _format(str, objArr), obj, cls);
    }

    @Override // com.oplus.aiunit.vision.e05
    public <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, str, javaType);
    }

    @Deprecated
    public <T> T reportBadMerge(lka<?> lkaVar) throws JsonMappingException {
        handleBadMerge(lkaVar);
        return null;
    }

    public <T> T reportBadPropertyDefinition(oc1 oc1Var, rc1 rc1Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid definition for property %s (of type %s): %s", nc3.W(rc1Var), nc3.X(oc1Var.r()), _format(str, objArr)), oc1Var, rc1Var);
    }

    public <T> T reportBadTypeDefinition(oc1 oc1Var, String str, Object... objArr) throws JsonMappingException {
        throw InvalidDefinitionException.from(this._parser, String.format("Invalid type definition for type %s: %s", nc3.X(oc1Var.r()), _format(str, objArr)), oc1Var, (rc1) null);
    }

    public <T> T reportInputMismatch(lka<?> lkaVar, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), lkaVar.handledType(), _format(str, objArr));
    }

    @Deprecated
    public void reportMappingException(String str, Object... objArr) throws JsonMappingException {
        throw JsonMappingException.from(getParser(), _format(str, objArr));
    }

    @Deprecated
    public void reportMissingContent(String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), (JavaType) null, "No content to map due to end-of-input");
    }

    public <T> T reportPropertyInputMismatch(Class<?> cls, String str, String str2, Object... objArr) throws JsonMappingException {
        MismatchedInputException mismatchedInputExceptionFrom = MismatchedInputException.from(getParser(), cls, _format(str2, objArr));
        if (str == null) {
            throw mismatchedInputExceptionFrom;
        }
        mismatchedInputExceptionFrom.prependPath(cls, str);
        throw mismatchedInputExceptionFrom;
    }

    public <T> T reportTrailingTokens(Class<?> cls, JsonParser jsonParser, JsonToken jsonToken) throws JsonMappingException {
        throw MismatchedInputException.from(jsonParser, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", jsonToken, nc3.X(cls)));
    }

    @Deprecated
    public void reportUnknownProperty(Object obj, String str, lka<?> lkaVar) throws JsonMappingException {
        if (isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw UnrecognizedPropertyException.from(this._parser, obj, str, lkaVar == null ? null : lkaVar.getKnownPropertyNames());
        }
    }

    public <T> T reportUnresolvedObjectId(ObjectIdReader objectIdReader, Object obj) throws JsonMappingException {
        return (T) reportInputMismatch(objectIdReader.idProperty, String.format("No Object Id found for an instance of %s, to assign to property '%s'", nc3.h(obj), objectIdReader.propertyName), new Object[0]);
    }

    public void reportWrongTokenException(lka<?> lkaVar, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), lkaVar.handledType(), jsonToken, _format(str, objArr));
    }

    public final void returnObjectBuffer(xad xadVar) {
        if (this._objectBuffer == null || xadVar.h() >= this._objectBuffer.h()) {
            this._objectBuffer = xadVar;
        }
    }

    @Deprecated
    public JsonMappingException unknownTypeException(JavaType javaType, String str, String str2) {
        return MismatchedInputException.from(this._parser, javaType, _colonConcat(String.format("Could not resolve type id '%s' into a subtype of %s", str, nc3.G(javaType)), str2));
    }

    public JsonMappingException weirdKeyException(Class<?> cls, String str, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", nc3.X(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException weirdNativeValueException(Object obj, Class<?> cls) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", nc3.X(cls), nc3.h(obj)), obj, cls);
    }

    public JsonMappingException weirdNumberException(Number number, Class<?> cls, String str) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from number %s: %s", nc3.X(cls), String.valueOf(number), str), number, cls);
    }

    public JsonMappingException weirdStringException(String str, Class<?> cls, String str2) {
        return InvalidFormatException.from(this._parser, String.format("Cannot deserialize value of type %s from String %s: %s", nc3.X(cls), _quotedString(str), str2), str, cls);
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, JavaType javaType, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, javaType, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.n(), jsonToken), str));
    }

    public DeserializationContext(com.fasterxml.jackson.databind.deser.a aVar, DeserializerCache deserializerCache) {
        if (aVar == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this._factory = aVar;
        this._cache = deserializerCache == null ? new DeserializerCache() : deserializerCache;
        this._featureFlags = 0;
        this._readCapabilities = null;
        this._config = null;
        this._injectableValues = null;
        this._view = null;
        this._attributes = null;
    }

    public final j1k bufferForInputBuffering() {
        return bufferForInputBuffering(getParser());
    }

    @Override // com.oplus.aiunit.vision.e05
    public DeserializationConfig getConfig() {
        return this._config;
    }

    public Object handleUnexpectedToken(Class<?> cls, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        return handleUnexpectedToken(constructType(cls), jsonToken, jsonParser, str, objArr);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (this._featureFlags & deserializationFeature.getMask()) != 0;
    }

    @Deprecated
    public JsonMappingException mappingException(String str, Object... objArr) {
        return JsonMappingException.from(getParser(), _format(str, objArr));
    }

    public <T> T readPropertyValue(JsonParser jsonParser, BeanProperty beanProperty, JavaType javaType) throws IOException {
        lka<Object> lkaVarFindContextualValueDeserializer = findContextualValueDeserializer(javaType, beanProperty);
        return lkaVarFindContextualValueDeserializer == null ? (T) reportBadDefinition(javaType, String.format("Could not find JsonDeserializer for type %s (via property %s)", nc3.G(javaType), nc3.W(beanProperty))) : (T) lkaVarFindContextualValueDeserializer.deserialize(jsonParser, this);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        lka<Object> lkaVarFindRootValueDeserializer = findRootValueDeserializer(javaType);
        if (lkaVarFindRootValueDeserializer != null) {
            return (T) lkaVarFindRootValueDeserializer.deserialize(jsonParser, this);
        }
        return (T) reportBadDefinition(javaType, "Could not find JsonDeserializer for type " + nc3.G(javaType));
    }

    @Override // com.oplus.aiunit.vision.e05
    public DeserializationContext setAttribute(Object obj, Object obj2) {
        this._attributes = this._attributes.withPerCallAttribute(obj, obj2);
        return this;
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonParser jsonParser) throws IOException {
        return handleUnexpectedToken(javaType, jsonParser.n(), jsonParser, (String) null, new Object[0]);
    }

    public final boolean isEnabled(StreamReadCapability streamReadCapability) {
        return this._readCapabilities.b(streamReadCapability);
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls) {
        return mappingException(cls, this._parser.n());
    }

    public <T> T reportInputMismatch(Class<?> cls, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), cls, _format(str, objArr));
    }

    public void reportWrongTokenException(JavaType javaType, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), javaType, jsonToken, _format(str, objArr));
    }

    public Object handleUnexpectedToken(JavaType javaType, JsonToken jsonToken, JsonParser jsonParser, String str, Object... objArr) throws IOException {
        String str_format = _format(str, objArr);
        for (xya<j95> problemHandlers = this._config.getProblemHandlers(); problemHandlers != null; problemHandlers = problemHandlers.c()) {
            Object objE = problemHandlers.d().e(this, javaType, jsonToken, jsonParser, str_format);
            if (objE != j95.NOT_HANDLED) {
                if (_isCompatible(javaType.getRawClass(), objE)) {
                    return objE;
                }
                reportBadDefinition(javaType, String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", nc3.G(javaType), nc3.h(objE)));
            }
        }
        if (str_format == null) {
            String strG = nc3.G(javaType);
            if (jsonToken == null) {
                str_format = String.format("Unexpected end-of-input when trying read value of type %s", strG);
            } else {
                str_format = String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", strG, _shapeForToken(jsonToken), jsonToken);
            }
        }
        if (jsonToken != null && jsonToken.isScalarValue()) {
            jsonParser.O();
        }
        reportInputMismatch(javaType, str_format, new Object[0]);
        return null;
    }

    @Deprecated
    public JsonMappingException mappingException(Class<?> cls, JsonToken jsonToken) {
        return JsonMappingException.from(this._parser, String.format("Cannot deserialize instance of %s out of %s token", nc3.X(cls), jsonToken));
    }

    public <T> T reportInputMismatch(JavaType javaType, String str, Object... objArr) throws JsonMappingException {
        throw MismatchedInputException.from(getParser(), javaType, _format(str, objArr));
    }

    public <T> T reportPropertyInputMismatch(JavaType javaType, String str, String str2, Object... objArr) throws JsonMappingException {
        return (T) reportPropertyInputMismatch(javaType.getRawClass(), str, str2, objArr);
    }

    public void reportWrongTokenException(Class<?> cls, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(getParser(), cls, jsonToken, _format(str, objArr));
    }

    public JsonMappingException wrongTokenException(JsonParser jsonParser, Class<?> cls, JsonToken jsonToken, String str) {
        return MismatchedInputException.from(jsonParser, cls, _colonConcat(String.format("Unexpected token (%s), expected %s", jsonParser.n(), jsonToken), str));
    }

    public JsonMappingException instantiationException(Class<?> cls, String str) {
        return ValueInstantiationException.from(this._parser, String.format("Cannot construct instance of %s: %s", nc3.X(cls), str), constructType(cls));
    }

    public <T> T readTreeAsValue(ela elaVar, JavaType javaType) throws IOException {
        if (elaVar == null) {
            return null;
        }
        eck eckVar_treeAsTokens = _treeAsTokens(elaVar);
        try {
            T t = (T) readValue(eckVar_treeAsTokens, javaType);
            if (eckVar_treeAsTokens != null) {
                eckVar_treeAsTokens.close();
            }
            return t;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (eckVar_treeAsTokens != null) {
                    try {
                        eckVar_treeAsTokens.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public <T> T reportInputMismatch(BeanProperty beanProperty, String str, Object... objArr) throws JsonMappingException {
        AnnotatedMember member;
        MismatchedInputException mismatchedInputExceptionFrom = MismatchedInputException.from(getParser(), beanProperty == null ? null : beanProperty.getType(), _format(str, objArr));
        if (beanProperty != null && (member = beanProperty.getMember()) != null) {
            mismatchedInputExceptionFrom.prependPath(member.getDeclaringClass(), beanProperty.getName());
            throw mismatchedInputExceptionFrom;
        }
        throw mismatchedInputExceptionFrom;
    }

    @Deprecated
    public void reportWrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str, Object... objArr) throws JsonMappingException {
        throw wrongTokenException(jsonParser, jsonToken, _format(str, objArr));
    }

    @Deprecated
    public JsonMappingException wrongTokenException(JsonParser jsonParser, JsonToken jsonToken, String str) {
        return wrongTokenException(jsonParser, (JavaType) null, jsonToken, str);
    }

    public DeserializationContext(DeserializationContext deserializationContext, com.fasterxml.jackson.databind.deser.a aVar) {
        this._cache = deserializationContext._cache;
        this._factory = aVar;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._parser = deserializationContext._parser;
        this._injectableValues = deserializationContext._injectableValues;
        this._attributes = deserializationContext._attributes;
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JsonParser jsonParser, InjectableValues injectableValues) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = jsonParser == null ? null : jsonParser.M();
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = deserializationConfig.getActiveView();
        this._parser = jsonParser;
        this._injectableValues = injectableValues;
        this._attributes = deserializationConfig.getAttributes();
    }

    public DeserializationContext(DeserializationContext deserializationContext, DeserializationConfig deserializationConfig) {
        this._cache = deserializationContext._cache;
        this._factory = deserializationContext._factory;
        this._readCapabilities = null;
        this._config = deserializationConfig;
        this._featureFlags = deserializationConfig.getDeserializationFeatures();
        this._view = null;
        this._parser = null;
        this._injectableValues = null;
        this._attributes = null;
    }

    public DeserializationContext(DeserializationContext deserializationContext) {
        this._cache = new DeserializerCache();
        this._factory = deserializationContext._factory;
        this._config = deserializationContext._config;
        this._featureFlags = deserializationContext._featureFlags;
        this._readCapabilities = deserializationContext._readCapabilities;
        this._view = deserializationContext._view;
        this._injectableValues = null;
    }
}
