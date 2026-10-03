package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b&\u0010'R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/DialogTextCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "", "Lcom/heytap/speech/engine/protocol/directive/chitchat/LinkInfo;", "links", "Ljava/util/List;", "getLinks", "()Ljava/util/List;", "setLinks", "(Ljava/util/List;)V", "Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;", "emotion", "Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;", "getEmotion", "()Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;", "setEmotion", "(Lcom/heytap/speech/engine/protocol/directive/chitchat/Emotion;)V", "Lcom/heytap/speech/engine/protocol/directive/chitchat/EditUserInfo;", "editUserInfo", "Lcom/heytap/speech/engine/protocol/directive/chitchat/EditUserInfo;", "getEditUserInfo", "()Lcom/heytap/speech/engine/protocol/directive/chitchat/EditUserInfo;", "setEditUserInfo", "(Lcom/heytap/speech/engine/protocol/directive/chitchat/EditUserInfo;)V", "", "reFreshFlag", "Ljava/lang/Boolean;", "getReFreshFlag", "()Ljava/lang/Boolean;", "setReFreshFlag", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DialogTextCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("editUserInfo")
    @Nullable
    private EditUserInfo editUserInfo;

    @JsonProperty("emotion")
    @Nullable
    private Emotion emotion;

    @JsonProperty("links")
    @Nullable
    private List<LinkInfo> links;

    @JsonProperty("reFreshFlag")
    @Nullable
    private Boolean reFreshFlag;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final EditUserInfo getEditUserInfo() {
        return this.editUserInfo;
    }

    @Nullable
    public final Emotion getEmotion() {
        return this.emotion;
    }

    @Nullable
    public final List<LinkInfo> getLinks() {
        return this.links;
    }

    @Nullable
    public final Boolean getReFreshFlag() {
        return this.reFreshFlag;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setEditUserInfo(@Nullable EditUserInfo editUserInfo) {
        this.editUserInfo = editUserInfo;
    }

    public final void setEmotion(@Nullable Emotion emotion) {
        this.emotion = emotion;
    }

    public final void setLinks(@Nullable List<LinkInfo> list) {
        this.links = list;
    }

    public final void setReFreshFlag(@Nullable Boolean bool) {
        this.reFreshFlag = bool;
    }
}
