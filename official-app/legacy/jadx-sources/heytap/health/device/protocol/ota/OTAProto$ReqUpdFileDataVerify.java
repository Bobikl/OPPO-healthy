package heytap.health.device.protocol.ota;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.o6d;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class OTAProto$ReqUpdFileDataVerify extends GeneratedMessageLite<OTAProto$ReqUpdFileDataVerify, Builder> implements OTAProto$ReqUpdFileDataVerifyOrBuilder {
    private static final OTAProto$ReqUpdFileDataVerify DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    private static volatile Parser<OTAProto$ReqUpdFileDataVerify> PARSER = null;
    public static final int VERIFYCRC_FIELD_NUMBER = 4;
    public static final int VERIFYOFFSET_FIELD_NUMBER = 2;
    public static final int VERIFYSEED_FIELD_NUMBER = 5;
    public static final int VERIFYSIZE_FIELD_NUMBER = 3;
    private int fd_;
    private int verifyCrc_;
    private int verifyOffset_;
    private int verifySeed_;
    private int verifySize_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$ReqUpdFileDataVerify, Builder> implements OTAProto$ReqUpdFileDataVerifyOrBuilder {
        public Builder clearFd() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).clearFd();
            return this;
        }

        public Builder clearVerifyCrc() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).clearVerifyCrc();
            return this;
        }

        public Builder clearVerifyOffset() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).clearVerifyOffset();
            return this;
        }

        public Builder clearVerifySeed() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).clearVerifySeed();
            return this;
        }

        public Builder clearVerifySize() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).clearVerifySize();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
        public int getFd() {
            return ((OTAProto$ReqUpdFileDataVerify) this.instance).getFd();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
        public int getVerifyCrc() {
            return ((OTAProto$ReqUpdFileDataVerify) this.instance).getVerifyCrc();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
        public int getVerifyOffset() {
            return ((OTAProto$ReqUpdFileDataVerify) this.instance).getVerifyOffset();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
        public int getVerifySeed() {
            return ((OTAProto$ReqUpdFileDataVerify) this.instance).getVerifySeed();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
        public int getVerifySize() {
            return ((OTAProto$ReqUpdFileDataVerify) this.instance).getVerifySize();
        }

        public Builder setFd(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).setFd(i);
            return this;
        }

        public Builder setVerifyCrc(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).setVerifyCrc(i);
            return this;
        }

        public Builder setVerifyOffset(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).setVerifyOffset(i);
            return this;
        }

        public Builder setVerifySeed(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).setVerifySeed(i);
            return this;
        }

        public Builder setVerifySize(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileDataVerify) this.instance).setVerifySize(i);
            return this;
        }

        private Builder() {
            super(OTAProto$ReqUpdFileDataVerify.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$ReqUpdFileDataVerify oTAProto$ReqUpdFileDataVerify = new OTAProto$ReqUpdFileDataVerify();
        DEFAULT_INSTANCE = oTAProto$ReqUpdFileDataVerify;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$ReqUpdFileDataVerify.class, oTAProto$ReqUpdFileDataVerify);
    }

    private OTAProto$ReqUpdFileDataVerify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifyCrc() {
        this.verifyCrc_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifyOffset() {
        this.verifyOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifySeed() {
        this.verifySeed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifySize() {
        this.verifySize_ = 0;
    }

    public static OTAProto$ReqUpdFileDataVerify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$ReqUpdFileDataVerify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$ReqUpdFileDataVerify> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyCrc(int i) {
        this.verifyCrc_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyOffset(int i) {
        this.verifyOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifySeed(int i) {
        this.verifySeed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifySize(int i) {
        this.verifySize_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$ReqUpdFileDataVerify();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"fd_", "verifyOffset_", "verifySize_", "verifyCrc_", "verifySeed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$ReqUpdFileDataVerify> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$ReqUpdFileDataVerify.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
    public int getVerifyCrc() {
        return this.verifyCrc_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
    public int getVerifyOffset() {
        return this.verifyOffset_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
    public int getVerifySeed() {
        return this.verifySeed_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileDataVerifyOrBuilder
    public int getVerifySize() {
        return this.verifySize_;
    }

    public static Builder newBuilder(OTAProto$ReqUpdFileDataVerify oTAProto$ReqUpdFileDataVerify) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$ReqUpdFileDataVerify);
    }

    public static OTAProto$ReqUpdFileDataVerify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$ReqUpdFileDataVerify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$ReqUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
