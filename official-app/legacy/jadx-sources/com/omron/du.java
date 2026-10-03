package com.omron;

import android.support.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public enum du {
    Unknown(ac.Unknown),
    Unsupported(ac.Unsupported),
    Unauthorized(ac.Unauthorized),
    PoweredOff(ac.PoweredOff),
    PoweredOn(ac.PoweredOn);


    @NonNull
    private ac a;

    du(@NonNull ac acVar) {
        this.a = acVar;
    }

    @NonNull
    public ac a() {
        return this.a;
    }

    @NonNull
    public static du a(@NonNull ac acVar) {
        for (du duVar : values()) {
            if (duVar.a() == acVar) {
                return duVar;
            }
        }
        return Unknown;
    }
}
