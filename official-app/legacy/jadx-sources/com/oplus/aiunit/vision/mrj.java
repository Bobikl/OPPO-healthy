package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/mrj;", "", "", "a", "Z", "isTemplate", "()Z", "setTemplate", "(Z)V", "", "b", "I", "()I", "d", "(I)V", "count", "c", "f", "onlyOne", MapSchema.FIELD_NAME_ENTRY, "hasStart", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class mrj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isTemplate = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int count;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean onlyOne;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean hasStart;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasStart() {
        return this.hasStart;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOnlyOne() {
        return this.onlyOne;
    }

    public final void d(int i) {
        this.count = i;
    }

    public final void e(boolean z) {
        this.hasStart = z;
    }

    public final void f(boolean z) {
        this.onlyOne = z;
    }
}
