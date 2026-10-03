package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IPackageInstallObserver extends IInterface {

    public static abstract class Stub extends Binder implements IPackageInstallObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageInstallObserver
        public void packageInstalled(String str, int i) throws RemoteException {
        }
    }

    void packageInstalled(String str, int i) throws RemoteException;
}
