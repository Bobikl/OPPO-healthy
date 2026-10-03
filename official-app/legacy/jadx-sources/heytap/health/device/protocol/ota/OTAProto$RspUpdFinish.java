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
public final class OTAProto$RspUpdFinish extends GeneratedMessageLite<OTAProto$RspUpdFinish, Builder> implements OTAProto$RspUpdFinishOrBuilder {
    private static final OTAProto$RspUpdFinish DEFAULT_INSTANCE;
    private static volatile Parser<OTAProto$RspUpdFinish> PARSER = null;
    public static final int STATUSTYPE_FIELD_NUMBER = 1;
    private int statusType_;

    public static final class Builder extends GeneratedMessageLite.Builder<OTAProto$RspUpdFinish, Builder> implements OTAProto$RspUpdFinishOrBuilder {
        public Builder clearStatusType() {
            copyOnWrite();
            ((OTAProto$RspUpdFinish) this.instance).clearStatusType();
            return this;
        }

        @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFinishOrBuilder
        public int getStatusType() {
            return ((OTAProto$RspUpdFinish) this.instance).getStatusType();
        }

        public Builder setStatusType(int i) {
            copyOnWrite();
            ((OTAProto$RspUpdFinish) this.instance).setStatusType(i);
            return this;
        }

        private Builder() {
            super(OTAProto$RspUpdFinish.DEFAULT_INSTANCE);
        }
    }

    static {
        OTAProto$RspUpdFinish oTAProto$RspUpdFinish = new OTAProto$RspUpdFinish();
        DEFAULT_INSTANCE = oTAProto$RspUpdFinish;
        GeneratedMessageLite.registerDefaultInstance(OTAProto$RspUpdFinish.class, oTAProto$RspUpdFinish);
    }

    private OTAProto$RspUpdFinish() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusType() {
        this.statusType_ = 0;
    }

    public static OTAProto$RspUpdFinish getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OTAProto$RspUpdFinish parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdFinish parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OTAProto$RspUpdFinish> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return new OTAProto$RspUpdFinish();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"statusType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OTAProto$RspUpdFinish> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OTAProto$RspUpdFinish.class) {
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

    @Override // heytap.health.device.protocol.ota.OTAProto$RspUpdFinishOrBuilder
    public int getStatusType() {
        return this.statusType_;
    }

    public static Builder newBuilder(OTAProto$RspUpdFinish oTAProto$RspUpdFinish) {
        return DEFAULT_INSTANCE.createBuilder(oTAProto$RspUpdFinish);
    }

    public static OTAProto$RspUpdFinish parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFinish parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFinish parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OTAProto$RspUpdFinish parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFinish parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OTAProto$RspUpdFinish parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFinish parseFrom(InputStream inputStream) throws IOException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OTAProto$RspUpdFinish parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OTAProto$RspUpdFinish parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OTAProto$RspUpdFinish parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OTAProto$RspUpdFinish) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
