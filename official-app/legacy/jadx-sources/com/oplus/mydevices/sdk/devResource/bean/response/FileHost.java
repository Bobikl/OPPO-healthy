package com.oplus.mydevices.sdk.devResource.bean.response;

import com.google.gson.annotations.SerializedName;
import com.oplus.pantanal.seedling.BuildConfig;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/response/FileHost;", "", "()V", "auto", "", "getAuto", "()Ljava/lang/String;", "setAuto", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "getManual", "setManual", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class FileHost {

    @SerializedName("auto")
    @Nullable
    private String auto;

    @SerializedName(BuildConfig.FLAVOR)
    @Nullable
    private String manual;

    @Nullable
    public final String getAuto() {
        return this.auto;
    }

    @Nullable
    public final String getManual() {
        return this.manual;
    }

    public final void setAuto(@Nullable String str) {
        this.auto = str;
    }

    public final void setManual(@Nullable String str) {
        this.manual = str;
    }
}
