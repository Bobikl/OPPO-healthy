package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$ScienceInfoItem extends GeneratedMessageLite<FitnessProto$ScienceInfoItem, Builder> implements FitnessProto$ScienceInfoItemOrBuilder {
    private static final FitnessProto$ScienceInfoItem DEFAULT_INSTANCE;
    public static final int INFODETAILLIST_FIELD_NUMBER = 2;
    public static final int INFOTYPE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$ScienceInfoItem> PARSER;
    private Internal.ProtobufList<FitnessProto$ScienceInfoDetail> infoDetailList_ = GeneratedMessageLite.emptyProtobufList();
    private int infoType_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ScienceInfoItem, Builder> implements FitnessProto$ScienceInfoItemOrBuilder {
        private Builder() {
            super(FitnessProto$ScienceInfoItem.DEFAULT_INSTANCE);
        }

        public Builder addAllInfoDetailList(Iterable<? extends FitnessProto$ScienceInfoDetail> iterable) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).addAllInfoDetailList(iterable);
            return this;
        }

        public Builder addInfoDetailList(int i, FitnessProto$ScienceInfoDetail.Builder builder) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).addInfoDetailList(i, builder.build());
            return this;
        }

        public Builder clearInfoDetailList() {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).clearInfoDetailList();
            return this;
        }

        public Builder clearInfoType() {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).clearInfoType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
        public FitnessProto$ScienceInfoDetail getInfoDetailList(int i) {
            return ((FitnessProto$ScienceInfoItem) this.instance).getInfoDetailList(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
        public int getInfoDetailListCount() {
            return ((FitnessProto$ScienceInfoItem) this.instance).getInfoDetailListCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
        public List<FitnessProto$ScienceInfoDetail> getInfoDetailListList() {
            return Collections.unmodifiableList(((FitnessProto$ScienceInfoItem) this.instance).getInfoDetailListList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
        public int getInfoType() {
            return ((FitnessProto$ScienceInfoItem) this.instance).getInfoType();
        }

        public Builder removeInfoDetailList(int i) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).removeInfoDetailList(i);
            return this;
        }

        public Builder setInfoDetailList(int i, FitnessProto$ScienceInfoDetail.Builder builder) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).setInfoDetailList(i, builder.build());
            return this;
        }

        public Builder setInfoType(int i) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).setInfoType(i);
            return this;
        }

        public Builder addInfoDetailList(int i, FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).addInfoDetailList(i, fitnessProto$ScienceInfoDetail);
            return this;
        }

        public Builder setInfoDetailList(int i, FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).setInfoDetailList(i, fitnessProto$ScienceInfoDetail);
            return this;
        }

        public Builder addInfoDetailList(FitnessProto$ScienceInfoDetail.Builder builder) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).addInfoDetailList(builder.build());
            return this;
        }

        public Builder addInfoDetailList(FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
            copyOnWrite();
            ((FitnessProto$ScienceInfoItem) this.instance).addInfoDetailList(fitnessProto$ScienceInfoDetail);
            return this;
        }
    }

    static {
        FitnessProto$ScienceInfoItem fitnessProto$ScienceInfoItem = new FitnessProto$ScienceInfoItem();
        DEFAULT_INSTANCE = fitnessProto$ScienceInfoItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ScienceInfoItem.class, fitnessProto$ScienceInfoItem);
    }

    private FitnessProto$ScienceInfoItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInfoDetailList(Iterable<? extends FitnessProto$ScienceInfoDetail> iterable) {
        ensureInfoDetailListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.infoDetailList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfoDetailList(int i, FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
        fitnessProto$ScienceInfoDetail.getClass();
        ensureInfoDetailListIsMutable();
        this.infoDetailList_.add(i, fitnessProto$ScienceInfoDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoDetailList() {
        this.infoDetailList_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoType() {
        this.infoType_ = 0;
    }

    private void ensureInfoDetailListIsMutable() {
        Internal.ProtobufList<FitnessProto$ScienceInfoDetail> protobufList = this.infoDetailList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.infoDetailList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProto$ScienceInfoItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ScienceInfoItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$ScienceInfoItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInfoDetailList(int i) {
        ensureInfoDetailListIsMutable();
        this.infoDetailList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoDetailList(int i, FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
        fitnessProto$ScienceInfoDetail.getClass();
        ensureInfoDetailListIsMutable();
        this.infoDetailList_.set(i, fitnessProto$ScienceInfoDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoType(int i) {
        this.infoType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ScienceInfoItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"infoType_", "infoDetailList_", FitnessProto$ScienceInfoDetail.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ScienceInfoItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ScienceInfoItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
    public FitnessProto$ScienceInfoDetail getInfoDetailList(int i) {
        return this.infoDetailList_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
    public int getInfoDetailListCount() {
        return this.infoDetailList_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
    public List<FitnessProto$ScienceInfoDetail> getInfoDetailListList() {
        return this.infoDetailList_;
    }

    public FitnessProto$ScienceInfoDetailOrBuilder getInfoDetailListOrBuilder(int i) {
        return this.infoDetailList_.get(i);
    }

    public List<? extends FitnessProto$ScienceInfoDetailOrBuilder> getInfoDetailListOrBuilderList() {
        return this.infoDetailList_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScienceInfoItemOrBuilder
    public int getInfoType() {
        return this.infoType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfoDetailList(FitnessProto$ScienceInfoDetail fitnessProto$ScienceInfoDetail) {
        fitnessProto$ScienceInfoDetail.getClass();
        ensureInfoDetailListIsMutable();
        this.infoDetailList_.add(fitnessProto$ScienceInfoDetail);
    }

    public static Builder newBuilder(FitnessProto$ScienceInfoItem fitnessProto$ScienceInfoItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ScienceInfoItem);
    }

    public static FitnessProto$ScienceInfoItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ScienceInfoItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScienceInfoItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
