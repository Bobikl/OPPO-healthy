package com.alipay.sdk.m.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.aiunit.vision.jim;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class b implements jim {
    public static final String a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    public static final int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f597c = 2;

    /* JADX INFO: renamed from: com.alipay.sdk.m.c.b$b, reason: collision with other inner class name */
    public static final class ServiceConnectionC0148b implements ServiceConnection {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f598j;

        public ServiceConnectionC0148b() {
            this.i = false;
            this.f598j = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (this.i) {
                throw new IllegalStateException();
            }
            this.i = true;
            return this.f598j.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f598j.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class c implements IInterface {
        public IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String d() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(b.a);
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public boolean e() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(b.a);
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.jim
    public String a(Context context) {
        ServiceConnectionC0148b serviceConnectionC0148b = new ServiceConnectionC0148b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC0148b, 1)) {
            try {
                return new c(serviceConnectionC0148b.a()).d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0148b);
            }
        }
        return null;
    }
}
