package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/gqf;", "", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "", "isDuplex", "isOneShot", "<init>", "()V", "Companion", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public abstract class gqf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.gqf$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/gqf$a;", "", "", "Lokhttp3/MediaType;", "contentType", "Lcom/oplus/aiunit/vision/gqf;", "b", "(Ljava/lang/String;Lokhttp3/MediaType;)Lcom/oplus/aiunit/vision/gqf;", "Lokio/ByteString;", b2n.f, "(Lokio/ByteString;Lokhttp3/MediaType;)Lcom/oplus/aiunit/vision/gqf;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", b2n.g, "([BLokhttp3/MediaType;II)Lcom/oplus/aiunit/vision/gqf;", "Ljava/io/File;", "a", "(Ljava/io/File;Lokhttp3/MediaType;)Lcom/oplus/aiunit/vision/gqf;", "content", "d", MapSchema.FIELD_NAME_ENTRY, "f", Const.Scheme.SCHEME_FILE, "c", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.gqf$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/gqf$a$a", "Lcom/oplus/aiunit/vision/gqf;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
        public static final class C0880a extends gqf {
            public final /* synthetic */ File a;
            public final /* synthetic */ MediaType b;

            public C0880a(File file, MediaType mediaType) {
                this.a = file;
                this.b = mediaType;
            }

            @Override // com.oplus.aiunit.vision.gqf
            public long contentLength() {
                return this.a.length();
            }

            @Override // com.oplus.aiunit.vision.gqf
            @Nullable
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public MediaType getB() {
                return this.b;
            }

            @Override // com.oplus.aiunit.vision.gqf
            public void writeTo(@NotNull BufferedSink sink) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                Source source = Okio.source(this.a);
                try {
                    sink.writeAll(source);
                    CloseableKt.closeFinally(source, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(source, th);
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.gqf$a$b */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/gqf$a$b", "Lcom/oplus/aiunit/vision/gqf;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
        public static final class b extends gqf {
            public final /* synthetic */ ByteString a;
            public final /* synthetic */ MediaType b;

            public b(ByteString byteString, MediaType mediaType) {
                this.a = byteString;
                this.b = mediaType;
            }

            @Override // com.oplus.aiunit.vision.gqf
            public long contentLength() {
                return this.a.size();
            }

            @Override // com.oplus.aiunit.vision.gqf
            @Nullable
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public MediaType getB() {
                return this.b;
            }

            @Override // com.oplus.aiunit.vision.gqf
            public void writeTo(@NotNull BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.a);
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.gqf$a$c */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/gqf$a$c", "Lcom/oplus/aiunit/vision/gqf;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
        public static final class c extends gqf {
            public final /* synthetic */ byte[] a;
            public final /* synthetic */ MediaType b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f11863c;
            public final /* synthetic */ int d;

            public c(byte[] bArr, MediaType mediaType, int i, int i2) {
                this.a = bArr;
                this.b = mediaType;
                this.f11863c = i;
                this.d = i2;
            }

            @Override // com.oplus.aiunit.vision.gqf
            public long contentLength() {
                return this.f11863c;
            }

            @Override // com.oplus.aiunit.vision.gqf
            @Nullable
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public MediaType getB() {
                return this.b;
            }

            @Override // com.oplus.aiunit.vision.gqf
            public void writeTo(@NotNull BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.a, this.d, this.f11863c);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ gqf i(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.a(file, mediaType);
        }

        public static /* synthetic */ gqf j(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.b(str, mediaType);
        }

        public static /* synthetic */ gqf k(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.f(mediaType, bArr, i, i2);
        }

        public static /* synthetic */ gqf l(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.h(bArr, mediaType, i, i2);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final gqf a(@NotNull File asRequestBody, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
            return new C0880a(asRequestBody, mediaType);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final gqf b(@NotNull String toRequestBody, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.b(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return h(bytes, mediaType, 0, bytes.length);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @JvmStatic
        @NotNull
        public final gqf c(@Nullable MediaType contentType, @NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return a(file, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @NotNull
        public final gqf d(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return b(content, contentType);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmStatic
        @NotNull
        public final gqf e(@Nullable MediaType contentType, @NotNull ByteString content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return g(content, contentType);
        }

        @JvmStatic
        @NotNull
        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @JvmOverloads
        public final gqf f(@Nullable MediaType contentType, @NotNull byte[] content, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, contentType, offset, byteCount);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final gqf g(@NotNull ByteString toRequestBody, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            return new b(toRequestBody, mediaType);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        @JvmOverloads
        public final gqf h(@NotNull byte[] toRequestBody, @Nullable MediaType mediaType, int i, int i2) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            sqk.i(toRequestBody.length, i, i2);
            return new c(toRequestBody, mediaType, i2, i);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final gqf create(@NotNull File file, @Nullable MediaType mediaType) {
        return INSTANCE.a(file, mediaType);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getB();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@NotNull BufferedSink sink) throws IOException;

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final gqf create(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.b(str, mediaType);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    @NotNull
    public static final gqf create(@Nullable MediaType mediaType, @NotNull File file) {
        return INSTANCE.c(mediaType, file);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final gqf create(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.d(mediaType, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @NotNull
    public static final gqf create(@Nullable MediaType mediaType, @NotNull ByteString byteString) {
        return INSTANCE.e(mediaType, byteString);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final gqf create(@Nullable MediaType mediaType, @NotNull byte[] bArr) {
        return Companion.k(INSTANCE, mediaType, bArr, 0, 0, 12, null);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final gqf create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i) {
        return Companion.k(INSTANCE, mediaType, bArr, i, 0, 8, null);
    }

    @JvmStatic
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmOverloads
    public static final gqf create(@Nullable MediaType mediaType, @NotNull byte[] bArr, int i, int i2) {
        return INSTANCE.f(mediaType, bArr, i, i2);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    public static final gqf create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        return INSTANCE.g(byteString, mediaType);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final gqf create(@NotNull byte[] bArr) {
        return Companion.l(INSTANCE, bArr, null, 0, 0, 7, null);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final gqf create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        return Companion.l(INSTANCE, bArr, mediaType, 0, 0, 6, null);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final gqf create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
        return Companion.l(INSTANCE, bArr, mediaType, i, 0, 4, null);
    }

    @JvmStatic
    @JvmName(name = "create")
    @NotNull
    @JvmOverloads
    public static final gqf create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i, int i2) {
        return INSTANCE.h(bArr, mediaType, i, i2);
    }
}
