package com.oplus.aiuint.open.wallpaper.plugin;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WallPaperMattingEntry {
    private final float aestheticsScore;
    private final boolean isNormalMode;

    @NotNull
    private final int[] labelArray;
    private final boolean onlyCheck;

    public WallPaperMattingEntry(boolean z, float f, @NotNull int[] labelArray, boolean z2) {
        Intrinsics.checkNotNullParameter(labelArray, "labelArray");
        this.isNormalMode = z;
        this.aestheticsScore = f;
        this.labelArray = labelArray;
        this.onlyCheck = z2;
    }

    public static /* synthetic */ WallPaperMattingEntry copy$default(WallPaperMattingEntry wallPaperMattingEntry, boolean z, float f, int[] iArr, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wallPaperMattingEntry.isNormalMode;
        }
        if ((i & 2) != 0) {
            f = wallPaperMattingEntry.aestheticsScore;
        }
        if ((i & 4) != 0) {
            iArr = wallPaperMattingEntry.labelArray;
        }
        if ((i & 8) != 0) {
            z2 = wallPaperMattingEntry.onlyCheck;
        }
        return wallPaperMattingEntry.copy(z, f, iArr, z2);
    }

    public final boolean component1() {
        return this.isNormalMode;
    }

    public final float component2() {
        return this.aestheticsScore;
    }

    @NotNull
    public final int[] component3() {
        return this.labelArray;
    }

    public final boolean component4() {
        return this.onlyCheck;
    }

    @NotNull
    public final WallPaperMattingEntry copy(boolean z, float f, @NotNull int[] labelArray, boolean z2) {
        Intrinsics.checkNotNullParameter(labelArray, "labelArray");
        return new WallPaperMattingEntry(z, f, labelArray, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(WallPaperMattingEntry.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.oplus.aiuint.open.wallpaper.plugin.WallPaperMattingEntry");
        WallPaperMattingEntry wallPaperMattingEntry = (WallPaperMattingEntry) obj;
        if (this.isNormalMode != wallPaperMattingEntry.isNormalMode) {
            return false;
        }
        return ((this.aestheticsScore > wallPaperMattingEntry.aestheticsScore ? 1 : (this.aestheticsScore == wallPaperMattingEntry.aestheticsScore ? 0 : -1)) == 0) && Arrays.equals(this.labelArray, wallPaperMattingEntry.labelArray) && this.onlyCheck == wallPaperMattingEntry.onlyCheck;
    }

    public final float getAestheticsScore() {
        return this.aestheticsScore;
    }

    @NotNull
    public final int[] getLabelArray() {
        return this.labelArray;
    }

    public final boolean getOnlyCheck() {
        return this.onlyCheck;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isNormalMode) * 31) + Float.hashCode(this.aestheticsScore)) * 31) + Arrays.hashCode(this.labelArray)) * 31) + Boolean.hashCode(this.onlyCheck);
    }

    public final boolean isNormalMode() {
        return this.isNormalMode;
    }

    @NotNull
    public String toString() {
        return "WallPaperMattingEntry(isNormalMode=" + this.isNormalMode + ", aestheticsScore=" + this.aestheticsScore + ", labelArray=" + Arrays.toString(this.labelArray) + ", onlyCheck=" + this.onlyCheck + ")";
    }

    public /* synthetic */ WallPaperMattingEntry(boolean z, float f, int[] iArr, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, iArr, (i & 8) != 0 ? false : z2);
    }
}
