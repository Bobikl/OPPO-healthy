package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.sdk.m.k0.a;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;

/* JADX INFO: loaded from: classes10.dex */
class SamsungImpl implements IRomOAID {
    private static final String TAG = "SA.SamsungImpl";
    private final Context mContext;
    private final OAIDService mService = new OAIDService();

    public static class SamsungInterface implements IInterface {
        private final IBinder mIBinder;

        public SamsungInterface(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getOAID() {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInterfaceToken(a.AbstractBinderC0149a.a);
                this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(SamsungImpl.TAG, th);
                return string;
            }
        }
    }

    public SamsungImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        String oaid = null;
        try {
            if (!this.mContext.bindService(intent, this.mService, 1)) {
                return null;
            }
            oaid = new SamsungInterface(OAIDService.BINDER_QUEUE.take()).getOAID();
            this.mContext.unbindService(this.mService);
            return oaid;
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return oaid;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        return true;
    }
}
