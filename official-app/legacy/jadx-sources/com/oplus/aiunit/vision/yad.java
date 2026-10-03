package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yad extends dck {
    @Override // com.oplus.aiunit.vision.dck
    public abstract com.fasterxml.jackson.core.d createArrayNode();

    @Override // com.oplus.aiunit.vision.dck
    public abstract com.fasterxml.jackson.core.d createObjectNode();

    public JsonFactory getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    @Override // com.oplus.aiunit.vision.dck
    public abstract <T extends com.fasterxml.jackson.core.d> T readTree(JsonParser jsonParser) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, ssf ssfVar) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, udk<T> udkVar) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, ssf ssfVar) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, udk<T> udkVar) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException;

    @Override // com.oplus.aiunit.vision.dck
    public abstract JsonParser treeAsTokens(com.fasterxml.jackson.core.d dVar);

    public abstract <T> T treeToValue(com.fasterxml.jackson.core.d dVar, Class<T> cls) throws JsonProcessingException;

    public abstract Version version();

    @Override // com.oplus.aiunit.vision.dck
    public abstract void writeTree(JsonGenerator jsonGenerator, com.fasterxml.jackson.core.d dVar) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
