package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/RecSkillInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "skillIconUrl", "", "getSkillIconUrl", "()Ljava/lang/String;", "setSkillIconUrl", "(Ljava/lang/String;)V", "skillId", "", "getSkillId", "()Ljava/lang/Integer;", "setSkillId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "skillQuery", "getSkillQuery", "setSkillQuery", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RecSkillInfo extends DirectivePayload {

    @JsonProperty("skillIconUrl")
    @Nullable
    private String skillIconUrl;

    @JsonProperty("skillId")
    @Nullable
    private Integer skillId;

    @JsonProperty("skillQuery")
    @Nullable
    private String skillQuery;

    @Nullable
    public final String getSkillIconUrl() {
        return this.skillIconUrl;
    }

    @Nullable
    public final Integer getSkillId() {
        return this.skillId;
    }

    @Nullable
    public final String getSkillQuery() {
        return this.skillQuery;
    }

    public final void setSkillIconUrl(@Nullable String str) {
        this.skillIconUrl = str;
    }

    public final void setSkillId(@Nullable Integer num) {
        this.skillId = num;
    }

    public final void setSkillQuery(@Nullable String str) {
        this.skillQuery = str;
    }
}
