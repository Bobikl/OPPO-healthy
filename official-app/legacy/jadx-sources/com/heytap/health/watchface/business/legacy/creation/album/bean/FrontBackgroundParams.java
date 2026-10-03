package com.heytap.health.watchface.business.legacy.creation.album.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBackgroundParams;", "", "mFgPath", "", "mFgCutPath", "mFgStatus", "Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;)V", "getMFgCutPath", "()Ljava/lang/String;", "setMFgCutPath", "(Ljava/lang/String;)V", "getMFgPath", "setMFgPath", "getMFgStatus", "()Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;", "setMFgStatus", "(Lcom/heytap/health/watchface/business/legacy/creation/album/bean/FrontBgStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FrontBackgroundParams {

    @Nullable
    private String mFgCutPath;

    @Nullable
    private String mFgPath;

    @NotNull
    private FrontBgStatus mFgStatus;

    public FrontBackgroundParams() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FrontBackgroundParams copy$default(FrontBackgroundParams frontBackgroundParams, String str, String str2, FrontBgStatus frontBgStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frontBackgroundParams.mFgPath;
        }
        if ((i & 2) != 0) {
            str2 = frontBackgroundParams.mFgCutPath;
        }
        if ((i & 4) != 0) {
            frontBgStatus = frontBackgroundParams.mFgStatus;
        }
        return frontBackgroundParams.copy(str, str2, frontBgStatus);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMFgPath() {
        return this.mFgPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMFgCutPath() {
        return this.mFgCutPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FrontBgStatus getMFgStatus() {
        return this.mFgStatus;
    }

    @NotNull
    public final FrontBackgroundParams copy(@Nullable String mFgPath, @Nullable String mFgCutPath, @NotNull FrontBgStatus mFgStatus) {
        Intrinsics.checkNotNullParameter(mFgStatus, "mFgStatus");
        return new FrontBackgroundParams(mFgPath, mFgCutPath, mFgStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrontBackgroundParams)) {
            return false;
        }
        FrontBackgroundParams frontBackgroundParams = (FrontBackgroundParams) other;
        return Intrinsics.areEqual(this.mFgPath, frontBackgroundParams.mFgPath) && Intrinsics.areEqual(this.mFgCutPath, frontBackgroundParams.mFgCutPath) && this.mFgStatus == frontBackgroundParams.mFgStatus;
    }

    @Nullable
    public final String getMFgCutPath() {
        return this.mFgCutPath;
    }

    @Nullable
    public final String getMFgPath() {
        return this.mFgPath;
    }

    @NotNull
    public final FrontBgStatus getMFgStatus() {
        return this.mFgStatus;
    }

    public int hashCode() {
        String str = this.mFgPath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mFgCutPath;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mFgStatus.hashCode();
    }

    public final void setMFgCutPath(@Nullable String str) {
        this.mFgCutPath = str;
    }

    public final void setMFgPath(@Nullable String str) {
        this.mFgPath = str;
    }

    public final void setMFgStatus(@NotNull FrontBgStatus frontBgStatus) {
        Intrinsics.checkNotNullParameter(frontBgStatus, "<set-?>");
        this.mFgStatus = frontBgStatus;
    }

    @NotNull
    public String toString() {
        return "FrontBackgroundParams(mFgPath=" + this.mFgPath + ", mFgCutPath=" + this.mFgCutPath + ", mFgStatus=" + this.mFgStatus + ")";
    }

    public FrontBackgroundParams(@Nullable String str, @Nullable String str2, @NotNull FrontBgStatus mFgStatus) {
        Intrinsics.checkNotNullParameter(mFgStatus, "mFgStatus");
        this.mFgPath = str;
        this.mFgCutPath = str2;
        this.mFgStatus = mFgStatus;
    }

    public /* synthetic */ FrontBackgroundParams(String str, String str2, FrontBgStatus frontBgStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? FrontBgStatus.NOT_ADJUST : frontBgStatus);
    }
}
