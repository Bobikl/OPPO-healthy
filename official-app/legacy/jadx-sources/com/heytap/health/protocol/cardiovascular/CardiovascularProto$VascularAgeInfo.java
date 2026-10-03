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
public final class CardiovascularProto$VascularAgeInfo extends GeneratedMessageLite<CardiovascularProto$VascularAgeInfo, Builder> implements CardiovascularProto$VascularAgeInfoOrBuilder {
    public static final int COMPARESAMEAGE_FIELD_NUMBER = 2;
    private static final CardiovascularProto$VascularAgeInfo DEFAULT_INSTANCE;
    private static volatile Parser<CardiovascularProto$VascularAgeInfo> PARSER = null;
    public static final int VASCULARAGE_FIELD_NUMBER = 1;
    private int compareSameAge_;
    private int vascularAge_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$VascularAgeInfo, Builder> implements CardiovascularProto$VascularAgeInfoOrBuilder {
        public Builder clearCompareSameAge() {
            copyOnWrite();
            ((CardiovascularProto$VascularAgeInfo) this.instance).clearCompareSameAge();
            return this;
        }

        public Builder clearVascularAge() {
            copyOnWrite();
            ((CardiovascularProto$VascularAgeInfo) this.instance).clearVascularAge();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$VascularAgeInfoOrBuilder
        public int getCompareSameAge() {
            return ((CardiovascularProto$VascularAgeInfo) this.instance).getCompareSameAge();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$VascularAgeInfoOrBuilder
        public int getVascularAge() {
            return ((CardiovascularProto$VascularAgeInfo) this.instance).getVascularAge();
        }

        public Builder setCompareSameAge(int i) {
            copyOnWrite();
            ((CardiovascularProto$VascularAgeInfo) this.instance).setCompareSameAge(i);
            return this;
        }

        public Builder setVascularAge(int i) {
            copyOnWrite();
            ((CardiovascularProto$VascularAgeInfo) this.instance).setVascularAge(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$VascularAgeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo = new CardiovascularProto$VascularAgeInfo();
        DEFAULT_INSTANCE = cardiovascularProto$VascularAgeInfo;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$VascularAgeInfo.class, cardiovascularProto$VascularAgeInfo);
    }

    private CardiovascularProto$VascularAgeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCompareSameAge() {
        this.compareSameAge_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVascularAge() {
        this.vascularAge_ = 0;
    }

    public static CardiovascularProto$VascularAgeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$VascularAgeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$VascularAgeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompareSameAge(int i) {
        this.compareSameAge_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVascularAge(int i) {
        this.vascularAge_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$VascularAgeInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"vascularAge_", "compareSameAge_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$VascularAgeInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$VascularAgeInfo.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$VascularAgeInfoOrBuilder
    public int getCompareSameAge() {
        return this.compareSameAge_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$VascularAgeInfoOrBuilder
    public int getVascularAge() {
        return this.vascularAge_;
    }

    public static Builder newBuilder(CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$VascularAgeInfo);
    }

    public static CardiovascularProto$VascularAgeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$VascularAgeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$VascularAgeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
