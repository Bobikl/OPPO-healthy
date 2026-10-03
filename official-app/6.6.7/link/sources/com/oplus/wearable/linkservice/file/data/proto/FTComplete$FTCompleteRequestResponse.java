package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.p17;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class FTComplete$FTCompleteRequestResponse extends GeneratedMessageLite<FTComplete$FTCompleteRequestResponse, Builder> implements FTComplete$FTCompleteRequestResponseOrBuilder {
    private static final FTComplete$FTCompleteRequestResponse DEFAULT_INSTANCE;
    public static final int ERRORMSG_FIELD_NUMBER = 3;
    private static volatile Parser<FTComplete$FTCompleteRequestResponse> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TASKID_FIELD_NUMBER = 1;
    private String errorMsg_ = "";
    private int state_;
    private int taskId_;

    public static final class Builder extends GeneratedMessageLite.Builder<FTComplete$FTCompleteRequestResponse, Builder> implements FTComplete$FTCompleteRequestResponseOrBuilder {
        public Builder clearErrorMsg() {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearErrorMsg();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearState();
            return this;
        }

        public Builder clearTaskId() {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearTaskId();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
        public String getErrorMsg() {
            return ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsg();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
        public ByteString getErrorMsgBytes() {
            return ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsgBytes();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
        public int getState() {
            return ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getState();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
        public int getTaskId() {
            return ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getTaskId();
        }

        public Builder setErrorMsg(String str) {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsg(str);
            return this;
        }

        public Builder setErrorMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsgBytes(byteString);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setState(i);
            return this;
        }

        public Builder setTaskId(int i) {
            copyOnWrite();
            ((FTComplete$FTCompleteRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setTaskId(i);
            return this;
        }

        private Builder() {
            super(FTComplete$FTCompleteRequestResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FTComplete$FTCompleteRequestResponse fTComplete$FTCompleteRequestResponse = new FTComplete$FTCompleteRequestResponse();
        DEFAULT_INSTANCE = fTComplete$FTCompleteRequestResponse;
        GeneratedMessageLite.registerDefaultInstance(FTComplete$FTCompleteRequestResponse.class, fTComplete$FTCompleteRequestResponse);
    }

    private FTComplete$FTCompleteRequestResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMsg() {
        this.errorMsg_ = getDefaultInstance().getErrorMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaskId() {
        this.taskId_ = 0;
    }

    public static FTComplete$FTCompleteRequestResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FTComplete$FTCompleteRequestResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FTComplete$FTCompleteRequestResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskId(int i) {
        this.taskId_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = p17.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FTComplete$FTCompleteRequestResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ", new Object[]{"taskId_", "state_", "errorMsg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FTComplete$FTCompleteRequestResponse.class) {
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

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
    public String getErrorMsg() {
        return this.errorMsg_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
    public ByteString getErrorMsgBytes() {
        return ByteString.copyFromUtf8(this.errorMsg_);
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponseOrBuilder
    public int getTaskId() {
        return this.taskId_;
    }

    public static Builder newBuilder(FTComplete$FTCompleteRequestResponse fTComplete$FTCompleteRequestResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fTComplete$FTCompleteRequestResponse);
    }

    public static FTComplete$FTCompleteRequestResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(InputStream inputStream) throws IOException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FTComplete$FTCompleteRequestResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTComplete$FTCompleteRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
