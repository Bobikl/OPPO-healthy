package com.heytap.accessory.file.sender;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.heytap.accessory.file.model.SetupRequest;
import com.heytap.accessory.file.utils.c;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String s = "a";
    public long a;
    public int b;
    public Context c;
    public Handler e;
    public com.heytap.accessory.file.a f;
    public FileProviderImpl.c g;
    public SetupRequest h;
    public boolean i;
    public InputStream k;
    public long m;
    public c n;
    public int o;
    public int p;
    public String d = null;
    public Runnable j = new a();
    public boolean l = false;
    public int q = SdkConfig.getFrameworkMaxHeaderLength();
    public int r = SdkConfig.getFrameworkMaxFooterLength();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = a.s;
            StringBuilder sb = new StringBuilder();
            sb.append("sendChunk, , mSendChunkTask: ");
            sb.append(a.this.j);
            sb.append(", mStopRequested:");
            sb.append(a.this.l);
            sb.append(", mChannelId:");
            sb.append(a.this.b);
            sb.append(", transId:");
            sb.append(a.this.h == null ? "null" : Integer.valueOf(a.this.h.l()));
            sb.append(", sender:");
            sb.append(a.this);
            com.heytap.accessory.base.logging.a.a(str, sb.toString());
            a.this.g();
        }
    }

    public a(Context context, long j, int i, FileProviderImpl.c cVar, com.heytap.accessory.file.a aVar, c cVar2) {
        this.c = context;
        this.a = j;
        this.b = i;
        this.g = cVar;
        this.f = aVar;
        this.n = cVar2;
        int iA = com.heytap.accessory.transport.control.c.a(j, i, com.heytap.accessory.file.utils.a.a(j, e(), this.q, this.r));
        this.o = iA;
        this.p = com.heytap.accessory.file.utils.a.b(iA);
        com.heytap.accessory.base.logging.a.a(s, "[sftrack] create sender BinaryDataSender , channelId = " + i + ", class:" + this + ", mChunkLength = " + this.p + " mPackageLength = " + this.o + " mHeaderOffset = " + this.q + " mFooterOffset = " + this.r);
    }

    public int e() {
        c cVar = this.n;
        if (cVar != null) {
            return cVar.a();
        }
        return -1;
    }

    public final synchronized boolean f() {
        boolean z;
        synchronized (this) {
            Uri uriFromFile = Uri.parse(this.d);
            String str = s;
            com.heytap.accessory.base.logging.a.d(str, "sendFile: uri " + this.d);
            if (uriFromFile.getScheme() == null) {
                uriFromFile = Uri.fromFile(new File(uriFromFile.toString()));
            }
            if ("content".equalsIgnoreCase(uriFromFile.getScheme()) || "file".equalsIgnoreCase(uriFromFile.getScheme())) {
                try {
                    this.k = this.c.getContentResolver().openInputStream(uriFromFile);
                    z = true;
                } catch (Exception e) {
                    com.heytap.accessory.base.logging.a.a(s, "startSending() FileNotFoundException", e);
                    com.heytap.accessory.file.utils.a.a(this.g, 2, d());
                    z = false;
                }
            } else {
                com.heytap.accessory.base.logging.a.e(str, "Requested scheme:" + uriFromFile.getScheme() + " is not supported");
            }
            z = false;
        }
        return z;
        return z;
    }

    public void g() {
        boolean zA;
        if (this.l) {
            com.heytap.accessory.base.logging.a.e(s, "Stop Requested.Cancelling send, channelId:" + this.b + ", this:" + this);
            return;
        }
        Buffer bufferObtainExact = BufferPool.obtainExact(this.q + this.o + this.r);
        bufferObtainExact.setPayloadLength(this.o);
        bufferObtainExact.setOffset(this.q);
        byte[] buffer = bufferObtainExact.getBuffer();
        if (this.k == null || this.f == null) {
            com.heytap.accessory.base.logging.a.b(s, "sendChunk() Invalid Params ");
            com.heytap.accessory.file.utils.a.a(this.g, 2, d());
            return;
        }
        if (this.i || this.l) {
            this.e.getLooper().quit();
            com.heytap.accessory.base.logging.a.a(s, "Already completed sending:" + this.i + ", stop requested: " + this.l + ", channelId: " + this.b + ", this:" + this);
            return;
        }
        SetupRequest setupRequest = this.h;
        int iL = setupRequest == null ? -1 : setupRequest.l();
        int i = this.q;
        buffer[i] = 1;
        try {
            int i2 = this.k.read(buffer, i + 1, this.p);
            this.m += (long) i2;
            String str = s;
            com.heytap.accessory.base.logging.a.d(str, "Total " + this.h.h() + " Read " + this.m + " channelId:" + this.b + ", readLen:" + i2 + ", fileName:" + this.h.g() + ", transId:" + iL + ", header: " + ((int) buffer[this.q]) + ", this:" + this);
            if (i2 == -1) {
                com.heytap.accessory.file.utils.a.a(this.g, 2, d());
                com.heytap.accessory.base.logging.a.b(str, "sendChunk() Error in reading");
                return;
            }
            if (this.m > this.h.h()) {
                com.heytap.accessory.base.logging.a.b(str, "mTotalReadBytes is over the file size. quit. ");
                com.heytap.accessory.file.utils.a.a(this.g, 2, d());
                return;
            }
            int i3 = i2 + 1;
            if (this.o == i3) {
                zA = this.f.a(this.a, this.b, bufferObtainExact);
            } else {
                bufferObtainExact.setPayloadLength(i3);
                zA = this.f.a(this.a, this.b, bufferObtainExact);
            }
            if (!zA) {
                com.heytap.accessory.base.logging.a.b(str, "Write Failed.Aborting File Transfer");
                com.heytap.accessory.file.utils.a.a(this.g, 4, d());
                return;
            }
            if (this.m == this.h.h()) {
                com.heytap.accessory.base.logging.a.d(str, "sendChunk Completed Sending " + this.h.h() + "; channelId:" + this.b + ", this:" + this);
                this.i = true;
            }
            if (this.l) {
                com.heytap.accessory.base.logging.a.e(str, "Stop Requested.Cancelling send, channelId:" + this.b + "this:" + this);
                return;
            }
            com.heytap.accessory.base.logging.a.d(str, "sendChunk continue , total: " + this.h.h() + ", already read: " + this.m + ", channelId:" + this.b + ", this:" + this);
            this.e.postDelayed(this.j, (long) com.heytap.accessory.file.utils.a.e(e()));
        } catch (IOException unused) {
            com.heytap.accessory.base.logging.a.b(s, "Error reading file " + this.h.k());
            com.heytap.accessory.file.utils.a.a(this.g, 2, d());
        }
    }

    public void h() {
        this.e.post(this.j);
    }

    public void b() {
        com.heytap.accessory.base.logging.a.c(s, "stop requested channelId:" + this.b + ", class:" + this);
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.j);
            this.e.getLooper().quit();
        }
        this.l = true;
        c();
    }

    public final void c() {
        try {
            InputStream inputStream = this.k;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
            com.heytap.accessory.file.utils.a.a(this.g, 2, d());
        }
        this.k = null;
        com.heytap.accessory.base.logging.a.a(s, "closeOutStream() Done ");
    }

    public final Bundle d() {
        return com.heytap.accessory.file.utils.a.a(this.h.l());
    }

    public boolean a(String str, SetupRequest setupRequest) {
        boolean z;
        synchronized (this) {
            this.d = str;
            this.h = setupRequest;
            HandlerThread handlerThread = new HandlerThread("fileSenderWorker");
            handlerThread.start();
            if (handlerThread.getLooper() != null) {
                this.e = new Handler(handlerThread.getLooper());
            }
            this.m = 0L;
            if (f()) {
                z = true;
            } else {
                com.heytap.accessory.base.logging.a.b(s, "startSending() openStream failed");
                z = false;
            }
        }
        return z;
    }
}
