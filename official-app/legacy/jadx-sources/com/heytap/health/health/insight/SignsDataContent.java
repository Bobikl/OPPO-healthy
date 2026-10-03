package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/health/insight/SignsDataContent;", "", "timeList", "", "", hp6.DETAIL_ENTRY, "Lcom/heytap/health/health/insight/DevSingleSigns;", "extraData", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDetails", "()Ljava/util/List;", "getExtraData", "getTimeList", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SignsDataContent {

    @NotNull
    private final List<DevSingleSigns> details;

    @NotNull
    private final List<String> extraData;

    @NotNull
    private final List<String> timeList;

    public SignsDataContent(@NotNull List<String> timeList, @NotNull List<DevSingleSigns> details, @NotNull List<String> extraData) {
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.timeList = timeList;
        this.details = details;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignsDataContent copy$default(SignsDataContent signsDataContent, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signsDataContent.timeList;
        }
        if ((i & 2) != 0) {
            list2 = signsDataContent.details;
        }
        if ((i & 4) != 0) {
            list3 = signsDataContent.extraData;
        }
        return signsDataContent.copy(list, list2, list3);
    }

    @NotNull
    public final List<String> component1() {
        return this.timeList;
    }

    @NotNull
    public final List<DevSingleSigns> component2() {
        return this.details;
    }

    @NotNull
    public final List<String> component3() {
        return this.extraData;
    }

    @NotNull
    public final SignsDataContent copy(@NotNull List<String> timeList, @NotNull List<DevSingleSigns> details, @NotNull List<String> extraData) {
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new SignsDataContent(timeList, details, extraData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignsDataContent)) {
            return false;
        }
        SignsDataContent signsDataContent = (SignsDataContent) other;
        return Intrinsics.areEqual(this.timeList, signsDataContent.timeList) && Intrinsics.areEqual(this.details, signsDataContent.details) && Intrinsics.areEqual(this.extraData, signsDataContent.extraData);
    }

    @NotNull
    public final List<DevSingleSigns> getDetails() {
        return this.details;
    }

    @NotNull
    public final List<String> getExtraData() {
        return this.extraData;
    }

    @NotNull
    public final List<String> getTimeList() {
        return this.timeList;
    }

    public int hashCode() {
        return (((this.timeList.hashCode() * 31) + this.details.hashCode()) * 31) + this.extraData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SignsDataContent(timeList=" + this.timeList + ", details=" + this.details + ", extraData=" + this.extraData + ")";
    }

    public /* synthetic */ SignsDataContent(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3);
    }
}
