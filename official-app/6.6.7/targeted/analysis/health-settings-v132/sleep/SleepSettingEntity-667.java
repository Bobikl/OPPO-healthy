package com.heytap.health.settings.watch.sporthealthsettings2;

import com.google.gson.reflect.TypeToken;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.quh;
import com.oplus.aiunit.vision.vd8;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
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
            return byk.u(str);
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
        m8b.f("Sleep-Setting", "Update Sleep SettingBean type =" + sportHealthSetting.name() + ",data =" + str);
        switch (a.a[sportHealthSetting.ordinal()]) {
            case 1:
                this.a.a().setRemindSwitch(byk.u(str));
                break;
            case 2:
                this.a.a().setRemindTime(byk.u(str));
                break;
            case 3:
                this.a.g().setRemindSwitch(byk.u(str));
                break;
            case 4:
                this.a.g().setRemindTime(byk.u(str));
                break;
            case 5:
                SleepModelSettings sleepModelSettings = (SleepModelSettings) vd8.b(str, new TypeToken<SleepModelSettings>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.SleepSettingEntity.1
                }.getType());
                if (sleepModelSettings != null) {
                    ISleepDataService iSleepDataService = (ISleepDataService) e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
                    if (iSleepDataService != null) {
                        iSleepDataService.V5(sleepModelSettings);
                    }
                    this.a.p(sleepModelSettings);
                    m8b.f("Sleep-Setting", "Set sleep mode setting=" + sleepModelSettings);
                }
                break;
            case 6:
                this.a.k(byk.u(str));
                break;
            case 7:
                SleepSettingBean.SleepRestSetting sleepRestSetting = (SleepSettingBean.SleepRestSetting) vd8.b(str, new TypeToken<SleepSettingBean.SleepRestSetting>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.SleepSettingEntity.2
                }.getType());
                if (sleepRestSetting != null) {
                    this.a.q(sleepRestSetting);
                    m8b.f("Sleep-Setting", "updateSleepSettingBean USER_REST_NEW=" + this.a.f().toString());
                } else {
                    m8b.b("Sleep-Setting", "updateSleepSettingBean USER_REST_NEW restSetting is null  ");
                }
                break;
            case 8:
                this.a.l(quh.g(str));
                break;
            case 9:
                this.a.d().setSleepGoalTime(byk.u(str));
                break;
            case 10:
                this.a.o(byk.u(str));
                break;
            case 11:
                this.a.n(str);
                break;
            case 12:
                this.a.m(byk.u(str));
                break;
            default:
                m8b.b("Sleep-Setting", "SleepSetting type=" + sportHealthSetting + " Not Support!, Check code or Fix bug");
                break;
        }
    }
}