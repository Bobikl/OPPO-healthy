package com.oplus.wearable.linkservice.file.data.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r17;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class FTSend$FTSendRequestResponse extends GeneratedMessageLite<FTSend$FTSendRequestResponse, Builder> implements FTSend$FTSendRequestResponseOrBuilder {
    private static final FTSend$FTSendRequestResponse DEFAULT_INSTANCE;
    public static final int ERRORMSG_FIELD_NUMBER = 3;
    public static final int FILEPATH_FIELD_NUMBER = 5;
    public static final int FILESIZE_FIELD_NUMBER = 6;
    public static final int FTBUFFERSIZE_FIELD_NUMBER = 10;
    public static final int MD5_FIELD_NUMBER = 7;
    private static volatile Parser<FTSend$FTSendRequestResponse> PARSER = null;
    public static final int SERVICEID_FIELD_NUMBER = 8;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int SUPPORTOPTION_FIELD_NUMBER = 9;
    public static final int TASKID_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 4;
    private int fileSize_;
    private int ftBufferSize_;
    private int serviceId_;
    private int state_;
    private int supportOption_;
    private int taskId_;
    private String errorMsg_ = "";
    private String uri_ = "";
    private String filePath_ = "";
    private ByteString mD5_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<FTSend$FTSendRequestResponse, Builder> implements FTSend$FTSendRequestResponseOrBuilder {
        public Builder clearErrorMsg() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearErrorMsg();
            return this;
        }

        public Builder clearFilePath() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearFilePath();
            return this;
        }

        public Builder clearFileSize() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearFileSize();
            return this;
        }

        public Builder clearFtBufferSize() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearFtBufferSize();
            return this;
        }

        public Builder clearMD5() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearMD5();
            return this;
        }

        public Builder clearServiceId() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearServiceId();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearState();
            return this;
        }

        public Builder clearSupportOption() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearSupportOption();
            return this;
        }

        public Builder clearTaskId() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearTaskId();
            return this;
        }

        public Builder clearUri() {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).clearUri();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public String getErrorMsg() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsg();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public ByteString getErrorMsgBytes() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getErrorMsgBytes();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public String getFilePath() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getFilePath();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public ByteString getFilePathBytes() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getFilePathBytes();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public int getFileSize() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getFileSize();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public int getFtBufferSize() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getFtBufferSize();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public ByteString getMD5() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getMD5();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public int getServiceId() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getServiceId();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public int getState() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getState();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public int getSupportOption() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getSupportOption();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public int getTaskId() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getTaskId();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public String getUri() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getUri();
        }

        @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
        public ByteString getUriBytes() {
            return ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).getUriBytes();
        }

        public Builder setErrorMsg(String str) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsg(str);
            return this;
        }

        public Builder setErrorMsgBytes(ByteString byteString) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setErrorMsgBytes(byteString);
            return this;
        }

        public Builder setFilePath(String str) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setFilePath(str);
            return this;
        }

        public Builder setFilePathBytes(ByteString byteString) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setFilePathBytes(byteString);
            return this;
        }

        public Builder setFileSize(int i) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setFileSize(i);
            return this;
        }

        public Builder setFtBufferSize(int i) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setFtBufferSize(i);
            return this;
        }

        public Builder setMD5(ByteString byteString) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setMD5(byteString);
            return this;
        }

        public Builder setServiceId(int i) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setServiceId(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setState(i);
            return this;
        }

        public Builder setSupportOption(int i) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setSupportOption(i);
            return this;
        }

        public Builder setTaskId(int i) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setTaskId(i);
            return this;
        }

        public Builder setUri(String str) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setUri(str);
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            copyOnWrite();
            ((FTSend$FTSendRequestResponse) ((GeneratedMessageLite.Builder) this).instance).setUriBytes(byteString);
            return this;
        }

        private Builder() {
            super(FTSend$FTSendRequestResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FTSend$FTSendRequestResponse fTSend$FTSendRequestResponse = new FTSend$FTSendRequestResponse();
        DEFAULT_INSTANCE = fTSend$FTSendRequestResponse;
        GeneratedMessageLite.registerDefaultInstance(FTSend$FTSendRequestResponse.class, fTSend$FTSendRequestResponse);
    }

    private FTSend$FTSendRequestResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMsg() {
        this.errorMsg_ = getDefaultInstance().getErrorMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilePath() {
        this.filePath_ = getDefaultInstance().getFilePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileSize() {
        this.fileSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFtBufferSize() {
        this.ftBufferSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMD5() {
        this.mD5_ = getDefaultInstance().getMD5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceId() {
        this.serviceId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportOption() {
        this.supportOption_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaskId() {
        this.taskId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = getDefaultInstance().getUri();
    }

    public static FTSend$FTSendRequestResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FTSend$FTSendRequestResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTSend$FTSendRequestResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FTSend$FTSendRequestResponse> parser() {
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
    public void setFilePath(String str) {
        str.getClass();
        this.filePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilePathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.filePath_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileSize(int i) {
        this.fileSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFtBufferSize(int i) {
        this.ftBufferSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMD5(ByteString byteString) {
        byteString.getClass();
        this.mD5_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceId(int i) {
        this.serviceId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportOption(int i) {
        this.supportOption_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaskId(int i) {
        this.taskId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uri_ = byteString.toStringUtf8();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r17.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FTSend$FTSendRequestResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u000b\u0007\n\b\u000b\t\u000b\n\u000b", new Object[]{"taskId_", "state_", "errorMsg_", "uri_", "filePath_", "fileSize_", "mD5_", "serviceId_", "supportOption_", "ftBufferSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FTSend$FTSendRequestResponse.class) {
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

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public String getErrorMsg() {
        return this.errorMsg_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public ByteString getErrorMsgBytes() {
        return ByteString.copyFromUtf8(this.errorMsg_);
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public String getFilePath() {
        return this.filePath_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public ByteString getFilePathBytes() {
        return ByteString.copyFromUtf8(this.filePath_);
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public int getFileSize() {
        return this.fileSize_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public int getFtBufferSize() {
        return this.ftBufferSize_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public ByteString getMD5() {
        return this.mD5_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public int getServiceId() {
        return this.serviceId_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public int getSupportOption() {
        return this.supportOption_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public int getTaskId() {
        return this.taskId_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public String getUri() {
        return this.uri_;
    }

    @Override // com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponseOrBuilder
    public ByteString getUriBytes() {
        return ByteString.copyFromUtf8(this.uri_);
    }

    public static Builder newBuilder(FTSend$FTSendRequestResponse fTSend$FTSendRequestResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fTSend$FTSendRequestResponse);
    }

    public static FTSend$FTSendRequestResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTSend$FTSendRequestResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FTSend$FTSendRequestResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FTSend$FTSendRequestResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FTSend$FTSendRequestResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FTSend$FTSendRequestResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FTSend$FTSendRequestResponse parseFrom(InputStream inputStream) throws IOException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FTSend$FTSendRequestResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FTSend$FTSendRequestResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FTSend$FTSendRequestResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FTSend$FTSendRequestResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
