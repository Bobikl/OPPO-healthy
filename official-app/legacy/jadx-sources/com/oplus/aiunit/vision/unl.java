package com.oplus.aiunit.vision;

import com.heytap.speech.engine.constant.EngineConstant;
import okhttp3.Request;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/unl;", "", "Lokhttp3/Request;", "request", "", "b", "", "text", "", b2n.f, "Lokio/ByteString;", "bytes", "f", "", "code", EngineConstant.REASON, "d", "", "cancel", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface unl {
    long b();

    void cancel();

    boolean d(int code, @Nullable String reason);

    boolean f(@NotNull ByteString bytes);

    boolean g(@NotNull String text);

    @NotNull
    /* JADX INFO: renamed from: request */
    Request getOriginalRequest();
}
