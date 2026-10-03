package com.oplus.aiunit.p007vision;

import android.app.Notification;
import android.app.RemoteInput;
import android.bluetooth.BluetoothManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.core.os.BundleCompat;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.heytap.health.watch.notification.BigPictureProto;
import com.heytap.health.watch.notification.BigPictureStyleProto;
import com.heytap.health.watch.notification.DismissNotificationProto;
import com.heytap.health.watch.notification.Extend;
import com.heytap.health.watch.notification.ExtendAction;
import com.heytap.health.watch.notification.ExtendCommon;
import com.heytap.health.watch.notification.ExtendPush;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.MessageStyle;
import com.heytap.health.watch.notification.MsgPictureProto;
import com.heytap.health.watch.notification.NTFCmdId2;
import com.heytap.health.watch.notification.NotificationStyleProto;
import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.heytap.health.watch.notification.ParsedNotificationProto;
import com.heytap.health.watch.notification.ParsedRemoteInputProto;
import com.heytap.health.watch.notification.RedPackageStyleProto;
import com.heytap.health.watch.notification.SimpleNotificationProto;
import com.heytap.health.watch.notification.StandardStyleProto;
import com.heytap.health.watch.notification.VerifyCodeStyleProto;
import com.heytap.health.watch.notification.WechatMessage;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.notification.impl.fluid.ImageBean;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.heytap.health.watchpair.family.personalInfo.FamilyPersonalInfoActivity;
import com.heytap.log.config.LogMemoryConfig;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b8h;
import com.oplus.aiunit.vision.d88;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.em4;
import com.oplus.aiunit.vision.hm4;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mb5;
import com.oplus.aiunit.vision.qek;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.wwc;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b+\u0010,J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J4\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J8\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J8\u0010 \u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010\u00192\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/acl;", "Lcom/oplus/aiunit/vision/cb4;", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Landroid/os/Bundle;", "watchPush", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", "config", "n", "g", "j", "a", "b", "", "N", "", "cacheKey", "", "cid", "Lcom/heytap/health/watch/notification/ParsedNotificationProto$Builder;", "build", FamilyPersonalInfoActivity.SEX_M, "L", "", "bytes", "picKey", "picType", "width", "height", "O", "P", "extras", "I", "Landroid/graphics/Bitmap;", "bitmap", "H", "Lcom/heytap/health/watch/notification/NotificationStyleProto;", "K", "", "Lcom/heytap/health/watch/notification/ParsedNotificationActionProto;", "J", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWatch4GenConverterWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Watch4GenConverterWorker.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/Watch4GenConverterWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,883:1\n1855#2,2:884\n1#3:886\n13374#4,2:887\n13374#4,3:889\n13376#4:892\n*S KotlinDebug\n*F\n+ 1 Watch4GenConverterWorker.kt\ncom/heytap/health/watch/notification/impl/transceiver/convert/Watch4GenConverterWorker\n*L\n525#1:884,2\n838#1:887,2\n844#1:889,3\n838#1:892\n*E\n"})
public final class acl extends cb4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String IMAGE_KEY = "image";
    public static final int IMPORTANT_LEVEL = 11;

    @NotNull
    public static final String KEY_A = "A";

    @NotNull
    public static final String KEY_A0 = "A0";

    @NotNull
    public static final String KEY_A1 = "A1";

    @NotNull
    public static final String KEY_ALL_STEPS = "ALL_STEPS";

    @NotNull
    public static final String KEY_B = "B";

    @NotNull
    public static final String KEY_B0 = "B0";

    @NotNull
    public static final String KEY_B0_COLOR = "B0_COLOR";

    @NotNull
    public static final String KEY_B1 = "B1";

    @NotNull
    public static final String KEY_B1_COLOR = "B1_COLOR";

    @NotNull
    public static final String KEY_B4 = "B4";

    @NotNull
    public static final String KEY_BG_COLOR = "BG_COLOR";

    @NotNull
    public static final String KEY_B_COLOR = "B_COLOR";

    @NotNull
    public static final String KEY_C1 = "C1";

    @NotNull
    public static final String KEY_C1_COLOR = "C1_COLOR";

    @NotNull
    public static final String KEY_C2 = "C2";

    @NotNull
    public static final String KEY_C2_COLOR = "C2_COLOR";

    @NotNull
    public static final String KEY_C3 = "C3";

    @NotNull
    public static final String KEY_C3_COLOR = "C3_COLOR";

    @NotNull
    public static final String KEY_CATEGORY = "category";

    @NotNull
    public static final String KEY_COMPAT_LEFT_ICON = "compatLeftIcon";

    @NotNull
    public static final String KEY_COMPAT_RIGHT_ICON = "compatRightIcon";

    @NotNull
    public static final String KEY_COUNT_TIME = "KEY_COUNT_TIME";

    @NotNull
    public static final String KEY_COUNT_TIME_START = "KEY_COUNT_TIME_START";

    @NotNull
    public static final String KEY_CURRENT_STEP = "CURRENT_STEP";

    @NotNull
    public static final String KEY_D1 = "D1";

    @NotNull
    public static final String KEY_D12 = "D12";

    @NotNull
    public static final String KEY_D12_IMAGE = "KEY_D12_IMAGE";

    @NotNull
    public static final String KEY_D12_IMAGE_DATA = "KEY_D12_IMAGE_DATA";

    @NotNull
    public static final String KEY_D13_NODES = "KEY_D13_NODES";

    @NotNull
    public static final String KEY_D18 = "D18";

    @NotNull
    public static final String KEY_D19 = "D19";

    @NotNull
    public static final String KEY_D20 = "D20";

    @NotNull
    public static final String KEY_D20_DATA = "D20_DATA";

    @NotNull
    public static final String KEY_DEFAULT_C = "DEFAULT_C";

    @NotNull
    public static final String KEY_EXTERNAL_ICON = "externalIcon";

    @NotNull
    public static final String KEY_F1 = "F1";

    @NotNull
    public static final String KEY_F1_COLOR = "F1_COLOR";

    @NotNull
    public static final String KEY_FLUID_DISMISS_ONCE = "KEY_FLUID_DISMISS_ONCE";

    @NotNull
    public static final String KEY_F_COLOR = "F_COLOR";

    @NotNull
    public static final String KEY_GROUP_PRIORITY = "GROUP_PRIORITY";

    @NotNull
    public static final String KEY_ICON = "icon";

    @NotNull
    public static final String KEY_IMAGES = "KEY_IMAGES";

    @NotNull
    public static final String KEY_NOTIFY_FORCE_SHOW = "KEY_NOTIFY_FORCE_SHOW";

    @NotNull
    public static final String KEY_NOTIFY_LEVEL = "KEY_NOTIFY_LEVEL";

    @NotNull
    public static final String KEY_PERCENT = "PERCENT";

    @NotNull
    public static final String KEY_SCORE = "SCORE";

    @NotNull
    public static final String KEY_TEXTS = "KEY_TEXTS";

    @NotNull
    public static final String KEY_TYPES = "KEY_TYPES";
    public static final int NOTIFY_IMPORTANT = 1;
    public static final int NOTIFY_IMPORTANT_LOW = 2;
    public static final int NOTIFY_NORMAL = 0;

    @NotNull
    public static final String SPAN_KEY = "span";

    @NotNull
    public static final String SQUARE_84_112 = "_Square_84*112";

    @NotNull
    public static final String SRC_KEY = "src";
    public static final int START_ACTIVITY = 1;
    public static final int START_APP = 0;

    @NotNull
    public static final String TEXT_KEY = "text";

    @NotNull
    public static final String TYPE_CENTER = "center";

    @NotNull
    public static final String TYPE_CUSTOM = "custom";

    @NotNull
    public static final String TYPE_TRAILING = "trailing";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.acl$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bC\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bO\u0010PJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\fR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\fR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\fR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\fR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\fR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\fR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\fR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\fR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\fR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\fR\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\fR\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\fR\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\fR\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\fR\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\fR\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\fR\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\fR\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\fR\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\fR\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\fR\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\fR\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\fR\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\fR\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\fR\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\fR\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\fR\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\fR\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\fR\u0014\u0010>\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\fR\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\fR\u0014\u0010@\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\fR\u0014\u0010A\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010\u0010R\u0014\u0010B\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u0014\u0010C\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u0010R\u0014\u0010D\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0010R\u0014\u0010E\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\u0010R\u0014\u0010F\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\fR\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010\fR\u0014\u0010H\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\fR\u0014\u0010I\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\u0010R\u0014\u0010J\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0010R\u0014\u0010K\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010\fR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\fR\u0014\u0010M\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\fR\u0014\u0010N\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\f¨\u0006Q"}, d2 = {"Lcom/oplus/aiunit/vision/acl$a;", "", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "", "secret", "", "a", "b", "c", "d", "ELLIPSIS", "Ljava/lang/String;", "IMAGE_KEY", "", "IMPORTANT_LEVEL", "I", "KEY_A", "KEY_A0", "KEY_A1", "KEY_ALL_STEPS", "KEY_B", "KEY_B0", "KEY_B0_COLOR", "KEY_B1", "KEY_B1_COLOR", "KEY_B4", "KEY_BG_COLOR", "KEY_B_COLOR", "KEY_C1", "KEY_C1_COLOR", "KEY_C2", "KEY_C2_COLOR", "KEY_C3", "KEY_C3_COLOR", "KEY_CATEGORY", "KEY_COMPAT_LEFT_ICON", "KEY_COMPAT_RIGHT_ICON", acl.KEY_COUNT_TIME, acl.KEY_COUNT_TIME_START, "KEY_CURRENT_STEP", "KEY_D1", "KEY_D12", acl.KEY_D12_IMAGE, acl.KEY_D12_IMAGE_DATA, acl.KEY_D13_NODES, "KEY_D18", "KEY_D19", "KEY_D20", "KEY_D20_DATA", "KEY_DEFAULT_C", "KEY_EXTERNAL_ICON", "KEY_F1", "KEY_F1_COLOR", acl.KEY_FLUID_DISMISS_ONCE, "KEY_F_COLOR", "KEY_GROUP_PRIORITY", "KEY_ICON", acl.KEY_IMAGES, acl.KEY_NOTIFY_FORCE_SHOW, acl.KEY_NOTIFY_LEVEL, "KEY_PERCENT", "KEY_SCORE", acl.KEY_TEXTS, acl.KEY_TYPES, "LENGTH_MAX_CONTENT", "LENGTH_MAX_TITLE", "NOTIFY_IMPORTANT", "NOTIFY_IMPORTANT_LOW", "NOTIFY_NORMAL", "SPAN_KEY", "SQUARE_84_112", "SRC_KEY", "START_ACTIVITY", "START_APP", "TEXT_KEY", "TYPE_CENTER", "TYPE_CUSTOM", "TYPE_TRAILING", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final byte[] a(@NotNull HealthNotificationBean hnb, @NotNull String secret) {
            Intrinsics.checkNotNullParameter(hnb, "hnb");
            Intrinsics.checkNotNullParameter(secret, "secret");
            String strH = c0d.INSTANCE.h(hnb);
            ParsedNotificationProto.Builder large144IconBitmap = ParsedNotificationProto.newBuilder().setId(hnb.getId()).setFlags(hnb.getFlags()).setTag(hnb.getTag()).setKey(hnb.getKey()).setGroupKey(hnb.getGroupKey()).setPackageName(hnb.getPackageName()).setSubText(hnb.getSubText()).setAppName(cb4.INSTANCE.a(hnb)).setBridgeTag(hnb.getBridgeTag()).setPostTimeMillis(hnb.getPostTimeMillis()).setTitle(d(hnb, secret)).setLargeIconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(strH + mxc.PIC_TYPE_LARGE).setPicType(mxc.PIC_TYPE_LARGE).build()).setLarge144IconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(strH + mxc.PIC_TYPE_LARGE_144).setPicType(mxc.PIC_TYPE_LARGE_144).build());
            em4 em4Var = wl4.managerApi;
            String strQ = em4Var.q(mb5.a.INSTANCE);
            large144IconBitmap.setExt(Extend.newBuilder().setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(b()).setDeviceFlag(wwc.a(strQ).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ)).setMultipleLink(em4Var.w(strQ))));
            NotificationStyleProto.Builder builderNewBuilder = NotificationStyleProto.newBuilder();
            builderNewBuilder.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(c(hnb, secret)).build());
            builderNewBuilder.setStyleType(String.valueOf(hnb.getStyle().getValue()));
            large144IconBitmap.setStyle((NotificationStyleProto) builderNewBuilder.build());
            ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) large144IconBitmap.build();
            StringBuilder sb = new StringBuilder();
            sb.append("Watch4Gen convertCloud: ");
            sb.append(parsedNotificationProto);
            return parsedNotificationProto.toByteArray();
        }

        @NotNull
        public final String b() {
            String name;
            if ((Build.VERSION.SDK_INT >= 31 ? PermissionChecker.checkSelfPermission(e88.a(), "android.permission.BLUETOOTH_CONNECT") : 0) == 0) {
                Object systemService = e88.a().getSystemService("bluetooth");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                name = ((BluetoothManager) systemService).getAdapter().getName();
            } else {
                name = null;
            }
            if (name != null) {
                return name;
            }
            return Build.MANUFACTURER + " " + Build.MODEL;
        }

        public final String c(HealthNotificationBean hnb, String secret) {
            String strB = cb4.INSTANCE.b(hnb);
            if (strB.length() > 100) {
                strB = StringsKt.substring(strB, new IntRange(0, 100)) + LogMemoryConfig.LOG_ELLIPSIS;
            }
            return b96.INSTANCE.d(strB, secret);
        }

        public final String d(HealthNotificationBean hnb, String secret) {
            String strC = cb4.INSTANCE.c(hnb);
            if (strC.length() > 20) {
                strC = StringsKt.substring(strC, new IntRange(0, 20)) + LogMemoryConfig.LOG_ELLIPSIS;
            }
            return b96.INSTANCE.d(strC, secret);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\b\b\u0000\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/acl$b", "Lcom/oplus/aiunit/vision/b8h;", "Landroid/graphics/Bitmap;", "resource", "Lcom/oplus/aiunit/vision/qek;", "transition", "", "onResourceReady", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends b8h<Bitmap> {
        public final /* synthetic */ HealthNotificationBean j;
        public final /* synthetic */ CountDownLatch k;
        public final /* synthetic */ Ref.BooleanRef l;

        public b(HealthNotificationBean healthNotificationBean, CountDownLatch countDownLatch, Ref.BooleanRef booleanRef) {
            this.j = healthNotificationBean;
            this.k = countDownLatch;
            this.l = booleanRef;
        }

        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, qek qekVar) {
            onResourceReady((Bitmap) obj, (qek<? super Bitmap>) qekVar);
        }

        public void onResourceReady(@NotNull Bitmap resource, @Nullable qek<? super Bitmap> transition) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            byte[] bArrH = acl.this.H(resource);
            acl.this.O(bArrH, this.j.getKey() + mxc.PIC_TYPE_BIG, mxc.PIC_TYPE_BIG, mxc.BIG_PICTURE_WIDTH, 208, NTFCmdId2.CID_MSG_PICTURE_VALUE);
            this.k.countDown();
            this.l.element = true;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/acl$c", "Lcom/oplus/aiunit/vision/bb4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements bb4 {
        public final /* synthetic */ String b;
        public final /* synthetic */ ParsedNotificationProto.Builder c;

        public c(String str, ParsedNotificationProto.Builder builder) {
            this.b = str;
            this.c = builder;
        }

        @Override // com.oplus.aiunit.p007vision.bb4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (bytes != null) {
                acl aclVar = acl.this;
                String str2 = this.b;
                ParsedNotificationProto.Builder builder = this.c;
                m8b.f("NTF_Converter", "getVoiceIcon false, onResult: " + bytes.length);
                aclVar.P(bytes, str2, mxc.PIC_TYPE_LARGE, height, width, NTFCmdId2.CID_MSG_PICTURE_VALUE);
                builder.setLargeIconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(str2 + mxc.PIC_TYPE_LARGE).setPicType(mxc.PIC_TYPE_LARGE).build());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/acl$d", "Lcom/oplus/aiunit/vision/bb4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements bb4 {
        public final /* synthetic */ String b;
        public final /* synthetic */ ParsedNotificationProto.Builder c;

        public d(String str, ParsedNotificationProto.Builder builder) {
            this.b = str;
            this.c = builder;
        }

        @Override // com.oplus.aiunit.p007vision.bb4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (bytes != null) {
                acl aclVar = acl.this;
                String str2 = this.b;
                ParsedNotificationProto.Builder builder = this.c;
                m8b.f("NTF_Converter", "get144Icon true, onResult: " + bytes.length);
                aclVar.P(bytes, str2, mxc.PIC_TYPE_LARGE_144, height, width, NTFCmdId2.CID_MSG_PICTURE_VALUE);
                builder.setLarge144IconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(str2 + mxc.PIC_TYPE_LARGE_144).setPicType(mxc.PIC_TYPE_LARGE_144).build());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/acl$e", "Lcom/oplus/aiunit/vision/bb4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements bb4 {
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ParsedNotificationProto.Builder d;

        public e(String str, int i, ParsedNotificationProto.Builder builder) {
            this.b = str;
            this.c = i;
            this.d = builder;
        }

        @Override // com.oplus.aiunit.p007vision.bb4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            boolean z = false;
            if (bytes != null) {
                if (!(bytes.length == 0)) {
                    z = true;
                }
            }
            if (z) {
                m8b.f("NTF_Converter", "get144Icon onResult: " + bytes.length);
                acl.this.O(bytes, this.b + mxc.PIC_TYPE_LARGE_144, mxc.PIC_TYPE_LARGE_144, width, height, this.c);
                this.d.setLarge144IconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(this.b + mxc.PIC_TYPE_LARGE_144).setPicType(mxc.PIC_TYPE_LARGE_144).build());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/acl$f", "Lcom/oplus/aiunit/vision/bb4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class f implements bb4 {
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ ParsedNotificationProto.Builder d;

        public f(String str, int i, ParsedNotificationProto.Builder builder) {
            this.b = str;
            this.c = i;
            this.d = builder;
        }

        @Override // com.oplus.aiunit.p007vision.bb4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (str != null) {
                ParsedNotificationProto.Builder builder = this.d;
                String str2 = this.b;
                builder.setLargeIconBitmap((MsgPictureProto) MsgPictureProto.newBuilder().setPicKey(str2 + mxc.PIC_TYPE_LARGE).setPicType(mxc.PIC_TYPE_LARGE).build());
            }
            if (Intrinsics.areEqual(str, ByteString.EMPTY) || bytes == null) {
                return;
            }
            m8b.f("NTF_Converter", "sendIcon onResult: " + bytes.length + " " + width);
            acl.this.P(bytes, this.b + mxc.PIC_TYPE_LARGE, mxc.PIC_TYPE_LARGE, height, width, this.c);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/acl$g", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class g implements hm4.c {
        public final /* synthetic */ int a;
        public final /* synthetic */ MessageEvent b;
        public final /* synthetic */ MsgPictureProto.Builder c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public g(int i, MessageEvent messageEvent, MsgPictureProto.Builder builder, int i2, int i3, String str) {
            this.a = i;
            this.b = messageEvent;
            this.c = builder;
            this.d = i2;
            this.e = i3;
            this.f = str;
        }

        public static final void c(boolean z, int i, MessageEvent messageEvent, MsgPictureProto.Builder builder, int i2, int i3, String str) {
            Intrinsics.checkNotNullParameter(messageEvent, "$msg");
            Intrinsics.checkNotNullParameter(str, "$picKey");
            m8b.f("NTF_Converter", "sendIndexPicture=" + z + ", cid=" + i + " part size=" + messageEvent.getData().length + ", picKey=" + builder.getPicKey());
            if (z && i == 216 && i2 == i3) {
                c0d.INSTANCE.m(str);
            }
        }

        public void a(final boolean success, int code) {
            NotificationModule notificationModule = NotificationModule.INSTANCE;
            final int i = this.a;
            final MessageEvent messageEvent = this.b;
            final MsgPictureProto.Builder builder = this.c;
            final int i2 = this.d;
            final int i3 = this.e;
            final String str = this.f;
            notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.bcl
                @Override // java.lang.Runnable
                public final void run() {
                    acl.g.c(success, i, messageEvent, builder, i2, i3, str);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/acl$h", "Lcom/oplus/aiunit/vision/hm4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class h implements hm4.c {
        public final /* synthetic */ int a;
        public final /* synthetic */ ByteString b;
        public final /* synthetic */ MsgPictureProto.Builder c;
        public final /* synthetic */ String d;

        public h(int i, ByteString byteString, MsgPictureProto.Builder builder, String str) {
            this.a = i;
            this.b = byteString;
            this.c = builder;
            this.d = str;
        }

        public static final void c(boolean z, int i, ByteString byteString, MsgPictureProto.Builder builder, String str) {
            Intrinsics.checkNotNullParameter(str, "$picKey");
            m8b.f("NTF_Converter", "sendPicture=" + z + ", cid=" + i + " size=" + byteString.size() + ", picKey=" + builder.getPicKey());
            if (z && i == 216) {
                c0d.INSTANCE.m(str);
            }
        }

        public void a(final boolean success, int code) {
            NotificationModule notificationModule = NotificationModule.INSTANCE;
            final int i = this.a;
            final ByteString byteString = this.b;
            final MsgPictureProto.Builder builder = this.c;
            final String str = this.d;
            notificationModule.q(new Runnable() { // from class: com.oplus.aiunit.vision.ccl
                @Override // java.lang.Runnable
                public final void run() {
                    acl.h.c(success, i, byteString, builder, str);
                }
            });
        }
    }

    public final byte[] H(Bitmap bitmap) {
        fxc fxcVar = fxc.INSTANCE;
        return fxcVar.c(fxcVar.u(fxcVar.g(bitmap, mxc.BIG_PICTURE_WIDTH, 208), mxc.BIG_PICTURE_WIDTH, 208));
    }

    public final byte[] I(Bundle extras) {
        Icon icon;
        if (extras == null) {
            return null;
        }
        Object parcelable = BundleCompat.getParcelable(extras, "android.picture", Bitmap.class);
        if (parcelable == null && Build.VERSION.SDK_INT >= 31 && (icon = (Icon) BundleCompat.getParcelable(extras, "android.pictureIcon", Icon.class)) != null) {
            Drawable drawableLoadDrawable = icon.loadDrawable(e88.a());
            if (drawableLoadDrawable != null) {
                Intrinsics.checkNotNullExpressionValue(drawableLoadDrawable, "loadDrawable(GlobalAppli…onHolder.getAppContext())");
                parcelable = DrawableKt.toBitmap$default(drawableLoadDrawable, 0, 0, (Bitmap.Config) null, 7, (Object) null);
            } else {
                parcelable = null;
            }
        }
        Bitmap bitmap = (Bitmap) parcelable;
        if (bitmap != null) {
            return H(bitmap);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    public final List<ParsedNotificationActionProto> J(HealthNotificationBean hnb) {
        boolean z;
        if (!(hnb.getOrigin() instanceof StatusBarNotification)) {
            return null;
        }
        Object origin = hnb.getOrigin();
        Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
        Notification.Action[] actionArr = ((StatusBarNotification) origin).getNotification().actions;
        if (actionArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = actionArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Notification.Action action = actionArr[i];
            int i3 = i2 + 1;
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                Intrinsics.checkNotNullExpressionValue(remoteInputs, "inputs");
                if (!(remoteInputs.length == 0)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                RemoteInput remoteInput = remoteInputs[remoteInputs.length - 1];
                ArrayList arrayList2 = new ArrayList();
                CharSequence[] choices = remoteInput.getChoices();
                if (choices != null) {
                    Intrinsics.checkNotNullExpressionValue(choices, "choices");
                    int length2 = choices.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        arrayList2.add(i5, choices[i4].toString());
                        i4++;
                        i5++;
                    }
                }
                ParsedNotificationActionProto.Builder builderNewBuilder = ParsedNotificationActionProto.newBuilder();
                ParsedRemoteInputProto.Builder builderNewBuilder2 = ParsedRemoteInputProto.newBuilder();
                CharSequence label = remoteInput.getLabel();
                if (label == null) {
                    label = "";
                }
                ParsedRemoteInputProto.Builder label2 = builderNewBuilder2.setLabel(label.toString());
                String resultKey = remoteInput.getResultKey();
                if (resultKey == null) {
                    resultKey = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(resultKey, "lastInput.resultKey ?: \"\"");
                }
                ParsedRemoteInputProto parsedRemoteInputProto = (ParsedRemoteInputProto) label2.setResultKey(resultKey).addAllChoices(arrayList2).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).build();
                CharSequence charSequence = action.title;
                builderNewBuilder.setTitle((charSequence != null ? charSequence : "").toString()).setIntentId(hnb.getKey() + "^w^" + i2).setAllowGeneratedReplies(true).setRemoteInputs(parsedRemoteInputProto);
                GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder.build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "builder.build()");
                arrayList.add(generatedMessageLiteBuild);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public final NotificationStyleProto K(HealthNotificationBean hnb) {
        NotificationStyleProto.Builder builderNewBuilder = NotificationStyleProto.newBuilder();
        int value = hnb.getStyle().getValue();
        builderNewBuilder.setStyleType(String.valueOf(value));
        if (value == MessageStyle.STYLE_STANDARD.getValue()) {
            builderNewBuilder.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).build());
        } else if (value == MessageStyle.STYLE_BIG_PICTURE.getValue()) {
            builderNewBuilder.setBigPictureStyle((BigPictureStyleProto) BigPictureStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).setPicture((BigPictureProto) BigPictureProto.newBuilder().setPicKey(hnb.getKey() + mxc.PIC_TYPE_BIG).setPicType(mxc.PIC_TYPE_BIG).build()).build());
        } else if (value == MessageStyle.STYLE_RED_PACKAGE.getValue()) {
            builderNewBuilder.setRedPackage((RedPackageStyleProto) RedPackageStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).build());
        } else if (value == MessageStyle.STYLE_VERIFY_CODE.getValue()) {
            builderNewBuilder.setVerifyCode(hnb.getVerifyUuidKey().length() == 0 ? (VerifyCodeStyleProto) VerifyCodeStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).setVerifyCode(new String(hnb.getVerifyCode(), Charsets.UTF_8)).setUuidKey("").build() : (VerifyCodeStyleProto) VerifyCodeStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).setVerifyCode("").setVerifyCodeEncode(ByteString.copyFrom(hnb.getVerifyCode())).setUuidKey(hnb.getVerifyUuidKey()).build());
        }
        GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "builder.build()");
        return (NotificationStyleProto) generatedMessageLiteBuild;
    }

    public final void L(HealthNotificationBean hnb, String cacheKey, int cid, ParsedNotificationProto.Builder build) {
        p(hnb, new e(cacheKey, cid, build));
    }

    public final void M(HealthNotificationBean hnb, String cacheKey, int cid, ParsedNotificationProto.Builder build, Bundle watchPush) {
        fxc fxcVar;
        Bitmap bitmapA;
        boolean z = true;
        r(216 == cid, hnb, new f(cacheKey, cid, build));
        if (watchPush != null) {
            String string = watchPush.getString(KEY_D19);
            byte[] byteArray = watchPush.getByteArray(KEY_D20_DATA);
            String string2 = watchPush.getString(KEY_D20);
            if ((string == null || string.length() == 0) || byteArray == null) {
                return;
            }
            if (string2 != null && string2.length() != 0) {
                z = false;
            }
            if (z || (bitmapA = (fxcVar = fxc.INSTANCE).a(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length), 32)) == null) {
                return;
            }
            O(fxcVar.e(bitmapA), string2 + mxc.PIC_TYPE_D20, mxc.PIC_TYPE_D20, bitmapA.getWidth(), bitmapA.getHeight(), cid);
        }
    }

    public final void N(Bundle watchPush) {
        Bitmap bitmapB2;
        ArrayList<ImageBean> parcelableArrayList = watchPush.getParcelableArrayList(KEY_IMAGES);
        if (parcelableArrayList != null) {
            for (ImageBean imageBean : parcelableArrayList) {
                String str = "_" + imageBean.getLevel();
                String str2 = imageBean.getMd5() + str;
                if (c0d.INSTANCE.b(str2)) {
                    m8b.f("NTF_Converter", "sendImages: already send " + str2);
                } else {
                    uwc.b bVarE = cb4.INSTANCE.e();
                    if (bVarE != null && (bitmapB2 = bVarE.B2(imageBean)) != null) {
                        byte[] bArrE = fxc.INSTANCE.e(bitmapB2);
                        m8b.f("NTF_Converter", "sendFluidImage: " + imageBean.getLevel() + "," + bitmapB2.getWidth() + " " + bitmapB2.getHeight());
                        O(bArrE, str2, str, bitmapB2.getWidth(), bitmapB2.getHeight(), NTFCmdId2.CID_SEEDING_CARD_PICTURE_VALUE);
                    }
                }
            }
        }
    }

    public final void O(byte[] bytes, String picKey, String picType, int width, int height, int cid) {
        ByteString byteStringCopyFrom;
        byte[] bArr = bytes;
        int length = bArr.length;
        int i = mxc.MAX_SIZE;
        if (length <= 8192) {
            P(bytes, picKey, picType, height, width, cid);
            return;
        }
        int iCeil = (int) Math.ceil(((double) length) / 8192.0d);
        int i2 = 1;
        if (1 > iCeil) {
            return;
        }
        while (true) {
            if (i2 < iCeil) {
                byteStringCopyFrom = ByteString.copyFrom(ArraysKt.copyOfRange(bArr, (i2 - 1) * i, i2 * mxc.MAX_SIZE));
                Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "{\n                    va…tBytes)\n                }");
            } else {
                byteStringCopyFrom = ByteString.copyFrom(ArraysKt.copyOfRange(bArr, (i2 - 1) * i, bArr.length));
                Intrinsics.checkNotNullExpressionValue(byteStringCopyFrom, "{\n                    va…tBytes)\n                }");
            }
            MsgPictureProto.Builder picType2 = MsgPictureProto.newBuilder().setData(byteStringCopyFrom).setIndex(i2 == iCeil ? 999 : i2).setPicKey(picKey).setHeight(height).setWidth(width).setPicType(picType);
            MessageEvent messageEvent = new MessageEvent(2, cid, ((MsgPictureProto) picType2.build()).toByteArray());
            wl4.deviceMultiple.b.j(wl4.managerApi.n(), messageEvent, new g(cid, messageEvent, picType2, i2, iCeil, picKey));
            if (i2 == iCeil) {
                return;
            }
            i2++;
            bArr = bytes;
            i = mxc.MAX_SIZE;
        }
    }

    public final void P(byte[] bytes, String picKey, String picType, int height, int width, int cid) {
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        MsgPictureProto.Builder picType2 = MsgPictureProto.newBuilder().setData(byteStringCopyFrom).setPicKey(picKey).setHeight(height).setWidth(width).setPicType(picType);
        wl4.deviceMultiple.b.j(wl4.managerApi.n(), new MessageEvent(2, cid, ((MsgPictureProto) picType2.build()).toByteArray()), new h(cid, byteStringCopyFrom, picType2, picKey));
    }

    @Override // com.oplus.aiunit.p007vision.pp9
    @NotNull
    public MessageEvent a(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        String strH = c0d.INSTANCE.h(hnb);
        ParsedNotificationProto.Builder builderZ = z(hnb);
        M(hnb, strH, NTFCmdId2.CID_MSG_PICTURE_VALUE, builderZ, null);
        L(hnb, strH, NTFCmdId2.CID_MSG_PICTURE_VALUE, builderZ);
        if (hnb.getStyle().getValue() == MessageStyle.STYLE_BIG_PICTURE.getValue() && (hnb.getOrigin() instanceof StatusBarNotification)) {
            Object origin = hnb.getOrigin();
            Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            byte[] bArrI = I(((StatusBarNotification) origin).getNotification().extras);
            if (bArrI != null) {
                O(bArrI, hnb.getKey() + mxc.PIC_TYPE_BIG, mxc.PIC_TYPE_BIG, mxc.BIG_PICTURE_WIDTH, 208, NTFCmdId2.CID_MSG_PICTURE_VALUE);
            }
        }
        builderZ.setStyle(K(hnb));
        if (hnb.getOrigin() instanceof StatusBarNotification) {
            Object origin2 = hnb.getOrigin();
            Intrinsics.checkNotNull(origin2, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            if (((StatusBarNotification) origin2).getNotification().contentIntent != null) {
                builderZ.setContentIntentId(hnb.getContentIntentId());
            }
        }
        List<ParsedNotificationActionProto> listJ = J(hnb);
        boolean z = false;
        if (listJ != null && (!listJ.isEmpty())) {
            z = true;
        }
        if (z) {
            builderZ.addAllActions(listJ);
        }
        em4 em4Var = wl4.managerApi;
        String strQ = em4Var.q(mb5.a.INSTANCE);
        builderZ.setExt(Extend.newBuilder().setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ)).setMultipleLink(em4Var.w(strQ))));
        ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) builderZ.build();
        StringBuilder sb = new StringBuilder();
        sb.append("Watch4Gen convertPost: ");
        sb.append(parsedNotificationProto);
        MessageEvent messageEvent = new MessageEvent(2, 200, parsedNotificationProto.toByteArray());
        messageEvent.setEncryptOption(2);
        return messageEvent;
    }

    @Override // com.oplus.aiunit.p007vision.pp9
    @NotNull
    public MessageEvent b(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        DismissNotificationProto.Builder builderNewBuilder = DismissNotificationProto.newBuilder();
        SimpleNotificationProto.Builder builderNewBuilder2 = SimpleNotificationProto.newBuilder();
        builderNewBuilder2.setId(hnb.getId());
        builderNewBuilder2.setKey(hnb.getKey());
        builderNewBuilder2.setPkgName(hnb.getPackageName());
        builderNewBuilder2.setTag(hnb.getTag());
        ArrayList arrayList = new ArrayList();
        arrayList.add(builderNewBuilder2.build());
        builderNewBuilder.addAllNtfs(arrayList);
        DismissNotificationProto dismissNotificationProto = (DismissNotificationProto) builderNewBuilder.build();
        StringBuilder sb = new StringBuilder();
        sb.append("Watch4Gen convertRemoved: ");
        sb.append(dismissNotificationProto);
        return new MessageEvent(2, NTFCmdId2.CID_DISMISS_VALUE, dismissNotificationProto.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.cb4
    @Nullable
    public MessageEvent g(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        if (wwc.a(wl4.managerApi.q(mb5.a.INSTANCE)).r4()) {
            return i(hnb, watchPush);
        }
        ParsedNotificationProto.Builder builderZ = z(hnb);
        uwc.b bVarE = cb4.INSTANCE.e();
        boolean z = false;
        if (bVarE != null && bVarE.I3()) {
            z = true;
        }
        if (z) {
            N(watchPush);
        } else {
            M(hnb, hnb.getKey(), NTFCmdId2.CID_SEEDING_CARD_PICTURE_VALUE, builderZ, watchPush);
        }
        return h(hnb, watchPush, builderZ);
    }

    @Override // com.oplus.aiunit.p007vision.cb4
    @NotNull
    public MessageEvent j(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        return wwc.a(wl4.managerApi.q(mb5.a.INSTANCE)).r4() ? l(hnb) : k(hnb);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x026f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0271  */
    /* JADX WARN: Code duplicated, block: B:51:0x0277  */
    /* JADX WARN: Code duplicated, block: B:52:0x0279  */
    /* JADX WARN: Code duplicated, block: B:54:0x027c  */
    /* JADX WARN: Code duplicated, block: B:55:0x027e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0281  */
    /* JADX WARN: Code duplicated, block: B:59:0x0297  */
    /* JADX WARN: Code duplicated, block: B:60:0x0299  */
    /* JADX WARN: Code duplicated, block: B:62:0x029c  */
    /* JADX WARN: Code duplicated, block: B:63:0x029e  */
    /* JADX WARN: Code duplicated, block: B:65:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:78:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x031c  */
    /* JADX WARN: Code duplicated, block: B:90:0x031f  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x02e6, please report this as an issue */
    @Override // com.oplus.aiunit.p007vision.cb4
    @NotNull
    public MessageEvent m(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush) {
        String string;
        boolean z;
        String str;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        String str2;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        m8b.f("NTF_Converter", "Watch4Gen convertPush: start");
        String strH = c0d.INSTANCE.h(hnb);
        if (watchPush == null) {
            string = "";
        } else {
            string = watchPush.getString("mockPackageName");
            if (string == null || string.length() == 0) {
                cb4.INSTANCE.a(hnb);
                string = "";
            }
        }
        ParsedNotificationProto.Builder whenTimeMillis = ParsedNotificationProto.newBuilder().setId(hnb.getId()).setFlags(hnb.getFlags()).setTag(hnb.getTag()).setKey(hnb.getKey()).setGroupKey(hnb.getGroupKey()).setPackageName(hnb.getPackageName()).setSubText(hnb.getSubText()).setAppName(string).setBridgeTag(hnb.getBridgeTag()).setPostTimeMillis(hnb.getPostTimeMillis()).setWhenTimeMillis(hnb.getWhenTimeMillis());
        cb4.Companion companion = cb4.INSTANCE;
        ParsedNotificationProto.Builder title = whenTimeMillis.setTitle(companion.c(hnb));
        Intrinsics.checkNotNullExpressionValue(title, "build");
        M(hnb, strH, NTFCmdId2.CID_MSG_PICTURE_VALUE, title, watchPush);
        L(hnb, strH, NTFCmdId2.CID_MSG_PICTURE_VALUE, title);
        if (watchPush == null) {
            NotificationStyleProto.Builder builderNewBuilder = NotificationStyleProto.newBuilder();
            builderNewBuilder.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(companion.b(hnb)).build());
            builderNewBuilder.setStyleType(String.valueOf(hnb.getStyle().getValue()));
            title.setStyle((NotificationStyleProto) builderNewBuilder.build());
        } else {
            boolean z6 = watchPush.getBoolean("transparent");
            int i7 = watchPush.getInt("command");
            long j = watchPush.getLong("showAtTime");
            long j2 = watchPush.getLong("showDuration");
            String string2 = watchPush.getString("big_picture");
            String string3 = watchPush.getString("mockPackage");
            int i8 = watchPush.getInt("action_type");
            String string4 = watchPush.getString("action_url");
            String string5 = watchPush.getString("action_package");
            String string6 = watchPush.getString("action_title");
            long j3 = watchPush.getLong("action_version_code");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (string2 == null || string2.length() == 0) {
                NotificationStyleProto.Builder builderNewBuilder2 = NotificationStyleProto.newBuilder();
                builderNewBuilder2.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(companion.b(hnb)).build());
                builderNewBuilder2.setStyleType(String.valueOf(hnb.getStyle().getValue()));
                title.setStyle((NotificationStyleProto) builderNewBuilder2.build());
                countDownLatch.countDown();
                z = z6;
                str = string3;
            } else {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                z = z6;
                str = string3;
                d88.k(e88.a(), string2, new b(hnb, countDownLatch, booleanRef), mxc.BIG_PICTURE_WIDTH, 208);
                try {
                    countDownLatch.await(kdj.TIME_OUT, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                    countDownLatch.countDown();
                }
                m8b.f("NTF_Converter", "convertPush: " + booleanRef.element);
                if (booleanRef.element) {
                    NotificationStyleProto.Builder builderNewBuilder3 = NotificationStyleProto.newBuilder();
                    builderNewBuilder3.setBigPictureStyle((BigPictureStyleProto) BigPictureStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).setPicture((BigPictureProto) BigPictureProto.newBuilder().setPicKey(hnb.getKey() + mxc.PIC_TYPE_BIG).setPicType(mxc.PIC_TYPE_BIG).build()).build());
                    builderNewBuilder3.setStyleType(String.valueOf(MessageStyle.STYLE_BIG_PICTURE.getValue()));
                    title.setStyle((NotificationStyleProto) builderNewBuilder3.build());
                } else {
                    NotificationStyleProto.Builder builderNewBuilder4 = NotificationStyleProto.newBuilder();
                    builderNewBuilder4.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(cb4.INSTANCE.b(hnb)).build());
                    builderNewBuilder4.setStyleType(String.valueOf(hnb.getStyle().getValue()));
                    title.setStyle((NotificationStyleProto) builderNewBuilder4.build());
                }
            }
            ArrayList arrayList = new ArrayList();
            ParsedNotificationActionProto.Builder builderNewBuilder5 = ParsedNotificationActionProto.newBuilder();
            if (i8 != 0) {
                i = 1;
                if (i8 == i) {
                    if (string4 == null) {
                        i2 = 0;
                    } else {
                        if (string4.length() > 0) {
                            i4 = i;
                        } else {
                            i4 = 0;
                        }
                        if (i4 == i) {
                            i2 = i;
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 != 0) {
                        if (string6 == null) {
                            z3 = false;
                        } else {
                            if (string6.length() > 0) {
                                i3 = i;
                            } else {
                                i3 = 0;
                            }
                            if (i3 == i) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        if (z3) {
                            builderNewBuilder5.setTitle(string6);
                            ExtendAction.Builder deeplink = ExtendAction.newBuilder().setDeeplink(string4);
                            if (string5 == null) {
                                string5 = "";
                            }
                            builderNewBuilder5.setExt((ExtendAction) deeplink.setPackage(string5).setVersionCode(j3).build());
                        }
                        if (z2) {
                            builderNewBuilder5.setAllowGeneratedReplies(false);
                            builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                            GeneratedMessageLite generatedMessageLiteBuild = builderNewBuilder5.build();
                            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "actionBuilder.build()");
                            arrayList.add(generatedMessageLiteBuild);
                            title.addAllWearableActions(arrayList);
                        }
                        ExtendPush.Builder push = ExtendPush.newBuilder().setPush(true);
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        ExtendPush.Builder transparentAction = push.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                        em4 em4Var = wl4.managerApi;
                        String strQ = em4Var.q(mb5.a.INSTANCE);
                        title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ)).setMultipleLink(em4Var.w(strQ))).build());
                    }
                }
                z2 = false;
                if (z2) {
                    builderNewBuilder5.setAllowGeneratedReplies(false);
                    builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                    GeneratedMessageLite generatedMessageLiteBuild2 = builderNewBuilder5.build();
                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild2, "actionBuilder.build()");
                    arrayList.add(generatedMessageLiteBuild2);
                    title.addAllWearableActions(arrayList);
                }
                ExtendPush.Builder push2 = ExtendPush.newBuilder().setPush(true);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                ExtendPush.Builder transparentAction2 = push2.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                em4 em4Var2 = wl4.managerApi;
                String strQ2 = em4Var2.q(mb5.a.INSTANCE);
                title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction2.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ2).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ2)).setMultipleLink(em4Var2.w(strQ2))).build());
            } else {
                if (string5 != null) {
                    i5 = 1;
                    z4 = string5.length() > 0;
                    if (z4) {
                        if (string6 == null) {
                            z5 = false;
                        } else {
                            if (string6.length() > 0) {
                                i6 = i5;
                            } else {
                                i6 = 0;
                            }
                            if (i6 == i5) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        }
                        if (z5) {
                            builderNewBuilder5.setTitle(string6);
                            builderNewBuilder5.setExt((ExtendAction) ExtendAction.newBuilder().setPackage(string5).build());
                        } else {
                            i = 1;
                            if (i8 == i) {
                                if (string4 == null) {
                                    i2 = 0;
                                } else {
                                    if (string4.length() > 0) {
                                        i4 = i;
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i4 == i) {
                                        i2 = i;
                                    } else {
                                        i2 = 0;
                                    }
                                }
                                if (i2 != 0) {
                                    if (string6 == null) {
                                        z3 = false;
                                    } else {
                                        if (string6.length() > 0) {
                                            i3 = i;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i3 == i) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                    }
                                    if (z3) {
                                        builderNewBuilder5.setTitle(string6);
                                        ExtendAction.Builder deeplink2 = ExtendAction.newBuilder().setDeeplink(string4);
                                        if (string5 == null) {
                                            string5 = "";
                                        }
                                        builderNewBuilder5.setExt((ExtendAction) deeplink2.setPackage(string5).setVersionCode(j3).build());
                                    }
                                    if (z2) {
                                        builderNewBuilder5.setAllowGeneratedReplies(false);
                                        builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                                        GeneratedMessageLite generatedMessageLiteBuild3 = builderNewBuilder5.build();
                                        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild3, "actionBuilder.build()");
                                        arrayList.add(generatedMessageLiteBuild3);
                                        title.addAllWearableActions(arrayList);
                                    }
                                    ExtendPush.Builder push3 = ExtendPush.newBuilder().setPush(true);
                                    if (str == null) {
                                        str2 = "";
                                    } else {
                                        str2 = str;
                                    }
                                    ExtendPush.Builder transparentAction3 = push3.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                                    em4 em4Var3 = wl4.managerApi;
                                    String strQ3 = em4Var3.q(mb5.a.INSTANCE);
                                    title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction3.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ3).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ3)).setMultipleLink(em4Var3.w(strQ3))).build());
                                }
                            }
                            z2 = false;
                            if (z2) {
                                builderNewBuilder5.setAllowGeneratedReplies(false);
                                builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                                GeneratedMessageLite generatedMessageLiteBuild4 = builderNewBuilder5.build();
                                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild4, "actionBuilder.build()");
                                arrayList.add(generatedMessageLiteBuild4);
                                title.addAllWearableActions(arrayList);
                            }
                            ExtendPush.Builder push4 = ExtendPush.newBuilder().setPush(true);
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            ExtendPush.Builder transparentAction4 = push4.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                            em4 em4Var4 = wl4.managerApi;
                            String strQ4 = em4Var4.q(mb5.a.INSTANCE);
                            title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction4.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ4).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ4)).setMultipleLink(em4Var4.w(strQ4))).build());
                        }
                    } else {
                        i = i5;
                        if (i8 == i) {
                            if (string4 == null) {
                                i2 = 0;
                            } else {
                                if (string4.length() > 0) {
                                    i4 = i;
                                } else {
                                    i4 = 0;
                                }
                                if (i4 == i) {
                                    i2 = i;
                                } else {
                                    i2 = 0;
                                }
                            }
                            if (i2 != 0) {
                                if (string6 == null) {
                                    z3 = false;
                                } else {
                                    if (string6.length() > 0) {
                                        i3 = i;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i3 == i) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                if (z3) {
                                    builderNewBuilder5.setTitle(string6);
                                    ExtendAction.Builder deeplink3 = ExtendAction.newBuilder().setDeeplink(string4);
                                    if (string5 == null) {
                                        string5 = "";
                                    }
                                    builderNewBuilder5.setExt((ExtendAction) deeplink3.setPackage(string5).setVersionCode(j3).build());
                                }
                                if (z2) {
                                    builderNewBuilder5.setAllowGeneratedReplies(false);
                                    builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                                    GeneratedMessageLite generatedMessageLiteBuild5 = builderNewBuilder5.build();
                                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild5, "actionBuilder.build()");
                                    arrayList.add(generatedMessageLiteBuild5);
                                    title.addAllWearableActions(arrayList);
                                }
                                ExtendPush.Builder push5 = ExtendPush.newBuilder().setPush(true);
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                ExtendPush.Builder transparentAction5 = push5.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                                em4 em4Var5 = wl4.managerApi;
                                String strQ5 = em4Var5.q(mb5.a.INSTANCE);
                                title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction5.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ5).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ5)).setMultipleLink(em4Var5.w(strQ5))).build());
                            }
                        }
                        z2 = false;
                        if (z2) {
                            builderNewBuilder5.setAllowGeneratedReplies(false);
                            builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                            GeneratedMessageLite generatedMessageLiteBuild6 = builderNewBuilder5.build();
                            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild6, "actionBuilder.build()");
                            arrayList.add(generatedMessageLiteBuild6);
                            title.addAllWearableActions(arrayList);
                        }
                        ExtendPush.Builder push6 = ExtendPush.newBuilder().setPush(true);
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        ExtendPush.Builder transparentAction6 = push6.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                        em4 em4Var6 = wl4.managerApi;
                        String strQ6 = em4Var6.q(mb5.a.INSTANCE);
                        title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction6.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ6).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ6)).setMultipleLink(em4Var6.w(strQ6))).build());
                    }
                } else {
                    i5 = 1;
                }
                if (z4) {
                    if (string6 == null) {
                        z5 = false;
                    } else {
                        if (string6.length() > 0) {
                            i6 = i5;
                        } else {
                            i6 = 0;
                        }
                        if (i6 == i5) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    if (z5) {
                        builderNewBuilder5.setTitle(string6);
                        builderNewBuilder5.setExt((ExtendAction) ExtendAction.newBuilder().setPackage(string5).build());
                    } else {
                        i = 1;
                        if (i8 == i) {
                            if (string4 == null) {
                                i2 = 0;
                            } else {
                                if (string4.length() > 0) {
                                    i4 = i;
                                } else {
                                    i4 = 0;
                                }
                                if (i4 == i) {
                                    i2 = i;
                                } else {
                                    i2 = 0;
                                }
                            }
                            if (i2 != 0) {
                                if (string6 == null) {
                                    z3 = false;
                                } else {
                                    if (string6.length() > 0) {
                                        i3 = i;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i3 == i) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                if (z3) {
                                    builderNewBuilder5.setTitle(string6);
                                    ExtendAction.Builder deeplink4 = ExtendAction.newBuilder().setDeeplink(string4);
                                    if (string5 == null) {
                                        string5 = "";
                                    }
                                    builderNewBuilder5.setExt((ExtendAction) deeplink4.setPackage(string5).setVersionCode(j3).build());
                                }
                                if (z2) {
                                    builderNewBuilder5.setAllowGeneratedReplies(false);
                                    builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                                    GeneratedMessageLite generatedMessageLiteBuild7 = builderNewBuilder5.build();
                                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild7, "actionBuilder.build()");
                                    arrayList.add(generatedMessageLiteBuild7);
                                    title.addAllWearableActions(arrayList);
                                }
                                ExtendPush.Builder push7 = ExtendPush.newBuilder().setPush(true);
                                if (str == null) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                ExtendPush.Builder transparentAction7 = push7.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                                em4 em4Var7 = wl4.managerApi;
                                String strQ7 = em4Var7.q(mb5.a.INSTANCE);
                                title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction7.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ7).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ7)).setMultipleLink(em4Var7.w(strQ7))).build());
                            }
                        }
                        z2 = false;
                        if (z2) {
                            builderNewBuilder5.setAllowGeneratedReplies(false);
                            builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                            GeneratedMessageLite generatedMessageLiteBuild8 = builderNewBuilder5.build();
                            Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild8, "actionBuilder.build()");
                            arrayList.add(generatedMessageLiteBuild8);
                            title.addAllWearableActions(arrayList);
                        }
                        ExtendPush.Builder push8 = ExtendPush.newBuilder().setPush(true);
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        ExtendPush.Builder transparentAction8 = push8.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                        em4 em4Var8 = wl4.managerApi;
                        String strQ8 = em4Var8.q(mb5.a.INSTANCE);
                        title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction8.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ8).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ8)).setMultipleLink(em4Var8.w(strQ8))).build());
                    }
                } else {
                    i = i5;
                    if (i8 == i) {
                        if (string4 == null) {
                            i2 = 0;
                        } else {
                            if (string4.length() > 0) {
                                i4 = i;
                            } else {
                                i4 = 0;
                            }
                            if (i4 == i) {
                                i2 = i;
                            } else {
                                i2 = 0;
                            }
                        }
                        if (i2 != 0) {
                            if (string6 == null) {
                                z3 = false;
                            } else {
                                if (string6.length() > 0) {
                                    i3 = i;
                                } else {
                                    i3 = 0;
                                }
                                if (i3 == i) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                builderNewBuilder5.setTitle(string6);
                                ExtendAction.Builder deeplink5 = ExtendAction.newBuilder().setDeeplink(string4);
                                if (string5 == null) {
                                    string5 = "";
                                }
                                builderNewBuilder5.setExt((ExtendAction) deeplink5.setPackage(string5).setVersionCode(j3).build());
                            }
                            if (z2) {
                                builderNewBuilder5.setAllowGeneratedReplies(false);
                                builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                                GeneratedMessageLite generatedMessageLiteBuild9 = builderNewBuilder5.build();
                                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild9, "actionBuilder.build()");
                                arrayList.add(generatedMessageLiteBuild9);
                                title.addAllWearableActions(arrayList);
                            }
                            ExtendPush.Builder push9 = ExtendPush.newBuilder().setPush(true);
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            ExtendPush.Builder transparentAction9 = push9.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                            em4 em4Var9 = wl4.managerApi;
                            String strQ9 = em4Var9.q(mb5.a.INSTANCE);
                            title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction9.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ9).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ9)).setMultipleLink(em4Var9.w(strQ9))).build());
                        }
                    }
                    z2 = false;
                    if (z2) {
                        builderNewBuilder5.setAllowGeneratedReplies(false);
                        builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                        GeneratedMessageLite generatedMessageLiteBuild10 = builderNewBuilder5.build();
                        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild10, "actionBuilder.build()");
                        arrayList.add(generatedMessageLiteBuild10);
                        title.addAllWearableActions(arrayList);
                    }
                    ExtendPush.Builder push10 = ExtendPush.newBuilder().setPush(true);
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    ExtendPush.Builder transparentAction10 = push10.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
                    em4 em4Var10 = wl4.managerApi;
                    String strQ10 = em4Var10.q(mb5.a.INSTANCE);
                    title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction10.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ10).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ10)).setMultipleLink(em4Var10.w(strQ10))).build());
                }
            }
            z2 = true;
            if (z2) {
                builderNewBuilder5.setAllowGeneratedReplies(false);
                builderNewBuilder5.setIntentId(hnb.getKey() + "^w^0");
                GeneratedMessageLite generatedMessageLiteBuild11 = builderNewBuilder5.build();
                Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild11, "actionBuilder.build()");
                arrayList.add(generatedMessageLiteBuild11);
                title.addAllWearableActions(arrayList);
            }
            ExtendPush.Builder push11 = ExtendPush.newBuilder().setPush(true);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            ExtendPush.Builder transparentAction11 = push11.setMockPackageName(str2).setTransparent(z).setShowAtTime(j).setShowDuration(j2).setTransparentAction(i7);
            em4 em4Var11 = wl4.managerApi;
            String strQ11 = em4Var11.q(mb5.a.INSTANCE);
            title.setExt((Extend) Extend.newBuilder().setExtPush((ExtendPush) transparentAction11.build()).setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ11).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ11)).setMultipleLink(em4Var11.w(strQ11))).build());
        }
        ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) title.build();
        StringBuilder sb = new StringBuilder();
        sb.append("Watch4Gen convertPush: ");
        sb.append(parsedNotificationProto);
        return new MessageEvent(2, 200, parsedNotificationProto.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.cb4
    @NotNull
    public MessageEvent n(@NotNull HealthNotificationBean hnb, @NotNull WeChatConfig config) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(config, "config");
        em4 em4Var = wl4.managerApi;
        mb5.a aVar = mb5.a.INSTANCE;
        if (wwc.a(em4Var.q(aVar)).O1()) {
            WechatMessage.Builder builderNewBuilder = WechatMessage.newBuilder();
            builderNewBuilder.setTitle(hnb.getContent());
            builderNewBuilder.setContent(e88.a().getString(R$string.notification_wechat_voice_content));
            builderNewBuilder.setVibrateDuration(config.getVibrateDuration());
            builderNewBuilder.setCanSlideOut(config.getCanSlideOut());
            String strQ = em4Var.q(aVar);
            builderNewBuilder.setExt(Extend.newBuilder().setExtCommon(ExtendCommon.newBuilder().setDeviceFrom(INSTANCE.b()).setDeviceFlag(wwc.a(strQ).l8()).setDeviceMac(wl4.businessApi.getDeviceBindPhoneMac(strQ)).setMultipleLink(em4Var.w(strQ))));
            WechatMessage wechatMessage = (WechatMessage) builderNewBuilder.build();
            StringBuilder sb = new StringBuilder();
            sb.append("convertWechatVoice: ");
            sb.append(wechatMessage);
            MessageEvent messageEvent = new MessageEvent(2, NTFCmdId2.CID_WECHAT_VOICE_MSG_VALUE, wechatMessage.toByteArray());
            messageEvent.setEncryptOption(2);
            return messageEvent;
        }
        String key = hnb.getKey();
        ParsedNotificationProto.Builder subText = ParsedNotificationProto.newBuilder().setId(hnb.getId()).setFlags(hnb.getFlags()).setTag(hnb.getTag()).setKey(hnb.getKey() + mxc.WECHAT_VOICE).setGroupKey(hnb.getGroupKey()).setPackageName(hnb.getPackageName() + mxc.WECHAT_VOICE).setSubText(hnb.getSubText());
        cb4.Companion companion = cb4.INSTANCE;
        ParsedNotificationProto.Builder title = subText.setAppName(companion.a(hnb)).setBridgeTag(hnb.getBridgeTag()).setPostTimeMillis(hnb.getPostTimeMillis()).setTitle(companion.b(hnb));
        v(hnb, new c(key, title), false);
        v(hnb, new d(key, title), true);
        NotificationStyleProto.Builder builderNewBuilder2 = NotificationStyleProto.newBuilder();
        builderNewBuilder2.setStandardStyle((StandardStyleProto) StandardStyleProto.newBuilder().setBody(e88.a().getString(R$string.notification_wechat_voice_content)).build());
        builderNewBuilder2.setStyleType(String.valueOf(MessageStyle.STYLE_STANDARD.getValue()));
        title.setStyle((NotificationStyleProto) builderNewBuilder2.build());
        ParsedNotificationProto parsedNotificationProto = (ParsedNotificationProto) title.build();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("convertWechatVoice: ");
        sb2.append(parsedNotificationProto);
        MessageEvent messageEvent2 = new MessageEvent(2, 200, parsedNotificationProto.toByteArray());
        messageEvent2.setEncryptOption(2);
        return messageEvent2;
    }
}
