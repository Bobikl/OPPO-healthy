package com.oplus.aiunit.vision;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ei0<T> implements ft4<T> {
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AssetManager f10940j;
    public T k;

    public ei0(AssetManager assetManager, String str) {
        this.f10940j = assetManager;
        this.i = str;
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void b() {
        T t = this.k;
        if (t == null) {
            return;
        }
        try {
            d(t);
        } catch (IOException unused) {
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

    public abstract T e(AssetManager assetManager, String str) throws IOException;

    @Override // com.oplus.aiunit.vision.ft4
    public void f(@NonNull Priority priority, @NonNull ft4.a<? super T> aVar) {
        try {
            T tE = e(this.f10940j, this.i);
            this.k = tE;
            aVar.d(tE);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.e(e2);
        }
    }
}
