package com.heytap.databaseengineservice.sync.responsebean.sportrecordfile;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001d\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\n¨\u0006."}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/sportrecordfile/PreSignUploadReq;", "", "", "toString", "", "bizType", "I", "getBizType", "()I", "setBizType", "(I)V", "dataClient", "Ljava/lang/String;", "getDataClient", "()Ljava/lang/String;", "setDataClient", "(Ljava/lang/String;)V", "", "startTimestamp", "J", "getStartTimestamp", "()J", "setStartTimestamp", "(J)V", "endTimestamp", "getEndTimestamp", "setEndTimestamp", "clientFileId", "getClientFileId", "setClientFileId", "fileSuffix", "getFileSuffix", "setFileSuffix", "fileMd5", "getFileMd5", "setFileMd5", "encryptKeyId", "getEncryptKeyId", "setEncryptKeyId", "parsingVersion", "getParsingVersion", "setParsingVersion", "<init>", "()V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class PreSignUploadReq {
    public static final int SPORT_RECORD_FILE = 5;
    public static final int THIRD_SPORT_RECORD_FILE = 19;

    @Nullable
    private String dataClient;

    @Nullable
    private String encryptKeyId;
    private long endTimestamp;
    private long startTimestamp;
    private int bizType = 5;

    @NotNull
    private String clientFileId = "";

    @NotNull
    private String fileSuffix = "pbce";

    @NotNull
    private String fileMd5 = "";
    private int parsingVersion = 1;

    public final int getBizType() {
        return this.bizType;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @Nullable
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    public final String getEncryptKeyId() {
        return this.encryptKeyId;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    public final String getFileSuffix() {
        return this.fileSuffix;
    }

    public final int getParsingVersion() {
        return this.parsingVersion;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final void setBizType(int i) {
        this.bizType = i;
    }

    public final void setClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientFileId = str;
    }

    public final void setDataClient(@Nullable String str) {
        this.dataClient = str;
    }

    public final void setEncryptKeyId(@Nullable String str) {
        this.encryptKeyId = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setFileMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileMd5 = str;
    }

    public final void setFileSuffix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileSuffix = str;
    }

    public final void setParsingVersion(int i) {
        this.parsingVersion = i;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    @NotNull
    public String toString() {
        return "PreSignUploadReq(bizType=" + this.bizType + ", dataClient=" + this.dataClient + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", clientFileId='" + this.clientFileId + "', fileSuffix='" + this.fileSuffix + "', fileMd5='" + this.fileMd5 + "', encryptKeyId=" + this.encryptKeyId + ", parsingVersion=" + this.parsingVersion + ")";
    }
}
