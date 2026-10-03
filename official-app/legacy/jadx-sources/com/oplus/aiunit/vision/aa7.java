package com.oplus.aiunit.vision;

import com.garmin.fit.Fit;
import com.garmin.fit.FitRuntimeException;
import com.squareup.moshi.Json;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class aa7 {
    public static boolean b = false;
    public ArrayList<Object> a = new ArrayList<>();

    public aa7() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(String str) {
        this.a.add(str);
    }

    public String A(int i, p2j p2jVar) {
        Object objF = F(i, p2jVar);
        int iD = D(p2jVar);
        if (objF == null) {
            return null;
        }
        if (b || !Fit.baseTypeInvalidMap.get(Integer.valueOf(iD)).equals(objF)) {
            return objF.toString();
        }
        return null;
    }

    public abstract p2j B(int i);

    public abstract int C();

    public final int D(p2j p2jVar) {
        return p2jVar == null ? C() : p2jVar.b;
    }

    public Object E() {
        return F(0, null);
    }

    public Object F(int i, p2j p2jVar) {
        double dV;
        double dS;
        if (i >= this.a.size()) {
            return null;
        }
        if (p2jVar == null) {
            dV = v();
            dS = s();
        } else {
            dV = p2jVar.f15166c;
            dS = p2jVar.d;
        }
        int iD = D(p2jVar);
        Object obj = this.a.get(i);
        if (!(obj instanceof Number)) {
            return obj;
        }
        HashMap<Integer, Object> map = Fit.baseTypeInvalidMap;
        if (map.get(Integer.valueOf(iD)).equals(obj)) {
            return map.get(Integer.valueOf(iD));
        }
        return (dV == 1.0d && dS == 0.0d) ? obj : Double.valueOf((((Number) obj).doubleValue() / dV) - dS);
    }

    public boolean G() {
        return H(null);
    }

    public boolean H(p2j p2jVar) {
        int iC = p2jVar == null ? C() : p2jVar.d();
        return iC == 1 || iC == 131 || iC == 133 || iC == 142;
    }

    public final Object J(Integer num, Object obj) {
        HashMap<Integer, Object> map = Fit.baseTypeMinMap;
        if (map.get(num) != null) {
            HashMap<Integer, Object> map2 = Fit.baseTypeMaxMap;
            if (map2.get(num) != null) {
                try {
                    BigDecimal bigDecimal = new BigDecimal(map.get(num).toString());
                    BigDecimal bigDecimal2 = new BigDecimal(map2.get(num).toString());
                    BigDecimal bigDecimal3 = new BigDecimal(obj.toString());
                    if (bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) {
                        return obj;
                    }
                    return Fit.baseTypeInvalidMap.get(num);
                } catch (NumberFormatException unused) {
                    return Fit.baseTypeInvalidMap.get(num);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7 A[Catch: IOException -> 0x014f, FALL_THROUGH, TryCatch #1 {IOException -> 0x014f, blocks: (B:3:0x0001, B:9:0x0048, B:27:0x0080, B:28:0x0083, B:30:0x0087, B:44:0x012a, B:45:0x012f, B:48:0x0136, B:31:0x0093, B:32:0x009d, B:33:0x00a7, B:35:0x00b5, B:37:0x00d3, B:38:0x00f6, B:39:0x00ff, B:40:0x0108, B:41:0x0114, B:42:0x011d, B:50:0x0145, B:52:0x0149), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[Catch: IOException -> 0x014f, LOOP:1: B:34:0x00b3->B:35:0x00b5, LOOP_END, TryCatch #1 {IOException -> 0x014f, blocks: (B:3:0x0001, B:9:0x0048, B:27:0x0080, B:28:0x0083, B:30:0x0087, B:44:0x012a, B:45:0x012f, B:48:0x0136, B:31:0x0093, B:32:0x009d, B:33:0x00a7, B:35:0x00b5, B:37:0x00d3, B:38:0x00f6, B:39:0x00ff, B:40:0x0108, B:41:0x0114, B:42:0x011d, B:50:0x0145, B:52:0x0149), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3 A[Catch: IOException -> 0x014f, TryCatch #1 {IOException -> 0x014f, blocks: (B:3:0x0001, B:9:0x0048, B:27:0x0080, B:28:0x0083, B:30:0x0087, B:44:0x012a, B:45:0x012f, B:48:0x0136, B:31:0x0093, B:32:0x009d, B:33:0x00a7, B:35:0x00b5, B:37:0x00d3, B:38:0x00f6, B:39:0x00ff, B:40:0x0108, B:41:0x0114, B:42:0x011d, B:50:0x0145, B:52:0x0149), top: B:57:0x0001 }] */
    public boolean K(InputStream inputStream, int i) {
        Object objValueOf;
        Long lValueOf;
        int i2;
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            if (C() == 7) {
                try {
                    byte[] bArr = new byte[i];
                    inputStream.read(bArr, 0, i);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF-8").newDecoder();
                    charsetDecoderNewDecoder.onMalformedInput(CodingErrorAction.IGNORE);
                    charsetDecoderNewDecoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
                    Arrays.stream(charsetDecoderNewDecoder.decode(byteBufferWrap).toString().split(Json.UNSET_NAME)).forEach(new Consumer() { // from class: com.oplus.aiunit.vision.z97
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.i.I((String) obj);
                        }
                    });
                } catch (IOException unused) {
                    return true;
                }
            } else {
                int iC = C();
                int i3 = Fit.baseTypeSizes[iC & 31];
                Object obj = Fit.baseTypeInvalidMap.get(Integer.valueOf(iC));
                boolean z = true;
                while (i > 0) {
                    if (iC == 0) {
                        objValueOf = Short.valueOf((short) (dataInputStream.readByte() & 255));
                    } else if (iC == 1) {
                        objValueOf = Byte.valueOf(dataInputStream.readByte());
                    } else if (iC == 2 || iC == 10 || iC == 13) {
                        objValueOf = Short.valueOf((short) (dataInputStream.readByte() & 255));
                    } else if (iC == 136) {
                        objValueOf = Float.valueOf(dataInputStream.readFloat());
                    } else if (iC == 137) {
                        objValueOf = Double.valueOf(dataInputStream.readDouble());
                    } else if (iC == 139) {
                        objValueOf = Integer.valueOf(Integer.valueOf(Integer.valueOf(dataInputStream.readByte() & 255).intValue() << 8).intValue() | (dataInputStream.readByte() & 255));
                    } else if (iC != 140) {
                        switch (iC) {
                            case 131:
                                objValueOf = Short.valueOf(dataInputStream.readShort());
                                break;
                            case 132:
                                objValueOf = Integer.valueOf(Integer.valueOf(Integer.valueOf(dataInputStream.readByte() & 255).intValue() << 8).intValue() | (dataInputStream.readByte() & 255));
                                break;
                            case 133:
                                objValueOf = Integer.valueOf(dataInputStream.readInt());
                                break;
                            default:
                                switch (iC) {
                                    case 142:
                                        break;
                                    case 143:
                                    case 144:
                                        byte[] bArr2 = new byte[i3];
                                        dataInputStream.read(bArr2, 0, i3);
                                        objValueOf = new BigInteger(1, bArr2);
                                        break;
                                    default:
                                        return false;
                                }
                            case 134:
                                lValueOf = Long.valueOf(dataInputStream.readByte() & 255);
                                for (i2 = 1; i2 < i3; i2++) {
                                    lValueOf = Long.valueOf(Long.valueOf(lValueOf.longValue() << 8).longValue() | ((long) (dataInputStream.readByte() & 255)));
                                }
                                objValueOf = lValueOf;
                                break;
                        }
                    } else {
                        lValueOf = Long.valueOf(dataInputStream.readByte() & 255);
                        while (i2 < i3) {
                            lValueOf = Long.valueOf(Long.valueOf(lValueOf.longValue() << 8).longValue() | ((long) (dataInputStream.readByte() & 255)));
                        }
                        objValueOf = lValueOf;
                    }
                    if (objValueOf != null) {
                        this.a.add(objValueOf);
                    }
                    if (!objValueOf.equals(obj)) {
                        z = false;
                    }
                    i -= Fit.baseTypeSizes[C() & 31];
                }
                if (z && !b) {
                    this.a.clear();
                }
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public void L(int i, Object obj, int i2) {
        p2j p2jVarB;
        if (i2 != 65535) {
            p2jVarB = B(i2);
            if (p2jVarB == null) {
                throw new FitRuntimeException("com.garmin.fit.Field.setValue(): " + i2 + " is not a valid subfield index of " + p() + ".");
            }
        } else {
            p2jVarB = null;
        }
        N(i, obj, p2jVarB);
    }

    public void M(Object obj) {
        N(0, obj, null);
    }

    public void N(int i, Object obj, p2j p2jVar) {
        double dV;
        double dS;
        while (i >= r()) {
            d(new Object());
        }
        if (p2jVar == null) {
            dV = v();
            dS = s();
        } else {
            dV = p2jVar.f15166c;
            dS = p2jVar.d;
        }
        if (obj == null) {
            this.a.set(i, null);
            return;
        }
        if (!(obj instanceof Number) || (dV == 1.0d && dS == 0.0d)) {
            b(i, obj);
            return;
        }
        double dDoubleValue = (((Number) obj).doubleValue() + dS) * dV;
        int iC = C();
        if (iC != 0) {
            if (iC == 1) {
                this.a.set(i, J(Integer.valueOf(C()), Long.valueOf(Math.round(dDoubleValue))));
                return;
            }
            if (iC != 2) {
                if (iC == 7) {
                    this.a.set(i, Double.valueOf(dDoubleValue).toString());
                    return;
                }
                if (iC != 10) {
                    if (iC == 13) {
                        this.a.set(i, Long.valueOf(Math.round(dDoubleValue)));
                        return;
                    }
                    if (iC == 136) {
                        this.a.set(i, J(Integer.valueOf(C()), Double.valueOf(dDoubleValue)));
                        return;
                    }
                    if (iC == 137) {
                        this.a.set(i, J(Integer.valueOf(C()), Double.valueOf(dDoubleValue)));
                        return;
                    }
                    if (iC != 139) {
                        if (iC != 140) {
                            switch (iC) {
                                case 131:
                                    break;
                                case 132:
                                case 133:
                                    break;
                                case 134:
                                    break;
                                default:
                                    switch (iC) {
                                        case 143:
                                        case 144:
                                            Long lValueOf = Long.valueOf(Math.round(dDoubleValue));
                                            int i2 = Fit.baseTypeSizes[C() & 31];
                                            byte[] bArr = new byte[i2];
                                            for (int i3 = 0; i3 < i2; i3++) {
                                                bArr[i3] = (byte) (lValueOf.longValue() >>> (i3 * 8));
                                            }
                                            this.a.set(i, J(Integer.valueOf(C()), new BigInteger(1, bArr)));
                                            break;
                                    }
                                    return;
                            }
                        }
                        this.a.set(i, J(Integer.valueOf(C()), Long.valueOf(Math.round(dDoubleValue))));
                        return;
                    }
                    this.a.set(i, J(Integer.valueOf(C()), Long.valueOf(Math.round(dDoubleValue))));
                    return;
                }
            }
        }
        this.a.set(i, J(Integer.valueOf(C()), Long.valueOf(Math.round(dDoubleValue))));
    }

    public void O(OutputStream outputStream) {
        Iterator<Object> it = this.a.iterator();
        while (it.hasNext()) {
            Q(outputStream, it.next());
        }
    }

    public void P(OutputStream outputStream, fa7 fa7Var) {
        int iA = fa7Var.a() - y();
        O(outputStream);
        while (iA > 0) {
            Q(outputStream, null);
            iA -= Fit.baseTypeSizes[C() & 31];
        }
    }

    public final void Q(OutputStream outputStream, Object obj) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            if (obj != null) {
                int iC = C();
                if (iC != 0 && iC != 1 && iC != 2) {
                    if (iC == 7) {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                        outputStreamWriter.write(obj.toString());
                        outputStreamWriter.flush();
                        outputStream.write(0);
                        return;
                    }
                    if (iC != 10 && iC != 13) {
                        if (iC == 136) {
                            dataOutputStream.writeFloat(((Number) obj).floatValue());
                            return;
                        }
                        if (iC == 137) {
                            dataOutputStream.writeDouble(((Number) obj).doubleValue());
                            return;
                        }
                        if (iC != 139) {
                            if (iC != 140) {
                                switch (iC) {
                                    case 131:
                                    case 132:
                                        break;
                                    case 133:
                                    case 134:
                                        break;
                                    default:
                                        switch (iC) {
                                            case 142:
                                            case 143:
                                            case 144:
                                                dataOutputStream.writeLong(((Number) obj).longValue());
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                }
                            }
                            dataOutputStream.writeInt((int) Math.round(((Number) obj).doubleValue()));
                            return;
                        }
                        dataOutputStream.writeShort((int) Math.round(((Number) obj).doubleValue()));
                        return;
                    }
                }
                if (obj instanceof String) {
                    System.err.printf("Field.write(): Field %s value should not be string value %s\n", h(), obj);
                }
                dataOutputStream.writeByte((int) Math.round(((Number) obj).doubleValue()));
            }
            int iC2 = C();
            if (iC2 == 0) {
                dataOutputStream.writeByte(Fit.ENUM_INVALID.shortValue());
                return;
            }
            if (iC2 == 1) {
                dataOutputStream.writeByte(Fit.SINT8_INVALID.byteValue());
                return;
            }
            if (iC2 == 2) {
                dataOutputStream.writeByte(Fit.UINT8_INVALID.shortValue());
                return;
            }
            if (iC2 == 7) {
                dataOutputStream.writeByte(0);
                return;
            }
            if (iC2 == 10) {
                dataOutputStream.writeByte(Fit.UINT8Z_INVALID.shortValue());
                return;
            }
            if (iC2 == 13) {
                dataOutputStream.writeByte(Fit.BYTE_INVALID.shortValue());
                return;
            }
            if (iC2 == 136) {
                dataOutputStream.writeFloat(Fit.FLOAT32_INVALID.floatValue());
                return;
            }
            if (iC2 == 137) {
                dataOutputStream.writeDouble(Fit.FLOAT64_INVALID.doubleValue());
                return;
            }
            if (iC2 == 139) {
                dataOutputStream.writeShort(Fit.UINT16Z_INVALID.intValue());
                return;
            }
            if (iC2 == 140) {
                dataOutputStream.writeInt((int) Fit.UINT32Z_INVALID.longValue());
                return;
            }
            switch (iC2) {
                case 131:
                    dataOutputStream.writeShort(Fit.SINT16_INVALID.shortValue());
                    break;
                case 132:
                    dataOutputStream.writeShort(Fit.UINT16_INVALID.intValue());
                    break;
                case 133:
                    dataOutputStream.writeInt(Fit.SINT32_INVALID.intValue());
                    break;
                case 134:
                    dataOutputStream.writeInt((int) Fit.UINT32_INVALID.longValue());
                    break;
                default:
                    switch (iC2) {
                        case 142:
                            dataOutputStream.writeLong(Fit.SINT64_INVALID.longValue());
                            break;
                        case 143:
                            dataOutputStream.writeLong(Fit.UINT64_INVALID.longValue());
                            break;
                        case 144:
                            dataOutputStream.writeLong(Fit.UINT64Z_INVALID.longValue());
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } catch (IOException unused) {
        }
    }

    public final void b(int i, Object obj) {
        boolean z = obj instanceof String;
        if (!z || !obj.equals("")) {
            if (!z) {
                this.a.set(i, J(Integer.valueOf(C()), obj));
                return;
            } else {
                if (((String) obj).getBytes(StandardCharsets.UTF_8).length > 254) {
                    throw new FitRuntimeException(String.format("Invalid string size. Byte count can not be greater than %d bytes.", 254));
                }
                this.a.set(i, obj);
                return;
            }
        }
        int iC = C();
        if (iC != 0 && iC != 1 && iC != 2) {
            if (iC == 7) {
                this.a.set(i, J(Integer.valueOf(C()), obj));
                return;
            }
            if (iC != 10 && iC != 13 && iC != 136 && iC != 137 && iC != 139 && iC != 140) {
                switch (iC) {
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                        break;
                    default:
                        switch (iC) {
                            case 142:
                            case 143:
                            case 144:
                                break;
                            default:
                                return;
                        }
                        break;
                }
            }
        }
        this.a.set(i, Fit.baseTypeInvalidMap.get(Integer.valueOf(C())));
    }

    public void c(Object obj) {
        if (obj == null) {
            this.a.add(null);
            return;
        }
        if (obj instanceof Double) {
            int iC = C();
            if (iC != 0) {
                if (iC == 1) {
                    this.a.add(Byte.valueOf((byte) Math.round(((Number) obj).doubleValue())));
                    return;
                }
                if (iC != 2) {
                    if (iC == 7) {
                        this.a.add(obj.toString());
                        return;
                    }
                    if (iC != 10 && iC != 13) {
                        if (iC == 136) {
                            this.a.add(obj);
                            return;
                        }
                        if (iC == 137) {
                            this.a.add(obj);
                            return;
                        }
                        if (iC != 139) {
                            if (iC != 140) {
                                switch (iC) {
                                }
                            }
                            this.a.add(Long.valueOf(Math.round(((Number) obj).doubleValue())));
                            return;
                        }
                        this.a.add(Integer.valueOf((int) Math.round(((Number) obj).doubleValue())));
                        return;
                    }
                }
            }
            this.a.add(Short.valueOf((short) Math.round(((Number) obj).doubleValue())));
            return;
        }
        if (!(obj instanceof String) || !obj.equals("")) {
            this.a.add(obj);
        }
        int iC2 = C();
        if (iC2 == 0) {
            this.a.add(Fit.ENUM_INVALID);
            return;
        }
        if (iC2 == 1) {
            this.a.add(Fit.SINT8_INVALID);
            return;
        }
        if (iC2 == 2) {
            this.a.add(Fit.UINT8_INVALID);
            return;
        }
        if (iC2 == 7) {
            this.a.add(obj);
            return;
        }
        if (iC2 == 10) {
            this.a.add(Fit.UINT8Z_INVALID);
            return;
        }
        if (iC2 == 13) {
            this.a.add(Fit.BYTE_INVALID);
            return;
        }
        if (iC2 == 136) {
            this.a.add(Fit.FLOAT32_INVALID);
            return;
        }
        if (iC2 == 137) {
            this.a.add(Fit.FLOAT64_INVALID);
            return;
        }
        if (iC2 == 139) {
            this.a.add(Fit.UINT16Z_INVALID);
            return;
        }
        if (iC2 == 140) {
            this.a.add(Fit.UINT32Z_INVALID);
            return;
        }
        switch (iC2) {
            case 131:
                this.a.add(Fit.SINT16_INVALID);
                break;
            case 132:
                this.a.add(Fit.UINT16_INVALID);
                break;
            case 133:
                this.a.add(Fit.SINT32_INVALID);
                break;
            case 134:
                this.a.add(Fit.UINT32_INVALID);
                break;
        }
    }

    public void d(Object obj) {
        if (!(obj instanceof Number) || C() != 7) {
            this.a.add(obj);
            return;
        }
        String strA = A(0, null);
        Number number = (Number) obj;
        if (strA == null) {
            strA = "";
        }
        N(0, strA + String.valueOf((char) number.intValue()), null);
    }

    public Long e(int i, int i2, boolean z) {
        int i3 = i;
        long jLongValue = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i5 + 1;
            Object objU = u(i5, null);
            if (objU == null || !(objU instanceof Number)) {
                return null;
            }
            Long lValueOf = Long.valueOf(Long.valueOf(((Number) objU).longValue()).longValue() >> i3);
            int[] iArr = Fit.baseTypeSizes;
            int i7 = (iArr[C() & 31] * 8) - i3;
            i3 -= iArr[C() & 31] * 8;
            if (i7 > 0) {
                int i8 = i2 - i4;
                if (i7 > i8) {
                    i7 = i8;
                }
                jLongValue |= (lValueOf.longValue() & ((1 << i7) - 1)) << i4;
                i4 += i7;
                i3 = 0;
            }
            i5 = i6;
        }
        if (z) {
            long j2 = 1 << (i2 - 1);
            if ((jLongValue & j2) != 0) {
                jLongValue = (-j2) + (jLongValue & (j2 - 1));
            }
        }
        return Long.valueOf(jLongValue);
    }

    public Byte f(int i, int i2) {
        return g(i, B(i2));
    }

    public Byte g(int i, p2j p2jVar) {
        Object objF = F(i, p2jVar);
        if (objF == null) {
            return null;
        }
        return Byte.valueOf(((Number) objF).byteValue());
    }

    public abstract String h();

    public Float i(int i, int i2) {
        return j(i, B(i2));
    }

    public Float j(int i, p2j p2jVar) {
        Object objF = F(i, p2jVar);
        if (objF == null) {
            return null;
        }
        return new Float(((Number) objF).doubleValue());
    }

    public Integer k(int i, int i2) {
        return l(i, B(i2));
    }

    public Integer l(int i, p2j p2jVar) {
        Object objF = F(i, p2jVar);
        if (objF == null) {
            return null;
        }
        return Integer.valueOf(((Number) objF).intValue());
    }

    public Long m() {
        return o(0, null);
    }

    public Long n(int i, int i2) {
        return o(i, B(i2));
    }

    public Long o(int i, p2j p2jVar) {
        Object objF = F(i, p2jVar);
        if (objF == null) {
            return null;
        }
        return Long.valueOf(((Number) objF).longValue());
    }

    public String p() {
        return q(null);
    }

    public final String q(p2j p2jVar) {
        return p2jVar == null ? h() : p2jVar.a;
    }

    public int r() {
        return this.a.size();
    }

    public abstract double s();

    public Object t(int i) {
        return u(i, null);
    }

    public Object u(int i, p2j p2jVar) {
        if (i >= this.a.size()) {
            return null;
        }
        return this.a.get(i);
    }

    public abstract double v();

    public Short w(int i, int i2) {
        return x(i, B(i2));
    }

    public Short x(int i, p2j p2jVar) {
        Object objF = F(i, p2jVar);
        if (objF == null) {
            return null;
        }
        return Short.valueOf(((Number) objF).shortValue());
    }

    public int y() {
        int iC = C();
        if (iC != 0 && iC != 1 && iC != 2) {
            int length = 0;
            if (iC == 7) {
                Iterator<Object> it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        length += it.next().toString().getBytes("UTF-8").length + 1;
                    } catch (UnsupportedEncodingException unused) {
                    }
                }
                return length;
            }
            if (iC != 10 && iC != 13 && iC != 136 && iC != 137 && iC != 139 && iC != 140) {
                switch (iC) {
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                        break;
                    default:
                        switch (iC) {
                            case 142:
                            case 143:
                            case 144:
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            }
        }
        return r() * Fit.baseTypeSizes[C() & 31];
    }

    public String z(int i, int i2) {
        return A(i, B(i2));
    }

    public aa7(aa7 aa7Var) {
        if (aa7Var != null) {
            Iterator<Object> it = aa7Var.a.iterator();
            while (it.hasNext()) {
                this.a.add(it.next());
            }
        }
    }
}
