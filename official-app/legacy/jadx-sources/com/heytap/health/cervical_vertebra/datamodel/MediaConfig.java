package com.heytap.health.cervical_vertebra.datamodel;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/MediaConfig;", "", "prepareMedia", "Lcom/heytap/health/cervical_vertebra/datamodel/PrepareMediaBean;", "procedures", "", "Lcom/heytap/health/cervical_vertebra/datamodel/ProcedureBean;", "successAudio", "Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "errorAudio", "version", "", "(Lcom/heytap/health/cervical_vertebra/datamodel/PrepareMediaBean;Ljava/util/List;Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;I)V", "getErrorAudio", "()Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "getPrepareMedia", "()Lcom/heytap/health/cervical_vertebra/datamodel/PrepareMediaBean;", "getProcedures", "()Ljava/util/List;", "getSuccessAudio", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MediaConfig {

    @NotNull
    private final DownloadBean errorAudio;

    @NotNull
    private final PrepareMediaBean prepareMedia;

    @NotNull
    private final List<ProcedureBean> procedures;

    @NotNull
    private final DownloadBean successAudio;
    private final int version;

    public MediaConfig(@NotNull PrepareMediaBean prepareMedia, @NotNull List<ProcedureBean> procedures, @NotNull DownloadBean successAudio, @NotNull DownloadBean errorAudio, int i) {
        Intrinsics.checkNotNullParameter(prepareMedia, "prepareMedia");
        Intrinsics.checkNotNullParameter(procedures, "procedures");
        Intrinsics.checkNotNullParameter(successAudio, "successAudio");
        Intrinsics.checkNotNullParameter(errorAudio, "errorAudio");
        this.prepareMedia = prepareMedia;
        this.procedures = procedures;
        this.successAudio = successAudio;
        this.errorAudio = errorAudio;
        this.version = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MediaConfig copy$default(MediaConfig mediaConfig, PrepareMediaBean prepareMediaBean, List list, DownloadBean downloadBean, DownloadBean downloadBean2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            prepareMediaBean = mediaConfig.prepareMedia;
        }
        if ((i2 & 2) != 0) {
            list = mediaConfig.procedures;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            downloadBean = mediaConfig.successAudio;
        }
        DownloadBean downloadBean3 = downloadBean;
        if ((i2 & 8) != 0) {
            downloadBean2 = mediaConfig.errorAudio;
        }
        DownloadBean downloadBean4 = downloadBean2;
        if ((i2 & 16) != 0) {
            i = mediaConfig.version;
        }
        return mediaConfig.copy(prepareMediaBean, list2, downloadBean3, downloadBean4, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PrepareMediaBean getPrepareMedia() {
        return this.prepareMedia;
    }

    @NotNull
    public final List<ProcedureBean> component2() {
        return this.procedures;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownloadBean getSuccessAudio() {
        return this.successAudio;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DownloadBean getErrorAudio() {
        return this.errorAudio;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    public final MediaConfig copy(@NotNull PrepareMediaBean prepareMedia, @NotNull List<ProcedureBean> procedures, @NotNull DownloadBean successAudio, @NotNull DownloadBean errorAudio, int version) {
        Intrinsics.checkNotNullParameter(prepareMedia, "prepareMedia");
        Intrinsics.checkNotNullParameter(procedures, "procedures");
        Intrinsics.checkNotNullParameter(successAudio, "successAudio");
        Intrinsics.checkNotNullParameter(errorAudio, "errorAudio");
        return new MediaConfig(prepareMedia, procedures, successAudio, errorAudio, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaConfig)) {
            return false;
        }
        MediaConfig mediaConfig = (MediaConfig) other;
        return Intrinsics.areEqual(this.prepareMedia, mediaConfig.prepareMedia) && Intrinsics.areEqual(this.procedures, mediaConfig.procedures) && Intrinsics.areEqual(this.successAudio, mediaConfig.successAudio) && Intrinsics.areEqual(this.errorAudio, mediaConfig.errorAudio) && this.version == mediaConfig.version;
    }

    @NotNull
    public final DownloadBean getErrorAudio() {
        return this.errorAudio;
    }

    @NotNull
    public final PrepareMediaBean getPrepareMedia() {
        return this.prepareMedia;
    }

    @NotNull
    public final List<ProcedureBean> getProcedures() {
        return this.procedures;
    }

    @NotNull
    public final DownloadBean getSuccessAudio() {
        return this.successAudio;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((this.prepareMedia.hashCode() * 31) + this.procedures.hashCode()) * 31) + this.successAudio.hashCode()) * 31) + this.errorAudio.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    @NotNull
    public String toString() {
        return "MediaConfig(prepareMedia=" + this.prepareMedia + ", procedures=" + this.procedures + ", successAudio=" + this.successAudio + ", errorAudio=" + this.errorAudio + ", version=" + this.version + ")";
    }
}
