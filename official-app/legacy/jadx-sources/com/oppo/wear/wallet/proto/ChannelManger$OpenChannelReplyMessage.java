package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.f73;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class ChannelManger$OpenChannelReplyMessage extends GeneratedMessageLite<ChannelManger$OpenChannelReplyMessage, Builder> implements ChannelManger$OpenChannelReplyMessageOrBuilder {
    private static final ChannelManger$OpenChannelReplyMessage DEFAULT_INSTANCE;
    private static volatile Parser<ChannelManger$OpenChannelReplyMessage> PARSER = null;
    public static final int WALLETCHANNELID_FIELD_NUMBER = 1;
    public static final int WALLETRESPONSEAPDU_FIELD_NUMBER = 2;
    private String walletChannelId_ = "";
    private ByteString walletResponseAPDU_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<ChannelManger$OpenChannelReplyMessage, Builder> implements ChannelManger$OpenChannelReplyMessageOrBuilder {
        public Builder clearWalletChannelId() {
            copyOnWrite();
            ((ChannelManger$OpenChannelReplyMessage) this.instance).clearWalletChannelId();
            return this;
        }

        public Builder clearWalletResponseAPDU() {
            copyOnWrite();
            ((ChannelManger$OpenChannelReplyMessage) this.instance).clearWalletResponseAPDU();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessageOrBuilder
        public String getWalletChannelId() {
            return ((ChannelManger$OpenChannelReplyMessage) this.instance).getWalletChannelId();
        }

        @Override // com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessageOrBuilder
        public ByteString getWalletChannelIdBytes() {
            return ((ChannelManger$OpenChannelReplyMessage) this.instance).getWalletChannelIdBytes();
        }

        @Override // com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessageOrBuilder
        public ByteString getWalletResponseAPDU() {
            return ((ChannelManger$OpenChannelReplyMessage) this.instance).getWalletResponseAPDU();
        }

        public Builder setWalletChannelId(String str) {
            copyOnWrite();
            ((ChannelManger$OpenChannelReplyMessage) this.instance).setWalletChannelId(str);
            return this;
        }

        public Builder setWalletChannelIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ChannelManger$OpenChannelReplyMessage) this.instance).setWalletChannelIdBytes(byteString);
            return this;
        }

        public Builder setWalletResponseAPDU(ByteString byteString) {
            copyOnWrite();
            ((ChannelManger$OpenChannelReplyMessage) this.instance).setWalletResponseAPDU(byteString);
            return this;
        }

        private Builder() {
            super(ChannelManger$OpenChannelReplyMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        ChannelManger$OpenChannelReplyMessage channelManger$OpenChannelReplyMessage = new ChannelManger$OpenChannelReplyMessage();
        DEFAULT_INSTANCE = channelManger$OpenChannelReplyMessage;
        GeneratedMessageLite.registerDefaultInstance(ChannelManger$OpenChannelReplyMessage.class, channelManger$OpenChannelReplyMessage);
    }

    private ChannelManger$OpenChannelReplyMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletChannelId() {
        this.walletChannelId_ = getDefaultInstance().getWalletChannelId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletResponseAPDU() {
        this.walletResponseAPDU_ = getDefaultInstance().getWalletResponseAPDU();
    }

    public static ChannelManger$OpenChannelReplyMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChannelManger$OpenChannelReplyMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChannelManger$OpenChannelReplyMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setWalletResponseAPDU(ByteString byteString) {
        byteString.getClass();
        this.walletResponseAPDU_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = f73.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ChannelManger$OpenChannelReplyMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"walletChannelId_", "walletResponseAPDU_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChannelManger$OpenChannelReplyMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ChannelManger$OpenChannelReplyMessage.class) {
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

    @Override // com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessageOrBuilder
    public String getWalletChannelId() {
        return this.walletChannelId_;
    }

    @Override // com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessageOrBuilder
    public ByteString getWalletChannelIdBytes() {
        return ByteString.copyFromUtf8(this.walletChannelId_);
    }

    @Override // com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessageOrBuilder
    public ByteString getWalletResponseAPDU() {
        return this.walletResponseAPDU_;
    }

    public static Builder newBuilder(ChannelManger$OpenChannelReplyMessage channelManger$OpenChannelReplyMessage) {
        return DEFAULT_INSTANCE.createBuilder(channelManger$OpenChannelReplyMessage);
    }

    public static ChannelManger$OpenChannelReplyMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(InputStream inputStream) throws IOException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChannelManger$OpenChannelReplyMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChannelManger$OpenChannelReplyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
