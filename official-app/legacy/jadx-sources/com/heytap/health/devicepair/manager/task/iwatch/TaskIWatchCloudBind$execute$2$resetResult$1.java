package com.heytap.health.devicepair.manager.task.iwatch;

import com.heytap.health.protocol.iwatch.IWatch$IWatchResetResult;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class TaskIWatchCloudBind$execute$2$resetResult$1 extends FunctionReferenceImpl implements Function1<byte[], IWatch$IWatchResetResult> {
    public static final TaskIWatchCloudBind$execute$2$resetResult$1 INSTANCE = new TaskIWatchCloudBind$execute$2$resetResult$1();

    public TaskIWatchCloudBind$execute$2$resetResult$1() {
        super(1, IWatch$IWatchResetResult.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/iwatch/IWatch$IWatchResetResult;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final IWatch$IWatchResetResult invoke(byte[] bArr) {
        return IWatch$IWatchResetResult.parseFrom(bArr);
    }
}
