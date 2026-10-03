package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/ClientTracking;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "message", "getMessage", "setMessage", "", "skillId", "I", "getSkillId", "()I", "setSkillId", "(I)V", "intentName", "getIntentName", "setIntentName", "resourceType", "getResourceType", "setResourceType", "dmName", "getDmName", "setDmName", "expIds", "getExpIds", "setExpIds", "", "", "extendMap", "Ljava/util/Map;", "getExtendMap", "()Ljava/util/Map;", "setExtendMap", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ClientTracking extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @JsonProperty("code")
    @Nullable
    private String code;

    @JsonProperty("dmName")
    @Nullable
    private String dmName;

    @JsonProperty("expIds")
    @Nullable
    private String expIds;

    @JsonProperty("extendMap")
    @Nullable
    private Map<String, ? extends Object> extendMap;

    @JsonProperty("intentName")
    @Nullable
    private String intentName;

    @JsonProperty("message")
    @Nullable
    private String message;

    @JsonProperty("resourceType")
    @Nullable
    private String resourceType;

    @JsonProperty("skillId")
    private int skillId;

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getDmName() {
        return this.dmName;
    }

    @Nullable
    public final String getExpIds() {
        return this.expIds;
    }

    @Nullable
    public final Map<String, Object> getExtendMap() {
        return this.extendMap;
    }

    @Nullable
    public final String getIntentName() {
        return this.intentName;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getResourceType() {
        return this.resourceType;
    }

    public final int getSkillId() {
        return this.skillId;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setDmName(@Nullable String str) {
        this.dmName = str;
    }

    public final void setExpIds(@Nullable String str) {
        this.expIds = str;
    }

    public final void setExtendMap(@Nullable Map<String, ? extends Object> map) {
        this.extendMap = map;
    }

    public final void setIntentName(@Nullable String str) {
        this.intentName = str;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setResourceType(@Nullable String str) {
        this.resourceType = str;
    }

    public final void setSkillId(int i) {
        this.skillId = i;
    }
}
