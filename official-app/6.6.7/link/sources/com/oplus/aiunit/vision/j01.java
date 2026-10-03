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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class j01 {
    public ParcelUuid d;
    public kp9 e;
    public BluetoothDevice g;
    public BlockingDeque<qwg> h;
    public volatile BluetoothSocket j;
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
    public ArrayList<qwg> i = new ArrayList<>();
    public boolean k = false;
    public volatile boolean l = true;
    public volatile boolean m = true;
    public OutputStream n = null;
    public InputStream o = null;
    public volatile boolean v = false;
    public boolean w = false;
    public CopyOnWriteArraySet<ogf> y = new CopyOnWriteArraySet<>();
    public volatile int c = 3;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                j01.this.m(message);
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
                j01 j01Var = j01.this;
                j01Var.o(j01Var);
                return true;
            } catch (Exception e) {
                uml.b(j01.this.b, "ReadCallback, exception : " + e + ", stopConnect()");
                j01.this.O();
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
                j01.this.q();
                return true;
            } catch (Exception e) {
                uml.b(j01.this.b, "WriteCallback, exception : " + e + ", stopConnect()");
                j01.this.O();
                return true;
            }
        }

        public c() {
        }
    }

    public j01(Context context) {
        this.h = null;
        this.x = context.getApplicationContext();
        this.h = new LinkedBlockingDeque();
        r();
        u();
        t();
    }

    public void A(byte[] bArr) {
        Iterator<ogf> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a(this, bArr);
        }
    }

    public void B(int i, j01 j01Var) {
        uml.a(this.b, "sendConnectionLost(), mConnectionListener " + this.e + " " + Thread.currentThread().getId());
        kp9 kp9Var = this.e;
        if (kp9Var != null) {
            kp9Var.b(j01Var, i);
        }
    }

    public void C(qwg qwgVar, int i) {
        lt2<Void> lt2VarA = qwgVar.a();
        if (lt2VarA != null) {
            lt2VarA.a(new RuntimeException("write fail"), i);
        }
    }

    public void D(qwg qwgVar) {
        byte[] bArrB = qwgVar.b();
        try {
            if (this.w) {
                yha.e(this.x, this.g, l(), bArrB, 0, bArrB.length, true);
            } else {
                this.n.write(bArrB);
                this.n.flush();
            }
            uml.i(this.b, "W --> ", bArrB);
            G(qwgVar);
        } catch (Exception e) {
            uml.b(this.b, "sendDataToRemoteAndRspResult, send data fail : " + e.getMessage());
            C(qwgVar, 301);
            synchronized (this.a) {
                E();
            }
        }
    }

    public void E() {
        uml.a(this.b, "sendFlagToExitWriteDataLoop(), sendOverDataToQueue");
        F();
    }

    public void F() {
        uml.k(this.b, "send the over flag..............");
        g(du1.INTERNAL_COMMAND_TYPE, du1.OVER_FLAG, null);
    }

    public void G(qwg qwgVar) {
        lt2<Void> lt2VarA = qwgVar.a();
        if (lt2VarA != null) {
            lt2VarA.onSuccess(null);
        }
    }

    public synchronized void H(BluetoothDevice bluetoothDevice) {
        uml.a(this.b, "setBluetoothDevice");
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

    public synchronized void K(kp9 kp9Var) {
        this.e = kp9Var;
    }

    public synchronized void L(UUID uuid) {
        this.d = new ParcelUuid(uuid);
    }

    public final void M(j01 j01Var) {
        uml.d(this.b, "startReadLoop");
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
                int iD = this.w ? yha.d(this.x, this.g, l(), bArr, 0, 990) : inputStream.read(bArr);
                if (iD > 0) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, iD);
                    uml.i(this.b, "R --> ", bArrCopyOfRange);
                    A(bArrCopyOfRange);
                }
            } catch (Exception e) {
                uml.b(this.b, "startReadLoop, Exception : " + e.getMessage());
            }
            uml.a(this.b, "startReadLoop exit, set mIsReadLoopExit true");
            p(j01Var);
        }
        uml.b(this.b, "startReadLoop, mInputStream is null, break");
        uml.a(this.b, "startReadLoop exit, set mIsReadLoopExit true");
        p(j01Var);
    }

    public void N(j01 j01Var) {
        uml.d(this.b, "startWriteLoop: ");
        synchronized (this.a) {
            this.l = false;
        }
        while (true) {
            qwg qwgVarJ = j();
            if (qwgVarJ != null) {
                byte[] bArrC = qwgVarJ.c();
                byte[] bArrB = qwgVarJ.b();
                if (Arrays.equals(bArrC, du1.INTERNAL_COMMAND_TYPE) && Arrays.equals(bArrB, du1.OVER_FLAG)) {
                    uml.k(this.b, "startWriteLoop(), this is private command : over flag");
                    n();
                    synchronized (this.a) {
                        uml.b(this.b, "startWriteLoop() exit, set mIsWriteLoopExit to true, notifyDisconnect()");
                        this.l = true;
                        w(j01Var);
                    }
                    return;
                }
                D(qwgVarJ);
            }
        }
    }

    public synchronized void O() {
        uml.a(this.b, "stopConnect()");
        f();
        d();
    }

    public void P(ogf ogfVar) {
        this.y.remove(ogfVar);
    }

    public int Q(byte[] bArr, long j, lt2<Void> lt2Var) {
        g(du1.NORMAL_DATA_TYPE, bArr, lt2Var);
        return 0;
    }

    public synchronized void a() {
        InputStream inputStream = this.o;
        if (inputStream == null) {
            uml.a(this.b, "closeInputStream, mInputStream is null, ignore");
            return;
        }
        try {
            try {
                inputStream.close();
            } catch (IOException e) {
                uml.b(this.b, "startReadLoop, Exception : " + e.getMessage());
            }
            this.o = null;
        } catch (Throwable th) {
            this.o = null;
            throw th;
        }
    }

    public final void b() {
        uml.a(this.b, "closeInputStreamAndSocket, close the InputStream....");
        a();
        uml.a(this.b, "closeInputStreamAndSocket, close the mSocket....");
        d();
    }

    public synchronized void c() {
        OutputStream outputStream = this.n;
        if (outputStream == null) {
            uml.a(this.b, "closeOutputStream(), mOutputStream is null, ignore");
            return;
        }
        try {
            try {
                outputStream.close();
            } catch (IOException e) {
                uml.a(this.b, "closeOutputStream(), IOException : " + e.getMessage());
            }
            this.n = null;
        } catch (Throwable th) {
            this.n = null;
            throw th;
        }
    }

    public synchronized void d() {
        if (this.j == null) {
            uml.a(this.b, "closeSocket(), mSocket is null, ignore");
            return;
        }
        try {
            this.j.close();
            if (this.w) {
                yha.a(this.x, this.g, l());
            }
            uml.a(this.b, "closeSocket(), set mSocket to null");
            this.j = null;
        } catch (Exception e) {
            uml.b(this.b, "closeSocket(), mSocket.close() fail : " + e.getMessage());
            uml.a(this.b, "closeSocket(), set mSocket to null");
            this.j = null;
        } finally {
            uml.a(this.b, "closeSocket(), set mSocket to null");
            this.j = null;
            x();
        }
    }

    public final void e() {
        uml.a(this.b, "closeSocketAndOutputStream(), close outputstream...");
        c();
        uml.a(this.b, "closeSocketAndOutputStream(), close socket...");
        d();
    }

    public synchronized void f() {
        a();
        c();
    }

    public void g(byte[] bArr, byte[] bArr2, lt2<Void> lt2Var) {
        qwg qwgVarH = h(bArr, bArr2, lt2Var);
        if (!Arrays.equals(bArr, du1.INTERNAL_COMMAND_TYPE)) {
            try {
                this.h.put(qwgVarH);
                return;
            } catch (InterruptedException e) {
                uml.b(this.b, "InterruptedException: " + e.getMessage());
                return;
            }
        }
        try {
            this.h.putFirst(qwgVarH);
            uml.a(this.b, "put internal command pack to mBlockingDeque, flag is : " + ((int) bArr2[0]) + ", size is : " + this.h.size());
        } catch (InterruptedException e2) {
            uml.b(this.b, "InterruptedException: " + e2.getMessage());
        }
    }

    public qwg h(byte[] bArr, byte[] bArr2, lt2<Void> lt2Var) {
        qwg qwgVar = new qwg();
        qwgVar.g(bArr);
        qwgVar.d(lt2Var);
        qwgVar.f(bArr2.length);
        qwgVar.e(bArr2);
        return qwgVar;
    }

    public EnumCloseType i() {
        return this.f;
    }

    public final qwg j() {
        try {
            return this.h.take();
        } catch (InterruptedException e) {
            uml.b(this.b, "getSendPack(), getSendPack fail : " + e.getMessage());
            return null;
        }
    }

    public int k() {
        return this.c;
    }

    public ParcelUuid l() {
        return this.d;
    }

    public abstract void m(Message message);

    public final void n() {
        if (!this.h.isEmpty()) {
            uml.k(this.b, "handlePrivateCommandOverFlag: mBlockingDeque is not empty " + this.h.size());
            if (!this.i.isEmpty()) {
                uml.b(this.b, "handlePrivateCommandOverFlag: mBlockingDeque cleared " + this.i.size());
                this.i.clear();
            }
            this.h.drainTo(this.i);
            this.h.clear();
            Iterator<qwg> it = this.i.iterator();
            while (it.hasNext()) {
                C(it.next(), 306);
            }
            this.i.clear();
        }
        uml.a(this.b, "handlePrivateCommandOverFlag(), to closeSocketAndOutputStream");
        e();
    }

    public void o(j01 j01Var) {
        uml.d(this.b, "handleReadDataInit");
        synchronized (this) {
            if (this.j == null) {
                uml.a(this.b, "handleReadDataInit: mBluetoothSocket == null");
                return;
            }
            try {
                this.o = this.j.getInputStream();
                uml.a(this.b, "handleReadDataInit after getInputStream");
                M(j01Var);
            } catch (IOException e) {
                uml.b(this.b, "handleReadDataInit, mSocket.getInputStream() fail : " + e.getMessage());
            }
        }
    }

    public final void p(j01 j01Var) {
        synchronized (this.a) {
            if (i() == EnumCloseType.INACTIVE) {
                this.c = 4;
            }
            b();
            E();
            uml.a(this.b, "handleReadLoopStop, notifyDisconnect()");
            this.m = true;
            w(j01Var);
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
        uml.d(this.b, "initReadAndWrite");
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

    public void v(j01 j01Var) {
        synchronized (this.a) {
            this.c = 2;
        }
        kp9 kp9Var = this.e;
        if (kp9Var != null) {
            kp9Var.a(j01Var, this.j.getRemoteDevice());
        }
    }

    public void w(j01 j01Var) {
        uml.a(this.b, "notifyDisconnect, mIsWriteLoopExit = " + this.l + ", mIsReadLoopExit = " + this.m);
        if (this.v) {
            uml.a(this.b, "notifyDisconnect, had send disconnect msg, ignore");
        } else if (this.l && this.m) {
            this.c = 3;
            this.v = true;
            B(311, j01Var);
        }
    }

    public abstract void x();

    public void y(ogf ogfVar) {
        this.y.add(ogfVar);
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
