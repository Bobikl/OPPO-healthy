package com.omron;

import android.support.annotation.NonNull;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes5.dex */
public enum u {
    Broadcast(1),
    Read(1),
    WriteWithoutResponse(1),
    Write(8),
    Notify(16),
    Indicate(32),
    AuthenticatedSignedWrite(64),
    ExtendedProperties(128),
    NotifyEncryptionRequired(256),
    IndicateEncryptionRequired(512);

    private int a;

    u(int i) {
        this.a = i;
    }

    @NonNull
    public static EnumSet<u> b(int i) {
        EnumSet<u> enumSetNoneOf = EnumSet.noneOf(u.class);
        for (u uVar : values()) {
            if (uVar.a(i)) {
                enumSetNoneOf.add(uVar);
            }
        }
        return enumSetNoneOf;
    }

    public boolean a(int i) {
        int i2 = this.a;
        return i2 == (i & i2);
    }
}
