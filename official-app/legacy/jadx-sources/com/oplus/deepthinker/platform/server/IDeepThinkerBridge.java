package com.oplus.deepthinker.platform.server;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.Event;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventConfig;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener;
import com.oplus.deepthinker.sdk.app.aidl.proton.appactionpredict.PredictAABResult;
import com.oplus.deepthinker.sdk.app.aidl.proton.appactionpredict.PredictResult;
import com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.DeepSleepPredictResult;
import com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.SleepRecord;
import com.oplus.deepthinker.sdk.app.aidl.proton.deepsleep.TotalPredictResult;
import com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision.IntentResult;
import com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision.ServiceResult;
import com.oplus.deepthinker.sdk.app.aidl.proton.periodtopapps.PeriodTopAppsResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface IDeepThinkerBridge extends IInterface {

    public static class Default implements IDeepThinkerBridge {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int availableState(int i, String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public Bundle call(String str, String str2, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List capability() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public Map checkPermission(int i, String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public IBinder exchange(String str, String str2, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<PeriodTopAppsResult> getAllPeriodDurationTopApps(int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<PeriodTopAppsResult> getAllPeriodFrequencyTopApps(int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public PredictResult getAppPredictResult(String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<PredictResult> getAppPredictResultMap(String str) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<String> getAppQueueSortedByComplex() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<String> getAppQueueSortedByCount() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<String> getAppQueueSortedByTime() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int getAppType(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public Map getAppTypeMap(List<String> list) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public PeriodTopAppsResult getCertainPeriodDurationTopApps(float f, int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public PeriodTopAppsResult getCertainPeriodFrequencyTopApps(float f, int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public DeepSleepPredictResult getDeepSleepPredictResult() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public String getDeepSleepPredictResultWithPercentile() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public TotalPredictResult getDeepSleepTotalPredictResult() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int getIdleScreenResultInLongTime() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int getIdleScreenResultInMiddleTime() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int getIdleScreenResultInShortTime() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public SleepRecord getLastDeepSleepRecord() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int getPlatformVersion() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public PredictAABResult getPredictAABResult() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public DeepSleepPredictResult getPredictResultWithFeedBack() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public List<String> getSmartGpsBssidList() throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public void onewayCall(String str, String str2, Bundle bundle) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public IntentResult queryAwarenessIntent(int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public ServiceResult queryAwarenessService(int i) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public ServiceResult queryAwarenessServiceByIntents(List<String> list) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public void queryEvent(Event event, IEventQueryListener iEventQueryListener) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public void queryEvents(EventConfig eventConfig, IEventQueryListener iEventQueryListener) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int registerEventCallback(String str, IEventCallback iEventCallback, EventConfig eventConfig) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public void requestGrantPermission(String str) throws RemoteException {
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public IntentResult sortAwarenessIntent(IntentResult intentResult, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public ServiceResult sortAwarenessService(ServiceResult serviceResult, boolean z) throws RemoteException {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int unregisterEventCallback(String str) throws RemoteException {
            return 0;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public int unregisterEventCallbackWithArgs(String str, EventConfig eventConfig) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IDeepThinkerBridge {
        private static final String DESCRIPTOR = "com.oplus.deepthinker.platform.server.IDeepThinkerBridge";
        static final int TRANSACTION_availableState = 4;
        static final int TRANSACTION_call = 7;
        static final int TRANSACTION_capability = 5;
        static final int TRANSACTION_checkPermission = 9;
        static final int TRANSACTION_exchange = 8;
        static final int TRANSACTION_getAllPeriodDurationTopApps = 1007;
        static final int TRANSACTION_getAllPeriodFrequencyTopApps = 1006;
        static final int TRANSACTION_getAppPredictResult = 1010;
        static final int TRANSACTION_getAppPredictResultMap = 1009;
        static final int TRANSACTION_getAppQueueSortedByComplex = 1003;
        static final int TRANSACTION_getAppQueueSortedByCount = 1002;
        static final int TRANSACTION_getAppQueueSortedByTime = 1001;
        static final int TRANSACTION_getAppType = 1011;
        static final int TRANSACTION_getAppTypeMap = 1012;
        static final int TRANSACTION_getCertainPeriodDurationTopApps = 1005;
        static final int TRANSACTION_getCertainPeriodFrequencyTopApps = 1004;
        static final int TRANSACTION_getDeepSleepPredictResult = 3001;
        static final int TRANSACTION_getDeepSleepPredictResultWithPercentile = 3008;
        static final int TRANSACTION_getDeepSleepTotalPredictResult = 3003;
        static final int TRANSACTION_getIdleScreenResultInLongTime = 3007;
        static final int TRANSACTION_getIdleScreenResultInMiddleTime = 3006;
        static final int TRANSACTION_getIdleScreenResultInShortTime = 3005;
        static final int TRANSACTION_getLastDeepSleepRecord = 3002;
        static final int TRANSACTION_getPlatformVersion = 2;
        static final int TRANSACTION_getPredictAABResult = 1008;
        static final int TRANSACTION_getPredictResultWithFeedBack = 3004;
        static final int TRANSACTION_getSmartGpsBssidList = 4001;
        static final int TRANSACTION_onewayCall = 10;
        static final int TRANSACTION_queryAwarenessIntent = 5001;
        static final int TRANSACTION_queryAwarenessService = 5003;
        static final int TRANSACTION_queryAwarenessServiceByIntents = 5005;
        static final int TRANSACTION_queryEvent = 2004;
        static final int TRANSACTION_queryEvents = 2005;
        static final int TRANSACTION_registerEventCallback = 2001;
        static final int TRANSACTION_requestGrantPermission = 6;
        static final int TRANSACTION_sortAwarenessIntent = 5002;
        static final int TRANSACTION_sortAwarenessService = 5004;
        static final int TRANSACTION_unregisterEventCallback = 2002;
        static final int TRANSACTION_unregisterEventCallbackWithArgs = 2003;

        public static class Proxy implements IDeepThinkerBridge {
            public static IDeepThinkerBridge sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int availableState(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().availableState(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public Bundle call(String str, String str2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().call(str, str2, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List capability() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().capability();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public Map checkPermission(int i, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkPermission(i, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public IBinder exchange(String str, String str2, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().exchange(str, str2, iBinder);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<PeriodTopAppsResult> getAllPeriodDurationTopApps(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(1007, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllPeriodDurationTopApps(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PeriodTopAppsResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<PeriodTopAppsResult> getAllPeriodFrequencyTopApps(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(1006, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllPeriodFrequencyTopApps(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PeriodTopAppsResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public PredictResult getAppPredictResult(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1010, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppPredictResult(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? PredictResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<PredictResult> getAppPredictResultMap(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1009, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppPredictResultMap(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(PredictResult.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<String> getAppQueueSortedByComplex() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1003, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppQueueSortedByComplex();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<String> getAppQueueSortedByCount() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1002, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppQueueSortedByCount();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<String> getAppQueueSortedByTime() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1001, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppQueueSortedByTime();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int getAppType(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1011, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppType(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public Map getAppTypeMap(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(1012, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppTypeMap(list);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public PeriodTopAppsResult getCertainPeriodDurationTopApps(float f, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(1005, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCertainPeriodDurationTopApps(f, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? PeriodTopAppsResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public PeriodTopAppsResult getCertainPeriodFrequencyTopApps(float f, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(1004, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCertainPeriodFrequencyTopApps(f, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? PeriodTopAppsResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public DeepSleepPredictResult getDeepSleepPredictResult() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3001, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeepSleepPredictResult();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? DeepSleepPredictResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public String getDeepSleepPredictResultWithPercentile() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3008, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeepSleepPredictResultWithPercentile();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public TotalPredictResult getDeepSleepTotalPredictResult() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3003, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeepSleepTotalPredictResult();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? TotalPredictResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int getIdleScreenResultInLongTime() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3007, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIdleScreenResultInLongTime();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int getIdleScreenResultInMiddleTime() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3006, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIdleScreenResultInMiddleTime();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int getIdleScreenResultInShortTime() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3005, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIdleScreenResultInShortTime();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public SleepRecord getLastDeepSleepRecord() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3002, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLastDeepSleepRecord();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? SleepRecord.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int getPlatformVersion() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlatformVersion();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public PredictAABResult getPredictAABResult() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1008, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPredictAABResult();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? PredictAABResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public DeepSleepPredictResult getPredictResultWithFeedBack() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3004, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPredictResultWithFeedBack();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? DeepSleepPredictResult.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public List<String> getSmartGpsBssidList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4001, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSmartGpsBssidList();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public void onewayCall(String str, String str2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(10, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().onewayCall(str, str2, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public IntentResult queryAwarenessIntent(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(5001, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryAwarenessIntent(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? IntentResult.INSTANCE.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public ServiceResult queryAwarenessService(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(5003, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryAwarenessService(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServiceResult.INSTANCE.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public ServiceResult queryAwarenessServiceByIntents(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    if (!this.mRemote.transact(5005, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryAwarenessServiceByIntents(list);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServiceResult.INSTANCE.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
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
                    if (this.mRemote.transact(2004, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().queryEvent(event, iEventQueryListener);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
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
                    if (this.mRemote.transact(2005, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().queryEvents(eventConfig, iEventQueryListener);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
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
                    if (!this.mRemote.transact(2001, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerEventCallback(str, iEventCallback, eventConfig);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public void requestGrantPermission(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().requestGrantPermission(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public IntentResult sortAwarenessIntent(IntentResult intentResult, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i = 1;
                    if (intentResult != null) {
                        parcelObtain.writeInt(1);
                        intentResult.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(5002, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sortAwarenessIntent(intentResult, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? IntentResult.INSTANCE.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public ServiceResult sortAwarenessService(ServiceResult serviceResult, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i = 1;
                    if (serviceResult != null) {
                        parcelObtain.writeInt(1);
                        serviceResult.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!z) {
                        i = 0;
                    }
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(5004, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sortAwarenessService(serviceResult, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? ServiceResult.INSTANCE.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
            public int unregisterEventCallback(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(2002, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterEventCallback(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
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
                    if (!this.mRemote.transact(2003, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
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

        public static IDeepThinkerBridge asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeepThinkerBridge)) ? new Proxy(iBinder) : (IDeepThinkerBridge) iInterfaceQueryLocalInterface;
        }

        public static IDeepThinkerBridge getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeepThinkerBridge iDeepThinkerBridge) {
            if (Proxy.sDefaultImpl != null || iDeepThinkerBridge == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeepThinkerBridge;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                int platformVersion = getPlatformVersion();
                parcel2.writeNoException();
                parcel2.writeInt(platformVersion);
                return true;
            }
            if (i == 4001) {
                parcel.enforceInterface(DESCRIPTOR);
                List<String> smartGpsBssidList = getSmartGpsBssidList();
                parcel2.writeNoException();
                parcel2.writeStringList(smartGpsBssidList);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iAvailableState = availableState(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iAvailableState);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    List listCapability = capability();
                    parcel2.writeNoException();
                    parcel2.writeList(listCapability);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestGrantPermission(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    Bundle bundleCall = call(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleCall != null) {
                        parcel2.writeInt(1);
                        bundleCall.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    IBinder iBinderExchange = exchange(parcel.readString(), parcel.readString(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iBinderExchange);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    Map mapCheckPermission = checkPermission(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeMap(mapCheckPermission);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    onewayCall(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    switch (i) {
                        case 1001:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<String> appQueueSortedByTime = getAppQueueSortedByTime();
                            parcel2.writeNoException();
                            parcel2.writeStringList(appQueueSortedByTime);
                            return true;
                        case 1002:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<String> appQueueSortedByCount = getAppQueueSortedByCount();
                            parcel2.writeNoException();
                            parcel2.writeStringList(appQueueSortedByCount);
                            return true;
                        case 1003:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<String> appQueueSortedByComplex = getAppQueueSortedByComplex();
                            parcel2.writeNoException();
                            parcel2.writeStringList(appQueueSortedByComplex);
                            return true;
                        case 1004:
                            parcel.enforceInterface(DESCRIPTOR);
                            PeriodTopAppsResult certainPeriodFrequencyTopApps = getCertainPeriodFrequencyTopApps(parcel.readFloat(), parcel.readInt());
                            parcel2.writeNoException();
                            if (certainPeriodFrequencyTopApps != null) {
                                parcel2.writeInt(1);
                                certainPeriodFrequencyTopApps.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 1005:
                            parcel.enforceInterface(DESCRIPTOR);
                            PeriodTopAppsResult certainPeriodDurationTopApps = getCertainPeriodDurationTopApps(parcel.readFloat(), parcel.readInt());
                            parcel2.writeNoException();
                            if (certainPeriodDurationTopApps != null) {
                                parcel2.writeInt(1);
                                certainPeriodDurationTopApps.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 1006:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<PeriodTopAppsResult> allPeriodFrequencyTopApps = getAllPeriodFrequencyTopApps(parcel.readInt());
                            parcel2.writeNoException();
                            parcel2.writeTypedList(allPeriodFrequencyTopApps);
                            return true;
                        case 1007:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<PeriodTopAppsResult> allPeriodDurationTopApps = getAllPeriodDurationTopApps(parcel.readInt());
                            parcel2.writeNoException();
                            parcel2.writeTypedList(allPeriodDurationTopApps);
                            return true;
                        case 1008:
                            parcel.enforceInterface(DESCRIPTOR);
                            PredictAABResult predictAABResult = getPredictAABResult();
                            parcel2.writeNoException();
                            if (predictAABResult != null) {
                                parcel2.writeInt(1);
                                predictAABResult.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 1009:
                            parcel.enforceInterface(DESCRIPTOR);
                            List<PredictResult> appPredictResultMap = getAppPredictResultMap(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeTypedList(appPredictResultMap);
                            return true;
                        case 1010:
                            parcel.enforceInterface(DESCRIPTOR);
                            PredictResult appPredictResult = getAppPredictResult(parcel.readString());
                            parcel2.writeNoException();
                            if (appPredictResult != null) {
                                parcel2.writeInt(1);
                                appPredictResult.writeToParcel(parcel2, 1);
                            } else {
                                parcel2.writeInt(0);
                            }
                            return true;
                        case 1011:
                            parcel.enforceInterface(DESCRIPTOR);
                            int appType = getAppType(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(appType);
                            return true;
                        case 1012:
                            parcel.enforceInterface(DESCRIPTOR);
                            Map appTypeMap = getAppTypeMap(parcel.createStringArrayList());
                            parcel2.writeNoException();
                            parcel2.writeMap(appTypeMap);
                            return true;
                        default:
                            switch (i) {
                                case 2001:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    int iRegisterEventCallback = registerEventCallback(parcel.readString(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? EventConfig.CREATOR.createFromParcel(parcel) : null);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iRegisterEventCallback);
                                    return true;
                                case 2002:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    int iUnregisterEventCallback = unregisterEventCallback(parcel.readString());
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iUnregisterEventCallback);
                                    return true;
                                case 2003:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    int iUnregisterEventCallbackWithArgs = unregisterEventCallbackWithArgs(parcel.readString(), parcel.readInt() != 0 ? EventConfig.CREATOR.createFromParcel(parcel) : null);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(iUnregisterEventCallbackWithArgs);
                                    return true;
                                case 2004:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    queryEvent(parcel.readInt() != 0 ? Event.CREATOR.createFromParcel(parcel) : null, IEventQueryListener.Stub.asInterface(parcel.readStrongBinder()));
                                    return true;
                                case 2005:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    queryEvents(parcel.readInt() != 0 ? EventConfig.CREATOR.createFromParcel(parcel) : null, IEventQueryListener.Stub.asInterface(parcel.readStrongBinder()));
                                    return true;
                                default:
                                    switch (i) {
                                        case 3001:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            DeepSleepPredictResult deepSleepPredictResult = getDeepSleepPredictResult();
                                            parcel2.writeNoException();
                                            if (deepSleepPredictResult != null) {
                                                parcel2.writeInt(1);
                                                deepSleepPredictResult.writeToParcel(parcel2, 1);
                                            } else {
                                                parcel2.writeInt(0);
                                            }
                                            return true;
                                        case 3002:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            SleepRecord lastDeepSleepRecord = getLastDeepSleepRecord();
                                            parcel2.writeNoException();
                                            if (lastDeepSleepRecord != null) {
                                                parcel2.writeInt(1);
                                                lastDeepSleepRecord.writeToParcel(parcel2, 1);
                                            } else {
                                                parcel2.writeInt(0);
                                            }
                                            return true;
                                        case 3003:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            TotalPredictResult deepSleepTotalPredictResult = getDeepSleepTotalPredictResult();
                                            parcel2.writeNoException();
                                            if (deepSleepTotalPredictResult != null) {
                                                parcel2.writeInt(1);
                                                deepSleepTotalPredictResult.writeToParcel(parcel2, 1);
                                            } else {
                                                parcel2.writeInt(0);
                                            }
                                            return true;
                                        case 3004:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            DeepSleepPredictResult predictResultWithFeedBack = getPredictResultWithFeedBack();
                                            parcel2.writeNoException();
                                            if (predictResultWithFeedBack != null) {
                                                parcel2.writeInt(1);
                                                predictResultWithFeedBack.writeToParcel(parcel2, 1);
                                            } else {
                                                parcel2.writeInt(0);
                                            }
                                            return true;
                                        case 3005:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            int idleScreenResultInShortTime = getIdleScreenResultInShortTime();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(idleScreenResultInShortTime);
                                            return true;
                                        case 3006:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            int idleScreenResultInMiddleTime = getIdleScreenResultInMiddleTime();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(idleScreenResultInMiddleTime);
                                            return true;
                                        case 3007:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            int idleScreenResultInLongTime = getIdleScreenResultInLongTime();
                                            parcel2.writeNoException();
                                            parcel2.writeInt(idleScreenResultInLongTime);
                                            return true;
                                        case 3008:
                                            parcel.enforceInterface(DESCRIPTOR);
                                            String deepSleepPredictResultWithPercentile = getDeepSleepPredictResultWithPercentile();
                                            parcel2.writeNoException();
                                            parcel2.writeString(deepSleepPredictResultWithPercentile);
                                            return true;
                                        default:
                                            switch (i) {
                                                case 5001:
                                                    parcel.enforceInterface(DESCRIPTOR);
                                                    IntentResult intentResultQueryAwarenessIntent = queryAwarenessIntent(parcel.readInt());
                                                    parcel2.writeNoException();
                                                    if (intentResultQueryAwarenessIntent != null) {
                                                        parcel2.writeInt(1);
                                                        intentResultQueryAwarenessIntent.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                case 5002:
                                                    parcel.enforceInterface(DESCRIPTOR);
                                                    IntentResult intentResultSortAwarenessIntent = sortAwarenessIntent(parcel.readInt() != 0 ? IntentResult.INSTANCE.createFromParcel(parcel) : null, parcel.readInt() != 0);
                                                    parcel2.writeNoException();
                                                    if (intentResultSortAwarenessIntent != null) {
                                                        parcel2.writeInt(1);
                                                        intentResultSortAwarenessIntent.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                case 5003:
                                                    parcel.enforceInterface(DESCRIPTOR);
                                                    ServiceResult serviceResultQueryAwarenessService = queryAwarenessService(parcel.readInt());
                                                    parcel2.writeNoException();
                                                    if (serviceResultQueryAwarenessService != null) {
                                                        parcel2.writeInt(1);
                                                        serviceResultQueryAwarenessService.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                case 5004:
                                                    parcel.enforceInterface(DESCRIPTOR);
                                                    ServiceResult serviceResultSortAwarenessService = sortAwarenessService(parcel.readInt() != 0 ? ServiceResult.INSTANCE.createFromParcel(parcel) : null, parcel.readInt() != 0);
                                                    parcel2.writeNoException();
                                                    if (serviceResultSortAwarenessService != null) {
                                                        parcel2.writeInt(1);
                                                        serviceResultSortAwarenessService.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                case 5005:
                                                    parcel.enforceInterface(DESCRIPTOR);
                                                    ServiceResult serviceResultQueryAwarenessServiceByIntents = queryAwarenessServiceByIntents(parcel.createStringArrayList());
                                                    parcel2.writeNoException();
                                                    if (serviceResultQueryAwarenessServiceByIntents != null) {
                                                        parcel2.writeInt(1);
                                                        serviceResultQueryAwarenessServiceByIntents.writeToParcel(parcel2, 1);
                                                    } else {
                                                        parcel2.writeInt(0);
                                                    }
                                                    return true;
                                                default:
                                                    return super.onTransact(i, parcel, parcel2, i2);
                                            }
                                    }
                            }
                    }
            }
        }
    }

    int availableState(int i, String str) throws RemoteException;

    Bundle call(String str, String str2, Bundle bundle) throws RemoteException;

    List capability() throws RemoteException;

    Map checkPermission(int i, String str) throws RemoteException;

    IBinder exchange(String str, String str2, IBinder iBinder) throws RemoteException;

    List<PeriodTopAppsResult> getAllPeriodDurationTopApps(int i) throws RemoteException;

    List<PeriodTopAppsResult> getAllPeriodFrequencyTopApps(int i) throws RemoteException;

    PredictResult getAppPredictResult(String str) throws RemoteException;

    List<PredictResult> getAppPredictResultMap(String str) throws RemoteException;

    List<String> getAppQueueSortedByComplex() throws RemoteException;

    List<String> getAppQueueSortedByCount() throws RemoteException;

    List<String> getAppQueueSortedByTime() throws RemoteException;

    int getAppType(String str) throws RemoteException;

    Map getAppTypeMap(List<String> list) throws RemoteException;

    PeriodTopAppsResult getCertainPeriodDurationTopApps(float f, int i) throws RemoteException;

    PeriodTopAppsResult getCertainPeriodFrequencyTopApps(float f, int i) throws RemoteException;

    DeepSleepPredictResult getDeepSleepPredictResult() throws RemoteException;

    String getDeepSleepPredictResultWithPercentile() throws RemoteException;

    TotalPredictResult getDeepSleepTotalPredictResult() throws RemoteException;

    int getIdleScreenResultInLongTime() throws RemoteException;

    int getIdleScreenResultInMiddleTime() throws RemoteException;

    int getIdleScreenResultInShortTime() throws RemoteException;

    SleepRecord getLastDeepSleepRecord() throws RemoteException;

    int getPlatformVersion() throws RemoteException;

    PredictAABResult getPredictAABResult() throws RemoteException;

    DeepSleepPredictResult getPredictResultWithFeedBack() throws RemoteException;

    List<String> getSmartGpsBssidList() throws RemoteException;

    void onewayCall(String str, String str2, Bundle bundle) throws RemoteException;

    IntentResult queryAwarenessIntent(int i) throws RemoteException;

    ServiceResult queryAwarenessService(int i) throws RemoteException;

    ServiceResult queryAwarenessServiceByIntents(List<String> list) throws RemoteException;

    void queryEvent(Event event, IEventQueryListener iEventQueryListener) throws RemoteException;

    void queryEvents(EventConfig eventConfig, IEventQueryListener iEventQueryListener) throws RemoteException;

    int registerEventCallback(String str, IEventCallback iEventCallback, EventConfig eventConfig) throws RemoteException;

    void requestGrantPermission(String str) throws RemoteException;

    IntentResult sortAwarenessIntent(IntentResult intentResult, boolean z) throws RemoteException;

    ServiceResult sortAwarenessService(ServiceResult serviceResult, boolean z) throws RemoteException;

    int unregisterEventCallback(String str) throws RemoteException;

    int unregisterEventCallbackWithArgs(String str, EventConfig eventConfig) throws RemoteException;
}
