package com.heytap.health.devicemanager.storage;

import com.heytap.wearable.oaf.proto.LocalStrore$AccountInfos;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class StorageManager$mSsoidToAccountName$2 extends FunctionReferenceImpl implements Function1<byte[], LocalStrore$AccountInfos> {
    public static final StorageManager$mSsoidToAccountName$2 INSTANCE = new StorageManager$mSsoidToAccountName$2();

    public StorageManager$mSsoidToAccountName$2() {
        super(1, LocalStrore$AccountInfos.class, "parseFrom", "parseFrom([B)Lcom/heytap/wearable/oaf/proto/LocalStrore$AccountInfos;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final LocalStrore$AccountInfos invoke(byte[] bArr) {
        return LocalStrore$AccountInfos.parseFrom(bArr);
    }
}
