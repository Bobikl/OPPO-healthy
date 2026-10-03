package com.heytap.health.telecom.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes18.dex */
public interface ITelecomSyncOnce extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.telecom.aidl.ITelecomSyncOnce";

    public static class Default implements ITelecomSyncOnce {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
        public void getAndSendPhoneSimState(boolean z) throws RemoteException {
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
        public void onPhoneSmsMessageReceived(MessageEvent messageEvent) throws RemoteException {
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
        public void onPhoneTelecomMessageReceived(MessageEvent messageEvent) throws RemoteException {
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
        public void sendCallAudioState(CallAudioState callAudioState) throws RemoteException {
        }

        @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
        public void sendPhoneCallChange(int i, String str, int i2, int i3, boolean z, boolean z2, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITelecomSyncOnce {
        static final int TRANSACTION_getAndSendPhoneSimState = 4;
        static final int TRANSACTION_onPhoneSmsMessageReceived = 2;
        static final int TRANSACTION_onPhoneTelecomMessageReceived = 3;
        static final int TRANSACTION_sendCallAudioState = 6;
        static final int TRANSACTION_sendPhoneCallChange = 5;

        public static class Proxy implements ITelecomSyncOnce {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void getAndSendPhoneSimState(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSyncOnce.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ITelecomSyncOnce.DESCRIPTOR;
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void onPhoneSmsMessageReceived(MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void onPhoneTelecomMessageReceived(MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void sendCallAudioState(CallAudioState callAudioState) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSyncOnce.DESCRIPTOR);
                    a.d(parcelObtain, callAudioState, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void sendPhoneCallChange(int i, String str, int i2, int i3, boolean z, boolean z2, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITelecomSyncOnce.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    int i4 = 1;
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!z2) {
                        i4 = 0;
                    }
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITelecomSyncOnce.DESCRIPTOR);
        }

        public static ITelecomSyncOnce asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITelecomSyncOnce.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITelecomSyncOnce)) ? new Proxy(iBinder) : (ITelecomSyncOnce) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ITelecomSyncOnce.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(ITelecomSyncOnce.DESCRIPTOR);
                return true;
            }
            if (i == 2) {
                onPhoneSmsMessageReceived((MessageEvent) a.c(parcel, MessageEvent.CREATOR));
                parcel2.writeNoException();
            } else if (i != 3) {
                if (i == 4) {
                    getAndSendPhoneSimState(parcel.readInt() != 0);
                    parcel2.writeNoException();
                } else if (i == 5) {
                    sendPhoneCallChange(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                } else {
                    if (i != 6) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    sendCallAudioState((CallAudioState) a.c(parcel, CallAudioState.CREATOR));
                    parcel2.writeNoException();
                }
            } else {
                onPhoneTelecomMessageReceived((MessageEvent) a.c(parcel, MessageEvent.CREATOR));
                parcel2.writeNoException();
            }
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

    void getAndSendPhoneSimState(boolean z) throws RemoteException;

    void onPhoneSmsMessageReceived(MessageEvent messageEvent) throws RemoteException;

    void onPhoneTelecomMessageReceived(MessageEvent messageEvent) throws RemoteException;

    void sendCallAudioState(CallAudioState callAudioState) throws RemoteException;

    void sendPhoneCallChange(int i, String str, int i2, int i3, boolean z, boolean z2, String str2) throws RemoteException;
}
