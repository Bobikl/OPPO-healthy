package com.google.crypto.tink.integration.android;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeysetManager;
import com.google.crypto.tink.KeysetReader;
import com.google.crypto.tink.KeysetWriter;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes14.dex */
public final class AndroidKeysetManager {
    private static final String TAG = "AndroidKeysetManager";

    @GuardedBy("this")
    private KeysetManager keysetManager;
    private final Aead masterKey;
    private final KeysetWriter writer;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public /* synthetic */ AndroidKeysetManager(Builder builder, AnonymousClass1 anonymousClass1) throws GeneralSecurityException, IOException {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static KeyTemplate.OutputPrefixType fromProto(OutputPrefixType outputPrefixType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return KeyTemplate.OutputPrefixType.TINK;
        }
        if (i == 2) {
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        if (i == 3) {
            return KeyTemplate.OutputPrefixType.RAW;
        }
        if (i == 4) {
            return KeyTemplate.OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAtLeastM() {
        return true;
    }

    private boolean shouldUseKeystore() {
        return this.masterKey != null && isAtLeastM();
    }

    private void write(KeysetManager keysetManager) throws GeneralSecurityException {
        try {
            if (shouldUseKeystore()) {
                keysetManager.getKeysetHandle().write(this.writer, this.masterKey);
            } else {
                CleartextKeysetHandle.write(keysetManager.getKeysetHandle(), this.writer);
            }
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @GuardedBy("this")
    @Deprecated
    public synchronized AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }

    public synchronized AndroidKeysetManager delete(int i) throws GeneralSecurityException {
        KeysetManager keysetManagerDelete = this.keysetManager.delete(i);
        this.keysetManager = keysetManagerDelete;
        write(keysetManagerDelete);
        return this;
    }

    public synchronized AndroidKeysetManager destroy(int i) throws GeneralSecurityException {
        KeysetManager keysetManagerDestroy = this.keysetManager.destroy(i);
        this.keysetManager = keysetManagerDestroy;
        write(keysetManagerDestroy);
        return this;
    }

    public synchronized AndroidKeysetManager disable(int i) throws GeneralSecurityException {
        KeysetManager keysetManagerDisable = this.keysetManager.disable(i);
        this.keysetManager = keysetManagerDisable;
        write(keysetManagerDisable);
        return this;
    }

    public synchronized AndroidKeysetManager enable(int i) throws GeneralSecurityException {
        KeysetManager keysetManagerEnable = this.keysetManager.enable(i);
        this.keysetManager = keysetManagerEnable;
        write(keysetManagerEnable);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return this.keysetManager.getKeysetHandle();
    }

    public synchronized boolean isUsingKeystore() {
        return shouldUseKeystore();
    }

    @Deprecated
    public synchronized AndroidKeysetManager promote(int i) throws GeneralSecurityException {
        return setPrimary(i);
    }

    @Deprecated
    public synchronized AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerRotate = this.keysetManager.rotate(keyTemplate);
        this.keysetManager = keysetManagerRotate;
        write(keysetManagerRotate);
        return this;
    }

    public synchronized AndroidKeysetManager setPrimary(int i) throws GeneralSecurityException {
        KeysetManager primary = this.keysetManager.setPrimary(i);
        this.keysetManager = primary;
        write(primary);
        return this;
    }

    public static final class Builder {

        @GuardedBy("this")
        private KeysetManager keysetManager;
        private KeysetReader reader = null;
        private KeysetWriter writer = null;
        private String masterKeyUri = null;
        private Aead masterKey = null;
        private boolean useKeystore = true;
        private KeyTemplate keyTemplate = null;
        private KeyStore keyStore = null;

        private KeysetManager read() throws GeneralSecurityException, IOException {
            Aead aead = this.masterKey;
            if (aead != null) {
                try {
                    return KeysetManager.withKeysetHandle(KeysetHandle.read(this.reader, aead));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e2) {
                    Log.w(AndroidKeysetManager.TAG, "cannot decrypt keyset: ", e2);
                }
            }
            return KeysetManager.withKeysetHandle(CleartextKeysetHandle.read(this.reader));
        }

        private KeysetManager readOrGenerateNewKeyset() throws GeneralSecurityException, IOException {
            try {
                return read();
            } catch (FileNotFoundException e2) {
                Log.w(AndroidKeysetManager.TAG, "keyset not found, will generate a new one", e2);
                if (this.keyTemplate == null) {
                    throw new GeneralSecurityException("cannot read or generate keyset");
                }
                KeysetManager keysetManagerAdd = KeysetManager.withEmptyKeyset().add(this.keyTemplate);
                KeysetManager primary = keysetManagerAdd.setPrimary(keysetManagerAdd.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
                if (this.masterKey != null) {
                    primary.getKeysetHandle().write(this.writer, this.masterKey);
                } else {
                    CleartextKeysetHandle.write(primary.getKeysetHandle(), this.writer);
                }
                return primary;
            }
        }

        private Aead readOrGenerateNewMasterKey() throws GeneralSecurityException {
            if (!AndroidKeysetManager.isAtLeastM()) {
                Log.w(AndroidKeysetManager.TAG, "Android Keystore requires at least Android M");
                return null;
            }
            AndroidKeystoreKmsClient androidKeystoreKmsClientBuild = this.keyStore != null ? new AndroidKeystoreKmsClient.Builder().setKeyStore(this.keyStore).build() : new AndroidKeystoreKmsClient();
            boolean zHasKey = androidKeystoreKmsClientBuild.hasKey(this.masterKeyUri);
            if (!zHasKey) {
                try {
                    AndroidKeystoreKmsClient.generateNewAeadKey(this.masterKeyUri);
                } catch (GeneralSecurityException | ProviderException e2) {
                    Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
            }
            try {
                return androidKeystoreKmsClientBuild.getAead(this.masterKeyUri);
            } catch (GeneralSecurityException | ProviderException e3) {
                if (zHasKey) {
                    throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.masterKeyUri), e3);
                }
                Log.w(AndroidKeysetManager.TAG, "cannot use Android Keystore, it'll be disabled", e3);
                return null;
            }
        }

        public synchronized AndroidKeysetManager build() throws GeneralSecurityException, IOException {
            if (this.masterKeyUri != null) {
                this.masterKey = readOrGenerateNewMasterKey();
            }
            this.keysetManager = readOrGenerateNewKeyset();
            return new AndroidKeysetManager(this, null);
        }

        @Deprecated
        public Builder doNotUseKeystore() {
            this.masterKeyUri = null;
            this.useKeystore = false;
            return this;
        }

        public Builder withKeyStore(KeyStore keyStore) {
            this.keyStore = keyStore;
            return this;
        }

        @Deprecated
        public Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
            this.keyTemplate = KeyTemplate.create(keyTemplate.getTypeUrl(), keyTemplate.getValue().toByteArray(), AndroidKeysetManager.fromProto(keyTemplate.getOutputPrefixType()));
            return this;
        }

        public Builder withMasterKeyUri(String str) {
            if (!str.startsWith(AndroidKeystoreKmsClient.PREFIX)) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.useKeystore) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.masterKeyUri = str;
            return this;
        }

        public Builder withSharedPref(Context context, String str, String str2) throws IOException {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.reader = new SharedPrefKeysetReader(context, str, str2);
            this.writer = new SharedPrefKeysetWriter(context, str, str2);
            return this;
        }

        public Builder withKeyTemplate(KeyTemplate keyTemplate) {
            this.keyTemplate = keyTemplate;
            return this;
        }
    }

    private AndroidKeysetManager(Builder builder) throws GeneralSecurityException, IOException {
        this.writer = builder.writer;
        this.masterKey = builder.masterKey;
        this.keysetManager = builder.keysetManager;
    }

    @GuardedBy("this")
    public synchronized AndroidKeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeysetManager keysetManagerAdd = this.keysetManager.add(keyTemplate);
        this.keysetManager = keysetManagerAdd;
        write(keysetManagerAdd);
        return this;
    }
}
