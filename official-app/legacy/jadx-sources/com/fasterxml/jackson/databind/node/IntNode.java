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
public class IntNode extends NumericNode {
    private static final IntNode[] CANONICALS = new IntNode[12];
    static final int MAX_CANONICAL = 10;
    static final int MIN_CANONICAL = -1;
    protected final int _value;

    static {
        for (int i = 0; i < 12; i++) {
            CANONICALS[i] = new IntNode(i - 1);
        }
    }

    public IntNode(int i) {
        this._value = i;
    }

    public static IntNode valueOf(int i) {
        return (i > 10 || i < -1) ? new IntNode(i) : CANONICALS[i - (-1)];
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean asBoolean(boolean z) {
        return this._value != 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public String asText() {
        return nzc.w(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToInt() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToLong() {
        return true;
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
        return obj != null && (obj instanceof IntNode) && ((IntNode) obj)._value == this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public float floatValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public int intValue() {
        return this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isInt() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isIntegralNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public long longValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public Number numberValue() {
        return Integer.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.W(this._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public short shortValue() {
        return (short) this._value;
    }
}
