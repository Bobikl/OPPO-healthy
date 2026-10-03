package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class kxj {
    public static final hc7 f = new hc7();
    public final hc7 a;
    public final jxj b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ch0 f13447c;
    public final ContentResolver d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<ImageHeaderParser> f13448e;

    public kxj(List<ImageHeaderParser> list, jxj jxjVar, ch0 ch0Var, ContentResolver contentResolver) {
        this(list, f, jxjVar, ch0Var, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.d.openInputStream(uri);
            return com.bumptech.glide.load.a.b(this.f13448e, inputStreamOpenInputStream, this.f13447c);
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Nullable
    public final String b(@NonNull Uri uri) throws Throwable {
        Cursor cursorA;
        ?? r1 = 0;
        try {
            try {
                cursorA = this.b.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                r1 = this;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SecurityException e3) {
            e = e3;
            cursorA = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    public final boolean c(File file) {
        return this.a.a(file) && 0 < this.a.c(file);
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.d.openInputStream(uriFromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e2));
        }
    }

    public kxj(List<ImageHeaderParser> list, hc7 hc7Var, jxj jxjVar, ch0 ch0Var, ContentResolver contentResolver) {
        this.a = hc7Var;
        this.b = jxjVar;
        this.f13447c = ch0Var;
        this.d = contentResolver;
        this.f13448e = list;
    }
}
