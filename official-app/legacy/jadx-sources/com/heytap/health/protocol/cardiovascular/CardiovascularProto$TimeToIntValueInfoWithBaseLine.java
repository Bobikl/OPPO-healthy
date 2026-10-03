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
public final class CardiovascularProto$TimeToIntValueInfoWithBaseLine extends GeneratedMessageLite<CardiovascularProto$TimeToIntValueInfoWithBaseLine, Builder> implements CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder {
    private static final CardiovascularProto$TimeToIntValueInfoWithBaseLine DEFAULT_INSTANCE;
    public static final int HIGHLINE_FIELD_NUMBER = 4;
    public static final int LOWLINE_FIELD_NUMBER = 3;
    private static volatile Parser<CardiovascularProto$TimeToIntValueInfoWithBaseLine> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int highLine_;
    private int lowLine_;
    private int time_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$TimeToIntValueInfoWithBaseLine, Builder> implements CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder {
        public Builder clearHighLine() {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).clearHighLine();
            return this;
        }

        public Builder clearLowLine() {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).clearLowLine();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).clearTime();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
        public int getHighLine() {
            return ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).getHighLine();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
        public int getLowLine() {
            return ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).getLowLine();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
        public int getTime() {
            return ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).getTime();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
        public int getValue() {
            return ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).getValue();
        }

        public Builder setHighLine(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).setHighLine(i);
            return this;
        }

        public Builder setLowLine(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).setLowLine(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).setTime(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfoWithBaseLine) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$TimeToIntValueInfoWithBaseLine.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$TimeToIntValueInfoWithBaseLine cardiovascularProto$TimeToIntValueInfoWithBaseLine = new CardiovascularProto$TimeToIntValueInfoWithBaseLine();
        DEFAULT_INSTANCE = cardiovascularProto$TimeToIntValueInfoWithBaseLine;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$TimeToIntValueInfoWithBaseLine.class, cardiovascularProto$TimeToIntValueInfoWithBaseLine);
    }

    private CardiovascularProto$TimeToIntValueInfoWithBaseLine() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighLine() {
        this.highLine_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowLine() {
        this.lowLine_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$TimeToIntValueInfoWithBaseLine> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighLine(int i) {
        this.highLine_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowLine(int i) {
        this.lowLine_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$TimeToIntValueInfoWithBaseLine();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"time_", "value_", "lowLine_", "highLine_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$TimeToIntValueInfoWithBaseLine> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$TimeToIntValueInfoWithBaseLine.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
    public int getHighLine() {
        return this.highLine_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
    public int getLowLine() {
        return this.lowLine_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
    public int getTime() {
        return this.time_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoWithBaseLineOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(CardiovascularProto$TimeToIntValueInfoWithBaseLine cardiovascularProto$TimeToIntValueInfoWithBaseLine) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$TimeToIntValueInfoWithBaseLine);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$TimeToIntValueInfoWithBaseLine parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfoWithBaseLine) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
