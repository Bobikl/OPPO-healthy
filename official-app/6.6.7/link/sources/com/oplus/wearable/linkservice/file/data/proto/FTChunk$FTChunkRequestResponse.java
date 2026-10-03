package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l17;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class FTChunk$FTChunkRequestResponse extends GeneratedMessageLite<FTChunk$FTChunkRequestResponse, Builder> implements FTChunk$FTChunkRequestResponseOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 5;
    private static final FTChunk$FTChunkRequestResponse DEFAULT_INSTANCE;
    public static final int ENDPOINT_FIELD_NUMBER = 6;
    public static final int ERRORMSG_FIELD_NUMBER = 3;
    public static final int INDEX_FIELD_NUMBER = 4;
    private static volatile Parser<FTChunk$FTChunkRequestResponse> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TASKID_FIELD_NUMBER = 1;
    private int endPoint_;
    private int index_;
    private int state_;
    private int taskId_;
    private String errorMsg_ = "";
    private ByteString content_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<FTChunk$FTChunkRequestResponse, Builder> implements FTChunk$FTChunkRequestResponseOrBuilder {
        public Builder clearContent() {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearContent();
            return this;
        }

        public Builder clearEndPoint() {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearEndPoint();
            return this;
        }

        public Builder clearErrorMsg() {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearErrorMsg();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearIndex();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearState();
            return this;
        }

        public Builder clearTaskId() {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearTaskId();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public ByteString getContent() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getContent();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public int getEndPoint() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getEndPoint();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public String getErrorMsg() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsg();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public ByteString getErrorMsgBytes() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsgBytes();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public int getIndex() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getIndex();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public int getState() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getState();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
        public int getTaskId() {
            return ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getTaskId();
        }

        public Builder setContent(ByteString byteString) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setContent(byteString);
            return this;
        }

        public Builder setEndPoint(int i) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setEndPoint(i);
            return this;
        }

        public Builder setErrorMsg(String str) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsg(str);
            return this;
        }

        public Builder setErrorMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsgBytes(byteString);
            return this;
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setIndex(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setState(i);
            return this;
        }

        public Builder setTaskId(int i) {
            copyOnWrite();
            ((FTChunk$FTChunkRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setTaskId(i);
            return this;
        }

        private Builder() {
            super(FTChunk$FTChunkRequestResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse = new FTChunk$FTChunkRequestResponse();
        DEFAULT_INSTANCE = fTChunk$FTChunkRequestResponse;
        GeneratedMessageLite.registerDefaultInstance(FTChunk$FTChunkRequestResponse.class, fTChunk$FTChunkRequestResponse);
    }

    private FTChunk$FTChunkRequestResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndPoint() {
        this.endPoint_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMsg() {
        this.errorMsg_ = getDefaultInstance().getErrorMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaskId() {
        this.taskId_ = 0;
    }

    public static FTChunk$FTChunkRequestResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FTChunk$FTChunkRequestResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FTChunk$FTChunkRequestResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(ByteString byteString) {
        byteString.getClass();
        this.content_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndPoint(int i) {
        this.endPoint_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMsg(String str) {
        str.getClass();
        this.errorMsg_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMsgBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.errorMsg_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskId(int i) {
        this.taskId_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l17.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FTChunk$FTChunkRequestResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ\u0004\u000b\u0005\n\u0006\u000b", new Object[]{"taskId_", "state_", "errorMsg_", "index_", "content_", "endPoint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FTChunk$FTChunkRequestResponse.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public ByteString getContent() {
        return this.content_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public int getEndPoint() {
        return this.endPoint_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public String getErrorMsg() {
        return this.errorMsg_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public ByteString getErrorMsgBytes() {
        return ByteString.copyFromUtf8(this.errorMsg_);
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponseOrBuilder
    public int getTaskId() {
        return this.taskId_;
    }

    public static Builder newBuilder(FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fTChunk$FTChunkRequestResponse);
    }

    public static FTChunk$FTChunkRequestResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(InputStream inputStream) throws IOException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FTChunk$FTChunkRequestResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTChunk$FTChunkRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
