package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ela extends wla.a implements com.fasterxml.jackson.core.d, Iterable<ela> {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            a = iArr;
            try {
                iArr[JsonNodeType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonNodeType.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonNodeType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public abstract ela _at(mla mlaVar);

    public <T> T _reportRequiredViolation(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ela> T _this() {
        return this;
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public double asDouble(double d) {
        return d;
    }

    public int asInt(int i) {
        return i;
    }

    public long asLong(long j2) {
        return j2;
    }

    public abstract String asText();

    public String asText(String str) {
        String strAsText = asText();
        return strAsText == null ? str : strAsText;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() throws IOException {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToExactIntegral() {
        return isIntegralNumber();
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public abstract <T extends ela> T deepCopy();

    public double doubleValue() {
        return 0.0d;
    }

    public Iterator<ela> elements() {
        return nc3.n();
    }

    public abstract boolean equals(Object obj);

    public boolean equals(Comparator<ela> comparator, ela elaVar) {
        return comparator.compare(this, elaVar) == 0;
    }

    public Iterator<String> fieldNames() {
        return nc3.n();
    }

    public Iterator<Map.Entry<String, ela>> fields() {
        return nc3.n();
    }

    public abstract ela findParent(String str);

    public final List<ela> findParents(String str) {
        List<ela> listFindParents = findParents(str, null);
        return listFindParents == null ? Collections.emptyList() : listFindParents;
    }

    public abstract List<ela> findParents(String str, List<ela> list);

    public abstract ela findPath(String str);

    public abstract ela findValue(String str);

    public final List<ela> findValues(String str) {
        List<ela> listFindValues = findValues(str, null);
        return listFindValues == null ? Collections.emptyList() : listFindValues;
    }

    public abstract List<ela> findValues(String str, List<ela> list);

    public final List<String> findValuesAsText(String str) {
        List<String> listFindValuesAsText = findValuesAsText(str, null);
        return listFindValuesAsText == null ? Collections.emptyList() : listFindValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return 0.0f;
    }

    @Override // 
    public abstract ela get(int i);

    @Override // 
    public ela get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(String str) {
        ela elaVar = get(str);
        return (elaVar == null || elaVar.isNull()) ? false : true;
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isBoolean() {
        return getNodeType() == JsonNodeType.BOOLEAN;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        return nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isMissingNode() {
        return false;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public boolean isShort() {
        return false;
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    public final boolean isValueNode() {
        int i = a.a[getNodeType().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    @Override // java.lang.Iterable
    public final Iterator<ela> iterator() {
        return elements();
    }

    public long longValue() {
        return 0L;
    }

    public Number numberValue() {
        return null;
    }

    @Override // 
    public abstract ela path(int i);

    @Override // 
    public abstract ela path(String str);

    public <T extends ela> T require() throws IllegalArgumentException {
        return (T) _this();
    }

    public <T extends ela> T requireNonNull() throws IllegalArgumentException {
        return (T) _this();
    }

    public ela required(String str) throws IllegalArgumentException {
        return (ela) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getName());
    }

    public ela requiredAt(String str) throws IllegalArgumentException {
        return requiredAt(mla.e(str));
    }

    public short shortValue() {
        return (short) 0;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public String toPrettyString() {
        return toString();
    }

    public abstract String toString();

    public <T extends ela> T with(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call with() on it");
    }

    public <T extends ela> T withArray(String str) {
        throw new UnsupportedOperationException("JsonNode not of type ObjectNode (but " + getClass().getName() + "), cannot call withArray() on it");
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public boolean has(int i) {
        return get(i) != null;
    }

    public ela required(int i) throws IllegalArgumentException {
        return (ela) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getName());
    }

    public final ela requiredAt(mla mlaVar) throws IllegalArgumentException {
        ela elaVar_at = this;
        for (mla mlaVarK = mlaVar; !mlaVarK.j(); mlaVarK = mlaVarK.k()) {
            elaVar_at = elaVar_at._at(mlaVarK);
            if (elaVar_at == null) {
                _reportRequiredViolation("No node at '%s' (unmatched part: '%s')", mlaVar, mlaVarK);
            }
        }
        return elaVar_at;
    }

    public final ela at(mla mlaVar) {
        if (mlaVar.j()) {
            return this;
        }
        ela elaVar_at = _at(mlaVar);
        if (elaVar_at == null) {
            return MissingNode.getInstance();
        }
        return elaVar_at.at(mlaVar.k());
    }

    public boolean hasNonNull(int i) {
        ela elaVar = get(i);
        return (elaVar == null || elaVar.isNull()) ? false : true;
    }

    public final ela at(String str) {
        return at(mla.e(str));
    }
}
