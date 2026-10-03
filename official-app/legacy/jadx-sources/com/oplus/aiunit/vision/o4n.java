package com.oplus.aiunit.vision;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes8.dex */
public final class o4n implements Closeable {
    public static final String g = "Split:LibExtractor";
    public static final String h = "SplitLib.lock";
    public final File i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f14781j;
    public final RandomAccessFile k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FileChannel f14782l;
    public final FileLock m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14783n;

    public o4n(String str, File file, File file2) throws IOException {
        this.f14783n = str;
        this.i = file;
        this.f14781j = file2;
        File file3 = new File(file2, h);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.k = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f14782l = channel;
            try {
                w7i.a(g, "Blocking on lock " + file3.getPath(), new Object[0]);
                this.m = channel.lock();
                w7i.a(g, file3.getPath() + " locked", new Object[0]);
            } catch (IOException | RuntimeException e2) {
                pd7.a(this.f14782l);
                throw e2;
            }
        } catch (RuntimeException e3) {
            pd7.a(this.k);
            throw e3;
        }
    }

    public final List<File> a(h7i.b bVar) throws IOException {
        int i;
        ZipFile zipFile = new ZipFile(this.i);
        try {
            String str = "lib/" + bVar.b() + "/";
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            ArrayList arrayList = new ArrayList();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                int i2 = 0;
                if (name.charAt(0) == 'l' && name.startsWith("lib/") && name.endsWith(".so") && name.startsWith(str)) {
                    String strSubstring = name.substring(name.lastIndexOf(47) + 1);
                    File file = new File(this.f14781j, strSubstring);
                    if (file.exists()) {
                        arrayList.add(file);
                    } else {
                        w7i.a(g, "Extraction is needed for lib: " + file.getAbsolutePath(), new Object[0]);
                        File fileM = a8i.o().m(this.f14783n, false);
                        if (!fileM.exists()) {
                            fileM.mkdirs();
                        }
                        File fileCreateTempFile = File.createTempFile("tmp-" + strSubstring, "", fileM);
                        int i3 = 0;
                        boolean z = false;
                        while (i3 < 3 && !z) {
                            int i4 = i3 + 1;
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                                try {
                                    pd7.b(zipFile.getInputStream(zipEntryNextElement), fileOutputStream);
                                    fileOutputStream.close();
                                    if (fileCreateTempFile.renameTo(file)) {
                                        z = true;
                                    } else {
                                        w7i.i(g, "Failed to rename \"" + fileCreateTempFile.getName() + "\" to \"" + file.getName() + "\"", new Object[i2]);
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Extraction ");
                                    sb.append(z ? "succeeded" : com.alipay.sdk.m.u.h.i);
                                    sb.append(" '");
                                    sb.append(file.getAbsolutePath());
                                    sb.append("': length ");
                                    String str2 = str;
                                    Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                                    sb.append(file.length());
                                    w7i.a(g, sb.toString(), new Object[0]);
                                    if (z) {
                                        i = 0;
                                        arrayList.add(file);
                                    } else {
                                        pd7.e(file);
                                        if (file.exists()) {
                                            i = 0;
                                            w7i.a(g, "Failed to delete extracted lib that has been corrupted'" + file.getPath() + "'", new Object[0]);
                                        } else {
                                            i = 0;
                                        }
                                    }
                                    enumerationEntries = enumeration;
                                    i3 = i4;
                                    i2 = i;
                                    str = str2;
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused) {
                                w7i.i(g, "Failed to extract so :" + strSubstring + ", attempts times : " + i4, new Object[0]);
                            }
                        }
                        String str3 = str;
                        Enumeration<? extends ZipEntry> enumeration2 = enumerationEntries;
                        pd7.e(fileCreateTempFile);
                        if (!z) {
                            throw new IOException("Could not create lib file " + file.getAbsolutePath() + ")");
                        }
                        str = str3;
                        enumerationEntries = enumeration2;
                    }
                }
            }
            pd7.a(zipFile);
            zipFile.close();
            return arrayList;
        } catch (Throwable th3) {
            try {
                zipFile.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        FileChannel fileChannel = this.f14782l;
        if (fileChannel == null || !fileChannel.isOpen()) {
            w7i.a(g, "lockChannel may has closed" + this.f14782l, new Object[0]);
        } else {
            try {
                this.f14782l.close();
            } catch (IOException unused) {
                throw new IOException("lockChannel.close error");
            }
        }
        RandomAccessFile randomAccessFile = this.k;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
                throw new IOException("lockRaf.close error");
            }
        } else {
            w7i.a(g, "lockRaf may has closed ", new Object[0]);
        }
        FileLock fileLock = this.m;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.m.release();
            } catch (IOException unused3) {
                throw new IOException("cacheLock.close error");
            }
        } else {
            w7i.a(g, "cacheLock may has closed " + this.m, new Object[0]);
        }
    }

    public List<File> g(h7i.b bVar, boolean z) throws IOException {
        List<File> listA;
        if (bVar == null) {
            return null;
        }
        if (!this.m.isValid()) {
            throw new IllegalStateException("SplitLibExtractor was closed");
        }
        if (z) {
            listA = a(bVar);
        } else {
            try {
                listA = h(bVar.c());
            } catch (IOException e2) {
                w7i.i(g, "Failed to reload existing extracted lib files, falling back to fresh extraction " + e2.getMessage(), new Object[0]);
                listA = a(bVar);
            }
        }
        w7i.a(g, "load found " + listA.size() + " lib files", new Object[0]);
        return listA;
    }

    public final List<File> h(List<h7i.b.a> list) throws IOException {
        w7i.a(g, "loading existing lib files", new Object[0]);
        if (list == null) {
            w7i.i(g, "loading existing lib files null", new Object[0]);
            return Collections.emptyList();
        }
        File[] fileArrListFiles = this.f14781j.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            throw new IOException("Missing extracted lib file '" + this.f14781j.getPath() + "'");
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (h7i.b.a aVar : list) {
            boolean z = false;
            for (File file : fileArrListFiles) {
                if (aVar.a().equals(file.getName())) {
                    arrayList.add(file);
                    z = true;
                }
            }
            if (!z) {
                throw new IOException("Invalid extracted lib: file " + aVar.a() + "is not existing!");
            }
        }
        w7i.a(g, "Existing lib files loaded", new Object[0]);
        return arrayList;
    }
}
