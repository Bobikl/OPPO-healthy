package com.heytap.health.watch.music.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes19.dex */
public interface IMusicControlAidl extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.health.watch.music.api.IMusicControlAidl";

    public static class Default implements IMusicControlAidl {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public boolean getMusicControlSwitch(String str) throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public boolean isMusicPlaying() throws RemoteException {
            return false;
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public void pauseMusicIfPlaying() throws RemoteException {
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public void registerPlayStateCallback(IMusicPlayStateCallback iMusicPlayStateCallback) throws RemoteException {
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public void sendMusicControlDisable(String str) throws RemoteException {
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public void sendMusicControlEnable(String str) throws RemoteException {
        }

        @Override // com.heytap.health.watch.music.api.IMusicControlAidl
        public void unregisterPlayStateCallback(IMusicPlayStateCallback iMusicPlayStateCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMusicControlAidl {
        static final int TRANSACTION_getMusicControlSwitch = 5;
        static final int TRANSACTION_isMusicPlaying = 1;
        static final int TRANSACTION_pauseMusicIfPlaying = 2;
        static final int TRANSACTION_registerPlayStateCallback = 6;
        static final int TRANSACTION_sendMusicControlDisable = 3;
        static final int TRANSACTION_sendMusicControlEnable = 4;
        static final int TRANSACTION_unregisterPlayStateCallback = 7;

        public static class Proxy implements IMusicControlAidl {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMusicControlAidl.DESCRIPTOR;
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public boolean getMusicControlSwitch(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public boolean isMusicPlaying() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public void pauseMusicIfPlaying() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public void registerPlayStateCallback(IMusicPlayStateCallback iMusicPlayStateCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMusicPlayStateCallback);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public void sendMusicControlDisable(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public void sendMusicControlEnable(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.health.watch.music.api.IMusicControlAidl
            public void unregisterPlayStateCallback(IMusicPlayStateCallback iMusicPlayStateCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMusicControlAidl.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iMusicPlayStateCallback);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMusicControlAidl.DESCRIPTOR);
        }

        public static IMusicControlAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IMusicControlAidl.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMusicControlAidl)) ? new Proxy(iBinder) : (IMusicControlAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IMusicControlAidl.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IMusicControlAidl.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    boolean zIsMusicPlaying = isMusicPlaying();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsMusicPlaying ? 1 : 0);
                    return true;
                case 2:
                    pauseMusicIfPlaying();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    sendMusicControlDisable(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    sendMusicControlEnable(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean musicControlSwitch = getMusicControlSwitch(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(musicControlSwitch ? 1 : 0);
                    return true;
                case 6:
                    registerPlayStateCallback(IMusicPlayStateCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    unregisterPlayStateCallback(IMusicPlayStateCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean getMusicControlSwitch(String str) throws RemoteException;

    boolean isMusicPlaying() throws RemoteException;

    void pauseMusicIfPlaying() throws RemoteException;

    void registerPlayStateCallback(IMusicPlayStateCallback iMusicPlayStateCallback) throws RemoteException;

    void sendMusicControlDisable(String str) throws RemoteException;

    void sendMusicControlEnable(String str) throws RemoteException;

    void unregisterPlayStateCallback(IMusicPlayStateCallback iMusicPlayStateCallback) throws RemoteException;
}
