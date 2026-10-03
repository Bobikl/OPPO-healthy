package com.heytap.health.watch.notification;

import android.app.Notification;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\b\u0087\b\u0018\u0000 ¨\u00012\u00020\u0001:\u0002©\u0001BÛ\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\u0005\u0012\b\b\u0002\u00100\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\u000b\u0012\b\b\u0002\u00102\u001a\u00020\u000b\u0012\b\b\u0002\u00103\u001a\u00020\u000e\u0012\b\b\u0002\u00104\u001a\u00020\u000e\u0012\b\b\u0002\u00105\u001a\u00020\u000e\u0012\b\b\u0002\u00106\u001a\u00020\u000e\u0012\b\b\u0002\u00107\u001a\u00020\u000e\u0012\b\b\u0002\u00108\u001a\u00020\u000e\u0012\b\b\u0002\u00109\u001a\u00020\u000e\u0012\b\b\u0002\u0010:\u001a\u00020\u000e\u0012\b\b\u0002\u0010;\u001a\u00020\u000e\u0012\b\b\u0002\u0010<\u001a\u00020\u000e\u0012\b\b\u0002\u0010=\u001a\u00020\u000e\u0012\b\b\u0002\u0010>\u001a\u00020\u000e\u0012\b\b\u0002\u0010?\u001a\u00020\u001b\u0012\b\b\u0002\u0010@\u001a\u00020\u000e\u0012\b\b\u0002\u0010A\u001a\u00020\u0003\u0012\b\b\u0002\u0010B\u001a\u00020\u0003\u0012\b\b\u0002\u0010C\u001a\u00020\u0003\u0012\b\b\u0002\u0010D\u001a\u00020\u0003\u0012\b\b\u0002\u0010E\u001a\u00020\u0003\u0012\b\b\u0002\u0010F\u001a\u00020\u0003\u0012\b\b\u0002\u0010G\u001a\u00020\u0005\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010K\u001a\u00020)\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0015\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001c\u001a\u00020\u001bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010%HÆ\u0003J\t\u0010*\u001a\u00020)HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0001HÆ\u0003JÛ\u0002\u0010M\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\u000e2\b\b\u0002\u00106\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020\u000e2\b\b\u0002\u00108\u001a\u00020\u000e2\b\b\u0002\u00109\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020\u000e2\b\b\u0002\u0010<\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020\u000e2\b\b\u0002\u0010>\u001a\u00020\u000e2\b\b\u0002\u0010?\u001a\u00020\u001b2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u00032\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020\u00052\n\b\u0002\u0010H\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010K\u001a\u00020)2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010N\u001a\u00020\u000eHÖ\u0001J\t\u0010O\u001a\u00020\u0005HÖ\u0001J\u0013\u0010P\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010Q\u001a\u0004\bV\u0010S\"\u0004\bW\u0010UR\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\"\u0010/\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010Q\u001a\u0004\bZ\u0010S\"\u0004\b[\u0010UR\"\u00100\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010Q\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010bR\"\u00103\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u00104\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010e\u001a\u0004\bj\u0010g\"\u0004\bk\u0010iR\"\u00105\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010e\u001a\u0004\bl\u0010g\"\u0004\bm\u0010iR\"\u00106\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010e\u001a\u0004\bn\u0010g\"\u0004\bo\u0010iR\"\u00107\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010e\u001a\u0004\bp\u0010g\"\u0004\bq\u0010iR\"\u00108\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010e\u001a\u0004\br\u0010g\"\u0004\bs\u0010iR\"\u00109\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010e\u001a\u0004\bt\u0010g\"\u0004\bu\u0010iR\"\u0010:\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010e\u001a\u0004\bv\u0010g\"\u0004\bw\u0010iR\"\u0010;\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010e\u001a\u0004\bx\u0010g\"\u0004\by\u0010iR\"\u0010<\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010e\u001a\u0004\bz\u0010g\"\u0004\b{\u0010iR\"\u0010=\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010e\u001a\u0004\b|\u0010g\"\u0004\b}\u0010iR\"\u0010>\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010e\u001a\u0004\b~\u0010g\"\u0004\b\u007f\u0010iR'\u0010?\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010@\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b@\u0010e\u001a\u0005\b\u0085\u0001\u0010g\"\u0005\b\u0086\u0001\u0010iR&\u0010A\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bA\u0010\u0087\u0001\u001a\u0005\bA\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010B\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bB\u0010\u0087\u0001\u001a\u0005\bB\u0010\u0088\u0001\"\u0006\b\u008b\u0001\u0010\u008a\u0001R&\u0010C\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bC\u0010\u0087\u0001\u001a\u0005\bC\u0010\u0088\u0001\"\u0006\b\u008c\u0001\u0010\u008a\u0001R&\u0010D\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bD\u0010\u0087\u0001\u001a\u0005\bD\u0010\u0088\u0001\"\u0006\b\u008d\u0001\u0010\u008a\u0001R'\u0010E\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bE\u0010\u0087\u0001\u001a\u0006\b\u008e\u0001\u0010\u0088\u0001\"\u0006\b\u008f\u0001\u0010\u008a\u0001R&\u0010F\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bF\u0010\u0087\u0001\u001a\u0005\bF\u0010\u0088\u0001\"\u0006\b\u0090\u0001\u0010\u008a\u0001R$\u0010G\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bG\u0010Q\u001a\u0005\b\u0091\u0001\u0010S\"\u0005\b\u0092\u0001\u0010UR)\u0010H\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bH\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R)\u0010I\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bI\u0010\u0093\u0001\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001\"\u0006\b\u0099\u0001\u0010\u0097\u0001R)\u0010J\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bJ\u0010\u0093\u0001\u001a\u0006\b\u009a\u0001\u0010\u0095\u0001\"\u0006\b\u009b\u0001\u0010\u0097\u0001R'\u0010K\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bK\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R)\u0010L\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bL\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/heytap/health/watch/notification/HealthNotificationBean;", "", "other", "", "repeat", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "component7", "", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "Landroid/graphics/drawable/Icon;", "component29", "component30", "component31", "Lcom/heytap/health/watch/notification/MessageStyle;", "component32", "component33", "id", "color", UTraceSQLiteHelperKt.COL_FLAGS, "userId", "groupAlertBehavior", "whenTimeMillis", "postTimeMillis", "key", "tag", "title", "content", "appName", "group", "groupKey", "subText", "bridgeTag", "packageName", "contentIntentId", "channelId", "verifyCode", "verifyUuidKey", "isEmergency", "isWorkProfile", "isGroupSummary", "isInterruptible", "shouldOnlyAlertOnce", "isSilent", JsonToSeedlingCardOptionsConvertor.KEY_GRADE, "appIcon", "smallIcon", "largeIcon", Const.Arguments.Open.STYLE, "origin", "copy", "toString", "hashCode", "equals", "I", "getId", "()I", "setId", "(I)V", "getColor", "setColor", "getFlags", "setFlags", "getUserId", "setUserId", "getGroupAlertBehavior", "setGroupAlertBehavior", "J", "getWhenTimeMillis", "()J", "setWhenTimeMillis", "(J)V", "getPostTimeMillis", "setPostTimeMillis", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getTag", "setTag", "getTitle", "setTitle", "getContent", "setContent", "getAppName", "setAppName", "getGroup", "setGroup", "getGroupKey", "setGroupKey", "getSubText", "setSubText", "getBridgeTag", "setBridgeTag", "getPackageName", "setPackageName", "getContentIntentId", "setContentIntentId", "getChannelId", "setChannelId", "[B", "getVerifyCode", "()[B", "setVerifyCode", "([B)V", "getVerifyUuidKey", "setVerifyUuidKey", "Z", "()Z", "setEmergency", "(Z)V", "setWorkProfile", "setGroupSummary", "setInterruptible", "getShouldOnlyAlertOnce", "setShouldOnlyAlertOnce", "setSilent", "getImportance", "setImportance", "Landroid/graphics/drawable/Icon;", "getAppIcon", "()Landroid/graphics/drawable/Icon;", "setAppIcon", "(Landroid/graphics/drawable/Icon;)V", "getSmallIcon", "setSmallIcon", "getLargeIcon", "setLargeIcon", "Lcom/heytap/health/watch/notification/MessageStyle;", "getStyle", "()Lcom/heytap/health/watch/notification/MessageStyle;", "setStyle", "(Lcom/heytap/health/watch/notification/MessageStyle;)V", "Ljava/lang/Object;", "getOrigin", "()Ljava/lang/Object;", "setOrigin", "(Ljava/lang/Object;)V", "<init>", "(IIIIIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;ZZZZZZILandroid/graphics/drawable/Icon;Landroid/graphics/drawable/Icon;Landroid/graphics/drawable/Icon;Lcom/heytap/health/watch/notification/MessageStyle;Ljava/lang/Object;)V", "Companion", "a", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HealthNotificationBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Icon appIcon;

    @NotNull
    private String appName;

    @NotNull
    private String bridgeTag;

    @NotNull
    private String channelId;
    private int color;

    @NotNull
    private String content;

    @NotNull
    private String contentIntentId;
    private int flags;

    @NotNull
    private String group;
    private int groupAlertBehavior;

    @NotNull
    private String groupKey;
    private int id;
    private int importance;
    private boolean isEmergency;
    private boolean isGroupSummary;
    private boolean isInterruptible;
    private boolean isSilent;
    private boolean isWorkProfile;

    @NotNull
    private String key;

    @Nullable
    private Icon largeIcon;

    @Nullable
    private Object origin;

    @NotNull
    private String packageName;
    private long postTimeMillis;
    private boolean shouldOnlyAlertOnce;

    @Nullable
    private Icon smallIcon;

    @NotNull
    private MessageStyle style;

    @NotNull
    private String subText;

    @NotNull
    private String tag;

    @NotNull
    private String title;
    private int userId;

    @NotNull
    private byte[] verifyCode;

    @NotNull
    private String verifyUuidKey;
    private long whenTimeMillis;

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.HealthNotificationBean$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watch/notification/HealthNotificationBean$a;", "", "Landroid/service/notification/StatusBarNotification;", "ntf", "Landroid/service/notification/NotificationListenerService$RankingMap;", "rankingMap", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "b", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "", "char", "f", b2n.f, MapSchema.FIELD_NAME_ENTRY, "bean", "key", "", "a", "sbn", "Lcom/heytap/health/watch/notification/MessageStyle;", "d", "", b2n.g, "<init>", "()V", "device_notification2_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthNotificationBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthNotificationBean.kt\ncom/heytap/health/watch/notification/HealthNotificationBean$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1#2:228\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ HealthNotificationBean c(Companion companion, StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap, int i, Object obj) {
            if ((i & 2) != 0) {
                rankingMap = null;
            }
            return companion.b(statusBarNotification, rankingMap);
        }

        public final void a(HealthNotificationBean bean, String key, NotificationListenerService.RankingMap rankingMap) {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            if (rankingMap.getRanking(key, ranking)) {
                bean.setImportance(ranking.getImportance());
                bean.setSilent(bean.isSilent() || ranking.getImportance() <= 2);
            }
        }

        @NotNull
        public final HealthNotificationBean b(@NotNull StatusBarNotification ntf, @Nullable NotificationListenerService.RankingMap rankingMap) {
            Intrinsics.checkNotNullParameter(ntf, "ntf");
            HealthNotificationBean healthNotificationBeanE = e(ntf);
            if (rankingMap != null) {
                Companion companion = HealthNotificationBean.INSTANCE;
                String key = ntf.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "ntf.key");
                companion.a(healthNotificationBeanE, key, rankingMap);
            }
            return healthNotificationBeanE;
        }

        public final MessageStyle d(StatusBarNotification sbn) {
            MessageStyle messageStyle = MessageStyle.STYLE_STANDARD;
            String string = sbn.getNotification().extras.getString(NotificationCompat.EXTRA_TEMPLATE);
            if (TextUtils.equals(string, "com.opus.verify_style")) {
                return MessageStyle.STYLE_VERIFY_CODE;
            }
            if (h(sbn)) {
                return MessageStyle.STYLE_RED_PACKAGE;
            }
            return TextUtils.equals(string, Notification.BigPictureStyle.class.getName()) ? MessageStyle.STYLE_BIG_PICTURE : messageStyle;
        }

        public final HealthNotificationBean e(StatusBarNotification ntf) {
            String str = null;
            HealthNotificationBean healthNotificationBean = new HealthNotificationBean(0, 0, 0, 0, 0, 0L, 0L, null, null, null, null, str, str, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 0, null, null, null, null, null, -1, 1, null);
            healthNotificationBean.setId(ntf.getId());
            healthNotificationBean.setColor(ntf.getNotification().color);
            healthNotificationBean.setFlags(ntf.getNotification().flags);
            healthNotificationBean.setUserId(ntf.getUid());
            healthNotificationBean.setGroupAlertBehavior(ntf.getNotification().getGroupAlertBehavior());
            healthNotificationBean.setWhenTimeMillis(ntf.getNotification().when);
            healthNotificationBean.setPostTimeMillis(ntf.getPostTime());
            String channelId = ntf.getNotification().getChannelId();
            if (channelId == null) {
                channelId = "";
            }
            healthNotificationBean.setChannelId(channelId);
            String key = ntf.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "ntf.key");
            healthNotificationBean.setKey(key);
            String tag = ntf.getTag();
            if (tag == null) {
                tag = "";
            }
            healthNotificationBean.setTag(tag);
            Bundle bundle = ntf.getNotification().extras;
            Intrinsics.checkNotNullExpressionValue(bundle, "ntf.notification.extras");
            healthNotificationBean.setTitle(f(bundle, NotificationCompat.EXTRA_TITLE));
            healthNotificationBean.setContent(f(bundle, NotificationCompat.EXTRA_TEXT));
            String packageName = ntf.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            healthNotificationBean.setAppName(packageName);
            String groupKey = ntf.getGroupKey();
            if (groupKey == null) {
                groupKey = "";
            }
            healthNotificationBean.setGroup(groupKey);
            String groupKey2 = ntf.getGroupKey();
            if (groupKey2 == null) {
                groupKey2 = "";
            }
            healthNotificationBean.setGroupKey(groupKey2);
            healthNotificationBean.setSubText(f(bundle, NotificationCompat.EXTRA_SUB_TEXT));
            healthNotificationBean.setBridgeTag(g(bundle.getBundle("android.wearable.EXTENSIONS"), "bridgeTag"));
            String packageName2 = ntf.getPackageName();
            healthNotificationBean.setPackageName(packageName2 != null ? packageName2 : "");
            String key2 = ntf.getKey();
            Intrinsics.checkNotNullExpressionValue(key2, "ntf.key");
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) key2, new String[]{"|"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() > 1) {
                String str2 = (String) listSplit$default.get(1);
                if (!Intrinsics.areEqual(str2, healthNotificationBean.getPackageName())) {
                    a7b.b("NTF_HealthNtfBean", "convert: wrong packageName, " + str2 + " -> " + healthNotificationBean.getPackageName());
                    if (Intrinsics.areEqual(healthNotificationBean.getPackageName(), "com.meizu.cloud")) {
                        healthNotificationBean.setPackageName(str2);
                    }
                }
            }
            String key3 = ntf.getKey();
            Intrinsics.checkNotNullExpressionValue(key3, "ntf.key");
            healthNotificationBean.setContentIntentId(key3);
            healthNotificationBean.setStyle(d(ntf));
            healthNotificationBean.setSmallIcon(ntf.getNotification().getSmallIcon());
            healthNotificationBean.setLargeIcon(ntf.getNotification().getLargeIcon());
            healthNotificationBean.setOrigin(ntf);
            return healthNotificationBean;
        }

        @NotNull
        public final String f(@Nullable Bundle extras, @NotNull String str) {
            CharSequence charSequence;
            Intrinsics.checkNotNullParameter(str, "char");
            if (extras != null) {
                try {
                    charSequence = extras.getCharSequence(str);
                } catch (Exception e2) {
                    a7b.b("NTF_HealthNtfBean", "getCharSequence: " + e2.getMessage());
                    return "";
                }
            } else {
                charSequence = null;
            }
            return charSequence == null || StringsKt__StringsJVMKt.isBlank(charSequence) ? "" : charSequence.toString();
        }

        @NotNull
        public final String g(@Nullable Bundle extras, @NotNull String str) {
            String string;
            Intrinsics.checkNotNullParameter(str, "char");
            if (extras != null) {
                try {
                    string = extras.getString(str);
                } catch (Exception e2) {
                    a7b.b("NTF_HealthNtfBean", "getCharSequence: " + e2.getMessage());
                    return "";
                }
            } else {
                string = null;
            }
            return string == null || StringsKt__StringsJVMKt.isBlank(string) ? "" : string.toString();
        }

        public final boolean h(StatusBarNotification sbn) {
            String channelId = sbn.getNotification().getChannelId();
            if (channelId == null) {
                channelId = "";
            }
            if (!Intrinsics.areEqual("com.android.systemui", sbn.getPackageName()) || !Intrinsics.areEqual("ENVELOPE", channelId)) {
                return false;
            }
            String tag = sbn.getTag();
            return tag != null && StringsKt__StringsKt.contains$default((CharSequence) tag, (CharSequence) "WeChatEnvelopeHandler", false, 2, (Object) null);
        }
    }

    public HealthNotificationBean() {
        this(0, 0, 0, 0, 0, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 0, null, null, null, null, null, -1, 1, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBridgeTag() {
        return this.bridgeTag;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getContentIntentId() {
        return this.contentIntentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final byte[] getVerifyCode() {
        return this.verifyCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getVerifyUuidKey() {
        return this.verifyUuidKey;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsEmergency() {
        return this.isEmergency;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsWorkProfile() {
        return this.isWorkProfile;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsGroupSummary() {
        return this.isGroupSummary;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsInterruptible() {
        return this.isInterruptible;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getShouldOnlyAlertOnce() {
        return this.shouldOnlyAlertOnce;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsSilent() {
        return this.isSilent;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Icon getAppIcon() {
        return this.appIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Icon getSmallIcon() {
        return this.smallIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Icon getLargeIcon() {
        return this.largeIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final MessageStyle getStyle() {
        return this.style;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Object getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGroupAlertBehavior() {
        return this.groupAlertBehavior;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getWhenTimeMillis() {
        return this.whenTimeMillis;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPostTimeMillis() {
        return this.postTimeMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final HealthNotificationBean copy(int id, int color, int flags, int userId, int groupAlertBehavior, long whenTimeMillis, long postTimeMillis, @NotNull String key, @NotNull String tag, @NotNull String title, @NotNull String content, @NotNull String appName, @NotNull String group, @NotNull String groupKey, @NotNull String subText, @NotNull String bridgeTag, @NotNull String packageName, @NotNull String contentIntentId, @NotNull String channelId, @NotNull byte[] verifyCode, @NotNull String verifyUuidKey, boolean isEmergency, boolean isWorkProfile, boolean isGroupSummary, boolean isInterruptible, boolean shouldOnlyAlertOnce, boolean isSilent, int importance, @Nullable Icon appIcon, @Nullable Icon smallIcon, @Nullable Icon largeIcon, @NotNull MessageStyle style, @Nullable Object origin) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(subText, "subText");
        Intrinsics.checkNotNullParameter(bridgeTag, "bridgeTag");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(contentIntentId, "contentIntentId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        Intrinsics.checkNotNullParameter(verifyUuidKey, "verifyUuidKey");
        Intrinsics.checkNotNullParameter(style, "style");
        return new HealthNotificationBean(id, color, flags, userId, groupAlertBehavior, whenTimeMillis, postTimeMillis, key, tag, title, content, appName, group, groupKey, subText, bridgeTag, packageName, contentIntentId, channelId, verifyCode, verifyUuidKey, isEmergency, isWorkProfile, isGroupSummary, isInterruptible, shouldOnlyAlertOnce, isSilent, importance, appIcon, smallIcon, largeIcon, style, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthNotificationBean)) {
            return false;
        }
        HealthNotificationBean healthNotificationBean = (HealthNotificationBean) other;
        return this.id == healthNotificationBean.id && this.color == healthNotificationBean.color && this.flags == healthNotificationBean.flags && this.userId == healthNotificationBean.userId && this.groupAlertBehavior == healthNotificationBean.groupAlertBehavior && this.whenTimeMillis == healthNotificationBean.whenTimeMillis && this.postTimeMillis == healthNotificationBean.postTimeMillis && Intrinsics.areEqual(this.key, healthNotificationBean.key) && Intrinsics.areEqual(this.tag, healthNotificationBean.tag) && Intrinsics.areEqual(this.title, healthNotificationBean.title) && Intrinsics.areEqual(this.content, healthNotificationBean.content) && Intrinsics.areEqual(this.appName, healthNotificationBean.appName) && Intrinsics.areEqual(this.group, healthNotificationBean.group) && Intrinsics.areEqual(this.groupKey, healthNotificationBean.groupKey) && Intrinsics.areEqual(this.subText, healthNotificationBean.subText) && Intrinsics.areEqual(this.bridgeTag, healthNotificationBean.bridgeTag) && Intrinsics.areEqual(this.packageName, healthNotificationBean.packageName) && Intrinsics.areEqual(this.contentIntentId, healthNotificationBean.contentIntentId) && Intrinsics.areEqual(this.channelId, healthNotificationBean.channelId) && Intrinsics.areEqual(this.verifyCode, healthNotificationBean.verifyCode) && Intrinsics.areEqual(this.verifyUuidKey, healthNotificationBean.verifyUuidKey) && this.isEmergency == healthNotificationBean.isEmergency && this.isWorkProfile == healthNotificationBean.isWorkProfile && this.isGroupSummary == healthNotificationBean.isGroupSummary && this.isInterruptible == healthNotificationBean.isInterruptible && this.shouldOnlyAlertOnce == healthNotificationBean.shouldOnlyAlertOnce && this.isSilent == healthNotificationBean.isSilent && this.importance == healthNotificationBean.importance && Intrinsics.areEqual(this.appIcon, healthNotificationBean.appIcon) && Intrinsics.areEqual(this.smallIcon, healthNotificationBean.smallIcon) && Intrinsics.areEqual(this.largeIcon, healthNotificationBean.largeIcon) && this.style == healthNotificationBean.style && Intrinsics.areEqual(this.origin, healthNotificationBean.origin);
    }

    @Nullable
    public final Icon getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getBridgeTag() {
        return this.bridgeTag;
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getContentIntentId() {
        return this.contentIntentId;
    }

    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    public final int getGroupAlertBehavior() {
        return this.groupAlertBehavior;
    }

    @NotNull
    public final String getGroupKey() {
        return this.groupKey;
    }

    public final int getId() {
        return this.id;
    }

    public final int getImportance() {
        return this.importance;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final Icon getLargeIcon() {
        return this.largeIcon;
    }

    @Nullable
    public final Object getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final long getPostTimeMillis() {
        return this.postTimeMillis;
    }

    public final boolean getShouldOnlyAlertOnce() {
        return this.shouldOnlyAlertOnce;
    }

    @Nullable
    public final Icon getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    public final MessageStyle getStyle() {
        return this.style;
    }

    @NotNull
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getUserId() {
        return this.userId;
    }

    @NotNull
    public final byte[] getVerifyCode() {
        return this.verifyCode;
    }

    @NotNull
    public final String getVerifyUuidKey() {
        return this.verifyUuidKey;
    }

    public final long getWhenTimeMillis() {
        return this.whenTimeMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r1v41, types: [int] */
    /* JADX WARN: Type inference failed for: r1v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.flags)) * 31) + Integer.hashCode(this.userId)) * 31) + Integer.hashCode(this.groupAlertBehavior)) * 31) + Long.hashCode(this.whenTimeMillis)) * 31) + Long.hashCode(this.postTimeMillis)) * 31) + this.key.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.group.hashCode()) * 31) + this.groupKey.hashCode()) * 31) + this.subText.hashCode()) * 31) + this.bridgeTag.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.contentIntentId.hashCode()) * 31) + this.channelId.hashCode()) * 31) + Arrays.hashCode(this.verifyCode)) * 31) + this.verifyUuidKey.hashCode()) * 31;
        boolean z = this.isEmergency;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isWorkProfile;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isGroupSummary;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.isInterruptible;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.shouldOnlyAlertOnce;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.isSilent;
        int iHashCode2 = (((i5 + (z6 ? 1 : z6)) * 31) + Integer.hashCode(this.importance)) * 31;
        Icon icon = this.appIcon;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.smallIcon;
        int iHashCode4 = (iHashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        Icon icon3 = this.largeIcon;
        int iHashCode5 = (((iHashCode4 + (icon3 == null ? 0 : icon3.hashCode())) * 31) + this.style.hashCode()) * 31;
        Object obj = this.origin;
        return iHashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isEmergency() {
        return this.isEmergency;
    }

    public final boolean isGroupSummary() {
        return this.isGroupSummary;
    }

    public final boolean isInterruptible() {
        return this.isInterruptible;
    }

    public final boolean isSilent() {
        return this.isSilent;
    }

    public final boolean isWorkProfile() {
        return this.isWorkProfile;
    }

    public final boolean repeat(@NotNull HealthNotificationBean other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(this.key, other.key) && Intrinsics.areEqual(this.title, other.title) && Intrinsics.areEqual(this.content, other.content) && Math.abs(this.postTimeMillis - other.postTimeMillis) < 200;
    }

    public final void setAppIcon(@Nullable Icon icon) {
        this.appIcon = icon;
    }

    public final void setAppName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appName = str;
    }

    public final void setBridgeTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bridgeTag = str;
    }

    public final void setChannelId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channelId = str;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setContentIntentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentIntentId = str;
    }

    public final void setEmergency(boolean z) {
        this.isEmergency = z;
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void setGroup(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.group = str;
    }

    public final void setGroupAlertBehavior(int i) {
        this.groupAlertBehavior = i;
    }

    public final void setGroupKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupKey = str;
    }

    public final void setGroupSummary(boolean z) {
        this.isGroupSummary = z;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setImportance(int i) {
        this.importance = i;
    }

    public final void setInterruptible(boolean z) {
        this.isInterruptible = z;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setLargeIcon(@Nullable Icon icon) {
        this.largeIcon = icon;
    }

    public final void setOrigin(@Nullable Object obj) {
        this.origin = obj;
    }

    public final void setPackageName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.packageName = str;
    }

    public final void setPostTimeMillis(long j2) {
        this.postTimeMillis = j2;
    }

    public final void setShouldOnlyAlertOnce(boolean z) {
        this.shouldOnlyAlertOnce = z;
    }

    public final void setSilent(boolean z) {
        this.isSilent = z;
    }

    public final void setSmallIcon(@Nullable Icon icon) {
        this.smallIcon = icon;
    }

    public final void setStyle(@NotNull MessageStyle messageStyle) {
        Intrinsics.checkNotNullParameter(messageStyle, "<set-?>");
        this.style = messageStyle;
    }

    public final void setSubText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subText = str;
    }

    public final void setTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tag = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public final void setVerifyCode(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.verifyCode = bArr;
    }

    public final void setVerifyUuidKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyUuidKey = str;
    }

    public final void setWhenTimeMillis(long j2) {
        this.whenTimeMillis = j2;
    }

    public final void setWorkProfile(boolean z) {
        this.isWorkProfile = z;
    }

    @NotNull
    public String toString() {
        return "HealthNotificationBean(id=" + this.id + ", color=" + this.color + ", flags=" + this.flags + ", userId=" + this.userId + ", groupAlertBehavior=" + this.groupAlertBehavior + ", whenTimeMillis=" + this.whenTimeMillis + ", postTimeMillis=" + this.postTimeMillis + ", key=" + this.key + ", tag=" + this.tag + ", title=" + this.title + ", content=" + this.content + ", appName=" + this.appName + ", group=" + this.group + ", groupKey=" + this.groupKey + ", subText=" + this.subText + ", bridgeTag=" + this.bridgeTag + ", packageName=" + this.packageName + ", contentIntentId=" + this.contentIntentId + ", channelId=" + this.channelId + ", verifyCode=" + Arrays.toString(this.verifyCode) + ", verifyUuidKey=" + this.verifyUuidKey + ", isEmergency=" + this.isEmergency + ", isWorkProfile=" + this.isWorkProfile + ", isGroupSummary=" + this.isGroupSummary + ", isInterruptible=" + this.isInterruptible + ", shouldOnlyAlertOnce=" + this.shouldOnlyAlertOnce + ", isSilent=" + this.isSilent + ", importance=" + this.importance + ", appIcon=" + this.appIcon + ", smallIcon=" + this.smallIcon + ", largeIcon=" + this.largeIcon + ", style=" + this.style + ", origin=" + this.origin + ")";
    }

    public HealthNotificationBean(int i, int i2, int i3, int i4, int i5, long j2, long j3, @NotNull String key, @NotNull String tag, @NotNull String title, @NotNull String content, @NotNull String appName, @NotNull String group, @NotNull String groupKey, @NotNull String subText, @NotNull String bridgeTag, @NotNull String packageName, @NotNull String contentIntentId, @NotNull String channelId, @NotNull byte[] verifyCode, @NotNull String verifyUuidKey, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i6, @Nullable Icon icon, @Nullable Icon icon2, @Nullable Icon icon3, @NotNull MessageStyle style, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        Intrinsics.checkNotNullParameter(subText, "subText");
        Intrinsics.checkNotNullParameter(bridgeTag, "bridgeTag");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(contentIntentId, "contentIntentId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        Intrinsics.checkNotNullParameter(verifyUuidKey, "verifyUuidKey");
        Intrinsics.checkNotNullParameter(style, "style");
        this.id = i;
        this.color = i2;
        this.flags = i3;
        this.userId = i4;
        this.groupAlertBehavior = i5;
        this.whenTimeMillis = j2;
        this.postTimeMillis = j3;
        this.key = key;
        this.tag = tag;
        this.title = title;
        this.content = content;
        this.appName = appName;
        this.group = group;
        this.groupKey = groupKey;
        this.subText = subText;
        this.bridgeTag = bridgeTag;
        this.packageName = packageName;
        this.contentIntentId = contentIntentId;
        this.channelId = channelId;
        this.verifyCode = verifyCode;
        this.verifyUuidKey = verifyUuidKey;
        this.isEmergency = z;
        this.isWorkProfile = z2;
        this.isGroupSummary = z3;
        this.isInterruptible = z4;
        this.shouldOnlyAlertOnce = z5;
        this.isSilent = z6;
        this.importance = i6;
        this.appIcon = icon;
        this.smallIcon = icon2;
        this.largeIcon = icon3;
        this.style = style;
        this.origin = obj;
    }

    public /* synthetic */ HealthNotificationBean(int i, int i2, int i3, int i4, int i5, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, byte[] bArr, String str13, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i6, Icon icon, Icon icon2, Icon icon3, MessageStyle messageStyle, Object obj, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0L : j2, (i7 & 64) == 0 ? j3 : 0L, (i7 & 128) != 0 ? "" : str, (i7 & 256) != 0 ? "" : str2, (i7 & 512) != 0 ? "" : str3, (i7 & 1024) != 0 ? "" : str4, (i7 & 2048) != 0 ? "" : str5, (i7 & 4096) != 0 ? "" : str6, (i7 & 8192) != 0 ? "" : str7, (i7 & 16384) != 0 ? "" : str8, (i7 & 32768) != 0 ? "" : str9, (i7 & 65536) != 0 ? "" : str10, (i7 & 131072) != 0 ? "" : str11, (i7 & 262144) != 0 ? "" : str12, (i7 & 524288) != 0 ? new byte[0] : bArr, (i7 & 1048576) != 0 ? "" : str13, (i7 & 2097152) != 0 ? false : z, (i7 & 4194304) != 0 ? false : z2, (i7 & 8388608) != 0 ? false : z3, (i7 & 16777216) != 0 ? false : z4, (i7 & 33554432) != 0 ? false : z5, (i7 & 67108864) == 0 ? z6 : false, (i7 & 134217728) != 0 ? -1 : i6, (i7 & 268435456) != 0 ? null : icon, (i7 & 536870912) != 0 ? null : icon2, (i7 & 1073741824) != 0 ? null : icon3, (i7 & Integer.MIN_VALUE) != 0 ? MessageStyle.STYLE_STANDARD : messageStyle, (i8 & 1) == 0 ? obj : null);
    }
}
