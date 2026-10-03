package com.heytap.health.protocol.file;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j6b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class LogKitProto$LogKitStateRsp extends GeneratedMessageLite<LogKitProto$LogKitStateRsp, Builder> implements LogKitProto$LogKitStateRspOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final LogKitProto$LogKitStateRsp DEFAULT_INSTANCE;
    public static final int FILENAME_FIELD_NUMBER = 3;
    public static final int HISTORY_FIELD_NUMBER = 5;
    public static final int PARAM_FIELD_NUMBER = 4;
    private static volatile Parser<LogKitProto$LogKitStateRsp> PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 2;
    private int action_;
    private int progress_;
    private String fileName_ = "";
    private String param_ = "";
    private Internal.ProtobufList<String> history_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<LogKitProto$LogKitStateRsp, Builder> implements LogKitProto$LogKitStateRspOrBuilder {
        public Builder addAllHistory(Iterable<String> iterable) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).addAllHistory(iterable);
            return this;
        }

        public Builder addHistory(String str) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).addHistory(str);
            return this;
        }

        public Builder addHistoryBytes(ByteString byteString) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).addHistoryBytes(byteString);
            return this;
        }

        public Builder clearAction() {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).clearAction();
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).clearFileName();
            return this;
        }

        public Builder clearHistory() {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).clearHistory();
            return this;
        }

        public Builder clearParam() {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).clearParam();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).clearProgress();
            return this;
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public int getAction() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getAction();
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public String getFileName() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getFileName();
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public ByteString getFileNameBytes() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getFileNameBytes();
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public String getHistory(int i) {
            return ((LogKitProto$LogKitStateRsp) this.instance).getHistory(i);
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public ByteString getHistoryBytes(int i) {
            return ((LogKitProto$LogKitStateRsp) this.instance).getHistoryBytes(i);
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public int getHistoryCount() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getHistoryCount();
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public List<String> getHistoryList() {
            return Collections.unmodifiableList(((LogKitProto$LogKitStateRsp) this.instance).getHistoryList());
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public String getParam() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getParam();
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public ByteString getParamBytes() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getParamBytes();
        }

        @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
        public int getProgress() {
            return ((LogKitProto$LogKitStateRsp) this.instance).getProgress();
        }

        public Builder setAction(int i) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setAction(i);
            return this;
        }

        public Builder setFileName(String str) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setFileName(str);
            return this;
        }

        public Builder setFileNameBytes(ByteString byteString) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setFileNameBytes(byteString);
            return this;
        }

        public Builder setHistory(int i, String str) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setHistory(i, str);
            return this;
        }

        public Builder setParam(String str) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setParam(str);
            return this;
        }

        public Builder setParamBytes(ByteString byteString) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setParamBytes(byteString);
            return this;
        }

        public Builder setProgress(int i) {
            copyOnWrite();
            ((LogKitProto$LogKitStateRsp) this.instance).setProgress(i);
            return this;
        }

        private Builder() {
            super(LogKitProto$LogKitStateRsp.DEFAULT_INSTANCE);
        }
    }

    static {
        LogKitProto$LogKitStateRsp logKitProto$LogKitStateRsp = new LogKitProto$LogKitStateRsp();
        DEFAULT_INSTANCE = logKitProto$LogKitStateRsp;
        GeneratedMessageLite.registerDefaultInstance(LogKitProto$LogKitStateRsp.class, logKitProto$LogKitStateRsp);
    }

    private LogKitProto$LogKitStateRsp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHistory(Iterable<String> iterable) {
        ensureHistoryIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.history_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHistory(String str) {
        str.getClass();
        ensureHistoryIsMutable();
        this.history_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHistoryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureHistoryIsMutable();
        this.history_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistory() {
        this.history_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParam() {
        this.param_ = getDefaultInstance().getParam();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProgress() {
        this.progress_ = 0;
    }

    private void ensureHistoryIsMutable() {
        Internal.ProtobufList<String> protobufList = this.history_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.history_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LogKitProto$LogKitStateRsp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LogKitProto$LogKitStateRsp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LogKitProto$LogKitStateRsp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(int i) {
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistory(int i, String str) {
        str.getClass();
        ensureHistoryIsMutable();
        this.history_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParam(String str) {
        str.getClass();
        this.param_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParamBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.param_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i) {
        this.progress_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j6b.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LogKitProto$LogKitStateRsp();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003Ȉ\u0004Ȉ\u0005Ț", new Object[]{"action_", "progress_", "fileName_", "param_", "history_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LogKitProto$LogKitStateRsp> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LogKitProto$LogKitStateRsp.class) {
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

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public int getAction() {
        return this.action_;
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public String getHistory(int i) {
        return this.history_.get(i);
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public ByteString getHistoryBytes(int i) {
        return ByteString.copyFromUtf8(this.history_.get(i));
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public int getHistoryCount() {
        return this.history_.size();
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public List<String> getHistoryList() {
        return this.history_;
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public String getParam() {
        return this.param_;
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public ByteString getParamBytes() {
        return ByteString.copyFromUtf8(this.param_);
    }

    @Override // com.heytap.health.protocol.file.LogKitProto$LogKitStateRspOrBuilder
    public int getProgress() {
        return this.progress_;
    }

    public static Builder newBuilder(LogKitProto$LogKitStateRsp logKitProto$LogKitStateRsp) {
        return DEFAULT_INSTANCE.createBuilder(logKitProto$LogKitStateRsp);
    }

    public static LogKitProto$LogKitStateRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(InputStream inputStream) throws IOException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LogKitProto$LogKitStateRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogKitProto$LogKitStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
