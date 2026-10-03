package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$health_single_cell extends GeneratedMessageLite<RecommendProto$health_single_cell, Builder> implements RecommendProto$health_single_cellOrBuilder {
    public static final int BLOOD_PRE_DATA_FIELD_NUMBER = 5;
    private static final RecommendProto$health_single_cell DEFAULT_INSTANCE;
    public static final int HEALTH_ID_FIELD_NUMBER = 1;
    public static final int HEALTH_LEVEL_FIELD_NUMBER = 3;
    public static final int HEALTH_VALUE_FIELD_NUMBER = 4;
    public static final int IS_NOR_FIELD_NUMBER = 2;
    private static volatile Parser<RecommendProto$health_single_cell> PARSER;
    private int bitField0_;
    private RecommendProto$blood_pressure_data bloodPreData_;
    private int healthId_;
    private int healthLevel_;
    private int healthValue_;
    private int isNor_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$health_single_cell, Builder> implements RecommendProto$health_single_cellOrBuilder {
        public Builder clearBloodPreData() {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).clearBloodPreData();
            return this;
        }

        public Builder clearHealthId() {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).clearHealthId();
            return this;
        }

        public Builder clearHealthLevel() {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).clearHealthLevel();
            return this;
        }

        public Builder clearHealthValue() {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).clearHealthValue();
            return this;
        }

        public Builder clearIsNor() {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).clearIsNor();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public RecommendProto$blood_pressure_data getBloodPreData() {
            return ((RecommendProto$health_single_cell) this.instance).getBloodPreData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public RecommendProto$BASE_CELL_ID getHealthId() {
            return ((RecommendProto$health_single_cell) this.instance).getHealthId();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public int getHealthIdValue() {
            return ((RecommendProto$health_single_cell) this.instance).getHealthIdValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public RecommendProto$HEALTH_CELL_STATUS getHealthLevel() {
            return ((RecommendProto$health_single_cell) this.instance).getHealthLevel();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public int getHealthLevelValue() {
            return ((RecommendProto$health_single_cell) this.instance).getHealthLevelValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public int getHealthValue() {
            return ((RecommendProto$health_single_cell) this.instance).getHealthValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public RecommendProto$NORMAL_STATUS getIsNor() {
            return ((RecommendProto$health_single_cell) this.instance).getIsNor();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public int getIsNorValue() {
            return ((RecommendProto$health_single_cell) this.instance).getIsNorValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
        public boolean hasBloodPreData() {
            return ((RecommendProto$health_single_cell) this.instance).hasBloodPreData();
        }

        public Builder mergeBloodPreData(RecommendProto$blood_pressure_data recommendProto$blood_pressure_data) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).mergeBloodPreData(recommendProto$blood_pressure_data);
            return this;
        }

        public Builder setBloodPreData(RecommendProto$blood_pressure_data recommendProto$blood_pressure_data) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setBloodPreData(recommendProto$blood_pressure_data);
            return this;
        }

        public Builder setHealthId(RecommendProto$BASE_CELL_ID recommendProto$BASE_CELL_ID) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setHealthId(recommendProto$BASE_CELL_ID);
            return this;
        }

        public Builder setHealthIdValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setHealthIdValue(i);
            return this;
        }

        public Builder setHealthLevel(RecommendProto$HEALTH_CELL_STATUS recommendProto$HEALTH_CELL_STATUS) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setHealthLevel(recommendProto$HEALTH_CELL_STATUS);
            return this;
        }

        public Builder setHealthLevelValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setHealthLevelValue(i);
            return this;
        }

        public Builder setHealthValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setHealthValue(i);
            return this;
        }

        public Builder setIsNor(RecommendProto$NORMAL_STATUS recommendProto$NORMAL_STATUS) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setIsNor(recommendProto$NORMAL_STATUS);
            return this;
        }

        public Builder setIsNorValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setIsNorValue(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$health_single_cell.DEFAULT_INSTANCE);
        }

        public Builder setBloodPreData(RecommendProto$blood_pressure_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$health_single_cell) this.instance).setBloodPreData(builder.build());
            return this;
        }
    }

    static {
        RecommendProto$health_single_cell recommendProto$health_single_cell = new RecommendProto$health_single_cell();
        DEFAULT_INSTANCE = recommendProto$health_single_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$health_single_cell.class, recommendProto$health_single_cell);
    }

    private RecommendProto$health_single_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBloodPreData() {
        this.bloodPreData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthId() {
        this.healthId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthLevel() {
        this.healthLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthValue() {
        this.healthValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNor() {
        this.isNor_ = 0;
    }

    public static RecommendProto$health_single_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBloodPreData(RecommendProto$blood_pressure_data recommendProto$blood_pressure_data) {
        recommendProto$blood_pressure_data.getClass();
        RecommendProto$blood_pressure_data recommendProto$blood_pressure_data2 = this.bloodPreData_;
        if (recommendProto$blood_pressure_data2 == null || recommendProto$blood_pressure_data2 == RecommendProto$blood_pressure_data.getDefaultInstance()) {
            this.bloodPreData_ = recommendProto$blood_pressure_data;
        } else {
            this.bloodPreData_ = RecommendProto$blood_pressure_data.newBuilder(this.bloodPreData_).mergeFrom(recommendProto$blood_pressure_data).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$health_single_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$health_single_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$health_single_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBloodPreData(RecommendProto$blood_pressure_data recommendProto$blood_pressure_data) {
        recommendProto$blood_pressure_data.getClass();
        this.bloodPreData_ = recommendProto$blood_pressure_data;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthId(RecommendProto$BASE_CELL_ID recommendProto$BASE_CELL_ID) {
        this.healthId_ = recommendProto$BASE_CELL_ID.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthIdValue(int i) {
        this.healthId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthLevel(RecommendProto$HEALTH_CELL_STATUS recommendProto$HEALTH_CELL_STATUS) {
        this.healthLevel_ = recommendProto$HEALTH_CELL_STATUS.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthLevelValue(int i) {
        this.healthLevel_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthValue(int i) {
        this.healthValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNor(RecommendProto$NORMAL_STATUS recommendProto$NORMAL_STATUS) {
        this.isNor_ = recommendProto$NORMAL_STATUS.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNorValue(int i) {
        this.isNor_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$health_single_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004\u0004\u0005ဉ\u0000", new Object[]{"bitField0_", "healthId_", "isNor_", "healthLevel_", "healthValue_", "bloodPreData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$health_single_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$health_single_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public RecommendProto$blood_pressure_data getBloodPreData() {
        RecommendProto$blood_pressure_data recommendProto$blood_pressure_data = this.bloodPreData_;
        return recommendProto$blood_pressure_data == null ? RecommendProto$blood_pressure_data.getDefaultInstance() : recommendProto$blood_pressure_data;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public RecommendProto$BASE_CELL_ID getHealthId() {
        RecommendProto$BASE_CELL_ID recommendProto$BASE_CELL_IDForNumber = RecommendProto$BASE_CELL_ID.forNumber(this.healthId_);
        return recommendProto$BASE_CELL_IDForNumber == null ? RecommendProto$BASE_CELL_ID.UNRECOGNIZED : recommendProto$BASE_CELL_IDForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public int getHealthIdValue() {
        return this.healthId_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public RecommendProto$HEALTH_CELL_STATUS getHealthLevel() {
        RecommendProto$HEALTH_CELL_STATUS recommendProto$HEALTH_CELL_STATUSForNumber = RecommendProto$HEALTH_CELL_STATUS.forNumber(this.healthLevel_);
        return recommendProto$HEALTH_CELL_STATUSForNumber == null ? RecommendProto$HEALTH_CELL_STATUS.UNRECOGNIZED : recommendProto$HEALTH_CELL_STATUSForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public int getHealthLevelValue() {
        return this.healthLevel_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public int getHealthValue() {
        return this.healthValue_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public RecommendProto$NORMAL_STATUS getIsNor() {
        RecommendProto$NORMAL_STATUS recommendProto$NORMAL_STATUSForNumber = RecommendProto$NORMAL_STATUS.forNumber(this.isNor_);
        return recommendProto$NORMAL_STATUSForNumber == null ? RecommendProto$NORMAL_STATUS.UNRECOGNIZED : recommendProto$NORMAL_STATUSForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public int getIsNorValue() {
        return this.isNor_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_single_cellOrBuilder
    public boolean hasBloodPreData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RecommendProto$health_single_cell recommendProto$health_single_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$health_single_cell);
    }

    public static RecommendProto$health_single_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$health_single_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$health_single_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$health_single_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$health_single_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$health_single_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$health_single_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$health_single_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$health_single_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$health_single_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_single_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
