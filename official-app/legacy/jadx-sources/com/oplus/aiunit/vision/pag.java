package com.oplus.aiunit.vision;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.heytap.wearable.watch.emergency.safeguard.GuardPushObject;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010(\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010#R\u0014\u0010+\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010#R\u0014\u0010-\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010#R\u0014\u0010.\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010#R\u0014\u0010/\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010#R\u0014\u00100\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010#R\u0014\u00101\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010#R\u0014\u00102\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010#R\u0014\u00103\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010#R\u0014\u00104\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010#R\u0014\u00105\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010#R\u0014\u00106\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010#R\u0014\u00107\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u000fR\u0014\u00108\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u000fR\u0014\u00109\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010#R\u0014\u0010:\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010#R\u0014\u0010;\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010#R\u0014\u0010<\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010#R\u0014\u0010=\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010#R\u0014\u0010>\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010#R\u0014\u0010?\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010#R\u0014\u0010@\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010#¨\u0006C"}, d2 = {"Lcom/oplus/aiunit/vision/pag;", "", "Lcom/heytap/wearable/watch/emergency/safeguard/GuardPushObject;", "push", "Lorg/json/JSONObject;", "d", "", "c", "", "value", "", "a", "pushUserState", "b", "TAG_ROOT", "Ljava/lang/String;", "KEY_SP", "KEY_GLOBAL_ENABLE", "KEY_HAS_OP_EMERGENCY_SWITCH", "KEY_HAS_OP_CALL_110_SWITCH", "KEY_HAS_OP_AUTO", "KEY_STUB", "KEY_POSITION", "KEY_PERSON", "KEY_RISK", "KEY_ESIM", "KEY_ESIM_SUPPORT", "KEY_PROTECT", "KEY_PERSON_MODE", "KEY_ENCRYPT_PHONE", "KEY_ENCRYPT_USER_ID", "KEY_SAFE_GUARD_URL", "H5_TRAVEL_PAGE", "FILE_URI", "RESULT_CODE_SUCCESS", "I", "RESULT_CODE_NET_FAIL", "RISK_LEVEL_NONE", "RISK_LEVEL_HIGH", "RISK_LEVEL_MIDDLE", "RISK_LEVEL_LOW", "RESULT_CODE_OTHER_FAIL", "UNBIND_TYPE_RECALL", "UNBIND_TYPE_ACTIVE", "UNBIND_TYPE_PASSIVE", "CLICK_INDEX_1", "CLICK_INDEX_2", "PERSON_MODE_GUARD_ME", "PERSON_MODE_MY_PROTECT", "STATUS_CANCELED", "STATUS_CONFIRMED", "PUSH_GUARD_RETAIN_UPDATE", "PUSH_GUARD_TRAVEL_START", "PUSH_GUARD_TRAVEL_UPDATE", "PUSH_GUARD_TRAVEL_END", "BR_ACTION_GUARD_RETAIN_UPDATE", "BR_GUARD_RETAIN_UPDATE_DATA_KEY", "PUSH_NOTIFY_LEVEL_ALWAYS", "PUSH_NOTIFY_LEVEL_5S", "TRAVEL_END_UNKNOWN", "TRAVEL_END_SAFE", "RELATION_SUCCESS", "RELATION_NET_ERROR", "RELATION_FAIL", "TRAVEL_FAIL", "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class pag {

    @NotNull
    public static final String BR_ACTION_GUARD_RETAIN_UPDATE = "com.heytap.health.BR_GUARD_RETAIN_UPDATE";

    @NotNull
    public static final String BR_GUARD_RETAIN_UPDATE_DATA_KEY = "relation_data";
    public static final int CLICK_INDEX_1 = 1;
    public static final int CLICK_INDEX_2 = 2;

    @NotNull
    public static final String FILE_URI = "safety_guardian_avatar";

    @NotNull
    public static final String H5_TRAVEL_PAGE = "healthap://app/path=113?extra_launch_type=7&theme=0&visit_from=18&jumpUrl=security-protection-map/index.html?travelId=%1$s&guardId=%2$s";

    @NotNull
    public static final pag INSTANCE = new pag();

    @NotNull
    public static final String KEY_ENCRYPT_PHONE = "encryptPhone";

    @NotNull
    public static final String KEY_ENCRYPT_USER_ID = "encryptUserId";

    @NotNull
    public static final String KEY_ESIM = "safe_guard_esim";

    @NotNull
    public static final String KEY_ESIM_SUPPORT = "safe_guard_esim_support";

    @NotNull
    public static final String KEY_GLOBAL_ENABLE = "safe_guard_global_enable";

    @NotNull
    public static final String KEY_HAS_OP_AUTO = "key_has_op_auto";

    @NotNull
    public static final String KEY_HAS_OP_CALL_110_SWITCH = "key_has_op_call_110_switch";

    @NotNull
    public static final String KEY_HAS_OP_EMERGENCY_SWITCH = "key_has_op_emergency_switch";

    @NotNull
    public static final String KEY_PERSON = "safe_guard_person";

    @NotNull
    public static final String KEY_PERSON_MODE = "person_mode_key";

    @NotNull
    public static final String KEY_POSITION = "tag_position";

    @NotNull
    public static final String KEY_PROTECT = "safe_guard_protect";

    @NotNull
    public static final String KEY_RISK = "safe_guard_risk";

    @NotNull
    public static final String KEY_SAFE_GUARD_URL = "key_safe_guard_url";

    @NotNull
    public static final String KEY_SP = "safe_guard_sp";

    @NotNull
    public static final String KEY_STUB = "safe_guard_stub";
    public static final int PERSON_MODE_GUARD_ME = -1;
    public static final int PERSON_MODE_MY_PROTECT = 1;
    public static final int PUSH_GUARD_RETAIN_UPDATE = 30;
    public static final int PUSH_GUARD_TRAVEL_END = 33;
    public static final int PUSH_GUARD_TRAVEL_START = 31;
    public static final int PUSH_GUARD_TRAVEL_UPDATE = 32;
    public static final int PUSH_NOTIFY_LEVEL_5S = 2;
    public static final int PUSH_NOTIFY_LEVEL_ALWAYS = 1;
    public static final int RELATION_FAIL = 3;
    public static final int RELATION_NET_ERROR = 2;
    public static final int RELATION_SUCCESS = 1;
    public static final int RESULT_CODE_NET_FAIL = 2;
    public static final int RESULT_CODE_OTHER_FAIL = 3;
    public static final int RESULT_CODE_SUCCESS = 1;
    public static final int RISK_LEVEL_HIGH = 2;
    public static final int RISK_LEVEL_LOW = 4;
    public static final int RISK_LEVEL_MIDDLE = 3;
    public static final int RISK_LEVEL_NONE = 1;
    public static final int STATUS_CANCELED = -1;
    public static final int STATUS_CONFIRMED = 1;

    @NotNull
    public static final String TAG_ROOT = "HSG_";
    public static final int TRAVEL_END_SAFE = 2;
    public static final int TRAVEL_END_UNKNOWN = 1;
    public static final int TRAVEL_FAIL = 3;
    public static final int UNBIND_TYPE_ACTIVE = 1;
    public static final int UNBIND_TYPE_PASSIVE = 2;
    public static final int UNBIND_TYPE_RECALL = 0;

    public final String a(int value) {
        if (value == 1) {
            return "行程异常结束";
        }
        if (value == 2) {
            return "安全到达";
        }
        if (value == 4) {
            return "紧急情况";
        }
        if (value == 8) {
            return "长时间停留";
        }
        if (value == 16) {
            return "心率波动大";
        }
        if (value == 32) {
            return "乘车";
        }
        if (value == 64) {
            return "骑行";
        }
        if (value == 128) {
            return "跑步";
        }
        if (value != 256) {
            return value != 512 ? "守护中" : "正在活动";
        }
        return "行走";
    }

    public final String b(int pushUserState) {
        if (pushUserState == 4) {
            return "assets/images/security.png";
        }
        if (pushUserState == 16) {
            return "assets/images/heart.png";
        }
        if (pushUserState == 32) {
            return "assets/images/taxi.png";
        }
        if (pushUserState == 64) {
            return "assets/images/bike.png";
        }
        if (pushUserState == 128) {
            return "assets/images/run.png";
        }
        if (pushUserState != 256) {
            if (pushUserState == 8) {
                return "assets/images/clock.png";
            }
            if (pushUserState != 9) {
                return "assets/images/healthicon_24.png";
            }
        }
        return "assets/images/walk.png";
    }

    public final boolean c() {
        PackageInfo packageInfo = null;
        try {
            PackageManager packageManager = b78.a().getPackageManager();
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.tencent.mm", 0);
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            bg5.INSTANCE.m(applicationInfo != null ? applicationInfo.loadLabel(packageManager) : null);
            packageInfo = packageInfo2;
        } catch (Exception unused) {
        }
        return packageInfo == null;
    }

    @NotNull
    public final JSONObject d(@NotNull GuardPushObject push) throws JSONException {
        Intrinsics.checkNotNullParameter(push, "push");
        String strA = a(push.getPushUserState());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(H5_TRAVEL_PAGE, Arrays.copyOf(new Object[]{push.getTravelId(), Long.valueOf(push.getGuardId())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expanded_title", push.getTitle());
        jSONObject.put("expanded_text", push.getContent());
        jSONObject.put("expanded_button_text", "查看位置");
        jSONObject.put("health_proteion_map_scheme_uri", str);
        if (push.getCalledPolice() == 1) {
            jSONObject.put("capsule_title", "紧急情况");
            jSONObject.put("expanded_tips_show", true);
            jSONObject.put("expanded_tips", push.getExtendContent());
            jSONObject.put("icon_src", "assets/images/healthicon_24.png");
            jSONObject.put("icon_expanded_tips_image_src", INSTANCE.b(push.getPushUserState()));
        } else {
            jSONObject.put("capsule_title", strA);
            jSONObject.put("icon_src", INSTANCE.b(push.getPushUserState()));
            jSONObject.put("expanded_tips_show", false);
        }
        return jSONObject;
    }
}
