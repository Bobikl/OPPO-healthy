package com.heytap.health.operations.router.providers;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.operations.bean.NotificationItemData;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gt9;
import com.oplus.smartenginehelper.entity.ViewEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 &2\u00020\u0001:\u0001'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J2\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H&J\b\u0010$\u001a\u00020\u0004H&J\b\u0010%\u001a\u00020\u0004H&¨\u0006("}, d2 = {"Lcom/heytap/health/operations/router/providers/INotifyService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "itemId", "", "z5", ViewEntity.ENABLED, "Lkotlin/Function2;", "", "", "callback", "y0", "Lcom/heytap/health/operations/bean/NotificationItemData;", "itemData", "sa", "Landroid/graphics/Bitmap;", "bitmap", c8l.KEY_C2, "C4", "isTrue", "K3", "on", "y7", "Pa", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "metadataStat", "q5", "Landroid/content/Context;", "context", "Landroid/content/Intent;", HttpConst.UA, "mContext", "Landroidx/core/app/NotificationCompat$Builder;", "builder", "Lcom/oplus/aiunit/vision/gt9;", "k0", "L8", "x9", "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface INotifyService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int NOTIFY_ERROR_TYPE_NETWORK = 3;
    public static final int NOTIFY_ERROR_TYPE_NOT_SUPPORT_TYPE = 4;
    public static final int NOTIFY_ERROR_TYPE_SUCCESS = 0;
    public static final int NOTIFY_ERROR_TYPE_SYSTEM = 2;
    public static final int NOTIFY_ERROR_TYPE_UNKNOWN = 1;

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

    /* JADX INFO: renamed from: com.heytap.health.operations.router.providers.INotifyService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/operations/router/providers/INotifyService$a;", "", "", "NOTIFY_ITEM_ID_SPORT", "Ljava/lang/String;", "NOTIFY_ITEM_ID_SLEEP", "NOTIFY_ITEM_ID_MEDAL", "NOTIFY_ITEM_ID_ECG", "NOTIFY_ITEM_ID_CARDIOVASCULAR", "", "NOTIFY_ERROR_TYPE_SUCCESS", "I", "NOTIFY_ERROR_TYPE_UNKNOWN", "NOTIFY_ERROR_TYPE_SYSTEM", "NOTIFY_ERROR_TYPE_NETWORK", "NOTIFY_ERROR_TYPE_NOT_SUPPORT_TYPE", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int NOTIFY_ERROR_TYPE_NETWORK = 3;
        public static final int NOTIFY_ERROR_TYPE_NOT_SUPPORT_TYPE = 4;
        public static final int NOTIFY_ERROR_TYPE_SUCCESS = 0;
        public static final int NOTIFY_ERROR_TYPE_SYSTEM = 2;
        public static final int NOTIFY_ERROR_TYPE_UNKNOWN = 1;

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
        public static final /* synthetic */ Companion a = new Companion();
    }

    void C2(@NotNull NotificationItemData itemData, @NotNull Bitmap bitmap);

    boolean C4();

    void K3(boolean isTrue);

    boolean L8();

    void Pa();

    @NotNull
    gt9 k0(@NotNull Context mContext, @NotNull NotificationCompat.Builder builder);

    void q5(@NotNull TrackMetadataStat metadataStat);

    void sa(@NotNull NotificationItemData itemData);

    @NotNull
    Intent ua(@NotNull Context context);

    boolean x9();

    void y0(@NotNull String itemId, boolean enabled, @NotNull Function2<? super Boolean, ? super Integer, Unit> callback);

    void y7(boolean on);

    boolean z5(@NotNull String itemId);
}
