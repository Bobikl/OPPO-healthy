package com.heytap.sports.recommend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.sports.recommend.bean.HealthStatus;

/* JADX INFO: loaded from: classes2.dex */
public interface IRecommendAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.sports.recommend.IRecommendAidl";

    public static class Default implements IRecommendAidl {
        @Override // com.heytap.sports.recommend.IRecommendAidl
        public void analyze(HealthStatus healthStatus, IRecommendCB iRecommendCB) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IRecommendAidl {
        static final int TRANSACTION_analyze = 1;

        public static class Proxy implements IRecommendAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.sports.recommend.IRecommendAidl
            public void analyze(HealthStatus healthStatus, IRecommendCB iRecommendCB) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecommendAidl.DESCRIPTOR);
                    a.d(parcelObtain, healthStatus, 0);
                    parcelObtain.writeStrongInterface(iRecommendCB);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRecommendAidl.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IRecommendAidl.DESCRIPTOR);
        }

        public static IRecommendAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRecommendAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRecommendAidl)) ? new Proxy(iBinder) : (IRecommendAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRecommendAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRecommendAidl.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            analyze((HealthStatus) a.c(parcel, HealthStatus.CREATOR), IRecommendCB.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class a {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void analyze(HealthStatus healthStatus, IRecommendCB iRecommendCB) throws RemoteException;
}
