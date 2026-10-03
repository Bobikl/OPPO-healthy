package com.heytap.health.operation.praiseguide;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/operation/praiseguide/SwitchUserResult;", "", "module", "", "settingKey", "settingValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModule", "()Ljava/lang/String;", "getSettingKey", "getSettingValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "operation_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SwitchUserResult {
    public static final int $stable = 0;

    @NotNull
    private final String module;

    @NotNull
    private final String settingKey;

    @Nullable
    private final String settingValue;

    public SwitchUserResult(@NotNull String module, @NotNull String settingKey, @Nullable String str) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        this.module = module;
        this.settingKey = settingKey;
        this.settingValue = str;
    }

    public static /* synthetic */ SwitchUserResult copy$default(SwitchUserResult switchUserResult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchUserResult.module;
        }
        if ((i & 2) != 0) {
            str2 = switchUserResult.settingKey;
        }
        if ((i & 4) != 0) {
            str3 = switchUserResult.settingValue;
        }
        return switchUserResult.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSettingValue() {
        return this.settingValue;
    }

    @NotNull
    public final SwitchUserResult copy(@NotNull String module, @NotNull String settingKey, @Nullable String settingValue) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        return new SwitchUserResult(module, settingKey, settingValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchUserResult)) {
            return false;
        }
        SwitchUserResult switchUserResult = (SwitchUserResult) other;
        return Intrinsics.areEqual(this.module, switchUserResult.module) && Intrinsics.areEqual(this.settingKey, switchUserResult.settingKey) && Intrinsics.areEqual(this.settingValue, switchUserResult.settingValue);
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final String getSettingKey() {
        return this.settingKey;
    }

    @Nullable
    public final String getSettingValue() {
        return this.settingValue;
    }

    public int hashCode() {
        int iHashCode = ((this.module.hashCode() * 31) + this.settingKey.hashCode()) * 31;
        String str = this.settingValue;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SwitchUserResult(module=" + this.module + ", settingKey=" + this.settingKey + ", settingValue=" + this.settingValue + ")";
    }
}
