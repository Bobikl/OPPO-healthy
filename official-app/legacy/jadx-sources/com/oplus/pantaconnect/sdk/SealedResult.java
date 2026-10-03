package com.oplus.pantaconnect.sdk;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.oplus.pantaconnect.agents.cherry;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class SealedResult extends GeneratedMessageV3 implements SealedResultOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    public static final int ERRORCODE_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 4;
    public static final int RESULTCODE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private ByteString data_;
    private int errorCode_;
    private byte memoizedIsInitialized;
    private volatile Object message_;
    private int resultCode_;
    private static final SealedResult DEFAULT_INSTANCE = new SealedResult();
    private static final Parser<SealedResult> PARSER = new AbstractParser<SealedResult>() { // from class: com.oplus.pantaconnect.sdk.SealedResult.1
        @Override // com.google.protobuf.Parser
        public SealedResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = SealedResult.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e2) {
                throw e2.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (UninitializedMessageException e3) {
                throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e4) {
                throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }
    };

    public static SealedResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Results.internal_static_com_oplus_pantaconnect_sdk_SealedResult_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SealedResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SealedResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SealedResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<SealedResult> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SealedResult)) {
            return super.equals(obj);
        }
        SealedResult sealedResult = (SealedResult) obj;
        return this.resultCode_ == sealedResult.resultCode_ && getData().equals(sealedResult.getData()) && this.errorCode_ == sealedResult.errorCode_ && getMessage().equals(sealedResult.getMessage()) && getUnknownFields().equals(sealedResult.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public ErrorCode getErrorCode() {
        ErrorCode errorCodeForNumber = ErrorCode.forNumber(this.errorCode_);
        return errorCodeForNumber == null ? ErrorCode.UNRECOGNIZED : errorCodeForNumber;
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public int getErrorCodeValue() {
        return this.errorCode_;
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public String getMessage() {
        Object obj = this.message_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.message_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public ByteString getMessageBytes() {
        Object obj = this.message_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.message_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SealedResult> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public ResultCode getResultCode() {
        ResultCode resultCodeForNumber = ResultCode.forNumber(this.resultCode_);
        return resultCodeForNumber == null ? ResultCode.UNRECOGNIZED : resultCodeForNumber;
    }

    @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
    public int getResultCodeValue() {
        return this.resultCode_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = this.resultCode_ != ResultCode.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.resultCode_) : 0;
        if (!this.data_.isEmpty()) {
            iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.data_);
        }
        if (this.errorCode_ != ErrorCode.ERROR_CODE_UNKNOWN.getNumber()) {
            iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.errorCode_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.message_)) {
            iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.message_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getMessage().hashCode() + cherry.carambola((((getData().hashCode() + cherry.carambola((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.resultCode_, 37, 2, 53)) * 37) + 3) * 53, this.errorCode_, 37, 4, 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Results.internal_static_com_oplus_pantaconnect_sdk_SealedResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SealedResult.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SealedResult();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.resultCode_ != ResultCode.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.resultCode_);
        }
        if (!this.data_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.data_);
        }
        if (this.errorCode_ != ErrorCode.ERROR_CODE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.errorCode_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.message_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.message_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SealedResultOrBuilder {
        private int bitField0_;
        private ByteString data_;
        private int errorCode_;
        private Object message_;
        private int resultCode_;

        private void buildPartial0(SealedResult sealedResult) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                sealedResult.resultCode_ = this.resultCode_;
            }
            if ((i & 2) != 0) {
                sealedResult.data_ = this.data_;
            }
            if ((i & 4) != 0) {
                sealedResult.errorCode_ = this.errorCode_;
            }
            if ((i & 8) != 0) {
                sealedResult.message_ = this.message_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Results.internal_static_com_oplus_pantaconnect_sdk_SealedResult_descriptor;
        }

        public Builder clearData() {
            this.bitField0_ &= -3;
            this.data_ = SealedResult.getDefaultInstance().getData();
            onChanged();
            return this;
        }

        public Builder clearErrorCode() {
            this.bitField0_ &= -5;
            this.errorCode_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMessage() {
            this.message_ = SealedResult.getDefaultInstance().getMessage();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearResultCode() {
            this.bitField0_ &= -2;
            this.resultCode_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Results.internal_static_com_oplus_pantaconnect_sdk_SealedResult_descriptor;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public ErrorCode getErrorCode() {
            ErrorCode errorCodeForNumber = ErrorCode.forNumber(this.errorCode_);
            return errorCodeForNumber == null ? ErrorCode.UNRECOGNIZED : errorCodeForNumber;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public int getErrorCodeValue() {
            return this.errorCode_;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.message_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public ByteString getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.message_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public ResultCode getResultCode() {
            ResultCode resultCodeForNumber = ResultCode.forNumber(this.resultCode_);
            return resultCodeForNumber == null ? ResultCode.UNRECOGNIZED : resultCodeForNumber;
        }

        @Override // com.oplus.pantaconnect.sdk.SealedResultOrBuilder
        public int getResultCodeValue() {
            return this.resultCode_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Results.internal_static_com_oplus_pantaconnect_sdk_SealedResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SealedResult.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setErrorCode(ErrorCode errorCode) {
            errorCode.getClass();
            this.bitField0_ |= 4;
            this.errorCode_ = errorCode.getNumber();
            onChanged();
            return this;
        }

        public Builder setErrorCodeValue(int i) {
            this.errorCode_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setMessage(String str) {
            str.getClass();
            this.message_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.message_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setResultCode(ResultCode resultCode) {
            resultCode.getClass();
            this.bitField0_ |= 1;
            this.resultCode_ = resultCode.getNumber();
            onChanged();
            return this;
        }

        public Builder setResultCodeValue(int i) {
            this.resultCode_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private Builder() {
            this.resultCode_ = 0;
            this.data_ = ByteString.EMPTY;
            this.errorCode_ = 0;
            this.message_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SealedResult build() {
            SealedResult sealedResultBuildPartial = buildPartial();
            if (sealedResultBuildPartial.isInitialized()) {
                return sealedResultBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sealedResultBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SealedResult buildPartial() {
            SealedResult sealedResult = new SealedResult(this);
            if (this.bitField0_ != 0) {
                buildPartial0(sealedResult);
            }
            onBuilt();
            return sealedResult;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SealedResult getDefaultInstanceForType() {
            return SealedResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.resultCode_ = 0;
            this.data_ = ByteString.EMPTY;
            this.errorCode_ = 0;
            this.message_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SealedResult) {
                return mergeFrom((SealedResult) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.resultCode_ = 0;
            this.data_ = ByteString.EMPTY;
            this.errorCode_ = 0;
            this.message_ = "";
        }

        public Builder mergeFrom(SealedResult sealedResult) {
            if (sealedResult == SealedResult.getDefaultInstance()) {
                return this;
            }
            if (sealedResult.resultCode_ != 0) {
                setResultCodeValue(sealedResult.getResultCodeValue());
            }
            if (sealedResult.getData() != ByteString.EMPTY) {
                setData(sealedResult.getData());
            }
            if (sealedResult.errorCode_ != 0) {
                setErrorCodeValue(sealedResult.getErrorCodeValue());
            }
            if (!sealedResult.getMessage().isEmpty()) {
                this.message_ = sealedResult.message_;
                this.bitField0_ |= 8;
                onChanged();
            }
            mergeUnknownFields(sealedResult.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            extensionRegistryLite.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.resultCode_ = codedInputStream.readEnum();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.data_ = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.errorCode_ = codedInputStream.readEnum();
                                this.bitField0_ |= 4;
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.message_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    private SealedResult(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.resultCode_ = 0;
        this.data_ = ByteString.EMPTY;
        this.errorCode_ = 0;
        this.message_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(SealedResult sealedResult) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sealedResult);
    }

    public static SealedResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SealedResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SealedResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SealedResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SealedResult getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SealedResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static SealedResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static SealedResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SealedResult parseFrom(InputStream inputStream) throws IOException {
        return (SealedResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private SealedResult() {
        this.resultCode_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.data_ = byteString;
        this.errorCode_ = 0;
        this.message_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.resultCode_ = 0;
        this.data_ = byteString;
        this.errorCode_ = 0;
        this.message_ = "";
    }

    public static SealedResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SealedResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SealedResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SealedResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SealedResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SealedResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
