package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$PhysicalMentalHealthIndexDataItme extends GeneratedMessageLite<FitnessProtoV2$PhysicalMentalHealthIndexDataItme, Builder> implements FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder {
    public static final int ACHIEVEMENTDATA_FIELD_NUMBER = 5;
    public static final int AVG_HRV_FIELD_NUMBER = 2;
    public static final int AVG_STRESS_STATE_FIELD_NUMBER = 4;
    public static final int AVG_STRESS_VALUE_FIELD_NUMBER = 3;
    public static final int DAY_START_TIME_FIELD_NUMBER = 1;
    private static final FitnessProtoV2$PhysicalMentalHealthIndexDataItme DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$PhysicalMentalHealthIndexDataItme> PARSER;
    private FitnessProtoV2$Achievement achievementData_;
    private int avgHrv_;
    private int avgStressState_;
    private int avgStressValue_;
    private int bitField0_;
    private int dayStartTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$PhysicalMentalHealthIndexDataItme, Builder> implements FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder {
        public Builder clearAchievementData() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).clearAchievementData();
            return this;
        }

        public Builder clearAvgHrv() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).clearAvgHrv();
            return this;
        }

        public Builder clearAvgStressState() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).clearAvgStressState();
            return this;
        }

        public Builder clearAvgStressValue() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).clearAvgStressValue();
            return this;
        }

        public Builder clearDayStartTime() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).clearDayStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
        public FitnessProtoV2$Achievement getAchievementData() {
            return ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).getAchievementData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
        public int getAvgHrv() {
            return ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).getAvgHrv();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
        public int getAvgStressState() {
            return ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).getAvgStressState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
        public int getAvgStressValue() {
            return ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).getAvgStressValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
        public int getDayStartTime() {
            return ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).getDayStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
        public boolean hasAchievementData() {
            return ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).hasAchievementData();
        }

        public Builder mergeAchievementData(FitnessProtoV2$Achievement fitnessProtoV2$Achievement) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).mergeAchievementData(fitnessProtoV2$Achievement);
            return this;
        }

        public Builder setAchievementData(FitnessProtoV2$Achievement fitnessProtoV2$Achievement) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).setAchievementData(fitnessProtoV2$Achievement);
            return this;
        }

        public Builder setAvgHrv(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).setAvgHrv(i);
            return this;
        }

        public Builder setAvgStressState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).setAvgStressState(i);
            return this;
        }

        public Builder setAvgStressValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).setAvgStressValue(i);
            return this;
        }

        public Builder setDayStartTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).setDayStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$PhysicalMentalHealthIndexDataItme.DEFAULT_INSTANCE);
        }

        public Builder setAchievementData(FitnessProtoV2$Achievement.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthIndexDataItme) this.instance).setAchievementData(builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$PhysicalMentalHealthIndexDataItme fitnessProtoV2$PhysicalMentalHealthIndexDataItme = new FitnessProtoV2$PhysicalMentalHealthIndexDataItme();
        DEFAULT_INSTANCE = fitnessProtoV2$PhysicalMentalHealthIndexDataItme;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$PhysicalMentalHealthIndexDataItme.class, fitnessProtoV2$PhysicalMentalHealthIndexDataItme);
    }

    private FitnessProtoV2$PhysicalMentalHealthIndexDataItme() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAchievementData() {
        this.achievementData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgHrv() {
        this.avgHrv_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgStressState() {
        this.avgStressState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgStressValue() {
        this.avgStressValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDayStartTime() {
        this.dayStartTime_ = 0;
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAchievementData(FitnessProtoV2$Achievement fitnessProtoV2$Achievement) {
        fitnessProtoV2$Achievement.getClass();
        FitnessProtoV2$Achievement fitnessProtoV2$Achievement2 = this.achievementData_;
        if (fitnessProtoV2$Achievement2 == null || fitnessProtoV2$Achievement2 == FitnessProtoV2$Achievement.getDefaultInstance()) {
            this.achievementData_ = fitnessProtoV2$Achievement;
        } else {
            this.achievementData_ = FitnessProtoV2$Achievement.newBuilder(this.achievementData_).mergeFrom(fitnessProtoV2$Achievement).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$PhysicalMentalHealthIndexDataItme> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAchievementData(FitnessProtoV2$Achievement fitnessProtoV2$Achievement) {
        fitnessProtoV2$Achievement.getClass();
        this.achievementData_ = fitnessProtoV2$Achievement;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgHrv(int i) {
        this.avgHrv_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgStressState(int i) {
        this.avgStressState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgStressValue(int i) {
        this.avgStressValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDayStartTime(int i) {
        this.dayStartTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$PhysicalMentalHealthIndexDataItme();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005ဉ\u0000", new Object[]{"bitField0_", "dayStartTime_", "avgHrv_", "avgStressValue_", "avgStressState_", "achievementData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$PhysicalMentalHealthIndexDataItme> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$PhysicalMentalHealthIndexDataItme.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
    public FitnessProtoV2$Achievement getAchievementData() {
        FitnessProtoV2$Achievement fitnessProtoV2$Achievement = this.achievementData_;
        return fitnessProtoV2$Achievement == null ? FitnessProtoV2$Achievement.getDefaultInstance() : fitnessProtoV2$Achievement;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
    public int getAvgHrv() {
        return this.avgHrv_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
    public int getAvgStressState() {
        return this.avgStressState_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
    public int getAvgStressValue() {
        return this.avgStressValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
    public int getDayStartTime() {
        return this.dayStartTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthIndexDataItmeOrBuilder
    public boolean hasAchievementData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(FitnessProtoV2$PhysicalMentalHealthIndexDataItme fitnessProtoV2$PhysicalMentalHealthIndexDataItme) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$PhysicalMentalHealthIndexDataItme);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$PhysicalMentalHealthIndexDataItme parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthIndexDataItme) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
