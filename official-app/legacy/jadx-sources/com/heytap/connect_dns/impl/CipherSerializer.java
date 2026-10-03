package com.heytap.connect_dns.impl;

import com.heytap.connect.api.message.MessageSerializer;
import com.heytap.connect.cipher.McsCipher;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/heytap/connect_dns/impl/CipherSerializer;", "Lcom/heytap/connect/api/message/MessageSerializer;", "", "body", "", "encode", "(Ljava/lang/Object;)[B", "decode", "([B)Ljava/lang/Object;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class CipherSerializer implements MessageSerializer {
    @Override // com.heytap.connect.api.message.IMessageSerializer
    @NotNull
    public Object decode(@NotNull byte[] body) {
        Intrinsics.checkNotNullParameter(body, "body");
        byte[] bArrDecrypt = McsCipher.decrypt(body);
        Intrinsics.checkNotNullExpressionValue(bArrDecrypt, "decrypt(body)");
        return bArrDecrypt;
    }

    @Override // com.heytap.connect.api.message.IMessageSerializer
    @NotNull
    public byte[] encode(@NotNull Object body) {
        Intrinsics.checkNotNullParameter(body, "body");
        String string = body.toString();
        Charset charset = Charsets.UTF_8;
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] bArrEncrypt = McsCipher.encrypt(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrEncrypt, "encrypt(body.toString().toByteArray())");
        return bArrEncrypt;
    }
}
