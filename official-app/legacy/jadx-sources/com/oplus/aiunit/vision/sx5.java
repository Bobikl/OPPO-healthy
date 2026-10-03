package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/sx5;", "", "", "host", "", "ips", "", "notifyIPListChange", "hosts", "notifyWhiteListChange", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public interface sx5 {
    void notifyIPListChange(@NotNull String host, @NotNull List<String> ips);

    void notifyWhiteListChange(@NotNull List<String> hosts);
}
