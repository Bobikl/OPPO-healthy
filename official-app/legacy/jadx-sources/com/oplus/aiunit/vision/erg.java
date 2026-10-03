package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\n\u0010\bR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/erg;", "", "", "a", "Z", "b", "()Z", MapSchema.FIELD_NAME_ENTRY, "(Z)V", "setup", "c", "hasInit", "getHasUsOrContainerCard", "d", "hasUsOrContainerCard", "<init>", "()V", "card-seedling_release"}, k = 1, mv = {1, 8, 0})
public final class erg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile boolean setup;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile boolean hasInit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public volatile boolean hasUsOrContainerCard;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasInit() {
        return this.hasInit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSetup() {
        return this.setup;
    }

    public final void c(boolean z) {
        this.hasInit = z;
    }

    public final void d(boolean z) {
        this.hasUsOrContainerCard = z;
    }

    public final void e(boolean z) {
        this.setup = z;
    }
}
