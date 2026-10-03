package com.heytap.speechassist.conversation.sdk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface ISpeechAssistProxy extends IInterface {

    public static class Default implements ISpeechAssistProxy {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public int getRecognizeState() throws RemoteException {
            return 0;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public Bundle getSpeechAssistStatus(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean isIdle() throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean isRecognizing() throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean isRecording() throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean isSpeaking() throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean sendEvent(String str, Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean sendText(Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean speak(Bundle bundle) throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean startSpeech(Bundle bundle, IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
        public boolean stopSpeech(Bundle bundle) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements ISpeechAssistProxy {
        private static final String DESCRIPTOR = "com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy";
        static final int TRANSACTION_getRecognizeState = 6;
        static final int TRANSACTION_getSpeechAssistStatus = 1;
        static final int TRANSACTION_isIdle = 7;
        static final int TRANSACTION_isRecognizing = 10;
        static final int TRANSACTION_isRecording = 9;
        static final int TRANSACTION_isSpeaking = 8;
        static final int TRANSACTION_sendEvent = 11;
        static final int TRANSACTION_sendText = 5;
        static final int TRANSACTION_speak = 4;
        static final int TRANSACTION_startSpeech = 2;
        static final int TRANSACTION_stopSpeech = 3;

        public static class Proxy implements ISpeechAssistProxy {
            public static ISpeechAssistProxy sDefaultImpl;
            private IBinder mRemote;

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

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public int getRecognizeState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRecognizeState();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public Bundle getSpeechAssistStatus(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSpeechAssistStatus(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean isIdle() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isIdle();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean isRecognizing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isRecognizing();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean isRecording() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isRecording();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean isSpeaking() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSpeaking();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean sendEvent(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendEvent(str, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean sendText(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendText(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean speak(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().speak(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean startSpeech(Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startSpeech(bundle, iBinder);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.speechassist.conversation.sdk.ISpeechAssistProxy
            public boolean stopSpeech(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopSpeech(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISpeechAssistProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ISpeechAssistProxy)) ? new Proxy(iBinder) : (ISpeechAssistProxy) iInterfaceQueryLocalInterface;
        }

        public static ISpeechAssistProxy getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISpeechAssistProxy iSpeechAssistProxy) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iSpeechAssistProxy == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSpeechAssistProxy;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle speechAssistStatus = getSpeechAssistStatus(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (speechAssistStatus != null) {
                        parcel2.writeInt(1);
                        speechAssistStatus.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStartSpeech = startSpeech(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartSpeech ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopSpeech = stopSpeech(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopSpeech ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSpeak = speak(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSpeak ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSendText = sendText(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendText ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    int recognizeState = getRecognizeState();
                    parcel2.writeNoException();
                    parcel2.writeInt(recognizeState);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsIdle = isIdle();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsIdle ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsSpeaking = isSpeaking();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSpeaking ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsRecording = isRecording();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsRecording ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsRecognizing = isRecognizing();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsRecognizing ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSendEvent = sendEvent(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendEvent ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int getRecognizeState() throws RemoteException;

    Bundle getSpeechAssistStatus(Bundle bundle) throws RemoteException;

    boolean isIdle() throws RemoteException;

    boolean isRecognizing() throws RemoteException;

    boolean isRecording() throws RemoteException;

    boolean isSpeaking() throws RemoteException;

    boolean sendEvent(String str, Bundle bundle) throws RemoteException;

    boolean sendText(Bundle bundle) throws RemoteException;

    boolean speak(Bundle bundle) throws RemoteException;

    boolean startSpeech(Bundle bundle, IBinder iBinder) throws RemoteException;

    boolean stopSpeech(Bundle bundle) throws RemoteException;
}
