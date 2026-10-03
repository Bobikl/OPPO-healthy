package com.oplus.pantaconnect.sdk.connectionservice.connection;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ReconnectType;", "", "(Ljava/lang/String;I)V", "DIALOG_ALL", "DIALOG_RECENT", "SILENT_ALL", "SILENT_RECENT", "DIALOG_CUSTOM", "SILENT_CUSTOM", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ReconnectType {
    DIALOG_ALL,
    DIALOG_RECENT,
    SILENT_ALL,
    SILENT_RECENT,
    DIALOG_CUSTOM,
    SILENT_CUSTOM;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<ReconnectType> getEntries() {
        return $ENTRIES;
    }
}
