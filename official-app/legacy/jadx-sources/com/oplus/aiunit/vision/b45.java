package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes13.dex */
public class b45 implements xz3 {
    @Override // com.oplus.aiunit.vision.xz3
    @NonNull
    public wz3 a(@NonNull Context context, @NonNull wz3.a aVar) {
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new a45(context, aVar) : new ezc();
    }
}
