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
public final class WorkoutProto$FitnessReport extends GeneratedMessageLite<WorkoutProto$FitnessReport, Builder> implements WorkoutProto$FitnessReportOrBuilder {
    private static final WorkoutProto$FitnessReport DEFAULT_INSTANCE;
    public static final int FITNESS_REPORT_CALORIE_FIELD_NUMBER = 2;
    public static final int FITNESS_REPORT_FAT_BURNING_FIELD_NUMBER = 4;
    public static final int FITNESS_REPORT_FAT_BURNING_RATE_FIELD_NUMBER = 6;
    public static final int FITNESS_REPORT_HEART_RATE_FIELD_NUMBER = 1;
    public static final int FITNESS_REPORT_SUGAR_FIELD_NUMBER = 5;
    public static final int FITNESS_REPORT_SUGAR_RATE_FIELD_NUMBER = 7;
    public static final int FITNESS_REPORT_TOTAL_CALORIE_FIELD_NUMBER = 3;
    private static volatile Parser<WorkoutProto$FitnessReport> PARSER;
    private int fitnessReportCalorie_;
    private int fitnessReportFatBurningRate_;
    private int fitnessReportFatBurning_;
    private int fitnessReportHeartRate_;
    private int fitnessReportSugarRate_;
    private int fitnessReportSugar_;
    private int fitnessReportTotalCalorie_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$FitnessReport, Builder> implements WorkoutProto$FitnessReportOrBuilder {
        public Builder clearFitnessReportCalorie() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportCalorie();
            return this;
        }

        public Builder clearFitnessReportFatBurning() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportFatBurning();
            return this;
        }

        public Builder clearFitnessReportFatBurningRate() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportFatBurningRate();
            return this;
        }

        public Builder clearFitnessReportHeartRate() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportHeartRate();
            return this;
        }

        public Builder clearFitnessReportSugar() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportSugar();
            return this;
        }

        public Builder clearFitnessReportSugarRate() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportSugarRate();
            return this;
        }

        public Builder clearFitnessReportTotalCalorie() {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).clearFitnessReportTotalCalorie();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportCalorie() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportCalorie();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportFatBurning() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportFatBurning();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportFatBurningRate() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportFatBurningRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportHeartRate() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportHeartRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportSugar() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportSugar();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportSugarRate() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportSugarRate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
        public int getFitnessReportTotalCalorie() {
            return ((WorkoutProto$FitnessReport) this.instance).getFitnessReportTotalCalorie();
        }

        public Builder setFitnessReportCalorie(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportCalorie(i);
            return this;
        }

        public Builder setFitnessReportFatBurning(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportFatBurning(i);
            return this;
        }

        public Builder setFitnessReportFatBurningRate(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportFatBurningRate(i);
            return this;
        }

        public Builder setFitnessReportHeartRate(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportHeartRate(i);
            return this;
        }

        public Builder setFitnessReportSugar(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportSugar(i);
            return this;
        }

        public Builder setFitnessReportSugarRate(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportSugarRate(i);
            return this;
        }

        public Builder setFitnessReportTotalCalorie(int i) {
            copyOnWrite();
            ((WorkoutProto$FitnessReport) this.instance).setFitnessReportTotalCalorie(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$FitnessReport.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$FitnessReport workoutProto$FitnessReport = new WorkoutProto$FitnessReport();
        DEFAULT_INSTANCE = workoutProto$FitnessReport;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$FitnessReport.class, workoutProto$FitnessReport);
    }

    private WorkoutProto$FitnessReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportCalorie() {
        this.fitnessReportCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportFatBurning() {
        this.fitnessReportFatBurning_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportFatBurningRate() {
        this.fitnessReportFatBurningRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportHeartRate() {
        this.fitnessReportHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportSugar() {
        this.fitnessReportSugar_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportSugarRate() {
        this.fitnessReportSugarRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFitnessReportTotalCalorie() {
        this.fitnessReportTotalCalorie_ = 0;
    }

    public static WorkoutProto$FitnessReport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$FitnessReport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$FitnessReport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$FitnessReport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportCalorie(int i) {
        this.fitnessReportCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportFatBurning(int i) {
        this.fitnessReportFatBurning_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportFatBurningRate(int i) {
        this.fitnessReportFatBurningRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportHeartRate(int i) {
        this.fitnessReportHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportSugar(int i) {
        this.fitnessReportSugar_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportSugarRate(int i) {
        this.fitnessReportSugarRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitnessReportTotalCalorie(int i) {
        this.fitnessReportTotalCalorie_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$FitnessReport();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b", new Object[]{"fitnessReportHeartRate_", "fitnessReportCalorie_", "fitnessReportTotalCalorie_", "fitnessReportFatBurning_", "fitnessReportSugar_", "fitnessReportFatBurningRate_", "fitnessReportSugarRate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$FitnessReport> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$FitnessReport.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportCalorie() {
        return this.fitnessReportCalorie_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportFatBurning() {
        return this.fitnessReportFatBurning_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportFatBurningRate() {
        return this.fitnessReportFatBurningRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportHeartRate() {
        return this.fitnessReportHeartRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportSugar() {
        return this.fitnessReportSugar_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportSugarRate() {
        return this.fitnessReportSugarRate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$FitnessReportOrBuilder
    public int getFitnessReportTotalCalorie() {
        return this.fitnessReportTotalCalorie_;
    }

    public static Builder newBuilder(WorkoutProto$FitnessReport workoutProto$FitnessReport) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$FitnessReport);
    }

    public static WorkoutProto$FitnessReport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessReport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessReport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$FitnessReport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessReport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$FitnessReport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessReport parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$FitnessReport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$FitnessReport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$FitnessReport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$FitnessReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
