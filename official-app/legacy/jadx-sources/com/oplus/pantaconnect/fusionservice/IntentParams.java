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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class IntentParams extends GeneratedMessageV3 implements IntentParamsOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CATEGORIES_FIELD_NUMBER = 5;
    public static final int COMPONENT_FIELD_NUMBER = 4;
    public static final int DATA_URI_FIELD_NUMBER = 2;
    public static final int EXTRAS_BUNDLE_BYTES_FIELD_NUMBER = 7;
    public static final int FLAGS_FIELD_NUMBER = 6;
    public static final int MIME_TYPE_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 8;
    private static final long serialVersionUID = 0;
    private volatile Object action_;
    private int bitField0_;
    private LazyStringArrayList categories_;
    private ComponentName component_;
    private volatile Object dataUri_;
    private ByteString extrasBundleBytes_;
    private int flags_;
    private byte memoizedIsInitialized;
    private volatile Object mimeType_;
    private volatile Object packageName_;
    private static final IntentParams DEFAULT_INSTANCE = new IntentParams();
    private static final Parser<IntentParams> PARSER = new AbstractParser<IntentParams>() { // from class: com.oplus.pantaconnect.fusionservice.IntentParams.1
        @Override // com.google.protobuf.Parser
        public IntentParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = IntentParams.newBuilder();
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

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IntentParamsOrBuilder {
        private Object action_;
        private int bitField0_;
        private LazyStringArrayList categories_;
        private SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> componentBuilder_;
        private ComponentName component_;
        private Object dataUri_;
        private ByteString extrasBundleBytes_;
        private int flags_;
        private Object mimeType_;
        private Object packageName_;

        private void buildPartial0(IntentParams intentParams) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                intentParams.action_ = this.action_;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                intentParams.dataUri_ = this.dataUri_;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                intentParams.mimeType_ = this.mimeType_;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
                intentParams.component_ = singleFieldBuilderV3 == null ? this.component_ : (ComponentName) singleFieldBuilderV3.build();
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                this.categories_.makeImmutable();
                intentParams.categories_ = this.categories_;
            }
            if ((i2 & 32) != 0) {
                intentParams.flags_ = this.flags_;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                intentParams.extrasBundleBytes_ = this.extrasBundleBytes_;
                i |= 32;
            }
            if ((i2 & 128) != 0) {
                intentParams.packageName_ = this.packageName_;
                i |= 64;
            }
            IntentParams.access$1976(intentParams, i);
        }

        private void ensureCategoriesIsMutable() {
            if (!this.categories_.isModifiable()) {
                this.categories_ = new LazyStringArrayList((LazyStringList) this.categories_);
            }
            this.bitField0_ |= 16;
        }

        private SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> getComponentFieldBuilder() {
            if (this.componentBuilder_ == null) {
                this.componentBuilder_ = new SingleFieldBuilderV3<>(getComponent(), getParentForChildren(), isClean());
                this.component_ = null;
            }
            return this.componentBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getComponentFieldBuilder();
            }
        }

        public Builder addAllCategories(Iterable<String> iterable) {
            ensureCategoriesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.categories_);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addCategories(String str) {
            str.getClass();
            ensureCategoriesIsMutable();
            this.categories_.add(str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder addCategoriesBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureCategoriesIsMutable();
            this.categories_.add(byteString);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder clearAction() {
            this.action_ = IntentParams.getDefaultInstance().getAction();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearCategories() {
            this.categories_ = LazyStringArrayList.emptyList();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder clearComponent() {
            this.bitField0_ &= -9;
            this.component_ = null;
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.componentBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Builder clearDataUri() {
            this.dataUri_ = IntentParams.getDefaultInstance().getDataUri();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearExtrasBundleBytes() {
            this.bitField0_ &= -65;
            this.extrasBundleBytes_ = IntentParams.getDefaultInstance().getExtrasBundleBytes();
            onChanged();
            return this;
        }

        public Builder clearFlags() {
            this.bitField0_ &= -33;
            this.flags_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMimeType() {
            this.mimeType_ = IntentParams.getDefaultInstance().getMimeType();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearPackageName() {
            this.packageName_ = IntentParams.getDefaultInstance().getPackageName();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public String getAction() {
            Object obj = this.action_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.action_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ByteString getActionBytes() {
            Object obj = this.action_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.action_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public String getCategories(int i) {
            return this.categories_.get(i);
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ByteString getCategoriesBytes(int i) {
            return this.categories_.getByteString(i);
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public int getCategoriesCount() {
            return this.categories_.size();
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ComponentName getComponent() {
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ComponentName) singleFieldBuilderV3.getMessage();
            }
            ComponentName componentName = this.component_;
            return componentName == null ? ComponentName.getDefaultInstance() : componentName;
        }

        public ComponentName.Builder getComponentBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (ComponentName.Builder) getComponentFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ComponentNameOrBuilder getComponentOrBuilder() {
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ComponentNameOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            ComponentName componentName = this.component_;
            return componentName == null ? ComponentName.getDefaultInstance() : componentName;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public String getDataUri() {
            Object obj = this.dataUri_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dataUri_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ByteString getDataUriBytes() {
            Object obj = this.dataUri_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dataUri_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_descriptor;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ByteString getExtrasBundleBytes() {
            return this.extrasBundleBytes_;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public int getFlags() {
            return this.flags_;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public String getMimeType() {
            Object obj = this.mimeType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mimeType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ByteString getMimeTypeBytes() {
            Object obj = this.mimeType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mimeType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public String getPackageName() {
            Object obj = this.packageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.packageName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ByteString getPackageNameBytes() {
            Object obj = this.packageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasAction() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasComponent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasDataUri() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasExtrasBundleBytes() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasFlags() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasMimeType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public boolean hasPackageName() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_fieldAccessorTable.ensureFieldAccessorsInitialized(IntentParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeComponent(ComponentName componentName) {
            ComponentName componentName2;
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(componentName);
            } else if ((this.bitField0_ & 8) == 0 || (componentName2 = this.component_) == null || componentName2 == ComponentName.getDefaultInstance()) {
                this.component_ = componentName;
            } else {
                getComponentBuilder().mergeFrom(componentName);
            }
            if (this.component_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder setAction(String str) {
            str.getClass();
            this.action_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setActionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.action_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setCategories(int i, String str) {
            str.getClass();
            ensureCategoriesIsMutable();
            this.categories_.set(i, str);
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setComponent(ComponentName componentName) {
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 == null) {
                componentName.getClass();
                this.component_ = componentName;
            } else {
                singleFieldBuilderV3.setMessage(componentName);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setDataUri(String str) {
            str.getClass();
            this.dataUri_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setDataUriBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.dataUri_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setExtrasBundleBytes(ByteString byteString) {
            byteString.getClass();
            this.extrasBundleBytes_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setFlags(int i) {
            this.flags_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setMimeType(String str) {
            str.getClass();
            this.mimeType_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setMimeTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mimeType_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setPackageName(String str) {
            str.getClass();
            this.packageName_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.packageName_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
        public ProtocolStringList getCategoriesList() {
            this.categories_.makeImmutable();
            return this.categories_;
        }

        private Builder() {
            this.action_ = "";
            this.dataUri_ = "";
            this.mimeType_ = "";
            this.categories_ = LazyStringArrayList.emptyList();
            this.extrasBundleBytes_ = ByteString.EMPTY;
            this.packageName_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public IntentParams build() {
            IntentParams intentParamsBuildPartial = buildPartial();
            if (intentParamsBuildPartial.isInitialized()) {
                return intentParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) intentParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public IntentParams buildPartial() {
            IntentParams intentParams = new IntentParams(this);
            if (this.bitField0_ != 0) {
                buildPartial0(intentParams);
            }
            onBuilt();
            return intentParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IntentParams getDefaultInstanceForType() {
            return IntentParams.getDefaultInstance();
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
            this.action_ = "";
            this.dataUri_ = "";
            this.mimeType_ = "";
            this.component_ = null;
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.componentBuilder_ = null;
            }
            this.categories_ = LazyStringArrayList.emptyList();
            this.flags_ = 0;
            this.extrasBundleBytes_ = ByteString.EMPTY;
            this.packageName_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof IntentParams) {
                return mergeFrom((IntentParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setComponent(ComponentName.Builder builder) {
            SingleFieldBuilderV3<ComponentName, ComponentName.Builder, ComponentNameOrBuilder> singleFieldBuilderV3 = this.componentBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.component_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder mergeFrom(IntentParams intentParams) {
            if (intentParams == IntentParams.getDefaultInstance()) {
                return this;
            }
            if (intentParams.hasAction()) {
                this.action_ = intentParams.action_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (intentParams.hasDataUri()) {
                this.dataUri_ = intentParams.dataUri_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (intentParams.hasMimeType()) {
                this.mimeType_ = intentParams.mimeType_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (intentParams.hasComponent()) {
                mergeComponent(intentParams.getComponent());
            }
            if (!intentParams.categories_.isEmpty()) {
                if (this.categories_.isEmpty()) {
                    this.categories_ = intentParams.categories_;
                    this.bitField0_ |= 16;
                } else {
                    ensureCategoriesIsMutable();
                    this.categories_.addAll(intentParams.categories_);
                }
                onChanged();
            }
            if (intentParams.hasFlags()) {
                setFlags(intentParams.getFlags());
            }
            if (intentParams.hasExtrasBundleBytes()) {
                setExtrasBundleBytes(intentParams.getExtrasBundleBytes());
            }
            if (intentParams.hasPackageName()) {
                this.packageName_ = intentParams.packageName_;
                this.bitField0_ |= 128;
                onChanged();
            }
            mergeUnknownFields(intentParams.getUnknownFields());
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.action_ = "";
            this.dataUri_ = "";
            this.mimeType_ = "";
            this.categories_ = LazyStringArrayList.emptyList();
            this.extrasBundleBytes_ = ByteString.EMPTY;
            this.packageName_ = "";
            maybeForceBuilderInitialization();
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
                                this.action_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.dataUri_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.mimeType_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getComponentFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                String stringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                ensureCategoriesIsMutable();
                                this.categories_.add(stringRequireUtf8);
                            } else if (tag == 48) {
                                this.flags_ = codedInputStream.readInt32();
                                this.bitField0_ |= 32;
                            } else if (tag == 58) {
                                this.extrasBundleBytes_ = codedInputStream.readBytes();
                                this.bitField0_ |= 64;
                            } else if (tag != 66) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.packageName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 128;
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

    public static final class ComponentName extends GeneratedMessageV3 implements ComponentNameOrBuilder {
        public static final int CLASS_NAME_FIELD_NUMBER = 2;
        public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object className_;
        private byte memoizedIsInitialized;
        private volatile Object packageName_;
        private static final ComponentName DEFAULT_INSTANCE = new ComponentName();
        private static final Parser<ComponentName> PARSER = new AbstractParser<ComponentName>() { // from class: com.oplus.pantaconnect.fusionservice.IntentParams.ComponentName.1
            @Override // com.google.protobuf.Parser
            public ComponentName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ComponentName.newBuilder();
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

        public static ComponentName getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ComponentName parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ComponentName) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ComponentName parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ComponentName> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ComponentName)) {
                return super.equals(obj);
            }
            ComponentName componentName = (ComponentName) obj;
            return getPackageName().equals(componentName.getPackageName()) && getClassName().equals(componentName.getClassName()) && getUnknownFields().equals(componentName.getUnknownFields());
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
        public String getClassName() {
            Object obj = this.className_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.className_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
        public ByteString getClassNameBytes() {
            Object obj = this.className_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.className_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
        public String getPackageName() {
            Object obj = this.packageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.packageName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
        public ByteString getPackageNameBytes() {
            Object obj = this.packageName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ComponentName> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.packageName_) ? GeneratedMessageV3.computeStringSize(1, this.packageName_) : 0;
            if (!GeneratedMessageV3.isStringEmpty(this.className_)) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.className_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getClassName().hashCode() + ((((getPackageName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_fieldAccessorTable.ensureFieldAccessorsInitialized(ComponentName.class, Builder.class);
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
            return new ComponentName();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!GeneratedMessageV3.isStringEmpty(this.packageName_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.packageName_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.className_)) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.className_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ComponentNameOrBuilder {
            private int bitField0_;
            private Object className_;
            private Object packageName_;

            private void buildPartial0(ComponentName componentName) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    componentName.packageName_ = this.packageName_;
                }
                if ((i & 2) != 0) {
                    componentName.className_ = this.className_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_descriptor;
            }

            public Builder clearClassName() {
                this.className_ = ComponentName.getDefaultInstance().getClassName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearPackageName() {
                this.packageName_ = ComponentName.getDefaultInstance().getPackageName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
            public String getClassName() {
                Object obj = this.className_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.className_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
            public ByteString getClassNameBytes() {
                Object obj = this.className_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.className_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_descriptor;
            }

            @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
            public String getPackageName() {
                Object obj = this.packageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.packageName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameOrBuilder
            public ByteString getPackageNameBytes() {
                Object obj = this.packageName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.packageName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_fieldAccessorTable.ensureFieldAccessorsInitialized(ComponentName.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setClassName(String str) {
                str.getClass();
                this.className_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClassNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.className_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPackageName(String str) {
                str.getClass();
                this.packageName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPackageNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.packageName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.packageName_ = "";
                this.className_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ComponentName build() {
                ComponentName componentNameBuildPartial = buildPartial();
                if (componentNameBuildPartial.isInitialized()) {
                    return componentNameBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) componentNameBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ComponentName buildPartial() {
                ComponentName componentName = new ComponentName(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(componentName);
                }
                onBuilt();
                return componentName;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ComponentName getDefaultInstanceForType() {
                return ComponentName.getDefaultInstance();
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
                this.packageName_ = "";
                this.className_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.packageName_ = "";
                this.className_ = "";
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4465clone() {
                return (Builder) super.mo4465clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ComponentName) {
                    return mergeFrom((ComponentName) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ComponentName componentName) {
                if (componentName == ComponentName.getDefaultInstance()) {
                    return this;
                }
                if (!componentName.getPackageName().isEmpty()) {
                    this.packageName_ = componentName.packageName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!componentName.getClassName().isEmpty()) {
                    this.className_ = componentName.className_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(componentName.getUnknownFields());
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
                                    this.packageName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.className_ = codedInputStream.readStringRequireUtf8();
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

        private ComponentName(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.packageName_ = "";
            this.className_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(ComponentName componentName) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(componentName);
        }

        public static ComponentName parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ComponentName parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ComponentName) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ComponentName parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ComponentName getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ComponentName parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ComponentName parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private ComponentName() {
            this.packageName_ = "";
            this.className_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.packageName_ = "";
            this.className_ = "";
        }

        public static ComponentName parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ComponentName parseFrom(InputStream inputStream) throws IOException {
            return (ComponentName) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ComponentName parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ComponentName) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ComponentName parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ComponentName) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ComponentName parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ComponentName) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ComponentNameOrBuilder extends MessageOrBuilder {
        String getClassName();

        ByteString getClassNameBytes();

        String getPackageName();

        ByteString getPackageNameBytes();
    }

    public static /* synthetic */ int access$1976(IntentParams intentParams, int i) {
        int i2 = i | intentParams.bitField0_;
        intentParams.bitField0_ = i2;
        return i2;
    }

    public static IntentParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static IntentParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IntentParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static IntentParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<IntentParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntentParams)) {
            return super.equals(obj);
        }
        IntentParams intentParams = (IntentParams) obj;
        if (hasAction() != intentParams.hasAction()) {
            return false;
        }
        if ((hasAction() && !getAction().equals(intentParams.getAction())) || hasDataUri() != intentParams.hasDataUri()) {
            return false;
        }
        if ((hasDataUri() && !getDataUri().equals(intentParams.getDataUri())) || hasMimeType() != intentParams.hasMimeType()) {
            return false;
        }
        if ((hasMimeType() && !getMimeType().equals(intentParams.getMimeType())) || hasComponent() != intentParams.hasComponent()) {
            return false;
        }
        if ((hasComponent() && !getComponent().equals(intentParams.getComponent())) || !getCategoriesList().equals(intentParams.getCategoriesList()) || hasFlags() != intentParams.hasFlags()) {
            return false;
        }
        if ((hasFlags() && getFlags() != intentParams.getFlags()) || hasExtrasBundleBytes() != intentParams.hasExtrasBundleBytes()) {
            return false;
        }
        if ((!hasExtrasBundleBytes() || getExtrasBundleBytes().equals(intentParams.getExtrasBundleBytes())) && hasPackageName() == intentParams.hasPackageName()) {
            return (!hasPackageName() || getPackageName().equals(intentParams.getPackageName())) && getUnknownFields().equals(intentParams.getUnknownFields());
        }
        return false;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public String getAction() {
        Object obj = this.action_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.action_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ByteString getActionBytes() {
        Object obj = this.action_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.action_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public String getCategories(int i) {
        return this.categories_.get(i);
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ByteString getCategoriesBytes(int i) {
        return this.categories_.getByteString(i);
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public int getCategoriesCount() {
        return this.categories_.size();
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ComponentName getComponent() {
        ComponentName componentName = this.component_;
        return componentName == null ? ComponentName.getDefaultInstance() : componentName;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ComponentNameOrBuilder getComponentOrBuilder() {
        ComponentName componentName = this.component_;
        return componentName == null ? ComponentName.getDefaultInstance() : componentName;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public String getDataUri() {
        Object obj = this.dataUri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.dataUri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ByteString getDataUriBytes() {
        Object obj = this.dataUri_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.dataUri_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ByteString getExtrasBundleBytes() {
        return this.extrasBundleBytes_;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public int getFlags() {
        return this.flags_;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public String getMimeType() {
        Object obj = this.mimeType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.mimeType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ByteString getMimeTypeBytes() {
        Object obj = this.mimeType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.mimeType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public String getPackageName() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.packageName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ByteString getPackageNameBytes() {
        Object obj = this.packageName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.packageName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<IntentParams> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.action_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.dataUri_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.mimeType_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, getComponent());
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.categories_.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.categories_.getRaw(i2));
        }
        int size = getCategoriesList().size() + iComputeStringSize + iComputeStringSizeNoTag;
        if ((this.bitField0_ & 16) != 0) {
            size += CodedOutputStream.computeInt32Size(6, this.flags_);
        }
        if ((this.bitField0_ & 32) != 0) {
            size += CodedOutputStream.computeBytesSize(7, this.extrasBundleBytes_);
        }
        if ((this.bitField0_ & 64) != 0) {
            size += GeneratedMessageV3.computeStringSize(8, this.packageName_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasAction() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasComponent() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasDataUri() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasExtrasBundleBytes() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasFlags() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasMimeType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public boolean hasPackageName() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasAction()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 1, 53) + getAction().hashCode();
        }
        if (hasDataUri()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 2, 53) + getDataUri().hashCode();
        }
        if (hasMimeType()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 3, 53) + getMimeType().hashCode();
        }
        if (hasComponent()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 4, 53) + getComponent().hashCode();
        }
        if (getCategoriesCount() > 0) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 5, 53) + getCategoriesList().hashCode();
        }
        if (hasFlags()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 6, 53) + getFlags();
        }
        if (hasExtrasBundleBytes()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 7, 53) + getExtrasBundleBytes().hashCode();
        }
        if (hasPackageName()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 8, 53) + getPackageName().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_fieldAccessorTable.ensureFieldAccessorsInitialized(IntentParams.class, Builder.class);
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
        return new IntentParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.action_);
        }
        if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.dataUri_);
        }
        if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.mimeType_);
        }
        if ((this.bitField0_ & 8) != 0) {
            codedOutputStream.writeMessage(4, getComponent());
        }
        for (int i = 0; i < this.categories_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.categories_.getRaw(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            codedOutputStream.writeInt32(6, this.flags_);
        }
        if ((this.bitField0_ & 32) != 0) {
            codedOutputStream.writeBytes(7, this.extrasBundleBytes_);
        }
        if ((this.bitField0_ & 64) != 0) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.packageName_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private IntentParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.action_ = "";
        this.dataUri_ = "";
        this.mimeType_ = "";
        this.categories_ = LazyStringArrayList.emptyList();
        this.flags_ = 0;
        this.extrasBundleBytes_ = ByteString.EMPTY;
        this.packageName_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(IntentParams intentParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(intentParams);
    }

    public static IntentParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    @Override // com.oplus.pantaconnect.fusionservice.IntentParamsOrBuilder
    public ProtocolStringList getCategoriesList() {
        return this.categories_;
    }

    public static IntentParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntentParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static IntentParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public IntentParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static IntentParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static IntentParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static IntentParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static IntentParams parseFrom(InputStream inputStream) throws IOException {
        return (IntentParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static IntentParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntentParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private IntentParams() {
        this.action_ = "";
        this.dataUri_ = "";
        this.mimeType_ = "";
        this.categories_ = LazyStringArrayList.emptyList();
        this.flags_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.extrasBundleBytes_ = byteString;
        this.packageName_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.action_ = "";
        this.dataUri_ = "";
        this.mimeType_ = "";
        this.categories_ = LazyStringArrayList.emptyList();
        this.extrasBundleBytes_ = byteString;
        this.packageName_ = "";
    }

    public static IntentParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IntentParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static IntentParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IntentParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
