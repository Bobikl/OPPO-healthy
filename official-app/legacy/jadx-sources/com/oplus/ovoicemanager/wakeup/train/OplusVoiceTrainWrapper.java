package com.oplus.ovoicemanager.wakeup.train;

import android.os.Handler;
import android.os.RemoteException;
import com.oplus.aiunit.vision.a9d;

/* JADX INFO: loaded from: classes8.dex */
public class OplusVoiceTrainWrapper {
    public static Handler a;

    public static class OVoiceTrainCallbackStub extends IOVoiceTrainCallback.Stub {
        private a9d mCallback;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int i;

            public b(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ int i;

            public d(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ int i;

            public e(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f20054j;

            public f(int i, int i2) {
                this.i = i;
                this.f20054j = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f20055j;

            public g(int i, int i2) {
                this.i = i;
                this.f20055j = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public class h implements Runnable {
            public final /* synthetic */ int i;

            public h(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                OVoiceTrainCallbackStub.access$100(OVoiceTrainCallbackStub.this);
                throw null;
            }
        }

        public OVoiceTrainCallbackStub(a9d a9dVar) {
        }

        public static /* synthetic */ a9d access$100(OVoiceTrainCallbackStub oVoiceTrainCallbackStub) {
            oVoiceTrainCallbackStub.getClass();
            return null;
        }

        private void executeOnMainThread(Runnable runnable) {
            OplusVoiceTrainWrapper.a.post(runnable);
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onAudioRecord(int i) throws RemoteException {
            executeOnMainThread(new h(i));
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onSpeechEnd(int i, int i2) throws RemoteException {
            executeOnMainThread(new g(i, i2));
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onSpeechProgress(int i, int i2) throws RemoteException {
            executeOnMainThread(new f(i, i2));
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onSpeechStart(int i) throws RemoteException {
            executeOnMainThread(new e(i));
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainEnd(int i) throws RemoteException {
            executeOnMainThread(new d(i));
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainError(int i) throws RemoteException {
            executeOnMainThread(new b(i));
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainStart() throws RemoteException {
            executeOnMainThread(new a());
        }

        @Override // com.oplus.ovoicemanager.wakeup.train.IOVoiceTrainCallback
        public void onTrainStop() throws RemoteException {
            executeOnMainThread(new c());
        }
    }
}
