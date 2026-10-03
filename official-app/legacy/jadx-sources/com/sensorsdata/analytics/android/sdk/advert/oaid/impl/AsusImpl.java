package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;

/* JADX INFO: loaded from: classes10.dex */
class AsusImpl implements IRomOAID {
    private static final String TAG = "SA.AsusImpl";
    private final Context mContext;
    private final OAIDService mService = new OAIDService();

    public static class AsusInterface implements IInterface {
        private final IBinder mIBinder;

        public AsusInterface(IBinder iBinder) {
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
                parcelObtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                this.mIBinder.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(AsusImpl.TAG, th);
                return string;
            }
        }
    }

    public AsusImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String oaid = null;
        try {
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
            if (!this.mContext.bindService(intent, this.mService, 1)) {
                return null;
            }
            oaid = new AsusInterface(OAIDService.BINDER_QUEUE.take()).getOAID();
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
