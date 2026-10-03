package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class SecureGcmProximityAuthProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_securegcm_CloudToDeviceProximityAuthPairing_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_CloudToDeviceProximityAuthPairing_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_DeviceProximityCallback_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_DeviceProximityCallback_fieldAccessorTable;

    public static final class CloudToDeviceProximityAuthPairing extends GeneratedMessageV3 implements CloudToDeviceProximityAuthPairingOrBuilder {
        public static final int ADDITIONAL_METADATA_FIELD_NUMBER = 4;
        public static final int EPHEMERAL_SYMMETRIC_KEY_FIELD_NUMBER = 3;
        public static final int INITIATING_DEVICE_BT_ADDRESS_FIELD_NUMBER = 2;
        public static final int INITIATING_DEVICE_NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private ByteString additionalMetadata_;
        private int bitField0_;
        private ByteString ephemeralSymmetricKey_;
        private volatile Object initiatingDeviceBtAddress_;
        private volatile Object initiatingDeviceName_;
        private byte memoizedIsInitialized;
        private static final CloudToDeviceProximityAuthPairing DEFAULT_INSTANCE = new CloudToDeviceProximityAuthPairing();

        @Deprecated
        public static final Parser<CloudToDeviceProximityAuthPairing> PARSER = new AbstractParser<CloudToDeviceProximityAuthPairing>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairing.1
            @Override // com.google.protobuf.Parser
            public CloudToDeviceProximityAuthPairing parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CloudToDeviceProximityAuthPairing(codedInputStream, extensionRegistryLite);
            }
        };

        public static CloudToDeviceProximityAuthPairing getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmProximityAuthProto.internal_static_securegcm_CloudToDeviceProximityAuthPairing_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CloudToDeviceProximityAuthPairing parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CloudToDeviceProximityAuthPairing) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<CloudToDeviceProximityAuthPairing> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CloudToDeviceProximityAuthPairing)) {
                return super.equals(obj);
            }
            CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairing = (CloudToDeviceProximityAuthPairing) obj;
            boolean z = hasInitiatingDeviceName() == cloudToDeviceProximityAuthPairing.hasInitiatingDeviceName();
            if (hasInitiatingDeviceName()) {
                z = z && getInitiatingDeviceName().equals(cloudToDeviceProximityAuthPairing.getInitiatingDeviceName());
            }
            boolean z2 = z && hasInitiatingDeviceBtAddress() == cloudToDeviceProximityAuthPairing.hasInitiatingDeviceBtAddress();
            if (hasInitiatingDeviceBtAddress()) {
                z2 = z2 && getInitiatingDeviceBtAddress().equals(cloudToDeviceProximityAuthPairing.getInitiatingDeviceBtAddress());
            }
            boolean z3 = z2 && hasEphemeralSymmetricKey() == cloudToDeviceProximityAuthPairing.hasEphemeralSymmetricKey();
            if (hasEphemeralSymmetricKey()) {
                z3 = z3 && getEphemeralSymmetricKey().equals(cloudToDeviceProximityAuthPairing.getEphemeralSymmetricKey());
            }
            boolean z4 = z3 && hasAdditionalMetadata() == cloudToDeviceProximityAuthPairing.hasAdditionalMetadata();
            if (hasAdditionalMetadata()) {
                z4 = z4 && getAdditionalMetadata().equals(cloudToDeviceProximityAuthPairing.getAdditionalMetadata());
            }
            return z4 && this.unknownFields.equals(cloudToDeviceProximityAuthPairing.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public ByteString getAdditionalMetadata() {
            return this.additionalMetadata_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public ByteString getEphemeralSymmetricKey() {
            return this.ephemeralSymmetricKey_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public String getInitiatingDeviceBtAddress() {
            Object obj = this.initiatingDeviceBtAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.initiatingDeviceBtAddress_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public ByteString getInitiatingDeviceBtAddressBytes() {
            Object obj = this.initiatingDeviceBtAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.initiatingDeviceBtAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public String getInitiatingDeviceName() {
            Object obj = this.initiatingDeviceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.initiatingDeviceName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public ByteString getInitiatingDeviceNameBytes() {
            Object obj = this.initiatingDeviceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.initiatingDeviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CloudToDeviceProximityAuthPairing> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? 0 + GeneratedMessageV3.computeStringSize(1, this.initiatingDeviceName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.initiatingDeviceBtAddress_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.ephemeralSymmetricKey_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(4, this.additionalMetadata_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public boolean hasAdditionalMetadata() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public boolean hasEphemeralSymmetricKey() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public boolean hasInitiatingDeviceBtAddress() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
        public boolean hasInitiatingDeviceName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasInitiatingDeviceName()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getInitiatingDeviceName().hashCode();
            }
            if (hasInitiatingDeviceBtAddress()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getInitiatingDeviceBtAddress().hashCode();
            }
            if (hasEphemeralSymmetricKey()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getEphemeralSymmetricKey().hashCode();
            }
            if (hasAdditionalMetadata()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getAdditionalMetadata().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmProximityAuthProto.internal_static_securegcm_CloudToDeviceProximityAuthPairing_fieldAccessorTable.ensureFieldAccessorsInitialized(CloudToDeviceProximityAuthPairing.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.initiatingDeviceName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.initiatingDeviceBtAddress_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.ephemeralSymmetricKey_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBytes(4, this.additionalMetadata_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CloudToDeviceProximityAuthPairingOrBuilder {
            private ByteString additionalMetadata_;
            private int bitField0_;
            private ByteString ephemeralSymmetricKey_;
            private Object initiatingDeviceBtAddress_;
            private Object initiatingDeviceName_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmProximityAuthProto.internal_static_securegcm_CloudToDeviceProximityAuthPairing_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearAdditionalMetadata() {
                this.bitField0_ &= -9;
                this.additionalMetadata_ = CloudToDeviceProximityAuthPairing.getDefaultInstance().getAdditionalMetadata();
                onChanged();
                return this;
            }

            public Builder clearEphemeralSymmetricKey() {
                this.bitField0_ &= -5;
                this.ephemeralSymmetricKey_ = CloudToDeviceProximityAuthPairing.getDefaultInstance().getEphemeralSymmetricKey();
                onChanged();
                return this;
            }

            public Builder clearInitiatingDeviceBtAddress() {
                this.bitField0_ &= -3;
                this.initiatingDeviceBtAddress_ = CloudToDeviceProximityAuthPairing.getDefaultInstance().getInitiatingDeviceBtAddress();
                onChanged();
                return this;
            }

            public Builder clearInitiatingDeviceName() {
                this.bitField0_ &= -2;
                this.initiatingDeviceName_ = CloudToDeviceProximityAuthPairing.getDefaultInstance().getInitiatingDeviceName();
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public ByteString getAdditionalMetadata() {
                return this.additionalMetadata_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmProximityAuthProto.internal_static_securegcm_CloudToDeviceProximityAuthPairing_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public ByteString getEphemeralSymmetricKey() {
                return this.ephemeralSymmetricKey_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public String getInitiatingDeviceBtAddress() {
                Object obj = this.initiatingDeviceBtAddress_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.initiatingDeviceBtAddress_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public ByteString getInitiatingDeviceBtAddressBytes() {
                Object obj = this.initiatingDeviceBtAddress_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.initiatingDeviceBtAddress_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public String getInitiatingDeviceName() {
                Object obj = this.initiatingDeviceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.initiatingDeviceName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public ByteString getInitiatingDeviceNameBytes() {
                Object obj = this.initiatingDeviceName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.initiatingDeviceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public boolean hasAdditionalMetadata() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public boolean hasEphemeralSymmetricKey() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public boolean hasInitiatingDeviceBtAddress() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.CloudToDeviceProximityAuthPairingOrBuilder
            public boolean hasInitiatingDeviceName() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmProximityAuthProto.internal_static_securegcm_CloudToDeviceProximityAuthPairing_fieldAccessorTable.ensureFieldAccessorsInitialized(CloudToDeviceProximityAuthPairing.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAdditionalMetadata(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.additionalMetadata_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEphemeralSymmetricKey(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.ephemeralSymmetricKey_ = byteString;
                onChanged();
                return this;
            }

            public Builder setInitiatingDeviceBtAddress(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.initiatingDeviceBtAddress_ = str;
                onChanged();
                return this;
            }

            public Builder setInitiatingDeviceBtAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.initiatingDeviceBtAddress_ = byteString;
                onChanged();
                return this;
            }

            public Builder setInitiatingDeviceName(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.initiatingDeviceName_ = str;
                onChanged();
                return this;
            }

            public Builder setInitiatingDeviceNameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.initiatingDeviceName_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.initiatingDeviceName_ = "";
                this.initiatingDeviceBtAddress_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.ephemeralSymmetricKey_ = byteString;
                this.additionalMetadata_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CloudToDeviceProximityAuthPairing build() {
                CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairingBuildPartial = buildPartial();
                if (cloudToDeviceProximityAuthPairingBuildPartial.isInitialized()) {
                    return cloudToDeviceProximityAuthPairingBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cloudToDeviceProximityAuthPairingBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CloudToDeviceProximityAuthPairing buildPartial() {
                CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairing = new CloudToDeviceProximityAuthPairing(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                cloudToDeviceProximityAuthPairing.initiatingDeviceName_ = this.initiatingDeviceName_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cloudToDeviceProximityAuthPairing.initiatingDeviceBtAddress_ = this.initiatingDeviceBtAddress_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cloudToDeviceProximityAuthPairing.ephemeralSymmetricKey_ = this.ephemeralSymmetricKey_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                cloudToDeviceProximityAuthPairing.additionalMetadata_ = this.additionalMetadata_;
                cloudToDeviceProximityAuthPairing.bitField0_ = i2;
                onBuilt();
                return cloudToDeviceProximityAuthPairing;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CloudToDeviceProximityAuthPairing getDefaultInstanceForType() {
                return CloudToDeviceProximityAuthPairing.getDefaultInstance();
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
                this.initiatingDeviceName_ = "";
                int i = this.bitField0_ & (-2);
                this.initiatingDeviceBtAddress_ = "";
                int i2 = i & (-3);
                this.bitField0_ = i2;
                ByteString byteString = ByteString.EMPTY;
                this.ephemeralSymmetricKey_ = byteString;
                this.additionalMetadata_ = byteString;
                this.bitField0_ = i2 & (-5) & (-9);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CloudToDeviceProximityAuthPairing) {
                    return mergeFrom((CloudToDeviceProximityAuthPairing) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.initiatingDeviceName_ = "";
                this.initiatingDeviceBtAddress_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.ephemeralSymmetricKey_ = byteString;
                this.additionalMetadata_ = byteString;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairing) {
                if (cloudToDeviceProximityAuthPairing == CloudToDeviceProximityAuthPairing.getDefaultInstance()) {
                    return this;
                }
                if (cloudToDeviceProximityAuthPairing.hasInitiatingDeviceName()) {
                    this.bitField0_ |= 1;
                    this.initiatingDeviceName_ = cloudToDeviceProximityAuthPairing.initiatingDeviceName_;
                    onChanged();
                }
                if (cloudToDeviceProximityAuthPairing.hasInitiatingDeviceBtAddress()) {
                    this.bitField0_ |= 2;
                    this.initiatingDeviceBtAddress_ = cloudToDeviceProximityAuthPairing.initiatingDeviceBtAddress_;
                    onChanged();
                }
                if (cloudToDeviceProximityAuthPairing.hasEphemeralSymmetricKey()) {
                    setEphemeralSymmetricKey(cloudToDeviceProximityAuthPairing.getEphemeralSymmetricKey());
                }
                if (cloudToDeviceProximityAuthPairing.hasAdditionalMetadata()) {
                    setAdditionalMetadata(cloudToDeviceProximityAuthPairing.getAdditionalMetadata());
                }
                mergeUnknownFields(((GeneratedMessageV3) cloudToDeviceProximityAuthPairing).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairing = null;
                try {
                    try {
                        CloudToDeviceProximityAuthPairing partialFrom = CloudToDeviceProximityAuthPairing.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairing2 = (CloudToDeviceProximityAuthPairing) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            cloudToDeviceProximityAuthPairing = cloudToDeviceProximityAuthPairing2;
                            if (cloudToDeviceProximityAuthPairing != null) {
                                mergeFrom(cloudToDeviceProximityAuthPairing);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cloudToDeviceProximityAuthPairing != null) {
                        mergeFrom(cloudToDeviceProximityAuthPairing);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(CloudToDeviceProximityAuthPairing cloudToDeviceProximityAuthPairing) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cloudToDeviceProximityAuthPairing);
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private CloudToDeviceProximityAuthPairing(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CloudToDeviceProximityAuthPairing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudToDeviceProximityAuthPairing) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CloudToDeviceProximityAuthPairing getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private CloudToDeviceProximityAuthPairing() {
            this.memoizedIsInitialized = (byte) -1;
            this.initiatingDeviceName_ = "";
            this.initiatingDeviceBtAddress_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.ephemeralSymmetricKey_ = byteString;
            this.additionalMetadata_ = byteString;
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(InputStream inputStream) throws IOException {
            return (CloudToDeviceProximityAuthPairing) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudToDeviceProximityAuthPairing) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CloudToDeviceProximityAuthPairing) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private CloudToDeviceProximityAuthPairing(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.initiatingDeviceName_ = bytes;
                            } else if (tag == 18) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.initiatingDeviceBtAddress_ = bytes2;
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.ephemeralSymmetricKey_ = codedInputStream.readBytes();
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 8;
                                this.additionalMetadata_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static CloudToDeviceProximityAuthPairing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CloudToDeviceProximityAuthPairing) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CloudToDeviceProximityAuthPairingOrBuilder extends MessageOrBuilder {
        ByteString getAdditionalMetadata();

        ByteString getEphemeralSymmetricKey();

        String getInitiatingDeviceBtAddress();

        ByteString getInitiatingDeviceBtAddressBytes();

        String getInitiatingDeviceName();

        ByteString getInitiatingDeviceNameBytes();

        boolean hasAdditionalMetadata();

        boolean hasEphemeralSymmetricKey();

        boolean hasInitiatingDeviceBtAddress();

        boolean hasInitiatingDeviceName();
    }

    public static final class DeviceProximityCallback extends GeneratedMessageV3 implements DeviceProximityCallbackOrBuilder {
        public static final int CALLBACK_BLUETOOTH_ADDRESS_FIELD_NUMBER = 1;
        private static final DeviceProximityCallback DEFAULT_INSTANCE = new DeviceProximityCallback();

        @Deprecated
        public static final Parser<DeviceProximityCallback> PARSER = new AbstractParser<DeviceProximityCallback>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallback.1
            @Override // com.google.protobuf.Parser
            public DeviceProximityCallback parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DeviceProximityCallback(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROTOCOL_VERSION_FIELD_NUMBER = 3;
        public static final int SOURCE_DEVICE_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object callbackBluetoothAddress_;
        private byte memoizedIsInitialized;
        private int protocolVersion_;
        private int sourceDeviceType_;

        public static DeviceProximityCallback getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmProximityAuthProto.internal_static_securegcm_DeviceProximityCallback_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceProximityCallback parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceProximityCallback) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceProximityCallback parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<DeviceProximityCallback> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceProximityCallback)) {
                return super.equals(obj);
            }
            DeviceProximityCallback deviceProximityCallback = (DeviceProximityCallback) obj;
            boolean z = hasCallbackBluetoothAddress() == deviceProximityCallback.hasCallbackBluetoothAddress();
            if (hasCallbackBluetoothAddress()) {
                z = z && getCallbackBluetoothAddress().equals(deviceProximityCallback.getCallbackBluetoothAddress());
            }
            boolean z2 = z && hasSourceDeviceType() == deviceProximityCallback.hasSourceDeviceType();
            if (hasSourceDeviceType()) {
                z2 = z2 && this.sourceDeviceType_ == deviceProximityCallback.sourceDeviceType_;
            }
            boolean z3 = z2 && hasProtocolVersion() == deviceProximityCallback.hasProtocolVersion();
            if (hasProtocolVersion()) {
                z3 = z3 && getProtocolVersion() == deviceProximityCallback.getProtocolVersion();
            }
            return z3 && this.unknownFields.equals(deviceProximityCallback.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public String getCallbackBluetoothAddress() {
            Object obj = this.callbackBluetoothAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.callbackBluetoothAddress_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public ByteString getCallbackBluetoothAddressBytes() {
            Object obj = this.callbackBluetoothAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.callbackBluetoothAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceProximityCallback> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = (this.bitField0_ & 1) == 1 ? 0 + GeneratedMessageV3.computeStringSize(1, this.callbackBluetoothAddress_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.sourceDeviceType_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(3, this.protocolVersion_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public SecureGcmProto.DeviceType getSourceDeviceType() {
            SecureGcmProto.DeviceType deviceTypeValueOf = SecureGcmProto.DeviceType.valueOf(this.sourceDeviceType_);
            return deviceTypeValueOf == null ? SecureGcmProto.DeviceType.UNKNOWN : deviceTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public boolean hasCallbackBluetoothAddress() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public boolean hasProtocolVersion() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
        public boolean hasSourceDeviceType() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasCallbackBluetoothAddress()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getCallbackBluetoothAddress().hashCode();
            }
            if (hasSourceDeviceType()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.sourceDeviceType_;
            }
            if (hasProtocolVersion()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getProtocolVersion();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmProximityAuthProto.internal_static_securegcm_DeviceProximityCallback_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceProximityCallback.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.callbackBluetoothAddress_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeEnum(2, this.sourceDeviceType_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(3, this.protocolVersion_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceProximityCallbackOrBuilder {
            private int bitField0_;
            private Object callbackBluetoothAddress_;
            private int protocolVersion_;
            private int sourceDeviceType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmProximityAuthProto.internal_static_securegcm_DeviceProximityCallback_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCallbackBluetoothAddress() {
                this.bitField0_ &= -2;
                this.callbackBluetoothAddress_ = DeviceProximityCallback.getDefaultInstance().getCallbackBluetoothAddress();
                onChanged();
                return this;
            }

            public Builder clearProtocolVersion() {
                this.bitField0_ &= -5;
                this.protocolVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSourceDeviceType() {
                this.bitField0_ &= -3;
                this.sourceDeviceType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public String getCallbackBluetoothAddress() {
                Object obj = this.callbackBluetoothAddress_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.callbackBluetoothAddress_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public ByteString getCallbackBluetoothAddressBytes() {
                Object obj = this.callbackBluetoothAddress_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.callbackBluetoothAddress_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmProximityAuthProto.internal_static_securegcm_DeviceProximityCallback_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public int getProtocolVersion() {
                return this.protocolVersion_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public SecureGcmProto.DeviceType getSourceDeviceType() {
                SecureGcmProto.DeviceType deviceTypeValueOf = SecureGcmProto.DeviceType.valueOf(this.sourceDeviceType_);
                return deviceTypeValueOf == null ? SecureGcmProto.DeviceType.UNKNOWN : deviceTypeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public boolean hasCallbackBluetoothAddress() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public boolean hasProtocolVersion() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.DeviceProximityCallbackOrBuilder
            public boolean hasSourceDeviceType() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmProximityAuthProto.internal_static_securegcm_DeviceProximityCallback_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceProximityCallback.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCallbackBluetoothAddress(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.callbackBluetoothAddress_ = str;
                onChanged();
                return this;
            }

            public Builder setCallbackBluetoothAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.callbackBluetoothAddress_ = byteString;
                onChanged();
                return this;
            }

            public Builder setProtocolVersion(int i) {
                this.bitField0_ |= 4;
                this.protocolVersion_ = i;
                onChanged();
                return this;
            }

            public Builder setSourceDeviceType(SecureGcmProto.DeviceType deviceType) {
                deviceType.getClass();
                this.bitField0_ |= 2;
                this.sourceDeviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.callbackBluetoothAddress_ = "";
                this.sourceDeviceType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceProximityCallback build() {
                DeviceProximityCallback deviceProximityCallbackBuildPartial = buildPartial();
                if (deviceProximityCallbackBuildPartial.isInitialized()) {
                    return deviceProximityCallbackBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceProximityCallbackBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceProximityCallback buildPartial() {
                DeviceProximityCallback deviceProximityCallback = new DeviceProximityCallback(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                deviceProximityCallback.callbackBluetoothAddress_ = this.callbackBluetoothAddress_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                deviceProximityCallback.sourceDeviceType_ = this.sourceDeviceType_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                deviceProximityCallback.protocolVersion_ = this.protocolVersion_;
                deviceProximityCallback.bitField0_ = i2;
                onBuilt();
                return deviceProximityCallback;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeviceProximityCallback getDefaultInstanceForType() {
                return DeviceProximityCallback.getDefaultInstance();
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
                this.callbackBluetoothAddress_ = "";
                int i = this.bitField0_ & (-2);
                this.sourceDeviceType_ = 0;
                this.protocolVersion_ = 0;
                this.bitField0_ = i & (-3) & (-5);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.callbackBluetoothAddress_ = "";
                this.sourceDeviceType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceProximityCallback) {
                    return mergeFrom((DeviceProximityCallback) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceProximityCallback deviceProximityCallback) {
                if (deviceProximityCallback == DeviceProximityCallback.getDefaultInstance()) {
                    return this;
                }
                if (deviceProximityCallback.hasCallbackBluetoothAddress()) {
                    this.bitField0_ |= 1;
                    this.callbackBluetoothAddress_ = deviceProximityCallback.callbackBluetoothAddress_;
                    onChanged();
                }
                if (deviceProximityCallback.hasSourceDeviceType()) {
                    setSourceDeviceType(deviceProximityCallback.getSourceDeviceType());
                }
                if (deviceProximityCallback.hasProtocolVersion()) {
                    setProtocolVersion(deviceProximityCallback.getProtocolVersion());
                }
                mergeUnknownFields(((GeneratedMessageV3) deviceProximityCallback).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                DeviceProximityCallback deviceProximityCallback = null;
                try {
                    try {
                        DeviceProximityCallback partialFrom = DeviceProximityCallback.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        DeviceProximityCallback deviceProximityCallback2 = (DeviceProximityCallback) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            deviceProximityCallback = deviceProximityCallback2;
                            if (deviceProximityCallback != null) {
                                mergeFrom(deviceProximityCallback);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (deviceProximityCallback != null) {
                        mergeFrom(deviceProximityCallback);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(DeviceProximityCallback deviceProximityCallback) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceProximityCallback);
        }

        public static DeviceProximityCallback parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DeviceProximityCallback(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceProximityCallback parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximityCallback) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceProximityCallback parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceProximityCallback getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DeviceProximityCallback parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DeviceProximityCallback() {
            this.memoizedIsInitialized = (byte) -1;
            this.callbackBluetoothAddress_ = "";
            this.sourceDeviceType_ = 0;
            this.protocolVersion_ = 0;
        }

        public static DeviceProximityCallback parseFrom(InputStream inputStream) throws IOException {
            return (DeviceProximityCallback) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static DeviceProximityCallback parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximityCallback) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceProximityCallback parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceProximityCallback) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private DeviceProximityCallback(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ = 1 | this.bitField0_;
                                this.callbackBluetoothAddress_ = bytes;
                            } else if (tag == 16) {
                                int i = codedInputStream.readEnum();
                                if (SecureGcmProto.DeviceType.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(2, i);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.sourceDeviceType_ = i;
                                }
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 4;
                                this.protocolVersion_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static DeviceProximityCallback parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceProximityCallback) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DeviceProximityCallbackOrBuilder extends MessageOrBuilder {
        String getCallbackBluetoothAddress();

        ByteString getCallbackBluetoothAddressBytes();

        int getProtocolVersion();

        SecureGcmProto.DeviceType getSourceDeviceType();

        boolean hasCallbackBluetoothAddress();

        boolean hasProtocolVersion();

        boolean hasSourceDeviceType();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018proximity_payloads.proto\u0012\tsecuregcm\u001a\u000fsecuregcm.proto\"§\u0001\n!CloudToDeviceProximityAuthPairing\u0012\u001e\n\u0016initiating_device_name\u0018\u0001 \u0001(\t\u0012$\n\u001cinitiating_device_bt_address\u0018\u0002 \u0001(\t\u0012\u001f\n\u0017ephemeral_symmetric_key\u0018\u0003 \u0001(\f\u0012\u001b\n\u0013additional_metadata\u0018\u0004 \u0001(\f\"\u008a\u0001\n\u0017DeviceProximityCallback\u0012\"\n\u001acallback_bluetooth_address\u0018\u0001 \u0001(\t\u00121\n\u0012source_device_type\u0018\u0002 \u0001(\u000e2\u0015.securegcm.DeviceType\u0012\u0018\n\u0010protocol_version\u0018\u0003 \u0001(\u0005BQ\n+com.google.security.cryptauth.l", "ib.securegcmB\u001bSecureGcmProximityAuthProto¢\u0002\u0004SGCM"}, new Descriptors.FileDescriptor[]{SecureGcmProto.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProximityAuthProto.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = SecureGcmProximityAuthProto.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_securegcm_CloudToDeviceProximityAuthPairing_descriptor = descriptor2;
        internal_static_securegcm_CloudToDeviceProximityAuthPairing_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"InitiatingDeviceName", "InitiatingDeviceBtAddress", "EphemeralSymmetricKey", "AdditionalMetadata"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_securegcm_DeviceProximityCallback_descriptor = descriptor3;
        internal_static_securegcm_DeviceProximityCallback_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"CallbackBluetoothAddress", "SourceDeviceType", "ProtocolVersion"});
        SecureGcmProto.getDescriptor();
    }

    private SecureGcmProximityAuthProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
