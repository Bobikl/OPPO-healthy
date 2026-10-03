package com.heytap.health.health.familymode.request;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/health/familymode/request/FamilySportRecordObject;", "", "sportRecordList", "", "Lcom/heytap/health/health/familymode/request/FamilySportRecord;", "(Ljava/util/List;)V", "getSportRecordList", "()Ljava/util/List;", "setSportRecordList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FamilySportRecordObject {

    @NotNull
    private List<FamilySportRecord> sportRecordList;

    public FamilySportRecordObject(@NotNull List<FamilySportRecord> sportRecordList) {
        Intrinsics.checkNotNullParameter(sportRecordList, "sportRecordList");
        this.sportRecordList = sportRecordList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FamilySportRecordObject copy$default(FamilySportRecordObject familySportRecordObject, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = familySportRecordObject.sportRecordList;
        }
        return familySportRecordObject.copy(list);
    }

    @NotNull
    public final List<FamilySportRecord> component1() {
        return this.sportRecordList;
    }

    @NotNull
    public final FamilySportRecordObject copy(@NotNull List<FamilySportRecord> sportRecordList) {
        Intrinsics.checkNotNullParameter(sportRecordList, "sportRecordList");
        return new FamilySportRecordObject(sportRecordList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FamilySportRecordObject) && Intrinsics.areEqual(this.sportRecordList, ((FamilySportRecordObject) other).sportRecordList);
    }

    @NotNull
    public final List<FamilySportRecord> getSportRecordList() {
        return this.sportRecordList;
    }

    public int hashCode() {
        return this.sportRecordList.hashCode();
    }

    public final void setSportRecordList(@NotNull List<FamilySportRecord> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportRecordList = list;
    }

    @NotNull
    public String toString() {
        return "FamilySportRecordObject(sportRecordList=" + this.sportRecordList + ")";
    }
}
