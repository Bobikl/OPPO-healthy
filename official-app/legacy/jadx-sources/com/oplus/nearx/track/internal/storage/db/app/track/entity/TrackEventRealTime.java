package com.oplus.nearx.track.internal.storage.db.app.track.entity;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.oplus.aiunit.vision.ez9;
import com.oplus.aiunit.vision.h6a;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.sbe;
import com.oplus.aiunit.vision.t15;
import com.oplus.aiunit.vision.y15;
import com.oplus.nearx.track.internal.common.DataType;
import com.oplus.nearx.track.internal.common.EventNetType;
import com.oplus.nearx.track.internal.common.UploadType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@s15(addedVersion = 2, indices = {@h6a({"event_time"})}, tableName = "event_real_time")
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\t\u0010\f\u001a\u00020\u0007HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003Jc\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0010\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0011\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0013\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b\u0013\u0010.R\u001a\u0010\u0014\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b/\u0010,R\u001a\u0010\u0015\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b0\u0010,R\u001a\u0010\u0016\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b1\u0010,R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b2\u0010,¨\u00065"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/db/app/track/entity/TrackEventRealTime;", "Lcom/oplus/aiunit/vision/ez9;", "", "component1", "", "component2", "component3", "", "component4", "", "component5", "component6", "component7", "component8", "component9", "_id", "data", sbe.PAY_SDK_EVENT_TIME, "netType", "isRealTime", "uploadType", "encryptType", y15.PARAMS_DATA_TYPE, "eventCacheStatus", "copy", "toString", "hashCode", "", "other", "equals", "J", "get_id", "()J", "set_id", "(J)V", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getEventTime", "setEventTime", "I", "getNetType", "()I", "Z", "()Z", "getUploadType", "getEncryptType", "getDataType", "getEventCacheStatus", "<init>", "(JLjava/lang/String;JIZIIII)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TrackEventRealTime implements ez9 {
    private long _id;

    @t15
    @NotNull
    private String data;

    @t15(addedVersion = 4, dbColumnName = "data_type", defaultValue = "0")
    private final int dataType;

    @t15(addedVersion = 3)
    private final int encryptType;

    @t15(addedVersion = 5, dbColumnName = "event_cache_status", defaultValue = "1")
    private final int eventCacheStatus;

    @t15(dbColumnName = "event_time")
    private long eventTime;
    private final boolean isRealTime;
    private final int netType;
    private final int uploadType;

    public TrackEventRealTime() {
        this(0L, null, 0L, 0, false, 0, 0, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final long component1() {
        return get_id();
    }

    @NotNull
    public final String component2() {
        return getData();
    }

    public final long component3() {
        return getEventTime();
    }

    public final int component4() {
        return getNetType();
    }

    public final boolean component5() {
        return getIsRealTime();
    }

    public final int component6() {
        return getUploadType();
    }

    public final int component7() {
        return getEncryptType();
    }

    public final int component8() {
        return getDataType();
    }

    public final int component9() {
        return getEventCacheStatus();
    }

    @NotNull
    public final TrackEventRealTime copy(long _id, @NotNull String data, long eventTime, int netType, boolean isRealTime, int uploadType, int encryptType, int dataType, int eventCacheStatus) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TrackEventRealTime(_id, data, eventTime, netType, isRealTime, uploadType, encryptType, dataType, eventCacheStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackEventRealTime)) {
            return false;
        }
        TrackEventRealTime trackEventRealTime = (TrackEventRealTime) other;
        return get_id() == trackEventRealTime.get_id() && Intrinsics.areEqual(getData(), trackEventRealTime.getData()) && getEventTime() == trackEventRealTime.getEventTime() && getNetType() == trackEventRealTime.getNetType() && getIsRealTime() == trackEventRealTime.getIsRealTime() && getUploadType() == trackEventRealTime.getUploadType() && getEncryptType() == trackEventRealTime.getEncryptType() && getDataType() == trackEventRealTime.getDataType() && getEventCacheStatus() == trackEventRealTime.getEventCacheStatus();
    }

    @Override // com.oplus.aiunit.vision.ez9
    @NotNull
    public String getData() {
        return this.data;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public int getDataType() {
        return this.dataType;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public int getEncryptType() {
        return this.encryptType;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public int getEventCacheStatus() {
        return this.eventCacheStatus;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public long getEventTime() {
        return this.eventTime;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public int getNetType() {
        return this.netType;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public int getUploadType() {
        return this.uploadType;
    }

    @Override // com.oplus.aiunit.vision.ez9
    public long get_id() {
        return this._id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(get_id()) * 31) + getData().hashCode()) * 31) + Long.hashCode(getEventTime())) * 31) + Integer.hashCode(getNetType())) * 31;
        boolean isRealTime = getIsRealTime();
        ?? r1 = isRealTime;
        if (isRealTime) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + Integer.hashCode(getUploadType())) * 31) + Integer.hashCode(getEncryptType())) * 31) + Integer.hashCode(getDataType())) * 31) + Integer.hashCode(getEventCacheStatus());
    }

    @Override // com.oplus.aiunit.vision.ez9
    /* JADX INFO: renamed from: isRealTime, reason: from getter */
    public boolean getIsRealTime() {
        return this.isRealTime;
    }

    public void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public void setEventTime(long j2) {
        this.eventTime = j2;
    }

    public void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "TrackEventRealTime(_id=" + get_id() + ", data=" + getData() + ", eventTime=" + getEventTime() + ", netType=" + getNetType() + ", isRealTime=" + getIsRealTime() + ", uploadType=" + getUploadType() + ", encryptType=" + getEncryptType() + ", dataType=" + getDataType() + ", eventCacheStatus=" + getEventCacheStatus() + ')';
    }

    public TrackEventRealTime(long j2, @NotNull String data, long j3, int i, boolean z, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(data, "data");
        this._id = j2;
        this.data = data;
        this.eventTime = j3;
        this.netType = i;
        this.isRealTime = z;
        this.uploadType = i2;
        this.encryptType = i3;
        this.dataType = i4;
        this.eventCacheStatus = i5;
    }

    public /* synthetic */ TrackEventRealTime(long j2, String str, long j3, int i, boolean z, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j2, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? 0L : j3, (i6 & 8) != 0 ? EventNetType.NET_TYPE_ALL_NET.getLevel() : i, (i6 & 16) != 0 ? true : z, (i6 & 32) != 0 ? UploadType.REALTIME.getUploadType() : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? DataType.BIZ.getDataType() : i4, (i6 & 256) != 0 ? 0 : i5);
    }
}
