package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/SkillRecCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "", "Lcom/heytap/speech/engine/protocol/directive/chitchat/RecSkillInfo;", "recSkillInfo", "Ljava/util/List;", "getRecSkillInfo", "()Ljava/util/List;", "setRecSkillInfo", "(Ljava/util/List;)V", "exitDialog", "getExitDialog", "setExitDialog", "", "", "trackingInfo", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "setTrackingInfo", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SkillRecCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("exitDialog")
    @Nullable
    private String exitDialog;

    @JsonProperty("recSkillInfo")
    @Nullable
    private List<RecSkillInfo> recSkillInfo;

    @Nullable
    private Map<String, ? extends Object> trackingInfo;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getExitDialog() {
        return this.exitDialog;
    }

    @Nullable
    public final List<RecSkillInfo> getRecSkillInfo() {
        return this.recSkillInfo;
    }

    @Nullable
    public final Map<String, Object> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setExitDialog(@Nullable String str) {
        this.exitDialog = str;
    }

    public final void setRecSkillInfo(@Nullable List<RecSkillInfo> list) {
        this.recSkillInfo = list;
    }

    public final void setTrackingInfo(@Nullable Map<String, ? extends Object> map) {
        this.trackingInfo = map;
    }
}
