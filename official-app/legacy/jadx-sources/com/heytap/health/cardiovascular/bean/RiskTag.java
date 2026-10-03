package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/RiskTag;", "", "tagField", "", "tagFieldEng", "tagValue", "trendDesc", "keyTag", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKeyTag", "()Z", "getTagField", "()Ljava/lang/String;", "getTagFieldEng", "getTagValue", "getTrendDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RiskTag {
    public static final int $stable = 0;
    private final boolean keyTag;

    @NotNull
    private final String tagField;

    @NotNull
    private final String tagFieldEng;

    @Nullable
    private final String tagValue;

    @Nullable
    private final String trendDesc;

    public RiskTag(@NotNull String tagField, @NotNull String tagFieldEng, @Nullable String str, @Nullable String str2, boolean z) {
        Intrinsics.checkNotNullParameter(tagField, "tagField");
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        this.tagField = tagField;
        this.tagFieldEng = tagFieldEng;
        this.tagValue = str;
        this.trendDesc = str2;
        this.keyTag = z;
    }

    public static /* synthetic */ RiskTag copy$default(RiskTag riskTag, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskTag.tagField;
        }
        if ((i & 2) != 0) {
            str2 = riskTag.tagFieldEng;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = riskTag.tagValue;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = riskTag.trendDesc;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = riskTag.keyTag;
        }
        return riskTag.copy(str, str5, str6, str7, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTagField() {
        return this.tagField;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTagValue() {
        return this.tagValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrendDesc() {
        return this.trendDesc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getKeyTag() {
        return this.keyTag;
    }

    @NotNull
    public final RiskTag copy(@NotNull String tagField, @NotNull String tagFieldEng, @Nullable String tagValue, @Nullable String trendDesc, boolean keyTag) {
        Intrinsics.checkNotNullParameter(tagField, "tagField");
        Intrinsics.checkNotNullParameter(tagFieldEng, "tagFieldEng");
        return new RiskTag(tagField, tagFieldEng, tagValue, trendDesc, keyTag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskTag)) {
            return false;
        }
        RiskTag riskTag = (RiskTag) other;
        return Intrinsics.areEqual(this.tagField, riskTag.tagField) && Intrinsics.areEqual(this.tagFieldEng, riskTag.tagFieldEng) && Intrinsics.areEqual(this.tagValue, riskTag.tagValue) && Intrinsics.areEqual(this.trendDesc, riskTag.trendDesc) && this.keyTag == riskTag.keyTag;
    }

    public final boolean getKeyTag() {
        return this.keyTag;
    }

    @NotNull
    public final String getTagField() {
        return this.tagField;
    }

    @NotNull
    public final String getTagFieldEng() {
        return this.tagFieldEng;
    }

    @Nullable
    public final String getTagValue() {
        return this.tagValue;
    }

    @Nullable
    public final String getTrendDesc() {
        return this.trendDesc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((this.tagField.hashCode() * 31) + this.tagFieldEng.hashCode()) * 31;
        String str = this.tagValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trendDesc;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.keyTag;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode3 + r3;
    }

    @NotNull
    public String toString() {
        return "RiskTag(tagField=" + this.tagField + ", tagFieldEng=" + this.tagFieldEng + ", tagValue=" + this.tagValue + ", trendDesc=" + this.trendDesc + ", keyTag=" + this.keyTag + ")";
    }

    public /* synthetic */ RiskTag(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, str4, (i & 16) != 0 ? false : z);
    }
}
