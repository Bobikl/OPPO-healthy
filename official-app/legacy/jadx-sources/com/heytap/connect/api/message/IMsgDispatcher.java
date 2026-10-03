package com.heytap.connect.api.message;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/connect/api/message/IMsgDispatcher;", "Type", "Body", "Lcom/heytap/connect/api/message/IMsgSender;", "msgType", "Lcom/heytap/connect/api/message/IMessageProcessor;", "msgProcessor", "", "registerMessageHandler", "(Ljava/lang/Object;Lcom/heytap/connect/api/message/IMessageProcessor;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IMsgDispatcher<Type, Body> extends IMsgSender<Body> {
    void registerMessageHandler(Type msgType, @NotNull IMessageProcessor<Body> msgProcessor);
}
