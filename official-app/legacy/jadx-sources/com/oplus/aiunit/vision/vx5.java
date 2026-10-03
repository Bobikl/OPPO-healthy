package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/vx5;", "", "", "host", "", "port", "", "Lcom/oplus/aiunit/vision/ux5;", "a", "lookup", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public interface vx5 {
    @NotNull
    List<DnsInfo> a(@NotNull String host, int port);

    @NotNull
    List<DnsInfo> lookup(@NotNull String host);
}
