package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes19.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class l45 implements ji6 {
    @Override // com.oplus.aiunit.vision.ji6
    @NonNull
    public ei6 a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new k45(httpURLConnection);
    }
}
