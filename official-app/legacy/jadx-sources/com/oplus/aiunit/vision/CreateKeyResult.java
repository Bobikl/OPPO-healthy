package com.oplus.aiunit.vision;

import org.iccoa.android.digitalkey.DigitalKeyData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.gd4, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/gd4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "progress", "Lorg/iccoa/android/digitalkey/DigitalKeyData;", "Lorg/iccoa/android/digitalkey/DigitalKeyData;", "()Lorg/iccoa/android/digitalkey/DigitalKeyData;", "digitalKeyData", "<init>", "(ILorg/iccoa/android/digitalkey/DigitalKeyData;)V", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CreateKeyResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int progress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final DigitalKeyData digitalKeyData;

    public CreateKeyResult(int i, @Nullable DigitalKeyData digitalKeyData) {
        this.progress = i;
        this.digitalKeyData = digitalKeyData;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DigitalKeyData getDigitalKeyData() {
        return this.digitalKeyData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateKeyResult)) {
            return false;
        }
        CreateKeyResult createKeyResult = (CreateKeyResult) other;
        return this.progress == createKeyResult.progress && Intrinsics.areEqual(this.digitalKeyData, createKeyResult.digitalKeyData);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.progress) * 31;
        DigitalKeyData digitalKeyData = this.digitalKeyData;
        return iHashCode + (digitalKeyData == null ? 0 : digitalKeyData.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateKeyResult(progress=" + this.progress + ", digitalKeyData=" + this.digitalKeyData + ")";
    }
}
