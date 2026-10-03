package com.heytap.health.device.second;

import com.heytap.health.protocol.dm.DMProto$ResetResult;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SecondSettingActivity$Setup1Fragment$Content$1$2$1$1$1$1$1$unbindResult$1 extends FunctionReferenceImpl implements Function1<byte[], DMProto$ResetResult> {
    public static final SecondSettingActivity$Setup1Fragment$Content$1$2$1$1$1$1$1$unbindResult$1 INSTANCE = new SecondSettingActivity$Setup1Fragment$Content$1$2$1$1$1$1$1$unbindResult$1();

    public SecondSettingActivity$Setup1Fragment$Content$1$2$1$1$1$1$1$unbindResult$1() {
        super(1, DMProto$ResetResult.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$ResetResult;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$ResetResult invoke(byte[] bArr) {
        return DMProto$ResetResult.parseFrom(bArr);
    }
}
