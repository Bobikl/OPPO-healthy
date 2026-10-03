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
public final class RecommendProto$health_cell extends GeneratedMessageLite<RecommendProto$health_cell, Builder> implements RecommendProto$health_cellOrBuilder {
    public static final int C_DATA_FIELD_NUMBER = 5;
    private static final RecommendProto$health_cell DEFAULT_INSTANCE;
    public static final int HEALTH_DATA_FIELD_NUMBER = 4;
    public static final int HEALTH_ID_FIELD_NUMBER = 1;
    public static final int HEALTH_LEVEL_FIELD_NUMBER = 2;
    public static final int H_DATA_FIELD_NUMBER = 7;
    public static final int IS_NOR_FIELD_NUMBER = 3;
    public static final int M_DATA_FIELD_NUMBER = 8;
    private static volatile Parser<RecommendProto$health_cell> PARSER = null;
    public static final int S_DATA_FIELD_NUMBER = 6;
    private int healthId_;
    private int healthLevel_;
    private int isNor_;
    private int payloadCase_ = 0;
    private Object payload_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$health_cell, Builder> implements RecommendProto$health_cellOrBuilder {
        public Builder clearCData() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearCData();
            return this;
        }

        public Builder clearHData() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearHData();
            return this;
        }

        public Builder clearHealthData() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearHealthData();
            return this;
        }

        public Builder clearHealthId() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearHealthId();
            return this;
        }

        public Builder clearHealthLevel() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearHealthLevel();
            return this;
        }

        public Builder clearIsNor() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearIsNor();
            return this;
        }

        public Builder clearMData() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearMData();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearPayload();
            return this;
        }

        public Builder clearSData() {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).clearSData();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$composite_cell getCData() {
            return ((RecommendProto$health_cell) this.instance).getCData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$hrv_cell getHData() {
            return ((RecommendProto$health_cell) this.instance).getHData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public int getHealthData() {
            return ((RecommendProto$health_cell) this.instance).getHealthData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$HEALTH_STATUS_ID getHealthId() {
            return ((RecommendProto$health_cell) this.instance).getHealthId();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public int getHealthIdValue() {
            return ((RecommendProto$health_cell) this.instance).getHealthIdValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$HEALTH_CELL_STATUS getHealthLevel() {
            return ((RecommendProto$health_cell) this.instance).getHealthLevel();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public int getHealthLevelValue() {
            return ((RecommendProto$health_cell) this.instance).getHealthLevelValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$NORMAL_STATUS getIsNor() {
            return ((RecommendProto$health_cell) this.instance).getIsNor();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public int getIsNorValue() {
            return ((RecommendProto$health_cell) this.instance).getIsNorValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$menstrual_cell getMData() {
            return ((RecommendProto$health_cell) this.instance).getMData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public PayloadCase getPayloadCase() {
            return ((RecommendProto$health_cell) this.instance).getPayloadCase();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public RecommendProto$sleep_cell getSData() {
            return ((RecommendProto$health_cell) this.instance).getSData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public boolean hasCData() {
            return ((RecommendProto$health_cell) this.instance).hasCData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public boolean hasHData() {
            return ((RecommendProto$health_cell) this.instance).hasHData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public boolean hasHealthData() {
            return ((RecommendProto$health_cell) this.instance).hasHealthData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public boolean hasMData() {
            return ((RecommendProto$health_cell) this.instance).hasMData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
        public boolean hasSData() {
            return ((RecommendProto$health_cell) this.instance).hasSData();
        }

        public Builder mergeCData(RecommendProto$composite_cell recommendProto$composite_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).mergeCData(recommendProto$composite_cell);
            return this;
        }

        public Builder mergeHData(RecommendProto$hrv_cell recommendProto$hrv_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).mergeHData(recommendProto$hrv_cell);
            return this;
        }

        public Builder mergeMData(RecommendProto$menstrual_cell recommendProto$menstrual_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).mergeMData(recommendProto$menstrual_cell);
            return this;
        }

        public Builder mergeSData(RecommendProto$sleep_cell recommendProto$sleep_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).mergeSData(recommendProto$sleep_cell);
            return this;
        }

        public Builder setCData(RecommendProto$composite_cell recommendProto$composite_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setCData(recommendProto$composite_cell);
            return this;
        }

        public Builder setHData(RecommendProto$hrv_cell recommendProto$hrv_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHData(recommendProto$hrv_cell);
            return this;
        }

        public Builder setHealthData(int i) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHealthData(i);
            return this;
        }

        public Builder setHealthId(RecommendProto$HEALTH_STATUS_ID recommendProto$HEALTH_STATUS_ID) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHealthId(recommendProto$HEALTH_STATUS_ID);
            return this;
        }

        public Builder setHealthIdValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHealthIdValue(i);
            return this;
        }

        public Builder setHealthLevel(RecommendProto$HEALTH_CELL_STATUS recommendProto$HEALTH_CELL_STATUS) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHealthLevel(recommendProto$HEALTH_CELL_STATUS);
            return this;
        }

        public Builder setHealthLevelValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHealthLevelValue(i);
            return this;
        }

        public Builder setIsNor(RecommendProto$NORMAL_STATUS recommendProto$NORMAL_STATUS) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setIsNor(recommendProto$NORMAL_STATUS);
            return this;
        }

        public Builder setIsNorValue(int i) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setIsNorValue(i);
            return this;
        }

        public Builder setMData(RecommendProto$menstrual_cell recommendProto$menstrual_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setMData(recommendProto$menstrual_cell);
            return this;
        }

        public Builder setSData(RecommendProto$sleep_cell recommendProto$sleep_cell) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setSData(recommendProto$sleep_cell);
            return this;
        }

        private Builder() {
            super(RecommendProto$health_cell.DEFAULT_INSTANCE);
        }

        public Builder setCData(RecommendProto$composite_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setCData(builder.build());
            return this;
        }

        public Builder setHData(RecommendProto$hrv_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setHData(builder.build());
            return this;
        }

        public Builder setMData(RecommendProto$menstrual_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setMData(builder.build());
            return this;
        }

        public Builder setSData(RecommendProto$sleep_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$health_cell) this.instance).setSData(builder.build());
            return this;
        }
    }

    public enum PayloadCase {
        HEALTH_DATA(4),
        C_DATA(5),
        S_DATA(6),
        H_DATA(7),
        M_DATA(8),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i) {
            this.value = i;
        }

        public static PayloadCase forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            switch (i) {
                case 4:
                    return HEALTH_DATA;
                case 5:
                    return C_DATA;
                case 6:
                    return S_DATA;
                case 7:
                    return H_DATA;
                case 8:
                    return M_DATA;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        RecommendProto$health_cell recommendProto$health_cell = new RecommendProto$health_cell();
        DEFAULT_INSTANCE = recommendProto$health_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$health_cell.class, recommendProto$health_cell);
    }

    private RecommendProto$health_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCData() {
        if (this.payloadCase_ == 5) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHData() {
        if (this.payloadCase_ == 7) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHealthData() {
        if (this.payloadCase_ == 4) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
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
    public void clearIsNor() {
        this.isNor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMData() {
        if (this.payloadCase_ == 8) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSData() {
        if (this.payloadCase_ == 6) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    public static RecommendProto$health_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCData(RecommendProto$composite_cell recommendProto$composite_cell) {
        recommendProto$composite_cell.getClass();
        if (this.payloadCase_ != 5 || this.payload_ == RecommendProto$composite_cell.getDefaultInstance()) {
            this.payload_ = recommendProto$composite_cell;
        } else {
            this.payload_ = RecommendProto$composite_cell.newBuilder((RecommendProto$composite_cell) this.payload_).mergeFrom(recommendProto$composite_cell).buildPartial();
        }
        this.payloadCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHData(RecommendProto$hrv_cell recommendProto$hrv_cell) {
        recommendProto$hrv_cell.getClass();
        if (this.payloadCase_ != 7 || this.payload_ == RecommendProto$hrv_cell.getDefaultInstance()) {
            this.payload_ = recommendProto$hrv_cell;
        } else {
            this.payload_ = RecommendProto$hrv_cell.newBuilder((RecommendProto$hrv_cell) this.payload_).mergeFrom(recommendProto$hrv_cell).buildPartial();
        }
        this.payloadCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMData(RecommendProto$menstrual_cell recommendProto$menstrual_cell) {
        recommendProto$menstrual_cell.getClass();
        if (this.payloadCase_ != 8 || this.payload_ == RecommendProto$menstrual_cell.getDefaultInstance()) {
            this.payload_ = recommendProto$menstrual_cell;
        } else {
            this.payload_ = RecommendProto$menstrual_cell.newBuilder((RecommendProto$menstrual_cell) this.payload_).mergeFrom(recommendProto$menstrual_cell).buildPartial();
        }
        this.payloadCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSData(RecommendProto$sleep_cell recommendProto$sleep_cell) {
        recommendProto$sleep_cell.getClass();
        if (this.payloadCase_ != 6 || this.payload_ == RecommendProto$sleep_cell.getDefaultInstance()) {
            this.payload_ = recommendProto$sleep_cell;
        } else {
            this.payload_ = RecommendProto$sleep_cell.newBuilder((RecommendProto$sleep_cell) this.payload_).mergeFrom(recommendProto$sleep_cell).buildPartial();
        }
        this.payloadCase_ = 6;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$health_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$health_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$health_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCData(RecommendProto$composite_cell recommendProto$composite_cell) {
        recommendProto$composite_cell.getClass();
        this.payload_ = recommendProto$composite_cell;
        this.payloadCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHData(RecommendProto$hrv_cell recommendProto$hrv_cell) {
        recommendProto$hrv_cell.getClass();
        this.payload_ = recommendProto$hrv_cell;
        this.payloadCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthData(int i) {
        this.payloadCase_ = 4;
        this.payload_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHealthId(RecommendProto$HEALTH_STATUS_ID recommendProto$HEALTH_STATUS_ID) {
        this.healthId_ = recommendProto$HEALTH_STATUS_ID.getNumber();
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
    public void setIsNor(RecommendProto$NORMAL_STATUS recommendProto$NORMAL_STATUS) {
        this.isNor_ = recommendProto$NORMAL_STATUS.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNorValue(int i) {
        this.isNor_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMData(RecommendProto$menstrual_cell recommendProto$menstrual_cell) {
        recommendProto$menstrual_cell.getClass();
        this.payload_ = recommendProto$menstrual_cell;
        this.payloadCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSData(RecommendProto$sleep_cell recommendProto$sleep_cell) {
        recommendProto$sleep_cell.getClass();
        this.payload_ = recommendProto$sleep_cell;
        this.payloadCase_ = 6;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$health_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u00047\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"payload_", "payloadCase_", "healthId_", "healthLevel_", "isNor_", RecommendProto$composite_cell.class, RecommendProto$sleep_cell.class, RecommendProto$hrv_cell.class, RecommendProto$menstrual_cell.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$health_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$health_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$composite_cell getCData() {
        return this.payloadCase_ == 5 ? (RecommendProto$composite_cell) this.payload_ : RecommendProto$composite_cell.getDefaultInstance();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$hrv_cell getHData() {
        return this.payloadCase_ == 7 ? (RecommendProto$hrv_cell) this.payload_ : RecommendProto$hrv_cell.getDefaultInstance();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public int getHealthData() {
        if (this.payloadCase_ == 4) {
            return ((Integer) this.payload_).intValue();
        }
        return 0;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$HEALTH_STATUS_ID getHealthId() {
        RecommendProto$HEALTH_STATUS_ID recommendProto$HEALTH_STATUS_IDForNumber = RecommendProto$HEALTH_STATUS_ID.forNumber(this.healthId_);
        return recommendProto$HEALTH_STATUS_IDForNumber == null ? RecommendProto$HEALTH_STATUS_ID.UNRECOGNIZED : recommendProto$HEALTH_STATUS_IDForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public int getHealthIdValue() {
        return this.healthId_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$HEALTH_CELL_STATUS getHealthLevel() {
        RecommendProto$HEALTH_CELL_STATUS recommendProto$HEALTH_CELL_STATUSForNumber = RecommendProto$HEALTH_CELL_STATUS.forNumber(this.healthLevel_);
        return recommendProto$HEALTH_CELL_STATUSForNumber == null ? RecommendProto$HEALTH_CELL_STATUS.UNRECOGNIZED : recommendProto$HEALTH_CELL_STATUSForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public int getHealthLevelValue() {
        return this.healthLevel_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$NORMAL_STATUS getIsNor() {
        RecommendProto$NORMAL_STATUS recommendProto$NORMAL_STATUSForNumber = RecommendProto$NORMAL_STATUS.forNumber(this.isNor_);
        return recommendProto$NORMAL_STATUSForNumber == null ? RecommendProto$NORMAL_STATUS.UNRECOGNIZED : recommendProto$NORMAL_STATUSForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public int getIsNorValue() {
        return this.isNor_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$menstrual_cell getMData() {
        return this.payloadCase_ == 8 ? (RecommendProto$menstrual_cell) this.payload_ : RecommendProto$menstrual_cell.getDefaultInstance();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public RecommendProto$sleep_cell getSData() {
        return this.payloadCase_ == 6 ? (RecommendProto$sleep_cell) this.payload_ : RecommendProto$sleep_cell.getDefaultInstance();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public boolean hasCData() {
        return this.payloadCase_ == 5;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public boolean hasHData() {
        return this.payloadCase_ == 7;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public boolean hasHealthData() {
        return this.payloadCase_ == 4;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public boolean hasMData() {
        return this.payloadCase_ == 8;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$health_cellOrBuilder
    public boolean hasSData() {
        return this.payloadCase_ == 6;
    }

    public static Builder newBuilder(RecommendProto$health_cell recommendProto$health_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$health_cell);
    }

    public static RecommendProto$health_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$health_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$health_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$health_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$health_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$health_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$health_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$health_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$health_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$health_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$health_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
