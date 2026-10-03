package com.oplus.aiunit.vision;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.service.notification.StatusBarNotification;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService;
import com.heytap.health.watch.commonnotification.HeytapNotificationListenerService;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.heytap.health.watch.notification.ReSyncNotificationProto;
import com.heytap.health.watch.notification.SimpleNotificationProto;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.service.BgConnect;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 &2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ#\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J5\u0010\u001f\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\"\u001a\u00020!H\u0002¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/m9k;", "Lcom/oplus/aiunit/vision/gz9;", "", "key", "", "s", "Landroid/app/Notification;", BgConnect.KEY_NOTIFICATION, "", "replyText", LogFieldKey.PROCESS_NAME_KEY, "", "Landroid/app/Notification$Action;", DBWristTemperatureStat.ACTIONS, MapSchema.FIELD_NAME_KEY, "([Landroid/app/Notification$Action;Ljava/lang/String;)V", "", "data", LogFieldKey.LEVEL_KEY, "n", "Lcom/heytap/health/watch/notification/ParsedNotificationActionProto;", "actionReply", "i", "Landroid/app/PendingIntent;", "pi", "Landroid/content/Intent;", "j", "Landroid/app/RemoteInput;", "inputs", "input", "a", "u", "([Landroid/app/RemoteInput;Landroid/app/RemoteInput;Ljava/lang/String;Landroid/app/Notification$Action;)V", "", "wear", "o", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationTransceiverConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationTransceiverConvert.kt\ncom/heytap/health/watch/notification/impl/transceiver/transceiverconvert/TransceiverConvert\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,342:1\n6152#2,2:343\n1855#3,2:345\n*S KotlinDebug\n*F\n+ 1 NotificationTransceiverConvert.kt\ncom/heytap/health/watch/notification/impl/transceiver/transceiverconvert/TransceiverConvert\n*L\n271#1:343,2\n291#1:345,2\n*E\n"})
public abstract class m9k implements gz9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "NTF_Converter";

    @Nullable
    public static cvc.b a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.m9k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/m9k$a;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "Lcom/oplus/aiunit/vision/m9k;", "a", "", "TAG", "Ljava/lang/String;", "Lcom/oplus/aiunit/vision/cvc$b;", "ability", "Lcom/oplus/aiunit/vision/cvc$b;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m9k a(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            m9k.a = evc.a(node.getNodeId());
            cvc.b bVar = m9k.a;
            if (bVar != null && bVar.D1()) {
                return new f8l();
            }
            cvc.b bVar2 = m9k.a;
            return bVar2 != null && bVar2.h8() ? new oh1() : new xuc();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 NotificationTransceiverConvert.kt\ncom/heytap/health/watch/notification/impl/transceiver/transceiverconvert/TransceiverConvert\n*L\n1#1,328:1\n271#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StatusBarNotification) t2).getPostTime()), Long.valueOf(((StatusBarNotification) t).getPostTime()));
        }
    }

    public static final void m(m9k this$0, byte[] bArr, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 1) {
            this$0.o(bArr, true);
        } else {
            a7b.m("NTF_Converter", "onNotificationReSync: not wear, will drop new notification");
            this$0.o(bArr, false);
        }
    }

    public static final void q(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
    }

    public static final void r(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
    }

    public static final void t(PendingIntent pendingIntent, HeytapNotificationListenerService heytapNotificationListenerService, PendingIntent pendingIntent2, Intent intent, int i, String str, Bundle bundle) {
        a7b.f("NTF_Converter", "onSendFinished: " + pendingIntent2 + " " + intent + " " + i + " " + str + " " + bundle);
        if (pendingIntent.isActivity()) {
            heytapNotificationListenerService.startActivity(intent);
        }
    }

    public void i(@NotNull ParsedNotificationActionProto actionReply) {
        Intrinsics.checkNotNullParameter(actionReply, "actionReply");
        String intentId = actionReply.getIntentId();
        Intrinsics.checkNotNullExpressionValue(intentId, "actionReply.intentId");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) intentId, new String[]{"^w^"}, false, 0, 6, (Object) null);
        if ((!listSplit$default.isEmpty()) && listSplit$default.size() == 2) {
            String str = (String) listSplit$default.get(0);
            int i = Integer.parseInt((String) listSplit$default.get(1));
            HealthNotificationBean healthNotificationBeanT = gwc.INSTANCE.t(str);
            if (healthNotificationBeanT == null || !(healthNotificationBeanT.getOrigin() instanceof StatusBarNotification)) {
                return;
            }
            Object origin = healthNotificationBeanT.getOrigin();
            Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            Notification.Action action = ((StatusBarNotification) origin).getNotification().actions[i];
            PendingIntent pendingIntent = action.actionIntent;
            Intent intentAddFlags = new Intent().addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "Intent().addFlags(Intent.FLAG_RECEIVER_FOREGROUND)");
            Bundle bundle = new Bundle();
            bundle.putString(actionReply.getRemoteInputs().getResultKey(), actionReply.getReply());
            RemoteInput.addResultsToIntent(action.getRemoteInputs(), intentAddFlags, bundle);
            try {
                HeytapNotificationListenerService heytapNotificationListenerServiceJ = ls8.INSTANCE.j();
                if (Build.VERSION.SDK_INT >= 34) {
                    pendingIntent.send(heytapNotificationListenerServiceJ, 0, intentAddFlags, null, null, null, ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                } else {
                    pendingIntent.send(heytapNotificationListenerServiceJ, 0, intentAddFlags);
                }
            } catch (Exception e2) {
                a7b.b("NTF_Converter", "actionReply: " + e2.getMessage());
            }
        }
    }

    public final Intent j(PendingIntent pi) {
        Intent intent = new Intent().addFlags(32).setPackage(pi.getCreatorPackage());
        Intrinsics.checkNotNullExpressionValue(intent, "Intent().addFlags(Intent…ackage(pi.creatorPackage)");
        return intent;
    }

    public final void k(@NotNull Notification.Action[] actions, @NotNull String replyText) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(replyText, "replyText");
        for (Notification.Action action : actions) {
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (action.actionIntent != null && remoteInputs != null) {
                RemoteInput remoteInput = null;
                for (RemoteInput remoteInput2 : remoteInputs) {
                    if (remoteInput2.getAllowFreeFormInput()) {
                        remoteInput = remoteInput2;
                    }
                }
                if (remoteInput != null) {
                    u(remoteInputs, remoteInput, replyText, action);
                    return;
                }
            }
        }
    }

    public void l(@Nullable final byte[] data) {
        if (!com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k("wrist_off_push")) {
            cvc.b bVar = a;
            if (bVar != null && bVar.x5()) {
                Object objNavigation = x0.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation();
                Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService");
                ((IDeviceWearStatusService) objNavigation).W6(new xm3() { // from class: com.oplus.aiunit.vision.j9k
                    @Override // com.oplus.aiunit.vision.xm3
                    public final void onResult(Object obj) {
                        m9k.m(this.a, data, (Integer) obj);
                    }
                }, false);
                return;
            }
        }
        o(data, true);
    }

    public void n(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        s(key);
    }

    public final void o(byte[] data, boolean wear) {
        ReSyncNotificationProto reSyncNotificationProtoG = exc.INSTANCE.g(data);
        if (reSyncNotificationProtoG != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onNotificationReSync: ");
            sb.append(reSyncNotificationProtoG);
            for (SimpleNotificationProto simpleNotificationProto : reSyncNotificationProtoG.getDismissList()) {
                gwc gwcVar = gwc.INSTANCE;
                String key = simpleNotificationProto.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "sbn.key");
                gwcVar.I(key);
                pwc.INSTANCE.b().remove(simpleNotificationProto.getKey());
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long jMax = 0;
        if (reSyncNotificationProtoG != null) {
            for (SimpleNotificationProto simpleNotificationProto2 : reSyncNotificationProtoG.getHaveList()) {
                String key2 = simpleNotificationProto2.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "item.key");
                linkedHashSet.add(key2);
                jMax = Math.max(simpleNotificationProto2.getPostTime(), jMax);
            }
        }
        StatusBarNotification[] statusBarNotificationArrI = ls8.INSTANCE.i();
        if (statusBarNotificationArrI != null && statusBarNotificationArrI.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(statusBarNotificationArrI, new b());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        boolean z = false;
        if (statusBarNotificationArrI != null) {
            if (!(statusBarNotificationArrI.length == 0)) {
                z = true;
            }
        }
        if (z) {
            for (int length = statusBarNotificationArrI.length - 1; -1 < length; length--) {
                StatusBarNotification statusBarNotification = statusBarNotificationArrI[length];
                String key3 = statusBarNotification.getKey();
                Intrinsics.checkNotNullExpressionValue(key3, "item.key");
                linkedHashSet2.add(key3);
                if ((!linkedHashSet.contains(statusBarNotification.getKey()) || pwc.INSTANCE.b().contains(statusBarNotification.getKey())) && statusBarNotification.getPostTime() >= jMax && wear) {
                    HealthNotificationBean healthNotificationBeanC = HealthNotificationBean.Companion.c(HealthNotificationBean.INSTANCE, statusBarNotification, null, 2, null);
                    healthNotificationBeanC.setFlags(healthNotificationBeanC.getFlags() | 268435456);
                    gwc.INSTANCE.y(healthNotificationBeanC);
                }
            }
        }
        linkedHashSet.removeAll(linkedHashSet2);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            gwc.INSTANCE.c(new HealthNotificationBean(0, 0, 0, 0, 0, 0L, 0L, (String) it.next(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, 0, null, null, null, null, null, -129, 1, null));
        }
        pwc.INSTANCE.b().clear();
    }

    public final void p(@NotNull Notification notification, @NotNull CharSequence replyText) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(replyText, "replyText");
        Notification.CarExtender.UnreadConversation unreadConversation = new Notification.CarExtender(notification).getUnreadConversation();
        if (unreadConversation != null) {
            PendingIntent pendingIntentReply = unreadConversation.getReplyPendingIntent();
            PendingIntent pendingIntentRead = unreadConversation.getReadPendingIntent();
            Intrinsics.checkNotNullExpressionValue(pendingIntentReply, "pendingIntentReply");
            Intent intentJ = j(pendingIntentReply);
            Intrinsics.checkNotNullExpressionValue(pendingIntentRead, "pendingIntentRead");
            Intent intentJ2 = j(pendingIntentRead);
            String resultKey = unreadConversation.getRemoteInput().getResultKey();
            Bundle bundle = new Bundle();
            bundle.putString(resultKey, replyText.toString());
            RemoteInput.addResultsToIntent(new RemoteInput[]{new RemoteInput.Builder(resultKey).build()}, intentJ, bundle);
            try {
                HeytapNotificationListenerService heytapNotificationListenerServiceJ = ls8.INSTANCE.j();
                if (Build.VERSION.SDK_INT >= 34) {
                    Bundle bundle2 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                    pendingIntentReply.send(heytapNotificationListenerServiceJ, 0, intentJ, null, null, null, bundle2);
                    pendingIntentRead.send(heytapNotificationListenerServiceJ, 1, intentJ2, null, null, null, bundle2);
                } else {
                    pendingIntentReply.send(heytapNotificationListenerServiceJ, 0, intentJ, new PendingIntent.OnFinished() { // from class: com.oplus.aiunit.vision.k9k
                        @Override // android.app.PendingIntent.OnFinished
                        public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle3) {
                            m9k.q(pendingIntent, intent, i, str, bundle3);
                        }
                    }, null);
                    pendingIntentRead.send(heytapNotificationListenerServiceJ, 1, intentJ2, new PendingIntent.OnFinished() { // from class: com.oplus.aiunit.vision.l9k
                        @Override // android.app.PendingIntent.OnFinished
                        public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle3) {
                            m9k.r(pendingIntent, intent, i, str, bundle3);
                        }
                    }, null);
                }
            } catch (Exception e2) {
                a7b.b("NTF_Converter", "replyWeChat: " + e2.getMessage());
            }
        }
    }

    public final void s(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        a7b.f("NTF_Converter", "sendPendingIntent: " + key);
        gwc gwcVar = gwc.INSTANCE;
        HealthNotificationBean healthNotificationBeanT = gwcVar.t(key);
        if (healthNotificationBeanT != null) {
            try {
                Object origin = healthNotificationBeanT.getOrigin();
                Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
                StatusBarNotification statusBarNotification = (StatusBarNotification) origin;
                final PendingIntent pendingIntent = statusBarNotification.getNotification().contentIntent;
                final HeytapNotificationListenerService heytapNotificationListenerServiceJ = ls8.INSTANCE.j();
                if (Build.VERSION.SDK_INT >= 34 && pendingIntent != null && heytapNotificationListenerServiceJ != null) {
                    Bundle bundle = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                    Intent intent = new Intent().addFlags(32).setPackage(pendingIntent.getCreatorPackage());
                    Intrinsics.checkNotNullExpressionValue(intent, "Intent().addFlags(Intent…ingIntent.creatorPackage)");
                    pendingIntent.send(heytapNotificationListenerServiceJ, 0, intent, new PendingIntent.OnFinished() { // from class: com.oplus.aiunit.vision.i9k
                        @Override // android.app.PendingIntent.OnFinished
                        public final void onSendFinished(PendingIntent pendingIntent2, Intent intent2, int i, String str, Bundle bundle2) {
                            m9k.t(pendingIntent, heytapNotificationListenerServiceJ, pendingIntent2, intent2, i, str, bundle2);
                        }
                    }, null, null, bundle);
                } else if (pendingIntent != null) {
                    pendingIntent.send();
                }
                mxc mxcVar = mxc.INSTANCE;
                Context contextA = b78.a();
                Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                if (!mxcVar.c(contextA)) {
                    Object systemService = b78.a().getSystemService("power");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(268435462, "connect:notification");
                    Intrinsics.checkNotNullExpressionValue(wakeLockNewWakeLock, "powerManager.newWakeLock…on\"\n                    )");
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    wakeLockNewWakeLock.acquire(3000L);
                }
                String key2 = statusBarNotification.getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "sbn.key");
                gwcVar.I(key2);
            } catch (Exception e2) {
                a7b.b("NTF_Converter", "sendPendingIntent: " + e2.getMessage());
            }
        }
    }

    public final void u(RemoteInput[] inputs, RemoteInput input, String replyText, Notification.Action a2) {
        Intent intentAddFlags = new Intent().addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "Intent().addFlags(Intent.FLAG_RECEIVER_FOREGROUND)");
        Bundle bundle = new Bundle();
        bundle.putString(input.getResultKey(), replyText);
        RemoteInput.addResultsToIntent(inputs, intentAddFlags, bundle);
        try {
            HeytapNotificationListenerService heytapNotificationListenerServiceJ = ls8.INSTANCE.j();
            if (Build.VERSION.SDK_INT >= 34) {
                a2.actionIntent.send(heytapNotificationListenerServiceJ, 0, intentAddFlags, null, null, null, ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                a2.actionIntent.send(heytapNotificationListenerServiceJ, 0, intentAddFlags);
            }
        } catch (Exception e2) {
            a7b.b("NTF_Converter", "sendReply: " + e2.getMessage());
        }
    }
}
