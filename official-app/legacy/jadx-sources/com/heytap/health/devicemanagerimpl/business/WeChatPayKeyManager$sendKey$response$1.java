package com.heytap.health.devicemanagerimpl.business;

import com.heytap.health.protocol.dm.DMProto$WeChatPaymentKeyResponse;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class WeChatPayKeyManager$sendKey$response$1 extends FunctionReferenceImpl implements Function1<byte[], DMProto$WeChatPaymentKeyResponse> {
    public static final WeChatPayKeyManager$sendKey$response$1 INSTANCE = new WeChatPayKeyManager$sendKey$response$1();

    public WeChatPayKeyManager$sendKey$response$1() {
        super(1, DMProto$WeChatPaymentKeyResponse.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$WeChatPaymentKeyResponse;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$WeChatPaymentKeyResponse invoke(byte[] bArr) {
        return DMProto$WeChatPaymentKeyResponse.parseFrom(bArr);
    }
}
