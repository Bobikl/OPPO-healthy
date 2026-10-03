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
public final class RecommendProto$status_entry extends GeneratedMessageLite<RecommendProto$status_entry, Builder> implements RecommendProto$status_entryOrBuilder {
    private static final RecommendProto$status_entry DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$status_entry> PARSER;
    private Internal.ProtobufList<RecommendProto$level_entry_data> entry_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$status_entry, Builder> implements RecommendProto$status_entryOrBuilder {
        public Builder addAllEntry(Iterable<? extends RecommendProto$level_entry_data> iterable) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).addAllEntry(iterable);
            return this;
        }

        public Builder addEntry(RecommendProto$level_entry_data recommendProto$level_entry_data) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).addEntry(recommendProto$level_entry_data);
            return this;
        }

        public Builder clearEntry() {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).clearEntry();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$status_entryOrBuilder
        public RecommendProto$level_entry_data getEntry(int i) {
            return ((RecommendProto$status_entry) this.instance).getEntry(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$status_entryOrBuilder
        public int getEntryCount() {
            return ((RecommendProto$status_entry) this.instance).getEntryCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$status_entryOrBuilder
        public List<RecommendProto$level_entry_data> getEntryList() {
            return Collections.unmodifiableList(((RecommendProto$status_entry) this.instance).getEntryList());
        }

        public Builder removeEntry(int i) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).removeEntry(i);
            return this;
        }

        public Builder setEntry(int i, RecommendProto$level_entry_data recommendProto$level_entry_data) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).setEntry(i, recommendProto$level_entry_data);
            return this;
        }

        private Builder() {
            super(RecommendProto$status_entry.DEFAULT_INSTANCE);
        }

        public Builder addEntry(int i, RecommendProto$level_entry_data recommendProto$level_entry_data) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).addEntry(i, recommendProto$level_entry_data);
            return this;
        }

        public Builder setEntry(int i, RecommendProto$level_entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).setEntry(i, builder.build());
            return this;
        }

        public Builder addEntry(RecommendProto$level_entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).addEntry(builder.build());
            return this;
        }

        public Builder addEntry(int i, RecommendProto$level_entry_data.Builder builder) {
            copyOnWrite();
            ((RecommendProto$status_entry) this.instance).addEntry(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$status_entry recommendProto$status_entry = new RecommendProto$status_entry();
        DEFAULT_INSTANCE = recommendProto$status_entry;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$status_entry.class, recommendProto$status_entry);
    }

    private RecommendProto$status_entry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends RecommendProto$level_entry_data> iterable) {
        ensureEntryIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(RecommendProto$level_entry_data recommendProto$level_entry_data) {
        recommendProto$level_entry_data.getClass();
        ensureEntryIsMutable();
        this.entry_.add(recommendProto$level_entry_data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        Internal.ProtobufList<RecommendProto$level_entry_data> protobufList = this.entry_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.entry_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$status_entry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$status_entry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$status_entry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$status_entry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i) {
        ensureEntryIsMutable();
        this.entry_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i, RecommendProto$level_entry_data recommendProto$level_entry_data) {
        recommendProto$level_entry_data.getClass();
        ensureEntryIsMutable();
        this.entry_.set(i, recommendProto$level_entry_data);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$status_entry();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entry_", RecommendProto$level_entry_data.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$status_entry> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$status_entry.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$status_entryOrBuilder
    public RecommendProto$level_entry_data getEntry(int i) {
        return this.entry_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$status_entryOrBuilder
    public int getEntryCount() {
        return this.entry_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$status_entryOrBuilder
    public List<RecommendProto$level_entry_data> getEntryList() {
        return this.entry_;
    }

    public RecommendProto$level_entry_dataOrBuilder getEntryOrBuilder(int i) {
        return this.entry_.get(i);
    }

    public List<? extends RecommendProto$level_entry_dataOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }

    public static Builder newBuilder(RecommendProto$status_entry recommendProto$status_entry) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$status_entry);
    }

    public static RecommendProto$status_entry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$status_entry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$status_entry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i, RecommendProto$level_entry_data recommendProto$level_entry_data) {
        recommendProto$level_entry_data.getClass();
        ensureEntryIsMutable();
        this.entry_.add(i, recommendProto$level_entry_data);
    }

    public static RecommendProto$status_entry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$status_entry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$status_entry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$status_entry parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$status_entry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$status_entry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$status_entry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$status_entry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
