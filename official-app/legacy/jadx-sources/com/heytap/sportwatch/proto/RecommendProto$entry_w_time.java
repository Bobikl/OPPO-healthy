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
public final class RecommendProto$entry_w_time extends GeneratedMessageLite<RecommendProto$entry_w_time, Builder> implements RecommendProto$entry_w_timeOrBuilder {
    private static final RecommendProto$entry_w_time DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 2;
    public static final int ENTRY_FIELD_NUMBER = 4;
    public static final int ENTRY_ID_FIELD_NUMBER = 3;
    private static volatile Parser<RecommendProto$entry_w_time> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int endTime_;
    private int entryId_;
    private RecommendProto$entry_data entry_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$entry_w_time, Builder> implements RecommendProto$entry_w_timeOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).clearEndTime();
            return this;
        }

        public Builder clearEntry() {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).clearEntry();
            return this;
        }

        public Builder clearEntryId() {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).clearEntryId();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
        public int getEndTime() {
            return ((RecommendProto$entry_w_time) this.instance).getEndTime();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
        public RecommendProto$entry_data getEntry() {
            return ((RecommendProto$entry_w_time) this.instance).getEntry();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
        public int getEntryId() {
            return ((RecommendProto$entry_w_time) this.instance).getEntryId();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
        public int getStartTime() {
            return ((RecommendProto$entry_w_time) this.instance).getStartTime();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
        public boolean hasEntry() {
            return ((RecommendProto$entry_w_time) this.instance).hasEntry();
        }

        public Builder mergeEntry(RecommendProto$entry_data recommendProto$entry_data) {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).mergeEntry(recommendProto$entry_data);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).setEndTime(i);
            return this;
        }

        public Builder setEntry(RecommendProto$entry_data recommendProto$entry_data) {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).setEntry(recommendProto$entry_data);
            return this;
        }

        public Builder setEntryId(int i) {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).setEntryId(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$entry_w_time.DEFAULT_INSTANCE);
        }

        public Builder setEntry(RecommendProto$entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$entry_w_time) this.instance).setEntry(builder.build());
            return this;
        }
    }

    static {
        RecommendProto$entry_w_time recommendProto$entry_w_time = new RecommendProto$entry_w_time();
        DEFAULT_INSTANCE = recommendProto$entry_w_time;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$entry_w_time.class, recommendProto$entry_w_time);
    }

    private RecommendProto$entry_w_time() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryId() {
        this.entryId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static RecommendProto$entry_w_time getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEntry(RecommendProto$entry_data recommendProto$entry_data) {
        recommendProto$entry_data.getClass();
        RecommendProto$entry_data recommendProto$entry_data2 = this.entry_;
        if (recommendProto$entry_data2 == null || recommendProto$entry_data2 == RecommendProto$entry_data.getDefaultInstance()) {
            this.entry_ = recommendProto$entry_data;
        } else {
            this.entry_ = RecommendProto$entry_data.newBuilder(this.entry_).mergeFrom(recommendProto$entry_data).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$entry_w_time parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$entry_w_time parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$entry_w_time> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(RecommendProto$entry_data recommendProto$entry_data) {
        recommendProto$entry_data.getClass();
        this.entry_ = recommendProto$entry_data;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryId(int i) {
        this.entryId_ = i;
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
                return new RecommendProto$entry_w_time();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004ဉ\u0000", new Object[]{"bitField0_", "startTime_", "endTime_", "entryId_", "entry_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$entry_w_time> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$entry_w_time.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
    public RecommendProto$entry_data getEntry() {
        RecommendProto$entry_data recommendProto$entry_data = this.entry_;
        return recommendProto$entry_data == null ? RecommendProto$entry_data.getDefaultInstance() : recommendProto$entry_data;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
    public int getEntryId() {
        return this.entryId_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_w_timeOrBuilder
    public boolean hasEntry() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RecommendProto$entry_w_time recommendProto$entry_w_time) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$entry_w_time);
    }

    public static RecommendProto$entry_w_time parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$entry_w_time parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$entry_w_time parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$entry_w_time parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$entry_w_time parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$entry_w_time parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$entry_w_time parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$entry_w_time parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$entry_w_time parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$entry_w_time parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_w_time) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
