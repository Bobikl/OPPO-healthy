package com.andes.crypto.manager.se;

import android.os.IBinder;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.ServiceSpecificException;
import android.util.Log;
import com.oplus.aiunit.vision.j5g;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements IBinder.DeathRecipient {
    public static final int SERVER_NOT_AVAILABLE = -10001;
    public ISecureElement a;

    public j5g a(byte[] bArr, byte[] bArr2, short s) {
        ISecureElement iSecureElementC = c();
        if (iSecureElementC == null) {
            return new j5g(-10001);
        }
        try {
            return new j5g(iSecureElementC.symmetric_crypto(bArr, bArr2, s, 2));
        } catch (ServiceSpecificException e2) {
            Log.e("SECryptoManager", "decrypt: ", e2);
            return new j5g(e2.errorCode);
        } catch (RemoteException e3) {
            Log.e("SECryptoManager", "decrypt: ", e3);
            return new j5g(-1);
        } catch (Throwable th) {
            Log.e("SECryptoManager", "decrypt: ", th);
            return new j5g(-1);
        }
    }

    public j5g b(byte[] bArr, byte[] bArr2, short s) {
        ISecureElement iSecureElementC = c();
        if (iSecureElementC == null) {
            return new j5g(-10001);
        }
        try {
            return new j5g(iSecureElementC.symmetric_crypto(bArr, bArr2, s, 1));
        } catch (ServiceSpecificException e2) {
            Log.e("SECryptoManager", "encrypt: ", e2);
            return new j5g(e2.errorCode);
        } catch (RemoteException e3) {
            Log.e("SECryptoManager", "encrypt: ", e3);
            return new j5g(-1);
        } catch (Throwable th) {
            Log.e("SECryptoManager", "encrypt: ", th);
            return new j5g(-1);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        this.a = null;
    }

    public final ISecureElement c() {
        ISecureElement iSecureElement = this.a;
        if (iSecureElement != null) {
            return iSecureElement;
        }
        IBinder service = ServiceManager.getService("vendor.oplus.hardware.secure_element.ISecureElement/default");
        if (service == null) {
            Log.w("SECryptoManager", "OplusSEManager: getService return null");
            this.a = null;
        } else {
            this.a = ISecureElement.Stub.asInterface(service);
        }
        if (service != null) {
            try {
                service.linkToDeath(this, 0);
            } catch (RemoteException unused) {
            }
        }
        return this.a;
    }

    public int d() {
        ISecureElement iSecureElementC = c();
        if (iSecureElementC == null) {
            Log.e("SECryptoManager", "isSEBroken: secure Element is null");
            return -10001;
        }
        try {
            return iSecureElementC.is_se_broken();
        } catch (RemoteException e2) {
            Log.e("SECryptoManager", "isSEBroken: ", e2);
            return -1;
        } catch (ServiceSpecificException e3) {
            Log.e("SECryptoManager", "isSEBroken: ", e3);
            return e3.errorCode;
        } catch (Throwable th) {
            Log.e("SECryptoManager", "isSEBroken: ", th);
            return -1;
        }
    }
}
