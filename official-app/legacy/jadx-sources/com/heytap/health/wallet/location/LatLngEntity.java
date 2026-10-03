package com.heytap.health.wallet.location;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class LatLngEntity implements Serializable {
    private static final long serialVersionUID = 4457304422655943281L;
    public final double latitude;
    public final double longitude;

    public LatLngEntity(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    @NonNull
    public String toString() {
        return ((new String("latitude: ") + this.latitude) + ", longitude: ") + this.longitude;
    }
}
