package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IPackageDataObserver extends IInterface {

    public static abstract class Stub extends Binder implements IPackageDataObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) throws RemoteException {
        }
    }

    void onRemoveCompleted(String str, boolean z) throws RemoteException;
}
