package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.z23;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CardiovascularProto$EcgHistoryInfo extends GeneratedMessageLite<CardiovascularProto$EcgHistoryInfo, Builder> implements CardiovascularProto$EcgHistoryInfoOrBuilder {
    private static final CardiovascularProto$EcgHistoryInfo DEFAULT_INSTANCE;
    public static final int ECGRESULT_FIELD_NUMBER = 1;
    private static volatile Parser<CardiovascularProto$EcgHistoryInfo> PARSER = null;
    public static final int STATELIST_FIELD_NUMBER = 2;
    private int ecgResult_;
    private Internal.ProtobufList<CardiovascularProto$TimeToIntValueInfo> stateList_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$EcgHistoryInfo, Builder> implements CardiovascularProto$EcgHistoryInfoOrBuilder {
        public Builder addAllStateList(Iterable<? extends CardiovascularProto$TimeToIntValueInfo> iterable) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).addAllStateList(iterable);
            return this;
        }

        public Builder addStateList(CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).addStateList(cardiovascularProto$TimeToIntValueInfo);
            return this;
        }

        public Builder clearEcgResult() {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).clearEcgResult();
            return this;
        }

        public Builder clearStateList() {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).clearStateList();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
        public int getEcgResult() {
            return ((CardiovascularProto$EcgHistoryInfo) this.instance).getEcgResult();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
        public CardiovascularProto$TimeToIntValueInfo getStateList(int i) {
            return ((CardiovascularProto$EcgHistoryInfo) this.instance).getStateList(i);
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
        public int getStateListCount() {
            return ((CardiovascularProto$EcgHistoryInfo) this.instance).getStateListCount();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
        public List<CardiovascularProto$TimeToIntValueInfo> getStateListList() {
            return Collections.unmodifiableList(((CardiovascularProto$EcgHistoryInfo) this.instance).getStateListList());
        }

        public Builder removeStateList(int i) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).removeStateList(i);
            return this;
        }

        public Builder setEcgResult(int i) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).setEcgResult(i);
            return this;
        }

        public Builder setStateList(int i, CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).setStateList(i, cardiovascularProto$TimeToIntValueInfo);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$EcgHistoryInfo.DEFAULT_INSTANCE);
        }

        public Builder addStateList(int i, CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).addStateList(i, cardiovascularProto$TimeToIntValueInfo);
            return this;
        }

        public Builder setStateList(int i, CardiovascularProto$TimeToIntValueInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).setStateList(i, builder.build());
            return this;
        }

        public Builder addStateList(CardiovascularProto$TimeToIntValueInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).addStateList(builder.build());
            return this;
        }

        public Builder addStateList(int i, CardiovascularProto$TimeToIntValueInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$EcgHistoryInfo) this.instance).addStateList(i, builder.build());
            return this;
        }
    }

    static {
        CardiovascularProto$EcgHistoryInfo cardiovascularProto$EcgHistoryInfo = new CardiovascularProto$EcgHistoryInfo();
        DEFAULT_INSTANCE = cardiovascularProto$EcgHistoryInfo;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$EcgHistoryInfo.class, cardiovascularProto$EcgHistoryInfo);
    }

    private CardiovascularProto$EcgHistoryInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStateList(Iterable<? extends CardiovascularProto$TimeToIntValueInfo> iterable) {
        ensureStateListIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stateList_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStateList(CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
        cardiovascularProto$TimeToIntValueInfo.getClass();
        ensureStateListIsMutable();
        this.stateList_.add(cardiovascularProto$TimeToIntValueInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcgResult() {
        this.ecgResult_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateList() {
        this.stateList_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStateListIsMutable() {
        Internal.ProtobufList<CardiovascularProto$TimeToIntValueInfo> protobufList = this.stateList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.stateList_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CardiovascularProto$EcgHistoryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$EcgHistoryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$EcgHistoryInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStateList(int i) {
        ensureStateListIsMutable();
        this.stateList_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgResult(int i) {
        this.ecgResult_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateList(int i, CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
        cardiovascularProto$TimeToIntValueInfo.getClass();
        ensureStateListIsMutable();
        this.stateList_.set(i, cardiovascularProto$TimeToIntValueInfo);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z23.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CardiovascularProto$EcgHistoryInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"ecgResult_", "stateList_", CardiovascularProto$TimeToIntValueInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$EcgHistoryInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$EcgHistoryInfo.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
    public int getEcgResult() {
        return this.ecgResult_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
    public CardiovascularProto$TimeToIntValueInfo getStateList(int i) {
        return this.stateList_.get(i);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
    public int getStateListCount() {
        return this.stateList_.size();
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$EcgHistoryInfoOrBuilder
    public List<CardiovascularProto$TimeToIntValueInfo> getStateListList() {
        return this.stateList_;
    }

    public CardiovascularProto$TimeToIntValueInfoOrBuilder getStateListOrBuilder(int i) {
        return this.stateList_.get(i);
    }

    public List<? extends CardiovascularProto$TimeToIntValueInfoOrBuilder> getStateListOrBuilderList() {
        return this.stateList_;
    }

    public static Builder newBuilder(CardiovascularProto$EcgHistoryInfo cardiovascularProto$EcgHistoryInfo) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$EcgHistoryInfo);
    }

    public static CardiovascularProto$EcgHistoryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStateList(int i, CardiovascularProto$TimeToIntValueInfo cardiovascularProto$TimeToIntValueInfo) {
        cardiovascularProto$TimeToIntValueInfo.getClass();
        ensureStateListIsMutable();
        this.stateList_.add(i, cardiovascularProto$TimeToIntValueInfo);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$EcgHistoryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$EcgHistoryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
