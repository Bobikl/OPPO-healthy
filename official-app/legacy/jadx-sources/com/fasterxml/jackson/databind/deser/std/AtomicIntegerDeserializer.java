package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer<AtomicInteger> {
    private static final long serialVersionUID = 1;

    public AtomicIntegerDeserializer() {
        super((Class<?>) AtomicInteger.class);
    }

    @Override // com.oplus.aiunit.vision.lka
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.oplus.aiunit.vision.lka
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // com.oplus.aiunit.vision.lka
    public AtomicInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.f0()) {
            return new AtomicInteger(jsonParser.F());
        }
        Integer num_parseInteger = _parseInteger(jsonParser, deserializationContext, AtomicInteger.class);
        if (num_parseInteger == null) {
            return null;
        }
        return new AtomicInteger(num_parseInteger.intValue());
    }
}
