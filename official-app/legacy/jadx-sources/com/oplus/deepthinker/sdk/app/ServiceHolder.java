package com.oplus.deepthinker.sdk.app;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.oplus.aiunit.vision.g5g;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
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
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes5.dex */
public class ServiceHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static IDeepThinkerBridge f19665c = new IDeepThinkerBridge() { // from class: com.oplus.deepthinker.sdk.app.ServiceHolder.1
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
        public IntentResult queryAwarenessIntent(int i) {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public ServiceResult queryAwarenessService(int i) {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public ServiceResult queryAwarenessServiceByIntents(List<String> list) {
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
        public IntentResult sortAwarenessIntent(IntentResult intentResult, boolean z) {
            return null;
        }

        @Override // com.oplus.deepthinker.platform.server.IDeepThinkerBridge
        public ServiceResult sortAwarenessService(ServiceResult serviceResult, boolean z) {
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
    };
    public IDeepThinkerBridge a;
    public Supplier<IDeepThinkerBridge> b;

    public IDeepThinkerBridge a() {
        IDeepThinkerBridge iDeepThinkerBridge;
        IDeepThinkerBridge iDeepThinkerBridge2 = this.a;
        if (iDeepThinkerBridge2 != null) {
            return iDeepThinkerBridge2;
        }
        Supplier<IDeepThinkerBridge> supplier = this.b;
        if (supplier != null && (iDeepThinkerBridge = supplier.get()) != null) {
            return iDeepThinkerBridge;
        }
        g5g.h("ServiceHolder", "getRemote: call default!");
        return f19665c;
    }

    public void b(Supplier<IDeepThinkerBridge> supplier) {
        this.b = supplier;
    }
}
