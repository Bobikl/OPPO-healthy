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
public final class RecommendProto$menstrual_cell extends GeneratedMessageLite<RecommendProto$menstrual_cell, Builder> implements RecommendProto$menstrual_cellOrBuilder {
    public static final int DAY_FIELD_NUMBER = 1;
    private static final RecommendProto$menstrual_cell DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile Parser<RecommendProto$menstrual_cell> PARSER;
    private int day_;
    private Internal.ProtobufList<RecommendProto$entry_data> entry_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$menstrual_cell, Builder> implements RecommendProto$menstrual_cellOrBuilder {
        public Builder addAllEntry(Iterable<? extends RecommendProto$entry_data> iterable) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).addAllEntry(iterable);
            return this;
        }

        public Builder addEntry(RecommendProto$entry_data recommendProto$entry_data) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).addEntry(recommendProto$entry_data);
            return this;
        }

        public Builder clearDay() {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).clearDay();
            return this;
        }

        public Builder clearEntry() {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).clearEntry();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
        public int getDay() {
            return ((RecommendProto$menstrual_cell) this.instance).getDay();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
        public RecommendProto$entry_data getEntry(int i) {
            return ((RecommendProto$menstrual_cell) this.instance).getEntry(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
        public int getEntryCount() {
            return ((RecommendProto$menstrual_cell) this.instance).getEntryCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
        public List<RecommendProto$entry_data> getEntryList() {
            return Collections.unmodifiableList(((RecommendProto$menstrual_cell) this.instance).getEntryList());
        }

        public Builder removeEntry(int i) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).removeEntry(i);
            return this;
        }

        public Builder setDay(int i) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).setDay(i);
            return this;
        }

        public Builder setEntry(int i, RecommendProto$entry_data recommendProto$entry_data) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).setEntry(i, recommendProto$entry_data);
            return this;
        }

        private Builder() {
            super(RecommendProto$menstrual_cell.DEFAULT_INSTANCE);
        }

        public Builder addEntry(int i, RecommendProto$entry_data recommendProto$entry_data) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).addEntry(i, recommendProto$entry_data);
            return this;
        }

        public Builder setEntry(int i, RecommendProto$entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).setEntry(i, builder.build());
            return this;
        }

        public Builder addEntry(RecommendProto$entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).addEntry(builder.build());
            return this;
        }

        public Builder addEntry(int i, RecommendProto$entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$menstrual_cell) this.instance).addEntry(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$menstrual_cell recommendProto$menstrual_cell = new RecommendProto$menstrual_cell();
        DEFAULT_INSTANCE = recommendProto$menstrual_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$menstrual_cell.class, recommendProto$menstrual_cell);
    }

    private RecommendProto$menstrual_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends RecommendProto$entry_data> iterable) {
        ensureEntryIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(RecommendProto$entry_data recommendProto$entry_data) {
        recommendProto$entry_data.getClass();
        ensureEntryIsMutable();
        this.entry_.add(recommendProto$entry_data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDay() {
        this.day_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        Internal.ProtobufList<RecommendProto$entry_data> protobufList = this.entry_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.entry_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$menstrual_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$menstrual_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$menstrual_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$menstrual_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i) {
        ensureEntryIsMutable();
        this.entry_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDay(int i) {
        this.day_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i, RecommendProto$entry_data recommendProto$entry_data) {
        recommendProto$entry_data.getClass();
        ensureEntryIsMutable();
        this.entry_.set(i, recommendProto$entry_data);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$menstrual_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"day_", "entry_", RecommendProto$entry_data.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$menstrual_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$menstrual_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
    public int getDay() {
        return this.day_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
    public RecommendProto$entry_data getEntry(int i) {
        return this.entry_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
    public int getEntryCount() {
        return this.entry_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$menstrual_cellOrBuilder
    public List<RecommendProto$entry_data> getEntryList() {
        return this.entry_;
    }

    public RecommendProto$entry_dataOrBuilder getEntryOrBuilder(int i) {
        return this.entry_.get(i);
    }

    public List<? extends RecommendProto$entry_dataOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }

    public static Builder newBuilder(RecommendProto$menstrual_cell recommendProto$menstrual_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$menstrual_cell);
    }

    public static RecommendProto$menstrual_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$menstrual_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$menstrual_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i, RecommendProto$entry_data recommendProto$entry_data) {
        recommendProto$entry_data.getClass();
        ensureEntryIsMutable();
        this.entry_.add(i, recommendProto$entry_data);
    }

    public static RecommendProto$menstrual_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$menstrual_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$menstrual_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$menstrual_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$menstrual_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$menstrual_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$menstrual_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$menstrual_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
