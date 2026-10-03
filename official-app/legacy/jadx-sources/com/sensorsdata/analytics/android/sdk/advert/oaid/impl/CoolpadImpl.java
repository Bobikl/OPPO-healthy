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
public class CoolpadImpl implements IRomOAID {
    private static final String TAG = "SA.CoolpadImpl";
    private final Context context;
    private final OAIDService service = new OAIDService();

    public static class CoolpadInterface implements IInterface {
        private final IBinder mIBinder;

        public CoolpadInterface(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getOAID(String str) {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
                parcelObtain.writeString(str);
                this.mIBinder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(CoolpadImpl.TAG, th);
                return string;
            }
        }
    }

    public CoolpadImpl(Context context) {
        this.context = context;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String oaid = null;
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService"));
            if (!this.context.bindService(intent, this.service, 1)) {
                return null;
            }
            oaid = new CoolpadInterface(OAIDService.BINDER_QUEUE.take()).getOAID(this.context.getPackageName());
            this.context.unbindService(this.service);
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
