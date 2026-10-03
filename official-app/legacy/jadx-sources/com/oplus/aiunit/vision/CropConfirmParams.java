package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.heytap.health.watchface.business.legacy.creation.album.bean.FrontBgStatus;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ge4, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/ge4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/he4;", "a", "Lcom/oplus/aiunit/vision/he4;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/he4;", "transInfo", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "fgPath", "f", "(Ljava/lang/String;)V", "fgCutPath", "Landroid/graphics/Bitmap;", "d", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "fgBitmap", "Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;", "Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;", "()Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;", "fgStatus", "<init>", "(Lcom/oplus/aiunit/vision/he4;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CropConfirmParams {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final he4 transInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String fgPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String fgCutPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Bitmap fgBitmap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final FrontBgStatus fgStatus;

    public CropConfirmParams(@NotNull he4 transInfo, @Nullable String str, @Nullable String str2, @Nullable Bitmap bitmap, @NotNull FrontBgStatus fgStatus) {
        Intrinsics.checkNotNullParameter(transInfo, "transInfo");
        Intrinsics.checkNotNullParameter(fgStatus, "fgStatus");
        this.transInfo = transInfo;
        this.fgPath = str;
        this.fgCutPath = str2;
        this.fgBitmap = bitmap;
        this.fgStatus = fgStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getFgBitmap() {
        return this.fgBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFgCutPath() {
        return this.fgCutPath;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFgPath() {
        return this.fgPath;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final FrontBgStatus getFgStatus() {
        return this.fgStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final he4 getTransInfo() {
        return this.transInfo;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropConfirmParams)) {
            return false;
        }
        CropConfirmParams cropConfirmParams = (CropConfirmParams) other;
        return Intrinsics.areEqual(this.transInfo, cropConfirmParams.transInfo) && Intrinsics.areEqual(this.fgPath, cropConfirmParams.fgPath) && Intrinsics.areEqual(this.fgCutPath, cropConfirmParams.fgCutPath) && Intrinsics.areEqual(this.fgBitmap, cropConfirmParams.fgBitmap) && this.fgStatus == cropConfirmParams.fgStatus;
    }

    public final void f(@Nullable String str) {
        this.fgCutPath = str;
    }

    public int hashCode() {
        int iHashCode = this.transInfo.hashCode() * 31;
        String str = this.fgPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fgCutPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bitmap bitmap = this.fgBitmap;
        return ((iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + this.fgStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "CropConfirmParams(transInfo=" + this.transInfo + ", fgPath=" + this.fgPath + ", fgCutPath=" + this.fgCutPath + ", fgBitmap=" + this.fgBitmap + ", fgStatus=" + this.fgStatus + ")";
    }
}
