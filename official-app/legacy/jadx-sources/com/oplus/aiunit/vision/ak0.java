package com.oplus.aiunit.vision;

import com.heytap.health.sleep.snore.bean.Audio;
import com.heytap.health.sleep.snore.bean.FragmentInfoBean;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ak0 {
    public static byte[] a(byte[] bArr, float f) {
        for (int i = 0; i < bArr.length; i += 2) {
            int i2 = i + 1;
            byte[] bArrB = us4.b((short) Math.max(Math.min((int) (us4.a(bArr[i2], bArr[i]) * f), 32767), -32768));
            bArr[i2] = bArrB[0];
            bArr[i] = bArrB[1];
        }
        return bArr;
    }

    public static void b(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, int i) {
        byte[] bArr = new byte[2048];
        int i2 = 0;
        while (true) {
            try {
                int i3 = randomAccessFile.read(bArr);
                if (i3 == -1) {
                    return;
                }
                randomAccessFile2.write(bArr, 0, i3);
                i2 += i3;
                int i4 = i - i2;
                if (i4 <= 0) {
                    return;
                }
                if (i4 < bArr.length) {
                    bArr = new byte[i4];
                }
            } catch (Exception e2) {
                a7b.b("AudioEditUtil", e2.toString());
                return;
            }
        }
    }

    public static void c(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2, int i, float f) {
        byte[] bArr = new byte[2048];
        int i2 = 0;
        while (true) {
            try {
                int i3 = randomAccessFile.read(bArr);
                if (i3 == -1) {
                    return;
                }
                randomAccessFile2.write(a(bArr, f), 0, i3);
                i2 += i3;
                int i4 = i - i2;
                if (i4 <= 0) {
                    return;
                }
                if (i4 < bArr.length) {
                    bArr = new byte[i4];
                }
            } catch (Exception e2) {
                a7b.b("AudioEditUtil", e2.toString());
                return;
            }
        }
    }

    public static void d(byte[] bArr, RandomAccessFile randomAccessFile) {
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(bArr);
        } catch (Exception e2) {
            a7b.b("AudioEditUtil", e2.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static synchronized List<Audio> e(Audio audio, List<FragmentInfoBean> list) {
        ArrayList arrayList;
        String str;
        String str2;
        arrayList = new ArrayList();
        String path = audio.getPath();
        int sampleRate = audio.getSampleRate();
        int channel = audio.getChannel();
        int bitNum = audio.getBitNum();
        ?? r5 = 0;
        Audio audioF = null;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(path, "rw");
                try {
                    for (FragmentInfoBean fragmentInfoBean : list) {
                        long cutStartTime = fragmentInfoBean.getCutStartTime();
                        long cutEndTime = fragmentInfoBean.getCutEndTime();
                        String absolutePath = fragmentInfoBean.getAbsolutePath();
                        md7.c(fragmentInfoBean.getPerFilePath());
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile(absolutePath, "rw");
                        int iG = g(cutStartTime, sampleRate, channel, bitNum);
                        int iG2 = g(cutEndTime, sampleRate, channel, bitNum) - iG;
                        d(h(iG2, sampleRate, channel, bitNum), randomAccessFile3);
                        randomAccessFile2.seek(iG + 44);
                        if (zi5.a()) {
                            c(randomAccessFile2, randomAccessFile3, iG2, 15.8f);
                        } else {
                            b(randomAccessFile2, randomAccessFile3, iG2);
                        }
                        randomAccessFile3.close();
                        audioF = f(absolutePath);
                        if (audioF != null) {
                            audioF.setStart(fragmentInfoBean.getSnoreBeginUnix());
                            audioF.setEnd(fragmentInfoBean.getSnoreEndUnix());
                            arrayList.add(audioF);
                        }
                    }
                    try {
                        randomAccessFile2.close();
                        r5 = audioF;
                    } catch (IOException e2) {
                        str = "AudioEditUtil";
                        str2 = "cutAudio error2:" + e2.getMessage();
                        a7b.b(str, str2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    randomAccessFile = randomAccessFile2;
                    a7b.b("AudioEditUtil", "cutAudio error:" + e.getMessage());
                    r5 = randomAccessFile;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            r5 = randomAccessFile;
                        } catch (IOException e4) {
                            str = "AudioEditUtil";
                            str2 = "cutAudio error2:" + e4.getMessage();
                            a7b.b(str, str2);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r5 = randomAccessFile2;
                    if (r5 != 0) {
                        try {
                            r5.close();
                        } catch (IOException e5) {
                            a7b.b("AudioEditUtil", "cutAudio error2:" + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
        return arrayList;
    }

    public static synchronized Audio f(String str) {
        try {
            if (!md7.a(str)) {
                a7b.f("AudioEditUtil", "file does not exist");
                return null;
            }
            try {
                File file = new File(str);
                if (file.length() >= 1000) {
                    return Audio.createAudioFromFile(file);
                }
                a7b.b("AudioEditUtil", "The file is less than 1KB");
                md7.d(file);
                return null;
            } catch (Exception e2) {
                a7b.b("AudioEditUtil", "exception: " + e2.getMessage() + "/path:" + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int g(float f, int i, int i2, int i3) {
        int i4 = i3 / 8;
        int i5 = (int) (f * i * i2 * i4);
        int i6 = i4 * i2;
        return (i5 / i6) * i6;
    }

    public static byte[] h(long j2, int i, int i2, int i3) throws IOException {
        long j3 = 36 + j2;
        long j4 = ((((long) i) * ((long) i2)) * ((long) i3)) / 8;
        return new byte[]{82, 73, 70, 70, (byte) (j3 & 255), (byte) ((j3 >> 8) & 255), (byte) ((j3 >> 16) & 255), (byte) ((j3 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i2, 0, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), (byte) (j4 & 255), (byte) ((j4 >> 8) & 255), (byte) ((j4 >> 16) & 255), (byte) ((j4 >> 24) & 255), (byte) ((i2 * 16) / 8), 0, 16, 0, 100, 97, 116, 97, (byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255)};
    }
}
