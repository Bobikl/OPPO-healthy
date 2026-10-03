package com.oplus.mydevices.sdk.devResource.bean.response;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/response/ResourceDataList;", "", "()V", "aid", "", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "id", "getId", "setId", "resource2D", "Lcom/oplus/mydevices/sdk/devResource/bean/response/Resource;", "getResource2D", "()Lcom/oplus/mydevices/sdk/devResource/bean/response/Resource;", "setResource2D", "(Lcom/oplus/mydevices/sdk/devResource/bean/response/Resource;)V", "resource3D", "getResource3D", "setResource3D", "rid", "getRid", "setRid", "status", "getStatus", "setStatus", "verCode", "", "getVerCode", "()I", "setVerCode", "(I)V", "verName", "getVerName", "setVerName", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class ResourceDataList {

    @SerializedName("aid")
    @Nullable
    private String aid;

    @SerializedName("id")
    @Nullable
    private String id;

    @SerializedName("2DResource")
    @Nullable
    private Resource resource2D;

    @SerializedName("3DResource")
    @Nullable
    private Resource resource3D;

    @SerializedName("rid")
    @Nullable
    private String rid;

    @SerializedName("status")
    @Nullable
    private String status;

    @SerializedName("versionCode")
    private int verCode;

    @SerializedName("versionName")
    @Nullable
    private String verName;

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Resource getResource2D() {
        return this.resource2D;
    }

    @Nullable
    public final Resource getResource3D() {
        return this.resource3D;
    }

    @Nullable
    public final String getRid() {
        return this.rid;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public final int getVerCode() {
        return this.verCode;
    }

    @Nullable
    public final String getVerName() {
        return this.verName;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setResource2D(@Nullable Resource resource) {
        this.resource2D = resource;
    }

    public final void setResource3D(@Nullable Resource resource) {
        this.resource3D = resource;
    }

    public final void setRid(@Nullable String str) {
        this.rid = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setVerCode(int i) {
        this.verCode = i;
    }

    public final void setVerName(@Nullable String str) {
        this.verName = str;
    }
}
