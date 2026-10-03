package com.heytap.speech.engine.protocol.event.payload.initiativeDialogue;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.ForceNewDialogPayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bRB\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/initiativeDialogue/EnterIntelligentAgent;", "Lcom/heytap/speech/engine/protocol/event/ForceNewDialogPayload;", "", "agentName", "Ljava/lang/String;", "getAgentName", "()Ljava/lang/String;", "setAgentName", "(Ljava/lang/String;)V", "roomId", "getRoomId", "setRoomId", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class EnterIntelligentAgent extends ForceNewDialogPayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String agentName;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String roomId;

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }
}
