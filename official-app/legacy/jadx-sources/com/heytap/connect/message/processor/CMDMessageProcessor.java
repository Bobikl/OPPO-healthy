package com.heytap.connect.message.processor;

import com.heytap.connect.TapConnection;
import com.heytap.connect.api.message.MessageProcessor;
import com.heytap.connect.message.Message;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/heytap/connect/message/processor/CMDMessageProcessor;", "Lcom/heytap/connect/api/message/MessageProcessor;", "Lcom/heytap/connect/message/Message;", "message", "", "isMessageAvailable", "(Lcom/heytap/connect/message/Message;)Z", "", "onReceivedMessage", "(Lcom/heytap/connect/message/Message;)V", "Lcom/heytap/connect/TapConnection;", "client", "Lcom/heytap/connect/TapConnection;", "<init>", "(Lcom/heytap/connect/TapConnection;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class CMDMessageProcessor implements MessageProcessor {

    @NotNull
    private final TapConnection client;

    public CMDMessageProcessor(@NotNull TapConnection client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.heytap.connect.api.message.IMessageProcessor
    public boolean isMessageAvailable(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return true;
    }

    @Override // com.heytap.connect.api.message.IMsgReceiver
    public void onReceivedMessage(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
