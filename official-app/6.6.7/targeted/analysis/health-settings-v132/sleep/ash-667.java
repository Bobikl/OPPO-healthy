package com.oplus.aiunit.vision;

import android.app.NotificationChannel;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.google.gson.Gson;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.wsport.data.SleepSettingBean;
import com.oppo.sportwithwatch.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class ash {
    public static final int DEFAULT_NAP_MINUTE = 11;
    public static final int DEFAULT_STAY_UP_MINUTE = 59;
    public static final int INVALID_PROTECT_EYE_TYPE = -1;
    public static final int MAX_BED_TIME_TIME = 768;
    public static final int MAX_STAY_UP_BED_TIME_TIME = 5947;
    public static final int MIN_BED_TIME_TIME = 0;
    public static final int MODE_APP = 0;
    public static final int MODE_SYSTEM = 1;
    public static final int NEW_PROTECT_EYE_TYPE = 1;
    public static final int OLD_PROTECT_EYE_TYPE = 0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            a = iArr;
            try {
                iArr[SportHealthSetting.BED_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SportHealthSetting.SLEEP_MODEL_SETTINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportHealthSetting.CLOSE_MUSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportHealthSetting.BED_TIME_SWITCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME_SWITCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SportHealthSetting.USER_REST_NEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SportHealthSetting.USER_REST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SportHealthSetting.SLEEP_GOAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static String a() {
        return wl4.managerApi.getCurrActiveMac();
    }

    public static String b(SportHealthSetting sportHealthSetting) {
        switch (a.a[sportHealthSetting.ordinal()]) {
            case 1:
                return quh.e(15);
            case 2:
                return quh.e(0);
            case 3:
                SleepModelSettings sleepModelSettings = new SleepModelSettings();
                sleepModelSettings.setStartNow(0);
                sleepModelSettings.setTimestamp(0L);
                sleepModelSettings.setAccordRestSwitch(0);
                sleepModelSettings.setStateSync(0);
                sleepModelSettings.setStateSyncUpdateTime(0L);
                return sleepModelSettings.toDbJSON();
            case 4:
                return quh.e(1);
            case 5:
            case 6:
                return quh.e(0);
            case 7:
            case 8:
                SleepSettingBean.SleepRestSetting sleepRestSetting = new SleepSettingBean.SleepRestSetting();
                sleepRestSetting.setSleepRestSwitch(0);
                sleepRestSetting.setSleepRests(new ArrayList());
                return l(sleepRestSetting);
            case 9:
                return quh.e(0);
            default:
                return kq5.NOT_SET;
        }
    }

    public static String c() {
        return e88.a().getString(R.string.device_sleep_reminder_channel_name);
    }

    public static boolean d() {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(e88.a());
        NotificationChannel notificationChannel = notificationManagerCompatFrom.getNotificationChannel(quh.SLEEP_SETTING_CHANNEL_ID);
        if (notificationChannel != null) {
            return notificationChannel.getImportance() == 4;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel(quh.SLEEP_SETTING_CHANNEL_ID, c(), 4);
        notificationChannel2.enableLights(false);
        notificationChannel2.setLightColor(-65536);
        notificationChannel2.setShowBadge(false);
        notificationChannel2.enableVibration(false);
        notificationChannel2.setVibrationPattern(new long[]{0});
        notificationChannel2.setSound(null, null);
        notificationChannel2.setLockscreenVisibility(1);
        notificationManagerCompatFrom.createNotificationChannel(notificationChannel2);
        return true;
    }

    public static boolean e() {
        String strA = a();
        if (strA.isEmpty()) {
            return false;
        }
        return yei.a(strA).R8();
    }

    public static boolean f() {
        String strA = a();
        if (strA.isEmpty()) {
            return false;
        }
        return yei.a(strA).G();
    }

    public static boolean g() {
        String strA = a();
        if (strA.isEmpty()) {
            return false;
        }
        return yei.a(strA).q7();
    }

    public static boolean h() {
        String strA = a();
        if (strA.isEmpty()) {
            return false;
        }
        return yei.a(strA).f6();
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 30 && gpj.l() > 0;
    }

    public static boolean j() {
        return e() && i();
    }

    public static boolean k() {
        String strA = a();
        if (strA.isEmpty()) {
            return false;
        }
        return ((Boolean) gd5.c(strA).a(new zrh())).booleanValue();
    }

    public static String l(SleepSettingBean.SleepRestSetting sleepRestSetting) {
        return new Gson().toJson(sleepRestSetting);
    }

    public static FitnessProto.SleepSetting m(List<asc> list) {
        ArrayList arrayList = new ArrayList();
        for (asc ascVar : list) {
            arrayList.add(FitnessProto.UserRest.newBuilder().setTimeStamp((int) ascVar.l()).setBedTime(ascVar.h()).setWakeUpTime(ascVar.p()).setRestType(ascVar.n()).setRestDateList(1 << (ascVar.q() - 1)).setExcludeHoliday(ascVar.s()).build());
        }
        return FitnessProto.SleepSetting.newBuilder().addAllUsersRest(arrayList).setUserHabitsSwitch(1).build();
    }

    public static FitnessProto.BedTimeReminder n(SleepSettingBean.SleepRemind sleepRemind) {
        return FitnessProto.BedTimeReminder.newBuilder().setBedTimeSwitch(sleepRemind.getRemindSwitch()).setReminderBedTime(sleepRemind.getRemindTime()).build();
    }

    public static FitnessProto.SleepModelSetting o(SleepModelSettings sleepModelSettings) {
        return FitnessProto.SleepModelSetting.newBuilder().setTime((int) sleepModelSettings.getTimestamp()).setStartNow(sleepModelSettings.getStartNow()).setAccordRestSwitch(sleepModelSettings.getAccordRestSwitch()).setStateSync(sleepModelSettings.getStateSync()).setStateSyncTime((int) sleepModelSettings.getStateSyncUpdateTime()).build();
    }

    public static FitnessProto.SleepSetting p(SleepSettingBean.SleepRestSetting sleepRestSetting) {
        if (sleepRestSetting == null) {
            m8b.f("SleepSettingUtil", "ToSleepSettingBean sleepRestSetting is null");
            return null;
        }
        List<SleepSettingBean.SleepRest> sleepRests = sleepRestSetting.getSleepRests();
        ArrayList arrayList = new ArrayList();
        if (sleepRests != null) {
            for (SleepSettingBean.SleepRest sleepRest : sleepRests) {
                arrayList.add(FitnessProto.UserRest.newBuilder().setTimeStamp((int) sleepRest.getCreateTime()).setBedTime(sleepRest.getBedTime()).setWakeUpTime(sleepRest.getWakeUpTime()).setRestType(sleepRest.getRestType()).setRestDateList(sleepRest.getUserDefinedDate()).setExcludeHoliday(false).build());
            }
        } else {
            m8b.f("SleepSettingUtil", "toSleepSetting sleepRestList is null ");
        }
        return FitnessProto.SleepSetting.newBuilder().addAllUsersRest(arrayList).setUserHabitsSwitch(sleepRestSetting.getSleepRestSwitch()).build();
    }

    public static FitnessProto.StayUpBedTimeReminder q(SleepSettingBean.SleepRemind sleepRemind) {
        return FitnessProto.StayUpBedTimeReminder.newBuilder().setStayUpBedTimeSwitch(sleepRemind.getRemindSwitch()).setStayUpBedTime(sleepRemind.getRemindTime()).build();
    }
}