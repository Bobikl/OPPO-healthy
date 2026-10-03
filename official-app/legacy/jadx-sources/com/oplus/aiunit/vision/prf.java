package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.devicemanager.processor.bean.FaceRes;
import com.heytap.health.devicemanager.processor.bean.Res;
import com.heytap.health.devicemanager.processor.bean.ResBean;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0004\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0014\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0016\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0018\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u0019\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u001b\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u001c\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u001e\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\u001f\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010 \u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010!\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\f\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\u001a\u0014\u0010%\u001a\u0004\u0018\u00010\u0004*\u00020\u00072\u0006\u0010$\u001a\u00020#\"\u0014\u0010'\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010)\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010(\"\u0014\u0010*\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010(\"\u0014\u0010+\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u0010/\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010,\"\u0014\u00100\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00101\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010,\"\u0014\u00102\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010,\"\u0014\u00103\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010,\"\u0014\u00104\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010,\"\u0014\u00105\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010,\"\u0014\u00106\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010,\"\u0014\u00107\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010,\"\u0014\u00108\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010,\"\u0014\u00109\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010,\"\u0014\u0010:\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010,\"\u0014\u0010;\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010,\"\u0014\u0010<\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010,\"\u0014\u0010=\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010,\"\u0014\u0010>\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010,\"\u0014\u0010?\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010,\"\u0014\u0010@\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010,\"\u0014\u0010A\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010,\"\u0014\u0010B\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010,\"\u0014\u0010C\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010,\"\u0014\u0010D\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010,\"\u0014\u0010E\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010,\"\u0014\u0010F\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010,\"\u0014\u0010G\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010,\"\u0014\u0010H\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010,\"\u0014\u0010I\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010,¨\u0006J"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/FaceRes;", "", ExifInterface.LONGITUDE_EAST, "C", "Lcom/heytap/health/devicemanager/processor/bean/Res;", UserInfo.SEX_FEMALE, "D", "Lcom/heytap/health/devicemanager/processor/bean/ResBean;", "z", "y", "x", "A", "w", "b", "a", "i", "c", MapSchema.FIELD_NAME_ENTRY, MapSchema.FIELD_NAME_KEY, "j", b2n.f, LogFieldKey.LEVEL_KEY, "d", b2n.g, "v", "f", LogFieldKey.MESSAGE_KEY, "t", "u", "n", "o", LogFieldKey.PROCESS_NAME_KEY, "q", "r", "s", "", "type", c8l.KEY_B, "", "RESTYPE_VIDEO", "I", "RESTYPE_PNG", "RESTYPE_LOTTIE", "TYPE_PAIR_START", "Ljava/lang/String;", "TYPE_PAIR_PIN", "TYPE_PAIR_SUCCESS", "TYPE_PAIR_FAIL", "TYPE_PAIR_ING", "TYPE_MIGRATE_GUIDE", "TYPE_MIGRATE_FAIL", "TYPE_OOBE_BLUETOOTH", "TYPE_OOBE_ECG", "TYPE_OOBE_SHARE", "TYPE_OOBE_PAIRSUCCESS", "TYPE_OOBE_HAND", "TYPE_OOBE_LOGIN", "TYPE_OOBE_USER_SELECT", "TYPE_OOBE_PHONE", "TYPE_OOBE_LOCATION", "TYPE_OOBE_CALENDAR", "TYPE_OOBE_SMS", "TYPE_OOBE_SYNC", "TYPE_OOBE_SYNC_DONE", "TYPE_OOBE_SYNC_DONE_SECOND", "TYPE_OOBE_SYNC_BANNER1", "TYPE_OOBE_SYNC_BANNER2", "TYPE_OOBE_SYNC_BANNER3", "TYPE_OOBE_SYNC_BANNER4", "TYPE_OOBE_SYNC_BANNER5", "TYPE_OOBE_SYNC_BANNER6", "TYPE_OOBE_BRENNO", "TYPE_OOBE_EMOTION", "TYPE_OOBE_60SECONDS", "device_manager_release"}, k = 2, mv = {1, 8, 0})
public final class prf {
    public static final int RESTYPE_LOTTIE = 3;
    public static final int RESTYPE_PNG = 2;
    public static final int RESTYPE_VIDEO = 1;

    @NotNull
    public static final String TYPE_MIGRATE_FAIL = "oobe_migrate_fail";

    @NotNull
    public static final String TYPE_MIGRATE_GUIDE = "oobe_migrate_guide";

    @NotNull
    public static final String TYPE_OOBE_60SECONDS = "oobe_60seconds";

    @NotNull
    public static final String TYPE_OOBE_BLUETOOTH = "oobe_bluetooth";

    @NotNull
    public static final String TYPE_OOBE_BRENNO = "oobe_breeno";

    @NotNull
    public static final String TYPE_OOBE_CALENDAR = "oobe_calendar";

    @NotNull
    public static final String TYPE_OOBE_ECG = "oobe_ecg";

    @NotNull
    public static final String TYPE_OOBE_EMOTION = "oobe_emotion";

    @NotNull
    public static final String TYPE_OOBE_HAND = "oobe_hand";

    @NotNull
    public static final String TYPE_OOBE_LOCATION = "oobe_location";

    @NotNull
    public static final String TYPE_OOBE_LOGIN = "oobe_login";

    @NotNull
    public static final String TYPE_OOBE_PAIRSUCCESS = "oobe_pairsuccess";

    @NotNull
    public static final String TYPE_OOBE_PHONE = "oobe_phone";

    @NotNull
    public static final String TYPE_OOBE_SHARE = "oobe_share";

    @NotNull
    public static final String TYPE_OOBE_SMS = "oobe_sms";

    @NotNull
    public static final String TYPE_OOBE_SYNC = "oobe_sync";

    @NotNull
    public static final String TYPE_OOBE_SYNC_BANNER1 = "oobe_sync_banner1";

    @NotNull
    public static final String TYPE_OOBE_SYNC_BANNER2 = "oobe_sync_banner2";

    @NotNull
    public static final String TYPE_OOBE_SYNC_BANNER3 = "oobe_sync_banner3";

    @NotNull
    public static final String TYPE_OOBE_SYNC_BANNER4 = "oobe_sync_banner4";

    @NotNull
    public static final String TYPE_OOBE_SYNC_BANNER5 = "oobe_sync_banner5";

    @NotNull
    public static final String TYPE_OOBE_SYNC_BANNER6 = "oobe_sync_banner6";

    @NotNull
    public static final String TYPE_OOBE_SYNC_DONE = "oobe_sync_done";

    @NotNull
    public static final String TYPE_OOBE_SYNC_DONE_SECOND = "oobe_sync_done_second";

    @NotNull
    public static final String TYPE_OOBE_USER_SELECT = "oobe_user_select";

    @NotNull
    public static final String TYPE_PAIR_FAIL = "pair_fail";

    @NotNull
    public static final String TYPE_PAIR_ING = "pair_ing";

    @NotNull
    public static final String TYPE_PAIR_PIN = "pair_pin";

    @NotNull
    public static final String TYPE_PAIR_START = "pair_start";

    @NotNull
    public static final String TYPE_PAIR_SUCCESS = "pair_success";

    @Nullable
    public static final Res A(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_PAIR_SUCCESS);
    }

    @Nullable
    public static final Res B(@NotNull ResBean resBean, @NotNull String type) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        for (Res res : resBean.getRes()) {
            if (Intrinsics.areEqual(res.getType(), type)) {
                return res;
            }
        }
        return null;
    }

    public static final boolean C(@NotNull FaceRes faceRes) {
        Intrinsics.checkNotNullParameter(faceRes, "<this>");
        return faceRes.getResType() == 2;
    }

    public static final boolean D(@NotNull Res res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return res.getResType() == 2;
    }

    public static final boolean E(@NotNull FaceRes faceRes) {
        Intrinsics.checkNotNullParameter(faceRes, "<this>");
        return faceRes.getResType() == 1;
    }

    public static final boolean F(@NotNull Res res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return res.getResType() == 1;
    }

    @Nullable
    public static final Res a(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_MIGRATE_FAIL);
    }

    @Nullable
    public static final Res b(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_MIGRATE_GUIDE);
    }

    @Nullable
    public static final Res c(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_BLUETOOTH);
    }

    @Nullable
    public static final Res d(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_CALENDAR);
    }

    @Nullable
    public static final Res e(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_ECG);
    }

    @Nullable
    public static final Res f(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_HAND);
    }

    @Nullable
    public static final Res g(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_LOCATION);
    }

    @Nullable
    public static final Res h(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_LOGIN);
    }

    @Nullable
    public static final Res i(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_PAIRSUCCESS);
    }

    @Nullable
    public static final Res j(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_PHONE);
    }

    @Nullable
    public static final Res k(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SHARE);
    }

    @Nullable
    public static final Res l(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SMS);
    }

    @Nullable
    public static final Res m(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC);
    }

    @Nullable
    public static final Res n(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_BANNER1);
    }

    @Nullable
    public static final Res o(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_BANNER2);
    }

    @Nullable
    public static final Res p(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_BANNER3);
    }

    @Nullable
    public static final Res q(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_BANNER4);
    }

    @Nullable
    public static final Res r(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_BANNER5);
    }

    @Nullable
    public static final Res s(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_BANNER6);
    }

    @Nullable
    public static final Res t(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_DONE);
    }

    @Nullable
    public static final Res u(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_SYNC_DONE_SECOND);
    }

    @Nullable
    public static final Res v(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_OOBE_USER_SELECT);
    }

    @Nullable
    public static final Res w(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_PAIR_FAIL);
    }

    @Nullable
    public static final Res x(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_PAIR_ING);
    }

    @Nullable
    public static final Res y(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_PAIR_PIN);
    }

    @Nullable
    public static final Res z(@NotNull ResBean resBean) {
        Intrinsics.checkNotNullParameter(resBean, "<this>");
        return B(resBean, TYPE_PAIR_START);
    }
}
