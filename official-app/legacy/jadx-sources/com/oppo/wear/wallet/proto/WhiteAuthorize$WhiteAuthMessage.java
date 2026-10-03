package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.lvl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class WhiteAuthorize$WhiteAuthMessage extends GeneratedMessageLite<WhiteAuthorize$WhiteAuthMessage, Builder> implements WhiteAuthorize$WhiteAuthMessageOrBuilder {
    public static final int AUTHFLAG_FIELD_NUMBER = 1;
    private static final WhiteAuthorize$WhiteAuthMessage DEFAULT_INSTANCE;
    private static volatile Parser<WhiteAuthorize$WhiteAuthMessage> PARSER;
    private int authFlag_;

    public static final class Builder extends GeneratedMessageLite.Builder<WhiteAuthorize$WhiteAuthMessage, Builder> implements WhiteAuthorize$WhiteAuthMessageOrBuilder {
        public Builder clearAuthFlag() {
            copyOnWrite();
            ((WhiteAuthorize$WhiteAuthMessage) this.instance).clearAuthFlag();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.WhiteAuthorize$WhiteAuthMessageOrBuilder
        public int getAuthFlag() {
            return ((WhiteAuthorize$WhiteAuthMessage) this.instance).getAuthFlag();
        }

        public Builder setAuthFlag(int i) {
            copyOnWrite();
            ((WhiteAuthorize$WhiteAuthMessage) this.instance).setAuthFlag(i);
            return this;
        }

        private Builder() {
            super(WhiteAuthorize$WhiteAuthMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        WhiteAuthorize$WhiteAuthMessage whiteAuthorize$WhiteAuthMessage = new WhiteAuthorize$WhiteAuthMessage();
        DEFAULT_INSTANCE = whiteAuthorize$WhiteAuthMessage;
        GeneratedMessageLite.registerDefaultInstance(WhiteAuthorize$WhiteAuthMessage.class, whiteAuthorize$WhiteAuthMessage);
    }

    private WhiteAuthorize$WhiteAuthMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthFlag() {
        this.authFlag_ = 0;
    }

    public static WhiteAuthorize$WhiteAuthMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WhiteAuthorize$WhiteAuthMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WhiteAuthorize$WhiteAuthMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthFlag(int i) {
        this.authFlag_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = lvl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WhiteAuthorize$WhiteAuthMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"authFlag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WhiteAuthorize$WhiteAuthMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WhiteAuthorize$WhiteAuthMessage.class) {
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

    @Override // com.oppo.wear.wallet.proto.WhiteAuthorize$WhiteAuthMessageOrBuilder
    public int getAuthFlag() {
        return this.authFlag_;
    }

    public static Builder newBuilder(WhiteAuthorize$WhiteAuthMessage whiteAuthorize$WhiteAuthMessage) {
        return DEFAULT_INSTANCE.createBuilder(whiteAuthorize$WhiteAuthMessage);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(InputStream inputStream) throws IOException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WhiteAuthorize$WhiteAuthMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WhiteAuthorize$WhiteAuthMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
