package com.heytap.health.devicepair.manager.task;

import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class TaskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1 extends FunctionReferenceImpl implements Function1<byte[], DMProto$ConnectDeviceInfo> {
    public static final TaskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1 INSTANCE = new TaskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1();

    public TaskGetDeviceInfo$getDeviceInfoByDevice$deviceInfoRsp$1$1() {
        super(1, DMProto$ConnectDeviceInfo.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$ConnectDeviceInfo invoke(byte[] bArr) {
        return DMProto$ConnectDeviceInfo.parseFrom(bArr);
    }
}
