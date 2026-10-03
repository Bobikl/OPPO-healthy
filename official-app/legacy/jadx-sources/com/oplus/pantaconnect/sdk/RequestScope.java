package com.oplus.pantaconnect.sdk;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/pantaconnect/sdk/RequestScope;", "", "scopeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getScopeName", "()Ljava/lang/String;", "CONNECTION", "DISCOVERY", "UI", "TRANSPORT", "DEVICE_MANAGER", "DATA_BUS", "NETWORK_MANAGER", "MATTER", "SHARE", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum RequestScope {
    CONNECTION("Connection"),
    DISCOVERY("Discovery"),
    UI("Ui"),
    TRANSPORT("Transport"),
    DEVICE_MANAGER("DeviceManager"),
    DATA_BUS("DataBus"),
    NETWORK_MANAGER("NetworkMgr"),
    MATTER("Matter"),
    SHARE("Share");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String scopeName;

    RequestScope(String str) {
        this.scopeName = str;
    }

    @NotNull
    public static EnumEntries<RequestScope> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getScopeName() {
        return this.scopeName;
    }
}
