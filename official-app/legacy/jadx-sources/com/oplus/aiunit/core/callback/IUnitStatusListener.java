package com.oplus.aiunit.core.callback;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.oplus.aiunit.core.IUnit;

/* JADX INFO: loaded from: classes3.dex */
public interface IUnitStatusListener extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.aiunit.core.callback.IUnitStatusListener";

    public static class Default implements IUnitStatusListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
        public void onDestroy(String str, String str2) {
        }

        @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
        public void onFail(String str, int i) {
        }

        @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
        public void onFailSpec(String str, String str2, int i, String str3) {
        }

        @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
        public void onStart(IUnit iUnit, String str) {
        }

        @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
        public void onStop(String str) {
        }
    }

    public static abstract class Stub extends Binder implements IUnitStatusListener {
        static final int TRANSACTION_onDestroy = 5;
        static final int TRANSACTION_onFail = 3;
        static final int TRANSACTION_onFailSpec = 4;
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_onStop = 2;

        public static class Proxy implements IUnitStatusListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IUnitStatusListener.DESCRIPTOR;
            }

            @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
            public void onDestroy(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnitStatusListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
            public void onFail(String str, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnitStatusListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
            public void onFailSpec(String str, String str2, int i, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnitStatusListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str3);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
            public void onStart(IUnit iUnit, String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnitStatusListener.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iUnit);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.aiunit.core.callback.IUnitStatusListener
            public void onStop(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnitStatusListener.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUnitStatusListener.DESCRIPTOR);
        }

        public static IUnitStatusListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnitStatusListener.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnitStatusListener)) ? new Proxy(iBinder) : (IUnitStatusListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUnitStatusListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUnitStatusListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onStart(IUnit.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
            } else if (i == 2) {
                onStop(parcel.readString());
            } else if (i == 3) {
                onFail(parcel.readString(), parcel.readInt());
            } else if (i == 4) {
                onFailSpec(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onDestroy(parcel.readString(), parcel.readString());
            }
            return true;
        }
    }

    void onDestroy(String str, String str2);

    void onFail(String str, int i);

    void onFailSpec(String str, String str2, int i, String str3);

    void onStart(IUnit iUnit, String str);

    void onStop(String str);
}
