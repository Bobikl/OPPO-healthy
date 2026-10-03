package com.heytap.databaseengine.apiv2.device.game;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteDataChangeListener;
import com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteResponseListener;
import com.heytap.databaseengine.apiv2.device.game.callback.OnRequestGameStatusListener;
import com.heytap.databaseengine.apiv2.device.game.model.GameDataWrapper;
import com.heytap.databaseengine.apiv2.device.game.model.GameInfo;

/* JADX INFO: loaded from: classes15.dex */
public interface IDeviceGame extends IInterface {
    public static final String DESCRIPTOR = "com.heytap.databaseengine.apiv2.device.game.IDeviceGame";

    public static class Default implements IDeviceGame {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public int end(GameInfo gameInfo) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void endRound(GameInfo gameInfo) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public boolean isConnectGameDevice() throws RemoteException {
            return false;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public boolean isPlaying() throws RemoteException {
            return false;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public boolean isWearing() throws RemoteException {
            return false;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void onPermissionChanged(boolean z) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void pause(GameInfo gameInfo) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void resume(GameInfo gameInfo) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void setOnRequestGameStatusListener(OnRequestGameStatusListener onRequestGameStatusListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void setOnResponseListener(OnRemoteResponseListener onRemoteResponseListener) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void setSendConfig(boolean z) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void setVerifyGameSwitch(boolean z) throws RemoteException {
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public boolean shouldCallForwarding() throws RemoteException {
            return false;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public int start(GameInfo gameInfo) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public int startRound(GameInfo gameInfo) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public int startWithListener(String str, OnRemoteDataChangeListener onRemoteDataChangeListener) throws RemoteException {
            return 0;
        }

        @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
        public void updateData(GameInfo gameInfo, GameDataWrapper gameDataWrapper) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDeviceGame {
        static final int TRANSACTION_end = 7;
        static final int TRANSACTION_endRound = 6;
        static final int TRANSACTION_isConnectGameDevice = 13;
        static final int TRANSACTION_isPlaying = 11;
        static final int TRANSACTION_isWearing = 12;
        static final int TRANSACTION_onPermissionChanged = 16;
        static final int TRANSACTION_pause = 9;
        static final int TRANSACTION_resume = 8;
        static final int TRANSACTION_setOnRequestGameStatusListener = 17;
        static final int TRANSACTION_setOnResponseListener = 5;
        static final int TRANSACTION_setSendConfig = 14;
        static final int TRANSACTION_setVerifyGameSwitch = 15;
        static final int TRANSACTION_shouldCallForwarding = 10;
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_startRound = 2;
        static final int TRANSACTION_startWithListener = 3;
        static final int TRANSACTION_updateData = 4;

        public static class Proxy implements IDeviceGame {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public int end(GameInfo gameInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void endRound(GameInfo gameInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IDeviceGame.DESCRIPTOR;
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public boolean isConnectGameDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public boolean isPlaying() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public boolean isWearing() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void onPermissionChanged(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void pause(GameInfo gameInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void resume(GameInfo gameInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void setOnRequestGameStatusListener(OnRequestGameStatusListener onRequestGameStatusListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(onRequestGameStatusListener);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void setOnResponseListener(OnRemoteResponseListener onRemoteResponseListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(onRemoteResponseListener);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void setSendConfig(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void setVerifyGameSwitch(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public boolean shouldCallForwarding() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public int start(GameInfo gameInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public int startRound(GameInfo gameInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public int startWithListener(String str, OnRemoteDataChangeListener onRemoteDataChangeListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(onRemoteDataChangeListener);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
            public void updateData(GameInfo gameInfo, GameDataWrapper gameDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDeviceGame.DESCRIPTOR);
                    a.d(parcelObtain, gameInfo, 0);
                    a.d(parcelObtain, gameDataWrapper, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IDeviceGame.DESCRIPTOR);
        }

        public static IDeviceGame asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDeviceGame.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceGame)) ? new Proxy(iBinder) : (IDeviceGame) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDeviceGame.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDeviceGame.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    int iStart = start((GameInfo) a.c(parcel, GameInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStart);
                    return true;
                case 2:
                    int iStartRound = startRound((GameInfo) a.c(parcel, GameInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartRound);
                    return true;
                case 3:
                    int iStartWithListener = startWithListener(parcel.readString(), OnRemoteDataChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartWithListener);
                    return true;
                case 4:
                    updateData((GameInfo) a.c(parcel, GameInfo.CREATOR), (GameDataWrapper) a.c(parcel, GameDataWrapper.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    setOnResponseListener(OnRemoteResponseListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    endRound((GameInfo) a.c(parcel, GameInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    int iEnd = end((GameInfo) a.c(parcel, GameInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iEnd);
                    return true;
                case 8:
                    resume((GameInfo) a.c(parcel, GameInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    pause((GameInfo) a.c(parcel, GameInfo.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    boolean zShouldCallForwarding = shouldCallForwarding();
                    parcel2.writeNoException();
                    parcel2.writeInt(zShouldCallForwarding ? 1 : 0);
                    return true;
                case 11:
                    boolean zIsPlaying = isPlaying();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsPlaying ? 1 : 0);
                    return true;
                case 12:
                    boolean zIsWearing = isWearing();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsWearing ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsConnectGameDevice = isConnectGameDevice();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnectGameDevice ? 1 : 0);
                    return true;
                case 14:
                    setSendConfig(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    setVerifyGameSwitch(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    onPermissionChanged(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    setOnRequestGameStatusListener(OnRequestGameStatusListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
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

    int end(GameInfo gameInfo) throws RemoteException;

    void endRound(GameInfo gameInfo) throws RemoteException;

    boolean isConnectGameDevice() throws RemoteException;

    boolean isPlaying() throws RemoteException;

    boolean isWearing() throws RemoteException;

    void onPermissionChanged(boolean z) throws RemoteException;

    void pause(GameInfo gameInfo) throws RemoteException;

    void resume(GameInfo gameInfo) throws RemoteException;

    void setOnRequestGameStatusListener(OnRequestGameStatusListener onRequestGameStatusListener) throws RemoteException;

    void setOnResponseListener(OnRemoteResponseListener onRemoteResponseListener) throws RemoteException;

    void setSendConfig(boolean z) throws RemoteException;

    void setVerifyGameSwitch(boolean z) throws RemoteException;

    boolean shouldCallForwarding() throws RemoteException;

    int start(GameInfo gameInfo) throws RemoteException;

    int startRound(GameInfo gameInfo) throws RemoteException;

    int startWithListener(String str, OnRemoteDataChangeListener onRemoteDataChangeListener) throws RemoteException;

    void updateData(GameInfo gameInfo, GameDataWrapper gameDataWrapper) throws RemoteException;
}
