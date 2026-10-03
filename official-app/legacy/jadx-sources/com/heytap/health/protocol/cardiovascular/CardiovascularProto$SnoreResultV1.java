package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.z23;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class CardiovascularProto$SnoreResultV1 extends GeneratedMessageLite<CardiovascularProto$SnoreResultV1, Builder> implements CardiovascularProto$SnoreResultV1OrBuilder {
    private static final CardiovascularProto$SnoreResultV1 DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile Parser<CardiovascularProto$SnoreResultV1> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int level_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$SnoreResultV1, Builder> implements CardiovascularProto$SnoreResultV1OrBuilder {
        public Builder clearLevel() {
            copyOnWrite();
            ((CardiovascularProto$SnoreResultV1) this.instance).clearLevel();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((CardiovascularProto$SnoreResultV1) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SnoreResultV1OrBuilder
        public int getLevel() {
            return ((CardiovascularProto$SnoreResultV1) this.instance).getLevel();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SnoreResultV1OrBuilder
        public int getTimestamp() {
            return ((CardiovascularProto$SnoreResultV1) this.instance).getTimestamp();
        }

        public Builder setLevel(int i) {
            copyOnWrite();
            ((CardiovascularProto$SnoreResultV1) this.instance).setLevel(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((CardiovascularProto$SnoreResultV1) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$SnoreResultV1.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$SnoreResultV1 cardiovascularProto$SnoreResultV1 = new CardiovascularProto$SnoreResultV1();
        DEFAULT_INSTANCE = cardiovascularProto$SnoreResultV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$SnoreResultV1.class, cardiovascularProto$SnoreResultV1);
    }

    private CardiovascularProto$SnoreResultV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static CardiovascularProto$SnoreResultV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$SnoreResultV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$SnoreResultV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(int i) {
        this.level_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$SnoreResultV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0004", new Object[]{"timestamp_", "level_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$SnoreResultV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$SnoreResultV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SnoreResultV1OrBuilder
    public int getLevel() {
        return this.level_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SnoreResultV1OrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(CardiovascularProto$SnoreResultV1 cardiovascularProto$SnoreResultV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$SnoreResultV1);
    }

    public static CardiovascularProto$SnoreResultV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$SnoreResultV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SnoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
