package com.oplus.aiunit.core.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.core.FramePackage;

/* JADX INFO: loaded from: classes3.dex */
public interface IInferenceCallback extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.aiunit.core.callback.IInferenceCallback";

    public static class Default implements IInferenceCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.aiunit.core.callback.IInferenceCallback
        public void onInferenceCallback(FramePackage framePackage) {
        }
    }

    public static abstract class Stub extends Binder implements IInferenceCallback {
        static final int TRANSACTION_onInferenceCallback = 1;

        public static class Proxy implements IInferenceCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IInferenceCallback.DESCRIPTOR;
            }

            @Override // com.oplus.aiunit.core.callback.IInferenceCallback
            public void onInferenceCallback(FramePackage framePackage) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IInferenceCallback.DESCRIPTOR);
                    a.d(parcelObtain, framePackage, 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IInferenceCallback.DESCRIPTOR);
        }

        public static IInferenceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IInferenceCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IInferenceCallback)) ? new Proxy(iBinder) : (IInferenceCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IInferenceCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IInferenceCallback.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onInferenceCallback((FramePackage) a.c(parcel, FramePackage.CREATOR));
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

    void onInferenceCallback(FramePackage framePackage);
}
