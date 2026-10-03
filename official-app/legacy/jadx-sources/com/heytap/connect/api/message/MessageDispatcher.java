package com.heytap.connect.api.message;

import com.heytap.connect.api.logger.Logger;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/heytap/connect/api/message/MessageDispatcher;", AcResultHelper.KEY_MSG, "Type", "Body", "Lcom/heytap/connect/api/message/IMsgDispatcher;", "Lcom/heytap/connect/api/message/IMsgReceiver;", "msgType", "Lcom/heytap/connect/api/message/IMessageProcessor;", "msgProcessor", "", "registerMessageHandler", "(Ljava/lang/Object;Lcom/heytap/connect/api/message/IMessageProcessor;)V", "msg", "(Ljava/lang/Object;)Ljava/lang/Object;", "msgBody", "onReceivedMessage", "(Ljava/lang/Object;)V", "", "onProcessorMissHandle", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "messageProcessors", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public abstract class MessageDispatcher<Message, Type, Body> implements IMsgDispatcher<Type, Body>, IMsgReceiver<Message> {

    @NotNull
    private final ConcurrentHashMap<Type, IMessageProcessor<Body>> messageProcessors = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public Body msgBody(Message msg) {
        return msg;
    }

    public abstract Type msgType(Message msg);

    public boolean onProcessorMissHandle(Message msg) {
        return false;
    }

    @Override // com.heytap.connect.api.message.IMsgReceiver
    public void onReceivedMessage(Message msg) {
        IMessageProcessor<Body> iMessageProcessor = this.messageProcessors.get(msgType(msg));
        if (iMessageProcessor == null && onProcessorMissHandle(msg)) {
            Logger.w$default(Logger.INSTANCE, "MessageDispatcher", "messageProcessor is null", null, null, 12, null);
        } else {
            if (iMessageProcessor == null) {
                throw new IllegalArgumentException("ensure you have registered correct message processor..".toString());
            }
            Body bodyMsgBody = msgBody(msg);
            if (!iMessageProcessor.isMessageAvailable(bodyMsgBody)) {
                throw new IllegalArgumentException("message cannot handled because of Message instance cast error".toString());
            }
            iMessageProcessor.onReceivedMessage(bodyMsgBody);
        }
    }

    @Override // com.heytap.connect.api.message.IMsgDispatcher
    public void registerMessageHandler(Type msgType, @NotNull IMessageProcessor<Body> msgProcessor) {
        Intrinsics.checkNotNullParameter(msgProcessor, "msgProcessor");
        if (this.messageProcessors.containsKey(msgType)) {
            return;
        }
        this.messageProcessors.put(msgType, msgProcessor);
    }
}
