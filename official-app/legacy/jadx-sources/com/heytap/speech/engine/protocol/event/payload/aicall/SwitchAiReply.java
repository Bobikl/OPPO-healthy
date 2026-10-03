package com.heytap.speech.engine.protocol.event.payload.aicall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/aicall/SwitchAiReply;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "Lcom/heytap/speech/engine/protocol/event/payload/aicall/CallDialogInfo;", "callDialogInfos", "Ljava/util/List;", "getCallDialogInfos", "()Ljava/util/List;", "setCallDialogInfos", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SwitchAiReply extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private List<CallDialogInfo> callDialogInfos;

    @Nullable
    public final List<CallDialogInfo> getCallDialogInfos() {
        return this.callDialogInfos;
    }

    public final void setCallDialogInfos(@Nullable List<CallDialogInfo> list) {
        this.callDialogInfos = list;
    }
}
