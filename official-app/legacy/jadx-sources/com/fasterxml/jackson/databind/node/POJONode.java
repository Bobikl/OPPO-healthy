package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.wla;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class POJONode extends ValueNode {
    private static final long serialVersionUID = 2;
    protected final Object _value;

    public POJONode(Object obj) {
        this._value = obj;
    }

    public boolean _pojoEquals(POJONode pOJONode) {
        Object obj = this._value;
        if (obj == null) {
            return pOJONode._value == null;
        }
        return obj.equals(pOJONode._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean asBoolean(boolean z) {
        Object obj = this._value;
        return (obj == null || !(obj instanceof Boolean)) ? z : ((Boolean) obj).booleanValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public double asDouble(double d) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    @Override // com.oplus.aiunit.vision.ela
    public int asInt(int i) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    @Override // com.oplus.aiunit.vision.ela
    public long asLong(long j2) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).longValue() : j2;
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText() {
        Object obj = this._value;
        return obj == null ? "null" : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.oplus.aiunit.vision.ela
    public byte[] binaryValue() throws IOException {
        Object obj = this._value;
        return obj instanceof byte[] ? (byte[]) obj : super.binaryValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return _pojoEquals((POJONode) obj);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    public Object getPojo() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        Object obj = this._value;
        if (obj == null) {
            eugVar.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof wla) {
            ((wla) obj).serialize(jsonGenerator, eugVar);
        } else {
            eugVar.defaultSerializeValue(obj, jsonGenerator);
        }
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText(String str) {
        Object obj = this._value;
        return obj == null ? str : obj.toString();
    }
}
