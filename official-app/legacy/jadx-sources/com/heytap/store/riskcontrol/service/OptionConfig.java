package com.heytap.store.riskcontrol.service;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/riskcontrol/service/OptionConfig;", "", "url", "", "(Ljava/lang/String;)V", "value", "", "cacheTime", "getCacheTime", "()I", "setCacheTime", "(I)V", "timeOut", "getTimeOut", "setTimeOut", "getUrl", "()Ljava/lang/String;", "riskcontrol-service_release"}, k = 1, mv = {1, 4, 2})
public final class OptionConfig {
    private int cacheTime;
    private int timeOut;

    @NotNull
    private final String url;

    public OptionConfig(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.timeOut = 5000;
    }

    public final int getCacheTime() {
        return this.cacheTime;
    }

    public final int getTimeOut() {
        return this.timeOut;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setCacheTime(int i) {
        if (30 <= i && 120 >= i) {
            this.cacheTime = i;
        }
    }

    public final void setTimeOut(int i) {
        this.timeOut = i;
    }
}
