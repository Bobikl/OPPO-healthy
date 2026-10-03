package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/heytap/store/base/core/data/LabelDetailss;", "", "name", "", "color", "", "pigment", "configKey", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConfigKey", "()Ljava/lang/String;", "setConfigKey", "(Ljava/lang/String;)V", "getName", "setName", "getPigment", "setPigment", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/store/base/core/data/LabelDetailss;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LabelDetailss {

    @Nullable
    private Integer color;

    @Nullable
    private String configKey;

    @Nullable
    private String name;

    @Nullable
    private String pigment;

    public LabelDetailss() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LabelDetailss copy$default(LabelDetailss labelDetailss, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = labelDetailss.name;
        }
        if ((i & 2) != 0) {
            num = labelDetailss.color;
        }
        if ((i & 4) != 0) {
            str2 = labelDetailss.pigment;
        }
        if ((i & 8) != 0) {
            str3 = labelDetailss.configKey;
        }
        return labelDetailss.copy(str, num, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPigment() {
        return this.pigment;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfigKey() {
        return this.configKey;
    }

    @NotNull
    public final LabelDetailss copy(@Nullable String name, @Nullable Integer color, @Nullable String pigment, @Nullable String configKey) {
        return new LabelDetailss(name, color, pigment, configKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelDetailss)) {
            return false;
        }
        LabelDetailss labelDetailss = (LabelDetailss) other;
        return Intrinsics.areEqual(this.name, labelDetailss.name) && Intrinsics.areEqual(this.color, labelDetailss.color) && Intrinsics.areEqual(this.pigment, labelDetailss.pigment) && Intrinsics.areEqual(this.configKey, labelDetailss.configKey);
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final String getConfigKey() {
        return this.configKey;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPigment() {
        return this.pigment;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.color;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.pigment;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.configKey;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setColor(@Nullable Integer num) {
        this.color = num;
    }

    public final void setConfigKey(@Nullable String str) {
        this.configKey = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPigment(@Nullable String str) {
        this.pigment = str;
    }

    @NotNull
    public String toString() {
        return "LabelDetailss(name=" + ((Object) this.name) + ", color=" + this.color + ", pigment=" + ((Object) this.pigment) + ", configKey=" + ((Object) this.configKey) + ')';
    }

    public LabelDetailss(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.color = num;
        this.pigment = str2;
        this.configKey = str3;
    }

    public /* synthetic */ LabelDetailss(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
