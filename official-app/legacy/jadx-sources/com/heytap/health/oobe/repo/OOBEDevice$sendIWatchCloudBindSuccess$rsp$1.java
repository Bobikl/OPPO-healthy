package com.heytap.health.oobe.repo;

import com.heytap.health.protocol.iwatch.IWatch$IWatchResetResult;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class OOBEDevice$sendIWatchCloudBindSuccess$rsp$1 extends FunctionReferenceImpl implements Function1<byte[], IWatch$IWatchResetResult> {
    public static final OOBEDevice$sendIWatchCloudBindSuccess$rsp$1 INSTANCE = new OOBEDevice$sendIWatchCloudBindSuccess$rsp$1();

    public OOBEDevice$sendIWatchCloudBindSuccess$rsp$1() {
        super(1, IWatch$IWatchResetResult.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/iwatch/IWatch$IWatchResetResult;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final IWatch$IWatchResetResult invoke(byte[] bArr) {
        return IWatch$IWatchResetResult.parseFrom(bArr);
    }
}
