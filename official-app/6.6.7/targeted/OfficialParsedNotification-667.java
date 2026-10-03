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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\.\analysis\health667-dex\classes19.dex */
public final class ParsedNotificationProto extends GeneratedMessageLite<ParsedNotificationProto, Builder> implements ParsedNotificationProtoOrBuilder {
    public static final int ACTIONS_FIELD_NUMBER = 27;
    public static final int APPICONBITMAP_FIELD_NUMBER = 15;
    public static final int APPNAME_FIELD_NUMBER = 10;
    public static final int BRIDGETAG_FIELD_NUMBER = 22;
    public static final int COLOR_FIELD_NUMBER = 18;
    public static final int CONTENTINTENTID_FIELD_NUMBER = 24;
    private static final ParsedNotificationProto DEFAULT_INSTANCE;
    public static final int EXT_FIELD_NUMBER = 99;
    public static final int FLAGS_FIELD_NUMBER = 11;
    public static final int GROUPALERTBEHAVIOR_FIELD_NUMBER = 21;
    public static final int GROUPKEY_FIELD_NUMBER = 3;
    public static final int GROUP_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISEMERGENCY_FIELD_NUMBER = 25;
    public static final int ISGROUPSUMMARY_FIELD_NUMBER = 4;
    public static final int ISINTERRUPTIBLE_FIELD_NUMBER = 19;
    public static final int ISWORKPROFILE_FIELD_NUMBER = 14;
    public static final int KEY_FIELD_NUMBER = 2;
    public static final int LARGE144ICONBITMAP_FIELD_NUMBER = 30;
    public static final int LARGEICONBITMAP_FIELD_NUMBER = 17;
    public static final int PACKAGENAME_FIELD_NUMBER = 9;
    private static volatile Parser<ParsedNotificationProto> PARSER = null;
    public static final int POSTTIMEMILLIS_FIELD_NUMBER = 8;
    public static final int SHOULDONLYALERTONCE_FIELD_NUMBER = 20;
    public static final int SMALLICONBITMAP_FIELD_NUMBER = 16;
    public static final int STYLE_FIELD_NUMBER = 26;
    public static final int SUBTEXT_FIELD_NUMBER = 23;
    public static final int TAG_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 6;
    public static final int USERID_FIELD_NUMBER = 12;
    public static final int WEARABLEACTIONS_FIELD_NUMBER = 28;
    public static final int WHENTIMEMILLIS_FIELD_NUMBER = 7;
    private MsgPictureProto appIconBitmap_;
    private int bitField0_;
    private int color_;
    private Extend ext_;
    private int flags_;
    private int groupAlertBehavior_;
    private int id_;
    private boolean isEmergency_;
    private boolean isGroupSummary_;
    private boolean isInterruptible_;
    private boolean isWorkProfile_;
    private MsgPictureProto large144IconBitmap_;
    private MsgPictureProto largeIconBitmap_;
    private long postTimeMillis_;
    private boolean shouldOnlyAlertOnce_;
    private MsgPictureProto smallIconBitmap_;
    private NotificationStyleProto style_;
    private int userId_;
    private long whenTimeMillis_;
    private String key_ = "";
    private String groupKey_ = "";
    private String tag_ = "";
    private String title_ = "";
    private String packageName_ = "";
    private String appName_ = "";
    private String group_ = "";
    private String bridgeTag_ = "";
    private String subText_ = "";
    private String contentIntentId_ = "";
    private Internal.ProtobufList<ParsedNotificationActionProto> actions_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ParsedNotificationActionProto> wearableActions_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<ParsedNotificationProto, Builder> implements ParsedNotificationProtoOrBuilder {
        public Builder addActions(ParsedNotificationActionProto parsedNotificationActionProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addActions(parsedNotificationActionProto);
            return this;
        }

        public Builder addAllActions(Iterable<? extends ParsedNotificationActionProto> iterable) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addAllActions(iterable);
            return this;
        }

        public Builder addAllWearableActions(Iterable<? extends ParsedNotificationActionProto> iterable) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addAllWearableActions(iterable);
            return this;
        }

        public Builder addWearableActions(ParsedNotificationActionProto parsedNotificationActionProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addWearableActions(parsedNotificationActionProto);
            return this;
        }

        public Builder clearActions() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearActions();
            return this;
        }

        public Builder clearAppIconBitmap() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearAppIconBitmap();
            return this;
        }

        public Builder clearAppName() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearAppName();
            return this;
        }

        public Builder clearBridgeTag() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearBridgeTag();
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearColor();
            return this;
        }

        public Builder clearContentIntentId() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearContentIntentId();
            return this;
        }

        public Builder clearExt() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearExt();
            return this;
        }

        public Builder clearFlags() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearFlags();
            return this;
        }

        public Builder clearGroup() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearGroup();
            return this;
        }

        public Builder clearGroupAlertBehavior() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearGroupAlertBehavior();
            return this;
        }

        public Builder clearGroupKey() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearGroupKey();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearId();
            return this;
        }

        public Builder clearIsEmergency() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearIsEmergency();
            return this;
        }

        public Builder clearIsGroupSummary() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearIsGroupSummary();
            return this;
        }

        public Builder clearIsInterruptible() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearIsInterruptible();
            return this;
        }

        public Builder clearIsWorkProfile() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearIsWorkProfile();
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearKey();
            return this;
        }

        public Builder clearLarge144IconBitmap() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearLarge144IconBitmap();
            return this;
        }

        public Builder clearLargeIconBitmap() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearLargeIconBitmap();
            return this;
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearPackageName();
            return this;
        }

        public Builder clearPostTimeMillis() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearPostTimeMillis();
            return this;
        }

        public Builder clearShouldOnlyAlertOnce() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearShouldOnlyAlertOnce();
            return this;
        }

        public Builder clearSmallIconBitmap() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearSmallIconBitmap();
            return this;
        }

        public Builder clearStyle() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearStyle();
            return this;
        }

        public Builder clearSubText() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearSubText();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearTag();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearTitle();
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearUserId();
            return this;
        }

        public Builder clearWearableActions() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearWearableActions();
            return this;
        }

        public Builder clearWhenTimeMillis() {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).clearWhenTimeMillis();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ParsedNotificationActionProto getActions(int i) {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getActions(i);
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getActionsCount() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getActionsCount();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public List<ParsedNotificationActionProto> getActionsList() {
            return Collections.unmodifiableList(((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getActionsList());
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public MsgPictureProto getAppIconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getAppIconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getAppName() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getAppName();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getAppNameBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getAppNameBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getBridgeTag() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getBridgeTag();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getBridgeTagBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getBridgeTagBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getColor() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getColor();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getContentIntentId() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getContentIntentId();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getContentIntentIdBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getContentIntentIdBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public Extend getExt() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getExt();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getFlags() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getFlags();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getGroup() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getGroup();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getGroupAlertBehavior() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getGroupAlertBehavior();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getGroupBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getGroupBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getGroupKey() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getGroupKey();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getGroupKeyBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getGroupKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getId() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getId();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean getIsEmergency() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getIsEmergency();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean getIsGroupSummary() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getIsGroupSummary();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean getIsInterruptible() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getIsInterruptible();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean getIsWorkProfile() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getIsWorkProfile();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getKey() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getKey();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getKeyBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public MsgPictureProto getLarge144IconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getLarge144IconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public MsgPictureProto getLargeIconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getLargeIconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getPackageName() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getPackageName();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getPackageNameBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getPackageNameBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public long getPostTimeMillis() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getPostTimeMillis();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean getShouldOnlyAlertOnce() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getShouldOnlyAlertOnce();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public MsgPictureProto getSmallIconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getSmallIconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public NotificationStyleProto getStyle() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getStyle();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getSubText() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getSubText();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getSubTextBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getSubTextBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getTag() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getTag();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getTagBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getTagBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public String getTitle() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getTitle();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ByteString getTitleBytes() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getTitleBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getUserId() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getUserId();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public ParsedNotificationActionProto getWearableActions(int i) {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getWearableActions(i);
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public int getWearableActionsCount() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getWearableActionsCount();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public List<ParsedNotificationActionProto> getWearableActionsList() {
            return Collections.unmodifiableList(((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getWearableActionsList());
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public long getWhenTimeMillis() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).getWhenTimeMillis();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean hasAppIconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).hasAppIconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean hasExt() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).hasExt();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean hasLarge144IconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).hasLarge144IconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean hasLargeIconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).hasLargeIconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean hasSmallIconBitmap() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).hasSmallIconBitmap();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
        public boolean hasStyle() {
            return ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).hasStyle();
        }

        public Builder mergeAppIconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).mergeAppIconBitmap(msgPictureProto);
            return this;
        }

        public Builder mergeExt(Extend extend) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).mergeExt(extend);
            return this;
        }

        public Builder mergeLarge144IconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).mergeLarge144IconBitmap(msgPictureProto);
            return this;
        }

        public Builder mergeLargeIconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).mergeLargeIconBitmap(msgPictureProto);
            return this;
        }

        public Builder mergeSmallIconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).mergeSmallIconBitmap(msgPictureProto);
            return this;
        }

        public Builder mergeStyle(NotificationStyleProto notificationStyleProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).mergeStyle(notificationStyleProto);
            return this;
        }

        public Builder removeActions(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).removeActions(i);
            return this;
        }

        public Builder removeWearableActions(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).removeWearableActions(i);
            return this;
        }

        public Builder setActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setActions(i, parsedNotificationActionProto);
            return this;
        }

        public Builder setAppIconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setAppIconBitmap(msgPictureProto);
            return this;
        }

        public Builder setAppName(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setAppName(str);
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setAppNameBytes(byteString);
            return this;
        }

        public Builder setBridgeTag(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setBridgeTag(str);
            return this;
        }

        public Builder setBridgeTagBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setBridgeTagBytes(byteString);
            return this;
        }

        public Builder setColor(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setColor(i);
            return this;
        }

        public Builder setContentIntentId(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setContentIntentId(str);
            return this;
        }

        public Builder setContentIntentIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setContentIntentIdBytes(byteString);
            return this;
        }

        public Builder setExt(Extend extend) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setExt(extend);
            return this;
        }

        public Builder setFlags(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setFlags(i);
            return this;
        }

        public Builder setGroup(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setGroup(str);
            return this;
        }

        public Builder setGroupAlertBehavior(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setGroupAlertBehavior(i);
            return this;
        }

        public Builder setGroupBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setGroupBytes(byteString);
            return this;
        }

        public Builder setGroupKey(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setGroupKey(str);
            return this;
        }

        public Builder setGroupKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setGroupKeyBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setId(i);
            return this;
        }

        public Builder setIsEmergency(boolean z) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setIsEmergency(z);
            return this;
        }

        public Builder setIsGroupSummary(boolean z) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setIsGroupSummary(z);
            return this;
        }

        public Builder setIsInterruptible(boolean z) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setIsInterruptible(z);
            return this;
        }

        public Builder setIsWorkProfile(boolean z) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setIsWorkProfile(z);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setLarge144IconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setLarge144IconBitmap(msgPictureProto);
            return this;
        }

        public Builder setLargeIconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setLargeIconBitmap(msgPictureProto);
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setPackageNameBytes(byteString);
            return this;
        }

        public Builder setPostTimeMillis(long j) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setPostTimeMillis(j);
            return this;
        }

        public Builder setShouldOnlyAlertOnce(boolean z) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setShouldOnlyAlertOnce(z);
            return this;
        }

        public Builder setSmallIconBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setSmallIconBitmap(msgPictureProto);
            return this;
        }

        public Builder setStyle(NotificationStyleProto notificationStyleProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setStyle(notificationStyleProto);
            return this;
        }

        public Builder setSubText(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setSubText(str);
            return this;
        }

        public Builder setSubTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setSubTextBytes(byteString);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setTagBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setUserId(int i) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setUserId(i);
            return this;
        }

        public Builder setWearableActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setWearableActions(i, parsedNotificationActionProto);
            return this;
        }

        public Builder setWhenTimeMillis(long j) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setWhenTimeMillis(j);
            return this;
        }

        private Builder() {
            super(ParsedNotificationProto.DEFAULT_INSTANCE);
        }

        public Builder addActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addActions(i, parsedNotificationActionProto);
            return this;
        }

        public Builder addWearableActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addWearableActions(i, parsedNotificationActionProto);
            return this;
        }

        public Builder setActions(int i, ParsedNotificationActionProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setActions(i, (ParsedNotificationActionProto) builder.build());
            return this;
        }

        public Builder setAppIconBitmap(MsgPictureProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setAppIconBitmap((MsgPictureProto) builder.build());
            return this;
        }

        public Builder setExt(Extend.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setExt((Extend) builder.build());
            return this;
        }

        public Builder setLarge144IconBitmap(MsgPictureProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setLarge144IconBitmap((MsgPictureProto) builder.build());
            return this;
        }

        public Builder setLargeIconBitmap(MsgPictureProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setLargeIconBitmap((MsgPictureProto) builder.build());
            return this;
        }

        public Builder setSmallIconBitmap(MsgPictureProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setSmallIconBitmap((MsgPictureProto) builder.build());
            return this;
        }

        public Builder setStyle(NotificationStyleProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setStyle((NotificationStyleProto) builder.build());
            return this;
        }

        public Builder setWearableActions(int i, ParsedNotificationActionProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).setWearableActions(i, (ParsedNotificationActionProto) builder.build());
            return this;
        }

        public Builder addActions(ParsedNotificationActionProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addActions((ParsedNotificationActionProto) builder.build());
            return this;
        }

        public Builder addWearableActions(ParsedNotificationActionProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addWearableActions((ParsedNotificationActionProto) builder.build());
            return this;
        }

        public Builder addActions(int i, ParsedNotificationActionProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addActions(i, (ParsedNotificationActionProto) builder.build());
            return this;
        }

        public Builder addWearableActions(int i, ParsedNotificationActionProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationProto) ((GeneratedMessageLite.Builder) this).instance).addWearableActions(i, (ParsedNotificationActionProto) builder.build());
            return this;
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
        ParsedNotificationProto parsedNotificationProto = new ParsedNotificationProto();
        DEFAULT_INSTANCE = parsedNotificationProto;
        GeneratedMessageLite.registerDefaultInstance(ParsedNotificationProto.class, parsedNotificationProto);
    }

    private ParsedNotificationProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActions(ParsedNotificationActionProto parsedNotificationActionProto) {
        parsedNotificationActionProto.getClass();
        ensureActionsIsMutable();
        this.actions_.add(parsedNotificationActionProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActions(Iterable<? extends ParsedNotificationActionProto> iterable) {
        ensureActionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.actions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWearableActions(Iterable<? extends ParsedNotificationActionProto> iterable) {
        ensureWearableActionsIsMutable();
        AbstractMessageLite.addAll(iterable, this.wearableActions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWearableActions(ParsedNotificationActionProto parsedNotificationActionProto) {
        parsedNotificationActionProto.getClass();
        ensureWearableActionsIsMutable();
        this.wearableActions_.add(parsedNotificationActionProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActions() {
        this.actions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppIconBitmap() {
        this.appIconBitmap_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppName() {
        this.appName_ = getDefaultInstance().getAppName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBridgeTag() {
        this.bridgeTag_ = getDefaultInstance().getBridgeTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentIntentId() {
        this.contentIntentId_ = getDefaultInstance().getContentIntentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExt() {
        this.ext_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlags() {
        this.flags_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroup() {
        this.group_ = getDefaultInstance().getGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupAlertBehavior() {
        this.groupAlertBehavior_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupKey() {
        this.groupKey_ = getDefaultInstance().getGroupKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEmergency() {
        this.isEmergency_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsGroupSummary() {
        this.isGroupSummary_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInterruptible() {
        this.isInterruptible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsWorkProfile() {
        this.isWorkProfile_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLarge144IconBitmap() {
        this.large144IconBitmap_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLargeIconBitmap() {
        this.largeIconBitmap_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostTimeMillis() {
        this.postTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldOnlyAlertOnce() {
        this.shouldOnlyAlertOnce_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmallIconBitmap() {
        this.smallIconBitmap_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyle() {
        this.style_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubText() {
        this.subText_ = getDefaultInstance().getSubText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.userId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWearableActions() {
        this.wearableActions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWhenTimeMillis() {
        this.whenTimeMillis_ = 0L;
    }

    private void ensureActionsIsMutable() {
        Internal.ProtobufList<ParsedNotificationActionProto> protobufList = this.actions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.actions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureWearableActionsIsMutable() {
        Internal.ProtobufList<ParsedNotificationActionProto> protobufList = this.wearableActions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.wearableActions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static ParsedNotificationProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppIconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        MsgPictureProto msgPictureProto2 = this.appIconBitmap_;
        if (msgPictureProto2 == null || msgPictureProto2 == MsgPictureProto.getDefaultInstance()) {
            this.appIconBitmap_ = msgPictureProto;
        } else {
            this.appIconBitmap_ = (MsgPictureProto) ((MsgPictureProto.Builder) MsgPictureProto.newBuilder(this.appIconBitmap_).mergeFrom(msgPictureProto)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExt(Extend extend) {
        extend.getClass();
        Extend extend2 = this.ext_;
        if (extend2 == null || extend2 == Extend.getDefaultInstance()) {
            this.ext_ = extend;
        } else {
            this.ext_ = (Extend) ((Extend.Builder) Extend.newBuilder(this.ext_).mergeFrom(extend)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLarge144IconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        MsgPictureProto msgPictureProto2 = this.large144IconBitmap_;
        if (msgPictureProto2 == null || msgPictureProto2 == MsgPictureProto.getDefaultInstance()) {
            this.large144IconBitmap_ = msgPictureProto;
        } else {
            this.large144IconBitmap_ = (MsgPictureProto) ((MsgPictureProto.Builder) MsgPictureProto.newBuilder(this.large144IconBitmap_).mergeFrom(msgPictureProto)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLargeIconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        MsgPictureProto msgPictureProto2 = this.largeIconBitmap_;
        if (msgPictureProto2 == null || msgPictureProto2 == MsgPictureProto.getDefaultInstance()) {
            this.largeIconBitmap_ = msgPictureProto;
        } else {
            this.largeIconBitmap_ = (MsgPictureProto) ((MsgPictureProto.Builder) MsgPictureProto.newBuilder(this.largeIconBitmap_).mergeFrom(msgPictureProto)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSmallIconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        MsgPictureProto msgPictureProto2 = this.smallIconBitmap_;
        if (msgPictureProto2 == null || msgPictureProto2 == MsgPictureProto.getDefaultInstance()) {
            this.smallIconBitmap_ = msgPictureProto;
        } else {
            this.smallIconBitmap_ = (MsgPictureProto) ((MsgPictureProto.Builder) MsgPictureProto.newBuilder(this.smallIconBitmap_).mergeFrom(msgPictureProto)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStyle(NotificationStyleProto notificationStyleProto) {
        notificationStyleProto.getClass();
        NotificationStyleProto notificationStyleProto2 = this.style_;
        if (notificationStyleProto2 == null || notificationStyleProto2 == NotificationStyleProto.getDefaultInstance()) {
            this.style_ = notificationStyleProto;
        } else {
            this.style_ = (NotificationStyleProto) ((NotificationStyleProto.Builder) NotificationStyleProto.newBuilder(this.style_).mergeFrom(notificationStyleProto)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ParsedNotificationProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParsedNotificationProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ParsedNotificationProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActions(int i) {
        ensureActionsIsMutable();
        this.actions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWearableActions(int i) {
        ensureWearableActionsIsMutable();
        this.wearableActions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
        parsedNotificationActionProto.getClass();
        ensureActionsIsMutable();
        this.actions_.set(i, parsedNotificationActionProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        this.appIconBitmap_ = msgPictureProto;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppName(String str) {
        str.getClass();
        this.appName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBridgeTag(String str) {
        str.getClass();
        this.bridgeTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBridgeTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bridgeTag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(int i) {
        this.color_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentIntentId(String str) {
        str.getClass();
        this.contentIntentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentIntentIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.contentIntentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExt(Extend extend) {
        extend.getClass();
        this.ext_ = extend;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlags(int i) {
        this.flags_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroup(String str) {
        str.getClass();
        this.group_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupAlertBehavior(int i) {
        this.groupAlertBehavior_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.group_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupKey(String str) {
        str.getClass();
        this.groupKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.groupKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEmergency(boolean z) {
        this.isEmergency_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsGroupSummary(boolean z) {
        this.isGroupSummary_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInterruptible(boolean z) {
        this.isInterruptible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsWorkProfile(boolean z) {
        this.isWorkProfile_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLarge144IconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        this.large144IconBitmap_ = msgPictureProto;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLargeIconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        this.largeIconBitmap_ = msgPictureProto;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostTimeMillis(long j) {
        this.postTimeMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldOnlyAlertOnce(boolean z) {
        this.shouldOnlyAlertOnce_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmallIconBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        this.smallIconBitmap_ = msgPictureProto;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyle(NotificationStyleProto notificationStyleProto) {
        notificationStyleProto.getClass();
        this.style_ = notificationStyleProto;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubText(String str) {
        str.getClass();
        this.subText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subText_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(int i) {
        this.userId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWearableActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
        parsedNotificationActionProto.getClass();
        ensureWearableActionsIsMutable();
        this.wearableActions_.set(i, parsedNotificationActionProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhenTimeMillis(long j) {
        this.whenTimeMillis_ = j;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ParsedNotificationProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001e\u0000\u0001\u0001c\u001e\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007\u0003\b\u0003\tȈ\nȈ\u000b\u0004\f\u0004\rȈ\u000e\u0007\u000fဉ\u0000\u0010ဉ\u0001\u0011ဉ\u0002\u0012\u0004\u0013\u0007\u0014\u0007\u0015\u0004\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019\u0007\u001aဉ\u0004\u001b\u001b\u001c\u001b\u001eဉ\u0003cဉ\u0005", new Object[]{"bitField0_", "id_", "key_", "groupKey_", "isGroupSummary_", "tag_", "title_", "whenTimeMillis_", "postTimeMillis_", "packageName_", "appName_", "flags_", "userId_", "group_", "isWorkProfile_", "appIconBitmap_", "smallIconBitmap_", "largeIconBitmap_", "color_", "isInterruptible_", "shouldOnlyAlertOnce_", "groupAlertBehavior_", "bridgeTag_", "subText_", "contentIntentId_", "isEmergency_", "style_", "actions_", ParsedNotificationActionProto.class, "wearableActions_", ParsedNotificationActionProto.class, "large144IconBitmap_", "ext_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ParsedNotificationProto.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ParsedNotificationActionProto getActions(int i) {
        return (ParsedNotificationActionProto) this.actions_.get(i);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getActionsCount() {
        return this.actions_.size();
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public List<ParsedNotificationActionProto> getActionsList() {
        return this.actions_;
    }

    public ParsedNotificationActionProtoOrBuilder getActionsOrBuilder(int i) {
        return (ParsedNotificationActionProtoOrBuilder) this.actions_.get(i);
    }

    public List<? extends ParsedNotificationActionProtoOrBuilder> getActionsOrBuilderList() {
        return this.actions_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public MsgPictureProto getAppIconBitmap() {
        MsgPictureProto msgPictureProto = this.appIconBitmap_;
        return msgPictureProto == null ? MsgPictureProto.getDefaultInstance() : msgPictureProto;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getAppName() {
        return this.appName_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getAppNameBytes() {
        return ByteString.copyFromUtf8(this.appName_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getBridgeTag() {
        return this.bridgeTag_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getBridgeTagBytes() {
        return ByteString.copyFromUtf8(this.bridgeTag_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getColor() {
        return this.color_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getContentIntentId() {
        return this.contentIntentId_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getContentIntentIdBytes() {
        return ByteString.copyFromUtf8(this.contentIntentId_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public Extend getExt() {
        Extend extend = this.ext_;
        return extend == null ? Extend.getDefaultInstance() : extend;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getFlags() {
        return this.flags_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getGroup() {
        return this.group_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getGroupAlertBehavior() {
        return this.groupAlertBehavior_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getGroupBytes() {
        return ByteString.copyFromUtf8(this.group_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getGroupKey() {
        return this.groupKey_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getGroupKeyBytes() {
        return ByteString.copyFromUtf8(this.groupKey_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean getIsEmergency() {
        return this.isEmergency_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean getIsGroupSummary() {
        return this.isGroupSummary_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean getIsInterruptible() {
        return this.isInterruptible_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean getIsWorkProfile() {
        return this.isWorkProfile_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public MsgPictureProto getLarge144IconBitmap() {
        MsgPictureProto msgPictureProto = this.large144IconBitmap_;
        return msgPictureProto == null ? MsgPictureProto.getDefaultInstance() : msgPictureProto;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public MsgPictureProto getLargeIconBitmap() {
        MsgPictureProto msgPictureProto = this.largeIconBitmap_;
        return msgPictureProto == null ? MsgPictureProto.getDefaultInstance() : msgPictureProto;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public long getPostTimeMillis() {
        return this.postTimeMillis_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean getShouldOnlyAlertOnce() {
        return this.shouldOnlyAlertOnce_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public MsgPictureProto getSmallIconBitmap() {
        MsgPictureProto msgPictureProto = this.smallIconBitmap_;
        return msgPictureProto == null ? MsgPictureProto.getDefaultInstance() : msgPictureProto;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public NotificationStyleProto getStyle() {
        NotificationStyleProto notificationStyleProto = this.style_;
        return notificationStyleProto == null ? NotificationStyleProto.getDefaultInstance() : notificationStyleProto;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getSubText() {
        return this.subText_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getSubTextBytes() {
        return ByteString.copyFromUtf8(this.subText_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getTag() {
        return this.tag_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getUserId() {
        return this.userId_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public ParsedNotificationActionProto getWearableActions(int i) {
        return (ParsedNotificationActionProto) this.wearableActions_.get(i);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public int getWearableActionsCount() {
        return this.wearableActions_.size();
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public List<ParsedNotificationActionProto> getWearableActionsList() {
        return this.wearableActions_;
    }

    public ParsedNotificationActionProtoOrBuilder getWearableActionsOrBuilder(int i) {
        return (ParsedNotificationActionProtoOrBuilder) this.wearableActions_.get(i);
    }

    public List<? extends ParsedNotificationActionProtoOrBuilder> getWearableActionsOrBuilderList() {
        return this.wearableActions_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public long getWhenTimeMillis() {
        return this.whenTimeMillis_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean hasAppIconBitmap() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean hasExt() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean hasLarge144IconBitmap() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean hasLargeIconBitmap() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean hasSmallIconBitmap() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationProtoOrBuilder
    public boolean hasStyle() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(ParsedNotificationProto parsedNotificationProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(parsedNotificationProto);
    }

    public static ParsedNotificationProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ParsedNotificationProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ParsedNotificationProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
        parsedNotificationActionProto.getClass();
        ensureActionsIsMutable();
        this.actions_.add(i, parsedNotificationActionProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWearableActions(int i, ParsedNotificationActionProto parsedNotificationActionProto) {
        parsedNotificationActionProto.getClass();
        ensureWearableActionsIsMutable();
        this.wearableActions_.add(i, parsedNotificationActionProto);
    }

    public static ParsedNotificationProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ParsedNotificationProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ParsedNotificationProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ParsedNotificationProto parseFrom(InputStream inputStream) throws IOException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParsedNotificationProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ParsedNotificationProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ParsedNotificationProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
