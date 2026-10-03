package com.heytap.device.data.sporthealth;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/device/data/sporthealth/ScienceInfoData;", "", "infoType", "", "infoDetailList", "", "Lcom/heytap/device/data/sporthealth/ScienceInfoDetailData;", "(ILjava/util/List;)V", "getInfoDetailList", "()Ljava/util/List;", "getInfoType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScienceInfoData {

    @Nullable
    private final List<ScienceInfoDetailData> infoDetailList;
    private final int infoType;

    public ScienceInfoData(int i, @Nullable List<ScienceInfoDetailData> list) {
        this.infoType = i;
        this.infoDetailList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScienceInfoData copy$default(ScienceInfoData scienceInfoData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scienceInfoData.infoType;
        }
        if ((i2 & 2) != 0) {
            list = scienceInfoData.infoDetailList;
        }
        return scienceInfoData.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getInfoType() {
        return this.infoType;
    }

    @Nullable
    public final List<ScienceInfoDetailData> component2() {
        return this.infoDetailList;
    }

    @NotNull
    public final ScienceInfoData copy(int infoType, @Nullable List<ScienceInfoDetailData> infoDetailList) {
        return new ScienceInfoData(infoType, infoDetailList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScienceInfoData)) {
            return false;
        }
        ScienceInfoData scienceInfoData = (ScienceInfoData) other;
        return this.infoType == scienceInfoData.infoType && Intrinsics.areEqual(this.infoDetailList, scienceInfoData.infoDetailList);
    }

    @Nullable
    public final List<ScienceInfoDetailData> getInfoDetailList() {
        return this.infoDetailList;
    }

    public final int getInfoType() {
        return this.infoType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.infoType) * 31;
        List<ScienceInfoDetailData> list = this.infoDetailList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScienceInfoData(infoType=" + this.infoType + ", infoDetailList=" + this.infoDetailList + ")";
    }
}
