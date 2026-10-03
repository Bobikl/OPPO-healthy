package com.heytap.health.watch.notification;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class CacheIcons extends GeneratedMessageLite<CacheIcons, Builder> implements CacheIconsOrBuilder {
    private static final CacheIcons DEFAULT_INSTANCE;
    public static final int FLUID_APPS_FIELD_NUMBER = 3;
    public static final int NOTIFICATION_APPS_FIELD_NUMBER = 2;
    private static volatile Parser<CacheIcons> PARSER = null;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    private int syncType_;
    private Internal.ProtobufList<String> notificationApps_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> fluidApps_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<CacheIcons, Builder> implements CacheIconsOrBuilder {
        public Builder addAllFluidApps(Iterable<String> iterable) {
            copyOnWrite();
            ((CacheIcons) this.instance).addAllFluidApps(iterable);
            return this;
        }

        public Builder addAllNotificationApps(Iterable<String> iterable) {
            copyOnWrite();
            ((CacheIcons) this.instance).addAllNotificationApps(iterable);
            return this;
        }

        public Builder addFluidApps(String str) {
            copyOnWrite();
            ((CacheIcons) this.instance).addFluidApps(str);
            return this;
        }

        public Builder addFluidAppsBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheIcons) this.instance).addFluidAppsBytes(byteString);
            return this;
        }

        public Builder addNotificationApps(String str) {
            copyOnWrite();
            ((CacheIcons) this.instance).addNotificationApps(str);
            return this;
        }

        public Builder addNotificationAppsBytes(ByteString byteString) {
            copyOnWrite();
            ((CacheIcons) this.instance).addNotificationAppsBytes(byteString);
            return this;
        }

        public Builder clearFluidApps() {
            copyOnWrite();
            ((CacheIcons) this.instance).clearFluidApps();
            return this;
        }

        public Builder clearNotificationApps() {
            copyOnWrite();
            ((CacheIcons) this.instance).clearNotificationApps();
            return this;
        }

        public Builder clearSyncType() {
            copyOnWrite();
            ((CacheIcons) this.instance).clearSyncType();
            return this;
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public String getFluidApps(int i) {
            return ((CacheIcons) this.instance).getFluidApps(i);
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public ByteString getFluidAppsBytes(int i) {
            return ((CacheIcons) this.instance).getFluidAppsBytes(i);
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public int getFluidAppsCount() {
            return ((CacheIcons) this.instance).getFluidAppsCount();
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public List<String> getFluidAppsList() {
            return Collections.unmodifiableList(((CacheIcons) this.instance).getFluidAppsList());
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public String getNotificationApps(int i) {
            return ((CacheIcons) this.instance).getNotificationApps(i);
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public ByteString getNotificationAppsBytes(int i) {
            return ((CacheIcons) this.instance).getNotificationAppsBytes(i);
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public int getNotificationAppsCount() {
            return ((CacheIcons) this.instance).getNotificationAppsCount();
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public List<String> getNotificationAppsList() {
            return Collections.unmodifiableList(((CacheIcons) this.instance).getNotificationAppsList());
        }

        @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
        public int getSyncType() {
            return ((CacheIcons) this.instance).getSyncType();
        }

        public Builder setFluidApps(int i, String str) {
            copyOnWrite();
            ((CacheIcons) this.instance).setFluidApps(i, str);
            return this;
        }

        public Builder setNotificationApps(int i, String str) {
            copyOnWrite();
            ((CacheIcons) this.instance).setNotificationApps(i, str);
            return this;
        }

        public Builder setSyncType(int i) {
            copyOnWrite();
            ((CacheIcons) this.instance).setSyncType(i);
            return this;
        }

        private Builder() {
            super(CacheIcons.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        CacheIcons cacheIcons = new CacheIcons();
        DEFAULT_INSTANCE = cacheIcons;
        GeneratedMessageLite.registerDefaultInstance(CacheIcons.class, cacheIcons);
    }

    private CacheIcons() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFluidApps(Iterable<String> iterable) {
        ensureFluidAppsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fluidApps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNotificationApps(Iterable<String> iterable) {
        ensureNotificationAppsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.notificationApps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFluidApps(String str) {
        str.getClass();
        ensureFluidAppsIsMutable();
        this.fluidApps_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFluidAppsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureFluidAppsIsMutable();
        this.fluidApps_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNotificationApps(String str) {
        str.getClass();
        ensureNotificationAppsIsMutable();
        this.notificationApps_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNotificationAppsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureNotificationAppsIsMutable();
        this.notificationApps_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFluidApps() {
        this.fluidApps_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationApps() {
        this.notificationApps_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncType() {
        this.syncType_ = 0;
    }

    private void ensureFluidAppsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.fluidApps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.fluidApps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureNotificationAppsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.notificationApps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.notificationApps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static CacheIcons getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CacheIcons parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CacheIcons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CacheIcons parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CacheIcons> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFluidApps(int i, String str) {
        str.getClass();
        ensureFluidAppsIsMutable();
        this.fluidApps_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNotificationApps(int i, String str) {
        str.getClass();
        ensureNotificationAppsIsMutable();
        this.notificationApps_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncType(int i) {
        this.syncType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CacheIcons();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002Ț\u0003Ț", new Object[]{"syncType_", "notificationApps_", "fluidApps_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CacheIcons> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CacheIcons.class) {
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

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public String getFluidApps(int i) {
        return this.fluidApps_.get(i);
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public ByteString getFluidAppsBytes(int i) {
        return ByteString.copyFromUtf8(this.fluidApps_.get(i));
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public int getFluidAppsCount() {
        return this.fluidApps_.size();
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public List<String> getFluidAppsList() {
        return this.fluidApps_;
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public String getNotificationApps(int i) {
        return this.notificationApps_.get(i);
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public ByteString getNotificationAppsBytes(int i) {
        return ByteString.copyFromUtf8(this.notificationApps_.get(i));
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public int getNotificationAppsCount() {
        return this.notificationApps_.size();
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public List<String> getNotificationAppsList() {
        return this.notificationApps_;
    }

    @Override // com.heytap.health.watch.notification.CacheIconsOrBuilder
    public int getSyncType() {
        return this.syncType_;
    }

    public static Builder newBuilder(CacheIcons cacheIcons) {
        return DEFAULT_INSTANCE.createBuilder(cacheIcons);
    }

    public static CacheIcons parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheIcons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CacheIcons parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CacheIcons parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CacheIcons parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CacheIcons parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CacheIcons parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CacheIcons parseFrom(InputStream inputStream) throws IOException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CacheIcons parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CacheIcons parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CacheIcons parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CacheIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
