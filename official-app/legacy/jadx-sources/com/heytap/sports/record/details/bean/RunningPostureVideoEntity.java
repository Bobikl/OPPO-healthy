package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.y15;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/sports/record/details/bean/RunningPostureVideoEntity;", "", y15.PARAMS_DATA_TYPE, "", "videoList", "", "Lcom/heytap/sports/record/details/bean/VideoItem;", "(ILjava/util/List;)V", "getDataType", "()I", "setDataType", "(I)V", "getVideoList", "()Ljava/util/List;", "setVideoList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RunningPostureVideoEntity {
    public static final int $stable = 8;
    private int dataType;

    @NotNull
    private List<VideoItem> videoList;

    /* JADX WARN: Multi-variable type inference failed */
    public RunningPostureVideoEntity() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunningPostureVideoEntity copy$default(RunningPostureVideoEntity runningPostureVideoEntity, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = runningPostureVideoEntity.dataType;
        }
        if ((i2 & 2) != 0) {
            list = runningPostureVideoEntity.videoList;
        }
        return runningPostureVideoEntity.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final List<VideoItem> component2() {
        return this.videoList;
    }

    @NotNull
    public final RunningPostureVideoEntity copy(int dataType, @NotNull List<VideoItem> videoList) {
        Intrinsics.checkNotNullParameter(videoList, "videoList");
        return new RunningPostureVideoEntity(dataType, videoList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningPostureVideoEntity)) {
            return false;
        }
        RunningPostureVideoEntity runningPostureVideoEntity = (RunningPostureVideoEntity) other;
        return this.dataType == runningPostureVideoEntity.dataType && Intrinsics.areEqual(this.videoList, runningPostureVideoEntity.videoList);
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final List<VideoItem> getVideoList() {
        return this.videoList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.dataType) * 31) + this.videoList.hashCode();
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final void setVideoList(@NotNull List<VideoItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.videoList = list;
    }

    @NotNull
    public String toString() {
        return "RunningPostureVideoEntity(dataType=" + this.dataType + ", videoList=" + this.videoList + ")";
    }

    public RunningPostureVideoEntity(int i, @NotNull List<VideoItem> videoList) {
        Intrinsics.checkNotNullParameter(videoList, "videoList");
        this.dataType = i;
        this.videoList = videoList;
    }

    public /* synthetic */ RunningPostureVideoEntity(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
