package com.heytap.log.uploader;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.consts.OplusLogConfig;
import com.heytap.log.core.FileStrategy;
import com.heytap.log.util.AppUtil;
import com.heytap.log.util.FileUtil;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes19.dex */
public class FileZipper {

    public interface OnZipFileListener {
        void onZipError(int i, String str);

        void onZipOk(int i, File file);
    }

    private static void createZip(String str, String str2, List<File> list, long j2, OnZipFileListener onZipFileListener) {
        File directory = FileUtil.getDirectory(str2);
        String str3 = "";
        if (directory == null || !directory.isDirectory() || list == null || list.size() == 0) {
            if (onZipFileListener != null) {
                onZipFileListener.onZipError(-101, "");
                return;
            }
            return;
        }
        try {
            boolean z = true;
            for (File file : list) {
                if (file != null && file.length() > 0) {
                    z = false;
                }
            }
            if (z) {
                if (onZipFileListener != null) {
                    onZipFileListener.onZipError(-101, "no match file");
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        File file2 = FileUtil.getFile(str2 + File.separator + str);
        if (file2 == null) {
            if (onZipFileListener != null) {
                onZipFileListener.onZipError(-103, "");
                return;
            }
            return;
        }
        boolean logEnable = AppUtil.getLogEnable();
        byte[] bArr = new byte[1024];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                try {
                    int i = 100;
                    long length = 0;
                    for (File file3 : list) {
                        if (length >= j2) {
                            i = 101;
                            break;
                        }
                        if (logEnable) {
                            Log.d("HLog", "准备压缩的日志文件 : " + file3.getName() + " 压缩的日志大小 : " + file3.length());
                        }
                        str3 = str3 + "upload file name : " + file3.getName() + " size : " + file3.length() + Weather.SEPARATOR;
                        length += file3.length();
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file3);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                                while (true) {
                                    int i2 = fileInputStream.read(bArr);
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    try {
                                        zipOutputStream.write(bArr, 0, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        Throwable th2 = th;
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                                zipOutputStream.closeEntry();
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused2) {
                                    i = 102;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    zipOutputStream.close();
                    fileOutputStream.close();
                    if (onZipFileListener != null) {
                        if (file2.length() > 0) {
                            onZipFileListener.onZipOk(i, file2);
                        } else {
                            onZipFileListener.onZipError(-105, "zip file is empty");
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        zipOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                try {
                    fileOutputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (Exception e2) {
            if (onZipFileListener != null) {
                onZipFileListener.onZipError(-104, e2.toString());
            }
        }
    }

    private static void deleteDirectoryFiles(File file) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            file.delete();
            return;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        deleteDirectoryFiles(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
        } catch (Exception unused) {
            Log.e("HLog", "delete Directory Files failure !");
        }
    }

    public static void deleteZipFile(String str) {
        File directory = FileUtil.getDirectory(str);
        if (directory == null) {
            return;
        }
        deleteDirectoryFiles(directory);
    }

    public static List<File> getFiles(long j2, long j3, String str, final String str2) {
        long time;
        File[] fileArrListFiles;
        File[] fileArr;
        ArrayList<File> arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH");
        Log.e("FileZipper", "getFiles:" + simpleDateFormat.format(new Date(j2)) + " to " + simpleDateFormat.format(new Date(j3)));
        try {
            time = simpleDateFormat.parse(simpleDateFormat.format(new Date(j2))).getTime();
        } catch (ParseException unused) {
            time = j2;
        }
        File directory = FileUtil.getDirectory(str);
        if (directory != null && (fileArrListFiles = directory.listFiles(new FilenameFilter() { // from class: com.heytap.log.uploader.FileZipper.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str3) {
                if (TextUtils.isEmpty(str3)) {
                    return false;
                }
                return (str3.endsWith(OplusLogConfig.FILE_EXT) || str3.endsWith(OplusLogConfig.OLD_FILE_EXT1) || str3.endsWith(OplusLogConfig.OLD_FILE_EXT2)) && (TextUtils.isEmpty(str2) || str3.startsWith(str2));
            }
        })) != null && fileArrListFiles.length > 0) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                try {
                    String[] strArrSplit = file.getName().split("\\.")[0].split("_");
                    StringBuilder sb = new StringBuilder();
                    fileArr = fileArrListFiles;
                    try {
                        sb.append(strArrSplit[strArrSplit.length - 4]);
                        sb.append("-");
                        sb.append(strArrSplit[strArrSplit.length - 3]);
                        sb.append("-");
                        sb.append(strArrSplit[strArrSplit.length - 2]);
                        sb.append("-");
                        sb.append(strArrSplit[strArrSplit.length - 1]);
                        long time2 = simpleDateFormat.parse(sb.toString()).getTime();
                        if (j2 <= 0 || j3 <= 0 || (time2 >= time && time2 <= j3)) {
                            arrayList.add(file);
                        }
                    } catch (Exception unused2) {
                        Log.e("FileZipper", "zip files exception !");
                    }
                } catch (Exception unused3) {
                    fileArr = fileArrListFiles;
                }
                i++;
                fileArrListFiles = fileArr;
            }
            try {
                final HashMap map = new HashMap();
                for (File file2 : arrayList) {
                    map.put(file2, Long.valueOf(file2.lastModified()));
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.heytap.log.uploader.FileZipper.2
                    @Override // java.util.Comparator
                    public int compare(File file3, File file4) {
                        Long l2 = (Long) map.get(file3);
                        Long l3 = (Long) map.get(file4);
                        if (l2 == null) {
                            l2 = 0L;
                        }
                        if (l3 == null) {
                            l3 = 0L;
                        }
                        return Long.compare(l3.longValue(), l2.longValue());
                    }
                });
            } catch (Exception e2) {
                Log.e("FileZipper", "sort files exception: " + e2.getMessage());
            }
        }
        return arrayList;
    }

    private static String getSuffixUploadInfo(List<File> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        String str = "***********************************\n";
        for (File file : list) {
            str = str + "file name : " + file.getName() + " size : " + file.length() + Weather.SEPARATOR;
        }
        return str;
    }

    public static void makeUploadFiles(long j2, long j3, String str, String str2, String str3, String str4, long j4, OnZipFileListener onZipFileListener) {
        List<File> files = getFiles(j2, j3, str, "");
        if (files == null || files.size() == 0) {
            if (onZipFileListener != null) {
                onZipFileListener.onZipError(-101, "no match file");
                return;
            }
            return;
        }
        try {
            Iterator<File> it = files.iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getName()) && !TextUtils.isEmpty(str2)) {
                    if (next.getName().contains(str2)) {
                        continue;
                    } else {
                        it.remove();
                    }
                }
            }
        } catch (Exception unused) {
        }
        createZip(FileStrategy.makeZipFileName(str4), str3, files, j4, onZipFileListener);
    }

    public static void makeUploadFiles(long j2, long j3, String str, String str2, long j4, OnZipFileListener onZipFileListener) {
        List<File> files = getFiles(j2, j3, str, "");
        if (files != null && files.size() != 0) {
            createZip(FileStrategy.makeZipFileName(str2), str, files, j4, onZipFileListener);
        } else if (onZipFileListener != null) {
            onZipFileListener.onZipError(-101, "no match file");
        }
    }

    public static void makeUploadFiles(long j2, long j3, String str, String str2, String str3, long j4, OnZipFileListener onZipFileListener) {
        List<File> files = getFiles(j2, j3, str, "");
        if (files != null && files.size() != 0) {
            createZip(FileStrategy.makeZipFileName(str3), str2, files, j4, onZipFileListener);
        } else if (onZipFileListener != null) {
            onZipFileListener.onZipError(-101, "no match file");
        }
    }

    public static void makeUploadFiles(String str, long j2, long j3, String str2, String str3, String str4, long j4, OnZipFileListener onZipFileListener) {
        List<File> files = getFiles(j2, j3, str2, "");
        if (files == null || files.size() == 0) {
            if (onZipFileListener != null) {
                onZipFileListener.onZipError(-101, "no match file");
                return;
            }
            return;
        }
        try {
            Iterator<File> it = files.iterator();
            boolean z = true;
            while (it.hasNext()) {
                File next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getName())) {
                    if (!next.getName().contains(str)) {
                        it.remove();
                    }
                }
                if (next != null && next.length() > 0) {
                    z = false;
                }
            }
            if (z) {
                if (onZipFileListener != null) {
                    onZipFileListener.onZipError(-101, "no match file");
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        createZip(FileStrategy.makeZipFileName(str4), str3, files, j4, onZipFileListener);
    }
}
