package com.heytap.health.watchpair.manager;

import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.heytap.health.watchpair.manager.b, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u001e\u0012\b\b\u0002\u0010&\u001a\u00020\u0016¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019\"\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\t\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001c¨\u0006)"}, d2 = {"Lcom/heytap/health/watchpair/manager/b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "model", "b", "getDownloadPath", "f", "(Ljava/lang/String;)V", "downloadPath", "c", "i", "fileMd5", "", "J", MapSchema.FIELD_NAME_ENTRY, "()J", "startTime", b2n.g, "(J)V", "endTime", "Lcom/heytap/health/watchpair/manager/c;", "Lcom/heytap/health/watchpair/manager/c;", "()Lcom/heytap/health/watchpair/manager/c;", b2n.f, "(Lcom/heytap/health/watchpair/manager/c;)V", "downloadState", "getRetryCount", "j", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/heytap/health/watchpair/manager/c;J)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DownloadResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String downloadPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String fileMd5;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long endTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public c downloadState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public long retryCount;

    public DownloadResult(@NotNull String model, @NotNull String downloadPath, @NotNull String fileMd5, long j2, long j3, @NotNull c downloadState, long j4) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(downloadPath, "downloadPath");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        this.model = model;
        this.downloadPath = downloadPath;
        this.fileMd5 = fileMd5;
        this.startTime = j2;
        this.endTime = j3;
        this.downloadState = downloadState;
        this.retryCount = j4;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDownloadState() {
        return this.downloadState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadResult)) {
            return false;
        }
        DownloadResult downloadResult = (DownloadResult) other;
        return Intrinsics.areEqual(this.model, downloadResult.model) && Intrinsics.areEqual(this.downloadPath, downloadResult.downloadPath) && Intrinsics.areEqual(this.fileMd5, downloadResult.fileMd5) && this.startTime == downloadResult.startTime && this.endTime == downloadResult.endTime && Intrinsics.areEqual(this.downloadState, downloadResult.downloadState) && this.retryCount == downloadResult.retryCount;
    }

    public final void f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadPath = str;
    }

    public final void g(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.downloadState = cVar;
    }

    public final void h(long j2) {
        this.endTime = j2;
    }

    public int hashCode() {
        return (((((((((((this.model.hashCode() * 31) + this.downloadPath.hashCode()) * 31) + this.fileMd5.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + this.downloadState.hashCode()) * 31) + Long.hashCode(this.retryCount);
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileMd5 = str;
    }

    public final void j(long j2) {
        this.retryCount = j2;
    }

    @NotNull
    public String toString() {
        return "DownloadResult(model=" + this.model + ", downloadPath=" + this.downloadPath + ", fileMd5=" + this.fileMd5 + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", downloadState=" + this.downloadState + ", retryCount=" + this.retryCount + ")";
    }

    public /* synthetic */ DownloadResult(String str, String str2, String str3, long j2, long j3, c cVar, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, j2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? c.e.INSTANCE : cVar, (i & 64) != 0 ? 0L : j4);
    }
}
