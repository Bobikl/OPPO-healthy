package com.heytap.connect.api.message;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00032\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/connect/api/message/MessageSerializer;", "Lcom/heytap/connect/api/message/IMessageSerializer;", "", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface MessageSerializer extends IMessageSerializer<Object, Object> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect/api/message/MessageSerializer$Companion;", "", "Lcom/heytap/connect/api/message/MessageSerializer;", "DEFAULT", "Lcom/heytap/connect/api/message/MessageSerializer;", "getDEFAULT", "()Lcom/heytap/connect/api/message/MessageSerializer;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final MessageSerializer DEFAULT = new MessageSerializer() { // from class: com.heytap.connect.api.message.MessageSerializer$Companion$DEFAULT$1
            @Override // com.heytap.connect.api.message.IMessageSerializer
            @NotNull
            public Object decode(@NotNull byte[] body) {
                Intrinsics.checkNotNullParameter(body, "body");
                return body;
            }

            @Override // com.heytap.connect.api.message.IMessageSerializer
            @NotNull
            public byte[] encode(@NotNull Object body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if (body instanceof String) {
                    byte[] bytes = ((String) body).getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    return bytes;
                }
                if (body instanceof byte[]) {
                    return (byte[]) body;
                }
                String string = body.toString();
                Charset charset = Charsets.UTF_8;
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes2 = string.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                return bytes2;
            }
        };

        private Companion() {
        }

        @NotNull
        public final MessageSerializer getDEFAULT() {
            return DEFAULT;
        }
    }
}
