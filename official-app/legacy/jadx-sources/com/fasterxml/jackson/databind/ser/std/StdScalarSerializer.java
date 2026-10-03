package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.rka;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public abstract class StdScalarSerializer<T> extends StdSerializer<T> {
    public StdScalarSerializer(Class<T> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.yla
    public void acceptJsonFormatVisitor(rka rkaVar, JavaType javaType) throws JsonMappingException {
        visitStringFormat(rkaVar, javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.oplus.aiunit.vision.jfg
    public ela getSchema(eug eugVar, Type type) throws JsonMappingException {
        return createSchemaNode(TypedValues.Custom.S_STRING, true);
    }

    @Override // com.oplus.aiunit.vision.yla
    public void serializeWithType(T t, JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        WritableTypeId writableTypeIdG = wdkVar.g(jsonGenerator, wdkVar.d(t, JsonToken.VALUE_STRING));
        serialize(t, jsonGenerator, eugVar);
        wdkVar.h(jsonGenerator, writableTypeIdG);
    }

    public StdScalarSerializer(Class<?> cls, boolean z) {
        super(cls);
    }

    public StdScalarSerializer(StdScalarSerializer<?> stdScalarSerializer) {
        super(stdScalarSerializer);
    }
}
