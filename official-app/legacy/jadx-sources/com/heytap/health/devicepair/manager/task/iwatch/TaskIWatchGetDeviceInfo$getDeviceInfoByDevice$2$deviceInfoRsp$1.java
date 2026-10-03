package com.heytap.health.devicepair.manager.task.iwatch;

import com.heytap.health.protocol.iwatch.IWatch$IWatchDeviceInfoResponse;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1 extends FunctionReferenceImpl implements Function1<byte[], IWatch$IWatchDeviceInfoResponse> {
    public static final TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1 INSTANCE = new TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1();

    public TaskIWatchGetDeviceInfo$getDeviceInfoByDevice$2$deviceInfoRsp$1() {
        super(1, IWatch$IWatchDeviceInfoResponse.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/iwatch/IWatch$IWatchDeviceInfoResponse;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final IWatch$IWatchDeviceInfoResponse invoke(byte[] bArr) {
        return IWatch$IWatchDeviceInfoResponse.parseFrom(bArr);
    }
}
