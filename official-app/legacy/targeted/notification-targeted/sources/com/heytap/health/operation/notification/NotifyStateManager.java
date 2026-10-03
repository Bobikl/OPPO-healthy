package com.heytap.health.operation.notification;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.health.cardiovascular.CardiovascularService;
import com.heytap.health.operation.R$string;
import com.heytap.health.operations.router.providers.ICommunityService;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hq8;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.pvc;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J&\u0010\u0018\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J2\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fH\u0002J2\u0010\u001d\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fH\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\nH\u0002J\b\u0010 \u001a\u00020\nH\u0002J\b\u0010!\u001a\u00020\nH\u0002J\b\u0010\"\u001a\u00020\nH\u0002J\b\u0010#\u001a\u00020\nH\u0002J\b\u0010$\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\nH\u0002R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)¨\u0006."}, d2 = {"Lcom/heytap/health/operation/notification/NotifyStateManager;", "", "Lkotlin/Function1;", "", "Lcom/heytap/health/operation/notification/NotifyItem;", "", "callback", "q", "", "itemId", "", "checked", "Lkotlin/Function2;", "", "s", "f", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "Landroid/content/Context;", "context", "", b2n.g, "list", "isNotificationEnable", "a", "Lcom/heytap/health/operation/notification/CloudSyncNotifyType;", "type", "d", "o", LogFieldKey.PROCESS_NAME_KEY, "r", "n", "i", LogFieldKey.MESSAGE_KEY, "j", b2n.f, MapSchema.FIELD_NAME_ENTRY, "c", "b", "Landroid/content/Context;", "Lcom/heytap/health/operation/notification/a;", "Lcom/heytap/health/operation/notification/a;", "cloudSyncManager", "<init>", "(Landroid/content/Context;)V", "Companion", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotifyStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotifyStateManager.kt\ncom/heytap/health/operation/notification/NotifyStateManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,413:1\n13309#2,2:414\n*S KotlinDebug\n*F\n+ 1 NotifyStateManager.kt\ncom/heytap/health/operation/notification/NotifyStateManager\n*L\n219#1:414,2\n*E\n"})
public final class NotifyStateManager {

    @NotNull
    public static final String NOTIFY_ITEM_ID_ALIVE = "keep_alive";

    @NotNull
    public static final String NOTIFY_ITEM_ID_CARDIOVASCULAR = "cardiovascular_detail";

    @NotNull
    public static final String NOTIFY_ITEM_ID_ECG = "ecg_detail";

    @NotNull
    public static final String NOTIFY_ITEM_ID_MEDAL = "medal_record";

    @NotNull
    public static final String NOTIFY_ITEM_ID_SLEEP = "sleep_record";

    @NotNull
    public static final String NOTIFY_ITEM_ID_SPORT = "sport_record";

    @NotNull
    public static final String TAG = "NotifyStateManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a cloudSyncManager;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public NotifyStateManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        a aVar = new a(context, this);
        this.cloudSyncManager = aVar;
        aVar.c();
        r();
    }

    public final void a(List<NotifyItem> list, Context context, boolean isNotificationEnable) {
        for (CloudSyncNotifyType cloudSyncNotifyType : CloudSyncNotifyType.values()) {
            list.add(new NotifyItem("", "", false, true, "", "", 1));
            String id = cloudSyncNotifyType.getConfig().getId();
            String spKey = cloudSyncNotifyType.getConfig().getSpKey();
            boolean z = isNotificationEnable && d(cloudSyncNotifyType);
            String string = context.getString(cloudSyncNotifyType.getConfig().getContentResId());
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(type.config.contentResId)");
            String string2 = context.getString(cloudSyncNotifyType.getConfig().getTitleResId());
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(type.config.titleResId)");
            list.add(new NotifyItem(id, spKey, z, true, string, string2, 0));
        }
    }

    public final boolean b() {
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        List<UserDeviceInfo> list = boundDeviceInfos;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            a7b.b(TAG, "bind devices is null!");
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
            a7b.f(TAG, "supportCardiovascular = " + z);
            return z;
        }
        z = false;
        a7b.f(TAG, "supportCardiovascular = " + z);
        return z;
    }

    public final boolean c() {
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        List<UserDeviceInfo> list = boundDeviceInfos;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            a7b.b(TAG, "bind devices is null!");
            return false;
        }
        Iterator<UserDeviceInfo> it = boundDeviceInfos.iterator();
        while (it.hasNext()) {
            if (((Boolean) lc5.c(it.next().getMac()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.operation.notification.NotifyStateManager$checkEcgDevice$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.Za());
                }
            })).booleanValue()) {
                a7b.f(TAG, "isEcg = " + z);
                return z;
            }
        }
        z = false;
        a7b.f(TAG, "isEcg = " + z);
        return z;
    }

    public final boolean d(CloudSyncNotifyType type) {
        int i = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return f();
        }
        if (i == 2) {
            return k();
        }
        if (i == 3) {
            return l();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean e() {
        return b() && v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_ASSESSMENT_DETAIL_STATUS_NOTIFY, true);
    }

    public final boolean f() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_COMMUNITY_STATUS_NOTIFY, true);
    }

    public final boolean g() {
        return c() && v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_ECG_DETAIL_STATUS_NOTIFY, true);
    }

    public final List<NotifyItem> h(Context context) {
        boolean zC = pvc.c(context);
        ArrayList arrayList = new ArrayList();
        boolean z = zC && n();
        String string = context.getString(R$string.sports_notify_sport_content);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rts_notify_sport_content)");
        String string2 = context.getString(R$string.sports_notify_sport_title);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ports_notify_sport_title)");
        arrayList.add(new NotifyItem("sport_record", hq8.SP_SPORT_STATUS_NOTIFY, z, true, string, string2, 0));
        if (ilj.l() < 9) {
            arrayList.add(new NotifyItem("", "", false, true, "", "", 1));
            boolean z2 = zC && i();
            String string3 = context.getString(R$string.operation_sports_notify_alive_content);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…rts_notify_alive_content)");
            String string4 = context.getString(R$string.operation_sports_notify_alive_title);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…ports_notify_alive_title)");
            arrayList.add(new NotifyItem(NOTIFY_ITEM_ID_ALIVE, hq8.SP_STATUS_ALIVE, z2, true, string3, string4, 0));
        }
        arrayList.add(new NotifyItem("", "", false, true, "", "", 1));
        boolean z3 = zC && m();
        String string5 = context.getString(R$string.sports_notify_sleep_content);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…rts_notify_sleep_content)");
        String string6 = context.getString(R$string.sports_notify_sleep_title);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…ports_notify_sleep_title)");
        arrayList.add(new NotifyItem("sleep_record", hq8.SP_SLEEP_STATUS_NOTIFY, z3, true, string5, string6, 0));
        arrayList.add(new NotifyItem("", "", false, true, "", "", 1));
        boolean z4 = zC && j();
        String string7 = context.getString(R$string.sports_notify_medal_content);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.stri…rts_notify_medal_content)");
        String string8 = context.getString(R$string.sports_notify_medal_title);
        Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.stri…ports_notify_medal_title)");
        arrayList.add(new NotifyItem("medal_record", hq8.SP_MEDAL_RECORD_STATUS_NOTIFY, z4, true, string7, string8, 0));
        if (c()) {
            arrayList.add(new NotifyItem("", "", false, true, "", "", 1));
            boolean z5 = zC && g();
            String string9 = context.getString(R$string.sports_notify_ecg_content);
            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.stri…ports_notify_ecg_content)");
            String string10 = context.getString(R$string.sports_notify_ecg_title);
            Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.stri….sports_notify_ecg_title)");
            arrayList.add(new NotifyItem("ecg_detail", hq8.SP_ECG_DETAIL_STATUS_NOTIFY, z5, true, string9, string10, 0));
        }
        if (b()) {
            arrayList.add(new NotifyItem("", "", false, true, "", "", 1));
            boolean z6 = zC && e();
            String string11 = context.getString(R$string.operation_sports_notify_cardiovascular_content);
            Intrinsics.checkNotNullExpressionValue(string11, "context.getString(R.stri…y_cardiovascular_content)");
            String string12 = context.getString(R$string.operation_sports_notify_cardiovascular_title);
            Intrinsics.checkNotNullExpressionValue(string12, "context.getString(R.stri…ify_cardiovascular_title)");
            arrayList.add(new NotifyItem("cardiovascular_detail", hq8.SP_ASSESSMENT_DETAIL_STATUS_NOTIFY, z6, true, string11, string12, 0));
        }
        a(arrayList, context, zC);
        return arrayList;
    }

    public final boolean i() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_STATUS_ALIVE, true);
    }

    public final boolean j() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_MEDAL_RECORD_STATUS_NOTIFY, true);
    }

    public final boolean k() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_OPERATION_ACTIVITY_STATUS_NOTIFY, true);
    }

    public final boolean l() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_QUESTIONNAIRE_STATUS_NOTIFY, true);
    }

    public final boolean m() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_SLEEP_STATUS_NOTIFY, true);
    }

    public final boolean n() {
        return v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).r(hq8.SP_SPORT_STATUS_NOTIFY, true);
    }

    public final void o(final CloudSyncNotifyType type, boolean checked, final Function2<? super Boolean, ? super Integer, Unit> callback) throws JSONException {
        if (rpc.c()) {
            this.cloudSyncManager.f(type, checked, new Function0<Unit>() { // from class: com.heytap.health.operation.notification.NotifyStateManager$handleCloudSyncNotifyClick$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    a7b.f(NotifyStateManager.TAG, "Sync " + type.getConfig().getCloudKey() + " success");
                    if (type == CloudSyncNotifyType.COMMUNITY) {
                        Object objNavigation = x0.d().b("/community/CommunityService").navigation();
                        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.operations.router.providers.ICommunityService");
                        ICommunityService.a.a((ICommunityService) objNavigation, false, 1, null);
                    }
                    callback.invoke(Boolean.TRUE, 0);
                }
            }, new Function1<String, Unit>() { // from class: com.heytap.health.operation.notification.NotifyStateManager$handleCloudSyncNotifyClick$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    a7b.b(NotifyStateManager.TAG, "Sync " + type.getConfig().getCloudKey() + " failed: " + error);
                    callback.invoke(Boolean.FALSE, 3);
                }
            });
        } else {
            a7b.b(TAG, "Network not available");
            callback.invoke(Boolean.FALSE, 3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void p(String itemId, boolean checked, Function2<? super Boolean, ? super Integer, Unit> callback) {
        String str;
        switch (itemId.hashCode()) {
            case -723275321:
                if (itemId.equals("ecg_detail")) {
                    str = hq8.SP_ECG_DETAIL_STATUS_NOTIFY;
                    v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(str, checked);
                    callback.invoke(Boolean.TRUE, 0);
                    return;
                }
                break;
            case -600734055:
                if (itemId.equals("medal_record")) {
                    str = hq8.SP_MEDAL_RECORD_STATUS_NOTIFY;
                    v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(str, checked);
                    callback.invoke(Boolean.TRUE, 0);
                    return;
                }
                break;
            case -494202025:
                if (itemId.equals("cardiovascular_detail")) {
                    str = hq8.SP_ASSESSMENT_DETAIL_STATUS_NOTIFY;
                    v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(str, checked);
                    callback.invoke(Boolean.TRUE, 0);
                    return;
                }
                break;
            case 24914617:
                if (itemId.equals("sleep_record")) {
                    str = hq8.SP_SLEEP_STATUS_NOTIFY;
                    v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(str, checked);
                    callback.invoke(Boolean.TRUE, 0);
                    return;
                }
                break;
            case 116111228:
                if (itemId.equals("sport_record")) {
                    str = hq8.SP_SPORT_STATUS_NOTIFY;
                    v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(str, checked);
                    callback.invoke(Boolean.TRUE, 0);
                    return;
                }
                break;
            case 1642639251:
                if (itemId.equals(NOTIFY_ITEM_ID_ALIVE)) {
                    str = hq8.SP_STATUS_ALIVE;
                    v9g.x(hq8.SP_KEY_FORCE_STABLE_NOTIFY).W(str, checked);
                    callback.invoke(Boolean.TRUE, 0);
                    return;
                }
                break;
        }
        callback.invoke(Boolean.FALSE, 4);
    }

    public final void q(@NotNull Function1<? super List<NotifyItem>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(h(this.context));
    }

    public final void r() {
        this.cloudSyncManager.b(new Function1<Map<CloudSyncNotifyType, ? extends Boolean>, Unit>() { // from class: com.heytap.health.operation.notification.NotifyStateManager$queryStateToCloud$1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<CloudSyncNotifyType, ? extends Boolean> map) {
                invoke2((Map<CloudSyncNotifyType, Boolean>) map);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Map<CloudSyncNotifyType, Boolean> statesMap) {
                Intrinsics.checkNotNullParameter(statesMap, "statesMap");
                a7b.f(NotifyStateManager.TAG, "Query cloud states success: " + statesMap);
            }
        }, new Function1<String, Unit>() { // from class: com.heytap.health.operation.notification.NotifyStateManager$queryStateToCloud$2
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String error) {
                Intrinsics.checkNotNullParameter(error, "error");
                a7b.m(NotifyStateManager.TAG, "Query cloud states failed: " + error);
            }
        });
    }

    public final void s(@NotNull String itemId, boolean checked, @NotNull Function2<? super Boolean, ? super Integer, Unit> callback) throws JSONException {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!pvc.c(this.context) && checked) {
            pvc.f(this.context);
            return;
        }
        CloudSyncNotifyType cloudSyncNotifyTypeB = CloudSyncNotifyType.INSTANCE.b(itemId);
        if (cloudSyncNotifyTypeB != null) {
            o(cloudSyncNotifyTypeB, checked, callback);
        } else {
            p(itemId, checked, callback);
        }
    }
}
