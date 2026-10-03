package com.google.security.cryptauth.lib.securemessage;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class SecureMessageProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_securemessage_DhPublicKey_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_DhPublicKey_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_EcP256PublicKey_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_EcP256PublicKey_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_GenericPublicKey_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_GenericPublicKey_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_HeaderAndBodyInternal_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_HeaderAndBodyInternal_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_HeaderAndBody_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_HeaderAndBody_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_Header_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_Header_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_SecureMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_SecureMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securemessage_SimpleRsaPublicKey_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securemessage_SimpleRsaPublicKey_fieldAccessorTable;

    public static final class DhPublicKey extends GeneratedMessageV3 implements DhPublicKeyOrBuilder {
        private static final DhPublicKey DEFAULT_INSTANCE = new DhPublicKey();

        @Deprecated
        public static final Parser<DhPublicKey> PARSER = new AbstractParser<DhPublicKey>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.DhPublicKey.1
            @Override // com.google.protobuf.Parser
            public DhPublicKey parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DhPublicKey(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int Y_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString y_;

        public static DhPublicKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_DhPublicKey_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DhPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DhPublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DhPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<DhPublicKey> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DhPublicKey)) {
                return super.equals(obj);
            }
            DhPublicKey dhPublicKey = (DhPublicKey) obj;
            boolean z = hasY() == dhPublicKey.hasY();
            if (hasY()) {
                z = z && getY().equals(dhPublicKey.getY());
            }
            return z && this.unknownFields.equals(dhPublicKey.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DhPublicKey> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = ((this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.y_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeBytesSize;
            return iComputeBytesSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.DhPublicKeyOrBuilder
        public ByteString getY() {
            return this.y_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.DhPublicKeyOrBuilder
        public boolean hasY() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasY()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getY().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_DhPublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(DhPublicKey.class, Builder.class);
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
            if (hasY()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.y_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DhPublicKeyOrBuilder {
            private int bitField0_;
            private ByteString y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_DhPublicKey_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearY() {
                this.bitField0_ &= -2;
                this.y_ = DhPublicKey.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_DhPublicKey_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.DhPublicKeyOrBuilder
            public ByteString getY() {
                return this.y_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.DhPublicKeyOrBuilder
            public boolean hasY() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_DhPublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(DhPublicKey.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasY();
            }

            public Builder setY(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.y_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.y_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DhPublicKey build() {
                DhPublicKey dhPublicKeyBuildPartial = buildPartial();
                if (dhPublicKeyBuildPartial.isInitialized()) {
                    return dhPublicKeyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dhPublicKeyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DhPublicKey buildPartial() {
                DhPublicKey dhPublicKey = new DhPublicKey(this);
                int i = (this.bitField0_ & 1) != 1 ? 0 : 1;
                dhPublicKey.y_ = this.y_;
                dhPublicKey.bitField0_ = i;
                onBuilt();
                return dhPublicKey;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DhPublicKey getDefaultInstanceForType() {
                return DhPublicKey.getDefaultInstance();
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
                this.y_ = ByteString.EMPTY;
                this.bitField0_ &= -2;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.y_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DhPublicKey) {
                    return mergeFrom((DhPublicKey) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DhPublicKey dhPublicKey) {
                if (dhPublicKey == DhPublicKey.getDefaultInstance()) {
                    return this;
                }
                if (dhPublicKey.hasY()) {
                    setY(dhPublicKey.getY());
                }
                mergeUnknownFields(((GeneratedMessageV3) dhPublicKey).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                DhPublicKey dhPublicKey = null;
                try {
                    try {
                        DhPublicKey partialFrom = DhPublicKey.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        DhPublicKey dhPublicKey2 = (DhPublicKey) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            dhPublicKey = dhPublicKey2;
                            if (dhPublicKey != null) {
                                mergeFrom(dhPublicKey);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (dhPublicKey != null) {
                        mergeFrom(dhPublicKey);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(DhPublicKey dhPublicKey) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dhPublicKey);
        }

        public static DhPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DhPublicKey(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DhPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DhPublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DhPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DhPublicKey getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DhPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DhPublicKey() {
            this.memoizedIsInitialized = (byte) -1;
            this.y_ = ByteString.EMPTY;
        }

        public static DhPublicKey parseFrom(InputStream inputStream) throws IOException {
            return (DhPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static DhPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DhPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private DhPublicKey(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.y_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static DhPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DhPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DhPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DhPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DhPublicKeyOrBuilder extends MessageOrBuilder {
        ByteString getY();

        boolean hasY();
    }

    public static final class EcP256PublicKey extends GeneratedMessageV3 implements EcP256PublicKeyOrBuilder {
        private static final EcP256PublicKey DEFAULT_INSTANCE = new EcP256PublicKey();

        @Deprecated
        public static final Parser<EcP256PublicKey> PARSER = new AbstractParser<EcP256PublicKey>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKey.1
            @Override // com.google.protobuf.Parser
            public EcP256PublicKey parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EcP256PublicKey(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int X_FIELD_NUMBER = 1;
        public static final int Y_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString x_;
        private ByteString y_;

        public static EcP256PublicKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_EcP256PublicKey_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EcP256PublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EcP256PublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EcP256PublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EcP256PublicKey> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EcP256PublicKey)) {
                return super.equals(obj);
            }
            EcP256PublicKey ecP256PublicKey = (EcP256PublicKey) obj;
            boolean z = hasX() == ecP256PublicKey.hasX();
            if (hasX()) {
                z = z && getX().equals(ecP256PublicKey.getX());
            }
            boolean z2 = z && hasY() == ecP256PublicKey.hasY();
            if (hasY()) {
                z2 = z2 && getY().equals(ecP256PublicKey.getY());
            }
            return z2 && this.unknownFields.equals(ecP256PublicKey.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EcP256PublicKey> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.x_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.y_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
        public ByteString getX() {
            return this.x_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
        public ByteString getY() {
            return this.y_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
        public boolean hasX() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
        public boolean hasY() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasX()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getX().hashCode();
            }
            if (hasY()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getY().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_EcP256PublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(EcP256PublicKey.class, Builder.class);
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
            if (!hasX()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasY()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.x_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.y_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EcP256PublicKeyOrBuilder {
            private int bitField0_;
            private ByteString x_;
            private ByteString y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_EcP256PublicKey_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearX() {
                this.bitField0_ &= -2;
                this.x_ = EcP256PublicKey.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.bitField0_ &= -3;
                this.y_ = EcP256PublicKey.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_EcP256PublicKey_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
            public ByteString getX() {
                return this.x_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
            public ByteString getY() {
                return this.y_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
            public boolean hasX() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EcP256PublicKeyOrBuilder
            public boolean hasY() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_EcP256PublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(EcP256PublicKey.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasX() && hasY();
            }

            public Builder setX(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.x_ = byteString;
                onChanged();
                return this;
            }

            public Builder setY(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.y_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.x_ = byteString;
                this.y_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EcP256PublicKey build() {
                EcP256PublicKey ecP256PublicKeyBuildPartial = buildPartial();
                if (ecP256PublicKeyBuildPartial.isInitialized()) {
                    return ecP256PublicKeyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ecP256PublicKeyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EcP256PublicKey buildPartial() {
                EcP256PublicKey ecP256PublicKey = new EcP256PublicKey(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ecP256PublicKey.x_ = this.x_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ecP256PublicKey.y_ = this.y_;
                ecP256PublicKey.bitField0_ = i2;
                onBuilt();
                return ecP256PublicKey;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EcP256PublicKey getDefaultInstanceForType() {
                return EcP256PublicKey.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.x_ = byteString;
                int i = this.bitField0_ & (-2);
                this.y_ = byteString;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.x_ = byteString;
                this.y_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EcP256PublicKey) {
                    return mergeFrom((EcP256PublicKey) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EcP256PublicKey ecP256PublicKey) {
                if (ecP256PublicKey == EcP256PublicKey.getDefaultInstance()) {
                    return this;
                }
                if (ecP256PublicKey.hasX()) {
                    setX(ecP256PublicKey.getX());
                }
                if (ecP256PublicKey.hasY()) {
                    setY(ecP256PublicKey.getY());
                }
                mergeUnknownFields(((GeneratedMessageV3) ecP256PublicKey).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EcP256PublicKey ecP256PublicKey = null;
                try {
                    try {
                        EcP256PublicKey partialFrom = EcP256PublicKey.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        EcP256PublicKey ecP256PublicKey2 = (EcP256PublicKey) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ecP256PublicKey = ecP256PublicKey2;
                            if (ecP256PublicKey != null) {
                                mergeFrom(ecP256PublicKey);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ecP256PublicKey != null) {
                        mergeFrom(ecP256PublicKey);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(EcP256PublicKey ecP256PublicKey) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ecP256PublicKey);
        }

        public static EcP256PublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EcP256PublicKey(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EcP256PublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EcP256PublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EcP256PublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EcP256PublicKey getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EcP256PublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EcP256PublicKey() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.x_ = byteString;
            this.y_ = byteString;
        }

        public static EcP256PublicKey parseFrom(InputStream inputStream) throws IOException {
            return (EcP256PublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EcP256PublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EcP256PublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EcP256PublicKey(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.x_ = codedInputStream.readBytes();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.y_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static EcP256PublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EcP256PublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EcP256PublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EcP256PublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EcP256PublicKeyOrBuilder extends MessageOrBuilder {
        ByteString getX();

        ByteString getY();

        boolean hasX();

        boolean hasY();
    }

    public enum EncScheme implements ProtocolMessageEnum {
        NONE(1),
        AES_256_CBC(2);

        public static final int AES_256_CBC_VALUE = 2;
        public static final int NONE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<EncScheme> internalValueMap = new Internal.EnumLiteMap<EncScheme>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.EncScheme.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public EncScheme findValueByNumber(int i) {
                return EncScheme.forNumber(i);
            }
        };
        private static final EncScheme[] VALUES = values();

        EncScheme(int i) {
            this.value = i;
        }

        public static EncScheme forNumber(int i) {
            if (i == 1) {
                return NONE;
            }
            if (i != 2) {
                return null;
            }
            return AES_256_CBC;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureMessageProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<EncScheme> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static EncScheme valueOf(int i) {
            return forNumber(i);
        }

        public static EncScheme valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class GenericPublicKey extends GeneratedMessageV3 implements GenericPublicKeyOrBuilder {
        public static final int DH2048_PUBLIC_KEY_FIELD_NUMBER = 4;
        public static final int EC_P256_PUBLIC_KEY_FIELD_NUMBER = 2;
        public static final int RSA2048_PUBLIC_KEY_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DhPublicKey dh2048PublicKey_;
        private EcP256PublicKey ecP256PublicKey_;
        private byte memoizedIsInitialized;
        private SimpleRsaPublicKey rsa2048PublicKey_;
        private int type_;
        private static final GenericPublicKey DEFAULT_INSTANCE = new GenericPublicKey();

        @Deprecated
        public static final Parser<GenericPublicKey> PARSER = new AbstractParser<GenericPublicKey>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKey.1
            @Override // com.google.protobuf.Parser
            public GenericPublicKey parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new GenericPublicKey(codedInputStream, extensionRegistryLite);
            }
        };

        public static GenericPublicKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_GenericPublicKey_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GenericPublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<GenericPublicKey> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericPublicKey)) {
                return super.equals(obj);
            }
            GenericPublicKey genericPublicKey = (GenericPublicKey) obj;
            boolean z = hasType() == genericPublicKey.hasType();
            if (hasType()) {
                z = z && this.type_ == genericPublicKey.type_;
            }
            boolean z2 = z && hasEcP256PublicKey() == genericPublicKey.hasEcP256PublicKey();
            if (hasEcP256PublicKey()) {
                z2 = z2 && getEcP256PublicKey().equals(genericPublicKey.getEcP256PublicKey());
            }
            boolean z3 = z2 && hasRsa2048PublicKey() == genericPublicKey.hasRsa2048PublicKey();
            if (hasRsa2048PublicKey()) {
                z3 = z3 && getRsa2048PublicKey().equals(genericPublicKey.getRsa2048PublicKey());
            }
            boolean z4 = z3 && hasDh2048PublicKey() == genericPublicKey.hasDh2048PublicKey();
            if (hasDh2048PublicKey()) {
                z4 = z4 && getDh2048PublicKey().equals(genericPublicKey.getDh2048PublicKey());
            }
            return z4 && this.unknownFields.equals(genericPublicKey.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public DhPublicKey getDh2048PublicKey() {
            DhPublicKey dhPublicKey = this.dh2048PublicKey_;
            return dhPublicKey == null ? DhPublicKey.getDefaultInstance() : dhPublicKey;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public DhPublicKeyOrBuilder getDh2048PublicKeyOrBuilder() {
            DhPublicKey dhPublicKey = this.dh2048PublicKey_;
            return dhPublicKey == null ? DhPublicKey.getDefaultInstance() : dhPublicKey;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public EcP256PublicKey getEcP256PublicKey() {
            EcP256PublicKey ecP256PublicKey = this.ecP256PublicKey_;
            return ecP256PublicKey == null ? EcP256PublicKey.getDefaultInstance() : ecP256PublicKey;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public EcP256PublicKeyOrBuilder getEcP256PublicKeyOrBuilder() {
            EcP256PublicKey ecP256PublicKey = this.ecP256PublicKey_;
            return ecP256PublicKey == null ? EcP256PublicKey.getDefaultInstance() : ecP256PublicKey;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericPublicKey> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public SimpleRsaPublicKey getRsa2048PublicKey() {
            SimpleRsaPublicKey simpleRsaPublicKey = this.rsa2048PublicKey_;
            return simpleRsaPublicKey == null ? SimpleRsaPublicKey.getDefaultInstance() : simpleRsaPublicKey;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public SimpleRsaPublicKeyOrBuilder getRsa2048PublicKeyOrBuilder() {
            SimpleRsaPublicKey simpleRsaPublicKey = this.rsa2048PublicKey_;
            return simpleRsaPublicKey == null ? SimpleRsaPublicKey.getDefaultInstance() : simpleRsaPublicKey;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getEcP256PublicKey());
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getRsa2048PublicKey());
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, getDh2048PublicKey());
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public PublicKeyType getType() {
            PublicKeyType publicKeyTypeValueOf = PublicKeyType.valueOf(this.type_);
            return publicKeyTypeValueOf == null ? PublicKeyType.EC_P256 : publicKeyTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public boolean hasDh2048PublicKey() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public boolean hasEcP256PublicKey() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public boolean hasRsa2048PublicKey() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.type_;
            }
            if (hasEcP256PublicKey()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEcP256PublicKey().hashCode();
            }
            if (hasRsa2048PublicKey()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getRsa2048PublicKey().hashCode();
            }
            if (hasDh2048PublicKey()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDh2048PublicKey().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_GenericPublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericPublicKey.class, Builder.class);
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
            if (!hasType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEcP256PublicKey() && !getEcP256PublicKey().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRsa2048PublicKey() && !getRsa2048PublicKey().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDh2048PublicKey() || getDh2048PublicKey().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getEcP256PublicKey());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeMessage(3, getRsa2048PublicKey());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeMessage(4, getDh2048PublicKey());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericPublicKeyOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> dh2048PublicKeyBuilder_;
            private DhPublicKey dh2048PublicKey_;
            private SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> ecP256PublicKeyBuilder_;
            private EcP256PublicKey ecP256PublicKey_;
            private SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> rsa2048PublicKeyBuilder_;
            private SimpleRsaPublicKey rsa2048PublicKey_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_GenericPublicKey_descriptor;
            }

            private SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> getDh2048PublicKeyFieldBuilder() {
                if (this.dh2048PublicKeyBuilder_ == null) {
                    this.dh2048PublicKeyBuilder_ = new SingleFieldBuilderV3<>(getDh2048PublicKey(), getParentForChildren(), isClean());
                    this.dh2048PublicKey_ = null;
                }
                return this.dh2048PublicKeyBuilder_;
            }

            private SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> getEcP256PublicKeyFieldBuilder() {
                if (this.ecP256PublicKeyBuilder_ == null) {
                    this.ecP256PublicKeyBuilder_ = new SingleFieldBuilderV3<>(getEcP256PublicKey(), getParentForChildren(), isClean());
                    this.ecP256PublicKey_ = null;
                }
                return this.ecP256PublicKeyBuilder_;
            }

            private SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> getRsa2048PublicKeyFieldBuilder() {
                if (this.rsa2048PublicKeyBuilder_ == null) {
                    this.rsa2048PublicKeyBuilder_ = new SingleFieldBuilderV3<>(getRsa2048PublicKey(), getParentForChildren(), isClean());
                    this.rsa2048PublicKey_ = null;
                }
                return this.rsa2048PublicKeyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEcP256PublicKeyFieldBuilder();
                    getRsa2048PublicKeyFieldBuilder();
                    getDh2048PublicKeyFieldBuilder();
                }
            }

            public Builder clearDh2048PublicKey() {
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV3 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dh2048PublicKey_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clearEcP256PublicKey() {
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ecP256PublicKey_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearRsa2048PublicKey() {
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV3 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rsa2048PublicKey_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_GenericPublicKey_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public DhPublicKey getDh2048PublicKey() {
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV3 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DhPublicKey) singleFieldBuilderV3.getMessage();
                }
                DhPublicKey dhPublicKey = this.dh2048PublicKey_;
                return dhPublicKey == null ? DhPublicKey.getDefaultInstance() : dhPublicKey;
            }

            public DhPublicKey.Builder getDh2048PublicKeyBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DhPublicKey.Builder) getDh2048PublicKeyFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public DhPublicKeyOrBuilder getDh2048PublicKeyOrBuilder() {
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV3 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DhPublicKeyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DhPublicKey dhPublicKey = this.dh2048PublicKey_;
                return dhPublicKey == null ? DhPublicKey.getDefaultInstance() : dhPublicKey;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public EcP256PublicKey getEcP256PublicKey() {
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EcP256PublicKey) singleFieldBuilderV3.getMessage();
                }
                EcP256PublicKey ecP256PublicKey = this.ecP256PublicKey_;
                return ecP256PublicKey == null ? EcP256PublicKey.getDefaultInstance() : ecP256PublicKey;
            }

            public EcP256PublicKey.Builder getEcP256PublicKeyBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EcP256PublicKey.Builder) getEcP256PublicKeyFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public EcP256PublicKeyOrBuilder getEcP256PublicKeyOrBuilder() {
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EcP256PublicKeyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EcP256PublicKey ecP256PublicKey = this.ecP256PublicKey_;
                return ecP256PublicKey == null ? EcP256PublicKey.getDefaultInstance() : ecP256PublicKey;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public SimpleRsaPublicKey getRsa2048PublicKey() {
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV3 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SimpleRsaPublicKey) singleFieldBuilderV3.getMessage();
                }
                SimpleRsaPublicKey simpleRsaPublicKey = this.rsa2048PublicKey_;
                return simpleRsaPublicKey == null ? SimpleRsaPublicKey.getDefaultInstance() : simpleRsaPublicKey;
            }

            public SimpleRsaPublicKey.Builder getRsa2048PublicKeyBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SimpleRsaPublicKey.Builder) getRsa2048PublicKeyFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public SimpleRsaPublicKeyOrBuilder getRsa2048PublicKeyOrBuilder() {
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV3 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SimpleRsaPublicKeyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SimpleRsaPublicKey simpleRsaPublicKey = this.rsa2048PublicKey_;
                return simpleRsaPublicKey == null ? SimpleRsaPublicKey.getDefaultInstance() : simpleRsaPublicKey;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public PublicKeyType getType() {
                PublicKeyType publicKeyTypeValueOf = PublicKeyType.valueOf(this.type_);
                return publicKeyTypeValueOf == null ? PublicKeyType.EC_P256 : publicKeyTypeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public boolean hasDh2048PublicKey() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public boolean hasEcP256PublicKey() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public boolean hasRsa2048PublicKey() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.GenericPublicKeyOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_GenericPublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericPublicKey.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasType()) {
                    return false;
                }
                if (hasEcP256PublicKey() && !getEcP256PublicKey().isInitialized()) {
                    return false;
                }
                if (!hasRsa2048PublicKey() || getRsa2048PublicKey().isInitialized()) {
                    return !hasDh2048PublicKey() || getDh2048PublicKey().isInitialized();
                }
                return false;
            }

            public Builder mergeDh2048PublicKey(DhPublicKey dhPublicKey) {
                DhPublicKey dhPublicKey2;
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV3 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 8 || (dhPublicKey2 = this.dh2048PublicKey_) == null || dhPublicKey2 == DhPublicKey.getDefaultInstance()) {
                        this.dh2048PublicKey_ = dhPublicKey;
                    } else {
                        this.dh2048PublicKey_ = DhPublicKey.newBuilder(this.dh2048PublicKey_).mergeFrom(dhPublicKey).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(dhPublicKey);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder mergeEcP256PublicKey(EcP256PublicKey ecP256PublicKey) {
                EcP256PublicKey ecP256PublicKey2;
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 2 || (ecP256PublicKey2 = this.ecP256PublicKey_) == null || ecP256PublicKey2 == EcP256PublicKey.getDefaultInstance()) {
                        this.ecP256PublicKey_ = ecP256PublicKey;
                    } else {
                        this.ecP256PublicKey_ = EcP256PublicKey.newBuilder(this.ecP256PublicKey_).mergeFrom(ecP256PublicKey).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(ecP256PublicKey);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder mergeRsa2048PublicKey(SimpleRsaPublicKey simpleRsaPublicKey) {
                SimpleRsaPublicKey simpleRsaPublicKey2;
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV3 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 4 || (simpleRsaPublicKey2 = this.rsa2048PublicKey_) == null || simpleRsaPublicKey2 == SimpleRsaPublicKey.getDefaultInstance()) {
                        this.rsa2048PublicKey_ = simpleRsaPublicKey;
                    } else {
                        this.rsa2048PublicKey_ = SimpleRsaPublicKey.newBuilder(this.rsa2048PublicKey_).mergeFrom(simpleRsaPublicKey).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(simpleRsaPublicKey);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setDh2048PublicKey(DhPublicKey dhPublicKey) {
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV3 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dhPublicKey.getClass();
                    this.dh2048PublicKey_ = dhPublicKey;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(dhPublicKey);
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setEcP256PublicKey(EcP256PublicKey ecP256PublicKey) {
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ecP256PublicKey.getClass();
                    this.ecP256PublicKey_ = ecP256PublicKey;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(ecP256PublicKey);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setRsa2048PublicKey(SimpleRsaPublicKey simpleRsaPublicKey) {
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV3 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    simpleRsaPublicKey.getClass();
                    this.rsa2048PublicKey_ = simpleRsaPublicKey;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(simpleRsaPublicKey);
                }
                this.bitField0_ |= 4;
                return this;
            }

            public Builder setType(PublicKeyType publicKeyType) {
                publicKeyType.getClass();
                this.bitField0_ |= 1;
                this.type_ = publicKeyType.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 1;
                this.ecP256PublicKey_ = null;
                this.rsa2048PublicKey_ = null;
                this.dh2048PublicKey_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericPublicKey build() {
                GenericPublicKey genericPublicKeyBuildPartial = buildPartial();
                if (genericPublicKeyBuildPartial.isInitialized()) {
                    return genericPublicKeyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericPublicKeyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericPublicKey buildPartial() {
                GenericPublicKey genericPublicKey = new GenericPublicKey(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                genericPublicKey.type_ = this.type_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    genericPublicKey.ecP256PublicKey_ = this.ecP256PublicKey_;
                } else {
                    genericPublicKey.ecP256PublicKey_ = (EcP256PublicKey) singleFieldBuilderV3.build();
                }
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV4 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV4 == null) {
                    genericPublicKey.rsa2048PublicKey_ = this.rsa2048PublicKey_;
                } else {
                    genericPublicKey.rsa2048PublicKey_ = (SimpleRsaPublicKey) singleFieldBuilderV4.build();
                }
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV5 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV5 == null) {
                    genericPublicKey.dh2048PublicKey_ = this.dh2048PublicKey_;
                } else {
                    genericPublicKey.dh2048PublicKey_ = (DhPublicKey) singleFieldBuilderV5.build();
                }
                genericPublicKey.bitField0_ = i2;
                onBuilt();
                return genericPublicKey;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GenericPublicKey getDefaultInstanceForType() {
                return GenericPublicKey.getDefaultInstance();
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
                this.type_ = 1;
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ecP256PublicKey_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV4 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV4 == null) {
                    this.rsa2048PublicKey_ = null;
                } else {
                    singleFieldBuilderV4.clear();
                }
                this.bitField0_ &= -5;
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV5 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV5 == null) {
                    this.dh2048PublicKey_ = null;
                } else {
                    singleFieldBuilderV5.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GenericPublicKey) {
                    return mergeFrom((GenericPublicKey) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDh2048PublicKey(DhPublicKey.Builder builder) {
                SingleFieldBuilderV3<DhPublicKey, DhPublicKey.Builder, DhPublicKeyOrBuilder> singleFieldBuilderV3 = this.dh2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dh2048PublicKey_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                return this;
            }

            public Builder setEcP256PublicKey(EcP256PublicKey.Builder builder) {
                SingleFieldBuilderV3<EcP256PublicKey, EcP256PublicKey.Builder, EcP256PublicKeyOrBuilder> singleFieldBuilderV3 = this.ecP256PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ecP256PublicKey_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setRsa2048PublicKey(SimpleRsaPublicKey.Builder builder) {
                SingleFieldBuilderV3<SimpleRsaPublicKey, SimpleRsaPublicKey.Builder, SimpleRsaPublicKeyOrBuilder> singleFieldBuilderV3 = this.rsa2048PublicKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rsa2048PublicKey_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 1;
                this.ecP256PublicKey_ = null;
                this.rsa2048PublicKey_ = null;
                this.dh2048PublicKey_ = null;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(GenericPublicKey genericPublicKey) {
                if (genericPublicKey == GenericPublicKey.getDefaultInstance()) {
                    return this;
                }
                if (genericPublicKey.hasType()) {
                    setType(genericPublicKey.getType());
                }
                if (genericPublicKey.hasEcP256PublicKey()) {
                    mergeEcP256PublicKey(genericPublicKey.getEcP256PublicKey());
                }
                if (genericPublicKey.hasRsa2048PublicKey()) {
                    mergeRsa2048PublicKey(genericPublicKey.getRsa2048PublicKey());
                }
                if (genericPublicKey.hasDh2048PublicKey()) {
                    mergeDh2048PublicKey(genericPublicKey.getDh2048PublicKey());
                }
                mergeUnknownFields(((GeneratedMessageV3) genericPublicKey).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                GenericPublicKey genericPublicKey = null;
                try {
                    try {
                        GenericPublicKey partialFrom = GenericPublicKey.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        GenericPublicKey genericPublicKey2 = (GenericPublicKey) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            genericPublicKey = genericPublicKey2;
                            if (genericPublicKey != null) {
                                mergeFrom(genericPublicKey);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (genericPublicKey != null) {
                        mergeFrom(genericPublicKey);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(GenericPublicKey genericPublicKey) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericPublicKey);
        }

        public static GenericPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GenericPublicKey(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GenericPublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericPublicKey getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GenericPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GenericPublicKey() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 1;
        }

        public static GenericPublicKey parseFrom(InputStream inputStream) throws IOException {
            return (GenericPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static GenericPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GenericPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private GenericPublicKey(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (tag == 18) {
                                    EcP256PublicKey.Builder builder = (this.bitField0_ & 2) == 2 ? this.ecP256PublicKey_.toBuilder() : null;
                                    EcP256PublicKey ecP256PublicKey = (EcP256PublicKey) codedInputStream.readMessage(EcP256PublicKey.PARSER, extensionRegistryLite);
                                    this.ecP256PublicKey_ = ecP256PublicKey;
                                    if (builder != null) {
                                        builder.mergeFrom(ecP256PublicKey);
                                        this.ecP256PublicKey_ = builder.buildPartial();
                                    }
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    SimpleRsaPublicKey.Builder builder2 = (this.bitField0_ & 4) == 4 ? this.rsa2048PublicKey_.toBuilder() : null;
                                    SimpleRsaPublicKey simpleRsaPublicKey = (SimpleRsaPublicKey) codedInputStream.readMessage(SimpleRsaPublicKey.PARSER, extensionRegistryLite);
                                    this.rsa2048PublicKey_ = simpleRsaPublicKey;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(simpleRsaPublicKey);
                                        this.rsa2048PublicKey_ = builder2.buildPartial();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    DhPublicKey.Builder builder3 = (this.bitField0_ & 8) == 8 ? this.dh2048PublicKey_.toBuilder() : null;
                                    DhPublicKey dhPublicKey = (DhPublicKey) codedInputStream.readMessage(DhPublicKey.PARSER, extensionRegistryLite);
                                    this.dh2048PublicKey_ = dhPublicKey;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(dhPublicKey);
                                        this.dh2048PublicKey_ = builder3.buildPartial();
                                    }
                                    this.bitField0_ |= 8;
                                }
                            } else {
                                int i = codedInputStream.readEnum();
                                if (PublicKeyType.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(1, i);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i;
                                }
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static GenericPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GenericPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GenericPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface GenericPublicKeyOrBuilder extends MessageOrBuilder {
        DhPublicKey getDh2048PublicKey();

        DhPublicKeyOrBuilder getDh2048PublicKeyOrBuilder();

        EcP256PublicKey getEcP256PublicKey();

        EcP256PublicKeyOrBuilder getEcP256PublicKeyOrBuilder();

        SimpleRsaPublicKey getRsa2048PublicKey();

        SimpleRsaPublicKeyOrBuilder getRsa2048PublicKeyOrBuilder();

        PublicKeyType getType();

        boolean hasDh2048PublicKey();

        boolean hasEcP256PublicKey();

        boolean hasRsa2048PublicKey();

        boolean hasType();
    }

    public static final class Header extends GeneratedMessageV3 implements HeaderOrBuilder {
        public static final int ASSOCIATED_DATA_LENGTH_FIELD_NUMBER = 7;
        public static final int DECRYPTION_KEY_ID_FIELD_NUMBER = 4;
        public static final int ENCRYPTION_SCHEME_FIELD_NUMBER = 2;
        public static final int IV_FIELD_NUMBER = 5;
        public static final int PUBLIC_METADATA_FIELD_NUMBER = 6;
        public static final int SIGNATURE_SCHEME_FIELD_NUMBER = 1;
        public static final int VERIFICATION_KEY_ID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int associatedDataLength_;
        private int bitField0_;
        private ByteString decryptionKeyId_;
        private int encryptionScheme_;
        private ByteString iv_;
        private byte memoizedIsInitialized;
        private ByteString publicMetadata_;
        private int signatureScheme_;
        private ByteString verificationKeyId_;
        private static final Header DEFAULT_INSTANCE = new Header();

        @Deprecated
        public static final Parser<Header> PARSER = new AbstractParser<Header>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.Header.1
            @Override // com.google.protobuf.Parser
            public Header parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Header(codedInputStream, extensionRegistryLite);
            }
        };

        public static Header getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_Header_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Header parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Header) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Header parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Header> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return super.equals(obj);
            }
            Header header = (Header) obj;
            boolean z = hasSignatureScheme() == header.hasSignatureScheme();
            if (hasSignatureScheme()) {
                z = z && this.signatureScheme_ == header.signatureScheme_;
            }
            boolean z2 = z && hasEncryptionScheme() == header.hasEncryptionScheme();
            if (hasEncryptionScheme()) {
                z2 = z2 && this.encryptionScheme_ == header.encryptionScheme_;
            }
            boolean z3 = z2 && hasVerificationKeyId() == header.hasVerificationKeyId();
            if (hasVerificationKeyId()) {
                z3 = z3 && getVerificationKeyId().equals(header.getVerificationKeyId());
            }
            boolean z4 = z3 && hasDecryptionKeyId() == header.hasDecryptionKeyId();
            if (hasDecryptionKeyId()) {
                z4 = z4 && getDecryptionKeyId().equals(header.getDecryptionKeyId());
            }
            boolean z5 = z4 && hasIv() == header.hasIv();
            if (hasIv()) {
                z5 = z5 && getIv().equals(header.getIv());
            }
            boolean z6 = z5 && hasPublicMetadata() == header.hasPublicMetadata();
            if (hasPublicMetadata()) {
                z6 = z6 && getPublicMetadata().equals(header.getPublicMetadata());
            }
            boolean z7 = z6 && hasAssociatedDataLength() == header.hasAssociatedDataLength();
            if (hasAssociatedDataLength()) {
                z7 = z7 && getAssociatedDataLength() == header.getAssociatedDataLength();
            }
            return z7 && this.unknownFields.equals(header.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public int getAssociatedDataLength() {
            return this.associatedDataLength_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public ByteString getDecryptionKeyId() {
            return this.decryptionKeyId_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public EncScheme getEncryptionScheme() {
            EncScheme encSchemeValueOf = EncScheme.valueOf(this.encryptionScheme_);
            return encSchemeValueOf == null ? EncScheme.NONE : encSchemeValueOf;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public ByteString getIv() {
            return this.iv_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Header> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public ByteString getPublicMetadata() {
            return this.publicMetadata_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.signatureScheme_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.encryptionScheme_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.verificationKeyId_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(4, this.decryptionKeyId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(5, this.iv_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(6, this.publicMetadata_);
            }
            if ((this.bitField0_ & 64) == 64) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(7, this.associatedDataLength_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public SigScheme getSignatureScheme() {
            SigScheme sigSchemeValueOf = SigScheme.valueOf(this.signatureScheme_);
            return sigSchemeValueOf == null ? SigScheme.HMAC_SHA256 : sigSchemeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public ByteString getVerificationKeyId() {
            return this.verificationKeyId_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasAssociatedDataLength() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasDecryptionKeyId() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasEncryptionScheme() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasIv() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasPublicMetadata() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasSignatureScheme() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
        public boolean hasVerificationKeyId() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasSignatureScheme()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.signatureScheme_;
            }
            if (hasEncryptionScheme()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.encryptionScheme_;
            }
            if (hasVerificationKeyId()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getVerificationKeyId().hashCode();
            }
            if (hasDecryptionKeyId()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getDecryptionKeyId().hashCode();
            }
            if (hasIv()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getIv().hashCode();
            }
            if (hasPublicMetadata()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getPublicMetadata().hashCode();
            }
            if (hasAssociatedDataLength()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getAssociatedDataLength();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_Header_fieldAccessorTable.ensureFieldAccessorsInitialized(Header.class, Builder.class);
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
            if (!hasSignatureScheme()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasEncryptionScheme()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.signatureScheme_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeEnum(2, this.encryptionScheme_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.verificationKeyId_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBytes(4, this.decryptionKeyId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.writeBytes(5, this.iv_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBytes(6, this.publicMetadata_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeUInt32(7, this.associatedDataLength_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderOrBuilder {
            private int associatedDataLength_;
            private int bitField0_;
            private ByteString decryptionKeyId_;
            private int encryptionScheme_;
            private ByteString iv_;
            private ByteString publicMetadata_;
            private int signatureScheme_;
            private ByteString verificationKeyId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_Header_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearAssociatedDataLength() {
                this.bitField0_ &= -65;
                this.associatedDataLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDecryptionKeyId() {
                this.bitField0_ &= -9;
                this.decryptionKeyId_ = Header.getDefaultInstance().getDecryptionKeyId();
                onChanged();
                return this;
            }

            public Builder clearEncryptionScheme() {
                this.bitField0_ &= -3;
                this.encryptionScheme_ = 1;
                onChanged();
                return this;
            }

            public Builder clearIv() {
                this.bitField0_ &= -17;
                this.iv_ = Header.getDefaultInstance().getIv();
                onChanged();
                return this;
            }

            public Builder clearPublicMetadata() {
                this.bitField0_ &= -33;
                this.publicMetadata_ = Header.getDefaultInstance().getPublicMetadata();
                onChanged();
                return this;
            }

            public Builder clearSignatureScheme() {
                this.bitField0_ &= -2;
                this.signatureScheme_ = 1;
                onChanged();
                return this;
            }

            public Builder clearVerificationKeyId() {
                this.bitField0_ &= -5;
                this.verificationKeyId_ = Header.getDefaultInstance().getVerificationKeyId();
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public int getAssociatedDataLength() {
                return this.associatedDataLength_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public ByteString getDecryptionKeyId() {
                return this.decryptionKeyId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_Header_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public EncScheme getEncryptionScheme() {
                EncScheme encSchemeValueOf = EncScheme.valueOf(this.encryptionScheme_);
                return encSchemeValueOf == null ? EncScheme.NONE : encSchemeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public ByteString getIv() {
                return this.iv_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public ByteString getPublicMetadata() {
                return this.publicMetadata_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public SigScheme getSignatureScheme() {
                SigScheme sigSchemeValueOf = SigScheme.valueOf(this.signatureScheme_);
                return sigSchemeValueOf == null ? SigScheme.HMAC_SHA256 : sigSchemeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public ByteString getVerificationKeyId() {
                return this.verificationKeyId_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasAssociatedDataLength() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasDecryptionKeyId() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasEncryptionScheme() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasIv() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasPublicMetadata() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasSignatureScheme() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderOrBuilder
            public boolean hasVerificationKeyId() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_Header_fieldAccessorTable.ensureFieldAccessorsInitialized(Header.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSignatureScheme() && hasEncryptionScheme();
            }

            public Builder setAssociatedDataLength(int i) {
                this.bitField0_ |= 64;
                this.associatedDataLength_ = i;
                onChanged();
                return this;
            }

            public Builder setDecryptionKeyId(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.decryptionKeyId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEncryptionScheme(EncScheme encScheme) {
                encScheme.getClass();
                this.bitField0_ |= 2;
                this.encryptionScheme_ = encScheme.getNumber();
                onChanged();
                return this;
            }

            public Builder setIv(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.iv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPublicMetadata(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.publicMetadata_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSignatureScheme(SigScheme sigScheme) {
                sigScheme.getClass();
                this.bitField0_ |= 1;
                this.signatureScheme_ = sigScheme.getNumber();
                onChanged();
                return this;
            }

            public Builder setVerificationKeyId(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.verificationKeyId_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.signatureScheme_ = 1;
                this.encryptionScheme_ = 1;
                ByteString byteString = ByteString.EMPTY;
                this.verificationKeyId_ = byteString;
                this.decryptionKeyId_ = byteString;
                this.iv_ = byteString;
                this.publicMetadata_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Header build() {
                Header headerBuildPartial = buildPartial();
                if (headerBuildPartial.isInitialized()) {
                    return headerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Header buildPartial() {
                Header header = new Header(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                header.signatureScheme_ = this.signatureScheme_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                header.encryptionScheme_ = this.encryptionScheme_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                header.verificationKeyId_ = this.verificationKeyId_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                header.decryptionKeyId_ = this.decryptionKeyId_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                header.iv_ = this.iv_;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                header.publicMetadata_ = this.publicMetadata_;
                if ((i & 64) == 64) {
                    i2 |= 64;
                }
                header.associatedDataLength_ = this.associatedDataLength_;
                header.bitField0_ = i2;
                onBuilt();
                return header;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Header getDefaultInstanceForType() {
                return Header.getDefaultInstance();
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
                this.signatureScheme_ = 1;
                int i = this.bitField0_ & (-2);
                this.encryptionScheme_ = 1;
                int i2 = i & (-3);
                this.bitField0_ = i2;
                ByteString byteString = ByteString.EMPTY;
                this.verificationKeyId_ = byteString;
                this.decryptionKeyId_ = byteString;
                this.iv_ = byteString;
                this.publicMetadata_ = byteString;
                this.associatedDataLength_ = 0;
                this.bitField0_ = i2 & (-5) & (-9) & (-17) & (-33) & (-65);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Header) {
                    return mergeFrom((Header) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Header header) {
                if (header == Header.getDefaultInstance()) {
                    return this;
                }
                if (header.hasSignatureScheme()) {
                    setSignatureScheme(header.getSignatureScheme());
                }
                if (header.hasEncryptionScheme()) {
                    setEncryptionScheme(header.getEncryptionScheme());
                }
                if (header.hasVerificationKeyId()) {
                    setVerificationKeyId(header.getVerificationKeyId());
                }
                if (header.hasDecryptionKeyId()) {
                    setDecryptionKeyId(header.getDecryptionKeyId());
                }
                if (header.hasIv()) {
                    setIv(header.getIv());
                }
                if (header.hasPublicMetadata()) {
                    setPublicMetadata(header.getPublicMetadata());
                }
                if (header.hasAssociatedDataLength()) {
                    setAssociatedDataLength(header.getAssociatedDataLength());
                }
                mergeUnknownFields(((GeneratedMessageV3) header).unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.signatureScheme_ = 1;
                this.encryptionScheme_ = 1;
                ByteString byteString = ByteString.EMPTY;
                this.verificationKeyId_ = byteString;
                this.decryptionKeyId_ = byteString;
                this.iv_ = byteString;
                this.publicMetadata_ = byteString;
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Header header = null;
                try {
                    try {
                        Header partialFrom = Header.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        Header header2 = (Header) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            header = header2;
                            if (header != null) {
                                mergeFrom(header);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (header != null) {
                        mergeFrom(header);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Header header) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(header);
        }

        public static Header parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Header(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Header parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Header) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Header parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Header getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Header parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Header() {
            this.memoizedIsInitialized = (byte) -1;
            this.signatureScheme_ = 1;
            this.encryptionScheme_ = 1;
            ByteString byteString = ByteString.EMPTY;
            this.verificationKeyId_ = byteString;
            this.decryptionKeyId_ = byteString;
            this.iv_ = byteString;
            this.publicMetadata_ = byteString;
            this.associatedDataLength_ = 0;
        }

        public static Header parseFrom(InputStream inputStream) throws IOException {
            return (Header) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Header parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Header) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Header parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Header) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Header parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Header) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Header(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i = codedInputStream.readEnum();
                                if (SigScheme.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(1, i);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.signatureScheme_ = i;
                                }
                            } else if (tag == 16) {
                                int i2 = codedInputStream.readEnum();
                                if (EncScheme.valueOf(i2) == null) {
                                    builderNewBuilder.mergeVarintField(2, i2);
                                } else {
                                    this.bitField0_ |= 2;
                                    this.encryptionScheme_ = i2;
                                }
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.verificationKeyId_ = codedInputStream.readBytes();
                            } else if (tag == 34) {
                                this.bitField0_ |= 8;
                                this.decryptionKeyId_ = codedInputStream.readBytes();
                            } else if (tag == 42) {
                                this.bitField0_ |= 16;
                                this.iv_ = codedInputStream.readBytes();
                            } else if (tag == 50) {
                                this.bitField0_ |= 32;
                                this.publicMetadata_ = codedInputStream.readBytes();
                            } else if (tag != 56) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 64;
                                this.associatedDataLength_ = codedInputStream.readUInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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
    }

    public static final class HeaderAndBody extends GeneratedMessageV3 implements HeaderAndBodyOrBuilder {
        public static final int BODY_FIELD_NUMBER = 2;
        public static final int HEADER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString body_;
        private Header header_;
        private byte memoizedIsInitialized;
        private static final HeaderAndBody DEFAULT_INSTANCE = new HeaderAndBody();

        @Deprecated
        public static final Parser<HeaderAndBody> PARSER = new AbstractParser<HeaderAndBody>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBody.1
            @Override // com.google.protobuf.Parser
            public HeaderAndBody parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new HeaderAndBody(codedInputStream, extensionRegistryLite);
            }
        };

        public static HeaderAndBody getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_HeaderAndBody_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HeaderAndBody parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderAndBody) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HeaderAndBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<HeaderAndBody> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeaderAndBody)) {
                return super.equals(obj);
            }
            HeaderAndBody headerAndBody = (HeaderAndBody) obj;
            boolean z = hasHeader() == headerAndBody.hasHeader();
            if (hasHeader()) {
                z = z && getHeader().equals(headerAndBody.getHeader());
            }
            boolean z2 = z && hasBody() == headerAndBody.hasBody();
            if (hasBody()) {
                z2 = z2 && getBody().equals(headerAndBody.getBody());
            }
            return z2 && this.unknownFields.equals(headerAndBody.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
        public ByteString getBody() {
            return this.body_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
        public Header getHeader() {
            Header header = this.header_;
            return header == null ? Header.getDefaultInstance() : header;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
        public HeaderOrBuilder getHeaderOrBuilder() {
            Header header = this.header_;
            return header == null ? Header.getDefaultInstance() : header;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HeaderAndBody> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeMessageSize(1, getHeader()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeBytesSize(2, this.body_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
        public boolean hasBody() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
        public boolean hasHeader() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasHeader()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHeader().hashCode();
            }
            if (hasBody()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBody().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_HeaderAndBody_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderAndBody.class, Builder.class);
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
            if (!hasHeader()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasBody()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getHeader().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getHeader());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.body_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderAndBodyOrBuilder {
            private int bitField0_;
            private ByteString body_;
            private SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> headerBuilder_;
            private Header header_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_HeaderAndBody_descriptor;
            }

            private SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> getHeaderFieldBuilder() {
                if (this.headerBuilder_ == null) {
                    this.headerBuilder_ = new SingleFieldBuilderV3<>(getHeader(), getParentForChildren(), isClean());
                    this.header_ = null;
                }
                return this.headerBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getHeaderFieldBuilder();
                }
            }

            public Builder clearBody() {
                this.bitField0_ &= -3;
                this.body_ = HeaderAndBody.getDefaultInstance().getBody();
                onChanged();
                return this;
            }

            public Builder clearHeader() {
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.header_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
            public ByteString getBody() {
                return this.body_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_HeaderAndBody_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
            public Header getHeader() {
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Header) singleFieldBuilderV3.getMessage();
                }
                Header header = this.header_;
                return header == null ? Header.getDefaultInstance() : header;
            }

            public Header.Builder getHeaderBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Header.Builder) getHeaderFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
            public HeaderOrBuilder getHeaderOrBuilder() {
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HeaderOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Header header = this.header_;
                return header == null ? Header.getDefaultInstance() : header;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
            public boolean hasBody() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyOrBuilder
            public boolean hasHeader() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_HeaderAndBody_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderAndBody.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasHeader() && hasBody() && getHeader().isInitialized();
            }

            public Builder mergeHeader(Header header) {
                Header header2;
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 1 || (header2 = this.header_) == null || header2 == Header.getDefaultInstance()) {
                        this.header_ = header;
                    } else {
                        this.header_ = Header.newBuilder(this.header_).mergeFrom(header).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(header);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setBody(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.body_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHeader(Header header) {
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    header.getClass();
                    this.header_ = header;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(header);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder() {
                this.header_ = null;
                this.body_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HeaderAndBody build() {
                HeaderAndBody headerAndBodyBuildPartial = buildPartial();
                if (headerAndBodyBuildPartial.isInitialized()) {
                    return headerAndBodyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerAndBodyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HeaderAndBody buildPartial() {
                HeaderAndBody headerAndBody = new HeaderAndBody(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    headerAndBody.header_ = this.header_;
                } else {
                    headerAndBody.header_ = (Header) singleFieldBuilderV3.build();
                }
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                headerAndBody.body_ = this.body_;
                headerAndBody.bitField0_ = i2;
                onBuilt();
                return headerAndBody;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HeaderAndBody getDefaultInstanceForType() {
                return HeaderAndBody.getDefaultInstance();
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
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.header_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                this.body_ = ByteString.EMPTY;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.header_ = null;
                this.body_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HeaderAndBody) {
                    return mergeFrom((HeaderAndBody) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setHeader(Header.Builder builder) {
                SingleFieldBuilderV3<Header, Header.Builder, HeaderOrBuilder> singleFieldBuilderV3 = this.headerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.header_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeFrom(HeaderAndBody headerAndBody) {
                if (headerAndBody == HeaderAndBody.getDefaultInstance()) {
                    return this;
                }
                if (headerAndBody.hasHeader()) {
                    mergeHeader(headerAndBody.getHeader());
                }
                if (headerAndBody.hasBody()) {
                    setBody(headerAndBody.getBody());
                }
                mergeUnknownFields(((GeneratedMessageV3) headerAndBody).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                HeaderAndBody headerAndBody = null;
                try {
                    try {
                        HeaderAndBody partialFrom = HeaderAndBody.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        HeaderAndBody headerAndBody2 = (HeaderAndBody) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            headerAndBody = headerAndBody2;
                            if (headerAndBody != null) {
                                mergeFrom(headerAndBody);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (headerAndBody != null) {
                        mergeFrom(headerAndBody);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(HeaderAndBody headerAndBody) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerAndBody);
        }

        public static HeaderAndBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private HeaderAndBody(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HeaderAndBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderAndBody) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HeaderAndBody parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HeaderAndBody getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static HeaderAndBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private HeaderAndBody() {
            this.memoizedIsInitialized = (byte) -1;
            this.body_ = ByteString.EMPTY;
        }

        public static HeaderAndBody parseFrom(InputStream inputStream) throws IOException {
            return (HeaderAndBody) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static HeaderAndBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderAndBody) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private HeaderAndBody(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                Header.Builder builder = (this.bitField0_ & 1) == 1 ? this.header_.toBuilder() : null;
                                Header header = (Header) codedInputStream.readMessage(Header.PARSER, extensionRegistryLite);
                                this.header_ = header;
                                if (builder != null) {
                                    builder.mergeFrom(header);
                                    this.header_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.body_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static HeaderAndBody parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderAndBody) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HeaderAndBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderAndBody) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HeaderAndBodyInternal extends GeneratedMessageV3 implements HeaderAndBodyInternalOrBuilder {
        public static final int BODY_FIELD_NUMBER = 2;
        public static final int HEADER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString body_;
        private ByteString header_;
        private byte memoizedIsInitialized;
        private static final HeaderAndBodyInternal DEFAULT_INSTANCE = new HeaderAndBodyInternal();

        @Deprecated
        public static final Parser<HeaderAndBodyInternal> PARSER = new AbstractParser<HeaderAndBodyInternal>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternal.1
            @Override // com.google.protobuf.Parser
            public HeaderAndBodyInternal parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new HeaderAndBodyInternal(codedInputStream, extensionRegistryLite);
            }
        };

        public static HeaderAndBodyInternal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_HeaderAndBodyInternal_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HeaderAndBodyInternal parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderAndBodyInternal) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HeaderAndBodyInternal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<HeaderAndBodyInternal> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeaderAndBodyInternal)) {
                return super.equals(obj);
            }
            HeaderAndBodyInternal headerAndBodyInternal = (HeaderAndBodyInternal) obj;
            boolean z = hasHeader() == headerAndBodyInternal.hasHeader();
            if (hasHeader()) {
                z = z && getHeader().equals(headerAndBodyInternal.getHeader());
            }
            boolean z2 = z && hasBody() == headerAndBodyInternal.hasBody();
            if (hasBody()) {
                z2 = z2 && getBody().equals(headerAndBodyInternal.getBody());
            }
            return z2 && this.unknownFields.equals(headerAndBodyInternal.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
        public ByteString getBody() {
            return this.body_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
        public ByteString getHeader() {
            return this.header_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HeaderAndBodyInternal> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.header_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.body_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
        public boolean hasBody() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
        public boolean hasHeader() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasHeader()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHeader().hashCode();
            }
            if (hasBody()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBody().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_HeaderAndBodyInternal_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderAndBodyInternal.class, Builder.class);
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
            if (!hasHeader()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasBody()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.header_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.body_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderAndBodyInternalOrBuilder {
            private int bitField0_;
            private ByteString body_;
            private ByteString header_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_HeaderAndBodyInternal_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearBody() {
                this.bitField0_ &= -3;
                this.body_ = HeaderAndBodyInternal.getDefaultInstance().getBody();
                onChanged();
                return this;
            }

            public Builder clearHeader() {
                this.bitField0_ &= -2;
                this.header_ = HeaderAndBodyInternal.getDefaultInstance().getHeader();
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
            public ByteString getBody() {
                return this.body_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_HeaderAndBodyInternal_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
            public ByteString getHeader() {
                return this.header_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
            public boolean hasBody() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.HeaderAndBodyInternalOrBuilder
            public boolean hasHeader() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_HeaderAndBodyInternal_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderAndBodyInternal.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasHeader() && hasBody();
            }

            public Builder setBody(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.body_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHeader(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.header_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.header_ = byteString;
                this.body_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HeaderAndBodyInternal build() {
                HeaderAndBodyInternal headerAndBodyInternalBuildPartial = buildPartial();
                if (headerAndBodyInternalBuildPartial.isInitialized()) {
                    return headerAndBodyInternalBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) headerAndBodyInternalBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HeaderAndBodyInternal buildPartial() {
                HeaderAndBodyInternal headerAndBodyInternal = new HeaderAndBodyInternal(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                headerAndBodyInternal.header_ = this.header_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                headerAndBodyInternal.body_ = this.body_;
                headerAndBodyInternal.bitField0_ = i2;
                onBuilt();
                return headerAndBodyInternal;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HeaderAndBodyInternal getDefaultInstanceForType() {
                return HeaderAndBodyInternal.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.header_ = byteString;
                int i = this.bitField0_ & (-2);
                this.body_ = byteString;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.header_ = byteString;
                this.body_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HeaderAndBodyInternal) {
                    return mergeFrom((HeaderAndBodyInternal) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HeaderAndBodyInternal headerAndBodyInternal) {
                if (headerAndBodyInternal == HeaderAndBodyInternal.getDefaultInstance()) {
                    return this;
                }
                if (headerAndBodyInternal.hasHeader()) {
                    setHeader(headerAndBodyInternal.getHeader());
                }
                if (headerAndBodyInternal.hasBody()) {
                    setBody(headerAndBodyInternal.getBody());
                }
                mergeUnknownFields(((GeneratedMessageV3) headerAndBodyInternal).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                HeaderAndBodyInternal headerAndBodyInternal = null;
                try {
                    try {
                        HeaderAndBodyInternal partialFrom = HeaderAndBodyInternal.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        HeaderAndBodyInternal headerAndBodyInternal2 = (HeaderAndBodyInternal) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            headerAndBodyInternal = headerAndBodyInternal2;
                            if (headerAndBodyInternal != null) {
                                mergeFrom(headerAndBodyInternal);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (headerAndBodyInternal != null) {
                        mergeFrom(headerAndBodyInternal);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(HeaderAndBodyInternal headerAndBodyInternal) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerAndBodyInternal);
        }

        public static HeaderAndBodyInternal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private HeaderAndBodyInternal(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HeaderAndBodyInternal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderAndBodyInternal) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HeaderAndBodyInternal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HeaderAndBodyInternal getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static HeaderAndBodyInternal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private HeaderAndBodyInternal() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.header_ = byteString;
            this.body_ = byteString;
        }

        public static HeaderAndBodyInternal parseFrom(InputStream inputStream) throws IOException {
            return (HeaderAndBodyInternal) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static HeaderAndBodyInternal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderAndBodyInternal) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private HeaderAndBodyInternal(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.header_ = codedInputStream.readBytes();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.body_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static HeaderAndBodyInternal parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderAndBodyInternal) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HeaderAndBodyInternal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderAndBodyInternal) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HeaderAndBodyInternalOrBuilder extends MessageOrBuilder {
        ByteString getBody();

        ByteString getHeader();

        boolean hasBody();

        boolean hasHeader();
    }

    public interface HeaderAndBodyOrBuilder extends MessageOrBuilder {
        ByteString getBody();

        Header getHeader();

        HeaderOrBuilder getHeaderOrBuilder();

        boolean hasBody();

        boolean hasHeader();
    }

    public interface HeaderOrBuilder extends MessageOrBuilder {
        int getAssociatedDataLength();

        ByteString getDecryptionKeyId();

        EncScheme getEncryptionScheme();

        ByteString getIv();

        ByteString getPublicMetadata();

        SigScheme getSignatureScheme();

        ByteString getVerificationKeyId();

        boolean hasAssociatedDataLength();

        boolean hasDecryptionKeyId();

        boolean hasEncryptionScheme();

        boolean hasIv();

        boolean hasPublicMetadata();

        boolean hasSignatureScheme();

        boolean hasVerificationKeyId();
    }

    public enum PublicKeyType implements ProtocolMessageEnum {
        EC_P256(1),
        RSA2048(2),
        DH2048_MODP(3);

        public static final int DH2048_MODP_VALUE = 3;
        public static final int EC_P256_VALUE = 1;
        public static final int RSA2048_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<PublicKeyType> internalValueMap = new Internal.EnumLiteMap<PublicKeyType>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.PublicKeyType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public PublicKeyType findValueByNumber(int i) {
                return PublicKeyType.forNumber(i);
            }
        };
        private static final PublicKeyType[] VALUES = values();

        PublicKeyType(int i) {
            this.value = i;
        }

        public static PublicKeyType forNumber(int i) {
            if (i == 1) {
                return EC_P256;
            }
            if (i == 2) {
                return RSA2048;
            }
            if (i != 3) {
                return null;
            }
            return DH2048_MODP;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureMessageProto.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<PublicKeyType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static PublicKeyType valueOf(int i) {
            return forNumber(i);
        }

        public static PublicKeyType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SecureMessage extends GeneratedMessageV3 implements SecureMessageOrBuilder {
        public static final int HEADER_AND_BODY_FIELD_NUMBER = 1;
        public static final int SIGNATURE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString headerAndBody_;
        private byte memoizedIsInitialized;
        private ByteString signature_;
        private static final SecureMessage DEFAULT_INSTANCE = new SecureMessage();

        @Deprecated
        public static final Parser<SecureMessage> PARSER = new AbstractParser<SecureMessage>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessage.1
            @Override // com.google.protobuf.Parser
            public SecureMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SecureMessage(codedInputStream, extensionRegistryLite);
            }
        };

        public static SecureMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_SecureMessage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SecureMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SecureMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SecureMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<SecureMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SecureMessage)) {
                return super.equals(obj);
            }
            SecureMessage secureMessage = (SecureMessage) obj;
            boolean z = hasHeaderAndBody() == secureMessage.hasHeaderAndBody();
            if (hasHeaderAndBody()) {
                z = z && getHeaderAndBody().equals(secureMessage.getHeaderAndBody());
            }
            boolean z2 = z && hasSignature() == secureMessage.hasSignature();
            if (hasSignature()) {
                z2 = z2 && getSignature().equals(secureMessage.getSignature());
            }
            return z2 && this.unknownFields.equals(secureMessage.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
        public ByteString getHeaderAndBody() {
            return this.headerAndBody_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SecureMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.headerAndBody_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.signature_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
        public ByteString getSignature() {
            return this.signature_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
        public boolean hasHeaderAndBody() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
        public boolean hasSignature() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasHeaderAndBody()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getHeaderAndBody().hashCode();
            }
            if (hasSignature()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSignature().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_SecureMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SecureMessage.class, Builder.class);
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
            if (!hasHeaderAndBody()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSignature()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.headerAndBody_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.signature_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SecureMessageOrBuilder {
            private int bitField0_;
            private ByteString headerAndBody_;
            private ByteString signature_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_SecureMessage_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearHeaderAndBody() {
                this.bitField0_ &= -2;
                this.headerAndBody_ = SecureMessage.getDefaultInstance().getHeaderAndBody();
                onChanged();
                return this;
            }

            public Builder clearSignature() {
                this.bitField0_ &= -3;
                this.signature_ = SecureMessage.getDefaultInstance().getSignature();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_SecureMessage_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
            public ByteString getHeaderAndBody() {
                return this.headerAndBody_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
            public ByteString getSignature() {
                return this.signature_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
            public boolean hasHeaderAndBody() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SecureMessageOrBuilder
            public boolean hasSignature() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_SecureMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SecureMessage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasHeaderAndBody() && hasSignature();
            }

            public Builder setHeaderAndBody(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.headerAndBody_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSignature(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.signature_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.headerAndBody_ = byteString;
                this.signature_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SecureMessage build() {
                SecureMessage secureMessageBuildPartial = buildPartial();
                if (secureMessageBuildPartial.isInitialized()) {
                    return secureMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) secureMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SecureMessage buildPartial() {
                SecureMessage secureMessage = new SecureMessage(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                secureMessage.headerAndBody_ = this.headerAndBody_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                secureMessage.signature_ = this.signature_;
                secureMessage.bitField0_ = i2;
                onBuilt();
                return secureMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SecureMessage getDefaultInstanceForType() {
                return SecureMessage.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.headerAndBody_ = byteString;
                int i = this.bitField0_ & (-2);
                this.signature_ = byteString;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.headerAndBody_ = byteString;
                this.signature_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SecureMessage) {
                    return mergeFrom((SecureMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SecureMessage secureMessage) {
                if (secureMessage == SecureMessage.getDefaultInstance()) {
                    return this;
                }
                if (secureMessage.hasHeaderAndBody()) {
                    setHeaderAndBody(secureMessage.getHeaderAndBody());
                }
                if (secureMessage.hasSignature()) {
                    setSignature(secureMessage.getSignature());
                }
                mergeUnknownFields(((GeneratedMessageV3) secureMessage).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                SecureMessage secureMessage = null;
                try {
                    try {
                        SecureMessage partialFrom = SecureMessage.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        SecureMessage secureMessage2 = (SecureMessage) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            secureMessage = secureMessage2;
                            if (secureMessage != null) {
                                mergeFrom(secureMessage);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (secureMessage != null) {
                        mergeFrom(secureMessage);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(SecureMessage secureMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(secureMessage);
        }

        public static SecureMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SecureMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SecureMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SecureMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SecureMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SecureMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SecureMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SecureMessage() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.headerAndBody_ = byteString;
            this.signature_ = byteString;
        }

        public static SecureMessage parseFrom(InputStream inputStream) throws IOException {
            return (SecureMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SecureMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SecureMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SecureMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.headerAndBody_ = codedInputStream.readBytes();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.signature_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static SecureMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SecureMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SecureMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SecureMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SecureMessageOrBuilder extends MessageOrBuilder {
        ByteString getHeaderAndBody();

        ByteString getSignature();

        boolean hasHeaderAndBody();

        boolean hasSignature();
    }

    public enum SigScheme implements ProtocolMessageEnum {
        HMAC_SHA256(1),
        ECDSA_P256_SHA256(2),
        RSA2048_SHA256(3);

        public static final int ECDSA_P256_SHA256_VALUE = 2;
        public static final int HMAC_SHA256_VALUE = 1;
        public static final int RSA2048_SHA256_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<SigScheme> internalValueMap = new Internal.EnumLiteMap<SigScheme>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SigScheme.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SigScheme findValueByNumber(int i) {
                return SigScheme.forNumber(i);
            }
        };
        private static final SigScheme[] VALUES = values();

        SigScheme(int i) {
            this.value = i;
        }

        public static SigScheme forNumber(int i) {
            if (i == 1) {
                return HMAC_SHA256;
            }
            if (i == 2) {
                return ECDSA_P256_SHA256;
            }
            if (i != 3) {
                return null;
            }
            return RSA2048_SHA256;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureMessageProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SigScheme> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static SigScheme valueOf(int i) {
            return forNumber(i);
        }

        public static SigScheme valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class SimpleRsaPublicKey extends GeneratedMessageV3 implements SimpleRsaPublicKeyOrBuilder {
        public static final int E_FIELD_NUMBER = 2;
        public static final int N_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int e_;
        private byte memoizedIsInitialized;
        private ByteString n_;
        private static final SimpleRsaPublicKey DEFAULT_INSTANCE = new SimpleRsaPublicKey();

        @Deprecated
        public static final Parser<SimpleRsaPublicKey> PARSER = new AbstractParser<SimpleRsaPublicKey>() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKey.1
            @Override // com.google.protobuf.Parser
            public SimpleRsaPublicKey parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SimpleRsaPublicKey(codedInputStream, extensionRegistryLite);
            }
        };

        public static SimpleRsaPublicKey getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureMessageProto.internal_static_securemessage_SimpleRsaPublicKey_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SimpleRsaPublicKey parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SimpleRsaPublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SimpleRsaPublicKey parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<SimpleRsaPublicKey> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SimpleRsaPublicKey)) {
                return super.equals(obj);
            }
            SimpleRsaPublicKey simpleRsaPublicKey = (SimpleRsaPublicKey) obj;
            boolean z = hasN() == simpleRsaPublicKey.hasN();
            if (hasN()) {
                z = z && getN().equals(simpleRsaPublicKey.getN());
            }
            boolean z2 = z && hasE() == simpleRsaPublicKey.hasE();
            if (hasE()) {
                z2 = z2 && getE() == simpleRsaPublicKey.getE();
            }
            return z2 && this.unknownFields.equals(simpleRsaPublicKey.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
        public int getE() {
            return this.e_;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
        public ByteString getN() {
            return this.n_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SimpleRsaPublicKey> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.n_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeInt32Size(2, this.e_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
        public boolean hasE() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
        public boolean hasN() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasN()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getN().hashCode();
            }
            if (hasE()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getE();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureMessageProto.internal_static_securemessage_SimpleRsaPublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(SimpleRsaPublicKey.class, Builder.class);
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
            if (hasN()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.n_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SimpleRsaPublicKeyOrBuilder {
            private int bitField0_;
            private int e_;
            private ByteString n_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureMessageProto.internal_static_securemessage_SimpleRsaPublicKey_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearE() {
                this.bitField0_ &= -3;
                this.e_ = 65537;
                onChanged();
                return this;
            }

            public Builder clearN() {
                this.bitField0_ &= -2;
                this.n_ = SimpleRsaPublicKey.getDefaultInstance().getN();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureMessageProto.internal_static_securemessage_SimpleRsaPublicKey_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
            public int getE() {
                return this.e_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
            public ByteString getN() {
                return this.n_;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
            public boolean hasE() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securemessage.SecureMessageProto.SimpleRsaPublicKeyOrBuilder
            public boolean hasN() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureMessageProto.internal_static_securemessage_SimpleRsaPublicKey_fieldAccessorTable.ensureFieldAccessorsInitialized(SimpleRsaPublicKey.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasN();
            }

            public Builder setE(int i) {
                this.bitField0_ |= 2;
                this.e_ = i;
                onChanged();
                return this;
            }

            public Builder setN(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.n_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.n_ = ByteString.EMPTY;
                this.e_ = 65537;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SimpleRsaPublicKey build() {
                SimpleRsaPublicKey simpleRsaPublicKeyBuildPartial = buildPartial();
                if (simpleRsaPublicKeyBuildPartial.isInitialized()) {
                    return simpleRsaPublicKeyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) simpleRsaPublicKeyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SimpleRsaPublicKey buildPartial() {
                SimpleRsaPublicKey simpleRsaPublicKey = new SimpleRsaPublicKey(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                simpleRsaPublicKey.n_ = this.n_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                simpleRsaPublicKey.e_ = this.e_;
                simpleRsaPublicKey.bitField0_ = i2;
                onBuilt();
                return simpleRsaPublicKey;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SimpleRsaPublicKey getDefaultInstanceForType() {
                return SimpleRsaPublicKey.getDefaultInstance();
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
                this.n_ = ByteString.EMPTY;
                int i = this.bitField0_ & (-2);
                this.e_ = 65537;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.n_ = ByteString.EMPTY;
                this.e_ = 65537;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SimpleRsaPublicKey) {
                    return mergeFrom((SimpleRsaPublicKey) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SimpleRsaPublicKey simpleRsaPublicKey) {
                if (simpleRsaPublicKey == SimpleRsaPublicKey.getDefaultInstance()) {
                    return this;
                }
                if (simpleRsaPublicKey.hasN()) {
                    setN(simpleRsaPublicKey.getN());
                }
                if (simpleRsaPublicKey.hasE()) {
                    setE(simpleRsaPublicKey.getE());
                }
                mergeUnknownFields(((GeneratedMessageV3) simpleRsaPublicKey).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                SimpleRsaPublicKey simpleRsaPublicKey = null;
                try {
                    try {
                        SimpleRsaPublicKey partialFrom = SimpleRsaPublicKey.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        SimpleRsaPublicKey simpleRsaPublicKey2 = (SimpleRsaPublicKey) e2.getUnfinishedMessage();
                        try {
                            throw e2.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            simpleRsaPublicKey = simpleRsaPublicKey2;
                            if (simpleRsaPublicKey != null) {
                                mergeFrom(simpleRsaPublicKey);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (simpleRsaPublicKey != null) {
                        mergeFrom(simpleRsaPublicKey);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(SimpleRsaPublicKey simpleRsaPublicKey) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(simpleRsaPublicKey);
        }

        public static SimpleRsaPublicKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SimpleRsaPublicKey(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SimpleRsaPublicKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimpleRsaPublicKey) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SimpleRsaPublicKey parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SimpleRsaPublicKey getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SimpleRsaPublicKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SimpleRsaPublicKey() {
            this.memoizedIsInitialized = (byte) -1;
            this.n_ = ByteString.EMPTY;
            this.e_ = 65537;
        }

        public static SimpleRsaPublicKey parseFrom(InputStream inputStream) throws IOException {
            return (SimpleRsaPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SimpleRsaPublicKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimpleRsaPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SimpleRsaPublicKey(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.n_ = codedInputStream.readBytes();
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.e_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
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

        public static SimpleRsaPublicKey parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SimpleRsaPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SimpleRsaPublicKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimpleRsaPublicKey) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SimpleRsaPublicKeyOrBuilder extends MessageOrBuilder {
        int getE();

        ByteString getN();

        boolean hasE();

        boolean hasN();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013securemessage.proto\u0012\rsecuremessage\";\n\rSecureMessage\u0012\u0017\n\u000fheader_and_body\u0018\u0001 \u0002(\f\u0012\u0011\n\tsignature\u0018\u0002 \u0002(\f\"ñ\u0001\n\u0006Header\u00122\n\u0010signature_scheme\u0018\u0001 \u0002(\u000e2\u0018.securemessage.SigScheme\u00123\n\u0011encryption_scheme\u0018\u0002 \u0002(\u000e2\u0018.securemessage.EncScheme\u0012\u001b\n\u0013verification_key_id\u0018\u0003 \u0001(\f\u0012\u0019\n\u0011decryption_key_id\u0018\u0004 \u0001(\f\u0012\n\n\u0002iv\u0018\u0005 \u0001(\f\u0012\u0017\n\u000fpublic_metadata\u0018\u0006 \u0001(\f\u0012!\n\u0016associated_data_length\u0018\u0007 \u0001(\r:\u00010\"D\n\rHeaderAndBody\u0012%\n\u0006header\u0018\u0001 \u0002(\u000b2\u0015.securemessage.Header\u0012\f\n", "\u0004body\u0018\u0002 \u0002(\f\"5\n\u0015HeaderAndBodyInternal\u0012\u000e\n\u0006header\u0018\u0001 \u0002(\f\u0012\f\n\u0004body\u0018\u0002 \u0002(\f\"'\n\u000fEcP256PublicKey\u0012\t\n\u0001x\u0018\u0001 \u0002(\f\u0012\t\n\u0001y\u0018\u0002 \u0002(\f\"1\n\u0012SimpleRsaPublicKey\u0012\t\n\u0001n\u0018\u0001 \u0002(\f\u0012\u0010\n\u0001e\u0018\u0002 \u0001(\u0005:\u000565537\"\u0018\n\u000bDhPublicKey\u0012\t\n\u0001y\u0018\u0001 \u0002(\f\"ð\u0001\n\u0010GenericPublicKey\u0012*\n\u0004type\u0018\u0001 \u0002(\u000e2\u001c.securemessage.PublicKeyType\u0012:\n\u0012ec_p256_public_key\u0018\u0002 \u0001(\u000b2\u001e.securemessage.EcP256PublicKey\u0012=\n\u0012rsa2048_public_key\u0018\u0003 \u0001(\u000b2!.securemessage.SimpleRsaPublicKey\u00125\n\u0011dh2048_public_key\u0018\u0004 \u0001(\u000b2", "\u001a.securemessage.DhPublicKey*G\n\tSigScheme\u0012\u000f\n\u000bHMAC_SHA256\u0010\u0001\u0012\u0015\n\u0011ECDSA_P256_SHA256\u0010\u0002\u0012\u0012\n\u000eRSA2048_SHA256\u0010\u0003*&\n\tEncScheme\u0012\b\n\u0004NONE\u0010\u0001\u0012\u000f\n\u000bAES_256_CBC\u0010\u0002*:\n\rPublicKeyType\u0012\u000b\n\u0007EC_P256\u0010\u0001\u0012\u000b\n\u0007RSA2048\u0010\u0002\u0012\u000f\n\u000bDH2048_MODP\u0010\u0003BL\n/com.google.security.cryptauth.lib.securemessageB\u0012SecureMessageProto¢\u0002\u0004SMSG"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.google.security.cryptauth.lib.securemessage.SecureMessageProto.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = SecureMessageProto.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_securemessage_SecureMessage_descriptor = descriptor2;
        internal_static_securemessage_SecureMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"HeaderAndBody", "Signature"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_securemessage_Header_descriptor = descriptor3;
        internal_static_securemessage_Header_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"SignatureScheme", "EncryptionScheme", "VerificationKeyId", "DecryptionKeyId", "Iv", "PublicMetadata", "AssociatedDataLength"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_securemessage_HeaderAndBody_descriptor = descriptor4;
        internal_static_securemessage_HeaderAndBody_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Header", "Body"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_securemessage_HeaderAndBodyInternal_descriptor = descriptor5;
        internal_static_securemessage_HeaderAndBodyInternal_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Header", "Body"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_securemessage_EcP256PublicKey_descriptor = descriptor6;
        internal_static_securemessage_EcP256PublicKey_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_securemessage_SimpleRsaPublicKey_descriptor = descriptor7;
        internal_static_securemessage_SimpleRsaPublicKey_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"N", ExifInterface.LONGITUDE_EAST});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_securemessage_DhPublicKey_descriptor = descriptor8;
        internal_static_securemessage_DhPublicKey_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Y"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_securemessage_GenericPublicKey_descriptor = descriptor9;
        internal_static_securemessage_GenericPublicKey_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Type", "EcP256PublicKey", "Rsa2048PublicKey", "Dh2048PublicKey"});
    }

    private SecureMessageProto() {
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
