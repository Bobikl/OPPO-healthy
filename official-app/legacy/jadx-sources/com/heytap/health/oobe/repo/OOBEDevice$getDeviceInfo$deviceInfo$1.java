package com.heytap.health.oobe.repo;

import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class OOBEDevice$getDeviceInfo$deviceInfo$1 extends FunctionReferenceImpl implements Function1<byte[], DMProto$ConnectDeviceInfo> {
    public static final OOBEDevice$getDeviceInfo$deviceInfo$1 INSTANCE = new OOBEDevice$getDeviceInfo$deviceInfo$1();

    public OOBEDevice$getDeviceInfo$deviceInfo$1() {
        super(1, DMProto$ConnectDeviceInfo.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$ConnectDeviceInfo invoke(byte[] bArr) {
        return DMProto$ConnectDeviceInfo.parseFrom(bArr);
    }
}
