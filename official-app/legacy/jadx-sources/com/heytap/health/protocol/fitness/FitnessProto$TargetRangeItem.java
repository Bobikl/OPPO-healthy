package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$TargetRangeItem extends GeneratedMessageLite<FitnessProto$TargetRangeItem, Builder> implements FitnessProto$TargetRangeItemOrBuilder {
    private static final FitnessProto$TargetRangeItem DEFAULT_INSTANCE;
    public static final int LOWER_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$TargetRangeItem> PARSER = null;
    public static final int SWITCHTYPE_FIELD_NUMBER = 1;
    public static final int UPPER_FIELD_NUMBER = 3;
    private int lower_;
    private int switchType_;
    private int upper_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$TargetRangeItem, Builder> implements FitnessProto$TargetRangeItemOrBuilder {
        private Builder() {
            super(FitnessProto$TargetRangeItem.DEFAULT_INSTANCE);
        }

        public Builder clearLower() {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).clearLower();
            return this;
        }

        public Builder clearSwitchType() {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).clearSwitchType();
            return this;
        }

        public Builder clearUpper() {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).clearUpper();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
        public int getLower() {
            return ((FitnessProto$TargetRangeItem) this.instance).getLower();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
        public FitnessProto$TARGET_RANGE_SWITCH getSwitchType() {
            return ((FitnessProto$TargetRangeItem) this.instance).getSwitchType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
        public int getSwitchTypeValue() {
            return ((FitnessProto$TargetRangeItem) this.instance).getSwitchTypeValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
        public int getUpper() {
            return ((FitnessProto$TargetRangeItem) this.instance).getUpper();
        }

        public Builder setLower(int i) {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).setLower(i);
            return this;
        }

        public Builder setSwitchType(FitnessProto$TARGET_RANGE_SWITCH fitnessProto$TARGET_RANGE_SWITCH) {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).setSwitchType(fitnessProto$TARGET_RANGE_SWITCH);
            return this;
        }

        public Builder setSwitchTypeValue(int i) {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).setSwitchTypeValue(i);
            return this;
        }

        public Builder setUpper(int i) {
            copyOnWrite();
            ((FitnessProto$TargetRangeItem) this.instance).setUpper(i);
            return this;
        }
    }

    static {
        FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem = new FitnessProto$TargetRangeItem();
        DEFAULT_INSTANCE = fitnessProto$TargetRangeItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$TargetRangeItem.class, fitnessProto$TargetRangeItem);
    }

    private FitnessProto$TargetRangeItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLower() {
        this.lower_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchType() {
        this.switchType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpper() {
        this.upper_ = 0;
    }

    public static FitnessProto$TargetRangeItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$TargetRangeItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$TargetRangeItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$TargetRangeItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLower(int i) {
        this.lower_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchType(FitnessProto$TARGET_RANGE_SWITCH fitnessProto$TARGET_RANGE_SWITCH) {
        this.switchType_ = fitnessProto$TARGET_RANGE_SWITCH.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchTypeValue(int i) {
        this.switchType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpper(int i) {
        this.upper_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$TargetRangeItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u000b", new Object[]{"switchType_", "lower_", "upper_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$TargetRangeItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$TargetRangeItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
    public int getLower() {
        return this.lower_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
    public FitnessProto$TARGET_RANGE_SWITCH getSwitchType() {
        FitnessProto$TARGET_RANGE_SWITCH fitnessProto$TARGET_RANGE_SWITCHForNumber = FitnessProto$TARGET_RANGE_SWITCH.forNumber(this.switchType_);
        return fitnessProto$TARGET_RANGE_SWITCHForNumber == null ? FitnessProto$TARGET_RANGE_SWITCH.UNRECOGNIZED : fitnessProto$TARGET_RANGE_SWITCHForNumber;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
    public int getSwitchTypeValue() {
        return this.switchType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TargetRangeItemOrBuilder
    public int getUpper() {
        return this.upper_;
    }

    public static Builder newBuilder(FitnessProto$TargetRangeItem fitnessProto$TargetRangeItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$TargetRangeItem);
    }

    public static FitnessProto$TargetRangeItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$TargetRangeItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$TargetRangeItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$TargetRangeItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$TargetRangeItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$TargetRangeItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$TargetRangeItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$TargetRangeItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$TargetRangeItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$TargetRangeItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TargetRangeItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
