package com.garmin.fit;

import com.oplus.aiunit.vision.a2f;
import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.fxb;
import com.oplus.aiunit.vision.gxb;
import com.oplus.aiunit.vision.hxb;
import com.oplus.aiunit.vision.mn2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CheckedOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class c implements hxb, gxb {
    public java.io.File a;
    public CheckedOutputStream b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mn2 f2301c;
    public fxb[] d = new fxb[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Fit.ProtocolVersion f2302e;
    public a2f f;

    public c(java.io.File file, Fit.ProtocolVersion protocolVersion) {
        this.f2302e = protocolVersion;
        this.f = g.a(protocolVersion);
        d(file);
    }

    @Override // com.oplus.aiunit.vision.hxb
    public void a(bxb bxbVar) {
        e(bxbVar);
    }

    @Override // com.oplus.aiunit.vision.gxb
    public void b(fxb fxbVar) {
        f(fxbVar);
    }

    public void c() {
        if (this.a == null) {
            throw new FitRuntimeException("File not open.");
        }
        try {
            g();
            long value = this.b.getChecksum().getValue();
            this.b.write((int) (value & 255));
            this.b.write((int) ((value >> 8) & 255));
            this.b.close();
            this.a = null;
        } catch (IOException e2) {
            throw new FitRuntimeException(e2);
        }
    }

    public void d(java.io.File file) {
        file.delete();
        this.f2301c = new mn2();
        this.a = file;
        g();
        try {
            this.b = new CheckedOutputStream(new FileOutputStream(this.a, true), this.f2301c);
        } catch (IOException e2) {
            throw new FitRuntimeException(e2);
        }
    }

    public void e(bxb bxbVar) {
        if (this.a == null) {
            throw new FitRuntimeException("File not open.");
        }
        if (!this.f.b(bxbVar)) {
            throw new FitRuntimeException("Incompatible Protocol Features");
        }
        fxb fxbVar = this.d[bxbVar.f9882c];
        if (fxbVar == null || !fxbVar.e(bxbVar)) {
            f(new fxb(bxbVar));
        }
        bxbVar.y(this.b, this.d[bxbVar.f9882c]);
    }

    public void f(fxb fxbVar) {
        if (this.a == null) {
            throw new FitRuntimeException("File not open.");
        }
        if (!this.f.a(fxbVar)) {
            throw new FitRuntimeException("Incompatible Protocol Features");
        }
        fxbVar.g(this.b);
        this.d[fxbVar.b] = fxbVar;
    }

    public final void g() {
        if (this.a == null) {
            throw new FitRuntimeException("File not open.");
        }
        try {
            mn2 mn2Var = new mn2();
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "rw");
            long length = this.a.length() - 14;
            if (length < 0) {
                length = 0;
            }
            byte[] bArr = {14, (byte) this.f2302e.getVersion(), -107, 82, (byte) (length & 255), (byte) ((length >> 8) & 255), (byte) ((length >> 16) & 255), (byte) ((length >> 24) & 255), 46, 70, 73, 84};
            randomAccessFile.write(bArr);
            mn2Var.update(bArr, 0, 12);
            long value = mn2Var.getValue();
            randomAccessFile.write((byte) (value & 255));
            randomAccessFile.write((byte) ((value >> 8) & 255));
            randomAccessFile.close();
        } catch (IOException e2) {
            throw new FitRuntimeException(e2);
        }
    }
}
