package com.heytap.wearable.devicemanager.bean.second;

import com.google.protobuf.AbstractMessageLite;
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

/* JADX INFO: loaded from: classes2.dex */
public final class PairSecond {

    /* JADX INFO: renamed from: com.heytap.wearable.devicemanager.bean.second.PairSecond$1, reason: invalid class name */
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

    public static final class JumpActivity extends GeneratedMessageLite<JumpActivity, Builder> implements JumpActivityOrBuilder {
        private static final JumpActivity DEFAULT_INSTANCE;
        private static volatile Parser<JumpActivity> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<JumpActivity, Builder> implements JumpActivityOrBuilder {
            public Builder clearType() {
                copyOnWrite();
                ((JumpActivity) this.instance).clearType();
                return this;
            }

            @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.JumpActivityOrBuilder
            public int getType() {
                return ((JumpActivity) this.instance).getType();
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((JumpActivity) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(JumpActivity.DEFAULT_INSTANCE);
            }
        }

        static {
            JumpActivity jumpActivity = new JumpActivity();
            DEFAULT_INSTANCE = jumpActivity;
            GeneratedMessageLite.registerDefaultInstance(JumpActivity.class, jumpActivity);
        }

        private JumpActivity() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static JumpActivity getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static JumpActivity parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (JumpActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpActivity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<JumpActivity> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new JumpActivity();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<JumpActivity> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (JumpActivity.class) {
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

        @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.JumpActivityOrBuilder
        public int getType() {
            return this.type_;
        }

        public static Builder newBuilder(JumpActivity jumpActivity) {
            return DEFAULT_INSTANCE.createBuilder(jumpActivity);
        }

        public static JumpActivity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (JumpActivity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static JumpActivity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static JumpActivity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static JumpActivity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static JumpActivity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JumpActivity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static JumpActivity parseFrom(InputStream inputStream) throws IOException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JumpActivity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static JumpActivity parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static JumpActivity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (JumpActivity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface JumpActivityOrBuilder extends MessageLiteOrBuilder {
        int getType();
    }

    public static final class PhoneName extends GeneratedMessageLite<PhoneName, Builder> implements PhoneNameOrBuilder {
        private static final PhoneName DEFAULT_INSTANCE;
        private static volatile Parser<PhoneName> PARSER = null;
        public static final int PRIMARY_NAME_FIELD_NUMBER = 1;
        public static final int SECONDARY_NAME_FIELD_NUMBER = 2;
        private String primaryName_ = "";
        private String secondaryName_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<PhoneName, Builder> implements PhoneNameOrBuilder {
            public Builder clearPrimaryName() {
                copyOnWrite();
                ((PhoneName) this.instance).clearPrimaryName();
                return this;
            }

            public Builder clearSecondaryName() {
                copyOnWrite();
                ((PhoneName) this.instance).clearSecondaryName();
                return this;
            }

            @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
            public String getPrimaryName() {
                return ((PhoneName) this.instance).getPrimaryName();
            }

            @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
            public ByteString getPrimaryNameBytes() {
                return ((PhoneName) this.instance).getPrimaryNameBytes();
            }

            @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
            public String getSecondaryName() {
                return ((PhoneName) this.instance).getSecondaryName();
            }

            @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
            public ByteString getSecondaryNameBytes() {
                return ((PhoneName) this.instance).getSecondaryNameBytes();
            }

            public Builder setPrimaryName(String str) {
                copyOnWrite();
                ((PhoneName) this.instance).setPrimaryName(str);
                return this;
            }

            public Builder setPrimaryNameBytes(ByteString byteString) {
                copyOnWrite();
                ((PhoneName) this.instance).setPrimaryNameBytes(byteString);
                return this;
            }

            public Builder setSecondaryName(String str) {
                copyOnWrite();
                ((PhoneName) this.instance).setSecondaryName(str);
                return this;
            }

            public Builder setSecondaryNameBytes(ByteString byteString) {
                copyOnWrite();
                ((PhoneName) this.instance).setSecondaryNameBytes(byteString);
                return this;
            }

            private Builder() {
                super(PhoneName.DEFAULT_INSTANCE);
            }
        }

        static {
            PhoneName phoneName = new PhoneName();
            DEFAULT_INSTANCE = phoneName;
            GeneratedMessageLite.registerDefaultInstance(PhoneName.class, phoneName);
        }

        private PhoneName() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryName() {
            this.primaryName_ = getDefaultInstance().getPrimaryName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSecondaryName() {
            this.secondaryName_ = getDefaultInstance().getSecondaryName();
        }

        public static PhoneName getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PhoneName parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PhoneName) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PhoneName parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PhoneName> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryName(String str) {
            str.getClass();
            this.primaryName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.primaryName_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryName(String str) {
            str.getClass();
            this.secondaryName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSecondaryNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.secondaryName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new PhoneName();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"primaryName_", "secondaryName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PhoneName> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PhoneName.class) {
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

        @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
        public String getPrimaryName() {
            return this.primaryName_;
        }

        @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
        public ByteString getPrimaryNameBytes() {
            return ByteString.copyFromUtf8(this.primaryName_);
        }

        @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
        public String getSecondaryName() {
            return this.secondaryName_;
        }

        @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.PhoneNameOrBuilder
        public ByteString getSecondaryNameBytes() {
            return ByteString.copyFromUtf8(this.secondaryName_);
        }

        public static Builder newBuilder(PhoneName phoneName) {
            return DEFAULT_INSTANCE.createBuilder(phoneName);
        }

        public static PhoneName parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PhoneName) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PhoneName parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PhoneName parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PhoneName parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PhoneName parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PhoneName parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PhoneName parseFrom(InputStream inputStream) throws IOException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PhoneName parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PhoneName parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PhoneName parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PhoneName) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PhoneNameOrBuilder extends MessageLiteOrBuilder {
        String getPrimaryName();

        ByteString getPrimaryNameBytes();

        String getSecondaryName();

        ByteString getSecondaryNameBytes();
    }

    public static final class Refresh extends GeneratedMessageLite<Refresh, Builder> implements RefreshOrBuilder {
        private static final Refresh DEFAULT_INSTANCE;
        private static volatile Parser<Refresh> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<Refresh, Builder> implements RefreshOrBuilder {
            public Builder clearType() {
                copyOnWrite();
                ((Refresh) this.instance).clearType();
                return this;
            }

            @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.RefreshOrBuilder
            public int getType() {
                return ((Refresh) this.instance).getType();
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((Refresh) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(Refresh.DEFAULT_INSTANCE);
            }
        }

        static {
            Refresh refresh = new Refresh();
            DEFAULT_INSTANCE = refresh;
            GeneratedMessageLite.registerDefaultInstance(Refresh.class, refresh);
        }

        private Refresh() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static Refresh getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Refresh parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Refresh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Refresh parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Refresh> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int i) {
            this.type_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new Refresh();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Refresh> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Refresh.class) {
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

        @Override // com.heytap.wearable.devicemanager.bean.second.PairSecond.RefreshOrBuilder
        public int getType() {
            return this.type_;
        }

        public static Builder newBuilder(Refresh refresh) {
            return DEFAULT_INSTANCE.createBuilder(refresh);
        }

        public static Refresh parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Refresh) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Refresh parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Refresh parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Refresh parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Refresh parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Refresh parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Refresh parseFrom(InputStream inputStream) throws IOException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Refresh parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Refresh parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Refresh parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Refresh) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RefreshOrBuilder extends MessageLiteOrBuilder {
        int getType();
    }

    private PairSecond() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
