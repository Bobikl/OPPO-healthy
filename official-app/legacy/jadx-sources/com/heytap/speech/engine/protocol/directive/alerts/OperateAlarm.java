package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/OperateAlarm;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "operateType", "Ljava/lang/String;", "getOperateType", "()Ljava/lang/String;", "setOperateType", "(Ljava/lang/String;)V", "", "extend", "Ljava/util/Map;", "getExtend", "()Ljava/util/Map;", "setExtend", "(Ljava/util/Map;)V", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "alarmInfo", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "getAlarmInfo", "()Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;", "setAlarmInfo", "(Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmInfo;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OperateAlarm extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("alarmInfo")
    @Nullable
    private AlarmInfo alarmInfo;

    @JsonProperty("extend")
    @Nullable
    private Map<String, String> extend;

    @JsonProperty("operateType")
    @Nullable
    private String operateType;

    @Nullable
    public final AlarmInfo getAlarmInfo() {
        return this.alarmInfo;
    }

    @Nullable
    public final Map<String, String> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getOperateType() {
        return this.operateType;
    }

    public final void setAlarmInfo(@Nullable AlarmInfo alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    public final void setExtend(@Nullable Map<String, String> map) {
        this.extend = map;
    }

    public final void setOperateType(@Nullable String str) {
        this.operateType = str;
    }
}
