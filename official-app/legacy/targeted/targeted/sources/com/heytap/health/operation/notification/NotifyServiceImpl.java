package com.heytap.health.operation.notification;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.accessory.constant.Constants;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.health.cardiovascular.CardiovascularService;
import com.heytap.health.operation.R$string;
import com.heytap.health.operation.notification.ui.NotifyDispatcherActivity;
import com.heytap.health.operations.NotifyReportReceiver;
import com.heytap.health.operations.bean.NotificationItemData;
import com.heytap.health.operations.bean.NotifyType;
import com.heytap.health.operations.router.providers.INotifyService;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.euf;
import com.oplus.aiunit.vision.fsi;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.gt9;
import com.oplus.aiunit.vision.hq8;
import com.oplus.aiunit.vision.jee;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.lcb;
import com.oplus.aiunit.vision.mzj;
import com.oplus.aiunit.vision.pvc;
import com.oplus.aiunit.vision.uhf;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/operation/NotifyService")
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J2\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J\u001a\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J2\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00042\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0004H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u000bH\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\u0018\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00105\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00106\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0006H\u0016J\b\u00109\u001a\u00020\u0004H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J\b\u0010<\u001a\u00020\u0004H\u0016J\b\u0010=\u001a\u00020\u0004H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0004H\u0016J\b\u0010A\u001a\u00020\u0004H\u0016J\b\u0010B\u001a\u00020\u0004H\u0016R\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/heytap/health/operation/notification/NotifyServiceImpl;", "Lcom/heytap/health/operations/router/providers/INotifyService;", "Lcom/heytap/health/operation/notification/CloudSyncNotifyType;", "type", "", "q6", "", "itemId", "checked", "Lkotlin/Function2;", "", "", "callback", "kb", "Lcom/heytap/health/operations/bean/NotificationItemData;", "itemData", "Landroid/graphics/Bitmap;", "bitmap", "qb", "title", "Landroid/app/PendingIntent;", "Q6", "Landroid/content/Context;", "context", "Lcom/heytap/health/operations/bean/NotifyType;", "notifyType", "Q2", "init", "z5", ViewEntity.ENABLED, "y0", "sa", c8l.KEY_C2, "C4", "isTrue", "K3", "on", "y7", "Pa", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "metadataStat", "q5", "Landroid/content/Intent;", HttpConst.UA, "h1", "c", "mContext", "Landroidx/core/app/NotificationCompat$Builder;", "builder", "Lcom/oplus/aiunit/vision/gt9;", "k0", Constants.EXTRA_OAF_SWITCH_STATE, euf.PROTO, "ob", "nb", "mb", "lb", "ib", "hb", "jb", "L8", "db", "eb", "l3", "x9", "fb", "gb", "Lcom/oplus/aiunit/vision/fsi;", "i", "Lcom/oplus/aiunit/vision/fsi;", "mStepNotificationHelper", "Lcom/oplus/aiunit/vision/lcb;", "j", "Lcom/oplus/aiunit/vision/lcb;", "mMMNotifyHelper", "Lcom/heytap/health/operation/notification/NotifyStateManager;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/operation/notification/NotifyStateManager;", "notifyStateManager", LogFieldKey.LEVEL_KEY, "Ljava/lang/String;", "channelId", "<init>", "()V", "Companion", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NotifyServiceImpl implements INotifyService {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public fsi mStepNotificationHelper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public lcb mMMNotifyHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public NotifyStateManager notifyStateManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String channelId = "new_record_channel_id";
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CloudSyncNotifyType.values().length];
            try {
                iArr[CloudSyncNotifyType.COMMUNITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloudSyncNotifyType.OPERATION_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CloudSyncNotifyType.QUESTIONNAIRE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NotifyType.values().length];
            try {
                iArr2[NotifyType.NOTIFY_SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NotifyType.NOTIFY_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NotifyType.NOTIFY_WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NotifyType.NOTIFY_MEDAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NotifyType.NOTIFY_ECG.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[NotifyType.NOTIFY_HEART_RATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[NotifyType.NOTIFY_CARDIOVASCULAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void C2(@NotNull NotificationItemData itemData, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        qb(itemData, bitmap);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public boolean C4() {
        return jee.c().a();
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void K3(boolean isTrue) {
        jee.c().g(isTrue);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public boolean L8() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_MEDAL_RECORD_STATUS_NOTIFY, true);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void Pa() {
        jee.c().f();
    }

    public final void Q2(Context context, NotifyType notifyType) {
        String string = context.getString(R$string.operation_notify_channel_recv_data);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…notify_channel_recv_data)");
        switch (b.$EnumSwitchMapping$1[notifyType.ordinal()]) {
            case 1:
                string = context.getString(R$string.operation_notify_channel_recv_sport);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…otify_channel_recv_sport)");
                this.channelId = "sport_record_channel_id";
                break;
            case 2:
                string = context.getString(R$string.operation_notify_channel_recv_sleep);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…otify_channel_recv_sleep)");
                this.channelId = "sleep_record_channel_id";
                break;
            case 3:
                string = context.getString(R$string.operation_notify_channel_recv_weekly);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…tify_channel_recv_weekly)");
                this.channelId = "weekly_record_channel_id";
                break;
            case 4:
                string = context.getString(R$string.operation_notify_channel_recv_medal);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…otify_channel_recv_medal)");
                this.channelId = "medal_record_channel_id";
                break;
            case 5:
                string = context.getString(R$string.operation_notify_channel_recv_ecg);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_notify_channel_recv_ecg)");
                this.channelId = "ecg_record_channel_id";
                break;
            case 6:
                string = context.getString(R$string.operation_notify_channel_recv_heart);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…otify_channel_recv_heart)");
                this.channelId = "heart_record_channel_id";
                break;
            case 7:
                string = context.getString(R$string.operation_notify_channel_recv_cardiovascular);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…nnel_recv_cardiovascular)");
                this.channelId = "cardiovascular_record_channel_id";
                break;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.channelId, string, 3);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final PendingIntent Q6(String title) {
        Intent intent = new Intent(b78.a(), (Class<?>) NotifyReportReceiver.class);
        intent.setAction(NotifyReportReceiver.ACTION_NOTIFICATION_DELETE);
        intent.putExtra(NotifyReportReceiver.EXTRA_PUSH_TITLE, title);
        return PendingIntent.getBroadcast(b78.a(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public boolean c() {
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        List<UserDeviceInfo> list = boundDeviceInfos;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            a7b.b("NotifyService", "bind devices is null!");
            return false;
        }
        Object objNavigation = x0.d().b("/cardiovascular/CardiovascularService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.cardiovascular.CardiovascularService");
        CardiovascularService cardiovascularService = (CardiovascularService) objNavigation;
        for (UserDeviceInfo userDeviceInfo : boundDeviceInfos) {
            String mac = userDeviceInfo.getMac();
            Intrinsics.checkNotNullExpressionValue(mac, "bindDeviceInfo.mac");
            if (!cardiovascularService.T9(mac)) {
                String mac2 = userDeviceInfo.getMac();
                Intrinsics.checkNotNullExpressionValue(mac2, "bindDeviceInfo.mac");
                if (cardiovascularService.y2(mac2)) {
                }
            }
            a7b.f("NotifyService", "supportCardiovascular = " + z);
            return z;
        }
        z = false;
        a7b.f("NotifyService", "supportCardiovascular = " + z);
        return z;
    }

    public boolean db() {
        return h1() && v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_ECG_DETAIL_STATUS_NOTIFY, true);
    }

    public boolean eb() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_HEART_RATE_STATUS_NOTIFY, true);
    }

    public boolean fb() {
        return q6(CloudSyncNotifyType.OPERATION_ACTIVITY);
    }

    public boolean gb() {
        return q6(CloudSyncNotifyType.QUESTIONNAIRE);
    }

    public boolean h1() {
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        List<UserDeviceInfo> list = boundDeviceInfos;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            a7b.b("NotifyService", "bind devices is null!");
            return false;
        }
        Iterator<UserDeviceInfo> it = boundDeviceInfos.iterator();
        while (it.hasNext()) {
            if (((Boolean) lc5.c(it.next().getMac()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.operation.notification.NotifyServiceImpl$checkEcgDevice$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.Za());
                }
            })).booleanValue()) {
                a7b.f("NotifyService", "isEcg = " + z);
                return z;
            }
        }
        z = false;
        a7b.f("NotifyService", "isEcg = " + z);
        return z;
    }

    public boolean hb() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_SLEEP_STATUS_NOTIFY, true);
    }

    public boolean ib() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_SPORT_STATUS_NOTIFY, true);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        this.mStepNotificationHelper = new fsi();
        this.mMMNotifyHelper = lcb.s();
        if (context != null) {
            this.notifyStateManager = new NotifyStateManager(context);
        }
    }

    public boolean jb() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_WEEKLY_REPORT_STATUS_NOTIFY, true);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    @NotNull
    public gt9 k0(@NotNull Context mContext, @NotNull NotificationCompat.Builder builder) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(builder, "builder");
        lcb lcbVar = this.mMMNotifyHelper;
        Intrinsics.checkNotNull(lcbVar);
        gt9 gt9VarG = lcbVar.g(mContext, builder);
        Intrinsics.checkNotNullExpressionValue(gt9VarG, "mMMNotifyHelper!!.parasi…Nofity(mContext, builder)");
        return gt9VarG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void kb(String itemId, boolean checked, Function2<? super Boolean, ? super Integer, Unit> callback) {
        String str = checked ? "1" : "0";
        switch (itemId) {
            case "ecg_detail":
                mb(str);
                callback.invoke(Boolean.TRUE, 0);
                break;
            case "medal_record":
                nb(str);
                callback.invoke(Boolean.TRUE, 0);
                break;
            case "cardiovascular_detail":
                lb(str);
                callback.invoke(Boolean.TRUE, 0);
                break;
            case "sleep_record":
                ob(str);
                callback.invoke(Boolean.TRUE, 0);
                break;
            case "sport_record":
                pb(str);
                callback.invoke(Boolean.TRUE, 0);
                break;
            default:
                if (itemId.equals("ecg_detail")) {
                    mb(str);
                    callback.invoke(Boolean.TRUE, 0);
                    break;
                }
                callback.invoke(Boolean.FALSE, 4);
                break;
        }
    }

    public boolean l3() {
        return c() && v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_ASSESSMENT_DETAIL_STATUS_NOTIFY, true);
    }

    public void lb(@NotNull String switchState) {
        Intrinsics.checkNotNullParameter(switchState, "switchState");
        v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(hq8.SP_ASSESSMENT_DETAIL_STATUS_NOTIFY, Intrinsics.areEqual(switchState, "1"));
    }

    public void mb(@NotNull String switchState) {
        Intrinsics.checkNotNullParameter(switchState, "switchState");
        v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(hq8.SP_ECG_DETAIL_STATUS_NOTIFY, Intrinsics.areEqual(switchState, "1"));
    }

    public void nb(@NotNull String switchState) {
        Intrinsics.checkNotNullParameter(switchState, "switchState");
        v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(hq8.SP_MEDAL_RECORD_STATUS_NOTIFY, Intrinsics.areEqual(switchState, "1"));
    }

    public void ob(@NotNull String switchState) {
        Intrinsics.checkNotNullParameter(switchState, "switchState");
        v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(hq8.SP_SLEEP_STATUS_NOTIFY, Intrinsics.areEqual(switchState, "1"));
    }

    public void pb(@NotNull String switchState) {
        Intrinsics.checkNotNullParameter(switchState, "switchState");
        v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(hq8.SP_SPORT_STATUS_NOTIFY, Intrinsics.areEqual(switchState, "1"));
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void q5(@NotNull TrackMetadataStat metadataStat) {
        Intrinsics.checkNotNullParameter(metadataStat, "metadataStat");
        new uhf().a(metadataStat);
    }

    public final boolean q6(CloudSyncNotifyType type) {
        int i = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return x9();
        }
        if (i == 2) {
            return fb();
        }
        if (i == 3) {
            return gb();
        }
        throw new NoWhenBranchMatchedException();
    }

    @SuppressLint({"MissingPermission"})
    public final void qb(NotificationItemData itemData, Bitmap bitmap) {
        boolean zIb;
        int i;
        switch (b.$EnumSwitchMapping$1[itemData.getNotifyType().ordinal()]) {
            case 1:
                zIb = ib();
                i = 102904;
                break;
            case 2:
                zIb = hb();
                i = 102905;
                break;
            case 3:
                zIb = jb();
                i = 102906;
                break;
            case 4:
                zIb = L8();
                i = 102907;
                break;
            case 5:
                zIb = db();
                i = 102908;
                break;
            case 6:
                zIb = eb();
                i = 102909;
                break;
            case 7:
                zIb = l3();
                i = 102910;
                break;
            default:
                i = 102903;
                zIb = false;
                break;
        }
        if (!zIb) {
            a7b.b("NotifyService", "There is no notification permission");
            return;
        }
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        Q2(contextA, itemData.getNotifyType());
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(b78.a(), this.channelId).setSmallIcon(R$mipmap.lib_base_ic_launcher).setContentTitle(itemData.getTitle()).setContentText(itemData.getContent()).setContentIntent(itemData.getIntent()).setDeleteIntent(Q6(itemData.getTitle())).setPriority(0).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "Builder(GlobalApplicatio…     .setAutoCancel(true)");
        if (bitmap != null) {
            autoCancel.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap));
        }
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(b78.a());
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(GlobalApplicationHolder.getAppContext())");
        Map<String, Object> mapOf = NxTrackHelper.K(ClickApiEntity.TIME, mzj.d(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(mapOf, "mapOf");
        mapOf.put("elementid", itemData.getTitle());
        NxTrackHelper.U(mapOf);
        notificationManagerCompatFrom.notify(i, autoCancel.build());
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void sa(@NotNull NotificationItemData itemData) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        qb(itemData, null);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    @NotNull
    public Intent ua(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Intent(b78.a(), (Class<?>) NotifyDispatcherActivity.class);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public boolean x9() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_COMMUNITY_STATUS_NOTIFY, true);
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void y0(@NotNull String itemId, boolean enabled, @NotNull Function2<? super Boolean, ? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!pvc.c(b78.a()) && enabled) {
            pvc.f(b78.a());
            callback.invoke(Boolean.FALSE, 2);
        } else {
            if (CloudSyncNotifyType.INSTANCE.b(itemId) == null) {
                kb(itemId, enabled, callback);
                return;
            }
            NotifyStateManager notifyStateManager = this.notifyStateManager;
            if (notifyStateManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("notifyStateManager");
                notifyStateManager = null;
            }
            notifyStateManager.s(itemId, enabled, callback);
        }
    }

    @Override // com.heytap.health.operations.router.providers.INotifyService
    public void y7(boolean on) {
        jee.c().b(on);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.heytap.health.operations.router.providers.INotifyService
    public boolean z5(@NotNull String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        boolean zC = pvc.c(b78.a());
        switch (itemId.hashCode()) {
            case -723275321:
                if (itemId.equals("ecg_detail")) {
                    if (zC && db()) {
                        return true;
                    }
                }
                return false;
            case -600734055:
                if (itemId.equals("medal_record")) {
                    if (zC && L8()) {
                        return true;
                    }
                }
                return false;
            case -494202025:
                if (itemId.equals("cardiovascular_detail")) {
                    if (zC && l3()) {
                        return true;
                    }
                }
                return false;
            case 24914617:
                if (itemId.equals("sleep_record")) {
                    if (zC && hb()) {
                        return true;
                    }
                }
                return false;
            case 116111228:
                if (itemId.equals("sport_record")) {
                    if (zC && ib()) {
                        return true;
                    }
                }
                return false;
        }
        CloudSyncNotifyType cloudSyncNotifyTypeB = CloudSyncNotifyType.INSTANCE.b(itemId);
        if (cloudSyncNotifyTypeB != null && zC && q6(cloudSyncNotifyTypeB)) {
            return true;
        }
        return false;
    }
}
