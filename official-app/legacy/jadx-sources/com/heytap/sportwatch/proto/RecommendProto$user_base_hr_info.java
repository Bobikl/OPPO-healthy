package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$user_base_hr_info extends GeneratedMessageLite<RecommendProto$user_base_hr_info, Builder> implements RecommendProto$user_base_hr_infoOrBuilder {
    private static final RecommendProto$user_base_hr_info DEFAULT_INSTANCE;
    public static final int HR_SEC_FIELD_NUMBER = 3;
    public static final int MAX_HR_FIELD_NUMBER = 2;
    private static volatile Parser<RecommendProto$user_base_hr_info> PARSER = null;
    public static final int REST_HR_FIELD_NUMBER = 1;
    private int hrSecMemoizedSerializedSize = -1;
    private Internal.IntList hrSec_ = GeneratedMessageLite.emptyIntList();
    private int maxHr_;
    private int restHr_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$user_base_hr_info, Builder> implements RecommendProto$user_base_hr_infoOrBuilder {
        public Builder addAllHrSec(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).addAllHrSec(iterable);
            return this;
        }

        public Builder addHrSec(int i) {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).addHrSec(i);
            return this;
        }

        public Builder clearHrSec() {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).clearHrSec();
            return this;
        }

        public Builder clearMaxHr() {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).clearMaxHr();
            return this;
        }

        public Builder clearRestHr() {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).clearRestHr();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
        public int getHrSec(int i) {
            return ((RecommendProto$user_base_hr_info) this.instance).getHrSec(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
        public int getHrSecCount() {
            return ((RecommendProto$user_base_hr_info) this.instance).getHrSecCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
        public List<Integer> getHrSecList() {
            return Collections.unmodifiableList(((RecommendProto$user_base_hr_info) this.instance).getHrSecList());
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
        public int getMaxHr() {
            return ((RecommendProto$user_base_hr_info) this.instance).getMaxHr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
        public int getRestHr() {
            return ((RecommendProto$user_base_hr_info) this.instance).getRestHr();
        }

        public Builder setHrSec(int i, int i2) {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).setHrSec(i, i2);
            return this;
        }

        public Builder setMaxHr(int i) {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).setMaxHr(i);
            return this;
        }

        public Builder setRestHr(int i) {
            copyOnWrite();
            ((RecommendProto$user_base_hr_info) this.instance).setRestHr(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$user_base_hr_info.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$user_base_hr_info recommendProto$user_base_hr_info = new RecommendProto$user_base_hr_info();
        DEFAULT_INSTANCE = recommendProto$user_base_hr_info;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$user_base_hr_info.class, recommendProto$user_base_hr_info);
    }

    private RecommendProto$user_base_hr_info() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrSec(Iterable<? extends Integer> iterable) {
        ensureHrSecIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrSec_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrSec(int i) {
        ensureHrSecIsMutable();
        this.hrSec_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrSec() {
        this.hrSec_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxHr() {
        this.maxHr_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestHr() {
        this.restHr_ = 0;
    }

    private void ensureHrSecIsMutable() {
        Internal.IntList intList = this.hrSec_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrSec_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static RecommendProto$user_base_hr_info getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$user_base_hr_info parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$user_base_hr_info parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$user_base_hr_info> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrSec(int i, int i2) {
        ensureHrSecIsMutable();
        this.hrSec_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxHr(int i) {
        this.maxHr_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestHr(int i) {
        this.restHr_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$user_base_hr_info();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003+", new Object[]{"restHr_", "maxHr_", "hrSec_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$user_base_hr_info> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$user_base_hr_info.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
    public int getHrSec(int i) {
        return this.hrSec_.getInt(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
    public int getHrSecCount() {
        return this.hrSec_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
    public List<Integer> getHrSecList() {
        return this.hrSec_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
    public int getMaxHr() {
        return this.maxHr_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$user_base_hr_infoOrBuilder
    public int getRestHr() {
        return this.restHr_;
    }

    public static Builder newBuilder(RecommendProto$user_base_hr_info recommendProto$user_base_hr_info) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$user_base_hr_info);
    }

    public static RecommendProto$user_base_hr_info parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$user_base_hr_info parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$user_base_hr_info parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$user_base_hr_info parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$user_base_hr_info parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$user_base_hr_info parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$user_base_hr_info parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$user_base_hr_info parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$user_base_hr_info parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$user_base_hr_info parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$user_base_hr_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
