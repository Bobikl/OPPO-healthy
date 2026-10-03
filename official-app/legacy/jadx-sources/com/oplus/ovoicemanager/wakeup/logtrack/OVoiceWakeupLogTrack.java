package com.oplus.ovoicemanager.wakeup.logtrack;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public class OVoiceWakeupLogTrack {

    /* JADX INFO: renamed from: com.oplus.ovoicemanager.wakeup.logtrack.OVoiceWakeupLogTrack$1, reason: invalid class name */
    public class AnonymousClass1 extends IVoiceWakeupLogTrack.Stub {
        final /* synthetic */ OVoiceWakeupLogTrack this$0;

        public AnonymousClass1(OVoiceWakeupLogTrack oVoiceWakeupLogTrack) {
        }

        @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
        public int getAnalyticsDataCount() throws RemoteException {
            return 0;
        }

        @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
        public String getSingleAnalyticsData() throws RemoteException {
            return null;
        }

        @Override // com.oplus.ovoicemanager.wakeup.logtrack.IVoiceWakeupLogTrack
        public int setAnalyticsDataLimit(int i) throws RemoteException {
            return 0;
        }
    }
}
