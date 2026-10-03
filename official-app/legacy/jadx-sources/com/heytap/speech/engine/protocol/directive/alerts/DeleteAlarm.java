package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\b¨\u00060"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/DeleteAlarm;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "repeat", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "getRepeat", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "setRepeat", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;)V", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;", "alarmTime", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;", "getAlarmTime", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;", "setAlarmTime", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;)V", "before", "getBefore", "setBefore", ParserTag.TAG_AFTER, "getAfter", "setAfter", "startTime", "getStartTime", "setStartTime", "endTime", "getEndTime", "setEndTime", "remark", "getRemark", "setRemark", "type", "getType", "setType", "state", "getState", "setState", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DeleteAlarm extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty(ParserTag.TAG_AFTER)
    @Nullable
    private String after;

    @JsonProperty("alarmTime")
    @Nullable
    private AlarmTime alarmTime;

    @JsonProperty("before")
    @Nullable
    private String before;

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("endTime")
    @Nullable
    private String endTime;

    @JsonProperty("remark")
    @Nullable
    private String remark;

    @JsonProperty("repeat")
    @Nullable
    private AlarmRepeat repeat;

    @JsonProperty("startTime")
    @Nullable
    private String startTime;

    @JsonProperty("state")
    @Nullable
    private String state;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final String getAfter() {
        return this.after;
    }

    @Nullable
    public final AlarmTime getAlarmTime() {
        return this.alarmTime;
    }

    @Nullable
    public final String getBefore() {
        return this.before;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final AlarmRepeat getRepeat() {
        return this.repeat;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setAfter(@Nullable String str) {
        this.after = str;
    }

    public final void setAlarmTime(@Nullable AlarmTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    public final void setBefore(@Nullable String str) {
        this.before = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setRepeat(@Nullable AlarmRepeat alarmRepeat) {
        this.repeat = alarmRepeat;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setState(@Nullable String str) {
        this.state = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
