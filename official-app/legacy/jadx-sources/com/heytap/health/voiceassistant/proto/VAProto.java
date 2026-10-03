package com.heytap.health.voiceassistant.proto;

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

/* JADX INFO: loaded from: classes18.dex */
public final class VAProto {

    /* JADX INFO: renamed from: com.heytap.health.voiceassistant.proto.VAProto$1, reason: invalid class name */
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

    public static final class App extends GeneratedMessageLite<App, Builder> implements AppOrBuilder {
        private static final App DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PACKAGE_FIELD_NUMBER = 1;
        private static volatile Parser<App> PARSER = null;
        public static final int VERSIONCODE_FIELD_NUMBER = 3;
        public static final int VERSIONNAME_FIELD_NUMBER = 4;
        private int versionCode_;
        private String package_ = "";
        private String name_ = "";
        private String versionName_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<App, Builder> implements AppOrBuilder {
            public Builder clearName() {
                copyOnWrite();
                ((App) this.instance).clearName();
                return this;
            }

            public Builder clearPackage() {
                copyOnWrite();
                ((App) this.instance).clearPackage();
                return this;
            }

            public Builder clearVersionCode() {
                copyOnWrite();
                ((App) this.instance).clearVersionCode();
                return this;
            }

            public Builder clearVersionName() {
                copyOnWrite();
                ((App) this.instance).clearVersionName();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public String getName() {
                return ((App) this.instance).getName();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public ByteString getNameBytes() {
                return ((App) this.instance).getNameBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public String getPackage() {
                return ((App) this.instance).getPackage();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public ByteString getPackageBytes() {
                return ((App) this.instance).getPackageBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public int getVersionCode() {
                return ((App) this.instance).getVersionCode();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public String getVersionName() {
                return ((App) this.instance).getVersionName();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
            public ByteString getVersionNameBytes() {
                return ((App) this.instance).getVersionNameBytes();
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((App) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((App) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setPackage(String str) {
                copyOnWrite();
                ((App) this.instance).setPackage(str);
                return this;
            }

            public Builder setPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((App) this.instance).setPackageBytes(byteString);
                return this;
            }

            public Builder setVersionCode(int i) {
                copyOnWrite();
                ((App) this.instance).setVersionCode(i);
                return this;
            }

            public Builder setVersionName(String str) {
                copyOnWrite();
                ((App) this.instance).setVersionName(str);
                return this;
            }

            public Builder setVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                ((App) this.instance).setVersionNameBytes(byteString);
                return this;
            }

            private Builder() {
                super(App.DEFAULT_INSTANCE);
            }
        }

        static {
            App app = new App();
            DEFAULT_INSTANCE = app;
            GeneratedMessageLite.registerDefaultInstance(App.class, app);
        }

        private App() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackage() {
            this.package_ = getDefaultInstance().getPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionCode() {
            this.versionCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionName() {
            this.versionName_ = getDefaultInstance().getVersionName();
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<App> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackage(String str) {
            str.getClass();
            this.package_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.package_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionCode(int i) {
            this.versionCode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionName(String str) {
            str.getClass();
            this.versionName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.versionName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new App();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004Ȉ", new Object[]{"package_", "name_", "versionCode_", "versionName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<App> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (App.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public String getPackage() {
            return this.package_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public ByteString getPackageBytes() {
            return ByteString.copyFromUtf8(this.package_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public int getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public String getVersionName() {
            return this.versionName_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppOrBuilder
        public ByteString getVersionNameBytes() {
            return ByteString.copyFromUtf8(this.versionName_);
        }

        public static Builder newBuilder(App app) {
            return DEFAULT_INSTANCE.createBuilder(app);
        }

        public static App parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static App parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static App parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static App parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static App parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static App parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (App) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AppList extends GeneratedMessageLite<AppList, Builder> implements AppListOrBuilder {
        private static final AppList DEFAULT_INSTANCE;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile Parser<AppList> PARSER;
        private Internal.ProtobufList<App> list_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<AppList, Builder> implements AppListOrBuilder {
            public Builder addAllList(Iterable<? extends App> iterable) {
                copyOnWrite();
                ((AppList) this.instance).addAllList(iterable);
                return this;
            }

            public Builder addList(App app) {
                copyOnWrite();
                ((AppList) this.instance).addList(app);
                return this;
            }

            public Builder clearList() {
                copyOnWrite();
                ((AppList) this.instance).clearList();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppListOrBuilder
            public App getList(int i) {
                return ((AppList) this.instance).getList(i);
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppListOrBuilder
            public int getListCount() {
                return ((AppList) this.instance).getListCount();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AppListOrBuilder
            public List<App> getListList() {
                return Collections.unmodifiableList(((AppList) this.instance).getListList());
            }

            public Builder removeList(int i) {
                copyOnWrite();
                ((AppList) this.instance).removeList(i);
                return this;
            }

            public Builder setList(int i, App app) {
                copyOnWrite();
                ((AppList) this.instance).setList(i, app);
                return this;
            }

            private Builder() {
                super(AppList.DEFAULT_INSTANCE);
            }

            public Builder addList(int i, App app) {
                copyOnWrite();
                ((AppList) this.instance).addList(i, app);
                return this;
            }

            public Builder setList(int i, App.Builder builder) {
                copyOnWrite();
                ((AppList) this.instance).setList(i, builder.build());
                return this;
            }

            public Builder addList(App.Builder builder) {
                copyOnWrite();
                ((AppList) this.instance).addList(builder.build());
                return this;
            }

            public Builder addList(int i, App.Builder builder) {
                copyOnWrite();
                ((AppList) this.instance).addList(i, builder.build());
                return this;
            }
        }

        static {
            AppList appList = new AppList();
            DEFAULT_INSTANCE = appList;
            GeneratedMessageLite.registerDefaultInstance(AppList.class, appList);
        }

        private AppList() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllList(Iterable<? extends App> iterable) {
            ensureListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.list_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addList(App app) {
            app.getClass();
            ensureListIsMutable();
            this.list_.add(app);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearList() {
            this.list_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureListIsMutable() {
            Internal.ProtobufList<App> protobufList = this.list_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.list_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static AppList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AppList parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AppList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AppList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeList(int i) {
            ensureListIsMutable();
            this.list_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setList(int i, App app) {
            app.getClass();
            ensureListIsMutable();
            this.list_.set(i, app);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new AppList();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"list_", App.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AppList> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AppList.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppListOrBuilder
        public App getList(int i) {
            return this.list_.get(i);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppListOrBuilder
        public int getListCount() {
            return this.list_.size();
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AppListOrBuilder
        public List<App> getListList() {
            return this.list_;
        }

        public AppOrBuilder getListOrBuilder(int i) {
            return this.list_.get(i);
        }

        public List<? extends AppOrBuilder> getListOrBuilderList() {
            return this.list_;
        }

        public static Builder newBuilder(AppList appList) {
            return DEFAULT_INSTANCE.createBuilder(appList);
        }

        public static AppList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AppList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addList(int i, App app) {
            app.getClass();
            ensureListIsMutable();
            this.list_.add(i, app);
        }

        public static AppList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AppList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AppList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AppList parseFrom(InputStream inputStream) throws IOException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AppList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AppList parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AppList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AppList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AppListOrBuilder extends MessageLiteOrBuilder {
        App getList(int i);

        int getListCount();

        List<App> getListList();
    }

    public interface AppOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getPackage();

        ByteString getPackageBytes();

        int getVersionCode();

        String getVersionName();

        ByteString getVersionNameBytes();
    }

    public static final class AsrDirectives extends GeneratedMessageLite<AsrDirectives, Builder> implements AsrDirectivesOrBuilder {
        private static final AsrDirectives DEFAULT_INSTANCE;
        private static volatile Parser<AsrDirectives> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<AsrDirectives, Builder> implements AsrDirectivesOrBuilder {
            public Builder clearText() {
                copyOnWrite();
                ((AsrDirectives) this.instance).clearText();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrDirectivesOrBuilder
            public String getText() {
                return ((AsrDirectives) this.instance).getText();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrDirectivesOrBuilder
            public ByteString getTextBytes() {
                return ((AsrDirectives) this.instance).getTextBytes();
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((AsrDirectives) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((AsrDirectives) this.instance).setTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(AsrDirectives.DEFAULT_INSTANCE);
            }
        }

        static {
            AsrDirectives asrDirectives = new AsrDirectives();
            DEFAULT_INSTANCE = asrDirectives;
            GeneratedMessageLite.registerDefaultInstance(AsrDirectives.class, asrDirectives);
        }

        private AsrDirectives() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static AsrDirectives getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AsrDirectives parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AsrDirectives) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AsrDirectives parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AsrDirectives> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new AsrDirectives();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AsrDirectives> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AsrDirectives.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrDirectivesOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrDirectivesOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public static Builder newBuilder(AsrDirectives asrDirectives) {
            return DEFAULT_INSTANCE.createBuilder(asrDirectives);
        }

        public static AsrDirectives parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AsrDirectives) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AsrDirectives parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AsrDirectives parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AsrDirectives parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AsrDirectives parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AsrDirectives parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AsrDirectives parseFrom(InputStream inputStream) throws IOException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AsrDirectives parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AsrDirectives parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AsrDirectives parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AsrDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AsrDirectivesOrBuilder extends MessageLiteOrBuilder {
        String getText();

        ByteString getTextBytes();
    }

    public static final class AsrResults extends GeneratedMessageLite<AsrResults, Builder> implements AsrResultsOrBuilder {
        private static final AsrResults DEFAULT_INSTANCE;
        public static final int INTENT_FIELD_NUMBER = 3;
        public static final int ISFINAL_FIELD_NUMBER = 5;
        public static final int MSG_ID_FIELD_NUMBER = 1;
        private static volatile Parser<AsrResults> PARSER = null;
        public static final int RESULTS_FIELD_NUMBER = 4;
        public static final int SKILL_FIELD_NUMBER = 2;
        private boolean isFinal_;
        private int msgId_;
        private String skill_ = "";
        private String intent_ = "";
        private String results_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<AsrResults, Builder> implements AsrResultsOrBuilder {
            public Builder clearIntent() {
                copyOnWrite();
                ((AsrResults) this.instance).clearIntent();
                return this;
            }

            public Builder clearIsFinal() {
                copyOnWrite();
                ((AsrResults) this.instance).clearIsFinal();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((AsrResults) this.instance).clearMsgId();
                return this;
            }

            public Builder clearResults() {
                copyOnWrite();
                ((AsrResults) this.instance).clearResults();
                return this;
            }

            public Builder clearSkill() {
                copyOnWrite();
                ((AsrResults) this.instance).clearSkill();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public String getIntent() {
                return ((AsrResults) this.instance).getIntent();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public ByteString getIntentBytes() {
                return ((AsrResults) this.instance).getIntentBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public boolean getIsFinal() {
                return ((AsrResults) this.instance).getIsFinal();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public int getMsgId() {
                return ((AsrResults) this.instance).getMsgId();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public String getResults() {
                return ((AsrResults) this.instance).getResults();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public ByteString getResultsBytes() {
                return ((AsrResults) this.instance).getResultsBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public String getSkill() {
                return ((AsrResults) this.instance).getSkill();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
            public ByteString getSkillBytes() {
                return ((AsrResults) this.instance).getSkillBytes();
            }

            public Builder setIntent(String str) {
                copyOnWrite();
                ((AsrResults) this.instance).setIntent(str);
                return this;
            }

            public Builder setIntentBytes(ByteString byteString) {
                copyOnWrite();
                ((AsrResults) this.instance).setIntentBytes(byteString);
                return this;
            }

            public Builder setIsFinal(boolean z) {
                copyOnWrite();
                ((AsrResults) this.instance).setIsFinal(z);
                return this;
            }

            public Builder setMsgId(int i) {
                copyOnWrite();
                ((AsrResults) this.instance).setMsgId(i);
                return this;
            }

            public Builder setResults(String str) {
                copyOnWrite();
                ((AsrResults) this.instance).setResults(str);
                return this;
            }

            public Builder setResultsBytes(ByteString byteString) {
                copyOnWrite();
                ((AsrResults) this.instance).setResultsBytes(byteString);
                return this;
            }

            public Builder setSkill(String str) {
                copyOnWrite();
                ((AsrResults) this.instance).setSkill(str);
                return this;
            }

            public Builder setSkillBytes(ByteString byteString) {
                copyOnWrite();
                ((AsrResults) this.instance).setSkillBytes(byteString);
                return this;
            }

            private Builder() {
                super(AsrResults.DEFAULT_INSTANCE);
            }
        }

        static {
            AsrResults asrResults = new AsrResults();
            DEFAULT_INSTANCE = asrResults;
            GeneratedMessageLite.registerDefaultInstance(AsrResults.class, asrResults);
        }

        private AsrResults() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntent() {
            this.intent_ = getDefaultInstance().getIntent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsFinal() {
            this.isFinal_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResults() {
            this.results_ = getDefaultInstance().getResults();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkill() {
            this.skill_ = getDefaultInstance().getSkill();
        }

        public static AsrResults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AsrResults parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AsrResults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AsrResults parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AsrResults> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntent(String str) {
            str.getClass();
            this.intent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntentBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.intent_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsFinal(boolean z) {
            this.isFinal_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(int i) {
            this.msgId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResults(String str) {
            str.getClass();
            this.results_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.results_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkill(String str) {
            str.getClass();
            this.skill_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkillBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.skill_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new AsrResults();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"msgId_", "skill_", "intent_", "results_", "isFinal_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AsrResults> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AsrResults.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public String getIntent() {
            return this.intent_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public ByteString getIntentBytes() {
            return ByteString.copyFromUtf8(this.intent_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public boolean getIsFinal() {
            return this.isFinal_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public int getMsgId() {
            return this.msgId_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public String getResults() {
            return this.results_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public ByteString getResultsBytes() {
            return ByteString.copyFromUtf8(this.results_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public String getSkill() {
            return this.skill_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.AsrResultsOrBuilder
        public ByteString getSkillBytes() {
            return ByteString.copyFromUtf8(this.skill_);
        }

        public static Builder newBuilder(AsrResults asrResults) {
            return DEFAULT_INSTANCE.createBuilder(asrResults);
        }

        public static AsrResults parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AsrResults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AsrResults parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AsrResults parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AsrResults parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AsrResults parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AsrResults parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AsrResults parseFrom(InputStream inputStream) throws IOException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AsrResults parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AsrResults parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AsrResults parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AsrResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AsrResultsOrBuilder extends MessageLiteOrBuilder {
        String getIntent();

        ByteString getIntentBytes();

        boolean getIsFinal();

        int getMsgId();

        String getResults();

        ByteString getResultsBytes();

        String getSkill();

        ByteString getSkillBytes();
    }

    public static final class BreenoCarBind2 extends GeneratedMessageLite<BreenoCarBind2, Builder> implements BreenoCarBind2OrBuilder {
        private static final BreenoCarBind2 DEFAULT_INSTANCE;
        public static final int PAGEPATH_FIELD_NUMBER = 1;
        private static volatile Parser<BreenoCarBind2> PARSER;
        private String pagePath_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<BreenoCarBind2, Builder> implements BreenoCarBind2OrBuilder {
            public Builder clearPagePath() {
                copyOnWrite();
                ((BreenoCarBind2) this.instance).clearPagePath();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoCarBind2OrBuilder
            public String getPagePath() {
                return ((BreenoCarBind2) this.instance).getPagePath();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoCarBind2OrBuilder
            public ByteString getPagePathBytes() {
                return ((BreenoCarBind2) this.instance).getPagePathBytes();
            }

            public Builder setPagePath(String str) {
                copyOnWrite();
                ((BreenoCarBind2) this.instance).setPagePath(str);
                return this;
            }

            public Builder setPagePathBytes(ByteString byteString) {
                copyOnWrite();
                ((BreenoCarBind2) this.instance).setPagePathBytes(byteString);
                return this;
            }

            private Builder() {
                super(BreenoCarBind2.DEFAULT_INSTANCE);
            }
        }

        static {
            BreenoCarBind2 breenoCarBind2 = new BreenoCarBind2();
            DEFAULT_INSTANCE = breenoCarBind2;
            GeneratedMessageLite.registerDefaultInstance(BreenoCarBind2.class, breenoCarBind2);
        }

        private BreenoCarBind2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPagePath() {
            this.pagePath_ = getDefaultInstance().getPagePath();
        }

        public static BreenoCarBind2 getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BreenoCarBind2 parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BreenoCarBind2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BreenoCarBind2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BreenoCarBind2> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPagePath(String str) {
            str.getClass();
            this.pagePath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPagePathBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.pagePath_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new BreenoCarBind2();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"pagePath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BreenoCarBind2> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BreenoCarBind2.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoCarBind2OrBuilder
        public String getPagePath() {
            return this.pagePath_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoCarBind2OrBuilder
        public ByteString getPagePathBytes() {
            return ByteString.copyFromUtf8(this.pagePath_);
        }

        public static Builder newBuilder(BreenoCarBind2 breenoCarBind2) {
            return DEFAULT_INSTANCE.createBuilder(breenoCarBind2);
        }

        public static BreenoCarBind2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BreenoCarBind2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BreenoCarBind2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BreenoCarBind2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BreenoCarBind2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BreenoCarBind2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BreenoCarBind2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BreenoCarBind2 parseFrom(InputStream inputStream) throws IOException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BreenoCarBind2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BreenoCarBind2 parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BreenoCarBind2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BreenoCarBind2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BreenoCarBind2OrBuilder extends MessageLiteOrBuilder {
        String getPagePath();

        ByteString getPagePathBytes();
    }

    public static final class BreenoDirectives extends GeneratedMessageLite<BreenoDirectives, Builder> implements BreenoDirectivesOrBuilder {
        private static final BreenoDirectives DEFAULT_INSTANCE;
        public static final int ISMICON_FIELD_NUMBER = 2;
        private static volatile Parser<BreenoDirectives> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private boolean isMicOn_;
        private String text_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<BreenoDirectives, Builder> implements BreenoDirectivesOrBuilder {
            public Builder clearIsMicOn() {
                copyOnWrite();
                ((BreenoDirectives) this.instance).clearIsMicOn();
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((BreenoDirectives) this.instance).clearText();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoDirectivesOrBuilder
            public boolean getIsMicOn() {
                return ((BreenoDirectives) this.instance).getIsMicOn();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoDirectivesOrBuilder
            public String getText() {
                return ((BreenoDirectives) this.instance).getText();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoDirectivesOrBuilder
            public ByteString getTextBytes() {
                return ((BreenoDirectives) this.instance).getTextBytes();
            }

            public Builder setIsMicOn(boolean z) {
                copyOnWrite();
                ((BreenoDirectives) this.instance).setIsMicOn(z);
                return this;
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((BreenoDirectives) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((BreenoDirectives) this.instance).setTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(BreenoDirectives.DEFAULT_INSTANCE);
            }
        }

        static {
            BreenoDirectives breenoDirectives = new BreenoDirectives();
            DEFAULT_INSTANCE = breenoDirectives;
            GeneratedMessageLite.registerDefaultInstance(BreenoDirectives.class, breenoDirectives);
        }

        private BreenoDirectives() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsMicOn() {
            this.isMicOn_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static BreenoDirectives getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BreenoDirectives parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BreenoDirectives) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BreenoDirectives parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BreenoDirectives> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsMicOn(boolean z) {
            this.isMicOn_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new BreenoDirectives();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"text_", "isMicOn_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BreenoDirectives> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BreenoDirectives.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoDirectivesOrBuilder
        public boolean getIsMicOn() {
            return this.isMicOn_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoDirectivesOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.BreenoDirectivesOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public static Builder newBuilder(BreenoDirectives breenoDirectives) {
            return DEFAULT_INSTANCE.createBuilder(breenoDirectives);
        }

        public static BreenoDirectives parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BreenoDirectives) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BreenoDirectives parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BreenoDirectives parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BreenoDirectives parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BreenoDirectives parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BreenoDirectives parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BreenoDirectives parseFrom(InputStream inputStream) throws IOException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BreenoDirectives parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BreenoDirectives parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BreenoDirectives parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BreenoDirectives) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BreenoDirectivesOrBuilder extends MessageLiteOrBuilder {
        boolean getIsMicOn();

        String getText();

        ByteString getTextBytes();
    }

    public static final class DeviceCmd extends GeneratedMessageLite<DeviceCmd, Builder> implements DeviceCmdOrBuilder {
        private static final DeviceCmd DEFAULT_INSTANCE;
        private static volatile Parser<DeviceCmd> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private ByteString text_ = ByteString.EMPTY;
        private int type_;

        public static final class Builder extends GeneratedMessageLite.Builder<DeviceCmd, Builder> implements DeviceCmdOrBuilder {
            public Builder clearText() {
                copyOnWrite();
                ((DeviceCmd) this.instance).clearText();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((DeviceCmd) this.instance).clearType();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceCmdOrBuilder
            public ByteString getText() {
                return ((DeviceCmd) this.instance).getText();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceCmdOrBuilder
            public int getType() {
                return ((DeviceCmd) this.instance).getType();
            }

            public Builder setText(ByteString byteString) {
                copyOnWrite();
                ((DeviceCmd) this.instance).setText(byteString);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((DeviceCmd) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(DeviceCmd.DEFAULT_INSTANCE);
            }
        }

        static {
            DeviceCmd deviceCmd = new DeviceCmd();
            DEFAULT_INSTANCE = deviceCmd;
            GeneratedMessageLite.registerDefaultInstance(DeviceCmd.class, deviceCmd);
        }

        private DeviceCmd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static DeviceCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceCmd parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceCmd) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceCmd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeviceCmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(ByteString byteString) {
            byteString.getClass();
            this.text_ = byteString;
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
                    return new DeviceCmd();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"type_", "text_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DeviceCmd> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DeviceCmd.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceCmdOrBuilder
        public ByteString getText() {
            return this.text_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceCmdOrBuilder
        public int getType() {
            return this.type_;
        }

        public static Builder newBuilder(DeviceCmd deviceCmd) {
            return DEFAULT_INSTANCE.createBuilder(deviceCmd);
        }

        public static DeviceCmd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceCmd) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceCmd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeviceCmd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeviceCmd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeviceCmd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceCmd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeviceCmd parseFrom(InputStream inputStream) throws IOException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceCmd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceCmd parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeviceCmd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DeviceCmdOrBuilder extends MessageLiteOrBuilder {
        ByteString getText();

        int getType();
    }

    public static final class DeviceTTS extends GeneratedMessageLite<DeviceTTS, Builder> implements DeviceTTSOrBuilder {
        private static final DeviceTTS DEFAULT_INSTANCE;
        private static volatile Parser<DeviceTTS> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<DeviceTTS, Builder> implements DeviceTTSOrBuilder {
            public Builder clearText() {
                copyOnWrite();
                ((DeviceTTS) this.instance).clearText();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceTTSOrBuilder
            public String getText() {
                return ((DeviceTTS) this.instance).getText();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceTTSOrBuilder
            public ByteString getTextBytes() {
                return ((DeviceTTS) this.instance).getTextBytes();
            }

            public Builder setText(String str) {
                copyOnWrite();
                ((DeviceTTS) this.instance).setText(str);
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                copyOnWrite();
                ((DeviceTTS) this.instance).setTextBytes(byteString);
                return this;
            }

            private Builder() {
                super(DeviceTTS.DEFAULT_INSTANCE);
            }
        }

        static {
            DeviceTTS deviceTTS = new DeviceTTS();
            DEFAULT_INSTANCE = deviceTTS;
            GeneratedMessageLite.registerDefaultInstance(DeviceTTS.class, deviceTTS);
        }

        private DeviceTTS() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public static DeviceTTS getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceTTS parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceTTS) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceTTS parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DeviceTTS> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String str) {
            str.getClass();
            this.text_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.text_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new DeviceTTS();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DeviceTTS> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DeviceTTS.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceTTSOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.DeviceTTSOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public static Builder newBuilder(DeviceTTS deviceTTS) {
            return DEFAULT_INSTANCE.createBuilder(deviceTTS);
        }

        public static DeviceTTS parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceTTS) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceTTS parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeviceTTS parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DeviceTTS parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DeviceTTS parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceTTS parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DeviceTTS parseFrom(InputStream inputStream) throws IOException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceTTS parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceTTS parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeviceTTS parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceTTS) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DeviceTTSOrBuilder extends MessageLiteOrBuilder {
        String getText();

        ByteString getTextBytes();
    }

    public static final class NlpResults extends GeneratedMessageLite<NlpResults, Builder> implements NlpResultsOrBuilder {
        private static final NlpResults DEFAULT_INSTANCE;
        public static final int INTENT_FIELD_NUMBER = 3;
        public static final int MSG_ID_FIELD_NUMBER = 1;
        private static volatile Parser<NlpResults> PARSER = null;
        public static final int RESULTS_FIELD_NUMBER = 4;
        public static final int SKILL_FIELD_NUMBER = 2;
        private int msgId_;
        private String skill_ = "";
        private String intent_ = "";
        private String results_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<NlpResults, Builder> implements NlpResultsOrBuilder {
            public Builder clearIntent() {
                copyOnWrite();
                ((NlpResults) this.instance).clearIntent();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((NlpResults) this.instance).clearMsgId();
                return this;
            }

            public Builder clearResults() {
                copyOnWrite();
                ((NlpResults) this.instance).clearResults();
                return this;
            }

            public Builder clearSkill() {
                copyOnWrite();
                ((NlpResults) this.instance).clearSkill();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public String getIntent() {
                return ((NlpResults) this.instance).getIntent();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public ByteString getIntentBytes() {
                return ((NlpResults) this.instance).getIntentBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public int getMsgId() {
                return ((NlpResults) this.instance).getMsgId();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public String getResults() {
                return ((NlpResults) this.instance).getResults();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public ByteString getResultsBytes() {
                return ((NlpResults) this.instance).getResultsBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public String getSkill() {
                return ((NlpResults) this.instance).getSkill();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
            public ByteString getSkillBytes() {
                return ((NlpResults) this.instance).getSkillBytes();
            }

            public Builder setIntent(String str) {
                copyOnWrite();
                ((NlpResults) this.instance).setIntent(str);
                return this;
            }

            public Builder setIntentBytes(ByteString byteString) {
                copyOnWrite();
                ((NlpResults) this.instance).setIntentBytes(byteString);
                return this;
            }

            public Builder setMsgId(int i) {
                copyOnWrite();
                ((NlpResults) this.instance).setMsgId(i);
                return this;
            }

            public Builder setResults(String str) {
                copyOnWrite();
                ((NlpResults) this.instance).setResults(str);
                return this;
            }

            public Builder setResultsBytes(ByteString byteString) {
                copyOnWrite();
                ((NlpResults) this.instance).setResultsBytes(byteString);
                return this;
            }

            public Builder setSkill(String str) {
                copyOnWrite();
                ((NlpResults) this.instance).setSkill(str);
                return this;
            }

            public Builder setSkillBytes(ByteString byteString) {
                copyOnWrite();
                ((NlpResults) this.instance).setSkillBytes(byteString);
                return this;
            }

            private Builder() {
                super(NlpResults.DEFAULT_INSTANCE);
            }
        }

        static {
            NlpResults nlpResults = new NlpResults();
            DEFAULT_INSTANCE = nlpResults;
            GeneratedMessageLite.registerDefaultInstance(NlpResults.class, nlpResults);
        }

        private NlpResults() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntent() {
            this.intent_ = getDefaultInstance().getIntent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResults() {
            this.results_ = getDefaultInstance().getResults();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkill() {
            this.skill_ = getDefaultInstance().getSkill();
        }

        public static NlpResults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NlpResults parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NlpResults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NlpResults parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NlpResults> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntent(String str) {
            str.getClass();
            this.intent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntentBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.intent_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(int i) {
            this.msgId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResults(String str) {
            str.getClass();
            this.results_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.results_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkill(String str) {
            str.getClass();
            this.skill_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkillBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.skill_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new NlpResults();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"msgId_", "skill_", "intent_", "results_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NlpResults> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NlpResults.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public String getIntent() {
            return this.intent_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public ByteString getIntentBytes() {
            return ByteString.copyFromUtf8(this.intent_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public int getMsgId() {
            return this.msgId_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public String getResults() {
            return this.results_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public ByteString getResultsBytes() {
            return ByteString.copyFromUtf8(this.results_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public String getSkill() {
            return this.skill_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.NlpResultsOrBuilder
        public ByteString getSkillBytes() {
            return ByteString.copyFromUtf8(this.skill_);
        }

        public static Builder newBuilder(NlpResults nlpResults) {
            return DEFAULT_INSTANCE.createBuilder(nlpResults);
        }

        public static NlpResults parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NlpResults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NlpResults parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NlpResults parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NlpResults parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NlpResults parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NlpResults parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NlpResults parseFrom(InputStream inputStream) throws IOException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NlpResults parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NlpResults parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NlpResults parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NlpResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NlpResultsOrBuilder extends MessageLiteOrBuilder {
        String getIntent();

        ByteString getIntentBytes();

        int getMsgId();

        String getResults();

        ByteString getResultsBytes();

        String getSkill();

        ByteString getSkillBytes();
    }

    public enum SessionOpenStatus implements Internal.EnumLite {
        SESSION_STATUS_OK(0),
        SESSION_STATUS_NO_NET(-1),
        SESSION_STATUS_NO_NET_PERMISSION(-2),
        SESSION_STATUS_HEAR_BEAT_ERROR(-3),
        SESSION_STATUS_ENGINE_INIT_FAIL(-4),
        SESSION_STATUS_NO_LOGIN(-5),
        SESSION_STATUS_OTHER_ERROR(-99),
        UNRECOGNIZED(-1);

        public static final int SESSION_STATUS_ENGINE_INIT_FAIL_VALUE = -4;
        public static final int SESSION_STATUS_HEAR_BEAT_ERROR_VALUE = -3;
        public static final int SESSION_STATUS_NO_LOGIN_VALUE = -5;
        public static final int SESSION_STATUS_NO_NET_PERMISSION_VALUE = -2;
        public static final int SESSION_STATUS_NO_NET_VALUE = -1;
        public static final int SESSION_STATUS_OK_VALUE = 0;
        public static final int SESSION_STATUS_OTHER_ERROR_VALUE = -99;
        private static final Internal.EnumLiteMap<SessionOpenStatus> internalValueMap = new Internal.EnumLiteMap<SessionOpenStatus>() { // from class: com.heytap.health.voiceassistant.proto.VAProto.SessionOpenStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SessionOpenStatus findValueByNumber(int i) {
                return SessionOpenStatus.forNumber(i);
            }
        };
        private final int value;

        public static final class SessionOpenStatusVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new SessionOpenStatusVerifier();

            private SessionOpenStatusVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return SessionOpenStatus.forNumber(i) != null;
            }
        }

        SessionOpenStatus(int i) {
            this.value = i;
        }

        public static SessionOpenStatus forNumber(int i) {
            if (i == -99) {
                return SESSION_STATUS_OTHER_ERROR;
            }
            if (i == -5) {
                return SESSION_STATUS_NO_LOGIN;
            }
            if (i == -4) {
                return SESSION_STATUS_ENGINE_INIT_FAIL;
            }
            if (i == -3) {
                return SESSION_STATUS_HEAR_BEAT_ERROR;
            }
            if (i == -2) {
                return SESSION_STATUS_NO_NET_PERMISSION;
            }
            if (i == -1) {
                return SESSION_STATUS_NO_NET;
            }
            if (i != 0) {
                return null;
            }
            return SESSION_STATUS_OK;
        }

        public static Internal.EnumLiteMap<SessionOpenStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SessionOpenStatusVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static SessionOpenStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class SupportVoiceRecognize extends GeneratedMessageLite<SupportVoiceRecognize, Builder> implements SupportVoiceRecognizeOrBuilder {
        private static final SupportVoiceRecognize DEFAULT_INSTANCE;
        private static volatile Parser<SupportVoiceRecognize> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int status_;

        public static final class Builder extends GeneratedMessageLite.Builder<SupportVoiceRecognize, Builder> implements SupportVoiceRecognizeOrBuilder {
            public Builder clearStatus() {
                copyOnWrite();
                ((SupportVoiceRecognize) this.instance).clearStatus();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.SupportVoiceRecognizeOrBuilder
            public int getStatus() {
                return ((SupportVoiceRecognize) this.instance).getStatus();
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((SupportVoiceRecognize) this.instance).setStatus(i);
                return this;
            }

            private Builder() {
                super(SupportVoiceRecognize.DEFAULT_INSTANCE);
            }
        }

        static {
            SupportVoiceRecognize supportVoiceRecognize = new SupportVoiceRecognize();
            DEFAULT_INSTANCE = supportVoiceRecognize;
            GeneratedMessageLite.registerDefaultInstance(SupportVoiceRecognize.class, supportVoiceRecognize);
        }

        private SupportVoiceRecognize() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        public static SupportVoiceRecognize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SupportVoiceRecognize parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SupportVoiceRecognize parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SupportVoiceRecognize> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(int i) {
            this.status_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new SupportVoiceRecognize();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"status_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SupportVoiceRecognize> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SupportVoiceRecognize.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.SupportVoiceRecognizeOrBuilder
        public int getStatus() {
            return this.status_;
        }

        public static Builder newBuilder(SupportVoiceRecognize supportVoiceRecognize) {
            return DEFAULT_INSTANCE.createBuilder(supportVoiceRecognize);
        }

        public static SupportVoiceRecognize parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SupportVoiceRecognize parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SupportVoiceRecognize parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SupportVoiceRecognize parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SupportVoiceRecognize parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SupportVoiceRecognize parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SupportVoiceRecognize parseFrom(InputStream inputStream) throws IOException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SupportVoiceRecognize parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SupportVoiceRecognize parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SupportVoiceRecognize parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SupportVoiceRecognize) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SupportVoiceRecognizeOrBuilder extends MessageLiteOrBuilder {
        int getStatus();
    }

    public static final class TtsBytes extends GeneratedMessageLite<TtsBytes, Builder> implements TtsBytesOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final TtsBytes DEFAULT_INSTANCE;
        public static final int FINISH_FIELD_NUMBER = 2;
        private static volatile Parser<TtsBytes> PARSER;
        private ByteString data_ = ByteString.EMPTY;
        private boolean finish_;

        public static final class Builder extends GeneratedMessageLite.Builder<TtsBytes, Builder> implements TtsBytesOrBuilder {
            public Builder clearData() {
                copyOnWrite();
                ((TtsBytes) this.instance).clearData();
                return this;
            }

            public Builder clearFinish() {
                copyOnWrite();
                ((TtsBytes) this.instance).clearFinish();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.TtsBytesOrBuilder
            public ByteString getData() {
                return ((TtsBytes) this.instance).getData();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.TtsBytesOrBuilder
            public boolean getFinish() {
                return ((TtsBytes) this.instance).getFinish();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ((TtsBytes) this.instance).setData(byteString);
                return this;
            }

            public Builder setFinish(boolean z) {
                copyOnWrite();
                ((TtsBytes) this.instance).setFinish(z);
                return this;
            }

            private Builder() {
                super(TtsBytes.DEFAULT_INSTANCE);
            }
        }

        static {
            TtsBytes ttsBytes = new TtsBytes();
            DEFAULT_INSTANCE = ttsBytes;
            GeneratedMessageLite.registerDefaultInstance(TtsBytes.class, ttsBytes);
        }

        private TtsBytes() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFinish() {
            this.finish_ = false;
        }

        public static TtsBytes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TtsBytes parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TtsBytes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TtsBytes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<TtsBytes> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFinish(boolean z) {
            this.finish_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new TtsBytes();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0007", new Object[]{"data_", "finish_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TtsBytes> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TtsBytes.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.TtsBytesOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.TtsBytesOrBuilder
        public boolean getFinish() {
            return this.finish_;
        }

        public static Builder newBuilder(TtsBytes ttsBytes) {
            return DEFAULT_INSTANCE.createBuilder(ttsBytes);
        }

        public static TtsBytes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TtsBytes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TtsBytes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TtsBytes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TtsBytes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TtsBytes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TtsBytes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TtsBytes parseFrom(InputStream inputStream) throws IOException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TtsBytes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TtsBytes parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TtsBytes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TtsBytes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TtsBytesOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();

        boolean getFinish();
    }

    public static final class UploadMemoryResult extends GeneratedMessageLite<UploadMemoryResult, Builder> implements UploadMemoryResultOrBuilder {
        public static final int CREATETIME_FIELD_NUMBER = 2;
        private static final UploadMemoryResult DEFAULT_INSTANCE;
        public static final int EXTEND_FIELD_NUMBER = 4;
        public static final int MEMORYID_FIELD_NUMBER = 3;
        private static volatile Parser<UploadMemoryResult> PARSER = null;
        public static final int RESULTCODE_FIELD_NUMBER = 1;
        private String resultCode_ = "";
        private String createTime_ = "";
        private String memoryId_ = "";
        private String extend_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<UploadMemoryResult, Builder> implements UploadMemoryResultOrBuilder {
            public Builder clearCreateTime() {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).clearCreateTime();
                return this;
            }

            public Builder clearExtend() {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).clearExtend();
                return this;
            }

            public Builder clearMemoryId() {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).clearMemoryId();
                return this;
            }

            public Builder clearResultCode() {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).clearResultCode();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public String getCreateTime() {
                return ((UploadMemoryResult) this.instance).getCreateTime();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public ByteString getCreateTimeBytes() {
                return ((UploadMemoryResult) this.instance).getCreateTimeBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public String getExtend() {
                return ((UploadMemoryResult) this.instance).getExtend();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public ByteString getExtendBytes() {
                return ((UploadMemoryResult) this.instance).getExtendBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public String getMemoryId() {
                return ((UploadMemoryResult) this.instance).getMemoryId();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public ByteString getMemoryIdBytes() {
                return ((UploadMemoryResult) this.instance).getMemoryIdBytes();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public String getResultCode() {
                return ((UploadMemoryResult) this.instance).getResultCode();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
            public ByteString getResultCodeBytes() {
                return ((UploadMemoryResult) this.instance).getResultCodeBytes();
            }

            public Builder setCreateTime(String str) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setCreateTime(str);
                return this;
            }

            public Builder setCreateTimeBytes(ByteString byteString) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setCreateTimeBytes(byteString);
                return this;
            }

            public Builder setExtend(String str) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setExtend(str);
                return this;
            }

            public Builder setExtendBytes(ByteString byteString) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setExtendBytes(byteString);
                return this;
            }

            public Builder setMemoryId(String str) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setMemoryId(str);
                return this;
            }

            public Builder setMemoryIdBytes(ByteString byteString) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setMemoryIdBytes(byteString);
                return this;
            }

            public Builder setResultCode(String str) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setResultCode(str);
                return this;
            }

            public Builder setResultCodeBytes(ByteString byteString) {
                copyOnWrite();
                ((UploadMemoryResult) this.instance).setResultCodeBytes(byteString);
                return this;
            }

            private Builder() {
                super(UploadMemoryResult.DEFAULT_INSTANCE);
            }
        }

        static {
            UploadMemoryResult uploadMemoryResult = new UploadMemoryResult();
            DEFAULT_INSTANCE = uploadMemoryResult;
            GeneratedMessageLite.registerDefaultInstance(UploadMemoryResult.class, uploadMemoryResult);
        }

        private UploadMemoryResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateTime() {
            this.createTime_ = getDefaultInstance().getCreateTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtend() {
            this.extend_ = getDefaultInstance().getExtend();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMemoryId() {
            this.memoryId_ = getDefaultInstance().getMemoryId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = getDefaultInstance().getResultCode();
        }

        public static UploadMemoryResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UploadMemoryResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UploadMemoryResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UploadMemoryResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UploadMemoryResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTime(String str) {
            str.getClass();
            this.createTime_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTimeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.createTime_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtend(String str) {
            str.getClass();
            this.extend_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.extend_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryId(String str) {
            str.getClass();
            this.memoryId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMemoryIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.memoryId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(String str) {
            str.getClass();
            this.resultCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCodeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.resultCode_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new UploadMemoryResult();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resultCode_", "createTime_", "memoryId_", "extend_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UploadMemoryResult> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UploadMemoryResult.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public String getCreateTime() {
            return this.createTime_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public ByteString getCreateTimeBytes() {
            return ByteString.copyFromUtf8(this.createTime_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public String getExtend() {
            return this.extend_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public ByteString getExtendBytes() {
            return ByteString.copyFromUtf8(this.extend_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public String getMemoryId() {
            return this.memoryId_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public ByteString getMemoryIdBytes() {
            return ByteString.copyFromUtf8(this.memoryId_);
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public String getResultCode() {
            return this.resultCode_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.UploadMemoryResultOrBuilder
        public ByteString getResultCodeBytes() {
            return ByteString.copyFromUtf8(this.resultCode_);
        }

        public static Builder newBuilder(UploadMemoryResult uploadMemoryResult) {
            return DEFAULT_INSTANCE.createBuilder(uploadMemoryResult);
        }

        public static UploadMemoryResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UploadMemoryResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UploadMemoryResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UploadMemoryResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UploadMemoryResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UploadMemoryResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UploadMemoryResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UploadMemoryResult parseFrom(InputStream inputStream) throws IOException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UploadMemoryResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UploadMemoryResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UploadMemoryResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UploadMemoryResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UploadMemoryResultOrBuilder extends MessageLiteOrBuilder {
        String getCreateTime();

        ByteString getCreateTimeBytes();

        String getExtend();

        ByteString getExtendBytes();

        String getMemoryId();

        ByteString getMemoryIdBytes();

        String getResultCode();

        ByteString getResultCodeBytes();
    }

    public enum VACommand implements Internal.EnumLite {
        START_NEW_SESSION(0),
        SESSION_DATA(1),
        SESSION_ASR_RESULT(2),
        SESSION_NLP_RESULT(3),
        ENTER_BREENO(4),
        OUT_BREENO(5),
        DEVICE_CMD(6),
        DEVICE_TTS(7),
        NEW_ASR_RESPONSE(8),
        NEW_STREAM_TEXT_CARD_RESPONSE(9),
        DEVICE_UPLOAD_APPS(10),
        DEVICE_UPLOAD_MEMORY_RESULT(11),
        DEVICE_OPEN_PAGE(12),
        SEND_CAR_STATUS(13),
        OVS_WATCH_WAKEUP_SWITCH(20),
        OVS_RECOGNIZE_DATA(21),
        OVS_RECOGNIZE_RESULT(22),
        UNRECOGNIZED(-1);

        public static final int DEVICE_CMD_VALUE = 6;
        public static final int DEVICE_OPEN_PAGE_VALUE = 12;
        public static final int DEVICE_TTS_VALUE = 7;
        public static final int DEVICE_UPLOAD_APPS_VALUE = 10;
        public static final int DEVICE_UPLOAD_MEMORY_RESULT_VALUE = 11;
        public static final int ENTER_BREENO_VALUE = 4;
        public static final int NEW_ASR_RESPONSE_VALUE = 8;
        public static final int NEW_STREAM_TEXT_CARD_RESPONSE_VALUE = 9;
        public static final int OUT_BREENO_VALUE = 5;
        public static final int OVS_RECOGNIZE_DATA_VALUE = 21;
        public static final int OVS_RECOGNIZE_RESULT_VALUE = 22;
        public static final int OVS_WATCH_WAKEUP_SWITCH_VALUE = 20;
        public static final int SEND_CAR_STATUS_VALUE = 13;
        public static final int SESSION_ASR_RESULT_VALUE = 2;
        public static final int SESSION_DATA_VALUE = 1;
        public static final int SESSION_NLP_RESULT_VALUE = 3;
        public static final int START_NEW_SESSION_VALUE = 0;
        private static final Internal.EnumLiteMap<VACommand> internalValueMap = new Internal.EnumLiteMap<VACommand>() { // from class: com.heytap.health.voiceassistant.proto.VAProto.VACommand.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VACommand findValueByNumber(int i) {
                return VACommand.forNumber(i);
            }
        };
        private final int value;

        public static final class VACommandVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new VACommandVerifier();

            private VACommandVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return VACommand.forNumber(i) != null;
            }
        }

        VACommand(int i) {
            this.value = i;
        }

        public static VACommand forNumber(int i) {
            switch (i) {
                case 0:
                    return START_NEW_SESSION;
                case 1:
                    return SESSION_DATA;
                case 2:
                    return SESSION_ASR_RESULT;
                case 3:
                    return SESSION_NLP_RESULT;
                case 4:
                    return ENTER_BREENO;
                case 5:
                    return OUT_BREENO;
                case 6:
                    return DEVICE_CMD;
                case 7:
                    return DEVICE_TTS;
                case 8:
                    return NEW_ASR_RESPONSE;
                case 9:
                    return NEW_STREAM_TEXT_CARD_RESPONSE;
                case 10:
                    return DEVICE_UPLOAD_APPS;
                case 11:
                    return DEVICE_UPLOAD_MEMORY_RESULT;
                case 12:
                    return DEVICE_OPEN_PAGE;
                case 13:
                    return SEND_CAR_STATUS;
                default:
                    switch (i) {
                        case 20:
                            return OVS_WATCH_WAKEUP_SWITCH;
                        case 21:
                            return OVS_RECOGNIZE_DATA;
                        case 22:
                            return OVS_RECOGNIZE_RESULT;
                        default:
                            return null;
                    }
            }
        }

        public static Internal.EnumLiteMap<VACommand> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return VACommandVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static VACommand valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VmDevice extends GeneratedMessageLite<VmDevice, Builder> implements VmDeviceOrBuilder {
        private static final VmDevice DEFAULT_INSTANCE;
        private static volatile Parser<VmDevice> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private String version_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<VmDevice, Builder> implements VmDeviceOrBuilder {
            public Builder clearVersion() {
                copyOnWrite();
                ((VmDevice) this.instance).clearVersion();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VmDeviceOrBuilder
            public String getVersion() {
                return ((VmDevice) this.instance).getVersion();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VmDeviceOrBuilder
            public ByteString getVersionBytes() {
                return ((VmDevice) this.instance).getVersionBytes();
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((VmDevice) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                ((VmDevice) this.instance).setVersionBytes(byteString);
                return this;
            }

            private Builder() {
                super(VmDevice.DEFAULT_INSTANCE);
            }
        }

        static {
            VmDevice vmDevice = new VmDevice();
            DEFAULT_INSTANCE = vmDevice;
            GeneratedMessageLite.registerDefaultInstance(VmDevice.class, vmDevice);
        }

        private VmDevice() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static VmDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VmDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VmDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VmDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VmDevice> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new VmDevice();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VmDevice> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VmDevice.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VmDeviceOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VmDeviceOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        public static Builder newBuilder(VmDevice vmDevice) {
            return DEFAULT_INSTANCE.createBuilder(vmDevice);
        }

        public static VmDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VmDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VmDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VmDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VmDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VmDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VmDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VmDevice parseFrom(InputStream inputStream) throws IOException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VmDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VmDevice parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VmDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VmDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VmDeviceOrBuilder extends MessageLiteOrBuilder {
        String getVersion();

        ByteString getVersionBytes();
    }

    public static final class VmResults extends GeneratedMessageLite<VmResults, Builder> implements VmResultsOrBuilder {
        private static final VmResults DEFAULT_INSTANCE;
        private static volatile Parser<VmResults> PARSER = null;
        public static final int RESULT_CODE_FIELD_NUMBER = 1;
        private int resultCode_;

        public static final class Builder extends GeneratedMessageLite.Builder<VmResults, Builder> implements VmResultsOrBuilder {
            public Builder clearResultCode() {
                copyOnWrite();
                ((VmResults) this.instance).clearResultCode();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VmResultsOrBuilder
            public int getResultCode() {
                return ((VmResults) this.instance).getResultCode();
            }

            public Builder setResultCode(int i) {
                copyOnWrite();
                ((VmResults) this.instance).setResultCode(i);
                return this;
            }

            private Builder() {
                super(VmResults.DEFAULT_INSTANCE);
            }
        }

        static {
            VmResults vmResults = new VmResults();
            DEFAULT_INSTANCE = vmResults;
            GeneratedMessageLite.registerDefaultInstance(VmResults.class, vmResults);
        }

        private VmResults() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResultCode() {
            this.resultCode_ = 0;
        }

        public static VmResults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VmResults parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VmResults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VmResults parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VmResults> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResultCode(int i) {
            this.resultCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new VmResults();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VmResults> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VmResults.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VmResultsOrBuilder
        public int getResultCode() {
            return this.resultCode_;
        }

        public static Builder newBuilder(VmResults vmResults) {
            return DEFAULT_INSTANCE.createBuilder(vmResults);
        }

        public static VmResults parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VmResults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VmResults parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VmResults parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VmResults parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VmResults parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VmResults parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VmResults parseFrom(InputStream inputStream) throws IOException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VmResults parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VmResults parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VmResults parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VmResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VmResultsOrBuilder extends MessageLiteOrBuilder {
        int getResultCode();
    }

    public enum VoiceAssistant implements Internal.EnumLite {
        S_VA_DEFAULT(0),
        S_VA_ID(270),
        UNRECOGNIZED(-1);

        public static final int S_VA_DEFAULT_VALUE = 0;
        public static final int S_VA_ID_VALUE = 270;
        private static final Internal.EnumLiteMap<VoiceAssistant> internalValueMap = new Internal.EnumLiteMap<VoiceAssistant>() { // from class: com.heytap.health.voiceassistant.proto.VAProto.VoiceAssistant.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public VoiceAssistant findValueByNumber(int i) {
                return VoiceAssistant.forNumber(i);
            }
        };
        private final int value;

        public static final class VoiceAssistantVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new VoiceAssistantVerifier();

            private VoiceAssistantVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return VoiceAssistant.forNumber(i) != null;
            }
        }

        VoiceAssistant(int i) {
            this.value = i;
        }

        public static VoiceAssistant forNumber(int i) {
            if (i == 0) {
                return S_VA_DEFAULT;
            }
            if (i != 270) {
                return null;
            }
            return S_VA_ID;
        }

        public static Internal.EnumLiteMap<VoiceAssistant> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return VoiceAssistantVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static VoiceAssistant valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class VoiceMessage extends GeneratedMessageLite<VoiceMessage, Builder> implements VoiceMessageOrBuilder {
        private static final VoiceMessage DEFAULT_INSTANCE;
        public static final int DSR1_FIELD_NUMBER = 3;
        public static final int DSSEARCH_FIELD_NUMBER = 4;
        public static final int MSG_ID_FIELD_NUMBER = 1;
        private static volatile Parser<VoiceMessage> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int TTSSPEAK_FIELD_NUMBER = 5;
        public static final int WATCHMEMORYINFO_FIELD_NUMBER = 6;
        private boolean dsR1_;
        private boolean dsSearch_;
        private int msgId_;
        private boolean ttsSpeak_;
        private ByteString payload_ = ByteString.EMPTY;
        private String watchMemoryInfo_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<VoiceMessage, Builder> implements VoiceMessageOrBuilder {
            public Builder clearDsR1() {
                copyOnWrite();
                ((VoiceMessage) this.instance).clearDsR1();
                return this;
            }

            public Builder clearDsSearch() {
                copyOnWrite();
                ((VoiceMessage) this.instance).clearDsSearch();
                return this;
            }

            public Builder clearMsgId() {
                copyOnWrite();
                ((VoiceMessage) this.instance).clearMsgId();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((VoiceMessage) this.instance).clearPayload();
                return this;
            }

            public Builder clearTtsSpeak() {
                copyOnWrite();
                ((VoiceMessage) this.instance).clearTtsSpeak();
                return this;
            }

            public Builder clearWatchMemoryInfo() {
                copyOnWrite();
                ((VoiceMessage) this.instance).clearWatchMemoryInfo();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public boolean getDsR1() {
                return ((VoiceMessage) this.instance).getDsR1();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public boolean getDsSearch() {
                return ((VoiceMessage) this.instance).getDsSearch();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public int getMsgId() {
                return ((VoiceMessage) this.instance).getMsgId();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public ByteString getPayload() {
                return ((VoiceMessage) this.instance).getPayload();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public boolean getTtsSpeak() {
                return ((VoiceMessage) this.instance).getTtsSpeak();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public String getWatchMemoryInfo() {
                return ((VoiceMessage) this.instance).getWatchMemoryInfo();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
            public ByteString getWatchMemoryInfoBytes() {
                return ((VoiceMessage) this.instance).getWatchMemoryInfoBytes();
            }

            public Builder setDsR1(boolean z) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setDsR1(z);
                return this;
            }

            public Builder setDsSearch(boolean z) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setDsSearch(z);
                return this;
            }

            public Builder setMsgId(int i) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setMsgId(i);
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setPayload(byteString);
                return this;
            }

            public Builder setTtsSpeak(boolean z) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setTtsSpeak(z);
                return this;
            }

            public Builder setWatchMemoryInfo(String str) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setWatchMemoryInfo(str);
                return this;
            }

            public Builder setWatchMemoryInfoBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceMessage) this.instance).setWatchMemoryInfoBytes(byteString);
                return this;
            }

            private Builder() {
                super(VoiceMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            VoiceMessage voiceMessage = new VoiceMessage();
            DEFAULT_INSTANCE = voiceMessage;
            GeneratedMessageLite.registerDefaultInstance(VoiceMessage.class, voiceMessage);
        }

        private VoiceMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDsR1() {
            this.dsR1_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDsSearch() {
            this.dsSearch_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsgId() {
            this.msgId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtsSpeak() {
            this.ttsSpeak_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchMemoryInfo() {
            this.watchMemoryInfo_ = getDefaultInstance().getWatchMemoryInfo();
        }

        public static VoiceMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VoiceMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VoiceMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDsR1(boolean z) {
            this.dsR1_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDsSearch(boolean z) {
            this.dsSearch_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgId(int i) {
            this.msgId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtsSpeak(boolean z) {
            this.ttsSpeak_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchMemoryInfo(String str) {
            str.getClass();
            this.watchMemoryInfo_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchMemoryInfoBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.watchMemoryInfo_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new VoiceMessage();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\u0007\u0004\u0007\u0005\u0007\u0006Ȉ", new Object[]{"msgId_", "payload_", "dsR1_", "dsSearch_", "ttsSpeak_", "watchMemoryInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VoiceMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VoiceMessage.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public boolean getDsR1() {
            return this.dsR1_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public boolean getDsSearch() {
            return this.dsSearch_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public int getMsgId() {
            return this.msgId_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public boolean getTtsSpeak() {
            return this.ttsSpeak_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public String getWatchMemoryInfo() {
            return this.watchMemoryInfo_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceMessageOrBuilder
        public ByteString getWatchMemoryInfoBytes() {
            return ByteString.copyFromUtf8(this.watchMemoryInfo_);
        }

        public static Builder newBuilder(VoiceMessage voiceMessage) {
            return DEFAULT_INSTANCE.createBuilder(voiceMessage);
        }

        public static VoiceMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VoiceMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoiceMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VoiceMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VoiceMessage parseFrom(InputStream inputStream) throws IOException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VoiceMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VoiceMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getDsR1();

        boolean getDsSearch();

        int getMsgId();

        ByteString getPayload();

        boolean getTtsSpeak();

        String getWatchMemoryInfo();

        ByteString getWatchMemoryInfoBytes();
    }

    public static final class VoiceRecognizeData extends GeneratedMessageLite<VoiceRecognizeData, Builder> implements VoiceRecognizeDataOrBuilder {
        private static final VoiceRecognizeData DEFAULT_INSTANCE;
        private static volatile Parser<VoiceRecognizeData> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int VOICE_DATA_FIELD_NUMBER = 2;
        private int sessionId_;
        private ByteString voiceData_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.Builder<VoiceRecognizeData, Builder> implements VoiceRecognizeDataOrBuilder {
            public Builder clearSessionId() {
                copyOnWrite();
                ((VoiceRecognizeData) this.instance).clearSessionId();
                return this;
            }

            public Builder clearVoiceData() {
                copyOnWrite();
                ((VoiceRecognizeData) this.instance).clearVoiceData();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeDataOrBuilder
            public int getSessionId() {
                return ((VoiceRecognizeData) this.instance).getSessionId();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeDataOrBuilder
            public ByteString getVoiceData() {
                return ((VoiceRecognizeData) this.instance).getVoiceData();
            }

            public Builder setSessionId(int i) {
                copyOnWrite();
                ((VoiceRecognizeData) this.instance).setSessionId(i);
                return this;
            }

            public Builder setVoiceData(ByteString byteString) {
                copyOnWrite();
                ((VoiceRecognizeData) this.instance).setVoiceData(byteString);
                return this;
            }

            private Builder() {
                super(VoiceRecognizeData.DEFAULT_INSTANCE);
            }
        }

        static {
            VoiceRecognizeData voiceRecognizeData = new VoiceRecognizeData();
            DEFAULT_INSTANCE = voiceRecognizeData;
            GeneratedMessageLite.registerDefaultInstance(VoiceRecognizeData.class, voiceRecognizeData);
        }

        private VoiceRecognizeData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceData() {
            this.voiceData_ = getDefaultInstance().getVoiceData();
        }

        public static VoiceRecognizeData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VoiceRecognizeData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRecognizeData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VoiceRecognizeData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(int i) {
            this.sessionId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceData(ByteString byteString) {
            byteString.getClass();
            this.voiceData_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new VoiceRecognizeData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"sessionId_", "voiceData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VoiceRecognizeData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VoiceRecognizeData.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeDataOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeDataOrBuilder
        public ByteString getVoiceData() {
            return this.voiceData_;
        }

        public static Builder newBuilder(VoiceRecognizeData voiceRecognizeData) {
            return DEFAULT_INSTANCE.createBuilder(voiceRecognizeData);
        }

        public static VoiceRecognizeData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceRecognizeData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VoiceRecognizeData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoiceRecognizeData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VoiceRecognizeData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRecognizeData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VoiceRecognizeData parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRecognizeData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceRecognizeData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VoiceRecognizeData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceRecognizeData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VoiceRecognizeDataOrBuilder extends MessageLiteOrBuilder {
        int getSessionId();

        ByteString getVoiceData();
    }

    public static final class VoiceRecognizeResult extends GeneratedMessageLite<VoiceRecognizeResult, Builder> implements VoiceRecognizeResultOrBuilder {
        private static final VoiceRecognizeResult DEFAULT_INSTANCE;
        private static volatile Parser<VoiceRecognizeResult> PARSER = null;
        public static final int RESULT_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int result_;
        private int sessionId_;

        public static final class Builder extends GeneratedMessageLite.Builder<VoiceRecognizeResult, Builder> implements VoiceRecognizeResultOrBuilder {
            public Builder clearResult() {
                copyOnWrite();
                ((VoiceRecognizeResult) this.instance).clearResult();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((VoiceRecognizeResult) this.instance).clearSessionId();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeResultOrBuilder
            public int getResult() {
                return ((VoiceRecognizeResult) this.instance).getResult();
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeResultOrBuilder
            public int getSessionId() {
                return ((VoiceRecognizeResult) this.instance).getSessionId();
            }

            public Builder setResult(int i) {
                copyOnWrite();
                ((VoiceRecognizeResult) this.instance).setResult(i);
                return this;
            }

            public Builder setSessionId(int i) {
                copyOnWrite();
                ((VoiceRecognizeResult) this.instance).setSessionId(i);
                return this;
            }

            private Builder() {
                super(VoiceRecognizeResult.DEFAULT_INSTANCE);
            }
        }

        static {
            VoiceRecognizeResult voiceRecognizeResult = new VoiceRecognizeResult();
            DEFAULT_INSTANCE = voiceRecognizeResult;
            GeneratedMessageLite.registerDefaultInstance(VoiceRecognizeResult.class, voiceRecognizeResult);
        }

        private VoiceRecognizeResult() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResult() {
            this.result_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = 0;
        }

        public static VoiceRecognizeResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VoiceRecognizeResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRecognizeResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VoiceRecognizeResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResult(int i) {
            this.result_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(int i) {
            this.sessionId_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new VoiceRecognizeResult();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"sessionId_", "result_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VoiceRecognizeResult> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VoiceRecognizeResult.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeResultOrBuilder
        public int getResult() {
            return this.result_;
        }

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceRecognizeResultOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        public static Builder newBuilder(VoiceRecognizeResult voiceRecognizeResult) {
            return DEFAULT_INSTANCE.createBuilder(voiceRecognizeResult);
        }

        public static VoiceRecognizeResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceRecognizeResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VoiceRecognizeResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoiceRecognizeResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VoiceRecognizeResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceRecognizeResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VoiceRecognizeResult parseFrom(InputStream inputStream) throws IOException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceRecognizeResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceRecognizeResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VoiceRecognizeResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceRecognizeResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VoiceRecognizeResultOrBuilder extends MessageLiteOrBuilder {
        int getResult();

        int getSessionId();
    }

    public static final class VoiceWakeupState extends GeneratedMessageLite<VoiceWakeupState, Builder> implements VoiceWakeupStateOrBuilder {
        private static final VoiceWakeupState DEFAULT_INSTANCE;
        private static volatile Parser<VoiceWakeupState> PARSER = null;
        public static final int STATE_FIELD_NUMBER = 1;
        private int state_;

        public static final class Builder extends GeneratedMessageLite.Builder<VoiceWakeupState, Builder> implements VoiceWakeupStateOrBuilder {
            public Builder clearState() {
                copyOnWrite();
                ((VoiceWakeupState) this.instance).clearState();
                return this;
            }

            @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceWakeupStateOrBuilder
            public int getState() {
                return ((VoiceWakeupState) this.instance).getState();
            }

            public Builder setState(int i) {
                copyOnWrite();
                ((VoiceWakeupState) this.instance).setState(i);
                return this;
            }

            private Builder() {
                super(VoiceWakeupState.DEFAULT_INSTANCE);
            }
        }

        static {
            VoiceWakeupState voiceWakeupState = new VoiceWakeupState();
            DEFAULT_INSTANCE = voiceWakeupState;
            GeneratedMessageLite.registerDefaultInstance(VoiceWakeupState.class, voiceWakeupState);
        }

        private VoiceWakeupState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearState() {
            this.state_ = 0;
        }

        public static VoiceWakeupState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VoiceWakeupState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceWakeupState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceWakeupState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VoiceWakeupState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setState(int i) {
            this.state_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new VoiceWakeupState();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"state_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VoiceWakeupState> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VoiceWakeupState.class) {
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

        @Override // com.heytap.health.voiceassistant.proto.VAProto.VoiceWakeupStateOrBuilder
        public int getState() {
            return this.state_;
        }

        public static Builder newBuilder(VoiceWakeupState voiceWakeupState) {
            return DEFAULT_INSTANCE.createBuilder(voiceWakeupState);
        }

        public static VoiceWakeupState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceWakeupState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceWakeupState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VoiceWakeupState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoiceWakeupState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VoiceWakeupState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceWakeupState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VoiceWakeupState parseFrom(InputStream inputStream) throws IOException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceWakeupState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceWakeupState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VoiceWakeupState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceWakeupState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VoiceWakeupStateOrBuilder extends MessageLiteOrBuilder {
        int getState();
    }

    private VAProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
