package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class wrb implements n2c<Uri, InputStream> {
    public final Context a;

    public static class a implements o2c<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, InputStream> d(p7c p7cVar) {
            return new wrb(this.a);
        }
    }

    public wrb(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<InputStream> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        if (xrb.e(i, i2)) {
            return new n2c.a<>(new ebd(uri), ixj.e(this.a, uri));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return xrb.b(uri);
    }
}
