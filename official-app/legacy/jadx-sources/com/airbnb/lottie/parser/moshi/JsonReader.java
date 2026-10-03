package com.airbnb.lottie.parser.moshi;

import com.oplus.aiunit.vision.vla;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes12.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] o = new String[128];
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f531j = new int[32];
    public String[] k = new String[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f532l = new int[32];
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f533n;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class a {
        public final String[] a;
        public final Options b;

        public a(String[] strArr, Options options) {
            this.a = strArr;
            this.b = options;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.A(buffer, strArr[i]);
                    buffer.readByte();
                    byteStringArr[i] = buffer.readByteString();
                }
                return new a((String[]) strArr.clone(), Options.of(byteStringArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            o[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void A(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = o;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        bufferedSink.writeUtf8(str, i, i2);
                    }
                    bufferedSink.writeUtf8(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    bufferedSink.writeUtf8(str, i, i2);
                }
                bufferedSink.writeUtf8(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            bufferedSink.writeUtf8(str, i, length);
        }
        bufferedSink.writeByte(34);
    }

    public static JsonReader u(BufferedSource bufferedSource) {
        return new com.airbnb.lottie.parser.moshi.a(bufferedSource);
    }

    public final JsonEncodingException B(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public abstract void g() throws IOException;

    public final String getPath() {
        return vla.a(this.i, this.f531j, this.k, this.f532l);
    }

    public abstract void h() throws IOException;

    public abstract void i() throws IOException;

    public abstract void l() throws IOException;

    public abstract boolean m() throws IOException;

    public abstract boolean n() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract String s() throws IOException;

    public abstract String t() throws IOException;

    public abstract Token v() throws IOException;

    public final void w(int i) {
        int i2 = this.i;
        int[] iArr = this.f531j;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f531j = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.k;
            this.k = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f532l;
            this.f532l = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f531j;
        int i3 = this.i;
        this.i = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int x(a aVar) throws IOException;

    public abstract void y() throws IOException;

    public abstract void z() throws IOException;
}
