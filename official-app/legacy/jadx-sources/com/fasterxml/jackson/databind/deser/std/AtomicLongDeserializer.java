package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer<AtomicLong> {
    private static final long serialVersionUID = 1;

    public AtomicLongDeserializer() {
        super((Class<?>) AtomicLong.class);
    }

    @Override // com.oplus.aiunit.vision.lka
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.oplus.aiunit.vision.lka
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // com.oplus.aiunit.vision.lka
    public AtomicLong deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.f0()) {
            return new AtomicLong(jsonParser.G());
        }
        Long l_parseLong = _parseLong(jsonParser, deserializationContext, AtomicLong.class);
        if (l_parseLong == null) {
            return null;
        }
        return new AtomicLong(l_parseLong.intValue());
    }
}
