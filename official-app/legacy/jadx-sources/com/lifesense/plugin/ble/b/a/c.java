package com.lifesense.plugin.ble.b.a;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    public static final String FILE_NAME = "Platform_logFile";
    public static final String TAG = "LogFile";

    public static g a(File file, int i, String str, String str2) {
        return a(file, i, str2);
    }

    public static int b(String str) {
        try {
            Matcher matcher = Pattern.compile("\\(\\d+\\).txt").matcher(str);
            if (!matcher.find()) {
                return 0;
            }
            String strGroup = matcher.group();
            return Integer.parseInt(strGroup.substring(strGroup.indexOf("(") + 1, strGroup.indexOf(")")));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void c(String str) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new d());
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                file.delete();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long g(String str) {
        try {
            Matcher matcher = Pattern.compile("\\w{12}-\\d{8}").matcher(str);
            if (matcher == null || !matcher.find()) {
                return 0L;
            }
            String[] strArrSplit = matcher.group().split("-");
            if (strArrSplit.length >= 2) {
                return Long.parseLong(strArrSplit[1].substring(0, 8));
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str) {
        return Pattern.compile("^\\w{12}-\\d{8}_.*.txt$").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean i(String str) {
        return Pattern.compile(String.format("^.*-\\w{12}-\\d{8}_.*.txt$", new Object[0])).matcher(str).matches();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    private static g a(File file, int i, String... strArr) {
        File file2;
        File[] fileArrA = a(file, strArr);
        File[] fileArr = null;
        File file3 = null;
        if (fileArrA == null || fileArrA.length <= 0) {
            file2 = null;
        } else {
            File[] fileArrA2 = a(fileArrA);
            if (fileArrA2.length > 0) {
                ArrayList arrayList = new ArrayList();
                long j2 = 0;
                int i2 = 0;
                long length = 0;
                for (File file4 : fileArrA2) {
                    long jG = g(file4.getName());
                    if (j2 != jG) {
                        i2++;
                        j2 = jG;
                    }
                    if (file3 == null && a(file4) && a(file4.getName(), strArr)) {
                        file3 = file4;
                    }
                    if ((i2 < i || file3 != null) && ((i2 <= i || file3 == null) && length < 8388608)) {
                        length += file4.length();
                    } else {
                        arrayList.add(file4);
                    }
                }
                File[] fileArr2 = new File[arrayList.size()];
                arrayList.toArray(fileArr2);
                File file5 = file3;
                fileArr = fileArr2;
                file2 = file5;
            } else {
                file2 = null;
            }
        }
        return new g(fileArr, file2);
    }

    private static String a() {
        return com.lifesense.plugin.ble.c.d.fileDateFormat.format(new Date());
    }

    public static String a(String str) {
        String str2;
        String strGroup;
        int iB = b(str);
        Matcher matcher = Pattern.compile("\\(\\d+\\).txt").matcher(str);
        if (matcher.find()) {
            strGroup = matcher.group();
            str2 = String.format("(%s).txt", (iB + 1) + "");
        } else {
            str2 = String.format("(%s).txt", (iB + 1) + "");
            strGroup = ".txt";
        }
        return str.replace(strGroup, str2);
    }

    public static String a(String str, String str2, String str3, String str4) {
        return str + File.separator + String.format("%s-%s_%s.txt", str3, a(), str4);
    }

    public static boolean a(long j2, long j3) {
        return j2 + j3 > 1048576;
    }

    public static boolean a(File file) {
        return a().equals(g(file.getName()) + "");
    }

    private static boolean a(String str, String... strArr) {
        boolean zContains = true;
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2 != null) {
                    zContains &= str.contains(str2);
                }
            }
        }
        return zContains;
    }

    private static File[] a(File file, String... strArr) {
        try {
            return file.listFiles(new f());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static File[] a(File[] fileArr) {
        Arrays.sort(fileArr, new e());
        return fileArr;
    }
}
