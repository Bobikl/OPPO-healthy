package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IPackageStatsObserver extends IInterface {

    public static abstract class Stub extends Binder implements IPackageStatsObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageStatsObserver
        public void onGetStatsCompleted(PackageStats packageStats, boolean z) throws RemoteException {
        }
    }

    void onGetStatsCompleted(PackageStats packageStats, boolean z) throws RemoteException;
}
