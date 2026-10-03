package com.heytap.voiceassistant.sdk.tts.closure.b;

import android.content.Context;
import android.media.AudioTrack;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.HeytapTtsEngine;
import com.heytap.voiceassistant.sdk.tts.audio.BufferParagraphInfo;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class e {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f8369c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8370e;
    public int f;
    public MemoryFile g = null;
    public String h = "";
    public int i = 23040000;
    public volatile long k = 0;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f8373n = false;
    public a o = null;
    public a p = null;
    public byte[] q = null;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public volatile boolean u = false;
    public String v = null;
    public int w = 10;
    public final List<BufferParagraphInfo> x = new CopyOnWriteArrayList();
    public int y = -1;
    public int z = 0;
    public volatile boolean A = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f8372l = 0;
    public final ArrayList<a> a = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f8371j = 0;

    public static class a {
        public long a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8374c;

        public a(long j2, long j3, int i, int i2) {
            this.a = j2;
            this.b = j3;
            this.f8374c = i2;
        }
    }

    public e(Context context, String str, int i, boolean z) {
        this.f = 0;
        this.f8369c = context;
        this.b = str;
        this.d = z;
        this.f8370e = i;
        this.f = (int) ((((double) i) * 16.0d) / 8000.0d);
    }

    public BufferParagraphInfo a(long j2) {
        BufferParagraphInfo bufferParagraphInfo;
        if (!this.A && this.z == 0 && !this.x.isEmpty()) {
            this.A = true;
            return this.x.get(0);
        }
        int i = this.z;
        if (i < this.x.size() && this.x.get(i).paraLength > j2) {
            return null;
        }
        do {
            int i2 = this.z + 1;
            this.z = i2;
            if (i2 >= this.x.size()) {
                return null;
            }
            bufferParagraphInfo = this.x.get(this.z);
        } while (bufferParagraphInfo.paraLength <= j2);
        return bufferParagraphInfo;
    }

    public int b() {
        if (this.f8371j <= 0) {
            return 0;
        }
        int i = (int) (((this.k - ((long) (this.s - this.r))) * ((long) this.f8372l)) / this.f8371j);
        if (this.t < i) {
            this.t = i;
        }
        return this.t;
    }

    public void c() {
        this.k = 0L;
        this.o = null;
        if (this.a.size() > 0) {
            this.m = 0;
            this.o = this.a.get(0);
        }
    }

    public boolean d() {
        if (this.d) {
            return true;
        }
        return this.f8372l == 100 && this.k >= this.f8371j && this.r >= this.s && this.f8373n;
    }

    public boolean e() {
        StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("saveToLocal | mTotalSize = ");
        sbA.append(this.f8371j);
        sbA.append(", IsLogAudio = ");
        sbA.append(this.u);
        sbA.append(", AudioLogPath = ");
        sbA.append(this.v);
        sbA.append(", AudioLogMaxCount = ");
        sbA.append(this.w);
        Logger.debug("StreamPcmBuffer", sbA.toString());
        if (!this.u) {
            return false;
        }
        if (HeytapTtsEngine.getsStreamTtsLifeCycleListener() != null) {
            HeytapTtsEngine.getsStreamTtsLifeCycleListener().notifyAudioSize(this.b, String.valueOf(this.f8371j));
        }
        com.heytap.voiceassistant.sdk.tts.closure.d.b bVar = new com.heytap.voiceassistant.sdk.tts.closure.d.b();
        boolean z = true;
        bVar.a = true;
        if (TextUtils.isEmpty(this.v)) {
            bVar.b = "com.heytap.voice.assistant.sdk.tts";
        } else {
            bVar.f8391c = this.v;
        }
        bVar.a(this.w);
        bVar.c();
        MemoryFile memoryFile = this.g;
        long j2 = this.f8371j;
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
                Logger.error("StreamPcmBuffer", "", e3);
                z = false;
            }
        }
        bVar.a();
        if (z) {
            this.u = false;
        }
        return z;
    }

    public void finalize() throws Throwable {
        Logger.print("StreamPcmBuffer", "deleteFile");
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
            Logger.error("StreamPcmBuffer", "", e2);
        }
        super.finalize();
    }

    public a a() {
        if (this.o == null) {
            return null;
        }
        long j2 = this.k - ((long) (this.s - this.r));
        a aVar = this.o;
        if (j2 >= aVar.a && j2 <= aVar.b) {
            return aVar;
        }
        synchronized (this.a) {
            for (int i = this.m; this.a.size() > i; i++) {
                a aVar2 = this.a.get(i);
                this.o = aVar2;
                if (j2 >= aVar2.a && j2 <= aVar2.b) {
                    this.m = i;
                    return aVar2;
                }
            }
            return null;
        }
    }

    public void a(AudioTrack audioTrack, int i) throws IOException {
        int iWrite;
        if (this.r >= this.s) {
            if (this.q == null) {
                this.q = new byte[i * 10];
            }
            int length = this.q.length;
            int i2 = (int) (this.f8371j - this.k);
            if (i2 < length) {
                length = i2;
            }
            this.g.readBytes(this.q, (int) this.k, 0, length);
            this.k += (long) length;
            this.r = 0;
            this.s = length;
        }
        int i3 = this.s;
        int i4 = this.r;
        int i5 = i3 - i4;
        int i6 = i * 2;
        if (i6 > i5) {
            i = i5;
        }
        int iWrite2 = audioTrack.write(this.q, i4, i);
        if (iWrite2 <= 0) {
            Logger.print("StreamPcmBuffer", "write data ret = " + iWrite2);
        }
        this.r += i;
        if (!d() || (iWrite = audioTrack.write(new byte[i6], 0, i6)) > 0) {
            return;
        }
        Logger.print("StreamPcmBuffer", "write blank data ret = " + iWrite);
    }
}
