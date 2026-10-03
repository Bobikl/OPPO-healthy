package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes14.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final ConcurrentMap<String, KeyManagerContainer> keyManagerMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> primitiveWrapperMap = new ConcurrentHashMap();

    public interface KeyDeriverContainer {
        KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException;
    }

    public interface KeyManagerContainer {
        Class<?> getImplementingClass();

        <P> KeyManager<P> getKeyManager(Class<P> cls) throws GeneralSecurityException;

        KeyManager<?> getUntypedKeyManager();

        MessageLite parseKey(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException;

        Class<?> publicKeyManagerClassOrNull();

        Set<Class<?>> supportedPrimitives();
    }

    private Registry() {
    }

    @Deprecated
    public static synchronized void addCatalogue(String str, Catalogue<?> catalogue) throws GeneralSecurityException {
        try {
            if (str == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
            ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
            Locale locale = Locale.US;
            if (concurrentMap.containsKey(str.toLowerCase(locale))) {
                if (!catalogue.getClass().equals(concurrentMap.get(str.toLowerCase(locale)).getClass())) {
                    logger.warning("Attempted overwrite of a catalogueName catalogue for name " + str);
                    throw new GeneralSecurityException("catalogue for name " + str + " has been already registered");
                }
            }
            concurrentMap.put(str.toLowerCase(locale), catalogue);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    private static <P> KeyManagerContainer createContainerFor(final KeyManager<P> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.1
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return keyManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                if (keyManager.getPrimitiveClass().equals(cls)) {
                    return keyManager;
                }
                throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                return keyManager;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return Collections.singleton(keyManager.getPrimitiveClass());
            }
        };
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.4
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString byteString, InputStream inputStream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    MessageLite keyFormat = keyFactory.parseKeyFormat(byteString);
                    keyFactory.validateKeyFormat(keyFormat);
                    return (MessageLite) keyFactory.deriveKey(keyFormat, inputStream);
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e2);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString byteString, InputStream inputStream) throws GeneralSecurityException {
                return KeyData.newBuilder().setTypeUrl(keyTypeManager.getKeyType()).setValue(deriveKeyWithFactory(byteString, inputStream, keyTypeManager.keyFactory()).toByteString()).setKeyMaterialType(keyTypeManager.keyMaterialType()).build();
            }
        };
    }

    private static <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> KeyManagerContainer createPrivateKeyContainerFor(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> keyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.3
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return privateKeyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                try {
                    return new PrivateKeyManagerImpl(privateKeyTypeManager, keyTypeManager, cls);
                } catch (IllegalArgumentException e2) {
                    throw new GeneralSecurityException("Primitive type not supported", e2);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                PrivateKeyTypeManager privateKeyTypeManager2 = privateKeyTypeManager;
                return new PrivateKeyManagerImpl(privateKeyTypeManager2, keyTypeManager, privateKeyTypeManager2.firstSupportedPrimitiveClass());
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.crypto.tink.shaded.protobuf.MessageLite] */
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
                ?? key = privateKeyTypeManager.parseKey(byteString);
                privateKeyTypeManager.validateKey(key);
                return key;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return keyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return privateKeyTypeManager.supportedPrimitives();
            }
        };
    }

    public static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream inputStream) throws GeneralSecurityException {
        String typeUrl;
        ConcurrentMap<String, KeyDeriverContainer> concurrentMap;
        typeUrl = keyTemplate.getTypeUrl();
        concurrentMap = keyDeriverMap;
        if (!concurrentMap.containsKey(typeUrl)) {
            throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
        }
        return concurrentMap.get(typeUrl).deriveKey(keyTemplate.getValue(), inputStream);
    }

    private static synchronized void ensureKeyManagerInsertable(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
        if (concurrentMap.containsKey(str)) {
            KeyManagerContainer keyManagerContainer = concurrentMap.get(str);
            if (!keyManagerContainer.getImplementingClass().equals(cls)) {
                logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, keyManagerContainer.getImplementingClass().getName(), cls.getName()));
            }
            if (z && !newKeyAllowedMap.get(str).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
            }
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
        Locale locale = Locale.US;
        Catalogue<?> catalogue = concurrentMap.get(str.toLowerCase(locale));
        if (catalogue != null) {
            return catalogue;
        }
        String str2 = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            str2 = str2 + "Maybe call AeadConfig.register().";
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            str2 = str2 + "Maybe call DeterministicAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            str2 = str2 + "Maybe call StreamingAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            str2 = str2 + "Maybe call HybridConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            str2 = str2 + "Maybe call MacConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            str2 = str2 + "Maybe call SignatureConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            str2 = str2 + "Maybe call TinkConfig.register().";
        }
        throw new GeneralSecurityException(str2);
    }

    public static Class<?> getInputPrimitive(Class<?> cls) {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(cls);
        if (primitiveWrapper == null) {
            return null;
        }
        return primitiveWrapper.getInputPrimitiveClass();
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String str) throws GeneralSecurityException {
        return getKeyManagerInternal(str, null);
    }

    private static synchronized KeyManagerContainer getKeyManagerContainerOrThrow(String str) throws GeneralSecurityException {
        ConcurrentMap<String, KeyManagerContainer> concurrentMap;
        concurrentMap = keyManagerMap;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return concurrentMap.get(str);
    }

    private static <P> KeyManager<P> getKeyManagerInternal(String str, Class<P> cls) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainerOrThrow = getKeyManagerContainerOrThrow(str);
        if (cls == null) {
            return (KeyManager<P>) keyManagerContainerOrThrow.getUntypedKeyManager();
        }
        if (keyManagerContainerOrThrow.supportedPrimitives().contains(cls)) {
            return keyManagerContainerOrThrow.getKeyManager(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + keyManagerContainerOrThrow.getImplementingClass() + ", supported primitives: " + toCommaSeparatedString(keyManagerContainerOrThrow.supportedPrimitives()));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, MessageLite messageLite) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, messageLite, (Class) null);
    }

    private static <P> P getPrimitiveInternal(String str, MessageLite messageLite, Class<P> cls) throws GeneralSecurityException {
        return (P) getKeyManagerInternal(str, cls).getPrimitive(messageLite);
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, Class<P> cls) throws GeneralSecurityException {
        return getPrimitives(keysetHandle, null, cls);
    }

    private static <P> PrimitiveSet<P> getPrimitivesInternal(KeysetHandle keysetHandle, KeyManager<P> keyManager, Class<P> cls) throws GeneralSecurityException {
        Util.validateKeyset(keysetHandle.getKeyset());
        PrimitiveSet<P> primitiveSetNewPrimitiveSet = PrimitiveSet.newPrimitiveSet(cls);
        for (Keyset.Key key : keysetHandle.getKeyset().getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                PrimitiveSet.Entry<P> entryAddPrimitive = primitiveSetNewPrimitiveSet.addPrimitive((keyManager == null || !keyManager.doesSupport(key.getKeyData().getTypeUrl())) ? (P) getPrimitiveInternal(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), cls) : keyManager.getPrimitive(key.getKeyData().getValue()), key);
                if (key.getKeyId() == keysetHandle.getKeyset().getPrimaryKeyId()) {
                    primitiveSetNewPrimitiveSet.setPrimary(entryAddPrimitive);
                }
            }
        }
        return primitiveSetNewPrimitiveSet;
    }

    public static KeyData getPublicKeyData(String str, ByteString byteString) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(str);
        if (keyManager instanceof PrivateKeyManager) {
            return ((PrivateKeyManager) keyManager).getPublicKeyData(byteString);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }

    public static KeyManager<?> getUntypedKeyManager(String str) throws GeneralSecurityException {
        return getKeyManagerContainerOrThrow(str).getUntypedKeyManager();
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyManager<?> untypedKeyManager;
        untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (!newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return untypedKeyManager.newKey(keyTemplate.getValue());
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyManager<?> untypedKeyManager;
        untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (!newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
        }
        return untypedKeyManager.newKeyData(keyTemplate.getValue());
    }

    public static MessageLite parseKeyData(KeyData keyData) throws InvalidProtocolBufferException, GeneralSecurityException {
        return getKeyManagerContainerOrThrow(keyData.getTypeUrl()).parseKey(keyData.getValue());
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, KeyTypeManager<PublicKeyProtoT> keyTypeManager, boolean z) throws GeneralSecurityException {
        Class<?> clsPublicKeyManagerClassOrNull;
        try {
            if (privateKeyTypeManager == null || keyTypeManager == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            String keyType = privateKeyTypeManager.getKeyType();
            String keyType2 = keyTypeManager.getKeyType();
            ensureKeyManagerInsertable(keyType, privateKeyTypeManager.getClass(), z);
            ensureKeyManagerInsertable(keyType2, keyTypeManager.getClass(), false);
            if (keyType.equals(keyType2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (concurrentMap.containsKey(keyType) && (clsPublicKeyManagerClassOrNull = concurrentMap.get(keyType).publicKeyManagerClassOrNull()) != null && !clsPublicKeyManagerClassOrNull.equals(keyTypeManager.getClass())) {
                logger.warning("Attempted overwrite of a registered key manager for key type " + keyType + " with inconsistent public key type " + keyType2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", privateKeyTypeManager.getClass().getName(), clsPublicKeyManagerClassOrNull.getName(), keyTypeManager.getClass().getName()));
            }
            if (!concurrentMap.containsKey(keyType) || concurrentMap.get(keyType).publicKeyManagerClassOrNull() == null) {
                concurrentMap.put(keyType, createPrivateKeyContainerFor(privateKeyTypeManager, keyTypeManager));
                keyDeriverMap.put(keyType, createDeriverFor(privateKeyTypeManager));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = newKeyAllowedMap;
            concurrentMap2.put(keyType, Boolean.valueOf(z));
            if (!concurrentMap.containsKey(keyType2)) {
                concurrentMap.put(keyType2, createContainerFor(keyTypeManager));
            }
            concurrentMap2.put(keyType2, Boolean.FALSE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager) throws GeneralSecurityException {
        registerKeyManager((KeyManager) keyManager, true);
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(PrimitiveWrapper<B, P> primitiveWrapper) throws GeneralSecurityException {
        try {
            if (primitiveWrapper == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> primitiveClass = primitiveWrapper.getPrimitiveClass();
            ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> concurrentMap = primitiveWrapperMap;
            if (concurrentMap.containsKey(primitiveClass)) {
                PrimitiveWrapper<?, ?> primitiveWrapper2 = concurrentMap.get(primitiveClass);
                if (!primitiveWrapper.getClass().equals(primitiveWrapper2.getClass())) {
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + primitiveClass);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", primitiveClass.getName(), primitiveWrapper2.getClass().getName(), primitiveWrapper.getClass().getName()));
                }
            }
            concurrentMap.put(primitiveClass, primitiveWrapper);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void reset() {
        keyManagerMap.clear();
        keyDeriverMap.clear();
        newKeyAllowedMap.clear();
        catalogueMap.clear();
        primitiveWrapperMap.clear();
    }

    private static String toCommaSeparatedString(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> cls) throws GeneralSecurityException {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(cls);
        if (primitiveWrapper == null) {
            throw new GeneralSecurityException("No wrapper found for " + primitiveSet.getPrimitiveClass().getName());
        }
        if (primitiveWrapper.getInputPrimitiveClass().equals(primitiveSet.getPrimitiveClass())) {
            return (P) primitiveWrapper.wrap(primitiveSet);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + primitiveWrapper.getInputPrimitiveClass() + ", got " + primitiveSet.getPrimitiveClass());
    }

    private static <KeyProtoT extends MessageLite> KeyManagerContainer createContainerFor(final KeyTypeManager<KeyProtoT> keyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.2
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return keyTypeManager.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> cls) throws GeneralSecurityException {
                try {
                    return new KeyManagerImpl(keyTypeManager, cls);
                } catch (IllegalArgumentException e2) {
                    throw new GeneralSecurityException("Primitive type not supported", e2);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                KeyTypeManager keyTypeManager2 = keyTypeManager;
                return new KeyManagerImpl(keyTypeManager2, keyTypeManager2.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString byteString) throws InvalidProtocolBufferException, GeneralSecurityException {
                MessageLite key = keyTypeManager.parseKey(byteString);
                keyTypeManager.validateKey(key);
                return key;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return keyTypeManager.supportedPrimitives();
            }
        };
    }

    public static <P> KeyManager<P> getKeyManager(String str, Class<P> cls) throws GeneralSecurityException {
        return getKeyManagerInternal(str, (Class) checkNotNull(cls));
    }

    public static <P> P getPrimitive(String str, MessageLite messageLite, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, messageLite, (Class) checkNotNull(cls));
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, KeyManager<P> keyManager, Class<P> cls) throws GeneralSecurityException {
        return getPrimitivesInternal(keysetHandle, keyManager, (Class) checkNotNull(cls));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, ByteString byteString) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, byteString, (Class) null);
    }

    private static <P> P getPrimitiveInternal(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return (P) getKeyManagerInternal(str, cls).getPrimitive(byteString);
    }

    public static synchronized <P> void registerKeyManager(KeyManager<P> keyManager, boolean z) throws GeneralSecurityException {
        try {
            if (keyManager != null) {
                String keyType = keyManager.getKeyType();
                ensureKeyManagerInsertable(keyType, keyManager.getClass(), z);
                keyManagerMap.putIfAbsent(keyType, createContainerFor(keyManager));
                newKeyAllowedMap.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static <P> P getPrimitive(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(str, byteString, (Class) checkNotNull(cls));
    }

    @Deprecated
    public static <P> P getPrimitive(String str, byte[] bArr) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr));
    }

    public static <P> P getPrimitive(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(str, ByteString.copyFrom(bArr), cls);
    }

    public static synchronized MessageLite newKey(String str, MessageLite messageLite) throws GeneralSecurityException {
        KeyManager keyManager;
        keyManager = getKeyManager(str);
        if (newKeyAllowedMap.get(str).booleanValue()) {
        } else {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + str);
        }
        return keyManager.newKey(messageLite);
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return newKeyData(keyTemplate.getProto());
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> cls) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), cls);
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(KeyTypeManager<KeyProtoT> keyTypeManager, boolean z) throws GeneralSecurityException {
        try {
            if (keyTypeManager != null) {
                String keyType = keyTypeManager.getKeyType();
                ensureKeyManagerInsertable(keyType, keyTypeManager.getClass(), z);
                ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
                if (!concurrentMap.containsKey(keyType)) {
                    concurrentMap.put(keyType, createContainerFor(keyTypeManager));
                    keyDeriverMap.put(keyType, createDeriverFor(keyTypeManager));
                }
                newKeyAllowedMap.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager) throws GeneralSecurityException {
        registerKeyManager(str, keyManager, true);
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String str, KeyManager<P> keyManager, boolean z) throws GeneralSecurityException {
        try {
            if (keyManager != null) {
                if (str.equals(keyManager.getKeyType())) {
                    registerKeyManager(keyManager, z);
                } else {
                    throw new GeneralSecurityException("Manager does not support key type " + str + ".");
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
