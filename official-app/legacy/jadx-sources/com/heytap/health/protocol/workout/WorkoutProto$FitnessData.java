package com.heytap.health.protocol.workout;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$FitnessData extends GeneratedMessageLite<WorkoutProto$FitnessData, Builder> implements WorkoutProto$FitnessDataOrBuilder {
    private static final WorkoutProto$FitnessData DEFAULT_INSTANCE;
    public static final int FITNESS_NOTIFY_BEST_FAT_HEART_RATE_MAX_FIELD_NUMBER = 8;
    public static final int FITNESS_NOTIFY_BEST_FAT_HEART_RATE_MIN_FIELD_NUMBER = 7;
    public static final int FITNESS_NOTIFY_CALORIE_FIELD_NUMBER = 2;
    public static final int FITNESS_NOTIFY_FAT_FIELD_NUMBER = 3;
    public static final int FITNESS_NOTIFY_HEART_RATE_FIELD_NUMBER = 1;
    public static final int FITNESS_NOTIFY_MAX_HEART_RATE_FIELD_NUMBER = 6;
    public static final int FITNESS_NOTIFY_REST_HEART_RATE_FIELD_NUMBER = 5;
    public static final int FITNESS_NOTIFY_SUGAR_FIELD_NUMBER = 4;
    private static volatile Parser<WorkoutProto$FitnessData> PARSER;
    private int fitnessNotifyBestFatHeartRateMax_;
    private int fitnessNotifyBestFatHeartRateMin_;
    private int fitnessNotifyCalorie_;
    private int fitnessNotifyFat_;
    private int fitnessNotifyHeartRate_;
    private int fitnessNotifyMaxHeartRate_;
    private int fitnessNotifyRestHeartRate_;
    private int fitnessNotifySugar_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$FitnessData, Builder> implements WorkoutProto$FitnessDataOrBuilder {
        public Builder clearFitnessNotifyBestFatHeartRateMax() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyBestFatHeartRateMax();
            return this;
        }

        public Builder clearFitnessNotifyBestFatHeartRateMin() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyBestFatHeartRateMin();
            return this;
        }

        public Builder clearFitnessNotifyCalorie() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyCalorie();
            return this;
        }

        public Builder clearFitnessNotifyFat() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyFat();
            return this;
        }

        public Builder clearFitnessNotifyHeartRate() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyHeartRate();
            return this;
        }

        public Builder clearFitnessNotifyMaxHeartRate() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyMaxHeartRate();
            return this;
        }

        public Builder clearFitnessNotifyRestHeartRate() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifyRestHeartRate();
            return this;
        }

        public Builder clearFitnessNotifySugar() {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).clearFitnessNotifySugar();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyBestFatHeartRateMax() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyBestFatHeartRateMax();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyBestFatHeartRateMin() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyBestFatHeartRateMin();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyCalorie() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyCalorie();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyFat() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyFat();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyHeartRate() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyHeartRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyMaxHeartRate() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyMaxHeartRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifyRestHeartRate() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifyRestHeartRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
        public int getFitnessNotifySugar() {
            return ((WorkoutProto$FitnessData) this.instance).getFitnessNotifySugar();
        }

        public Builder setFitnessNotifyBestFatHeartRateMax(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyBestFatHeartRateMax(i);
            return this;
        }

        public Builder setFitnessNotifyBestFatHeartRateMin(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyBestFatHeartRateMin(i);
            return this;
        }

        public Builder setFitnessNotifyCalorie(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyCalorie(i);
            return this;
        }

        public Builder setFitnessNotifyFat(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyFat(i);
            return this;
        }

        public Builder setFitnessNotifyHeartRate(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyHeartRate(i);
            return this;
        }

        public Builder setFitnessNotifyMaxHeartRate(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyMaxHeartRate(i);
            return this;
        }

        public Builder setFitnessNotifyRestHeartRate(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifyRestHeartRate(i);
            return this;
        }

        public Builder setFitnessNotifySugar(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessData) this.instance).setFitnessNotifySugar(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$FitnessData.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$FitnessData workoutProto$FitnessData = new WorkoutProto$FitnessData();
        DEFAULT_INSTANCE = workoutProto$FitnessData;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$FitnessData.class, workoutProto$FitnessData);
    }

    private WorkoutProto$FitnessData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyBestFatHeartRateMax() {
        this.fitnessNotifyBestFatHeartRateMax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyBestFatHeartRateMin() {
        this.fitnessNotifyBestFatHeartRateMin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyCalorie() {
        this.fitnessNotifyCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyFat() {
        this.fitnessNotifyFat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyHeartRate() {
        this.fitnessNotifyHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyMaxHeartRate() {
        this.fitnessNotifyMaxHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifyRestHeartRate() {
        this.fitnessNotifyRestHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessNotifySugar() {
        this.fitnessNotifySugar_ = 0;
    }

    public static WorkoutProto$FitnessData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$FitnessData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$FitnessData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$FitnessData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyBestFatHeartRateMax(int i) {
        this.fitnessNotifyBestFatHeartRateMax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyBestFatHeartRateMin(int i) {
        this.fitnessNotifyBestFatHeartRateMin_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyCalorie(int i) {
        this.fitnessNotifyCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyFat(int i) {
        this.fitnessNotifyFat_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyHeartRate(int i) {
        this.fitnessNotifyHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyMaxHeartRate(int i) {
        this.fitnessNotifyMaxHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifyRestHeartRate(int i) {
        this.fitnessNotifyRestHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessNotifySugar(int i) {
        this.fitnessNotifySugar_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$FitnessData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b", new Object[]{"fitnessNotifyHeartRate_", "fitnessNotifyCalorie_", "fitnessNotifyFat_", "fitnessNotifySugar_", "fitnessNotifyRestHeartRate_", "fitnessNotifyMaxHeartRate_", "fitnessNotifyBestFatHeartRateMin_", "fitnessNotifyBestFatHeartRateMax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$FitnessData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$FitnessData.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyBestFatHeartRateMax() {
        return this.fitnessNotifyBestFatHeartRateMax_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyBestFatHeartRateMin() {
        return this.fitnessNotifyBestFatHeartRateMin_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyCalorie() {
        return this.fitnessNotifyCalorie_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyFat() {
        return this.fitnessNotifyFat_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyHeartRate() {
        return this.fitnessNotifyHeartRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyMaxHeartRate() {
        return this.fitnessNotifyMaxHeartRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifyRestHeartRate() {
        return this.fitnessNotifyRestHeartRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessDataOrBuilder
    public int getFitnessNotifySugar() {
        return this.fitnessNotifySugar_;
    }

    public static Builder newBuilder(WorkoutProto$FitnessData workoutProto$FitnessData) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$FitnessData);
    }

    public static WorkoutProto$FitnessData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$FitnessData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$FitnessData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessData parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$FitnessData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$FitnessData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
