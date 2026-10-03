package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j17;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class FTCancel$FTCancelRequestResponse extends GeneratedMessageLite<FTCancel$FTCancelRequestResponse, Builder> implements FTCancel$FTCancelRequestResponseOrBuilder {
    private static final FTCancel$FTCancelRequestResponse DEFAULT_INSTANCE;
    public static final int ERRORMSG_FIELD_NUMBER = 3;
    private static volatile Parser<FTCancel$FTCancelRequestResponse> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int TASKID_FIELD_NUMBER = 1;
    private String errorMsg_ = "";
    private int state_;
    private int taskId_;

    public static final class Builder extends GeneratedMessageLite.Builder<FTCancel$FTCancelRequestResponse, Builder> implements FTCancel$FTCancelRequestResponseOrBuilder {
        public Builder clearErrorMsg() {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearErrorMsg();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearState();
            return this;
        }

        public Builder clearTaskId() {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearTaskId();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
        public String getErrorMsg() {
            return ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsg();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
        public ByteString getErrorMsgBytes() {
            return ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsgBytes();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
        public int getState() {
            return ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getState();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
        public int getTaskId() {
            return ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getTaskId();
        }

        public Builder setErrorMsg(String str) {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsg(str);
            return this;
        }

        public Builder setErrorMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsgBytes(byteString);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setState(i);
            return this;
        }

        public Builder setTaskId(int i) {
            copyOnWrite();
            ((FTCancel$FTCancelRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setTaskId(i);
            return this;
        }

        private Builder() {
            super(FTCancel$FTCancelRequestResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FTCancel$FTCancelRequestResponse fTCancel$FTCancelRequestResponse = new FTCancel$FTCancelRequestResponse();
        DEFAULT_INSTANCE = fTCancel$FTCancelRequestResponse;
        GeneratedMessageLite.registerDefaultInstance(FTCancel$FTCancelRequestResponse.class, fTCancel$FTCancelRequestResponse);
    }

    private FTCancel$FTCancelRequestResponse() {
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

    public static FTCancel$FTCancelRequestResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FTCancel$FTCancelRequestResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FTCancel$FTCancelRequestResponse> parser() {
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
        int i = j17.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FTCancel$FTCancelRequestResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ", new Object[]{"taskId_", "state_", "errorMsg_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FTCancel$FTCancelRequestResponse.class) {
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

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
    public String getErrorMsg() {
        return this.errorMsg_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
    public ByteString getErrorMsgBytes() {
        return ByteString.copyFromUtf8(this.errorMsg_);
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponseOrBuilder
    public int getTaskId() {
        return this.taskId_;
    }

    public static Builder newBuilder(FTCancel$FTCancelRequestResponse fTCancel$FTCancelRequestResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fTCancel$FTCancelRequestResponse);
    }

    public static FTCancel$FTCancelRequestResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(InputStream inputStream) throws IOException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FTCancel$FTCancelRequestResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTCancel$FTCancelRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
