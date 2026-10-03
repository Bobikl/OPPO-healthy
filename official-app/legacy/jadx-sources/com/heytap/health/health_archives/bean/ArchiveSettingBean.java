package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/health_archives/bean/ArchiveSettingBean;", "", "module", "", "settingKey", "settingValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModule", "()Ljava/lang/String;", "setModule", "(Ljava/lang/String;)V", "getSettingKey", "setSettingKey", "getSettingValue", "setSettingValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveSettingBean {

    @NotNull
    private String module;

    @NotNull
    private String settingKey;

    @NotNull
    private String settingValue;

    public ArchiveSettingBean(@NotNull String module, @NotNull String settingKey, @NotNull String settingValue) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        Intrinsics.checkNotNullParameter(settingValue, "settingValue");
        this.module = module;
        this.settingKey = settingKey;
        this.settingValue = settingValue;
    }

    public static /* synthetic */ ArchiveSettingBean copy$default(ArchiveSettingBean archiveSettingBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = archiveSettingBean.module;
        }
        if ((i & 2) != 0) {
            str2 = archiveSettingBean.settingKey;
        }
        if ((i & 4) != 0) {
            str3 = archiveSettingBean.settingValue;
        }
        return archiveSettingBean.copy(str, str2, str3);
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

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSettingValue() {
        return this.settingValue;
    }

    @NotNull
    public final ArchiveSettingBean copy(@NotNull String module, @NotNull String settingKey, @NotNull String settingValue) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(settingKey, "settingKey");
        Intrinsics.checkNotNullParameter(settingValue, "settingValue");
        return new ArchiveSettingBean(module, settingKey, settingValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchiveSettingBean)) {
            return false;
        }
        ArchiveSettingBean archiveSettingBean = (ArchiveSettingBean) other;
        return Intrinsics.areEqual(this.module, archiveSettingBean.module) && Intrinsics.areEqual(this.settingKey, archiveSettingBean.settingKey) && Intrinsics.areEqual(this.settingValue, archiveSettingBean.settingValue);
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    @NotNull
    public final String getSettingKey() {
        return this.settingKey;
    }

    @NotNull
    public final String getSettingValue() {
        return this.settingValue;
    }

    public int hashCode() {
        return (((this.module.hashCode() * 31) + this.settingKey.hashCode()) * 31) + this.settingValue.hashCode();
    }

    public final void setModule(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.module = str;
    }

    public final void setSettingKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.settingKey = str;
    }

    public final void setSettingValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.settingValue = str;
    }

    @NotNull
    public String toString() {
        return "ArchiveSettingBean(module=" + this.module + ", settingKey=" + this.settingKey + ", settingValue=" + this.settingValue + ")";
    }
}
