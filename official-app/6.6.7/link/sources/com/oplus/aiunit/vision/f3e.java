package com.oplus.aiunit.vision;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class f3e {
    public static File a(String str) throws IOException {
        File file = new File(str);
        b(file);
        file.createNewFile();
        return file;
    }

    public static void b(File file) {
        if (file == null) {
            return;
        }
        try {
            c(file);
        } catch (StackOverflowError e) {
            g3e.b("FileUtils", "StackOverflowError = " + e.getMessage());
        }
    }

    public static void c(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            file.delete();
            return;
        }
        for (File file2 : fileArrListFiles) {
            c(file2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        com.oplus.aiunit.vision.g3e.b("FileUtils", "e = " + r3.getMessage());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oplus.aiunit.vision.f3e.d():java.lang.String");
    }
}
