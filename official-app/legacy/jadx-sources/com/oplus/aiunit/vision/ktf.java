package com.oplus.aiunit.vision;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class ktf<Data> implements n2c<Integer, Data> {
    public final n2c<Uri, Data> a;
    public final Resources b;

    public static final class a implements o2c<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        public n2c<Integer, AssetFileDescriptor> d(p7c p7cVar) {
            return new ktf(this.a, p7cVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o2c<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Integer, InputStream> d(p7c p7cVar) {
            return new ktf(this.a, p7cVar.d(Uri.class, InputStream.class));
        }
    }

    public static class c implements o2c<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Integer, Uri> d(p7c p7cVar) {
            return new ktf(this.a, rik.c());
        }
    }

    public ktf(Resources resources, n2c<Uri, Data> n2cVar) {
        this.b = resources;
        this.a = n2cVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull Integer num, int i, int i2, @NonNull erd erdVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.a.a(uriD, i, i2, erdVar);
    }

    @Nullable
    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + mla.SEPARATOR + this.b.getResourceTypeName(num.intValue()) + mla.SEPARATOR + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Integer num) {
        return true;
    }
}
