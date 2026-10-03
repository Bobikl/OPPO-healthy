package com.heytap.speech.engine.protocol.directive.tone;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tone/SupportToneEntity;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "alreadyReply", "", "getAlreadyReply", "()Ljava/lang/String;", "setAlreadyReply", "(Ljava/lang/String;)V", "changeReply", "getChangeReply", "setChangeReply", "firstBgColor", "getFirstBgColor", "setFirstBgColor", "pic", "getPic", "setPic", "secondBgColor", "getSecondBgColor", "setSecondBgColor", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "title", "getTitle", "setTitle", "tone", "getTone", "setTone", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SupportToneEntity extends DirectivePayload {

    @Nullable
    private String alreadyReply;

    @Nullable
    private String changeReply;

    @Nullable
    private String firstBgColor;

    @Nullable
    private String pic;

    @Nullable
    private String secondBgColor;

    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    @Nullable
    private String tone;

    @Nullable
    public final String getAlreadyReply() {
        return this.alreadyReply;
    }

    @Nullable
    public final String getChangeReply() {
        return this.changeReply;
    }

    @Nullable
    public final String getFirstBgColor() {
        return this.firstBgColor;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getSecondBgColor() {
        return this.secondBgColor;
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
    public final String getTone() {
        return this.tone;
    }

    public final void setAlreadyReply(@Nullable String str) {
        this.alreadyReply = str;
    }

    public final void setChangeReply(@Nullable String str) {
        this.changeReply = str;
    }

    public final void setFirstBgColor(@Nullable String str) {
        this.firstBgColor = str;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setSecondBgColor(@Nullable String str) {
        this.secondBgColor = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTone(@Nullable String str) {
        this.tone = str;
    }
}
