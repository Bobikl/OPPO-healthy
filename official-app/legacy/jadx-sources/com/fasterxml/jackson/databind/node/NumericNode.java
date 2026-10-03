package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonParser;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class NumericNode extends ValueNode {
    private static final long serialVersionUID = 1;

    @Override // com.oplus.aiunit.vision.ela
    public final double asDouble() {
        return doubleValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public final int asInt() {
        return intValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public final long asLong() {
        return longValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public abstract String asText();

    @Override // com.oplus.aiunit.vision.ela
    public abstract BigInteger bigIntegerValue();

    @Override // com.oplus.aiunit.vision.ela
    public abstract boolean canConvertToInt();

    @Override // com.oplus.aiunit.vision.ela
    public abstract boolean canConvertToLong();

    @Override // com.oplus.aiunit.vision.ela
    public abstract BigDecimal decimalValue();

    @Override // com.oplus.aiunit.vision.ela
    public abstract double doubleValue();

    @Override // com.oplus.aiunit.vision.ela
    public final JsonNodeType getNodeType() {
        return JsonNodeType.NUMBER;
    }

    @Override // com.oplus.aiunit.vision.ela
    public abstract int intValue();

    public boolean isNaN() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.ela
    public abstract long longValue();

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.d
    public abstract JsonParser.NumberType numberType();

    @Override // com.oplus.aiunit.vision.ela
    public abstract Number numberValue();

    @Override // com.oplus.aiunit.vision.ela
    public final double asDouble(double d) {
        return doubleValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public final int asInt(int i) {
        return intValue();
    }

    @Override // com.oplus.aiunit.vision.ela
    public final long asLong(long j2) {
        return longValue();
    }
}
