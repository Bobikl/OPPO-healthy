package com.android.internal.telephony;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes12.dex */
public interface ITelephony extends IInterface {

    public static class Default implements ITelephony {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.android.internal.telephony.ITelephony
        public boolean endCall() throws RemoteException {
            return false;
        }

        @Override // com.android.internal.telephony.ITelephony
        public void enqueueSmsPickResult(String str, IIntegerConsumer iIntegerConsumer) throws RemoteException {
        }

        @Override // com.android.internal.telephony.ITelephony
        public void sendVisualVoicemailSmsForSubscriber(String str, int i, String str2, int i2, String str3, PendingIntent pendingIntent) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ITelephony {
        public static final String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
        static final int TRANSACTION_endCall = 3;
        static final int TRANSACTION_enqueueSmsPickResult = 1;
        static final int TRANSACTION_sendVisualVoicemailSmsForSubscriber = 2;

        public static class Proxy implements ITelephony {
            public static ITelephony sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.internal.telephony.ITelephony
            public boolean endCall() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().endCall();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.android.internal.telephony.ITelephony
            public void enqueueSmsPickResult(String str, IIntegerConsumer iIntegerConsumer) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iIntegerConsumer != null ? iIntegerConsumer.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().enqueueSmsPickResult(str, iIntegerConsumer);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.android.internal.telephony.ITelephony
            public void sendVisualVoicemailSmsForSubscriber(String str, int i, String str2, int i2, String str3, PendingIntent pendingIntent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str3);
                    if (pendingIntent != null) {
                        parcelObtain.writeInt(1);
                        pendingIntent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().sendVisualVoicemailSmsForSubscriber(str, i, str2, i2, str3, pendingIntent);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITelephony asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITelephony)) ? new Proxy(iBinder) : (ITelephony) iInterfaceQueryLocalInterface;
        }

        public static ITelephony getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ITelephony iTelephony) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iTelephony == null) {
                return false;
            }
            Proxy.sDefaultImpl = iTelephony;
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
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                enqueueSmsPickResult(parcel.readString(), IIntegerConsumer.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                sendVisualVoicemailSmsForSubscriber(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            boolean zEndCall = endCall();
            parcel2.writeNoException();
            parcel2.writeInt(zEndCall ? 1 : 0);
            return true;
        }
    }

    boolean endCall() throws RemoteException;

    void enqueueSmsPickResult(String str, IIntegerConsumer iIntegerConsumer) throws RemoteException;

    void sendVisualVoicemailSmsForSubscriber(String str, int i, String str2, int i2, String str3, PendingIntent pendingIntent) throws RemoteException;
}
