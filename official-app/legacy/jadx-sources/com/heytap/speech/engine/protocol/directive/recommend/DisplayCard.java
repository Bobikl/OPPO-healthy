package com.heytap.speech.engine.protocol.directive.recommend;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR \u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR \u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\b¨\u0006("}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/DisplayCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", SpeechConstant.KEY_APP_VERSION, "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "bgUrl", "getBgUrl", "setBgUrl", "company", "getCompany", "setCompany", "dlDesc", "getDlDesc", "setDlDesc", JsonToSeedlingCardOptionsConvertor.KEY_GRADE_IN_UPK, "getGrade", "setGrade", "icon", "getIcon", "setIcon", "reserved", "", "getReserved", "()Ljava/lang/Boolean;", "setReserved", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "title", "getTitle", "setTitle", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DisplayCard extends DirectivePayload {

    @Nullable
    private String appVersion;

    @JsonProperty("bgUrl")
    @Nullable
    private String bgUrl;

    @Nullable
    private String company;

    @Nullable
    private String dlDesc;

    @Nullable
    private String grade;

    @JsonProperty("icon")
    @Nullable
    private String icon;

    @JsonProperty("reserved")
    @Nullable
    private Boolean reserved;

    @JsonProperty(Feedback.WIDGET_SUBTITLE)
    @Nullable
    private String subTitle;

    @JsonProperty("title")
    @Nullable
    private String title;

    @JsonProperty("type")
    @Nullable
    private String type;

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getBgUrl() {
        return this.bgUrl;
    }

    @Nullable
    public final String getCompany() {
        return this.company;
    }

    @Nullable
    public final String getDlDesc() {
        return this.dlDesc;
    }

    @Nullable
    public final String getGrade() {
        return this.grade;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Boolean getReserved() {
        return this.reserved;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setBgUrl(@Nullable String str) {
        this.bgUrl = str;
    }

    public final void setCompany(@Nullable String str) {
        this.company = str;
    }

    public final void setDlDesc(@Nullable String str) {
        this.dlDesc = str;
    }

    public final void setGrade(@Nullable String str) {
        this.grade = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setReserved(@Nullable Boolean bool) {
        this.reserved = bool;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
