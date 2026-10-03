package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/Params;", "", "faceWidth", "", "faceHeight", "(FF)V", "getFaceHeight", "()F", "getFaceWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Params {
    private final float faceHeight;
    private final float faceWidth;

    public Params(float f, float f2) {
        this.faceWidth = f;
        this.faceHeight = f2;
    }

    public static /* synthetic */ Params copy$default(Params params, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = params.faceWidth;
        }
        if ((i & 2) != 0) {
            f2 = params.faceHeight;
        }
        return params.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getFaceWidth() {
        return this.faceWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFaceHeight() {
        return this.faceHeight;
    }

    @NotNull
    public final Params copy(float faceWidth, float faceHeight) {
        return new Params(faceWidth, faceHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Params)) {
            return false;
        }
        Params params = (Params) other;
        return Float.compare(this.faceWidth, params.faceWidth) == 0 && Float.compare(this.faceHeight, params.faceHeight) == 0;
    }

    public final float getFaceHeight() {
        return this.faceHeight;
    }

    public final float getFaceWidth() {
        return this.faceWidth;
    }

    public int hashCode() {
        return (Float.hashCode(this.faceWidth) * 31) + Float.hashCode(this.faceHeight);
    }

    @NotNull
    public String toString() {
        return "Params(faceWidth=" + this.faceWidth + ", faceHeight=" + this.faceHeight + ")";
    }
}
