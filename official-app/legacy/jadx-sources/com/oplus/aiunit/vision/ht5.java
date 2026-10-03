package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class ht5<DataT> implements n2c<Integer, DataT> {
    public final Context a;
    public final e<DataT> b;

    public static final class a implements o2c<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Integer, AssetFileDescriptor> d(@NonNull p7c p7cVar) {
            return new ht5(this.a, this);
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor b(@Nullable Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class b implements o2c<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Integer, Drawable> d(@NonNull p7c p7cVar) {
            return new ht5(this.a, this);
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(Drawable drawable) throws IOException {
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable b(@Nullable Resources.Theme theme, Resources resources, int i) {
            return x46.a(this.a, i, theme);
        }
    }

    public static final class c implements o2c<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Integer, InputStream> d(@NonNull p7c p7cVar) {
            return new ht5(this.a, this);
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void close(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // com.oplus.aiunit.vision.ht5.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream b(@Nullable Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }
    }

    public static final class d<DataT> implements ft4<DataT> {

        @Nullable
        public final Resources.Theme i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Resources f12259j;
        public final e<DataT> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f12260l;

        @Nullable
        public DataT m;

        public d(@Nullable Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.i = theme;
            this.f12259j = resources;
            this.k = eVar;
            this.f12260l = i;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<DataT> a() {
            return this.k.a();
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
            DataT datat = this.m;
            if (datat != null) {
                try {
                    this.k.close(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [DataT, java.lang.Object] */
        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super DataT> aVar) {
            try {
                DataT datatB = this.k.b(this.i, this.f12259j, this.f12260l);
                this.m = datatB;
                aVar.d(datatB);
            } catch (Resources.NotFoundException e2) {
                aVar.e(e2);
            }
        }
    }

    public interface e<DataT> {
        Class<DataT> a();

        DataT b(@Nullable Resources.Theme theme, Resources resources, int i);

        void close(DataT datat) throws IOException;
    }

    public ht5(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    public static o2c<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static o2c<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static o2c<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n2c.a<DataT> a(@NonNull Integer num, int i, int i2, @NonNull erd erdVar) {
        Resources.Theme theme = (Resources.Theme) erdVar.a(dtf.THEME);
        return new n2c.a<>(new ebd(num), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num.intValue()));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Integer num) {
        return true;
    }
}
