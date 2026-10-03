package com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.anotation.FieldIndex;
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
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b-\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00016Bu\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003Jw\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\nHÆ\u0001J\t\u0010\u001d\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b$\u0010#R\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b\u0014\u0010)R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b*\u0010#R\u001a\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b.\u0010'R\u001a\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b/\u0010'R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b0\u0010'R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b1\u0010#R\u001a\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b2\u0010-¨\u00067"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/EventRuleEntity;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "component10", "component11", "eventType", "eventId", "eventLevel", "isRealTime", "acceptNetType", "headSwitch", "trackType", "uploadType", y15.PARAMS_DATA_TYPE, "samplingIntervals", "bitMapConfig", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "getEventId", "I", "getEventLevel", "()I", "Z", "()Z", "getAcceptNetType", "J", "getHeadSwitch", "()J", "getTrackType", "getUploadType", "getDataType", "getSamplingIntervals", "getBitMapConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;JIIILjava/lang/String;J)V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class EventRuleEntity {

    @NotNull
    public static final String ACCEPT_NET_4G = "4G";

    @NotNull
    public static final String ACCEPT_NET_5G = "5G";

    @NotNull
    public static final String ACCEPT_NET_ALL = "ALL";

    @NotNull
    public static final String ACCEPT_NET_WIFI = "WIFI";

    @NotNull
    public static final String DEFAULT_SAMPLING_INTERVAL = "[0-100000]";

    @FieldIndex(index = 5)
    @NotNull
    private final String acceptNetType;

    @FieldIndex(index = 13)
    private final long bitMapConfig;

    @FieldIndex(index = 10)
    private final int dataType;

    @FieldIndex(index = 2)
    @NotNull
    private final String eventId;

    @FieldIndex(index = 3)
    private final int eventLevel;

    @FieldIndex(index = 1)
    @NotNull
    private final String eventType;

    @FieldIndex(index = 6)
    private final long headSwitch;

    @FieldIndex(index = 4)
    private final boolean isRealTime;

    @FieldIndex(index = 12)
    @NotNull
    private final String samplingIntervals;

    @FieldIndex(index = 7)
    private final int trackType;

    @FieldIndex(index = 9)
    private final int uploadType;

    public EventRuleEntity() {
        this(null, null, 0, false, null, 0L, 0, 0, 0, null, 0L, 2047, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSamplingIntervals() {
        return this.samplingIntervals;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getBitMapConfig() {
        return this.bitMapConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEventLevel() {
        return this.eventLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsRealTime() {
        return this.isRealTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAcceptNetType() {
        return this.acceptNetType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getHeadSwitch() {
        return this.headSwitch;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTrackType() {
        return this.trackType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUploadType() {
        return this.uploadType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final EventRuleEntity copy(@NotNull String eventType, @NotNull String eventId, int eventLevel, boolean isRealTime, @NotNull String acceptNetType, long headSwitch, int trackType, int uploadType, int dataType, @NotNull String samplingIntervals, long bitMapConfig) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(acceptNetType, "acceptNetType");
        Intrinsics.checkNotNullParameter(samplingIntervals, "samplingIntervals");
        return new EventRuleEntity(eventType, eventId, eventLevel, isRealTime, acceptNetType, headSwitch, trackType, uploadType, dataType, samplingIntervals, bitMapConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventRuleEntity)) {
            return false;
        }
        EventRuleEntity eventRuleEntity = (EventRuleEntity) other;
        return Intrinsics.areEqual(this.eventType, eventRuleEntity.eventType) && Intrinsics.areEqual(this.eventId, eventRuleEntity.eventId) && this.eventLevel == eventRuleEntity.eventLevel && this.isRealTime == eventRuleEntity.isRealTime && Intrinsics.areEqual(this.acceptNetType, eventRuleEntity.acceptNetType) && this.headSwitch == eventRuleEntity.headSwitch && this.trackType == eventRuleEntity.trackType && this.uploadType == eventRuleEntity.uploadType && this.dataType == eventRuleEntity.dataType && Intrinsics.areEqual(this.samplingIntervals, eventRuleEntity.samplingIntervals) && this.bitMapConfig == eventRuleEntity.bitMapConfig;
    }

    @NotNull
    public final String getAcceptNetType() {
        return this.acceptNetType;
    }

    public final long getBitMapConfig() {
        return this.bitMapConfig;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    public final int getEventLevel() {
        return this.eventLevel;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    public final long getHeadSwitch() {
        return this.headSwitch;
    }

    @NotNull
    public final String getSamplingIntervals() {
        return this.samplingIntervals;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final int getUploadType() {
        return this.uploadType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.eventType.hashCode() * 31) + this.eventId.hashCode()) * 31) + Integer.hashCode(this.eventLevel)) * 31;
        boolean z = this.isRealTime;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((((((((iHashCode + r1) * 31) + this.acceptNetType.hashCode()) * 31) + Long.hashCode(this.headSwitch)) * 31) + Integer.hashCode(this.trackType)) * 31) + Integer.hashCode(this.uploadType)) * 31) + Integer.hashCode(this.dataType)) * 31) + this.samplingIntervals.hashCode()) * 31) + Long.hashCode(this.bitMapConfig);
    }

    public final boolean isRealTime() {
        return this.isRealTime;
    }

    @NotNull
    public String toString() {
        return "EventRuleEntity(eventType=" + this.eventType + ", eventId=" + this.eventId + ", eventLevel=" + this.eventLevel + ", isRealTime=" + this.isRealTime + ", acceptNetType=" + this.acceptNetType + ", headSwitch=" + this.headSwitch + ", trackType=" + this.trackType + ", uploadType=" + this.uploadType + ", dataType=" + this.dataType + ", samplingIntervals=" + this.samplingIntervals + ", bitMapConfig=" + this.bitMapConfig + ')';
    }

    public EventRuleEntity(@NotNull String eventType, @NotNull String eventId, int i, boolean z, @NotNull String acceptNetType, long j2, int i2, int i3, int i4, @NotNull String samplingIntervals, long j3) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(acceptNetType, "acceptNetType");
        Intrinsics.checkNotNullParameter(samplingIntervals, "samplingIntervals");
        this.eventType = eventType;
        this.eventId = eventId;
        this.eventLevel = i;
        this.isRealTime = z;
        this.acceptNetType = acceptNetType;
        this.headSwitch = j2;
        this.trackType = i2;
        this.uploadType = i3;
        this.dataType = i4;
        this.samplingIntervals = samplingIntervals;
        this.bitMapConfig = j3;
    }

    public /* synthetic */ EventRuleEntity(String str, String str2, int i, boolean z, String str3, long j2, int i2, int i3, int i4, String str4, long j3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) == 0 ? str2 : "", (i5 & 4) != 0 ? EventNetType.NET_TYPE_ALL_NET.getLevel() : i, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? "ALL" : str3, (i5 & 32) != 0 ? 0L : j2, (i5 & 64) == 0 ? i2 : 0, (i5 & 128) != 0 ? UploadType.TIMING.getUploadType() : i3, (i5 & 256) != 0 ? DataType.BIZ.getDataType() : i4, (i5 & 512) != 0 ? DEFAULT_SAMPLING_INTERVAL : str4, (i5 & 1024) == 0 ? j3 : 0L);
    }
}
