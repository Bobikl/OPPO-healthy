package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class UkeyProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_securegcm_Ukey2Alert_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Ukey2Alert_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_Ukey2ClientFinished_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Ukey2ClientFinished_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_Ukey2ClientInit_CipherCommitment_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Ukey2ClientInit_CipherCommitment_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_Ukey2ClientInit_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Ukey2ClientInit_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_Ukey2Message_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Ukey2Message_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_Ukey2ServerInit_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Ukey2ServerInit_fieldAccessorTable;

    public static final class Ukey2Alert extends GeneratedMessageV3 implements Ukey2AlertOrBuilder {
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object errorMessage_;
        private byte memoizedIsInitialized;
        private int type_;
        private static final Ukey2Alert DEFAULT_INSTANCE = new Ukey2Alert();

        @Deprecated
        public static final Parser<Ukey2Alert> PARSER = new AbstractParser<Ukey2Alert>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2Alert.1
            @Override // com.google.protobuf.Parser
            public Ukey2Alert parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Ukey2Alert(codedInputStream, extensionRegistryLite);
            }
        };

        public enum AlertType implements ProtocolMessageEnum {
            BAD_MESSAGE(1),
            BAD_MESSAGE_TYPE(2),
            INCORRECT_MESSAGE(3),
            BAD_MESSAGE_DATA(4),
            BAD_VERSION(100),
            BAD_RANDOM(101),
            BAD_HANDSHAKE_CIPHER(102),
            BAD_NEXT_PROTOCOL(103),
            BAD_PUBLIC_KEY(104),
            INTERNAL_ERROR(200);

            public static final int BAD_HANDSHAKE_CIPHER_VALUE = 102;
            public static final int BAD_MESSAGE_DATA_VALUE = 4;
            public static final int BAD_MESSAGE_TYPE_VALUE = 2;
            public static final int BAD_MESSAGE_VALUE = 1;
            public static final int BAD_NEXT_PROTOCOL_VALUE = 103;
            public static final int BAD_PUBLIC_KEY_VALUE = 104;
            public static final int BAD_RANDOM_VALUE = 101;
            public static final int BAD_VERSION_VALUE = 100;
            public static final int INCORRECT_MESSAGE_VALUE = 3;
            public static final int INTERNAL_ERROR_VALUE = 200;
            private final int value;
            private static final Internal.EnumLiteMap<AlertType> internalValueMap = new Internal.EnumLiteMap<AlertType>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2Alert.AlertType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AlertType findValueByNumber(int i) {
                    return AlertType.forNumber(i);
                }
            };
            private static final AlertType[] VALUES = values();

            AlertType(int i) {
                this.value = i;
            }

            public static AlertType forNumber(int i) {
                if (i == 200) {
                    return INTERNAL_ERROR;
                }
                if (i == 1) {
                    return BAD_MESSAGE;
                }
                if (i == 2) {
                    return BAD_MESSAGE_TYPE;
                }
                if (i == 3) {
                    return INCORRECT_MESSAGE;
                }
                if (i == 4) {
                    return BAD_MESSAGE_DATA;
                }
                switch (i) {
                    case 100:
                        return BAD_VERSION;
                    case 101:
                        return BAD_RANDOM;
                    case 102:
                        return BAD_HANDSHAKE_CIPHER;
                    case 103:
                        return BAD_NEXT_PROTOCOL;
                    case 104:
                        return BAD_PUBLIC_KEY;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Ukey2Alert.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<AlertType> internalGetValueMap() {
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
            public static AlertType valueOf(int i) {
                return forNumber(i);
            }

            public static AlertType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static Ukey2Alert getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UkeyProto.internal_static_securegcm_Ukey2Alert_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ukey2Alert parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ukey2Alert) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Ukey2Alert parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Ukey2Alert> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ukey2Alert)) {
                return super.equals(obj);
            }
            Ukey2Alert ukey2Alert = (Ukey2Alert) obj;
            boolean z = hasType() == ukey2Alert.hasType();
            if (hasType()) {
                z = z && this.type_ == ukey2Alert.type_;
            }
            boolean z2 = z && hasErrorMessage() == ukey2Alert.hasErrorMessage();
            if (hasErrorMessage()) {
                z2 = z2 && getErrorMessage().equals(ukey2Alert.getErrorMessage());
            }
            return z2 && this.unknownFields.equals(ukey2Alert.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
        public String getErrorMessage() {
            Object obj = this.errorMessage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.errorMessage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
        public ByteString getErrorMessageBytes() {
            Object obj = this.errorMessage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.errorMessage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Ukey2Alert> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.errorMessage_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
        public AlertType getType() {
            AlertType alertTypeValueOf = AlertType.valueOf(this.type_);
            return alertTypeValueOf == null ? AlertType.BAD_MESSAGE : alertTypeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
        public boolean hasErrorMessage() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
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
            if (hasErrorMessage()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getErrorMessage().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UkeyProto.internal_static_securegcm_Ukey2Alert_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2Alert.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.errorMessage_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Ukey2AlertOrBuilder {
            private int bitField0_;
            private Object errorMessage_;
            private int type_;

            public static final Descriptors.Descriptor getDescriptor() {
                return UkeyProto.internal_static_securegcm_Ukey2Alert_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearErrorMessage() {
                this.bitField0_ &= -3;
                this.errorMessage_ = Ukey2Alert.getDefaultInstance().getErrorMessage();
                onChanged();
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
                return UkeyProto.internal_static_securegcm_Ukey2Alert_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
            public String getErrorMessage() {
                Object obj = this.errorMessage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.errorMessage_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
            public ByteString getErrorMessageBytes() {
                Object obj = this.errorMessage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.errorMessage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
            public AlertType getType() {
                AlertType alertTypeValueOf = AlertType.valueOf(this.type_);
                return alertTypeValueOf == null ? AlertType.BAD_MESSAGE : alertTypeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
            public boolean hasErrorMessage() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2AlertOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return UkeyProto.internal_static_securegcm_Ukey2Alert_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2Alert.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setErrorMessage(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.errorMessage_ = str;
                onChanged();
                return this;
            }

            public Builder setErrorMessageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.errorMessage_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(AlertType alertType) {
                alertType.getClass();
                this.bitField0_ |= 1;
                this.type_ = alertType.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 1;
                this.errorMessage_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2Alert build() {
                Ukey2Alert ukey2AlertBuildPartial = buildPartial();
                if (ukey2AlertBuildPartial.isInitialized()) {
                    return ukey2AlertBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ukey2AlertBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2Alert buildPartial() {
                Ukey2Alert ukey2Alert = new Ukey2Alert(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ukey2Alert.type_ = this.type_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ukey2Alert.errorMessage_ = this.errorMessage_;
                ukey2Alert.bitField0_ = i2;
                onBuilt();
                return ukey2Alert;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Ukey2Alert getDefaultInstanceForType() {
                return Ukey2Alert.getDefaultInstance();
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
                int i = this.bitField0_ & (-2);
                this.errorMessage_ = "";
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 1;
                this.errorMessage_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Ukey2Alert) {
                    return mergeFrom((Ukey2Alert) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Ukey2Alert ukey2Alert) {
                if (ukey2Alert == Ukey2Alert.getDefaultInstance()) {
                    return this;
                }
                if (ukey2Alert.hasType()) {
                    setType(ukey2Alert.getType());
                }
                if (ukey2Alert.hasErrorMessage()) {
                    this.bitField0_ |= 2;
                    this.errorMessage_ = ukey2Alert.errorMessage_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) ukey2Alert).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Ukey2Alert ukey2Alert = null;
                try {
                    try {
                        Ukey2Alert partialFrom = Ukey2Alert.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Ukey2Alert ukey2Alert2 = (Ukey2Alert) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ukey2Alert = ukey2Alert2;
                            if (ukey2Alert != null) {
                                mergeFrom(ukey2Alert);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ukey2Alert != null) {
                        mergeFrom(ukey2Alert);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Ukey2Alert ukey2Alert) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ukey2Alert);
        }

        public static Ukey2Alert parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Ukey2Alert(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Ukey2Alert parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2Alert) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2Alert parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Ukey2Alert getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Ukey2Alert parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Ukey2Alert() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 1;
            this.errorMessage_ = "";
        }

        public static Ukey2Alert parseFrom(InputStream inputStream) throws IOException {
            return (Ukey2Alert) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Ukey2Alert parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2Alert) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Ukey2Alert(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                if (AlertType.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(1, i);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i;
                                }
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.errorMessage_ = bytes;
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

        public static Ukey2Alert parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Ukey2Alert) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Ukey2Alert parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2Alert) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface Ukey2AlertOrBuilder extends MessageOrBuilder {
        String getErrorMessage();

        ByteString getErrorMessageBytes();

        Ukey2Alert.AlertType getType();

        boolean hasErrorMessage();

        boolean hasType();
    }

    public static final class Ukey2ClientFinished extends GeneratedMessageV3 implements Ukey2ClientFinishedOrBuilder {
        public static final int IVSPEC_FIELD_NUMBER = 2;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString ivSpec_;
        private byte memoizedIsInitialized;
        private ByteString publicKey_;
        private static final Ukey2ClientFinished DEFAULT_INSTANCE = new Ukey2ClientFinished();

        @Deprecated
        public static final Parser<Ukey2ClientFinished> PARSER = new AbstractParser<Ukey2ClientFinished>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinished.1
            @Override // com.google.protobuf.Parser
            public Ukey2ClientFinished parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Ukey2ClientFinished(codedInputStream, extensionRegistryLite);
            }
        };

        public static Ukey2ClientFinished getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UkeyProto.internal_static_securegcm_Ukey2ClientFinished_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ukey2ClientFinished parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ukey2ClientFinished) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Ukey2ClientFinished parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Ukey2ClientFinished> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ukey2ClientFinished)) {
                return super.equals(obj);
            }
            Ukey2ClientFinished ukey2ClientFinished = (Ukey2ClientFinished) obj;
            boolean z = hasPublicKey() == ukey2ClientFinished.hasPublicKey();
            if (hasPublicKey()) {
                z = z && getPublicKey().equals(ukey2ClientFinished.getPublicKey());
            }
            boolean z2 = z && hasIvSpec() == ukey2ClientFinished.hasIvSpec();
            if (hasIvSpec()) {
                z2 = z2 && getIvSpec().equals(ukey2ClientFinished.getIvSpec());
            }
            return z2 && this.unknownFields.equals(ukey2ClientFinished.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
        public ByteString getIvSpec() {
            return this.ivSpec_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Ukey2ClientFinished> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
        public ByteString getPublicKey() {
            return this.publicKey_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.publicKey_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.ivSpec_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
        public boolean hasIvSpec() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
        public boolean hasPublicKey() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasPublicKey()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPublicKey().hashCode();
            }
            if (hasIvSpec()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getIvSpec().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UkeyProto.internal_static_securegcm_Ukey2ClientFinished_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2ClientFinished.class, Builder.class);
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
                codedOutputStream.writeBytes(1, this.publicKey_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.ivSpec_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Ukey2ClientFinishedOrBuilder {
            private int bitField0_;
            private ByteString ivSpec_;
            private ByteString publicKey_;

            public static final Descriptors.Descriptor getDescriptor() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientFinished_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearIvSpec() {
                this.bitField0_ &= -3;
                this.ivSpec_ = Ukey2ClientFinished.getDefaultInstance().getIvSpec();
                onChanged();
                return this;
            }

            public Builder clearPublicKey() {
                this.bitField0_ &= -2;
                this.publicKey_ = Ukey2ClientFinished.getDefaultInstance().getPublicKey();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientFinished_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
            public ByteString getIvSpec() {
                return this.ivSpec_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
            public ByteString getPublicKey() {
                return this.publicKey_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
            public boolean hasIvSpec() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientFinishedOrBuilder
            public boolean hasPublicKey() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientFinished_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2ClientFinished.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setIvSpec(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.ivSpec_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPublicKey(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.publicKey_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.publicKey_ = byteString;
                this.ivSpec_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2ClientFinished build() {
                Ukey2ClientFinished ukey2ClientFinishedBuildPartial = buildPartial();
                if (ukey2ClientFinishedBuildPartial.isInitialized()) {
                    return ukey2ClientFinishedBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ukey2ClientFinishedBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2ClientFinished buildPartial() {
                Ukey2ClientFinished ukey2ClientFinished = new Ukey2ClientFinished(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ukey2ClientFinished.publicKey_ = this.publicKey_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ukey2ClientFinished.ivSpec_ = this.ivSpec_;
                ukey2ClientFinished.bitField0_ = i2;
                onBuilt();
                return ukey2ClientFinished;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Ukey2ClientFinished getDefaultInstanceForType() {
                return Ukey2ClientFinished.getDefaultInstance();
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
                this.publicKey_ = byteString;
                int i = this.bitField0_ & (-2);
                this.ivSpec_ = byteString;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.publicKey_ = byteString;
                this.ivSpec_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Ukey2ClientFinished) {
                    return mergeFrom((Ukey2ClientFinished) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Ukey2ClientFinished ukey2ClientFinished) {
                if (ukey2ClientFinished == Ukey2ClientFinished.getDefaultInstance()) {
                    return this;
                }
                if (ukey2ClientFinished.hasPublicKey()) {
                    setPublicKey(ukey2ClientFinished.getPublicKey());
                }
                if (ukey2ClientFinished.hasIvSpec()) {
                    setIvSpec(ukey2ClientFinished.getIvSpec());
                }
                mergeUnknownFields(((GeneratedMessageV3) ukey2ClientFinished).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Ukey2ClientFinished ukey2ClientFinished = null;
                try {
                    try {
                        Ukey2ClientFinished partialFrom = Ukey2ClientFinished.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Ukey2ClientFinished ukey2ClientFinished2 = (Ukey2ClientFinished) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ukey2ClientFinished = ukey2ClientFinished2;
                            if (ukey2ClientFinished != null) {
                                mergeFrom(ukey2ClientFinished);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ukey2ClientFinished != null) {
                        mergeFrom(ukey2ClientFinished);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Ukey2ClientFinished ukey2ClientFinished) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ukey2ClientFinished);
        }

        public static Ukey2ClientFinished parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Ukey2ClientFinished(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Ukey2ClientFinished parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ClientFinished) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2ClientFinished parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Ukey2ClientFinished getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Ukey2ClientFinished parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Ukey2ClientFinished() {
            this.memoizedIsInitialized = (byte) -1;
            ByteString byteString = ByteString.EMPTY;
            this.publicKey_ = byteString;
            this.ivSpec_ = byteString;
        }

        public static Ukey2ClientFinished parseFrom(InputStream inputStream) throws IOException {
            return (Ukey2ClientFinished) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Ukey2ClientFinished parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ClientFinished) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Ukey2ClientFinished(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.publicKey_ = codedInputStream.readBytes();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.ivSpec_ = codedInputStream.readBytes();
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

        public static Ukey2ClientFinished parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Ukey2ClientFinished) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Ukey2ClientFinished parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ClientFinished) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface Ukey2ClientFinishedOrBuilder extends MessageOrBuilder {
        ByteString getIvSpec();

        ByteString getPublicKey();

        boolean hasIvSpec();

        boolean hasPublicKey();
    }

    public static final class Ukey2ClientInit extends GeneratedMessageV3 implements Ukey2ClientInitOrBuilder {
        public static final int CIPHER_COMMITMENTS_FIELD_NUMBER = 3;
        public static final int NEXT_PROTOCOL_FIELD_NUMBER = 4;
        public static final int RANDOM_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<CipherCommitment> cipherCommitments_;
        private byte memoizedIsInitialized;
        private volatile Object nextProtocol_;
        private ByteString random_;
        private int version_;
        private static final Ukey2ClientInit DEFAULT_INSTANCE = new Ukey2ClientInit();

        @Deprecated
        public static final Parser<Ukey2ClientInit> PARSER = new AbstractParser<Ukey2ClientInit>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.1
            @Override // com.google.protobuf.Parser
            public Ukey2ClientInit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Ukey2ClientInit(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class CipherCommitment extends GeneratedMessageV3 implements CipherCommitmentOrBuilder {
            public static final int COMMITMENT_FIELD_NUMBER = 2;
            public static final int HANDSHAKE_CIPHER_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private ByteString commitment_;
            private int handshakeCipher_;
            private byte memoizedIsInitialized;
            private static final CipherCommitment DEFAULT_INSTANCE = new CipherCommitment();

            @Deprecated
            public static final Parser<CipherCommitment> PARSER = new AbstractParser<CipherCommitment>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitment.1
                @Override // com.google.protobuf.Parser
                public CipherCommitment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new CipherCommitment(codedInputStream, extensionRegistryLite);
                }
            };

            public static CipherCommitment getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientInit_CipherCommitment_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static CipherCommitment parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (CipherCommitment) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static CipherCommitment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Parser<CipherCommitment> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CipherCommitment)) {
                    return super.equals(obj);
                }
                CipherCommitment cipherCommitment = (CipherCommitment) obj;
                boolean z = hasHandshakeCipher() == cipherCommitment.hasHandshakeCipher();
                if (hasHandshakeCipher()) {
                    z = z && this.handshakeCipher_ == cipherCommitment.handshakeCipher_;
                }
                boolean z2 = z && hasCommitment() == cipherCommitment.hasCommitment();
                if (hasCommitment()) {
                    z2 = z2 && getCommitment().equals(cipherCommitment.getCommitment());
                }
                return z2 && this.unknownFields.equals(cipherCommitment.unknownFields);
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
            public ByteString getCommitment() {
                return this.commitment_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
            public Ukey2HandshakeCipher getHandshakeCipher() {
                Ukey2HandshakeCipher ukey2HandshakeCipherValueOf = Ukey2HandshakeCipher.valueOf(this.handshakeCipher_);
                return ukey2HandshakeCipherValueOf == null ? Ukey2HandshakeCipher.RESERVED : ukey2HandshakeCipherValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<CipherCommitment> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.handshakeCipher_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.commitment_);
                }
                int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
            public boolean hasCommitment() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
            public boolean hasHandshakeCipher() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getDescriptorForType().hashCode() + 779;
                if (hasHandshakeCipher()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + this.handshakeCipher_;
                }
                if (hasCommitment()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getCommitment().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientInit_CipherCommitment_fieldAccessorTable.ensureFieldAccessorsInitialized(CipherCommitment.class, Builder.class);
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
                    codedOutputStream.writeEnum(1, this.handshakeCipher_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeBytes(2, this.commitment_);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CipherCommitmentOrBuilder {
                private int bitField0_;
                private ByteString commitment_;
                private int handshakeCipher_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return UkeyProto.internal_static_securegcm_Ukey2ClientInit_CipherCommitment_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public Builder clearCommitment() {
                    this.bitField0_ &= -3;
                    this.commitment_ = CipherCommitment.getDefaultInstance().getCommitment();
                    onChanged();
                    return this;
                }

                public Builder clearHandshakeCipher() {
                    this.bitField0_ &= -2;
                    this.handshakeCipher_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
                public ByteString getCommitment() {
                    return this.commitment_;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return UkeyProto.internal_static_securegcm_Ukey2ClientInit_CipherCommitment_descriptor;
                }

                @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
                public Ukey2HandshakeCipher getHandshakeCipher() {
                    Ukey2HandshakeCipher ukey2HandshakeCipherValueOf = Ukey2HandshakeCipher.valueOf(this.handshakeCipher_);
                    return ukey2HandshakeCipherValueOf == null ? Ukey2HandshakeCipher.RESERVED : ukey2HandshakeCipherValueOf;
                }

                @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
                public boolean hasCommitment() {
                    return (this.bitField0_ & 2) == 2;
                }

                @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInit.CipherCommitmentOrBuilder
                public boolean hasHandshakeCipher() {
                    return (this.bitField0_ & 1) == 1;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return UkeyProto.internal_static_securegcm_Ukey2ClientInit_CipherCommitment_fieldAccessorTable.ensureFieldAccessorsInitialized(CipherCommitment.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setCommitment(ByteString byteString) {
                    byteString.getClass();
                    this.bitField0_ |= 2;
                    this.commitment_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setHandshakeCipher(Ukey2HandshakeCipher ukey2HandshakeCipher) {
                    ukey2HandshakeCipher.getClass();
                    this.bitField0_ |= 1;
                    this.handshakeCipher_ = ukey2HandshakeCipher.getNumber();
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.handshakeCipher_ = 0;
                    this.commitment_ = ByteString.EMPTY;
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public CipherCommitment build() {
                    CipherCommitment cipherCommitmentBuildPartial = buildPartial();
                    if (cipherCommitmentBuildPartial.isInitialized()) {
                        return cipherCommitmentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) cipherCommitmentBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public CipherCommitment buildPartial() {
                    CipherCommitment cipherCommitment = new CipherCommitment(this);
                    int i = this.bitField0_;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    cipherCommitment.handshakeCipher_ = this.handshakeCipher_;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cipherCommitment.commitment_ = this.commitment_;
                    cipherCommitment.bitField0_ = i2;
                    onBuilt();
                    return cipherCommitment;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public CipherCommitment getDefaultInstanceForType() {
                    return CipherCommitment.getDefaultInstance();
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
                    this.handshakeCipher_ = 0;
                    int i = this.bitField0_ & (-2);
                    this.bitField0_ = i;
                    this.commitment_ = ByteString.EMPTY;
                    this.bitField0_ = i & (-3);
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.handshakeCipher_ = 0;
                    this.commitment_ = ByteString.EMPTY;
                    maybeForceBuilderInitialization();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                public Builder clone() {
                    return (Builder) super.clone();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof CipherCommitment) {
                        return mergeFrom((CipherCommitment) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(CipherCommitment cipherCommitment) {
                    if (cipherCommitment == CipherCommitment.getDefaultInstance()) {
                        return this;
                    }
                    if (cipherCommitment.hasHandshakeCipher()) {
                        setHandshakeCipher(cipherCommitment.getHandshakeCipher());
                    }
                    if (cipherCommitment.hasCommitment()) {
                        setCommitment(cipherCommitment.getCommitment());
                    }
                    mergeUnknownFields(((GeneratedMessageV3) cipherCommitment).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0021  */
                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    CipherCommitment cipherCommitment = null;
                    try {
                        try {
                            CipherCommitment partialFrom = CipherCommitment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            CipherCommitment cipherCommitment2 = (CipherCommitment) e.getUnfinishedMessage();
                            try {
                                throw e.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                cipherCommitment = cipherCommitment2;
                                if (cipherCommitment != null) {
                                    mergeFrom(cipherCommitment);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cipherCommitment != null) {
                            mergeFrom(cipherCommitment);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(CipherCommitment cipherCommitment) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(cipherCommitment);
            }

            public static CipherCommitment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private CipherCommitment(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static CipherCommitment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CipherCommitment) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static CipherCommitment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CipherCommitment getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static CipherCommitment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private CipherCommitment() {
                this.memoizedIsInitialized = (byte) -1;
                this.handshakeCipher_ = 0;
                this.commitment_ = ByteString.EMPTY;
            }

            public static CipherCommitment parseFrom(InputStream inputStream) throws IOException {
                return (CipherCommitment) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static CipherCommitment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CipherCommitment) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            private CipherCommitment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    if (Ukey2HandshakeCipher.valueOf(i) == null) {
                                        builderNewBuilder.mergeVarintField(1, i);
                                    } else {
                                        this.bitField0_ = 1 | this.bitField0_;
                                        this.handshakeCipher_ = i;
                                    }
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.bitField0_ |= 2;
                                    this.commitment_ = codedInputStream.readBytes();
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

            public static CipherCommitment parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (CipherCommitment) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static CipherCommitment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (CipherCommitment) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface CipherCommitmentOrBuilder extends MessageOrBuilder {
            ByteString getCommitment();

            Ukey2HandshakeCipher getHandshakeCipher();

            boolean hasCommitment();

            boolean hasHandshakeCipher();
        }

        public static Ukey2ClientInit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UkeyProto.internal_static_securegcm_Ukey2ClientInit_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ukey2ClientInit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ukey2ClientInit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Ukey2ClientInit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Ukey2ClientInit> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ukey2ClientInit)) {
                return super.equals(obj);
            }
            Ukey2ClientInit ukey2ClientInit = (Ukey2ClientInit) obj;
            boolean z = hasVersion() == ukey2ClientInit.hasVersion();
            if (hasVersion()) {
                z = z && getVersion() == ukey2ClientInit.getVersion();
            }
            boolean z2 = z && hasRandom() == ukey2ClientInit.hasRandom();
            if (hasRandom()) {
                z2 = z2 && getRandom().equals(ukey2ClientInit.getRandom());
            }
            boolean z3 = (z2 && getCipherCommitmentsList().equals(ukey2ClientInit.getCipherCommitmentsList())) && hasNextProtocol() == ukey2ClientInit.hasNextProtocol();
            if (hasNextProtocol()) {
                z3 = z3 && getNextProtocol().equals(ukey2ClientInit.getNextProtocol());
            }
            return z3 && this.unknownFields.equals(ukey2ClientInit.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public CipherCommitment getCipherCommitments(int i) {
            return this.cipherCommitments_.get(i);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public int getCipherCommitmentsCount() {
            return this.cipherCommitments_.size();
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public List<CipherCommitment> getCipherCommitmentsList() {
            return this.cipherCommitments_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public CipherCommitmentOrBuilder getCipherCommitmentsOrBuilder(int i) {
            return this.cipherCommitments_.get(i);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public List<? extends CipherCommitmentOrBuilder> getCipherCommitmentsOrBuilderList() {
            return this.cipherCommitments_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public String getNextProtocol() {
            Object obj = this.nextProtocol_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.nextProtocol_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public ByteString getNextProtocolBytes() {
            Object obj = this.nextProtocol_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nextProtocol_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Ukey2ClientInit> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public ByteString getRandom() {
            return this.random_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.version_) + 0 : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(2, this.random_);
            }
            for (int i2 = 0; i2 < this.cipherCommitments_.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.cipherCommitments_.get(i2));
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.nextProtocol_);
            }
            int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public boolean hasNextProtocol() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public boolean hasRandom() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasVersion()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getVersion();
            }
            if (hasRandom()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRandom().hashCode();
            }
            if (getCipherCommitmentsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCipherCommitmentsList().hashCode();
            }
            if (hasNextProtocol()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getNextProtocol().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UkeyProto.internal_static_securegcm_Ukey2ClientInit_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2ClientInit.class, Builder.class);
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
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.random_);
            }
            for (int i = 0; i < this.cipherCommitments_.size(); i++) {
                codedOutputStream.writeMessage(3, this.cipherCommitments_.get(i));
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.nextProtocol_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Ukey2ClientInitOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> cipherCommitmentsBuilder_;
            private List<CipherCommitment> cipherCommitments_;
            private Object nextProtocol_;
            private ByteString random_;
            private int version_;

            private void ensureCipherCommitmentsIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.cipherCommitments_ = new ArrayList(this.cipherCommitments_);
                    this.bitField0_ |= 4;
                }
            }

            private RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> getCipherCommitmentsFieldBuilder() {
                if (this.cipherCommitmentsBuilder_ == null) {
                    this.cipherCommitmentsBuilder_ = new RepeatedFieldBuilderV3<>(this.cipherCommitments_, (this.bitField0_ & 4) == 4, getParentForChildren(), isClean());
                    this.cipherCommitments_ = null;
                }
                return this.cipherCommitmentsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientInit_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCipherCommitmentsFieldBuilder();
                }
            }

            public Builder addAllCipherCommitments(Iterable<? extends CipherCommitment> iterable) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCipherCommitmentsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.cipherCommitments_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addCipherCommitments(CipherCommitment cipherCommitment) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    cipherCommitment.getClass();
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.add(cipherCommitment);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(cipherCommitment);
                }
                return this;
            }

            public CipherCommitment.Builder addCipherCommitmentsBuilder() {
                return (CipherCommitment.Builder) getCipherCommitmentsFieldBuilder().addBuilder(CipherCommitment.getDefaultInstance());
            }

            public Builder clearCipherCommitments() {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.cipherCommitments_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearNextProtocol() {
                this.bitField0_ &= -9;
                this.nextProtocol_ = Ukey2ClientInit.getDefaultInstance().getNextProtocol();
                onChanged();
                return this;
            }

            public Builder clearRandom() {
                this.bitField0_ &= -3;
                this.random_ = Ukey2ClientInit.getDefaultInstance().getRandom();
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public CipherCommitment getCipherCommitments(int i) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.cipherCommitments_.get(i) : (CipherCommitment) repeatedFieldBuilderV3.getMessage(i);
            }

            public CipherCommitment.Builder getCipherCommitmentsBuilder(int i) {
                return (CipherCommitment.Builder) getCipherCommitmentsFieldBuilder().getBuilder(i);
            }

            public List<CipherCommitment.Builder> getCipherCommitmentsBuilderList() {
                return getCipherCommitmentsFieldBuilder().getBuilderList();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public int getCipherCommitmentsCount() {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.cipherCommitments_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public List<CipherCommitment> getCipherCommitmentsList() {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.cipherCommitments_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public CipherCommitmentOrBuilder getCipherCommitmentsOrBuilder(int i) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.cipherCommitments_.get(i) : (CipherCommitmentOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public List<? extends CipherCommitmentOrBuilder> getCipherCommitmentsOrBuilderList() {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.cipherCommitments_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientInit_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public String getNextProtocol() {
                Object obj = this.nextProtocol_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.nextProtocol_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public ByteString getNextProtocolBytes() {
                Object obj = this.nextProtocol_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nextProtocol_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public ByteString getRandom() {
                return this.random_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public boolean hasNextProtocol() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public boolean hasRandom() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ClientInitOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return UkeyProto.internal_static_securegcm_Ukey2ClientInit_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2ClientInit.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeCipherCommitments(int i) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Builder setCipherCommitments(int i, CipherCommitment cipherCommitment) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    cipherCommitment.getClass();
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.set(i, cipherCommitment);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, cipherCommitment);
                }
                return this;
            }

            public Builder setNextProtocol(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.nextProtocol_ = str;
                onChanged();
                return this;
            }

            public Builder setNextProtocolBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.nextProtocol_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRandom(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.random_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVersion(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                this.random_ = ByteString.EMPTY;
                this.cipherCommitments_ = Collections.emptyList();
                this.nextProtocol_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2ClientInit build() {
                Ukey2ClientInit ukey2ClientInitBuildPartial = buildPartial();
                if (ukey2ClientInitBuildPartial.isInitialized()) {
                    return ukey2ClientInitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ukey2ClientInitBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2ClientInit buildPartial() {
                Ukey2ClientInit ukey2ClientInit = new Ukey2ClientInit(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ukey2ClientInit.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ukey2ClientInit.random_ = this.random_;
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) == 4) {
                        this.cipherCommitments_ = Collections.unmodifiableList(this.cipherCommitments_);
                        this.bitField0_ &= -5;
                    }
                    ukey2ClientInit.cipherCommitments_ = this.cipherCommitments_;
                } else {
                    ukey2ClientInit.cipherCommitments_ = repeatedFieldBuilderV3.build();
                }
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                ukey2ClientInit.nextProtocol_ = this.nextProtocol_;
                ukey2ClientInit.bitField0_ = i2;
                onBuilt();
                return ukey2ClientInit;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Ukey2ClientInit getDefaultInstanceForType() {
                return Ukey2ClientInit.getDefaultInstance();
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

            public CipherCommitment.Builder addCipherCommitmentsBuilder(int i) {
                return (CipherCommitment.Builder) getCipherCommitmentsFieldBuilder().addBuilder(i, CipherCommitment.getDefaultInstance());
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
                this.version_ = 0;
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                this.random_ = ByteString.EMPTY;
                this.bitField0_ = i & (-3);
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.cipherCommitments_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.nextProtocol_ = "";
                this.bitField0_ &= -9;
                return this;
            }

            public Builder addCipherCommitments(int i, CipherCommitment cipherCommitment) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    cipherCommitment.getClass();
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.add(i, cipherCommitment);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, cipherCommitment);
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Ukey2ClientInit) {
                    return mergeFrom((Ukey2ClientInit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCipherCommitments(int i, CipherCommitment.Builder builder) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.random_ = ByteString.EMPTY;
                this.cipherCommitments_ = Collections.emptyList();
                this.nextProtocol_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Ukey2ClientInit ukey2ClientInit) {
                if (ukey2ClientInit == Ukey2ClientInit.getDefaultInstance()) {
                    return this;
                }
                if (ukey2ClientInit.hasVersion()) {
                    setVersion(ukey2ClientInit.getVersion());
                }
                if (ukey2ClientInit.hasRandom()) {
                    setRandom(ukey2ClientInit.getRandom());
                }
                if (this.cipherCommitmentsBuilder_ == null) {
                    if (!ukey2ClientInit.cipherCommitments_.isEmpty()) {
                        if (this.cipherCommitments_.isEmpty()) {
                            this.cipherCommitments_ = ukey2ClientInit.cipherCommitments_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureCipherCommitmentsIsMutable();
                            this.cipherCommitments_.addAll(ukey2ClientInit.cipherCommitments_);
                        }
                        onChanged();
                    }
                } else if (!ukey2ClientInit.cipherCommitments_.isEmpty()) {
                    if (this.cipherCommitmentsBuilder_.isEmpty()) {
                        this.cipherCommitmentsBuilder_.dispose();
                        this.cipherCommitmentsBuilder_ = null;
                        this.cipherCommitments_ = ukey2ClientInit.cipherCommitments_;
                        this.bitField0_ &= -5;
                        this.cipherCommitmentsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCipherCommitmentsFieldBuilder() : null;
                    } else {
                        this.cipherCommitmentsBuilder_.addAllMessages(ukey2ClientInit.cipherCommitments_);
                    }
                }
                if (ukey2ClientInit.hasNextProtocol()) {
                    this.bitField0_ |= 8;
                    this.nextProtocol_ = ukey2ClientInit.nextProtocol_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) ukey2ClientInit).unknownFields);
                onChanged();
                return this;
            }

            public Builder addCipherCommitments(CipherCommitment.Builder builder) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCipherCommitments(int i, CipherCommitment.Builder builder) {
                RepeatedFieldBuilderV3<CipherCommitment, CipherCommitment.Builder, CipherCommitmentOrBuilder> repeatedFieldBuilderV3 = this.cipherCommitmentsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCipherCommitmentsIsMutable();
                    this.cipherCommitments_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Ukey2ClientInit ukey2ClientInit = null;
                try {
                    try {
                        Ukey2ClientInit partialFrom = Ukey2ClientInit.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Ukey2ClientInit ukey2ClientInit2 = (Ukey2ClientInit) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ukey2ClientInit = ukey2ClientInit2;
                            if (ukey2ClientInit != null) {
                                mergeFrom(ukey2ClientInit);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ukey2ClientInit != null) {
                        mergeFrom(ukey2ClientInit);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Ukey2ClientInit ukey2ClientInit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ukey2ClientInit);
        }

        public static Ukey2ClientInit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Ukey2ClientInit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Ukey2ClientInit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ClientInit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2ClientInit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Ukey2ClientInit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Ukey2ClientInit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Ukey2ClientInit() {
            this.memoizedIsInitialized = (byte) -1;
            this.version_ = 0;
            this.random_ = ByteString.EMPTY;
            this.cipherCommitments_ = Collections.emptyList();
            this.nextProtocol_ = "";
        }

        public static Ukey2ClientInit parseFrom(InputStream inputStream) throws IOException {
            return (Ukey2ClientInit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Ukey2ClientInit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ClientInit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2ClientInit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Ukey2ClientInit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private Ukey2ClientInit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.bitField0_ |= 1;
                                    this.version_ = codedInputStream.readInt32();
                                } else if (tag == 18) {
                                    this.bitField0_ |= 2;
                                    this.random_ = codedInputStream.readBytes();
                                } else if (tag == 26) {
                                    if ((i & 4) != 4) {
                                        this.cipherCommitments_ = new ArrayList();
                                        i |= 4;
                                    }
                                    this.cipherCommitments_.add((CipherCommitment) codedInputStream.readMessage(CipherCommitment.PARSER, extensionRegistryLite));
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    this.nextProtocol_ = bytes;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.cipherCommitments_ = Collections.unmodifiableList(this.cipherCommitments_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 4) == 4) {
                this.cipherCommitments_ = Collections.unmodifiableList(this.cipherCommitments_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Ukey2ClientInit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ClientInit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface Ukey2ClientInitOrBuilder extends MessageOrBuilder {
        Ukey2ClientInit.CipherCommitment getCipherCommitments(int i);

        int getCipherCommitmentsCount();

        List<Ukey2ClientInit.CipherCommitment> getCipherCommitmentsList();

        Ukey2ClientInit.CipherCommitmentOrBuilder getCipherCommitmentsOrBuilder(int i);

        List<? extends Ukey2ClientInit.CipherCommitmentOrBuilder> getCipherCommitmentsOrBuilderList();

        String getNextProtocol();

        ByteString getNextProtocolBytes();

        ByteString getRandom();

        int getVersion();

        boolean hasNextProtocol();

        boolean hasRandom();

        boolean hasVersion();
    }

    public enum Ukey2HandshakeCipher implements ProtocolMessageEnum {
        RESERVED(0),
        P256_SHA512(100),
        CURVE25519_SHA512(200);

        public static final int CURVE25519_SHA512_VALUE = 200;
        public static final int P256_SHA512_VALUE = 100;
        public static final int RESERVED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Ukey2HandshakeCipher> internalValueMap = new Internal.EnumLiteMap<Ukey2HandshakeCipher>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2HandshakeCipher.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Ukey2HandshakeCipher findValueByNumber(int i) {
                return Ukey2HandshakeCipher.forNumber(i);
            }
        };
        private static final Ukey2HandshakeCipher[] VALUES = values();

        Ukey2HandshakeCipher(int i) {
            this.value = i;
        }

        public static Ukey2HandshakeCipher forNumber(int i) {
            if (i == 0) {
                return RESERVED;
            }
            if (i == 100) {
                return P256_SHA512;
            }
            if (i != 200) {
                return null;
            }
            return CURVE25519_SHA512;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return UkeyProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<Ukey2HandshakeCipher> internalGetValueMap() {
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
        public static Ukey2HandshakeCipher valueOf(int i) {
            return forNumber(i);
        }

        public static Ukey2HandshakeCipher valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Ukey2Message extends GeneratedMessageV3 implements Ukey2MessageOrBuilder {
        public static final int MESSAGE_DATA_FIELD_NUMBER = 2;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString messageData_;
        private int messageType_;
        private static final Ukey2Message DEFAULT_INSTANCE = new Ukey2Message();

        @Deprecated
        public static final Parser<Ukey2Message> PARSER = new AbstractParser<Ukey2Message>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2Message.1
            @Override // com.google.protobuf.Parser
            public Ukey2Message parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Ukey2Message(codedInputStream, extensionRegistryLite);
            }
        };

        public enum Type implements ProtocolMessageEnum {
            UNKNOWN_DO_NOT_USE(0),
            ALERT(1),
            CLIENT_INIT(2),
            SERVER_INIT(3),
            CLIENT_FINISH(4);

            public static final int ALERT_VALUE = 1;
            public static final int CLIENT_FINISH_VALUE = 4;
            public static final int CLIENT_INIT_VALUE = 2;
            public static final int SERVER_INIT_VALUE = 3;
            public static final int UNKNOWN_DO_NOT_USE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2Message.Type.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN_DO_NOT_USE;
                }
                if (i == 1) {
                    return ALERT;
                }
                if (i == 2) {
                    return CLIENT_INIT;
                }
                if (i == 3) {
                    return SERVER_INIT;
                }
                if (i != 4) {
                    return null;
                }
                return CLIENT_FINISH;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Ukey2Message.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
            public static Type valueOf(int i) {
                return forNumber(i);
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static Ukey2Message getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UkeyProto.internal_static_securegcm_Ukey2Message_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ukey2Message parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ukey2Message) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Ukey2Message parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Ukey2Message> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ukey2Message)) {
                return super.equals(obj);
            }
            Ukey2Message ukey2Message = (Ukey2Message) obj;
            boolean z = hasMessageType() == ukey2Message.hasMessageType();
            if (hasMessageType()) {
                z = z && this.messageType_ == ukey2Message.messageType_;
            }
            boolean z2 = z && hasMessageData() == ukey2Message.hasMessageData();
            if (hasMessageData()) {
                z2 = z2 && getMessageData().equals(ukey2Message.getMessageData());
            }
            return z2 && this.unknownFields.equals(ukey2Message.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
        public ByteString getMessageData() {
            return this.messageData_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
        public Type getMessageType() {
            Type typeValueOf = Type.valueOf(this.messageType_);
            return typeValueOf == null ? Type.UNKNOWN_DO_NOT_USE : typeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Ukey2Message> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.messageType_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.messageData_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
        public boolean hasMessageData() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
        public boolean hasMessageType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasMessageType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.messageType_;
            }
            if (hasMessageData()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getMessageData().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UkeyProto.internal_static_securegcm_Ukey2Message_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2Message.class, Builder.class);
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
                codedOutputStream.writeEnum(1, this.messageType_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.messageData_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Ukey2MessageOrBuilder {
            private int bitField0_;
            private ByteString messageData_;
            private int messageType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return UkeyProto.internal_static_securegcm_Ukey2Message_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearMessageData() {
                this.bitField0_ &= -3;
                this.messageData_ = Ukey2Message.getDefaultInstance().getMessageData();
                onChanged();
                return this;
            }

            public Builder clearMessageType() {
                this.bitField0_ &= -2;
                this.messageType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UkeyProto.internal_static_securegcm_Ukey2Message_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
            public ByteString getMessageData() {
                return this.messageData_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
            public Type getMessageType() {
                Type typeValueOf = Type.valueOf(this.messageType_);
                return typeValueOf == null ? Type.UNKNOWN_DO_NOT_USE : typeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
            public boolean hasMessageData() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2MessageOrBuilder
            public boolean hasMessageType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return UkeyProto.internal_static_securegcm_Ukey2Message_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2Message.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMessageData(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.messageData_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMessageType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.messageType_ = type.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.messageType_ = 0;
                this.messageData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2Message build() {
                Ukey2Message ukey2MessageBuildPartial = buildPartial();
                if (ukey2MessageBuildPartial.isInitialized()) {
                    return ukey2MessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ukey2MessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2Message buildPartial() {
                Ukey2Message ukey2Message = new Ukey2Message(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ukey2Message.messageType_ = this.messageType_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ukey2Message.messageData_ = this.messageData_;
                ukey2Message.bitField0_ = i2;
                onBuilt();
                return ukey2Message;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Ukey2Message getDefaultInstanceForType() {
                return Ukey2Message.getDefaultInstance();
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
                this.messageType_ = 0;
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                this.messageData_ = ByteString.EMPTY;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.messageType_ = 0;
                this.messageData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Ukey2Message) {
                    return mergeFrom((Ukey2Message) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Ukey2Message ukey2Message) {
                if (ukey2Message == Ukey2Message.getDefaultInstance()) {
                    return this;
                }
                if (ukey2Message.hasMessageType()) {
                    setMessageType(ukey2Message.getMessageType());
                }
                if (ukey2Message.hasMessageData()) {
                    setMessageData(ukey2Message.getMessageData());
                }
                mergeUnknownFields(((GeneratedMessageV3) ukey2Message).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Ukey2Message ukey2Message = null;
                try {
                    try {
                        Ukey2Message partialFrom = Ukey2Message.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Ukey2Message ukey2Message2 = (Ukey2Message) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ukey2Message = ukey2Message2;
                            if (ukey2Message != null) {
                                mergeFrom(ukey2Message);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ukey2Message != null) {
                        mergeFrom(ukey2Message);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Ukey2Message ukey2Message) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ukey2Message);
        }

        public static Ukey2Message parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Ukey2Message(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Ukey2Message parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2Message) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2Message parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Ukey2Message getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Ukey2Message parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Ukey2Message() {
            this.memoizedIsInitialized = (byte) -1;
            this.messageType_ = 0;
            this.messageData_ = ByteString.EMPTY;
        }

        public static Ukey2Message parseFrom(InputStream inputStream) throws IOException {
            return (Ukey2Message) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Ukey2Message parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2Message) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Ukey2Message(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                if (Type.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(1, i);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.messageType_ = i;
                                }
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.messageData_ = codedInputStream.readBytes();
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

        public static Ukey2Message parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Ukey2Message) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Ukey2Message parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2Message) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface Ukey2MessageOrBuilder extends MessageOrBuilder {
        ByteString getMessageData();

        Ukey2Message.Type getMessageType();

        boolean hasMessageData();

        boolean hasMessageType();
    }

    public static final class Ukey2ServerInit extends GeneratedMessageV3 implements Ukey2ServerInitOrBuilder {
        public static final int HANDSHAKE_CIPHER_FIELD_NUMBER = 3;
        public static final int PUBLIC_KEY_FIELD_NUMBER = 4;
        public static final int RANDOM_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int handshakeCipher_;
        private byte memoizedIsInitialized;
        private ByteString publicKey_;
        private ByteString random_;
        private int version_;
        private static final Ukey2ServerInit DEFAULT_INSTANCE = new Ukey2ServerInit();

        @Deprecated
        public static final Parser<Ukey2ServerInit> PARSER = new AbstractParser<Ukey2ServerInit>() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInit.1
            @Override // com.google.protobuf.Parser
            public Ukey2ServerInit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Ukey2ServerInit(codedInputStream, extensionRegistryLite);
            }
        };

        public static Ukey2ServerInit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UkeyProto.internal_static_securegcm_Ukey2ServerInit_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Ukey2ServerInit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ukey2ServerInit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Ukey2ServerInit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Ukey2ServerInit> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Ukey2ServerInit)) {
                return super.equals(obj);
            }
            Ukey2ServerInit ukey2ServerInit = (Ukey2ServerInit) obj;
            boolean z = hasVersion() == ukey2ServerInit.hasVersion();
            if (hasVersion()) {
                z = z && getVersion() == ukey2ServerInit.getVersion();
            }
            boolean z2 = z && hasRandom() == ukey2ServerInit.hasRandom();
            if (hasRandom()) {
                z2 = z2 && getRandom().equals(ukey2ServerInit.getRandom());
            }
            boolean z3 = z2 && hasHandshakeCipher() == ukey2ServerInit.hasHandshakeCipher();
            if (hasHandshakeCipher()) {
                z3 = z3 && this.handshakeCipher_ == ukey2ServerInit.handshakeCipher_;
            }
            boolean z4 = z3 && hasPublicKey() == ukey2ServerInit.hasPublicKey();
            if (hasPublicKey()) {
                z4 = z4 && getPublicKey().equals(ukey2ServerInit.getPublicKey());
            }
            return z4 && this.unknownFields.equals(ukey2ServerInit.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public Ukey2HandshakeCipher getHandshakeCipher() {
            Ukey2HandshakeCipher ukey2HandshakeCipherValueOf = Ukey2HandshakeCipher.valueOf(this.handshakeCipher_);
            return ukey2HandshakeCipherValueOf == null ? Ukey2HandshakeCipher.RESERVED : ukey2HandshakeCipherValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Ukey2ServerInit> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public ByteString getPublicKey() {
            return this.publicKey_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public ByteString getRandom() {
            return this.random_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(2, this.random_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.handshakeCipher_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(4, this.publicKey_);
            }
            int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public boolean hasHandshakeCipher() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public boolean hasPublicKey() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public boolean hasRandom() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasVersion()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getVersion();
            }
            if (hasRandom()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getRandom().hashCode();
            }
            if (hasHandshakeCipher()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.handshakeCipher_;
            }
            if (hasPublicKey()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPublicKey().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UkeyProto.internal_static_securegcm_Ukey2ServerInit_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2ServerInit.class, Builder.class);
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
                codedOutputStream.writeInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.random_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeEnum(3, this.handshakeCipher_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBytes(4, this.publicKey_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Ukey2ServerInitOrBuilder {
            private int bitField0_;
            private int handshakeCipher_;
            private ByteString publicKey_;
            private ByteString random_;
            private int version_;

            public static final Descriptors.Descriptor getDescriptor() {
                return UkeyProto.internal_static_securegcm_Ukey2ServerInit_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearHandshakeCipher() {
                this.bitField0_ &= -5;
                this.handshakeCipher_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPublicKey() {
                this.bitField0_ &= -9;
                this.publicKey_ = Ukey2ServerInit.getDefaultInstance().getPublicKey();
                onChanged();
                return this;
            }

            public Builder clearRandom() {
                this.bitField0_ &= -3;
                this.random_ = Ukey2ServerInit.getDefaultInstance().getRandom();
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UkeyProto.internal_static_securegcm_Ukey2ServerInit_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public Ukey2HandshakeCipher getHandshakeCipher() {
                Ukey2HandshakeCipher ukey2HandshakeCipherValueOf = Ukey2HandshakeCipher.valueOf(this.handshakeCipher_);
                return ukey2HandshakeCipherValueOf == null ? Ukey2HandshakeCipher.RESERVED : ukey2HandshakeCipherValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public ByteString getPublicKey() {
                return this.publicKey_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public ByteString getRandom() {
                return this.random_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public boolean hasHandshakeCipher() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public boolean hasPublicKey() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public boolean hasRandom() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.UkeyProto.Ukey2ServerInitOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return UkeyProto.internal_static_securegcm_Ukey2ServerInit_fieldAccessorTable.ensureFieldAccessorsInitialized(Ukey2ServerInit.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHandshakeCipher(Ukey2HandshakeCipher ukey2HandshakeCipher) {
                ukey2HandshakeCipher.getClass();
                this.bitField0_ |= 4;
                this.handshakeCipher_ = ukey2HandshakeCipher.getNumber();
                onChanged();
                return this;
            }

            public Builder setPublicKey(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.publicKey_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRandom(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.random_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVersion(int i) {
                this.bitField0_ |= 1;
                this.version_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.random_ = byteString;
                this.handshakeCipher_ = 0;
                this.publicKey_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2ServerInit build() {
                Ukey2ServerInit ukey2ServerInitBuildPartial = buildPartial();
                if (ukey2ServerInitBuildPartial.isInitialized()) {
                    return ukey2ServerInitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ukey2ServerInitBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Ukey2ServerInit buildPartial() {
                Ukey2ServerInit ukey2ServerInit = new Ukey2ServerInit(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ukey2ServerInit.version_ = this.version_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ukey2ServerInit.random_ = this.random_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                ukey2ServerInit.handshakeCipher_ = this.handshakeCipher_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                ukey2ServerInit.publicKey_ = this.publicKey_;
                ukey2ServerInit.bitField0_ = i2;
                onBuilt();
                return ukey2ServerInit;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Ukey2ServerInit getDefaultInstanceForType() {
                return Ukey2ServerInit.getDefaultInstance();
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
                this.version_ = 0;
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                ByteString byteString = ByteString.EMPTY;
                this.random_ = byteString;
                this.handshakeCipher_ = 0;
                this.publicKey_ = byteString;
                this.bitField0_ = i & (-3) & (-5) & (-9);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Ukey2ServerInit) {
                    return mergeFrom((Ukey2ServerInit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.random_ = byteString;
                this.handshakeCipher_ = 0;
                this.publicKey_ = byteString;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Ukey2ServerInit ukey2ServerInit) {
                if (ukey2ServerInit == Ukey2ServerInit.getDefaultInstance()) {
                    return this;
                }
                if (ukey2ServerInit.hasVersion()) {
                    setVersion(ukey2ServerInit.getVersion());
                }
                if (ukey2ServerInit.hasRandom()) {
                    setRandom(ukey2ServerInit.getRandom());
                }
                if (ukey2ServerInit.hasHandshakeCipher()) {
                    setHandshakeCipher(ukey2ServerInit.getHandshakeCipher());
                }
                if (ukey2ServerInit.hasPublicKey()) {
                    setPublicKey(ukey2ServerInit.getPublicKey());
                }
                mergeUnknownFields(((GeneratedMessageV3) ukey2ServerInit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Ukey2ServerInit ukey2ServerInit = null;
                try {
                    try {
                        Ukey2ServerInit partialFrom = Ukey2ServerInit.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Ukey2ServerInit ukey2ServerInit2 = (Ukey2ServerInit) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ukey2ServerInit = ukey2ServerInit2;
                            if (ukey2ServerInit != null) {
                                mergeFrom(ukey2ServerInit);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ukey2ServerInit != null) {
                        mergeFrom(ukey2ServerInit);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Ukey2ServerInit ukey2ServerInit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ukey2ServerInit);
        }

        public static Ukey2ServerInit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Ukey2ServerInit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Ukey2ServerInit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ServerInit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2ServerInit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Ukey2ServerInit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Ukey2ServerInit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Ukey2ServerInit() {
            this.memoizedIsInitialized = (byte) -1;
            this.version_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.random_ = byteString;
            this.handshakeCipher_ = 0;
            this.publicKey_ = byteString;
        }

        public static Ukey2ServerInit parseFrom(InputStream inputStream) throws IOException {
            return (Ukey2ServerInit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Ukey2ServerInit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ServerInit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Ukey2ServerInit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Ukey2ServerInit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private Ukey2ServerInit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.version_ = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.random_ = codedInputStream.readBytes();
                            } else if (tag == 24) {
                                int i = codedInputStream.readEnum();
                                if (Ukey2HandshakeCipher.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(3, i);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.handshakeCipher_ = i;
                                }
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 8;
                                this.publicKey_ = codedInputStream.readBytes();
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

        public static Ukey2ServerInit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ukey2ServerInit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface Ukey2ServerInitOrBuilder extends MessageOrBuilder {
        Ukey2HandshakeCipher getHandshakeCipher();

        ByteString getPublicKey();

        ByteString getRandom();

        int getVersion();

        boolean hasHandshakeCipher();

        boolean hasPublicKey();

        boolean hasRandom();

        boolean hasVersion();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\nukey.proto\u0012\tsecuregcm\"¸\u0001\n\fUkey2Message\u00122\n\fmessage_type\u0018\u0001 \u0001(\u000e2\u001c.securegcm.Ukey2Message.Type\u0012\u0014\n\fmessage_data\u0018\u0002 \u0001(\f\"^\n\u0004Type\u0012\u0016\n\u0012UNKNOWN_DO_NOT_USE\u0010\u0000\u0012\t\n\u0005ALERT\u0010\u0001\u0012\u000f\n\u000bCLIENT_INIT\u0010\u0002\u0012\u000f\n\u000bSERVER_INIT\u0010\u0003\u0012\u0011\n\rCLIENT_FINISH\u0010\u0004\"¯\u0002\n\nUkey2Alert\u0012-\n\u0004type\u0018\u0001 \u0001(\u000e2\u001f.securegcm.Ukey2Alert.AlertType\u0012\u0015\n\rerror_message\u0018\u0002 \u0001(\t\"Ú\u0001\n\tAlertType\u0012\u000f\n\u000bBAD_MESSAGE\u0010\u0001\u0012\u0014\n\u0010BAD_MESSAGE_TYPE\u0010\u0002\u0012\u0015\n\u0011INCORRECT_MESSAGE\u0010\u0003\u0012\u0014\n\u0010BAD_MESSAGE_DATA\u0010\u0004\u0012\u000f\n\u000bBAD", "_VERSION\u0010d\u0012\u000e\n\nBAD_RANDOM\u0010e\u0012\u0018\n\u0014BAD_HANDSHAKE_CIPHER\u0010f\u0012\u0015\n\u0011BAD_NEXT_PROTOCOL\u0010g\u0012\u0012\n\u000eBAD_PUBLIC_KEY\u0010h\u0012\u0013\n\u000eINTERNAL_ERROR\u0010È\u0001\"õ\u0001\n\u000fUkey2ClientInit\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006random\u0018\u0002 \u0001(\f\u0012G\n\u0012cipher_commitments\u0018\u0003 \u0003(\u000b2+.securegcm.Ukey2ClientInit.CipherCommitment\u0012\u0015\n\rnext_protocol\u0018\u0004 \u0001(\t\u001aa\n\u0010CipherCommitment\u00129\n\u0010handshake_cipher\u0018\u0001 \u0001(\u000e2\u001f.securegcm.Ukey2HandshakeCipher\u0012\u0012\n\ncommitment\u0018\u0002 \u0001(\f\"\u0081\u0001\n\u000fUkey2ServerInit\u0012\u000f\n\u0007version\u0018\u0001 \u0001(", "\u0005\u0012\u000e\n\u0006random\u0018\u0002 \u0001(\f\u00129\n\u0010handshake_cipher\u0018\u0003 \u0001(\u000e2\u001f.securegcm.Ukey2HandshakeCipher\u0012\u0012\n\npublic_key\u0018\u0004 \u0001(\f\"9\n\u0013Ukey2ClientFinished\u0012\u0012\n\npublic_key\u0018\u0001 \u0001(\f\u0012\u000e\n\u0006ivSpec\u0018\u0002 \u0001(\f*M\n\u0014Ukey2HandshakeCipher\u0012\f\n\bRESERVED\u0010\u0000\u0012\u000f\n\u000bP256_SHA512\u0010d\u0012\u0016\n\u0011CURVE25519_SHA512\u0010È\u0001B8\n+com.google.security.cryptauth.lib.securegcmB\tUkeyProto"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.google.security.cryptauth.lib.securegcm.UkeyProto.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = UkeyProto.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_securegcm_Ukey2Message_descriptor = descriptor2;
        internal_static_securegcm_Ukey2Message_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"MessageType", "MessageData"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_securegcm_Ukey2Alert_descriptor = descriptor3;
        internal_static_securegcm_Ukey2Alert_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "ErrorMessage"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_securegcm_Ukey2ClientInit_descriptor = descriptor4;
        internal_static_securegcm_Ukey2ClientInit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Version", "Random", "CipherCommitments", "NextProtocol"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_securegcm_Ukey2ClientInit_CipherCommitment_descriptor = descriptor5;
        internal_static_securegcm_Ukey2ClientInit_CipherCommitment_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"HandshakeCipher", "Commitment"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(3);
        internal_static_securegcm_Ukey2ServerInit_descriptor = descriptor6;
        internal_static_securegcm_Ukey2ServerInit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Version", "Random", "HandshakeCipher", "PublicKey"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_securegcm_Ukey2ClientFinished_descriptor = descriptor7;
        internal_static_securegcm_Ukey2ClientFinished_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"PublicKey", "IvSpec"});
    }

    private UkeyProto() {
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
