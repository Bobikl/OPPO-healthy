package com.oplus.aiunit.vision;

import coil.disk.DiskLruCache;
import com.oplus.weatherservicesdk.data.Weather;
import io.netty.util.internal.StringUtil;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.commons.codec.CharEncoding;

/* JADX INFO: loaded from: classes12.dex */
public final class f3n implements Closeable {
    public static final OutputStream A;
    public static final ThreadFactory y;
    public static ThreadPoolExecutor z;
    public final File i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f11204j;
    public final File k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final File f11205l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11206n;
    public Writer q;
    public int t;
    public static final Pattern w = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final Charset b = Charset.forName(CharEncoding.US_ASCII);
    public static final Charset x = Charset.forName("UTF-8");
    public long p = 0;
    public int r = 1000;
    public final LinkedHashMap<String, f> s = new LinkedHashMap<>(0, 0.75f, true);
    public long u = 0;
    public final Callable<Void> v = new b();
    public final int m = 1;
    public final int o = 1;

    public class a implements ThreadFactory {
        public final AtomicInteger i = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.i.getAndIncrement());
        }
    }

    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() throws Exception {
            synchronized (f3n.this) {
                if (f3n.this.q == null) {
                    return null;
                }
                f3n.this.O();
                if (f3n.this.M()) {
                    f3n.this.L();
                    f3n.D(f3n.this);
                }
                return null;
            }
        }
    }

    public class c extends OutputStream {
        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
        }
    }

    public final class d {
        public final f a;
        public final boolean[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11207c;
        public boolean d;

        public class a extends FilterOutputStream {
            public /* synthetic */ a(d dVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }

            public a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    d.f(d.this);
                }
            }
        }

        public /* synthetic */ d(f3n f3nVar, f fVar, byte b) {
            this(fVar);
        }

        public static /* synthetic */ boolean f(d dVar) {
            dVar.f11207c = true;
            return true;
        }

        public final OutputStream b() throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (f3n.this.o <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + f3n.this.o);
            }
            synchronized (f3n.this) {
                if (this.a.d != this) {
                    throw new IllegalStateException();
                }
                byte b = 0;
                if (!this.a.f11211c) {
                    this.b[0] = true;
                }
                File fileI = this.a.i(0);
                try {
                    fileOutputStream = new FileOutputStream(fileI);
                } catch (FileNotFoundException unused) {
                    f3n.this.i.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileI);
                    } catch (FileNotFoundException unused2) {
                        return f3n.A;
                    }
                }
                aVar = new a(this, fileOutputStream, b);
            }
            return aVar;
        }

        public final void c() throws IOException {
            if (this.f11207c) {
                f3n.this.m(this, false);
                f3n.this.z(this.a.a);
            } else {
                f3n.this.m(this, true);
            }
            this.d = true;
        }

        public final void e() throws IOException {
            f3n.this.m(this, false);
        }

        public d(f fVar) {
            this.a = fVar;
            this.b = fVar.f11211c ? null : new boolean[f3n.this.o];
        }
    }

    public final class e implements Closeable {
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f11209j;
        public final InputStream[] k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long[] f11210l;

        public /* synthetic */ e(f3n f3nVar, String str, long j2, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j2, inputStreamArr, jArr);
        }

        public final InputStream a() {
            return this.k[0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.k) {
                f3n.o(inputStream);
            }
        }

        public e(String str, long j2, InputStream[] inputStreamArr, long[] jArr) {
            this.i = str;
            this.f11209j = j2;
            this.k = inputStreamArr;
            this.f11210l = jArr;
        }
    }

    public final class f {
        public final String a;
        public final long[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11211c;
        public d d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f11212e;

        public /* synthetic */ f(f3n f3nVar, String str, byte b) {
            this(str);
        }

        public static IOException d(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public static /* synthetic */ void f(f fVar, String[] strArr) throws IOException {
            if (strArr.length != f3n.this.o) {
                throw d(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    fVar.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw d(strArr);
                }
            }
        }

        public static /* synthetic */ boolean g(f fVar) {
            fVar.f11211c = true;
            return true;
        }

        public final File c(int i) {
            return new File(f3n.this.i, this.a + "." + i);
        }

        public final String e() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.b) {
                sb.append(StringUtil.SPACE);
                sb.append(j2);
            }
            return sb.toString();
        }

        public final File i(int i) {
            return new File(f3n.this.i, this.a + "." + i + ".tmp");
        }

        public f(String str) {
            this.a = str;
            this.b = new long[f3n.this.o];
        }
    }

    static {
        a aVar = new a();
        y = aVar;
        z = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), aVar);
        A = new c();
    }

    public f3n(File file, long j2) {
        this.i = file;
        this.f11204j = new File(file, DiskLruCache.JOURNAL_FILE);
        this.k = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.f11205l = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f11206n = j2;
    }

    public static /* synthetic */ int D(f3n f3nVar) {
        f3nVar.t = 0;
        return 0;
    }

    public static void F(String str) {
        if (w.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public static ThreadPoolExecutor H() {
        try {
            ThreadPoolExecutor threadPoolExecutor = z;
            if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
                z = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), y);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return z;
    }

    public static f3n g(File file, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                s(file2, file3, false);
            }
        }
        f3n f3nVar = new f3n(file, j2);
        if (f3nVar.f11204j.exists()) {
            try {
                f3nVar.J();
                f3nVar.K();
                f3nVar.q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f3nVar.f11204j, true), b));
                return f3nVar;
            } catch (Throwable unused) {
                f3nVar.B();
            }
        }
        file.mkdirs();
        f3n f3nVar2 = new f3n(file, j2);
        f3nVar2.L();
        return f3nVar2;
    }

    public static void i() {
        ThreadPoolExecutor threadPoolExecutor = z;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        z.shutdown();
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void s(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void w(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                w(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
            }
        }
    }

    public final synchronized d A(String str) throws IOException {
        N();
        F(str);
        f fVar = this.s.get(str);
        byte b2 = 0;
        if (fVar == null) {
            fVar = new f(this, str, b2);
            this.s.put(str, fVar);
        } else if (fVar.d != null) {
            return null;
        }
        d dVar = new d(this, fVar, b2);
        fVar.d = dVar;
        this.q.write("DIRTY " + str + '\n');
        this.q.flush();
        return dVar;
    }

    public final void B() throws IOException {
        close();
        w(this.i);
    }

    public final void J() throws IOException {
        String strSubstring;
        g3n g3nVar = new g3n(new FileInputStream(this.f11204j), b);
        try {
            String strA = g3nVar.a();
            String strA2 = g3nVar.a();
            String strA3 = g3nVar.a();
            String strA4 = g3nVar.a();
            String strA5 = g3nVar.a();
            if (!DiskLruCache.MAGIC.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.m).equals(strA3) || !Integer.toString(this.o).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            byte b2 = 0;
            int i = 0;
            while (true) {
                try {
                    String strA6 = g3nVar.a();
                    int iIndexOf = strA6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(strA6));
                    }
                    int i2 = iIndexOf + 1;
                    int iIndexOf2 = strA6.indexOf(32, i2);
                    if (iIndexOf2 == -1) {
                        strSubstring = strA6.substring(i2);
                        if (iIndexOf == 6 && strA6.startsWith("REMOVE")) {
                            this.s.remove(strSubstring);
                        }
                        i++;
                    } else {
                        strSubstring = strA6.substring(i2, iIndexOf2);
                    }
                    f fVar = this.s.get(strSubstring);
                    if (fVar == null) {
                        fVar = new f(this, strSubstring, b2);
                        this.s.put(strSubstring, fVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5 && strA6.startsWith("CLEAN")) {
                        String[] strArrSplit = strA6.substring(iIndexOf2 + 1).split(" ");
                        f.g(fVar);
                        fVar.d = null;
                        f.f(fVar, strArrSplit);
                    } else if (iIndexOf2 == -1 && iIndexOf == 5 && strA6.startsWith("DIRTY")) {
                        fVar.d = new d(this, fVar, b2);
                    } else if (iIndexOf2 != -1 || iIndexOf != 4 || !strA6.startsWith("READ")) {
                        throw new IOException("unexpected journal line: ".concat(strA6));
                    }
                    i++;
                } catch (EOFException unused) {
                    this.t = i - this.s.size();
                    o(g3nVar);
                    return;
                }
            }
        } catch (Throwable th) {
            o(g3nVar);
            throw th;
        }
    }

    public final void K() throws IOException {
        p(this.k);
        Iterator<f> it = this.s.values().iterator();
        while (it.hasNext()) {
            f next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.o) {
                    this.p += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.o) {
                    p(next.c(i));
                    p(next.i(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void L() throws IOException {
        Writer writer = this.q;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.k), b));
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
            for (f fVar : this.s.values()) {
                if (fVar.d != null) {
                    bufferedWriter.write("DIRTY " + fVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + fVar.a + fVar.e() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f11204j.exists()) {
                s(this.f11204j, this.f11205l, true);
            }
            s(this.k, this.f11204j, false);
            this.f11205l.delete();
            this.q = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f11204j, true), b));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final boolean M() {
        int i = this.t;
        return i >= 2000 && i >= this.s.size();
    }

    public final void N() {
        if (this.q == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void O() throws IOException {
        while (true) {
            if (this.p <= this.f11206n && this.s.size() <= this.r) {
                return;
            } else {
                z(this.s.entrySet().iterator().next().getKey());
            }
        }
    }

    public final synchronized e a(String str) throws IOException {
        InputStream inputStream;
        N();
        F(str);
        f fVar = this.s.get(str);
        if (fVar == null) {
            return null;
        }
        if (!fVar.f11211c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.o];
        for (int i = 0; i < this.o; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(fVar.c(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.o && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    o(inputStream);
                }
                return null;
            }
        }
        this.t++;
        this.q.append((CharSequence) ("READ " + str + '\n'));
        if (M()) {
            H().submit(this.v);
        }
        return new e(this, str, fVar.f11212e, inputStreamArr, fVar.b, (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.q == null) {
            return;
        }
        for (f fVar : new ArrayList(this.s.values())) {
            if (fVar.d != null) {
                fVar.d.e();
            }
        }
        O();
        this.q.close();
        this.q = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004 A[PHI: r0
  0x0004: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0002, B:6:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    public final void l(int i) {
        int i2 = 10;
        if (i < 10) {
            i = i2;
        } else {
            i2 = 10000;
            if (i > 10000) {
                i = i2;
            }
        }
        this.r = i;
    }

    public final synchronized void m(d dVar, boolean z2) throws IOException {
        f fVar = dVar.a;
        if (fVar.d != dVar) {
            throw new IllegalStateException();
        }
        if (z2 && !fVar.f11211c) {
            for (int i = 0; i < this.o; i++) {
                if (!dVar.b[i]) {
                    dVar.e();
                    throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                }
                if (!fVar.i(i).exists()) {
                    dVar.e();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.o; i2++) {
            File fileI = fVar.i(i2);
            if (!z2) {
                p(fileI);
            } else if (fileI.exists()) {
                File fileC = fVar.c(i2);
                fileI.renameTo(fileC);
                long j2 = fVar.b[i2];
                long length = fileC.length();
                fVar.b[i2] = length;
                this.p = (this.p - j2) + length;
            }
        }
        this.t++;
        fVar.d = null;
        if (fVar.f11211c || z2) {
            f.g(fVar);
            this.q.write("CLEAN " + fVar.a + fVar.e() + '\n');
            if (z2) {
                long j3 = this.u;
                this.u = 1 + j3;
                fVar.f11212e = j3;
            }
        } else {
            this.s.remove(fVar.a);
            this.q.write("REMOVE " + fVar.a + '\n');
        }
        this.q.flush();
        if (this.p > this.f11206n || M()) {
            H().submit(this.v);
        }
    }

    public final d t(String str) throws IOException {
        return A(str);
    }

    public final File u() {
        return this.i;
    }

    public final synchronized void x() throws IOException {
        N();
        O();
        this.q.flush();
    }

    public final synchronized boolean z(String str) throws IOException {
        N();
        F(str);
        f fVar = this.s.get(str);
        if (fVar != null && fVar.d == null) {
            for (int i = 0; i < this.o; i++) {
                File fileC = fVar.c(i);
                if (fileC.exists() && !fileC.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(fileC)));
                }
                this.p -= fVar.b[i];
                fVar.b[i] = 0;
            }
            this.t++;
            this.q.append((CharSequence) ("REMOVE " + str + '\n'));
            this.s.remove(str);
            if (M()) {
                H().submit(this.v);
            }
            return true;
        }
        return false;
    }
}
