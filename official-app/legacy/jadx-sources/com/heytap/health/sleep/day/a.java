package com.heytap.health.sleep.day;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.text.TextUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.sleep.snore.bean.Audio;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.md7;
import com.oplus.aiunit.vision.qv8;
import com.oplus.aiunit.vision.us4;
import com.oplus.aiunit.vision.x05;
import com.oplus.aiunit.vision.zi5;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    public static final int LOG_INTERVAL_PACKAGE = 300;
    public static final String k = md7.k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f5704l = md7.k();
    public volatile File a;
    public File b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f5705c;
    public d d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f5706e;
    public long f;
    public int g;
    public AudioRecord h;
    public AudioManager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioManager.AudioRecordingCallback f5707j;

    /* JADX INFO: renamed from: com.heytap.health.sleep.day.a$a, reason: collision with other inner class name */
    public class C0633a extends AudioManager.AudioRecordingCallback {
        public C0633a() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            if (lza.a(list)) {
                a7b.f("AudioRecordManager", "callback onRecordingConfigChanged configs is empty");
                return;
            }
            a7b.f("AudioRecordManager", "callback configs size----------:" + list.size());
            for (int i = 0; i < list.size(); i++) {
                AudioRecordingConfiguration audioRecordingConfiguration = list.get(i);
                a7b.f("AudioRecordManager", "callback clientSilenced:" + audioRecordingConfiguration.isClientSilenced());
                int clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
                if (clientAudioSource == 1) {
                    a7b.f("AudioRecordManager", "callback audioSource MIC");
                } else if (clientAudioSource == 9) {
                    a7b.f("AudioRecordManager", "callback audioSource UNPROCESSED");
                } else {
                    a7b.f("AudioRecordManager", "callback audioSource default:" + clientAudioSource);
                }
                int clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
                if (a.this.h != null) {
                    a7b.f("AudioRecordManager", "callback audioSessionId:" + a.this.h.getAudioSessionId() + "/clientSessionId:" + clientAudioSessionId);
                }
            }
        }
    }

    public static class b {
        public static final a a = new a();
    }

    public class c extends qv8 {
        public int i;

        @SuppressLint({"MissingPermission", "InlinedApi"})
        public c() {
            super("SleepRecord");
            this.i = 0;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x01b0 */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() throws Throwable {
            Throwable th;
            Exception exc;
            StringBuilder sb;
            Throwable th2;
            RandomAccessFile randomAccessFile = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(a.this.b);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(a.this.a);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                        try {
                            DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                            try {
                                a aVar = a.this;
                                aVar.u(dataOutputStream, aVar.g, 8000L, a.this.h.getChannelCount());
                                byte[] bArr = new byte[2048];
                                a7b.f("AudioRecordManager", "thread recording isInterrupted:" + isInterrupted());
                                while (true) {
                                    if (!a.this.f5705c || isInterrupted()) {
                                        break;
                                    }
                                    int i = a.this.h.read(bArr, 0, 2048);
                                    if (i > 0) {
                                        fileOutputStream.write(bArr, 0, i);
                                        fileOutputStream.flush();
                                        dataOutputStream.write(bArr, 0, i);
                                        dataOutputStream.flush();
                                        if (this.i % 300 == 0) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append('[');
                                            for (int i2 = 0; i2 < 20; i2++) {
                                                sb2.append((int) bArr[i2]);
                                                sb2.append(", ");
                                            }
                                            sb2.append(']');
                                            a7b.f("AudioRecordManager", "record array:" + ((Object) sb2));
                                        }
                                        this.i++;
                                        short[] sArrC = us4.c(bArr);
                                        if (a.this.d != null && sArrC != null && a.this.f5705c) {
                                            a.this.d.a(sArrC);
                                        }
                                    } else {
                                        a7b.f("AudioRecordManager", "record read error:" + i);
                                        a.this.f5705c = false;
                                    }
                                }
                                a.this.h.stop();
                                a.this.h.release();
                                fileOutputStream.close();
                                dataOutputStream.close();
                                bufferedOutputStream.close();
                                fileOutputStream2.close();
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(a.this.a, "rw");
                                try {
                                    a aVar2 = a.this;
                                    byte[] bArrL = aVar2.l(aVar2.b.length(), 8000L, a.this.h.getChannelCount());
                                    randomAccessFile2.seek(0L);
                                    randomAccessFile2.write(bArrL);
                                    randomAccessFile2.close();
                                    a.this.b.delete();
                                    a.this.f5705c = false;
                                    a.this.h = null;
                                    a7b.f("AudioRecordManager", "end recording");
                                    try {
                                        dataOutputStream.close();
                                        try {
                                            bufferedOutputStream.close();
                                            try {
                                                fileOutputStream2.close();
                                                try {
                                                    fileOutputStream.close();
                                                    try {
                                                        randomAccessFile2.close();
                                                    } catch (Exception e2) {
                                                        exc = e2;
                                                        sb = new StringBuilder();
                                                        sb.append("run error2:");
                                                        sb.append(exc.getMessage());
                                                        a7b.f("AudioRecordManager", sb.toString());
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    randomAccessFile = randomAccessFile2;
                                                    a7b.f("AudioRecordManager", "run error:" + e.getMessage());
                                                    if (randomAccessFile != null) {
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (Exception e4) {
                                                            exc = e4;
                                                            sb = new StringBuilder();
                                                            sb.append("run error2:");
                                                            sb.append(exc.getMessage());
                                                            a7b.f("AudioRecordManager", sb.toString());
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    randomAccessFile = randomAccessFile2;
                                                    if (randomAccessFile == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                        throw th;
                                                    } catch (Exception e5) {
                                                        a7b.f("AudioRecordManager", "run error2:" + e5.getMessage());
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                randomAccessFile = randomAccessFile2;
                                                try {
                                                    fileOutputStream.close();
                                                    throw th2;
                                                } catch (Throwable th5) {
                                                    th2.addSuppressed(th5);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            Throwable th7 = th6;
                                            randomAccessFile = randomAccessFile2;
                                            try {
                                                fileOutputStream2.close();
                                                throw th7;
                                            } catch (Throwable th8) {
                                                th7.addSuppressed(th8);
                                                throw th7;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        randomAccessFile = randomAccessFile2;
                                        Throwable th10 = th;
                                        try {
                                            bufferedOutputStream.close();
                                            throw th10;
                                        } catch (Throwable th11) {
                                            th10.addSuppressed(th11);
                                            throw th10;
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    randomAccessFile = randomAccessFile2;
                                    Throwable th13 = th;
                                    try {
                                        dataOutputStream.close();
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th13.addSuppressed(th14);
                                        throw th13;
                                    }
                                }
                            } catch (Throwable th15) {
                                th = th15;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                        }
                    } catch (Throwable th17) {
                        th2 = th17;
                        fileOutputStream.close();
                        throw th2;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th18) {
                th = th18;
            }
        }
    }

    public interface d {
        void a(short[] sArr);
    }

    public static List<Audio> m(String str) {
        return md7.i(k, str);
    }

    public static a n() {
        return b.a;
    }

    public void k() {
        if (this.a != null) {
            a7b.f("AudioRecordManager", "deleteShortRecord:" + this.a.getAbsolutePath());
        }
        md7.d(this.a);
    }

    public final byte[] l(long j2, long j3, int i) {
        long j4 = j2 + 36;
        long j5 = 2 * j3 * ((long) i);
        return new byte[]{82, 73, 70, 70, (byte) (j4 & 255), (byte) ((j4 >> 8) & 255), (byte) ((j4 >> 16) & 255), (byte) ((j4 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i, 0, (byte) (j3 & 255), (byte) ((j3 >> 8) & 255), (byte) ((j3 >> 16) & 255), (byte) ((j3 >> 24) & 255), (byte) (j5 & 255), (byte) ((j5 >> 8) & 255), (byte) ((j5 >> 16) & 255), (byte) ((j5 >> 24) & 255), (byte) (i * 2), 0, 16, 0, 100, 97, 116, 97, (byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255)};
    }

    public long o() {
        return this.f;
    }

    @SuppressLint({"MissingPermission"})
    public final void p() {
        this.g = AudioRecord.getMinBufferSize(8000, 16, 2) * 10;
        if (zi5.a()) {
            this.h = new AudioRecord(9, 8000, 16, 2, this.g);
        } else {
            this.h = new AudioRecord(1, 8000, 16, 2, this.g);
        }
        a7b.f("AudioRecordManager", "recordingState1:" + this.h.getRecordingState());
        AudioManager audioManager = (AudioManager) b78.a().getSystemService("audio");
        this.i = audioManager;
        audioManager.registerAudioRecordingCallback(this.f5707j, null);
    }

    public boolean q() {
        return this.f5705c;
    }

    public void r(d dVar) {
        this.d = dVar;
    }

    public boolean s(UserInfo userInfo) {
        a7b.f("AudioRecordManager", "startRecord");
        if (this.f5705c) {
            a7b.f("AudioRecordManager", "Unable to start recording, current status is isRecording");
            return false;
        }
        String str = k;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            this.b = File.createTempFile("recording" + System.currentTimeMillis() + "-", ".pcm", new File(f5704l));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd_HHmmss", Locale.CHINA);
            StringBuilder sb = new StringBuilder();
            sb.append(File.separator);
            sb.append(simpleDateFormat.format(new Date()));
            if (userInfo != null && !TextUtils.isEmpty(userInfo.getBirthday())) {
                int years = LocalDateTime.ofInstant(Instant.ofEpochMilli(x05.i(userInfo.getBirthday(), "yyyy-MM-dd")), ZoneId.systemDefault()).toLocalDate().until((ChronoLocalDate) LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toLocalDate()).getYears();
                sb.append("_");
                sb.append(userInfo.getHeight());
                sb.append("_");
                sb.append(userInfo.getWeight());
                sb.append("_");
                sb.append(years);
                sb.append("_");
                sb.append(userInfo.getSex());
            }
            this.a = new File(str + ((Object) sb) + ".wav");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("wav path:");
            sb2.append(this.a.getAbsolutePath());
            a7b.f("AudioRecordManager", sb2.toString());
            c cVar = this.f5706e;
            if (cVar != null) {
                cVar.interrupt();
                this.f5706e = null;
            }
            this.f = System.currentTimeMillis();
            p();
            this.h.startRecording();
            if (this.h.getRecordingState() == 3) {
                this.f5705c = true;
                c cVar2 = new c();
                this.f5706e = cVar2;
                cVar2.start();
                return true;
            }
            this.f5705c = false;
            a7b.f("AudioRecordManager", "recording state error:" + this.h.getRecordingState());
            return false;
        } catch (Exception e2) {
            a7b.c("AudioRecordManager", "startRecord exception: ", e2);
            return false;
        }
    }

    public void t() {
        a7b.f("AudioRecordManager", "stopRecord");
        this.f5705c = false;
        c cVar = this.f5706e;
        if (cVar != null) {
            cVar.interrupt();
            this.f5706e = null;
        }
        this.i.unregisterAudioRecordingCallback(this.f5707j);
    }

    public final void u(OutputStream outputStream, long j2, long j3, int i) throws IOException {
        byte[] bArrL = l(j2, j3, i);
        outputStream.write(bArrL, 0, bArrL.length);
    }

    public a() {
        this.a = null;
        this.b = null;
        this.f5705c = false;
        this.f5707j = new C0633a();
    }
}
