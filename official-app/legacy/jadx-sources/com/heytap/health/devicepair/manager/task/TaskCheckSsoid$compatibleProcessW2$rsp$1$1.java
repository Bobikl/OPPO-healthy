package com.heytap.health.devicepair.manager.task;

import com.op.proto.SyncOOBEState;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class TaskCheckSsoid$compatibleProcessW2$rsp$1$1 extends FunctionReferenceImpl implements Function1<byte[], SyncOOBEState.SyncState> {
    public static final TaskCheckSsoid$compatibleProcessW2$rsp$1$1 INSTANCE = new TaskCheckSsoid$compatibleProcessW2$rsp$1$1();

    public TaskCheckSsoid$compatibleProcessW2$rsp$1$1() {
        super(1, SyncOOBEState.SyncState.class, "parseFrom", "parseFrom([B)Lcom/op/proto/SyncOOBEState$SyncState;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final SyncOOBEState.SyncState invoke(byte[] bArr) {
        return SyncOOBEState.SyncState.parseFrom(bArr);
    }
}
