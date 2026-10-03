package org.iccoa.android.digitalkey;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.ldk;
import com.oplus.aiunit.vision.vs5;

/* JADX INFO: loaded from: classes11.dex */
class DigitalKeyCallbackImpl<T> extends IDigitalKeyCallback.Stub {
    private final vs5<T> callback;
    private final ldk<T> converter;

    public DigitalKeyCallbackImpl(@NonNull vs5<T> vs5Var, @NonNull ldk<T> ldkVar) {
        this.converter = ldkVar;
    }

    @Override // org.iccoa.android.digitalkey.IDigitalKeyCallback
    public void onResult(Bundle bundle) throws RemoteException {
        bundle.setClassLoader(DigitalKeyData.class.getClassLoader());
        int i = bundle.getInt("code", -1);
        if (i == 0) {
            this.converter.m(bundle);
            throw null;
        }
        f04.a(i);
        bundle.getString("additionalInfo", "");
        throw null;
    }
}
