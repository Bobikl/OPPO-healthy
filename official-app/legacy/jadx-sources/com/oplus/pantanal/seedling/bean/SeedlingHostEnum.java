package com.oplus.pantanal.seedling.bean;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.oplus.aiunit.vision.op5;
import com.oplus.pantanal.seedling.constants.Constants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006#"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "", "hostId", "", DBHealthReviewPlan.DESC, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getHostId", "()I", "getHostPkgName", "getHostPkgName$seedling_support_manualRelease", "getProviderAuthority", "getProviderAuthority$seedling_support_manualRelease", "isSupportHost", "", "Unknown", "Assistant", "Launcher", "AOD", "StatusBar", "Notification", "LockScreen", "Voice", "SecondaryLockScreen", "SecondaryNotification", "SecondaryLauncher", op5.WATCH, "CarLauncher", "Calendar", "SpeechAssistant", "FullSearch", "SeedlingHostAPP", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SeedlingHostEnum {
    Unknown(-1, "未知的，无效的入口"),
    Assistant(1, "负一屏"),
    Launcher(2, "桌面"),
    AOD(4, "息屏显示"),
    StatusBar(8, "状态栏"),
    Notification(16, "通知中心"),
    LockScreen(64, "锁屏"),
    Voice(128, "语音播报"),
    SecondaryLockScreen(256, "副屏-锁屏"),
    SecondaryNotification(512, "副屏-通知中心"),
    SecondaryLauncher(1024, "副屏-桌面"),
    Watch(2048, "手表"),
    CarLauncher(4096, "车机桌面"),
    Calendar(8192, "日历"),
    SpeechAssistant(16384, "小布助手"),
    FullSearch(32768, "全局搜索"),
    SeedlingHostAPP(Integer.MIN_VALUE, "模拟入口");


    @NotNull
    private final String desc;
    private final int hostId;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum$Companion;", "", "()V", "create", "Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "hostId", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SeedlingHostEnum create(int hostId) {
            SeedlingHostEnum seedlingHostEnum = SeedlingHostEnum.Assistant;
            if (hostId == seedlingHostEnum.getHostId()) {
                return seedlingHostEnum;
            }
            SeedlingHostEnum seedlingHostEnum2 = SeedlingHostEnum.Launcher;
            if (hostId == seedlingHostEnum2.getHostId()) {
                return seedlingHostEnum2;
            }
            SeedlingHostEnum seedlingHostEnum3 = SeedlingHostEnum.AOD;
            if (hostId == seedlingHostEnum3.getHostId()) {
                return seedlingHostEnum3;
            }
            SeedlingHostEnum seedlingHostEnum4 = SeedlingHostEnum.Notification;
            if (hostId == seedlingHostEnum4.getHostId()) {
                return seedlingHostEnum4;
            }
            SeedlingHostEnum seedlingHostEnum5 = SeedlingHostEnum.StatusBar;
            if (hostId == seedlingHostEnum5.getHostId()) {
                return seedlingHostEnum5;
            }
            SeedlingHostEnum seedlingHostEnum6 = SeedlingHostEnum.LockScreen;
            if (hostId == seedlingHostEnum6.getHostId()) {
                return seedlingHostEnum6;
            }
            SeedlingHostEnum seedlingHostEnum7 = SeedlingHostEnum.Voice;
            if (hostId == seedlingHostEnum7.getHostId()) {
                return seedlingHostEnum7;
            }
            SeedlingHostEnum seedlingHostEnum8 = SeedlingHostEnum.SecondaryLockScreen;
            if (hostId == seedlingHostEnum8.getHostId()) {
                return seedlingHostEnum8;
            }
            SeedlingHostEnum seedlingHostEnum9 = SeedlingHostEnum.SecondaryNotification;
            if (hostId == seedlingHostEnum9.getHostId()) {
                return seedlingHostEnum9;
            }
            SeedlingHostEnum seedlingHostEnum10 = SeedlingHostEnum.SecondaryLauncher;
            if (hostId == seedlingHostEnum10.getHostId()) {
                return seedlingHostEnum10;
            }
            SeedlingHostEnum seedlingHostEnum11 = SeedlingHostEnum.Watch;
            if (hostId == seedlingHostEnum11.getHostId()) {
                return seedlingHostEnum11;
            }
            SeedlingHostEnum seedlingHostEnum12 = SeedlingHostEnum.CarLauncher;
            if (hostId == seedlingHostEnum12.getHostId()) {
                return seedlingHostEnum12;
            }
            SeedlingHostEnum seedlingHostEnum13 = SeedlingHostEnum.Calendar;
            if (hostId == seedlingHostEnum13.getHostId()) {
                return seedlingHostEnum13;
            }
            SeedlingHostEnum seedlingHostEnum14 = SeedlingHostEnum.SpeechAssistant;
            if (hostId == seedlingHostEnum14.getHostId()) {
                return seedlingHostEnum14;
            }
            SeedlingHostEnum seedlingHostEnum15 = SeedlingHostEnum.FullSearch;
            if (hostId == seedlingHostEnum15.getHostId()) {
                return seedlingHostEnum15;
            }
            SeedlingHostEnum seedlingHostEnum16 = SeedlingHostEnum.SeedlingHostAPP;
            return hostId == seedlingHostEnum16.getHostId() ? seedlingHostEnum16 : SeedlingHostEnum.Unknown;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeedlingHostEnum.values().length];
            try {
                iArr[SeedlingHostEnum.AOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeedlingHostEnum.StatusBar.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SeedlingHostEnum.Notification.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SeedlingHostEnum.LockScreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SeedlingHostEnum.Assistant.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SeedlingHostEnum.Launcher.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SeedlingHostEnum.SecondaryLockScreen.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SeedlingHostEnum.SecondaryNotification.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SeedlingHostEnum.FullSearch.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SeedlingHostEnum.SeedlingHostAPP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SeedlingHostEnum(int i, String str) {
        this.hostId = i;
        this.desc = str;
    }

    @JvmStatic
    @NotNull
    public static final SeedlingHostEnum create(int i) {
        return INSTANCE.create(i);
    }

    @NotNull
    public static EnumEntries<SeedlingHostEnum> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getHostId() {
        return this.hostId;
    }

    @NotNull
    public final String getHostPkgName$seedling_support_manualRelease() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                return "com.android.systemui";
            case 5:
                return "com.coloros.assistantscreen";
            case 7:
            case 8:
                return Constants.PROVIDER_AUTHORITY_SECONDARY_HOME;
            case 9:
                return "com.heytap.quicksearchbox";
            case 10:
                return Constants.PKG_NAME_SEEDLING_HOST_APP;
            default:
                return "";
        }
    }

    @NotNull
    public final String getProviderAuthority$seedling_support_manualRelease() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return Constants.PROVIDER_AUTHORITY_SYSTEM_UI;
            case 5:
                return Constants.PROVIDER_AUTHORITY_ASSISTANT_SCREEN;
            case 6:
                return Constants.PROVIDER_AUTHORITY_LAUNCHER;
            case 7:
            case 8:
                return Constants.PROVIDER_AUTHORITY_SECONDARY_HOME;
            case 9:
                return Constants.PROVIDER_AUTHORITY_FULL_SEARCH;
            case 10:
                return Constants.PROVIDER_AUTHORITY_SEEDLING_HOST_APP;
            default:
                return "";
        }
    }

    public final boolean isSupportHost() {
        return Unknown != this;
    }
}
