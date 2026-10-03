package org.oconscrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import org.oconscrypt.io.IoUtils;

/* JADX INFO: loaded from: classes11.dex */
public class KeyManagerFactoryImpl extends KeyManagerFactorySpi {
    private KeyStore keyStore;
    private char[] pwd;

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public KeyManager[] engineGetKeyManagers() {
        if (this.keyStore != null) {
            return new KeyManager[]{new KeyManagerImpl(this.keyStore, this.pwd)};
        }
        throw new IllegalStateException("KeyManagerFactory is not initialized");
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(KeyStore keyStore, char[] cArr) throws Throwable {
        if (keyStore != null) {
            this.keyStore = keyStore;
            if (cArr != null) {
                this.pwd = (char[]) cArr.clone();
                return;
            } else {
                this.pwd = EmptyArray.CHAR;
                return;
            }
        }
        this.keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        String property = System.getProperty("javax.net.ssl.keyStore");
        FileInputStream fileInputStream = null;
        if (property == null || property.equalsIgnoreCase("NONE") || property.isEmpty()) {
            try {
                this.keyStore.load(null, null);
                return;
            } catch (IOException e2) {
                throw new KeyStoreException(e2);
            } catch (CertificateException e3) {
                throw new KeyStoreException(e3);
            }
        }
        String property2 = System.getProperty("javax.net.ssl.keyStorePassword");
        if (property2 == null) {
            this.pwd = EmptyArray.CHAR;
        } else {
            this.pwd = property2.toCharArray();
        }
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(property));
                try {
                    this.keyStore.load(fileInputStream2, this.pwd);
                    IoUtils.closeQuietly(fileInputStream2);
                } catch (FileNotFoundException e4) {
                    e = e4;
                    throw new KeyStoreException(e);
                } catch (IOException e5) {
                    e = e5;
                    throw new KeyStoreException(e);
                } catch (CertificateException e6) {
                    e = e6;
                    throw new KeyStoreException(e);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    IoUtils.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        } catch (CertificateException e9) {
            e = e9;
        }
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
