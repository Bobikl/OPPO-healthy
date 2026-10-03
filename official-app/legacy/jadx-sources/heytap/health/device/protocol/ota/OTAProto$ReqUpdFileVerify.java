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
public final class OTAProto$ReqUpdFileVerify extends GeneratedMessageLite<OTAProto$ReqUpdFileVerify, Builder> implements OTAProto$ReqUpdFileVerifyOrBuilder {
    private static final OTAProto$ReqUpdFileVerify DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    public static final int FILECRC_FIELD_NUMBER = 2;
    public static final int FILEMD5_FIELD_NUMBER = 3;
    private static volatile Parser<OTAProto$ReqUpdFileVerify> PARSER = null;
    public static final int VERIFYSEED_FIELD_NUMBER = 4;
    private int dataCase_ = 0;
    private Object data_;
    private int fd_;
    private int verifySeed_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$ReqUpdFileVerify, Builder> implements OTAProto$ReqUpdFileVerifyOrBuilder {
        public Builder clearData() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).clearData();
            return this;
        }

        public Builder clearFd() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).clearFd();
            return this;
        }

        public Builder clearFileCrc() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).clearFileCrc();
            return this;
        }

        public Builder clearFileMd5() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).clearFileMd5();
            return this;
        }

        public Builder clearVerifySeed() {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).clearVerifySeed();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public DataCase getDataCase() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).getDataCase();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public int getFd() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).getFd();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public int getFileCrc() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).getFileCrc();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public ByteString getFileMd5() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).getFileMd5();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public int getVerifySeed() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).getVerifySeed();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public boolean hasFileCrc() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).hasFileCrc();
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
        public boolean hasFileMd5() {
            return ((OTAProto$ReqUpdFileVerify) this.instance).hasFileMd5();
        }

        public Builder setFd(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).setFd(i);
            return this;
        }

        public Builder setFileCrc(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).setFileCrc(i);
            return this;
        }

        public Builder setFileMd5(ByteString byteString) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).setFileMd5(byteString);
            return this;
        }

        public Builder setVerifySeed(int i) {
            copyOnWrite();
            ((OTAProto$ReqUpdFileVerify) this.instance).setVerifySeed(i);
            return this;
        }

        private Builder() {
            super(OTAProto$ReqUpdFileVerify.DEFAULT_INSTANCE);
        }
    }

    public enum DataCase {
        FILECRC(2),
        FILEMD5(3),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i == 0) {
                return DATA_NOT_SET;
            }
            if (i == 2) {
                return FILECRC;
            }
            if (i != 3) {
                return null;
            }
            return FILEMD5;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        OTAProto$ReqUpdFileVerify oTAProto$ReqUpdFileVerify = new OTAProto$ReqUpdFileVerify();
        DEFAULT_INSTANCE = oTAProto$ReqUpdFileVerify;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$ReqUpdFileVerify.class, oTAProto$ReqUpdFileVerify);
    }

    private OTAProto$ReqUpdFileVerify() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileCrc() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileMd5() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifySeed() {
        this.verifySeed_ = 0;
    }

    public static OTAProto$ReqUpdFileVerify getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$ReqUpdFileVerify parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$ReqUpdFileVerify> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileCrc(int i) {
        this.dataCase_ = 2;
        this.data_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileMd5(ByteString byteString) {
        byteString.getClass();
        this.dataCase_ = 3;
        this.data_ = byteString;
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
                return new OTAProto$ReqUpdFileVerify();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002>\u0000\u0003=\u0000\u0004\u000b", new Object[]{"data_", "dataCase_", "fd_", "verifySeed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$ReqUpdFileVerify> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$ReqUpdFileVerify.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public int getFd() {
        return this.fd_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public int getFileCrc() {
        if (this.dataCase_ == 2) {
            return ((Integer) this.data_).intValue();
        }
        return 0;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public ByteString getFileMd5() {
        return this.dataCase_ == 3 ? (ByteString) this.data_ : ByteString.EMPTY;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public int getVerifySeed() {
        return this.verifySeed_;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public boolean hasFileCrc() {
        return this.dataCase_ == 2;
    }

    @Override // heytap.health.device.protocol.ota.OTAProto$ReqUpdFileVerifyOrBuilder
    public boolean hasFileMd5() {
        return this.dataCase_ == 3;
    }

    public static Builder newBuilder(OTAProto$ReqUpdFileVerify oTAProto$ReqUpdFileVerify) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$ReqUpdFileVerify);
    }

    public static OTAProto$ReqUpdFileVerify parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$ReqUpdFileVerify parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$ReqUpdFileVerify) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
