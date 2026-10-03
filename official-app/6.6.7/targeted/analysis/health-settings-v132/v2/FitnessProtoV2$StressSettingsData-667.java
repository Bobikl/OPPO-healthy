package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$StressSettingsData extends GeneratedMessageLite<FitnessProtoV2$StressSettingsData, Builder> implements FitnessProtoV2$StressSettingsDataOrBuilder {
    private static final FitnessProtoV2$StressSettingsData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$StressSettingsData> PARSER = null;
    public static final int STRESSHIGHNOTIFY_FIELD_NUMBER = 2;
    public static final int STRESSSWITCH_FIELD_NUMBER = 1;
    private int bitField0_;
    private FitnessProtoV2$SettingsEnableData stressHighNotify_;
    private FitnessProtoV2$SettingsEnableData stressSwitch_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$StressSettingsData, Builder> implements FitnessProtoV2$StressSettingsDataOrBuilder {
        public Builder clearStressHighNotify() {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearStressHighNotify();
            return this;
        }

        public Builder clearStressSwitch() {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearStressSwitch();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getStressHighNotify() {
            return ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).getStressHighNotify();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getStressSwitch() {
            return ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).getStressSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
        public boolean hasStressHighNotify() {
            return ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasStressHighNotify();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
        public boolean hasStressSwitch() {
            return ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasStressSwitch();
        }

        public Builder mergeStressHighNotify(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeStressHighNotify(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeStressSwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeStressSwitch(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setStressHighNotify(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStressHighNotify(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setStressSwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStressSwitch(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$StressSettingsData.DEFAULT_INSTANCE);
        }

        public Builder setStressHighNotify(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStressHighNotify((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setStressSwitch(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$StressSettingsData) ((GeneratedMessageLite.Builder) this).instance).setStressSwitch((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData = new FitnessProtoV2$StressSettingsData();
        DEFAULT_INSTANCE = fitnessProtoV2$StressSettingsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$StressSettingsData.class, fitnessProtoV2$StressSettingsData);
    }

    private FitnessProtoV2$StressSettingsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressHighNotify() {
        this.stressHighNotify_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressSwitch() {
        this.stressSwitch_ = null;
        this.bitField0_ &= -2;
    }

    public static FitnessProtoV2$StressSettingsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStressHighNotify(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.stressHighNotify_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.stressHighNotify_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.stressHighNotify_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.stressHighNotify_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStressSwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.stressSwitch_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.stressSwitch_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.stressSwitch_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.stressSwitch_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$StressSettingsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$StressSettingsData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressHighNotify(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.stressHighNotify_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressSwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.stressSwitch_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$StressSettingsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "stressSwitch_", "stressHighNotify_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$StressSettingsData.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getStressHighNotify() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.stressHighNotify_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getStressSwitch() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.stressSwitch_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
    public boolean hasStressHighNotify() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$StressSettingsDataOrBuilder
    public boolean hasStressSwitch() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(FitnessProtoV2$StressSettingsData fitnessProtoV2$StressSettingsData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$StressSettingsData);
    }

    public static FitnessProtoV2$StressSettingsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$StressSettingsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$StressSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}