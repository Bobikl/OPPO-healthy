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
public final class RecommendProto$purpose_info extends GeneratedMessageLite<RecommendProto$purpose_info, Builder> implements RecommendProto$purpose_infoOrBuilder {
    private static final RecommendProto$purpose_info DEFAULT_INSTANCE;
    public static final int MODIFY_TIMESTAMP_FIELD_NUMBER = 2;
    private static volatile Parser<RecommendProto$purpose_info> PARSER = null;
    public static final int PURPOSE_FIELD_NUMBER = 1;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private int modifyTimestamp_;
    private int purpose_;
    private int source_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$purpose_info, Builder> implements RecommendProto$purpose_infoOrBuilder {
        public Builder clearModifyTimestamp() {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).clearModifyTimestamp();
            return this;
        }

        public Builder clearPurpose() {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).clearPurpose();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).clearSource();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
        public int getModifyTimestamp() {
            return ((RecommendProto$purpose_info) this.instance).getModifyTimestamp();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
        public RecommendProto$GUIDE_SPORTS_PURPOSE getPurpose() {
            return ((RecommendProto$purpose_info) this.instance).getPurpose();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
        public int getPurposeValue() {
            return ((RecommendProto$purpose_info) this.instance).getPurposeValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
        public RecommendProto$MODIFY_SOURCE getSource() {
            return ((RecommendProto$purpose_info) this.instance).getSource();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
        public int getSourceValue() {
            return ((RecommendProto$purpose_info) this.instance).getSourceValue();
        }

        public Builder setModifyTimestamp(int i) {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).setModifyTimestamp(i);
            return this;
        }

        public Builder setPurpose(RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSE) {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).setPurpose(recommendProto$GUIDE_SPORTS_PURPOSE);
            return this;
        }

        public Builder setPurposeValue(int i) {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).setPurposeValue(i);
            return this;
        }

        public Builder setSource(RecommendProto$MODIFY_SOURCE recommendProto$MODIFY_SOURCE) {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).setSource(recommendProto$MODIFY_SOURCE);
            return this;
        }

        public Builder setSourceValue(int i) {
            copyOnWrite();
            ((RecommendProto$purpose_info) this.instance).setSourceValue(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$purpose_info.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$purpose_info recommendProto$purpose_info = new RecommendProto$purpose_info();
        DEFAULT_INSTANCE = recommendProto$purpose_info;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$purpose_info.class, recommendProto$purpose_info);
    }

    private RecommendProto$purpose_info() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifyTimestamp() {
        this.modifyTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPurpose() {
        this.purpose_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static RecommendProto$purpose_info getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$purpose_info parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$purpose_info parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$purpose_info> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifyTimestamp(int i) {
        this.modifyTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurpose(RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSE) {
        this.purpose_ = recommendProto$GUIDE_SPORTS_PURPOSE.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurposeValue(int i) {
        this.purpose_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(RecommendProto$MODIFY_SOURCE recommendProto$MODIFY_SOURCE) {
        this.source_ = recommendProto$MODIFY_SOURCE.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i) {
        this.source_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$purpose_info();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f", new Object[]{"purpose_", "modifyTimestamp_", "source_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$purpose_info> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$purpose_info.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
    public int getModifyTimestamp() {
        return this.modifyTimestamp_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
    public RecommendProto$GUIDE_SPORTS_PURPOSE getPurpose() {
        RecommendProto$GUIDE_SPORTS_PURPOSE recommendProto$GUIDE_SPORTS_PURPOSEForNumber = RecommendProto$GUIDE_SPORTS_PURPOSE.forNumber(this.purpose_);
        return recommendProto$GUIDE_SPORTS_PURPOSEForNumber == null ? RecommendProto$GUIDE_SPORTS_PURPOSE.UNRECOGNIZED : recommendProto$GUIDE_SPORTS_PURPOSEForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
    public int getPurposeValue() {
        return this.purpose_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
    public RecommendProto$MODIFY_SOURCE getSource() {
        RecommendProto$MODIFY_SOURCE recommendProto$MODIFY_SOURCEForNumber = RecommendProto$MODIFY_SOURCE.forNumber(this.source_);
        return recommendProto$MODIFY_SOURCEForNumber == null ? RecommendProto$MODIFY_SOURCE.UNRECOGNIZED : recommendProto$MODIFY_SOURCEForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$purpose_infoOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    public static Builder newBuilder(RecommendProto$purpose_info recommendProto$purpose_info) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$purpose_info);
    }

    public static RecommendProto$purpose_info parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$purpose_info parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$purpose_info parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$purpose_info parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$purpose_info parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$purpose_info parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$purpose_info parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$purpose_info parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$purpose_info parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$purpose_info parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$purpose_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
