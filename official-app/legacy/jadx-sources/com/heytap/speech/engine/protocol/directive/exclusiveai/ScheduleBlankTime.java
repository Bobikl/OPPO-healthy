package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleBlankTime;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "endDate", "", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "endTime", "getEndTime", "setEndTime", "lunarDate", "getLunarDate", "setLunarDate", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "getStartDate", "setStartDate", "startTime", "getStartTime", "setStartTime", "weekDate", "getWeekDate", "setWeekDate", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ScheduleBlankTime extends DirectivePayload {

    @Nullable
    private String endDate;

    @Nullable
    private String endTime;

    @Nullable
    private String lunarDate;

    @Nullable
    private String startDate;

    @Nullable
    private String startTime;

    @Nullable
    private String weekDate;

    @Nullable
    public final String getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getLunarDate() {
        return this.lunarDate;
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
    public final String getWeekDate() {
        return this.weekDate;
    }

    public final void setEndDate(@Nullable String str) {
        this.endDate = str;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setLunarDate(@Nullable String str) {
        this.lunarDate = str;
    }

    public final void setStartDate(@Nullable String str) {
        this.startDate = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setWeekDate(@Nullable String str) {
        this.weekDate = str;
    }
}
