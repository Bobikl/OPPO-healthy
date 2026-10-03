package com.heytap.speech.engine.protocol.directive.systemsoundandvibration;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/systemsoundandvibration/AdjustVolume;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "targetType", "Ljava/lang/String;", "getTargetType", "()Ljava/lang/String;", "setTargetType", "(Ljava/lang/String;)V", "action", "getAction", "setAction", "value", "getValue", "setValue", "type", "getType", "setType", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AdjustVolume extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("action")
    @Nullable
    private String action;

    @JsonProperty("targetType")
    @Nullable
    private String targetType;

    @JsonProperty("type")
    @Nullable
    private String type;

    @JsonProperty("value")
    @Nullable
    private String value;

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getTargetType() {
        return this.targetType;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setTargetType(@Nullable String str) {
        this.targetType = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }
}
