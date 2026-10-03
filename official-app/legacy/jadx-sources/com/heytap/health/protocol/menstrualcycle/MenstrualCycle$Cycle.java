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
public final class MenstrualCycle$Cycle extends GeneratedMessageLite<MenstrualCycle$Cycle, Builder> implements MenstrualCycle$CycleOrBuilder {
    public static final int CYCLEDURATIONDAYS_FIELD_NUMBER = 2;
    public static final int CYCLEPERIOD_FIELD_NUMBER = 3;
    public static final int CYCLESTARTDATE_FIELD_NUMBER = 1;
    private static final MenstrualCycle$Cycle DEFAULT_INSTANCE;
    private static volatile Parser<MenstrualCycle$Cycle> PARSER;
    private int cycleDurationDays_;
    private Internal.ProtobufList<MenstrualCycle$Period> cyclePeriod_ = GeneratedMessageLite.emptyProtobufList();
    private int cycleStartDate_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$Cycle, Builder> implements MenstrualCycle$CycleOrBuilder {
        public Builder addAllCyclePeriod(Iterable<? extends MenstrualCycle$Period> iterable) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).addAllCyclePeriod(iterable);
            return this;
        }

        public Builder addCyclePeriod(MenstrualCycle$Period menstrualCycle$Period) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).addCyclePeriod(menstrualCycle$Period);
            return this;
        }

        public Builder clearCycleDurationDays() {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).clearCycleDurationDays();
            return this;
        }

        public Builder clearCyclePeriod() {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).clearCyclePeriod();
            return this;
        }

        public Builder clearCycleStartDate() {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).clearCycleStartDate();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
        public int getCycleDurationDays() {
            return ((MenstrualCycle$Cycle) this.instance).getCycleDurationDays();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
        public MenstrualCycle$Period getCyclePeriod(int i) {
            return ((MenstrualCycle$Cycle) this.instance).getCyclePeriod(i);
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
        public int getCyclePeriodCount() {
            return ((MenstrualCycle$Cycle) this.instance).getCyclePeriodCount();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
        public List<MenstrualCycle$Period> getCyclePeriodList() {
            return Collections.unmodifiableList(((MenstrualCycle$Cycle) this.instance).getCyclePeriodList());
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
        public int getCycleStartDate() {
            return ((MenstrualCycle$Cycle) this.instance).getCycleStartDate();
        }

        public Builder removeCyclePeriod(int i) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).removeCyclePeriod(i);
            return this;
        }

        public Builder setCycleDurationDays(int i) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).setCycleDurationDays(i);
            return this;
        }

        public Builder setCyclePeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).setCyclePeriod(i, menstrualCycle$Period);
            return this;
        }

        public Builder setCycleStartDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).setCycleStartDate(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$Cycle.DEFAULT_INSTANCE);
        }

        public Builder addCyclePeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).addCyclePeriod(i, menstrualCycle$Period);
            return this;
        }

        public Builder setCyclePeriod(int i, MenstrualCycle$Period.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).setCyclePeriod(i, builder.build());
            return this;
        }

        public Builder addCyclePeriod(MenstrualCycle$Period.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).addCyclePeriod(builder.build());
            return this;
        }

        public Builder addCyclePeriod(int i, MenstrualCycle$Period.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$Cycle) this.instance).addCyclePeriod(i, builder.build());
            return this;
        }
    }

    static {
        MenstrualCycle$Cycle menstrualCycle$Cycle = new MenstrualCycle$Cycle();
        DEFAULT_INSTANCE = menstrualCycle$Cycle;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$Cycle.class, menstrualCycle$Cycle);
    }

    private MenstrualCycle$Cycle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCyclePeriod(Iterable<? extends MenstrualCycle$Period> iterable) {
        ensureCyclePeriodIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cyclePeriod_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCyclePeriod(MenstrualCycle$Period menstrualCycle$Period) {
        menstrualCycle$Period.getClass();
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.add(menstrualCycle$Period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleDurationDays() {
        this.cycleDurationDays_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCyclePeriod() {
        this.cyclePeriod_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleStartDate() {
        this.cycleStartDate_ = 0;
    }

    private void ensureCyclePeriodIsMutable() {
        Internal.ProtobufList<MenstrualCycle$Period> protobufList = this.cyclePeriod_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cyclePeriod_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MenstrualCycle$Cycle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$Cycle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$Cycle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$Cycle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCyclePeriod(int i) {
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleDurationDays(int i) {
        this.cycleDurationDays_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCyclePeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
        menstrualCycle$Period.getClass();
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.set(i, menstrualCycle$Period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleStartDate(int i) {
        this.cycleStartDate_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$Cycle();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u001b", new Object[]{"cycleStartDate_", "cycleDurationDays_", "cyclePeriod_", MenstrualCycle$Period.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$Cycle> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$Cycle.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
    public int getCycleDurationDays() {
        return this.cycleDurationDays_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
    public MenstrualCycle$Period getCyclePeriod(int i) {
        return this.cyclePeriod_.get(i);
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
    public int getCyclePeriodCount() {
        return this.cyclePeriod_.size();
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
    public List<MenstrualCycle$Period> getCyclePeriodList() {
        return this.cyclePeriod_;
    }

    public MenstrualCycle$PeriodOrBuilder getCyclePeriodOrBuilder(int i) {
        return this.cyclePeriod_.get(i);
    }

    public List<? extends MenstrualCycle$PeriodOrBuilder> getCyclePeriodOrBuilderList() {
        return this.cyclePeriod_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleOrBuilder
    public int getCycleStartDate() {
        return this.cycleStartDate_;
    }

    public static Builder newBuilder(MenstrualCycle$Cycle menstrualCycle$Cycle) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$Cycle);
    }

    public static MenstrualCycle$Cycle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$Cycle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$Cycle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCyclePeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
        menstrualCycle$Period.getClass();
        ensureCyclePeriodIsMutable();
        this.cyclePeriod_.add(i, menstrualCycle$Period);
    }

    public static MenstrualCycle$Cycle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$Cycle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$Cycle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$Cycle parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$Cycle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$Cycle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$Cycle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Cycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
