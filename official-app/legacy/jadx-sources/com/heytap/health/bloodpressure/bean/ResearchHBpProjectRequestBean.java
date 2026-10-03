package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/ResearchHBpProjectRequestBean;", "", "lang", "", "ssoid", "codeList", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCodeList", "()Ljava/util/List;", "getLang", "()Ljava/lang/String;", "getSsoid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchHBpProjectRequestBean {
    public static final int $stable = 8;

    @NotNull
    private final List<String> codeList;

    @NotNull
    private final String lang;

    @NotNull
    private final String ssoid;

    public ResearchHBpProjectRequestBean(@NotNull String lang, @NotNull String ssoid, @NotNull List<String> codeList) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(codeList, "codeList");
        this.lang = lang;
        this.ssoid = ssoid;
        this.codeList = codeList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResearchHBpProjectRequestBean copy$default(ResearchHBpProjectRequestBean researchHBpProjectRequestBean, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = researchHBpProjectRequestBean.lang;
        }
        if ((i & 2) != 0) {
            str2 = researchHBpProjectRequestBean.ssoid;
        }
        if ((i & 4) != 0) {
            list = researchHBpProjectRequestBean.codeList;
        }
        return researchHBpProjectRequestBean.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    public final List<String> component3() {
        return this.codeList;
    }

    @NotNull
    public final ResearchHBpProjectRequestBean copy(@NotNull String lang, @NotNull String ssoid, @NotNull List<String> codeList) {
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(codeList, "codeList");
        return new ResearchHBpProjectRequestBean(lang, ssoid, codeList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchHBpProjectRequestBean)) {
            return false;
        }
        ResearchHBpProjectRequestBean researchHBpProjectRequestBean = (ResearchHBpProjectRequestBean) other;
        return Intrinsics.areEqual(this.lang, researchHBpProjectRequestBean.lang) && Intrinsics.areEqual(this.ssoid, researchHBpProjectRequestBean.ssoid) && Intrinsics.areEqual(this.codeList, researchHBpProjectRequestBean.codeList);
    }

    @NotNull
    public final List<String> getCodeList() {
        return this.codeList;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        return (((this.lang.hashCode() * 31) + this.ssoid.hashCode()) * 31) + this.codeList.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResearchHBpProjectRequestBean(lang=" + this.lang + ", ssoid=" + this.ssoid + ", codeList=" + this.codeList + ")";
    }

    public /* synthetic */ ResearchHBpProjectRequestBean(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, list);
    }
}
