package com.heytap.health.devicepair.manager.task;

import com.heytap.health.protocol.dm.DMProto$BindKey;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class TaskBindKey$getSignByDevice$signRsp$1$1 extends FunctionReferenceImpl implements Function1<byte[], DMProto$BindKey> {
    public static final TaskBindKey$getSignByDevice$signRsp$1$1 INSTANCE = new TaskBindKey$getSignByDevice$signRsp$1$1();

    public TaskBindKey$getSignByDevice$signRsp$1$1() {
        super(1, DMProto$BindKey.class, "parseFrom", "parseFrom([B)Lcom/heytap/health/protocol/dm/DMProto$BindKey;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final DMProto$BindKey invoke(byte[] bArr) {
        return DMProto$BindKey.parseFrom(bArr);
    }
}
