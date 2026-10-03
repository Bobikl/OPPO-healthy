package com.lifesense.android.bluetooth.core.business.log.report;

import com.heytap.health.bitmap.BitmapProviderService;
import com.lifesense.android.bluetooth.core.tools.f;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static final String FILE_NAME = "Platform_logFile";
    public static final String TAG = "LogFile";

    public static class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            boolean zI = c.i(file.getName());
            if (zI) {
                return zI;
            }
            return file.getName().indexOf("LSBLE-") == 0;
        }
    }

    public static class b implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jF = c.f(file.getName());
            long jF2 = c.f(file2.getName());
            if (jF != jF2) {
                if (jF < jF2) {
                    return 1;
                }
                return jF == jF2 ? 0 : -1;
            }
            int iE = c.e(file.getName());
            int iE2 = c.e(file2.getName());
            if (iE < iE2) {
                return 1;
            }
            return iE == iE2 ? 0 : -1;
        }
    }

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.business.log.report.c$c, reason: collision with other inner class name */
    public static class C0825c implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return c.h(file.getName());
        }
    }

    public static class d {
        public File[] a;
        public File b;

        public d(File[] fileArr, File file) {
            this.a = fileArr;
            this.b = file;
        }
    }

    public static d a(File file, int i, String str, String str2) {
        return a(file, i, str2);
    }

    public static void d(String str) {
        try {
            File[] fileArrListFiles = new File(str).listFiles(new a());
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

    public static int e(String str) {
        try {
            Matcher matcher = Pattern.compile("\\(\\d+\\).txt").matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group();
                return Integer.parseInt(strGroup.substring(strGroup.indexOf("(") + 1, strGroup.indexOf(")")));
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static long f(String str) {
        try {
            Matcher matcher = Pattern.compile("\\w{12}-\\d{8}").matcher(str);
            if (matcher != null && matcher.find()) {
                String[] strArrSplit = matcher.group().split("-");
                if (strArrSplit.length >= 2) {
                    return Long.parseLong(strArrSplit[1].substring(0, 8));
                }
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    public static String g(String str) {
        String str2;
        String strGroup;
        int iE = e(str);
        Matcher matcher = Pattern.compile("\\(\\d+\\).txt").matcher(str);
        if (matcher.find()) {
            strGroup = matcher.group();
            str2 = String.format("(%s).txt", (iE + 1) + "");
        } else {
            str2 = String.format("(%s).txt", (iE + 1) + "");
            strGroup = ".txt";
        }
        return str.replace(strGroup, str2);
    }

    public static boolean h(String str) {
        return Pattern.compile("^\\w{12}-\\d{8}_.*.txt$").matcher(str).matches();
    }

    public static boolean i(String str) {
        return Pattern.compile(String.format("^.*-\\w{12}-\\d{8}_.*.txt$", new Object[0])).matcher(str).matches();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    public static d a(File file, int i, String... strArr) {
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
                    long jF = f(file4.getName());
                    if (j2 != jF) {
                        i2++;
                        j2 = jF;
                    }
                    if (file3 == null && a(file4) && a(file4.getName(), strArr)) {
                        file3 = file4;
                    }
                    if ((i2 < i || file3 != null) && ((i2 <= i || file3 == null) && length < BitmapProviderService.BITMAP_MAX_SIZE)) {
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
        return new d(fileArr, file2);
    }

    public static String a() {
        return f.fileDateFormat.format(new Date());
    }

    public static String a(String str, String str2, String str3, String str4) {
        return str + File.separator + String.format("%s-%s_%s.txt", str3, a(), str4);
    }

    public static boolean a(long j2, long j3) {
        return j2 + j3 > 1048576;
    }

    public static boolean a(File file) {
        return a().equals(f(file.getName()) + "");
    }

    public static boolean a(String str, String... strArr) {
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

    public static File[] a(File file, String... strArr) {
        try {
            return file.listFiles(new C0825c());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static File[] a(File[] fileArr) {
        Arrays.sort(fileArr, new b());
        return fileArr;
    }
}
