package com.heytap.connect.api.message;

import com.platform.usercenter.account.ams.ipc.AcResultHelper;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/connect/api/message/IMessageProcessor;", AcResultHelper.KEY_MSG, "Lcom/heytap/connect/api/message/IMsgReceiver;", "message", "", "isMessageAvailable", "(Ljava/lang/Object;)Z", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IMessageProcessor<Message> extends IMsgReceiver<Message> {
    boolean isMessageAvailable(Message message);
}
