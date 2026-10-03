package com.oplus.nearx.track.internal.storage.db.app.balance.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.hm9;
import com.oplus.aiunit.vision.s15;
import com.oplus.aiunit.vision.sbe;
import com.oplus.aiunit.vision.t15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@s15(addedVersion = 1, tableName = "balance_completeness")
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\"\u0010\f\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\"\u0010\u000e\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceCompleteness;", "Lcom/oplus/aiunit/vision/hm9;", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "_id", sbe.PAY_SDK_EVENT_TIME, "createNum", "uploadNum", "sequenceId", "copy", "", "hashCode", "", "other", "", "equals", "J", "get_id", "()J", "set_id", "(J)V", "getEventTime", "getCreateNum", "setCreateNum", "getUploadNum", "setUploadNum", "Ljava/lang/String;", "getSequenceId", "()Ljava/lang/String;", "setSequenceId", "(Ljava/lang/String;)V", "<init>", "(JJJJLjava/lang/String;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class BalanceCompleteness implements hm9 {
    private long _id;

    @t15
    private long createNum;

    @t15
    private final long eventTime;

    @t15
    @NotNull
    private String sequenceId;

    @t15
    private long uploadNum;

    public BalanceCompleteness() {
        this(0L, 0L, 0L, 0L, null, 31, null);
    }

    public final long component1() {
        return get_id();
    }

    public final long component2() {
        return getEventTime();
    }

    public final long component3() {
        return getCreateNum();
    }

    public final long component4() {
        return getUploadNum();
    }

    @NotNull
    public final String component5() {
        return getSequenceId();
    }

    @NotNull
    public final BalanceCompleteness copy(long _id, long eventTime, long createNum, long uploadNum, @NotNull String sequenceId) {
        Intrinsics.checkNotNullParameter(sequenceId, "sequenceId");
        return new BalanceCompleteness(_id, eventTime, createNum, uploadNum, sequenceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceCompleteness)) {
            return false;
        }
        BalanceCompleteness balanceCompleteness = (BalanceCompleteness) other;
        return get_id() == balanceCompleteness.get_id() && getEventTime() == balanceCompleteness.getEventTime() && getCreateNum() == balanceCompleteness.getCreateNum() && getUploadNum() == balanceCompleteness.getUploadNum() && Intrinsics.areEqual(getSequenceId(), balanceCompleteness.getSequenceId());
    }

    @Override // com.oplus.aiunit.vision.hm9
    public long getCreateNum() {
        return this.createNum;
    }

    @Override // com.oplus.aiunit.vision.hm9
    public long getEventTime() {
        return this.eventTime;
    }

    @Override // com.oplus.aiunit.vision.hm9
    @NotNull
    public String getSequenceId() {
        return this.sequenceId;
    }

    @Override // com.oplus.aiunit.vision.hm9
    public long getUploadNum() {
        return this.uploadNum;
    }

    @Override // com.oplus.aiunit.vision.hm9
    public long get_id() {
        return this._id;
    }

    public int hashCode() {
        return (((((((Long.hashCode(get_id()) * 31) + Long.hashCode(getEventTime())) * 31) + Long.hashCode(getCreateNum())) * 31) + Long.hashCode(getUploadNum())) * 31) + getSequenceId().hashCode();
    }

    public void setCreateNum(long j2) {
        this.createNum = j2;
    }

    public void setSequenceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sequenceId = str;
    }

    public void setUploadNum(long j2) {
        this.uploadNum = j2;
    }

    public void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return '\"' + getEventTime() + "\":{\"createNum\":" + getCreateNum() + ", \"uploadNum\":" + getUploadNum() + ", \"sequence_id\":\"" + getSequenceId() + "\"}";
    }

    public BalanceCompleteness(long j2, long j3, long j4, long j5, @NotNull String sequenceId) {
        Intrinsics.checkNotNullParameter(sequenceId, "sequenceId");
        this._id = j2;
        this.eventTime = j3;
        this.createNum = j4;
        this.uploadNum = j5;
        this.sequenceId = sequenceId;
    }

    public /* synthetic */ BalanceCompleteness(long j2, long j3, long j4, long j5, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j4, (i & 8) != 0 ? 0L : j5, (i & 16) != 0 ? "0" : str);
    }
}
