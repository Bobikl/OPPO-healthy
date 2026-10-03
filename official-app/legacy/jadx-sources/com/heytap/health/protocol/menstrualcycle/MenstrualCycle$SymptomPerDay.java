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
public final class MenstrualCycle$SymptomPerDay extends GeneratedMessageLite<MenstrualCycle$SymptomPerDay, Builder> implements MenstrualCycle$SymptomPerDayOrBuilder {
    public static final int CREATETIME_FIELD_NUMBER = 1;
    private static final MenstrualCycle$SymptomPerDay DEFAULT_INSTANCE;
    private static volatile Parser<MenstrualCycle$SymptomPerDay> PARSER = null;
    public static final int SYMPTOM_FIELD_NUMBER = 2;
    private int createTime_;
    private Internal.ProtobufList<MenstrualCycle$Symptom> symptom_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$SymptomPerDay, Builder> implements MenstrualCycle$SymptomPerDayOrBuilder {
        public Builder addAllSymptom(Iterable<? extends MenstrualCycle$Symptom> iterable) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).addAllSymptom(iterable);
            return this;
        }

        public Builder addSymptom(MenstrualCycle$Symptom menstrualCycle$Symptom) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).addSymptom(menstrualCycle$Symptom);
            return this;
        }

        public Builder clearCreateTime() {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).clearCreateTime();
            return this;
        }

        public Builder clearSymptom() {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).clearSymptom();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
        public int getCreateTime() {
            return ((MenstrualCycle$SymptomPerDay) this.instance).getCreateTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
        public MenstrualCycle$Symptom getSymptom(int i) {
            return ((MenstrualCycle$SymptomPerDay) this.instance).getSymptom(i);
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
        public int getSymptomCount() {
            return ((MenstrualCycle$SymptomPerDay) this.instance).getSymptomCount();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
        public List<MenstrualCycle$Symptom> getSymptomList() {
            return Collections.unmodifiableList(((MenstrualCycle$SymptomPerDay) this.instance).getSymptomList());
        }

        public Builder removeSymptom(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).removeSymptom(i);
            return this;
        }

        public Builder setCreateTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).setCreateTime(i);
            return this;
        }

        public Builder setSymptom(int i, MenstrualCycle$Symptom menstrualCycle$Symptom) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).setSymptom(i, menstrualCycle$Symptom);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$SymptomPerDay.DEFAULT_INSTANCE);
        }

        public Builder addSymptom(int i, MenstrualCycle$Symptom menstrualCycle$Symptom) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).addSymptom(i, menstrualCycle$Symptom);
            return this;
        }

        public Builder setSymptom(int i, MenstrualCycle$Symptom.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).setSymptom(i, builder.build());
            return this;
        }

        public Builder addSymptom(MenstrualCycle$Symptom.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).addSymptom(builder.build());
            return this;
        }

        public Builder addSymptom(int i, MenstrualCycle$Symptom.Builder builder) {
            copyOnWrite();
            ((MenstrualCycle$SymptomPerDay) this.instance).addSymptom(i, builder.build());
            return this;
        }
    }

    static {
        MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay = new MenstrualCycle$SymptomPerDay();
        DEFAULT_INSTANCE = menstrualCycle$SymptomPerDay;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$SymptomPerDay.class, menstrualCycle$SymptomPerDay);
    }

    private MenstrualCycle$SymptomPerDay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSymptom(Iterable<? extends MenstrualCycle$Symptom> iterable) {
        ensureSymptomIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.symptom_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSymptom(MenstrualCycle$Symptom menstrualCycle$Symptom) {
        menstrualCycle$Symptom.getClass();
        ensureSymptomIsMutable();
        this.symptom_.add(menstrualCycle$Symptom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateTime() {
        this.createTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSymptom() {
        this.symptom_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSymptomIsMutable() {
        Internal.ProtobufList<MenstrualCycle$Symptom> protobufList = this.symptom_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.symptom_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static MenstrualCycle$SymptomPerDay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$SymptomPerDay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$SymptomPerDay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSymptom(int i) {
        ensureSymptomIsMutable();
        this.symptom_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateTime(int i) {
        this.createTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSymptom(int i, MenstrualCycle$Symptom menstrualCycle$Symptom) {
        menstrualCycle$Symptom.getClass();
        ensureSymptomIsMutable();
        this.symptom_.set(i, menstrualCycle$Symptom);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$SymptomPerDay();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"createTime_", "symptom_", MenstrualCycle$Symptom.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$SymptomPerDay> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$SymptomPerDay.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
    public int getCreateTime() {
        return this.createTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
    public MenstrualCycle$Symptom getSymptom(int i) {
        return this.symptom_.get(i);
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
    public int getSymptomCount() {
        return this.symptom_.size();
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$SymptomPerDayOrBuilder
    public List<MenstrualCycle$Symptom> getSymptomList() {
        return this.symptom_;
    }

    public MenstrualCycle$SymptomOrBuilder getSymptomOrBuilder(int i) {
        return this.symptom_.get(i);
    }

    public List<? extends MenstrualCycle$SymptomOrBuilder> getSymptomOrBuilderList() {
        return this.symptom_;
    }

    public static Builder newBuilder(MenstrualCycle$SymptomPerDay menstrualCycle$SymptomPerDay) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$SymptomPerDay);
    }

    public static MenstrualCycle$SymptomPerDay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSymptom(int i, MenstrualCycle$Symptom menstrualCycle$Symptom) {
        menstrualCycle$Symptom.getClass();
        ensureSymptomIsMutable();
        this.symptom_.add(i, menstrualCycle$Symptom);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$SymptomPerDay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$SymptomPerDay) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
