package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$AchievementExpand extends GeneratedMessageLite<FitnessProtoV2$AchievementExpand, Builder> implements FitnessProtoV2$AchievementExpandOrBuilder {
    public static final int CALORIE_FIELD_NUMBER = 10;
    public static final int CALORIE_GOAL_FIELD_NUMBER = 11;
    private static final FitnessProtoV2$AchievementExpand DEFAULT_INSTANCE;
    public static final int EXERCISE_DURATION_FIELD_NUMBER = 8;
    public static final int EXERCISE_DURATION_GOAL_FIELD_NUMBER = 9;
    public static final int IS_SKIP_TODAY_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$AchievementExpand> PARSER = null;
    public static final int REGULAR_BEDTIME_FIELD_NUMBER = 6;
    public static final int REGULAR_BEDTIME_GOAL_FIELD_NUMBER = 7;
    public static final int SKIP_TODAY_REASON_FIELD_NUMBER = 2;
    public static final int SUNSHINE_DURATION_FIELD_NUMBER = 4;
    public static final int SUNSHINE_DURATION_GOAL_FIELD_NUMBER = 5;
    public static final int TARGET_DISPLAY_CONFIG_FIELD_NUMBER = 3;
    private static final Internal.ListAdapter.Converter<Integer, FitnessProtoV2$AchievementType> targetDisplayConfig_converter_ = new a();
    private int calorieGoal_;
    private int calorie_;
    private int exerciseDurationGoal_;
    private int exerciseDuration_;
    private int isSkipToday_;
    private int regularBedtimeGoal_;
    private int regularBedtime_;
    private int skipTodayReason_;
    private int sunshineDurationGoal_;
    private int sunshineDuration_;
    private int targetDisplayConfigMemoizedSerializedSize;
    private Internal.IntList targetDisplayConfig_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$AchievementExpand, Builder> implements FitnessProtoV2$AchievementExpandOrBuilder {
        public Builder addAllTargetDisplayConfig(Iterable<? extends FitnessProtoV2$AchievementType> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).addAllTargetDisplayConfig(iterable);
            return this;
        }

        public Builder addAllTargetDisplayConfigValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).addAllTargetDisplayConfigValue(iterable);
            return this;
        }

        public Builder addTargetDisplayConfig(FitnessProtoV2$AchievementType fitnessProtoV2$AchievementType) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).addTargetDisplayConfig(fitnessProtoV2$AchievementType);
            return this;
        }

        public Builder addTargetDisplayConfigValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).addTargetDisplayConfigValue(i);
            return this;
        }

        public Builder clearCalorie() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearCalorie();
            return this;
        }

        public Builder clearCalorieGoal() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearCalorieGoal();
            return this;
        }

        public Builder clearExerciseDuration() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearExerciseDuration();
            return this;
        }

        public Builder clearExerciseDurationGoal() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearExerciseDurationGoal();
            return this;
        }

        public Builder clearIsSkipToday() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearIsSkipToday();
            return this;
        }

        public Builder clearRegularBedtime() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearRegularBedtime();
            return this;
        }

        public Builder clearRegularBedtimeGoal() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearRegularBedtimeGoal();
            return this;
        }

        public Builder clearSkipTodayReason() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearSkipTodayReason();
            return this;
        }

        public Builder clearSunshineDuration() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearSunshineDuration();
            return this;
        }

        public Builder clearSunshineDurationGoal() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearSunshineDurationGoal();
            return this;
        }

        public Builder clearTargetDisplayConfig() {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).clearTargetDisplayConfig();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getCalorie() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getCalorieGoal() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getCalorieGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getExerciseDuration() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getExerciseDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getExerciseDurationGoal() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getExerciseDurationGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getIsSkipToday() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getIsSkipToday();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getRegularBedtime() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getRegularBedtime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getRegularBedtimeGoal() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getRegularBedtimeGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getSkipTodayReason() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getSkipTodayReason();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getSunshineDuration() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getSunshineDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getSunshineDurationGoal() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getSunshineDurationGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public FitnessProtoV2$AchievementType getTargetDisplayConfig(int i) {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getTargetDisplayConfig(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getTargetDisplayConfigCount() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getTargetDisplayConfigCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public List<FitnessProtoV2$AchievementType> getTargetDisplayConfigList() {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getTargetDisplayConfigList();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public int getTargetDisplayConfigValue(int i) {
            return ((FitnessProtoV2$AchievementExpand) this.instance).getTargetDisplayConfigValue(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
        public List<Integer> getTargetDisplayConfigValueList() {
            return Collections.unmodifiableList(((FitnessProtoV2$AchievementExpand) this.instance).getTargetDisplayConfigValueList());
        }

        public Builder setCalorie(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setCalorie(i);
            return this;
        }

        public Builder setCalorieGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setCalorieGoal(i);
            return this;
        }

        public Builder setExerciseDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setExerciseDuration(i);
            return this;
        }

        public Builder setExerciseDurationGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setExerciseDurationGoal(i);
            return this;
        }

        public Builder setIsSkipToday(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setIsSkipToday(i);
            return this;
        }

        public Builder setRegularBedtime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setRegularBedtime(i);
            return this;
        }

        public Builder setRegularBedtimeGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setRegularBedtimeGoal(i);
            return this;
        }

        public Builder setSkipTodayReason(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setSkipTodayReason(i);
            return this;
        }

        public Builder setSunshineDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setSunshineDuration(i);
            return this;
        }

        public Builder setSunshineDurationGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setSunshineDurationGoal(i);
            return this;
        }

        public Builder setTargetDisplayConfig(int i, FitnessProtoV2$AchievementType fitnessProtoV2$AchievementType) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setTargetDisplayConfig(i, fitnessProtoV2$AchievementType);
            return this;
        }

        public Builder setTargetDisplayConfigValue(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$AchievementExpand) this.instance).setTargetDisplayConfigValue(i, i2);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$AchievementExpand.DEFAULT_INSTANCE);
        }
    }

    public class a implements Internal.ListAdapter.Converter<Integer, FitnessProtoV2$AchievementType> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FitnessProtoV2$AchievementType convert(Integer num) {
            FitnessProtoV2$AchievementType fitnessProtoV2$AchievementTypeForNumber = FitnessProtoV2$AchievementType.forNumber(num.intValue());
            return fitnessProtoV2$AchievementTypeForNumber == null ? FitnessProtoV2$AchievementType.UNRECOGNIZED : fitnessProtoV2$AchievementTypeForNumber;
        }
    }

    static {
        FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand = new FitnessProtoV2$AchievementExpand();
        DEFAULT_INSTANCE = fitnessProtoV2$AchievementExpand;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$AchievementExpand.class, fitnessProtoV2$AchievementExpand);
    }

    private FitnessProtoV2$AchievementExpand() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetDisplayConfig(Iterable<? extends FitnessProtoV2$AchievementType> iterable) {
        ensureTargetDisplayConfigIsMutable();
        Iterator<? extends FitnessProtoV2$AchievementType> it = iterable.iterator();
        while (it.hasNext()) {
            this.targetDisplayConfig_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetDisplayConfigValue(Iterable<Integer> iterable) {
        ensureTargetDisplayConfigIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.targetDisplayConfig_.addInt(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetDisplayConfig(FitnessProtoV2$AchievementType fitnessProtoV2$AchievementType) {
        fitnessProtoV2$AchievementType.getClass();
        ensureTargetDisplayConfigIsMutable();
        this.targetDisplayConfig_.addInt(fitnessProtoV2$AchievementType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetDisplayConfigValue(int i) {
        ensureTargetDisplayConfigIsMutable();
        this.targetDisplayConfig_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalorie() {
        this.calorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalorieGoal() {
        this.calorieGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseDuration() {
        this.exerciseDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseDurationGoal() {
        this.exerciseDurationGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSkipToday() {
        this.isSkipToday_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularBedtime() {
        this.regularBedtime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularBedtimeGoal() {
        this.regularBedtimeGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipTodayReason() {
        this.skipTodayReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSunshineDuration() {
        this.sunshineDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSunshineDurationGoal() {
        this.sunshineDurationGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetDisplayConfig() {
        this.targetDisplayConfig_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureTargetDisplayConfigIsMutable() {
        Internal.IntList intList = this.targetDisplayConfig_;
        if (intList.isModifiable()) {
            return;
        }
        this.targetDisplayConfig_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static FitnessProtoV2$AchievementExpand getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$AchievementExpand parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$AchievementExpand> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalorie(int i) {
        this.calorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalorieGoal(int i) {
        this.calorieGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseDuration(int i) {
        this.exerciseDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseDurationGoal(int i) {
        this.exerciseDurationGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSkipToday(int i) {
        this.isSkipToday_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularBedtime(int i) {
        this.regularBedtime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularBedtimeGoal(int i) {
        this.regularBedtimeGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipTodayReason(int i) {
        this.skipTodayReason_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSunshineDuration(int i) {
        this.sunshineDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSunshineDurationGoal(int i) {
        this.sunshineDurationGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetDisplayConfig(int i, FitnessProtoV2$AchievementType fitnessProtoV2$AchievementType) {
        fitnessProtoV2$AchievementType.getClass();
        ensureTargetDisplayConfigIsMutable();
        this.targetDisplayConfig_.setInt(i, fitnessProtoV2$AchievementType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetDisplayConfigValue(int i, int i2) {
        ensureTargetDisplayConfigIsMutable();
        this.targetDisplayConfig_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$AchievementExpand();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003,\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b\n\u000b\u000b\u000b", new Object[]{"isSkipToday_", "skipTodayReason_", "targetDisplayConfig_", "sunshineDuration_", "sunshineDurationGoal_", "regularBedtime_", "regularBedtimeGoal_", "exerciseDuration_", "exerciseDurationGoal_", "calorie_", "calorieGoal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$AchievementExpand> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$AchievementExpand.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getCalorie() {
        return this.calorie_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getCalorieGoal() {
        return this.calorieGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getExerciseDuration() {
        return this.exerciseDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getExerciseDurationGoal() {
        return this.exerciseDurationGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getIsSkipToday() {
        return this.isSkipToday_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getRegularBedtime() {
        return this.regularBedtime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getRegularBedtimeGoal() {
        return this.regularBedtimeGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getSkipTodayReason() {
        return this.skipTodayReason_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getSunshineDuration() {
        return this.sunshineDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getSunshineDurationGoal() {
        return this.sunshineDurationGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public FitnessProtoV2$AchievementType getTargetDisplayConfig(int i) {
        FitnessProtoV2$AchievementType fitnessProtoV2$AchievementTypeForNumber = FitnessProtoV2$AchievementType.forNumber(this.targetDisplayConfig_.getInt(i));
        return fitnessProtoV2$AchievementTypeForNumber == null ? FitnessProtoV2$AchievementType.UNRECOGNIZED : fitnessProtoV2$AchievementTypeForNumber;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getTargetDisplayConfigCount() {
        return this.targetDisplayConfig_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public List<FitnessProtoV2$AchievementType> getTargetDisplayConfigList() {
        return new Internal.ListAdapter(this.targetDisplayConfig_, targetDisplayConfig_converter_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public int getTargetDisplayConfigValue(int i) {
        return this.targetDisplayConfig_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementExpandOrBuilder
    public List<Integer> getTargetDisplayConfigValueList() {
        return this.targetDisplayConfig_;
    }

    public static Builder newBuilder(FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$AchievementExpand);
    }

    public static FitnessProtoV2$AchievementExpand parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$AchievementExpand parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$AchievementExpand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
