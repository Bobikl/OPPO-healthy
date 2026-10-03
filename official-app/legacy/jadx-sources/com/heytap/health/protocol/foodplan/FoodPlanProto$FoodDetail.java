package com.heytap.health.protocol.foodplan;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.qw7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FoodPlanProto$FoodDetail extends GeneratedMessageLite<FoodPlanProto$FoodDetail, Builder> implements FoodPlanProto$FoodDetailOrBuilder {
    public static final int CALORIE_FIELD_NUMBER = 4;
    private static final FoodPlanProto$FoodDetail DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<FoodPlanProto$FoodDetail> PARSER = null;
    public static final int QUANTITY_FIELD_NUMBER = 2;
    public static final int UNIT_FIELD_NUMBER = 3;
    private int calorie_;
    private int quantity_;
    private String name_ = "";
    private String unit_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FoodPlanProto$FoodDetail, Builder> implements FoodPlanProto$FoodDetailOrBuilder {
        public Builder clearCalorie() {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).clearCalorie();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).clearName();
            return this;
        }

        public Builder clearQuantity() {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).clearQuantity();
            return this;
        }

        public Builder clearUnit() {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).clearUnit();
            return this;
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
        public int getCalorie() {
            return ((FoodPlanProto$FoodDetail) this.instance).getCalorie();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
        public String getName() {
            return ((FoodPlanProto$FoodDetail) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
        public ByteString getNameBytes() {
            return ((FoodPlanProto$FoodDetail) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
        public int getQuantity() {
            return ((FoodPlanProto$FoodDetail) this.instance).getQuantity();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
        public String getUnit() {
            return ((FoodPlanProto$FoodDetail) this.instance).getUnit();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
        public ByteString getUnitBytes() {
            return ((FoodPlanProto$FoodDetail) this.instance).getUnitBytes();
        }

        public Builder setCalorie(int i) {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).setCalorie(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setQuantity(int i) {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).setQuantity(i);
            return this;
        }

        public Builder setUnit(String str) {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).setUnit(str);
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            copyOnWrite();
            ((FoodPlanProto$FoodDetail) this.instance).setUnitBytes(byteString);
            return this;
        }

        private Builder() {
            super(FoodPlanProto$FoodDetail.DEFAULT_INSTANCE);
        }
    }

    static {
        FoodPlanProto$FoodDetail foodPlanProto$FoodDetail = new FoodPlanProto$FoodDetail();
        DEFAULT_INSTANCE = foodPlanProto$FoodDetail;
        GeneratedMessageLite.registerDefaultInstance(FoodPlanProto$FoodDetail.class, foodPlanProto$FoodDetail);
    }

    private FoodPlanProto$FoodDetail() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalorie() {
        this.calorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuantity() {
        this.quantity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static FoodPlanProto$FoodDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FoodPlanProto$FoodDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FoodPlanProto$FoodDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FoodPlanProto$FoodDetail> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalorie(int i) {
        this.calorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuantity(int i) {
        this.quantity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.unit_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = qw7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FoodPlanProto$FoodDetail();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004\u000b", new Object[]{"name_", "quantity_", "unit_", "calorie_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FoodPlanProto$FoodDetail> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FoodPlanProto$FoodDetail.class) {
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

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
    public int getCalorie() {
        return this.calorie_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
    public int getQuantity() {
        return this.quantity_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
    public String getUnit() {
        return this.unit_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodDetailOrBuilder
    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8(this.unit_);
    }

    public static Builder newBuilder(FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
        return DEFAULT_INSTANCE.createBuilder(foodPlanProto$FoodDetail);
    }

    public static FoodPlanProto$FoodDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FoodPlanProto$FoodDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FoodPlanProto$FoodDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodDetail parseFrom(InputStream inputStream) throws IOException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FoodPlanProto$FoodDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FoodPlanProto$FoodDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FoodPlanProto$FoodDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
