package com.nearme.instant.xcard.provider;

import android.location.Location;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class HostLocationAsyncProvider {

    public interface LocationCallback {
        void onGetLocation(Location location);
    }

    public abstract void getLocation(LocationCallback locationCallback);
}
