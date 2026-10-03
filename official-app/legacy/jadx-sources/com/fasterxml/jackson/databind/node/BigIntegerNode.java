package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.eug;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class BigIntegerNode extends NumericNode {
    protected final BigInteger _value;
    private static final BigInteger MIN_INTEGER = BigInteger.valueOf(-2147483648L);
    private static final BigInteger MAX_INTEGER = BigInteger.valueOf(2147483647L);
    private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);

    public BigIntegerNode(BigInteger bigInteger) {
        this._value = bigInteger;
    }

    public static BigIntegerNode valueOf(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean asBoolean(boolean z) {
        return !BigInteger.ZERO.equals(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public String asText() {
        return this._value.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public BigInteger bigIntegerValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToInt() {
        return this._value.compareTo(MIN_INTEGER) >= 0 && this._value.compareTo(MAX_INTEGER) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToLong() {
        return this._value.compareTo(MIN_LONG) >= 0 && this._value.compareTo(MAX_LONG) <= 0;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public BigDecimal decimalValue() {
        return new BigDecimal(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public double doubleValue() {
        return this._value.doubleValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return ((BigIntegerNode) obj)._value.equals(this._value);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public float floatValue() {
        return this._value.floatValue();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public int intValue() {
        return this._value.intValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isBigInteger() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isIntegralNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public long longValue() {
        return this._value.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public Number numberValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.a0(this._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public short shortValue() {
        return this._value.shortValue();
    }
}
