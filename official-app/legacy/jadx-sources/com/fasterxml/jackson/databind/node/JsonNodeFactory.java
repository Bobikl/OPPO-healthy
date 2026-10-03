package com.fasterxml.jackson.databind.node;

import com.oplus.aiunit.vision.ela;
import com.oplus.aiunit.vision.uaf;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class JsonNodeFactory implements Serializable {
    private static final JsonNodeFactory decimalsAsIs;
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        decimalsAsIs = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        return z ? decimalsAsIs : decimalsNormalized;
    }

    public boolean _inIntRange(long j2) {
        return ((long) ((int) j2)) == j2;
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public ela missingNode() {
        return MissingNode.getInstance();
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(uaf uafVar) {
        return new POJONode(uafVar);
    }

    public ArrayNode arrayNode(int i) {
        return new ArrayNode(this, i);
    }

    /* JADX INFO: renamed from: booleanNode, reason: merged with bridge method [inline-methods] */
    public BooleanNode m4553booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    /* JADX INFO: renamed from: nullNode, reason: merged with bridge method [inline-methods] */
    public NullNode m4554nullNode() {
        return NullNode.getInstance();
    }

    /* JADX INFO: renamed from: textNode, reason: merged with bridge method [inline-methods] */
    public TextNode m4561textNode(String str) {
        return TextNode.valueOf(str);
    }

    public JsonNodeFactory() {
        this(false);
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public BinaryNode m4551binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public BinaryNode m4552binaryNode(byte[] bArr, int i, int i2) {
        return BinaryNode.valueOf(bArr, i, i2);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m4555numberNode(byte b) {
        return IntNode.valueOf(b);
    }

    public ValueNode numberNode(Byte b) {
        return b == null ? m4554nullNode() : IntNode.valueOf(b.intValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m4560numberNode(short s) {
        return ShortNode.valueOf(s);
    }

    public ValueNode numberNode(Short sh) {
        return sh == null ? m4554nullNode() : ShortNode.valueOf(sh.shortValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m4558numberNode(int i) {
        return IntNode.valueOf(i);
    }

    public ValueNode numberNode(Integer num) {
        return num == null ? m4554nullNode() : IntNode.valueOf(num.intValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m4559numberNode(long j2) {
        return LongNode.valueOf(j2);
    }

    public ValueNode numberNode(Long l2) {
        if (l2 == null) {
            return m4554nullNode();
        }
        return LongNode.valueOf(l2.longValue());
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return m4554nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m4557numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    public ValueNode numberNode(Float f) {
        return f == null ? m4554nullNode() : FloatNode.valueOf(f.floatValue());
    }

    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m4556numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    public ValueNode numberNode(Double d) {
        return d == null ? m4554nullNode() : DoubleNode.valueOf(d.doubleValue());
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return m4554nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.ZERO;
        }
        try {
            bigDecimal = bigDecimal.stripTrailingZeros();
        } catch (ArithmeticException unused) {
        }
        return DecimalNode.valueOf(bigDecimal);
    }
}
