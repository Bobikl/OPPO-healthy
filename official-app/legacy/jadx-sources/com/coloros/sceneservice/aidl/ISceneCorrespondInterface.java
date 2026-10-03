package com.coloros.sceneservice.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes13.dex */
public interface ISceneCorrespondInterface extends IInterface {

    public static abstract class Stub extends Binder implements ISceneCorrespondInterface {
        public static final String DESCRIPTOR = "com.coloros.sceneservice.aidl.ISceneCorrespondInterface";
        public static final int TRANSACTION_invokeServiceMethod = 5;
        public static final int TRANSACTION_registerSceneClient = 1;
        public static final int TRANSACTION_subscribeService = 3;
        public static final int TRANSACTION_unregisterSceneClient = 2;
        public static final int TRANSACTION_unsubscribeService = 4;

        public static class Proxy implements ISceneCorrespondInterface {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.coloros.sceneservice.aidl.ISceneCorrespondInterface
            public void invokeServiceMethod(String str, int i, String str2, String str3, Bundle bundle, IInvokeMethodCallBack iInvokeMethodCallBack) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iInvokeMethodCallBack != null ? iInvokeMethodCallBack.asBinder() : null);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.sceneservice.aidl.ISceneCorrespondInterface
            public boolean registerSceneClient(ISceneClientCallBack iSceneClientCallBack, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iSceneClientCallBack != null ? iSceneClientCallBack.asBinder() : null);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.sceneservice.aidl.ISceneCorrespondInterface
            public boolean subscribeService(String str, int i, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.sceneservice.aidl.ISceneCorrespondInterface
            public void unregisterSceneClient(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.coloros.sceneservice.aidl.ISceneCorrespondInterface
            public void unsubscribeService(String str, int i, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISceneCorrespondInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISceneCorrespondInterface)) ? new Proxy(iBinder) : (ISceneCorrespondInterface) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zRegisterSceneClient = registerSceneClient(ISceneClientCallBack.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zRegisterSceneClient ? 1 : 0);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterSceneClient(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zSubscribeService = subscribeService(parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zSubscribeService ? 1 : 0);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                unsubscribeService(parcel.readString(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            invokeServiceMethod(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, IInvokeMethodCallBack.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void invokeServiceMethod(String str, int i, String str2, String str3, Bundle bundle, IInvokeMethodCallBack iInvokeMethodCallBack);

    boolean registerSceneClient(ISceneClientCallBack iSceneClientCallBack, String str);

    boolean subscribeService(String str, int i, String str2);

    void unregisterSceneClient(String str);

    void unsubscribeService(String str, int i, String str2);
}
