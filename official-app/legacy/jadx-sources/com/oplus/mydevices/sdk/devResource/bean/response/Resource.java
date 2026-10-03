package com.oplus.mydevices.sdk.devResource.bean.response;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/response/Resource;", "", "()V", "md5", "", "getMd5", "()Ljava/lang/String;", "setMd5", "(Ljava/lang/String;)V", "path", "getPath", "setPath", "size", "", "getSize", "()I", "setSize", "(I)V", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class Resource {

    @SerializedName("md5")
    @Nullable
    private String md5;

    @SerializedName("path")
    @Nullable
    private String path;

    @SerializedName("size")
    private int size;

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final int getSize() {
        return this.size;
    }

    public final void setMd5(@Nullable String str) {
        this.md5 = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setSize(int i) {
        this.size = i;
    }
}
