package com.heytap.speech.engine.protocol.event;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.wka;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/ForceNewDialogPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "isNewDialog", "Z", "()Z", "setNewDialog", "(Z)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public class ForceNewDialogPayload extends Payload {

    @NotNull
    private static final String VERSION = "2.0";

    @wka
    private boolean isNewDialog = true;

    /* JADX INFO: renamed from: isNewDialog, reason: from getter */
    public final boolean getIsNewDialog() {
        return this.isNewDialog;
    }

    public final void setNewDialog(boolean z) {
        this.isNewDialog = z;
    }
}
