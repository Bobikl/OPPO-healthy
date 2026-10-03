package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.danikula.videocache.ProxyCacheException;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class yj9 extends a3f {
    public final zk9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final la7 f19040j;
    public bp2 k;

    public yj9(zk9 zk9Var, la7 la7Var) {
        super(zk9Var, la7Var);
        this.f19040j = la7Var;
        this.i = zk9Var;
    }

    @Override // com.oplus.aiunit.vision.a3f
    public void g(int i) {
        bp2 bp2Var = this.k;
        if (bp2Var != null) {
            bp2Var.a(this.f19040j.b, this.i.e(), i);
        }
    }

    public final String p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public final boolean q(v58 v58Var) throws ProxyCacheException {
        long length = this.i.length();
        return (((length > 0L ? 1 : (length == 0L ? 0 : -1)) > 0) && v58Var.f17718c && ((float) v58Var.b) > ((float) this.f19040j.available()) + (((float) length) * 0.2f)) ? false : true;
    }

    public final String r(v58 v58Var) throws IOException, ProxyCacheException {
        String strD = this.i.d();
        boolean z = !TextUtils.isEmpty(strD);
        long jAvailable = this.f19040j.isCompleted() ? this.f19040j.available() : this.i.length();
        boolean z2 = jAvailable >= 0;
        boolean z3 = v58Var.f17718c;
        long j2 = z3 ? jAvailable - v58Var.b : jAvailable;
        boolean z4 = z2 && z3;
        StringBuilder sb = new StringBuilder();
        sb.append(v58Var.f17718c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? p("Content-Length: %d\n", Long.valueOf(j2)) : "");
        sb.append(z4 ? p("Content-Range: bytes %d-%d/%d\n", Long.valueOf(v58Var.b), Long.valueOf(jAvailable - 1), Long.valueOf(jAvailable)) : "");
        sb.append(z ? p("Content-Type: %s\n", strD) : "");
        sb.append(Weather.SEPARATOR);
        return sb.toString();
    }

    public void s(v58 v58Var, Socket socket) throws IOException, ProxyCacheException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(r(v58Var).getBytes("UTF-8"));
        long j2 = v58Var.b;
        if (q(v58Var)) {
            u(bufferedOutputStream, j2);
        } else {
            v(bufferedOutputStream, j2);
        }
    }

    public void t(bp2 bp2Var) {
        this.k = bp2Var;
    }

    public final void u(OutputStream outputStream, long j2) throws IOException, ProxyCacheException {
        byte[] bArr = new byte[8192];
        while (true) {
            int iJ = j(bArr, j2, 8192);
            if (iJ == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, iJ);
                j2 += (long) iJ;
            }
        }
    }

    public final void v(OutputStream outputStream, long j2) throws IOException, ProxyCacheException {
        zk9 zk9Var = new zk9(this.i);
        try {
            zk9Var.a((int) j2);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = zk9Var.read(bArr);
                if (i == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } finally {
            zk9Var.close();
        }
    }
}
