package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@KeepForSdk
public class URLWrapper {
    private final URL zza;

    @KeepForSdk
    public URLWrapper(@NonNull String str) throws MalformedURLException {
        this.zza = new URL(str);
    }

    @NonNull
    @KeepForSdk
    public URLConnection openConnection() throws IOException {
        return this.zza.openConnection();
    }
}
