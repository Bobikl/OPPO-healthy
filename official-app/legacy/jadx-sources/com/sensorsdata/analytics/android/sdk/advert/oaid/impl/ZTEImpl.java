package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes10.dex */
public class ZTEImpl implements IRomOAID {
    private static final String ID_PACKAGE = "com.mdid.msa";
    private static final String TAG = "SA.ZTEImpl";
    private static final String ZTE_MANAGER = "android.app.ZteDeviceIdentifyManager";
    private final Context mContext;
    private final OAIDService mService = new OAIDService();

    public static class ZTEInterface implements IInterface {
        private final IBinder mIBinder;

        public ZTEInterface(IBinder iBinder) {
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
                parcelObtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
                this.mIBinder.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return string;
            } catch (Throwable th) {
                SALog.i(ZTEImpl.TAG, th);
                return string;
            }
        }
    }

    public ZTEImpl(Context context) {
        this.mContext = context;
    }

    private String getOAID29(Context context) {
        String oaid = null;
        try {
            String packageName = context.getPackageName();
            startMsaklServer(packageName, context);
            Intent intent = new Intent();
            intent.setClassName(ID_PACKAGE, "com.mdid.msa.service.MsaIdService");
            intent.setAction("com.bun.msa.action.bindto.service");
            intent.putExtra("com.bun.msa.param.pkgname", packageName);
            if (!context.bindService(intent, this.mService, 1)) {
                return null;
            }
            oaid = new ZTEInterface(OAIDService.BINDER_QUEUE.take()).getOAID();
            try {
                context.unbindService(this.mService);
            } catch (Throwable th) {
                SALog.i(TAG, th);
            }
        } catch (Throwable th2) {
            SALog.i(TAG, th2);
        }
        return oaid;
    }

    @SuppressLint({"PrivateApi"})
    private static String getOAID30(Context context) {
        try {
            Class<?> cls = Class.forName(ZTE_MANAGER);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(Context.class);
            if (declaredConstructor != null) {
                return (String) cls.getDeclaredMethod("getOAID", Context.class).invoke(declaredConstructor.newInstance(context), context);
            }
            return null;
        } catch (Throwable th) {
            SALog.i(TAG, th);
            return null;
        }
    }

    private static void startMsaklServer(String str, Context context) {
        Intent intent = new Intent();
        intent.setClassName(ID_PACKAGE, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            context.startService(intent);
        } catch (Throwable th) {
            SALog.i(TAG, th);
        }
    }

    public String bindZTEServiceGetOAID(Context context) {
        return Build.VERSION.SDK_INT <= 29 ? getOAID29(context) : getOAID30(context);
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public String getRomOAID() {
        return bindZTEServiceGetOAID(this.mContext);
    }

    @Override // com.sensorsdata.analytics.android.sdk.advert.oaid.IRomOAID
    public boolean isSupported() {
        return true;
    }
}
