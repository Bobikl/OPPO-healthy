package com.heytap.sports.recommend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.sports.recommend.bean.AnalyzeResult;

/* JADX INFO: loaded from: classes2.dex */
public interface IRecommendCB extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.sports.recommend.IRecommendCB";

    public static class Default implements IRecommendCB {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.sports.recommend.IRecommendCB
        public void onResult(AnalyzeResult analyzeResult, int i) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRecommendCB {
        static final int TRANSACTION_onResult = 1;

        public static class Proxy implements IRecommendCB {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRecommendCB.DESCRIPTOR;
            }

            @Override // com.heytap.sports.recommend.IRecommendCB
            public void onResult(AnalyzeResult analyzeResult, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IRecommendCB.DESCRIPTOR);
                    a.d(parcelObtain, analyzeResult, 0);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRecommendCB.DESCRIPTOR);
        }

        public static IRecommendCB asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IRecommendCB.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRecommendCB)) ? new Proxy(iBinder) : (IRecommendCB) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRecommendCB.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRecommendCB.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onResult((AnalyzeResult) a.c(parcel, AnalyzeResult.CREATOR), parcel.readInt());
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

    void onResult(AnalyzeResult analyzeResult, int i) throws RemoteException;
}
