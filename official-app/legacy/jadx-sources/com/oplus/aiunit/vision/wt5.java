package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.os.StrictMode;
import coil.disk.DiskLruCache;
import com.oplus.weatherservicesdk.data.Weather;
import io.netty.util.internal.StringUtil;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class wt5 implements Closeable {
    public final File i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f18392j;
    public final File k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final File f18393l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18394n;
    public final int o;
    public Writer q;
    public int s;
    public long p = 0;
    public final LinkedHashMap<String, d> r = new LinkedHashMap<>(0, 0.75f, true);
    public long t = 0;
    public final ThreadPoolExecutor u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> v = new a();

    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (wt5.this) {
                if (wt5.this.q == null) {
                    return null;
                }
                wt5.this.I();
                if (wt5.this.A()) {
                    wt5.this.F();
                    wt5.this.s = 0;
                }
                return null;
            }
        }
    }

    public static final class b implements ThreadFactory {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;
        public final boolean[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18395c;

        public /* synthetic */ c(wt5 wt5Var, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            wt5.this.t(this, false);
        }

        public void b() {
            if (this.f18395c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            wt5.this.t(this, true);
            this.f18395c = true;
        }

        public File f(int i) throws IOException {
            File fileK;
            synchronized (wt5.this) {
                if (this.a.f != this) {
                    throw new IllegalStateException();
                }
                if (!this.a.f18397e) {
                    this.b[i] = true;
                }
                fileK = this.a.k(i);
                wt5.this.i.mkdirs();
            }
            return fileK;
        }

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.f18397e ? null : new boolean[wt5.this.o];
        }
    }

    public final class d {
        public final String a;
        public final long[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File[] f18396c;
        public File[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18397e;
        public c f;
        public long g;

        public /* synthetic */ d(wt5 wt5Var, String str, a aVar) {
            this(str);
        }

        public File j(int i) {
            return this.f18396c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.b) {
                sb.append(StringUtil.SPACE);
                sb.append(j2);
            }
            return sb.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != wt5.this.o) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public d(String str) {
            this.a = str;
            this.b = new long[wt5.this.o];
            this.f18396c = new File[wt5.this.o];
            this.d = new File[wt5.this.o];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < wt5.this.o; i++) {
                sb.append(i);
                this.f18396c[i] = new File(wt5.this.i, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(wt5.this.i, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class e {
        public final String a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f18398c;
        public final File[] d;

        public /* synthetic */ e(wt5 wt5Var, String str, long j2, File[] fileArr, long[] jArr, a aVar) {
            this(str, j2, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }

        public e(String str, long j2, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j2;
            this.d = fileArr;
            this.f18398c = jArr;
        }
    }

    public wt5(File file, int i, int i2, long j2) {
        this.i = file;
        this.m = i;
        this.f18392j = new File(file, DiskLruCache.JOURNAL_FILE);
        this.k = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.f18393l = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.o = i2;
        this.f18394n = j2;
    }

    public static wt5 B(File file, int i, int i2, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                H(file2, file3, false);
            }
        }
        wt5 wt5Var = new wt5(file, i, i2, j2);
        if (wt5Var.f18392j.exists()) {
            try {
                wt5Var.D();
                wt5Var.C();
                return wt5Var;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                wt5Var.u();
            }
        }
        file.mkdirs();
        wt5 wt5Var2 = new wt5(file, i, i2, j2);
        wt5Var2.F();
        return wt5Var2;
    }

    public static void H(File file, File file2, boolean z) throws IOException {
        if (z) {
            v(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void s(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void v(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void y(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final boolean A() {
        int i = this.s;
        return i >= 2000 && i >= this.r.size();
    }

    public final void C() throws IOException {
        v(this.k);
        Iterator<d> it = this.r.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.o) {
                    this.p += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.o) {
                    v(next.j(i));
                    v(next.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void D() throws IOException {
        p0j p0jVar = new p0j(new FileInputStream(this.f18392j), brk.a);
        try {
            String strI = p0jVar.i();
            String strI2 = p0jVar.i();
            String strI3 = p0jVar.i();
            String strI4 = p0jVar.i();
            String strI5 = p0jVar.i();
            if (!DiskLruCache.MAGIC.equals(strI) || !"1".equals(strI2) || !Integer.toString(this.m).equals(strI3) || !Integer.toString(this.o).equals(strI4) || !"".equals(strI5)) {
                throw new IOException("unexpected journal header: [" + strI + ", " + strI2 + ", " + strI4 + ", " + strI5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    E(p0jVar.i());
                    i++;
                } catch (EOFException unused) {
                    this.s = i - this.r.size();
                    if (p0jVar.h()) {
                        F();
                    } else {
                        this.q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18392j, true), brk.a));
                    }
                    brk.a(p0jVar);
                    return;
                }
            }
        } catch (Throwable th) {
            brk.a(p0jVar);
            throw th;
        }
    }

    public final void E(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.r.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.r.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.r.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f18397e = true;
            dVar.f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void F() throws IOException {
        Writer writer = this.q;
        if (writer != null) {
            s(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.k), brk.a));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write(Weather.SEPARATOR);
            bufferedWriter.write("1");
            bufferedWriter.write(Weather.SEPARATOR);
            bufferedWriter.write(Integer.toString(this.m));
            bufferedWriter.write(Weather.SEPARATOR);
            bufferedWriter.write(Integer.toString(this.o));
            bufferedWriter.write(Weather.SEPARATOR);
            bufferedWriter.write(Weather.SEPARATOR);
            for (d dVar : this.r.values()) {
                if (dVar.f != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                }
            }
            s(bufferedWriter);
            if (this.f18392j.exists()) {
                H(this.f18392j, this.f18393l, true);
            }
            H(this.k, this.f18392j, false);
            this.f18393l.delete();
            this.q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18392j, true), brk.a));
        } catch (Throwable th) {
            s(bufferedWriter);
            throw th;
        }
    }

    public synchronized boolean G(String str) throws IOException {
        p();
        d dVar = this.r.get(str);
        if (dVar != null && dVar.f == null) {
            for (int i = 0; i < this.o; i++) {
                File fileJ = dVar.j(i);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.p -= dVar.b[i];
                dVar.b[i] = 0;
            }
            this.s++;
            this.q.append((CharSequence) "REMOVE");
            this.q.append(StringUtil.SPACE);
            this.q.append((CharSequence) str);
            this.q.append('\n');
            this.r.remove(str);
            if (A()) {
                this.u.submit(this.v);
            }
            return true;
        }
        return false;
    }

    public final void I() throws IOException {
        while (this.p > this.f18394n) {
            G(this.r.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.q == null) {
            return;
        }
        for (d dVar : new ArrayList(this.r.values())) {
            if (dVar.f != null) {
                dVar.f.a();
            }
        }
        I();
        s(this.q);
        this.q = null;
    }

    public final void p() {
        if (this.q == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void t(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f18397e) {
            for (int i = 0; i < this.o; i++) {
                if (!cVar.b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.k(i).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.o; i2++) {
            File fileK = dVar.k(i2);
            if (!z) {
                v(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i2);
                fileK.renameTo(fileJ);
                long j2 = dVar.b[i2];
                long length = fileJ.length();
                dVar.b[i2] = length;
                this.p = (this.p - j2) + length;
            }
        }
        this.s++;
        dVar.f = null;
        if (dVar.f18397e || z) {
            dVar.f18397e = true;
            this.q.append((CharSequence) "CLEAN");
            this.q.append(StringUtil.SPACE);
            this.q.append((CharSequence) dVar.a);
            this.q.append((CharSequence) dVar.l());
            this.q.append('\n');
            if (z) {
                long j3 = this.t;
                this.t = 1 + j3;
                dVar.g = j3;
            }
        } else {
            this.r.remove(dVar.a);
            this.q.append((CharSequence) "REMOVE");
            this.q.append(StringUtil.SPACE);
            this.q.append((CharSequence) dVar.a);
            this.q.append('\n');
        }
        y(this.q);
        if (this.p > this.f18394n || A()) {
            this.u.submit(this.v);
        }
    }

    public void u() throws IOException {
        close();
        brk.b(this.i);
    }

    public c w(String str) throws IOException {
        return x(str, -1L);
    }

    public final synchronized c x(String str, long j2) throws IOException {
        p();
        d dVar = this.r.get(str);
        a aVar = null;
        if (j2 != -1 && (dVar == null || dVar.g != j2)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.r.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f = cVar;
        this.q.append((CharSequence) "DIRTY");
        this.q.append(StringUtil.SPACE);
        this.q.append((CharSequence) str);
        this.q.append('\n');
        y(this.q);
        return cVar;
    }

    public synchronized e z(String str) throws IOException {
        p();
        d dVar = this.r.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f18397e) {
            return null;
        }
        for (File file : dVar.f18396c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.s++;
        this.q.append((CharSequence) "READ");
        this.q.append(StringUtil.SPACE);
        this.q.append((CharSequence) str);
        this.q.append('\n');
        if (A()) {
            this.u.submit(this.v);
        }
        return new e(this, str, dVar.g, dVar.f18396c, dVar.b, null);
    }
}
