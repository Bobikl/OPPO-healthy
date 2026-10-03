package com.oplus.seedling.sdk.utils;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.heytap.sports.service.BgConnect;
import com.oplus.instant.router.Instant;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.collections.SetsKt__SetsKt;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u000f\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants;", "", "()V", "DECISION_CARD_CONFIG", "", "IMPORTANCE_1_SHOW_IN_LAUNCHER_ASSISTANT", "", "IMPORTANCE_2_RESERVED", "IMPORTANCE_3_NORMAL", "IMPORTANCE_4_IMPOTANT", "IMPORTANCE_5_VERY_IMPORTTANT", "PACKAGE_NAME_UMS", "ChannelType", "EntranceType", "ErrorCode", "EventCode", "GroupPriority", "IntentCategory", "LiteUleView", "RemoteSize", "SeedlingType", "ServiceCategory", "ServiceInfoConstants", "ServiceType", "Size", "StandardUleView", "UseTemplate", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Constants {

    @NotNull
    public static final String DECISION_CARD_CONFIG = "decision_card_config";
    public static final int IMPORTANCE_1_SHOW_IN_LAUNCHER_ASSISTANT = 1;
    public static final int IMPORTANCE_2_RESERVED = 2;
    public static final int IMPORTANCE_3_NORMAL = 3;
    public static final int IMPORTANCE_4_IMPOTANT = 4;
    public static final int IMPORTANCE_5_VERY_IMPORTTANT = 5;

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String PACKAGE_NAME_UMS = "com.oplus.pantanal.ums";

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ChannelType;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ChannelType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int NEW_CHANNEL = 2;
        public static final int OLD_CHANNEL = 1;

        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ChannelType$Companion;", "", "()V", "DES_CHANNEL_TYPE", "", "", "", "getDES_CHANNEL_TYPE", "()Ljava/util/Map;", "NEW_CHANNEL", "OLD_CHANNEL", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Map<Integer, String> DES_CHANNEL_TYPE = MapsKt__MapsKt.mapOf(TuplesKt.to(1, "old_channel"), TuplesKt.to(2, "new_channel"));
            public static final int NEW_CHANNEL = 2;
            public static final int OLD_CHANNEL = 1;

            private Companion() {
            }

            @NotNull
            public final Map<Integer, String> getDES_CHANNEL_TYPE() {
                return DES_CHANNEL_TYPE;
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$EntranceType;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint({"WrongConstant"})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EntranceType {
        public static final int ALL = 0;
        public static final int AOD = 4;
        public static final int ASSISTANT = 1;
        public static final int CALENDAR = 8192;
        public static final int CAPSULE = 32;
        public static final int CAR_LAUNCHER = 4096;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int FULL_SEARCH = 32768;
        public static final int HEADSET = 128;
        public static final int LAUNCHER = 2;
        public static final int LOCK_SCREEN = 64;
        public static final int NOTIFICATION = 16;
        public static final int PERSISTENT_CONTAINER = 131072;
        public static final int SECONDARY_LOCKSCREEN = 256;
        public static final int SECONDARY_NOTIFICATION = 512;
        public static final int SECONDARY_SECONDARY_LAUNCHER = 1024;
        public static final int SEEDING_HOST_APP = 1073741824;
        public static final int SPEECH_ASSISTANT = 16384;
        public static final int STATUS_BAR = 8;

        @NotNull
        public static final String TAG = "EntranceType";
        public static final int UMS_AI_FLOW = 65536;
        public static final int UNDEFINED = -1;
        public static final int WATCH = 2048;

        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$EntranceType$Companion;", "", "()V", "ALL", "", "AOD", "ASSISTANT", "ASSISTANT_LAUNCHER", "", "getASSISTANT_LAUNCHER", "()Ljava/util/Set;", "BASE_ENTRY_ONE", "CALENDAR", "CAPSULE", "CAR_LAUNCHER", "DES_SUPPORT_ENTRANCE_MAP", "", "", "getDES_SUPPORT_ENTRANCE_MAP", "()Ljava/util/Map;", "FULL_SEARCH", "HEADSET", "LAUNCHER", "LOCK_SCREEN", "NOTIFICATION", "NOTIFICATION_LOCK_SCREEN", "getNOTIFICATION_LOCK_SCREEN", "PERSISTENT_CONTAINER", "SECONDARY_LOCKSCREEN", "SECONDARY_NOTIFICATION", "SECONDARY_SECONDARY_LAUNCHER", "SEEDING_HOST_APP", "SPEECH_ASSISTANT", "STATUS_BAR", "TAG", "UMS_AI_FLOW", "UNDEFINED", "VALID_ENTRANCE", "", "getVALID_ENTRANCE", "()[I", "WATCH", "isValid", "", "entranceType", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public static final int ALL = 0;
            public static final int AOD = 4;
            public static final int ASSISTANT = 1;
            private static final int BASE_ENTRY_ONE = 1;
            public static final int CALENDAR = 8192;
            public static final int CAPSULE = 32;
            public static final int CAR_LAUNCHER = 4096;
            public static final int FULL_SEARCH = 32768;
            public static final int HEADSET = 128;
            public static final int LAUNCHER = 2;
            public static final int LOCK_SCREEN = 64;
            public static final int NOTIFICATION = 16;
            public static final int PERSISTENT_CONTAINER = 131072;
            public static final int SECONDARY_LOCKSCREEN = 256;
            public static final int SECONDARY_NOTIFICATION = 512;
            public static final int SECONDARY_SECONDARY_LAUNCHER = 1024;
            public static final int SEEDING_HOST_APP = 1073741824;
            public static final int SPEECH_ASSISTANT = 16384;
            public static final int STATUS_BAR = 8;

            @NotNull
            public static final String TAG = "EntranceType";
            public static final int UMS_AI_FLOW = 65536;
            public static final int UNDEFINED = -1;
            public static final int WATCH = 2048;
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Set<Integer> ASSISTANT_LAUNCHER = SetsKt__SetsKt.setOf((Object[]) new Integer[]{1, 2});

            @NotNull
            private static final Set<Integer> NOTIFICATION_LOCK_SCREEN = SetsKt__SetsKt.setOf((Object[]) new Integer[]{16, 64});

            @NotNull
            private static final int[] VALID_ENTRANCE = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 1073741824};

            @NotNull
            private static final Map<Integer, String> DES_SUPPORT_ENTRANCE_MAP = MapsKt__MapsKt.mapOf(TuplesKt.to(2, "launcher"), TuplesKt.to(1, "assistantscreen"), TuplesKt.to(4, "aod"), TuplesKt.to(8, "statusbar"), TuplesKt.to(16, BgConnect.KEY_NOTIFICATION), TuplesKt.to(32, com.oplus.mydevices.sdk.Constants.KEY_CAPSULE), TuplesKt.to(64, "lockscreen"), TuplesKt.to(128, DeviceInfoCompat.DeviceType.HEADSET), TuplesKt.to(256, "secondaryLockScreen"), TuplesKt.to(512, "secondaryNotification"), TuplesKt.to(2048, DeviceInfoCompat.DeviceType.WATCH), TuplesKt.to(4096, "car launcher"), TuplesKt.to(8192, "calendar"), TuplesKt.to(16384, "speech_assistant"), TuplesKt.to(32768, "full_search"), TuplesKt.to(131072, "persistent_container"), TuplesKt.to(65536, "ums_ai_flow"), TuplesKt.to(1073741824, "seedling_host_app"));

            private Companion() {
            }

            @NotNull
            public final Set<Integer> getASSISTANT_LAUNCHER() {
                return ASSISTANT_LAUNCHER;
            }

            @NotNull
            public final Map<Integer, String> getDES_SUPPORT_ENTRANCE_MAP() {
                return DES_SUPPORT_ENTRANCE_MAP;
            }

            @NotNull
            public final Set<Integer> getNOTIFICATION_LOCK_SCREEN() {
                return NOTIFICATION_LOCK_SCREEN;
            }

            @NotNull
            public final int[] getVALID_ENTRANCE() {
                return VALID_ENTRANCE;
            }

            public final boolean isValid(int entranceType) {
                return ArraysKt___ArraysKt.contains(VALID_ENTRANCE, entranceType);
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ErrorCode;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ErrorCode {
        public static final int CARD_CONFIG_ERROR = 2006;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int HOST_USE_ERROR = 2003;
        public static final int INTERRUPT_BY_ENTRANCE = 2007;
        public static final int SERVICE_ID_ERROR = 2004;
        public static final int TASK_IS_CANCELED = 2005;
        public static final int UPK_COPY_ERROR = 2001;
        public static final int UPK_LOAD_ERROR = 2002;
        public static final int WAIT_CARD_DATA_TIME_OUT = 2008;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ErrorCode$Companion;", "", "()V", "CARD_CONFIG_ERROR", "", "HOST_USE_ERROR", "INTERRUPT_BY_ENTRANCE", "SERVICE_ID_ERROR", "TASK_IS_CANCELED", "UPK_COPY_ERROR", "UPK_LOAD_ERROR", "WAIT_CARD_DATA_TIME_OUT", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CARD_CONFIG_ERROR = 2006;
            public static final int HOST_USE_ERROR = 2003;
            public static final int INTERRUPT_BY_ENTRANCE = 2007;
            public static final int SERVICE_ID_ERROR = 2004;
            public static final int TASK_IS_CANCELED = 2005;
            public static final int UPK_COPY_ERROR = 2001;
            public static final int UPK_LOAD_ERROR = 2002;
            public static final int WAIT_CARD_DATA_TIME_OUT = 2008;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$EventCode;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EventCode {
        public static final int CLICK = 1;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int EXPOSE = 2;
        public static final int FIRST_RECOMMEND = 5;
        public static final int INTENT_REMOVE_ORDER_VIEW = 8;
        public static final int INTENT_SERVICE_CLOSE = 10;
        public static final int INTENT_SERVICE_CLOSE_ONCE = 6;
        public static final int LOAD_FAILED = 4;
        public static final int REPLACE_EXTEND_TIME = 7;
        public static final int SCENE_SERVICE_COMPOSE_FAILED = 9;
        public static final int UNRECOMMENDED = 3;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$EventCode$Companion;", "", "()V", "CLICK", "", "EXPOSE", "FIRST_RECOMMEND", "INTENT_REMOVE_ORDER_VIEW", "INTENT_SERVICE_CLOSE", "INTENT_SERVICE_CLOSE_ONCE", "LOAD_FAILED", "REPLACE_EXTEND_TIME", "SCENE_SERVICE_COMPOSE_FAILED", "UNRECOMMENDED", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CLICK = 1;
            public static final int EXPOSE = 2;
            public static final int FIRST_RECOMMEND = 5;
            public static final int INTENT_REMOVE_ORDER_VIEW = 8;
            public static final int INTENT_SERVICE_CLOSE = 10;
            public static final int INTENT_SERVICE_CLOSE_ONCE = 6;
            public static final int LOAD_FAILED = 4;
            public static final int REPLACE_EXTEND_TIME = 7;
            public static final int SCENE_SERVICE_COMPOSE_FAILED = 9;
            public static final int UNRECOMMENDED = 3;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$GroupPriority;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface GroupPriority {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int T0 = 1;
        public static final int T1 = 2;
        public static final int T2 = 3;
        public static final int T3 = 4;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$GroupPriority$Companion;", "", "()V", "T0", "", "T1", "T2", "T3", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int T0 = 1;
            public static final int T1 = 2;
            public static final int T2 = 3;
            public static final int T3 = 4;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$IntentCategory;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface IntentCategory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int INTENT_FROM_CLOUD = 1;
        public static final int INTENT_FROM_DT_USER_HABIT = 2;
        public static final int INTENT_FROM_GUARANTEED = 3;
        public static final int INTENT_FROM_RULE = 0;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$IntentCategory$Companion;", "", "()V", "INTENT_FROM_CLOUD", "", "INTENT_FROM_DT_USER_HABIT", "INTENT_FROM_GUARANTEED", "INTENT_FROM_RULE", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int INTENT_FROM_CLOUD = 1;
            public static final int INTENT_FROM_DT_USER_HABIT = 2;
            public static final int INTENT_FROM_GUARANTEED = 3;
            public static final int INTENT_FROM_RULE = 0;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$LiteUleView;", "", "()V", "CARD_MODE_WIDGET_1_1", "", "NOTIFICATION_LG", "NOTIFICATION_MD", "NOTIFICATION_SM", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LiteUleView {

        @NotNull
        public static final String CARD_MODE_WIDGET_1_1 = "widget_1*1";

        @NotNull
        public static final LiteUleView INSTANCE = new LiteUleView();

        @NotNull
        public static final String NOTIFICATION_LG = "notification_lg";

        @NotNull
        public static final String NOTIFICATION_MD = "notification_md";

        @NotNull
        public static final String NOTIFICATION_SM = "notification_sm";

        private LiteUleView() {
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$RemoteSize;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RemoteSize {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final String DEFAULT = "default";

        @NotNull
        public static final String NOTIFICATION_LG = "notification_lg";

        @NotNull
        public static final String NOTIFICATION_MD = "notification_md";

        @NotNull
        public static final String NOTIFICATION_SM = "notification_sm";

        @NotNull
        public static final String ONE_PLUS_TWO = "1*2";

        @NotNull
        public static final String TWO_PLUS_FOUR = "2*4";

        @NotNull
        public static final String TWO_PLUS_TWO = "2*2";

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$RemoteSize$Companion;", "", "()V", "DEFAULT", "", "NOTIFICATION_LG", "NOTIFICATION_MD", "NOTIFICATION_SM", "ONE_PLUS_TWO", "TWO_PLUS_FOUR", "TWO_PLUS_TWO", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            public static final String DEFAULT = "default";

            @NotNull
            public static final String NOTIFICATION_LG = "notification_lg";

            @NotNull
            public static final String NOTIFICATION_MD = "notification_md";

            @NotNull
            public static final String NOTIFICATION_SM = "notification_sm";

            @NotNull
            public static final String ONE_PLUS_TWO = "1*2";

            @NotNull
            public static final String TWO_PLUS_FOUR = "2*4";

            @NotNull
            public static final String TWO_PLUS_TWO = "2*2";

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$SeedlingType;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SeedlingType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int IMMEDIATE = 2;
        public static final int LIVE = 1;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$SeedlingType$Companion;", "", "()V", "IMMEDIATE", "", "LIVE", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IMMEDIATE = 2;
            public static final int LIVE = 1;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ServiceCategory;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ServiceCategory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int NON_SYSTEM_SERVICE = 1;
        public static final int SYSTEM_SERVICE = 2;

        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ServiceCategory$Companion;", "", "()V", "DES_SERVICE_CATEGORY", "", "", "", "getDES_SERVICE_CATEGORY", "()Ljava/util/Map;", "NON_SYSTEM_SERVICE", "SYSTEM_SERVICE", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Map<Integer, String> DES_SERVICE_CATEGORY = MapsKt__MapsKt.mapOf(TuplesKt.to(1, "non_system_service"), TuplesKt.to(2, "system_service"));
            public static final int NON_SYSTEM_SERVICE = 1;
            public static final int SYSTEM_SERVICE = 2;

            private Companion() {
            }

            @NotNull
            public final Map<Integer, String> getDES_SERVICE_CATEGORY() {
                return DES_SERVICE_CATEGORY;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ServiceInfoConstants;", "", "()V", "NOT_SUPPORT_STRONG_REMIND", "", "SUPPORT_STRONG_REMIND", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServiceInfoConstants {

        @NotNull
        public static final ServiceInfoConstants INSTANCE = new ServiceInfoConstants();
        public static final int NOT_SUPPORT_STRONG_REMIND = 1;
        public static final int SUPPORT_STRONG_REMIND = 2;

        private ServiceInfoConstants() {
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ServiceType;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ServiceType {
        public static final int APP = 2;
        public static final int CONTENT_OPERATION = 3;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int INSTANT = 1;
        public static final int OPERATION_WIDGET = 5;
        public static final int SEEDLING = 100;
        public static final int SERVICE = 4;

        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$ServiceType$Companion;", "", "()V", "APP", "", "CONTENT_OPERATION", "DES_SERVICE_TYPE", "", "", "getDES_SERVICE_TYPE", "()Ljava/util/Map;", "INSTANT", "OPERATION_WIDGET", "SEEDLING", "SERVICE", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public static final int APP = 2;
            public static final int CONTENT_OPERATION = 3;
            public static final int INSTANT = 1;
            public static final int OPERATION_WIDGET = 5;
            public static final int SEEDLING = 100;
            public static final int SERVICE = 4;
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Map<Integer, String> DES_SERVICE_TYPE = MapsKt__MapsKt.mapOf(TuplesKt.to(1, Instant.HOST_INSTANT), TuplesKt.to(2, "assistant"), TuplesKt.to(3, "content_operation"), TuplesKt.to(4, "service"), TuplesKt.to(5, "widget"), TuplesKt.to(100, "seedling"));

            private Companion() {
            }

            @NotNull
            public final Map<Integer, String> getDES_SERVICE_TYPE() {
                return DES_SERVICE_TYPE;
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$Size;", "", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Size {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int FOUR_PLUS_FOUR = 3;
        public static final int NOTIFICATION_LG = 9;
        public static final int NOTIFICATION_MD = 8;
        public static final int NOTIFICATION_SM = 7;
        public static final int NOT_DEFINE = 0;
        public static final int N_PLUS_FOUR = 4;
        public static final int ONE_PLUS_ONE = 10;
        public static final int ONE_PLUS_TWO = 5;
        public static final int SIZE_DEFAULT = 1000;
        public static final int TWO_PLUS_FOUR = 2;
        public static final int TWO_PLUS_TWO = 1;
        public static final int WIDGET_ONE_PLUS_ONE = 6;

        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$Size$Companion;", "", "()V", "ALL_VALID_SIZE_MAP", "", "", "", "getALL_VALID_SIZE_MAP", "()Ljava/util/Map;", "FOUR_PLUS_FOUR", "NOTIFICATION_LG", "NOTIFICATION_MD", "NOTIFICATION_SM", "NOT_DEFINE", "N_PLUS_FOUR", "ONE_PLUS_ONE", "ONE_PLUS_TWO", "SIZE_DEFAULT", "SIZE_TO_LITE", "getSIZE_TO_LITE", "SIZE_TO_STANDARD", "getSIZE_TO_STANDARD", "TWO_PLUS_FOUR", "TWO_PLUS_TWO", "WIDGET_ONE_PLUS_ONE", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Map<Integer, String> ALL_VALID_SIZE_MAP;
            public static final int FOUR_PLUS_FOUR = 3;
            public static final int NOTIFICATION_LG = 9;
            public static final int NOTIFICATION_MD = 8;
            public static final int NOTIFICATION_SM = 7;
            public static final int NOT_DEFINE = 0;
            public static final int N_PLUS_FOUR = 4;
            public static final int ONE_PLUS_ONE = 10;
            public static final int ONE_PLUS_TWO = 5;
            public static final int SIZE_DEFAULT = 1000;

            @NotNull
            private static final Map<Integer, String> SIZE_TO_LITE;

            @NotNull
            private static final Map<Integer, String> SIZE_TO_STANDARD;
            public static final int TWO_PLUS_FOUR = 2;
            public static final int TWO_PLUS_TWO = 1;
            public static final int WIDGET_ONE_PLUS_ONE = 6;

            static {
                Map<Integer, String> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(5, "1*2"), TuplesKt.to(1, "2*2"), TuplesKt.to(2, "2*4"), TuplesKt.to(3, StandardUleView.CARD_MODE_4_4));
                SIZE_TO_STANDARD = mapMapOf;
                Map<Integer, String> mapMapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.to(6, LiteUleView.CARD_MODE_WIDGET_1_1), TuplesKt.to(7, "notification_sm"), TuplesKt.to(8, "notification_md"), TuplesKt.to(9, "notification_lg"));
                SIZE_TO_LITE = mapMapOf2;
                ALL_VALID_SIZE_MAP = MapsKt__MapsKt.plus(mapMapOf2, mapMapOf);
            }

            private Companion() {
            }

            @NotNull
            public final Map<Integer, String> getALL_VALID_SIZE_MAP() {
                return ALL_VALID_SIZE_MAP;
            }

            @NotNull
            public final Map<Integer, String> getSIZE_TO_LITE() {
                return SIZE_TO_LITE;
            }

            @NotNull
            public final Map<Integer, String> getSIZE_TO_STANDARD() {
                return SIZE_TO_STANDARD;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$StandardUleView;", "", "()V", "CARD_MODE_1_2", "", "CARD_MODE_2_2", "CARD_MODE_2_4", "CARD_MODE_4_4", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StandardUleView {

        @NotNull
        public static final String CARD_MODE_1_2 = "1*2";

        @NotNull
        public static final String CARD_MODE_2_2 = "2*2";

        @NotNull
        public static final String CARD_MODE_2_4 = "2*4";

        @NotNull
        public static final String CARD_MODE_4_4 = "4*4";

        @NotNull
        public static final StandardUleView INSTANCE = new StandardUleView();

        private StandardUleView() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/oplus/seedling/sdk/utils/Constants$UseTemplate;", "", "()V", "DEFAULT", "", "DESKTOP", "NOTIFICATION", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UseTemplate {
        public static final int DEFAULT = 0;
        public static final int DESKTOP = 1;

        @NotNull
        public static final UseTemplate INSTANCE = new UseTemplate();
        public static final int NOTIFICATION = 2;

        private UseTemplate() {
        }
    }

    private Constants() {
    }
}
