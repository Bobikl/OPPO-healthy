package com.heytap.health.menstrual_period.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/menstrual_period/data/SymptomTextsData;", "", "zh_rCN", "", "zh_rHK", "zh_rTW", "en", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEn", "()Ljava/lang/String;", "getZh_rCN", "getZh_rHK", "getZh_rTW", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SymptomTextsData {
    public static final int $stable = 0;

    @Nullable
    private final String en;

    @Nullable
    private final String zh_rCN;

    @Nullable
    private final String zh_rHK;

    @Nullable
    private final String zh_rTW;

    public SymptomTextsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.zh_rCN = str;
        this.zh_rHK = str2;
        this.zh_rTW = str3;
        this.en = str4;
    }

    public static /* synthetic */ SymptomTextsData copy$default(SymptomTextsData symptomTextsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = symptomTextsData.zh_rCN;
        }
        if ((i & 2) != 0) {
            str2 = symptomTextsData.zh_rHK;
        }
        if ((i & 4) != 0) {
            str3 = symptomTextsData.zh_rTW;
        }
        if ((i & 8) != 0) {
            str4 = symptomTextsData.en;
        }
        return symptomTextsData.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getZh_rCN() {
        return this.zh_rCN;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getZh_rHK() {
        return this.zh_rHK;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getZh_rTW() {
        return this.zh_rTW;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEn() {
        return this.en;
    }

    @NotNull
    public final SymptomTextsData copy(@Nullable String zh_rCN, @Nullable String zh_rHK, @Nullable String zh_rTW, @Nullable String en) {
        return new SymptomTextsData(zh_rCN, zh_rHK, zh_rTW, en);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymptomTextsData)) {
            return false;
        }
        SymptomTextsData symptomTextsData = (SymptomTextsData) other;
        return Intrinsics.areEqual(this.zh_rCN, symptomTextsData.zh_rCN) && Intrinsics.areEqual(this.zh_rHK, symptomTextsData.zh_rHK) && Intrinsics.areEqual(this.zh_rTW, symptomTextsData.zh_rTW) && Intrinsics.areEqual(this.en, symptomTextsData.en);
    }

    @Nullable
    public final String getEn() {
        return this.en;
    }

    @Nullable
    public final String getZh_rCN() {
        return this.zh_rCN;
    }

    @Nullable
    public final String getZh_rHK() {
        return this.zh_rHK;
    }

    @Nullable
    public final String getZh_rTW() {
        return this.zh_rTW;
    }

    public int hashCode() {
        String str = this.zh_rCN;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zh_rHK;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zh_rTW;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.en;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SymptomTextsData(zh_rCN=" + this.zh_rCN + ", zh_rHK=" + this.zh_rHK + ", zh_rTW=" + this.zh_rTW + ", en=" + this.en + ")";
    }
}
