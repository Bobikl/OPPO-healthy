package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class dkm {
    public c a;

    public static class b {
        public boolean a = false;
    }

    public static class c {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public akm f10609c;
        public b d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f10610e;

        public c(bkm bkmVar, akm akmVar) {
            this.f10609c = null;
            this.a = bkmVar.x();
            this.b = bkmVar.y();
            this.f10609c = akmVar;
        }

        public final String a() {
            return this.a;
        }

        public final void b(String str) {
            if (str.length() > 1) {
                this.f10610e = str;
            }
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.f10610e;
        }

        public final akm e() {
            return this.f10609c;
        }

        public final b f() {
            return this.d;
        }

        public final void g() {
            this.d.a = true;
        }
    }

    public interface d {
        void a();

        void a(long j2);
    }

    public dkm(bkm bkmVar, akm akmVar) {
        this.a = new c(bkmVar, akmVar);
    }

    public static int a(File file, ZipInputStream zipInputStream, long j2, long j3, d dVar, b bVar) throws Exception {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int i2 = zipInputStream.read(bArr, 0, 1024);
            if (i2 == -1) {
                bufferedOutputStream.close();
                return i;
            }
            if (bVar != null && bVar.a) {
                bufferedOutputStream.close();
                return i;
            }
            bufferedOutputStream.write(bArr, 0, i2);
            i += i2;
            if (j3 > 0 && dVar != null) {
                long j4 = ((((long) i) + j2) * 100) / j3;
                if (bVar == null || !bVar.a) {
                    dVar.a(j4);
                }
            }
        }
    }

    public static void c(c cVar) {
        if (cVar == null) {
            return;
        }
        akm akmVarE = cVar.e();
        if (akmVarE != null) {
            akmVarE.p();
        }
        String strA = cVar.a();
        String strC = cVar.c();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strC)) {
            if (cVar.f().a) {
                if (akmVarE != null) {
                    akmVarE.r();
                    return;
                }
                return;
            } else {
                if (akmVarE != null) {
                    akmVarE.q();
                    return;
                }
                return;
            }
        }
        File file = new File(strA);
        if (!file.exists()) {
            if (cVar.f().a) {
                if (akmVarE != null) {
                    akmVarE.r();
                    return;
                }
                return;
            } else {
                if (akmVarE != null) {
                    akmVarE.q();
                    return;
                }
                return;
            }
        }
        File file2 = new File(strC);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        a aVar = new a(akmVarE);
        try {
            if (cVar.f().a && akmVarE != null) {
                akmVarE.r();
            }
            e(file, file2, aVar, cVar);
            if (cVar.f().a) {
                if (akmVarE != null) {
                    akmVarE.r();
                }
            } else if (akmVarE != null) {
                akmVarE.b(cVar.d());
            }
        } catch (Throwable unused) {
            if (cVar.f().a) {
                if (akmVarE != null) {
                    akmVarE.r();
                }
            } else if (akmVarE != null) {
                akmVarE.q();
            }
        }
    }

    public static void d(File file) {
        File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        d(parentFile);
        parentFile.mkdir();
    }

    public static void e(File file, File file2, d dVar, c cVar) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        b bVarF = cVar.f();
        long size = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            CheckedInputStream checkedInputStream = new CheckedInputStream(fileInputStream, new CRC32());
            ZipInputStream zipInputStream = new ZipInputStream(checkedInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (bVarF != null && bVarF.a) {
                        zipInputStream.closeEntry();
                        zipInputStream.close();
                        checkedInputStream.close();
                        fileInputStream.close();
                        break;
                    }
                    if (!nextEntry.isDirectory()) {
                        if (!g(nextEntry.getName())) {
                            dVar.a();
                            break;
                        } else {
                            stringBuffer.append(nextEntry.getName());
                            stringBuffer.append(";");
                        }
                    }
                    size += nextEntry.getSize();
                    zipInputStream.closeEntry();
                } else {
                    break;
                }
            }
            cVar.b(stringBuffer.toString());
            zipInputStream.close();
            checkedInputStream.close();
            fileInputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        FileInputStream fileInputStream2 = new FileInputStream(file);
        CheckedInputStream checkedInputStream2 = new CheckedInputStream(fileInputStream2, new CRC32());
        ZipInputStream zipInputStream2 = new ZipInputStream(checkedInputStream2);
        f(file2, zipInputStream2, size, dVar, bVarF);
        zipInputStream2.close();
        checkedInputStream2.close();
        fileInputStream2.close();
    }

    public static void f(File file, ZipInputStream zipInputStream, long j2, d dVar, b bVar) throws Exception {
        int iA = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            if (bVar != null && bVar.a) {
                zipInputStream.closeEntry();
                return;
            }
            String str = file.getPath() + File.separator + nextEntry.getName();
            if (!g(nextEntry.getName())) {
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            } else {
                File file2 = new File(str);
                d(file2);
                if (nextEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    iA += a(file2, zipInputStream, iA, j2, dVar, bVar);
                }
                zipInputStream.closeEntry();
            }
        }
    }

    public static boolean g(String str) {
        return (str.contains("..") || str.contains("/") || str.contains("\\") || str.contains("%")) ? false : true;
    }

    public final void b() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h() {
        c cVar = this.a;
        if (cVar != null) {
            c(cVar);
        }
    }

    public static class a implements d {
        public final /* synthetic */ akm a;

        public a(akm akmVar) {
            this.a = akmVar;
        }

        @Override // com.oplus.aiunit.vision.dkm.d
        public final void a(long j2) {
            try {
                akm akmVar = this.a;
                if (akmVar != null) {
                    akmVar.a(j2);
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.oplus.aiunit.vision.dkm.d
        public final void a() {
            akm akmVar = this.a;
            if (akmVar != null) {
                akmVar.q();
            }
        }
    }
}
