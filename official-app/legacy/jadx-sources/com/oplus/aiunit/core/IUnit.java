package com.oplus.aiunit.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public interface IUnit extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.aiunit.core.IUnit";

    public static class Default implements IUnit {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.aiunit.core.IUnit
        public int attach(ConfigPackage configPackage) {
            return 0;
        }

        @Override // com.oplus.aiunit.core.IUnit
        public int detach(String str) {
            return 0;
        }

        @Override // com.oplus.aiunit.core.IUnit
        public String getName() {
            return null;
        }

        @Override // com.oplus.aiunit.core.IUnit
        public void getRunningInfo(Bundle bundle) {
        }

        @Override // com.oplus.aiunit.core.IUnit
        public boolean isActive() {
            return false;
        }

        @Override // com.oplus.aiunit.core.IUnit
        public int process(FramePackage framePackage) {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IUnit {
        static final int TRANSACTION_attach = 1;
        static final int TRANSACTION_detach = 2;
        static final int TRANSACTION_getName = 4;
        static final int TRANSACTION_getRunningInfo = 6;
        static final int TRANSACTION_isActive = 5;
        static final int TRANSACTION_process = 3;

        public static class Proxy implements IUnit {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.aiunit.core.IUnit
            public int attach(ConfigPackage configPackage) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnit.DESCRIPTOR);
                    a.d(parcelObtain, configPackage, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.IUnit
            public int detach(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnit.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IUnit.DESCRIPTOR;
            }

            @Override // com.oplus.aiunit.core.IUnit
            public String getName() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnit.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.IUnit
            public void getRunningInfo(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnit.DESCRIPTOR);
                    a.d(parcelObtain, bundle, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        bundle.readFromParcel(parcelObtain2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.IUnit
            public boolean isActive() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnit.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.IUnit
            public int process(FramePackage framePackage) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnit.DESCRIPTOR);
                    a.d(parcelObtain, framePackage, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
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
            attachInterface(this, IUnit.DESCRIPTOR);
        }

        public static IUnit asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnit.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnit)) ? new Proxy(iBinder) : (IUnit) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUnit.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUnit.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    int iAttach = attach((ConfigPackage) a.c(parcel, ConfigPackage.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iAttach);
                    return true;
                case 2:
                    int iDetach = detach(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iDetach);
                    return true;
                case 3:
                    FramePackage framePackage = (FramePackage) a.c(parcel, FramePackage.CREATOR);
                    int iProcess = process(framePackage);
                    parcel2.writeNoException();
                    parcel2.writeInt(iProcess);
                    a.d(parcel2, framePackage, 1);
                    return true;
                case 4:
                    String name = getName();
                    parcel2.writeNoException();
                    parcel2.writeString(name);
                    return true;
                case 5:
                    boolean zIsActive = isActive();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsActive ? 1 : 0);
                    return true;
                case 6:
                    Bundle bundle = (Bundle) a.c(parcel, Bundle.CREATOR);
                    getRunningInfo(bundle);
                    parcel2.writeNoException();
                    a.d(parcel2, bundle, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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

    int attach(ConfigPackage configPackage);

    int detach(String str);

    String getName();

    void getRunningInfo(Bundle bundle);

    boolean isActive();

    int process(FramePackage framePackage);
}
