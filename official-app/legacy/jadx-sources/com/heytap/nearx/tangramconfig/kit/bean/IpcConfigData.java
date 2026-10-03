package com.heytap.nearx.tangramconfig.kit.bean;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006\""}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/bean/IpcConfigData;", "", "()V", Fields.CONFIG_CODE, "", "getConfigCode", "()Ljava/lang/String;", "setConfigCode", "(Ljava/lang/String;)V", Fields.CONFIG_FILE_SIZE, "", "getConfigFileSize", "()J", "setConfigFileSize", "(J)V", Fields.CONFIG_MAX_VERSION, "", "getConfigMaxVersion", "()I", "setConfigMaxVersion", "(I)V", Fields.CONFIG_URL, "getConfigUrl", "setConfigUrl", "content", "getContent", "setContent", Fields.FILE_TYPE, "getFileType", "setFileType", "versionCode", "getVersionCode", "setVersionCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IpcConfigData {

    @Nullable
    private String configCode;
    private long configFileSize;
    private int configMaxVersion;

    @Nullable
    private String configUrl;

    @Nullable
    private String content;
    private int fileType;
    private int versionCode;

    @Nullable
    public final String getConfigCode() {
        return this.configCode;
    }

    public final long getConfigFileSize() {
        return this.configFileSize;
    }

    public final int getConfigMaxVersion() {
        return this.configMaxVersion;
    }

    @Nullable
    public final String getConfigUrl() {
        return this.configUrl;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getFileType() {
        return this.fileType;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final void setConfigCode(@Nullable String str) {
        this.configCode = str;
    }

    public final void setConfigFileSize(long j2) {
        this.configFileSize = j2;
    }

    public final void setConfigMaxVersion(int i) {
        this.configMaxVersion = i;
    }

    public final void setConfigUrl(@Nullable String str) {
        this.configUrl = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFileType(int i) {
        this.fileType = i;
    }

    public final void setVersionCode(int i) {
        this.versionCode = i;
    }

    @NotNull
    public String toString() {
        return "IpcConfigData(configCode=" + this.configCode + ", fileType=" + this.fileType + ", versionCode=" + this.versionCode + ", configUrl=" + this.configUrl + ", configFileSize=" + this.configFileSize + ", configMaxVersion=" + this.configMaxVersion + ", content=" + this.content + ')';
    }
}
