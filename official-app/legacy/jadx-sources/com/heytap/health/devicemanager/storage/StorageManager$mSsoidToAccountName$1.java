package com.heytap.health.devicemanager.storage;

import com.heytap.wearable.oaf.proto.LocalStrore$AccountInfos;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class StorageManager$mSsoidToAccountName$1 extends FunctionReferenceImpl implements Function1<LocalStrore$AccountInfos, byte[]> {
    public static final StorageManager$mSsoidToAccountName$1 INSTANCE = new StorageManager$mSsoidToAccountName$1();

    public StorageManager$mSsoidToAccountName$1() {
        super(1, LocalStrore$AccountInfos.class, "toByteArray", "toByteArray()[B", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final byte[] invoke(@NotNull LocalStrore$AccountInfos p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.toByteArray();
    }
}
