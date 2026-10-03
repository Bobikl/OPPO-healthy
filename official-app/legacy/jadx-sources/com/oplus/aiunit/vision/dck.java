package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class dck {
    public abstract com.fasterxml.jackson.core.d createArrayNode();

    public abstract com.fasterxml.jackson.core.d createObjectNode();

    public com.fasterxml.jackson.core.d missingNode() {
        return null;
    }

    public com.fasterxml.jackson.core.d nullNode() {
        return null;
    }

    public abstract <T extends com.fasterxml.jackson.core.d> T readTree(JsonParser jsonParser) throws IOException;

    public abstract JsonParser treeAsTokens(com.fasterxml.jackson.core.d dVar);

    public abstract void writeTree(JsonGenerator jsonGenerator, com.fasterxml.jackson.core.d dVar) throws IOException;
}
