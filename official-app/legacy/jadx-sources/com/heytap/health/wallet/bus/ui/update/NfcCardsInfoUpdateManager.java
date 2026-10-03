package com.heytap.health.wallet.bus.ui.update;

import com.oplus.aiunit.vision.sr0;

/* JADX INFO: loaded from: classes18.dex */
public class NfcCardsInfoUpdateManager {
    public static NfcCardsInfoUpdateManager a = new NfcCardsInfoUpdateManager();

    public class a implements Runnable {
        public final /* synthetic */ b i;

        public a(b bVar) {
            this.i = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.i;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();
    }

    public static NfcCardsInfoUpdateManager getInstance() {
        return a;
    }

    public void stop(b bVar) {
        if (bVar != null) {
            sr0.e(new a(bVar));
        }
    }
}
