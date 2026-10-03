package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.wdk;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class MissingNode extends ValueNode {
    private static final MissingNode instance = new MissingNode();
    private static final long serialVersionUID = 1;

    public static MissingNode getInstance() {
        return instance;
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.oplus.aiunit.vision.ela
    public <T extends ela> T deepCopy() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.oplus.aiunit.vision.ela
    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isMissingNode() {
        return true;
    }

    public Object readResolve() {
        return instance;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela require() {
        return (ela) _reportRequiredViolation("require() called on `MissingNode`", new Object[0]);
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela requireNonNull() {
        return (ela) _reportRequiredViolation("requireNonNull() called on `MissingNode`", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.T();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public void serializeWithType(JsonGenerator jsonGenerator, eug eugVar, wdk wdkVar) throws IOException {
        jsonGenerator.T();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.ela
    public String toPrettyString() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.ela
    public String toString() {
        return "";
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText(String str) {
        return str;
    }
}
