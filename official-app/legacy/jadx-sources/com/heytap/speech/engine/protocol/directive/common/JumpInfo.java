package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/JumpInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "appPackageName", "getAppPackageName", "setAppPackageName", "deeplink", "getDeeplink", "setDeeplink", "instruction", "Lcom/heytap/speech/engine/protocol/directive/common/Instruction;", "getInstruction", "()Lcom/heytap/speech/engine/protocol/directive/common/Instruction;", "setInstruction", "(Lcom/heytap/speech/engine/protocol/directive/common/Instruction;)V", "quickAppUrl", "getQuickAppUrl", "setQuickAppUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class JumpInfo extends DirectivePayload {

    @JsonProperty("appName")
    @Nullable
    private String appName;

    @JsonProperty("appPackageName")
    @Nullable
    private String appPackageName;

    @JsonProperty("deeplink")
    @Nullable
    private String deeplink;

    @JsonProperty("instruction")
    @Nullable
    private Instruction instruction;

    @JsonProperty("quickAppUrl")
    @Nullable
    private String quickAppUrl;

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getAppPackageName() {
        return this.appPackageName;
    }

    @Nullable
    public final String getDeeplink() {
        return this.deeplink;
    }

    @Nullable
    public final Instruction getInstruction() {
        return this.instruction;
    }

    @Nullable
    public final String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAppPackageName(@Nullable String str) {
        this.appPackageName = str;
    }

    public final void setDeeplink(@Nullable String str) {
        this.deeplink = str;
    }

    public final void setInstruction(@Nullable Instruction instruction) {
        this.instruction = instruction;
    }

    public final void setQuickAppUrl(@Nullable String str) {
        this.quickAppUrl = str;
    }
}
