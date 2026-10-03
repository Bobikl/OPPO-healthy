package com.oplus.pantanal.seedling.constants;

import android.net.Uri;
import androidx.annotation.Keep;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.pantanal.seedling.intent.IntentManager;
import com.platform.usercenter.account.ams.ipc.AcResultHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\bÆ\u0002\u0018\u00002\u00020\u0001:\u00019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\n 2*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\nR\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u00107\u001a\n 2*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\n¨\u0006:"}, d2 = {"Lcom/oplus/pantanal/seedling/constants/Constants;", "", "()V", "ASSISTANT_PERMISSION", "", "ASSISTANT_SCREEN_CARD_SERVICE_AUTHORITY", "INTENT_PROVIDER_AUTHORITY", "INTENT_PROVIDER_URI", "Landroid/net/Uri;", "getINTENT_PROVIDER_URI", "()Landroid/net/Uri;", "IS_SUPPORT_MULTI_INSTANCE", "KEY_CODE", "KEY_FLUID_CLOUD_RESULT", "KEY_FLUID_CLOUD_SUPPORT", "KEY_IS_SERVICE_SUPPORT_MULTI_INSTANCE", "KEY_IS_SUPPORT_MULTI_INSTANCE", "KEY_IS_SUPPORT_SERVICE_IDS", "KEY_MESSAGE", "KEY_QUERYTYPE", "KEY_QUERY_FLUID_CLOUD_METHOD", AcResultHelper.KEY_RESULT, "KEY_SEEDLING_CARD_SUPPORT", "KEY_SEEDLING_INTENT_SUPPORT", "KEY_SERVICE_ID", "KEY_SERVICE_IDS", "KEY_SERVICE_INSTANCE_ID", "KEY_SERVICE_SWITCH", "META_DATA_ABNORMAL_MODE_SUPPORT", "META_DATA_CARD_SERVICE_SUPPORT", "META_DATA_IS_SEEDLING_CARD_SUPPORT", "META_DATA_IS_SEEDLING_INTENT_SUPPORT", "METHOD_FLUID_CLOUD_SUPPORT", "METHOD_SEEDLING_SUPPORT", "METHOD_SYSTEM_INTENT_SUPPORT", "NODE_NAME", "PACKAGE_NAME_ASSISTANT_SCREEN", "PKG_NAME_ASSISTANT_SCREEN", "PKG_NAME_FULL_SEARCH", "PKG_NAME_LAUNCHER", "PKG_NAME_SEEDLING_HOST_APP", "PKG_NAME_SYSTEM_UI", "PROVIDER_AUTHORITY_ASSISTANT_SCREEN", "PROVIDER_AUTHORITY_FULL_SEARCH", "PROVIDER_AUTHORITY_LAUNCHER", "PROVIDER_AUTHORITY_SECONDARY_HOME", "PROVIDER_AUTHORITY_SEEDLING_HOST_APP", "PROVIDER_AUTHORITY_SYSTEM_UI", "SUPPORT_SUPER_CHANNEL", "SWITCH_QUERY_URI", "kotlin.jvm.PlatformType", "getSWITCH_QUERY_URI", "TAG", "UMS_CARD_SERVICE_AUTHORITY", "UMS_PACKAGE_NAME", "UMS_QUERY_ADVICE_URI", "getUMS_QUERY_ADVICE_URI", "FluidCloudSize", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Constants {

    @NotNull
    public static final String ASSISTANT_PERMISSION = "com.oplus.permission.safe.ASSISTANT";

    @NotNull
    public static final String ASSISTANT_SCREEN_CARD_SERVICE_AUTHORITY = "com.oplus.cardservice.repository.provider.CardServiceServerProvider";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String INTENT_PROVIDER_AUTHORITY = "com.oplus.pantanal.ums.IntentProvider";

    @NotNull
    private static final Uri INTENT_PROVIDER_URI;

    @NotNull
    public static final String IS_SUPPORT_MULTI_INSTANCE = "isSupportMultiInstance";

    @NotNull
    public static final String KEY_CODE = "code";

    @NotNull
    public static final String KEY_FLUID_CLOUD_RESULT = "fluidCloudResult";

    @NotNull
    public static final String KEY_FLUID_CLOUD_SUPPORT = "is_fluid_cloud_support";

    @NotNull
    public static final String KEY_IS_SERVICE_SUPPORT_MULTI_INSTANCE = "isServiceSupportMultiInstance";

    @NotNull
    public static final String KEY_IS_SUPPORT_MULTI_INSTANCE = "isUmsSupportMultiInstance";

    @NotNull
    public static final String KEY_IS_SUPPORT_SERVICE_IDS = "key_service_ids";

    @NotNull
    public static final String KEY_MESSAGE = "message";

    @NotNull
    public static final String KEY_QUERYTYPE = "queryType";

    @NotNull
    public static final String KEY_QUERY_FLUID_CLOUD_METHOD = "queryFluidCloud";

    @NotNull
    public static final String KEY_RESULT = "result";

    @NotNull
    public static final String KEY_SEEDLING_CARD_SUPPORT = "is_seedling_support";

    @NotNull
    public static final String KEY_SEEDLING_INTENT_SUPPORT = "is_system_send_intent_support";

    @NotNull
    public static final String KEY_SERVICE_ID = "serviceId";

    @NotNull
    public static final String KEY_SERVICE_IDS = "serviceIds";

    @NotNull
    public static final String KEY_SERVICE_INSTANCE_ID = "service_instance_id";

    @NotNull
    public static final String KEY_SERVICE_SWITCH = "serviceSwitch";

    @NotNull
    public static final String META_DATA_ABNORMAL_MODE_SUPPORT = "abnormalModeSupport";

    @NotNull
    public static final String META_DATA_CARD_SERVICE_SUPPORT = "isCardServiceSupport";

    @NotNull
    public static final String META_DATA_IS_SEEDLING_CARD_SUPPORT = "isSeedlingCardSupport";

    @NotNull
    public static final String META_DATA_IS_SEEDLING_INTENT_SUPPORT = "isSeedlingIntentSupport";

    @NotNull
    public static final String METHOD_FLUID_CLOUD_SUPPORT = "isFluidCloudSupport";

    @NotNull
    public static final String METHOD_SEEDLING_SUPPORT = "isSeedlingSupport";

    @NotNull
    public static final String METHOD_SYSTEM_INTENT_SUPPORT = "isSystemSendIntentSupport";

    @NotNull
    public static final String NODE_NAME = "SEEDLING_SUPPORT_SDK";

    @NotNull
    public static final String PACKAGE_NAME_ASSISTANT_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String PKG_NAME_ASSISTANT_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String PKG_NAME_FULL_SEARCH = "com.heytap.quicksearchbox";

    @NotNull
    public static final String PKG_NAME_LAUNCHER = "com.android.systemui";

    @NotNull
    public static final String PKG_NAME_SEEDLING_HOST_APP = "com.oplus.seedling.hostapp";

    @NotNull
    public static final String PKG_NAME_SYSTEM_UI = "com.android.systemui";

    @NotNull
    public static final String PROVIDER_AUTHORITY_ASSISTANT_SCREEN = "com.oplus.card.server.provider";

    @NotNull
    public static final String PROVIDER_AUTHORITY_FULL_SEARCH = "com.oplus.card.server.full.search.provider";

    @NotNull
    public static final String PROVIDER_AUTHORITY_LAUNCHER = "com.oplus.card.server.launcher.provider";

    @NotNull
    public static final String PROVIDER_AUTHORITY_SECONDARY_HOME = "com.oplus.card.server.secondaryhome.provider";

    @NotNull
    public static final String PROVIDER_AUTHORITY_SEEDLING_HOST_APP = "com.oplus.card.server.seedlinghost.provider";

    @NotNull
    public static final String PROVIDER_AUTHORITY_SYSTEM_UI = "com.oplus.card.server.systemui.provider";

    @NotNull
    public static final String SUPPORT_SUPER_CHANNEL = "supportSuperChannel";
    private static final Uri SWITCH_QUERY_URI;

    @NotNull
    public static final String TAG = "SEEDLING_SUPPORT_SDK(3000007)";

    @NotNull
    public static final String UMS_CARD_SERVICE_AUTHORITY = "com.oplus.pantanal.ums.cardservice.provider.CardServiceServerProvider";

    @NotNull
    public static final String UMS_PACKAGE_NAME = "com.oplus.pantanal.ums";
    private static final Uri UMS_QUERY_ADVICE_URI;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/constants/Constants$FluidCloudSize;", "", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface FluidCloudSize {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int NOTIFICATION_LG = 9;
        public static final int NOTIFICATION_MD = 8;
        public static final int NOTIFICATION_SM = 7;
        public static final int UNKNOWN = -1;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/pantanal/seedling/constants/Constants$FluidCloudSize$Companion;", "", "()V", "NOTIFICATION_LG", "", "NOTIFICATION_MD", "NOTIFICATION_SM", LanConstants.OPERATOR_UNKNOWN, "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int NOTIFICATION_LG = 9;
            public static final int NOTIFICATION_MD = 8;
            public static final int NOTIFICATION_SM = 7;
            public static final int UNKNOWN = -1;

            private Companion() {
            }
        }
    }

    static {
        Uri uri = Uri.parse(IntentManager.START_INTENTS);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        INTENT_PROVIDER_URI = uri;
        SWITCH_QUERY_URI = Uri.parse("content://intelligent_data_expositor/switch");
        UMS_QUERY_ADVICE_URI = Uri.parse("content://com.oplus.pantanal.ums.statictis");
    }

    private Constants() {
    }

    @NotNull
    public final Uri getINTENT_PROVIDER_URI() {
        return INTENT_PROVIDER_URI;
    }

    public final Uri getSWITCH_QUERY_URI() {
        return SWITCH_QUERY_URI;
    }

    public final Uri getUMS_QUERY_ADVICE_URI() {
        return UMS_QUERY_ADVICE_URI;
    }
}
