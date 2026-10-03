package com.heytap.health.oobe.setups.pair;

import com.heytap.health.protocol.dm.DMProto$BindKey;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class GetSecretBindKey$intercept$3 extends FunctionReferenceImpl implements Function1<byte[], DMProto$BindKey> {
    public static final GetSecretBindKey$intercept$3 INSTANCE = new GetSecretBindKey$intercept$3();

    public GetSecretBindKey$intercept$3() {
        super(1, DMProto$BindKey.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$BindKey;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$BindKey invoke(byte[] bArr) {
        return DMProto$BindKey.parseFrom(bArr);
    }
}
