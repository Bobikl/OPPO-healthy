package com.heytap.accessory.stream.receiver;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import com.google.security.cryptauth.lib.securegcm.SecureGcmProto;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.base.d;
import com.heytap.accessory.stream.model.CancelRequest;
import com.heytap.accessory.stream.model.SetupRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static final String r = "c";
    public ParcelFileDescriptor b;
    public ParcelFileDescriptor c;
    public b d;
    public c e;
    public com.heytap.accessory.stream.receiver.a.c f;
    public OutputStream g;
    public HandlerThread h;
    public long j;
    public final long o;
    public String p;
    public int q;
    public ReentrantLock a = new ReentrantLock();
    public boolean i = false;
    public long k = -1;
    public long l = 0;
    public Runnable m = null;
    public long n = -1;

    public class a implements Runnable {
        public final /* synthetic */ byte[] a;

        public a(byte[] bArr) {
            this.a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b(this.a);
        }
    }

    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }
    }

    public final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            com.heytap.accessory.base.logging.a.e(c.r, "writeSide block, plz check whether read in time!");
            c.this.c();
            Message messageObtain = Message.obtain();
            messageObtain.what = SecureGcmProto.GcmDeviceInfo.AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER;
            messageObtain.obj = new CancelRequest(c.this.q, 15);
            c.this.f.sendMessage(messageObtain);
            System.gc();
            System.runFinalization();
            c.this.a("stream_receiver_write_timeout");
        }
    }

    public c(com.heytap.accessory.stream.receiver.a.c cVar, long j, String str, String str2, int i) {
        this.f = cVar;
        this.o = j;
        this.p = str;
        this.q = i;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            this.b = parcelFileDescriptorArrCreatePipe[0];
            this.c = parcelFileDescriptorArrCreatePipe[1];
        } catch (IOException unused) {
            com.heytap.accessory.base.logging.a.b(r, "prepare error!");
        }
    }

    public void c() {
        Runnable runnable;
        com.heytap.accessory.base.logging.a.a(r, "cleanup");
        if (this.a.isHeldByCurrentThread()) {
            this.a.unlock();
            this.a = null;
        }
        b bVar = this.d;
        if (bVar != null && (runnable = this.m) != null) {
            bVar.removeCallbacksAndMessages(runnable);
            if (this.d.getLooper() != null) {
                this.d.getLooper().quit();
            }
            this.d = null;
            this.m = null;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.removeMessages(1);
            if (this.e.getLooper() != null) {
                this.e.getLooper().quit();
            }
        }
        this.i = true;
        d();
        this.h.quitSafely();
    }

    public final void d() {
        try {
            OutputStream outputStream = this.g;
            if (outputStream != null) {
                outputStream.close();
                this.b.close();
                this.c.close();
            }
        } catch (IOException e) {
            com.heytap.accessory.base.logging.a.b(r, "closeOutStream() Exception" + e);
        }
        this.g = null;
    }

    public long e() {
        return this.l;
    }

    public final synchronized boolean f() {
        d.a = 0L;
        OutputStream outputStream = this.g;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                com.heytap.accessory.base.logging.a.b(r, "closeOutStream() IOException :" + e);
            }
        }
        this.n = System.currentTimeMillis();
        this.g = new ParcelFileDescriptor.AutoCloseOutputStream(this.c);
        return true;
    }

    public final boolean b(byte[] bArr) {
        String str = r;
        com.heytap.accessory.base.logging.a.a(str, "Incoming data " + bArr.length + " , id " + this.q);
        this.a.lock();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.g == null) {
                    com.heytap.accessory.base.logging.a.b(str, "no receive stream");
                    return false;
                }
                if (bArr.length <= 0) {
                    com.heytap.accessory.base.logging.a.b(str, "Wrong data Length!!");
                    com.heytap.accessory.stream.utils.b.a(this.f, 2, null);
                    return false;
                }
                if ((bArr[0] & 1) != 1) {
                    com.heytap.accessory.base.logging.a.b(str, "Not a data chunk header!!");
                    com.heytap.accessory.stream.utils.b.a(this.f, 2, null);
                    return false;
                }
                int length = bArr.length - 1;
                try {
                    this.e.sendEmptyMessageDelayed(1, 5000L);
                    this.g.write(bArr, 1, length);
                    long j = length;
                    this.l -= j;
                    this.g.flush();
                    d.f(jCurrentTimeMillis);
                    this.j += j;
                    this.e.removeMessages(1);
                    com.heytap.accessory.base.logging.a.a(str, " TotalReceived = " + this.j + " totalNeed = " + this.k + " transId:" + this.q);
                    long j2 = this.k;
                    if (j2 != -1 && j2 == this.j) {
                        com.heytap.accessory.base.logging.a.c(str, "second check complete!");
                        Message messageObtainMessage = this.f.obtainMessage(502);
                        messageObtainMessage.obj = Long.valueOf(this.k);
                        messageObtainMessage.getData().putInt("transId", this.q);
                        this.f.sendMessage(messageObtainMessage);
                    }
                    return true;
                } catch (Exception unused) {
                    d();
                    com.heytap.accessory.stream.utils.b.a(this.f, 2, null);
                    return false;
                }
            } catch (Exception unused2) {
                com.heytap.accessory.base.logging.a.b(r, "writeData Exception");
            }
        } finally {
            this.a.unlock();
        }
    }

    public synchronized ParcelFileDescriptor a(SetupRequest setupRequest) {
        synchronized (this) {
            this.j = 0L;
            HandlerThread handlerThread = new HandlerThread("DataReceiverWorker");
            this.h = handlerThread;
            handlerThread.start();
            if (this.h.getLooper() != null) {
                this.d = new b(this.h.getLooper());
            }
            HandlerThread handlerThread2 = new HandlerThread("WriteTimeoutWorker");
            handlerThread2.start();
            if (handlerThread2.getLooper() != null) {
                this.e = new c(handlerThread2.getLooper());
            }
            f();
            com.heytap.accessory.base.logging.a.a(r, "Prepare successful");
        }
        return this.b;
        return this.b;
    }

    public void a(byte[] bArr) {
        b bVar;
        if (this.i && (bVar = this.d) != null) {
            bVar.getLooper().quit();
            com.heytap.accessory.base.logging.a.e(r, "Already completed sending/stop requested");
            return;
        }
        this.l += (long) (bArr.length - 1);
        a aVar = new a(bArr);
        this.m = aVar;
        b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.post(aVar);
        }
    }

    public synchronized boolean a(long j) {
        this.k = j;
        b();
        String str = r;
        com.heytap.accessory.base.logging.a.c(str, "mTargetToReceive=" + this.k);
        com.heytap.accessory.base.logging.a.c(str, "currentReceive=" + this.j);
        return this.k > this.j;
    }

    public void a(String str) {
        String strM;
        int iH;
        FrameworkServiceDescription frameworkServiceDescriptionB = com.heytap.accessory.sdp.service.b.g().b(this.p);
        if (frameworkServiceDescriptionB != null) {
            strM = frameworkServiceDescriptionB.m();
            iH = AccessoryManager.h().a(this.o).h();
        } else {
            strM = "";
            iH = 0;
        }
        com.heytap.accessory.stream.utils.b.a(str, this.l, strM, iH);
    }

    public final void b() {
        double dCurrentTimeMillis = (System.currentTimeMillis() - this.n) / 1000.0d;
        String str = r;
        com.heytap.accessory.base.logging.a.c(str, "receive:" + this.k + " Bytes");
        com.heytap.accessory.base.logging.a.c(str, "cost time:" + dCurrentTimeMillis + " s");
        StringBuilder sb = new StringBuilder();
        sb.append("avg speed:");
        sb.append(((double) (this.k / 1024)) / dCurrentTimeMillis);
        com.heytap.accessory.base.logging.a.c(str, sb.toString());
        com.heytap.accessory.base.logging.a.c(str, "total write output time:" + d.a);
    }
}
