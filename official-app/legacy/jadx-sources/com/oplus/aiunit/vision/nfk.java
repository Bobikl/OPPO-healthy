package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.BitSet;
import java.util.List;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes9.dex */
public class nfk {
    public static final BitSet a = new BitSet(256);
    public static final BitSet b = new BitSet(256);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BitSet f14508c = new BitSet(256);
    public static final BitSet d = new BitSet(256);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BitSet f14509e = new BitSet(256);
    public static final BitSet f = new BitSet(256);
    public static final BitSet g = new BitSet(256);

    static {
        for (int i = 97; i <= 122; i++) {
            a.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            a.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            a.set(i3);
        }
        BitSet bitSet = a;
        bitSet.set(95);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(42);
        g.or(bitSet);
        bitSet.set(33);
        bitSet.set(126);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        BitSet bitSet2 = b;
        bitSet2.set(44);
        bitSet2.set(59);
        bitSet2.set(58);
        bitSet2.set(36);
        bitSet2.set(38);
        bitSet2.set(43);
        bitSet2.set(61);
        BitSet bitSet3 = f14508c;
        bitSet3.or(bitSet);
        bitSet3.or(bitSet2);
        BitSet bitSet4 = d;
        bitSet4.or(bitSet);
        bitSet4.set(47);
        bitSet4.set(59);
        bitSet4.set(58);
        bitSet4.set(64);
        bitSet4.set(38);
        bitSet4.set(61);
        bitSet4.set(43);
        bitSet4.set(36);
        bitSet4.set(44);
        BitSet bitSet5 = f;
        bitSet5.set(59);
        bitSet5.set(47);
        bitSet5.set(63);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        bitSet5.set(91);
        bitSet5.set(93);
        BitSet bitSet6 = f14509e;
        bitSet6.or(bitSet5);
        bitSet6.or(bitSet);
    }

    public static String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        return d(str, str2 != null ? Charset.forName(str2) : h1j.UTF8, g, true);
    }

    public static String b(List<? extends sec> list, char c2, String str) {
        StringBuilder sb = new StringBuilder();
        for (sec secVar : list) {
            String strA = a(secVar.getName(), str);
            String strA2 = a(secVar.getValue(), str);
            if (sb.length() > 0) {
                sb.append(c2);
            }
            sb.append(strA);
            if (strA2 != null) {
                sb.append(HttpUtils.EQUAL_SIGN);
                sb.append(strA2);
            }
        }
        return sb.toString();
    }

    public static String c(List<? extends sec> list, String str) {
        return b(list, Typography.amp, str);
    }

    public static String d(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer byteBufferEncode = charset.encode(str);
        while (byteBufferEncode.hasRemaining()) {
            int i = byteBufferEncode.get() & 255;
            if (bitSet.get(i)) {
                sb.append((char) i);
            } else if (z && i == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(i & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }
}
