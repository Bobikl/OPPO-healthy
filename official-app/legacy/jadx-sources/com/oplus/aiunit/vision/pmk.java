package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes13.dex */
public class pmk implements n2c<URL, InputStream> {
    public final n2c<y68, InputStream> a;

    public static class a implements o2c<URL, InputStream> {
        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<URL, InputStream> d(p7c p7cVar) {
            return new pmk(p7cVar.d(y68.class, InputStream.class));
        }
    }

    public pmk(n2c<y68, InputStream> n2cVar) {
        this.a = n2cVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<InputStream> a(@NonNull URL url, int i, int i2, @NonNull erd erdVar) {
        return this.a.a(new y68(url), i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull URL url) {
        return true;
    }
}
