package org.iccoa.android.digitalkey;

import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.aiunit.vision.noa;
import com.oplus.aiunit.vision.zs5;

/* JADX INFO: loaded from: classes11.dex */
class KeyStatusChangeListener$1 extends IKeyStatusChangeListener.Stub {
    final /* synthetic */ noa this$0;

    public KeyStatusChangeListener$1(noa noaVar) {
    }

    private DigitalKeyData getDigitalKeyData(Bundle bundle) {
        bundle.setClassLoader(DigitalKeyData.class.getClassLoader());
        return Build.VERSION.SDK_INT >= 33 ? (DigitalKeyData) bundle.getParcelable("data", DigitalKeyData.class) : (DigitalKeyData) bundle.getParcelable("data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNotify$0(Bundle bundle) {
        getDigitalKeyData(bundle);
        throw null;
    }

    @Override // org.iccoa.android.digitalkey.IKeyStatusChangeListener
    public void onNotify(final Bundle bundle) throws RemoteException {
        zs5.b().d(new Runnable() { // from class: org.iccoa.android.digitalkey.a
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$onNotify$0(bundle);
            }
        });
    }
}
