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
public final class CardiovascularProto$TimeToIntValueInfo extends GeneratedMessageLite<CardiovascularProto$TimeToIntValueInfo, Builder> implements CardiovascularProto$TimeToIntValueInfoOrBuilder {
    private static final CardiovascularProto$TimeToIntValueInfo DEFAULT_INSTANCE;
    private static volatile Parser<CardiovascularProto$TimeToIntValueInfo> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int time_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$TimeToIntValueInfo, Builder> implements CardiovascularProto$TimeToIntValueInfoOrBuilder {
        public Builder clearTime() {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfo) this.instance).clearTime();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfo) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoOrBuilder
        public int getTime() {
            return ((CardiovascularProto$TimeToIntValueInfo) this.instance).getTime();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoOrBuilder
        public int getValue() {
            return ((CardiovascularProto$TimeToIntValueInfo) this.instance).getValue();
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfo) this.instance).setTime(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToIntValueInfo) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$TimeToIntValueInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo = new CardiovascularProto$TimeToIntValueInfo();
        DEFAULT_INSTANCE = cardiovascularProto$TimeToIntValueInfo;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$TimeToIntValueInfo.class, cardiovascularProto$TimeToIntValueInfo);
    }

    private CardiovascularProto$TimeToIntValueInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static CardiovascularProto$TimeToIntValueInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$TimeToIntValueInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$TimeToIntValueInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return new CardiovascularProto$TimeToIntValueInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0004", new Object[]{"time_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$TimeToIntValueInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$TimeToIntValueInfo.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoOrBuilder
    public int getTime() {
        return this.time_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToIntValueInfoOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$TimeToIntValueInfo);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$TimeToIntValueInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToIntValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
