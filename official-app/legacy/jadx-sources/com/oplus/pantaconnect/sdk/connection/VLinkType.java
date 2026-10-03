package com.oplus.pantaconnect.sdk.connection;

import com.heytap.health.wallet.model.otherdevice.OtherDeviceCard;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/VLinkType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", LanConstants.OPERATOR_UNKNOWN, OtherDeviceCard.CLOUD, "P2P", "WLAN", "USB", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum VLinkType {
    UNKNOWN(0),
    CLOUD(1),
    P2P(2),
    WLAN(3),
    USB(4);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int type;

    VLinkType(int i) {
        this.type = i;
    }

    @NotNull
    public static EnumEntries<VLinkType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
