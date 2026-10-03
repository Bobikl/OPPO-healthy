package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(29)
public final class n4f<DataT> implements n2c<Uri, DataT> {
    public final Context a;
    public final n2c<File, DataT> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2c<Uri, DataT> f14331c;
    public final Class<DataT> d;

    public static abstract class a<DataT> implements o2c<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public final void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public final n2c<Uri, DataT> d(@NonNull p7c p7cVar) {
            return new n4f(this.a, p7cVar.d(File.class, this.b), p7cVar.d(Uri.class, this.b), this.b);
        }
    }

    @RequiresApi(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class d<DataT> implements ft4<DataT> {
        public static final String[] s = {"_data"};
        public final Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final n2c<File, DataT> f14332j;
        public final n2c<Uri, DataT> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Uri f14333l;
        public final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f14334n;
        public final erd o;
        public final Class<DataT> p;
        public volatile boolean q;

        @Nullable
        public volatile ft4<DataT> r;

        public d(Context context, n2c<File, DataT> n2cVar, n2c<Uri, DataT> n2cVar2, Uri uri, int i, int i2, erd erdVar, Class<DataT> cls) {
            this.i = context.getApplicationContext();
            this.f14332j = n2cVar;
            this.k = n2cVar2;
            this.f14333l = uri;
            this.m = i;
            this.f14334n = i2;
            this.o = erdVar;
            this.p = cls;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<DataT> a() {
            return this.p;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
            ft4<DataT> ft4Var = this.r;
            if (ft4Var != null) {
                ft4Var.b();
            }
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public DataSource c() {
            return DataSource.LOCAL;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void cancel() {
            this.q = true;
            ft4<DataT> ft4Var = this.r;
            if (ft4Var != null) {
                ft4Var.cancel();
            }
        }

        @Nullable
        public final n2c.a<DataT> d() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f14332j.a(h(this.f14333l), this.m, this.f14334n, this.o);
            }
            if (xrb.a(this.f14333l)) {
                return this.k.a(this.f14333l, this.m, this.f14334n, this.o);
            }
            return this.k.a(g() ? MediaStore.setRequireOriginal(this.f14333l) : this.f14333l, this.m, this.f14334n, this.o);
        }

        @Nullable
        public final ft4<DataT> e() throws FileNotFoundException {
            n2c.a<DataT> aVarD = d();
            if (aVarD != null) {
                return aVarD.f14315c;
            }
            return null;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super DataT> aVar) {
            try {
                ft4<DataT> ft4VarE = e();
                if (ft4VarE == null) {
                    aVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.f14333l));
                    return;
                }
                this.r = ft4VarE;
                if (this.q) {
                    cancel();
                } else {
                    ft4VarE.f(priority, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.e(e2);
            }
        }

        public final boolean g() {
            return this.i.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @NonNull
        public final File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.i.getContentResolver().query(uri, s, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public n4f(Context context, n2c<File, DataT> n2cVar, n2c<Uri, DataT> n2cVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = n2cVar;
        this.f14331c = n2cVar2;
        this.d = cls;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<DataT> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(uri), new d(this.a, this.b, this.f14331c, uri, i, i2, erdVar, this.d));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return xrb.c(uri);
    }
}
