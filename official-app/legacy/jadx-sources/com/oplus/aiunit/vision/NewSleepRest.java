package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.Calendar;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.iqc, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b2\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u000e\u0012\b\b\u0002\u0010/\u001a\u00020\u0004¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0010J\b\u0010\u0017\u001a\u00020\nH\u0016R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\"\u0010,\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\"\u00105\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u0010;\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u0011\u0010=\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010\u001aR\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010\u001a¨\u0006B"}, d2 = {"Lcom/oplus/aiunit/vision/iqc;", "", "Ljava/util/Calendar;", b2n.f, "", "startDay", "endDay", "c", MapSchema.FIELD_NAME_KEY, ClickApiEntity.TIME, "", MapSchema.FIELD_NAME_ENTRY, "d", "f", "", "u", "", "t", "a", "w", "s", "findNextWeek", "b", "toString", "I", b2n.g, "()I", "setBedTime", "(I)V", "bedTime", LogFieldKey.PROCESS_NAME_KEY, "setWakeUpTime", "wakeUpTime", "i", "v", "bedTimeDayOfWeek", "q", "setWakeUpTimeDayOfWeek", "wakeUpTimeDayOfWeek", "J", LogFieldKey.LEVEL_KEY, "()J", "setCreateTime", "(J)V", "createTime", "getExcludeHoliday", "setExcludeHoliday", "excludeHoliday", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "setBedTimeStr", "(Ljava/lang/String;)V", "bedTimeStr", "r", "setWakeUpTimeStr", "wakeUpTimeStr", "n", "setRestType", "restType", "o", "startTime", LogFieldKey.MESSAGE_KEY, "endTime", "<init>", "(IIIIJI)V", "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
public final class NewSleepRest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int bedTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int wakeUpTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int bedTimeDayOfWeek;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int wakeUpTimeDayOfWeek;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public long createTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int excludeHoliday;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String bedTimeStr;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public String wakeUpTimeStr;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int restType;

    public NewSleepRest(int i, int i2, int i3, int i4, long j2, int i5) {
        this.bedTime = i;
        this.wakeUpTime = i2;
        this.bedTimeDayOfWeek = i3;
        this.wakeUpTimeDayOfWeek = i4;
        this.createTime = j2;
        this.excludeHoliday = i5;
        this.bedTimeStr = "";
        this.wakeUpTimeStr = "";
        this.restType = 2;
        this.bedTimeStr = e(i);
        this.wakeUpTimeStr = e(this.wakeUpTime);
    }

    public final int a() {
        String strE = mzj.e(f().getTimeInMillis(), "yyyyMMdd");
        Intrinsics.checkNotNullExpressionValue(strE, "formatTimeToDate(futureB…timeInMillis, \"yyyyMMdd\")");
        return Integer.parseInt(strE);
    }

    public final int b(int time, boolean findNextWeek) {
        int iO;
        if (findNextWeek) {
            iO = this.bedTime | ((this.bedTimeDayOfWeek + 7) << 16);
        } else {
            iO = o();
        }
        return iO - time;
    }

    public final int c(int startDay, int endDay) {
        int i = endDay - startDay;
        return i < 0 ? i + 7 : i;
    }

    public final int d() {
        int i = this.wakeUpTimeDayOfWeek;
        if (i < this.bedTimeDayOfWeek) {
            i += 7;
        }
        return ((i << 16) | this.wakeUpTime) - o();
    }

    public final String e(int time) {
        return ((time >> 8) & 255) + ":" + (time & 255);
    }

    @NotNull
    public final Calendar f() {
        Calendar calendarK = k();
        calendarK.set(11, zqh.a(this.bedTime));
        calendarK.set(12, zqh.b(this.bedTime));
        int i = calendarK.get(7) - 1;
        calendarK.add(6, c(i != 0 ? i : 7, this.bedTimeDayOfWeek));
        return calendarK;
    }

    public final Calendar g() {
        Calendar calendarF = f();
        calendarF.add(13, (int) (u() / 1000));
        return calendarF;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getBedTime() {
        return this.bedTime;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getBedTimeDayOfWeek() {
        return this.bedTimeDayOfWeek;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getBedTimeStr() {
        return this.bedTimeStr;
    }

    public final Calendar k() {
        Calendar result = Calendar.getInstance();
        result.set(13, 0);
        result.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final int m() {
        return this.wakeUpTime | (this.wakeUpTimeDayOfWeek << 16);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getRestType() {
        return this.restType;
    }

    public final int o() {
        return this.bedTime | (this.bedTimeDayOfWeek << 16);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getWakeUpTime() {
        return this.wakeUpTime;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getWakeUpTimeDayOfWeek() {
        return this.wakeUpTimeDayOfWeek;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getWakeUpTimeStr() {
        return this.wakeUpTimeStr;
    }

    public final boolean s() {
        return this.excludeHoliday == 1;
    }

    public final boolean t() {
        return u() > 86400000;
    }

    @NotNull
    public String toString() {
        return "NewSleepRest(bedTime=" + e(this.bedTime) + ", wakeUpTime=" + e(this.wakeUpTime) + ", bedTimeDayOfWeek=" + this.bedTimeDayOfWeek + ", wakeUpTimeDayOfWeek=" + this.wakeUpTimeDayOfWeek + ", createTime=" + this.createTime + ", excludeHoliday=" + this.excludeHoliday + ")";
    }

    public final long u() {
        int iC = c(this.bedTimeDayOfWeek, this.wakeUpTimeDayOfWeek);
        Calendar calendarK = k();
        calendarK.set(11, zqh.a(this.bedTime));
        calendarK.set(12, zqh.b(this.bedTime));
        Calendar calendarK2 = k();
        calendarK2.add(6, iC);
        calendarK2.set(11, zqh.a(this.wakeUpTime));
        calendarK2.set(12, zqh.b(this.wakeUpTime));
        return calendarK2.getTimeInMillis() - calendarK.getTimeInMillis();
    }

    public final void v(int i) {
        this.bedTimeDayOfWeek = i;
    }

    public final int w() {
        String strE = mzj.e(g().getTimeInMillis(), "yyyyMMdd");
        Intrinsics.checkNotNullExpressionValue(strE, "formatTimeToDate(futureW…timeInMillis, \"yyyyMMdd\")");
        return Integer.parseInt(strE);
    }

    public /* synthetic */ NewSleepRest(int i, int i2, int i3, int i4, long j2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i6 & 16) != 0 ? 0L : j2, (i6 & 32) != 0 ? 0 : i5);
    }
}
