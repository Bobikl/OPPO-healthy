package com.oplus.aiunit.vision;

import java.net.UnknownHostException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/zn9;", "", "Lcom/oplus/aiunit/vision/zn9$a;", "chain", "Lcom/oplus/aiunit/vision/yx5;", "a", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public interface zn9 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/zn9$a;", "", "Lcom/oplus/aiunit/vision/wx5;", "request", "source", "Lcom/oplus/aiunit/vision/yx5;", "a", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @NotNull
        yx5 a(@NotNull DnsRequest source);

        @NotNull
        DnsRequest request();
    }

    @NotNull
    yx5 a(@NotNull a chain) throws UnknownHostException;
}
