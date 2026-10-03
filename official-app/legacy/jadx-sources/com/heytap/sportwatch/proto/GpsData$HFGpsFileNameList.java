package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r98;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GpsData$HFGpsFileNameList extends GeneratedMessageLite<GpsData$HFGpsFileNameList, Builder> implements GpsData$HFGpsFileNameListOrBuilder {
    private static final GpsData$HFGpsFileNameList DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GpsData$HFGpsFileNameList> PARSER;
    private Internal.ProtobufList<GpsData$HFGpsFileName> fileName_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$HFGpsFileNameList, Builder> implements GpsData$HFGpsFileNameListOrBuilder {
        public Builder addAllFileName(Iterable<? extends GpsData$HFGpsFileName> iterable) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).addAllFileName(iterable);
            return this;
        }

        public Builder addFileName(GpsData$HFGpsFileName gpsData$HFGpsFileName) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).addFileName(gpsData$HFGpsFileName);
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).clearFileName();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameListOrBuilder
        public GpsData$HFGpsFileName getFileName(int i) {
            return ((GpsData$HFGpsFileNameList) this.instance).getFileName(i);
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameListOrBuilder
        public int getFileNameCount() {
            return ((GpsData$HFGpsFileNameList) this.instance).getFileNameCount();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameListOrBuilder
        public List<GpsData$HFGpsFileName> getFileNameList() {
            return Collections.unmodifiableList(((GpsData$HFGpsFileNameList) this.instance).getFileNameList());
        }

        public Builder removeFileName(int i) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).removeFileName(i);
            return this;
        }

        public Builder setFileName(int i, GpsData$HFGpsFileName gpsData$HFGpsFileName) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).setFileName(i, gpsData$HFGpsFileName);
            return this;
        }

        private Builder() {
            super(GpsData$HFGpsFileNameList.DEFAULT_INSTANCE);
        }

        public Builder addFileName(int i, GpsData$HFGpsFileName gpsData$HFGpsFileName) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).addFileName(i, gpsData$HFGpsFileName);
            return this;
        }

        public Builder setFileName(int i, GpsData$HFGpsFileName.Builder builder) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).setFileName(i, builder.build());
            return this;
        }

        public Builder addFileName(GpsData$HFGpsFileName.Builder builder) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).addFileName(builder.build());
            return this;
        }

        public Builder addFileName(int i, GpsData$HFGpsFileName.Builder builder) {
            copyOnWrite();
            ((GpsData$HFGpsFileNameList) this.instance).addFileName(i, builder.build());
            return this;
        }
    }

    static {
        GpsData$HFGpsFileNameList gpsData$HFGpsFileNameList = new GpsData$HFGpsFileNameList();
        DEFAULT_INSTANCE = gpsData$HFGpsFileNameList;
        GeneratedMessageLite.registerDefaultInstance(GpsData$HFGpsFileNameList.class, gpsData$HFGpsFileNameList);
    }

    private GpsData$HFGpsFileNameList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileName(Iterable<? extends GpsData$HFGpsFileName> iterable) {
        ensureFileNameIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fileName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileName(GpsData$HFGpsFileName gpsData$HFGpsFileName) {
        gpsData$HFGpsFileName.getClass();
        ensureFileNameIsMutable();
        this.fileName_.add(gpsData$HFGpsFileName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFileNameIsMutable() {
        Internal.ProtobufList<GpsData$HFGpsFileName> protobufList = this.fileName_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fileName_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GpsData$HFGpsFileNameList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$HFGpsFileNameList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsFileNameList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$HFGpsFileNameList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFileName(int i) {
        ensureFileNameIsMutable();
        this.fileName_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(int i, GpsData$HFGpsFileName gpsData$HFGpsFileName) {
        gpsData$HFGpsFileName.getClass();
        ensureFileNameIsMutable();
        this.fileName_.set(i, gpsData$HFGpsFileName);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$HFGpsFileNameList();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fileName_", GpsData$HFGpsFileName.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$HFGpsFileNameList> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$HFGpsFileNameList.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameListOrBuilder
    public GpsData$HFGpsFileName getFileName(int i) {
        return this.fileName_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameListOrBuilder
    public int getFileNameCount() {
        return this.fileName_.size();
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsFileNameListOrBuilder
    public List<GpsData$HFGpsFileName> getFileNameList() {
        return this.fileName_;
    }

    public GpsData$HFGpsFileNameOrBuilder getFileNameOrBuilder(int i) {
        return this.fileName_.get(i);
    }

    public List<? extends GpsData$HFGpsFileNameOrBuilder> getFileNameOrBuilderList() {
        return this.fileName_;
    }

    public static Builder newBuilder(GpsData$HFGpsFileNameList gpsData$HFGpsFileNameList) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$HFGpsFileNameList);
    }

    public static GpsData$HFGpsFileNameList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileNameList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileNameList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileName(int i, GpsData$HFGpsFileName gpsData$HFGpsFileName) {
        gpsData$HFGpsFileName.getClass();
        ensureFileNameIsMutable();
        this.fileName_.add(i, gpsData$HFGpsFileName);
    }

    public static GpsData$HFGpsFileNameList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileNameList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$HFGpsFileNameList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileNameList parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsFileNameList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsFileNameList parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$HFGpsFileNameList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsFileNameList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
