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
public final class OTAProto$RspUpdFileDataVerify extends GeneratedMessageLite<OTAProto$RspUpdFileDataVerify, Builder> implements OTAProto$RspUpdFileDataVerifyOrBuilder {
    private static final OTAProto$RspUpdFileDataVerify DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    public static final int NEXTFILEOFFSET_FIELD_NUMBER = 4;
    private static volatile Parser<OTAProto$RspUpdFileDataVerify> PARSER = null;
    public static final int PERCENT_FIELD_NUMBER = 3;
    public static final int STATUSTYPE_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int VERIFYSEED_FIELD_NUMBER = 5;
    private int fd_;
    private int nextFileOffset_;
    private int percent_;
    private int statusType_;
    private boolean status_;
    private int verifySeed_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$RspUpdFileDataVerify, Builder> implements OTAProto$RspUpdFileDataVerifyOrBuilder {
        public Builder clearFd() {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).clearFd();
            return this;
        }

        public Builder clearNextFileOffset() {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).clearNextFileOffset();
            return this;
        }

        public Builder clearPercent() {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).clearPercent();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).clearStatus();
            return this;
        }

        public Builder clearStatusType() {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).clearStatusType();
            return this;
        }

        public Builder clearVerifySeed() {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).clearVerifySeed();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
        public int getFd() {
            return ((OTAProto$RspUpdFileDataVerify) this.instance).getFd();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
        public int getNextFileOffset() {
            return ((OTAProto$RspUpdFileDataVerify) this.instance).getNextFileOffset();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
        public int getPercent() {
            return ((OTAProto$RspUpdFileDataVerify) this.instance).getPercent();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
        public boolean getStatus() {
            return ((OTAProto$RspUpdFileDataVerify) this.instance).getStatus();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
        public int getStatusType() {
            return ((OTAProto$RspUpdFileDataVerify) this.instance).getStatusType();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
        public int getVerifySeed() {
            return ((OTAProto$RspUpdFileDataVerify) this.instance).getVerifySeed();
        }

        public Builder setFd(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).setFd(i);
            return this;
        }

        public Builder setNextFileOffset(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).setNextFileOffset(i);
            return this;
        }

        public Builder setPercent(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).setPercent(i);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).setStatus(z);
            return this;
        }

        public Builder setStatusType(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).setStatusType(i);
            return this;
        }

        public Builder setVerifySeed(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFileDataVerify) this.instance).setVerifySeed(i);
            return this;
        }

        private Builder() {
            super(OTAProto$RspUpdFileDataVerify.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$RspUpdFileDataVerify oTAProto$RspUpdFileDataVerify = new OTAProto$RspUpdFileDataVerify();
        DEFAULT_INSTANCE = oTAProto$RspUpdFileDataVerify;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$RspUpdFileDataVerify.class, oTAProto$RspUpdFileDataVerify);
    }

    private OTAProto$RspUpdFileDataVerify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextFileOffset() {
        this.nextFileOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPercent() {
        this.percent_ = 0;
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

    public static OTAProto$RspUpdFileDataVerify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$RspUpdFileDataVerify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$RspUpdFileDataVerify> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextFileOffset(int i) {
        this.nextFileOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercent(int i) {
        this.percent_ = i;
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
                return new OTAProto$RspUpdFileDataVerify();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u0007\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b", new Object[]{"fd_", "status_", "percent_", "nextFileOffset_", "verifySeed_", "statusType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$RspUpdFileDataVerify> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$RspUpdFileDataVerify.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
    public int getNextFileOffset() {
        return this.nextFileOffset_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
    public int getPercent() {
        return this.percent_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
    public int getStatusType() {
        return this.statusType_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFileDataVerifyOrBuilder
    public int getVerifySeed() {
        return this.verifySeed_;
    }

    public static Builder newBuilder(OTAProto$RspUpdFileDataVerify oTAProto$RspUpdFileDataVerify) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$RspUpdFileDataVerify);
    }

    public static OTAProto$RspUpdFileDataVerify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$RspUpdFileDataVerify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFileDataVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
