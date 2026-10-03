package com.oplus.aiunit.vision;

import com.heytap.health.protocol.workout.WorkoutProto$VoicePackDataItem;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class c3l {
    public static final String a = "com.oplus.aiunit.vision.c3l";

    @Nullable
    public final String a(@Nullable WorkoutProto$VoicePackDataItem workoutProto$VoicePackDataItem) {
        if (workoutProto$VoicePackDataItem == null) {
            return null;
        }
        String voicePackName = workoutProto$VoicePackDataItem.getVoicePackName();
        int version = workoutProto$VoicePackDataItem.getVersion();
        if (voicePackName == null || voicePackName.isEmpty() || version <= 0) {
            return null;
        }
        return a3l.a(voicePackName, version);
    }

    public void b(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        a7b.m(a, "delete file failed: " + file.getAbsolutePath());
    }

    @Nullable
    public final String c(String str, @Nullable String str2) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String strReplace = str.replace("\\", "/");
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        if (strReplace.isEmpty()) {
            return null;
        }
        if (str2 != null && !str2.isEmpty() && !strReplace.equals(str2)) {
            if (!strReplace.startsWith(str2 + "/")) {
                return str2 + "/" + strReplace;
            }
        }
        return strReplace;
    }

    public boolean d(@NotNull File file, @Nullable WorkoutProto$VoicePackDataItem workoutProto$VoicePackDataItem) {
        File fileG = n2l.g(b78.a());
        if (!fileG.isDirectory() && !fileG.mkdirs()) {
            a7b.m(a, "unzipVoicePack mkdir failed: " + fileG.getAbsolutePath());
            return false;
        }
        try {
            String canonicalPath = fileG.getCanonicalPath();
            String str = canonicalPath + File.separator;
            String strA = a(workoutProto$VoicePackDataItem);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    int i = 0;
                    while (nextEntry != null) {
                        String strC = c(nextEntry.getName(), strA);
                        if (strC == null || strC.isEmpty()) {
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            File file2 = new File(fileG, strC);
                            String canonicalPath2 = file2.getCanonicalPath();
                            if (canonicalPath2.equals(canonicalPath) || canonicalPath2.startsWith(str)) {
                                if (!nextEntry.isDirectory()) {
                                    File parentFile = file2.getParentFile();
                                    if (parentFile == null || parentFile.isDirectory() || parentFile.mkdirs()) {
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 65536);
                                        try {
                                            byte[] bArr = new byte[65536];
                                            while (true) {
                                                int i2 = zipInputStream.read(bArr);
                                                if (i2 <= 0) {
                                                    break;
                                                }
                                                bufferedOutputStream.write(bArr, 0, i2);
                                                try {
                                                    zipInputStream.close();
                                                } catch (Throwable th) {
                                                    th.addSuppressed(th);
                                                }
                                                throw th;
                                            }
                                            bufferedOutputStream.close();
                                            i++;
                                        } catch (Throwable th2) {
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        a7b.m(a, "create parent dir failed: " + parentFile.getAbsolutePath());
                                        nextEntry = zipInputStream.getNextEntry();
                                    }
                                } else if (!file2.isDirectory() && !file2.mkdirs()) {
                                    a7b.m(a, "create dir failed: " + file2.getAbsolutePath());
                                }
                                zipInputStream.closeEntry();
                                nextEntry = zipInputStream.getNextEntry();
                            } else {
                                a7b.m(a, "skip illegal zip entry: " + nextEntry.getName());
                                nextEntry = zipInputStream.getNextEntry();
                            }
                        }
                    }
                    zipInputStream.close();
                    return i > 0;
                } catch (Throwable th4) {
                    zipInputStream.close();
                    throw th4;
                }
            } catch (IOException e2) {
                a7b.n(a, "unzipVoicePack failed: " + file.getAbsolutePath(), e2);
                return false;
            }
        } catch (IOException e3) {
            a7b.n(a, "unzipVoicePack get target canonical failed", e3);
            return false;
        }
    }
}
