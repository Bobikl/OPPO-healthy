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
public final class CardiovascularProto$HrvFocusBehaviorItem extends GeneratedMessageLite<CardiovascularProto$HrvFocusBehaviorItem, Builder> implements CardiovascularProto$HrvFocusBehaviorItemOrBuilder {
    public static final int BEHAVIORTYPE_FIELD_NUMBER = 1;
    private static final CardiovascularProto$HrvFocusBehaviorItem DEFAULT_INSTANCE;
    public static final int FOCUSDAYDATA_FIELD_NUMBER = 2;
    private static volatile Parser<CardiovascularProto$HrvFocusBehaviorItem> PARSER;
    private int behaviorType_;
    private int focusDayData_;

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$HrvFocusBehaviorItem, Builder> implements CardiovascularProto$HrvFocusBehaviorItemOrBuilder {
        public Builder clearBehaviorType() {
            copyOnWrite();
            ((CardiovascularProto$HrvFocusBehaviorItem) this.instance).clearBehaviorType();
            return this;
        }

        public Builder clearFocusDayData() {
            copyOnWrite();
            ((CardiovascularProto$HrvFocusBehaviorItem) this.instance).clearFocusDayData();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$HrvFocusBehaviorItemOrBuilder
        public int getBehaviorType() {
            return ((CardiovascularProto$HrvFocusBehaviorItem) this.instance).getBehaviorType();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$HrvFocusBehaviorItemOrBuilder
        public int getFocusDayData() {
            return ((CardiovascularProto$HrvFocusBehaviorItem) this.instance).getFocusDayData();
        }

        public Builder setBehaviorType(int i) {
            copyOnWrite();
            ((CardiovascularProto$HrvFocusBehaviorItem) this.instance).setBehaviorType(i);
            return this;
        }

        public Builder setFocusDayData(int i) {
            copyOnWrite();
            ((CardiovascularProto$HrvFocusBehaviorItem) this.instance).setFocusDayData(i);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$HrvFocusBehaviorItem.DEFAULT_INSTANCE);
        }
    }

    static {
        CardiovascularProto$HrvFocusBehaviorItem cardiovascularProto$HrvFocusBehaviorItem = new CardiovascularProto$HrvFocusBehaviorItem();
        DEFAULT_INSTANCE = cardiovascularProto$HrvFocusBehaviorItem;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$HrvFocusBehaviorItem.class, cardiovascularProto$HrvFocusBehaviorItem);
    }

    private CardiovascularProto$HrvFocusBehaviorItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBehaviorType() {
        this.behaviorType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFocusDayData() {
        this.focusDayData_ = 0;
    }

    public static CardiovascularProto$HrvFocusBehaviorItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$HrvFocusBehaviorItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBehaviorType(int i) {
        this.behaviorType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFocusDayData(int i) {
        this.focusDayData_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$HrvFocusBehaviorItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"behaviorType_", "focusDayData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$HrvFocusBehaviorItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$HrvFocusBehaviorItem.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$HrvFocusBehaviorItemOrBuilder
    public int getBehaviorType() {
        return this.behaviorType_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$HrvFocusBehaviorItemOrBuilder
    public int getFocusDayData() {
        return this.focusDayData_;
    }

    public static Builder newBuilder(CardiovascularProto$HrvFocusBehaviorItem cardiovascularProto$HrvFocusBehaviorItem) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$HrvFocusBehaviorItem);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$HrvFocusBehaviorItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$HrvFocusBehaviorItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
