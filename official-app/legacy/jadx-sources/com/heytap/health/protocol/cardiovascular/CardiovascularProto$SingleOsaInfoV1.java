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
public final class CardiovascularProto$SingleOsaInfoV1 extends GeneratedMessageLite<CardiovascularProto$SingleOsaInfoV1, Builder> implements CardiovascularProto$SingleOsaInfoV1OrBuilder {
    private static final CardiovascularProto$SingleOsaInfoV1 DEFAULT_INSTANCE;
    public static final int OSALEVEL_FIELD_NUMBER = 2;
    public static final int OSANAME_FIELD_NUMBER = 3;
    private static volatile Parser<CardiovascularProto$SingleOsaInfoV1> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int osaLevel_;
    private int osaName_;
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$SingleOsaInfoV1, Builder> implements CardiovascularProto$SingleOsaInfoV1OrBuilder {
        public Builder clearOsaLevel() {
            copyOnWrite();
            ((CardiovascularProto$SingleOsaInfoV1) this.instance).clearOsaLevel();
            return this;
        }

        public Builder clearOsaName() {
            copyOnWrite();
            ((CardiovascularProto$SingleOsaInfoV1) this.instance).clearOsaName();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((CardiovascularProto$SingleOsaInfoV1) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleOsaInfoV1OrBuilder
        public int getOsaLevel() {
            return ((CardiovascularProto$SingleOsaInfoV1) this.instance).getOsaLevel();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleOsaInfoV1OrBuilder
        public int getOsaName() {
            return ((CardiovascularProto$SingleOsaInfoV1) this.instance).getOsaName();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleOsaInfoV1OrBuilder
        public int getState() {
            return ((CardiovascularProto$SingleOsaInfoV1) this.instance).getState();
        }

        public Builder setOsaLevel(int i) {
            copyOnWrite();
            ((CardiovascularProto$SingleOsaInfoV1) this.instance).setOsaLevel(i);
            return this;
        }

        public Builder setOsaName(int i) {
            copyOnWrite();
            ((CardiovascularProto$SingleOsaInfoV1) this.instance).setOsaName(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((CardiovascularProto$SingleOsaInfoV1) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$SingleOsaInfoV1.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1 = new CardiovascularProto$SingleOsaInfoV1();
        DEFAULT_INSTANCE = cardiovascularProto$SingleOsaInfoV1;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$SingleOsaInfoV1.class, cardiovascularProto$SingleOsaInfoV1);
    }

    private CardiovascularProto$SingleOsaInfoV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsaLevel() {
        this.osaLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsaName() {
        this.osaName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static CardiovascularProto$SingleOsaInfoV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$SingleOsaInfoV1> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsaLevel(int i) {
        this.osaLevel_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsaName(int i) {
        this.osaName_ = i;
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
                return new CardiovascularProto$SingleOsaInfoV1();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"state_", "osaLevel_", "osaName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$SingleOsaInfoV1> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$SingleOsaInfoV1.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleOsaInfoV1OrBuilder
    public int getOsaLevel() {
        return this.osaLevel_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleOsaInfoV1OrBuilder
    public int getOsaName() {
        return this.osaName_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$SingleOsaInfoV1OrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$SingleOsaInfoV1);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$SingleOsaInfoV1 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$SingleOsaInfoV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
