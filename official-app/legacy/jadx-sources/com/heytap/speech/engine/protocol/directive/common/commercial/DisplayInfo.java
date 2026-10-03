package com.heytap.speech.engine.protocol.directive.common.commercial;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\b¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/commercial/DisplayInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", SpeechConstant.KEY_APP_VERSION, "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "company", "getCompany", "setCompany", "content", "getContent", "setContent", "dlDesc", "getDlDesc", "setDlDesc", "icon", "getIcon", "setIcon", "logUrl", "getLogUrl", "setLogUrl", "score", "", "getScore", "()Ljava/lang/Double;", "setScore", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DisplayInfo extends DirectivePayload {

    @Nullable
    private String appVersion;

    @Nullable
    private String company;

    @JsonProperty("content")
    @Nullable
    private String content;

    @Nullable
    private String dlDesc;

    @JsonProperty("icon")
    @Nullable
    private String icon;

    @Nullable
    private String logUrl;

    @Nullable
    private Double score;

    @JsonProperty("title")
    @Nullable
    private String title;

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDlDesc() {
        return this.dlDesc;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getLogUrl() {
        return this.logUrl;
    }

    @Nullable
    public final Double getScore() {
        return this.score;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setCompany(@Nullable String str) {
        this.company = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDlDesc(@Nullable String str) {
        this.dlDesc = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLogUrl(@Nullable String str) {
        this.logUrl = str;
    }

    public final void setScore(@Nullable Double d) {
        this.score = d;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
