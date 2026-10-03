package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.oplus.aiunit.vision.gc0;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
class OppoImpl implements IRomOAID {
    private static final String TAG = "SA.OppoImpl";
    private final Context mContext;
    private final OAIDService mService = new OAIDService();
    private String mSign;

    public static class OppoInterface implements IInterface {
        private final IBinder mIBinder;

        public OppoInterface(IBinder iBinder) {
            this.mIBinder = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIBinder;
        }

        public String getSerID(String str, String str2, String str3) {
            String string = null;
            try {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                this.mIBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(OppoImpl.TAG, th);
                return string;
            }
        }
    }

    public OppoImpl(Context context) {
        this.mContext = context;
    }

    private String getSerId(String str, String str2) throws InterruptedException {
        return new OppoInterface(OAIDService.BINDER_QUEUE.take()).getSerID(str, str2, OpenIDHelper.OUID);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private String realGetOUID() {
        String packageName = this.mContext.getPackageName();
        try {
            String str = this.mSign;
            if (str != null) {
                return getSerId(packageName, str);
            }
            byte[] bArrDigest = MessageDigest.getInstance(gc0.SHA1).digest(this.mContext.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
            }
            String string = sb.toString();
            this.mSign = string;
            return getSerId(packageName, string);
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        String strRealGetOUID = null;
        try {
            Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            if (!this.mContext.bindService(intent, this.mService, 1)) {
                return null;
            }
            strRealGetOUID = realGetOUID();
            this.mContext.unbindService(this.mService);
            return strRealGetOUID;
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return strRealGetOUID;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        return true;
    }
}
