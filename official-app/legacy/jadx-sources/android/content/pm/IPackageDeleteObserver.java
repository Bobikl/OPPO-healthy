package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IPackageDeleteObserver extends IInterface {

    public static abstract class Stub extends Binder implements IPackageDeleteObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageDeleteObserver
        public void packageDeleted(String str, int i) throws RemoteException {
        }
    }

    void packageDeleted(String str, int i) throws RemoteException;
}
