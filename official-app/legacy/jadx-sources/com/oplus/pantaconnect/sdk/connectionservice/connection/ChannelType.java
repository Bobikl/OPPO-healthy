package com.oplus.pantaconnect.sdk.connectionservice.connection;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/connection/ChannelType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "CHANNEL_TYPE_LOGICAL", "CHANNEL_TYPE_PHYSICAL", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ChannelType {
    CHANNEL_TYPE_LOGICAL(0),
    CHANNEL_TYPE_PHYSICAL(1);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int type;

    ChannelType(int i) {
        this.type = i;
    }

    @NotNull
    public static EnumEntries<ChannelType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
