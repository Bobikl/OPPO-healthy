package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J;\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H&J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/lj9;", "", "", "host", "", "c", "", "port", "connIp", "", "connectionSucc", "errorMsg", "d", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;)V", "url", "ip", "dnsTypeRet", "tlsRet", "socketRet", "error", "a", "b", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public interface lj9 {
    void a(@NotNull String url, @NotNull String ip, int dnsTypeRet, boolean tlsRet, boolean socketRet, @NotNull String error);

    int b(@NotNull String host);

    void c(@NotNull String host);

    void d(@NotNull String host, @Nullable Integer port, @NotNull String connIp, boolean connectionSucc, @NotNull String errorMsg);
}
