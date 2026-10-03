package com.pantanal.server.content.utils;

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

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pantanal/server/content/utils/Constants;", "", "()V", "ChannelType", "EntranceType", "EventCode", "IntentCategory", "SeedlingType", "ServiceCategory", "ServiceType", "Size", "UseTemplate", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Constants {

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$ChannelType;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ChannelType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int NEW_CHANNEL = 2;
        public static final int OLD_CHANNEL = 1;

        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$ChannelType$Companion;", "", "()V", "DES_CHANNEL_TYPE", "", "", "", "getDES_CHANNEL_TYPE", "()Ljava/util/Map;", "NEW_CHANNEL", "OLD_CHANNEL", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$EntranceType;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SuppressLint({"WrongConstant"})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EntranceType {
        public static final int ALL = 0;
        public static final int AOD = 4;
        public static final int ASSISTANT = 1;
        public static final int CAPSULE = 32;

        @NotNull
        public static final String CAR_ENTRY_PREFIX = "car";
        public static final int CAR_LAUNCHER = 4096;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int HEADSET = 128;
        public static final int LAUNCHER = 2;
        public static final int LOCK_SCREEN = 64;
        public static final int NOTIFICATION = 16;
        public static final int SECONDARY_LAUNCHER = 1024;
        public static final int SECONDARY_LOCKSCREEN = 256;
        public static final int SECONDARY_NOTIFICATION = 512;
        public static final int STATUS_BAR = 8;

        @NotNull
        public static final String TAG = "EntranceType";
        public static final int UNDEFINED = -1;

        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/pantanal/server/content/utils/Constants$EntranceType$Companion;", "", "()V", "ALL", "", "AOD", "ASSISTANT", "ASSISTANT_LAUNCHER", "", "getASSISTANT_LAUNCHER", "()Ljava/util/Set;", "BASE_ENTRY_ONE", "CAPSULE", "CAR_ENTRY_PREFIX", "", "CAR_LAUNCHER", "DES_SUPPORT_ENTRANCE_MAP", "", "getDES_SUPPORT_ENTRANCE_MAP", "()Ljava/util/Map;", "HEADSET", "LAUNCHER", "LOCK_SCREEN", "NOTIFICATION", "NOTIFICATION_LOCK_SCREEN", "getNOTIFICATION_LOCK_SCREEN", "SECONDARY_LAUNCHER", "SECONDARY_LOCKSCREEN", "SECONDARY_NOTIFICATION", "STATUS_BAR", "TAG", "UNDEFINED", "VALID_ENTRANCE", "", "getVALID_ENTRANCE", "()[I", "isLite", "", "entranceType", "isValid", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public static final int ALL = 0;
            public static final int AOD = 4;
            public static final int ASSISTANT = 1;
            private static final int BASE_ENTRY_ONE = 1;
            public static final int CAPSULE = 32;

            @NotNull
            public static final String CAR_ENTRY_PREFIX = "car";
            public static final int CAR_LAUNCHER = 4096;
            public static final int HEADSET = 128;
            public static final int LAUNCHER = 2;
            public static final int LOCK_SCREEN = 64;
            public static final int NOTIFICATION = 16;
            public static final int SECONDARY_LAUNCHER = 1024;
            public static final int SECONDARY_LOCKSCREEN = 256;
            public static final int SECONDARY_NOTIFICATION = 512;
            public static final int STATUS_BAR = 8;

            @NotNull
            public static final String TAG = "EntranceType";
            public static final int UNDEFINED = -1;
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Set<Integer> ASSISTANT_LAUNCHER = SetsKt__SetsKt.setOf((Object[]) new Integer[]{1, 2});

            @NotNull
            private static final Set<Integer> NOTIFICATION_LOCK_SCREEN = SetsKt__SetsKt.setOf((Object[]) new Integer[]{16, 64});

            @NotNull
            private static final int[] VALID_ENTRANCE = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 4096};

            @NotNull
            private static final Map<Integer, String> DES_SUPPORT_ENTRANCE_MAP = MapsKt__MapsKt.mapOf(TuplesKt.to(2, "launcher"), TuplesKt.to(1, "assistantscreen"), TuplesKt.to(4, "aod"), TuplesKt.to(8, "statusbar"), TuplesKt.to(16, BgConnect.KEY_NOTIFICATION), TuplesKt.to(32, com.oplus.mydevices.sdk.Constants.KEY_CAPSULE), TuplesKt.to(64, "lockscreen"), TuplesKt.to(128, DeviceInfoCompat.DeviceType.HEADSET), TuplesKt.to(256, "secondaryLockScreen"), TuplesKt.to(512, "secondaryNotification"), TuplesKt.to(1024, "secondarylauncher"), TuplesKt.to(4096, "cardesktop"));

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

            public final boolean isLite(int entranceType) {
                return entranceType == 64 || entranceType == 16 || entranceType == 4 || entranceType == 8 || entranceType == 128 || entranceType == 256 || entranceType == 512;
            }

            public final boolean isValid(int entranceType) {
                return ArraysKt___ArraysKt.contains(VALID_ENTRANCE, entranceType);
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$EventCode;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EventCode {
        public static final int CLICK = 1;
        public static final int CLOSE_NOTICE = 6;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int EXPOSE = 2;
        public static final int FIRST_RECOMMEND = 5;
        public static final int LOAD_FAILED = 4;
        public static final int UNINTERESTED = 32;
        public static final int UNRECOMMENDED = 3;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$EventCode$Companion;", "", "()V", "CLICK", "", "CLOSE_NOTICE", "EXPOSE", "FIRST_RECOMMEND", "LOAD_FAILED", "UNINTERESTED", "UNRECOMMENDED", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CLICK = 1;
            public static final int CLOSE_NOTICE = 6;
            public static final int EXPOSE = 2;
            public static final int FIRST_RECOMMEND = 5;
            public static final int LOAD_FAILED = 4;
            public static final int UNINTERESTED = 32;
            public static final int UNRECOMMENDED = 3;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$IntentCategory;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface IntentCategory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int INTENT_FROM_CLOUD = 1;
        public static final int INTENT_FROM_DT_USER_HABIT = 2;
        public static final int INTENT_FROM_GUARANTEED = 3;
        public static final int INTENT_FROM_OPT_REC = 4;
        public static final int INTENT_FROM_RULE = 0;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$IntentCategory$Companion;", "", "()V", "INTENT_FROM_CLOUD", "", "INTENT_FROM_DT_USER_HABIT", "INTENT_FROM_GUARANTEED", "INTENT_FROM_OPT_REC", "INTENT_FROM_RULE", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int INTENT_FROM_CLOUD = 1;
            public static final int INTENT_FROM_DT_USER_HABIT = 2;
            public static final int INTENT_FROM_GUARANTEED = 3;
            public static final int INTENT_FROM_OPT_REC = 4;
            public static final int INTENT_FROM_RULE = 0;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$SeedlingType;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SeedlingType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int IMMEDIATE = 2;
        public static final int LIVE_TYPE = 1;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$SeedlingType$Companion;", "", "()V", "IMMEDIATE", "", "LIVE_TYPE", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IMMEDIATE = 2;
            public static final int LIVE_TYPE = 1;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$ServiceCategory;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ServiceCategory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int NON_SYSTEM_SERVICE = 1;
        public static final int SYSTEM_SERVICE = 2;

        @Keep
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$ServiceCategory$Companion;", "", "()V", "DES_SERVICE_CATEGORY", "", "", "", "getDES_SERVICE_CATEGORY", "()Ljava/util/Map;", "NON_SYSTEM_SERVICE", "SYSTEM_SERVICE", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$ServiceType;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$ServiceType$Companion;", "", "()V", "APP", "", "CONTENT_OPERATION", "DES_SERVICE_TYPE", "", "", "getDES_SERVICE_TYPE", "()Ljava/util/Map;", "INSTANT", "OPERATION_WIDGET", "SEEDLING", "SERVICE", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$Size;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        public static final int N_PLUS_FOUR = 4;
        public static final int ONE_PLUS_TWO = 5;
        public static final int SIZE_DEFAULT = 1000;
        public static final int TWO_PLUS_FOUR = 2;
        public static final int TWO_PLUS_TWO = 1;
        public static final int WIDGET_ONE_PLUS_ONE = 6;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$Size$Companion;", "", "()V", "FOUR_PLUS_FOUR", "", "NOTIFICATION_LG", "NOTIFICATION_MD", "NOTIFICATION_SM", "N_PLUS_FOUR", "ONE_PLUS_TWO", "SIZE_DEFAULT", "TWO_PLUS_FOUR", "TWO_PLUS_TWO", "WIDGET_ONE_PLUS_ONE", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int FOUR_PLUS_FOUR = 3;
            public static final int NOTIFICATION_LG = 9;
            public static final int NOTIFICATION_MD = 8;
            public static final int NOTIFICATION_SM = 7;
            public static final int N_PLUS_FOUR = 4;
            public static final int ONE_PLUS_TWO = 5;
            public static final int SIZE_DEFAULT = 1000;
            public static final int TWO_PLUS_FOUR = 2;
            public static final int TWO_PLUS_TWO = 1;
            public static final int WIDGET_ONE_PLUS_ONE = 6;

            private Companion() {
            }
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$UseTemplate;", "", "Companion", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface UseTemplate {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int DEFAULT = 0;
        public static final int DESKTOP = 1;
        public static final int NOTIFICATION = 2;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/pantanal/server/content/utils/Constants$UseTemplate$Companion;", "", "()V", "DEFAULT", "", "DESKTOP", "NOTIFICATION", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int DEFAULT = 0;
            public static final int DESKTOP = 1;
            public static final int NOTIFICATION = 2;

            private Companion() {
            }
        }
    }

    private Constants() {
    }
}
