package com.heytap.health.oobe.setups.pair;

import com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponse;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class GetSecretBindKey$intercept$2 extends FunctionReferenceImpl implements Function1<byte[], IWatch$IWatchBindKeyResponse> {
    public static final GetSecretBindKey$intercept$2 INSTANCE = new GetSecretBindKey$intercept$2();

    public GetSecretBindKey$intercept$2() {
        super(1, IWatch$IWatchBindKeyResponse.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/iwatch/IWatch$IWatchBindKeyResponse;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final IWatch$IWatchBindKeyResponse invoke(byte[] bArr) {
        return IWatch$IWatchBindKeyResponse.parseFrom(bArr);
    }
}
