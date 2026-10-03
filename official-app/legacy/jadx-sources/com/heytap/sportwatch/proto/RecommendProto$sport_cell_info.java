package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$sport_cell_info extends GeneratedMessageLite<RecommendProto$sport_cell_info, Builder> implements RecommendProto$sport_cell_infoOrBuilder {
    public static final int AVG_HR_FIELD_NUMBER = 4;
    private static final RecommendProto$sport_cell_info DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int KCAL_FIELD_NUMBER = 5;
    private static volatile Parser<RecommendProto$sport_cell_info> PARSER = null;
    public static final int SPORT_MODE_FIELD_NUMBER = 2;
    public static final int SPORT_STRENGTH_FIELD_NUMBER = 6;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int avgHr_;
    private int duration_;
    private int kcal_;
    private int sportMode_;
    private int sportStrength_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$sport_cell_info, Builder> implements RecommendProto$sport_cell_infoOrBuilder {
        public Builder clearAvgHr() {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).clearAvgHr();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).clearDuration();
            return this;
        }

        public Builder clearKcal() {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).clearKcal();
            return this;
        }

        public Builder clearSportMode() {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).clearSportMode();
            return this;
        }

        public Builder clearSportStrength() {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).clearSportStrength();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public int getAvgHr() {
            return ((RecommendProto$sport_cell_info) this.instance).getAvgHr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public int getDuration() {
            return ((RecommendProto$sport_cell_info) this.instance).getDuration();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public int getKcal() {
            return ((RecommendProto$sport_cell_info) this.instance).getKcal();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public int getSportMode() {
            return ((RecommendProto$sport_cell_info) this.instance).getSportMode();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public RecommendProto$MOTION_POST_SPORTS_STATUS getSportStrength() {
            return ((RecommendProto$sport_cell_info) this.instance).getSportStrength();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public int getSportStrengthValue() {
            return ((RecommendProto$sport_cell_info) this.instance).getSportStrengthValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
        public int getStartTime() {
            return ((RecommendProto$sport_cell_info) this.instance).getStartTime();
        }

        public Builder setAvgHr(int i) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setAvgHr(i);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setDuration(i);
            return this;
        }

        public Builder setKcal(int i) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setKcal(i);
            return this;
        }

        public Builder setSportMode(int i) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setSportMode(i);
            return this;
        }

        public Builder setSportStrength(RecommendProto$MOTION_POST_SPORTS_STATUS recommendProto$MOTION_POST_SPORTS_STATUS) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setSportStrength(recommendProto$MOTION_POST_SPORTS_STATUS);
            return this;
        }

        public Builder setSportStrengthValue(int i) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setSportStrengthValue(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((RecommendProto$sport_cell_info) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$sport_cell_info.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$sport_cell_info recommendProto$sport_cell_info = new RecommendProto$sport_cell_info();
        DEFAULT_INSTANCE = recommendProto$sport_cell_info;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$sport_cell_info.class, recommendProto$sport_cell_info);
    }

    private RecommendProto$sport_cell_info() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgHr() {
        this.avgHr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKcal() {
        this.kcal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportMode() {
        this.sportMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportStrength() {
        this.sportStrength_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static RecommendProto$sport_cell_info getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$sport_cell_info parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sport_cell_info parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$sport_cell_info> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgHr(int i) {
        this.avgHr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKcal(int i) {
        this.kcal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportMode(int i) {
        this.sportMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportStrength(RecommendProto$MOTION_POST_SPORTS_STATUS recommendProto$MOTION_POST_SPORTS_STATUS) {
        this.sportStrength_ = recommendProto$MOTION_POST_SPORTS_STATUS.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportStrengthValue(int i) {
        this.sportStrength_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$sport_cell_info();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\f", new Object[]{"startTime_", "sportMode_", "duration_", "avgHr_", "kcal_", "sportStrength_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$sport_cell_info> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$sport_cell_info.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public int getAvgHr() {
        return this.avgHr_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public int getKcal() {
        return this.kcal_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public int getSportMode() {
        return this.sportMode_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public RecommendProto$MOTION_POST_SPORTS_STATUS getSportStrength() {
        RecommendProto$MOTION_POST_SPORTS_STATUS recommendProto$MOTION_POST_SPORTS_STATUSForNumber = RecommendProto$MOTION_POST_SPORTS_STATUS.forNumber(this.sportStrength_);
        return recommendProto$MOTION_POST_SPORTS_STATUSForNumber == null ? RecommendProto$MOTION_POST_SPORTS_STATUS.UNRECOGNIZED : recommendProto$MOTION_POST_SPORTS_STATUSForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public int getSportStrengthValue() {
        return this.sportStrength_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_cell_infoOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$sport_cell_info);
    }

    public static RecommendProto$sport_cell_info parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sport_cell_info parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$sport_cell_info parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$sport_cell_info parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$sport_cell_info parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$sport_cell_info parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$sport_cell_info parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sport_cell_info parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sport_cell_info parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$sport_cell_info parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_cell_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
