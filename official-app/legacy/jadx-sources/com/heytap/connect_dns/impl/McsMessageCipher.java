package com.heytap.connect_dns.impl;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.connect.api.message.MessageCipher;
import com.heytap.connect.cipher.McsCipher;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eRG\u0010\u0013\u001a,\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u00030\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/heytap/connect_dns/impl/McsMessageCipher;", "Lcom/heytap/connect/api/message/MessageCipher;", "Lkotlin/Triple;", "", "keys", "()Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "body", f04.JSON_KEY_RKE_IS_ENCRYPT, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "decrypt", "([B)[B", "signature", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "mcsKeys$delegate", "Lkotlin/Lazy;", "getMcsKeys", "mcsKeys", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class McsMessageCipher implements MessageCipher {

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: mcsKeys$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mcsKeys;

    @NotNull
    private final String signature;

    public McsMessageCipher(@NotNull Context context, @NotNull String signature) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.context = context;
        this.signature = signature;
        this.mcsKeys = LazyKt__LazyJVMKt.lazy(new Function0<Triple<? extends String, ? extends String, ? extends String>>() { // from class: com.heytap.connect_dns.impl.McsMessageCipher$mcsKeys$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Triple<? extends String, ? extends String, ? extends String> invoke() {
                return new Triple<>(McsCipher.getAESKey(this.this$0.context, this.this$0.signature), McsCipher.getApiKey(), McsCipher.getApiSecret());
            }
        });
    }

    private final Triple<String, String, String> getMcsKeys() {
        return (Triple) this.mcsKeys.getValue();
    }

    @Override // com.heytap.connect.api.message.MessageCipher
    @NotNull
    public byte[] decrypt(@NotNull byte[] body) {
        Intrinsics.checkNotNullParameter(body, "body");
        byte[] bArrDecrypt = McsCipher.decrypt(body);
        Intrinsics.checkNotNullExpressionValue(bArrDecrypt, "decrypt(body)");
        return bArrDecrypt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.connect.api.message.MessageCipher
    public <T> T encrypt(T body) {
        if (body instanceof String) {
            return (T) McsCipher.encrypt((String) body);
        }
        if (body != 0) {
            return (T) McsCipher.encrypt((byte[]) body);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
    }

    @Override // com.heytap.connect.api.message.MessageCipher
    @NotNull
    public Triple<String, String, String> keys() {
        return getMcsKeys();
    }

    public /* synthetic */ McsMessageCipher(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? "" : str);
    }
}
