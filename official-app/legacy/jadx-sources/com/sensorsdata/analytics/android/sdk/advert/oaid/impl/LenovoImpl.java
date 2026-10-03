package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.sdk.m.q0.a;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;

/* JADX INFO: loaded from: classes10.dex */
class LenovoImpl implements IRomOAID {
    private static final String TAG = "SA.LenovoImpl";
    private final Context mContext;
    private final OAIDService mService = new OAIDService();

    public static final class LenovoInterface implements IInterface {
        private final IBinder iBinder;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.iBinder;
        }

        public String getOAID() {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInterfaceToken(a.AbstractBinderC0151a.a);
                this.iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(LenovoImpl.TAG, th);
                return string;
            }
        }

        private LenovoInterface(IBinder iBinder) {
            this.iBinder = iBinder;
        }
    }

    public LenovoImpl(Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String oaid = null;
        Object[] objArr = 0;
        try {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (!this.mContext.bindService(intent, this.mService, 1)) {
                return null;
            }
            oaid = new LenovoInterface(OAIDService.BINDER_QUEUE.take()).getOAID();
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
