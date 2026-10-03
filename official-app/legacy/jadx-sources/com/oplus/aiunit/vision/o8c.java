package com.oplus.aiunit.vision;

import com.liulishuo.okdownload.core.Util;
import com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003\r\f\u0011B'\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u001e¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/o8c;", "Lcom/oplus/aiunit/vision/gqf;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "", "countBytes", "b", "a", "Lokhttp3/MediaType;", "J", "Lokio/ByteString;", "c", "Lokio/ByteString;", "boundaryByteString", "d", "type", "()Lokhttp3/MediaType;", "", "Lcom/oplus/aiunit/vision/o8c$c;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/List;", "parts", "()Ljava/util/List;", "", "()Ljava/lang/String;", "boundary", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class o8c extends gqf {

    @JvmField
    @NotNull
    public static final MediaType ALTERNATIVE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final MediaType DIGEST;

    @JvmField
    @NotNull
    public static final MediaType FORM;

    @JvmField
    @NotNull
    public static final MediaType MIXED;

    @JvmField
    @NotNull
    public static final MediaType PARALLEL;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final MediaType contentType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long contentLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ByteString boundaryByteString;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final MediaType type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<c> parts;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ \u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/o8c$a;", "", "Lokhttp3/MediaType;", "type", "f", "Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcom/oplus/aiunit/vision/gqf;", "body", "c", "", "name", "value", "a", BreakpointSQLiteKey.FILENAME, "b", "Lcom/oplus/aiunit/vision/o8c$c;", "part", "d", "Lcom/oplus/aiunit/vision/o8c;", MapSchema.FIELD_NAME_ENTRY, "Lokio/ByteString;", "Lokio/ByteString;", "boundary", "Lokhttp3/MediaType;", "", "Ljava/util/List;", "parts", "<init>", "(Ljava/lang/String;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final ByteString boundary;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public MediaType type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            d(c.INSTANCE.b(name, value));
            return this;
        }

        @NotNull
        public final a b(@NotNull String name, @Nullable String filename, @NotNull gqf body) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.INSTANCE.c(name, filename, body));
            return this;
        }

        @NotNull
        public final a c(@Nullable gj8 headers, @NotNull gqf body) {
            Intrinsics.checkNotNullParameter(body, "body");
            d(c.INSTANCE.a(headers, body));
            return this;
        }

        @NotNull
        public final a d(@NotNull c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.parts.add(part);
            return this;
        }

        @NotNull
        public final o8c e() {
            if (!this.parts.isEmpty()) {
                return new o8c(this.boundary, this.type, sqk.T(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        public final a f(@NotNull MediaType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.type(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        @JvmOverloads
        public a(@NotNull String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.boundary = ByteString.INSTANCE.encodeUtf8(boundary);
            this.type = o8c.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.o8c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/o8c$b;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull StringBuilder appendQuotedString, @NotNull String key) {
            Intrinsics.checkNotNullParameter(appendQuotedString, "$this$appendQuotedString");
            Intrinsics.checkNotNullParameter(key, "key");
            appendQuotedString.append('\"');
            int length = key.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    appendQuotedString.append("%0A");
                } else if (cCharAt == '\r') {
                    appendQuotedString.append("%0D");
                } else if (cCharAt != '\"') {
                    appendQuotedString.append(cCharAt);
                } else {
                    appendQuotedString.append("%22");
                }
            }
            appendQuotedString.append('\"');
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0003B\u001b\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/o8c$c;", "", "Lcom/oplus/aiunit/vision/gj8;", "a", "Lcom/oplus/aiunit/vision/gj8;", "d", "()Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcom/oplus/aiunit/vision/gqf;", "b", "Lcom/oplus/aiunit/vision/gqf;", "()Lcom/oplus/aiunit/vision/gqf;", "body", "<init>", "(Lcom/oplus/aiunit/vision/gj8;Lcom/oplus/aiunit/vision/gqf;)V", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final gj8 headers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final gqf body;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.o8c$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/o8c$c$a;", "", "Lcom/oplus/aiunit/vision/gj8;", "headers", "Lcom/oplus/aiunit/vision/gqf;", "body", "Lcom/oplus/aiunit/vision/o8c$c;", "a", "", "name", "value", "b", BreakpointSQLiteKey.FILENAME, "c", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final c a(@Nullable gj8 headers, @NotNull gqf body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!((headers != null ? headers.a("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.a("Content-Length") : null) == null) {
                    return new c(headers, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @JvmStatic
            @NotNull
            public final c b(@NotNull String name, @NotNull String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return c(name, null, gqf.Companion.j(gqf.INSTANCE, value, null, 1, null));
            }

            @JvmStatic
            @NotNull
            public final c c(@NotNull String name, @Nullable String filename, @NotNull gqf body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = o8c.INSTANCE;
                companion.a(sb, name);
                if (filename != null) {
                    sb.append("; filename=");
                    companion.a(sb, filename);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                return a(new gj8.a().f(Util.CONTENT_DISPOSITION, string).g(), body);
            }
        }

        public c(gj8 gj8Var, gqf gqfVar) {
            this.headers = gj8Var;
            this.body = gqfVar;
        }

        @JvmStatic
        @NotNull
        public static final c b(@NotNull String str, @NotNull String str2) {
            return INSTANCE.b(str, str2);
        }

        @JvmStatic
        @NotNull
        public static final c c(@NotNull String str, @Nullable String str2, @NotNull gqf gqfVar) {
            return INSTANCE.c(str, str2, gqfVar);
        }

        @JvmName(name = "body")
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final gqf getBody() {
            return this.body;
        }

        @JvmName(name = "headers")
        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final gj8 getHeaders() {
            return this.headers;
        }

        public /* synthetic */ c(gj8 gj8Var, gqf gqfVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(gj8Var, gqfVar);
        }
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        MIXED = companion.a("multipart/mixed");
        ALTERNATIVE = companion.a("multipart/alternative");
        DIGEST = companion.a("multipart/digest");
        PARALLEL = companion.a("multipart/parallel");
        FORM = companion.a("multipart/form-data");
        f = new byte[]{(byte) 58, (byte) 32};
        g = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        h = new byte[]{b, b};
    }

    public o8c(@NotNull ByteString boundaryByteString, @NotNull MediaType type, @NotNull List<c> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = MediaType.INSTANCE.a(type + "; boundary=" + a());
        this.contentLength = -1L;
    }

    @JvmName(name = "boundary")
    @NotNull
    public final String a() {
        return this.boundaryByteString.utf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b(BufferedSink sink, boolean countBytes) throws IOException {
        Buffer buffer;
        if (countBytes) {
            sink = new Buffer();
            buffer = sink;
        } else {
            buffer = 0;
        }
        int size = this.parts.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            c cVar = this.parts.get(i);
            gj8 headers = cVar.getHeaders();
            gqf body = cVar.getBody();
            Intrinsics.checkNotNull(sink);
            sink.write(h);
            sink.write(this.boundaryByteString);
            sink.write(g);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sink.writeUtf8(headers.c(i2)).write(f).writeUtf8(headers.h(i2)).write(g);
                }
            }
            MediaType contentType = body.getContentType();
            if (contentType != null) {
                sink.writeUtf8("Content-Type: ").writeUtf8(contentType.getMediaType()).write(g);
            }
            long jContentLength = body.contentLength();
            if (jContentLength != -1) {
                sink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(g);
            } else if (countBytes) {
                Intrinsics.checkNotNull(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = g;
            sink.write(bArr);
            if (countBytes) {
                j2 += jContentLength;
            } else {
                body.writeTo(sink);
            }
            sink.write(bArr);
        }
        Intrinsics.checkNotNull(sink);
        byte[] bArr2 = h;
        sink.write(bArr2);
        sink.write(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(g);
        if (!countBytes) {
            return j2;
        }
        Intrinsics.checkNotNull(buffer);
        long size3 = j2 + buffer.size();
        buffer.clear();
        return size3;
    }

    @Override // com.oplus.aiunit.vision.gqf
    public long contentLength() throws IOException {
        long j2 = this.contentLength;
        if (j2 != -1) {
            return j2;
        }
        long jB = b(null, true);
        this.contentLength = jB;
        return jB;
    }

    @Override // com.oplus.aiunit.vision.gqf
    @NotNull
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    @Override // com.oplus.aiunit.vision.gqf
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b(sink, false);
    }
}
