package com.heytap.speech.engine.protocol.directive.common.commercial;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Instruction;
import com.oplus.aiunit.vision.f04;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR \u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R \u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR \u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR \u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR \u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001e\u00101\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0014¨\u00064"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", f04.JSON_KEY_RKE_ACTION_TYPE, "", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "appId", "getAppId", "setAppId", "appName", "getAppName", "setAppName", "autoDownload", "", "getAutoDownload", "()Ljava/lang/Integer;", "setAutoDownload", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "content", "getContent", "setContent", "exitDialog", "getExitDialog", "setExitDialog", "instruction", "Lcom/heytap/speech/engine/protocol/directive/common/Instruction;", "getInstruction", "()Lcom/heytap/speech/engine/protocol/directive/common/Instruction;", "setInstruction", "(Lcom/heytap/speech/engine/protocol/directive/common/Instruction;)V", "order", "getOrder", "setOrder", TraceConstants.KEY_PKG_NAME, "getPkgName", "setPkgName", "scene", "getScene", "setScene", "sourceMode", "getSourceMode", "setSourceMode", "traceId", "getTraceId", "setTraceId", "versionCode", "getVersionCode", "setVersionCode", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActionInfo extends DirectivePayload {

    @JsonProperty(f04.JSON_KEY_RKE_ACTION_TYPE)
    @Nullable
    private String actionType;

    @JsonProperty("appId")
    @Nullable
    private String appId;

    @JsonProperty("appName")
    @Nullable
    private String appName;

    @JsonProperty("autoDownload")
    @Nullable
    private Integer autoDownload;

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("exitDialog")
    @Nullable
    private String exitDialog;

    @JsonProperty("instruction")
    @Nullable
    private Instruction instruction;

    @JsonProperty("order")
    @Nullable
    private Integer order;

    @JsonProperty(TraceConstants.KEY_PKG_NAME)
    @Nullable
    private String pkgName;

    @JsonProperty("scene")
    @Nullable
    private String scene;

    @JsonProperty("sourceMode")
    @Nullable
    private String sourceMode;

    @JsonProperty("traceId")
    @Nullable
    private String traceId;

    @Nullable
    private Integer versionCode;

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Integer getAutoDownload() {
        return this.autoDownload;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getExitDialog() {
        return this.exitDialog;
    }

    @Nullable
    public final Instruction getInstruction() {
        return this.instruction;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    public final String getPkgName() {
        return this.pkgName;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final String getSourceMode() {
        return this.sourceMode;
    }

    @Nullable
    public final String getTraceId() {
        return this.traceId;
    }

    @Nullable
    public final Integer getVersionCode() {
        return this.versionCode;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAutoDownload(@Nullable Integer num) {
        this.autoDownload = num;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setExitDialog(@Nullable String str) {
        this.exitDialog = str;
    }

    public final void setInstruction(@Nullable Instruction instruction) {
        this.instruction = instruction;
    }

    public final void setOrder(@Nullable Integer num) {
        this.order = num;
    }

    public final void setPkgName(@Nullable String str) {
        this.pkgName = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setSourceMode(@Nullable String str) {
        this.sourceMode = str;
    }

    public final void setTraceId(@Nullable String str) {
        this.traceId = str;
    }

    public final void setVersionCode(@Nullable Integer num) {
        this.versionCode = num;
    }
}
