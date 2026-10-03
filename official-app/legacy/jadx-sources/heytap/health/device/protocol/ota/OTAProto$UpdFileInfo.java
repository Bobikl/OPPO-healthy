package heytap.health.device.protocol.ota;

import com.google.protobuf.AbstractMessageLite;
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
public final class OTAProto$UpdFileInfo extends GeneratedMessageLite<OTAProto$UpdFileInfo, Builder> implements OTAProto$UpdFileInfoOrBuilder {
    public static final int CURVERSION_FIELD_NUMBER = 6;
    public static final int DATAUPDINTERVAL_FIELD_NUMBER = 4;
    public static final int DATAVERIFYCNT_FIELD_NUMBER = 3;
    public static final int DATAVERIFYRETRYCOUNT_FIELD_NUMBER = 10;
    public static final int DATAVERIFYTIMEOUT_FIELD_NUMBER = 9;
    private static final OTAProto$UpdFileInfo DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 2;
    private static volatile Parser<OTAProto$UpdFileInfo> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int UPDOFFSET_FIELD_NUMBER = 5;
    public static final int UPDVERSION_FIELD_NUMBER = 7;
    public static final int VERIFYMETHOD_FIELD_NUMBER = 8;
    private int dataUpdInterval_;
    private int dataVerifyCnt_;
    private int dataVerifyRetryCount_;
    private int dataVerifyTimeout_;
    private int fd_;
    private int status_;
    private int updOffset_;
    private int verifyMethod_;
    private String curVersion_ = "";
    private String updVersion_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$UpdFileInfo, Builder> implements OTAProto$UpdFileInfoOrBuilder {
        public Builder clearCurVersion() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearCurVersion();
            return this;
        }

        public Builder clearDataUpdInterval() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearDataUpdInterval();
            return this;
        }

        public Builder clearDataVerifyCnt() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearDataVerifyCnt();
            return this;
        }

        public Builder clearDataVerifyRetryCount() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearDataVerifyRetryCount();
            return this;
        }

        public Builder clearDataVerifyTimeout() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearDataVerifyTimeout();
            return this;
        }

        public Builder clearFd() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearFd();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearStatus();
            return this;
        }

        public Builder clearUpdOffset() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearUpdOffset();
            return this;
        }

        public Builder clearUpdVersion() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearUpdVersion();
            return this;
        }

        public Builder clearVerifyMethod() {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).clearVerifyMethod();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public String getCurVersion() {
            return ((OTAProto$UpdFileInfo) this.instance).getCurVersion();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public ByteString getCurVersionBytes() {
            return ((OTAProto$UpdFileInfo) this.instance).getCurVersionBytes();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getDataUpdInterval() {
            return ((OTAProto$UpdFileInfo) this.instance).getDataUpdInterval();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getDataVerifyCnt() {
            return ((OTAProto$UpdFileInfo) this.instance).getDataVerifyCnt();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getDataVerifyRetryCount() {
            return ((OTAProto$UpdFileInfo) this.instance).getDataVerifyRetryCount();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getDataVerifyTimeout() {
            return ((OTAProto$UpdFileInfo) this.instance).getDataVerifyTimeout();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getFd() {
            return ((OTAProto$UpdFileInfo) this.instance).getFd();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getStatus() {
            return ((OTAProto$UpdFileInfo) this.instance).getStatus();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getUpdOffset() {
            return ((OTAProto$UpdFileInfo) this.instance).getUpdOffset();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public String getUpdVersion() {
            return ((OTAProto$UpdFileInfo) this.instance).getUpdVersion();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public ByteString getUpdVersionBytes() {
            return ((OTAProto$UpdFileInfo) this.instance).getUpdVersionBytes();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
        public int getVerifyMethod() {
            return ((OTAProto$UpdFileInfo) this.instance).getVerifyMethod();
        }

        public Builder setCurVersion(String str) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setCurVersion(str);
            return this;
        }

        public Builder setCurVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setCurVersionBytes(byteString);
            return this;
        }

        public Builder setDataUpdInterval(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setDataUpdInterval(i);
            return this;
        }

        public Builder setDataVerifyCnt(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setDataVerifyCnt(i);
            return this;
        }

        public Builder setDataVerifyRetryCount(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setDataVerifyRetryCount(i);
            return this;
        }

        public Builder setDataVerifyTimeout(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setDataVerifyTimeout(i);
            return this;
        }

        public Builder setFd(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setFd(i);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setStatus(i);
            return this;
        }

        public Builder setUpdOffset(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setUpdOffset(i);
            return this;
        }

        public Builder setUpdVersion(String str) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setUpdVersion(str);
            return this;
        }

        public Builder setUpdVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setUpdVersionBytes(byteString);
            return this;
        }

        public Builder setVerifyMethod(int i) {
            copyOnWrite();
            ((OTAProto$UpdFileInfo) this.instance).setVerifyMethod(i);
            return this;
        }

        private Builder() {
            super(OTAProto$UpdFileInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$UpdFileInfo oTAProto$UpdFileInfo = new OTAProto$UpdFileInfo();
        DEFAULT_INSTANCE = oTAProto$UpdFileInfo;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$UpdFileInfo.class, oTAProto$UpdFileInfo);
    }

    private OTAProto$UpdFileInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurVersion() {
        this.curVersion_ = getDefaultInstance().getCurVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataUpdInterval() {
        this.dataUpdInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataVerifyCnt() {
        this.dataVerifyCnt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataVerifyRetryCount() {
        this.dataVerifyRetryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataVerifyTimeout() {
        this.dataVerifyTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdOffset() {
        this.updOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdVersion() {
        this.updVersion_ = getDefaultInstance().getUpdVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifyMethod() {
        this.verifyMethod_ = 0;
    }

    public static OTAProto$UpdFileInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$UpdFileInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$UpdFileInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$UpdFileInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurVersion(String str) {
        str.getClass();
        this.curVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.curVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataUpdInterval(int i) {
        this.dataUpdInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataVerifyCnt(int i) {
        this.dataVerifyCnt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataVerifyRetryCount(int i) {
        this.dataVerifyRetryCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataVerifyTimeout(int i) {
        this.dataVerifyTimeout_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdOffset(int i) {
        this.updOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdVersion(String str) {
        str.getClass();
        this.updVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.updVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyMethod(int i) {
        this.verifyMethod_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = o6d.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OTAProto$UpdFileInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006Ȉ\u0007Ȉ\b\u000b\t\u000b\n\u000b", new Object[]{"status_", "fd_", "dataVerifyCnt_", "dataUpdInterval_", "updOffset_", "curVersion_", "updVersion_", "verifyMethod_", "dataVerifyTimeout_", "dataVerifyRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$UpdFileInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$UpdFileInfo.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public String getCurVersion() {
        return this.curVersion_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public ByteString getCurVersionBytes() {
        return ByteString.copyFromUtf8(this.curVersion_);
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getDataUpdInterval() {
        return this.dataUpdInterval_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getDataVerifyCnt() {
        return this.dataVerifyCnt_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getDataVerifyRetryCount() {
        return this.dataVerifyRetryCount_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getDataVerifyTimeout() {
        return this.dataVerifyTimeout_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getUpdOffset() {
        return this.updOffset_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public String getUpdVersion() {
        return this.updVersion_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public ByteString getUpdVersionBytes() {
        return ByteString.copyFromUtf8(this.updVersion_);
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$UpdFileInfoOrBuilder
    public int getVerifyMethod() {
        return this.verifyMethod_;
    }

    public static Builder newBuilder(OTAProto$UpdFileInfo oTAProto$UpdFileInfo) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$UpdFileInfo);
    }

    public static OTAProto$UpdFileInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$UpdFileInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$UpdFileInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$UpdFileInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$UpdFileInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$UpdFileInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$UpdFileInfo parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$UpdFileInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$UpdFileInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$UpdFileInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$UpdFileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
