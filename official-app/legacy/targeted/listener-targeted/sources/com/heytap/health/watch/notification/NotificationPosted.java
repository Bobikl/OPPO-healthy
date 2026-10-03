package com.heytap.health.watch.notification;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class NotificationPosted extends GeneratedMessageLite<NotificationPosted, Builder> implements NotificationPostedOrBuilder {
    public static final int BYTELARGEICON_FIELD_NUMBER = 10;
    public static final int BYTESMALLICON_FIELD_NUMBER = 9;
    private static final NotificationPosted DEFAULT_INSTANCE;
    public static final int HASREMOTEINPUT_FIELD_NUMBER = 14;
    public static final int INTID_FIELD_NUMBER = 1;
    public static final int INTTYPE_FIELD_NUMBER = 11;
    public static final int LPOSTTIME_FIELD_NUMBER = 8;
    private static volatile Parser<NotificationPosted> PARSER = null;
    public static final int STRAPPNAME_FIELD_NUMBER = 13;
    public static final int STRCONTENT_FIELD_NUMBER = 5;
    public static final int STRFROM_FIELD_NUMBER = 12;
    public static final int STRKEY_FIELD_NUMBER = 7;
    public static final int STRPACKAGENAME_FIELD_NUMBER = 2;
    public static final int STRSUBCONTENT_FIELD_NUMBER = 6;
    public static final int STRTAG_FIELD_NUMBER = 3;
    public static final int STRTITLE_FIELD_NUMBER = 4;
    private ByteString byteLargeIcon_;
    private ByteString byteSmallIcon_;
    private boolean hasRemoteInput_;
    private int intId_;
    private int intType_;
    private long lPostTime_;
    private String strAppName_;
    private String strFrom_;
    private String strPackageName_ = "";
    private String strTag_ = "";
    private String strTitle_ = "";
    private String strContent_ = "";
    private String strSubContent_ = "";
    private String strKey_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationPosted, Builder> implements NotificationPostedOrBuilder {
        public Builder clearByteLargeIcon() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearByteLargeIcon();
            return this;
        }

        public Builder clearByteSmallIcon() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearByteSmallIcon();
            return this;
        }

        public Builder clearHasRemoteInput() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearHasRemoteInput();
            return this;
        }

        public Builder clearIntId() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearIntId();
            return this;
        }

        public Builder clearIntType() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearIntType();
            return this;
        }

        public Builder clearLPostTime() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearLPostTime();
            return this;
        }

        public Builder clearStrAppName() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrAppName();
            return this;
        }

        public Builder clearStrContent() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrContent();
            return this;
        }

        public Builder clearStrFrom() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrFrom();
            return this;
        }

        public Builder clearStrKey() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrKey();
            return this;
        }

        public Builder clearStrPackageName() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrPackageName();
            return this;
        }

        public Builder clearStrSubContent() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrSubContent();
            return this;
        }

        public Builder clearStrTag() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrTag();
            return this;
        }

        public Builder clearStrTitle() {
            copyOnWrite();
            ((NotificationPosted) this.instance).clearStrTitle();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getByteLargeIcon() {
            return ((NotificationPosted) this.instance).getByteLargeIcon();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getByteSmallIcon() {
            return ((NotificationPosted) this.instance).getByteSmallIcon();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public boolean getHasRemoteInput() {
            return ((NotificationPosted) this.instance).getHasRemoteInput();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public int getIntId() {
            return ((NotificationPosted) this.instance).getIntId();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public int getIntType() {
            return ((NotificationPosted) this.instance).getIntType();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public long getLPostTime() {
            return ((NotificationPosted) this.instance).getLPostTime();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrAppName() {
            return ((NotificationPosted) this.instance).getStrAppName();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrAppNameBytes() {
            return ((NotificationPosted) this.instance).getStrAppNameBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrContent() {
            return ((NotificationPosted) this.instance).getStrContent();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrContentBytes() {
            return ((NotificationPosted) this.instance).getStrContentBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrFrom() {
            return ((NotificationPosted) this.instance).getStrFrom();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrFromBytes() {
            return ((NotificationPosted) this.instance).getStrFromBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrKey() {
            return ((NotificationPosted) this.instance).getStrKey();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrKeyBytes() {
            return ((NotificationPosted) this.instance).getStrKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrPackageName() {
            return ((NotificationPosted) this.instance).getStrPackageName();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrPackageNameBytes() {
            return ((NotificationPosted) this.instance).getStrPackageNameBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrSubContent() {
            return ((NotificationPosted) this.instance).getStrSubContent();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrSubContentBytes() {
            return ((NotificationPosted) this.instance).getStrSubContentBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrTag() {
            return ((NotificationPosted) this.instance).getStrTag();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrTagBytes() {
            return ((NotificationPosted) this.instance).getStrTagBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public String getStrTitle() {
            return ((NotificationPosted) this.instance).getStrTitle();
        }

        @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
        public ByteString getStrTitleBytes() {
            return ((NotificationPosted) this.instance).getStrTitleBytes();
        }

        public Builder setByteLargeIcon(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setByteLargeIcon(byteString);
            return this;
        }

        public Builder setByteSmallIcon(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setByteSmallIcon(byteString);
            return this;
        }

        public Builder setHasRemoteInput(boolean z) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setHasRemoteInput(z);
            return this;
        }

        public Builder setIntId(int i) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setIntId(i);
            return this;
        }

        public Builder setIntType(int i) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setIntType(i);
            return this;
        }

        public Builder setLPostTime(long j2) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setLPostTime(j2);
            return this;
        }

        public Builder setStrAppName(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrAppName(str);
            return this;
        }

        public Builder setStrAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrAppNameBytes(byteString);
            return this;
        }

        public Builder setStrContent(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrContent(str);
            return this;
        }

        public Builder setStrContentBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrContentBytes(byteString);
            return this;
        }

        public Builder setStrFrom(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrFrom(str);
            return this;
        }

        public Builder setStrFromBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrFromBytes(byteString);
            return this;
        }

        public Builder setStrKey(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrKey(str);
            return this;
        }

        public Builder setStrKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrKeyBytes(byteString);
            return this;
        }

        public Builder setStrPackageName(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrPackageName(str);
            return this;
        }

        public Builder setStrPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrPackageNameBytes(byteString);
            return this;
        }

        public Builder setStrSubContent(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrSubContent(str);
            return this;
        }

        public Builder setStrSubContentBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrSubContentBytes(byteString);
            return this;
        }

        public Builder setStrTag(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrTag(str);
            return this;
        }

        public Builder setStrTagBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrTagBytes(byteString);
            return this;
        }

        public Builder setStrTitle(String str) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrTitle(str);
            return this;
        }

        public Builder setStrTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationPosted) this.instance).setStrTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(NotificationPosted.DEFAULT_INSTANCE);
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
        NotificationPosted notificationPosted = new NotificationPosted();
        DEFAULT_INSTANCE = notificationPosted;
        GeneratedMessageLite.registerDefaultInstance(NotificationPosted.class, notificationPosted);
    }

    private NotificationPosted() {
        ByteString byteString = ByteString.EMPTY;
        this.byteSmallIcon_ = byteString;
        this.byteLargeIcon_ = byteString;
        this.strFrom_ = "";
        this.strAppName_ = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByteLargeIcon() {
        this.byteLargeIcon_ = getDefaultInstance().getByteLargeIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByteSmallIcon() {
        this.byteSmallIcon_ = getDefaultInstance().getByteSmallIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasRemoteInput() {
        this.hasRemoteInput_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntId() {
        this.intId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntType() {
        this.intType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLPostTime() {
        this.lPostTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrAppName() {
        this.strAppName_ = getDefaultInstance().getStrAppName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrContent() {
        this.strContent_ = getDefaultInstance().getStrContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrFrom() {
        this.strFrom_ = getDefaultInstance().getStrFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrKey() {
        this.strKey_ = getDefaultInstance().getStrKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrPackageName() {
        this.strPackageName_ = getDefaultInstance().getStrPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrSubContent() {
        this.strSubContent_ = getDefaultInstance().getStrSubContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrTag() {
        this.strTag_ = getDefaultInstance().getStrTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrTitle() {
        this.strTitle_ = getDefaultInstance().getStrTitle();
    }

    public static NotificationPosted getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationPosted parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationPosted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationPosted parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationPosted> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByteLargeIcon(ByteString byteString) {
        byteString.getClass();
        this.byteLargeIcon_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByteSmallIcon(ByteString byteString) {
        byteString.getClass();
        this.byteSmallIcon_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasRemoteInput(boolean z) {
        this.hasRemoteInput_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntId(int i) {
        this.intId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntType(int i) {
        this.intType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLPostTime(long j2) {
        this.lPostTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrAppName(String str) {
        str.getClass();
        this.strAppName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrAppNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strAppName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrContent(String str) {
        str.getClass();
        this.strContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrFrom(String str) {
        str.getClass();
        this.strFrom_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strFrom_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrKey(String str) {
        str.getClass();
        this.strKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrPackageName(String str) {
        str.getClass();
        this.strPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrSubContent(String str) {
        str.getClass();
        this.strSubContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrSubContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strSubContent_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrTag(String str) {
        str.getClass();
        this.strTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strTag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrTitle(String str) {
        str.getClass();
        this.strTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strTitle_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new NotificationPosted();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0003\t\n\n\n\u000b\u0004\fȈ\rȈ\u000e\u0007", new Object[]{"intId_", "strPackageName_", "strTag_", "strTitle_", "strContent_", "strSubContent_", "strKey_", "lPostTime_", "byteSmallIcon_", "byteLargeIcon_", "intType_", "strFrom_", "strAppName_", "hasRemoteInput_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationPosted> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationPosted.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getByteLargeIcon() {
        return this.byteLargeIcon_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getByteSmallIcon() {
        return this.byteSmallIcon_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public boolean getHasRemoteInput() {
        return this.hasRemoteInput_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public int getIntId() {
        return this.intId_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public int getIntType() {
        return this.intType_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public long getLPostTime() {
        return this.lPostTime_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrAppName() {
        return this.strAppName_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrAppNameBytes() {
        return ByteString.copyFromUtf8(this.strAppName_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrContent() {
        return this.strContent_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrContentBytes() {
        return ByteString.copyFromUtf8(this.strContent_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrFrom() {
        return this.strFrom_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrFromBytes() {
        return ByteString.copyFromUtf8(this.strFrom_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrKey() {
        return this.strKey_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrKeyBytes() {
        return ByteString.copyFromUtf8(this.strKey_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrPackageName() {
        return this.strPackageName_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrPackageNameBytes() {
        return ByteString.copyFromUtf8(this.strPackageName_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrSubContent() {
        return this.strSubContent_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrSubContentBytes() {
        return ByteString.copyFromUtf8(this.strSubContent_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrTag() {
        return this.strTag_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrTagBytes() {
        return ByteString.copyFromUtf8(this.strTag_);
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public String getStrTitle() {
        return this.strTitle_;
    }

    @Override // com.heytap.health.watch.notification.NotificationPostedOrBuilder
    public ByteString getStrTitleBytes() {
        return ByteString.copyFromUtf8(this.strTitle_);
    }

    public static Builder newBuilder(NotificationPosted notificationPosted) {
        return DEFAULT_INSTANCE.createBuilder(notificationPosted);
    }

    public static NotificationPosted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationPosted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationPosted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationPosted parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationPosted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationPosted parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationPosted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationPosted parseFrom(InputStream inputStream) throws IOException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationPosted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationPosted parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationPosted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationPosted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
