package com.oplus.aiunit.vision;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H&J7\u0010\u0010\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/w00;", "", "Landroid/content/Context;", "context", "", "url", "ip", "", "socket", "tls", "msg", "", "onAllnetHttpDnsStat", "host", "", "port", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Z", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public interface w00 {
    boolean a(@Nullable Context context, @Nullable String host, @Nullable Integer port, @Nullable String url);

    void onAllnetHttpDnsStat(@NotNull Context context, @NotNull String url, @NotNull String ip, boolean socket, boolean tls, @NotNull String msg);
}
