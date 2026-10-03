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
public final class CardiovascularProto$SingleSleepInfoV1 extends GeneratedMessageLite<CardiovascularProto$SingleSleepInfoV1, Builder> implements CardiovascularProto$SingleSleepInfoV1OrBuilder {
    private static final CardiovascularProto$SingleSleepInfoV1 DEFAULT_INSTANCE;
    private static volatile Parser<CardiovascularProto$SingleSleepInfoV1> PARSER = null;
    public static final int SLEEPSCORE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 1;
    private int sleepScore_;
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$SingleSleepInfoV1, Builder> implements CardiovascularProto$SingleSleepInfoV1OrBuilder {
        public Builder clearSleepScore() {
            copyOnWrite();
            ((CardiovascularProto$SingleSleepInfoV1) this.instance).clearSleepScore();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((CardiovascularProto$SingleSleepInfoV1) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleSleepInfoV1OrBuilder
        public int getSleepScore() {
            return ((CardiovascularProto$SingleSleepInfoV1) this.instance).getSleepScore();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleSleepInfoV1OrBuilder
        public int getState() {
            return ((CardiovascularProto$SingleSleepInfoV1) this.instance).getState();
        }

        public Builder setSleepScore(int i) {
            copyOnWrite();
            ((CardiovascularProto$SingleSleepInfoV1) this.instance).setSleepScore(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((CardiovascularProto$SingleSleepInfoV1) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$SingleSleepInfoV1.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1 = new CardiovascularProto$SingleSleepInfoV1();
        DEFAULT_INSTANCE = cardiovascularProto$SingleSleepInfoV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$SingleSleepInfoV1.class, cardiovascularProto$SingleSleepInfoV1);
    }

    private CardiovascularProto$SingleSleepInfoV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepScore() {
        this.sleepScore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static CardiovascularProto$SingleSleepInfoV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$SingleSleepInfoV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepScore(int i) {
        this.sleepScore_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$SingleSleepInfoV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"state_", "sleepScore_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$SingleSleepInfoV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$SingleSleepInfoV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleSleepInfoV1OrBuilder
    public int getSleepScore() {
        return this.sleepScore_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleSleepInfoV1OrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$SingleSleepInfoV1);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$SingleSleepInfoV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SingleSleepInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
