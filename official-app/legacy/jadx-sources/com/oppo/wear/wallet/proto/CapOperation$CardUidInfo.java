package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.cx2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class CapOperation$CardUidInfo extends GeneratedMessageLite<CapOperation$CardUidInfo, Builder> implements CapOperation$CardUidInfoOrBuilder {
    private static final CapOperation$CardUidInfo DEFAULT_INSTANCE;
    public static final int ENCRYPTEDSECSIZE_FIELD_NUMBER = 5;
    public static final int HASUNKNOWNKEYSECTOR_FIELD_NUMBER = 3;
    private static volatile Parser<CapOperation$CardUidInfo> PARSER = null;
    public static final int SECTORSIZE_FIELD_NUMBER = 4;
    public static final int SUPPORTMIFARECLASSIC_FIELD_NUMBER = 2;
    public static final int UID_FIELD_NUMBER = 1;
    private int encryptedSecSize_;
    private boolean hasUnknownKeySector_;
    private int sectorSize_;
    private boolean supportMifareClassic_;
    private long uid_;

    public static final class Builder extends GeneratedMessageLite.Builder<CapOperation$CardUidInfo, Builder> implements CapOperation$CardUidInfoOrBuilder {
        public Builder clearEncryptedSecSize() {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).clearEncryptedSecSize();
            return this;
        }

        public Builder clearHasUnknownKeySector() {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).clearHasUnknownKeySector();
            return this;
        }

        public Builder clearSectorSize() {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).clearSectorSize();
            return this;
        }

        public Builder clearSupportMifareClassic() {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).clearSupportMifareClassic();
            return this;
        }

        public Builder clearUid() {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).clearUid();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
        public int getEncryptedSecSize() {
            return ((CapOperation$CardUidInfo) this.instance).getEncryptedSecSize();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
        public boolean getHasUnknownKeySector() {
            return ((CapOperation$CardUidInfo) this.instance).getHasUnknownKeySector();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
        public int getSectorSize() {
            return ((CapOperation$CardUidInfo) this.instance).getSectorSize();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
        public boolean getSupportMifareClassic() {
            return ((CapOperation$CardUidInfo) this.instance).getSupportMifareClassic();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
        public long getUid() {
            return ((CapOperation$CardUidInfo) this.instance).getUid();
        }

        public Builder setEncryptedSecSize(int i) {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).setEncryptedSecSize(i);
            return this;
        }

        public Builder setHasUnknownKeySector(boolean z) {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).setHasUnknownKeySector(z);
            return this;
        }

        public Builder setSectorSize(int i) {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).setSectorSize(i);
            return this;
        }

        public Builder setSupportMifareClassic(boolean z) {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).setSupportMifareClassic(z);
            return this;
        }

        public Builder setUid(long j2) {
            copyOnWrite();
            ((CapOperation$CardUidInfo) this.instance).setUid(j2);
            return this;
        }

        private Builder() {
            super(CapOperation$CardUidInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        CapOperation$CardUidInfo capOperation$CardUidInfo = new CapOperation$CardUidInfo();
        DEFAULT_INSTANCE = capOperation$CardUidInfo;
        GeneratedMessageLite.registerDefaultInstance(CapOperation$CardUidInfo.class, capOperation$CardUidInfo);
    }

    private CapOperation$CardUidInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryptedSecSize() {
        this.encryptedSecSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasUnknownKeySector() {
        this.hasUnknownKeySector_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSectorSize() {
        this.sectorSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportMifareClassic() {
        this.supportMifareClassic_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = 0L;
    }

    public static CapOperation$CardUidInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CapOperation$CardUidInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CapOperation$CardUidInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CapOperation$CardUidInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptedSecSize(int i) {
        this.encryptedSecSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasUnknownKeySector(boolean z) {
        this.hasUnknownKeySector_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSectorSize(int i) {
        this.sectorSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportMifareClassic(boolean z) {
        this.supportMifareClassic_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(long j2) {
        this.uid_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = cx2.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CapOperation$CardUidInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0007\u0003\u0007\u0004\u0004\u0005\u0004", new Object[]{"uid_", "supportMifareClassic_", "hasUnknownKeySector_", "sectorSize_", "encryptedSecSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CapOperation$CardUidInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CapOperation$CardUidInfo.class) {
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

    @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
    public int getEncryptedSecSize() {
        return this.encryptedSecSize_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
    public boolean getHasUnknownKeySector() {
        return this.hasUnknownKeySector_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
    public int getSectorSize() {
        return this.sectorSize_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
    public boolean getSupportMifareClassic() {
        return this.supportMifareClassic_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$CardUidInfoOrBuilder
    public long getUid() {
        return this.uid_;
    }

    public static Builder newBuilder(CapOperation$CardUidInfo capOperation$CardUidInfo) {
        return DEFAULT_INSTANCE.createBuilder(capOperation$CardUidInfo);
    }

    public static CapOperation$CardUidInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CapOperation$CardUidInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CapOperation$CardUidInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CapOperation$CardUidInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CapOperation$CardUidInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CapOperation$CardUidInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CapOperation$CardUidInfo parseFrom(InputStream inputStream) throws IOException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CapOperation$CardUidInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CapOperation$CardUidInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CapOperation$CardUidInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$CardUidInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
