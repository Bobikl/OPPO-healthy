package com.oplus.cardwidget.domain.command.data;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/oplus/cardwidget/domain/command/data/BaseCardCommand;", "", "()V", "consumeTime", "", "getConsumeTime", "()J", "setConsumeTime", "(J)V", "genTime", "getGenTime", "setGenTime", "source", "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseCardCommand {
    private long consumeTime;
    private long genTime;

    @Nullable
    private String source;

    public final long getConsumeTime() {
        return this.consumeTime;
    }

    public final long getGenTime() {
        return this.genTime;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final void setConsumeTime(long j2) {
        this.consumeTime = j2;
    }

    public final void setGenTime(long j2) {
        this.genTime = j2;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }
}
