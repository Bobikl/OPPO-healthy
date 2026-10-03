package com.oplus.aiunit.vision;

import java.io.IOException;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/wr2;", "", "Lokhttp3/Request;", "request", "Lcom/oplus/aiunit/vision/ytf;", "execute", "Lcom/oplus/aiunit/vision/zs2;", "responseCallback", "", b2n.f, "cancel", "", "isCanceled", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface wr2 extends Cloneable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/wr2$a;", "", "Lokhttp3/Request;", "request", "Lcom/oplus/aiunit/vision/wr2;", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @NotNull
        wr2 a(@NotNull Request request);
    }

    void cancel();

    @NotNull
    ytf execute() throws IOException;

    void g(@NotNull zs2 responseCallback);

    boolean isCanceled();

    @NotNull
    Request request();
}
