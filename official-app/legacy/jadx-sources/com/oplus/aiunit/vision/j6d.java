package com.oplus.aiunit.vision;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.health.device.ota.bean.OTAVersion;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class j6d {
    public static boolean a(String str) {
        String strE = e(str);
        StringBuilder sb = new StringBuilder();
        sb.append("otaFileName: ");
        sb.append(strE);
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        String str2 = a04.ROOT_DIR;
        File file = new File(str2, "unzip");
        File file2 = new File(str2, lastPathSegment);
        if (file.exists()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdir();
        }
        boolean z = false;
        if (file2.exists()) {
            try {
                u7m.h(file2, file);
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        if (!file3.isDirectory()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("rename: ");
                            sb2.append(file3.getPath());
                            file3.renameTo(new File(a04.ROOT_DIR, strE));
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Exception e2) {
                a7b.b("OTADownloadHelp", e2.getMessage());
            }
        }
        if (z) {
            ld7.i(file2);
        }
        if (file.exists()) {
            ld7.i(file);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("stop to actionAfterDownload with result: ");
        sb3.append(z);
        return z;
    }

    public static void b(String str) {
        try {
            File fileC = c(str);
            if (fileC != null && fileC.exists()) {
                fileC.delete();
            }
        } catch (Exception e2) {
            a7b.b("OTADownloadHelp", e2.getMessage());
        }
    }

    public static File c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(a04.ROOT_DIR, e(str));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    @Nullable
    public static File d(String str) {
        File fileC = c(str);
        if (fileC == null || !fileC.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("otaUpdate locafile = ");
        sb.append(fileC.getAbsolutePath());
        return fileC;
    }

    public static String e(String str) {
        return yuk.b(str) + ".bin";
    }

    public static boolean f(@Nullable OTAVersion oTAVersion) {
        if (oTAVersion == null) {
            a7b.b("OTADownloadHelp", "updateOTAFileVersion with otaVersion is null");
            return false;
        }
        String strE = e(oTAVersion.firmwareUrl);
        try {
            m6d m6dVar = new m6d();
            m6dVar.a = 1;
            m6dVar.b = oTAVersion.otaVersion;
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(a04.ROOT_DIR, strE), "r");
            m6dVar.d = randomAccessFile;
            m6dVar.f13962c = randomAccessFile.length();
            ArrayList arrayList = new ArrayList();
            oTAVersion.fileList = arrayList;
            arrayList.add(m6dVar);
            return true;
        } catch (Exception e2) {
            a7b.b("OTADownloadHelp", e2.getMessage());
            return false;
        }
    }
}
