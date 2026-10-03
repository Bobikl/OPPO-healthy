package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/RelatedPhoneInfo;", "", "duid", "", "osVersion", "", "model", "(Ljava/lang/String;ILjava/lang/String;)V", "getDuid", "()Ljava/lang/String;", "setDuid", "(Ljava/lang/String;)V", "getModel", "setModel", "getOsVersion", "()I", "setOsVersion", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RelatedPhoneInfo {

    @Nullable
    private String duid;

    @Nullable
    private String model;
    private int osVersion;

    public RelatedPhoneInfo() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ RelatedPhoneInfo copy$default(RelatedPhoneInfo relatedPhoneInfo, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = relatedPhoneInfo.duid;
        }
        if ((i2 & 2) != 0) {
            i = relatedPhoneInfo.osVersion;
        }
        if ((i2 & 4) != 0) {
            str2 = relatedPhoneInfo.model;
        }
        return relatedPhoneInfo.copy(str, i, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuid() {
        return this.duid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final RelatedPhoneInfo copy(@Nullable String duid, int osVersion, @Nullable String model) {
        return new RelatedPhoneInfo(duid, osVersion, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedPhoneInfo)) {
            return false;
        }
        RelatedPhoneInfo relatedPhoneInfo = (RelatedPhoneInfo) other;
        return Intrinsics.areEqual(this.duid, relatedPhoneInfo.duid) && this.osVersion == relatedPhoneInfo.osVersion && Intrinsics.areEqual(this.model, relatedPhoneInfo.model);
    }

    @Nullable
    public final String getDuid() {
        return this.duid;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    public final int getOsVersion() {
        return this.osVersion;
    }

    public int hashCode() {
        String str = this.duid;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.osVersion)) * 31;
        String str2 = this.model;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDuid(@Nullable String str) {
        this.duid = str;
    }

    public final void setModel(@Nullable String str) {
        this.model = str;
    }

    public final void setOsVersion(int i) {
        this.osVersion = i;
    }

    @NotNull
    public String toString() {
        return "RelatedPhoneInfo(duid=" + this.duid + ", osVersion=" + this.osVersion + ", model=" + this.model + ")";
    }

    public RelatedPhoneInfo(@Nullable String str, int i, @Nullable String str2) {
        this.duid = str;
        this.osVersion = i;
        this.model = str2;
    }

    public /* synthetic */ RelatedPhoneInfo(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
    }
}
