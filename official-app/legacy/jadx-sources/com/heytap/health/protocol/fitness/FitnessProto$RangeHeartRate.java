package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$RangeHeartRate extends GeneratedMessageLite<FitnessProto$RangeHeartRate, Builder> implements FitnessProto$RangeHeartRateOrBuilder {
    private static final FitnessProto$RangeHeartRate DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$RangeHeartRate> PARSER = null;
    public static final int SWITCHTYPE_FIELD_NUMBER = 1;
    public static final int ZONESDATA_FIELD_NUMBER = 3;
    public static final int ZONESTYPE_FIELD_NUMBER = 2;
    private int switchType_;
    private Internal.ProtobufList<FitnessProto$HeartRateZone> zonesData_ = GeneratedMessageLite.emptyProtobufList();
    private int zonesType_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$RangeHeartRate, Builder> implements FitnessProto$RangeHeartRateOrBuilder {
        private Builder() {
            super(FitnessProto$RangeHeartRate.DEFAULT_INSTANCE);
        }

        public Builder addAllZonesData(Iterable<? extends FitnessProto$HeartRateZone> iterable) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).addAllZonesData(iterable);
            return this;
        }

        public Builder addZonesData(int i, FitnessProto$HeartRateZone.Builder builder) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).addZonesData(i, builder.build());
            return this;
        }

        public Builder clearSwitchType() {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).clearSwitchType();
            return this;
        }

        public Builder clearZonesData() {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).clearZonesData();
            return this;
        }

        public Builder clearZonesType() {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).clearZonesType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public FitnessProto$TARGET_RANGE_SWITCH getSwitchType() {
            return ((FitnessProto$RangeHeartRate) this.instance).getSwitchType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public int getSwitchTypeValue() {
            return ((FitnessProto$RangeHeartRate) this.instance).getSwitchTypeValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public FitnessProto$HeartRateZone getZonesData(int i) {
            return ((FitnessProto$RangeHeartRate) this.instance).getZonesData(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public int getZonesDataCount() {
            return ((FitnessProto$RangeHeartRate) this.instance).getZonesDataCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public List<FitnessProto$HeartRateZone> getZonesDataList() {
            return Collections.unmodifiableList(((FitnessProto$RangeHeartRate) this.instance).getZonesDataList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public FitnessProto$HR_ZONES_TYPE getZonesType() {
            return ((FitnessProto$RangeHeartRate) this.instance).getZonesType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
        public int getZonesTypeValue() {
            return ((FitnessProto$RangeHeartRate) this.instance).getZonesTypeValue();
        }

        public Builder removeZonesData(int i) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).removeZonesData(i);
            return this;
        }

        public Builder setSwitchType(FitnessProto$TARGET_RANGE_SWITCH fitnessProto$TARGET_RANGE_SWITCH) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).setSwitchType(fitnessProto$TARGET_RANGE_SWITCH);
            return this;
        }

        public Builder setSwitchTypeValue(int i) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).setSwitchTypeValue(i);
            return this;
        }

        public Builder setZonesData(int i, FitnessProto$HeartRateZone.Builder builder) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).setZonesData(i, builder.build());
            return this;
        }

        public Builder setZonesType(FitnessProto$HR_ZONES_TYPE fitnessProto$HR_ZONES_TYPE) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).setZonesType(fitnessProto$HR_ZONES_TYPE);
            return this;
        }

        public Builder setZonesTypeValue(int i) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).setZonesTypeValue(i);
            return this;
        }

        public Builder addZonesData(int i, FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).addZonesData(i, fitnessProto$HeartRateZone);
            return this;
        }

        public Builder setZonesData(int i, FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).setZonesData(i, fitnessProto$HeartRateZone);
            return this;
        }

        public Builder addZonesData(FitnessProto$HeartRateZone.Builder builder) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).addZonesData(builder.build());
            return this;
        }

        public Builder addZonesData(FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
            copyOnWrite();
            ((FitnessProto$RangeHeartRate) this.instance).addZonesData(fitnessProto$HeartRateZone);
            return this;
        }
    }

    static {
        FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate = new FitnessProto$RangeHeartRate();
        DEFAULT_INSTANCE = fitnessProto$RangeHeartRate;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$RangeHeartRate.class, fitnessProto$RangeHeartRate);
    }

    private FitnessProto$RangeHeartRate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllZonesData(Iterable<? extends FitnessProto$HeartRateZone> iterable) {
        ensureZonesDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.zonesData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addZonesData(int i, FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
        fitnessProto$HeartRateZone.getClass();
        ensureZonesDataIsMutable();
        this.zonesData_.add(i, fitnessProto$HeartRateZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchType() {
        this.switchType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZonesData() {
        this.zonesData_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZonesType() {
        this.zonesType_ = 0;
    }

    private void ensureZonesDataIsMutable() {
        Internal.ProtobufList<FitnessProto$HeartRateZone> protobufList = this.zonesData_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.zonesData_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProto$RangeHeartRate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$RangeHeartRate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RangeHeartRate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$RangeHeartRate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeZonesData(int i) {
        ensureZonesDataIsMutable();
        this.zonesData_.remove(i);
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
    public void setZonesData(int i, FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
        fitnessProto$HeartRateZone.getClass();
        ensureZonesDataIsMutable();
        this.zonesData_.set(i, fitnessProto$HeartRateZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZonesType(FitnessProto$HR_ZONES_TYPE fitnessProto$HR_ZONES_TYPE) {
        this.zonesType_ = fitnessProto$HR_ZONES_TYPE.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZonesTypeValue(int i) {
        this.zonesType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$RangeHeartRate();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u001b", new Object[]{"switchType_", "zonesType_", "zonesData_", FitnessProto$HeartRateZone.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$RangeHeartRate> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$RangeHeartRate.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public FitnessProto$TARGET_RANGE_SWITCH getSwitchType() {
        FitnessProto$TARGET_RANGE_SWITCH fitnessProto$TARGET_RANGE_SWITCHForNumber = FitnessProto$TARGET_RANGE_SWITCH.forNumber(this.switchType_);
        return fitnessProto$TARGET_RANGE_SWITCHForNumber == null ? FitnessProto$TARGET_RANGE_SWITCH.UNRECOGNIZED : fitnessProto$TARGET_RANGE_SWITCHForNumber;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public int getSwitchTypeValue() {
        return this.switchType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public FitnessProto$HeartRateZone getZonesData(int i) {
        return this.zonesData_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public int getZonesDataCount() {
        return this.zonesData_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public List<FitnessProto$HeartRateZone> getZonesDataList() {
        return this.zonesData_;
    }

    public FitnessProto$HeartRateZoneOrBuilder getZonesDataOrBuilder(int i) {
        return this.zonesData_.get(i);
    }

    public List<? extends FitnessProto$HeartRateZoneOrBuilder> getZonesDataOrBuilderList() {
        return this.zonesData_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public FitnessProto$HR_ZONES_TYPE getZonesType() {
        FitnessProto$HR_ZONES_TYPE fitnessProto$HR_ZONES_TYPEForNumber = FitnessProto$HR_ZONES_TYPE.forNumber(this.zonesType_);
        return fitnessProto$HR_ZONES_TYPEForNumber == null ? FitnessProto$HR_ZONES_TYPE.UNRECOGNIZED : fitnessProto$HR_ZONES_TYPEForNumber;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RangeHeartRateOrBuilder
    public int getZonesTypeValue() {
        return this.zonesType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addZonesData(FitnessProto$HeartRateZone fitnessProto$HeartRateZone) {
        fitnessProto$HeartRateZone.getClass();
        ensureZonesDataIsMutable();
        this.zonesData_.add(fitnessProto$HeartRateZone);
    }

    public static Builder newBuilder(FitnessProto$RangeHeartRate fitnessProto$RangeHeartRate) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$RangeHeartRate);
    }

    public static FitnessProto$RangeHeartRate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RangeHeartRate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$RangeHeartRate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$RangeHeartRate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$RangeHeartRate parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RangeHeartRate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RangeHeartRate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$RangeHeartRate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$RangeHeartRate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$RangeHeartRate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RangeHeartRate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
