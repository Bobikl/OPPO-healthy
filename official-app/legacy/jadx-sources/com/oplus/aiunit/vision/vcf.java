package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import okhttp3.MediaType;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/vcf;", "Lcom/oplus/aiunit/vision/cuf;", "", LogFieldKey.LEVEL_KEY, "Lokhttp3/MediaType;", LogFieldKey.MESSAGE_KEY, "Lokio/BufferedSource;", LogFieldKey.PROCESS_NAME_KEY, "", "j", "Ljava/lang/String;", "contentTypeString", MapSchema.FIELD_NAME_KEY, "J", "contentLength", "Lokio/BufferedSource;", "source", "<init>", "(Ljava/lang/String;JLokio/BufferedSource;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class vcf extends cuf {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String contentTypeString;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long contentLength;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final BufferedSource source;

    public vcf(@Nullable String str, long j2, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.contentTypeString = str;
        this.contentLength = j2;
        this.source = source;
    }

    @Override // com.oplus.aiunit.vision.cuf
    /* JADX INFO: renamed from: l, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // com.oplus.aiunit.vision.cuf
    @Nullable
    /* JADX INFO: renamed from: m */
    public MediaType getK() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.INSTANCE.b(str);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.cuf
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public BufferedSource getSource() {
        return this.source;
    }
}
