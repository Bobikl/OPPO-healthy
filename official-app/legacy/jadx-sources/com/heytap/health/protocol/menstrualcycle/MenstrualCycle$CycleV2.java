package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$CycleV2 extends GeneratedMessageLite<MenstrualCycle$CycleV2, Builder> implements MenstrualCycle$CycleV2OrBuilder {
    public static final int CYCLEENDDATE_FIELD_NUMBER = 2;
    public static final int CYCLEPERIOD_FIELD_NUMBER = 3;
    public static final int CYCLESTARTDATE_FIELD_NUMBER = 1;
    private static final MenstrualCycle$CycleV2 DEFAULT_INSTANCE;
    public static final int OVULATION_FIELD_NUMBER = 4;
    private static volatile Parser<MenstrualCycle$CycleV2> PARSER;
    private int bitField0_;
    private int cycleEndDate_;
    private Internal.ProtobufList<MenstrualCycle$PeriodV2> cyclePeriod_ = GeneratedMessageLite.emptyProtobufList();
    private int cycleStartDate_;
    private MenstrualCycle$OvulationDataV2 ovulation_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$CycleV2, Builder> implements MenstrualCycle$CycleV2OrBuilder {
        public Builder addAllCyclePeriod(Iterable<? extends MenstrualCycle$PeriodV2> iterable) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).addAllCyclePeriod(iterable);
            return this;
        }

        public Builder addCyclePeriod(MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).addCyclePeriod(menstrualCycle$PeriodV2);
            return this;
        }

        public Builder clearCycleEndDate() {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).clearCycleEndDate();
            return this;
        }

        public Builder clearCyclePeriod() {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).clearCyclePeriod();
            return this;
        }

        public Builder clearCycleStartDate() {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).clearCycleStartDate();
            return this;
        }

        public Builder clearOvulation() {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).clearOvulation();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public int getCycleEndDate() {
            return ((MenstrualCycle$CycleV2) this.instance).getCycleEndDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public MenstrualCycle$PeriodV2 getCyclePeriod(int i) {
            return ((MenstrualCycle$CycleV2) this.instance).getCyclePeriod(i);
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public int getCyclePeriodCount() {
            return ((MenstrualCycle$CycleV2) this.instance).getCyclePeriodCount();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public List<MenstrualCycle$PeriodV2> getCyclePeriodList() {
            return Collections.unmodifiableList(((MenstrualCycle$CycleV2) this.instance).getCyclePeriodList());
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public int getCycleStartDate() {
            return ((MenstrualCycle$CycleV2) this.instance).getCycleStartDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public MenstrualCycle$OvulationDataV2 getOvulation() {
            return ((MenstrualCycle$CycleV2) this.instance).getOvulation();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
        public boolean hasOvulation() {
            return ((MenstrualCycle$CycleV2) this.instance).hasOvulation();
        }

        public Builder mergeOvulation(MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).mergeOvulation(menstrualCycle$OvulationDataV2);
            return this;
        }

        public Builder removeCyclePeriod(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).removeCyclePeriod(i);
            return this;
        }

        public Builder setCycleEndDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).setCycleEndDate(i);
            return this;
        }

        public Builder setCyclePeriod(int i, MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).setCyclePeriod(i, menstrualCycle$PeriodV2);
            return this;
        }

        public Builder setCycleStartDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).setCycleStartDate(i);
            return this;
        }

        public Builder setOvulation(MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).setOvulation(menstrualCycle$OvulationDataV2);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$CycleV2.DEFAULT_INSTANCE);
        }

        public Builder addCyclePeriod(int i, MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).addCyclePeriod(i, menstrualCycle$PeriodV2);
            return this;
        }

        public Builder setCyclePeriod(int i, MenstrualCycle$PeriodV2.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).setCyclePeriod(i, builder.build());
            return this;
        }

        public Builder setOvulation(MenstrualCycle$OvulationDataV2.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).setOvulation(builder.build());
            return this;
        }

        public Builder addCyclePeriod(MenstrualCycle$PeriodV2.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).addCyclePeriod(builder.build());
            return this;
        }

        public Builder addCyclePeriod(int i, MenstrualCycle$PeriodV2.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$CycleV2) this.instance).addCyclePeriod(i, builder.build());
            return this;
        }
    }

    static {
        MenstrualCycle$CycleV2 menstrualCycle$CycleV2 = new MenstrualCycle$CycleV2();
        DEFAULT_INSTANCE = menstrualCycle$CycleV2;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$CycleV2.class, menstrualCycle$CycleV2);
    }

    private MenstrualCycle$CycleV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCyclePeriod(Iterable<? extends MenstrualCycle$PeriodV2> iterable) {
        ensureCyclePeriodIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cyclePeriod_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCyclePeriod(MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
        menstrualCycle$PeriodV2.getClass();
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.add(menstrualCycle$PeriodV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleEndDate() {
        this.cycleEndDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCyclePeriod() {
        this.cyclePeriod_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleStartDate() {
        this.cycleStartDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulation() {
        this.ovulation_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureCyclePeriodIsMutable() {
        Internal.ProtobufList<MenstrualCycle$PeriodV2> protobufList = this.cyclePeriod_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cyclePeriod_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MenstrualCycle$CycleV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOvulation(MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2) {
        menstrualCycle$OvulationDataV2.getClass();
        MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV3 = this.ovulation_;
        if (menstrualCycle$OvulationDataV3 == null || menstrualCycle$OvulationDataV3 == MenstrualCycle$OvulationDataV2.getDefaultInstance()) {
            this.ovulation_ = menstrualCycle$OvulationDataV2;
        } else {
            this.ovulation_ = MenstrualCycle$OvulationDataV2.newBuilder(this.ovulation_).mergeFrom(menstrualCycle$OvulationDataV2).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$CycleV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$CycleV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$CycleV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCyclePeriod(int i) {
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleEndDate(int i) {
        this.cycleEndDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCyclePeriod(int i, MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
        menstrualCycle$PeriodV2.getClass();
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.set(i, menstrualCycle$PeriodV2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleStartDate(int i) {
        this.cycleStartDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulation(MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2) {
        menstrualCycle$OvulationDataV2.getClass();
        this.ovulation_ = menstrualCycle$OvulationDataV2;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$CycleV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u001b\u0004ဉ\u0000", new Object[]{"bitField0_", "cycleStartDate_", "cycleEndDate_", "cyclePeriod_", MenstrualCycle$PeriodV2.class, "ovulation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$CycleV2> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$CycleV2.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public int getCycleEndDate() {
        return this.cycleEndDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public MenstrualCycle$PeriodV2 getCyclePeriod(int i) {
        return this.cyclePeriod_.get(i);
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public int getCyclePeriodCount() {
        return this.cyclePeriod_.size();
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public List<MenstrualCycle$PeriodV2> getCyclePeriodList() {
        return this.cyclePeriod_;
    }

    public MenstrualCycle$PeriodV2OrBuilder getCyclePeriodOrBuilder(int i) {
        return this.cyclePeriod_.get(i);
    }

    public List<? extends MenstrualCycle$PeriodV2OrBuilder> getCyclePeriodOrBuilderList() {
        return this.cyclePeriod_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public int getCycleStartDate() {
        return this.cycleStartDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public MenstrualCycle$OvulationDataV2 getOvulation() {
        MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2 = this.ovulation_;
        return menstrualCycle$OvulationDataV2 == null ? MenstrualCycle$OvulationDataV2.getDefaultInstance() : menstrualCycle$OvulationDataV2;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleV2OrBuilder
    public boolean hasOvulation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(MenstrualCycle$CycleV2 menstrualCycle$CycleV2) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$CycleV2);
    }

    public static MenstrualCycle$CycleV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCyclePeriod(int i, MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
        menstrualCycle$PeriodV2.getClass();
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.add(i, menstrualCycle$PeriodV2);
    }

    public static MenstrualCycle$CycleV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$CycleV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleV2 parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$CycleV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$CycleV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
