package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class cu5 implements st5 {
    public final File b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10240c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wt5 f10241e;
    public final vt5 d = new vt5();
    public final jcg a = new jcg();

    @Deprecated
    public cu5(File file, long j2) {
        this.b = file;
        this.f10240c = j2;
    }

    public static st5 c(File file, long j2) {
        return new cu5(file, j2);
    }

    @Override // com.oplus.aiunit.vision.st5
    public File a(ona onaVar) {
        String strB = this.a.b(onaVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + onaVar);
        }
        try {
            wt5.e eVarZ = d().z(strB);
            if (eVarZ != null) {
                return eVarZ.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.st5
    public void b(ona onaVar, st5.b bVar) {
        String strB = this.a.b(onaVar);
        this.d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + onaVar);
            }
            try {
                wt5 wt5VarD = d();
                if (wt5VarD.z(strB) != null) {
                    this.d.b(strB);
                    return;
                }
                wt5.c cVarW = wt5VarD.w(strB);
                if (cVarW == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                }
                try {
                    if (bVar.a(cVarW.f(0))) {
                        cVarW.e();
                    }
                    cVarW.b();
                    this.d.b(strB);
                } catch (Throwable th) {
                    cVarW.b();
                    throw th;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } catch (Throwable th2) {
            this.d.b(strB);
            throw th2;
        }
    }

    @Override // com.oplus.aiunit.vision.st5
    public synchronized void clear() {
        try {
            try {
                d().u();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e2);
                }
            }
            e();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public final synchronized wt5 d() throws IOException {
        if (this.f10241e == null) {
            this.f10241e = wt5.B(this.b, 1, 1, this.f10240c);
        }
        return this.f10241e;
    }

    public final synchronized void e() {
        this.f10241e = null;
    }
}
