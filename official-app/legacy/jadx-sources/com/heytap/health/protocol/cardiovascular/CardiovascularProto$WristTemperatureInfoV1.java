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
public final class CardiovascularProto$WristTemperatureInfoV1 extends GeneratedMessageLite<CardiovascularProto$WristTemperatureInfoV1, Builder> implements CardiovascularProto$WristTemperatureInfoV1OrBuilder {
    public static final int BASELINELEFTTIME_FIELD_NUMBER = 2;
    private static final CardiovascularProto$WristTemperatureInfoV1 DEFAULT_INSTANCE;
    private static volatile Parser<CardiovascularProto$WristTemperatureInfoV1> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int WRISTTEMPVALUE_FIELD_NUMBER = 1;
    private int baseLineLeftTime_;
    private int state_;
    private float wristTempValue_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$WristTemperatureInfoV1, Builder> implements CardiovascularProto$WristTemperatureInfoV1OrBuilder {
        public Builder clearBaseLineLeftTime() {
            copyOnWrite();
            ((CardiovascularProto$WristTemperatureInfoV1) this.instance).clearBaseLineLeftTime();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((CardiovascularProto$WristTemperatureInfoV1) this.instance).clearState();
            return this;
        }

        public Builder clearWristTempValue() {
            copyOnWrite();
            ((CardiovascularProto$WristTemperatureInfoV1) this.instance).clearWristTempValue();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$WristTemperatureInfoV1OrBuilder
        public int getBaseLineLeftTime() {
            return ((CardiovascularProto$WristTemperatureInfoV1) this.instance).getBaseLineLeftTime();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$WristTemperatureInfoV1OrBuilder
        public int getState() {
            return ((CardiovascularProto$WristTemperatureInfoV1) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$WristTemperatureInfoV1OrBuilder
        public float getWristTempValue() {
            return ((CardiovascularProto$WristTemperatureInfoV1) this.instance).getWristTempValue();
        }

        public Builder setBaseLineLeftTime(int i) {
            copyOnWrite();
            ((CardiovascularProto$WristTemperatureInfoV1) this.instance).setBaseLineLeftTime(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((CardiovascularProto$WristTemperatureInfoV1) this.instance).setState(i);
            return this;
        }

        public Builder setWristTempValue(float f) {
            copyOnWrite();
            ((CardiovascularProto$WristTemperatureInfoV1) this.instance).setWristTempValue(f);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$WristTemperatureInfoV1.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1 = new CardiovascularProto$WristTemperatureInfoV1();
        DEFAULT_INSTANCE = cardiovascularProto$WristTemperatureInfoV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$WristTemperatureInfoV1.class, cardiovascularProto$WristTemperatureInfoV1);
    }

    private CardiovascularProto$WristTemperatureInfoV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseLineLeftTime() {
        this.baseLineLeftTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWristTempValue() {
        this.wristTempValue_ = 0.0f;
    }

    public static CardiovascularProto$WristTemperatureInfoV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$WristTemperatureInfoV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseLineLeftTime(int i) {
        this.baseLineLeftTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWristTempValue(float f) {
        this.wristTempValue_ = f;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$WristTemperatureInfoV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0004\u0003\u0004", new Object[]{"wristTempValue_", "baseLineLeftTime_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$WristTemperatureInfoV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$WristTemperatureInfoV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$WristTemperatureInfoV1OrBuilder
    public int getBaseLineLeftTime() {
        return this.baseLineLeftTime_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$WristTemperatureInfoV1OrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$WristTemperatureInfoV1OrBuilder
    public float getWristTempValue() {
        return this.wristTempValue_;
    }

    public static Builder newBuilder(CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$WristTemperatureInfoV1);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$WristTemperatureInfoV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$WristTemperatureInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
