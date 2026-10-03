package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/yw6;", "", "", "a", "Z", "b", "()Z", "isFlipped", "", "I", "()I", "rotationDegrees", "<init>", "(ZI)V", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class yw6 {

    @JvmField
    @NotNull
    public static final yw6 NONE = new yw6(false, 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isFlipped;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int rotationDegrees;

    public yw6(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFlipped() {
        return this.isFlipped;
    }
}
