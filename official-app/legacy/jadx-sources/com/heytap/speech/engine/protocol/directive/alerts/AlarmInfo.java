package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "alarmTime", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;", "getAlarmTime", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;", "setAlarmTime", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmTime;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "remark", "getRemark", "setRemark", "repeat", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "getRepeat", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "setRepeat", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;)V", "scheduledTime", "getScheduledTime", "setScheduledTime", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlarmInfo extends DirectivePayload {

    @JsonProperty("alarmTime")
    @Nullable
    private AlarmTime alarmTime;

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("remark")
    @Nullable
    private String remark;

    @JsonProperty("repeat")
    @Nullable
    private AlarmRepeat repeat;

    @JsonProperty("scheduledTime")
    @Nullable
    private String scheduledTime;

    @Nullable
    public final AlarmTime getAlarmTime() {
        return this.alarmTime;
    }

    @Nullable
    public final String getContent() {
        return this.content;
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
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    public final void setAlarmTime(@Nullable AlarmTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setRepeat(@Nullable AlarmRepeat alarmRepeat) {
        this.repeat = alarmRepeat;
    }

    public final void setScheduledTime(@Nullable String str) {
        this.scheduledTime = str;
    }
}
