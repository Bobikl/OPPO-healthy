package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.nearx.track.internal.common.ntp.TimeStamp;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'B#\b\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b&\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R(\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001b\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010 \u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/eyj;", "", "", "a", "obj", "", "equals", "", "hashCode", "Lcom/oplus/aiunit/vision/dzc;", "Lcom/oplus/aiunit/vision/dzc;", "b", "()Lcom/oplus/aiunit/vision/dzc;", "message", "", "", "Ljava/util/List;", "_comments", "", "<set-?>", "c", "Ljava/lang/Long;", "getDelay", "()Ljava/lang/Long;", ClickApiEntity.DELAY, "d", "getOffset", TypedValues.CycleType.S_WAVE_OFFSET, MapSchema.FIELD_NAME_ENTRY, "J", "getReturnTime", "()J", "returnTime", "f", "Z", "_detailsComputed", "comments", "doComputeDetails", "<init>", "(Lcom/oplus/aiunit/vision/dzc;JLjava/util/List;Z)V", "msgPacket", "(Lcom/oplus/aiunit/vision/dzc;JZ)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class eyj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final dzc message;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public List<String> _comments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Long delay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Long offset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long returnTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean _detailsComputed;

    @JvmOverloads
    public eyj(@Nullable dzc dzcVar, long j2, @Nullable List<String> list, boolean z) {
        if (dzcVar == null) {
            throw new IllegalArgumentException("message cannot be null".toString());
        }
        this.returnTime = j2;
        this.message = dzcVar;
        this._comments = list;
        if (z) {
            a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    public final void a() {
        if (this._detailsComputed) {
            return;
        }
        this._detailsComputed = true;
        if (this._comments == null) {
            this._comments = new ArrayList();
        }
        TimeStamp timeStampA = this.message.a();
        Intrinsics.checkNotNull(timeStampA);
        long time = timeStampA.getTime();
        TimeStamp timeStampD = this.message.d();
        Intrinsics.checkNotNull(timeStampD);
        long time2 = timeStampD.getTime();
        TimeStamp timeStampE = this.message.e();
        Intrinsics.checkNotNull(timeStampE);
        long time3 = timeStampE.getTime();
        long j2 = 0;
        if (timeStampA.getNtpTime() == 0) {
            if (timeStampE.getNtpTime() == 0) {
                List<String> list = this._comments;
                Intrinsics.checkNotNull(list);
                list.add("Error: zero orig time -- cannot compute delay/offset");
                return;
            } else {
                this.offset = Long.valueOf(time3 - this.returnTime);
                List<String> list2 = this._comments;
                Intrinsics.checkNotNull(list2);
                list2.add("Error: zero orig time -- cannot compute delay");
                return;
            }
        }
        if (timeStampD.getNtpTime() == 0 || timeStampE.getNtpTime() == 0) {
            List<String> list3 = this._comments;
            Intrinsics.checkNotNull(list3);
            list3.add("Warning: zero rcvNtpTime or xmitNtpTime");
            long j3 = this.returnTime;
            if (time > j3) {
                List<String> list4 = this._comments;
                Intrinsics.checkNotNull(list4);
                list4.add("Error: OrigTime > DestRcvTime");
            } else {
                this.delay = Long.valueOf(j3 - time);
            }
            if (timeStampD.getNtpTime() != 0) {
                this.offset = Long.valueOf(time2 - time);
                return;
            } else {
                if (timeStampE.getNtpTime() != 0) {
                    this.offset = Long.valueOf(time3 - this.returnTime);
                    return;
                }
                return;
            }
        }
        long j4 = this.returnTime - time;
        if (time3 >= time2) {
            long j5 = time3 - time2;
            if (j5 <= j4) {
                j2 = j4 - j5;
            } else if (j5 - j4 != 1) {
                List<String> list5 = this._comments;
                Intrinsics.checkNotNull(list5);
                list5.add("Warning: processing time > total network time");
            } else if (j4 != 0) {
                List<String> list6 = this._comments;
                Intrinsics.checkNotNull(list6);
                list6.add("Info: processing time > total network time by 1 ms -> assume zero delay");
            }
            this.delay = Long.valueOf(j2);
            if (time > this.returnTime) {
                List<String> list7 = this._comments;
                Intrinsics.checkNotNull(list7);
                list7.add("Error: OrigTime > DestRcvTime");
            }
            this.offset = Long.valueOf(((time2 - time) + (time3 - this.returnTime)) / ((long) 2));
        }
        List<String> list8 = this._comments;
        Intrinsics.checkNotNull(list8);
        list8.add("Error: xmitTime < rcvTime");
        j2 = j4;
        this.delay = Long.valueOf(j2);
        if (time > this.returnTime) {
            List<String> list9 = this._comments;
            Intrinsics.checkNotNull(list9);
            list9.add("Error: OrigTime > DestRcvTime");
        }
        this.offset = Long.valueOf(((time2 - time) + (time3 - this.returnTime)) / ((long) 2));
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final dzc getMessage() {
        return this.message;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(eyj.class, obj.getClass())) {
            return false;
        }
        eyj eyjVar = (eyj) obj;
        return this.returnTime == eyjVar.returnTime && Intrinsics.areEqual(this.message, eyjVar.message);
    }

    public int hashCode() {
        return (((int) this.returnTime) * 31) + this.message.hashCode();
    }

    public eyj(@Nullable dzc dzcVar, long j2, boolean z) {
        this(dzcVar, j2, null, z);
    }
}
