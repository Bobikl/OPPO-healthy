package com.heytap.health.voiceassistant;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes18.dex */
public interface IVoiceAssistantOnceApi extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.voiceassistant.IVoiceAssistantOnceApi";

    public static class Default implements IVoiceAssistantOnceApi {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.voiceassistant.IVoiceAssistantOnceApi
        public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
        }

        @Override // com.heytap.health.voiceassistant.IVoiceAssistantOnceApi
        public void onPeerConnected(Node node) throws RemoteException {
        }

        @Override // com.heytap.health.voiceassistant.IVoiceAssistantOnceApi
        public void onPeerDisconnected(Node node) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IVoiceAssistantOnceApi {
        static final int TRANSACTION_onMessageReceived = 3;
        static final int TRANSACTION_onPeerConnected = 1;
        static final int TRANSACTION_onPeerDisconnected = 2;

        public static class Proxy implements IVoiceAssistantOnceApi {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IVoiceAssistantOnceApi.DESCRIPTOR;
            }

            @Override // com.heytap.health.voiceassistant.IVoiceAssistantOnceApi
            public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceAssistantOnceApi.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    a.d(parcelObtain, messageEvent, 0);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.voiceassistant.IVoiceAssistantOnceApi
            public void onPeerConnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceAssistantOnceApi.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.voiceassistant.IVoiceAssistantOnceApi
            public void onPeerDisconnected(Node node) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IVoiceAssistantOnceApi.DESCRIPTOR);
                    a.d(parcelObtain, node, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IVoiceAssistantOnceApi.DESCRIPTOR);
        }

        public static IVoiceAssistantOnceApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IVoiceAssistantOnceApi.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IVoiceAssistantOnceApi)) ? new Proxy(iBinder) : (IVoiceAssistantOnceApi) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IVoiceAssistantOnceApi.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IVoiceAssistantOnceApi.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onPeerConnected((Node) a.c(parcel, Node.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                onPeerDisconnected((Node) a.c(parcel, Node.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onMessageReceived(parcel.readString(), (MessageEvent) a.c(parcel, MessageEvent.CREATOR));
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

    void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException;

    void onPeerConnected(Node node) throws RemoteException;

    void onPeerDisconnected(Node node) throws RemoteException;
}
