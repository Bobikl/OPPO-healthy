package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B;\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/heytap/health/health_archives/bean/SyncProgressBean;", "", "", "component1", "component2", "component3", "component4", "", "component5", "progressState", "uploadedCount", "totalCount", "progress", "progressTips", "copy", "toString", "hashCode", "other", "", "equals", "I", "getProgressState", "()I", "setProgressState", "(I)V", "getUploadedCount", "setUploadedCount", "getTotalCount", "setTotalCount", "getProgress", ClickApiEntity.SET_PROGRESS, "Ljava/lang/String;", "getProgressTips", "()Ljava/lang/String;", "setProgressTips", "(Ljava/lang/String;)V", "<init>", "(IIIILjava/lang/String;)V", "Companion", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SyncProgressBean {
    public static final int DISMISS = 0;
    public static final int SHOW_BACK_UPLOAD_TIPS = 9;
    public static final int SHOW_COMPLETE = 4;
    public static final int SHOW_LOADING = 1;
    public static final int SHOW_MOBILE_NET = 6;
    public static final int SHOW_NOT_FOUND_MEDICAL_FILE = 10;
    public static final int SHOW_NO_NETWORK = 7;
    public static final int SHOW_SYNCING_STATUS_VIEW = 8;
    public static final int SHOW_WAITING = 3;
    public static final int SHOW_WIFI_UNAVAILABLE = 5;
    public static final int UPDATE_PROGRESS = 2;
    private int progress;
    private int progressState;

    @Nullable
    private String progressTips;
    private int totalCount;
    private int uploadedCount;

    public SyncProgressBean() {
        this(0, 0, 0, 0, null, 31, null);
    }

    public static /* synthetic */ SyncProgressBean copy$default(SyncProgressBean syncProgressBean, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = syncProgressBean.progressState;
        }
        if ((i5 & 2) != 0) {
            i2 = syncProgressBean.uploadedCount;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = syncProgressBean.totalCount;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = syncProgressBean.progress;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = syncProgressBean.progressTips;
        }
        return syncProgressBean.copy(i, i6, i7, i8, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgressState() {
        return this.progressState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUploadedCount() {
        return this.uploadedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProgressTips() {
        return this.progressTips;
    }

    @NotNull
    public final SyncProgressBean copy(int progressState, int uploadedCount, int totalCount, int progress, @Nullable String progressTips) {
        return new SyncProgressBean(progressState, uploadedCount, totalCount, progress, progressTips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncProgressBean)) {
            return false;
        }
        SyncProgressBean syncProgressBean = (SyncProgressBean) other;
        return this.progressState == syncProgressBean.progressState && this.uploadedCount == syncProgressBean.uploadedCount && this.totalCount == syncProgressBean.totalCount && this.progress == syncProgressBean.progress && Intrinsics.areEqual(this.progressTips, syncProgressBean.progressTips);
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getProgressState() {
        return this.progressState;
    }

    @Nullable
    public final String getProgressTips() {
        return this.progressTips;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getUploadedCount() {
        return this.uploadedCount;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.progressState) * 31) + Integer.hashCode(this.uploadedCount)) * 31) + Integer.hashCode(this.totalCount)) * 31) + Integer.hashCode(this.progress)) * 31;
        String str = this.progressTips;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setProgressState(int i) {
        this.progressState = i;
    }

    public final void setProgressTips(@Nullable String str) {
        this.progressTips = str;
    }

    public final void setTotalCount(int i) {
        this.totalCount = i;
    }

    public final void setUploadedCount(int i) {
        this.uploadedCount = i;
    }

    @NotNull
    public String toString() {
        return "SyncProgressBean(progressState=" + this.progressState + ", uploadedCount=" + this.uploadedCount + ", totalCount=" + this.totalCount + ", progress=" + this.progress + ", progressTips=" + this.progressTips + ")";
    }

    public SyncProgressBean(int i, int i2, int i3, int i4, @Nullable String str) {
        this.progressState = i;
        this.uploadedCount = i2;
        this.totalCount = i3;
        this.progress = i4;
        this.progressTips = str;
    }

    public /* synthetic */ SyncProgressBean(int i, int i2, int i3, int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? null : str);
    }
}
