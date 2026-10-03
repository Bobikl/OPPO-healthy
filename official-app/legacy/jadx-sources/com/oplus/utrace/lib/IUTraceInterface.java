package com.oplus.utrace.lib;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IUTraceInterface extends IInterface {
    public static final String DESCRIPTOR = "com.oplus.utrace.lib.IUTraceInterface";

    public static class Default implements IUTraceInterface {
        @Override // com.oplus.utrace.lib.IUTraceInterface
        public void addTrace(UTraceRecord uTraceRecord) throws RemoteException {
        }

        @Override // com.oplus.utrace.lib.IUTraceInterface
        public int addTrace2(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.utrace.lib.IUTraceInterface
        public int addTraces(List<String> list) throws RemoteException {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.utrace.lib.IUTraceInterface
        public Bundle sendTraceFiles(Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUTraceInterface {
        static final int TRANSACTION_addTrace = 1;
        static final int TRANSACTION_addTrace2 = 2;
        static final int TRANSACTION_addTraces = 3;
        static final int TRANSACTION_sendTraceFiles = 4;

        public static class Proxy implements IUTraceInterface {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oplus.utrace.lib.IUTraceInterface
            public void addTrace(UTraceRecord uTraceRecord) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUTraceInterface.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, uTraceRecord, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.utrace.lib.IUTraceInterface
            public int addTrace2(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUTraceInterface.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.utrace.lib.IUTraceInterface
            public int addTraces(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUTraceInterface.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
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
                return IUTraceInterface.DESCRIPTOR;
            }

            @Override // com.oplus.utrace.lib.IUTraceInterface
            public Bundle sendTraceFiles(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUTraceInterface.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IUTraceInterface.DESCRIPTOR);
        }

        public static IUTraceInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUTraceInterface.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUTraceInterface)) ? new Proxy(iBinder) : (IUTraceInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IUTraceInterface.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IUTraceInterface.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                addTrace((UTraceRecord) _Parcel.readTypedObject(parcel, UTraceRecord.INSTANCE));
                parcel2.writeNoException();
            } else if (i == 2) {
                int iAddTrace2 = addTrace2(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iAddTrace2);
            } else if (i == 3) {
                int iAddTraces = addTraces(parcel.createStringArrayList());
                parcel2.writeNoException();
                parcel2.writeInt(iAddTraces);
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Bundle bundleSendTraceFiles = sendTraceFiles((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, bundleSendTraceFiles, 1);
            }
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addTrace(UTraceRecord uTraceRecord) throws RemoteException;

    int addTrace2(String str) throws RemoteException;

    int addTraces(List<String> list) throws RemoteException;

    Bundle sendTraceFiles(Bundle bundle) throws RemoteException;
}
