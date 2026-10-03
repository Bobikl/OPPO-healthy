package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.eug;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class BooleanNode extends ValueNode {
    private static final long serialVersionUID = 2;
    private final boolean _value;
    public static final BooleanNode TRUE = new BooleanNode(true);
    public static final BooleanNode FALSE = new BooleanNode(false);

    public BooleanNode(boolean z) {
        this._value = z;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    public static BooleanNode valueOf(boolean z) {
        return z ? TRUE : FALSE;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean asBoolean() {
        return this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public double asDouble(double d) {
        return this._value ? 1.0d : 0.0d;
    }

    @Override // com.oplus.aiunit.vision.ela
    public int asInt(int i) {
        return this._value ? 1 : 0;
    }

    @Override // com.oplus.aiunit.vision.ela
    public long asLong(long j2) {
        return this._value ? 1L : 0L;
    }

    @Override // com.oplus.aiunit.vision.ela
    public String asText() {
        return this._value ? SpeechConstant.TRUE_STR : SpeechConstant.FALSE_STR;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return this._value ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean booleanValue() {
        return this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof BooleanNode) && this._value == ((BooleanNode) obj)._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value ? 3 : 1;
    }

    public Object readResolve() {
        return this._value ? TRUE : FALSE;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.M(this._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean asBoolean(boolean z) {
        return this._value;
    }
}
