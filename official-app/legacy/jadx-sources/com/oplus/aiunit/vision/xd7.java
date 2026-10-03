package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class xd7 {

    public static final class b implements Comparator<File> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return b(file.lastModified(), file2.lastModified());
        }

        public final int b(long j2, long j3) {
            if (j2 < j3) {
                return -1;
            }
            return j2 == j3 ? 0 : 1;
        }
    }

    public static List<File> a(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new b());
        return listAsList;
    }

    public static void b(File file) throws IOException {
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
            }
        } else {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("File " + file + " is not directory!");
        }
    }

    public static void c(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            d(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j2 = length - 1;
        randomAccessFile.seek(j2);
        byte b2 = randomAccessFile.readByte();
        randomAccessFile.seek(j2);
        randomAccessFile.write(b2);
        randomAccessFile.close();
    }

    public static void d(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException("Error recreate zero-size file " + file);
    }

    public static void e(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            c(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                Log.d("video", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
            }
        }
    }
}
