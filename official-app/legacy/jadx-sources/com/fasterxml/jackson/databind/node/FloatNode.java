package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.eug;
import com.oplus.aiunit.vision.nzc;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class FloatNode extends NumericNode {
    protected final float _value;

    public FloatNode(float f) {
        this._value = f;
    }

    public static FloatNode valueOf(float f) {
        return new FloatNode(f);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public String asText() {
        return nzc.v(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean canConvertToExactIntegral() {
        if (!Float.isNaN(this._value) && !Float.isInfinite(this._value)) {
            float f = this._value;
            if (f == Math.round(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToInt() {
        float f = this._value;
        return f >= -2.14748365E9f && f <= 2.14748365E9f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToLong() {
        float f = this._value;
        return f >= -9.223372E18f && f <= 9.223372E18f;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public double doubleValue() {
        return this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof FloatNode)) {
            return Float.compare(this._value, ((FloatNode) obj)._value) == 0;
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public float floatValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public int intValue() {
        return (int) this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isFloat() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean isNaN() {
        return Float.isNaN(this._value) || Float.isInfinite(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public long longValue() {
        return (long) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.V(this._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public short shortValue() {
        return (short) this._value;
    }
}
