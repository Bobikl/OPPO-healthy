package com.heytap.wearable.clock;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockMsg {

    /* JADX INFO: renamed from: com.heytap.wearable.clock.ClockMsg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class ClockCityListResponse extends GeneratedMessageLite<ClockCityListResponse, Builder> implements ClockCityListResponseOrBuilder {
        public static final int CLOCK_CITY_LIST_FIELD_NUMBER = 1;
        private static final ClockCityListResponse DEFAULT_INSTANCE;
        private static volatile Parser<ClockCityListResponse> PARSER;
        private Internal.ProtobufList<ClockCityInfo> clockCityList_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<ClockCityListResponse, Builder> implements ClockCityListResponseOrBuilder {
            public Builder addAllClockCityList(Iterable<? extends ClockCityInfo> iterable) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).addAllClockCityList(iterable);
                return this;
            }

            public Builder addClockCityList(ClockCityInfo clockCityInfo) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).addClockCityList(clockCityInfo);
                return this;
            }

            public Builder clearClockCityList() {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).clearClockCityList();
                return this;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponseOrBuilder
            public ClockCityInfo getClockCityList(int i) {
                return ((ClockCityListResponse) this.instance).getClockCityList(i);
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponseOrBuilder
            public int getClockCityListCount() {
                return ((ClockCityListResponse) this.instance).getClockCityListCount();
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponseOrBuilder
            public List<ClockCityInfo> getClockCityListList() {
                return Collections.unmodifiableList(((ClockCityListResponse) this.instance).getClockCityListList());
            }

            public Builder removeClockCityList(int i) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).removeClockCityList(i);
                return this;
            }

            public Builder setClockCityList(int i, ClockCityInfo clockCityInfo) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).setClockCityList(i, clockCityInfo);
                return this;
            }

            private Builder() {
                super(ClockCityListResponse.DEFAULT_INSTANCE);
            }

            public Builder addClockCityList(int i, ClockCityInfo clockCityInfo) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).addClockCityList(i, clockCityInfo);
                return this;
            }

            public Builder setClockCityList(int i, ClockCityInfo.Builder builder) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).setClockCityList(i, builder.build());
                return this;
            }

            public Builder addClockCityList(ClockCityInfo.Builder builder) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).addClockCityList(builder.build());
                return this;
            }

            public Builder addClockCityList(int i, ClockCityInfo.Builder builder) {
                copyOnWrite();
                ((ClockCityListResponse) this.instance).addClockCityList(i, builder.build());
                return this;
            }
        }

        public static final class ClockCityInfo extends GeneratedMessageLite<ClockCityInfo, Builder> implements ClockCityInfoOrBuilder {
            public static final int CLOCK_CITY_ID_FIELD_NUMBER = 2;
            public static final int CLOCK_NAME_FIELD_NUMBER = 3;
            public static final int CLOCK_OFFSET_FIELD_NUMBER = 6;
            public static final int CLOCK_SORT_POS_FIELD_NUMBER = 5;
            public static final int CLOCK_TIMEZONE_FIELD_NUMBER = 4;
            private static final ClockCityInfo DEFAULT_INSTANCE;
            private static volatile Parser<ClockCityInfo> PARSER;
            private int clockCityId_;
            private int clockOffset_;
            private int clockSortPos_;
            private String clockName_ = "";
            private String clockTimezone_ = "";

            public static final class Builder extends GeneratedMessageLite.Builder<ClockCityInfo, Builder> implements ClockCityInfoOrBuilder {
                public Builder clearClockCityId() {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).clearClockCityId();
                    return this;
                }

                public Builder clearClockName() {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).clearClockName();
                    return this;
                }

                public Builder clearClockOffset() {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).clearClockOffset();
                    return this;
                }

                public Builder clearClockSortPos() {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).clearClockSortPos();
                    return this;
                }

                public Builder clearClockTimezone() {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).clearClockTimezone();
                    return this;
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public int getClockCityId() {
                    return ((ClockCityInfo) this.instance).getClockCityId();
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public String getClockName() {
                    return ((ClockCityInfo) this.instance).getClockName();
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public ByteString getClockNameBytes() {
                    return ((ClockCityInfo) this.instance).getClockNameBytes();
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public int getClockOffset() {
                    return ((ClockCityInfo) this.instance).getClockOffset();
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public int getClockSortPos() {
                    return ((ClockCityInfo) this.instance).getClockSortPos();
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public String getClockTimezone() {
                    return ((ClockCityInfo) this.instance).getClockTimezone();
                }

                @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
                public ByteString getClockTimezoneBytes() {
                    return ((ClockCityInfo) this.instance).getClockTimezoneBytes();
                }

                public Builder setClockCityId(int i) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockCityId(i);
                    return this;
                }

                public Builder setClockName(String str) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockName(str);
                    return this;
                }

                public Builder setClockNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockNameBytes(byteString);
                    return this;
                }

                public Builder setClockOffset(int i) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockOffset(i);
                    return this;
                }

                public Builder setClockSortPos(int i) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockSortPos(i);
                    return this;
                }

                public Builder setClockTimezone(String str) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockTimezone(str);
                    return this;
                }

                public Builder setClockTimezoneBytes(ByteString byteString) {
                    copyOnWrite();
                    ((ClockCityInfo) this.instance).setClockTimezoneBytes(byteString);
                    return this;
                }

                private Builder() {
                    super(ClockCityInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                ClockCityInfo clockCityInfo = new ClockCityInfo();
                DEFAULT_INSTANCE = clockCityInfo;
                GeneratedMessageLite.registerDefaultInstance(ClockCityInfo.class, clockCityInfo);
            }

            private ClockCityInfo() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClockCityId() {
                this.clockCityId_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClockName() {
                this.clockName_ = getDefaultInstance().getClockName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClockOffset() {
                this.clockOffset_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClockSortPos() {
                this.clockSortPos_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearClockTimezone() {
                this.clockTimezone_ = getDefaultInstance().getClockTimezone();
            }

            public static ClockCityInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ClockCityInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (ClockCityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClockCityInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ClockCityInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockCityId(int i) {
                this.clockCityId_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockName(String str) {
                str.getClass();
                this.clockName_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockNameBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.clockName_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockOffset(int i) {
                this.clockOffset_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockSortPos(int i) {
                this.clockSortPos_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockTimezone(String str) {
                str.getClass();
                this.clockTimezone_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setClockTimezoneBytes(ByteString byteString) {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.clockTimezone_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                switch (i) {
                    case 1:
                        return new ClockCityInfo();
                    case 2:
                        return new Builder();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004", new Object[]{"clockCityId_", "clockName_", "clockTimezone_", "clockSortPos_", "clockOffset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ClockCityInfo> defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (ClockCityInfo.class) {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public int getClockCityId() {
                return this.clockCityId_;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public String getClockName() {
                return this.clockName_;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public ByteString getClockNameBytes() {
                return ByteString.copyFromUtf8(this.clockName_);
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public int getClockOffset() {
                return this.clockOffset_;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public int getClockSortPos() {
                return this.clockSortPos_;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public String getClockTimezone() {
                return this.clockTimezone_;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponse.ClockCityInfoOrBuilder
            public ByteString getClockTimezoneBytes() {
                return ByteString.copyFromUtf8(this.clockTimezone_);
            }

            public static Builder newBuilder(ClockCityInfo clockCityInfo) {
                return DEFAULT_INSTANCE.createBuilder(clockCityInfo);
            }

            public static ClockCityInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ClockCityInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClockCityInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ClockCityInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ClockCityInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ClockCityInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ClockCityInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ClockCityInfo parseFrom(InputStream inputStream) throws IOException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ClockCityInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ClockCityInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ClockCityInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (ClockCityInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface ClockCityInfoOrBuilder extends MessageLiteOrBuilder {
            int getClockCityId();

            String getClockName();

            ByteString getClockNameBytes();

            int getClockOffset();

            int getClockSortPos();

            String getClockTimezone();

            ByteString getClockTimezoneBytes();
        }

        static {
            ClockCityListResponse clockCityListResponse = new ClockCityListResponse();
            DEFAULT_INSTANCE = clockCityListResponse;
            GeneratedMessageLite.registerDefaultInstance(ClockCityListResponse.class, clockCityListResponse);
        }

        private ClockCityListResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllClockCityList(Iterable<? extends ClockCityInfo> iterable) {
            ensureClockCityListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.clockCityList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addClockCityList(ClockCityInfo clockCityInfo) {
            clockCityInfo.getClass();
            ensureClockCityListIsMutable();
            this.clockCityList_.add(clockCityInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockCityList() {
            this.clockCityList_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureClockCityListIsMutable() {
            Internal.ProtobufList<ClockCityInfo> protobufList = this.clockCityList_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.clockCityList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static ClockCityListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClockCityListResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClockCityListResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockCityListResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClockCityListResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeClockCityList(int i) {
            ensureClockCityListIsMutable();
            this.clockCityList_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockCityList(int i, ClockCityInfo clockCityInfo) {
            clockCityInfo.getClass();
            ensureClockCityListIsMutable();
            this.clockCityList_.set(i, clockCityInfo);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ClockCityListResponse();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"clockCityList_", ClockCityInfo.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClockCityListResponse> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClockCityListResponse.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

        @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponseOrBuilder
        public ClockCityInfo getClockCityList(int i) {
            return this.clockCityList_.get(i);
        }

        @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponseOrBuilder
        public int getClockCityListCount() {
            return this.clockCityList_.size();
        }

        @Override // com.heytap.wearable.clock.ClockMsg.ClockCityListResponseOrBuilder
        public List<ClockCityInfo> getClockCityListList() {
            return this.clockCityList_;
        }

        public ClockCityInfoOrBuilder getClockCityListOrBuilder(int i) {
            return this.clockCityList_.get(i);
        }

        public List<? extends ClockCityInfoOrBuilder> getClockCityListOrBuilderList() {
            return this.clockCityList_;
        }

        public static Builder newBuilder(ClockCityListResponse clockCityListResponse) {
            return DEFAULT_INSTANCE.createBuilder(clockCityListResponse);
        }

        public static ClockCityListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockCityListResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockCityListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClockCityListResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addClockCityList(int i, ClockCityInfo clockCityInfo) {
            clockCityInfo.getClass();
            ensureClockCityListIsMutable();
            this.clockCityList_.add(i, clockCityInfo);
        }

        public static ClockCityListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClockCityListResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClockCityListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClockCityListResponse parseFrom(InputStream inputStream) throws IOException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockCityListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockCityListResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClockCityListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockCityListResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ClockCityListResponseOrBuilder extends MessageLiteOrBuilder {
        ClockCityListResponse.ClockCityInfo getClockCityList(int i);

        int getClockCityListCount();

        List<ClockCityListResponse.ClockCityInfo> getClockCityListList();
    }

    public static final class ClockCommand extends GeneratedMessageLite<ClockCommand, Builder> implements ClockCommandOrBuilder {
        public static final int APP_VERSION_FIELD_NUMBER = 3;
        public static final int CLOCK_VERSION_FIELD_NUMBER = 2;
        private static final ClockCommand DEFAULT_INSTANCE;
        private static volatile Parser<ClockCommand> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 1;
        private int appVersion_;
        private int clockVersion_;
        private long time_;

        public static final class Builder extends GeneratedMessageLite.Builder<ClockCommand, Builder> implements ClockCommandOrBuilder {
            public Builder clearAppVersion() {
                copyOnWrite();
                ((ClockCommand) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearClockVersion() {
                copyOnWrite();
                ((ClockCommand) this.instance).clearClockVersion();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((ClockCommand) this.instance).clearTime();
                return this;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCommandOrBuilder
            public int getAppVersion() {
                return ((ClockCommand) this.instance).getAppVersion();
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCommandOrBuilder
            public int getClockVersion() {
                return ((ClockCommand) this.instance).getClockVersion();
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockCommandOrBuilder
            public long getTime() {
                return ((ClockCommand) this.instance).getTime();
            }

            public Builder setAppVersion(int i) {
                copyOnWrite();
                ((ClockCommand) this.instance).setAppVersion(i);
                return this;
            }

            public Builder setClockVersion(int i) {
                copyOnWrite();
                ((ClockCommand) this.instance).setClockVersion(i);
                return this;
            }

            public Builder setTime(long j2) {
                copyOnWrite();
                ((ClockCommand) this.instance).setTime(j2);
                return this;
            }

            private Builder() {
                super(ClockCommand.DEFAULT_INSTANCE);
            }
        }

        static {
            ClockCommand clockCommand = new ClockCommand();
            DEFAULT_INSTANCE = clockCommand;
            GeneratedMessageLite.registerDefaultInstance(ClockCommand.class, clockCommand);
        }

        private ClockCommand() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppVersion() {
            this.appVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockVersion() {
            this.clockVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = 0L;
        }

        public static ClockCommand getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClockCommand parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClockCommand) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockCommand parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClockCommand> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppVersion(int i) {
            this.appVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockVersion(int i) {
            this.clockVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(long j2) {
            this.time_ = j2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ClockCommand();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004", new Object[]{"time_", "clockVersion_", "appVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClockCommand> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClockCommand.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

        @Override // com.heytap.wearable.clock.ClockMsg.ClockCommandOrBuilder
        public int getAppVersion() {
            return this.appVersion_;
        }

        @Override // com.heytap.wearable.clock.ClockMsg.ClockCommandOrBuilder
        public int getClockVersion() {
            return this.clockVersion_;
        }

        @Override // com.heytap.wearable.clock.ClockMsg.ClockCommandOrBuilder
        public long getTime() {
            return this.time_;
        }

        public static Builder newBuilder(ClockCommand clockCommand) {
            return DEFAULT_INSTANCE.createBuilder(clockCommand);
        }

        public static ClockCommand parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockCommand) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockCommand parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClockCommand parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClockCommand parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClockCommand parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClockCommand parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClockCommand parseFrom(InputStream inputStream) throws IOException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockCommand parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockCommand parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClockCommand parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockCommand) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ClockCommandOrBuilder extends MessageLiteOrBuilder {
        int getAppVersion();

        int getClockVersion();

        long getTime();
    }

    public static final class ClockLanguage extends GeneratedMessageLite<ClockLanguage, Builder> implements ClockLanguageOrBuilder {
        public static final int CLOCK_LANGUAGE_FIELD_NUMBER = 1;
        private static final ClockLanguage DEFAULT_INSTANCE;
        private static volatile Parser<ClockLanguage> PARSER;
        private String clockLanguage_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<ClockLanguage, Builder> implements ClockLanguageOrBuilder {
            public Builder clearClockLanguage() {
                copyOnWrite();
                ((ClockLanguage) this.instance).clearClockLanguage();
                return this;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockLanguageOrBuilder
            public String getClockLanguage() {
                return ((ClockLanguage) this.instance).getClockLanguage();
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockLanguageOrBuilder
            public ByteString getClockLanguageBytes() {
                return ((ClockLanguage) this.instance).getClockLanguageBytes();
            }

            public Builder setClockLanguage(String str) {
                copyOnWrite();
                ((ClockLanguage) this.instance).setClockLanguage(str);
                return this;
            }

            public Builder setClockLanguageBytes(ByteString byteString) {
                copyOnWrite();
                ((ClockLanguage) this.instance).setClockLanguageBytes(byteString);
                return this;
            }

            private Builder() {
                super(ClockLanguage.DEFAULT_INSTANCE);
            }
        }

        static {
            ClockLanguage clockLanguage = new ClockLanguage();
            DEFAULT_INSTANCE = clockLanguage;
            GeneratedMessageLite.registerDefaultInstance(ClockLanguage.class, clockLanguage);
        }

        private ClockLanguage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockLanguage() {
            this.clockLanguage_ = getDefaultInstance().getClockLanguage();
        }

        public static ClockLanguage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClockLanguage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClockLanguage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockLanguage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClockLanguage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockLanguage(String str) {
            str.getClass();
            this.clockLanguage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockLanguageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.clockLanguage_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ClockLanguage();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"clockLanguage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClockLanguage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClockLanguage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

        @Override // com.heytap.wearable.clock.ClockMsg.ClockLanguageOrBuilder
        public String getClockLanguage() {
            return this.clockLanguage_;
        }

        @Override // com.heytap.wearable.clock.ClockMsg.ClockLanguageOrBuilder
        public ByteString getClockLanguageBytes() {
            return ByteString.copyFromUtf8(this.clockLanguage_);
        }

        public static Builder newBuilder(ClockLanguage clockLanguage) {
            return DEFAULT_INSTANCE.createBuilder(clockLanguage);
        }

        public static ClockLanguage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockLanguage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockLanguage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClockLanguage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClockLanguage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClockLanguage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClockLanguage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClockLanguage parseFrom(InputStream inputStream) throws IOException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockLanguage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockLanguage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClockLanguage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockLanguage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ClockLanguageOrBuilder extends MessageLiteOrBuilder {
        String getClockLanguage();

        ByteString getClockLanguageBytes();
    }

    public static final class ClockOOBESyncResult extends GeneratedMessageLite<ClockOOBESyncResult, Builder> implements ClockOOBESyncResultOrBuilder {
        public static final int CLOCK_CITY_LIST_SYNC_RESULT_FIELD_NUMBER = 1;
        private static final ClockOOBESyncResult DEFAULT_INSTANCE;
        private static volatile Parser<ClockOOBESyncResult> PARSER;
        private int clockCityListSyncResult_;

        public static final class Builder extends GeneratedMessageLite.Builder<ClockOOBESyncResult, Builder> implements ClockOOBESyncResultOrBuilder {
            public Builder clearClockCityListSyncResult() {
                copyOnWrite();
                ((ClockOOBESyncResult) this.instance).clearClockCityListSyncResult();
                return this;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.ClockOOBESyncResultOrBuilder
            public int getClockCityListSyncResult() {
                return ((ClockOOBESyncResult) this.instance).getClockCityListSyncResult();
            }

            public Builder setClockCityListSyncResult(int i) {
                copyOnWrite();
                ((ClockOOBESyncResult) this.instance).setClockCityListSyncResult(i);
                return this;
            }

            private Builder() {
                super(ClockOOBESyncResult.DEFAULT_INSTANCE);
            }
        }

        static {
            ClockOOBESyncResult clockOOBESyncResult = new ClockOOBESyncResult();
            DEFAULT_INSTANCE = clockOOBESyncResult;
            GeneratedMessageLite.registerDefaultInstance(ClockOOBESyncResult.class, clockOOBESyncResult);
        }

        private ClockOOBESyncResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockCityListSyncResult() {
            this.clockCityListSyncResult_ = 0;
        }

        public static ClockOOBESyncResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClockOOBESyncResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockOOBESyncResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClockOOBESyncResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockCityListSyncResult(int i) {
            this.clockCityListSyncResult_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new ClockOOBESyncResult();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"clockCityListSyncResult_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClockOOBESyncResult> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClockOOBESyncResult.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

        @Override // com.heytap.wearable.clock.ClockMsg.ClockOOBESyncResultOrBuilder
        public int getClockCityListSyncResult() {
            return this.clockCityListSyncResult_;
        }

        public static Builder newBuilder(ClockOOBESyncResult clockOOBESyncResult) {
            return DEFAULT_INSTANCE.createBuilder(clockOOBESyncResult);
        }

        public static ClockOOBESyncResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockOOBESyncResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClockOOBESyncResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClockOOBESyncResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClockOOBESyncResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClockOOBESyncResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClockOOBESyncResult parseFrom(InputStream inputStream) throws IOException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClockOOBESyncResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClockOOBESyncResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClockOOBESyncResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClockOOBESyncResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ClockOOBESyncResultOrBuilder extends MessageLiteOrBuilder {
        int getClockCityListSyncResult();
    }

    public static final class OOBELanguageSync extends GeneratedMessageLite<OOBELanguageSync, Builder> implements OOBELanguageSyncOrBuilder {
        public static final int CLOCK_VERSION_FIELD_NUMBER = 2;
        private static final OOBELanguageSync DEFAULT_INSTANCE;
        public static final int OOBE_SYNC_LANGUAGE_FIELD_NUMBER = 1;
        private static volatile Parser<OOBELanguageSync> PARSER;
        private int clockVersion_;
        private String oobeSyncLanguage_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<OOBELanguageSync, Builder> implements OOBELanguageSyncOrBuilder {
            public Builder clearClockVersion() {
                copyOnWrite();
                ((OOBELanguageSync) this.instance).clearClockVersion();
                return this;
            }

            public Builder clearOobeSyncLanguage() {
                copyOnWrite();
                ((OOBELanguageSync) this.instance).clearOobeSyncLanguage();
                return this;
            }

            @Override // com.heytap.wearable.clock.ClockMsg.OOBELanguageSyncOrBuilder
            public int getClockVersion() {
                return ((OOBELanguageSync) this.instance).getClockVersion();
            }

            @Override // com.heytap.wearable.clock.ClockMsg.OOBELanguageSyncOrBuilder
            public String getOobeSyncLanguage() {
                return ((OOBELanguageSync) this.instance).getOobeSyncLanguage();
            }

            @Override // com.heytap.wearable.clock.ClockMsg.OOBELanguageSyncOrBuilder
            public ByteString getOobeSyncLanguageBytes() {
                return ((OOBELanguageSync) this.instance).getOobeSyncLanguageBytes();
            }

            public Builder setClockVersion(int i) {
                copyOnWrite();
                ((OOBELanguageSync) this.instance).setClockVersion(i);
                return this;
            }

            public Builder setOobeSyncLanguage(String str) {
                copyOnWrite();
                ((OOBELanguageSync) this.instance).setOobeSyncLanguage(str);
                return this;
            }

            public Builder setOobeSyncLanguageBytes(ByteString byteString) {
                copyOnWrite();
                ((OOBELanguageSync) this.instance).setOobeSyncLanguageBytes(byteString);
                return this;
            }

            private Builder() {
                super(OOBELanguageSync.DEFAULT_INSTANCE);
            }
        }

        static {
            OOBELanguageSync oOBELanguageSync = new OOBELanguageSync();
            DEFAULT_INSTANCE = oOBELanguageSync;
            GeneratedMessageLite.registerDefaultInstance(OOBELanguageSync.class, oOBELanguageSync);
        }

        private OOBELanguageSync() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClockVersion() {
            this.clockVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOobeSyncLanguage() {
            this.oobeSyncLanguage_ = getDefaultInstance().getOobeSyncLanguage();
        }

        public static OOBELanguageSync getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OOBELanguageSync parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OOBELanguageSync) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OOBELanguageSync parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OOBELanguageSync> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClockVersion(int i) {
            this.clockVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOobeSyncLanguage(String str) {
            str.getClass();
            this.oobeSyncLanguage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOobeSyncLanguageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oobeSyncLanguage_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new OOBELanguageSync();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"oobeSyncLanguage_", "clockVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OOBELanguageSync> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (OOBELanguageSync.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
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

        @Override // com.heytap.wearable.clock.ClockMsg.OOBELanguageSyncOrBuilder
        public int getClockVersion() {
            return this.clockVersion_;
        }

        @Override // com.heytap.wearable.clock.ClockMsg.OOBELanguageSyncOrBuilder
        public String getOobeSyncLanguage() {
            return this.oobeSyncLanguage_;
        }

        @Override // com.heytap.wearable.clock.ClockMsg.OOBELanguageSyncOrBuilder
        public ByteString getOobeSyncLanguageBytes() {
            return ByteString.copyFromUtf8(this.oobeSyncLanguage_);
        }

        public static Builder newBuilder(OOBELanguageSync oOBELanguageSync) {
            return DEFAULT_INSTANCE.createBuilder(oOBELanguageSync);
        }

        public static OOBELanguageSync parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OOBELanguageSync) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OOBELanguageSync parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OOBELanguageSync parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OOBELanguageSync parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OOBELanguageSync parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OOBELanguageSync parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OOBELanguageSync parseFrom(InputStream inputStream) throws IOException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OOBELanguageSync parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OOBELanguageSync parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OOBELanguageSync parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OOBELanguageSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface OOBELanguageSyncOrBuilder extends MessageLiteOrBuilder {
        int getClockVersion();

        String getOobeSyncLanguage();

        ByteString getOobeSyncLanguageBytes();
    }

    private ClockMsg() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
