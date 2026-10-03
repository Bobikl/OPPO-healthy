package com.oplus.pantaconnect.sdk.discovery;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/DiscoverableDeviceLevel;", "", "(Ljava/lang/String;I)V", "SAME_ACCOUNT", "ALL", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum DiscoverableDeviceLevel {
    SAME_ACCOUNT,
    ALL;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<DiscoverableDeviceLevel> getEntries() {
        return $ENTRIES;
    }
}
