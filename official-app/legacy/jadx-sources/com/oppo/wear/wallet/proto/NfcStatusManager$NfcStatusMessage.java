package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.xrc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class NfcStatusManager$NfcStatusMessage extends GeneratedMessageLite<NfcStatusManager$NfcStatusMessage, Builder> implements NfcStatusManager$NfcStatusMessageOrBuilder {
    private static final NfcStatusManager$NfcStatusMessage DEFAULT_INSTANCE;
    public static final int ISNFCOPEN_FIELD_NUMBER = 1;
    private static volatile Parser<NfcStatusManager$NfcStatusMessage> PARSER;
    private boolean isNfcOpen_;

    public static final class Builder extends GeneratedMessageLite.Builder<NfcStatusManager$NfcStatusMessage, Builder> implements NfcStatusManager$NfcStatusMessageOrBuilder {
        public Builder clearIsNfcOpen() {
            copyOnWrite();
            ((NfcStatusManager$NfcStatusMessage) this.instance).clearIsNfcOpen();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.NfcStatusManager$NfcStatusMessageOrBuilder
        public boolean getIsNfcOpen() {
            return ((NfcStatusManager$NfcStatusMessage) this.instance).getIsNfcOpen();
        }

        public Builder setIsNfcOpen(boolean z) {
            copyOnWrite();
            ((NfcStatusManager$NfcStatusMessage) this.instance).setIsNfcOpen(z);
            return this;
        }

        private Builder() {
            super(NfcStatusManager$NfcStatusMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        NfcStatusManager$NfcStatusMessage nfcStatusManager$NfcStatusMessage = new NfcStatusManager$NfcStatusMessage();
        DEFAULT_INSTANCE = nfcStatusManager$NfcStatusMessage;
        GeneratedMessageLite.registerDefaultInstance(NfcStatusManager$NfcStatusMessage.class, nfcStatusManager$NfcStatusMessage);
    }

    private NfcStatusManager$NfcStatusMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNfcOpen() {
        this.isNfcOpen_ = false;
    }

    public static NfcStatusManager$NfcStatusMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NfcStatusManager$NfcStatusMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NfcStatusManager$NfcStatusMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNfcOpen(boolean z) {
        this.isNfcOpen_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = xrc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NfcStatusManager$NfcStatusMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isNfcOpen_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NfcStatusManager$NfcStatusMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NfcStatusManager$NfcStatusMessage.class) {
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

    @Override // com.oppo.wear.wallet.proto.NfcStatusManager$NfcStatusMessageOrBuilder
    public boolean getIsNfcOpen() {
        return this.isNfcOpen_;
    }

    public static Builder newBuilder(NfcStatusManager$NfcStatusMessage nfcStatusManager$NfcStatusMessage) {
        return DEFAULT_INSTANCE.createBuilder(nfcStatusManager$NfcStatusMessage);
    }

    public static NfcStatusManager$NfcStatusMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(InputStream inputStream) throws IOException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NfcStatusManager$NfcStatusMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NfcStatusManager$NfcStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
