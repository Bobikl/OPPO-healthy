package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.oplus.aiunit.vision.eug;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class DecimalNode extends NumericNode {
    protected final BigDecimal _value;
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);
    private static final BigDecimal MIN_INTEGER = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal MAX_INTEGER = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal MIN_LONG = BigDecimal.valueOf(Long.MIN_VALUE);
    private static final BigDecimal MAX_LONG = BigDecimal.valueOf(Long.MAX_VALUE);

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public String asText() {
        return this._value.toString();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public BigInteger bigIntegerValue() {
        return this._value.toBigInteger();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean canConvertToExactIntegral() {
        return this._value.signum() == 0 || this._value.scale() <= 0 || this._value.stripTrailingZeros().scale() <= 0;
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
        return this._value;
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
        return obj != null && (obj instanceof DecimalNode) && ((DecimalNode) obj)._value.compareTo(this._value) == 0;
    }

    @Override // com.oplus.aiunit.vision.ela
    public float floatValue() {
        return this._value.floatValue();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return Double.valueOf(doubleValue()).hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public int intValue() {
        return this._value.intValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isBigDecimal() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public long longValue() {
        return this._value.longValue();
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_DECIMAL;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public Number numberValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.Z(this._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public short shortValue() {
        return this._value.shortValue();
    }
}
