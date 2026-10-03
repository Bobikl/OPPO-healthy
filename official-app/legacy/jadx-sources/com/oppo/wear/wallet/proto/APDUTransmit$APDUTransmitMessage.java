package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.u0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class APDUTransmit$APDUTransmitMessage extends GeneratedMessageLite<APDUTransmit$APDUTransmitMessage, Builder> implements APDUTransmit$APDUTransmitMessageOrBuilder {
    private static final APDUTransmit$APDUTransmitMessage DEFAULT_INSTANCE;
    private static volatile Parser<APDUTransmit$APDUTransmitMessage> PARSER = null;
    public static final int WALLETCHANNELAPDU_FIELD_NUMBER = 2;
    public static final int WALLETCHANNELID_FIELD_NUMBER = 3;
    public static final int WALLETREQUESTID_FIELD_NUMBER = 1;
    private String walletRequestId_ = "";
    private ByteString walletChannelAPDU_ = ByteString.EMPTY;
    private String walletChannelId_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<APDUTransmit$APDUTransmitMessage, Builder> implements APDUTransmit$APDUTransmitMessageOrBuilder {
        public Builder clearWalletChannelAPDU() {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).clearWalletChannelAPDU();
            return this;
        }

        public Builder clearWalletChannelId() {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).clearWalletChannelId();
            return this;
        }

        public Builder clearWalletRequestId() {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).clearWalletRequestId();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
        public ByteString getWalletChannelAPDU() {
            return ((APDUTransmit$APDUTransmitMessage) this.instance).getWalletChannelAPDU();
        }

        @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
        public String getWalletChannelId() {
            return ((APDUTransmit$APDUTransmitMessage) this.instance).getWalletChannelId();
        }

        @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
        public ByteString getWalletChannelIdBytes() {
            return ((APDUTransmit$APDUTransmitMessage) this.instance).getWalletChannelIdBytes();
        }

        @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
        public String getWalletRequestId() {
            return ((APDUTransmit$APDUTransmitMessage) this.instance).getWalletRequestId();
        }

        @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
        public ByteString getWalletRequestIdBytes() {
            return ((APDUTransmit$APDUTransmitMessage) this.instance).getWalletRequestIdBytes();
        }

        public Builder setWalletChannelAPDU(ByteString byteString) {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).setWalletChannelAPDU(byteString);
            return this;
        }

        public Builder setWalletChannelId(String str) {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).setWalletChannelId(str);
            return this;
        }

        public Builder setWalletChannelIdBytes(ByteString byteString) {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).setWalletChannelIdBytes(byteString);
            return this;
        }

        public Builder setWalletRequestId(String str) {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).setWalletRequestId(str);
            return this;
        }

        public Builder setWalletRequestIdBytes(ByteString byteString) {
            copyOnWrite();
            ((APDUTransmit$APDUTransmitMessage) this.instance).setWalletRequestIdBytes(byteString);
            return this;
        }

        private Builder() {
            super(APDUTransmit$APDUTransmitMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        APDUTransmit$APDUTransmitMessage aPDUTransmit$APDUTransmitMessage = new APDUTransmit$APDUTransmitMessage();
        DEFAULT_INSTANCE = aPDUTransmit$APDUTransmitMessage;
        GeneratedMessageLite.registerDefaultInstance(APDUTransmit$APDUTransmitMessage.class, aPDUTransmit$APDUTransmitMessage);
    }

    private APDUTransmit$APDUTransmitMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletChannelAPDU() {
        this.walletChannelAPDU_ = getDefaultInstance().getWalletChannelAPDU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletChannelId() {
        this.walletChannelId_ = getDefaultInstance().getWalletChannelId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletRequestId() {
        this.walletRequestId_ = getDefaultInstance().getWalletRequestId();
    }

    public static APDUTransmit$APDUTransmitMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static APDUTransmit$APDUTransmitMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<APDUTransmit$APDUTransmitMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletChannelAPDU(ByteString byteString) {
        byteString.getClass();
        this.walletChannelAPDU_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletChannelId(String str) {
        str.getClass();
        this.walletChannelId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletChannelIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.walletChannelId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletRequestId(String str) {
        str.getClass();
        this.walletRequestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletRequestIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.walletRequestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = u0.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new APDUTransmit$APDUTransmitMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ", new Object[]{"walletRequestId_", "walletChannelAPDU_", "walletChannelId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<APDUTransmit$APDUTransmitMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (APDUTransmit$APDUTransmitMessage.class) {
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

    @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
    public ByteString getWalletChannelAPDU() {
        return this.walletChannelAPDU_;
    }

    @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
    public String getWalletChannelId() {
        return this.walletChannelId_;
    }

    @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
    public ByteString getWalletChannelIdBytes() {
        return ByteString.copyFromUtf8(this.walletChannelId_);
    }

    @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
    public String getWalletRequestId() {
        return this.walletRequestId_;
    }

    @Override // com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessageOrBuilder
    public ByteString getWalletRequestIdBytes() {
        return ByteString.copyFromUtf8(this.walletRequestId_);
    }

    public static Builder newBuilder(APDUTransmit$APDUTransmitMessage aPDUTransmit$APDUTransmitMessage) {
        return DEFAULT_INSTANCE.createBuilder(aPDUTransmit$APDUTransmitMessage);
    }

    public static APDUTransmit$APDUTransmitMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(InputStream inputStream) throws IOException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static APDUTransmit$APDUTransmitMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (APDUTransmit$APDUTransmitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
