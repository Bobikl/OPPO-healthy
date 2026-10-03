package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.Request;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes11.dex */
public final class iqf {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f12617l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final uk9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f12618c;

    @Nullable
    public uk9.a d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request.Builder f12619e = new Request.Builder();
    public final gj8.a f;

    @Nullable
    public MediaType g;
    public final boolean h;

    @Nullable
    public o8c.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public cx7.a f12620j;

    @Nullable
    public gqf k;

    public static class a extends gqf {
        public final gqf a;
        public final MediaType b;

        public a(gqf gqfVar, MediaType mediaType) {
            this.a = gqfVar;
            this.b = mediaType;
        }

        @Override // com.oplus.aiunit.vision.gqf
        public long contentLength() throws IOException {
            return this.a.contentLength();
        }

        @Override // com.oplus.aiunit.vision.gqf
        /* JADX INFO: renamed from: contentType */
        public MediaType getContentType() {
            return this.b;
        }

        @Override // com.oplus.aiunit.vision.gqf
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            this.a.writeTo(bufferedSink);
        }
    }

    public iqf(String str, uk9 uk9Var, @Nullable String str2, @Nullable gj8 gj8Var, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uk9Var;
        this.f12618c = str2;
        this.g = mediaType;
        this.h = z;
        if (gj8Var != null) {
            this.f = gj8Var.d();
        } else {
            this.f = new gj8.a();
        }
        if (z2) {
            this.f12620j = new cx7.a();
        } else if (z3) {
            o8c.a aVar = new o8c.a();
            this.i = aVar;
            aVar.f(o8c.FORM);
        }
    }

    public static String i(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                j(buffer, str, iCharCount, length, z);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public static void j(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    while (!buffer2.exhausted()) {
                        int i3 = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        char[] cArr = f12617l;
                        buffer.writeByte((int) cArr[(i3 >> 4) & 15]);
                        buffer.writeByte((int) cArr[i3 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            this.f12620j.b(str, str2);
        } else {
            this.f12620j.a(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f.b(str, str2);
            return;
        }
        try {
            this.g = MediaType.get(str2);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e2);
        }
    }

    public void c(gj8 gj8Var) {
        this.f.c(gj8Var);
    }

    public void d(gj8 gj8Var, gqf gqfVar) {
        this.i.c(gj8Var, gqfVar);
    }

    public void e(o8c.c cVar) {
        this.i.d(cVar);
    }

    public void f(String str, String str2, boolean z) {
        if (this.f12618c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z);
        String strReplace = this.f12618c.replace(n04.OPEN_BRACE_REGEX + str + "}", strI);
        if (!m.matcher(strReplace).matches()) {
            this.f12618c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    public void g(String str, @Nullable String str2, boolean z) {
        String str3 = this.f12618c;
        if (str3 != null) {
            uk9.a aVarM = this.b.m(str3);
            this.d = aVarM;
            if (aVarM == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f12618c);
            }
            this.f12618c = null;
        }
        if (z) {
            this.d.a(str, str2);
        } else {
            this.d.b(str, str2);
        }
    }

    public <T> void h(Class<T> cls, @Nullable T t) {
        this.f12619e.tag(cls, t);
    }

    public Request.Builder k() {
        uk9 uk9VarV;
        uk9.a aVar = this.d;
        if (aVar != null) {
            uk9VarV = aVar.c();
        } else {
            uk9VarV = this.b.v(this.f12618c);
            if (uk9VarV == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.b + ", Relative: " + this.f12618c);
            }
        }
        gqf aVar2 = this.k;
        if (aVar2 == null) {
            cx7.a aVar3 = this.f12620j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                o8c.a aVar4 = this.i;
                if (aVar4 != null) {
                    aVar2 = aVar4.e();
                } else if (this.h) {
                    aVar2 = gqf.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.g;
        if (mediaType != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, mediaType);
            } else {
                this.f.b("Content-Type", mediaType.getMediaType());
            }
        }
        return this.f12619e.url(uk9VarV).headers(this.f.g()).method(this.a, aVar2);
    }

    public void l(gqf gqfVar) {
        this.k = gqfVar;
    }

    public void m(Object obj) {
        this.f12618c = obj.toString();
    }
}
