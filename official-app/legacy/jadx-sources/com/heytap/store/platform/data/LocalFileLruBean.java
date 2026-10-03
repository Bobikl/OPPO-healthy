package com.heytap.store.platform.data;

import androidx.annotation.Keep;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/heytap/store/platform/data/LocalFileLruBean;", "", "key", "", SpeechConstant.KEY_TTS_TIMESTAMP, "", "filePath", LogSenderConst.FILENAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "getFilePath", "setFilePath", "getKey", "setKey", "getTimeStamp", "()Ljava/lang/Long;", "setTimeStamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/platform/data/LocalFileLruBean;", "equals", "", "other", "hashCode", "", "toString", "download_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class LocalFileLruBean {

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;

    @Nullable
    private String key;

    @Nullable
    private Long timeStamp;

    public LocalFileLruBean(@Nullable String str, @Nullable Long l2, @Nullable String str2, @Nullable String str3) {
        this.key = str;
        this.timeStamp = l2;
        this.filePath = str2;
        this.fileName = str3;
    }

    public static /* synthetic */ LocalFileLruBean copy$default(LocalFileLruBean localFileLruBean, String str, Long l2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localFileLruBean.key;
        }
        if ((i & 2) != 0) {
            l2 = localFileLruBean.timeStamp;
        }
        if ((i & 4) != 0) {
            str2 = localFileLruBean.filePath;
        }
        if ((i & 8) != 0) {
            str3 = localFileLruBean.fileName;
        }
        return localFileLruBean.copy(str, l2, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final LocalFileLruBean copy(@Nullable String key, @Nullable Long timeStamp, @Nullable String filePath, @Nullable String fileName) {
        return new LocalFileLruBean(key, timeStamp, filePath, fileName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalFileLruBean)) {
            return false;
        }
        LocalFileLruBean localFileLruBean = (LocalFileLruBean) other;
        return Intrinsics.areEqual(this.key, localFileLruBean.key) && Intrinsics.areEqual(this.timeStamp, localFileLruBean.timeStamp) && Intrinsics.areEqual(this.filePath, localFileLruBean.filePath) && Intrinsics.areEqual(this.fileName, localFileLruBean.fileName);
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.timeStamp;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.filePath;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fileName;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setTimeStamp(@Nullable Long l2) {
        this.timeStamp = l2;
    }

    @NotNull
    public String toString() {
        return "LocalFileLruBean(key=" + this.key + ", timeStamp=" + this.timeStamp + ", filePath=" + this.filePath + ", fileName=" + this.fileName + ")";
    }
}
