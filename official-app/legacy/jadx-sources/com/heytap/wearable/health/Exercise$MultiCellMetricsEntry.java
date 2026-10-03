package com.heytap.wearable.health;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dv6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$MultiCellMetricsEntry extends GeneratedMessageLite<Exercise$MultiCellMetricsEntry, Builder> implements Exercise$MultiCellMetricsEntryOrBuilder {
    private static final Exercise$MultiCellMetricsEntry DEFAULT_INSTANCE;
    public static final int MULTI_CELL_FIELD_NUMBER = 1;
    private static volatile Parser<Exercise$MultiCellMetricsEntry> PARSER;
    private Internal.ProtobufList<Exercise$MultiCellData> multiCell_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$MultiCellMetricsEntry, Builder> implements Exercise$MultiCellMetricsEntryOrBuilder {
        public Builder addAllMultiCell(Iterable<? extends Exercise$MultiCellData> iterable) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).addAllMultiCell(iterable);
            return this;
        }

        public Builder addMultiCell(Exercise$MultiCellData exercise$MultiCellData) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).addMultiCell(exercise$MultiCellData);
            return this;
        }

        public Builder clearMultiCell() {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).clearMultiCell();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellMetricsEntryOrBuilder
        public Exercise$MultiCellData getMultiCell(int i) {
            return ((Exercise$MultiCellMetricsEntry) this.instance).getMultiCell(i);
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellMetricsEntryOrBuilder
        public int getMultiCellCount() {
            return ((Exercise$MultiCellMetricsEntry) this.instance).getMultiCellCount();
        }

        @Override // com.heytap.wearable.health.Exercise$MultiCellMetricsEntryOrBuilder
        public List<Exercise$MultiCellData> getMultiCellList() {
            return Collections.unmodifiableList(((Exercise$MultiCellMetricsEntry) this.instance).getMultiCellList());
        }

        public Builder removeMultiCell(int i) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).removeMultiCell(i);
            return this;
        }

        public Builder setMultiCell(int i, Exercise$MultiCellData exercise$MultiCellData) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).setMultiCell(i, exercise$MultiCellData);
            return this;
        }

        private Builder() {
            super(Exercise$MultiCellMetricsEntry.DEFAULT_INSTANCE);
        }

        public Builder addMultiCell(int i, Exercise$MultiCellData exercise$MultiCellData) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).addMultiCell(i, exercise$MultiCellData);
            return this;
        }

        public Builder setMultiCell(int i, Exercise$MultiCellData.Builder builder) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).setMultiCell(i, builder.build());
            return this;
        }

        public Builder addMultiCell(Exercise$MultiCellData.Builder builder) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).addMultiCell(builder.build());
            return this;
        }

        public Builder addMultiCell(int i, Exercise$MultiCellData.Builder builder) {
            copyOnWrite();
            ((Exercise$MultiCellMetricsEntry) this.instance).addMultiCell(i, builder.build());
            return this;
        }
    }

    static {
        Exercise$MultiCellMetricsEntry exercise$MultiCellMetricsEntry = new Exercise$MultiCellMetricsEntry();
        DEFAULT_INSTANCE = exercise$MultiCellMetricsEntry;
        GeneratedMessageLite.registerDefaultInstance(Exercise$MultiCellMetricsEntry.class, exercise$MultiCellMetricsEntry);
    }

    private Exercise$MultiCellMetricsEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMultiCell(Iterable<? extends Exercise$MultiCellData> iterable) {
        ensureMultiCellIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.multiCell_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMultiCell(Exercise$MultiCellData exercise$MultiCellData) {
        exercise$MultiCellData.getClass();
        ensureMultiCellIsMutable();
        this.multiCell_.add(exercise$MultiCellData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMultiCell() {
        this.multiCell_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureMultiCellIsMutable() {
        Internal.ProtobufList<Exercise$MultiCellData> protobufList = this.multiCell_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.multiCell_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Exercise$MultiCellMetricsEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$MultiCellMetricsEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$MultiCellMetricsEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMultiCell(int i) {
        ensureMultiCellIsMutable();
        this.multiCell_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiCell(int i, Exercise$MultiCellData exercise$MultiCellData) {
        exercise$MultiCellData.getClass();
        ensureMultiCellIsMutable();
        this.multiCell_.set(i, exercise$MultiCellData);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$MultiCellMetricsEntry();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"multiCell_", Exercise$MultiCellData.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$MultiCellMetricsEntry> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$MultiCellMetricsEntry.class) {
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

    @Override // com.heytap.wearable.health.Exercise$MultiCellMetricsEntryOrBuilder
    public Exercise$MultiCellData getMultiCell(int i) {
        return this.multiCell_.get(i);
    }

    @Override // com.heytap.wearable.health.Exercise$MultiCellMetricsEntryOrBuilder
    public int getMultiCellCount() {
        return this.multiCell_.size();
    }

    @Override // com.heytap.wearable.health.Exercise$MultiCellMetricsEntryOrBuilder
    public List<Exercise$MultiCellData> getMultiCellList() {
        return this.multiCell_;
    }

    public Exercise$MultiCellDataOrBuilder getMultiCellOrBuilder(int i) {
        return this.multiCell_.get(i);
    }

    public List<? extends Exercise$MultiCellDataOrBuilder> getMultiCellOrBuilderList() {
        return this.multiCell_;
    }

    public static Builder newBuilder(Exercise$MultiCellMetricsEntry exercise$MultiCellMetricsEntry) {
        return DEFAULT_INSTANCE.createBuilder(exercise$MultiCellMetricsEntry);
    }

    public static Exercise$MultiCellMetricsEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMultiCell(int i, Exercise$MultiCellData exercise$MultiCellData) {
        exercise$MultiCellData.getClass();
        ensureMultiCellIsMutable();
        this.multiCell_.add(i, exercise$MultiCellData);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$MultiCellMetricsEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$MultiCellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
