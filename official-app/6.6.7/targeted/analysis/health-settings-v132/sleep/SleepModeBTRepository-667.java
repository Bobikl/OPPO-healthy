package com.heytap.device.sleep;

import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.ash;
import com.oplus.aiunit.vision.gd5;
import com.oplus.aiunit.vision.hii;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.lhi;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import com.oplus.aiunit.vision.quh;
import com.oplus.aiunit.vision.v2e;
import com.oplus.aiunit.vision.vd8;
import com.oplus.aiunit.vision.yei;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/device/sleep/SleepModeBTRepository;", kq5.NOT_SET, "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepModeBTRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SleepModeBTRepository";

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0007J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\u001f\u001a\u00020\u0007H\u0007J\b\u0010 \u001a\u00020\u0007H\u0007J.\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020&0%H\u0007J\u0018\u0010*\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0015H\u0002R\u0014\u0010+\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/heytap/device/sleep/SleepModeBTRepository$Companion;", kq5.NOT_SET, kq5.NOT_SET, "n", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRestSetting;", "rest", "q", kq5.NOT_SET, "isMcuSetting", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "g", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRemind;", "stayUpRemind", "r", "i", "bedTimeRemind", "m", "a", "isCloseMusic", "l", "b", kq5.NOT_SET, "time", "p", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "setting", "d", "o", "c", "sleepGoal", "e", "k", "j", "Lcom/heytap/wsport/data/SleepSettingBean;", "bean", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "type", kq5.NOT_SET, kq5.NOT_SET, "data", "h", "cid", "f", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SportHealthSetting.values().length];
                try {
                    iArr[SportHealthSetting.BED_TIME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SportHealthSetting.BED_TIME_SWITCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SportHealthSetting.STAY_UP_BED_TIME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SportHealthSetting.STAY_UP_BED_TIME_SWITCH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SportHealthSetting.SLEEP_MODEL_SETTINGS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SportHealthSetting.CLOSE_MUSIC.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[SportHealthSetting.USER_REST_NEW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[SportHealthSetting.SLEEP_GOAL.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MessageEvent a(@NotNull SleepSettingBean.SleepRemind bedTimeRemind, boolean isMcuSetting) {
            Intrinsics.checkNotNullParameter(bedTimeRemind, "bedTimeRemind");
            return new MessageEvent(5, isMcuSetting ? hii.SHOULDER_TRAINING : 77, ash.n(bedTimeRemind).toByteArray());
        }

        @JvmStatic
        @NotNull
        public final MessageEvent b(boolean isCloseMusic, boolean isMcuSetting) {
            return new MessageEvent(5, isMcuSetting ? hii.FENCING : 76, FitnessProto.CloseMusic.newBuilder().setCloseMusic(isCloseMusic ? 1 : 0).build().toByteArray());
        }

        @JvmStatic
        @NotNull
        public final MessageEvent c(@NotNull SleepModelSettings setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            return f(setting, j() ? hii.CLIMBER : 73);
        }

        @JvmStatic
        @NotNull
        public final MessageEvent d(@NotNull SleepModelSettings setting, boolean isMcuSetting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            return f(setting, isMcuSetting ? hii.ABDOMINAL_TRAINING : 74);
        }

        @JvmStatic
        @NotNull
        public final MessageEvent e(int sleepGoal, boolean isMcuSetting) {
            return new MessageEvent(5, isMcuSetting ? 210 : 81, FitnessProto.SleepGoal.newBuilder().setSleepGoalTime(sleepGoal).build().toByteArray());
        }

        public final MessageEvent f(SleepModelSettings setting, int cid) {
            return new MessageEvent(5, cid, ash.o(setting).toByteArray());
        }

        @JvmStatic
        @NotNull
        public final MessageEvent g(@NotNull SleepSettingBean.SleepRestSetting rest, boolean isMcuSetting) {
            FitnessProto.SleepSetting sleepSettingP;
            Intrinsics.checkNotNullParameter(rest, "rest");
            boolean zF = ash.f();
            if (zF) {
                sleepSettingP = ash.p(rest);
            } else {
                SleepRestRepository sleepRestRepository = SleepRestRepository.INSTANCE;
                List<? extends SleepSettingBean.SleepRest> sleepRests = rest.getSleepRests();
                Intrinsics.checkNotNullExpressionValue(sleepRests, "rest.sleepRests");
                sleepSettingP = ash.m(sleepRestRepository.n(sleepRestRepository.d(sleepRests)));
            }
            m8b.f(SleepModeBTRepository.TAG, "Build sleep rest pb msg, supportMultipleRest=" + zF + " restSize=" + rest.getSleepRests().size());
            return new MessageEvent(5, isMcuSetting ? hii.CORE_TRAINING : 75, sleepSettingP.toByteArray());
        }

        @JvmStatic
        @Nullable
        public final MessageEvent h(@NotNull SleepSettingBean bean, @NotNull SportHealthSetting type, @NotNull Map<SportHealthSetting, String> data) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean zJ = j();
            switch (a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    SleepSettingBean.SleepRemind sleepRemind = new SleepSettingBean.SleepRemind();
                    sleepRemind.setRemindTime(quh.g(data.get(type)));
                    String str = data.get(SportHealthSetting.BED_TIME_SWITCH);
                    if (str == null || str.length() == 0) {
                        sleepRemind.setRemindSwitch(bean.a().getRemindSwitch());
                    } else {
                        sleepRemind.setRemindSwitch(quh.g(str));
                    }
                    return a(sleepRemind, zJ);
                case 2:
                    SleepSettingBean.SleepRemind sleepRemind2 = new SleepSettingBean.SleepRemind();
                    String str2 = data.get(SportHealthSetting.BED_TIME);
                    if (str2 == null || str2.length() == 0) {
                        sleepRemind2.setRemindTime(bean.a().getRemindTime());
                    } else {
                        sleepRemind2.setRemindTime(quh.g(str2));
                    }
                    sleepRemind2.setRemindSwitch(quh.g(data.get(type)));
                    return a(sleepRemind2, zJ);
                case 3:
                    SleepSettingBean.SleepRemind sleepRemind3 = new SleepSettingBean.SleepRemind();
                    sleepRemind3.setRemindTime(quh.g(data.get(type)));
                    String str3 = data.get(SportHealthSetting.STAY_UP_BED_TIME_SWITCH);
                    if (str3 == null || str3.length() == 0) {
                        sleepRemind3.setRemindSwitch(bean.g().getRemindSwitch());
                    } else {
                        sleepRemind3.setRemindSwitch(quh.g(str3));
                    }
                    return i(sleepRemind3);
                case 4:
                    SleepSettingBean.SleepRemind sleepRemind4 = new SleepSettingBean.SleepRemind();
                    String str4 = data.get(SportHealthSetting.STAY_UP_BED_TIME);
                    if (str4 == null || str4.length() == 0) {
                        sleepRemind4.setRemindTime(bean.g().getRemindTime());
                    } else {
                        sleepRemind4.setRemindTime(quh.g(str4));
                    }
                    sleepRemind4.setRemindSwitch(quh.g(data.get(type)));
                    return i(sleepRemind4);
                case 5:
                    SleepModelSettings sleepModelSettings = (SleepModelSettings) vd8.a(data.get(type), SleepModelSettings.class);
                    if (sleepModelSettings != null) {
                        return d(sleepModelSettings, zJ);
                    }
                    return null;
                case 6:
                    return b(quh.g(data.get(type)) == 1, zJ);
                case 7:
                    SleepSettingBean.SleepRestSetting sleepRestSetting = (SleepSettingBean.SleepRestSetting) vd8.a(data.get(type), SleepSettingBean.SleepRestSetting.class);
                    if (sleepRestSetting != null) {
                        return g(sleepRestSetting, zJ);
                    }
                    return null;
                case 8:
                    return e(quh.g(data.get(type)), zJ);
                default:
                    return null;
            }
        }

        @JvmStatic
        @NotNull
        public final MessageEvent i(@NotNull SleepSettingBean.SleepRemind stayUpRemind) {
            Intrinsics.checkNotNullParameter(stayUpRemind, "stayUpRemind");
            return new MessageEvent(5, 78, ash.q(stayUpRemind).toByteArray());
        }

        @JvmStatic
        public final boolean j() {
            return yei.a(ash.a()).e2();
        }

        @JvmStatic
        public final boolean k() {
            return ((Boolean) gd5.c(ash.a()).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.sleep.SleepModeBTRepository$Companion$isWatchFree$1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo deviceInfo) {
                    Intrinsics.checkNotNullParameter(deviceInfo, "$this$applyInfo");
                    return Boolean.valueOf(deviceInfo.ha());
                }
            })).booleanValue();
        }

        @JvmStatic
        public final void l(boolean isCloseMusic) {
            m8b.f(SleepModeBTRepository.TAG, "Send Msg Close music  to devices, isClose=" + isCloseMusic);
            qr0.w().R(b(isCloseMusic, j()));
        }

        @JvmStatic
        public final void m(@NotNull SleepSettingBean.SleepRemind bedTimeRemind) {
            Intrinsics.checkNotNullParameter(bedTimeRemind, "bedTimeRemind");
            if (bedTimeRemind.getRemindSwitch() == -1 || bedTimeRemind.getRemindTime() == -1) {
                return;
            }
            MessageEvent messageEventA = a(bedTimeRemind, j());
            m8b.f(SleepModeBTRepository.TAG, "Send Msg BED_TIME to devices =" + v2e.b(bedTimeRemind));
            qr0.w().R(messageEventA);
        }

        @JvmStatic
        public final void n() {
            if (ash.e() && lhi.b(ash.a())) {
                return;
            }
            qr0.w().R(new MessageEvent(5, 80, FitnessProto.IntRequest.newBuilder().setValue(100000).build().toByteArray()));
        }

        public final void o(@NotNull SleepModelSettings setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            SleepModelSettings sleepModelSettingsM18clone = setting.m18clone();
            Intrinsics.checkNotNullExpressionValue(sleepModelSettingsM18clone, "setting.clone()");
            sleepModelSettingsM18clone.setTimestamp(0L);
            qr0.w().R(c(sleepModelSettingsM18clone));
        }

        public final void p(int time) {
            boolean zJ = j();
            m8b.f(SleepModeBTRepository.TAG, "Send sleep goal to device, goal=" + time + " isMcu=" + zJ);
            qr0.w().R(e(time, zJ));
        }

        @JvmStatic
        public final void q(@Nullable SleepSettingBean.SleepRestSetting rest) {
            if (!qr0.w().z()) {
                m8b.f(SleepModeBTRepository.TAG, "Send sleep rest to device fail, device not connect");
                return;
            }
            if (rest == null) {
                m8b.f(SleepModeBTRepository.TAG, "Send sleep rest to device fail, rest is null");
                return;
            }
            m8b.f(SleepModeBTRepository.TAG, "Send sleep rest to device, rest=" + rest);
            qr0.w().R(g(rest, j()));
        }

        @JvmStatic
        public final void r(@NotNull SleepSettingBean.SleepRemind stayUpRemind) {
            Intrinsics.checkNotNullParameter(stayUpRemind, "stayUpRemind");
            if (stayUpRemind.getRemindSwitch() == -1 || stayUpRemind.getRemindTime() == -1) {
                return;
            }
            m8b.f(SleepModeBTRepository.TAG, "Send Msg Stay up BED_TIME to devices =" + v2e.b(stayUpRemind));
            qr0.w().R(i(stayUpRemind));
        }
    }
}