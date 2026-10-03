package com.oplus.aiunit.core.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.core.FramePackage;

/* JADX INFO: loaded from: classes3.dex */
public interface IAIMessenger extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.aiunit.core.callback.IAIMessenger";

    public static class Default implements IAIMessenger {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.aiunit.core.callback.IAIMessenger
        public int send(FramePackage framePackage) {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IAIMessenger {
        static final int TRANSACTION_send = 1;

        public static class Proxy implements IAIMessenger {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAIMessenger.DESCRIPTOR;
            }

            @Override // com.oplus.aiunit.core.callback.IAIMessenger
            public int send(FramePackage framePackage) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IAIMessenger.DESCRIPTOR);
                    a.d(parcelObtain, framePackage, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i = parcelObtain2.readInt();
                    if (parcelObtain2.readInt() != 0) {
                        framePackage.readFromParcel(parcelObtain2);
                    }
                    return i;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAIMessenger.DESCRIPTOR);
        }

        public static IAIMessenger asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IAIMessenger.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IAIMessenger)) ? new Proxy(iBinder) : (IAIMessenger) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAIMessenger.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAIMessenger.DESCRIPTOR);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            FramePackage framePackage = (FramePackage) a.c(parcel, FramePackage.CREATOR);
            int iSend = send(framePackage);
            parcel2.writeNoException();
            parcel2.writeInt(iSend);
            a.d(parcel2, framePackage, 1);
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

    int send(FramePackage framePackage);
}
