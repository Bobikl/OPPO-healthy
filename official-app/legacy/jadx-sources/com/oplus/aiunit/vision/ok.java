package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.trace.bean.AcTraceBean;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class ok {
    public static /* synthetic */ boolean A(File file, String str) {
        return str.endsWith(".trace");
    }

    public static /* synthetic */ boolean B(File file, String str) {
        return str.endsWith(".trace");
    }

    public static /* synthetic */ boolean C(File file, String str) {
        return str.endsWith(".trace");
    }

    public static /* synthetic */ boolean D(File file, String str) {
        return str.endsWith(".trace");
    }

    public static List<AcTraceBean> E(Context context) {
        File fileS = s(context);
        if (!fileS.exists()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = fileS.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.kk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ok.D(file, str);
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    arrayList.addAll(F(file));
                } catch (Throwable th) {
                    AcLogUtil.e("AcTraceFileUtils", "readAllTraceFromDir error for file: " + file.getName(), th);
                }
            }
        }
        return arrayList;
    }

    public static synchronized List<AcTraceBean> F(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    FileLock fileLockLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        if (file.exists() && file.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            byte[] bArr = new byte[(int) file.length()];
                            randomAccessFile.read(bArr);
                            String strG = G(bArr);
                            if (TextUtils.isEmpty(strG)) {
                                ArrayList arrayList2 = new ArrayList();
                                fileLockLock.release();
                                channel.close();
                                randomAccessFile.close();
                                return arrayList2;
                            }
                            for (String str : strG.split(Weather.SEPARATOR)) {
                                String strTrim = str.trim();
                                if (!TextUtils.isEmpty(strTrim)) {
                                    try {
                                        AcTraceBean acTraceBean = (AcTraceBean) xa.c(strTrim, AcTraceBean.class);
                                        if (acTraceBean != null) {
                                            arrayList.add(acTraceBean);
                                        }
                                    } catch (Exception e2) {
                                        AcLogUtil.e("AcTraceFileUtils", "Failed to parse line: " + strTrim, e2);
                                    }
                                }
                            }
                            fileLockLock.release();
                            channel.close();
                            randomAccessFile.close();
                            return arrayList;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        fileLockLock.release();
                        channel.close();
                        randomAccessFile.close();
                        return arrayList3;
                    } catch (Throwable th) {
                        fileLockLock.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            AcLogUtil.e("AcTraceFileUtils", "readWithFileLock fail", th6);
            return new ArrayList();
        }
    }

    public static String G(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                String str = new String(bArr, "UTF-8");
                AcLogUtil.d("AcTraceFileUtils", "Successfully decoded with encoding: UTF-8");
                return str;
            } catch (Exception unused) {
                AcLogUtil.e("AcTraceFileUtils", "Failed to decode with encoding: UTF-8");
                AcLogUtil.e("AcTraceFileUtils", "Failed to decode file content with any encoding");
            }
        }
        return "";
    }

    public static synchronized void H(Context context, String str, List<AcTraceBean> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<AcTraceBean> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(xa.d(it.next()));
                    sb.append('\n');
                }
                File file = new File(s(context), str + ".trace");
                AcLogUtil.i("AcTraceFileUtils", "save " + list.size() + " traces to " + str);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileChannel channel = randomAccessFile.getChannel();
                        try {
                            FileLock fileLockLock = channel.lock();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                                try {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
                                    try {
                                        bufferedOutputStream.write(sb.toString().getBytes("UTF-8"));
                                        bufferedOutputStream.flush();
                                        bufferedOutputStream.close();
                                        fileOutputStream.close();
                                        fileLockLock.release();
                                        channel.close();
                                        randomAccessFile.close();
                                        return;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            } catch (Throwable th5) {
                                fileLockLock.release();
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                            }
                            throw th6;
                        }
                    } catch (Throwable th8) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                        throw th8;
                    }
                } catch (Throwable th10) {
                    AcLogUtil.e("AcTraceFileUtils", "saveTraceToFile fail!", th10);
                }
            }
        }
        AcLogUtil.w("AcTraceFileUtils", "traceBeans is null or empty");
    }

    public static synchronized void k(Context context) {
        File fileS = s(context);
        AcLogUtil.i("AcTraceFileUtils", "Deleting all trace files from directory: " + fileS.getAbsolutePath());
        if (!fileS.exists()) {
            AcLogUtil.i("AcTraceFileUtils", "Trace directory does not exist, skipping deletion");
            return;
        }
        File[] fileArrListFiles = fileS.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.nk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ok.u(file, str);
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    if (file.delete()) {
                        AcLogUtil.i("AcTraceFileUtils", "Trace file deleted successfully: " + file.getName());
                    } else {
                        AcLogUtil.e("AcTraceFileUtils", "Failed to delete trace file: " + file.getName());
                    }
                } catch (Throwable th) {
                    AcLogUtil.e("AcTraceFileUtils", "Error deleting trace file: " + file.getName(), th);
                }
            }
        }
    }

    public static boolean l(File file, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((((((long) i) * 24) * 60) * 60) * 1000);
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.jk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return ok.v(file2, str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return false;
        }
        long j2 = 0;
        boolean z = false;
        int i2 = 0;
        for (File file2 : fileArrListFiles) {
            if (file2.lastModified() < jCurrentTimeMillis) {
                long length = file2.length();
                if (file2.delete()) {
                    i2++;
                    j2 += length;
                    AcLogUtil.i("AcTraceFileUtils", "Deleted expired file: " + file2.getName() + ", age: " + ((System.currentTimeMillis() - file2.lastModified()) / 86400000) + " days");
                    z = true;
                } else {
                    AcLogUtil.e("AcTraceFileUtils", "Failed to delete expired file: " + file2.getName());
                }
            }
        }
        if (z) {
            AcLogUtil.i("AcTraceFileUtils", "Expired file cleanup completed, deleted " + i2 + " files, freed " + j2 + " bytes");
        }
        return z;
    }

    public static boolean m(Context context, File file, long j2, final String str) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.lk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return ok.w(str, file2, str2);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            AcLogUtil.d("AcTraceFileUtils", "No high frequency files found with prefix: " + str);
            return false;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.oplus.aiunit.vision.mk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ok.x((File) obj, (File) obj2);
            }
        });
        AcLogUtil.i("AcTraceFileUtils", "Found " + fileArrListFiles.length + " high frequency files, starting deletion...");
        long jR = r(context);
        boolean z = false;
        for (File file2 : fileArrListFiles) {
            if (jR <= j2) {
                AcLogUtil.i("AcTraceFileUtils", "Size threshold met, stopping high frequency file deletion");
                break;
            }
            long length = file2.length();
            if (file2.delete()) {
                jR -= length;
                AcLogUtil.i("AcTraceFileUtils", "Deleted high frequency file: " + file2.getName() + ", size: " + length + ", remaining size: " + jR);
                z = true;
            } else {
                AcLogUtil.e("AcTraceFileUtils", "Failed to delete high frequency file: " + file2.getName());
            }
        }
        if (z) {
            AcLogUtil.i("AcTraceFileUtils", "High frequency file cleanup completed");
        }
        return z;
    }

    public static void n(Context context, File file, long j2) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.hk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return ok.y(file2, str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.oplus.aiunit.vision.ik
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ok.z((File) obj, (File) obj2);
            }
        });
        long jR = r(context);
        AcLogUtil.i("AcTraceFileUtils", "Starting normal file deletion, remaining size: " + jR);
        for (File file2 : fileArrListFiles) {
            if (jR <= j2) {
                AcLogUtil.i("AcTraceFileUtils", "Size threshold met, stopping normal file deletion");
                break;
            }
            long length = file2.length();
            if (file2.delete()) {
                jR -= length;
                AcLogUtil.i("AcTraceFileUtils", "Deleted normal file: " + file2.getName() + ", size: " + length + ", remaining size: " + jR);
            } else {
                AcLogUtil.e("AcTraceFileUtils", "Failed to delete normal file: " + file2.getName());
            }
        }
        AcLogUtil.i("AcTraceFileUtils", "Normal file deletion completed, final size: " + jR);
    }

    public static synchronized void o(Context context, long j2, int i, String str) {
        File fileS = s(context);
        if (fileS.exists()) {
            AcLogUtil.i("AcTraceFileUtils", "Starting file cleanup, current total size: " + r(context) + ", threshold: " + j2 + ", max days: " + i);
            if (l(fileS, i)) {
                long jR = r(context);
                AcLogUtil.i("AcTraceFileUtils", "After deleting expired files, current size: " + jR);
                if (jR <= j2) {
                    AcLogUtil.i("AcTraceFileUtils", "Size threshold met after deleting expired files");
                    return;
                }
            }
            if (!TextUtils.isEmpty(str) && m(context, fileS, j2, str)) {
                long jR2 = r(context);
                AcLogUtil.i("AcTraceFileUtils", "After deleting high frequency files, current size: " + jR2);
                if (jR2 <= j2) {
                    AcLogUtil.i("AcTraceFileUtils", "Size threshold met after deleting high frequency files");
                    return;
                }
            }
            n(context, fileS, j2);
        }
    }

    public static String p(long j2) {
        if (j2 <= 0) {
            return null;
        }
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(j2));
    }

    public static int q(Context context) {
        File[] fileArrListFiles;
        File fileS = s(context);
        if (!fileS.exists() || (fileArrListFiles = fileS.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.gk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ok.A(file, str);
            }
        })) == null) {
            return 0;
        }
        int i = 0;
        for (File file : fileArrListFiles) {
            try {
                try {
                    FileReader fileReader = new FileReader(file);
                    try {
                        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
                        try {
                            lineNumberReader.skip(Long.MAX_VALUE);
                            int lineNumber = lineNumberReader.getLineNumber();
                            if (lineNumber > 0) {
                                lineNumber++;
                            }
                            i += lineNumber;
                            lineNumberReader.close();
                            fileReader.close();
                        } catch (Throwable th) {
                            try {
                                lineNumberReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (IOException e2) {
                    AcLogUtil.e("AcTraceFileUtils", "getTotalTraceCount error for file: " + file.getName(), e2);
                }
            } catch (Throwable th5) {
                AcLogUtil.e("AcTraceFileUtils", "getTotalTraceCount error for file: " + file.getName(), th5);
            }
        }
        return i;
    }

    public static long r(Context context) {
        File fileS = s(context);
        long length = 0;
        if (!fileS.exists()) {
            return 0L;
        }
        File[] fileArrListFiles = fileS.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.ek
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ok.B(file, str);
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                length += file.length();
            }
        }
        return length;
    }

    public static File s(Context context) {
        File file = new File(context.getExternalCacheDir(), "account_idsdk_trace_data");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static int t(Context context) {
        File[] fileArrListFiles;
        File fileS = s(context);
        if (!fileS.exists() || (fileArrListFiles = fileS.listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.fk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ok.C(file, str);
            }
        })) == null || fileArrListFiles.length == 0) {
            return 0;
        }
        HashSet hashSet = new HashSet();
        for (File file : fileArrListFiles) {
            String strP = p(file.lastModified());
            if (strP != null) {
                hashSet.add(strP);
            }
        }
        return hashSet.size();
    }

    public static /* synthetic */ boolean u(File file, String str) {
        return str.endsWith(".trace");
    }

    public static /* synthetic */ boolean v(File file, String str) {
        return str.endsWith(".trace");
    }

    public static /* synthetic */ boolean w(String str, File file, String str2) {
        return str2.startsWith(str) && str2.endsWith(".trace");
    }

    public static /* synthetic */ int x(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    public static /* synthetic */ boolean y(File file, String str) {
        return str.endsWith(".trace");
    }

    public static /* synthetic */ int z(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }
}
