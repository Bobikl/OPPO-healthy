package com.heytap.health.watch.calendar.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.oplus.aiunit.vision.iim;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b;\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010o\u001a\u00020p2\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010q\u001a\u00020\u0004H\u0016J\u001c\u0010r\u001a\u00020p2\b\u0010s\u001a\u0004\u0018\u00010\u00102\b\u0010t\u001a\u0004\u0018\u00010\u0010H\u0002J(\u0010r\u001a\u00020p2\u000e\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010X2\u000e\u0010t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010XH\u0002J\b\u0010u\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\u001c\u0010*\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001c\u0010-\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001c\u0010E\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014R\u001c\u0010H\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010\u0014R\u001c\u0010K\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0012\"\u0004\bM\u0010\u0014R\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010\u0014R\u001c\u0010T\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0012\"\u0004\bV\u0010\u0014R\"\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010XX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010]\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0012\"\u0004\b_\u0010\u0014R\u001a\u0010`\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010 R\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001c\u0010f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0012\"\u0004\bh\u0010\u0014R\u001c\u0010i\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0012\"\u0004\bk\u0010\u0014R\u001a\u0010l\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0006\"\u0004\bn\u0010\b¨\u0006v"}, d2 = {"Lcom/heytap/health/watch/calendar/bean/CalendarBean;", "", "()V", HrvHistoryActivity.ALL_DAY, "", "getAllDay", "()I", "setAllDay", "(I)V", "calendarColor", "getCalendarColor", "setCalendarColor", "calendarId", "getCalendarId", "setCalendarId", "calendarName", "", "getCalendarName", "()Ljava/lang/String;", "setCalendarName", "(Ljava/lang/String;)V", iim.a.f, "getDescription", "setDescription", "duration", "getDuration", "setDuration", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "eventId", "getEventId", "setEventId", "eventStatus", "getEventStatus", "setEventStatus", "eventUpdateTime", "getEventUpdateTime", "setEventUpdateTime", "exDate", "getExDate", "setExDate", "exRule", "getExRule", "setExRule", "hasAlarm", "getHasAlarm", "setHasAlarm", "location", "getLocation", "setLocation", "method", "getMethod", "setMethod", "minutes", "getMinutes", "setMinutes", "operateStatus", "getOperateStatus", "setOperateStatus", "operateTime", "getOperateTime", "setOperateTime", "operateType", "getOperateType", "setOperateType", "originalAllDay", "getOriginalAllDay", "setOriginalAllDay", "originalId", "getOriginalId", "setOriginalId", "originalInstanceTime", "getOriginalInstanceTime", "setOriginalInstanceTime", "other", "getOther", "setOther", "phoneEventId", "getPhoneEventId", "setPhoneEventId", "rDate", "getRDate", "setRDate", "reminderTime", "", "getReminderTime", "()Ljava/util/List;", "setReminderTime", "(Ljava/util/List;)V", "repeatType", "getRepeatType", "setRepeatType", "startTime", "getStartTime", "setStartTime", "state", "getState", "setState", ConnectIdLogic.PARAM_TIMEZONE, "getTimeZone", "setTimeZone", "title", "getTitle", "setTitle", "watchEventId", "getWatchEventId", "setWatchEventId", "equals", "", "hashCode", "isSame", "a", "b", "toString", "calendar_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CalendarBean {

    /* JADX INFO: renamed from: allDay, reason: from kotlin metadata and from toString */
    private int mAllDay;
    private int calendarColor;

    /* JADX INFO: renamed from: calendarId, reason: from kotlin metadata and from toString */
    private int mCalendarId;

    @Nullable
    private String calendarName;

    /* JADX INFO: renamed from: description, reason: from kotlin metadata and from toString */
    @Nullable
    private String mDescription;

    /* JADX INFO: renamed from: duration, reason: from kotlin metadata and from toString */
    @Nullable
    private String mDuration;

    /* JADX INFO: renamed from: endTime, reason: from kotlin metadata and from toString */
    private long mEndTime;
    private int eventId;
    private int eventStatus;
    private long eventUpdateTime;

    @Nullable
    private String exDate;

    @Nullable
    private String exRule;

    /* JADX INFO: renamed from: hasAlarm, reason: from kotlin metadata and from toString */
    private int mHasAlarm;

    /* JADX INFO: renamed from: location, reason: from kotlin metadata and from toString */
    @Nullable
    private String mLocation;

    /* JADX INFO: renamed from: method, reason: from kotlin metadata and from toString */
    private int mMethod;

    /* JADX INFO: renamed from: minutes, reason: from kotlin metadata and from toString */
    private int mMinutes;

    /* JADX INFO: renamed from: operateStatus, reason: from kotlin metadata and from toString */
    private int mOperateStatus;

    /* JADX INFO: renamed from: operateTime, reason: from kotlin metadata and from toString */
    private long mOperateTime;

    /* JADX INFO: renamed from: operateType, reason: from kotlin metadata and from toString */
    private int mOperateType;

    @Nullable
    private String originalAllDay;

    @Nullable
    private String originalId;

    @Nullable
    private String originalInstanceTime;

    /* JADX INFO: renamed from: other, reason: from kotlin metadata and from toString */
    private int mOther = -1;

    @Nullable
    private String phoneEventId;

    @Nullable
    private String rDate;

    @Nullable
    private List<Integer> reminderTime;

    /* JADX INFO: renamed from: repeatType, reason: from kotlin metadata and from toString */
    @Nullable
    private String mRepeatType;

    /* JADX INFO: renamed from: startTime, reason: from kotlin metadata and from toString */
    private long mStartTime;

    /* JADX INFO: renamed from: state, reason: from kotlin metadata and from toString */
    private int mState;

    /* JADX INFO: renamed from: timeZone, reason: from kotlin metadata and from toString */
    @Nullable
    private String mTimeZone;

    /* JADX INFO: renamed from: title, reason: from kotlin metadata and from toString */
    @Nullable
    private String mTitle;
    private int watchEventId;

    private final boolean isSame(String a, String b) {
        if (TextUtils.isEmpty(a) || StringsKt__StringsJVMKt.equals(a, "null", true)) {
            return TextUtils.isEmpty(b) || StringsKt__StringsJVMKt.equals(b, "null", true);
        }
        return TextUtils.equals(a, b);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(CalendarBean.class, other.getClass())) {
            return false;
        }
        CalendarBean calendarBean = (CalendarBean) other;
        return this.eventId == calendarBean.eventId && this.mStartTime == calendarBean.mStartTime && this.mEndTime == calendarBean.mEndTime && this.mAllDay == calendarBean.mAllDay && this.mMinutes == calendarBean.mMinutes && isSame(this.mRepeatType, calendarBean.mRepeatType) && isSame(this.mTitle, calendarBean.mTitle) && isSame(this.mLocation, calendarBean.mLocation) && isSame(this.mDescription, calendarBean.mDescription) && isSame(this.mTimeZone, calendarBean.mTimeZone) && isSame(this.reminderTime, calendarBean.reminderTime) && isSame(this.rDate, calendarBean.rDate) && isSame(this.exRule, calendarBean.exRule) && isSame(this.exDate, calendarBean.exDate) && isSame(this.originalId, calendarBean.originalId) && isSame(this.originalInstanceTime, calendarBean.originalInstanceTime) && isSame(this.originalAllDay, calendarBean.originalAllDay) && this.eventStatus == calendarBean.eventStatus && isSame(this.phoneEventId, calendarBean.phoneEventId) && isSame(this.calendarName, calendarBean.calendarName) && this.calendarColor == calendarBean.calendarColor && this.eventUpdateTime == calendarBean.eventUpdateTime;
    }

    /* JADX INFO: renamed from: getAllDay, reason: from getter */
    public final int getMAllDay() {
        return this.mAllDay;
    }

    public final int getCalendarColor() {
        return this.calendarColor;
    }

    /* JADX INFO: renamed from: getCalendarId, reason: from getter */
    public final int getMCalendarId() {
        return this.mCalendarId;
    }

    @Nullable
    public final String getCalendarName() {
        return this.calendarName;
    }

    @Nullable
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getMDescription() {
        return this.mDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: getDuration, reason: from getter */
    public final String getMDuration() {
        return this.mDuration;
    }

    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final long getMEndTime() {
        return this.mEndTime;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getEventStatus() {
        return this.eventStatus;
    }

    public final long getEventUpdateTime() {
        return this.eventUpdateTime;
    }

    @Nullable
    public final String getExDate() {
        return this.exDate;
    }

    @Nullable
    public final String getExRule() {
        return this.exRule;
    }

    /* JADX INFO: renamed from: getHasAlarm, reason: from getter */
    public final int getMHasAlarm() {
        return this.mHasAlarm;
    }

    @Nullable
    /* JADX INFO: renamed from: getLocation, reason: from getter */
    public final String getMLocation() {
        return this.mLocation;
    }

    /* JADX INFO: renamed from: getMethod, reason: from getter */
    public final int getMMethod() {
        return this.mMethod;
    }

    /* JADX INFO: renamed from: getMinutes, reason: from getter */
    public final int getMMinutes() {
        return this.mMinutes;
    }

    /* JADX INFO: renamed from: getOperateStatus, reason: from getter */
    public final int getMOperateStatus() {
        return this.mOperateStatus;
    }

    /* JADX INFO: renamed from: getOperateTime, reason: from getter */
    public final long getMOperateTime() {
        return this.mOperateTime;
    }

    /* JADX INFO: renamed from: getOperateType, reason: from getter */
    public final int getMOperateType() {
        return this.mOperateType;
    }

    @Nullable
    public final String getOriginalAllDay() {
        return this.originalAllDay;
    }

    @Nullable
    public final String getOriginalId() {
        return this.originalId;
    }

    @Nullable
    public final String getOriginalInstanceTime() {
        return this.originalInstanceTime;
    }

    /* JADX INFO: renamed from: getOther, reason: from getter */
    public final int getMOther() {
        return this.mOther;
    }

    @Nullable
    public final String getPhoneEventId() {
        return this.phoneEventId;
    }

    @Nullable
    public final String getRDate() {
        return this.rDate;
    }

    @Nullable
    public final List<Integer> getReminderTime() {
        return this.reminderTime;
    }

    @Nullable
    /* JADX INFO: renamed from: getRepeatType, reason: from getter */
    public final String getMRepeatType() {
        return this.mRepeatType;
    }

    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final long getMStartTime() {
        return this.mStartTime;
    }

    /* JADX INFO: renamed from: getState, reason: from getter */
    public final int getMState() {
        return this.mState;
    }

    @Nullable
    /* JADX INFO: renamed from: getTimeZone, reason: from getter */
    public final String getMTimeZone() {
        return this.mTimeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getMTitle() {
        return this.mTitle;
    }

    public final int getWatchEventId() {
        return this.watchEventId;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.eventId), this.mTitle, this.mLocation, this.mDescription, Long.valueOf(this.mStartTime), Long.valueOf(this.mEndTime), this.mTimeZone, Integer.valueOf(this.mAllDay), Integer.valueOf(this.mMinutes), this.mRepeatType, this.reminderTime, this.rDate, this.exRule, this.exDate, this.originalId, this.originalInstanceTime, this.originalAllDay, Integer.valueOf(this.eventStatus), this.phoneEventId, this.calendarName, Integer.valueOf(this.calendarColor), Long.valueOf(this.eventUpdateTime));
    }

    public final void setAllDay(int i) {
        this.mAllDay = i;
    }

    public final void setCalendarColor(int i) {
        this.calendarColor = i;
    }

    public final void setCalendarId(int i) {
        this.mCalendarId = i;
    }

    public final void setCalendarName(@Nullable String str) {
        this.calendarName = str;
    }

    public final void setDescription(@Nullable String str) {
        this.mDescription = str;
    }

    public final void setDuration(@Nullable String str) {
        this.mDuration = str;
    }

    public final void setEndTime(long j2) {
        this.mEndTime = j2;
    }

    public final void setEventId(int i) {
        this.eventId = i;
    }

    public final void setEventStatus(int i) {
        this.eventStatus = i;
    }

    public final void setEventUpdateTime(long j2) {
        this.eventUpdateTime = j2;
    }

    public final void setExDate(@Nullable String str) {
        this.exDate = str;
    }

    public final void setExRule(@Nullable String str) {
        this.exRule = str;
    }

    public final void setHasAlarm(int i) {
        this.mHasAlarm = i;
    }

    public final void setLocation(@Nullable String str) {
        this.mLocation = str;
    }

    public final void setMethod(int i) {
        this.mMethod = i;
    }

    public final void setMinutes(int i) {
        this.mMinutes = i;
    }

    public final void setOperateStatus(int i) {
        this.mOperateStatus = i;
    }

    public final void setOperateTime(long j2) {
        this.mOperateTime = j2;
    }

    public final void setOperateType(int i) {
        this.mOperateType = i;
    }

    public final void setOriginalAllDay(@Nullable String str) {
        this.originalAllDay = str;
    }

    public final void setOriginalId(@Nullable String str) {
        this.originalId = str;
    }

    public final void setOriginalInstanceTime(@Nullable String str) {
        this.originalInstanceTime = str;
    }

    public final void setOther(int i) {
        this.mOther = i;
    }

    public final void setPhoneEventId(@Nullable String str) {
        this.phoneEventId = str;
    }

    public final void setRDate(@Nullable String str) {
        this.rDate = str;
    }

    public final void setReminderTime(@Nullable List<Integer> list) {
        this.reminderTime = list;
    }

    public final void setRepeatType(@Nullable String str) {
        this.mRepeatType = str;
    }

    public final void setStartTime(long j2) {
        this.mStartTime = j2;
    }

    public final void setState(int i) {
        this.mState = i;
    }

    public final void setTimeZone(@Nullable String str) {
        this.mTimeZone = str;
    }

    public final void setTitle(@Nullable String str) {
        this.mTitle = str;
    }

    public final void setWatchEventId(int i) {
        this.watchEventId = i;
    }

    @NotNull
    public String toString() {
        return "CalendarBean{mEventId=" + this.eventId + ", mTitle='" + this.mTitle + "', mLocation='" + this.mLocation + "', mDescription='" + this.mDescription + "', mStartTime=" + this.mStartTime + ", mEndTime=" + this.mEndTime + ", mTimeZone='" + this.mTimeZone + "', mAllDay=" + this.mAllDay + ", mHasAlarm=" + this.mHasAlarm + ", mMethod=" + this.mMethod + ", mMinutes=" + this.mMinutes + ", mRepeatType='" + this.mRepeatType + "', mDuration='" + this.mDuration + "', mCalendarId=" + this.mCalendarId + ", mState=" + this.mState + ", mOther=" + this.mOther + ", mOperateType=" + this.mOperateType + ", mOperateTime=" + this.mOperateTime + ", mOperateStatus=" + this.mOperateStatus + ", reminderTime=" + this.reminderTime + ", rDate=" + this.rDate + ", exRule=" + this.exRule + ", exDate=" + this.exDate + ", originalId=" + this.originalId + ", originalInstanceTime=" + this.originalInstanceTime + ", originalAllDay=" + this.originalAllDay + ", eventStatus=" + this.eventStatus + ", phoneEventId=" + this.phoneEventId + ", watchEventId=" + this.watchEventId + ", calendarName=" + this.calendarName + ", calendarColor=" + this.calendarColor + ", eventUpdateTime=" + this.eventUpdateTime + "}";
    }

    private final boolean isSame(List<Integer> a, List<Integer> b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null || a.size() != b.size()) {
            return false;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (a.get(i).intValue() != b.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }
}
