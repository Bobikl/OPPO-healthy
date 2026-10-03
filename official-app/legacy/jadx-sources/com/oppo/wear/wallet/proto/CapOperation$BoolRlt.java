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
public final class CapOperation$BoolRlt extends GeneratedMessageLite<CapOperation$BoolRlt, Builder> implements CapOperation$BoolRltOrBuilder {
    private static final CapOperation$BoolRlt DEFAULT_INSTANCE;
    private static volatile Parser<CapOperation$BoolRlt> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;

    public static final class Builder extends GeneratedMessageLite.Builder<CapOperation$BoolRlt, Builder> implements CapOperation$BoolRltOrBuilder {
        public Builder clearResult() {
            copyOnWrite();
            ((CapOperation$BoolRlt) this.instance).clearResult();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$BoolRltOrBuilder
        public boolean getResult() {
            return ((CapOperation$BoolRlt) this.instance).getResult();
        }

        public Builder setResult(boolean z) {
            copyOnWrite();
            ((CapOperation$BoolRlt) this.instance).setResult(z);
            return this;
        }

        private Builder() {
            super(CapOperation$BoolRlt.DEFAULT_INSTANCE);
        }
    }

    static {
        CapOperation$BoolRlt capOperation$BoolRlt = new CapOperation$BoolRlt();
        DEFAULT_INSTANCE = capOperation$BoolRlt;
        GeneratedMessageLite.registerDefaultInstance(CapOperation$BoolRlt.class, capOperation$BoolRlt);
    }

    private CapOperation$BoolRlt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = false;
    }

    public static CapOperation$BoolRlt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CapOperation$BoolRlt parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CapOperation$BoolRlt parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CapOperation$BoolRlt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(boolean z) {
        this.result_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = cx2.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CapOperation$BoolRlt();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"result_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CapOperation$BoolRlt> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CapOperation$BoolRlt.class) {
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

    @Override // com.oppo.wear.wallet.proto.CapOperation$BoolRltOrBuilder
    public boolean getResult() {
        return this.result_;
    }

    public static Builder newBuilder(CapOperation$BoolRlt capOperation$BoolRlt) {
        return DEFAULT_INSTANCE.createBuilder(capOperation$BoolRlt);
    }

    public static CapOperation$BoolRlt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CapOperation$BoolRlt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CapOperation$BoolRlt parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CapOperation$BoolRlt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CapOperation$BoolRlt parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CapOperation$BoolRlt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CapOperation$BoolRlt parseFrom(InputStream inputStream) throws IOException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CapOperation$BoolRlt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CapOperation$BoolRlt parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CapOperation$BoolRlt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$BoolRlt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
