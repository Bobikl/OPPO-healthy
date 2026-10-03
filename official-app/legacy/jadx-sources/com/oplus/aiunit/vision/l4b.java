package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l4b<T> implements ft4<T> {
    public final Uri i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ContentResolver f13517j;
    public T k;

    public l4b(ContentResolver contentResolver, Uri uri) {
        this.f13517j = contentResolver;
        this.i = uri;
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void b() {
        T t = this.k;
        if (t != null) {
            try {
                d(t);
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

    public abstract void d(T t) throws IOException;

    public abstract T e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.oplus.aiunit.vision.ft4
    public final void f(@NonNull Priority priority, @NonNull ft4.a<? super T> aVar) {
        try {
            T tE = e(this.i, this.f13517j);
            this.k = tE;
            aVar.d(tE);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.e(e2);
        }
    }
}
