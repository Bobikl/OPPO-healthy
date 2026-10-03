package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$DailyActivityItem extends GeneratedMessageLite<FitnessProto$DailyActivityItem, Builder> implements FitnessProto$DailyActivityItemOrBuilder {
    public static final int ACTIVITY_COUNT_FIELD_NUMBER = 7;
    public static final int CALORIES_FIELD_NUMBER = 6;
    public static final int DATE_FIELD_NUMBER = 3;
    private static final FitnessProto$DailyActivityItem DEFAULT_INSTANCE;
    public static final int EXERCISE_TIME_FIELD_NUMBER = 5;
    private static volatile Parser<FitnessProto$DailyActivityItem> PARSER = null;
    public static final int STEP_COUNT_FIELD_NUMBER = 4;
    public static final int USER_ID_FIELD_NUMBER = 1;
    public static final int USER_NICKNAME_FIELD_NUMBER = 2;
    private int activityCount_;
    private int calories_;
    private int date_;
    private int exerciseTime_;
    private int stepCount_;
    private String userId_ = "";
    private String userNickname_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$DailyActivityItem, Builder> implements FitnessProto$DailyActivityItemOrBuilder {
        public Builder clearActivityCount() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearActivityCount();
            return this;
        }

        public Builder clearCalories() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearCalories();
            return this;
        }

        public Builder clearDate() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearDate();
            return this;
        }

        public Builder clearExerciseTime() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearExerciseTime();
            return this;
        }

        public Builder clearStepCount() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearStepCount();
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearUserId();
            return this;
        }

        public Builder clearUserNickname() {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).clearUserNickname();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public int getActivityCount() {
            return ((FitnessProto$DailyActivityItem) this.instance).getActivityCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public int getCalories() {
            return ((FitnessProto$DailyActivityItem) this.instance).getCalories();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public int getDate() {
            return ((FitnessProto$DailyActivityItem) this.instance).getDate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public int getExerciseTime() {
            return ((FitnessProto$DailyActivityItem) this.instance).getExerciseTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public int getStepCount() {
            return ((FitnessProto$DailyActivityItem) this.instance).getStepCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public String getUserId() {
            return ((FitnessProto$DailyActivityItem) this.instance).getUserId();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public ByteString getUserIdBytes() {
            return ((FitnessProto$DailyActivityItem) this.instance).getUserIdBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public String getUserNickname() {
            return ((FitnessProto$DailyActivityItem) this.instance).getUserNickname();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
        public ByteString getUserNicknameBytes() {
            return ((FitnessProto$DailyActivityItem) this.instance).getUserNicknameBytes();
        }

        public Builder setActivityCount(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setActivityCount(i);
            return this;
        }

        public Builder setCalories(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setCalories(i);
            return this;
        }

        public Builder setDate(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setDate(i);
            return this;
        }

        public Builder setExerciseTime(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setExerciseTime(i);
            return this;
        }

        public Builder setStepCount(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setStepCount(i);
            return this;
        }

        public Builder setUserId(String str) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setUserId(str);
            return this;
        }

        public Builder setUserIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setUserIdBytes(byteString);
            return this;
        }

        public Builder setUserNickname(String str) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setUserNickname(str);
            return this;
        }

        public Builder setUserNicknameBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$DailyActivityItem) this.instance).setUserNicknameBytes(byteString);
            return this;
        }

        private Builder() {
            super(FitnessProto$DailyActivityItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$DailyActivityItem fitnessProto$DailyActivityItem = new FitnessProto$DailyActivityItem();
        DEFAULT_INSTANCE = fitnessProto$DailyActivityItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$DailyActivityItem.class, fitnessProto$DailyActivityItem);
    }

    private FitnessProto$DailyActivityItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCount() {
        this.activityCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalories() {
        this.calories_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseTime() {
        this.exerciseTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStepCount() {
        this.stepCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserNickname() {
        this.userNickname_ = getDefaultInstance().getUserNickname();
    }

    public static FitnessProto$DailyActivityItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$DailyActivityItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$DailyActivityItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$DailyActivityItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCount(int i) {
        this.activityCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalories(int i) {
        this.calories_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(int i) {
        this.date_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTime(int i) {
        this.exerciseTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStepCount(int i) {
        this.stepCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String str) {
        str.getClass();
        this.userId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserNickname(String str) {
        str.getClass();
        this.userNickname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserNicknameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userNickname_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$DailyActivityItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004", new Object[]{"userId_", "userNickname_", "date_", "stepCount_", "exerciseTime_", "calories_", "activityCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$DailyActivityItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$DailyActivityItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public int getActivityCount() {
        return this.activityCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public int getCalories() {
        return this.calories_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public int getDate() {
        return this.date_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public int getExerciseTime() {
        return this.exerciseTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public int getStepCount() {
        return this.stepCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public String getUserId() {
        return this.userId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.userId_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public String getUserNickname() {
        return this.userNickname_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityItemOrBuilder
    public ByteString getUserNicknameBytes() {
        return ByteString.copyFromUtf8(this.userNickname_);
    }

    public static Builder newBuilder(FitnessProto$DailyActivityItem fitnessProto$DailyActivityItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$DailyActivityItem);
    }

    public static FitnessProto$DailyActivityItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$DailyActivityItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$DailyActivityItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$DailyActivityItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$DailyActivityItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DailyActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
