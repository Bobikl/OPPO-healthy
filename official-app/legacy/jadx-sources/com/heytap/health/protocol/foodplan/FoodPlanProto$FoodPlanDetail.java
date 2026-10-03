package com.heytap.health.protocol.foodplan;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.qw7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FoodPlanProto$FoodPlanDetail extends GeneratedMessageLite<FoodPlanProto$FoodPlanDetail, Builder> implements FoodPlanProto$FoodPlanDetailOrBuilder {
    private static final FoodPlanProto$FoodPlanDetail DEFAULT_INSTANCE;
    public static final int FOODDETAIL_FIELD_NUMBER = 4;
    public static final int FOODTYPE_FIELD_NUMBER = 2;
    private static volatile Parser<FoodPlanProto$FoodPlanDetail> PARSER = null;
    public static final int PLANDATE_FIELD_NUMBER = 1;
    public static final int TARGETCALORIE_FIELD_NUMBER = 3;
    private int foodType_;
    private int targetCalorie_;
    private String planDate_ = "";
    private Internal.ProtobufList<FoodPlanProto$FoodDetail> foodDetail_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<FoodPlanProto$FoodPlanDetail, Builder> implements FoodPlanProto$FoodPlanDetailOrBuilder {
        public Builder addAllFoodDetail(Iterable<? extends FoodPlanProto$FoodDetail> iterable) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).addAllFoodDetail(iterable);
            return this;
        }

        public Builder addFoodDetail(FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).addFoodDetail(foodPlanProto$FoodDetail);
            return this;
        }

        public Builder clearFoodDetail() {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).clearFoodDetail();
            return this;
        }

        public Builder clearFoodType() {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).clearFoodType();
            return this;
        }

        public Builder clearPlanDate() {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).clearPlanDate();
            return this;
        }

        public Builder clearTargetCalorie() {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).clearTargetCalorie();
            return this;
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public FoodPlanProto$FoodDetail getFoodDetail(int i) {
            return ((FoodPlanProto$FoodPlanDetail) this.instance).getFoodDetail(i);
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public int getFoodDetailCount() {
            return ((FoodPlanProto$FoodPlanDetail) this.instance).getFoodDetailCount();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public List<FoodPlanProto$FoodDetail> getFoodDetailList() {
            return Collections.unmodifiableList(((FoodPlanProto$FoodPlanDetail) this.instance).getFoodDetailList());
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public int getFoodType() {
            return ((FoodPlanProto$FoodPlanDetail) this.instance).getFoodType();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public String getPlanDate() {
            return ((FoodPlanProto$FoodPlanDetail) this.instance).getPlanDate();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public ByteString getPlanDateBytes() {
            return ((FoodPlanProto$FoodPlanDetail) this.instance).getPlanDateBytes();
        }

        @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
        public int getTargetCalorie() {
            return ((FoodPlanProto$FoodPlanDetail) this.instance).getTargetCalorie();
        }

        public Builder removeFoodDetail(int i) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).removeFoodDetail(i);
            return this;
        }

        public Builder setFoodDetail(int i, FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).setFoodDetail(i, foodPlanProto$FoodDetail);
            return this;
        }

        public Builder setFoodType(int i) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).setFoodType(i);
            return this;
        }

        public Builder setPlanDate(String str) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).setPlanDate(str);
            return this;
        }

        public Builder setPlanDateBytes(ByteString byteString) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).setPlanDateBytes(byteString);
            return this;
        }

        public Builder setTargetCalorie(int i) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).setTargetCalorie(i);
            return this;
        }

        private Builder() {
            super(FoodPlanProto$FoodPlanDetail.DEFAULT_INSTANCE);
        }

        public Builder addFoodDetail(int i, FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).addFoodDetail(i, foodPlanProto$FoodDetail);
            return this;
        }

        public Builder setFoodDetail(int i, FoodPlanProto$FoodDetail.Builder builder) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).setFoodDetail(i, builder.build());
            return this;
        }

        public Builder addFoodDetail(FoodPlanProto$FoodDetail.Builder builder) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).addFoodDetail(builder.build());
            return this;
        }

        public Builder addFoodDetail(int i, FoodPlanProto$FoodDetail.Builder builder) {
            copyOnWrite();
            ((FoodPlanProto$FoodPlanDetail) this.instance).addFoodDetail(i, builder.build());
            return this;
        }
    }

    static {
        FoodPlanProto$FoodPlanDetail foodPlanProto$FoodPlanDetail = new FoodPlanProto$FoodPlanDetail();
        DEFAULT_INSTANCE = foodPlanProto$FoodPlanDetail;
        GeneratedMessageLite.registerDefaultInstance(FoodPlanProto$FoodPlanDetail.class, foodPlanProto$FoodPlanDetail);
    }

    private FoodPlanProto$FoodPlanDetail() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFoodDetail(Iterable<? extends FoodPlanProto$FoodDetail> iterable) {
        ensureFoodDetailIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.foodDetail_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFoodDetail(FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
        foodPlanProto$FoodDetail.getClass();
        ensureFoodDetailIsMutable();
        this.foodDetail_.add(foodPlanProto$FoodDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFoodDetail() {
        this.foodDetail_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFoodType() {
        this.foodType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanDate() {
        this.planDate_ = getDefaultInstance().getPlanDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetCalorie() {
        this.targetCalorie_ = 0;
    }

    private void ensureFoodDetailIsMutable() {
        Internal.ProtobufList<FoodPlanProto$FoodDetail> protobufList = this.foodDetail_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.foodDetail_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FoodPlanProto$FoodPlanDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FoodPlanProto$FoodPlanDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FoodPlanProto$FoodPlanDetail> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFoodDetail(int i) {
        ensureFoodDetailIsMutable();
        this.foodDetail_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFoodDetail(int i, FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
        foodPlanProto$FoodDetail.getClass();
        ensureFoodDetailIsMutable();
        this.foodDetail_.set(i, foodPlanProto$FoodDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFoodType(int i) {
        this.foodType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanDate(String str) {
        str.getClass();
        this.planDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanDateBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.planDate_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetCalorie(int i) {
        this.targetCalorie_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = qw7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FoodPlanProto$FoodPlanDetail();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u001b", new Object[]{"planDate_", "foodType_", "targetCalorie_", "foodDetail_", FoodPlanProto$FoodDetail.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FoodPlanProto$FoodPlanDetail> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FoodPlanProto$FoodPlanDetail.class) {
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

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public FoodPlanProto$FoodDetail getFoodDetail(int i) {
        return this.foodDetail_.get(i);
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public int getFoodDetailCount() {
        return this.foodDetail_.size();
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public List<FoodPlanProto$FoodDetail> getFoodDetailList() {
        return this.foodDetail_;
    }

    public FoodPlanProto$FoodDetailOrBuilder getFoodDetailOrBuilder(int i) {
        return this.foodDetail_.get(i);
    }

    public List<? extends FoodPlanProto$FoodDetailOrBuilder> getFoodDetailOrBuilderList() {
        return this.foodDetail_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public int getFoodType() {
        return this.foodType_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public String getPlanDate() {
        return this.planDate_;
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public ByteString getPlanDateBytes() {
        return ByteString.copyFromUtf8(this.planDate_);
    }

    @Override // com.heytap.health.protocol.foodplan.FoodPlanProto$FoodPlanDetailOrBuilder
    public int getTargetCalorie() {
        return this.targetCalorie_;
    }

    public static Builder newBuilder(FoodPlanProto$FoodPlanDetail foodPlanProto$FoodPlanDetail) {
        return DEFAULT_INSTANCE.createBuilder(foodPlanProto$FoodPlanDetail);
    }

    public static FoodPlanProto$FoodPlanDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFoodDetail(int i, FoodPlanProto$FoodDetail foodPlanProto$FoodDetail) {
        foodPlanProto$FoodDetail.getClass();
        ensureFoodDetailIsMutable();
        this.foodDetail_.add(i, foodPlanProto$FoodDetail);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(InputStream inputStream) throws IOException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FoodPlanProto$FoodPlanDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FoodPlanProto$FoodPlanDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
