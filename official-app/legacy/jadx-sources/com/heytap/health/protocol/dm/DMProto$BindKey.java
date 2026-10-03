package com.heytap.health.protocol.dm;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$BindKey extends GeneratedMessageLite<DMProto$BindKey, Builder> implements DMProto$BindKeyOrBuilder {
    public static final int BIND_KEY_FIELD_NUMBER = 1;
    private static final DMProto$BindKey DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$BindKey> PARSER = null;
    public static final int SECRET_BIND_KEY_FIELD_NUMBER = 2;
    private String bindKey_ = "";
    private String secretBindKey_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$BindKey, Builder> implements DMProto$BindKeyOrBuilder {
        public Builder clearBindKey() {
            copyOnWrite();
            ((DMProto$BindKey) this.instance).clearBindKey();
            return this;
        }

        public Builder clearSecretBindKey() {
            copyOnWrite();
            ((DMProto$BindKey) this.instance).clearSecretBindKey();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
        public String getBindKey() {
            return ((DMProto$BindKey) this.instance).getBindKey();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
        public ByteString getBindKeyBytes() {
            return ((DMProto$BindKey) this.instance).getBindKeyBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
        public String getSecretBindKey() {
            return ((DMProto$BindKey) this.instance).getSecretBindKey();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
        public ByteString getSecretBindKeyBytes() {
            return ((DMProto$BindKey) this.instance).getSecretBindKeyBytes();
        }

        public Builder setBindKey(String str) {
            copyOnWrite();
            ((DMProto$BindKey) this.instance).setBindKey(str);
            return this;
        }

        public Builder setBindKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$BindKey) this.instance).setBindKeyBytes(byteString);
            return this;
        }

        public Builder setSecretBindKey(String str) {
            copyOnWrite();
            ((DMProto$BindKey) this.instance).setSecretBindKey(str);
            return this;
        }

        public Builder setSecretBindKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$BindKey) this.instance).setSecretBindKeyBytes(byteString);
            return this;
        }

        private Builder() {
            super(DMProto$BindKey.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$BindKey dMProto$BindKey = new DMProto$BindKey();
        DEFAULT_INSTANCE = dMProto$BindKey;
        GeneratedMessageLite.registerDefaultInstance(DMProto$BindKey.class, dMProto$BindKey);
    }

    private DMProto$BindKey() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBindKey() {
        this.bindKey_ = getDefaultInstance().getBindKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretBindKey() {
        this.secretBindKey_ = getDefaultInstance().getSecretBindKey();
    }

    public static DMProto$BindKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$BindKey parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$BindKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$BindKey parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$BindKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBindKey(String str) {
        str.getClass();
        this.bindKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBindKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bindKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBindKey(String str) {
        str.getClass();
        this.secretBindKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBindKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.secretBindKey_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$BindKey();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"bindKey_", "secretBindKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$BindKey> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$BindKey.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
    public String getBindKey() {
        return this.bindKey_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
    public ByteString getBindKeyBytes() {
        return ByteString.copyFromUtf8(this.bindKey_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
    public String getSecretBindKey() {
        return this.secretBindKey_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BindKeyOrBuilder
    public ByteString getSecretBindKeyBytes() {
        return ByteString.copyFromUtf8(this.secretBindKey_);
    }

    public static Builder newBuilder(DMProto$BindKey dMProto$BindKey) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$BindKey);
    }

    public static DMProto$BindKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BindKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$BindKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$BindKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$BindKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$BindKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$BindKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$BindKey parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$BindKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$BindKey parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$BindKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BindKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
