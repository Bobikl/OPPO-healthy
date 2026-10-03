package io.netty.incubator.codec.quic;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class QLogConfiguration {
    private final String logDescription;
    private final String logTitle;
    private final String path;

    public QLogConfiguration(String str, String str2, String str3) {
        Objects.requireNonNull(str, "path");
        this.path = str;
        Objects.requireNonNull(str2, "logTitle");
        this.logTitle = str2;
        Objects.requireNonNull(str3, "logDescription");
        this.logDescription = str3;
    }

    public String logDescription() {
        return this.logDescription;
    }

    public String logTitle() {
        return this.logTitle;
    }

    public String path() {
        return this.path;
    }
}
