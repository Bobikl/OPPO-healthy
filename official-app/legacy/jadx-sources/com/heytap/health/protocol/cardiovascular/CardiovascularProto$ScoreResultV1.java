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
public final class CardiovascularProto$ScoreResultV1 extends GeneratedMessageLite<CardiovascularProto$ScoreResultV1, Builder> implements CardiovascularProto$ScoreResultV1OrBuilder {
    private static final CardiovascularProto$ScoreResultV1 DEFAULT_INSTANCE;
    private static volatile Parser<CardiovascularProto$ScoreResultV1> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int score_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$ScoreResultV1, Builder> implements CardiovascularProto$ScoreResultV1OrBuilder {
        public Builder clearScore() {
            copyOnWrite();
            ((CardiovascularProto$ScoreResultV1) this.instance).clearScore();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((CardiovascularProto$ScoreResultV1) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$ScoreResultV1OrBuilder
        public int getScore() {
            return ((CardiovascularProto$ScoreResultV1) this.instance).getScore();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$ScoreResultV1OrBuilder
        public int getTimestamp() {
            return ((CardiovascularProto$ScoreResultV1) this.instance).getTimestamp();
        }

        public Builder setScore(int i) {
            copyOnWrite();
            ((CardiovascularProto$ScoreResultV1) this.instance).setScore(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((CardiovascularProto$ScoreResultV1) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$ScoreResultV1.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$ScoreResultV1 cardiovascularProto$ScoreResultV1 = new CardiovascularProto$ScoreResultV1();
        DEFAULT_INSTANCE = cardiovascularProto$ScoreResultV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$ScoreResultV1.class, cardiovascularProto$ScoreResultV1);
    }

    private CardiovascularProto$ScoreResultV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static CardiovascularProto$ScoreResultV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$ScoreResultV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$ScoreResultV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(int i) {
        this.score_ = i;
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
                return new CardiovascularProto$ScoreResultV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"timestamp_", "score_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$ScoreResultV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$ScoreResultV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$ScoreResultV1OrBuilder
    public int getScore() {
        return this.score_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$ScoreResultV1OrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(CardiovascularProto$ScoreResultV1 cardiovascularProto$ScoreResultV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$ScoreResultV1);
    }

    public static CardiovascularProto$ScoreResultV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$ScoreResultV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$ScoreResultV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
