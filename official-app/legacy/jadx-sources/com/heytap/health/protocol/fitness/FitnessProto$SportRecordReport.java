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
public final class FitnessProto$SportRecordReport extends GeneratedMessageLite<FitnessProto$SportRecordReport, Builder> implements FitnessProto$SportRecordReportOrBuilder {
    public static final int ACHIEVEPERCENT_FIELD_NUMBER = 15;
    public static final int AVGFREQUENCY_FIELD_NUMBER = 14;
    public static final int AVGHEARTRATE_FIELD_NUMBER = 11;
    public static final int AVGSPEED_FIELD_NUMBER = 12;
    private static final FitnessProto$SportRecordReport DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 5;
    public static final int EXTRA_FIELD_NUMBER = 17;
    public static final int MAXSPEED_FIELD_NUMBER = 13;
    private static volatile Parser<FitnessProto$SportRecordReport> PARSER = null;
    public static final int SPORTID_FIELD_NUMBER = 1;
    public static final int SPORTNAME_FIELD_NUMBER = 3;
    public static final int SPORTTYPE_FIELD_NUMBER = 2;
    public static final int STARTTIME_FIELD_NUMBER = 4;
    public static final int TIMEZONE_FIELD_NUMBER = 16;
    public static final int TOTALCALORIES_FIELD_NUMBER = 9;
    public static final int TOTALDISTANCE_FIELD_NUMBER = 7;
    public static final int TOTALHEIGHT_FIELD_NUMBER = 10;
    public static final int TOTALSTEPS_FIELD_NUMBER = 6;
    public static final int TOTALTIME_FIELD_NUMBER = 8;
    private int achievePercent_;
    private int avgFrequency_;
    private int avgHeartRate_;
    private int avgSpeed_;
    private int endTime_;
    private int maxSpeed_;
    private int sportType_;
    private int startTime_;
    private int totalCalories_;
    private int totalDistance_;
    private int totalHeight_;
    private int totalSteps_;
    private int totalTime_;
    private String sportId_ = "";
    private String sportName_ = "";
    private String timeZone_ = "";
    private String extra_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SportRecordReport, Builder> implements FitnessProto$SportRecordReportOrBuilder {
        public Builder clearAchievePercent() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearAchievePercent();
            return this;
        }

        public Builder clearAvgFrequency() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearAvgFrequency();
            return this;
        }

        public Builder clearAvgHeartRate() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearAvgHeartRate();
            return this;
        }

        public Builder clearAvgSpeed() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearAvgSpeed();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearEndTime();
            return this;
        }

        public Builder clearExtra() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearExtra();
            return this;
        }

        public Builder clearMaxSpeed() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearMaxSpeed();
            return this;
        }

        public Builder clearSportId() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearSportId();
            return this;
        }

        public Builder clearSportName() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearSportName();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearSportType();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearStartTime();
            return this;
        }

        public Builder clearTimeZone() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearTimeZone();
            return this;
        }

        public Builder clearTotalCalories() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearTotalCalories();
            return this;
        }

        public Builder clearTotalDistance() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearTotalDistance();
            return this;
        }

        public Builder clearTotalHeight() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearTotalHeight();
            return this;
        }

        public Builder clearTotalSteps() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearTotalSteps();
            return this;
        }

        public Builder clearTotalTime() {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).clearTotalTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getAchievePercent() {
            return ((FitnessProto$SportRecordReport) this.instance).getAchievePercent();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getAvgFrequency() {
            return ((FitnessProto$SportRecordReport) this.instance).getAvgFrequency();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getAvgHeartRate() {
            return ((FitnessProto$SportRecordReport) this.instance).getAvgHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getAvgSpeed() {
            return ((FitnessProto$SportRecordReport) this.instance).getAvgSpeed();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getEndTime() {
            return ((FitnessProto$SportRecordReport) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public String getExtra() {
            return ((FitnessProto$SportRecordReport) this.instance).getExtra();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public ByteString getExtraBytes() {
            return ((FitnessProto$SportRecordReport) this.instance).getExtraBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getMaxSpeed() {
            return ((FitnessProto$SportRecordReport) this.instance).getMaxSpeed();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public String getSportId() {
            return ((FitnessProto$SportRecordReport) this.instance).getSportId();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public ByteString getSportIdBytes() {
            return ((FitnessProto$SportRecordReport) this.instance).getSportIdBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public String getSportName() {
            return ((FitnessProto$SportRecordReport) this.instance).getSportName();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public ByteString getSportNameBytes() {
            return ((FitnessProto$SportRecordReport) this.instance).getSportNameBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getSportType() {
            return ((FitnessProto$SportRecordReport) this.instance).getSportType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getStartTime() {
            return ((FitnessProto$SportRecordReport) this.instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public String getTimeZone() {
            return ((FitnessProto$SportRecordReport) this.instance).getTimeZone();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public ByteString getTimeZoneBytes() {
            return ((FitnessProto$SportRecordReport) this.instance).getTimeZoneBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getTotalCalories() {
            return ((FitnessProto$SportRecordReport) this.instance).getTotalCalories();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getTotalDistance() {
            return ((FitnessProto$SportRecordReport) this.instance).getTotalDistance();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getTotalHeight() {
            return ((FitnessProto$SportRecordReport) this.instance).getTotalHeight();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getTotalSteps() {
            return ((FitnessProto$SportRecordReport) this.instance).getTotalSteps();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
        public int getTotalTime() {
            return ((FitnessProto$SportRecordReport) this.instance).getTotalTime();
        }

        public Builder setAchievePercent(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setAchievePercent(i);
            return this;
        }

        public Builder setAvgFrequency(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setAvgFrequency(i);
            return this;
        }

        public Builder setAvgHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setAvgHeartRate(i);
            return this;
        }

        public Builder setAvgSpeed(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setAvgSpeed(i);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setEndTime(i);
            return this;
        }

        public Builder setExtra(String str) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setExtra(str);
            return this;
        }

        public Builder setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setExtraBytes(byteString);
            return this;
        }

        public Builder setMaxSpeed(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setMaxSpeed(i);
            return this;
        }

        public Builder setSportId(String str) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setSportId(str);
            return this;
        }

        public Builder setSportIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setSportIdBytes(byteString);
            return this;
        }

        public Builder setSportName(String str) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setSportName(str);
            return this;
        }

        public Builder setSportNameBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setSportNameBytes(byteString);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setSportType(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setStartTime(i);
            return this;
        }

        public Builder setTimeZone(String str) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTimeZone(str);
            return this;
        }

        public Builder setTimeZoneBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTimeZoneBytes(byteString);
            return this;
        }

        public Builder setTotalCalories(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTotalCalories(i);
            return this;
        }

        public Builder setTotalDistance(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTotalDistance(i);
            return this;
        }

        public Builder setTotalHeight(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTotalHeight(i);
            return this;
        }

        public Builder setTotalSteps(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTotalSteps(i);
            return this;
        }

        public Builder setTotalTime(int i) {
            copyOnWrite();
            ((FitnessProto$SportRecordReport) this.instance).setTotalTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SportRecordReport.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SportRecordReport fitnessProto$SportRecordReport = new FitnessProto$SportRecordReport();
        DEFAULT_INSTANCE = fitnessProto$SportRecordReport;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SportRecordReport.class, fitnessProto$SportRecordReport);
    }

    private FitnessProto$SportRecordReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAchievePercent() {
        this.achievePercent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgFrequency() {
        this.avgFrequency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgHeartRate() {
        this.avgHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgSpeed() {
        this.avgSpeed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSpeed() {
        this.maxSpeed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportId() {
        this.sportId_ = getDefaultInstance().getSportId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportName() {
        this.sportName_ = getDefaultInstance().getSportName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        this.timeZone_ = getDefaultInstance().getTimeZone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalCalories() {
        this.totalCalories_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDistance() {
        this.totalDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalHeight() {
        this.totalHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSteps() {
        this.totalSteps_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTime() {
        this.totalTime_ = 0;
    }

    public static FitnessProto$SportRecordReport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SportRecordReport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SportRecordReport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SportRecordReport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAchievePercent(int i) {
        this.achievePercent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgFrequency(int i) {
        this.avgFrequency_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgHeartRate(int i) {
        this.avgHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgSpeed(int i) {
        this.avgSpeed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSpeed(int i) {
        this.maxSpeed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportId(String str) {
        str.getClass();
        this.sportId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sportId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportName(String str) {
        str.getClass();
        this.sportName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sportName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeZone_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalCalories(int i) {
        this.totalCalories_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDistance(int i) {
        this.totalDistance_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalHeight(int i) {
        this.totalHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSteps(int i) {
        this.totalSteps_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTime(int i) {
        this.totalTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (nh7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FitnessProto$SportRecordReport();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b\n\u000b\u000b\u000b\f\u000b\r\u000b\u000e\u000b\u000f\u000b\u0010Ȉ\u0011Ȉ", new Object[]{"sportId_", "sportType_", "sportName_", "startTime_", "endTime_", "totalSteps_", "totalDistance_", "totalTime_", "totalCalories_", "totalHeight_", "avgHeartRate_", "avgSpeed_", "maxSpeed_", "avgFrequency_", "achievePercent_", "timeZone_", "extra_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SportRecordReport> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SportRecordReport.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getAchievePercent() {
        return this.achievePercent_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getAvgFrequency() {
        return this.avgFrequency_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getAvgHeartRate() {
        return this.avgHeartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getAvgSpeed() {
        return this.avgSpeed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public String getExtra() {
        return this.extra_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getMaxSpeed() {
        return this.maxSpeed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public String getSportId() {
        return this.sportId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public ByteString getSportIdBytes() {
        return ByteString.copyFromUtf8(this.sportId_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public String getSportName() {
        return this.sportName_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public ByteString getSportNameBytes() {
        return ByteString.copyFromUtf8(this.sportName_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public String getTimeZone() {
        return this.timeZone_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public ByteString getTimeZoneBytes() {
        return ByteString.copyFromUtf8(this.timeZone_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getTotalCalories() {
        return this.totalCalories_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getTotalDistance() {
        return this.totalDistance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getTotalHeight() {
        return this.totalHeight_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getTotalSteps() {
        return this.totalSteps_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SportRecordReportOrBuilder
    public int getTotalTime() {
        return this.totalTime_;
    }

    public static Builder newBuilder(FitnessProto$SportRecordReport fitnessProto$SportRecordReport) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SportRecordReport);
    }

    public static FitnessProto$SportRecordReport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportRecordReport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SportRecordReport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SportRecordReport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SportRecordReport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SportRecordReport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SportRecordReport parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SportRecordReport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SportRecordReport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SportRecordReport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SportRecordReport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
