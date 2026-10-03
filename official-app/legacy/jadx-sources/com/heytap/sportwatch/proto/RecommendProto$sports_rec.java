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
public final class RecommendProto$sports_rec extends GeneratedMessageLite<RecommendProto$sports_rec, Builder> implements RecommendProto$sports_recOrBuilder {
    public static final int COURSEJSONDATA_FIELD_NUMBER = 4;
    private static final RecommendProto$sports_rec DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int HR_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$sports_rec> PARSER = null;
    public static final int SPORT_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ByteString courseJsonData_ = ByteString.EMPTY;
    private int duration_;
    private RecommendProto$sport_strength hr_;
    private int sportType_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$sports_rec, Builder> implements RecommendProto$sports_recOrBuilder {
        public Builder clearCourseJsonData() {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).clearCourseJsonData();
            return this;
        }

        public Builder clearDuration() {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).clearDuration();
            return this;
        }

        public Builder clearHr() {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).clearHr();
            return this;
        }

        public Builder clearSportType() {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).clearSportType();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
        public ByteString getCourseJsonData() {
            return ((RecommendProto$sports_rec) this.instance).getCourseJsonData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
        public int getDuration() {
            return ((RecommendProto$sports_rec) this.instance).getDuration();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
        public RecommendProto$sport_strength getHr() {
            return ((RecommendProto$sports_rec) this.instance).getHr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
        public int getSportType() {
            return ((RecommendProto$sports_rec) this.instance).getSportType();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
        public boolean hasCourseJsonData() {
            return ((RecommendProto$sports_rec) this.instance).hasCourseJsonData();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
        public boolean hasHr() {
            return ((RecommendProto$sports_rec) this.instance).hasHr();
        }

        public Builder mergeHr(RecommendProto$sport_strength recommendProto$sport_strength) {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).mergeHr(recommendProto$sport_strength);
            return this;
        }

        public Builder setCourseJsonData(ByteString byteString) {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).setCourseJsonData(byteString);
            return this;
        }

        public Builder setDuration(int i) {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).setDuration(i);
            return this;
        }

        public Builder setHr(RecommendProto$sport_strength recommendProto$sport_strength) {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).setHr(recommendProto$sport_strength);
            return this;
        }

        public Builder setSportType(int i) {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).setSportType(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$sports_rec.DEFAULT_INSTANCE);
        }

        public Builder setHr(RecommendProto$sport_strength.Builder builder) {
            copyOnWrite();
            ((RecommendProto$sports_rec) this.instance).setHr(builder.build());
            return this;
        }
    }

    static {
        RecommendProto$sports_rec recommendProto$sports_rec = new RecommendProto$sports_rec();
        DEFAULT_INSTANCE = recommendProto$sports_rec;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$sports_rec.class, recommendProto$sports_rec);
    }

    private RecommendProto$sports_rec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCourseJsonData() {
        this.bitField0_ &= -3;
        this.courseJsonData_ = getDefaultInstance().getCourseJsonData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHr() {
        this.hr_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSportType() {
        this.sportType_ = 0;
    }

    public static RecommendProto$sports_rec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHr(RecommendProto$sport_strength recommendProto$sport_strength) {
        recommendProto$sport_strength.getClass();
        RecommendProto$sport_strength recommendProto$sport_strength2 = this.hr_;
        if (recommendProto$sport_strength2 == null || recommendProto$sport_strength2 == RecommendProto$sport_strength.getDefaultInstance()) {
            this.hr_ = recommendProto$sport_strength;
        } else {
            this.hr_ = RecommendProto$sport_strength.newBuilder(this.hr_).mergeFrom(recommendProto$sport_strength).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$sports_rec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sports_rec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$sports_rec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCourseJsonData(ByteString byteString) {
        byteString.getClass();
        this.bitField0_ |= 2;
        this.courseJsonData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(int i) {
        this.duration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHr(RecommendProto$sport_strength recommendProto$sport_strength) {
        recommendProto$sport_strength.getClass();
        this.hr_ = recommendProto$sport_strength;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSportType(int i) {
        this.sportType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$sports_rec();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b\u0004ည\u0001", new Object[]{"bitField0_", "hr_", "duration_", "sportType_", "courseJsonData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$sports_rec> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$sports_rec.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
    public ByteString getCourseJsonData() {
        return this.courseJsonData_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
    public int getDuration() {
        return this.duration_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
    public RecommendProto$sport_strength getHr() {
        RecommendProto$sport_strength recommendProto$sport_strength = this.hr_;
        return recommendProto$sport_strength == null ? RecommendProto$sport_strength.getDefaultInstance() : recommendProto$sport_strength;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
    public int getSportType() {
        return this.sportType_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
    public boolean hasCourseJsonData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sports_recOrBuilder
    public boolean hasHr() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RecommendProto$sports_rec recommendProto$sports_rec) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$sports_rec);
    }

    public static RecommendProto$sports_rec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sports_rec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$sports_rec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$sports_rec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$sports_rec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$sports_rec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$sports_rec parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sports_rec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sports_rec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$sports_rec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sports_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
