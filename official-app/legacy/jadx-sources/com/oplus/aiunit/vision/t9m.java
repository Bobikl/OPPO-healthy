package com.oplus.aiunit.vision;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u0003\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\n\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/t9m;", "", "", "a", "J", "getGenTime", "()J", "c", "(J)V", "genTime", "b", "getSaveTime", "d", "saveTime", "getConsumeTime", "consumeTime", "", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "source", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public abstract class t9m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long genTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long saveTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long consumeTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String source;

    public final void a(long j2) {
        this.consumeTime = j2;
    }

    public final void b(@Nullable String str) {
        this.source = str;
    }

    public final void c(long j2) {
        this.genTime = j2;
    }

    public final void d(long j2) {
        this.saveTime = j2;
    }
}
