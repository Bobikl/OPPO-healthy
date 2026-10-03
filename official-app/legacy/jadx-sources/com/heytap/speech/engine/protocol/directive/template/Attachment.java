package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Attachment;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "link", "getLink", "setLink", c8l.IMAGE_KEY, "getImage", "setImage", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Attachment extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty(c8l.IMAGE_KEY)
    @Nullable
    private String image;

    @JsonProperty("link")
    @Nullable
    private String link;

    @JsonProperty("text")
    @Nullable
    private String text;

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
