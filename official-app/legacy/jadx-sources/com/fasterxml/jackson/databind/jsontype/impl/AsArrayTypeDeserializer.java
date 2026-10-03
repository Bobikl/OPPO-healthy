package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.oplus.aiunit.vision.j1k;
import com.oplus.aiunit.vision.lka;
import com.oplus.aiunit.vision.lla;
import com.oplus.aiunit.vision.mdk;
import com.oplus.aiunit.vision.odk;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase {
    private static final long serialVersionUID = 1;

    public AsArrayTypeDeserializer(JavaType javaType, odk odkVar, String str, boolean z, JavaType javaType2) {
        super(javaType, odkVar, str, z, javaType2);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objT;
        if (jsonParser.i() && (objT = jsonParser.T()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objT);
        }
        boolean zG0 = jsonParser.g0();
        String str_locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        lka<Object> lkaVar_findDeserializer = _findDeserializer(deserializationContext, str_locateTypeId);
        if (this._typeIdVisible && !_usesExternalId() && jsonParser.c0(JsonToken.START_OBJECT)) {
            j1k j1kVarBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            j1kVarBufferForInputBuffering.p0();
            j1kVarBufferForInputBuffering.S(this._typePropertyName);
            j1kVarBufferForInputBuffering.t0(str_locateTypeId);
            jsonParser.l();
            jsonParser = lla.w0(false, j1kVarBufferForInputBuffering.L0(jsonParser), jsonParser);
            jsonParser.l0();
        }
        if (zG0 && jsonParser.n() == JsonToken.END_ARRAY) {
            return lkaVar_findDeserializer.getNullValue(deserializationContext);
        }
        Object objDeserialize = lkaVar_findDeserializer.deserialize(jsonParser, deserializationContext);
        if (zG0) {
            JsonToken jsonTokenL0 = jsonParser.l0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenL0 != jsonToken) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
            }
        }
        return objDeserialize;
    }

    public String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.g0()) {
            JsonToken jsonTokenL0 = jsonParser.l0();
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            if (jsonTokenL0 != jsonToken) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
                return null;
            }
            String strO = jsonParser.O();
            jsonParser.l0();
            return strO;
        }
        if (this._defaultImpl != null) {
            return this._idResolver.f();
        }
        deserializationContext.reportWrongTokenException(baseType(), JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
        return null;
    }

    public boolean _usesExternalId() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.mdk
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.oplus.aiunit.vision.mdk
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.oplus.aiunit.vision.mdk
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.oplus.aiunit.vision.mdk
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.oplus.aiunit.vision.mdk
    public mdk forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.oplus.aiunit.vision.mdk
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }
}
