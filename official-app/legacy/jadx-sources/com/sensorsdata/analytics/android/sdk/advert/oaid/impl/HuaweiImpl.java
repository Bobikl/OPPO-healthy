package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.provider.Settings;
import android.text.TextUtils;
import com.alipay.sdk.m.c.b;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;

/* JADX INFO: loaded from: classes10.dex */
public class HuaweiImpl implements IRomOAID {
    private static final String TAG = "SA.HuaweiImpl";
    private final Context mContext;
    private final OAIDService mService = new OAIDService();

    public static final class HuaWeiInterface implements IInterface {
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
                parcelObtain.writeInterfaceToken(b.a);
                this.iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(HuaweiImpl.TAG, th);
                return string;
            }
        }

        private HuaWeiInterface(IBinder iBinder) {
            this.iBinder = iBinder;
        }
    }

    public HuaweiImpl(Context context) {
        this.mContext = context;
    }

    private String realLoadOaid(String str) {
        try {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(str);
            return this.mContext.bindService(intent, this.mService, 1) ? new HuaWeiInterface(OAIDService.BINDER_QUEUE.take()).getOAID() : "";
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        try {
            String string = Settings.Global.getString(this.mContext.getContentResolver(), "pps_oaid");
            if (!TextUtils.isEmpty(string)) {
                SALog.i(TAG, "Get oaid from global settings");
                return string;
            }
        } catch (Throwable th) {
            SALog.i(TAG, th);
        }
        String[] strArr = {"com.huawei.hwid", "com.huawei.hwid.tv", "com.huawei.hms"};
        String strRealLoadOaid = null;
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (TextUtils.isEmpty(strRealLoadOaid)) {
                strRealLoadOaid = realLoadOaid(str);
            }
        }
        return strRealLoadOaid;
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        return true;
    }
}
