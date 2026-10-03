package com.heytap.health.devicepair.manager.task.iwatch;

import com.heytap.health.protocol.iwatch.IWatch$IWatchBindKeyResponse;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class TaskIWatchBindKey$getSignByDevice$2$bindKey$1 extends FunctionReferenceImpl implements Function1<byte[], IWatch$IWatchBindKeyResponse> {
    public static final TaskIWatchBindKey$getSignByDevice$2$bindKey$1 INSTANCE = new TaskIWatchBindKey$getSignByDevice$2$bindKey$1();

    public TaskIWatchBindKey$getSignByDevice$2$bindKey$1() {
        super(1, IWatch$IWatchBindKeyResponse.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/iwatch/IWatch$IWatchBindKeyResponse;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final IWatch$IWatchBindKeyResponse invoke(byte[] bArr) {
        return IWatch$IWatchBindKeyResponse.parseFrom(bArr);
    }
}
