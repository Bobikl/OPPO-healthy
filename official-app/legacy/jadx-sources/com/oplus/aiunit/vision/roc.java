package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.network.FileExtension;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class roc {

    @Nullable
    public final ioc a;

    @NonNull
    public final bbb b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FileExtension.values().length];
            a = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public roc(@Nullable ioc iocVar, @NonNull bbb bbbVar) {
        this.a = iocVar;
        this.b = bbbVar;
    }

    @Nullable
    @WorkerThread
    public final k9b a(Context context, @NonNull String str, @Nullable String str2) {
        ioc iocVar;
        Pair<FileExtension, InputStream> pairA;
        ebb<k9b> ebbVarG;
        if (str2 == null || (iocVar = this.a) == null || (pairA = iocVar.a(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i = a.a[fileExtension.ordinal()];
        if (i == 1) {
            ebbVarG = w9b.G(context, new ZipInputStream(inputStream), str2);
        } else if (i != 2) {
            ebbVarG = w9b.r(inputStream, str2);
        } else {
            try {
                ebbVarG = w9b.r(new GZIPInputStream(inputStream), str2);
            } catch (IOException e2) {
                ebbVarG = new ebb<>(e2);
            }
        }
        if (ebbVarG.b() != null) {
            return ebbVarG.b();
        }
        return null;
    }

    @NonNull
    @WorkerThread
    public final ebb<k9b> b(Context context, @NonNull String str, @Nullable String str2) {
        o7b.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                vab vabVarA = this.b.a(str);
                if (!vabVarA.b()) {
                    ebb<k9b> ebbVar = new ebb<>(new IllegalArgumentException(vabVarA.c()));
                    try {
                        vabVarA.close();
                    } catch (IOException e2) {
                        o7b.d("LottieFetchResult close failed ", e2);
                    }
                    return ebbVar;
                }
                ebb<k9b> ebbVarE = e(context, str, vabVarA.e(), vabVarA.d(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                sb.append(ebbVarE.b() != null);
                o7b.a(sb.toString());
                try {
                    vabVarA.close();
                } catch (IOException e3) {
                    o7b.d("LottieFetchResult close failed ", e3);
                }
                return ebbVarE;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e4) {
                        o7b.d("LottieFetchResult close failed ", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            ebb<k9b> ebbVar2 = new ebb<>(e5);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e6) {
                    o7b.d("LottieFetchResult close failed ", e6);
                }
            }
            return ebbVar2;
        }
    }

    @NonNull
    @WorkerThread
    public ebb<k9b> c(Context context, @NonNull String str, @Nullable String str2) {
        k9b k9bVarA = a(context, str, str2);
        if (k9bVarA != null) {
            return new ebb<>(k9bVarA);
        }
        o7b.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    @NonNull
    public final ebb<k9b> d(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        ioc iocVar;
        return (str2 == null || (iocVar = this.a) == null) ? w9b.r(new GZIPInputStream(inputStream), null) : w9b.r(new GZIPInputStream(new FileInputStream(iocVar.g(str, inputStream, FileExtension.GZIP))), str);
    }

    @NonNull
    public final ebb<k9b> e(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        ebb<k9b> ebbVarG;
        FileExtension fileExtension;
        ioc iocVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            o7b.a("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            ebbVarG = g(context, str, inputStream, str3);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            o7b.a("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            ebbVarG = d(str, inputStream, str3);
        } else {
            o7b.a("Received json response.");
            fileExtension = FileExtension.JSON;
            ebbVarG = f(str, inputStream, str3);
        }
        if (str3 != null && ebbVarG.b() != null && (iocVar = this.a) != null) {
            iocVar.f(str, fileExtension);
        }
        return ebbVarG;
    }

    @NonNull
    public final ebb<k9b> f(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        ioc iocVar;
        return (str2 == null || (iocVar = this.a) == null) ? w9b.r(inputStream, null) : w9b.r(new FileInputStream(iocVar.g(str, inputStream, FileExtension.JSON).getAbsolutePath()), str);
    }

    @NonNull
    public final ebb<k9b> g(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        ioc iocVar;
        return (str2 == null || (iocVar = this.a) == null) ? w9b.G(context, new ZipInputStream(inputStream), null) : w9b.G(context, new ZipInputStream(new FileInputStream(iocVar.g(str, inputStream, FileExtension.ZIP))), str);
    }
}
