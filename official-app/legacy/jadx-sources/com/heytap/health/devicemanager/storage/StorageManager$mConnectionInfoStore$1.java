package com.heytap.health.devicemanager.storage;

import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class StorageManager$mConnectionInfoStore$1 extends FunctionReferenceImpl implements Function1<DMProto$ConnectDeviceInfo, byte[]> {
    public static final StorageManager$mConnectionInfoStore$1 INSTANCE = new StorageManager$mConnectionInfoStore$1();

    public StorageManager$mConnectionInfoStore$1() {
        super(1, DMProto$ConnectDeviceInfo.class, "toByteArray", "toByteArray()[B", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final byte[] invoke(@NotNull DMProto$ConnectDeviceInfo p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.toByteArray();
    }
}
