package com.heytap.health.oobe.repo;

import com.op.proto.BindDeviceResponse;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class OOBEDevice$requestDeviceBindForBand$rsp$1 extends FunctionReferenceImpl implements Function1<byte[], BindDeviceResponse.bind_rsp_t> {
    public static final OOBEDevice$requestDeviceBindForBand$rsp$1 INSTANCE = new OOBEDevice$requestDeviceBindForBand$rsp$1();

    public OOBEDevice$requestDeviceBindForBand$rsp$1() {
        super(1, BindDeviceResponse.bind_rsp_t.class, "parseFrom", "parseFrom([B)Lcom/op/proto/BindDeviceResponse$bind_rsp_t;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final BindDeviceResponse.bind_rsp_t invoke(byte[] bArr) {
        return BindDeviceResponse.bind_rsp_t.parseFrom(bArr);
    }
}
