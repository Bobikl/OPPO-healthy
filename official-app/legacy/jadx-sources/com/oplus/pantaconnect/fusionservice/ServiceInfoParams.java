package com.oplus.pantaconnect.fusionservice;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class ServiceInfoParams extends GeneratedMessageV3 implements ServiceInfoParamsOrBuilder {
    private static final ServiceInfoParams DEFAULT_INSTANCE = new ServiceInfoParams();
    private static final Parser<ServiceInfoParams> PARSER = new AbstractParser<ServiceInfoParams>() { // from class: com.oplus.pantaconnect.fusionservice.ServiceInfoParams.1
        @Override // com.google.protobuf.Parser
        public ServiceInfoParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ServiceInfoParams.newBuilder();
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
    public static final int SERVICEDATA_FIELD_NUMBER = 2;
    public static final int SERVICEID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private ByteString serviceData_;
    private volatile Object serviceId_;

    public static ServiceInfoParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ServiceInfoParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ServiceInfoParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ServiceInfoParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<ServiceInfoParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServiceInfoParams)) {
            return super.equals(obj);
        }
        ServiceInfoParams serviceInfoParams = (ServiceInfoParams) obj;
        return getServiceId().equals(serviceInfoParams.getServiceId()) && getServiceData().equals(serviceInfoParams.getServiceData()) && getUnknownFields().equals(serviceInfoParams.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ServiceInfoParams> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.serviceId_) ? GeneratedMessageV3.computeStringSize(1, this.serviceId_) : 0;
        if (!this.serviceData_.isEmpty()) {
            iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.serviceData_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.fusionservice.ServiceInfoParamsOrBuilder
    public ByteString getServiceData() {
        return this.serviceData_;
    }

    @Override // com.oplus.pantaconnect.fusionservice.ServiceInfoParamsOrBuilder
    public String getServiceId() {
        Object obj = this.serviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.serviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.ServiceInfoParamsOrBuilder
    public ByteString getServiceIdBytes() {
        Object obj = this.serviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.serviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getServiceData().hashCode() + ((((getServiceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceInfoParams.class, Builder.class);
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
        return new ServiceInfoParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.serviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.serviceId_);
        }
        if (!this.serviceData_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.serviceData_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceInfoParamsOrBuilder {
        private int bitField0_;
        private ByteString serviceData_;
        private Object serviceId_;

        private void buildPartial0(ServiceInfoParams serviceInfoParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                serviceInfoParams.serviceId_ = this.serviceId_;
            }
            if ((i & 2) != 0) {
                serviceInfoParams.serviceData_ = this.serviceData_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_descriptor;
        }

        public Builder clearServiceData() {
            this.bitField0_ &= -3;
            this.serviceData_ = ServiceInfoParams.getDefaultInstance().getServiceData();
            onChanged();
            return this;
        }

        public Builder clearServiceId() {
            this.serviceId_ = ServiceInfoParams.getDefaultInstance().getServiceId();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_descriptor;
        }

        @Override // com.oplus.pantaconnect.fusionservice.ServiceInfoParamsOrBuilder
        public ByteString getServiceData() {
            return this.serviceData_;
        }

        @Override // com.oplus.pantaconnect.fusionservice.ServiceInfoParamsOrBuilder
        public String getServiceId() {
            Object obj = this.serviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.serviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.ServiceInfoParamsOrBuilder
        public ByteString getServiceIdBytes() {
            Object obj = this.serviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceInfoParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setServiceData(ByteString byteString) {
            byteString.getClass();
            this.serviceData_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setServiceId(String str) {
            str.getClass();
            this.serviceId_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setServiceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.serviceId_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private Builder() {
            this.serviceId_ = "";
            this.serviceData_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ServiceInfoParams build() {
            ServiceInfoParams serviceInfoParamsBuildPartial = buildPartial();
            if (serviceInfoParamsBuildPartial.isInitialized()) {
                return serviceInfoParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceInfoParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ServiceInfoParams buildPartial() {
            ServiceInfoParams serviceInfoParams = new ServiceInfoParams(this);
            if (this.bitField0_ != 0) {
                buildPartial0(serviceInfoParams);
            }
            onBuilt();
            return serviceInfoParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ServiceInfoParams getDefaultInstanceForType() {
            return ServiceInfoParams.getDefaultInstance();
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
            this.serviceId_ = "";
            this.serviceData_ = ByteString.EMPTY;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.serviceId_ = "";
            this.serviceData_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ServiceInfoParams) {
                return mergeFrom((ServiceInfoParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ServiceInfoParams serviceInfoParams) {
            if (serviceInfoParams == ServiceInfoParams.getDefaultInstance()) {
                return this;
            }
            if (!serviceInfoParams.getServiceId().isEmpty()) {
                this.serviceId_ = serviceInfoParams.serviceId_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (serviceInfoParams.getServiceData() != ByteString.EMPTY) {
                setServiceData(serviceInfoParams.getServiceData());
            }
            mergeUnknownFields(serviceInfoParams.getUnknownFields());
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
                            if (tag == 10) {
                                this.serviceId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.serviceData_ = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
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

    private ServiceInfoParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.serviceId_ = "";
        this.serviceData_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(ServiceInfoParams serviceInfoParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(serviceInfoParams);
    }

    public static ServiceInfoParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ServiceInfoParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServiceInfoParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServiceInfoParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ServiceInfoParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ServiceInfoParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ServiceInfoParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private ServiceInfoParams() {
        this.serviceId_ = "";
        ByteString byteString = ByteString.EMPTY;
        this.serviceData_ = byteString;
        this.memoizedIsInitialized = (byte) -1;
        this.serviceId_ = "";
        this.serviceData_ = byteString;
    }

    public static ServiceInfoParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ServiceInfoParams parseFrom(InputStream inputStream) throws IOException {
        return (ServiceInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ServiceInfoParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServiceInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ServiceInfoParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ServiceInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ServiceInfoParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ServiceInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
