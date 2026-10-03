package com.heytap.health.oobe.repo;

import com.heytap.health.protocol.dm.DMProto$ResetResult;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class OOBEDevice$sendReset$2 extends FunctionReferenceImpl implements Function1<byte[], DMProto$ResetResult> {
    public static final OOBEDevice$sendReset$2 INSTANCE = new OOBEDevice$sendReset$2();

    public OOBEDevice$sendReset$2() {
        super(1, DMProto$ResetResult.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$ResetResult;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$ResetResult invoke(byte[] bArr) {
        return DMProto$ResetResult.parseFrom(bArr);
    }
}
