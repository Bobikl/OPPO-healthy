package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class ixj implements ft4<InputStream> {
    public final Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kxj f12686j;
    public InputStream k;

    public static class a implements jxj {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.oplus.aiunit.vision.jxj
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements jxj {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.oplus.aiunit.vision.jxj
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public ixj(Uri uri, kxj kxjVar) {
        this.i = uri;
        this.f12686j = kxjVar;
    }

    public static ixj d(Context context, Uri uri, jxj jxjVar) {
        return new ixj(uri, new kxj(com.bumptech.glide.a.d(context).k().g(), jxjVar, com.bumptech.glide.a.d(context).f(), context.getContentResolver()));
    }

    public static ixj e(Context context, Uri uri) {
        return d(context, uri, new a(context.getContentResolver()));
    }

    public static ixj g(Context context, Uri uri) {
        return d(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void b() {
        InputStream inputStream = this.k;
        if (inputStream != null) {
            try {
                inputStream.close();
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

    @Override // com.oplus.aiunit.vision.ft4
    public void f(@NonNull Priority priority, @NonNull ft4.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.k = inputStreamH;
            aVar.d(inputStreamH);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.e(e2);
        }
    }

    public final InputStream h() throws Throwable {
        InputStream inputStreamD = this.f12686j.d(this.i);
        int iA = inputStreamD != null ? this.f12686j.a(this.i) : -1;
        return iA != -1 ? new bx6(inputStreamD, iA) : inputStreamD;
    }
}
