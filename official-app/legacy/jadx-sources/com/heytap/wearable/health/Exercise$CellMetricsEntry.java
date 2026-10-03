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
public final class Exercise$CellMetricsEntry extends GeneratedMessageLite<Exercise$CellMetricsEntry, Builder> implements Exercise$CellMetricsEntryOrBuilder {
    public static final int CELL_FIELD_NUMBER = 1;
    private static final Exercise$CellMetricsEntry DEFAULT_INSTANCE;
    private static volatile Parser<Exercise$CellMetricsEntry> PARSER;
    private Internal.ProtobufList<Exercise$CellData> cell_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$CellMetricsEntry, Builder> implements Exercise$CellMetricsEntryOrBuilder {
        public Builder addAllCell(Iterable<? extends Exercise$CellData> iterable) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).addAllCell(iterable);
            return this;
        }

        public Builder addCell(Exercise$CellData exercise$CellData) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).addCell(exercise$CellData);
            return this;
        }

        public Builder clearCell() {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).clearCell();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$CellMetricsEntryOrBuilder
        public Exercise$CellData getCell(int i) {
            return ((Exercise$CellMetricsEntry) this.instance).getCell(i);
        }

        @Override // com.heytap.wearable.health.Exercise$CellMetricsEntryOrBuilder
        public int getCellCount() {
            return ((Exercise$CellMetricsEntry) this.instance).getCellCount();
        }

        @Override // com.heytap.wearable.health.Exercise$CellMetricsEntryOrBuilder
        public List<Exercise$CellData> getCellList() {
            return Collections.unmodifiableList(((Exercise$CellMetricsEntry) this.instance).getCellList());
        }

        public Builder removeCell(int i) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).removeCell(i);
            return this;
        }

        public Builder setCell(int i, Exercise$CellData exercise$CellData) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).setCell(i, exercise$CellData);
            return this;
        }

        private Builder() {
            super(Exercise$CellMetricsEntry.DEFAULT_INSTANCE);
        }

        public Builder addCell(int i, Exercise$CellData exercise$CellData) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).addCell(i, exercise$CellData);
            return this;
        }

        public Builder setCell(int i, Exercise$CellData.Builder builder) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).setCell(i, builder.build());
            return this;
        }

        public Builder addCell(Exercise$CellData.Builder builder) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).addCell(builder.build());
            return this;
        }

        public Builder addCell(int i, Exercise$CellData.Builder builder) {
            copyOnWrite();
            ((Exercise$CellMetricsEntry) this.instance).addCell(i, builder.build());
            return this;
        }
    }

    static {
        Exercise$CellMetricsEntry exercise$CellMetricsEntry = new Exercise$CellMetricsEntry();
        DEFAULT_INSTANCE = exercise$CellMetricsEntry;
        GeneratedMessageLite.registerDefaultInstance(Exercise$CellMetricsEntry.class, exercise$CellMetricsEntry);
    }

    private Exercise$CellMetricsEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCell(Iterable<? extends Exercise$CellData> iterable) {
        ensureCellIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.cell_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCell(Exercise$CellData exercise$CellData) {
        exercise$CellData.getClass();
        ensureCellIsMutable();
        this.cell_.add(exercise$CellData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCell() {
        this.cell_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCellIsMutable() {
        Internal.ProtobufList<Exercise$CellData> protobufList = this.cell_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.cell_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Exercise$CellMetricsEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$CellMetricsEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$CellMetricsEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$CellMetricsEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCell(int i) {
        ensureCellIsMutable();
        this.cell_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCell(int i, Exercise$CellData exercise$CellData) {
        exercise$CellData.getClass();
        ensureCellIsMutable();
        this.cell_.set(i, exercise$CellData);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$CellMetricsEntry();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"cell_", Exercise$CellData.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$CellMetricsEntry> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$CellMetricsEntry.class) {
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

    @Override // com.heytap.wearable.health.Exercise$CellMetricsEntryOrBuilder
    public Exercise$CellData getCell(int i) {
        return this.cell_.get(i);
    }

    @Override // com.heytap.wearable.health.Exercise$CellMetricsEntryOrBuilder
    public int getCellCount() {
        return this.cell_.size();
    }

    @Override // com.heytap.wearable.health.Exercise$CellMetricsEntryOrBuilder
    public List<Exercise$CellData> getCellList() {
        return this.cell_;
    }

    public Exercise$CellDataOrBuilder getCellOrBuilder(int i) {
        return this.cell_.get(i);
    }

    public List<? extends Exercise$CellDataOrBuilder> getCellOrBuilderList() {
        return this.cell_;
    }

    public static Builder newBuilder(Exercise$CellMetricsEntry exercise$CellMetricsEntry) {
        return DEFAULT_INSTANCE.createBuilder(exercise$CellMetricsEntry);
    }

    public static Exercise$CellMetricsEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$CellMetricsEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$CellMetricsEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCell(int i, Exercise$CellData exercise$CellData) {
        exercise$CellData.getClass();
        ensureCellIsMutable();
        this.cell_.add(i, exercise$CellData);
    }

    public static Exercise$CellMetricsEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$CellMetricsEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$CellMetricsEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$CellMetricsEntry parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$CellMetricsEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$CellMetricsEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$CellMetricsEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$CellMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
