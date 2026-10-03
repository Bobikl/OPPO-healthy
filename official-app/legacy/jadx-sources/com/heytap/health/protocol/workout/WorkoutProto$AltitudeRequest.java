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
public final class WorkoutProto$AltitudeRequest extends GeneratedMessageLite<WorkoutProto$AltitudeRequest, Builder> implements WorkoutProto$AltitudeRequestOrBuilder {
    private static final WorkoutProto$AltitudeRequest DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGTITUDE_FIELD_NUMBER = 3;
    private static volatile Parser<WorkoutProto$AltitudeRequest> PARSER = null;
    public static final int REQ_FLAG_FIELD_NUMBER = 1;
    private double latitude_;
    private double longtitude_;
    private int reqFlag_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$AltitudeRequest, Builder> implements WorkoutProto$AltitudeRequestOrBuilder {
        public Builder clearLatitude() {
            copyOnWrite();
            ((WorkoutProto$AltitudeRequest) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongtitude() {
            copyOnWrite();
            ((WorkoutProto$AltitudeRequest) this.instance).clearLongtitude();
            return this;
        }

        public Builder clearReqFlag() {
            copyOnWrite();
            ((WorkoutProto$AltitudeRequest) this.instance).clearReqFlag();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$AltitudeRequestOrBuilder
        public double getLatitude() {
            return ((WorkoutProto$AltitudeRequest) this.instance).getLatitude();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$AltitudeRequestOrBuilder
        public double getLongtitude() {
            return ((WorkoutProto$AltitudeRequest) this.instance).getLongtitude();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$AltitudeRequestOrBuilder
        public int getReqFlag() {
            return ((WorkoutProto$AltitudeRequest) this.instance).getReqFlag();
        }

        public Builder setLatitude(double d) {
            copyOnWrite();
            ((WorkoutProto$AltitudeRequest) this.instance).setLatitude(d);
            return this;
        }

        public Builder setLongtitude(double d) {
            copyOnWrite();
            ((WorkoutProto$AltitudeRequest) this.instance).setLongtitude(d);
            return this;
        }

        public Builder setReqFlag(int i) {
            copyOnWrite();
            ((WorkoutProto$AltitudeRequest) this.instance).setReqFlag(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$AltitudeRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$AltitudeRequest workoutProto$AltitudeRequest = new WorkoutProto$AltitudeRequest();
        DEFAULT_INSTANCE = workoutProto$AltitudeRequest;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$AltitudeRequest.class, workoutProto$AltitudeRequest);
    }

    private WorkoutProto$AltitudeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongtitude() {
        this.longtitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqFlag() {
        this.reqFlag_ = 0;
    }

    public static WorkoutProto$AltitudeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$AltitudeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$AltitudeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d) {
        this.latitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongtitude(double d) {
        this.longtitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqFlag(int i) {
        this.reqFlag_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$AltitudeRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u0000\u0003\u0000", new Object[]{"reqFlag_", "latitude_", "longtitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$AltitudeRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$AltitudeRequest.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$AltitudeRequestOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$AltitudeRequestOrBuilder
    public double getLongtitude() {
        return this.longtitude_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$AltitudeRequestOrBuilder
    public int getReqFlag() {
        return this.reqFlag_;
    }

    public static Builder newBuilder(WorkoutProto$AltitudeRequest workoutProto$AltitudeRequest) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$AltitudeRequest);
    }

    public static WorkoutProto$AltitudeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$AltitudeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$AltitudeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
