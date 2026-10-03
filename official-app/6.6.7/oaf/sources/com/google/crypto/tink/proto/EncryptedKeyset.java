package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class EncryptedKeyset extends GeneratedMessageLite<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
    private static final EncryptedKeyset DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile Parser<EncryptedKeyset> PARSER;
    private ByteString encryptedKeyset_ = ByteString.EMPTY;
    private KeysetInfo keysetInfo_;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<EncryptedKeyset, Builder> implements EncryptedKeysetOrBuilder {
        public /* synthetic */ Builder(1 r1) {
            this();
        }

        public Builder clearEncryptedKeyset() {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).clearEncryptedKeyset();
            return this;
        }

        public Builder clearKeysetInfo() {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).clearKeysetInfo();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
        public ByteString getEncryptedKeyset() {
            return ((EncryptedKeyset) this.instance).getEncryptedKeyset();
        }

        @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
        public KeysetInfo getKeysetInfo() {
            return ((EncryptedKeyset) this.instance).getKeysetInfo();
        }

        @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
        public boolean hasKeysetInfo() {
            return ((EncryptedKeyset) this.instance).hasKeysetInfo();
        }

        public Builder mergeKeysetInfo(KeysetInfo keysetInfo) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).mergeKeysetInfo(keysetInfo);
            return this;
        }

        public Builder setEncryptedKeyset(ByteString byteString) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setEncryptedKeyset(byteString);
            return this;
        }

        public Builder setKeysetInfo(KeysetInfo keysetInfo) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setKeysetInfo(keysetInfo);
            return this;
        }

        private Builder() {
            super(EncryptedKeyset.DEFAULT_INSTANCE);
        }

        public Builder setKeysetInfo(KeysetInfo.Builder builder) {
            copyOnWrite();
            ((EncryptedKeyset) this.instance).setKeysetInfo(builder.build());
            return this;
        }
    }

    static {
        EncryptedKeyset encryptedKeyset = new EncryptedKeyset();
        DEFAULT_INSTANCE = encryptedKeyset;
        GeneratedMessageLite.registerDefaultInstance(EncryptedKeyset.class, encryptedKeyset);
    }

    private EncryptedKeyset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedKeyset() {
        this.encryptedKeyset_ = getDefaultInstance().getEncryptedKeyset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeysetInfo() {
        this.keysetInfo_ = null;
    }

    public static EncryptedKeyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeysetInfo(KeysetInfo keysetInfo) {
        keysetInfo.getClass();
        KeysetInfo keysetInfo2 = this.keysetInfo_;
        if (keysetInfo2 == null || keysetInfo2 == KeysetInfo.getDefaultInstance()) {
            this.keysetInfo_ = keysetInfo;
        } else {
            this.keysetInfo_ = KeysetInfo.newBuilder(this.keysetInfo_).mergeFrom(keysetInfo).buildPartial();
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EncryptedKeyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedKeyset(ByteString byteString) {
        byteString.getClass();
        this.encryptedKeyset_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeysetInfo(KeysetInfo keysetInfo) {
        keysetInfo.getClass();
        this.keysetInfo_ = keysetInfo;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        1 r1 = null;
        switch (i) {
            case 1:
                return new EncryptedKeyset();
            case 2:
                return new Builder(r1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EncryptedKeyset> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EncryptedKeyset.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
    public ByteString getEncryptedKeyset() {
        return this.encryptedKeyset_;
    }

    @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
    public KeysetInfo getKeysetInfo() {
        KeysetInfo keysetInfo = this.keysetInfo_;
        return keysetInfo == null ? KeysetInfo.getDefaultInstance() : keysetInfo;
    }

    @Override // com.google.crypto.tink.proto.EncryptedKeysetOrBuilder
    public boolean hasKeysetInfo() {
        return this.keysetInfo_ != null;
    }

    public static Builder newBuilder(EncryptedKeyset encryptedKeyset) {
        return DEFAULT_INSTANCE.createBuilder(encryptedKeyset);
    }

    public static EncryptedKeyset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EncryptedKeyset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EncryptedKeyset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(InputStream inputStream) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EncryptedKeyset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EncryptedKeyset parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EncryptedKeyset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EncryptedKeyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
