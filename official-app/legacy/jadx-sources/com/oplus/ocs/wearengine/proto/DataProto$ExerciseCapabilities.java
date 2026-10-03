package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$ExerciseCapabilities extends GeneratedMessageLite<DataProto$ExerciseCapabilities, Builder> implements DataProto$ExerciseCapabilitiesOrBuilder {
    private static final DataProto$ExerciseCapabilities DEFAULT_INSTANCE;
    private static volatile Parser<DataProto$ExerciseCapabilities> PARSER = null;
    public static final int SUPPORTED_BATCHING_MODE_OVERRIDES_FIELD_NUMBER = 2;
    public static final int TYPE_TO_CAPABILITIES_FIELD_NUMBER = 1;
    private static final Internal.ListAdapter.Converter<Integer, DataProto$BatchingMode> supportedBatchingModeOverrides_converter_ = new a();
    private int supportedBatchingModeOverridesMemoizedSerializedSize;
    private Internal.ProtobufList<TypeToCapabilitiesEntry> typeToCapabilities_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.IntList supportedBatchingModeOverrides_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$ExerciseCapabilities, Builder> implements DataProto$ExerciseCapabilitiesOrBuilder {
        public Builder addAllSupportedBatchingModeOverrides(Iterable<? extends DataProto$BatchingMode> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addAllSupportedBatchingModeOverrides(iterable);
            return this;
        }

        public Builder addAllSupportedBatchingModeOverridesValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addAllSupportedBatchingModeOverridesValue(iterable);
            return this;
        }

        public Builder addAllTypeToCapabilities(Iterable<? extends TypeToCapabilitiesEntry> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addAllTypeToCapabilities(iterable);
            return this;
        }

        public Builder addSupportedBatchingModeOverrides(DataProto$BatchingMode dataProto$BatchingMode) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addSupportedBatchingModeOverrides(dataProto$BatchingMode);
            return this;
        }

        public Builder addSupportedBatchingModeOverridesValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addSupportedBatchingModeOverridesValue(i);
            return this;
        }

        public Builder addTypeToCapabilities(TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addTypeToCapabilities(typeToCapabilitiesEntry);
            return this;
        }

        public Builder clearSupportedBatchingModeOverrides() {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).clearSupportedBatchingModeOverrides();
            return this;
        }

        public Builder clearTypeToCapabilities() {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).clearTypeToCapabilities();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public DataProto$BatchingMode getSupportedBatchingModeOverrides(int i) {
            return ((DataProto$ExerciseCapabilities) this.instance).getSupportedBatchingModeOverrides(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public int getSupportedBatchingModeOverridesCount() {
            return ((DataProto$ExerciseCapabilities) this.instance).getSupportedBatchingModeOverridesCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public List<DataProto$BatchingMode> getSupportedBatchingModeOverridesList() {
            return ((DataProto$ExerciseCapabilities) this.instance).getSupportedBatchingModeOverridesList();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public int getSupportedBatchingModeOverridesValue(int i) {
            return ((DataProto$ExerciseCapabilities) this.instance).getSupportedBatchingModeOverridesValue(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public List<Integer> getSupportedBatchingModeOverridesValueList() {
            return Collections.unmodifiableList(((DataProto$ExerciseCapabilities) this.instance).getSupportedBatchingModeOverridesValueList());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public TypeToCapabilitiesEntry getTypeToCapabilities(int i) {
            return ((DataProto$ExerciseCapabilities) this.instance).getTypeToCapabilities(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public int getTypeToCapabilitiesCount() {
            return ((DataProto$ExerciseCapabilities) this.instance).getTypeToCapabilitiesCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
        public List<TypeToCapabilitiesEntry> getTypeToCapabilitiesList() {
            return Collections.unmodifiableList(((DataProto$ExerciseCapabilities) this.instance).getTypeToCapabilitiesList());
        }

        public Builder removeTypeToCapabilities(int i) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).removeTypeToCapabilities(i);
            return this;
        }

        public Builder setSupportedBatchingModeOverrides(int i, DataProto$BatchingMode dataProto$BatchingMode) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).setSupportedBatchingModeOverrides(i, dataProto$BatchingMode);
            return this;
        }

        public Builder setSupportedBatchingModeOverridesValue(int i, int i2) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).setSupportedBatchingModeOverridesValue(i, i2);
            return this;
        }

        public Builder setTypeToCapabilities(int i, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).setTypeToCapabilities(i, typeToCapabilitiesEntry);
            return this;
        }

        private Builder() {
            super(DataProto$ExerciseCapabilities.DEFAULT_INSTANCE);
        }

        public Builder addTypeToCapabilities(int i, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addTypeToCapabilities(i, typeToCapabilitiesEntry);
            return this;
        }

        public Builder setTypeToCapabilities(int i, TypeToCapabilitiesEntry.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).setTypeToCapabilities(i, builder.build());
            return this;
        }

        public Builder addTypeToCapabilities(TypeToCapabilitiesEntry.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addTypeToCapabilities(builder.build());
            return this;
        }

        public Builder addTypeToCapabilities(int i, TypeToCapabilitiesEntry.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseCapabilities) this.instance).addTypeToCapabilities(i, builder.build());
            return this;
        }
    }

    public static final class TypeToCapabilitiesEntry extends GeneratedMessageLite<TypeToCapabilitiesEntry, Builder> implements TypeToCapabilitiesEntryOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 2;
        private static final TypeToCapabilitiesEntry DEFAULT_INSTANCE;
        private static volatile Parser<TypeToCapabilitiesEntry> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private DataProto$ExerciseTypeCapabilities capabilities_;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeToCapabilitiesEntry, Builder> implements TypeToCapabilitiesEntryOrBuilder {
            public Builder clearCapabilities() {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).clearCapabilities();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).clearType();
                return this;
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
            public DataProto$ExerciseTypeCapabilities getCapabilities() {
                return ((TypeToCapabilitiesEntry) this.instance).getCapabilities();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
            public DataProto$ExerciseType getType() {
                return ((TypeToCapabilitiesEntry) this.instance).getType();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
            public int getTypeValue() {
                return ((TypeToCapabilitiesEntry) this.instance).getTypeValue();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
            public boolean hasCapabilities() {
                return ((TypeToCapabilitiesEntry) this.instance).hasCapabilities();
            }

            public Builder mergeCapabilities(DataProto$ExerciseTypeCapabilities dataProto$ExerciseTypeCapabilities) {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).mergeCapabilities(dataProto$ExerciseTypeCapabilities);
                return this;
            }

            public Builder setCapabilities(DataProto$ExerciseTypeCapabilities dataProto$ExerciseTypeCapabilities) {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).setCapabilities(dataProto$ExerciseTypeCapabilities);
                return this;
            }

            public Builder setType(DataProto$ExerciseType dataProto$ExerciseType) {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).setType(dataProto$ExerciseType);
                return this;
            }

            public Builder setTypeValue(int i) {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).setTypeValue(i);
                return this;
            }

            private Builder() {
                super(TypeToCapabilitiesEntry.DEFAULT_INSTANCE);
            }

            public Builder setCapabilities(DataProto$ExerciseTypeCapabilities.Builder builder) {
                copyOnWrite();
                ((TypeToCapabilitiesEntry) this.instance).setCapabilities(builder.build());
                return this;
            }
        }

        static {
            TypeToCapabilitiesEntry typeToCapabilitiesEntry = new TypeToCapabilitiesEntry();
            DEFAULT_INSTANCE = typeToCapabilitiesEntry;
            GeneratedMessageLite.registerDefaultInstance(TypeToCapabilitiesEntry.class, typeToCapabilitiesEntry);
        }

        private TypeToCapabilitiesEntry() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCapabilities() {
            this.capabilities_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static TypeToCapabilitiesEntry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCapabilities(DataProto$ExerciseTypeCapabilities dataProto$ExerciseTypeCapabilities) {
            dataProto$ExerciseTypeCapabilities.getClass();
            DataProto$ExerciseTypeCapabilities dataProto$ExerciseTypeCapabilities2 = this.capabilities_;
            if (dataProto$ExerciseTypeCapabilities2 == null || dataProto$ExerciseTypeCapabilities2 == DataProto$ExerciseTypeCapabilities.getDefaultInstance()) {
                this.capabilities_ = dataProto$ExerciseTypeCapabilities;
            } else {
                this.capabilities_ = DataProto$ExerciseTypeCapabilities.newBuilder(this.capabilities_).mergeFrom(dataProto$ExerciseTypeCapabilities).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TypeToCapabilitiesEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TypeToCapabilitiesEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TypeToCapabilitiesEntry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCapabilities(DataProto$ExerciseTypeCapabilities dataProto$ExerciseTypeCapabilities) {
            dataProto$ExerciseTypeCapabilities.getClass();
            this.capabilities_ = dataProto$ExerciseTypeCapabilities;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(DataProto$ExerciseType dataProto$ExerciseType) {
            this.type_ = dataProto$ExerciseType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = vu4.a[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new TypeToCapabilitiesEntry();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "type_", "capabilities_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TypeToCapabilitiesEntry> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TypeToCapabilitiesEntry.class) {
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

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
        public DataProto$ExerciseTypeCapabilities getCapabilities() {
            DataProto$ExerciseTypeCapabilities dataProto$ExerciseTypeCapabilities = this.capabilities_;
            return dataProto$ExerciseTypeCapabilities == null ? DataProto$ExerciseTypeCapabilities.getDefaultInstance() : dataProto$ExerciseTypeCapabilities;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
        public DataProto$ExerciseType getType() {
            DataProto$ExerciseType dataProto$ExerciseTypeForNumber = DataProto$ExerciseType.forNumber(this.type_);
            return dataProto$ExerciseTypeForNumber == null ? DataProto$ExerciseType.UNRECOGNIZED : dataProto$ExerciseTypeForNumber;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilities.TypeToCapabilitiesEntryOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
            return DEFAULT_INSTANCE.createBuilder(typeToCapabilitiesEntry);
        }

        public static TypeToCapabilitiesEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TypeToCapabilitiesEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TypeToCapabilitiesEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TypeToCapabilitiesEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TypeToCapabilitiesEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TypeToCapabilitiesEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TypeToCapabilitiesEntry parseFrom(InputStream inputStream) throws IOException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TypeToCapabilitiesEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TypeToCapabilitiesEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TypeToCapabilitiesEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TypeToCapabilitiesEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TypeToCapabilitiesEntryOrBuilder extends MessageLiteOrBuilder {
        DataProto$ExerciseTypeCapabilities getCapabilities();

        DataProto$ExerciseType getType();

        int getTypeValue();

        boolean hasCapabilities();
    }

    public class a implements Internal.ListAdapter.Converter<Integer, DataProto$BatchingMode> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataProto$BatchingMode convert(Integer num) {
            DataProto$BatchingMode dataProto$BatchingModeForNumber = DataProto$BatchingMode.forNumber(num.intValue());
            return dataProto$BatchingModeForNumber == null ? DataProto$BatchingMode.UNRECOGNIZED : dataProto$BatchingModeForNumber;
        }
    }

    static {
        DataProto$ExerciseCapabilities dataProto$ExerciseCapabilities = new DataProto$ExerciseCapabilities();
        DEFAULT_INSTANCE = dataProto$ExerciseCapabilities;
        GeneratedMessageLite.registerDefaultInstance(DataProto$ExerciseCapabilities.class, dataProto$ExerciseCapabilities);
    }

    private DataProto$ExerciseCapabilities() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSupportedBatchingModeOverrides(Iterable<? extends DataProto$BatchingMode> iterable) {
        ensureSupportedBatchingModeOverridesIsMutable();
        Iterator<? extends DataProto$BatchingMode> it = iterable.iterator();
        while (it.hasNext()) {
            this.supportedBatchingModeOverrides_.addInt(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSupportedBatchingModeOverridesValue(Iterable<Integer> iterable) {
        ensureSupportedBatchingModeOverridesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.supportedBatchingModeOverrides_.addInt(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypeToCapabilities(Iterable<? extends TypeToCapabilitiesEntry> iterable) {
        ensureTypeToCapabilitiesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.typeToCapabilities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSupportedBatchingModeOverrides(DataProto$BatchingMode dataProto$BatchingMode) {
        dataProto$BatchingMode.getClass();
        ensureSupportedBatchingModeOverridesIsMutable();
        this.supportedBatchingModeOverrides_.addInt(dataProto$BatchingMode.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSupportedBatchingModeOverridesValue(int i) {
        ensureSupportedBatchingModeOverridesIsMutable();
        this.supportedBatchingModeOverrides_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypeToCapabilities(TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
        typeToCapabilitiesEntry.getClass();
        ensureTypeToCapabilitiesIsMutable();
        this.typeToCapabilities_.add(typeToCapabilitiesEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportedBatchingModeOverrides() {
        this.supportedBatchingModeOverrides_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeToCapabilities() {
        this.typeToCapabilities_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSupportedBatchingModeOverridesIsMutable() {
        Internal.IntList intList = this.supportedBatchingModeOverrides_;
        if (intList.isModifiable()) {
            return;
        }
        this.supportedBatchingModeOverrides_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureTypeToCapabilitiesIsMutable() {
        Internal.ProtobufList<TypeToCapabilitiesEntry> protobufList = this.typeToCapabilities_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.typeToCapabilities_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DataProto$ExerciseCapabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$ExerciseCapabilities parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseCapabilities parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$ExerciseCapabilities> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypeToCapabilities(int i) {
        ensureTypeToCapabilitiesIsMutable();
        this.typeToCapabilities_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportedBatchingModeOverrides(int i, DataProto$BatchingMode dataProto$BatchingMode) {
        dataProto$BatchingMode.getClass();
        ensureSupportedBatchingModeOverridesIsMutable();
        this.supportedBatchingModeOverrides_.setInt(i, dataProto$BatchingMode.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportedBatchingModeOverridesValue(int i, int i2) {
        ensureSupportedBatchingModeOverridesIsMutable();
        this.supportedBatchingModeOverrides_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeToCapabilities(int i, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
        typeToCapabilitiesEntry.getClass();
        ensureTypeToCapabilitiesIsMutable();
        this.typeToCapabilities_.set(i, typeToCapabilitiesEntry);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$ExerciseCapabilities();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002,", new Object[]{"typeToCapabilities_", TypeToCapabilitiesEntry.class, "supportedBatchingModeOverrides_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$ExerciseCapabilities> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$ExerciseCapabilities.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public DataProto$BatchingMode getSupportedBatchingModeOverrides(int i) {
        DataProto$BatchingMode dataProto$BatchingModeForNumber = DataProto$BatchingMode.forNumber(this.supportedBatchingModeOverrides_.getInt(i));
        return dataProto$BatchingModeForNumber == null ? DataProto$BatchingMode.UNRECOGNIZED : dataProto$BatchingModeForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public int getSupportedBatchingModeOverridesCount() {
        return this.supportedBatchingModeOverrides_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public List<DataProto$BatchingMode> getSupportedBatchingModeOverridesList() {
        return new Internal.ListAdapter(this.supportedBatchingModeOverrides_, supportedBatchingModeOverrides_converter_);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public int getSupportedBatchingModeOverridesValue(int i) {
        return this.supportedBatchingModeOverrides_.getInt(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public List<Integer> getSupportedBatchingModeOverridesValueList() {
        return this.supportedBatchingModeOverrides_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public TypeToCapabilitiesEntry getTypeToCapabilities(int i) {
        return this.typeToCapabilities_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public int getTypeToCapabilitiesCount() {
        return this.typeToCapabilities_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseCapabilitiesOrBuilder
    public List<TypeToCapabilitiesEntry> getTypeToCapabilitiesList() {
        return this.typeToCapabilities_;
    }

    public TypeToCapabilitiesEntryOrBuilder getTypeToCapabilitiesOrBuilder(int i) {
        return this.typeToCapabilities_.get(i);
    }

    public List<? extends TypeToCapabilitiesEntryOrBuilder> getTypeToCapabilitiesOrBuilderList() {
        return this.typeToCapabilities_;
    }

    public static Builder newBuilder(DataProto$ExerciseCapabilities dataProto$ExerciseCapabilities) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$ExerciseCapabilities);
    }

    public static DataProto$ExerciseCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$ExerciseCapabilities parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypeToCapabilities(int i, TypeToCapabilitiesEntry typeToCapabilitiesEntry) {
        typeToCapabilitiesEntry.getClass();
        ensureTypeToCapabilitiesIsMutable();
        this.typeToCapabilities_.add(i, typeToCapabilitiesEntry);
    }

    public static DataProto$ExerciseCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$ExerciseCapabilities parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$ExerciseCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$ExerciseCapabilities parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseCapabilities parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$ExerciseCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
