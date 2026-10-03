package com.heytap.health.protocol.defatcalorie;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.k35;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DefatCalorieProto$FatLossInfo extends GeneratedMessageLite<DefatCalorieProto$FatLossInfo, Builder> implements DefatCalorieProto$FatLossInfoOrBuilder {
    public static final int AGE_FIELD_NUMBER = 2;
    private static final DefatCalorieProto$FatLossInfo DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile Parser<DefatCalorieProto$FatLossInfo> PARSER = null;
    public static final int SEX_FIELD_NUMBER = 1;
    public static final int TARGETWEIGHT_FIELD_NUMBER = 5;
    public static final int WEIGHT_FIELD_NUMBER = 4;
    private int age_;
    private int height_;
    private int sex_;
    private int targetWeight_;
    private int weight_;

    public static final class Builder extends GeneratedMessageLite.Builder<DefatCalorieProto$FatLossInfo, Builder> implements DefatCalorieProto$FatLossInfoOrBuilder {
        public Builder clearAge() {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).clearAge();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).clearHeight();
            return this;
        }

        public Builder clearSex() {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).clearSex();
            return this;
        }

        public Builder clearTargetWeight() {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).clearTargetWeight();
            return this;
        }

        public Builder clearWeight() {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).clearWeight();
            return this;
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
        public int getAge() {
            return ((DefatCalorieProto$FatLossInfo) this.instance).getAge();
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
        public int getHeight() {
            return ((DefatCalorieProto$FatLossInfo) this.instance).getHeight();
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
        public int getSex() {
            return ((DefatCalorieProto$FatLossInfo) this.instance).getSex();
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
        public int getTargetWeight() {
            return ((DefatCalorieProto$FatLossInfo) this.instance).getTargetWeight();
        }

        @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
        public int getWeight() {
            return ((DefatCalorieProto$FatLossInfo) this.instance).getWeight();
        }

        public Builder setAge(int i) {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).setAge(i);
            return this;
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).setHeight(i);
            return this;
        }

        public Builder setSex(int i) {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).setSex(i);
            return this;
        }

        public Builder setTargetWeight(int i) {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).setTargetWeight(i);
            return this;
        }

        public Builder setWeight(int i) {
            copyOnWrite();
            ((DefatCalorieProto$FatLossInfo) this.instance).setWeight(i);
            return this;
        }

        private Builder() {
            super(DefatCalorieProto$FatLossInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DefatCalorieProto$FatLossInfo defatCalorieProto$FatLossInfo = new DefatCalorieProto$FatLossInfo();
        DEFAULT_INSTANCE = defatCalorieProto$FatLossInfo;
        GeneratedMessageLite.registerDefaultInstance(DefatCalorieProto$FatLossInfo.class, defatCalorieProto$FatLossInfo);
    }

    private DefatCalorieProto$FatLossInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAge() {
        this.age_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSex() {
        this.sex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetWeight() {
        this.targetWeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeight() {
        this.weight_ = 0;
    }

    public static DefatCalorieProto$FatLossInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DefatCalorieProto$FatLossInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DefatCalorieProto$FatLossInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAge(int i) {
        this.age_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSex(int i) {
        this.sex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetWeight(int i) {
        this.targetWeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeight(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = k35.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DefatCalorieProto$FatLossInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"sex_", "age_", "height_", "weight_", "targetWeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DefatCalorieProto$FatLossInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DefatCalorieProto$FatLossInfo.class) {
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

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
    public int getAge() {
        return this.age_;
    }

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
    public int getSex() {
        return this.sex_;
    }

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
    public int getTargetWeight() {
        return this.targetWeight_;
    }

    @Override // com.heytap.health.protocol.defatcalorie.DefatCalorieProto$FatLossInfoOrBuilder
    public int getWeight() {
        return this.weight_;
    }

    public static Builder newBuilder(DefatCalorieProto$FatLossInfo defatCalorieProto$FatLossInfo) {
        return DEFAULT_INSTANCE.createBuilder(defatCalorieProto$FatLossInfo);
    }

    public static DefatCalorieProto$FatLossInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(InputStream inputStream) throws IOException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DefatCalorieProto$FatLossInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DefatCalorieProto$FatLossInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
