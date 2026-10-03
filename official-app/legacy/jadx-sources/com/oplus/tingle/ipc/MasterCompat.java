package com.oplus.tingle.ipc;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.system.Os;
import com.oplus.aiunit.vision.nee;
import com.oplus.aiunit.vision.r04;
import com.oplus.aiunit.vision.w7b;

/* JADX INFO: loaded from: classes8.dex */
public class MasterCompat extends com.heytap.tingle.ipc.IMaster.Stub {
    private static final String TAG = "Master";
    private static final Object mLock = new Object();
    private static volatile MasterCompat sInstance;

    private MasterCompat() {
    }

    public static MasterCompat getInstance() {
        if (sInstance == null) {
            synchronized (mLock) {
                if (sInstance == null) {
                    sInstance = new MasterCompat();
                }
            }
        }
        return sInstance;
    }

    private void transactRemote(Parcel parcel, Parcel parcel2, int i) throws RemoteException {
        IBinder strongBinder = parcel.readStrongBinder();
        int i2 = parcel.readInt();
        parcel.readStringArray();
        if (nee.a().d() && !nee.a().e(strongBinder.getInterfaceDescriptor(), i2)) {
            throw new SecurityException("Tingle Authentication Failed.");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.appendFrom(parcel, parcel.dataPosition(), parcel.dataAvail());
            try {
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                strongBinder.transact(i2, parcelObtain, parcel2, i);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            } finally {
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            w7b.c(TAG, "appendFrom failed: " + th.toString(), new Object[0]);
        }
    }

    @Override // com.heytap.tingle.ipc.IMaster
    public int getUid() throws RemoteException {
        return Os.getuid();
    }

    @Override // com.heytap.tingle.ipc.IMaster.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(r04.c());
        transactRemote(parcel, parcel2, i2);
        return true;
    }
}
