package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.oplus.aiunit.vision.lka;
import com.oplus.aiunit.vision.mdk;
import com.oplus.aiunit.vision.nc3;
import com.oplus.aiunit.vision.odk;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TypeDeserializerBase extends mdk implements Serializable {
    private static final long serialVersionUID = 1;
    protected final JavaType _baseType;
    protected final JavaType _defaultImpl;
    protected lka<Object> _defaultImplDeserializer;
    protected final Map<String, lka<Object>> _deserializers;
    protected final odk _idResolver;
    protected final BeanProperty _property;
    protected final boolean _typeIdVisible;
    protected final String _typePropertyName;

    public TypeDeserializerBase(JavaType javaType, odk odkVar, String str, boolean z, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = odkVar;
        this._typePropertyName = nc3.Z(str);
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.T());
    }

    public final lka<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        lka<Object> lkaVar;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.instance;
        }
        if (nc3.J(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        }
        synchronized (this._defaultImpl) {
            if (this._defaultImplDeserializer == null) {
                this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
            }
            lkaVar = this._defaultImplDeserializer;
        }
        return lkaVar;
    }

    public final lka<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        lka<Object> lkaVarFindContextualValueDeserializer;
        lka<Object> lkaVar_findDefaultImplDeserializer = this._deserializers.get(str);
        if (lkaVar_findDefaultImplDeserializer == null) {
            JavaType javaTypeC = this._idResolver.c(deserializationContext, str);
            if (javaTypeC == null) {
                lkaVar_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (lkaVar_findDefaultImplDeserializer == null) {
                    JavaType javaType_handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str);
                    if (javaType_handleUnknownTypeId == null) {
                        return NullifyingDeserializer.instance;
                    }
                    lkaVarFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, lkaVar_findDefaultImplDeserializer);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == javaTypeC.getClass() && !javaTypeC.hasGenericTypes()) {
                    try {
                        javaTypeC = deserializationContext.constructSpecializedType(this._baseType, javaTypeC.getRawClass());
                    } catch (IllegalArgumentException e2) {
                        throw deserializationContext.invalidTypeIdException(this._baseType, str, e2.getMessage());
                    }
                }
                lkaVarFindContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(javaTypeC, this._property);
            }
            lkaVar_findDefaultImplDeserializer = lkaVarFindContextualValueDeserializer;
            this._deserializers.put(str, lkaVar_findDefaultImplDeserializer);
        }
        return lkaVar_findDefaultImplDeserializer;
    }

    public JavaType _handleMissingTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingTypeId(this._baseType, this._idResolver, str);
    }

    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        String str2;
        String strB = this._idResolver.b();
        if (strB == null) {
            str2 = "type ids are not statically known";
        } else {
            str2 = "known type ids = " + strB;
        }
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            str2 = String.format("%s (for POJO property '%s')", str2, beanProperty.getName());
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, this._idResolver, str2);
    }

    public JavaType baseType() {
        return this._baseType;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    @Override // com.oplus.aiunit.vision.mdk
    public abstract mdk forProperty(BeanProperty beanProperty);

    @Override // com.oplus.aiunit.vision.mdk
    public Class<?> getDefaultImpl() {
        return nc3.d0(this._defaultImpl);
    }

    @Override // com.oplus.aiunit.vision.mdk
    public final String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // com.oplus.aiunit.vision.mdk
    public odk getTypeIdResolver() {
        return this._idResolver;
    }

    @Override // com.oplus.aiunit.vision.mdk
    public abstract JsonTypeInfo.As getTypeInclusion();

    @Override // com.oplus.aiunit.vision.mdk
    public boolean hasDefaultImpl() {
        return this._defaultImpl != null;
    }

    public String toString() {
        return '[' + getClass().getName() + "; base-type:" + this._baseType + "; id-resolver: " + this._idResolver + ']';
    }

    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        lka<Object> lkaVar_findDeserializer;
        if (obj == null) {
            lkaVar_findDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (lkaVar_findDeserializer == null) {
                return deserializationContext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            lkaVar_findDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return lkaVar_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
