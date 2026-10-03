package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/UserSettingPOJO;", "", "()V", "module", "", "getModule", "()Ljava/lang/String;", "setModule", "(Ljava/lang/String;)V", "settingKey", "getSettingKey", "setSettingKey", "settingValue", "getSettingValue", "setSettingValue", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UserSettingPOJO {

    @SerializedName("module")
    @Nullable
    private String module;

    @SerializedName("settingKey")
    @Nullable
    private String settingKey;

    @SerializedName("settingValue")
    @Nullable
    private String settingValue;

    @Nullable
    public final String getModule() {
        return this.module;
    }

    @Nullable
    public final String getSettingKey() {
        return this.settingKey;
    }

    @Nullable
    public final String getSettingValue() {
        return this.settingValue;
    }

    public final void setModule(@Nullable String str) {
        this.module = str;
    }

    public final void setSettingKey(@Nullable String str) {
        this.settingKey = str;
    }

    public final void setSettingValue(@Nullable String str) {
        this.settingValue = str;
    }

    @NotNull
    public String toString() {
        return "UserSettingPOJO(module=" + this.module + ", settingValue=" + this.settingValue + ", settingKey=" + this.settingKey + ")";
    }
}
