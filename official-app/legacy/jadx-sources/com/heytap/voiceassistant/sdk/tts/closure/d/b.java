package com.heytap.voiceassistant.sdk.tts.closure.d;

import android.os.Environment;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static String g = Environment.getExternalStorageDirectory().getAbsolutePath();
    public boolean a = false;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8391c = null;
    public RandomAccessFile d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8392e = 10;
    public String f = null;

    public final void b() {
        if (this.a) {
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("handleLogMaxCount | LogMaxCount = ");
            sbA.append(this.f8392e);
            Logger.debug("AudioFileLog", sbA.toString());
            if (TextUtils.isEmpty(this.f)) {
                Logger.debug("AudioFileLog", "handleLogMaxCount | LogCtrlPath is empty");
                return;
            }
            File[] fileArrListFiles = new File(this.f).listFiles(new FilenameFilter() { // from class: com.oplus.aiunit.vision.dfm
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return str.endsWith("_original.pcm");
                }
            });
            int length = fileArrListFiles == null ? 0 : fileArrListFiles.length;
            Logger.debug("AudioFileLog", "handleLogMaxCount | logCount = " + length);
            if (this.f8392e >= length || fileArrListFiles == null) {
                return;
            }
            Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.oplus.aiunit.vision.ifm
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((File) obj).getName().compareTo(((File) obj2).getName());
                }
            });
            for (int i = 0; fileArrListFiles.length - this.f8392e > i; i++) {
                File file = fileArrListFiles[i];
                file.delete();
                Logger.debug("AudioFileLog", "handleLogMaxCount | delete " + file);
            }
        }
    }

    public void c() {
        String str;
        String str2;
        String str3;
        if (this.a) {
            if (this.d != null) {
                Logger.print("AudioFileLog", "open | mOriginalFile not null");
            }
            if (TextUtils.isEmpty(this.f8391c)) {
                StringBuilder sb = new StringBuilder();
                sb.append(g);
                if (TextUtils.isEmpty(this.b)) {
                    str2 = "";
                } else {
                    str2 = File.separator + this.b;
                }
                sb.append(str2);
                this.f = sb.toString();
                try {
                    str3 = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
                } catch (Exception e2) {
                    Logger.error("AudioFileLog", "", e2);
                    str3 = null;
                }
                str = this.f + File.separator + str3 + "_original.pcm";
            } else {
                str = this.f8391c;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Logger.debug("AudioFileLog", "open | originalFilePath = " + str);
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                this.d = new RandomAccessFile(file, "rw");
            } catch (Exception e3) {
                Logger.error("AudioFileLog", "", e3);
            }
        }
    }

    public void a() {
        RandomAccessFile randomAccessFile = this.d;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e2) {
                Logger.error("AudioFileLog", "", e2);
            }
            this.d = null;
        }
        b();
    }

    public void a(int i) {
        if (i < 1) {
            Logger.print("AudioFileLog", "setMaximumNumber | 1 > " + i + ", set to 1");
            i = 1;
        }
        this.f8392e = i;
    }
}
