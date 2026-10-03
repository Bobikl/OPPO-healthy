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
public class DoubleNode extends NumericNode {
    protected final double _value;

    public DoubleNode(double d) {
        this._value = d;
    }

    public static DoubleNode valueOf(double d) {
        return new DoubleNode(d);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public String asText() {
        return nzc.u(this._value);
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
        if (!Double.isNaN(this._value) && !Double.isInfinite(this._value)) {
            double d = this._value;
            if (d == Math.rint(d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToInt() {
        double d = this._value;
        return d >= -2.147483648E9d && d <= 2.147483647E9d;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public boolean canConvertToLong() {
        double d = this._value;
        return d >= -9.223372036854776E18d && d <= 9.223372036854776E18d;
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
        if (obj != null && (obj instanceof DoubleNode)) {
            return Double.compare(this._value, ((DoubleNode) obj)._value) == 0;
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public float floatValue() {
        return (float) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public int intValue() {
        return (int) this._value;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isDouble() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.ela
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode
    public boolean isNaN() {
        return Double.isNaN(this._value) || Double.isInfinite(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public long longValue() {
        return (long) this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.databind.node.NumericNode, com.oplus.aiunit.vision.ela
    public Number numberValue() {
        return Double.valueOf(this._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.oplus.aiunit.vision.wla
    public final void serialize(JsonGenerator jsonGenerator, eug eugVar) throws IOException {
        jsonGenerator.U(this._value);
    }

    @Override // com.oplus.aiunit.vision.ela
    public short shortValue() {
        return (short) this._value;
    }
}
