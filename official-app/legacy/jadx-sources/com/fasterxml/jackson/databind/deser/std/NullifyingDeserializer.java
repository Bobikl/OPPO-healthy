package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.oplus.aiunit.vision.mdk;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer instance = new NullifyingDeserializer();
    private static final long serialVersionUID = 1;

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    @Override // com.oplus.aiunit.vision.lka
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.c0(JsonToken.FIELD_NAME)) {
            jsonParser.u0();
            return null;
        }
        while (true) {
            JsonToken jsonTokenL0 = jsonParser.l0();
            if (jsonTokenL0 == null || jsonTokenL0 == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.u0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.oplus.aiunit.vision.lka
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, mdk mdkVar) throws IOException {
        int iO = jsonParser.o();
        if (iO == 1 || iO == 3 || iO == 5) {
            return mdkVar.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.lka
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}
