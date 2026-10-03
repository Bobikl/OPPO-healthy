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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class FusionWakeupParams extends GeneratedMessageV3 implements FusionWakeupParamsOrBuilder {
    public static final int ACTIVITY_CONFIG_FIELD_NUMBER = 1;
    public static final int BROADCAST_CONFIG_FIELD_NUMBER = 2;
    public static final int CP_CONFIG_FIELD_NUMBER = 4;
    private static final FusionWakeupParams DEFAULT_INSTANCE = new FusionWakeupParams();
    private static final Parser<FusionWakeupParams> PARSER = new AbstractParser<FusionWakeupParams>() { // from class: com.oplus.pantaconnect.fusionservice.FusionWakeupParams.1
        @Override // com.google.protobuf.Parser
        public FusionWakeupParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = FusionWakeupParams.newBuilder();
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
    public static final int PULLUPSTRATEGY_FIELD_NUMBER = 6;
    public static final int SERVICE_CONFIG_FIELD_NUMBER = 3;
    public static final int TRACE_ID_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int componentConfigCase_;
    private Object componentConfig_;
    private byte memoizedIsInitialized;
    private int pullUpStrategy_;
    private volatile Object traceId_;

    /* JADX INFO: renamed from: com.oplus.pantaconnect.fusionservice.FusionWakeupParams$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase;

        static {
            int[] iArr = new int[ComponentConfigCase.values().length];
            $SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase = iArr;
            try {
                iArr[ComponentConfigCase.ACTIVITY_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase[ComponentConfigCase.BROADCAST_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase[ComponentConfigCase.SERVICE_CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase[ComponentConfigCase.CP_CONFIG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase[ComponentConfigCase.COMPONENTCONFIG_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum ComponentConfigCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        ACTIVITY_CONFIG(1),
        BROADCAST_CONFIG(2),
        SERVICE_CONFIG(3),
        CP_CONFIG(4),
        COMPONENTCONFIG_NOT_SET(0);

        private final int value;

        ComponentConfigCase(int i) {
            this.value = i;
        }

        public static ComponentConfigCase forNumber(int i) {
            if (i == 0) {
                return COMPONENTCONFIG_NOT_SET;
            }
            if (i == 1) {
                return ACTIVITY_CONFIG;
            }
            if (i == 2) {
                return BROADCAST_CONFIG;
            }
            if (i == 3) {
                return SERVICE_CONFIG;
            }
            if (i != 4) {
                return null;
            }
            return CP_CONFIG;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ComponentConfigCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static FusionWakeupParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static FusionWakeupParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FusionWakeupParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FusionWakeupParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<FusionWakeupParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FusionWakeupParams)) {
            return super.equals(obj);
        }
        FusionWakeupParams fusionWakeupParams = (FusionWakeupParams) obj;
        if (!getTraceId().equals(fusionWakeupParams.getTraceId()) || this.pullUpStrategy_ != fusionWakeupParams.pullUpStrategy_ || !getComponentConfigCase().equals(fusionWakeupParams.getComponentConfigCase())) {
            return false;
        }
        int i = this.componentConfigCase_;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && !getCpConfig().equals(fusionWakeupParams.getCpConfig())) {
                        return false;
                    }
                } else if (!getServiceConfig().equals(fusionWakeupParams.getServiceConfig())) {
                    return false;
                }
            } else if (!getBroadcastConfig().equals(fusionWakeupParams.getBroadcastConfig())) {
                return false;
            }
        } else if (!getActivityConfig().equals(fusionWakeupParams.getActivityConfig())) {
            return false;
        }
        return getUnknownFields().equals(fusionWakeupParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ActivityConfig getActivityConfig() {
        return this.componentConfigCase_ == 1 ? (ActivityConfig) this.componentConfig_ : ActivityConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ActivityConfigOrBuilder getActivityConfigOrBuilder() {
        return this.componentConfigCase_ == 1 ? (ActivityConfig) this.componentConfig_ : ActivityConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public BroadcastConfig getBroadcastConfig() {
        return this.componentConfigCase_ == 2 ? (BroadcastConfig) this.componentConfig_ : BroadcastConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public BroadcastConfigOrBuilder getBroadcastConfigOrBuilder() {
        return this.componentConfigCase_ == 2 ? (BroadcastConfig) this.componentConfig_ : BroadcastConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ComponentConfigCase getComponentConfigCase() {
        return ComponentConfigCase.forNumber(this.componentConfigCase_);
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ContentProviderConfig getCpConfig() {
        return this.componentConfigCase_ == 4 ? (ContentProviderConfig) this.componentConfig_ : ContentProviderConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ContentProviderConfigOrBuilder getCpConfigOrBuilder() {
        return this.componentConfigCase_ == 4 ? (ContentProviderConfig) this.componentConfig_ : ContentProviderConfig.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<FusionWakeupParams> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public PullUpStrategyType getPullUpStrategy() {
        PullUpStrategyType pullUpStrategyTypeForNumber = PullUpStrategyType.forNumber(this.pullUpStrategy_);
        return pullUpStrategyTypeForNumber == null ? PullUpStrategyType.UNRECOGNIZED : pullUpStrategyTypeForNumber;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public int getPullUpStrategyValue() {
        return this.pullUpStrategy_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = this.componentConfigCase_ == 1 ? CodedOutputStream.computeMessageSize(1, (ActivityConfig) this.componentConfig_) : 0;
        if (this.componentConfigCase_ == 2) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, (BroadcastConfig) this.componentConfig_);
        }
        if (this.componentConfigCase_ == 3) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (ServiceConfig) this.componentConfig_);
        }
        if (this.componentConfigCase_ == 4) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (ContentProviderConfig) this.componentConfig_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.traceId_)) {
            iComputeMessageSize += GeneratedMessageV3.computeStringSize(5, this.traceId_);
        }
        if (this.pullUpStrategy_ != PullUpStrategyType.STRATEGY_UNKNOWN.getNumber()) {
            iComputeMessageSize += CodedOutputStream.computeEnumSize(6, this.pullUpStrategy_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ServiceConfig getServiceConfig() {
        return this.componentConfigCase_ == 3 ? (ServiceConfig) this.componentConfig_ : ServiceConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ServiceConfigOrBuilder getServiceConfigOrBuilder() {
        return this.componentConfigCase_ == 3 ? (ServiceConfig) this.componentConfig_ : ServiceConfig.getDefaultInstance();
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public String getTraceId() {
        Object obj = this.traceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.traceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public ByteString getTraceIdBytes() {
        Object obj = this.traceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.traceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public boolean hasActivityConfig() {
        return this.componentConfigCase_ == 1;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public boolean hasBroadcastConfig() {
        return this.componentConfigCase_ == 2;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public boolean hasCpConfig() {
        return this.componentConfigCase_ == 4;
    }

    @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
    public boolean hasServiceConfig() {
        return this.componentConfigCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int iCarambola;
        int iHashCode;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode2 = ((((getTraceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 5) * 53)) * 37) + 6) * 53) + this.pullUpStrategy_;
        int i2 = this.componentConfigCase_;
        if (i2 == 1) {
            iCarambola = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode2, 37, 1, 53);
            iHashCode = getActivityConfig().hashCode();
        } else if (i2 == 2) {
            iCarambola = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode2, 37, 2, 53);
            iHashCode = getBroadcastConfig().hashCode();
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    iCarambola = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode2, 37, 4, 53);
                    iHashCode = getCpConfig().hashCode();
                }
                int iHashCode3 = getUnknownFields().hashCode() + (iHashCode2 * 29);
                this.memoizedHashCode = iHashCode3;
                return iHashCode3;
            }
            iCarambola = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode2, 37, 3, 53);
            iHashCode = getServiceConfig().hashCode();
        }
        iHashCode2 = iHashCode + iCarambola;
        int iHashCode4 = getUnknownFields().hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_fieldAccessorTable.ensureFieldAccessorsInitialized(FusionWakeupParams.class, Builder.class);
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
        return new FusionWakeupParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.componentConfigCase_ == 1) {
            codedOutputStream.writeMessage(1, (ActivityConfig) this.componentConfig_);
        }
        if (this.componentConfigCase_ == 2) {
            codedOutputStream.writeMessage(2, (BroadcastConfig) this.componentConfig_);
        }
        if (this.componentConfigCase_ == 3) {
            codedOutputStream.writeMessage(3, (ServiceConfig) this.componentConfig_);
        }
        if (this.componentConfigCase_ == 4) {
            codedOutputStream.writeMessage(4, (ContentProviderConfig) this.componentConfig_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.traceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.traceId_);
        }
        if (this.pullUpStrategy_ != PullUpStrategyType.STRATEGY_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(6, this.pullUpStrategy_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FusionWakeupParamsOrBuilder {
        private SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> activityConfigBuilder_;
        private int bitField0_;
        private SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> broadcastConfigBuilder_;
        private int componentConfigCase_;
        private Object componentConfig_;
        private SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> cpConfigBuilder_;
        private int pullUpStrategy_;
        private SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> serviceConfigBuilder_;
        private Object traceId_;

        private void buildPartial0(FusionWakeupParams fusionWakeupParams) {
            int i = this.bitField0_;
            if ((i & 16) != 0) {
                fusionWakeupParams.traceId_ = this.traceId_;
            }
            if ((i & 32) != 0) {
                fusionWakeupParams.pullUpStrategy_ = this.pullUpStrategy_;
            }
        }

        private void buildPartialOneofs(FusionWakeupParams fusionWakeupParams) {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3;
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV4;
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV5;
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV6;
            fusionWakeupParams.componentConfigCase_ = this.componentConfigCase_;
            fusionWakeupParams.componentConfig_ = this.componentConfig_;
            if (this.componentConfigCase_ == 1 && (singleFieldBuilderV6 = this.activityConfigBuilder_) != null) {
                fusionWakeupParams.componentConfig_ = singleFieldBuilderV6.build();
            }
            if (this.componentConfigCase_ == 2 && (singleFieldBuilderV5 = this.broadcastConfigBuilder_) != null) {
                fusionWakeupParams.componentConfig_ = singleFieldBuilderV5.build();
            }
            if (this.componentConfigCase_ == 3 && (singleFieldBuilderV4 = this.serviceConfigBuilder_) != null) {
                fusionWakeupParams.componentConfig_ = singleFieldBuilderV4.build();
            }
            if (this.componentConfigCase_ != 4 || (singleFieldBuilderV3 = this.cpConfigBuilder_) == null) {
                return;
            }
            fusionWakeupParams.componentConfig_ = singleFieldBuilderV3.build();
        }

        private SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> getActivityConfigFieldBuilder() {
            if (this.activityConfigBuilder_ == null) {
                if (this.componentConfigCase_ != 1) {
                    this.componentConfig_ = ActivityConfig.getDefaultInstance();
                }
                this.activityConfigBuilder_ = new SingleFieldBuilderV3<>((ActivityConfig) this.componentConfig_, getParentForChildren(), isClean());
                this.componentConfig_ = null;
            }
            this.componentConfigCase_ = 1;
            onChanged();
            return this.activityConfigBuilder_;
        }

        private SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> getBroadcastConfigFieldBuilder() {
            if (this.broadcastConfigBuilder_ == null) {
                if (this.componentConfigCase_ != 2) {
                    this.componentConfig_ = BroadcastConfig.getDefaultInstance();
                }
                this.broadcastConfigBuilder_ = new SingleFieldBuilderV3<>((BroadcastConfig) this.componentConfig_, getParentForChildren(), isClean());
                this.componentConfig_ = null;
            }
            this.componentConfigCase_ = 2;
            onChanged();
            return this.broadcastConfigBuilder_;
        }

        private SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> getCpConfigFieldBuilder() {
            if (this.cpConfigBuilder_ == null) {
                if (this.componentConfigCase_ != 4) {
                    this.componentConfig_ = ContentProviderConfig.getDefaultInstance();
                }
                this.cpConfigBuilder_ = new SingleFieldBuilderV3<>((ContentProviderConfig) this.componentConfig_, getParentForChildren(), isClean());
                this.componentConfig_ = null;
            }
            this.componentConfigCase_ = 4;
            onChanged();
            return this.cpConfigBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_descriptor;
        }

        private SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> getServiceConfigFieldBuilder() {
            if (this.serviceConfigBuilder_ == null) {
                if (this.componentConfigCase_ != 3) {
                    this.componentConfig_ = ServiceConfig.getDefaultInstance();
                }
                this.serviceConfigBuilder_ = new SingleFieldBuilderV3<>((ServiceConfig) this.componentConfig_, getParentForChildren(), isClean());
                this.componentConfig_ = null;
            }
            this.componentConfigCase_ = 3;
            onChanged();
            return this.serviceConfigBuilder_;
        }

        public Builder clearActivityConfig() {
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3 = this.activityConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                if (this.componentConfigCase_ == 1) {
                    this.componentConfigCase_ = 0;
                    this.componentConfig_ = null;
                }
                singleFieldBuilderV3.clear();
            } else if (this.componentConfigCase_ == 1) {
                this.componentConfigCase_ = 0;
                this.componentConfig_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearBroadcastConfig() {
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV3 = this.broadcastConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                if (this.componentConfigCase_ == 2) {
                    this.componentConfigCase_ = 0;
                    this.componentConfig_ = null;
                }
                singleFieldBuilderV3.clear();
            } else if (this.componentConfigCase_ == 2) {
                this.componentConfigCase_ = 0;
                this.componentConfig_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearComponentConfig() {
            this.componentConfigCase_ = 0;
            this.componentConfig_ = null;
            onChanged();
            return this;
        }

        public Builder clearCpConfig() {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3 = this.cpConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                if (this.componentConfigCase_ == 4) {
                    this.componentConfigCase_ = 0;
                    this.componentConfig_ = null;
                }
                singleFieldBuilderV3.clear();
            } else if (this.componentConfigCase_ == 4) {
                this.componentConfigCase_ = 0;
                this.componentConfig_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearPullUpStrategy() {
            this.bitField0_ &= -33;
            this.pullUpStrategy_ = 0;
            onChanged();
            return this;
        }

        public Builder clearServiceConfig() {
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV3 = this.serviceConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                if (this.componentConfigCase_ == 3) {
                    this.componentConfigCase_ = 0;
                    this.componentConfig_ = null;
                }
                singleFieldBuilderV3.clear();
            } else if (this.componentConfigCase_ == 3) {
                this.componentConfigCase_ = 0;
                this.componentConfig_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearTraceId() {
            this.traceId_ = FusionWakeupParams.getDefaultInstance().getTraceId();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ActivityConfig getActivityConfig() {
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3 = this.activityConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                return this.componentConfigCase_ == 1 ? (ActivityConfig) this.componentConfig_ : ActivityConfig.getDefaultInstance();
            }
            return this.componentConfigCase_ == 1 ? (ActivityConfig) singleFieldBuilderV3.getMessage() : ActivityConfig.getDefaultInstance();
        }

        public ActivityConfig.Builder getActivityConfigBuilder() {
            return (ActivityConfig.Builder) getActivityConfigFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ActivityConfigOrBuilder getActivityConfigOrBuilder() {
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3;
            int i = this.componentConfigCase_;
            if (i != 1 || (singleFieldBuilderV3 = this.activityConfigBuilder_) == null) {
                return i == 1 ? (ActivityConfig) this.componentConfig_ : ActivityConfig.getDefaultInstance();
            }
            return (ActivityConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public BroadcastConfig getBroadcastConfig() {
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV3 = this.broadcastConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                return this.componentConfigCase_ == 2 ? (BroadcastConfig) this.componentConfig_ : BroadcastConfig.getDefaultInstance();
            }
            return this.componentConfigCase_ == 2 ? (BroadcastConfig) singleFieldBuilderV3.getMessage() : BroadcastConfig.getDefaultInstance();
        }

        public BroadcastConfig.Builder getBroadcastConfigBuilder() {
            return (BroadcastConfig.Builder) getBroadcastConfigFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public BroadcastConfigOrBuilder getBroadcastConfigOrBuilder() {
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV3;
            int i = this.componentConfigCase_;
            if (i != 2 || (singleFieldBuilderV3 = this.broadcastConfigBuilder_) == null) {
                return i == 2 ? (BroadcastConfig) this.componentConfig_ : BroadcastConfig.getDefaultInstance();
            }
            return (BroadcastConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ComponentConfigCase getComponentConfigCase() {
            return ComponentConfigCase.forNumber(this.componentConfigCase_);
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ContentProviderConfig getCpConfig() {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3 = this.cpConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                return this.componentConfigCase_ == 4 ? (ContentProviderConfig) this.componentConfig_ : ContentProviderConfig.getDefaultInstance();
            }
            return this.componentConfigCase_ == 4 ? (ContentProviderConfig) singleFieldBuilderV3.getMessage() : ContentProviderConfig.getDefaultInstance();
        }

        public ContentProviderConfig.Builder getCpConfigBuilder() {
            return (ContentProviderConfig.Builder) getCpConfigFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ContentProviderConfigOrBuilder getCpConfigOrBuilder() {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3;
            int i = this.componentConfigCase_;
            if (i != 4 || (singleFieldBuilderV3 = this.cpConfigBuilder_) == null) {
                return i == 4 ? (ContentProviderConfig) this.componentConfig_ : ContentProviderConfig.getDefaultInstance();
            }
            return (ContentProviderConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_descriptor;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public PullUpStrategyType getPullUpStrategy() {
            PullUpStrategyType pullUpStrategyTypeForNumber = PullUpStrategyType.forNumber(this.pullUpStrategy_);
            return pullUpStrategyTypeForNumber == null ? PullUpStrategyType.UNRECOGNIZED : pullUpStrategyTypeForNumber;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public int getPullUpStrategyValue() {
            return this.pullUpStrategy_;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ServiceConfig getServiceConfig() {
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV3 = this.serviceConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                return this.componentConfigCase_ == 3 ? (ServiceConfig) this.componentConfig_ : ServiceConfig.getDefaultInstance();
            }
            return this.componentConfigCase_ == 3 ? (ServiceConfig) singleFieldBuilderV3.getMessage() : ServiceConfig.getDefaultInstance();
        }

        public ServiceConfig.Builder getServiceConfigBuilder() {
            return (ServiceConfig.Builder) getServiceConfigFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ServiceConfigOrBuilder getServiceConfigOrBuilder() {
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV3;
            int i = this.componentConfigCase_;
            if (i != 3 || (singleFieldBuilderV3 = this.serviceConfigBuilder_) == null) {
                return i == 3 ? (ServiceConfig) this.componentConfig_ : ServiceConfig.getDefaultInstance();
            }
            return (ServiceConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public String getTraceId() {
            Object obj = this.traceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.traceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public ByteString getTraceIdBytes() {
            Object obj = this.traceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.traceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public boolean hasActivityConfig() {
            return this.componentConfigCase_ == 1;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public boolean hasBroadcastConfig() {
            return this.componentConfigCase_ == 2;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public boolean hasCpConfig() {
            return this.componentConfigCase_ == 4;
        }

        @Override // com.oplus.pantaconnect.fusionservice.FusionWakeupParamsOrBuilder
        public boolean hasServiceConfig() {
            return this.componentConfigCase_ == 3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_fieldAccessorTable.ensureFieldAccessorsInitialized(FusionWakeupParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeActivityConfig(ActivityConfig activityConfig) {
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3 = this.activityConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.componentConfigCase_ != 1 || this.componentConfig_ == ActivityConfig.getDefaultInstance()) {
                    this.componentConfig_ = activityConfig;
                } else {
                    this.componentConfig_ = ActivityConfig.newBuilder((ActivityConfig) this.componentConfig_).mergeFrom(activityConfig).buildPartial();
                }
                onChanged();
            } else if (this.componentConfigCase_ == 1) {
                singleFieldBuilderV3.mergeFrom(activityConfig);
            } else {
                singleFieldBuilderV3.setMessage(activityConfig);
            }
            this.componentConfigCase_ = 1;
            return this;
        }

        public Builder mergeBroadcastConfig(BroadcastConfig broadcastConfig) {
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV3 = this.broadcastConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.componentConfigCase_ != 2 || this.componentConfig_ == BroadcastConfig.getDefaultInstance()) {
                    this.componentConfig_ = broadcastConfig;
                } else {
                    this.componentConfig_ = BroadcastConfig.newBuilder((BroadcastConfig) this.componentConfig_).mergeFrom(broadcastConfig).buildPartial();
                }
                onChanged();
            } else if (this.componentConfigCase_ == 2) {
                singleFieldBuilderV3.mergeFrom(broadcastConfig);
            } else {
                singleFieldBuilderV3.setMessage(broadcastConfig);
            }
            this.componentConfigCase_ = 2;
            return this;
        }

        public Builder mergeCpConfig(ContentProviderConfig contentProviderConfig) {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3 = this.cpConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.componentConfigCase_ != 4 || this.componentConfig_ == ContentProviderConfig.getDefaultInstance()) {
                    this.componentConfig_ = contentProviderConfig;
                } else {
                    this.componentConfig_ = ContentProviderConfig.newBuilder((ContentProviderConfig) this.componentConfig_).mergeFrom(contentProviderConfig).buildPartial();
                }
                onChanged();
            } else if (this.componentConfigCase_ == 4) {
                singleFieldBuilderV3.mergeFrom(contentProviderConfig);
            } else {
                singleFieldBuilderV3.setMessage(contentProviderConfig);
            }
            this.componentConfigCase_ = 4;
            return this;
        }

        public Builder mergeServiceConfig(ServiceConfig serviceConfig) {
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV3 = this.serviceConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.componentConfigCase_ != 3 || this.componentConfig_ == ServiceConfig.getDefaultInstance()) {
                    this.componentConfig_ = serviceConfig;
                } else {
                    this.componentConfig_ = ServiceConfig.newBuilder((ServiceConfig) this.componentConfig_).mergeFrom(serviceConfig).buildPartial();
                }
                onChanged();
            } else if (this.componentConfigCase_ == 3) {
                singleFieldBuilderV3.mergeFrom(serviceConfig);
            } else {
                singleFieldBuilderV3.setMessage(serviceConfig);
            }
            this.componentConfigCase_ = 3;
            return this;
        }

        public Builder setActivityConfig(ActivityConfig activityConfig) {
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3 = this.activityConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                activityConfig.getClass();
                this.componentConfig_ = activityConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(activityConfig);
            }
            this.componentConfigCase_ = 1;
            return this;
        }

        public Builder setBroadcastConfig(BroadcastConfig broadcastConfig) {
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV3 = this.broadcastConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                broadcastConfig.getClass();
                this.componentConfig_ = broadcastConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(broadcastConfig);
            }
            this.componentConfigCase_ = 2;
            return this;
        }

        public Builder setCpConfig(ContentProviderConfig contentProviderConfig) {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3 = this.cpConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                contentProviderConfig.getClass();
                this.componentConfig_ = contentProviderConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(contentProviderConfig);
            }
            this.componentConfigCase_ = 4;
            return this;
        }

        public Builder setPullUpStrategy(PullUpStrategyType pullUpStrategyType) {
            pullUpStrategyType.getClass();
            this.bitField0_ |= 32;
            this.pullUpStrategy_ = pullUpStrategyType.getNumber();
            onChanged();
            return this;
        }

        public Builder setPullUpStrategyValue(int i) {
            this.pullUpStrategy_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setServiceConfig(ServiceConfig serviceConfig) {
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV3 = this.serviceConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                serviceConfig.getClass();
                this.componentConfig_ = serviceConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(serviceConfig);
            }
            this.componentConfigCase_ = 3;
            return this;
        }

        public Builder setTraceId(String str) {
            str.getClass();
            this.traceId_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setTraceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.traceId_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        private Builder() {
            this.componentConfigCase_ = 0;
            this.traceId_ = "";
            this.pullUpStrategy_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public FusionWakeupParams build() {
            FusionWakeupParams fusionWakeupParamsBuildPartial = buildPartial();
            if (fusionWakeupParamsBuildPartial.isInitialized()) {
                return fusionWakeupParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) fusionWakeupParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public FusionWakeupParams buildPartial() {
            FusionWakeupParams fusionWakeupParams = new FusionWakeupParams(this);
            if (this.bitField0_ != 0) {
                buildPartial0(fusionWakeupParams);
            }
            buildPartialOneofs(fusionWakeupParams);
            onBuilt();
            return fusionWakeupParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FusionWakeupParams getDefaultInstanceForType() {
            return FusionWakeupParams.getDefaultInstance();
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
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3 = this.activityConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.clear();
            }
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV4 = this.broadcastConfigBuilder_;
            if (singleFieldBuilderV4 != null) {
                singleFieldBuilderV4.clear();
            }
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV5 = this.serviceConfigBuilder_;
            if (singleFieldBuilderV5 != null) {
                singleFieldBuilderV5.clear();
            }
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV6 = this.cpConfigBuilder_;
            if (singleFieldBuilderV6 != null) {
                singleFieldBuilderV6.clear();
            }
            this.traceId_ = "";
            this.pullUpStrategy_ = 0;
            this.componentConfigCase_ = 0;
            this.componentConfig_ = null;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.componentConfigCase_ = 0;
            this.traceId_ = "";
            this.pullUpStrategy_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof FusionWakeupParams) {
                return mergeFrom((FusionWakeupParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setActivityConfig(ActivityConfig.Builder builder) {
            SingleFieldBuilderV3<ActivityConfig, ActivityConfig.Builder, ActivityConfigOrBuilder> singleFieldBuilderV3 = this.activityConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.componentConfig_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.componentConfigCase_ = 1;
            return this;
        }

        public Builder setBroadcastConfig(BroadcastConfig.Builder builder) {
            SingleFieldBuilderV3<BroadcastConfig, BroadcastConfig.Builder, BroadcastConfigOrBuilder> singleFieldBuilderV3 = this.broadcastConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.componentConfig_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.componentConfigCase_ = 2;
            return this;
        }

        public Builder setCpConfig(ContentProviderConfig.Builder builder) {
            SingleFieldBuilderV3<ContentProviderConfig, ContentProviderConfig.Builder, ContentProviderConfigOrBuilder> singleFieldBuilderV3 = this.cpConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.componentConfig_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.componentConfigCase_ = 4;
            return this;
        }

        public Builder setServiceConfig(ServiceConfig.Builder builder) {
            SingleFieldBuilderV3<ServiceConfig, ServiceConfig.Builder, ServiceConfigOrBuilder> singleFieldBuilderV3 = this.serviceConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.componentConfig_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.componentConfigCase_ = 3;
            return this;
        }

        public Builder mergeFrom(FusionWakeupParams fusionWakeupParams) {
            if (fusionWakeupParams == FusionWakeupParams.getDefaultInstance()) {
                return this;
            }
            if (!fusionWakeupParams.getTraceId().isEmpty()) {
                this.traceId_ = fusionWakeupParams.traceId_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (fusionWakeupParams.pullUpStrategy_ != 0) {
                setPullUpStrategyValue(fusionWakeupParams.getPullUpStrategyValue());
            }
            int i = AnonymousClass2.$SwitchMap$com$oplus$pantaconnect$fusionservice$FusionWakeupParams$ComponentConfigCase[fusionWakeupParams.getComponentConfigCase().ordinal()];
            if (i == 1) {
                mergeActivityConfig(fusionWakeupParams.getActivityConfig());
            } else if (i == 2) {
                mergeBroadcastConfig(fusionWakeupParams.getBroadcastConfig());
            } else if (i == 3) {
                mergeServiceConfig(fusionWakeupParams.getServiceConfig());
            } else if (i == 4) {
                mergeCpConfig(fusionWakeupParams.getCpConfig());
            }
            mergeUnknownFields(fusionWakeupParams.getUnknownFields());
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
                                codedInputStream.readMessage(getActivityConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.componentConfigCase_ = 1;
                            } else if (tag == 18) {
                                codedInputStream.readMessage(getBroadcastConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.componentConfigCase_ = 2;
                            } else if (tag == 26) {
                                codedInputStream.readMessage(getServiceConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.componentConfigCase_ = 3;
                            } else if (tag == 34) {
                                codedInputStream.readMessage(getCpConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.componentConfigCase_ = 4;
                            } else if (tag == 42) {
                                this.traceId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.pullUpStrategy_ = codedInputStream.readEnum();
                                this.bitField0_ |= 32;
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

    private FusionWakeupParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.componentConfigCase_ = 0;
        this.traceId_ = "";
        this.pullUpStrategy_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(FusionWakeupParams fusionWakeupParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(fusionWakeupParams);
    }

    public static FusionWakeupParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static FusionWakeupParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FusionWakeupParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static FusionWakeupParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public FusionWakeupParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static FusionWakeupParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static FusionWakeupParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static FusionWakeupParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private FusionWakeupParams() {
        this.componentConfigCase_ = 0;
        this.traceId_ = "";
        this.pullUpStrategy_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.traceId_ = "";
        this.pullUpStrategy_ = 0;
    }

    public static FusionWakeupParams parseFrom(InputStream inputStream) throws IOException {
        return (FusionWakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static FusionWakeupParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FusionWakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static FusionWakeupParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FusionWakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static FusionWakeupParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FusionWakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
