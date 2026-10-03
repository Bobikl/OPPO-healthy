package com.oplus.ocs.wearengine.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.ocs.wearengine.bean.ExerciseUpdateListenerEvent;

/* JADX INFO: loaded from: classes8.dex */
public interface IExerciseUpdateListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.ocs.wearengine.aidl.IExerciseUpdateListener";

    public static class Default implements IExerciseUpdateListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.ocs.wearengine.aidl.IExerciseUpdateListener
        public void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IExerciseUpdateListener {
        static final int TRANSACTION_onExerciseUpdateListenerEvent = 1;

        public static class Proxy implements IExerciseUpdateListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IExerciseUpdateListener.DESCRIPTOR;
            }

            @Override // com.oplus.ocs.wearengine.aidl.IExerciseUpdateListener
            public void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IExerciseUpdateListener.DESCRIPTOR);
                    a.d(parcelObtain, exerciseUpdateListenerEvent, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IExerciseUpdateListener.DESCRIPTOR);
        }

        public static IExerciseUpdateListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IExerciseUpdateListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IExerciseUpdateListener)) ? new Proxy(iBinder) : (IExerciseUpdateListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IExerciseUpdateListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IExerciseUpdateListener.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onExerciseUpdateListenerEvent((ExerciseUpdateListenerEvent) a.c(parcel, ExerciseUpdateListenerEvent.CREATOR));
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

    void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) throws RemoteException;
}
