package com.oplus.mydevices.sdk.devResource.bean.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/response/Data;", "", "()V", "bizId", "", "getBizId", "()Ljava/lang/String;", "bizVersion", "", "getBizVersion", "()I", "fileHost", "Lcom/oplus/mydevices/sdk/devResource/bean/response/FileHost;", "getFileHost", "()Lcom/oplus/mydevices/sdk/devResource/bean/response/FileHost;", "list", "", "Lcom/oplus/mydevices/sdk/devResource/bean/response/ResourceDataList;", "getList", "()Ljava/util/List;", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class Data {

    @SerializedName("bizId")
    @Nullable
    private final String bizId;

    @SerializedName("bizVersion")
    private final int bizVersion;

    @SerializedName("fileHost")
    @Nullable
    private final FileHost fileHost;

    @SerializedName("list")
    @Nullable
    private final List<ResourceDataList> list;

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    public final int getBizVersion() {
        return this.bizVersion;
    }

    @Nullable
    public final FileHost getFileHost() {
        return this.fileHost;
    }

    @Nullable
    public final List<ResourceDataList> getList() {
        return this.list;
    }
}
