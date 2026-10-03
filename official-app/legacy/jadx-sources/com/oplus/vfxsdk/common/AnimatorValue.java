package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0002\u0010\fJ<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/oplus/vfxsdk/common/AnimatorValue;", "", "id", "", "name", "currentTime", "", "animLines", "", "Lcom/oplus/vfxsdk/common/AnimLine;", "(Ljava/lang/String;Ljava/lang/String;F[Lcom/oplus/vfxsdk/common/AnimLine;)V", "getAnimLines", "()[Lcom/oplus/vfxsdk/common/AnimLine;", "[Lcom/oplus/vfxsdk/common/AnimLine;", "getCurrentTime", "()F", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;F[Lcom/oplus/vfxsdk/common/AnimLine;)Lcom/oplus/vfxsdk/common/AnimatorValue;", "equals", "", "other", "hashCode", "", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnimatorValue {

    @NotNull
    private final AnimLine[] animLines;
    private final float currentTime;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    public AnimatorValue(@NotNull String id, @NotNull String name, float f, @NotNull AnimLine[] animLines) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(animLines, "animLines");
        this.id = id;
        this.name = name;
        this.currentTime = f;
        this.animLines = animLines;
    }

    public static /* synthetic */ AnimatorValue copy$default(AnimatorValue animatorValue, String str, String str2, float f, AnimLine[] animLineArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = animatorValue.id;
        }
        if ((i & 2) != 0) {
            str2 = animatorValue.name;
        }
        if ((i & 4) != 0) {
            f = animatorValue.currentTime;
        }
        if ((i & 8) != 0) {
            animLineArr = animatorValue.animLines;
        }
        return animatorValue.copy(str, str2, f, animLineArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnimLine[] getAnimLines() {
        return this.animLines;
    }

    @NotNull
    public final AnimatorValue copy(@NotNull String id, @NotNull String name, float currentTime, @NotNull AnimLine[] animLines) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(animLines, "animLines");
        return new AnimatorValue(id, name, currentTime, animLines);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatorValue)) {
            return false;
        }
        AnimatorValue animatorValue = (AnimatorValue) other;
        return Intrinsics.areEqual(this.id, animatorValue.id) && Intrinsics.areEqual(this.name, animatorValue.name) && Float.compare(this.currentTime, animatorValue.currentTime) == 0 && Intrinsics.areEqual(this.animLines, animatorValue.animLines);
    }

    @NotNull
    public final AnimLine[] getAnimLines() {
        return this.animLines;
    }

    public final float getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.currentTime)) * 31) + Arrays.hashCode(this.animLines);
    }

    @NotNull
    public String toString() {
        return "AnimatorValue(id=" + this.id + ", name=" + this.name + ", currentTime=" + this.currentTime + ", animLines=" + Arrays.toString(this.animLines) + ")";
    }
}
