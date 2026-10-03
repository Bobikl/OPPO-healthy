package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/CreateAlarm;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "scheduledTime", "Ljava/lang/String;", "getScheduledTime", "()Ljava/lang/String;", "setScheduledTime", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "repeat", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "getRepeat", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "setRepeat", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;)V", "relativeTimeSecond", "getRelativeTimeSecond", "setRelativeTimeSecond", "remark", "getRemark", "setRemark", "content", "getContent", "setContent", SpeechConstant.TTS_PLAY_MARK_TIP, "getTip", "setTip", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CreateAlarm extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("relativeTimeSecond")
    @Nullable
    private String relativeTimeSecond;

    @JsonProperty("remark")
    @Nullable
    private String remark;

    @JsonProperty("repeat")
    @Nullable
    private AlarmRepeat repeat;

    @JsonProperty("scheduledTime")
    @Nullable
    private String scheduledTime;

    @JsonProperty(SpeechConstant.TTS_PLAY_MARK_TIP)
    @Nullable
    private String tip;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getRelativeTimeSecond() {
        return this.relativeTimeSecond;
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

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setRelativeTimeSecond(@Nullable String str) {
        this.relativeTimeSecond = str;
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

    public final void setTip(@Nullable String str) {
        this.tip = str;
    }
}
