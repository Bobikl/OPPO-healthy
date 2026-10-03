package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.oplus.ocs.authenticate.data.AuthenticationDb;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gpm implements Runnable {
    public final String i = gpm.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f11847j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11848l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11849n;
    public byte[] o;
    public nlm p;

    public gpm(Context context, String str, int i, String str2, long j2, byte[] bArr, nlm nlmVar) {
        this.f11847j = context;
        this.k = str;
        this.f11848l = i;
        this.m = str2;
        this.f11849n = j2;
        this.o = bArr;
        this.p = nlmVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        long j2;
        com.oplus.ocs.authenticate.info.c cVarA;
        Log.d(this.i, "internet check");
        Context context = this.f11847j;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z2 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0);
            if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
                z = true;
            } else {
                NetworkInfo networkInfo2 = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
                if (networkInfo2 != null && networkInfo2.isAvailable() && networkInfo2.isConnected()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (!z || (cVarA = shm.a(this.k)) == null) {
            j2 = 0;
        } else {
            int i = cVarA.a;
            if (i == 0) {
                List<com.oplus.ocs.authenticate.info.a> list = cVarA.f19985c;
                if (list != null && list.size() > 0) {
                    z2 = cVarA.f19985c.get(0).a;
                    j2 = cVarA.f19985c.get(0).b;
                }
            } else {
                Log.d(this.i, String.format("network get error code is %d, error message is %s", Integer.valueOf(i), cVarA.b));
            }
            j2 = 0;
        }
        nlm nlmVar = new nlm(this.k, z2, this.f11848l, this.m, this.f11849n, this.o, System.currentTimeMillis(), j2, 0);
        if (this.p != null) {
            Log.d(this.i, "entity not empty");
            nlmVar.a = this.p.a;
        }
        AuthenticationDb.e(this.f11847j).d().a(nlmVar);
    }
}
