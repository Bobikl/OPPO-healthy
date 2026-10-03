package com.heytap.health.cervical_vertebra.datamodel;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/PrepareMediaBean;", "", "actionVideo", "Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "actionAudio", "successAudio", "startTimeMillis", "", "(Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;J)V", "getActionAudio", "()Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "getActionVideo", "getStartTimeMillis", "()J", "getSuccessAudio", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PrepareMediaBean {

    @NotNull
    private final DownloadBean actionAudio;

    @NotNull
    private final DownloadBean actionVideo;
    private final long startTimeMillis;

    @NotNull
    private final DownloadBean successAudio;

    public PrepareMediaBean(@NotNull DownloadBean actionVideo, @NotNull DownloadBean actionAudio, @NotNull DownloadBean successAudio, long j2) {
        Intrinsics.checkNotNullParameter(actionVideo, "actionVideo");
        Intrinsics.checkNotNullParameter(actionAudio, "actionAudio");
        Intrinsics.checkNotNullParameter(successAudio, "successAudio");
        this.actionVideo = actionVideo;
        this.actionAudio = actionAudio;
        this.successAudio = successAudio;
        this.startTimeMillis = j2;
    }

    public static /* synthetic */ PrepareMediaBean copy$default(PrepareMediaBean prepareMediaBean, DownloadBean downloadBean, DownloadBean downloadBean2, DownloadBean downloadBean3, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadBean = prepareMediaBean.actionVideo;
        }
        if ((i & 2) != 0) {
            downloadBean2 = prepareMediaBean.actionAudio;
        }
        DownloadBean downloadBean4 = downloadBean2;
        if ((i & 4) != 0) {
            downloadBean3 = prepareMediaBean.successAudio;
        }
        DownloadBean downloadBean5 = downloadBean3;
        if ((i & 8) != 0) {
            j2 = prepareMediaBean.startTimeMillis;
        }
        return prepareMediaBean.copy(downloadBean, downloadBean4, downloadBean5, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownloadBean getActionVideo() {
        return this.actionVideo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownloadBean getActionAudio() {
        return this.actionAudio;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownloadBean getSuccessAudio() {
        return this.successAudio;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    @NotNull
    public final PrepareMediaBean copy(@NotNull DownloadBean actionVideo, @NotNull DownloadBean actionAudio, @NotNull DownloadBean successAudio, long startTimeMillis) {
        Intrinsics.checkNotNullParameter(actionVideo, "actionVideo");
        Intrinsics.checkNotNullParameter(actionAudio, "actionAudio");
        Intrinsics.checkNotNullParameter(successAudio, "successAudio");
        return new PrepareMediaBean(actionVideo, actionAudio, successAudio, startTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepareMediaBean)) {
            return false;
        }
        PrepareMediaBean prepareMediaBean = (PrepareMediaBean) other;
        return Intrinsics.areEqual(this.actionVideo, prepareMediaBean.actionVideo) && Intrinsics.areEqual(this.actionAudio, prepareMediaBean.actionAudio) && Intrinsics.areEqual(this.successAudio, prepareMediaBean.successAudio) && this.startTimeMillis == prepareMediaBean.startTimeMillis;
    }

    @NotNull
    public final DownloadBean getActionAudio() {
        return this.actionAudio;
    }

    @NotNull
    public final DownloadBean getActionVideo() {
        return this.actionVideo;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    @NotNull
    public final DownloadBean getSuccessAudio() {
        return this.successAudio;
    }

    public int hashCode() {
        return (((((this.actionVideo.hashCode() * 31) + this.actionAudio.hashCode()) * 31) + this.successAudio.hashCode()) * 31) + Long.hashCode(this.startTimeMillis);
    }

    @NotNull
    public String toString() {
        return "PrepareMediaBean(actionVideo=" + this.actionVideo + ", actionAudio=" + this.actionAudio + ", successAudio=" + this.successAudio + ", startTimeMillis=" + this.startTimeMillis + ")";
    }
}
