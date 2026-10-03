package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class KeysetManager {

    @GuardedBy("this")
    private final Keyset.Builder keysetBuilder;

    private KeysetManager(Keyset.Builder builder) {
        this.keysetBuilder = builder;
    }

    private synchronized boolean keyIdExists(int i) {
        Iterator<Keyset.Key> it = this.keysetBuilder.getKeyList().iterator();
        while (it.hasNext()) {
            if (it.next().getKeyId() == i) {
                return true;
            }
        }
        return false;
    }

    private synchronized Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData keyDataNewKeyData;
        int iNewKeyId;
        OutputPrefixType outputPrefixType;
        keyDataNewKeyData = Registry.newKeyData(keyTemplate);
        iNewKeyId = newKeyId();
        outputPrefixType = keyTemplate.getOutputPrefixType();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            outputPrefixType = OutputPrefixType.TINK;
        }
        return Keyset.Key.newBuilder().setKeyData(keyDataNewKeyData).setKeyId(iNewKeyId).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
    }

    private synchronized int newKeyId() {
        int iRandPositiveInt;
        iRandPositiveInt = randPositiveInt();
        while (keyIdExists(iRandPositiveInt)) {
            iRandPositiveInt = randPositiveInt();
        }
        return iRandPositiveInt;
    }

    private static int randPositiveInt() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static KeysetManager withEmptyKeyset() {
        return new KeysetManager(Keyset.newBuilder());
    }

    public static KeysetManager withKeysetHandle(KeysetHandle keysetHandle) {
        return new KeysetManager(keysetHandle.getKeyset().toBuilder());
    }

    @Deprecated
    public synchronized KeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate, false);
        return this;
    }

    @Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, boolean z) throws GeneralSecurityException {
        Keyset.Key keyNewKey;
        keyNewKey = newKey(keyTemplate);
        this.keysetBuilder.addKey(keyNewKey);
        if (z) {
            this.keysetBuilder.setPrimaryKeyId(keyNewKey.getKeyId());
        }
        return keyNewKey.getKeyId();
    }

    public synchronized KeysetManager delete(int i) throws GeneralSecurityException {
        if (i == this.keysetBuilder.getPrimaryKeyId()) {
            throw new GeneralSecurityException("cannot delete the primary key");
        }
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            if (this.keysetBuilder.getKey(i2).getKeyId() == i) {
                this.keysetBuilder.removeKey(i2);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    public synchronized KeysetManager destroy(int i) throws GeneralSecurityException {
        if (i == this.keysetBuilder.getPrimaryKeyId()) {
            throw new GeneralSecurityException("cannot destroy the primary key");
        }
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            Keyset.Key key = this.keysetBuilder.getKey(i2);
            if (key.getKeyId() == i) {
                if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED && key.getStatus() != KeyStatusType.DESTROYED) {
                    throw new GeneralSecurityException("cannot destroy key with id " + i + " and status " + key.getStatus());
                }
                this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(KeyStatusType.DESTROYED).clearKeyData().build());
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    public synchronized KeysetManager disable(int i) throws GeneralSecurityException {
        if (i == this.keysetBuilder.getPrimaryKeyId()) {
            throw new GeneralSecurityException("cannot disable the primary key");
        }
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            Keyset.Key key = this.keysetBuilder.getKey(i2);
            if (key.getKeyId() == i) {
                if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED) {
                    throw new GeneralSecurityException("cannot disable key with id " + i + " and status " + key.getStatus());
                }
                this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(KeyStatusType.DISABLED).build());
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    public synchronized KeysetManager enable(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            Keyset.Key key = this.keysetBuilder.getKey(i2);
            if (key.getKeyId() == i) {
                KeyStatusType status = key.getStatus();
                KeyStatusType keyStatusType = KeyStatusType.ENABLED;
                if (status != keyStatusType && key.getStatus() != KeyStatusType.DISABLED) {
                    throw new GeneralSecurityException("cannot enable key with id " + i + " and status " + key.getStatus());
                }
                this.keysetBuilder.setKey(i2, key.toBuilder().setStatus(keyStatusType).build());
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return KeysetHandle.fromKeyset(this.keysetBuilder.build());
    }

    @Deprecated
    public synchronized KeysetManager promote(int i) throws GeneralSecurityException {
        return setPrimary(i);
    }

    @Deprecated
    public synchronized KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate, true);
        return this;
    }

    public synchronized KeysetManager setPrimary(int i) throws GeneralSecurityException {
        for (int i2 = 0; i2 < this.keysetBuilder.getKeyCount(); i2++) {
            Keyset.Key key = this.keysetBuilder.getKey(i2);
            if (key.getKeyId() == i) {
                if (!key.getStatus().equals(KeyStatusType.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
                }
                this.keysetBuilder.setPrimaryKeyId(i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }

    public synchronized KeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate.getProto(), false);
        return this;
    }
}
