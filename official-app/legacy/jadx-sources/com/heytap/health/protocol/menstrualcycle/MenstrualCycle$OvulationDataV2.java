package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$OvulationDataV2 extends GeneratedMessageLite<MenstrualCycle$OvulationDataV2, Builder> implements MenstrualCycle$OvulationDataV2OrBuilder {
    private static final MenstrualCycle$OvulationDataV2 DEFAULT_INSTANCE;
    public static final int MODIFIEDTIME_FIELD_NUMBER = 4;
    public static final int OVULATIONDAY_FIELD_NUMBER = 3;
    public static final int OVULATIONENDDAY_FIELD_NUMBER = 2;
    public static final int OVULATIONSTARTDAY_FIELD_NUMBER = 1;
    private static volatile Parser<MenstrualCycle$OvulationDataV2> PARSER;
    private int modifiedTime_;
    private int ovulationDay_;
    private int ovulationEndDay_;
    private int ovulationStartDay_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$OvulationDataV2, Builder> implements MenstrualCycle$OvulationDataV2OrBuilder {
        public Builder clearModifiedTime() {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).clearModifiedTime();
            return this;
        }

        public Builder clearOvulationDay() {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).clearOvulationDay();
            return this;
        }

        public Builder clearOvulationEndDay() {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).clearOvulationEndDay();
            return this;
        }

        public Builder clearOvulationStartDay() {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).clearOvulationStartDay();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
        public int getModifiedTime() {
            return ((MenstrualCycle$OvulationDataV2) this.instance).getModifiedTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
        public int getOvulationDay() {
            return ((MenstrualCycle$OvulationDataV2) this.instance).getOvulationDay();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
        public int getOvulationEndDay() {
            return ((MenstrualCycle$OvulationDataV2) this.instance).getOvulationEndDay();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
        public int getOvulationStartDay() {
            return ((MenstrualCycle$OvulationDataV2) this.instance).getOvulationStartDay();
        }

        public Builder setModifiedTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).setModifiedTime(i);
            return this;
        }

        public Builder setOvulationDay(int i) {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).setOvulationDay(i);
            return this;
        }

        public Builder setOvulationEndDay(int i) {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).setOvulationEndDay(i);
            return this;
        }

        public Builder setOvulationStartDay(int i) {
            copyOnWrite();
            ((MenstrualCycle$OvulationDataV2) this.instance).setOvulationStartDay(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$OvulationDataV2.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2 = new MenstrualCycle$OvulationDataV2();
        DEFAULT_INSTANCE = menstrualCycle$OvulationDataV2;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$OvulationDataV2.class, menstrualCycle$OvulationDataV2);
    }

    private MenstrualCycle$OvulationDataV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifiedTime() {
        this.modifiedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulationDay() {
        this.ovulationDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulationEndDay() {
        this.ovulationEndDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOvulationStartDay() {
        this.ovulationStartDay_ = 0;
    }

    public static MenstrualCycle$OvulationDataV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$OvulationDataV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$OvulationDataV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifiedTime(int i) {
        this.modifiedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulationDay(int i) {
        this.ovulationDay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulationEndDay(int i) {
        this.ovulationEndDay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOvulationStartDay(int i) {
        this.ovulationStartDay_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$OvulationDataV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"ovulationStartDay_", "ovulationEndDay_", "ovulationDay_", "modifiedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$OvulationDataV2> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$OvulationDataV2.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
    public int getModifiedTime() {
        return this.modifiedTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
    public int getOvulationDay() {
        return this.ovulationDay_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
    public int getOvulationEndDay() {
        return this.ovulationEndDay_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$OvulationDataV2OrBuilder
    public int getOvulationStartDay() {
        return this.ovulationStartDay_;
    }

    public static Builder newBuilder(MenstrualCycle$OvulationDataV2 menstrualCycle$OvulationDataV2) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$OvulationDataV2);
    }

    public static MenstrualCycle$OvulationDataV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$OvulationDataV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$OvulationDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
