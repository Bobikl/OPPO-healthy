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
public final class NotificationStyleProto extends GeneratedMessageLite<NotificationStyleProto, Builder> implements NotificationStyleProtoOrBuilder {
    public static final int BIGPICTURESTYLE_FIELD_NUMBER = 6;
    public static final int BIGTEXTSTYLE_FIELD_NUMBER = 4;
    private static final NotificationStyleProto DEFAULT_INSTANCE;
    public static final int INBOXSTYLE_FIELD_NUMBER = 5;
    public static final int MESSAGINGSTYLE_FIELD_NUMBER = 3;
    private static volatile Parser<NotificationStyleProto> PARSER = null;
    public static final int REDPACKAGE_FIELD_NUMBER = 7;
    public static final int SEEDINGCARD_FIELD_NUMBER = 9;
    public static final int STANDARDSTYLE_FIELD_NUMBER = 2;
    public static final int STYLETYPE_FIELD_NUMBER = 1;
    public static final int VERIFYCODE_FIELD_NUMBER = 8;
    private Object data_;
    private int dataCase_ = 0;
    private String styleType_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationStyleProto, Builder> implements NotificationStyleProtoOrBuilder {
        public Builder clearBigPictureStyle() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearBigPictureStyle();
            return this;
        }

        public Builder clearBigTextStyle() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearBigTextStyle();
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearData();
            return this;
        }

        public Builder clearInboxStyle() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearInboxStyle();
            return this;
        }

        public Builder clearMessagingStyle() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearMessagingStyle();
            return this;
        }

        public Builder clearRedPackage() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearRedPackage();
            return this;
        }

        public Builder clearSeedingCard() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearSeedingCard();
            return this;
        }

        public Builder clearStandardStyle() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearStandardStyle();
            return this;
        }

        public Builder clearStyleType() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearStyleType();
            return this;
        }

        public Builder clearVerifyCode() {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).clearVerifyCode();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public BigPictureStyleProto getBigPictureStyle() {
            return ((NotificationStyleProto) this.instance).getBigPictureStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public BigTextStyleProto getBigTextStyle() {
            return ((NotificationStyleProto) this.instance).getBigTextStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public DataCase getDataCase() {
            return ((NotificationStyleProto) this.instance).getDataCase();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public InboxStyleProto getInboxStyle() {
            return ((NotificationStyleProto) this.instance).getInboxStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public MessagingStyleProto getMessagingStyle() {
            return ((NotificationStyleProto) this.instance).getMessagingStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public RedPackageStyleProto getRedPackage() {
            return ((NotificationStyleProto) this.instance).getRedPackage();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public SeedingCardStyleProto getSeedingCard() {
            return ((NotificationStyleProto) this.instance).getSeedingCard();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public StandardStyleProto getStandardStyle() {
            return ((NotificationStyleProto) this.instance).getStandardStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public String getStyleType() {
            return ((NotificationStyleProto) this.instance).getStyleType();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public ByteString getStyleTypeBytes() {
            return ((NotificationStyleProto) this.instance).getStyleTypeBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public VerifyCodeStyleProto getVerifyCode() {
            return ((NotificationStyleProto) this.instance).getVerifyCode();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasBigPictureStyle() {
            return ((NotificationStyleProto) this.instance).hasBigPictureStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasBigTextStyle() {
            return ((NotificationStyleProto) this.instance).hasBigTextStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasInboxStyle() {
            return ((NotificationStyleProto) this.instance).hasInboxStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasMessagingStyle() {
            return ((NotificationStyleProto) this.instance).hasMessagingStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasRedPackage() {
            return ((NotificationStyleProto) this.instance).hasRedPackage();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasSeedingCard() {
            return ((NotificationStyleProto) this.instance).hasSeedingCard();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasStandardStyle() {
            return ((NotificationStyleProto) this.instance).hasStandardStyle();
        }

        @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
        public boolean hasVerifyCode() {
            return ((NotificationStyleProto) this.instance).hasVerifyCode();
        }

        public Builder mergeBigPictureStyle(BigPictureStyleProto bigPictureStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeBigPictureStyle(bigPictureStyleProto);
            return this;
        }

        public Builder mergeBigTextStyle(BigTextStyleProto bigTextStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeBigTextStyle(bigTextStyleProto);
            return this;
        }

        public Builder mergeInboxStyle(InboxStyleProto inboxStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeInboxStyle(inboxStyleProto);
            return this;
        }

        public Builder mergeMessagingStyle(MessagingStyleProto messagingStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeMessagingStyle(messagingStyleProto);
            return this;
        }

        public Builder mergeRedPackage(RedPackageStyleProto redPackageStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeRedPackage(redPackageStyleProto);
            return this;
        }

        public Builder mergeSeedingCard(SeedingCardStyleProto seedingCardStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeSeedingCard(seedingCardStyleProto);
            return this;
        }

        public Builder mergeStandardStyle(StandardStyleProto standardStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeStandardStyle(standardStyleProto);
            return this;
        }

        public Builder mergeVerifyCode(VerifyCodeStyleProto verifyCodeStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).mergeVerifyCode(verifyCodeStyleProto);
            return this;
        }

        public Builder setBigPictureStyle(BigPictureStyleProto bigPictureStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setBigPictureStyle(bigPictureStyleProto);
            return this;
        }

        public Builder setBigTextStyle(BigTextStyleProto bigTextStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setBigTextStyle(bigTextStyleProto);
            return this;
        }

        public Builder setInboxStyle(InboxStyleProto inboxStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setInboxStyle(inboxStyleProto);
            return this;
        }

        public Builder setMessagingStyle(MessagingStyleProto messagingStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setMessagingStyle(messagingStyleProto);
            return this;
        }

        public Builder setRedPackage(RedPackageStyleProto redPackageStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setRedPackage(redPackageStyleProto);
            return this;
        }

        public Builder setSeedingCard(SeedingCardStyleProto seedingCardStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setSeedingCard(seedingCardStyleProto);
            return this;
        }

        public Builder setStandardStyle(StandardStyleProto standardStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setStandardStyle(standardStyleProto);
            return this;
        }

        public Builder setStyleType(String str) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setStyleType(str);
            return this;
        }

        public Builder setStyleTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setStyleTypeBytes(byteString);
            return this;
        }

        public Builder setVerifyCode(VerifyCodeStyleProto verifyCodeStyleProto) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setVerifyCode(verifyCodeStyleProto);
            return this;
        }

        private Builder() {
            super(NotificationStyleProto.DEFAULT_INSTANCE);
        }

        public Builder setBigPictureStyle(BigPictureStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setBigPictureStyle(builder.build());
            return this;
        }

        public Builder setBigTextStyle(BigTextStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setBigTextStyle(builder.build());
            return this;
        }

        public Builder setInboxStyle(InboxStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setInboxStyle(builder.build());
            return this;
        }

        public Builder setMessagingStyle(MessagingStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setMessagingStyle(builder.build());
            return this;
        }

        public Builder setRedPackage(RedPackageStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setRedPackage(builder.build());
            return this;
        }

        public Builder setSeedingCard(SeedingCardStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setSeedingCard(builder.build());
            return this;
        }

        public Builder setStandardStyle(StandardStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setStandardStyle(builder.build());
            return this;
        }

        public Builder setVerifyCode(VerifyCodeStyleProto.Builder builder) {
            copyOnWrite();
            ((NotificationStyleProto) this.instance).setVerifyCode(builder.build());
            return this;
        }
    }

    public enum DataCase {
        STANDARDSTYLE(2),
        MESSAGINGSTYLE(3),
        BIGTEXTSTYLE(4),
        INBOXSTYLE(5),
        BIGPICTURESTYLE(6),
        REDPACKAGE(7),
        VERIFYCODE(8),
        SEEDINGCARD(9),
        DATA_NOT_SET(0);

        private final int value;

        DataCase(int i) {
            this.value = i;
        }

        public static DataCase forNumber(int i) {
            if (i == 0) {
                return DATA_NOT_SET;
            }
            switch (i) {
                case 2:
                    return STANDARDSTYLE;
                case 3:
                    return MESSAGINGSTYLE;
                case 4:
                    return BIGTEXTSTYLE;
                case 5:
                    return INBOXSTYLE;
                case 6:
                    return BIGPICTURESTYLE;
                case 7:
                    return REDPACKAGE;
                case 8:
                    return VERIFYCODE;
                case 9:
                    return SEEDINGCARD;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DataCase valueOf(int i) {
            return forNumber(i);
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
        NotificationStyleProto notificationStyleProto = new NotificationStyleProto();
        DEFAULT_INSTANCE = notificationStyleProto;
        GeneratedMessageLite.registerDefaultInstance(NotificationStyleProto.class, notificationStyleProto);
    }

    private NotificationStyleProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBigPictureStyle() {
        if (this.dataCase_ == 6) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBigTextStyle() {
        if (this.dataCase_ == 4) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.dataCase_ = 0;
        this.data_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInboxStyle() {
        if (this.dataCase_ == 5) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagingStyle() {
        if (this.dataCase_ == 3) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRedPackage() {
        if (this.dataCase_ == 7) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeedingCard() {
        if (this.dataCase_ == 9) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStandardStyle() {
        if (this.dataCase_ == 2) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleType() {
        this.styleType_ = getDefaultInstance().getStyleType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerifyCode() {
        if (this.dataCase_ == 8) {
            this.dataCase_ = 0;
            this.data_ = null;
        }
    }

    public static NotificationStyleProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBigPictureStyle(BigPictureStyleProto bigPictureStyleProto) {
        bigPictureStyleProto.getClass();
        if (this.dataCase_ != 6 || this.data_ == BigPictureStyleProto.getDefaultInstance()) {
            this.data_ = bigPictureStyleProto;
        } else {
            this.data_ = BigPictureStyleProto.newBuilder((BigPictureStyleProto) this.data_).mergeFrom(bigPictureStyleProto).buildPartial();
        }
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBigTextStyle(BigTextStyleProto bigTextStyleProto) {
        bigTextStyleProto.getClass();
        if (this.dataCase_ != 4 || this.data_ == BigTextStyleProto.getDefaultInstance()) {
            this.data_ = bigTextStyleProto;
        } else {
            this.data_ = BigTextStyleProto.newBuilder((BigTextStyleProto) this.data_).mergeFrom(bigTextStyleProto).buildPartial();
        }
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInboxStyle(InboxStyleProto inboxStyleProto) {
        inboxStyleProto.getClass();
        if (this.dataCase_ != 5 || this.data_ == InboxStyleProto.getDefaultInstance()) {
            this.data_ = inboxStyleProto;
        } else {
            this.data_ = InboxStyleProto.newBuilder((InboxStyleProto) this.data_).mergeFrom(inboxStyleProto).buildPartial();
        }
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagingStyle(MessagingStyleProto messagingStyleProto) {
        messagingStyleProto.getClass();
        if (this.dataCase_ != 3 || this.data_ == MessagingStyleProto.getDefaultInstance()) {
            this.data_ = messagingStyleProto;
        } else {
            this.data_ = MessagingStyleProto.newBuilder((MessagingStyleProto) this.data_).mergeFrom(messagingStyleProto).buildPartial();
        }
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRedPackage(RedPackageStyleProto redPackageStyleProto) {
        redPackageStyleProto.getClass();
        if (this.dataCase_ != 7 || this.data_ == RedPackageStyleProto.getDefaultInstance()) {
            this.data_ = redPackageStyleProto;
        } else {
            this.data_ = RedPackageStyleProto.newBuilder((RedPackageStyleProto) this.data_).mergeFrom(redPackageStyleProto).buildPartial();
        }
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSeedingCard(SeedingCardStyleProto seedingCardStyleProto) {
        seedingCardStyleProto.getClass();
        if (this.dataCase_ != 9 || this.data_ == SeedingCardStyleProto.getDefaultInstance()) {
            this.data_ = seedingCardStyleProto;
        } else {
            this.data_ = SeedingCardStyleProto.newBuilder((SeedingCardStyleProto) this.data_).mergeFrom(seedingCardStyleProto).buildPartial();
        }
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStandardStyle(StandardStyleProto standardStyleProto) {
        standardStyleProto.getClass();
        if (this.dataCase_ != 2 || this.data_ == StandardStyleProto.getDefaultInstance()) {
            this.data_ = standardStyleProto;
        } else {
            this.data_ = StandardStyleProto.newBuilder((StandardStyleProto) this.data_).mergeFrom(standardStyleProto).buildPartial();
        }
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVerifyCode(VerifyCodeStyleProto verifyCodeStyleProto) {
        verifyCodeStyleProto.getClass();
        if (this.dataCase_ != 8 || this.data_ == VerifyCodeStyleProto.getDefaultInstance()) {
            this.data_ = verifyCodeStyleProto;
        } else {
            this.data_ = VerifyCodeStyleProto.newBuilder((VerifyCodeStyleProto) this.data_).mergeFrom(verifyCodeStyleProto).buildPartial();
        }
        this.dataCase_ = 8;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationStyleProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationStyleProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationStyleProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationStyleProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigPictureStyle(BigPictureStyleProto bigPictureStyleProto) {
        bigPictureStyleProto.getClass();
        this.data_ = bigPictureStyleProto;
        this.dataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigTextStyle(BigTextStyleProto bigTextStyleProto) {
        bigTextStyleProto.getClass();
        this.data_ = bigTextStyleProto;
        this.dataCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInboxStyle(InboxStyleProto inboxStyleProto) {
        inboxStyleProto.getClass();
        this.data_ = inboxStyleProto;
        this.dataCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagingStyle(MessagingStyleProto messagingStyleProto) {
        messagingStyleProto.getClass();
        this.data_ = messagingStyleProto;
        this.dataCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRedPackage(RedPackageStyleProto redPackageStyleProto) {
        redPackageStyleProto.getClass();
        this.data_ = redPackageStyleProto;
        this.dataCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeedingCard(SeedingCardStyleProto seedingCardStyleProto) {
        seedingCardStyleProto.getClass();
        this.data_ = seedingCardStyleProto;
        this.dataCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStandardStyle(StandardStyleProto standardStyleProto) {
        standardStyleProto.getClass();
        this.data_ = standardStyleProto;
        this.dataCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleType(String str) {
        str.getClass();
        this.styleType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.styleType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyCode(VerifyCodeStyleProto verifyCodeStyleProto) {
        verifyCodeStyleProto.getClass();
        this.data_ = verifyCodeStyleProto;
        this.dataCase_ = 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NotificationStyleProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"data_", "dataCase_", "styleType_", StandardStyleProto.class, MessagingStyleProto.class, BigTextStyleProto.class, InboxStyleProto.class, BigPictureStyleProto.class, RedPackageStyleProto.class, VerifyCodeStyleProto.class, SeedingCardStyleProto.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationStyleProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationStyleProto.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public BigPictureStyleProto getBigPictureStyle() {
        return this.dataCase_ == 6 ? (BigPictureStyleProto) this.data_ : BigPictureStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public BigTextStyleProto getBigTextStyle() {
        return this.dataCase_ == 4 ? (BigTextStyleProto) this.data_ : BigTextStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public DataCase getDataCase() {
        return DataCase.forNumber(this.dataCase_);
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public InboxStyleProto getInboxStyle() {
        return this.dataCase_ == 5 ? (InboxStyleProto) this.data_ : InboxStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public MessagingStyleProto getMessagingStyle() {
        return this.dataCase_ == 3 ? (MessagingStyleProto) this.data_ : MessagingStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public RedPackageStyleProto getRedPackage() {
        return this.dataCase_ == 7 ? (RedPackageStyleProto) this.data_ : RedPackageStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public SeedingCardStyleProto getSeedingCard() {
        return this.dataCase_ == 9 ? (SeedingCardStyleProto) this.data_ : SeedingCardStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public StandardStyleProto getStandardStyle() {
        return this.dataCase_ == 2 ? (StandardStyleProto) this.data_ : StandardStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public String getStyleType() {
        return this.styleType_;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public ByteString getStyleTypeBytes() {
        return ByteString.copyFromUtf8(this.styleType_);
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public VerifyCodeStyleProto getVerifyCode() {
        return this.dataCase_ == 8 ? (VerifyCodeStyleProto) this.data_ : VerifyCodeStyleProto.getDefaultInstance();
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasBigPictureStyle() {
        return this.dataCase_ == 6;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasBigTextStyle() {
        return this.dataCase_ == 4;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasInboxStyle() {
        return this.dataCase_ == 5;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasMessagingStyle() {
        return this.dataCase_ == 3;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasRedPackage() {
        return this.dataCase_ == 7;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasSeedingCard() {
        return this.dataCase_ == 9;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasStandardStyle() {
        return this.dataCase_ == 2;
    }

    @Override // com.heytap.health.watch.notification.NotificationStyleProtoOrBuilder
    public boolean hasVerifyCode() {
        return this.dataCase_ == 8;
    }

    public static Builder newBuilder(NotificationStyleProto notificationStyleProto) {
        return DEFAULT_INSTANCE.createBuilder(notificationStyleProto);
    }

    public static NotificationStyleProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationStyleProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationStyleProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationStyleProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationStyleProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationStyleProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationStyleProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationStyleProto parseFrom(InputStream inputStream) throws IOException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationStyleProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationStyleProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationStyleProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationStyleProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
