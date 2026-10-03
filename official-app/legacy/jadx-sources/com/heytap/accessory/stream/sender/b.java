package com.heytap.accessory.stream.sender;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.heytap.accessory.base.d;
import com.heytap.accessory.stream.model.SetupRequest;
import com.heytap.accessory.stream.utils.c;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferPool;
import com.oplus.aiunit.vision.nlk;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String t = "b";
    public long a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2755c;
    public InputStream d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f2756e;
    public HandlerC0268b f;
    public com.heytap.accessory.stream.a g;
    public StreamProviderImpl.c h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Buffer f2757j;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f2759n;
    public int o;
    public int p;
    public SetupRequest s;
    public Runnable k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2758l = false;
    public int q = SdkConfig.getFrameworkMaxHeaderLength();
    public int r = SdkConfig.getFrameworkMaxFooterLength();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.a(b.t, "sendChunk, , mSendChunkTask: " + b.this.k + ", mStopRequested:" + b.this.f2758l + ", mChannelId:" + b.this.f2755c + ", transId:" + b.this.b);
            b.this.g();
        }
    }

    /* JADX INFO: renamed from: com.heytap.accessory.stream.sender.b$b, reason: collision with other inner class name */
    public final class HandlerC0268b extends Handler {
        public HandlerC0268b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                b.this.f();
            } else {
                super.handleMessage(message);
            }
        }
    }

    public b(long j2, int i, int i2, InputStream inputStream, StreamProviderImpl.c cVar, com.heytap.accessory.stream.a aVar, c cVar2) {
        this.a = j2;
        this.b = i;
        this.f2755c = i2;
        this.d = inputStream;
        this.h = cVar;
        this.g = aVar;
        this.f2759n = cVar2;
        int iA = com.heytap.accessory.transport.control.c.a(j2, i2, com.heytap.accessory.stream.utils.b.a(j2, e(), this.q, this.r));
        this.o = iA;
        this.p = com.heytap.accessory.stream.utils.b.a(iA);
        com.heytap.accessory.base.logging.a.a(t, "StreamSender: mChunkLength = " + this.p + " mPackageLength = " + this.o + " mHeaderOffset = " + this.q + " mFooterOffset = " + this.r + " , ch id " + this.f2755c);
    }

    public final void g() {
        boolean zA;
        InputStream inputStream = this.d;
        if (inputStream == null || this.g == null) {
            com.heytap.accessory.base.logging.a.b(t, "sendChunk() Invalid Params ");
            com.heytap.accessory.stream.utils.b.a(this.h, 2, d());
            return;
        }
        if (this.i || this.f2758l) {
            this.f2756e.getLooper().quit();
            com.heytap.accessory.base.logging.a.a(t, "Already completed sending / stop requested " + this.i + ":" + this.f2758l);
            return;
        }
        try {
            int iAvailable = inputStream.available();
            int i = this.p;
            if (iAvailable > i || iAvailable == 0) {
                iAvailable = i;
            }
            Buffer bufferObtain = BufferPool.obtain(this.q + iAvailable + 1 + this.r);
            this.f2757j = bufferObtain;
            bufferObtain.setPayloadLength(iAvailable + 1);
            this.f2757j.setOffset(this.q);
            byte[] buffer = this.f2757j.getBuffer();
            buffer[this.q] = 1;
            d.h(this.s.a());
            this.f.sendEmptyMessageDelayed(1, nlk.MIN_DELAY_MS);
            int i2 = this.d.read(buffer, this.q + 1, iAvailable);
            this.f.removeMessages(1);
            d.c(this.s.a());
            if (i2 == -1) {
                com.heytap.accessory.base.logging.a.c(t, "handleComplete");
                f();
                return;
            }
            this.m += (long) i2;
            int i3 = i2 + 1;
            if (this.o == i3) {
                zA = this.g.a(this.a, this.f2755c, this.b, this.f2757j, false);
            } else {
                this.f2757j.setPayloadLength(i3);
                zA = this.g.a(this.a, this.f2755c, this.b, this.f2757j, false);
            }
            String str = t;
            com.heytap.accessory.base.logging.a.a(str, "sendChunk uIsWriteSuccess=" + zA + " bufferSize=" + iAvailable + " readLen=" + i2);
            if (!zA) {
                com.heytap.accessory.base.logging.a.e(str, "write failed,abort sending!");
            } else if (this.f2758l) {
                com.heytap.accessory.base.logging.a.e(str, "Stop Requested.Cancelling send");
            } else {
                this.f2756e.postDelayed(this.k, com.heytap.accessory.stream.utils.b.d(e()));
            }
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(t, "Error reading mInputStream:" + e2.getMessage());
            if (this.i) {
                return;
            }
            com.heytap.accessory.stream.utils.b.a(this.h, 2, d());
        }
    }

    public synchronized void h() {
        g();
    }

    public void b() {
        com.heytap.accessory.base.logging.a.e(t, "stop requested channelId:" + this.f2755c + ", class:" + this);
        Handler handler = this.f2756e;
        if (handler != null) {
            handler.removeCallbacks(this.k);
            this.f2756e.getLooper().quit();
        }
        this.f2758l = true;
        this.i = false;
        c();
    }

    public final void c() {
        try {
            InputStream inputStream = this.d;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
            com.heytap.accessory.stream.utils.b.a(this.h, 2, null);
        }
        this.d = null;
        com.heytap.accessory.base.logging.a.a(t, "closeOutStream() Done ");
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt("transId", this.s.f());
        return bundle;
    }

    public final int e() {
        c cVar = this.f2759n;
        if (cVar != null) {
            return cVar.a();
        }
        return -1;
    }

    public final void f() {
        c();
        this.i = true;
        Message messageObtainMessage = this.h.obtainMessage(509);
        Bundle data = messageObtainMessage.getData();
        data.putLong("accId", this.a);
        data.putInt("transId", this.b);
        data.putLong("totalSize", this.m);
        messageObtainMessage.setData(data);
        this.h.sendMessage(messageObtainMessage);
        com.heytap.accessory.base.logging.a.b(t, "reading mInputStream to the end ,mTotalReadBytes =" + this.m);
    }

    public synchronized boolean a(SetupRequest setupRequest) {
        synchronized (this) {
            HandlerThread handlerThread = new HandlerThread("streamSenderWorker");
            handlerThread.start();
            if (handlerThread.getLooper() != null) {
                this.f2756e = new Handler(handlerThread.getLooper());
            }
            HandlerThread handlerThread2 = new HandlerThread("ReadTimeoutWorker");
            handlerThread2.start();
            if (handlerThread2.getLooper() != null) {
                this.f = new HandlerC0268b(handlerThread2.getLooper());
            }
            this.m = 0L;
            this.i = false;
            this.s = setupRequest;
        }
        return false;
        return false;
    }
}
