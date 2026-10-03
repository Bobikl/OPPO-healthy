package com.oplus.aiunit.vision;

import android.media.MediaPlayer;
import android.text.TextUtils;
import com.heytap.health.sleep.snore.bean.Audio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class md7 {
    public static final String AUDIO_EDIT_FOLDER = "/edit";
    public static final String AUDIO_SECRET_FOLDER = "/secret";
    public static final String SAVE_AUDIO_FOLDER = "/audio";
    public static String sDataRootPath = b78.a().getFilesDir().getAbsolutePath();

    public static boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        a7b.f(ld7.TAG, "filePath is empty");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2 A[Catch: IOException -> 0x00ee, TRY_LEAVE, TryCatch #7 {IOException -> 0x00ee, blocks: (B:63:0x00ea, B:67:0x00f2), top: B:76:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static short[] b(Audio audio) throws Throwable {
        FileInputStream fileInputStream;
        StringBuilder sb;
        File file = new File(audio.getPath());
        FileInputStream fileInputStream2 = null;
        try {
            if (!file.exists()) {
                a7b.b(ld7.TAG, "covertAudio2Arr file is not exists");
                return null;
            }
            try {
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        int i = 0;
                        while (true) {
                            int i2 = fileInputStream3.read(bArr);
                            if (i2 <= 0) {
                                break;
                            }
                            i += i2;
                        }
                        byte[] bArr2 = new byte[i];
                        int i3 = fileInputStream.read(bArr2);
                        byte[] bArr3 = new byte[i3];
                        System.arraycopy(bArr2, 0, bArr3, 0, i3);
                        short[] sArrC = us4.c(bArr3);
                        try {
                            fileInputStream3.close();
                            fileInputStream.close();
                        } catch (IOException e2) {
                            a7b.b(ld7.TAG, "covertAudio2Arr e3:" + e2.getMessage());
                        }
                        return sArrC;
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream3;
                        a7b.b(ld7.TAG, "covertAudio2Arr e1:" + e.getMessage());
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e4) {
                                e = e4;
                                sb = new StringBuilder();
                                sb.append("covertAudio2Arr e3:");
                                sb.append(e.getMessage());
                                a7b.b(ld7.TAG, sb.toString());
                                return new short[1];
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return new short[1];
                    } catch (IOException e5) {
                        e = e5;
                        fileInputStream2 = fileInputStream3;
                        a7b.b(ld7.TAG, "covertAudio2Arr e2:" + e.getMessage());
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e6) {
                                e = e6;
                                sb = new StringBuilder();
                                sb.append("covertAudio2Arr e3:");
                                sb.append(e.getMessage());
                                a7b.b(ld7.TAG, sb.toString());
                                return new short[1];
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return new short[1];
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream3;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            } catch (IOException e7) {
                                a7b.b(ld7.TAG, "covertAudio2Arr e3:" + e7.getMessage());
                            }
                        } else if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e8) {
                    e = e8;
                    fileInputStream = null;
                } catch (IOException e9) {
                    e = e9;
                    fileInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                }
            } catch (FileNotFoundException e10) {
                e = e10;
                fileInputStream = null;
            } catch (IOException e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (fileInputStream2 != null) {
            fileInputStream2.close();
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } else if (fileInputStream != null) {
            fileInputStream.close();
        }
        throw th;
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static void d(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        file.delete();
    }

    public static void e(long j2, String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.getName().contains(".mp3") && file2.lastModified() / 1000 < j2) {
                    file2.delete();
                }
            }
        }
    }

    public static void f() {
        a7b.f(ld7.TAG, "deleteSnoreAudio");
        String strK = k();
        String strG = g();
        long epochSecond = LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
        long jM = m();
        long jN = n();
        if (epochSecond < jM) {
            e(jN, strK);
            e(jN, strG);
        } else {
            e(jM, strK);
            e(jM, strG);
        }
    }

    public static String g() {
        return l() + SAVE_AUDIO_FOLDER + AUDIO_EDIT_FOLDER;
    }

    public static long h(String str) {
        long duration = 0;
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(str);
            mediaPlayer.prepare();
            duration = mediaPlayer.getDuration();
        } catch (IOException e2) {
            a7b.c(ld7.TAG, "exception: ", e2);
        }
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return duration / 1000;
    }

    public static List<Audio> i(String str, String str2) {
        Audio audioF;
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.getName().endsWith(str2) && (audioF = ak0.f(file.getAbsolutePath())) != null) {
                arrayList.add(audioF);
            }
        }
        return arrayList;
    }

    public static String j() {
        return l() + SAVE_AUDIO_FOLDER + AUDIO_SECRET_FOLDER;
    }

    public static String k() {
        return l() + SAVE_AUDIO_FOLDER;
    }

    public static String l() {
        return sDataRootPath;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.time.ZonedDateTime] */
    public static long m() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).withHour(20).withMinute(0).withSecond(0).toEpochSecond();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.time.ZonedDateTime] */
    public static long n() {
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).plusDays(-1L).withHour(20).withMinute(0).withSecond(0).toEpochSecond();
    }
}
