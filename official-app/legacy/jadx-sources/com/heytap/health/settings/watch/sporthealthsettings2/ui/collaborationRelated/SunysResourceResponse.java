package com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006*"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/SunysResourceResponse;", "", "path", "", LogSenderConst.FILENAME, CloudDownloadWorker.KEY_SECRET, "version", "", "status", "sizeBeforeEncryption", "", "sizeAfterEncryption", "md5BeforeEncryption", "md5AfterEncryption", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJLjava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getMd5AfterEncryption", "getMd5BeforeEncryption", "getPath", "getSecret", "getSizeAfterEncryption", "()J", "getSizeBeforeEncryption", "getStatus", "()I", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SunysResourceResponse {
    public static final int $stable = 0;

    @SerializedName(LogSenderConst.FILENAME)
    @NotNull
    private final String fileName;

    @SerializedName("md5AfterEncryption")
    @NotNull
    private final String md5AfterEncryption;

    @SerializedName("md5BeforeEncryption")
    @NotNull
    private final String md5BeforeEncryption;

    @SerializedName("path")
    @NotNull
    private final String path;

    @SerializedName(CloudDownloadWorker.KEY_SECRET)
    @NotNull
    private final String secret;

    @SerializedName("sizeAfterEncryption")
    private final long sizeAfterEncryption;

    @SerializedName("sizeBeforeEncryption")
    private final long sizeBeforeEncryption;

    @SerializedName("status")
    private final int status;

    @SerializedName("version")
    private final int version;

    public SunysResourceResponse(@NotNull String path, @NotNull String fileName, @NotNull String secret, int i, int i2, long j2, long j3, @NotNull String md5BeforeEncryption, @NotNull String md5AfterEncryption) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(md5BeforeEncryption, "md5BeforeEncryption");
        Intrinsics.checkNotNullParameter(md5AfterEncryption, "md5AfterEncryption");
        this.path = path;
        this.fileName = fileName;
        this.secret = secret;
        this.version = i;
        this.status = i2;
        this.sizeBeforeEncryption = j2;
        this.sizeAfterEncryption = j3;
        this.md5BeforeEncryption = md5BeforeEncryption;
        this.md5AfterEncryption = md5AfterEncryption;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getSizeBeforeEncryption() {
        return this.sizeBeforeEncryption;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSizeAfterEncryption() {
        return this.sizeAfterEncryption;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMd5BeforeEncryption() {
        return this.md5BeforeEncryption;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMd5AfterEncryption() {
        return this.md5AfterEncryption;
    }

    @NotNull
    public final SunysResourceResponse copy(@NotNull String path, @NotNull String fileName, @NotNull String secret, int version, int status, long sizeBeforeEncryption, long sizeAfterEncryption, @NotNull String md5BeforeEncryption, @NotNull String md5AfterEncryption) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(md5BeforeEncryption, "md5BeforeEncryption");
        Intrinsics.checkNotNullParameter(md5AfterEncryption, "md5AfterEncryption");
        return new SunysResourceResponse(path, fileName, secret, version, status, sizeBeforeEncryption, sizeAfterEncryption, md5BeforeEncryption, md5AfterEncryption);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SunysResourceResponse)) {
            return false;
        }
        SunysResourceResponse sunysResourceResponse = (SunysResourceResponse) other;
        return Intrinsics.areEqual(this.path, sunysResourceResponse.path) && Intrinsics.areEqual(this.fileName, sunysResourceResponse.fileName) && Intrinsics.areEqual(this.secret, sunysResourceResponse.secret) && this.version == sunysResourceResponse.version && this.status == sunysResourceResponse.status && this.sizeBeforeEncryption == sunysResourceResponse.sizeBeforeEncryption && this.sizeAfterEncryption == sunysResourceResponse.sizeAfterEncryption && Intrinsics.areEqual(this.md5BeforeEncryption, sunysResourceResponse.md5BeforeEncryption) && Intrinsics.areEqual(this.md5AfterEncryption, sunysResourceResponse.md5AfterEncryption);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getMd5AfterEncryption() {
        return this.md5AfterEncryption;
    }

    @NotNull
    public final String getMd5BeforeEncryption() {
        return this.md5BeforeEncryption;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getSecret() {
        return this.secret;
    }

    public final long getSizeAfterEncryption() {
        return this.sizeAfterEncryption;
    }

    public final long getSizeBeforeEncryption() {
        return this.sizeBeforeEncryption;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((this.path.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.secret.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.sizeBeforeEncryption)) * 31) + Long.hashCode(this.sizeAfterEncryption)) * 31) + this.md5BeforeEncryption.hashCode()) * 31) + this.md5AfterEncryption.hashCode();
    }

    @NotNull
    public String toString() {
        return "SunysResourceResponse(path=" + this.path + ", fileName=" + this.fileName + ", secret=" + this.secret + ", version=" + this.version + ", status=" + this.status + ", sizeBeforeEncryption=" + this.sizeBeforeEncryption + ", sizeAfterEncryption=" + this.sizeAfterEncryption + ", md5BeforeEncryption=" + this.md5BeforeEncryption + ", md5AfterEncryption=" + this.md5AfterEncryption + ")";
    }
}
