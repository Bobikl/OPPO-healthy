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
public final class OTAProto$RspUpdFileVerify extends GeneratedMessageLite<OTAProto$RspUpdFileVerify, Builder> implements OTAProto$RspUpdFileVerifyOrBuilder {
    private static final OTAProto$RspUpdFileVerify DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    private static volatile Parser<OTAProto$RspUpdFileVerify> PARSER = null;
    public static final int STATUSTYPE_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int VERIFYSEED_FIELD_NUMBER = 3;
    private int fd_;
    private int statusType_;
    private boolean status_;
    private int verifySeed_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$RspUpdFileVerify, Builder> implements OTAProto$RspUpdFileVerifyOrBuilder {
        public Builder clearFd() {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).clearFd();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).clearStatus();
            return this;
        }

        public Builder clearStatusType() {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).clearStatusType();
            return this;
        }

        public Builder clearVerifySeed() {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).clearVerifySeed();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
        public int getFd() {
            return ((OTAProto$RspUpdFileVerify) this.instance).getFd();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
        public boolean getStatus() {
            return ((OTAProto$RspUpdFileVerify) this.instance).getStatus();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
        public int getStatusType() {
            return ((OTAProto$RspUpdFileVerify) this.instance).getStatusType();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
        public int getVerifySeed() {
            return ((OTAProto$RspUpdFileVerify) this.instance).getVerifySeed();
        }

        public Builder setFd(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).setFd(i);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).setStatus(z);
            return this;
        }

        public Builder setStatusType(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).setStatusType(i);
            return this;
        }

        public Builder setVerifySeed(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileVerify) this.instance).setVerifySeed(i);
            return this;
        }

        private Builder() {
            super(OTAProto$RspUpdFileVerify.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$RspUpdFileVerify oTAProto$RspUpdFileVerify = new OTAProto$RspUpdFileVerify();
        DEFAULT_INSTANCE = oTAProto$RspUpdFileVerify;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$RspUpdFileVerify.class, oTAProto$RspUpdFileVerify);
    }

    private OTAProto$RspUpdFileVerify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusType() {
        this.statusType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifySeed() {
        this.verifySeed_ = 0;
    }

    public static OTAProto$RspUpdFileVerify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$RspUpdFileVerify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$RspUpdFileVerify> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusType(int i) {
        this.statusType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifySeed(int i) {
        this.verifySeed_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$RspUpdFileVerify();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u0007\u0003\u000b\u0004\u000b", new Object[]{"fd_", "status_", "verifySeed_", "statusType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$RspUpdFileVerify> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$RspUpdFileVerify.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
    public int getStatusType() {
        return this.statusType_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileVerifyOrBuilder
    public int getVerifySeed() {
        return this.verifySeed_;
    }

    public static Builder newBuilder(OTAProto$RspUpdFileVerify oTAProto$RspUpdFileVerify) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$RspUpdFileVerify);
    }

    public static OTAProto$RspUpdFileVerify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$RspUpdFileVerify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
