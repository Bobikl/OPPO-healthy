package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface IEventHandleService extends IInterface {

    public static class Default implements IEventHandleService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public List<Event> getAvailableEvent() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public boolean isAvailableEvent(Event event) throws RemoteException {
            return false;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public void queryEvent(Event event, IEventQueryListener iEventQueryListener) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public void queryEvents(EventConfig eventConfig, IEventQueryListener iEventQueryListener) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public int registerEventCallback(String str, IEventCallback iEventCallback, EventConfig eventConfig) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public void triggerHookEvent(TriggerEvent triggerEvent) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public int unregisterEventCallback(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
        public int unregisterEventCallbackWithArgs(String str, EventConfig eventConfig) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IEventHandleService {
        private static final String DESCRIPTOR = "com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService";
        static final int TRANSACTION_getAvailableEvent = 6;
        static final int TRANSACTION_isAvailableEvent = 7;
        static final int TRANSACTION_queryEvent = 10;
        static final int TRANSACTION_queryEvents = 11;
        static final int TRANSACTION_registerEventCallback = 4;
        static final int TRANSACTION_triggerHookEvent = 1;
        static final int TRANSACTION_unregisterEventCallback = 5;
        static final int TRANSACTION_unregisterEventCallbackWithArgs = 9;

        public static class Proxy implements IEventHandleService {
            public static IEventHandleService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public List<Event> getAvailableEvent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAvailableEvent();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(Event.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public boolean isAvailableEvent(Event event) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (event != null) {
                        parcelObtain.writeInt(1);
                        event.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAvailableEvent(event);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public void queryEvent(Event event, IEventQueryListener iEventQueryListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (event != null) {
                        parcelObtain.writeInt(1);
                        event.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iEventQueryListener != null ? iEventQueryListener.asBinder() : null);
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().queryEvent(event, iEventQueryListener);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public void queryEvents(EventConfig eventConfig, IEventQueryListener iEventQueryListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (eventConfig != null) {
                        parcelObtain.writeInt(1);
                        eventConfig.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongBinder(iEventQueryListener != null ? iEventQueryListener.asBinder() : null);
                    if (this.mRemote.transact(11, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().queryEvents(eventConfig, iEventQueryListener);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public int registerEventCallback(String str, IEventCallback iEventCallback, EventConfig eventConfig) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iEventCallback != null ? iEventCallback.asBinder() : null);
                    if (eventConfig != null) {
                        parcelObtain.writeInt(1);
                        eventConfig.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerEventCallback(str, iEventCallback, eventConfig);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public void triggerHookEvent(TriggerEvent triggerEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (triggerEvent != null) {
                        parcelObtain.writeInt(1);
                        triggerEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().triggerHookEvent(triggerEvent);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public int unregisterEventCallback(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterEventCallback(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventHandleService
            public int unregisterEventCallbackWithArgs(String str, EventConfig eventConfig) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (eventConfig != null) {
                        parcelObtain.writeInt(1);
                        eventConfig.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterEventCallbackWithArgs(str, eventConfig);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IEventHandleService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEventHandleService)) ? new Proxy(iBinder) : (IEventHandleService) iInterfaceQueryLocalInterface;
        }

        public static IEventHandleService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IEventHandleService iEventHandleService) {
            if (Proxy.sDefaultImpl != null || iEventHandleService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iEventHandleService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                triggerHookEvent(parcel.readInt() != 0 ? TriggerEvent.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                int iRegisterEventCallback = registerEventCallback(parcel.readString(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? EventConfig.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterEventCallback);
                return true;
            }
            if (i == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                int iUnregisterEventCallback = unregisterEventCallback(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iUnregisterEventCallback);
                return true;
            }
            if (i == 6) {
                parcel.enforceInterface(DESCRIPTOR);
                List<Event> availableEvent = getAvailableEvent();
                parcel2.writeNoException();
                parcel2.writeTypedList(availableEvent);
                return true;
            }
            if (i == 7) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsAvailableEvent = isAvailableEvent(parcel.readInt() != 0 ? Event.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(zIsAvailableEvent ? 1 : 0);
                return true;
            }
            switch (i) {
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iUnregisterEventCallbackWithArgs = unregisterEventCallbackWithArgs(parcel.readString(), parcel.readInt() != 0 ? EventConfig.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnregisterEventCallbackWithArgs);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    queryEvent(parcel.readInt() != 0 ? Event.CREATOR.createFromParcel(parcel) : null, IEventQueryListener.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    queryEvents(parcel.readInt() != 0 ? EventConfig.CREATOR.createFromParcel(parcel) : null, IEventQueryListener.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    List<Event> getAvailableEvent() throws RemoteException;

    boolean isAvailableEvent(Event event) throws RemoteException;

    void queryEvent(Event event, IEventQueryListener iEventQueryListener) throws RemoteException;

    void queryEvents(EventConfig eventConfig, IEventQueryListener iEventQueryListener) throws RemoteException;

    int registerEventCallback(String str, IEventCallback iEventCallback, EventConfig eventConfig) throws RemoteException;

    void triggerHookEvent(TriggerEvent triggerEvent) throws RemoteException;

    int unregisterEventCallback(String str) throws RemoteException;

    int unregisterEventCallbackWithArgs(String str, EventConfig eventConfig) throws RemoteException;
}
