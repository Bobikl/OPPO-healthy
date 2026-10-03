package com.heytap.speech.engine.protocol.directive.myai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/myai/LoadingStateCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "icon", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "roomId", "getRoomId", "setRoomId", "", "halfScreenDelayExitTime", "Ljava/lang/Integer;", "getHalfScreenDelayExitTime", "()Ljava/lang/Integer;", "setHalfScreenDelayExitTime", "(Ljava/lang/Integer;)V", "speakText", "getSpeakText", "setSpeakText", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class LoadingStateCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private Integer halfScreenDelayExitTime;

    @Nullable
    private String icon;

    @Nullable
    private String roomId;

    @Nullable
    private String speakText;

    @Nullable
    private String title;

    @Nullable
    public final Integer getHalfScreenDelayExitTime() {
        return this.halfScreenDelayExitTime;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getSpeakText() {
        return this.speakText;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setHalfScreenDelayExitTime(@Nullable Integer num) {
        this.halfScreenDelayExitTime = num;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setSpeakText(@Nullable String str) {
        this.speakText = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
