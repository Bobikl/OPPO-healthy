package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/y3f;", "", "", "streamId", "", "Lcom/oplus/aiunit/vision/xh8;", "requestHeaders", "", "a", "responseHeaders", "last", "b", "Lokio/BufferedSource;", "source", "byteCount", "c", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "", "d", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface y3f {

    @JvmField
    @NotNull
    public static final y3f CANCEL = new Companion.C0944a();

    boolean a(int streamId, @NotNull List<xh8> requestHeaders);

    boolean b(int streamId, @NotNull List<xh8> responseHeaders, boolean last);

    boolean c(int streamId, @NotNull BufferedSource source, int byteCount, boolean last) throws IOException;

    void d(int streamId, @NotNull ErrorCode errorCode);
}
