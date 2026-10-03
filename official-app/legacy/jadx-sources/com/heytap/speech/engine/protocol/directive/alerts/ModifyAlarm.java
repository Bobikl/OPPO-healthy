package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/ModifyAlarm;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "origin", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "getOrigin", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "setOrigin", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;)V", "target", "getTarget", "setTarget", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "repeat", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "getRepeat", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;", "setRepeat", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmRepeat;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ModifyAlarm extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("origin")
    @Nullable
    private AlarmInfo origin;

    @JsonProperty("repeat")
    @Nullable
    private AlarmRepeat repeat;

    @JsonProperty("target")
    @Nullable
    private AlarmInfo target;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final AlarmInfo getOrigin() {
        return this.origin;
    }

    @Nullable
    public final AlarmRepeat getRepeat() {
        return this.repeat;
    }

    @Nullable
    public final AlarmInfo getTarget() {
        return this.target;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setOrigin(@Nullable AlarmInfo alarmInfo) {
        this.origin = alarmInfo;
    }

    public final void setRepeat(@Nullable AlarmRepeat alarmRepeat) {
        this.repeat = alarmRepeat;
    }

    public final void setTarget(@Nullable AlarmInfo alarmInfo) {
        this.target = alarmInfo;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
