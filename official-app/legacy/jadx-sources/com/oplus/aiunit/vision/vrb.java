package com.oplus.aiunit.vision;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes13.dex */
public final class vrb implements n2c<Uri, File> {
    public final Context a;

    public static final class a implements o2c<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, File> d(p7c p7cVar) {
            return new vrb(this.a);
        }
    }

    public static class b implements ft4<File> {
        public static final String[] k = {"_data"};
        public final Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Uri f17964j;

        public b(Context context, Uri uri) {
            this.i = context;
            this.f17964j = uri;
        }

        @Override // com.oplus.aiunit.vision.ft4
        @NonNull
        public Class<File> a() {
            return File.class;
        }

        @Override // com.oplus.aiunit.vision.ft4
        public void b() {
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
        public void f(@NonNull Priority priority, @NonNull ft4.a<? super File> aVar) {
            Cursor cursorQuery = this.i.getContentResolver().query(this.f17964j, k, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.d(new File(string));
                return;
            }
            aVar.e(new FileNotFoundException("Failed to find file path for: " + this.f17964j));
        }
    }

    public vrb(Context context) {
        this.a = context;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<File> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(uri), new b(this.a, uri));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return xrb.c(uri);
    }
}
