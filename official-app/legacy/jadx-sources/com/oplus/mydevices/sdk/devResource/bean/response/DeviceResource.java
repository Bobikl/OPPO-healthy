package com.oplus.mydevices.sdk.devResource.bean.response;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/response/DeviceResource;", "", "()V", "code", "", "getCode", "()I", "data", "Lcom/oplus/mydevices/sdk/devResource/bean/response/Data;", "getData", "()Lcom/oplus/mydevices/sdk/devResource/bean/response/Data;", "success", "", "getSuccess", "()Z", "traceId", "", "getTraceId", "()Ljava/lang/String;", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class DeviceResource {

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    @Nullable
    private final Data data;

    @SerializedName("success")
    private final boolean success;

    @SerializedName("traceId")
    @Nullable
    private final String traceId;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final String getTraceId() {
        return this.traceId;
    }
}
