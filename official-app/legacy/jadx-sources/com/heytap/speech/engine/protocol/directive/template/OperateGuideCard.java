package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Header;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b \b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006)"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/OperateGuideCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/common/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/common/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/common/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/common/Header;)V", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "source", "getSource", "setSource", "smallPic", "getSmallPic", "setSmallPic", "smallDarkPic", "getSmallDarkPic", "setSmallDarkPic", "middlePic", "getMiddlePic", "setMiddlePic", "middleDarkPic", "getMiddleDarkPic", "setMiddleDarkPic", "largePic", "getLargePic", "setLargePic", "largeDarkPic", "getLargeDarkPic", "setLargeDarkPic", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OperateGuideCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Header header;

    @Nullable
    private String largeDarkPic;

    @Nullable
    private String largePic;

    @Nullable
    private String middleDarkPic;

    @Nullable
    private String middlePic;

    @Nullable
    private String reply;

    @Nullable
    private String smallDarkPic;

    @Nullable
    private String smallPic;

    @Nullable
    private String source;

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final String getLargeDarkPic() {
        return this.largeDarkPic;
    }

    @Nullable
    public final String getLargePic() {
        return this.largePic;
    }

    @Nullable
    public final String getMiddleDarkPic() {
        return this.middleDarkPic;
    }

    @Nullable
    public final String getMiddlePic() {
        return this.middlePic;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSmallDarkPic() {
        return this.smallDarkPic;
    }

    @Nullable
    public final String getSmallPic() {
        return this.smallPic;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setLargeDarkPic(@Nullable String str) {
        this.largeDarkPic = str;
    }

    public final void setLargePic(@Nullable String str) {
        this.largePic = str;
    }

    public final void setMiddleDarkPic(@Nullable String str) {
        this.middleDarkPic = str;
    }

    public final void setMiddlePic(@Nullable String str) {
        this.middlePic = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSmallDarkPic(@Nullable String str) {
        this.smallDarkPic = str;
    }

    public final void setSmallPic(@Nullable String str) {
        this.smallPic = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }
}
