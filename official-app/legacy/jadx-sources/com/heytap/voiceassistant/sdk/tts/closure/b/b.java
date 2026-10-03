package com.heytap.voiceassistant.sdk.tts.closure.b;

import android.content.Context;
import android.media.AudioTrack;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8359c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8360e;
    public int f;
    public MemoryFile g = null;
    public String h = "";
    public int i = 3145728;
    public volatile long k = 0;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f8363n = null;
    public a o = null;
    public byte[] p = null;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public volatile boolean t = false;
    public String u = null;
    public int v = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f8362l = 0;
    public final ArrayList<a> a = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f8361j = 0;

    public static class a {
        public long a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8364c;
        public int d;

        public a(long j2, long j3, int i, int i2) {
            this.a = j2;
            this.b = j3;
            this.f8364c = i;
            this.d = i2;
        }
    }

    public b(Context context, String str, int i, boolean z) {
        this.f = 0;
        this.f8359c = context;
        this.b = str;
        this.d = z;
        this.f8360e = i;
        this.f = (int) ((((double) i) * 16.0d) / 8000.0d);
    }

    public a a() {
        if (this.f8363n == null) {
            return null;
        }
        long j2 = this.k - ((long) (this.r - this.q));
        a aVar = this.f8363n;
        if (j2 >= aVar.a && j2 <= aVar.b) {
            return aVar;
        }
        synchronized (this.a) {
            for (int i = this.m; this.a.size() > i; i++) {
                a aVar2 = this.a.get(i);
                this.f8363n = aVar2;
                if (j2 >= aVar2.a && j2 <= aVar2.b) {
                    this.m = i;
                    return aVar2;
                }
            }
            return null;
        }
    }

    public int b() {
        if (this.f8361j <= 0) {
            return 0;
        }
        int i = (int) (((this.k - ((long) (this.r - this.q))) * ((long) this.f8362l)) / this.f8361j);
        if (this.s < i) {
            this.s = i;
        }
        return this.s;
    }

    public void c() {
        this.k = 0L;
        this.f8363n = null;
        if (this.a.size() > 0) {
            this.m = 0;
            this.f8363n = this.a.get(0);
        }
    }

    public boolean d() {
        if (this.d) {
            return true;
        }
        return this.f8362l == 100 && this.k >= this.f8361j && this.q >= this.r;
    }

    public boolean e() {
        StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("saveToLocal | mTotalSize = ");
        sbA.append(this.f8361j);
        sbA.append(", IsLogAudio = ");
        sbA.append(this.t);
        sbA.append(", AudioLogPath = ");
        sbA.append(this.u);
        sbA.append(", AudioLogMaxCount = ");
        sbA.append(this.v);
        Logger.debug("PcmBuffer", sbA.toString());
        if (!this.t) {
            return false;
        }
        if (HeytapTtsEngine.getTtsLifeCycleListener() != null) {
            HeytapTtsEngine.getTtsLifeCycleListener().notifyAudioSize(this.b, String.valueOf(this.f8361j));
        }
        com.heytap.voiceassistant.sdk.tts.closure.d.b bVar = new com.heytap.voiceassistant.sdk.tts.closure.d.b();
        boolean z = true;
        bVar.a = true;
        if (TextUtils.isEmpty(this.u)) {
            bVar.b = "com.heytap.voice.assistant.sdk.tts";
        } else {
            bVar.f8391c = this.u;
        }
        bVar.a(this.v);
        bVar.c();
        MemoryFile memoryFile = this.g;
        long j2 = this.f8361j;
        if (memoryFile == null) {
            z = false;
        } else {
            try {
                byte[] bArr = new byte[1024];
                int i = 0;
                while (true) {
                    long j3 = i;
                    if (j3 >= j2) {
                        break;
                    }
                    long j4 = j2 - j3;
                    if (j4 > 1024) {
                        j4 = 1024;
                    }
                    int i2 = (int) j4;
                    memoryFile.readBytes(bArr, i, 0, i2);
                    RandomAccessFile randomAccessFile = bVar.d;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.write(bArr, 0, i2);
                        } catch (Exception e2) {
                            Logger.error("AudioFileLog", "", e2);
                        }
                    }
                    i += i2;
                }
            } catch (Exception e3) {
                Logger.error("PcmBuffer", "", e3);
                z = false;
            }
        }
        bVar.a();
        if (z) {
            this.t = false;
        }
        return z;
    }

    public void finalize() throws Throwable {
        Logger.print("PcmBuffer", "deleteFile");
        try {
            MemoryFile memoryFile = this.g;
            if (memoryFile != null) {
                memoryFile.close();
                this.g = null;
            }
            File file = new File(this.h);
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e2) {
            Logger.error("PcmBuffer", "", e2);
        }
        super.finalize();
    }

    public void a(AudioTrack audioTrack, int i) throws IOException {
        int iWrite;
        if (this.q >= this.r) {
            if (this.p == null) {
                this.p = new byte[i * 10];
            }
            int length = this.p.length;
            int i2 = (int) (this.f8361j - this.k);
            if (i2 < length) {
                length = i2;
            }
            this.g.readBytes(this.p, (int) this.k, 0, length);
            this.k += (long) length;
            this.q = 0;
            this.r = length;
        }
        int i3 = this.r;
        int i4 = this.q;
        int i5 = i3 - i4;
        int i6 = i * 2;
        if (i6 > i5) {
            i = i5;
        }
        int iWrite2 = audioTrack.write(this.p, i4, i);
        if (iWrite2 <= 0) {
            Logger.print("PcmBuffer", "write data ret = " + iWrite2);
        }
        this.q += i;
        if (!d() || (iWrite = audioTrack.write(new byte[i6], 0, i6)) > 0) {
            return;
        }
        Logger.print("PcmBuffer", "write blank data ret = " + iWrite);
    }
}
