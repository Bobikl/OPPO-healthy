package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.eug;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class NullNode extends ValueNode {
    public static final NullNode instance = new NullNode();
    private static final long serialVersionUID = 1;

    public static NullNode getInstance() {
        return instance;
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText() {
        return "null";
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof NullNode);
    }

    @Override // com.oplus.aiunit.vision.ela
    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    public Object readResolve() {
        return instance;
    }

    @Override // com.oplus.aiunit.vision.ela
    public ela requireNonNull() {
        return (ela) _reportRequiredViolation("requireNonNull() called on `NullNode`", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        eugVar.defaultSerializeNull(jsonGenerator);
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText(String str) {
        return str;
    }
}
