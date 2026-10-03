package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.health.hrv.hrv.HrvHistoryActivity;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.f04;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001c\u0010+\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000f¨\u0006."}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/MemoryEntity;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", HrvHistoryActivity.ALL_DAY, "", "getAllDay", "()Ljava/lang/Boolean;", "setAllDay", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "endDate", "", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "endTime", "getEndTime", "setEndTime", "locationText", "getLocationText", "setLocationText", "lunarDate", "getLunarDate", "setLunarDate", "memoryId", "getMemoryId", "setMemoryId", "scheduleTime", "getScheduleTime", "setScheduleTime", "scheduledType", "getScheduledType", "setScheduledType", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "getStartDate", "setStartDate", "startTime", "getStartTime", "setStartTime", "text", "getText", ClickApiEntity.SET_TEXT, "weekDate", "getWeekDate", "setWeekDate", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MemoryEntity extends DirectivePayload {

    @Nullable
    private Boolean allDay;

    @Nullable
    private String endDate;

    @Nullable
    private String endTime;

    @Nullable
    private String locationText;

    @Nullable
    private String lunarDate;

    @Nullable
    private String memoryId;

    @Nullable
    private String scheduleTime;

    @Nullable
    private String scheduledType;

    @Nullable
    private String startDate;

    @Nullable
    private String startTime;

    @Nullable
    private String text;

    @Nullable
    private String weekDate;

    @Nullable
    public final Boolean getAllDay() {
        return this.allDay;
    }

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getLocationText() {
        return this.locationText;
    }

    @Nullable
    public final String getLunarDate() {
        return this.lunarDate;
    }

    @Nullable
    public final String getMemoryId() {
        return this.memoryId;
    }

    @Nullable
    public final String getScheduleTime() {
        return this.scheduleTime;
    }

    @Nullable
    public final String getScheduledType() {
        return this.scheduledType;
    }

    @Nullable
    public final String getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getWeekDate() {
        return this.weekDate;
    }

    public final void setAllDay(@Nullable Boolean bool) {
        this.allDay = bool;
    }

    public final void setEndDate(@Nullable String str) {
        this.endDate = str;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setLocationText(@Nullable String str) {
        this.locationText = str;
    }

    public final void setLunarDate(@Nullable String str) {
        this.lunarDate = str;
    }

    public final void setMemoryId(@Nullable String str) {
        this.memoryId = str;
    }

    public final void setScheduleTime(@Nullable String str) {
        this.scheduleTime = str;
    }

    public final void setScheduledType(@Nullable String str) {
        this.scheduledType = str;
    }

    public final void setStartDate(@Nullable String str) {
        this.startDate = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setWeekDate(@Nullable String str) {
        this.weekDate = str;
    }
}
