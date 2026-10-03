package com.heytap.health.settings.watch.sporthealthsettings2;

import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.duk;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zqh;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public class SleepSettingEntity {
    public static final int INVALID_VALUE = -1;
    public final SleepSettingBean a = new SleepSettingBean();
    public final ConcurrentHashMap<SportHealthSetting, String> b = new ConcurrentHashMap<>();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            a = iArr;
            try {
                iArr[SportHealthSetting.BED_TIME_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SportHealthSetting.BED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME_SWITCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportHealthSetting.SLEEP_MODEL_SETTINGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportHealthSetting.CLOSE_MUSIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SportHealthSetting.USER_REST_NEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SportHealthSetting.HAS_SHOWED_SLEEP_SETTING_GUIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SportHealthSetting.SLEEP_GOAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SportHealthSetting.SILENCE_NOTIFICATIONS_DURING_NAP_SWITCH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SportHealthSetting.NAP_START_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SportHealthSetting.NAP_DURATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public SleepSettingBean a() {
        return this.a;
    }

    public int b(SportHealthSetting sportHealthSetting) {
        String str = this.b.get(sportHealthSetting);
        if (str == null) {
            return -1;
        }
        try {
            return duk.u(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public String c(SportHealthSetting sportHealthSetting) {
        return this.b.get(sportHealthSetting);
    }

    public void d(SportHealthSetting sportHealthSetting, String str) {
        this.b.put(sportHealthSetting, str);
        e(sportHealthSetting, str);
    }

    public final void e(SportHealthSetting sportHealthSetting, String str) {
        a7b.f("Sleep-Setting", "Update Sleep SettingBean type =" + sportHealthSetting.name() + ",data =" + str);
        switch (a.a[sportHealthSetting.ordinal()]) {
            case 1:
                this.a.a().setRemindSwitch(duk.u(str));
                break;
            case 2:
                this.a.a().setRemindTime(duk.u(str));
                break;
            case 3:
                this.a.g().setRemindSwitch(duk.u(str));
                break;
            case 4:
                this.a.g().setRemindTime(duk.u(str));
                break;
            case 5:
                SleepModelSettings sleepModelSettings = (SleepModelSettings) sc8.b(str, new TypeToken<SleepModelSettings>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.SleepSettingEntity.1
                }.getType());
                if (sleepModelSettings != null) {
                    ISleepDataService iSleepDataService = (ISleepDataService) x0.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
                    if (iSleepDataService != null) {
                        iSleepDataService.U5(sleepModelSettings);
                    }
                    this.a.p(sleepModelSettings);
                    a7b.f("Sleep-Setting", "Set sleep mode setting=" + sleepModelSettings);
                }
                break;
            case 6:
                this.a.k(duk.u(str));
                break;
            case 7:
                SleepSettingBean.SleepRestSetting sleepRestSetting = (SleepSettingBean.SleepRestSetting) sc8.b(str, new TypeToken<SleepSettingBean.SleepRestSetting>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.SleepSettingEntity.2
                }.getType());
                if (sleepRestSetting != null) {
                    this.a.q(sleepRestSetting);
                    a7b.f("Sleep-Setting", "updateSleepSettingBean USER_REST_NEW=" + this.a.f().toString());
                } else {
                    a7b.b("Sleep-Setting", "updateSleepSettingBean USER_REST_NEW restSetting is null  ");
                }
                break;
            case 8:
                this.a.l(zqh.g(str));
                break;
            case 9:
                this.a.d().setSleepGoalTime(duk.u(str));
                break;
            case 10:
                this.a.o(duk.u(str));
                break;
            case 11:
                this.a.n(str);
                break;
            case 12:
                this.a.m(duk.u(str));
                break;
            default:
                a7b.b("Sleep-Setting", "SleepSetting type=" + sportHealthSetting + " Not Support!, Check code or Fix bug");
                break;
        }
    }
}
