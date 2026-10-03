package com.op.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class CapabilitySynData {

    /* JADX INFO: renamed from: com.op.proto.CapabilitySynData$1, reason: invalid class name */
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

    public static final class CapabilitySync extends GeneratedMessageLite<CapabilitySync, Builder> implements CapabilitySyncOrBuilder {
        private static final CapabilitySync DEFAULT_INSTANCE;
        public static final int END_SYNC_ACCEPT_FIELD_NUMBER = 3;
        public static final int END_SYNC_RESULT_FIELD_NUMBER = 2;
        public static final int HASMORE_FIELD_NUMBER = 9;
        public static final int MORE_DATA_FIELD_NUMBER = 6;
        private static volatile Parser<CapabilitySync> PARSER = null;
        public static final int START_SYNC_ACCEPT_FIELD_NUMBER = 5;
        public static final int START_SYNC_RESULT_FIELD_NUMBER = 4;
        private int endSyncAccept_;
        private int endSyncResult_;
        private boolean hasmore_;
        private int moreData_;
        private int startSyncAccept_;
        private int startSyncResult_;

        public static final class Builder extends GeneratedMessageLite.Builder<CapabilitySync, Builder> implements CapabilitySyncOrBuilder {
            public Builder clearEndSyncAccept() {
                copyOnWrite();
                ((CapabilitySync) this.instance).clearEndSyncAccept();
                return this;
            }

            public Builder clearEndSyncResult() {
                copyOnWrite();
                ((CapabilitySync) this.instance).clearEndSyncResult();
                return this;
            }

            public Builder clearHasmore() {
                copyOnWrite();
                ((CapabilitySync) this.instance).clearHasmore();
                return this;
            }

            public Builder clearMoreData() {
                copyOnWrite();
                ((CapabilitySync) this.instance).clearMoreData();
                return this;
            }

            public Builder clearStartSyncAccept() {
                copyOnWrite();
                ((CapabilitySync) this.instance).clearStartSyncAccept();
                return this;
            }

            public Builder clearStartSyncResult() {
                copyOnWrite();
                ((CapabilitySync) this.instance).clearStartSyncResult();
                return this;
            }

            @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
            public int getEndSyncAccept() {
                return ((CapabilitySync) this.instance).getEndSyncAccept();
            }

            @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
            public int getEndSyncResult() {
                return ((CapabilitySync) this.instance).getEndSyncResult();
            }

            @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
            public boolean getHasmore() {
                return ((CapabilitySync) this.instance).getHasmore();
            }

            @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
            public int getMoreData() {
                return ((CapabilitySync) this.instance).getMoreData();
            }

            @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
            public int getStartSyncAccept() {
                return ((CapabilitySync) this.instance).getStartSyncAccept();
            }

            @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
            public int getStartSyncResult() {
                return ((CapabilitySync) this.instance).getStartSyncResult();
            }

            public Builder setEndSyncAccept(int i) {
                copyOnWrite();
                ((CapabilitySync) this.instance).setEndSyncAccept(i);
                return this;
            }

            public Builder setEndSyncResult(int i) {
                copyOnWrite();
                ((CapabilitySync) this.instance).setEndSyncResult(i);
                return this;
            }

            public Builder setHasmore(boolean z) {
                copyOnWrite();
                ((CapabilitySync) this.instance).setHasmore(z);
                return this;
            }

            public Builder setMoreData(int i) {
                copyOnWrite();
                ((CapabilitySync) this.instance).setMoreData(i);
                return this;
            }

            public Builder setStartSyncAccept(int i) {
                copyOnWrite();
                ((CapabilitySync) this.instance).setStartSyncAccept(i);
                return this;
            }

            public Builder setStartSyncResult(int i) {
                copyOnWrite();
                ((CapabilitySync) this.instance).setStartSyncResult(i);
                return this;
            }

            private Builder() {
                super(CapabilitySync.DEFAULT_INSTANCE);
            }
        }

        static {
            CapabilitySync capabilitySync = new CapabilitySync();
            DEFAULT_INSTANCE = capabilitySync;
            GeneratedMessageLite.registerDefaultInstance(CapabilitySync.class, capabilitySync);
        }

        private CapabilitySync() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndSyncAccept() {
            this.endSyncAccept_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndSyncResult() {
            this.endSyncResult_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHasmore() {
            this.hasmore_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMoreData() {
            this.moreData_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartSyncAccept() {
            this.startSyncAccept_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartSyncResult() {
            this.startSyncResult_ = 0;
        }

        public static CapabilitySync getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CapabilitySync parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CapabilitySync) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CapabilitySync parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CapabilitySync> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndSyncAccept(int i) {
            this.endSyncAccept_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndSyncResult(int i) {
            this.endSyncResult_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHasmore(boolean z) {
            this.hasmore_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoreData(int i) {
            this.moreData_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartSyncAccept(int i) {
            this.startSyncAccept_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartSyncResult(int i) {
            this.startSyncResult_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new CapabilitySync();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0002\t\u0006\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\t\u0007", new Object[]{"endSyncResult_", "endSyncAccept_", "startSyncResult_", "startSyncAccept_", "moreData_", "hasmore_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CapabilitySync> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CapabilitySync.class) {
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

        @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
        public int getEndSyncAccept() {
            return this.endSyncAccept_;
        }

        @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
        public int getEndSyncResult() {
            return this.endSyncResult_;
        }

        @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
        public boolean getHasmore() {
            return this.hasmore_;
        }

        @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
        public int getMoreData() {
            return this.moreData_;
        }

        @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
        public int getStartSyncAccept() {
            return this.startSyncAccept_;
        }

        @Override // com.op.proto.CapabilitySynData.CapabilitySyncOrBuilder
        public int getStartSyncResult() {
            return this.startSyncResult_;
        }

        public static Builder newBuilder(CapabilitySync capabilitySync) {
            return DEFAULT_INSTANCE.createBuilder(capabilitySync);
        }

        public static CapabilitySync parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CapabilitySync) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CapabilitySync parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CapabilitySync parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CapabilitySync parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CapabilitySync parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CapabilitySync parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CapabilitySync parseFrom(InputStream inputStream) throws IOException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CapabilitySync parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CapabilitySync parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CapabilitySync parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CapabilitySync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CapabilitySyncOrBuilder extends MessageLiteOrBuilder {
        int getEndSyncAccept();

        int getEndSyncResult();

        boolean getHasmore();

        int getMoreData();

        int getStartSyncAccept();

        int getStartSyncResult();
    }

    private CapabilitySynData() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
