package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.oplus.aiunit.vision.dd2;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    private static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super((Class<?>) ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.oplus.aiunit.vision.lka
    public LogicalType logicalType() {
        return LogicalType.Binary;
    }

    @Override // com.oplus.aiunit.vision.lka
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return ByteBuffer.wrap(jsonParser.t());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.oplus.aiunit.vision.lka
    public ByteBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ByteBuffer byteBuffer) throws IOException {
        dd2 dd2Var = new dd2(byteBuffer);
        jsonParser.p0(deserializationContext.getBase64Variant(), dd2Var);
        dd2Var.close();
        return byteBuffer;
    }
}
