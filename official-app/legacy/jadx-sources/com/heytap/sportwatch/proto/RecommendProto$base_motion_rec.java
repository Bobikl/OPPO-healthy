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
public final class RecommendProto$base_motion_rec extends GeneratedMessageLite<RecommendProto$base_motion_rec, Builder> implements RecommendProto$base_motion_recOrBuilder {
    private static final RecommendProto$base_motion_rec DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int HR_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$base_motion_rec> PARSER;
    private int bitField0_;
    private RecommendProto$dur_section duration_;
    private RecommendProto$sport_strength hr_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$base_motion_rec, Builder> implements RecommendProto$base_motion_recOrBuilder {
        public Builder clearDuration() {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).clearDuration();
            return this;
        }

        public Builder clearHr() {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).clearHr();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
        public RecommendProto$dur_section getDuration() {
            return ((RecommendProto$base_motion_rec) this.instance).getDuration();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
        public RecommendProto$sport_strength getHr() {
            return ((RecommendProto$base_motion_rec) this.instance).getHr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
        public boolean hasDuration() {
            return ((RecommendProto$base_motion_rec) this.instance).hasDuration();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
        public boolean hasHr() {
            return ((RecommendProto$base_motion_rec) this.instance).hasHr();
        }

        public Builder mergeDuration(RecommendProto$dur_section recommendProto$dur_section) {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).mergeDuration(recommendProto$dur_section);
            return this;
        }

        public Builder mergeHr(RecommendProto$sport_strength recommendProto$sport_strength) {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).mergeHr(recommendProto$sport_strength);
            return this;
        }

        public Builder setDuration(RecommendProto$dur_section recommendProto$dur_section) {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).setDuration(recommendProto$dur_section);
            return this;
        }

        public Builder setHr(RecommendProto$sport_strength recommendProto$sport_strength) {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).setHr(recommendProto$sport_strength);
            return this;
        }

        private Builder() {
            super(RecommendProto$base_motion_rec.DEFAULT_INSTANCE);
        }

        public Builder setDuration(RecommendProto$dur_section.Builder builder) {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).setDuration(builder.build());
            return this;
        }

        public Builder setHr(RecommendProto$sport_strength.Builder builder) {
            copyOnWrite();
            ((RecommendProto$base_motion_rec) this.instance).setHr(builder.build());
            return this;
        }
    }

    static {
        RecommendProto$base_motion_rec recommendProto$base_motion_rec = new RecommendProto$base_motion_rec();
        DEFAULT_INSTANCE = recommendProto$base_motion_rec;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$base_motion_rec.class, recommendProto$base_motion_rec);
    }

    private RecommendProto$base_motion_rec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHr() {
        this.hr_ = null;
        this.bitField0_ &= -2;
    }

    public static RecommendProto$base_motion_rec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDuration(RecommendProto$dur_section recommendProto$dur_section) {
        recommendProto$dur_section.getClass();
        RecommendProto$dur_section recommendProto$dur_section2 = this.duration_;
        if (recommendProto$dur_section2 == null || recommendProto$dur_section2 == RecommendProto$dur_section.getDefaultInstance()) {
            this.duration_ = recommendProto$dur_section;
        } else {
            this.duration_ = RecommendProto$dur_section.newBuilder(this.duration_).mergeFrom(recommendProto$dur_section).buildPartial();
        }
        this.bitField0_ |= 2;
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

    public static RecommendProto$base_motion_rec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$base_motion_rec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$base_motion_rec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(RecommendProto$dur_section recommendProto$dur_section) {
        recommendProto$dur_section.getClass();
        this.duration_ = recommendProto$dur_section;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHr(RecommendProto$sport_strength recommendProto$sport_strength) {
        recommendProto$sport_strength.getClass();
        this.hr_ = recommendProto$sport_strength;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$base_motion_rec();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "hr_", "duration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$base_motion_rec> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$base_motion_rec.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
    public RecommendProto$dur_section getDuration() {
        RecommendProto$dur_section recommendProto$dur_section = this.duration_;
        return recommendProto$dur_section == null ? RecommendProto$dur_section.getDefaultInstance() : recommendProto$dur_section;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
    public RecommendProto$sport_strength getHr() {
        RecommendProto$sport_strength recommendProto$sport_strength = this.hr_;
        return recommendProto$sport_strength == null ? RecommendProto$sport_strength.getDefaultInstance() : recommendProto$sport_strength;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
    public boolean hasDuration() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$base_motion_recOrBuilder
    public boolean hasHr() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RecommendProto$base_motion_rec recommendProto$base_motion_rec) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$base_motion_rec);
    }

    public static RecommendProto$base_motion_rec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$base_motion_rec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$base_motion_rec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$base_motion_rec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$base_motion_rec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$base_motion_rec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$base_motion_rec parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$base_motion_rec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$base_motion_rec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$base_motion_rec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$base_motion_rec) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
