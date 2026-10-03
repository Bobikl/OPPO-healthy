package com.oplus.pantaconnect.sdk.discovery;

import com.heytap.accessory.utils.XmlReader;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/oplus/pantaconnect/sdk/discovery/DiscoveryStrategy;", "", "(Ljava/lang/String;I)V", XmlReader.TRANSPORT_BLE, "NSD", "BASED_CONNECT", "RTC", "AUTO", "LAN", "NFC", "USB", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum DiscoveryStrategy {
    BLE,
    NSD,
    BASED_CONNECT,
    RTC,
    AUTO,
    LAN,
    NFC,
    USB;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<DiscoveryStrategy> getEntries() {
        return $ENTRIES;
    }
}
