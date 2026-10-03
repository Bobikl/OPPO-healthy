package insight;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes10.dex */
public interface IInsightQueryService extends IInterface {
    public static final String DESCRIPTOR = "insight.IInsightQueryService";

    public static class Default implements IInsightQueryService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // insight.IInsightQueryService
        public void query(boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IInsightQueryService {
        static final int TRANSACTION_query = 1;

        public static class Proxy implements IInsightQueryService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IInsightQueryService.DESCRIPTOR;
            }

            @Override // insight.IInsightQueryService
            public void query(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInsightQueryService.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IInsightQueryService.DESCRIPTOR);
        }

        public static IInsightQueryService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInsightQueryService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IInsightQueryService)) ? new Proxy(iBinder) : (IInsightQueryService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IInsightQueryService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IInsightQueryService.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            query(parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
    }

    void query(boolean z) throws RemoteException;
}
