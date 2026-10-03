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
public final class WorkoutProto$MedalBean extends GeneratedMessageLite<WorkoutProto$MedalBean, Builder> implements WorkoutProto$MedalBeanOrBuilder {
    public static final int BREAKRECORDTIMES_FIELD_NUMBER = 10;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int COLORTYPE_FIELD_NUMBER = 16;
    private static final WorkoutProto$MedalBean DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 12;
    public static final int IMAGEGET_FIELD_NUMBER = 13;
    public static final int IMAGEUNGET_FIELD_NUMBER = 14;
    public static final int LOGICSTATUS_FIELD_NUMBER = 4;
    public static final int MEDALRESURL_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 5;
    public static final int OBTAINSTATUS_FIELD_NUMBER = 7;
    public static final int OBTAINTIME_FIELD_NUMBER = 8;
    private static volatile Parser<WorkoutProto$MedalBean> PARSER = null;
    public static final int RECORDDURATION_FIELD_NUMBER = 11;
    public static final int REMARK_FIELD_NUMBER = 9;
    public static final int SORT_FIELD_NUMBER = 15;
    public static final int STATUS_FIELD_NUMBER = 18;
    public static final int TARGET_FIELD_NUMBER = 3;
    public static final int TYPECODE_FIELD_NUMBER = 2;
    public static final int UNATTAINEDCONTENT_FIELD_NUMBER = 17;
    private int breakRecordTimes_;
    private int colorType_;
    private int display_;
    private int logicStatus_;
    private int obtainStatus_;
    private int obtainTime_;
    private int recordDuration_;
    private int sort_;
    private int status_;
    private String code_ = "";
    private String typeCode_ = "";
    private String target_ = "";
    private String name_ = "";
    private String medalResUrl_ = "";
    private String remark_ = "";
    private String imageGet_ = "";
    private String imageUnget_ = "";
    private String unattainedContent_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$MedalBean, Builder> implements WorkoutProto$MedalBeanOrBuilder {
        public Builder clearBreakRecordTimes() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearBreakRecordTimes();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearCode();
            return this;
        }

        public Builder clearColorType() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearColorType();
            return this;
        }

        public Builder clearDisplay() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearDisplay();
            return this;
        }

        public Builder clearImageGet() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearImageGet();
            return this;
        }

        public Builder clearImageUnget() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearImageUnget();
            return this;
        }

        public Builder clearLogicStatus() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearLogicStatus();
            return this;
        }

        public Builder clearMedalResUrl() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearMedalResUrl();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearName();
            return this;
        }

        public Builder clearObtainStatus() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearObtainStatus();
            return this;
        }

        public Builder clearObtainTime() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearObtainTime();
            return this;
        }

        public Builder clearRecordDuration() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearRecordDuration();
            return this;
        }

        public Builder clearRemark() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearRemark();
            return this;
        }

        public Builder clearSort() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearSort();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearStatus();
            return this;
        }

        public Builder clearTarget() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearTarget();
            return this;
        }

        public Builder clearTypeCode() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearTypeCode();
            return this;
        }

        public Builder clearUnattainedContent() {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).clearUnattainedContent();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getBreakRecordTimes() {
            return ((WorkoutProto$MedalBean) this.instance).getBreakRecordTimes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getCode() {
            return ((WorkoutProto$MedalBean) this.instance).getCode();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getCodeBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getCodeBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getColorType() {
            return ((WorkoutProto$MedalBean) this.instance).getColorType();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getDisplay() {
            return ((WorkoutProto$MedalBean) this.instance).getDisplay();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getImageGet() {
            return ((WorkoutProto$MedalBean) this.instance).getImageGet();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getImageGetBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getImageGetBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getImageUnget() {
            return ((WorkoutProto$MedalBean) this.instance).getImageUnget();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getImageUngetBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getImageUngetBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getLogicStatus() {
            return ((WorkoutProto$MedalBean) this.instance).getLogicStatus();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getMedalResUrl() {
            return ((WorkoutProto$MedalBean) this.instance).getMedalResUrl();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getMedalResUrlBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getMedalResUrlBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getName() {
            return ((WorkoutProto$MedalBean) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getNameBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getObtainStatus() {
            return ((WorkoutProto$MedalBean) this.instance).getObtainStatus();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getObtainTime() {
            return ((WorkoutProto$MedalBean) this.instance).getObtainTime();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getRecordDuration() {
            return ((WorkoutProto$MedalBean) this.instance).getRecordDuration();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getRemark() {
            return ((WorkoutProto$MedalBean) this.instance).getRemark();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getRemarkBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getRemarkBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getSort() {
            return ((WorkoutProto$MedalBean) this.instance).getSort();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public int getStatus() {
            return ((WorkoutProto$MedalBean) this.instance).getStatus();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getTarget() {
            return ((WorkoutProto$MedalBean) this.instance).getTarget();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getTargetBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getTargetBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getTypeCode() {
            return ((WorkoutProto$MedalBean) this.instance).getTypeCode();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getTypeCodeBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getTypeCodeBytes();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public String getUnattainedContent() {
            return ((WorkoutProto$MedalBean) this.instance).getUnattainedContent();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
        public ByteString getUnattainedContentBytes() {
            return ((WorkoutProto$MedalBean) this.instance).getUnattainedContentBytes();
        }

        public Builder setBreakRecordTimes(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setBreakRecordTimes(i);
            return this;
        }

        public Builder setCode(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setCode(str);
            return this;
        }

        public Builder setCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setCodeBytes(byteString);
            return this;
        }

        public Builder setColorType(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setColorType(i);
            return this;
        }

        public Builder setDisplay(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setDisplay(i);
            return this;
        }

        public Builder setImageGet(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setImageGet(str);
            return this;
        }

        public Builder setImageGetBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setImageGetBytes(byteString);
            return this;
        }

        public Builder setImageUnget(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setImageUnget(str);
            return this;
        }

        public Builder setImageUngetBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setImageUngetBytes(byteString);
            return this;
        }

        public Builder setLogicStatus(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setLogicStatus(i);
            return this;
        }

        public Builder setMedalResUrl(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setMedalResUrl(str);
            return this;
        }

        public Builder setMedalResUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setMedalResUrlBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setObtainStatus(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setObtainStatus(i);
            return this;
        }

        public Builder setObtainTime(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setObtainTime(i);
            return this;
        }

        public Builder setRecordDuration(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setRecordDuration(i);
            return this;
        }

        public Builder setRemark(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setRemark(str);
            return this;
        }

        public Builder setRemarkBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setRemarkBytes(byteString);
            return this;
        }

        public Builder setSort(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setSort(i);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setStatus(i);
            return this;
        }

        public Builder setTarget(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setTarget(str);
            return this;
        }

        public Builder setTargetBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setTargetBytes(byteString);
            return this;
        }

        public Builder setTypeCode(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setTypeCode(str);
            return this;
        }

        public Builder setTypeCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setTypeCodeBytes(byteString);
            return this;
        }

        public Builder setUnattainedContent(String str) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setUnattainedContent(str);
            return this;
        }

        public Builder setUnattainedContentBytes(ByteString byteString) {
            copyOnWrite();
            ((WorkoutProto$MedalBean) this.instance).setUnattainedContentBytes(byteString);
            return this;
        }

        private Builder() {
            super(WorkoutProto$MedalBean.DEFAULT_INSTANCE);
        }
    }

    static {
        WorkoutProto$MedalBean workoutProto$MedalBean = new WorkoutProto$MedalBean();
        DEFAULT_INSTANCE = workoutProto$MedalBean;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$MedalBean.class, workoutProto$MedalBean);
    }

    private WorkoutProto$MedalBean() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBreakRecordTimes() {
        this.breakRecordTimes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = getDefaultInstance().getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorType() {
        this.colorType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplay() {
        this.display_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageGet() {
        this.imageGet_ = getDefaultInstance().getImageGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUnget() {
        this.imageUnget_ = getDefaultInstance().getImageUnget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicStatus() {
        this.logicStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedalResUrl() {
        this.medalResUrl_ = getDefaultInstance().getMedalResUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObtainStatus() {
        this.obtainStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObtainTime() {
        this.obtainTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecordDuration() {
        this.recordDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemark() {
        this.remark_ = getDefaultInstance().getRemark();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSort() {
        this.sort_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = getDefaultInstance().getTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeCode() {
        this.typeCode_ = getDefaultInstance().getTypeCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnattainedContent() {
        this.unattainedContent_ = getDefaultInstance().getUnattainedContent();
    }

    public static WorkoutProto$MedalBean getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$MedalBean parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$MedalBean parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$MedalBean> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBreakRecordTimes(int i) {
        this.breakRecordTimes_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(String str) {
        str.getClass();
        this.code_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.code_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorType(int i) {
        this.colorType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplay(int i) {
        this.display_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageGet(String str) {
        str.getClass();
        this.imageGet_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageGetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageGet_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUnget(String str) {
        str.getClass();
        this.imageUnget_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUngetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageUnget_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicStatus(int i) {
        this.logicStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalResUrl(String str) {
        str.getClass();
        this.medalResUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedalResUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.medalResUrl_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObtainStatus(int i) {
        this.obtainStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObtainTime(int i) {
        this.obtainTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordDuration(int i) {
        this.recordDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemark(String str) {
        str.getClass();
        this.remark_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemarkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.remark_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSort(int i) {
        this.sort_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(String str) {
        str.getClass();
        this.target_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.target_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeCode(String str) {
        str.getClass();
        this.typeCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.typeCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnattainedContent(String str) {
        str.getClass();
        this.unattainedContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnattainedContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.unattainedContent_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (yzl.a[methodToInvoke.ordinal()]) {
            case 1:
                return new WorkoutProto$MedalBean();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005Ȉ\u0006Ȉ\u0007\u000b\b\u000b\tȈ\n\u000b\u000b\u000b\f\u000b\rȈ\u000eȈ\u000f\u000b\u0010\u000b\u0011Ȉ\u0012\u000b", new Object[]{"code_", "typeCode_", "target_", "logicStatus_", "name_", "medalResUrl_", "obtainStatus_", "obtainTime_", "remark_", "breakRecordTimes_", "recordDuration_", "display_", "imageGet_", "imageUnget_", "sort_", "colorType_", "unattainedContent_", "status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$MedalBean> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$MedalBean.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getBreakRecordTimes() {
        return this.breakRecordTimes_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getCodeBytes() {
        return ByteString.copyFromUtf8(this.code_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getColorType() {
        return this.colorType_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getDisplay() {
        return this.display_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getImageGet() {
        return this.imageGet_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getImageGetBytes() {
        return ByteString.copyFromUtf8(this.imageGet_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getImageUnget() {
        return this.imageUnget_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getImageUngetBytes() {
        return ByteString.copyFromUtf8(this.imageUnget_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getLogicStatus() {
        return this.logicStatus_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getMedalResUrl() {
        return this.medalResUrl_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getMedalResUrlBytes() {
        return ByteString.copyFromUtf8(this.medalResUrl_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getObtainStatus() {
        return this.obtainStatus_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getObtainTime() {
        return this.obtainTime_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getRecordDuration() {
        return this.recordDuration_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getRemark() {
        return this.remark_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getRemarkBytes() {
        return ByteString.copyFromUtf8(this.remark_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getSort() {
        return this.sort_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getTarget() {
        return this.target_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getTargetBytes() {
        return ByteString.copyFromUtf8(this.target_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getTypeCode() {
        return this.typeCode_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getTypeCodeBytes() {
        return ByteString.copyFromUtf8(this.typeCode_);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public String getUnattainedContent() {
        return this.unattainedContent_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$MedalBeanOrBuilder
    public ByteString getUnattainedContentBytes() {
        return ByteString.copyFromUtf8(this.unattainedContent_);
    }

    public static Builder newBuilder(WorkoutProto$MedalBean workoutProto$MedalBean) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$MedalBean);
    }

    public static WorkoutProto$MedalBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$MedalBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$MedalBean parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WorkoutProto$MedalBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$MedalBean parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$MedalBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$MedalBean parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$MedalBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$MedalBean parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$MedalBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$MedalBean) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
