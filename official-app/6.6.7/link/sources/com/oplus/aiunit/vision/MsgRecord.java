package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.i8c, reason: from toString */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/i8c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "sid", "b", "cid", "", "J", "d", "()J", "setTime", "(J)V", ClickApiEntity.TIME, "dataLength", "<init>", "(IIJI)V", "wearableservicesdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MsgRecord {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int sid;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int cid;

    /* JADX INFO: renamed from: c, reason: from toString */
    public long time;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int dataLength;

    public MsgRecord(int i, int i2, long j, int i3) {
        this.sid = i;
        this.cid = i2;
        this.time = j;
        this.dataLength = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDataLength() {
        return this.dataLength;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MsgRecord)) {
            return false;
        }
        MsgRecord msgRecord = (MsgRecord) other;
        return this.sid == msgRecord.sid && this.cid == msgRecord.cid && this.time == msgRecord.time && this.dataLength == msgRecord.dataLength;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.sid) * 31) + Integer.hashCode(this.cid)) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.dataLength);
    }

    @NotNull
    public String toString() {
        return "MsgRecord(sid=" + this.sid + ", cid=" + this.cid + ", time=" + this.time + ", dataLength=" + this.dataLength + ")";
    }
}
