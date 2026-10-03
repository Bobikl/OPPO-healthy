package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/CloseRoom;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "roomId", "getRoomId", "setRoomId", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "", "needNewRoom", "Ljava/lang/Boolean;", "getNeedNewRoom", "()Ljava/lang/Boolean;", "setNeedNewRoom", "(Ljava/lang/Boolean;)V", "needSpeak", "getNeedSpeak", "setNeedSpeak", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CloseRoom extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String content;

    @Nullable
    private Boolean needNewRoom;

    @Nullable
    private Boolean needSpeak;

    @Nullable
    private String roomId;

    @Nullable
    private Integer type;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Boolean getNeedNewRoom() {
        return this.needNewRoom;
    }

    @Nullable
    public final Boolean getNeedSpeak() {
        return this.needSpeak;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setNeedNewRoom(@Nullable Boolean bool) {
        this.needNewRoom = bool;
    }

    public final void setNeedSpeak(@Nullable Boolean bool) {
        this.needSpeak = bool;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
