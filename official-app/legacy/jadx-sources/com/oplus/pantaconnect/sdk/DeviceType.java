package com.oplus.pantaconnect.sdk;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantaconnect/sdk/DeviceType;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "ALL", "SMART_WATCH", "TWS_HEADPHONES", "NECK_MOUNTED_HEADPHONES", "TV", "PC", "BRACELET", "PHONE", "PAD", "MACBOOK", "IMAC", "IPHONE", "APPLE_WATCH", "UNSPECIFIED", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum DeviceType {
    ALL(0),
    SMART_WATCH(1),
    TWS_HEADPHONES(3),
    NECK_MOUNTED_HEADPHONES(4),
    TV(5),
    PC(6),
    BRACELET(7),
    PHONE(8),
    PAD(10),
    MACBOOK(11),
    IMAC(12),
    IPHONE(13),
    APPLE_WATCH(14),
    UNSPECIFIED(-82);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int type;

    DeviceType(int i) {
        this.type = i;
    }

    @NotNull
    public static EnumEntries<DeviceType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
