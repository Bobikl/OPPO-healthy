package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003JG\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\b\u0010)\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/heytap/health/health_archives/bean/AutoSyncStructResult;", "", "docId", "", "path", "clientFileId", "fileMd5", "resultCode", "", "structTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getDocId", "setDocId", "getFileMd5", "setFileMd5", "getPath", "setPath", "getResultCode", "()I", "setResultCode", "(I)V", "getStructTime", "()J", "setStructTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AutoSyncStructResult {

    @NotNull
    private String clientFileId;

    @Nullable
    private String docId;

    @NotNull
    private String fileMd5;

    @NotNull
    private String path;
    private int resultCode;
    private long structTime;

    public AutoSyncStructResult() {
        this(null, null, null, null, 0, 0L, 63, null);
    }

    public static /* synthetic */ AutoSyncStructResult copy$default(AutoSyncStructResult autoSyncStructResult, String str, String str2, String str3, String str4, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = autoSyncStructResult.docId;
        }
        if ((i2 & 2) != 0) {
            str2 = autoSyncStructResult.path;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = autoSyncStructResult.clientFileId;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = autoSyncStructResult.fileMd5;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = autoSyncStructResult.resultCode;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            j2 = autoSyncStructResult.structTime;
        }
        return autoSyncStructResult.copy(str, str5, str6, str7, i3, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDocId() {
        return this.docId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStructTime() {
        return this.structTime;
    }

    @NotNull
    public final AutoSyncStructResult copy(@Nullable String docId, @NotNull String path, @NotNull String clientFileId, @NotNull String fileMd5, int resultCode, long structTime) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        return new AutoSyncStructResult(docId, path, clientFileId, fileMd5, resultCode, structTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSyncStructResult)) {
            return false;
        }
        AutoSyncStructResult autoSyncStructResult = (AutoSyncStructResult) other;
        return Intrinsics.areEqual(this.docId, autoSyncStructResult.docId) && Intrinsics.areEqual(this.path, autoSyncStructResult.path) && Intrinsics.areEqual(this.clientFileId, autoSyncStructResult.clientFileId) && Intrinsics.areEqual(this.fileMd5, autoSyncStructResult.fileMd5) && this.resultCode == autoSyncStructResult.resultCode && this.structTime == autoSyncStructResult.structTime;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getDocId() {
        return this.docId;
    }

    @NotNull
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final long getStructTime() {
        return this.structTime;
    }

    public int hashCode() {
        String str = this.docId;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.path.hashCode()) * 31) + this.clientFileId.hashCode()) * 31) + this.fileMd5.hashCode()) * 31) + Integer.hashCode(this.resultCode)) * 31) + Long.hashCode(this.structTime);
    }

    public final void setClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientFileId = str;
    }

    public final void setDocId(@Nullable String str) {
        this.docId = str;
    }

    public final void setFileMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileMd5 = str;
    }

    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public final void setResultCode(int i) {
        this.resultCode = i;
    }

    public final void setStructTime(long j2) {
        this.structTime = j2;
    }

    @NotNull
    public String toString() {
        return "docId: " + this.docId + ", code: " + this.resultCode;
    }

    public AutoSyncStructResult(@Nullable String str, @NotNull String path, @NotNull String clientFileId, @NotNull String fileMd5, int i, long j2) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        this.docId = str;
        this.path = path;
        this.clientFileId = clientFileId;
        this.fileMd5 = fileMd5;
        this.resultCode = i;
        this.structTime = j2;
    }

    public /* synthetic */ AutoSyncStructResult(String str, String str2, String str3, String str4, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? 0L : j2);
    }
}
