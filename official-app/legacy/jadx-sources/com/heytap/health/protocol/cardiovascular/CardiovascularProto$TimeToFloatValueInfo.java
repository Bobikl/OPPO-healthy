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
public final class CardiovascularProto$TimeToFloatValueInfo extends GeneratedMessageLite<CardiovascularProto$TimeToFloatValueInfo, Builder> implements CardiovascularProto$TimeToFloatValueInfoOrBuilder {
    private static final CardiovascularProto$TimeToFloatValueInfo DEFAULT_INSTANCE;
    private static volatile Parser<CardiovascularProto$TimeToFloatValueInfo> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int time_;
    private float value_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$TimeToFloatValueInfo, Builder> implements CardiovascularProto$TimeToFloatValueInfoOrBuilder {
        public Builder clearTime() {
            copyOnWrite();
            ((CardiovascularProto$TimeToFloatValueInfo) this.instance).clearTime();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((CardiovascularProto$TimeToFloatValueInfo) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToFloatValueInfoOrBuilder
        public int getTime() {
            return ((CardiovascularProto$TimeToFloatValueInfo) this.instance).getTime();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToFloatValueInfoOrBuilder
        public float getValue() {
            return ((CardiovascularProto$TimeToFloatValueInfo) this.instance).getValue();
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((CardiovascularProto$TimeToFloatValueInfo) this.instance).setTime(i);
            return this;
        }

        public Builder setValue(float f) {
            copyOnWrite();
            ((CardiovascularProto$TimeToFloatValueInfo) this.instance).setValue(f);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$TimeToFloatValueInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$TimeToFloatValueInfo cardiovascularProto$TimeToFloatValueInfo = new CardiovascularProto$TimeToFloatValueInfo();
        DEFAULT_INSTANCE = cardiovascularProto$TimeToFloatValueInfo;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$TimeToFloatValueInfo.class, cardiovascularProto$TimeToFloatValueInfo);
    }

    private CardiovascularProto$TimeToFloatValueInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static CardiovascularProto$TimeToFloatValueInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$TimeToFloatValueInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(float f) {
        this.value_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$TimeToFloatValueInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u0001", new Object[]{"time_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$TimeToFloatValueInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$TimeToFloatValueInfo.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToFloatValueInfoOrBuilder
    public int getTime() {
        return this.time_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$TimeToFloatValueInfoOrBuilder
    public float getValue() {
        return this.value_;
    }

    public static Builder newBuilder(CardiovascularProto$TimeToFloatValueInfo cardiovascularProto$TimeToFloatValueInfo) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$TimeToFloatValueInfo);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$TimeToFloatValueInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$TimeToFloatValueInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
