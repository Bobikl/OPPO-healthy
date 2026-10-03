package com.oplus.aiuint.open.wallpaper.plugin;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.core.app.FrameMetricsAggregator;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWallPaperMattingResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallPaperMattingResult.kt\ncom/oplus/aiuint/open/wallpaper/plugin/WallPaperMattingResult\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,84:1\n26#2:85\n*S KotlinDebug\n*F\n+ 1 WallPaperMattingResult.kt\ncom/oplus/aiuint/open/wallpaper/plugin/WallPaperMattingResult\n*L\n18#1:85\n*E\n"})
public final class WallPaperMattingResult {
    private final float aestheticsScore;
    private final int code;

    @NotNull
    private final String errorMsg;
    private final boolean isNormalMode;

    @Nullable
    private final int[] labelList;
    private final int maskBodyCount;

    @NotNull
    private final PointF[] maskPath;
    private final int pluginVersion;

    @Nullable
    private Bitmap resultBitmap;

    public WallPaperMattingResult() {
        this(false, null, null, 0, null, 0.0f, 0, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final boolean component1() {
        return this.isNormalMode;
    }

    @Nullable
    public final Bitmap component2() {
        return this.resultBitmap;
    }

    @NotNull
    public final PointF[] component3() {
        return this.maskPath;
    }

    public final int component4() {
        return this.maskBodyCount;
    }

    @Nullable
    public final int[] component5() {
        return this.labelList;
    }

    public final float component6() {
        return this.aestheticsScore;
    }

    public final int component7() {
        return this.code;
    }

    @NotNull
    public final String component8() {
        return this.errorMsg;
    }

    public final int component9() {
        return this.pluginVersion;
    }

    @NotNull
    public final WallPaperMattingResult copy(boolean z, @Nullable Bitmap bitmap, @NotNull PointF[] maskPath, int i, @Nullable int[] iArr, float f, int i2, @NotNull String errorMsg, int i3) {
        Intrinsics.checkNotNullParameter(maskPath, "maskPath");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        return new WallPaperMattingResult(z, bitmap, maskPath, i, iArr, f, i2, errorMsg, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(WallPaperMattingResult.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.oplus.aiuint.open.wallpaper.plugin.WallPaperMattingResult");
        WallPaperMattingResult wallPaperMattingResult = (WallPaperMattingResult) obj;
        if (this.isNormalMode != wallPaperMattingResult.isNormalMode || !Intrinsics.areEqual(this.resultBitmap, wallPaperMattingResult.resultBitmap) || !Arrays.equals(this.maskPath, wallPaperMattingResult.maskPath) || this.maskBodyCount != wallPaperMattingResult.maskBodyCount) {
            return false;
        }
        int[] iArr = this.labelList;
        if (iArr != null) {
            int[] iArr2 = wallPaperMattingResult.labelList;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (wallPaperMattingResult.labelList != null) {
            return false;
        }
        return ((this.aestheticsScore > wallPaperMattingResult.aestheticsScore ? 1 : (this.aestheticsScore == wallPaperMattingResult.aestheticsScore ? 0 : -1)) == 0) && this.code == wallPaperMattingResult.code && Intrinsics.areEqual(this.errorMsg, wallPaperMattingResult.errorMsg) && this.pluginVersion == wallPaperMattingResult.pluginVersion;
    }

    public final float getAestheticsScore() {
        return this.aestheticsScore;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @Nullable
    public final int[] getLabelList() {
        return this.labelList;
    }

    public final int getMaskBodyCount() {
        return this.maskBodyCount;
    }

    @NotNull
    public final PointF[] getMaskPath() {
        return this.maskPath;
    }

    public final int getPluginVersion() {
        return this.pluginVersion;
    }

    @Nullable
    public final Bitmap getResultBitmap() {
        return this.resultBitmap;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNormalMode) * 31;
        Bitmap bitmap = this.resultBitmap;
        int iHashCode2 = (((((iHashCode + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + Arrays.hashCode(this.maskPath)) * 31) + this.maskBodyCount) * 31;
        int[] iArr = this.labelList;
        return ((((((((iHashCode2 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31) + Float.hashCode(this.aestheticsScore)) * 31) + this.code) * 31) + this.errorMsg.hashCode()) * 31) + this.pluginVersion;
    }

    public final boolean isNormalMode() {
        return this.isNormalMode;
    }

    public final void setResultBitmap(@Nullable Bitmap bitmap) {
        this.resultBitmap = bitmap;
    }

    @NotNull
    public String toString() {
        return "WallPaperMattingResult(isNormalMode=" + this.isNormalMode + ", resultBitmap=" + this.resultBitmap + ", maskPath=" + Arrays.toString(this.maskPath) + ", maskBodyCount=" + this.maskBodyCount + ", labelList=" + Arrays.toString(this.labelList) + ", aestheticsScore=" + this.aestheticsScore + ", code=" + this.code + ", errorMsg=" + this.errorMsg + ", pluginVersion=" + this.pluginVersion + ")";
    }

    public WallPaperMattingResult(boolean z, @Nullable Bitmap bitmap, @NotNull PointF[] maskPath, int i, @Nullable int[] iArr, float f, int i2, @NotNull String errorMsg, int i3) {
        Intrinsics.checkNotNullParameter(maskPath, "maskPath");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.isNormalMode = z;
        this.resultBitmap = bitmap;
        this.maskPath = maskPath;
        this.maskBodyCount = i;
        this.labelList = iArr;
        this.aestheticsScore = f;
        this.code = i2;
        this.errorMsg = errorMsg;
        this.pluginVersion = i3;
    }

    public /* synthetic */ WallPaperMattingResult(boolean z, Bitmap bitmap, PointF[] pointFArr, int i, int[] iArr, float f, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : bitmap, (i4 & 4) != 0 ? new PointF[0] : pointFArr, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? new int[0] : iArr, (i4 & 32) != 0 ? 0.0f : f, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? "" : str, (i4 & 256) != 0 ? 1000 : i3);
    }
}
