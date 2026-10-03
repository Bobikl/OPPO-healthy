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
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String t = "b";
    public long a;
    public int b;
    public int c;
    public InputStream d;
    public Handler e;
    public b f;
    public com.heytap.accessory.stream.a g;
    public StreamProviderImpl.c h;
    public boolean i;
    public Buffer j;
    public long m;
    public c n;
    public int o;
    public int p;
    public SetupRequest s;
    public Runnable k = new a();
    public boolean l = false;
    public int q = SdkConfig.getFrameworkMaxHeaderLength();
    public int r = SdkConfig.getFrameworkMaxFooterLength();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.accessory.base.logging.a.a(b.t, "sendChunk, , mSendChunkTask: " + b.this.k + ", mStopRequested:" + b.this.l + ", mChannelId:" + b.this.c + ", transId:" + b.this.b);
            b.this.g();
        }
    }

    public final class b extends Handler {
        public b(Looper looper) {
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

    public b(long j, int i, int i2, InputStream inputStream, StreamProviderImpl.c cVar, com.heytap.accessory.stream.a aVar, c cVar2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = inputStream;
        this.h = cVar;
        this.g = aVar;
        this.n = cVar2;
        int iA = com.heytap.accessory.transport.control.c.a(j, i2, com.heytap.accessory.stream.utils.b.a(j, e(), this.q, this.r));
        this.o = iA;
        this.p = com.heytap.accessory.stream.utils.b.a(iA);
        com.heytap.accessory.base.logging.a.a(t, "StreamSender: mChunkLength = " + this.p + " mPackageLength = " + this.o + " mHeaderOffset = " + this.q + " mFooterOffset = " + this.r + " , ch id " + this.c);
    }

    public final void g() {
        boolean zA;
        InputStream inputStream = this.d;
        if (inputStream == null || this.g == null) {
            com.heytap.accessory.base.logging.a.b(t, "sendChunk() Invalid Params ");
            com.heytap.accessory.stream.utils.b.a(this.h, 2, d());
            return;
        }
        if (this.i || this.l) {
            this.e.getLooper().quit();
            com.heytap.accessory.base.logging.a.a(t, "Already completed sending / stop requested " + this.i + ":" + this.l);
            return;
        }
        try {
            int iAvailable = inputStream.available();
            int i = this.p;
            if (iAvailable > i || iAvailable == 0) {
                iAvailable = i;
            }
            Buffer bufferObtain = BufferPool.obtain(this.q + iAvailable + 1 + this.r);
            this.j = bufferObtain;
            bufferObtain.setPayloadLength(iAvailable + 1);
            this.j.setOffset(this.q);
            byte[] buffer = this.j.getBuffer();
            buffer[this.q] = 1;
            d.h(this.s.a());
            this.f.sendEmptyMessageDelayed(1, 180000L);
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
                zA = this.g.a(this.a, this.c, this.b, this.j, false);
            } else {
                this.j.setPayloadLength(i3);
                zA = this.g.a(this.a, this.c, this.b, this.j, false);
            }
            String str = t;
            com.heytap.accessory.base.logging.a.a(str, "sendChunk uIsWriteSuccess=" + zA + " bufferSize=" + iAvailable + " readLen=" + i2);
            if (!zA) {
                com.heytap.accessory.base.logging.a.e(str, "write failed,abort sending!");
            } else if (this.l) {
                com.heytap.accessory.base.logging.a.e(str, "Stop Requested.Cancelling send");
            } else {
                this.e.postDelayed(this.k, com.heytap.accessory.stream.utils.b.d(e()));
            }
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.b(t, "Error reading mInputStream:" + e.getMessage());
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
        com.heytap.accessory.base.logging.a.e(t, "stop requested channelId:" + this.c + ", class:" + this);
        Handler handler = this.e;
        if (handler != null) {
            handler.removeCallbacks(this.k);
            this.e.getLooper().quit();
        }
        this.l = true;
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
        c cVar = this.n;
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
                this.e = new Handler(handlerThread.getLooper());
            }
            HandlerThread handlerThread2 = new HandlerThread("ReadTimeoutWorker");
            handlerThread2.start();
            if (handlerThread2.getLooper() != null) {
                this.f = new b(handlerThread2.getLooper());
            }
            this.m = 0L;
            this.i = false;
            this.s = setupRequest;
        }
        return false;
        return false;
    }
}
