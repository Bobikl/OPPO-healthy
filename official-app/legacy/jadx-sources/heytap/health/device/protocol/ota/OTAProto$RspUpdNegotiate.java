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
public final class OTAProto$RspUpdNegotiate extends GeneratedMessageLite<OTAProto$RspUpdNegotiate, Builder> implements OTAProto$RspUpdNegotiateOrBuilder {
    private static final OTAProto$RspUpdNegotiate DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    public static final int FILEVERIFYRETRYCOUNT_FIELD_NUMBER = 4;
    public static final int FILEVERIFYTIMEOUT_FIELD_NUMBER = 3;
    private static volatile Parser<OTAProto$RspUpdNegotiate> PARSER = null;
    public static final int STATUSTYPE_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int fd_;
    private int fileVerifyRetryCount_;
    private int fileVerifyTimeout_;
    private int statusType_;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$RspUpdNegotiate, Builder> implements OTAProto$RspUpdNegotiateOrBuilder {
        public Builder clearFd() {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).clearFd();
            return this;
        }

        public Builder clearFileVerifyRetryCount() {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).clearFileVerifyRetryCount();
            return this;
        }

        public Builder clearFileVerifyTimeout() {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).clearFileVerifyTimeout();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).clearStatus();
            return this;
        }

        public Builder clearStatusType() {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).clearStatusType();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
        public int getFd() {
            return ((OTAProto$RspUpdNegotiate) this.instance).getFd();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
        public int getFileVerifyRetryCount() {
            return ((OTAProto$RspUpdNegotiate) this.instance).getFileVerifyRetryCount();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
        public int getFileVerifyTimeout() {
            return ((OTAProto$RspUpdNegotiate) this.instance).getFileVerifyTimeout();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
        public int getStatus() {
            return ((OTAProto$RspUpdNegotiate) this.instance).getStatus();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
        public int getStatusType() {
            return ((OTAProto$RspUpdNegotiate) this.instance).getStatusType();
        }

        public Builder setFd(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).setFd(i);
            return this;
        }

        public Builder setFileVerifyRetryCount(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).setFileVerifyRetryCount(i);
            return this;
        }

        public Builder setFileVerifyTimeout(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).setFileVerifyTimeout(i);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).setStatus(i);
            return this;
        }

        public Builder setStatusType(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdNegotiate) this.instance).setStatusType(i);
            return this;
        }

        private Builder() {
            super(OTAProto$RspUpdNegotiate.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$RspUpdNegotiate oTAProto$RspUpdNegotiate = new OTAProto$RspUpdNegotiate();
        DEFAULT_INSTANCE = oTAProto$RspUpdNegotiate;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$RspUpdNegotiate.class, oTAProto$RspUpdNegotiate);
    }

    private OTAProto$RspUpdNegotiate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileVerifyRetryCount() {
        this.fileVerifyRetryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileVerifyTimeout() {
        this.fileVerifyTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusType() {
        this.statusType_ = 0;
    }

    public static OTAProto$RspUpdNegotiate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$RspUpdNegotiate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$RspUpdNegotiate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileVerifyRetryCount(int i) {
        this.fileVerifyRetryCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileVerifyTimeout(int i) {
        this.fileVerifyTimeout_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusType(int i) {
        this.statusType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$RspUpdNegotiate();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"fd_", "status_", "fileVerifyTimeout_", "fileVerifyRetryCount_", "statusType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$RspUpdNegotiate> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$RspUpdNegotiate.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
    public int getFileVerifyRetryCount() {
        return this.fileVerifyRetryCount_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
    public int getFileVerifyTimeout() {
        return this.fileVerifyTimeout_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdNegotiateOrBuilder
    public int getStatusType() {
        return this.statusType_;
    }

    public static Builder newBuilder(OTAProto$RspUpdNegotiate oTAProto$RspUpdNegotiate) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$RspUpdNegotiate);
    }

    public static OTAProto$RspUpdNegotiate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$RspUpdNegotiate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdNegotiate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
