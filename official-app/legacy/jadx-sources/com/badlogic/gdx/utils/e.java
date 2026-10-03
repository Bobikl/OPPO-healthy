package com.badlogic.gdx.utils;

import com.heytap.accessory.constant.FastPairConstants;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.gz;
import com.oplus.aiunit.vision.kb7;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.nwi;
import com.oplus.aiunit.vision.r51;
import com.oplus.aiunit.vision.t0j;
import com.oplus.aiunit.vision.wg0;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import okio.Utf8;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes13.dex */
public class e implements r51 {
    public static final byte[] f = d();
    public static final short[] g = h();
    public static final char[] h = l();
    public static final byte[] i = j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f1306j = i();
    public static final short[] k = f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f1307l = g();
    public static final byte[] m = m();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f1308n = k();
    public static final byte[] o = e();
    public final wg0<JsonValue> a = new wg0<>(8);
    public final wg0<JsonValue> b = new wg0<>(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JsonValue f1309c;
    public JsonValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1310e;

    public static byte[] d() {
        return new byte[]{0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 2, 0, 7, 2, 0, 8, 2, 1, 3, 2, 1, 5};
    }

    public static byte[] e() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
    }

    public static short[] f() {
        return new short[]{0, 0, 11, 14, 16, 19, 28, 34, 40, 43, 54, 62, 70, 79, 81, 90, 93, 96, 105, 108, gz.certificate_unobtainable, gz.bad_certificate_status_response, 116, 119, 130, 138, 146, 157, 159, 170, 173, 176, 187, 190, 193, 196, 201, 206, 207};
    }

    public static byte[] g() {
        return new byte[]{1, 1, 2, 3, 4, 3, 5, 3, 6, 1, 0, 7, 7, 3, 8, 3, 9, 9, 3, 11, 11, 12, 13, 14, 3, 15, 11, 10, 16, 16, 17, 18, 16, 3, 19, 19, 20, 21, 19, 3, 22, 22, 3, 21, 21, 24, 3, 25, 3, 26, 3, 27, 21, 23, 28, 29, 29, 28, 30, 31, 32, 3, 33, 34, 34, 33, 13, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER, 15, 3, 34, 34, 12, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 37, 3, 15, 34, 10, 16, 3, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 12, 3, 38, 3, 3, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 10, 39, 39, 3, 40, 40, 3, 13, 13, 12, 3, 41, 3, 15, 13, 10, 42, 42, 3, 43, 43, 3, 28, 3, 44, 44, 3, 45, 45, 3, 47, 47, 48, 49, 50, 3, 51, 52, 53, 47, 46, 54, 55, 55, 54, 56, 57, 58, 3, 59, 60, 60, 59, 49, Base64.padSymbol, 52, 3, 60, 60, 48, 62, Utf8.REPLACEMENT_BYTE, 3, 51, 52, 53, 60, 46, 54, 3, 62, 62, 48, 3, 64, 3, 51, 3, 53, 62, 46, 65, 65, 3, 66, 66, 3, 49, 49, 48, 3, 67, 3, 51, 52, 53, 49, 46, 68, 68, 3, 69, 69, 3, 70, 70, 3, 8, 8, 71, 8, 3, 72, 72, 73, 72, 3, 3, 3, 0};
    }

    public static short[] h() {
        return new short[]{0, 0, 11, 13, 14, 16, 25, 31, 37, 39, 50, 57, 64, 73, 74, 83, 85, 87, 96, 98, 100, 101, 103, 105, 116, 123, 130, 141, 142, 153, 155, 157, 168, 170, 172, 174, 179, 184, 184};
    }

    public static byte[] i() {
        return new byte[]{0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
    }

    public static byte[] j() {
        return new byte[]{0, 9, 2, 1, 2, 7, 4, 4, 2, 9, 7, 7, 7, 1, 7, 2, 2, 7, 2, 2, 1, 2, 2, 9, 7, 7, 9, 1, 9, 2, 2, 9, 2, 2, 2, 3, 3, 0, 0};
    }

    public static byte[] k() {
        return new byte[]{13, 0, 15, 0, 0, 7, 3, 11, 1, 11, 17, 0, 20, 0, 0, 5, 1, 1, 1, 0, 0, 0, 11, 13, 15, 0, 7, 3, 1, 1, 1, 1, 23, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 11, 13, 0, 15, 0, 0, 7, 9, 3, 1, 1, 1, 1, 26, 0, 0, 0, 0, 0, 0, 11, 11, 0, 11, 11, 11, 1, 0, 0};
    }

    public static char[] l() {
        return new char[]{StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '[', ']', '{', '\t', '\n', '*', mla.SEPARATOR, '\"', '*', mla.SEPARATOR, StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '}', '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, mla.SEPARATOR, ':', '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, mla.SEPARATOR, ':', '\t', '\n', '*', mla.SEPARATOR, StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '[', ']', '{', '\t', '\n', '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, StringUtil.COMMA, mla.SEPARATOR, '}', '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, StringUtil.COMMA, mla.SEPARATOR, '}', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '}', '\t', '\n', '\"', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '}', '\t', '\n', '*', mla.SEPARATOR, '*', mla.SEPARATOR, StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '}', '\t', '\n', '*', mla.SEPARATOR, '*', mla.SEPARATOR, '\"', '*', mla.SEPARATOR, '*', mla.SEPARATOR, StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '[', ']', '{', '\t', '\n', '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, StringUtil.COMMA, mla.SEPARATOR, ']', '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, StringUtil.COMMA, mla.SEPARATOR, ']', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '[', ']', '{', '\t', '\n', '\"', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '[', ']', '{', '\t', '\n', '*', mla.SEPARATOR, '*', mla.SEPARATOR, StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, '\"', StringUtil.COMMA, mla.SEPARATOR, ':', '[', ']', '{', '\t', '\n', '*', mla.SEPARATOR, '*', mla.SEPARATOR, '*', mla.SEPARATOR, StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, mla.SEPARATOR, '\t', '\n', StringUtil.CARRIAGE_RETURN, StringUtil.SPACE, mla.SEPARATOR, '\t', '\n', 0};
    }

    public static byte[] m() {
        return new byte[]{FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER, 1, 3, 0, 4, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 1, 6, 5, 13, 17, 22, 37, 7, 8, 9, 7, 8, 9, 7, 10, 20, 21, 11, 11, 11, 12, 17, 19, 37, 11, 12, 19, 14, 16, 15, 14, 12, 18, 17, 11, 9, 5, 24, 23, 27, 31, 34, 25, 38, 25, 25, 26, 31, 33, 38, 25, 26, 33, 28, 30, 29, 28, 26, 32, 31, 25, 23, 2, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 2};
    }

    @Override // com.oplus.aiunit.vision.r51
    public JsonValue a(kb7 kb7Var) {
        try {
            try {
                return p(kb7Var.r("UTF-8"));
            } catch (Exception e2) {
                throw new SerializationException("Error parsing file: " + kb7Var, e2);
            }
        } catch (Exception e3) {
            throw new SerializationException("Error reading file: " + kb7Var, e3);
        }
    }

    public final void b(String str, JsonValue jsonValue) {
        jsonValue.N(str);
        JsonValue jsonValue2 = this.d;
        if (jsonValue2 == null) {
            this.d = jsonValue;
            this.f1309c = jsonValue;
            return;
        }
        if (!jsonValue2.t() && !this.d.B()) {
            this.f1309c = this.d;
            return;
        }
        JsonValue jsonValue3 = this.d;
        jsonValue.o = jsonValue3;
        if (jsonValue3.r == 0) {
            jsonValue3.f1284n = jsonValue;
        } else {
            JsonValue jsonValuePop = this.b.pop();
            jsonValuePop.p = jsonValue;
            jsonValue.q = jsonValuePop;
        }
        this.b.a(jsonValue);
        this.d.r++;
    }

    public void c(String str, boolean z) {
        b(str, new JsonValue(z));
    }

    public void n(String str, double d, String str2) {
        b(str, new JsonValue(d, str2));
    }

    public void o(String str, long j2, String str2) {
        b(str, new JsonValue(j2, str2));
    }

    public JsonValue p(Reader reader) {
        char[] cArr = new char[1024];
        int i2 = 0;
        while (true) {
            try {
                try {
                    int i3 = reader.read(cArr, i2, cArr.length - i2);
                    if (i3 == -1) {
                        nwi.a(reader);
                        return q(cArr, 0, i2);
                    }
                    if (i3 == 0) {
                        char[] cArr2 = new char[cArr.length * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        cArr = cArr2;
                    } else {
                        i2 += i3;
                    }
                } catch (IOException e2) {
                    throw new SerializationException("Error reading input.", e2);
                }
            } catch (Throwable th) {
                nwi.a(reader);
                throw th;
            }
            nwi.a(reader);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x016f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x01a9 A[LOOP:7: B:105:0x0170->B:132:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9 A[Catch: RuntimeException -> 0x0097, LOOP:5: B:134:0x01b1->B:136:0x01b9, LOOP_END, TryCatch #3 {RuntimeException -> 0x0097, blocks: (B:257:0x0369, B:264:0x0383, B:270:0x0397, B:275:0x03a2, B:278:0x03ab, B:27:0x007c, B:63:0x010c, B:134:0x01b1, B:136:0x01b9, B:138:0x01c5, B:141:0x01cf), top: B:358:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5 A[Catch: RuntimeException -> 0x0097, TryCatch #3 {RuntimeException -> 0x0097, blocks: (B:257:0x0369, B:264:0x0383, B:270:0x0397, B:275:0x03a2, B:278:0x03ab, B:27:0x007c, B:63:0x010c, B:134:0x01b1, B:136:0x01b9, B:138:0x01c5, B:141:0x01cf), top: B:358:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:140:0x01cd A[ADDED_TO_REGION, LOOP:8: B:140:0x01cd->B:144:0x01d5, LOOP_START, PHI: r5
  0x01cd: PHI (r5v81 int) = (r5v74 int), (r5v83 int) binds: [B:139:0x01cb, B:144:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf A[Catch: RuntimeException -> 0x0097, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0097, blocks: (B:257:0x0369, B:264:0x0383, B:270:0x0397, B:275:0x03a2, B:278:0x03ab, B:27:0x007c, B:63:0x010c, B:134:0x01b1, B:136:0x01b9, B:138:0x01c5, B:141:0x01cf), top: B:358:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01dd A[LOOP:9: B:146:0x01dd->B:158:0x01f4, LOOP_START, PHI: r5
  0x01dd: PHI (r5v75 int) = (r5v74 int), (r5v79 int) binds: [B:139:0x01cb, B:158:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:165:0x0207 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0215 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0218 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0239 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:181:0x024f A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0252 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:184:0x025b  */
    /* JADX WARN: Code duplicated, block: B:186:0x026c A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0276 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:190:0x027d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0285 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:194:0x028b A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0294 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:198:0x029a A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:199:0x029f A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:201:0x02a5 A[Catch: RuntimeException -> 0x0311, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:202:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ae A[Catch: RuntimeException -> 0x0311, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x0311, blocks: (B:58:0x00fa, B:162:0x01fe, B:165:0x0207, B:166:0x020c, B:169:0x0215, B:171:0x0218, B:172:0x0220, B:173:0x0230, B:176:0x0239, B:178:0x0246, B:181:0x024f, B:183:0x0252, B:185:0x025c, B:186:0x026c, B:188:0x0276, B:231:0x02fa, B:192:0x0285, B:194:0x028b, B:196:0x0294, B:198:0x029a, B:199:0x029f, B:201:0x02a5, B:204:0x02ae, B:223:0x02e0, B:229:0x02f6, B:226:0x02eb), top: B:360:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:207:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:209:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:215:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:222:0x02df  */
    /* JADX WARN: Code duplicated, block: B:224:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02eb A[Catch: NumberFormatException -> 0x02f6, RuntimeException -> 0x0311, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x02f6, blocks: (B:223:0x02e0, B:226:0x02eb), top: B:354:0x02e0 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:234:0x0300  */
    /* JADX WARN: Code duplicated, block: B:235:0x0304  */
    /* JADX WARN: Code duplicated, block: B:246:0x0334  */
    /* JADX WARN: Code duplicated, block: B:252:0x034e A[Catch: RuntimeException -> 0x0415, TryCatch #2 {RuntimeException -> 0x0415, blocks: (B:249:0x0340, B:250:0x034a, B:252:0x034e, B:255:0x0360, B:261:0x037c, B:267:0x0390, B:272:0x039b), top: B:356:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x0357  */
    /* JADX WARN: Code duplicated, block: B:255:0x0360 A[Catch: RuntimeException -> 0x0415, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0415, blocks: (B:249:0x0340, B:250:0x034a, B:252:0x034e, B:255:0x0360, B:261:0x037c, B:267:0x0390, B:272:0x039b), top: B:356:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0369 A[Catch: RuntimeException -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0097, blocks: (B:257:0x0369, B:264:0x0383, B:270:0x0397, B:275:0x03a2, B:278:0x03ab, B:27:0x007c, B:63:0x010c, B:134:0x01b1, B:136:0x01b9, B:138:0x01c5, B:141:0x01cf), top: B:358:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:259:0x036f  */
    /* JADX WARN: Code duplicated, block: B:260:0x037a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x037c A[Catch: RuntimeException -> 0x0415, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0415, blocks: (B:249:0x0340, B:250:0x034a, B:252:0x034e, B:255:0x0360, B:261:0x037c, B:267:0x0390, B:272:0x039b), top: B:356:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0382  */
    /* JADX WARN: Code duplicated, block: B:266:0x038f  */
    /* JADX WARN: Code duplicated, block: B:269:0x0396  */
    /* JADX WARN: Code duplicated, block: B:272:0x039b A[Catch: RuntimeException -> 0x0415, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0415, blocks: (B:249:0x0340, B:250:0x034a, B:252:0x034e, B:255:0x0360, B:261:0x037c, B:267:0x0390, B:272:0x039b), top: B:356:0x0340 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:276:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:278:0x03ab A[Catch: RuntimeException -> 0x0097, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0097, blocks: (B:257:0x0369, B:264:0x0383, B:270:0x0397, B:275:0x03a2, B:278:0x03ab, B:27:0x007c, B:63:0x010c, B:134:0x01b1, B:136:0x01b9, B:138:0x01c5, B:141:0x01cf), top: B:358:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:281:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:283:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:291:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:292:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:297:0x03de  */
    /* JADX WARN: Code duplicated, block: B:299:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:301:0x03ee A[Catch: NumberFormatException -> 0x03fd, RuntimeException -> 0x0413, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x0413, blocks: (B:306:0x0401, B:298:0x03e1, B:304:0x03fd, B:301:0x03ee), top: B:364:0x0401 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:309:0x0407  */
    /* JADX WARN: Code duplicated, block: B:326:0x0437 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:327:0x0439  */
    /* JADX WARN: Code duplicated, block: B:329:0x043d  */
    /* JADX WARN: Code duplicated, block: B:331:0x0443  */
    /* JADX WARN: Code duplicated, block: B:335:0x0489  */
    /* JADX WARN: Code duplicated, block: B:337:0x048f  */
    /* JADX WARN: Code duplicated, block: B:339:0x049c  */
    /* JADX WARN: Code duplicated, block: B:345:0x04b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:347:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:352:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x041d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x033d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: RuntimeException -> 0x0421, TryCatch #5 {RuntimeException -> 0x0421, blocks: (B:21:0x0056, B:36:0x009c, B:38:0x00a2, B:40:0x00aa, B:41:0x00ad), top: B:362:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:390:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0167 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: RuntimeException -> 0x0421, TRY_LEAVE, TryCatch #5 {RuntimeException -> 0x0421, blocks: (B:21:0x0056, B:36:0x009c, B:38:0x00a2, B:40:0x00aa, B:41:0x00ad), top: B:362:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:420:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x0167 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[Catch: RuntimeException -> 0x041f, TryCatch #9 {RuntimeException -> 0x041f, blocks: (B:52:0x00dd, B:54:0x00eb, B:43:0x00bf, B:45:0x00c3, B:47:0x00ca, B:49:0x00d0, B:50:0x00d3), top: B:370:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca A[Catch: RuntimeException -> 0x041f, TryCatch #9 {RuntimeException -> 0x041f, blocks: (B:52:0x00dd, B:54:0x00eb, B:43:0x00bf, B:45:0x00c3, B:47:0x00ca, B:49:0x00d0, B:50:0x00d3), top: B:370:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[Catch: RuntimeException -> 0x041f, TryCatch #9 {RuntimeException -> 0x041f, blocks: (B:52:0x00dd, B:54:0x00eb, B:43:0x00bf, B:45:0x00c3, B:47:0x00ca, B:49:0x00d0, B:50:0x00d3), top: B:370:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00db A[PHI: r5 r16
  0x00db: PHI (r5v104 int) = (r5v2 int), (r5v26 int), (r5v2 int) binds: [B:37:0x00a0, B:40:0x00aa, B:32:0x0092] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r16v13 int) = (r16v16 int), (r16v17 int), (r16v18 int) binds: [B:37:0x00a0, B:40:0x00aa, B:32:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb A[Catch: RuntimeException -> 0x041f, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x041f, blocks: (B:52:0x00dd, B:54:0x00eb, B:43:0x00bf, B:45:0x00c3, B:47:0x00ca, B:49:0x00d0, B:50:0x00d3), top: B:370:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0103 A[PHI: r10
  0x0103: PHI (r10v45 int) = (r10v24 int), (r10v30 int), (r10v30 int), (r10v32 int) binds: [B:59:0x0100, B:431:0x0103, B:432:0x0103, B:145:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121 A[LOOP:3: B:63:0x010c->B:73:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0136  */
    /* JADX WARN: Code duplicated, block: B:80:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:347:0x04b5, please report this as an issue */
    public JsonValue q(char[] cArr, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        RuntimeException runtimeException;
        int i7;
        int i8;
        int i9;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        boolean z3;
        char c2;
        int i10;
        wg0<JsonValue> wg0Var;
        JsonValue jsonValuePeek;
        int i11;
        int i12;
        byte b;
        int i13;
        int i14;
        int i15;
        char c3;
        char[] cArr2;
        int i16;
        byte b2;
        byte b3;
        int i17;
        int i18;
        int i19;
        int i20;
        char c4;
        int i21;
        int[] iArr;
        String str5;
        boolean z4;
        boolean z5;
        boolean z6;
        char c5;
        int i22;
        char c6;
        int i23;
        boolean z7;
        char c7;
        boolean z8;
        boolean z9;
        int i24;
        char c8;
        char c9;
        int i25;
        int i26;
        boolean z10;
        char c10;
        int i27;
        int i28;
        this.f1310e = false;
        int i29 = 0;
        char c11 = 0;
        int i30 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int[] iArrCopyOf = new int[4];
        int i31 = 1;
        String str6 = null;
        int i32 = i2;
        while (true) {
            String str7 = "null";
            String str8 = SpeechConstant.FALSE_STR;
            int i33 = i30;
            try {
                if (c11 != 0) {
                    z = z11;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 == 4) {
                                i30 = i33;
                                z11 = z;
                                if (i32 == i3) {
                                    try {
                                        byte b4 = o[i31];
                                        i7 = b4 + 1;
                                        i8 = f[b4];
                                        while (true) {
                                            i9 = i8 - 1;
                                            if (i8 > 0) {
                                                int i34 = i7 + 1;
                                                if (f[i7] != 1) {
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i6 = i32;
                                                } else {
                                                    str = new String(cArr, i30, i32 - i30);
                                                    if (z11) {
                                                        str = v(str);
                                                    }
                                                    if (z12) {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i6 = i32;
                                                        str4 = str;
                                                        z12 = false;
                                                    } else {
                                                        if (z13) {
                                                            if (str.equals(SpeechConstant.TRUE_STR)) {
                                                                c(str6, true);
                                                            } else if (str.equals(str8)) {
                                                                c(str6, false);
                                                            } else {
                                                                if (str.equals(str7)) {
                                                                    u(str6, null);
                                                                } else {
                                                                    z2 = true;
                                                                    z3 = false;
                                                                    while (true) {
                                                                        if (i30 < i32) {
                                                                            c2 = cArr[i30];
                                                                            str2 = str8;
                                                                            if (c2 == '+') {
                                                                                if (c2 == 'E' && c2 != 'e') {
                                                                                    if (c2 != '-') {
                                                                                        if (c2 != '.') {
                                                                                            switch (c2) {
                                                                                                case '0':
                                                                                                case '1':
                                                                                                case '2':
                                                                                                case '3':
                                                                                                case '4':
                                                                                                case '5':
                                                                                                case '6':
                                                                                                case '7':
                                                                                                case '8':
                                                                                                case '9':
                                                                                                    break;
                                                                                                default:
                                                                                                    z3 = false;
                                                                                                    z2 = false;
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z3 = true;
                                                                                z2 = false;
                                                                            }
                                                                            i30++;
                                                                            str8 = str2;
                                                                        } else {
                                                                            str2 = str8;
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                        str3 = str7;
                                                                        i6 = i32;
                                                                        try {
                                                                            n(str6, Double.parseDouble(str), str);
                                                                        } catch (NumberFormatException unused) {
                                                                            u(str6, str);
                                                                        }
                                                                    } else {
                                                                        str3 = str7;
                                                                        i6 = i32;
                                                                        if (z2) {
                                                                            o(str6, Long.parseLong(str), str);
                                                                        }
                                                                    }
                                                                }
                                                                str4 = null;
                                                            }
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i6 = i32;
                                                            str4 = null;
                                                        } else {
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i6 = i32;
                                                        }
                                                        u(str6, str);
                                                        str4 = null;
                                                    }
                                                    try {
                                                        if (this.f1310e) {
                                                            i4 = i6;
                                                        } else {
                                                            str6 = str4;
                                                            i30 = i6;
                                                            z13 = false;
                                                        }
                                                    } catch (RuntimeException e2) {
                                                        e = e2;
                                                        runtimeException = e;
                                                        i4 = i6;
                                                    }
                                                }
                                                str7 = str3;
                                                i8 = i9;
                                                i32 = i6;
                                                i7 = i34;
                                                str8 = str2;
                                            }
                                        }
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                        i6 = i32;
                                    }
                                }
                                i32 = i32;
                            }
                            runtimeException = null;
                            JsonValue jsonValue = this.f1309c;
                            this.f1309c = null;
                            this.d = null;
                            this.b.clear();
                            if (!this.f1310e) {
                                if (i4 < i3) {
                                    i12 = 1;
                                    for (i11 = 0; i11 < i4; i11++) {
                                        if (cArr[i11] == '\n') {
                                            i12++;
                                        }
                                    }
                                    int iMax = Math.max(0, i4 - 32);
                                    throw new SerializationException("Error parsing JSON on line " + i12 + " near: " + new String(cArr, iMax, i4 - iMax) + "*ERROR*" + new String(cArr, i4, Math.min(64, i3 - i4)), runtimeException);
                                }
                                wg0Var = this.a;
                                if (wg0Var.f18241j != 0) {
                                    jsonValuePeek = wg0Var.peek();
                                    this.a.clear();
                                    if (jsonValuePeek == null && jsonValuePeek.B()) {
                                        throw new SerializationException("Error parsing JSON, unmatched brace.");
                                    }
                                    throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                }
                                if (runtimeException != null) {
                                    throw new SerializationException("Error parsing JSON: " + new String(cArr), runtimeException);
                                }
                            }
                            return jsonValue;
                        }
                        i5 = i32;
                        i30 = i33;
                        z11 = z;
                        if (i31 == 0) {
                            iArrCopyOf = iArrCopyOf;
                            c11 = 5;
                            i29 = i29;
                            i32 = i5;
                        } else {
                            i10 = i5 + 1;
                            if (i10 != i3) {
                                iArrCopyOf = iArrCopyOf;
                                i32 = i10;
                                i29 = i29;
                                c11 = 1;
                            } else {
                                i32 = i10;
                                if (i32 == i3) {
                                    byte b5 = o[i31];
                                    i7 = b5 + 1;
                                    i8 = f[b5];
                                    while (true) {
                                        i9 = i8 - 1;
                                        if (i8 > 0) {
                                            int i35 = i7 + 1;
                                            if (f[i7] != 1) {
                                                str2 = str8;
                                                str3 = str7;
                                                i6 = i32;
                                            } else {
                                                str = new String(cArr, i30, i32 - i30);
                                                if (z11) {
                                                    str = v(str);
                                                }
                                                if (z12) {
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i6 = i32;
                                                    str4 = str;
                                                    z12 = false;
                                                } else {
                                                    if (z13) {
                                                        if (str.equals(SpeechConstant.TRUE_STR)) {
                                                            c(str6, true);
                                                        } else if (str.equals(str8)) {
                                                            c(str6, false);
                                                        } else {
                                                            if (str.equals(str7)) {
                                                                u(str6, null);
                                                            } else {
                                                                z2 = true;
                                                                z3 = false;
                                                                while (true) {
                                                                    if (i30 < i32) {
                                                                        c2 = cArr[i30];
                                                                        str2 = str8;
                                                                        if (c2 == '+') {
                                                                            if (c2 == 'E') {
                                                                                z3 = true;
                                                                                z2 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                                z2 = false;
                                                                            }
                                                                        }
                                                                        i30++;
                                                                        str8 = str2;
                                                                    } else {
                                                                        str2 = str8;
                                                                    }
                                                                }
                                                                if (z3) {
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                    n(str6, Double.parseDouble(str), str);
                                                                } else {
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                    if (z2) {
                                                                        o(str6, Long.parseLong(str), str);
                                                                    }
                                                                }
                                                            }
                                                            str4 = null;
                                                        }
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i6 = i32;
                                                        str4 = null;
                                                    } else {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i6 = i32;
                                                    }
                                                    u(str6, str);
                                                    str4 = null;
                                                }
                                                if (this.f1310e) {
                                                    i4 = i6;
                                                } else {
                                                    str6 = str4;
                                                    i30 = i6;
                                                    z13 = false;
                                                }
                                            }
                                            str7 = str3;
                                            i8 = i9;
                                            i32 = i6;
                                            i7 = i35;
                                            str8 = str2;
                                        }
                                        runtimeException = null;
                                        JsonValue jsonValue2 = this.f1309c;
                                        this.f1309c = null;
                                        this.d = null;
                                        this.b.clear();
                                        if (!this.f1310e) {
                                            if (i4 < i3) {
                                                i12 = 1;
                                                while (i11 < i4) {
                                                    if (cArr[i11] == '\n') {
                                                        i12++;
                                                    }
                                                }
                                                int iMax2 = Math.max(0, i4 - 32);
                                                throw new SerializationException("Error parsing JSON on line " + i12 + " near: " + new String(cArr, iMax2, i4 - iMax2) + "*ERROR*" + new String(cArr, i4, Math.min(64, i3 - i4)), runtimeException);
                                            }
                                            wg0Var = this.a;
                                            if (wg0Var.f18241j != 0) {
                                                jsonValuePeek = wg0Var.peek();
                                                this.a.clear();
                                                if (jsonValuePeek == null) {
                                                }
                                                throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                            }
                                            if (runtimeException != null) {
                                                throw new SerializationException("Error parsing JSON: " + new String(cArr), runtimeException);
                                            }
                                        }
                                        return jsonValue2;
                                    }
                                }
                                i32 = i32;
                            }
                        }
                    }
                    i4 = i32;
                    runtimeException = null;
                    JsonValue jsonValue3 = this.f1309c;
                    this.f1309c = null;
                    this.d = null;
                    this.b.clear();
                    if (!this.f1310e) {
                        if (i4 < i3) {
                            i12 = 1;
                            while (i11 < i4) {
                                if (cArr[i11] == '\n') {
                                    i12++;
                                }
                            }
                            int iMax3 = Math.max(0, i4 - 32);
                            throw new SerializationException("Error parsing JSON on line " + i12 + " near: " + new String(cArr, iMax3, i4 - iMax3) + "*ERROR*" + new String(cArr, i4, Math.min(64, i3 - i4)), runtimeException);
                        }
                        wg0Var = this.a;
                        if (wg0Var.f18241j != 0) {
                            jsonValuePeek = wg0Var.peek();
                            this.a.clear();
                            if (jsonValuePeek == null) {
                            }
                            throw new SerializationException("Error parsing JSON, unmatched bracket.");
                        }
                        if (runtimeException != null) {
                            throw new SerializationException("Error parsing JSON: " + new String(cArr), runtimeException);
                        }
                    }
                    return jsonValue3;
                }
                z = z11;
                if (i32 == i3) {
                    c11 = 4;
                } else if (i31 == 0) {
                    c11 = 5;
                }
                i30 = i33;
                z11 = z;
                short s = g[i31];
                short s2 = k[i31];
                byte b6 = i[i31];
                int i36 = s;
                int i37 = s2;
                if (b6 > 0) {
                    int i38 = s + b6;
                    int i39 = s;
                    int i40 = i38 - 1;
                    while (true) {
                        if (i40 < i39) {
                            i36 = i38;
                            i37 = s2 + b6;
                            b = f1306j[i31];
                            i28 = i37;
                            if (b > 0) {
                                i13 = ((b << 1) + i36) - 2;
                                i14 = i36;
                                while (true) {
                                    if (i13 < i14) {
                                        i28 = i37 + b;
                                        i5 = i32;
                                        i16 = i28;
                                    } else {
                                        i15 = i14 + (((i13 - i14) >> 1) & (-2));
                                        byte b7 = b;
                                        c3 = cArr[i32];
                                        cArr2 = h;
                                        i5 = i32;
                                        if (c3 < cArr2[i15]) {
                                            i13 = i15 - 2;
                                        } else if (c3 > cArr2[i15 + 1]) {
                                            i14 = i15 + 2;
                                        } else {
                                            i16 = i37 + ((i15 - i36) >> 1);
                                        }
                                        b = b7;
                                        i32 = i5;
                                        i14 = i14;
                                    }
                                }
                            } else {
                                i5 = i32;
                                i16 = i28;
                            }
                            try {
                                byte b8 = f1307l[i16];
                                b2 = m[b8];
                                b3 = f1308n[b8];
                                if (b3 != 0) {
                                    int i41 = b3 + 1;
                                    i17 = f[b3];
                                    i18 = i41;
                                    i30 = i33;
                                    i4 = i5;
                                    while (true) {
                                        i19 = i17 - 1;
                                        if (i17 > 0) {
                                            try {
                                                i20 = i18 + 1;
                                                switch (f[i18]) {
                                                    case 0:
                                                        i29 = i29;
                                                        iArr = iArrCopyOf;
                                                        z12 = true;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    case 1:
                                                        str5 = new String(cArr, i30, i4 - i30);
                                                        if (z) {
                                                            str5 = v(str5);
                                                        }
                                                        if (z12) {
                                                            i29 = i29;
                                                            iArr = iArrCopyOf;
                                                            z12 = false;
                                                        } else {
                                                            if (z13) {
                                                                if (str5.equals(SpeechConstant.TRUE_STR)) {
                                                                    c(str6, true);
                                                                } else if (str5.equals(SpeechConstant.FALSE_STR)) {
                                                                    c(str6, false);
                                                                } else {
                                                                    if (str5.equals("null")) {
                                                                        u(str6, null);
                                                                    } else {
                                                                        z4 = false;
                                                                        z5 = true;
                                                                        while (true) {
                                                                            if (i30 < i4) {
                                                                                z4 = z4;
                                                                                c5 = cArr[i30];
                                                                                i29 = i29;
                                                                                if (c5 != '+') {
                                                                                    if (c5 != 'E' && c5 != 'e') {
                                                                                        if (c5 != '-') {
                                                                                            if (c5 != '.') {
                                                                                                switch (c5) {
                                                                                                    case '0':
                                                                                                    case '1':
                                                                                                    case '2':
                                                                                                    case '3':
                                                                                                    case '4':
                                                                                                    case '5':
                                                                                                    case '6':
                                                                                                    case '7':
                                                                                                    case '8':
                                                                                                    case '9':
                                                                                                        break;
                                                                                                    default:
                                                                                                        z5 = false;
                                                                                                        z6 = false;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i30++;
                                                                                            i29 = i29;
                                                                                        }
                                                                                    }
                                                                                    z4 = true;
                                                                                    z5 = false;
                                                                                    i30++;
                                                                                    i29 = i29;
                                                                                }
                                                                                i30++;
                                                                                i29 = i29;
                                                                            } else {
                                                                                z6 = z4;
                                                                                i29 = i29;
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            iArr = iArrCopyOf;
                                                                            try {
                                                                                n(str6, Double.parseDouble(str5), str5);
                                                                            } catch (NumberFormatException unused2) {
                                                                                u(str6, str5);
                                                                            }
                                                                        } else {
                                                                            iArr = iArrCopyOf;
                                                                            if (z5) {
                                                                                o(str6, Long.parseLong(str5), str5);
                                                                            }
                                                                        }
                                                                    }
                                                                    str5 = null;
                                                                }
                                                                i29 = i29;
                                                                iArr = iArrCopyOf;
                                                                str5 = null;
                                                            } else {
                                                                i29 = i29;
                                                                iArr = iArrCopyOf;
                                                            }
                                                            u(str6, str5);
                                                            str5 = null;
                                                        }
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            i30 = i4;
                                                            str6 = str5;
                                                            z13 = false;
                                                            iArrCopyOf = iArr;
                                                            i17 = i19;
                                                            i18 = i20;
                                                            i29 = i29;
                                                        }
                                                        break;
                                                    case 2:
                                                        t(str6);
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i29 == iArrCopyOf.length) {
                                                                c4 = 2;
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            } else {
                                                                c4 = 2;
                                                            }
                                                            iArrCopyOf[i29] = b2;
                                                            i29++;
                                                            c11 = c4;
                                                            i32 = i4;
                                                            i31 = 5;
                                                            z11 = z;
                                                            str6 = null;
                                                        }
                                                        break;
                                                    case 3:
                                                        r();
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            i29--;
                                                            i21 = iArrCopyOf[i29];
                                                            i32 = i4;
                                                            z11 = z;
                                                            c11 = 2;
                                                            i31 = i21;
                                                        }
                                                        break;
                                                    case 4:
                                                        s(str6);
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i29 == iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            }
                                                            iArrCopyOf[i29] = b2;
                                                            i29++;
                                                            i32 = i4;
                                                            z11 = z;
                                                            c11 = 2;
                                                            str6 = null;
                                                            i31 = 23;
                                                        }
                                                        break;
                                                    case 5:
                                                        r();
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            i29--;
                                                            i21 = iArrCopyOf[i29];
                                                            i32 = i4;
                                                            z11 = z;
                                                            c11 = 2;
                                                            i31 = i21;
                                                        }
                                                        break;
                                                    case 6:
                                                        i22 = i4 + 1;
                                                        if (cArr[i4] == '/') {
                                                            while (i22 != i3 && cArr[i22] != '\n') {
                                                                i22++;
                                                            }
                                                            i4 = i22 - 1;
                                                        } else {
                                                            while (true) {
                                                                i4 = i22 + 1;
                                                                if (i4 < i3) {
                                                                    try {
                                                                        if (cArr[i22] == '*') {
                                                                            try {
                                                                                if (cArr[i4] != '/') {
                                                                                }
                                                                            } catch (RuntimeException e4) {
                                                                                e = e4;
                                                                                runtimeException = e;
                                                                                i4 = i22;
                                                                                JsonValue jsonValue4 = this.f1309c;
                                                                                this.f1309c = null;
                                                                                this.d = null;
                                                                                this.b.clear();
                                                                                if (!this.f1310e) {
                                                                                    if (i4 < i3) {
                                                                                        i12 = 1;
                                                                                        while (i11 < i4) {
                                                                                            if (cArr[i11] == '\n') {
                                                                                                i12++;
                                                                                            }
                                                                                        }
                                                                                        int iMax4 = Math.max(0, i4 - 32);
                                                                                        throw new SerializationException("Error parsing JSON on line " + i12 + " near: " + new String(cArr, iMax4, i4 - iMax4) + "*ERROR*" + new String(cArr, i4, Math.min(64, i3 - i4)), runtimeException);
                                                                                    }
                                                                                    wg0Var = this.a;
                                                                                    if (wg0Var.f18241j != 0) {
                                                                                        jsonValuePeek = wg0Var.peek();
                                                                                        this.a.clear();
                                                                                        if (jsonValuePeek == null) {
                                                                                            break;
                                                                                        }
                                                                                        throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                                                                    }
                                                                                    if (runtimeException != null) {
                                                                                        throw new SerializationException("Error parsing JSON: " + new String(cArr), runtimeException);
                                                                                    }
                                                                                }
                                                                                return jsonValue4;
                                                                            }
                                                                        }
                                                                        i22 = i4;
                                                                    } catch (RuntimeException e5) {
                                                                        e = e5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    case 7:
                                                        c6 = StringUtil.CARRIAGE_RETURN;
                                                        i23 = i4;
                                                        if (z12) {
                                                            z9 = false;
                                                            do {
                                                                try {
                                                                    c8 = cArr[i23];
                                                                    z8 = z9;
                                                                    if (c8 == '\n' && c8 != '\r') {
                                                                        if (c8 == '/') {
                                                                            int i42 = i23 + 1;
                                                                            if (i42 == i3 || ((c9 = cArr[i42]) != '/' && c9 != '*')) {
                                                                                i23++;
                                                                            }
                                                                            i24 = i23 - 1;
                                                                            while (Character.isSpace(cArr[i24])) {
                                                                                i24--;
                                                                            }
                                                                            i30 = i4;
                                                                            z = z9;
                                                                            z13 = true;
                                                                            i4 = i24;
                                                                            iArr = iArrCopyOf;
                                                                        } else if (c8 != ':') {
                                                                            z9 = c8 != '\\' ? z8 : true;
                                                                            i23++;
                                                                        }
                                                                        iArrCopyOf = iArr;
                                                                        i17 = i19;
                                                                        i18 = i20;
                                                                        i29 = i29;
                                                                        break;
                                                                    }
                                                                } catch (RuntimeException e6) {
                                                                    runtimeException = e6;
                                                                    i4 = i23;
                                                                    break;
                                                                }
                                                            } while (i23 != i3);
                                                            i24 = i23 - 1;
                                                            while (Character.isSpace(cArr[i24])) {
                                                                i24--;
                                                            }
                                                            i30 = i4;
                                                            z = z9;
                                                            z13 = true;
                                                            i4 = i24;
                                                            iArr = iArrCopyOf;
                                                            iArrCopyOf = iArr;
                                                            i17 = i19;
                                                            i18 = i20;
                                                            i29 = i29;
                                                            break;
                                                        } else {
                                                            z7 = false;
                                                            while (true) {
                                                                c7 = cArr[i23];
                                                                z8 = z7;
                                                                if (c7 == '\n' && c7 != c6 && c7 != ',') {
                                                                    if (c7 == '/') {
                                                                        int i43 = i23 + 1;
                                                                        if (i43 != i3) {
                                                                            char c12 = cArr[i43];
                                                                            if (c12 == '/' || c12 == '*') {
                                                                            }
                                                                        }
                                                                        i23++;
                                                                        if (i23 == i3) {
                                                                            z7 = z8;
                                                                            c6 = StringUtil.CARRIAGE_RETURN;
                                                                        }
                                                                    } else if (c7 != '}') {
                                                                        if (c7 == '\\') {
                                                                            z8 = true;
                                                                        } else if (c7 != ']') {
                                                                        }
                                                                        i23++;
                                                                        if (i23 == i3) {
                                                                            z7 = z8;
                                                                            c6 = StringUtil.CARRIAGE_RETURN;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z9 = z8;
                                                        i24 = i23 - 1;
                                                        while (Character.isSpace(cArr[i24])) {
                                                            i24--;
                                                        }
                                                        i30 = i4;
                                                        z = z9;
                                                        z13 = true;
                                                        i4 = i24;
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    case 8:
                                                        i25 = i4 + 1;
                                                        i26 = i25;
                                                        z10 = false;
                                                        while (true) {
                                                            c10 = cArr[i26];
                                                            i27 = i25;
                                                            if (c10 != '\"') {
                                                                if (c10 == '\\') {
                                                                    i26++;
                                                                    z10 = true;
                                                                }
                                                                i26++;
                                                                if (i26 != i3) {
                                                                    i25 = i27;
                                                                }
                                                            }
                                                        }
                                                        i4 = i26 - 1;
                                                        i29 = i29;
                                                        iArr = iArrCopyOf;
                                                        z = z10;
                                                        i30 = i27;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    default:
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                }
                                            } catch (RuntimeException e7) {
                                                e = e7;
                                                runtimeException = e;
                                            }
                                        } else {
                                            i29 = i29;
                                            iArrCopyOf = iArrCopyOf;
                                            i5 = i4;
                                            z11 = z;
                                            i31 = b2;
                                            if (i31 == 0) {
                                                iArrCopyOf = iArrCopyOf;
                                                c11 = 5;
                                                i29 = i29;
                                                i32 = i5;
                                            } else {
                                                i10 = i5 + 1;
                                                if (i10 != i3) {
                                                    iArrCopyOf = iArrCopyOf;
                                                    i32 = i10;
                                                    i29 = i29;
                                                    c11 = 1;
                                                } else {
                                                    i32 = i10;
                                                    if (i32 == i3) {
                                                        byte b9 = o[i31];
                                                        i7 = b9 + 1;
                                                        i8 = f[b9];
                                                        while (true) {
                                                            i9 = i8 - 1;
                                                            if (i8 > 0) {
                                                                int i310 = i7 + 1;
                                                                if (f[i7] != 1) {
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                } else {
                                                                    str = new String(cArr, i30, i32 - i30);
                                                                    if (z11) {
                                                                        str = v(str);
                                                                    }
                                                                    if (z12) {
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i6 = i32;
                                                                        str4 = str;
                                                                        z12 = false;
                                                                    } else {
                                                                        if (z13) {
                                                                            if (str.equals(SpeechConstant.TRUE_STR)) {
                                                                                c(str6, true);
                                                                            } else if (str.equals(str8)) {
                                                                                c(str6, false);
                                                                            } else {
                                                                                if (str.equals(str7)) {
                                                                                    u(str6, null);
                                                                                } else {
                                                                                    z2 = true;
                                                                                    z3 = false;
                                                                                    while (true) {
                                                                                        if (i30 < i32) {
                                                                                            c2 = cArr[i30];
                                                                                            str2 = str8;
                                                                                            if (c2 == '+') {
                                                                                                if (c2 == 'E') {
                                                                                                    z3 = true;
                                                                                                    z2 = false;
                                                                                                } else {
                                                                                                    z3 = true;
                                                                                                    z2 = false;
                                                                                                }
                                                                                            }
                                                                                            i30++;
                                                                                            str8 = str2;
                                                                                        } else {
                                                                                            str2 = str8;
                                                                                        }
                                                                                    }
                                                                                    if (z3) {
                                                                                        str3 = str7;
                                                                                        i6 = i32;
                                                                                        n(str6, Double.parseDouble(str), str);
                                                                                    } else {
                                                                                        str3 = str7;
                                                                                        i6 = i32;
                                                                                        if (z2) {
                                                                                            o(str6, Long.parseLong(str), str);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str4 = null;
                                                                            }
                                                                            str2 = str8;
                                                                            str3 = str7;
                                                                            i6 = i32;
                                                                            str4 = null;
                                                                        } else {
                                                                            str2 = str8;
                                                                            str3 = str7;
                                                                            i6 = i32;
                                                                        }
                                                                        u(str6, str);
                                                                        str4 = null;
                                                                    }
                                                                    if (this.f1310e) {
                                                                        i4 = i6;
                                                                    } else {
                                                                        str6 = str4;
                                                                        i30 = i6;
                                                                        z13 = false;
                                                                    }
                                                                }
                                                                str7 = str3;
                                                                i8 = i9;
                                                                i32 = i6;
                                                                i7 = i310;
                                                                str8 = str2;
                                                            }
                                                            runtimeException = null;
                                                        }
                                                    }
                                                    i32 = i32;
                                                    i4 = i32;
                                                    runtimeException = null;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i31 = b2;
                                    i30 = i33;
                                    z11 = z;
                                    if (i31 == 0) {
                                        iArrCopyOf = iArrCopyOf;
                                        c11 = 5;
                                        i29 = i29;
                                        i32 = i5;
                                    } else {
                                        i10 = i5 + 1;
                                        if (i10 != i3) {
                                            iArrCopyOf = iArrCopyOf;
                                            i32 = i10;
                                            i29 = i29;
                                            c11 = 1;
                                        } else {
                                            i32 = i10;
                                            if (i32 == i3) {
                                                byte b10 = o[i31];
                                                i7 = b10 + 1;
                                                i8 = f[b10];
                                                while (true) {
                                                    i9 = i8 - 1;
                                                    if (i8 > 0) {
                                                        int i311 = i7 + 1;
                                                        if (f[i7] != 1) {
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i6 = i32;
                                                        } else {
                                                            str = new String(cArr, i30, i32 - i30);
                                                            if (z11) {
                                                                str = v(str);
                                                            }
                                                            if (z12) {
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i6 = i32;
                                                                str4 = str;
                                                                z12 = false;
                                                            } else {
                                                                if (z13) {
                                                                    if (str.equals(SpeechConstant.TRUE_STR)) {
                                                                        c(str6, true);
                                                                    } else if (str.equals(str8)) {
                                                                        c(str6, false);
                                                                    } else {
                                                                        if (str.equals(str7)) {
                                                                            u(str6, null);
                                                                        } else {
                                                                            z2 = true;
                                                                            z3 = false;
                                                                            while (true) {
                                                                                if (i30 < i32) {
                                                                                    c2 = cArr[i30];
                                                                                    str2 = str8;
                                                                                    if (c2 == '+') {
                                                                                        if (c2 == 'E') {
                                                                                            z3 = true;
                                                                                            z2 = false;
                                                                                        } else {
                                                                                            z3 = true;
                                                                                            z2 = false;
                                                                                        }
                                                                                    }
                                                                                    i30++;
                                                                                    str8 = str2;
                                                                                } else {
                                                                                    str2 = str8;
                                                                                }
                                                                            }
                                                                            if (z3) {
                                                                                str3 = str7;
                                                                                i6 = i32;
                                                                                n(str6, Double.parseDouble(str), str);
                                                                            } else {
                                                                                str3 = str7;
                                                                                i6 = i32;
                                                                                if (z2) {
                                                                                    o(str6, Long.parseLong(str), str);
                                                                                }
                                                                            }
                                                                        }
                                                                        str4 = null;
                                                                    }
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                    str4 = null;
                                                                } else {
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                }
                                                                u(str6, str);
                                                                str4 = null;
                                                            }
                                                            if (this.f1310e) {
                                                                i4 = i6;
                                                            } else {
                                                                str6 = str4;
                                                                i30 = i6;
                                                                z13 = false;
                                                            }
                                                        }
                                                        str7 = str3;
                                                        i8 = i9;
                                                        i32 = i6;
                                                        i7 = i311;
                                                        str8 = str2;
                                                    }
                                                    runtimeException = null;
                                                }
                                            }
                                            i32 = i32;
                                            i4 = i32;
                                            runtimeException = null;
                                        }
                                    }
                                }
                            } catch (RuntimeException e8) {
                                e = e8;
                                runtimeException = e;
                                i4 = i5;
                            }
                        } else {
                            int i44 = i39 + ((i40 - i39) >> 1);
                            int i45 = i39;
                            try {
                                char c13 = cArr[i32];
                                int i46 = i40;
                                char c14 = h[i44];
                                if (c13 < c14) {
                                    i40 = i44 - 1;
                                    i39 = i45 == true ? 1 : 0;
                                } else if (c13 > c14) {
                                    i39 = i44 + 1;
                                    i40 = i46;
                                } else {
                                    i28 = s2 + (i44 - s);
                                    i5 = i32;
                                    i16 = i28;
                                    byte b11 = f1307l[i16];
                                    b2 = m[b11];
                                    b3 = f1308n[b11];
                                    if (b3 != 0) {
                                        int i47 = b3 + 1;
                                        i17 = f[b3];
                                        i18 = i47;
                                        i30 = i33;
                                        i4 = i5;
                                        while (true) {
                                            i19 = i17 - 1;
                                            if (i17 > 0) {
                                                i20 = i18 + 1;
                                                switch (f[i18]) {
                                                    case 0:
                                                        i29 = i29;
                                                        iArr = iArrCopyOf;
                                                        z12 = true;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    case 1:
                                                        str5 = new String(cArr, i30, i4 - i30);
                                                        if (z) {
                                                            str5 = v(str5);
                                                        }
                                                        if (z12) {
                                                            i29 = i29;
                                                            iArr = iArrCopyOf;
                                                            z12 = false;
                                                        } else {
                                                            if (z13) {
                                                                if (str5.equals(SpeechConstant.TRUE_STR)) {
                                                                    c(str6, true);
                                                                } else if (str5.equals(SpeechConstant.FALSE_STR)) {
                                                                    c(str6, false);
                                                                } else {
                                                                    if (str5.equals("null")) {
                                                                        u(str6, null);
                                                                    } else {
                                                                        z4 = false;
                                                                        z5 = true;
                                                                        while (true) {
                                                                            if (i30 < i4) {
                                                                                z4 = z4;
                                                                                c5 = cArr[i30];
                                                                                i29 = i29;
                                                                                if (c5 != '+') {
                                                                                    if (c5 != 'E') {
                                                                                        if (c5 != '-') {
                                                                                            if (c5 != '.') {
                                                                                                switch (c5) {
                                                                                                    case '0':
                                                                                                    case '1':
                                                                                                    case '2':
                                                                                                    case '3':
                                                                                                    case '4':
                                                                                                    case '5':
                                                                                                    case '6':
                                                                                                    case '7':
                                                                                                    case '8':
                                                                                                    case '9':
                                                                                                        break;
                                                                                                    default:
                                                                                                        z5 = false;
                                                                                                        z6 = false;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            i30++;
                                                                                            i29 = i29;
                                                                                        }
                                                                                    }
                                                                                    z4 = true;
                                                                                    z5 = false;
                                                                                    i30++;
                                                                                    i29 = i29;
                                                                                }
                                                                                i30++;
                                                                                i29 = i29;
                                                                            } else {
                                                                                z6 = z4;
                                                                                i29 = i29;
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            iArr = iArrCopyOf;
                                                                            n(str6, Double.parseDouble(str5), str5);
                                                                        } else {
                                                                            iArr = iArrCopyOf;
                                                                            if (z5) {
                                                                                o(str6, Long.parseLong(str5), str5);
                                                                            }
                                                                        }
                                                                    }
                                                                    str5 = null;
                                                                }
                                                                i29 = i29;
                                                                iArr = iArrCopyOf;
                                                                str5 = null;
                                                            } else {
                                                                i29 = i29;
                                                                iArr = iArrCopyOf;
                                                            }
                                                            u(str6, str5);
                                                            str5 = null;
                                                        }
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            i30 = i4;
                                                            str6 = str5;
                                                            z13 = false;
                                                            iArrCopyOf = iArr;
                                                            i17 = i19;
                                                            i18 = i20;
                                                            i29 = i29;
                                                        }
                                                        break;
                                                    case 2:
                                                        t(str6);
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i29 == iArrCopyOf.length) {
                                                                c4 = 2;
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            } else {
                                                                c4 = 2;
                                                            }
                                                            iArrCopyOf[i29] = b2;
                                                            i29++;
                                                            c11 = c4;
                                                            i32 = i4;
                                                            i31 = 5;
                                                            z11 = z;
                                                            str6 = null;
                                                        }
                                                        break;
                                                    case 3:
                                                        r();
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            i29--;
                                                            i21 = iArrCopyOf[i29];
                                                            i32 = i4;
                                                            z11 = z;
                                                            c11 = 2;
                                                            i31 = i21;
                                                        }
                                                        break;
                                                    case 4:
                                                        s(str6);
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            if (i29 == iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                            }
                                                            iArrCopyOf[i29] = b2;
                                                            i29++;
                                                            i32 = i4;
                                                            z11 = z;
                                                            c11 = 2;
                                                            str6 = null;
                                                            i31 = 23;
                                                        }
                                                        break;
                                                    case 5:
                                                        r();
                                                        if (this.f1310e) {
                                                            runtimeException = null;
                                                        } else {
                                                            i29--;
                                                            i21 = iArrCopyOf[i29];
                                                            i32 = i4;
                                                            z11 = z;
                                                            c11 = 2;
                                                            i31 = i21;
                                                        }
                                                        break;
                                                    case 6:
                                                        i22 = i4 + 1;
                                                        if (cArr[i4] == '/') {
                                                            while (i22 != i3) {
                                                                i22++;
                                                            }
                                                            i4 = i22 - 1;
                                                        } else {
                                                            while (true) {
                                                                i4 = i22 + 1;
                                                                if (i4 < i3) {
                                                                    if (cArr[i22] == '*') {
                                                                        if (cArr[i4] != '/') {
                                                                        }
                                                                    }
                                                                    i22 = i4;
                                                                }
                                                            }
                                                        }
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    case 7:
                                                        c6 = StringUtil.CARRIAGE_RETURN;
                                                        i23 = i4;
                                                        if (z12) {
                                                            z9 = false;
                                                            do {
                                                                c8 = cArr[i23];
                                                                z8 = z9;
                                                                if (c8 == '\n') {
                                                                }
                                                            } while (i23 != i3);
                                                            i24 = i23 - 1;
                                                            while (Character.isSpace(cArr[i24])) {
                                                                i24--;
                                                            }
                                                            i30 = i4;
                                                            z = z9;
                                                            z13 = true;
                                                            i4 = i24;
                                                            iArr = iArrCopyOf;
                                                            iArrCopyOf = iArr;
                                                            i17 = i19;
                                                            i18 = i20;
                                                            i29 = i29;
                                                        } else {
                                                            z7 = false;
                                                            while (true) {
                                                                c7 = cArr[i23];
                                                                z8 = z7;
                                                                if (c7 == '\n') {
                                                                }
                                                                z7 = z8;
                                                                c6 = StringUtil.CARRIAGE_RETURN;
                                                            }
                                                        }
                                                        z9 = z8;
                                                        i24 = i23 - 1;
                                                        while (Character.isSpace(cArr[i24])) {
                                                            i24--;
                                                        }
                                                        i30 = i4;
                                                        z = z9;
                                                        z13 = true;
                                                        i4 = i24;
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    case 8:
                                                        i25 = i4 + 1;
                                                        i26 = i25;
                                                        z10 = false;
                                                        while (true) {
                                                            c10 = cArr[i26];
                                                            i27 = i25;
                                                            if (c10 != '\"') {
                                                                if (c10 == '\\') {
                                                                    i26++;
                                                                    z10 = true;
                                                                }
                                                                i26++;
                                                                if (i26 != i3) {
                                                                    i25 = i27;
                                                                }
                                                            }
                                                        }
                                                        i4 = i26 - 1;
                                                        i29 = i29;
                                                        iArr = iArrCopyOf;
                                                        z = z10;
                                                        i30 = i27;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                    default:
                                                        iArr = iArrCopyOf;
                                                        iArrCopyOf = iArr;
                                                        i17 = i19;
                                                        i18 = i20;
                                                        i29 = i29;
                                                        break;
                                                }
                                            } else {
                                                i29 = i29;
                                                iArrCopyOf = iArrCopyOf;
                                                i5 = i4;
                                                z11 = z;
                                                i31 = b2;
                                                if (i31 == 0) {
                                                    iArrCopyOf = iArrCopyOf;
                                                    c11 = 5;
                                                    i29 = i29;
                                                    i32 = i5;
                                                } else {
                                                    i10 = i5 + 1;
                                                    if (i10 != i3) {
                                                        iArrCopyOf = iArrCopyOf;
                                                        i32 = i10;
                                                        i29 = i29;
                                                        c11 = 1;
                                                    } else {
                                                        i32 = i10;
                                                        if (i32 == i3) {
                                                            byte b12 = o[i31];
                                                            i7 = b12 + 1;
                                                            i8 = f[b12];
                                                            while (true) {
                                                                i9 = i8 - 1;
                                                                if (i8 > 0) {
                                                                    int i312 = i7 + 1;
                                                                    if (f[i7] != 1) {
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i6 = i32;
                                                                    } else {
                                                                        str = new String(cArr, i30, i32 - i30);
                                                                        if (z11) {
                                                                            str = v(str);
                                                                        }
                                                                        if (z12) {
                                                                            str2 = str8;
                                                                            str3 = str7;
                                                                            i6 = i32;
                                                                            str4 = str;
                                                                            z12 = false;
                                                                        } else {
                                                                            if (z13) {
                                                                                if (str.equals(SpeechConstant.TRUE_STR)) {
                                                                                    c(str6, true);
                                                                                } else if (str.equals(str8)) {
                                                                                    c(str6, false);
                                                                                } else {
                                                                                    if (str.equals(str7)) {
                                                                                        u(str6, null);
                                                                                    } else {
                                                                                        z2 = true;
                                                                                        z3 = false;
                                                                                        while (true) {
                                                                                            if (i30 < i32) {
                                                                                                c2 = cArr[i30];
                                                                                                str2 = str8;
                                                                                                if (c2 == '+') {
                                                                                                    if (c2 == 'E') {
                                                                                                        z3 = true;
                                                                                                        z2 = false;
                                                                                                    } else {
                                                                                                        z3 = true;
                                                                                                        z2 = false;
                                                                                                    }
                                                                                                }
                                                                                                i30++;
                                                                                                str8 = str2;
                                                                                            } else {
                                                                                                str2 = str8;
                                                                                            }
                                                                                        }
                                                                                        if (z3) {
                                                                                            str3 = str7;
                                                                                            i6 = i32;
                                                                                            n(str6, Double.parseDouble(str), str);
                                                                                        } else {
                                                                                            str3 = str7;
                                                                                            i6 = i32;
                                                                                            if (z2) {
                                                                                                o(str6, Long.parseLong(str), str);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str4 = null;
                                                                                }
                                                                                str2 = str8;
                                                                                str3 = str7;
                                                                                i6 = i32;
                                                                                str4 = null;
                                                                            } else {
                                                                                str2 = str8;
                                                                                str3 = str7;
                                                                                i6 = i32;
                                                                            }
                                                                            u(str6, str);
                                                                            str4 = null;
                                                                        }
                                                                        if (this.f1310e) {
                                                                            i4 = i6;
                                                                        } else {
                                                                            str6 = str4;
                                                                            i30 = i6;
                                                                            z13 = false;
                                                                        }
                                                                    }
                                                                    str7 = str3;
                                                                    i8 = i9;
                                                                    i32 = i6;
                                                                    i7 = i312;
                                                                    str8 = str2;
                                                                }
                                                                runtimeException = null;
                                                            }
                                                        }
                                                        i32 = i32;
                                                        i4 = i32;
                                                        runtimeException = null;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i31 = b2;
                                        i30 = i33;
                                        z11 = z;
                                        if (i31 == 0) {
                                            iArrCopyOf = iArrCopyOf;
                                            c11 = 5;
                                            i29 = i29;
                                            i32 = i5;
                                        } else {
                                            i10 = i5 + 1;
                                            if (i10 != i3) {
                                                iArrCopyOf = iArrCopyOf;
                                                i32 = i10;
                                                i29 = i29;
                                                c11 = 1;
                                            } else {
                                                i32 = i10;
                                                if (i32 == i3) {
                                                    byte b13 = o[i31];
                                                    i7 = b13 + 1;
                                                    i8 = f[b13];
                                                    while (true) {
                                                        i9 = i8 - 1;
                                                        if (i8 > 0) {
                                                            int i313 = i7 + 1;
                                                            if (f[i7] != 1) {
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i6 = i32;
                                                            } else {
                                                                str = new String(cArr, i30, i32 - i30);
                                                                if (z11) {
                                                                    str = v(str);
                                                                }
                                                                if (z12) {
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                    str4 = str;
                                                                    z12 = false;
                                                                } else {
                                                                    if (z13) {
                                                                        if (str.equals(SpeechConstant.TRUE_STR)) {
                                                                            c(str6, true);
                                                                        } else if (str.equals(str8)) {
                                                                            c(str6, false);
                                                                        } else {
                                                                            if (str.equals(str7)) {
                                                                                u(str6, null);
                                                                            } else {
                                                                                z2 = true;
                                                                                z3 = false;
                                                                                while (true) {
                                                                                    if (i30 < i32) {
                                                                                        c2 = cArr[i30];
                                                                                        str2 = str8;
                                                                                        if (c2 == '+') {
                                                                                            if (c2 == 'E') {
                                                                                                z3 = true;
                                                                                                z2 = false;
                                                                                            } else {
                                                                                                z3 = true;
                                                                                                z2 = false;
                                                                                            }
                                                                                        }
                                                                                        i30++;
                                                                                        str8 = str2;
                                                                                    } else {
                                                                                        str2 = str8;
                                                                                    }
                                                                                }
                                                                                if (z3) {
                                                                                    str3 = str7;
                                                                                    i6 = i32;
                                                                                    n(str6, Double.parseDouble(str), str);
                                                                                } else {
                                                                                    str3 = str7;
                                                                                    i6 = i32;
                                                                                    if (z2) {
                                                                                        o(str6, Long.parseLong(str), str);
                                                                                    }
                                                                                }
                                                                            }
                                                                            str4 = null;
                                                                        }
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i6 = i32;
                                                                        str4 = null;
                                                                    } else {
                                                                        str2 = str8;
                                                                        str3 = str7;
                                                                        i6 = i32;
                                                                    }
                                                                    u(str6, str);
                                                                    str4 = null;
                                                                }
                                                                if (this.f1310e) {
                                                                    i4 = i6;
                                                                } else {
                                                                    str6 = str4;
                                                                    i30 = i6;
                                                                    z13 = false;
                                                                }
                                                            }
                                                            str7 = str3;
                                                            i8 = i9;
                                                            i32 = i6;
                                                            i7 = i313;
                                                            str8 = str2;
                                                        }
                                                        runtimeException = null;
                                                    }
                                                }
                                                i32 = i32;
                                                i4 = i32;
                                                runtimeException = null;
                                            }
                                        }
                                    }
                                }
                            } catch (RuntimeException e9) {
                                e = e9;
                                i4 = i32;
                                runtimeException = e;
                                JsonValue jsonValue5 = this.f1309c;
                                this.f1309c = null;
                                this.d = null;
                                this.b.clear();
                                if (!this.f1310e) {
                                    if (i4 < i3) {
                                        i12 = 1;
                                        while (i11 < i4) {
                                            if (cArr[i11] == '\n') {
                                                i12++;
                                            }
                                        }
                                        int iMax5 = Math.max(0, i4 - 32);
                                        throw new SerializationException("Error parsing JSON on line " + i12 + " near: " + new String(cArr, iMax5, i4 - iMax5) + "*ERROR*" + new String(cArr, i4, Math.min(64, i3 - i4)), runtimeException);
                                    }
                                    wg0Var = this.a;
                                    if (wg0Var.f18241j != 0) {
                                        jsonValuePeek = wg0Var.peek();
                                        this.a.clear();
                                        if (jsonValuePeek == null) {
                                        }
                                        throw new SerializationException("Error parsing JSON, unmatched bracket.");
                                    }
                                    if (runtimeException != null) {
                                        throw new SerializationException("Error parsing JSON: " + new String(cArr), runtimeException);
                                    }
                                }
                                return jsonValue5;
                            }
                        }
                    }
                } else {
                    b = f1306j[i31];
                    i28 = i37;
                    if (b > 0) {
                        i13 = ((b << 1) + i36) - 2;
                        i14 = i36;
                        while (true) {
                            if (i13 < i14) {
                                i28 = i37 + b;
                                i5 = i32;
                                i16 = i28;
                            } else {
                                i15 = i14 + (((i13 - i14) >> 1) & (-2));
                                byte b14 = b;
                                c3 = cArr[i32];
                                cArr2 = h;
                                i5 = i32;
                                if (c3 < cArr2[i15]) {
                                    i13 = i15 - 2;
                                } else if (c3 > cArr2[i15 + 1]) {
                                    i14 = i15 + 2;
                                } else {
                                    i16 = i37 + ((i15 - i36) >> 1);
                                }
                                b = b14;
                                i32 = i5;
                                i14 = i14;
                            }
                        }
                    } else {
                        i5 = i32;
                        i16 = i28;
                    }
                    byte b15 = f1307l[i16];
                    b2 = m[b15];
                    b3 = f1308n[b15];
                    if (b3 != 0) {
                        int i48 = b3 + 1;
                        i17 = f[b3];
                        i18 = i48;
                        i30 = i33;
                        i4 = i5;
                        while (true) {
                            i19 = i17 - 1;
                            if (i17 > 0) {
                                i20 = i18 + 1;
                                switch (f[i18]) {
                                    case 0:
                                        i29 = i29;
                                        iArr = iArrCopyOf;
                                        z12 = true;
                                        iArrCopyOf = iArr;
                                        i17 = i19;
                                        i18 = i20;
                                        i29 = i29;
                                        break;
                                    case 1:
                                        str5 = new String(cArr, i30, i4 - i30);
                                        if (z) {
                                            str5 = v(str5);
                                        }
                                        if (z12) {
                                            i29 = i29;
                                            iArr = iArrCopyOf;
                                            z12 = false;
                                        } else {
                                            if (z13) {
                                                if (str5.equals(SpeechConstant.TRUE_STR)) {
                                                    c(str6, true);
                                                } else if (str5.equals(SpeechConstant.FALSE_STR)) {
                                                    c(str6, false);
                                                } else {
                                                    if (str5.equals("null")) {
                                                        u(str6, null);
                                                    } else {
                                                        z4 = false;
                                                        z5 = true;
                                                        while (true) {
                                                            if (i30 < i4) {
                                                                z4 = z4;
                                                                c5 = cArr[i30];
                                                                i29 = i29;
                                                                if (c5 != '+') {
                                                                    if (c5 != 'E') {
                                                                        if (c5 != '-') {
                                                                            if (c5 != '.') {
                                                                                switch (c5) {
                                                                                    case '0':
                                                                                    case '1':
                                                                                    case '2':
                                                                                    case '3':
                                                                                    case '4':
                                                                                    case '5':
                                                                                    case '6':
                                                                                    case '7':
                                                                                    case '8':
                                                                                    case '9':
                                                                                        break;
                                                                                    default:
                                                                                        z5 = false;
                                                                                        z6 = false;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            i30++;
                                                                            i29 = i29;
                                                                        }
                                                                    }
                                                                    z4 = true;
                                                                    z5 = false;
                                                                    i30++;
                                                                    i29 = i29;
                                                                }
                                                                i30++;
                                                                i29 = i29;
                                                            } else {
                                                                z6 = z4;
                                                                i29 = i29;
                                                            }
                                                        }
                                                        if (z6) {
                                                            iArr = iArrCopyOf;
                                                            n(str6, Double.parseDouble(str5), str5);
                                                        } else {
                                                            iArr = iArrCopyOf;
                                                            if (z5) {
                                                                o(str6, Long.parseLong(str5), str5);
                                                            }
                                                        }
                                                    }
                                                    str5 = null;
                                                }
                                                i29 = i29;
                                                iArr = iArrCopyOf;
                                                str5 = null;
                                            } else {
                                                i29 = i29;
                                                iArr = iArrCopyOf;
                                            }
                                            u(str6, str5);
                                            str5 = null;
                                        }
                                        if (this.f1310e) {
                                            runtimeException = null;
                                        } else {
                                            i30 = i4;
                                            str6 = str5;
                                            z13 = false;
                                            iArrCopyOf = iArr;
                                            i17 = i19;
                                            i18 = i20;
                                            i29 = i29;
                                        }
                                        break;
                                    case 2:
                                        t(str6);
                                        if (this.f1310e) {
                                            runtimeException = null;
                                        } else {
                                            if (i29 == iArrCopyOf.length) {
                                                c4 = 2;
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                            } else {
                                                c4 = 2;
                                            }
                                            iArrCopyOf[i29] = b2;
                                            i29++;
                                            c11 = c4;
                                            i32 = i4;
                                            i31 = 5;
                                            z11 = z;
                                            str6 = null;
                                        }
                                        break;
                                    case 3:
                                        r();
                                        if (this.f1310e) {
                                            runtimeException = null;
                                        } else {
                                            i29--;
                                            i21 = iArrCopyOf[i29];
                                            i32 = i4;
                                            z11 = z;
                                            c11 = 2;
                                            i31 = i21;
                                        }
                                        break;
                                    case 4:
                                        s(str6);
                                        if (this.f1310e) {
                                            runtimeException = null;
                                        } else {
                                            if (i29 == iArrCopyOf.length) {
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                            }
                                            iArrCopyOf[i29] = b2;
                                            i29++;
                                            i32 = i4;
                                            z11 = z;
                                            c11 = 2;
                                            str6 = null;
                                            i31 = 23;
                                        }
                                        break;
                                    case 5:
                                        r();
                                        if (this.f1310e) {
                                            runtimeException = null;
                                        } else {
                                            i29--;
                                            i21 = iArrCopyOf[i29];
                                            i32 = i4;
                                            z11 = z;
                                            c11 = 2;
                                            i31 = i21;
                                        }
                                        break;
                                    case 6:
                                        i22 = i4 + 1;
                                        if (cArr[i4] == '/') {
                                            while (i22 != i3) {
                                                i22++;
                                            }
                                            i4 = i22 - 1;
                                        } else {
                                            while (true) {
                                                i4 = i22 + 1;
                                                if (i4 < i3) {
                                                    if (cArr[i22] == '*') {
                                                        if (cArr[i4] != '/') {
                                                        }
                                                    }
                                                    i22 = i4;
                                                }
                                            }
                                        }
                                        iArr = iArrCopyOf;
                                        iArrCopyOf = iArr;
                                        i17 = i19;
                                        i18 = i20;
                                        i29 = i29;
                                        break;
                                    case 7:
                                        c6 = StringUtil.CARRIAGE_RETURN;
                                        i23 = i4;
                                        if (z12) {
                                            z9 = false;
                                            do {
                                                c8 = cArr[i23];
                                                z8 = z9;
                                                if (c8 == '\n') {
                                                }
                                            } while (i23 != i3);
                                            i24 = i23 - 1;
                                            while (Character.isSpace(cArr[i24])) {
                                                i24--;
                                            }
                                            i30 = i4;
                                            z = z9;
                                            z13 = true;
                                            i4 = i24;
                                            iArr = iArrCopyOf;
                                            iArrCopyOf = iArr;
                                            i17 = i19;
                                            i18 = i20;
                                            i29 = i29;
                                        } else {
                                            z7 = false;
                                            while (true) {
                                                c7 = cArr[i23];
                                                z8 = z7;
                                                if (c7 == '\n') {
                                                }
                                                z7 = z8;
                                                c6 = StringUtil.CARRIAGE_RETURN;
                                            }
                                        }
                                        z9 = z8;
                                        i24 = i23 - 1;
                                        while (Character.isSpace(cArr[i24])) {
                                            i24--;
                                        }
                                        i30 = i4;
                                        z = z9;
                                        z13 = true;
                                        i4 = i24;
                                        iArr = iArrCopyOf;
                                        iArrCopyOf = iArr;
                                        i17 = i19;
                                        i18 = i20;
                                        i29 = i29;
                                        break;
                                    case 8:
                                        i25 = i4 + 1;
                                        i26 = i25;
                                        z10 = false;
                                        while (true) {
                                            c10 = cArr[i26];
                                            i27 = i25;
                                            if (c10 != '\"') {
                                                if (c10 == '\\') {
                                                    i26++;
                                                    z10 = true;
                                                }
                                                i26++;
                                                if (i26 != i3) {
                                                    i25 = i27;
                                                }
                                            }
                                        }
                                        i4 = i26 - 1;
                                        i29 = i29;
                                        iArr = iArrCopyOf;
                                        z = z10;
                                        i30 = i27;
                                        iArrCopyOf = iArr;
                                        i17 = i19;
                                        i18 = i20;
                                        i29 = i29;
                                        break;
                                    default:
                                        iArr = iArrCopyOf;
                                        iArrCopyOf = iArr;
                                        i17 = i19;
                                        i18 = i20;
                                        i29 = i29;
                                        break;
                                }
                            } else {
                                i29 = i29;
                                iArrCopyOf = iArrCopyOf;
                                i5 = i4;
                                z11 = z;
                                i31 = b2;
                                if (i31 == 0) {
                                    iArrCopyOf = iArrCopyOf;
                                    c11 = 5;
                                    i29 = i29;
                                    i32 = i5;
                                } else {
                                    i10 = i5 + 1;
                                    if (i10 != i3) {
                                        iArrCopyOf = iArrCopyOf;
                                        i32 = i10;
                                        i29 = i29;
                                        c11 = 1;
                                    } else {
                                        i32 = i10;
                                        if (i32 == i3) {
                                            byte b16 = o[i31];
                                            i7 = b16 + 1;
                                            i8 = f[b16];
                                            while (true) {
                                                i9 = i8 - 1;
                                                if (i8 > 0) {
                                                    int i314 = i7 + 1;
                                                    if (f[i7] != 1) {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i6 = i32;
                                                    } else {
                                                        str = new String(cArr, i30, i32 - i30);
                                                        if (z11) {
                                                            str = v(str);
                                                        }
                                                        if (z12) {
                                                            str2 = str8;
                                                            str3 = str7;
                                                            i6 = i32;
                                                            str4 = str;
                                                            z12 = false;
                                                        } else {
                                                            if (z13) {
                                                                if (str.equals(SpeechConstant.TRUE_STR)) {
                                                                    c(str6, true);
                                                                } else if (str.equals(str8)) {
                                                                    c(str6, false);
                                                                } else {
                                                                    if (str.equals(str7)) {
                                                                        u(str6, null);
                                                                    } else {
                                                                        z2 = true;
                                                                        z3 = false;
                                                                        while (true) {
                                                                            if (i30 < i32) {
                                                                                c2 = cArr[i30];
                                                                                str2 = str8;
                                                                                if (c2 == '+') {
                                                                                    if (c2 == 'E') {
                                                                                        z3 = true;
                                                                                        z2 = false;
                                                                                    } else {
                                                                                        z3 = true;
                                                                                        z2 = false;
                                                                                    }
                                                                                }
                                                                                i30++;
                                                                                str8 = str2;
                                                                            } else {
                                                                                str2 = str8;
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                            str3 = str7;
                                                                            i6 = i32;
                                                                            n(str6, Double.parseDouble(str), str);
                                                                        } else {
                                                                            str3 = str7;
                                                                            i6 = i32;
                                                                            if (z2) {
                                                                                o(str6, Long.parseLong(str), str);
                                                                            }
                                                                        }
                                                                    }
                                                                    str4 = null;
                                                                }
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i6 = i32;
                                                                str4 = null;
                                                            } else {
                                                                str2 = str8;
                                                                str3 = str7;
                                                                i6 = i32;
                                                            }
                                                            u(str6, str);
                                                            str4 = null;
                                                        }
                                                        if (this.f1310e) {
                                                            i4 = i6;
                                                        } else {
                                                            str6 = str4;
                                                            i30 = i6;
                                                            z13 = false;
                                                        }
                                                    }
                                                    str7 = str3;
                                                    i8 = i9;
                                                    i32 = i6;
                                                    i7 = i314;
                                                    str8 = str2;
                                                }
                                                runtimeException = null;
                                            }
                                        }
                                        i32 = i32;
                                        i4 = i32;
                                        runtimeException = null;
                                    }
                                }
                            }
                        }
                    } else {
                        i31 = b2;
                        i30 = i33;
                        z11 = z;
                        if (i31 == 0) {
                            iArrCopyOf = iArrCopyOf;
                            c11 = 5;
                            i29 = i29;
                            i32 = i5;
                        } else {
                            i10 = i5 + 1;
                            if (i10 != i3) {
                                iArrCopyOf = iArrCopyOf;
                                i32 = i10;
                                i29 = i29;
                                c11 = 1;
                            } else {
                                i32 = i10;
                                if (i32 == i3) {
                                    byte b17 = o[i31];
                                    i7 = b17 + 1;
                                    i8 = f[b17];
                                    while (true) {
                                        i9 = i8 - 1;
                                        if (i8 > 0) {
                                            int i315 = i7 + 1;
                                            if (f[i7] != 1) {
                                                str2 = str8;
                                                str3 = str7;
                                                i6 = i32;
                                            } else {
                                                str = new String(cArr, i30, i32 - i30);
                                                if (z11) {
                                                    str = v(str);
                                                }
                                                if (z12) {
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i6 = i32;
                                                    str4 = str;
                                                    z12 = false;
                                                } else {
                                                    if (z13) {
                                                        if (str.equals(SpeechConstant.TRUE_STR)) {
                                                            c(str6, true);
                                                        } else if (str.equals(str8)) {
                                                            c(str6, false);
                                                        } else {
                                                            if (str.equals(str7)) {
                                                                u(str6, null);
                                                            } else {
                                                                z2 = true;
                                                                z3 = false;
                                                                while (true) {
                                                                    if (i30 < i32) {
                                                                        c2 = cArr[i30];
                                                                        str2 = str8;
                                                                        if (c2 == '+') {
                                                                            if (c2 == 'E') {
                                                                                z3 = true;
                                                                                z2 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                                z2 = false;
                                                                            }
                                                                        }
                                                                        i30++;
                                                                        str8 = str2;
                                                                    } else {
                                                                        str2 = str8;
                                                                    }
                                                                }
                                                                if (z3) {
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                    n(str6, Double.parseDouble(str), str);
                                                                } else {
                                                                    str3 = str7;
                                                                    i6 = i32;
                                                                    if (z2) {
                                                                        o(str6, Long.parseLong(str), str);
                                                                    }
                                                                }
                                                            }
                                                            str4 = null;
                                                        }
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i6 = i32;
                                                        str4 = null;
                                                    } else {
                                                        str2 = str8;
                                                        str3 = str7;
                                                        i6 = i32;
                                                    }
                                                    u(str6, str);
                                                    str4 = null;
                                                }
                                                if (this.f1310e) {
                                                    i4 = i6;
                                                } else {
                                                    str6 = str4;
                                                    i30 = i6;
                                                    z13 = false;
                                                }
                                            }
                                            str7 = str3;
                                            i8 = i9;
                                            i32 = i6;
                                            i7 = i315;
                                            str8 = str2;
                                        }
                                        runtimeException = null;
                                    }
                                }
                                i32 = i32;
                                i4 = i32;
                                runtimeException = null;
                            }
                        }
                    }
                }
            } catch (RuntimeException e10) {
                e = e10;
                i5 = i32;
            }
            JsonValue jsonValue6 = this.f1309c;
            this.f1309c = null;
            this.d = null;
            this.b.clear();
            if (!this.f1310e) {
                if (i4 < i3) {
                    i12 = 1;
                    while (i11 < i4) {
                        if (cArr[i11] == '\n') {
                            i12++;
                        }
                    }
                    int iMax6 = Math.max(0, i4 - 32);
                    throw new SerializationException("Error parsing JSON on line " + i12 + " near: " + new String(cArr, iMax6, i4 - iMax6) + "*ERROR*" + new String(cArr, i4, Math.min(64, i3 - i4)), runtimeException);
                }
                wg0Var = this.a;
                if (wg0Var.f18241j != 0) {
                    jsonValuePeek = wg0Var.peek();
                    this.a.clear();
                    if (jsonValuePeek == null) {
                    }
                    throw new SerializationException("Error parsing JSON, unmatched bracket.");
                }
                if (runtimeException != null) {
                    throw new SerializationException("Error parsing JSON: " + new String(cArr), runtimeException);
                }
            }
            return jsonValue6;
        }
    }

    public void r() {
        this.f1309c = this.a.pop();
        if (this.d.r > 0) {
            this.b.pop();
        }
        wg0<JsonValue> wg0Var = this.a;
        this.d = wg0Var.f18241j > 0 ? wg0Var.peek() : null;
    }

    public void s(String str) {
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.array);
        if (this.d != null) {
            b(str, jsonValue);
        }
        this.a.a(jsonValue);
        this.d = jsonValue;
    }

    public void t(String str) {
        JsonValue jsonValue = new JsonValue(JsonValue.ValueType.object);
        if (this.d != null) {
            b(str, jsonValue);
        }
        this.a.a(jsonValue);
        this.d = jsonValue;
    }

    public void u(String str, String str2) {
        b(str, new JsonValue(str2));
    }

    public String v(String str) {
        int length = str.length();
        t0j t0jVar = new t0j(length + 16);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\\') {
                t0jVar.append(cCharAt);
            } else {
                if (i3 == length) {
                    break;
                }
                i2 = i3 + 1;
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 == 'u') {
                    i3 = i2 + 4;
                    t0jVar.p(Character.toChars(Integer.parseInt(str.substring(i2, i3), 16)));
                } else {
                    if (cCharAt2 != '\"' && cCharAt2 != '/' && cCharAt2 != '\\') {
                        if (cCharAt2 == 'b') {
                            cCharAt2 = '\b';
                        } else if (cCharAt2 == 'f') {
                            cCharAt2 = '\f';
                        } else if (cCharAt2 == 'n') {
                            cCharAt2 = '\n';
                        } else if (cCharAt2 == 'r') {
                            cCharAt2 = StringUtil.CARRIAGE_RETURN;
                        } else {
                            if (cCharAt2 != 't') {
                                throw new SerializationException("Illegal escaped character: \\" + cCharAt2);
                            }
                            cCharAt2 = '\t';
                        }
                    }
                    t0jVar.append(cCharAt2);
                }
            }
            i2 = i3;
        }
        return t0jVar.toString();
    }
}
