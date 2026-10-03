package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.ParcelUuid;
import androidx.annotation.CallSuper;
import com.oplus.wearable.linkservice.transport.connect.br.EnumCloseType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vz0 {
    public ParcelUuid d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public eo9 f18047e;
    public BluetoothDevice g;
    public BlockingDeque<atg> h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile BluetoothSocket f18048j;
    public Handler p;
    public HandlerThread q;
    public Handler r;
    public HandlerThread s;
    public Handler t;
    public HandlerThread u;
    public Context x;
    public final byte[] a = new byte[0];
    public String b = "base";
    public EnumCloseType f = EnumCloseType.INACTIVE;
    public ArrayList<atg> i = new ArrayList<>();
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f18049l = true;
    public volatile boolean m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OutputStream f18050n = null;
    public InputStream o = null;
    public volatile boolean v = false;
    public boolean w = false;
    public CopyOnWriteArraySet<kdf> y = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f18046c = 3;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                vz0.this.m(message);
            }
            return true;
        }

        public a() {
        }
    }

    public class b implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                if (message.what != 3) {
                    return true;
                }
                vz0 vz0Var = vz0.this;
                vz0Var.o(vz0Var);
                return true;
            } catch (Exception e2) {
                wil.b(vz0.this.b, "ReadCallback, exception : " + e2 + ", stopConnect()");
                vz0.this.O();
                return true;
            }
        }

        public b() {
        }
    }

    public class c implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            try {
                if (message.what != 2) {
                    return true;
                }
                vz0.this.q();
                return true;
            } catch (Exception e2) {
                wil.b(vz0.this.b, "WriteCallback, exception : " + e2 + ", stopConnect()");
                vz0.this.O();
                return true;
            }
        }

        public c() {
        }
    }

    public vz0(Context context) {
        this.h = null;
        this.x = context.getApplicationContext();
        this.h = new LinkedBlockingDeque();
        r();
        u();
        t();
    }

    public void A(byte[] bArr) {
        Iterator<kdf> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a(this, bArr);
        }
    }

    public void B(int i, vz0 vz0Var) {
        wil.a(this.b, "sendConnectionLost(), mConnectionListener " + this.f18047e + " " + Thread.currentThread().getId());
        eo9 eo9Var = this.f18047e;
        if (eo9Var != null) {
            eo9Var.b(vz0Var, i);
        }
    }

    public void C(atg atgVar, int i) {
        xs2<Void> xs2VarA = atgVar.a();
        if (xs2VarA != null) {
            xs2VarA.a(new RuntimeException("write fail"), i);
        }
    }

    public void D(atg atgVar) {
        byte[] bArrB = atgVar.b();
        try {
            if (this.w) {
                qga.e(this.x, this.g, l(), bArrB, 0, bArrB.length, true);
            } else {
                this.f18050n.write(bArrB);
                this.f18050n.flush();
            }
            wil.i(this.b, "W --> ", bArrB);
            G(atgVar);
        } catch (Exception e2) {
            wil.b(this.b, "sendDataToRemoteAndRspResult, send data fail : " + e2.getMessage());
            C(atgVar, 301);
            synchronized (this.a) {
                E();
            }
        }
    }

    public void E() {
        wil.a(this.b, "sendFlagToExitWriteDataLoop(), sendOverDataToQueue");
        F();
    }

    public void F() {
        wil.k(this.b, "send the over flag..............");
        g(pt1.INTERNAL_COMMAND_TYPE, pt1.OVER_FLAG, null);
    }

    public void G(atg atgVar) {
        xs2<Void> xs2VarA = atgVar.a();
        if (xs2VarA != null) {
            xs2VarA.onSuccess(null);
        }
    }

    public synchronized void H(BluetoothDevice bluetoothDevice) {
        wil.a(this.b, "setBluetoothDevice");
        this.g = bluetoothDevice;
    }

    public synchronized void I(EnumCloseType enumCloseType) {
        this.f = enumCloseType;
    }

    public void J(boolean z) {
        this.k = z;
        if (z) {
            this.b = "BR_cmd";
        } else {
            this.b = "BR_data";
        }
    }

    public synchronized void K(eo9 eo9Var) {
        this.f18047e = eo9Var;
    }

    public synchronized void L(UUID uuid) {
        this.d = new ParcelUuid(uuid);
    }

    public final void M(vz0 vz0Var) {
        wil.d(this.b, "startReadLoop");
        synchronized (this.a) {
            this.m = false;
        }
        byte[] bArr = new byte[990];
        while (true) {
            InputStream inputStream = this.o;
            if (inputStream == null) {
                break;
            }
            try {
                int iD = this.w ? qga.d(this.x, this.g, l(), bArr, 0, 990) : inputStream.read(bArr);
                if (iD > 0) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, iD);
                    wil.i(this.b, "R --> ", bArrCopyOfRange);
                    A(bArrCopyOfRange);
                }
            } catch (Exception e2) {
                wil.b(this.b, "startReadLoop, Exception : " + e2.getMessage());
            }
            wil.a(this.b, "startReadLoop exit, set mIsReadLoopExit true");
            p(vz0Var);
        }
        wil.b(this.b, "startReadLoop, mInputStream is null, break");
        wil.a(this.b, "startReadLoop exit, set mIsReadLoopExit true");
        p(vz0Var);
    }

    public void N(vz0 vz0Var) {
        wil.d(this.b, "startWriteLoop: ");
        synchronized (this.a) {
            this.f18049l = false;
        }
        while (true) {
            atg atgVarJ = j();
            if (atgVarJ != null) {
                byte[] bArrC = atgVarJ.c();
                byte[] bArrB = atgVarJ.b();
                if (Arrays.equals(bArrC, pt1.INTERNAL_COMMAND_TYPE) && Arrays.equals(bArrB, pt1.OVER_FLAG)) {
                    wil.k(this.b, "startWriteLoop(), this is private command : over flag");
                    n();
                    synchronized (this.a) {
                        wil.b(this.b, "startWriteLoop() exit, set mIsWriteLoopExit to true, notifyDisconnect()");
                        this.f18049l = true;
                        w(vz0Var);
                    }
                    return;
                }
                D(atgVarJ);
            }
        }
    }

    public synchronized void O() {
        wil.a(this.b, "stopConnect()");
        f();
        d();
    }

    public void P(kdf kdfVar) {
        this.y.remove(kdfVar);
    }

    public int Q(byte[] bArr, long j2, xs2<Void> xs2Var) {
        g(pt1.NORMAL_DATA_TYPE, bArr, xs2Var);
        return 0;
    }

    public synchronized void a() {
        InputStream inputStream = this.o;
        if (inputStream == null) {
            wil.a(this.b, "closeInputStream, mInputStream is null, ignore");
            return;
        }
        try {
            try {
                inputStream.close();
            } catch (IOException e2) {
                wil.b(this.b, "startReadLoop, Exception : " + e2.getMessage());
            }
            this.o = null;
        } catch (Throwable th) {
            this.o = null;
            throw th;
        }
    }

    public final void b() {
        wil.a(this.b, "closeInputStreamAndSocket, close the InputStream....");
        a();
        wil.a(this.b, "closeInputStreamAndSocket, close the mSocket....");
        d();
    }

    public synchronized void c() {
        OutputStream outputStream = this.f18050n;
        if (outputStream == null) {
            wil.a(this.b, "closeOutputStream(), mOutputStream is null, ignore");
            return;
        }
        try {
            try {
                outputStream.close();
            } catch (IOException e2) {
                wil.a(this.b, "closeOutputStream(), IOException : " + e2.getMessage());
            }
            this.f18050n = null;
        } catch (Throwable th) {
            this.f18050n = null;
            throw th;
        }
    }

    public synchronized void d() {
        if (this.f18048j == null) {
            wil.a(this.b, "closeSocket(), mSocket is null, ignore");
            return;
        }
        try {
            this.f18048j.close();
            if (this.w) {
                qga.a(this.x, this.g, l());
            }
            wil.a(this.b, "closeSocket(), set mSocket to null");
            this.f18048j = null;
        } catch (Exception e2) {
            wil.b(this.b, "closeSocket(), mSocket.close() fail : " + e2.getMessage());
            wil.a(this.b, "closeSocket(), set mSocket to null");
            this.f18048j = null;
        } finally {
            wil.a(this.b, "closeSocket(), set mSocket to null");
            this.f18048j = null;
            x();
        }
    }

    public final void e() {
        wil.a(this.b, "closeSocketAndOutputStream(), close outputstream...");
        c();
        wil.a(this.b, "closeSocketAndOutputStream(), close socket...");
        d();
    }

    public synchronized void f() {
        a();
        c();
    }

    public void g(byte[] bArr, byte[] bArr2, xs2<Void> xs2Var) {
        atg atgVarH = h(bArr, bArr2, xs2Var);
        if (!Arrays.equals(bArr, pt1.INTERNAL_COMMAND_TYPE)) {
            try {
                this.h.put(atgVarH);
                return;
            } catch (InterruptedException e2) {
                wil.b(this.b, "InterruptedException: " + e2.getMessage());
                return;
            }
        }
        try {
            this.h.putFirst(atgVarH);
            wil.a(this.b, "put internal command pack to mBlockingDeque, flag is : " + ((int) bArr2[0]) + ", size is : " + this.h.size());
        } catch (InterruptedException e3) {
            wil.b(this.b, "InterruptedException: " + e3.getMessage());
        }
    }

    public atg h(byte[] bArr, byte[] bArr2, xs2<Void> xs2Var) {
        atg atgVar = new atg();
        atgVar.g(bArr);
        atgVar.d(xs2Var);
        atgVar.f(bArr2.length);
        atgVar.e(bArr2);
        return atgVar;
    }

    public EnumCloseType i() {
        return this.f;
    }

    public final atg j() {
        try {
            return this.h.take();
        } catch (InterruptedException e2) {
            wil.b(this.b, "getSendPack(), getSendPack fail : " + e2.getMessage());
            return null;
        }
    }

    public int k() {
        return this.f18046c;
    }

    public ParcelUuid l() {
        return this.d;
    }

    public abstract void m(Message message);

    public final void n() {
        if (!this.h.isEmpty()) {
            wil.k(this.b, "handlePrivateCommandOverFlag: mBlockingDeque is not empty " + this.h.size());
            if (!this.i.isEmpty()) {
                wil.b(this.b, "handlePrivateCommandOverFlag: mBlockingDeque cleared " + this.i.size());
                this.i.clear();
            }
            this.h.drainTo(this.i);
            this.h.clear();
            Iterator<atg> it = this.i.iterator();
            while (it.hasNext()) {
                C(it.next(), 306);
            }
            this.i.clear();
        }
        wil.a(this.b, "handlePrivateCommandOverFlag(), to closeSocketAndOutputStream");
        e();
    }

    public void o(vz0 vz0Var) {
        wil.d(this.b, "handleReadDataInit");
        synchronized (this) {
            if (this.f18048j == null) {
                wil.a(this.b, "handleReadDataInit: mBluetoothSocket == null");
                return;
            }
            try {
                this.o = this.f18048j.getInputStream();
                wil.a(this.b, "handleReadDataInit after getInputStream");
                M(vz0Var);
            } catch (IOException e2) {
                wil.b(this.b, "handleReadDataInit, mSocket.getInputStream() fail : " + e2.getMessage());
            }
        }
    }

    public final void p(vz0 vz0Var) {
        synchronized (this.a) {
            if (i() == EnumCloseType.INACTIVE) {
                this.f18046c = 4;
            }
            b();
            E();
            wil.a(this.b, "handleReadLoopStop, notifyDisconnect()");
            this.m = true;
            w(vz0Var);
        }
    }

    public abstract void q();

    public final void r() {
        HandlerThread handlerThread = new HandlerThread("Connection_Connect_Handler");
        this.q = handlerThread;
        handlerThread.start();
        this.p = new Handler(this.q.getLooper(), new a());
    }

    public void s() {
        wil.d(this.b, "initReadAndWrite");
        this.r.sendEmptyMessage(2);
        this.t.sendEmptyMessage(3);
    }

    public final void t() {
        HandlerThread handlerThread = new HandlerThread("Connection_Read_Handler");
        this.u = handlerThread;
        handlerThread.start();
        this.t = new Handler(this.u.getLooper(), new b());
    }

    public final void u() {
        HandlerThread handlerThread = new HandlerThread("Connection_Write_Handler");
        this.s = handlerThread;
        handlerThread.start();
        this.r = new Handler(this.s.getLooper(), new c());
    }

    public void v(vz0 vz0Var) {
        synchronized (this.a) {
            this.f18046c = 2;
        }
        eo9 eo9Var = this.f18047e;
        if (eo9Var != null) {
            eo9Var.a(vz0Var, this.f18048j.getRemoteDevice());
        }
    }

    public void w(vz0 vz0Var) {
        wil.a(this.b, "notifyDisconnect, mIsWriteLoopExit = " + this.f18049l + ", mIsReadLoopExit = " + this.m);
        if (this.v) {
            wil.a(this.b, "notifyDisconnect, had send disconnect msg, ignore");
        } else if (this.f18049l && this.m) {
            this.f18046c = 3;
            this.v = true;
            B(311, vz0Var);
        }
    }

    public abstract void x();

    public void y(kdf kdfVar) {
        this.y.add(kdfVar);
    }

    @CallSuper
    public void z() {
        HandlerThread handlerThread = this.q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.q = null;
        }
        HandlerThread handlerThread2 = this.s;
        if (handlerThread2 != null) {
            handlerThread2.quit();
            this.s = null;
        }
        HandlerThread handlerThread3 = this.u;
        if (handlerThread3 != null) {
            handlerThread3.quit();
            this.u = null;
        }
    }
}
