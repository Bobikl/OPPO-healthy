package android.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public interface IWallpaperManagerCallbackNative extends IInterface {
    public static final String DESCRIPTOR = "android.app.IWallpaperManagerCallbackNative";

    public static class Default implements IWallpaperManagerCallbackNative {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.app.IWallpaperManagerCallbackNative
        public void onWallpaperChanged() throws RemoteException {
        }

        @Override // android.app.IWallpaperManagerCallbackNative
        public void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWallpaperManagerCallbackNative {
        static final int TRANSACTION_onWallpaperChanged = 1;
        static final int TRANSACTION_onWallpaperColorsChanged = 2;

        public static class Proxy implements IWallpaperManagerCallbackNative {
            public static IWallpaperManagerCallbackNative sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWallpaperManagerCallbackNative.DESCRIPTOR;
            }

            @Override // android.app.IWallpaperManagerCallbackNative
            public void onWallpaperChanged() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWallpaperManagerCallbackNative.DESCRIPTOR);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onWallpaperChanged();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.app.IWallpaperManagerCallbackNative
            public void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWallpaperManagerCallbackNative.DESCRIPTOR);
                    if (wallpaperColors != null) {
                        parcelObtain.writeInt(1);
                        wallpaperColors.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onWallpaperColorsChanged(wallpaperColors, i, i2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IWallpaperManagerCallbackNative.DESCRIPTOR);
        }

        public static IWallpaperManagerCallbackNative asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWallpaperManagerCallbackNative.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWallpaperManagerCallbackNative)) ? new Proxy(iBinder) : (IWallpaperManagerCallbackNative) iInterfaceQueryLocalInterface;
        }

        public static IWallpaperManagerCallbackNative getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IWallpaperManagerCallbackNative iWallpaperManagerCallbackNative) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iWallpaperManagerCallbackNative == null) {
                return false;
            }
            Proxy.sDefaultImpl = iWallpaperManagerCallbackNative;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(IWallpaperManagerCallbackNative.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                parcel.enforceInterface(IWallpaperManagerCallbackNative.DESCRIPTOR);
                onWallpaperChanged();
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(IWallpaperManagerCallbackNative.DESCRIPTOR);
            onWallpaperColorsChanged(parcel.readInt() != 0 ? (WallpaperColors) WallpaperColors.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onWallpaperChanged() throws RemoteException;

    void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i, int i2) throws RemoteException;
}
