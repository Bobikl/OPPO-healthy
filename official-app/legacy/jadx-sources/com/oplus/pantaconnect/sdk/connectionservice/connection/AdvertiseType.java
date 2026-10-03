package com.oplus.pantaconnect.sdk.connectionservice.connection;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/AdvertiseType;", "", "(Ljava/lang/String;I)V", "DISCOVERY_MODEL_ID", "FAST_PAIR_MODEL_ID", "FAST_PAIR_ACCOUNT", "FAST_PAIR_DEVICE_ID", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum AdvertiseType {
    DISCOVERY_MODEL_ID,
    FAST_PAIR_MODEL_ID,
    FAST_PAIR_ACCOUNT,
    FAST_PAIR_DEVICE_ID;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<AdvertiseType> getEntries() {
        return $ENTRIES;
    }
}
