package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class abf {
    public final Set<String> a;
    public final zaf.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zaf.a f9281c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9282e;

    public class a implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f9283j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ zaf.c f9284l;

        public a(Context context, String str, String str2, zaf.c cVar) {
            this.i = context;
            this.f9283j = str;
            this.k = str2;
            this.f9284l = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                abf.this.g(this.i, this.f9283j, this.k);
                this.f9284l.success();
            } catch (MissingLibraryException e2) {
                this.f9284l.a(e2);
            } catch (UnsatisfiedLinkError e3) {
                this.f9284l.a(e3);
            }
        }
    }

    public class b implements FilenameFilter {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.a);
        }
    }

    public abf() {
        this(new pkj(), new e80());
    }

    public void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.b.e(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir(SAPropertyFilter.LIB, 0);
    }

    public File d(Context context, String str, String str2) {
        String strE = this.b.e(str);
        if (ltj.a(str2)) {
            return new File(c(context), strE);
        }
        return new File(c(context), strE + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, zaf.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (ltj.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (cVar == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, cVar)).start();
        }
    }

    public final void g(Context context, String str, String str2) throws Throwable {
        if (this.a.contains(str) && !this.d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.b.a(str);
            this.a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e2) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e2));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.d) {
                if (this.d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f9281c.a(context, this.b.c(), this.b.e(str), fileD, this);
            }
            try {
                if (this.f9282e) {
                    dj6 dj6Var = null;
                    try {
                        dj6 dj6Var2 = new dj6(fileD);
                        try {
                            List<String> listH = dj6Var2.h();
                            dj6Var2.close();
                            Iterator<String> it = listH.iterator();
                            while (it.hasNext()) {
                                e(context, this.b.b(it.next()));
                            }
                        } catch (Throwable th) {
                            th = th;
                            dj6Var = dj6Var2;
                            dj6Var.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (IOException unused) {
            }
            this.b.d(fileD.getAbsolutePath());
            this.a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    public void h(String str) {
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    public abf(zaf.b bVar, zaf.a aVar) {
        this.a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.b = bVar;
        this.f9281c = aVar;
    }
}
