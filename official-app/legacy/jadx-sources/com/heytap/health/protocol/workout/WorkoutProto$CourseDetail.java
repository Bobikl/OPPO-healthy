package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
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
public final class WorkoutProto$CourseDetail extends GeneratedMessageLite<WorkoutProto$CourseDetail, Builder> implements WorkoutProto$CourseDetailOrBuilder {
    public static final int ARRANGEID_FIELD_NUMBER = 2;
    public static final int COURSEID_FIELD_NUMBER = 3;
    public static final int COURSENAME_FIELD_NUMBER = 4;
    private static final WorkoutProto$CourseDetail DEFAULT_INSTANCE;
    public static final int EXTRADATA_FIELD_NUMBER = 10;
    public static final int FINISHSTATE_FIELD_NUMBER = 9;
    public static final int GOALTYPE_FIELD_NUMBER = 6;
    public static final int GOALVALUE_FIELD_NUMBER = 7;
    private static volatile Parser<WorkoutProto$CourseDetail> PARSER = null;
    public static final int PLANDATE_FIELD_NUMBER = 8;
    public static final int PLANID_FIELD_NUMBER = 1;
    public static final int SPORTTYPE_FIELD_NUMBER = 5;
    private int finishState_;
    private int goalType_;
    private int goalValue_;
    private int planDate_;
    private int sportType_;
    private String planId_ = "";
    private String arrangeId_ = "";
    private String courseId_ = "";
    private String courseName_ = "";
    private String extraData_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$CourseDetail, Builder> implements WorkoutProto$CourseDetailOrBuilder {
        public Builder clearArrangeId() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearArrangeId();
            return this;
        }

        public Builder clearCourseId() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearCourseId();
            return this;
        }

        public Builder clearCourseName() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearCourseName();
            return this;
        }

        public Builder clearExtraData() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearExtraData();
            return this;
        }

        public Builder clearFinishState() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearFinishState();
            return this;
        }

        public Builder clearGoalType() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearGoalType();
            return this;
        }

        public Builder clearGoalValue() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearGoalValue();
            return this;
        }

        public Builder clearPlanDate() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearPlanDate();
            return this;
        }

        public Builder clearPlanId() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearPlanId();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).clearSportType();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public String getArrangeId() {
            return ((WorkoutProto$CourseDetail) this.instance).getArrangeId();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public ByteString getArrangeIdBytes() {
            return ((WorkoutProto$CourseDetail) this.instance).getArrangeIdBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public String getCourseId() {
            return ((WorkoutProto$CourseDetail) this.instance).getCourseId();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public ByteString getCourseIdBytes() {
            return ((WorkoutProto$CourseDetail) this.instance).getCourseIdBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public String getCourseName() {
            return ((WorkoutProto$CourseDetail) this.instance).getCourseName();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public ByteString getCourseNameBytes() {
            return ((WorkoutProto$CourseDetail) this.instance).getCourseNameBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public String getExtraData() {
            return ((WorkoutProto$CourseDetail) this.instance).getExtraData();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public ByteString getExtraDataBytes() {
            return ((WorkoutProto$CourseDetail) this.instance).getExtraDataBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public int getFinishState() {
            return ((WorkoutProto$CourseDetail) this.instance).getFinishState();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public int getGoalType() {
            return ((WorkoutProto$CourseDetail) this.instance).getGoalType();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public int getGoalValue() {
            return ((WorkoutProto$CourseDetail) this.instance).getGoalValue();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public int getPlanDate() {
            return ((WorkoutProto$CourseDetail) this.instance).getPlanDate();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public String getPlanId() {
            return ((WorkoutProto$CourseDetail) this.instance).getPlanId();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public ByteString getPlanIdBytes() {
            return ((WorkoutProto$CourseDetail) this.instance).getPlanIdBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
        public int getSportType() {
            return ((WorkoutProto$CourseDetail) this.instance).getSportType();
        }

        public Builder setArrangeId(String str) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setArrangeId(str);
            return this;
        }

        public Builder setArrangeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setArrangeIdBytes(byteString);
            return this;
        }

        public Builder setCourseId(String str) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setCourseId(str);
            return this;
        }

        public Builder setCourseIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setCourseIdBytes(byteString);
            return this;
        }

        public Builder setCourseName(String str) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setCourseName(str);
            return this;
        }

        public Builder setCourseNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setCourseNameBytes(byteString);
            return this;
        }

        public Builder setExtraData(String str) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setExtraData(str);
            return this;
        }

        public Builder setExtraDataBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setExtraDataBytes(byteString);
            return this;
        }

        public Builder setFinishState(int i) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setFinishState(i);
            return this;
        }

        public Builder setGoalType(int i) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setGoalType(i);
            return this;
        }

        public Builder setGoalValue(int i) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setGoalValue(i);
            return this;
        }

        public Builder setPlanDate(int i) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setPlanDate(i);
            return this;
        }

        public Builder setPlanId(String str) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setPlanId(str);
            return this;
        }

        public Builder setPlanIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setPlanIdBytes(byteString);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((WorkoutProto$CourseDetail) this.instance).setSportType(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$CourseDetail.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$CourseDetail workoutProto$CourseDetail = new WorkoutProto$CourseDetail();
        DEFAULT_INSTANCE = workoutProto$CourseDetail;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$CourseDetail.class, workoutProto$CourseDetail);
    }

    private WorkoutProto$CourseDetail() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrangeId() {
        this.arrangeId_ = getDefaultInstance().getArrangeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCourseId() {
        this.courseId_ = getDefaultInstance().getCourseId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCourseName() {
        this.courseName_ = getDefaultInstance().getCourseName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraData() {
        this.extraData_ = getDefaultInstance().getExtraData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFinishState() {
        this.finishState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoalType() {
        this.goalType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoalValue() {
        this.goalValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanDate() {
        this.planDate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanId() {
        this.planId_ = getDefaultInstance().getPlanId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    public static WorkoutProto$CourseDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$CourseDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$CourseDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$CourseDetail> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrangeId(String str) {
        str.getClass();
        this.arrangeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrangeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.arrangeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCourseId(String str) {
        str.getClass();
        this.courseId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCourseIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.courseId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCourseName(String str) {
        str.getClass();
        this.courseName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCourseNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.courseName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraData(String str) {
        str.getClass();
        this.extraData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extraData_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFinishState(int i) {
        this.finishState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoalType(int i) {
        this.goalType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoalValue(int i) {
        this.goalValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanDate(int i) {
        this.planDate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanId(String str) {
        str.getClass();
        this.planId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.planId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$CourseDetail();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b\nȈ", new Object[]{"planId_", "arrangeId_", "courseId_", "courseName_", "sportType_", "goalType_", "goalValue_", "planDate_", "finishState_", "extraData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$CourseDetail> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$CourseDetail.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public String getArrangeId() {
        return this.arrangeId_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public ByteString getArrangeIdBytes() {
        return ByteString.copyFromUtf8(this.arrangeId_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public String getCourseId() {
        return this.courseId_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public ByteString getCourseIdBytes() {
        return ByteString.copyFromUtf8(this.courseId_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public String getCourseName() {
        return this.courseName_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public ByteString getCourseNameBytes() {
        return ByteString.copyFromUtf8(this.courseName_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public String getExtraData() {
        return this.extraData_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public ByteString getExtraDataBytes() {
        return ByteString.copyFromUtf8(this.extraData_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public int getFinishState() {
        return this.finishState_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public int getGoalType() {
        return this.goalType_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public int getGoalValue() {
        return this.goalValue_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public int getPlanDate() {
        return this.planDate_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public String getPlanId() {
        return this.planId_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public ByteString getPlanIdBytes() {
        return ByteString.copyFromUtf8(this.planId_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$CourseDetailOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    public static Builder newBuilder(WorkoutProto$CourseDetail workoutProto$CourseDetail) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$CourseDetail);
    }

    public static WorkoutProto$CourseDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$CourseDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$CourseDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$CourseDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$CourseDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$CourseDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$CourseDetail parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$CourseDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$CourseDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$CourseDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$CourseDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
