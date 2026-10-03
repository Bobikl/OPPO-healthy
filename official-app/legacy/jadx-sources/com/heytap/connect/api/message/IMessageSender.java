package com.heytap.connect.api.message;

import com.oplus.aiunit.vision.q5c;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/connect/api/message/IMessageSender;", "", "", "messageId", "", "singleQueue", "Lkotlin/Function0;", "Lcom/oplus/aiunit/vision/q5c;", "message", "sendMessage", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Ljava/lang/String;", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IMessageSender {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ String sendMessage$default(IMessageSender iMessageSender, String str, boolean z, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return iMessageSender.sendMessage(str, z, function0);
        }
    }

    @NotNull
    String sendMessage(@NotNull String messageId, boolean singleQueue, @NotNull Function0<? extends q5c> message);
}
