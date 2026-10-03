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
public final class GpsData$HFGpsDataFile extends GeneratedMessageLite<GpsData$HFGpsDataFile, Builder> implements GpsData$HFGpsDataFileOrBuilder {
    private static final GpsData$HFGpsDataFile DEFAULT_INSTANCE;
    public static final int FILE_INFO_FIELD_NUMBER = 1;
    private static volatile Parser<GpsData$HFGpsDataFile> PARSER;
    private Internal.ProtobufList<GpsData$HFGpsDataFileInfo> fileInfo_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$HFGpsDataFile, Builder> implements GpsData$HFGpsDataFileOrBuilder {
        public Builder addAllFileInfo(Iterable<? extends GpsData$HFGpsDataFileInfo> iterable) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).addAllFileInfo(iterable);
            return this;
        }

        public Builder addFileInfo(GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).addFileInfo(gpsData$HFGpsDataFileInfo);
            return this;
        }

        public Builder clearFileInfo() {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).clearFileInfo();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileOrBuilder
        public GpsData$HFGpsDataFileInfo getFileInfo(int i) {
            return ((GpsData$HFGpsDataFile) this.instance).getFileInfo(i);
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileOrBuilder
        public int getFileInfoCount() {
            return ((GpsData$HFGpsDataFile) this.instance).getFileInfoCount();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileOrBuilder
        public List<GpsData$HFGpsDataFileInfo> getFileInfoList() {
            return Collections.unmodifiableList(((GpsData$HFGpsDataFile) this.instance).getFileInfoList());
        }

        public Builder removeFileInfo(int i) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).removeFileInfo(i);
            return this;
        }

        public Builder setFileInfo(int i, GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).setFileInfo(i, gpsData$HFGpsDataFileInfo);
            return this;
        }

        private Builder() {
            super(GpsData$HFGpsDataFile.DEFAULT_INSTANCE);
        }

        public Builder addFileInfo(int i, GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).addFileInfo(i, gpsData$HFGpsDataFileInfo);
            return this;
        }

        public Builder setFileInfo(int i, GpsData$HFGpsDataFileInfo.Builder builder) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).setFileInfo(i, builder.build());
            return this;
        }

        public Builder addFileInfo(GpsData$HFGpsDataFileInfo.Builder builder) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).addFileInfo(builder.build());
            return this;
        }

        public Builder addFileInfo(int i, GpsData$HFGpsDataFileInfo.Builder builder) {
            copyOnWrite();
            ((GpsData$HFGpsDataFile) this.instance).addFileInfo(i, builder.build());
            return this;
        }
    }

    static {
        GpsData$HFGpsDataFile gpsData$HFGpsDataFile = new GpsData$HFGpsDataFile();
        DEFAULT_INSTANCE = gpsData$HFGpsDataFile;
        GeneratedMessageLite.registerDefaultInstance(GpsData$HFGpsDataFile.class, gpsData$HFGpsDataFile);
    }

    private GpsData$HFGpsDataFile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileInfo(Iterable<? extends GpsData$HFGpsDataFileInfo> iterable) {
        ensureFileInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fileInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileInfo(GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
        gpsData$HFGpsDataFileInfo.getClass();
        ensureFileInfoIsMutable();
        this.fileInfo_.add(gpsData$HFGpsDataFileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileInfo() {
        this.fileInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFileInfoIsMutable() {
        Internal.ProtobufList<GpsData$HFGpsDataFileInfo> protobufList = this.fileInfo_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fileInfo_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static GpsData$HFGpsDataFile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$HFGpsDataFile parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsDataFile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$HFGpsDataFile> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFileInfo(int i) {
        ensureFileInfoIsMutable();
        this.fileInfo_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileInfo(int i, GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
        gpsData$HFGpsDataFileInfo.getClass();
        ensureFileInfoIsMutable();
        this.fileInfo_.set(i, gpsData$HFGpsDataFileInfo);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$HFGpsDataFile();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fileInfo_", GpsData$HFGpsDataFileInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$HFGpsDataFile> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$HFGpsDataFile.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileOrBuilder
    public GpsData$HFGpsDataFileInfo getFileInfo(int i) {
        return this.fileInfo_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileOrBuilder
    public int getFileInfoCount() {
        return this.fileInfo_.size();
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsDataFileOrBuilder
    public List<GpsData$HFGpsDataFileInfo> getFileInfoList() {
        return this.fileInfo_;
    }

    public GpsData$HFGpsDataFileInfoOrBuilder getFileInfoOrBuilder(int i) {
        return this.fileInfo_.get(i);
    }

    public List<? extends GpsData$HFGpsDataFileInfoOrBuilder> getFileInfoOrBuilderList() {
        return this.fileInfo_;
    }

    public static Builder newBuilder(GpsData$HFGpsDataFile gpsData$HFGpsDataFile) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$HFGpsDataFile);
    }

    public static GpsData$HFGpsDataFile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileInfo(int i, GpsData$HFGpsDataFileInfo gpsData$HFGpsDataFileInfo) {
        gpsData$HFGpsDataFileInfo.getClass();
        ensureFileInfoIsMutable();
        this.fileInfo_.add(i, gpsData$HFGpsDataFileInfo);
    }

    public static GpsData$HFGpsDataFile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$HFGpsDataFile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFile parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsDataFile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsDataFile parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$HFGpsDataFile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsDataFile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
