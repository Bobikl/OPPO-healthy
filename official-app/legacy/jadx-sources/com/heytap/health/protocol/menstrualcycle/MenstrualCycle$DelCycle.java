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
public final class MenstrualCycle$DelCycle extends GeneratedMessageLite<MenstrualCycle$DelCycle, Builder> implements MenstrualCycle$DelCycleOrBuilder {
    public static final int CYCLESTARTDATE_FIELD_NUMBER = 1;
    private static final MenstrualCycle$DelCycle DEFAULT_INSTANCE;
    private static volatile Parser<MenstrualCycle$DelCycle> PARSER = null;
    public static final int PERIOD_FIELD_NUMBER = 2;
    private int cycleStartDate_;
    private Internal.ProtobufList<MenstrualCycle$Period> period_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$DelCycle, Builder> implements MenstrualCycle$DelCycleOrBuilder {
        public Builder addAllPeriod(Iterable<? extends MenstrualCycle$Period> iterable) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).addAllPeriod(iterable);
            return this;
        }

        public Builder addPeriod(MenstrualCycle$Period menstrualCycle$Period) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).addPeriod(menstrualCycle$Period);
            return this;
        }

        public Builder clearCycleStartDate() {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).clearCycleStartDate();
            return this;
        }

        public Builder clearPeriod() {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).clearPeriod();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
        public int getCycleStartDate() {
            return ((MenstrualCycle$DelCycle) this.instance).getCycleStartDate();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
        public MenstrualCycle$Period getPeriod(int i) {
            return ((MenstrualCycle$DelCycle) this.instance).getPeriod(i);
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
        public int getPeriodCount() {
            return ((MenstrualCycle$DelCycle) this.instance).getPeriodCount();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
        public List<MenstrualCycle$Period> getPeriodList() {
            return Collections.unmodifiableList(((MenstrualCycle$DelCycle) this.instance).getPeriodList());
        }

        public Builder removePeriod(int i) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).removePeriod(i);
            return this;
        }

        public Builder setCycleStartDate(int i) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).setCycleStartDate(i);
            return this;
        }

        public Builder setPeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).setPeriod(i, menstrualCycle$Period);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$DelCycle.DEFAULT_INSTANCE);
        }

        public Builder addPeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).addPeriod(i, menstrualCycle$Period);
            return this;
        }

        public Builder setPeriod(int i, MenstrualCycle$Period.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).setPeriod(i, builder.build());
            return this;
        }

        public Builder addPeriod(MenstrualCycle$Period.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).addPeriod(builder.build());
            return this;
        }

        public Builder addPeriod(int i, MenstrualCycle$Period.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$DelCycle) this.instance).addPeriod(i, builder.build());
            return this;
        }
    }

    static {
        MenstrualCycle$DelCycle menstrualCycle$DelCycle = new MenstrualCycle$DelCycle();
        DEFAULT_INSTANCE = menstrualCycle$DelCycle;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$DelCycle.class, menstrualCycle$DelCycle);
    }

    private MenstrualCycle$DelCycle() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPeriod(Iterable<? extends MenstrualCycle$Period> iterable) {
        ensurePeriodIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.period_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPeriod(MenstrualCycle$Period menstrualCycle$Period) {
        menstrualCycle$Period.getClass();
        ensurePeriodIsMutable();
        this.period_.add(menstrualCycle$Period);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCycleStartDate() {
        this.cycleStartDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriod() {
        this.period_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePeriodIsMutable() {
        Internal.ProtobufList<MenstrualCycle$Period> protobufList = this.period_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.period_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MenstrualCycle$DelCycle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$DelCycle parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$DelCycle parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$DelCycle> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePeriod(int i) {
        ensurePeriodIsMutable();
        this.period_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCycleStartDate(int i) {
        this.cycleStartDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
        menstrualCycle$Period.getClass();
        ensurePeriodIsMutable();
        this.period_.set(i, menstrualCycle$Period);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$DelCycle();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"cycleStartDate_", "period_", MenstrualCycle$Period.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$DelCycle> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$DelCycle.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
    public int getCycleStartDate() {
        return this.cycleStartDate_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
    public MenstrualCycle$Period getPeriod(int i) {
        return this.period_.get(i);
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
    public int getPeriodCount() {
        return this.period_.size();
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$DelCycleOrBuilder
    public List<MenstrualCycle$Period> getPeriodList() {
        return this.period_;
    }

    public MenstrualCycle$PeriodOrBuilder getPeriodOrBuilder(int i) {
        return this.period_.get(i);
    }

    public List<? extends MenstrualCycle$PeriodOrBuilder> getPeriodOrBuilderList() {
        return this.period_;
    }

    public static Builder newBuilder(MenstrualCycle$DelCycle menstrualCycle$DelCycle) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$DelCycle);
    }

    public static MenstrualCycle$DelCycle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$DelCycle parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$DelCycle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPeriod(int i, MenstrualCycle$Period menstrualCycle$Period) {
        menstrualCycle$Period.getClass();
        ensurePeriodIsMutable();
        this.period_.add(i, menstrualCycle$Period);
    }

    public static MenstrualCycle$DelCycle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$DelCycle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$DelCycle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$DelCycle parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$DelCycle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$DelCycle parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$DelCycle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$DelCycle) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
