package com.heytap.connect.api.message;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.connect.TapConst;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/heytap/connect/api/message/MessageCipher;", "", "Lkotlin/Triple;", "", "keys", "()Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "body", f04.JSON_KEY_RKE_IS_ENCRYPT, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "decrypt", "([B)[B", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface MessageCipher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect/api/message/MessageCipher$Companion;", "", "Lcom/heytap/connect/api/message/MessageCipher;", "DEFAULT", "Lcom/heytap/connect/api/message/MessageCipher;", "getDEFAULT", "()Lcom/heytap/connect/api/message/MessageCipher;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final MessageCipher DEFAULT = new MessageCipher() { // from class: com.heytap.connect.api.message.MessageCipher$Companion$DEFAULT$1
            @Override // com.heytap.connect.api.message.MessageCipher
            @NotNull
            public byte[] decrypt(@NotNull byte[] body) {
                Intrinsics.checkNotNullParameter(body, "body");
                return body;
            }

            @Override // com.heytap.connect.api.message.MessageCipher
            public <T> T encrypt(T body) {
                return body;
            }

            @Override // com.heytap.connect.api.message.MessageCipher
            @NotNull
            public Triple<String, String, String> keys() {
                return new Triple<>("", TapConst.RELEASE_APP_KEY, TapConst.RELEASE_APP_SECRET);
            }
        };

        private Companion() {
        }

        @NotNull
        public final MessageCipher getDEFAULT() {
            return DEFAULT;
        }
    }

    @NotNull
    byte[] decrypt(@NotNull byte[] body);

    <T> T encrypt(T body);

    @NotNull
    Triple<String, String, String> keys();
}
