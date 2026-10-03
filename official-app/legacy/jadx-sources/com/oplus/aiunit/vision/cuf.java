package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlinx.coroutines.DebugKt;
import okhttp3.MediaType;
import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u00182\u00020\u0001:\u0002\u0007\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\bH&J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/cuf;", "Ljava/io/Closeable;", "Lokhttp3/MediaType;", LogFieldKey.MESSAGE_KEY, "", LogFieldKey.LEVEL_KEY, "Ljava/io/InputStream;", "a", "Lokio/BufferedSource;", LogFieldKey.PROCESS_NAME_KEY, "", b2n.f, "Ljava/io/Reader;", b2n.g, "", "s", "", "close", "Ljava/nio/charset/Charset;", "i", "Ljava/io/Reader;", "reader", "<init>", "()V", "Companion", "b", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public abstract class cuf implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/cuf$a;", "Ljava/io/Reader;", "", "cbuf", "", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "read", "", "close", "", "i", "Z", "closed", "j", "Ljava/io/Reader;", "delegate", "Lokio/BufferedSource;", MapSchema.FIELD_NAME_KEY, "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", LogFieldKey.LEVEL_KEY, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class a extends Reader {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public Reader delegate;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public final BufferedSource source;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public final Charset charset;

        public a(@NotNull BufferedSource source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), sqk.H(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.cuf$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0007J\"\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/cuf$b;", "", "", "Lokhttp3/MediaType;", "contentType", "Lcom/oplus/aiunit/vision/cuf;", "a", "(Ljava/lang/String;Lokhttp3/MediaType;)Lcom/oplus/aiunit/vision/cuf;", "", MapSchema.FIELD_NAME_ENTRY, "([BLokhttp3/MediaType;)Lcom/oplus/aiunit/vision/cuf;", "Lokio/BufferedSource;", "", "contentLength", "d", "(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lcom/oplus/aiunit/vision/cuf;", "content", "c", "b", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.cuf$b$a */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/cuf$b$a", "Lcom/oplus/aiunit/vision/cuf;", "Lokhttp3/MediaType;", LogFieldKey.MESSAGE_KEY, "", LogFieldKey.LEVEL_KEY, "Lokio/BufferedSource;", LogFieldKey.PROCESS_NAME_KEY, "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
        public static final class a extends cuf {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ BufferedSource f10248j;
            public final /* synthetic */ MediaType k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f10249l;

            public a(BufferedSource bufferedSource, MediaType mediaType, long j2) {
                this.f10248j = bufferedSource;
                this.k = mediaType;
                this.f10249l = j2;
            }

            @Override // com.oplus.aiunit.vision.cuf
            /* JADX INFO: renamed from: l, reason: from getter */
            public long getF10249l() {
                return this.f10249l;
            }

            @Override // com.oplus.aiunit.vision.cuf
            @Nullable
            /* JADX INFO: renamed from: m, reason: from getter */
            public MediaType getK() {
                return this.k;
            }

            @Override // com.oplus.aiunit.vision.cuf
            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public BufferedSource getBodySource() {
                return this.f10248j;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ cuf f(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.e(bArr, mediaType);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final cuf a(@NotNull String toResponseBody, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                Charset charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charsetCharset$default == null) {
                    mediaType = MediaType.INSTANCE.b(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(toResponseBody, charset);
            return d(bufferWriteString, mediaType, bufferWriteString.size());
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @JvmStatic
        @NotNull
        public final cuf b(@Nullable MediaType contentType, long contentLength, @NotNull BufferedSource content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return d(content, contentType, contentLength);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final cuf c(@Nullable MediaType contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, contentType);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final cuf d(@NotNull BufferedSource asResponseBody, @Nullable MediaType mediaType, long j2) {
            Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
            return new a(asResponseBody, mediaType, j2);
        }

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final cuf e(@NotNull byte[] toResponseBody, @Nullable MediaType mediaType) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            return d(new Buffer().write(toResponseBody), mediaType, toResponseBody.length);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @NotNull
    public static final cuf n(@Nullable MediaType mediaType, long j2, @NotNull BufferedSource bufferedSource) {
        return INSTANCE.b(mediaType, j2, bufferedSource);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final cuf o(@Nullable MediaType mediaType, @NotNull String str) {
        return INSTANCE.c(mediaType, str);
    }

    @NotNull
    public final InputStream a() {
        return getBodySource().inputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        sqk.j(getBodySource());
    }

    @NotNull
    public final byte[] g() throws IOException {
        long f10249l = getF10249l();
        if (f10249l > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + f10249l);
        }
        BufferedSource f10248j = getBodySource();
        try {
            byte[] byteArray = f10248j.readByteArray();
            CloseableKt.closeFinally(f10248j, null);
            int length = byteArray.length;
            if (f10249l == -1 || f10249l == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + f10249l + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(f10248j, th);
                throw th2;
            }
        }
    }

    @NotNull
    public final Reader h() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getBodySource(), i());
        this.reader = aVar;
        return aVar;
    }

    public final Charset i() {
        Charset charset;
        MediaType k = getK();
        return (k == null || (charset = k.charset(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charset;
    }

    /* JADX INFO: renamed from: l */
    public abstract long getF10249l();

    @Nullable
    /* JADX INFO: renamed from: m */
    public abstract MediaType getK();

    @NotNull
    /* JADX INFO: renamed from: p */
    public abstract BufferedSource getBodySource();

    @NotNull
    public final String s() throws IOException {
        BufferedSource f10248j = getBodySource();
        try {
            String string = f10248j.readString(sqk.H(f10248j, i()));
            CloseableKt.closeFinally(f10248j, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(f10248j, th);
                throw th2;
            }
        }
    }
}
