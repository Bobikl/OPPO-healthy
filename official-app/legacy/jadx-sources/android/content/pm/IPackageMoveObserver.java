package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IPackageMoveObserver extends IInterface {

    public static abstract class Stub extends Binder implements IPackageMoveObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageMoveObserver
        public void packageMoved(String str, int i) throws RemoteException {
        }
    }

    void packageMoved(String str, int i) throws RemoteException;
}
