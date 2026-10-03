package com.heytap.health.cervical_vertebra.datamodel;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/ProcedureBean;", "", "actionVideo", "Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "audio", "resetVideo", "startTimeMillis", "", "endTimeMillis", "(Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;JJ)V", "getActionVideo", "()Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "getAudio", "getEndTimeMillis", "()J", "getResetVideo", "setResetVideo", "(Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;)V", "getStartTimeMillis", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ProcedureBean {

    @NotNull
    private final DownloadBean actionVideo;

    @NotNull
    private final DownloadBean audio;
    private final long endTimeMillis;

    @NotNull
    private DownloadBean resetVideo;
    private final long startTimeMillis;

    public ProcedureBean(@NotNull DownloadBean actionVideo, @NotNull DownloadBean audio, @NotNull DownloadBean resetVideo, long j2, long j3) {
        Intrinsics.checkNotNullParameter(actionVideo, "actionVideo");
        Intrinsics.checkNotNullParameter(audio, "audio");
        Intrinsics.checkNotNullParameter(resetVideo, "resetVideo");
        this.actionVideo = actionVideo;
        this.audio = audio;
        this.resetVideo = resetVideo;
        this.startTimeMillis = j2;
        this.endTimeMillis = j3;
    }

    public static /* synthetic */ ProcedureBean copy$default(ProcedureBean procedureBean, DownloadBean downloadBean, DownloadBean downloadBean2, DownloadBean downloadBean3, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadBean = procedureBean.actionVideo;
        }
        if ((i & 2) != 0) {
            downloadBean2 = procedureBean.audio;
        }
        DownloadBean downloadBean4 = downloadBean2;
        if ((i & 4) != 0) {
            downloadBean3 = procedureBean.resetVideo;
        }
        DownloadBean downloadBean5 = downloadBean3;
        if ((i & 8) != 0) {
            j2 = procedureBean.startTimeMillis;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            j3 = procedureBean.endTimeMillis;
        }
        return procedureBean.copy(downloadBean, downloadBean4, downloadBean5, j4, j3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownloadBean getActionVideo() {
        return this.actionVideo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownloadBean getAudio() {
        return this.audio;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownloadBean getResetVideo() {
        return this.resetVideo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    @NotNull
    public final ProcedureBean copy(@NotNull DownloadBean actionVideo, @NotNull DownloadBean audio, @NotNull DownloadBean resetVideo, long startTimeMillis, long endTimeMillis) {
        Intrinsics.checkNotNullParameter(actionVideo, "actionVideo");
        Intrinsics.checkNotNullParameter(audio, "audio");
        Intrinsics.checkNotNullParameter(resetVideo, "resetVideo");
        return new ProcedureBean(actionVideo, audio, resetVideo, startTimeMillis, endTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcedureBean)) {
            return false;
        }
        ProcedureBean procedureBean = (ProcedureBean) other;
        return Intrinsics.areEqual(this.actionVideo, procedureBean.actionVideo) && Intrinsics.areEqual(this.audio, procedureBean.audio) && Intrinsics.areEqual(this.resetVideo, procedureBean.resetVideo) && this.startTimeMillis == procedureBean.startTimeMillis && this.endTimeMillis == procedureBean.endTimeMillis;
    }

    @NotNull
    public final DownloadBean getActionVideo() {
        return this.actionVideo;
    }

    @NotNull
    public final DownloadBean getAudio() {
        return this.audio;
    }

    public final long getEndTimeMillis() {
        return this.endTimeMillis;
    }

    @NotNull
    public final DownloadBean getResetVideo() {
        return this.resetVideo;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    public int hashCode() {
        return (((((((this.actionVideo.hashCode() * 31) + this.audio.hashCode()) * 31) + this.resetVideo.hashCode()) * 31) + Long.hashCode(this.startTimeMillis)) * 31) + Long.hashCode(this.endTimeMillis);
    }

    public final void setResetVideo(@NotNull DownloadBean downloadBean) {
        Intrinsics.checkNotNullParameter(downloadBean, "<set-?>");
        this.resetVideo = downloadBean;
    }

    @NotNull
    public String toString() {
        return "ProcedureBean(actionVideo=" + this.actionVideo + ", audio=" + this.audio + ", resetVideo=" + this.resetVideo + ", startTimeMillis=" + this.startTimeMillis + ", endTimeMillis=" + this.endTimeMillis + ")";
    }
}
