package com.oplus.aiunit.model;

import android.text.TextUtils;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.hrv.viewmodel.AchievementSkipVM;
import com.heytap.health.protocol.dm.DMProto;
import com.heytap.health.protocol.familydevice.FamilyDeviceProto;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.heytap.health.protocol.iwatch.IWatch;
import com.heytap.health.protocol.userinfo.UserInfoProto;
import com.heytap.health.vision.deviceability.DeviceInfo;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.heytap.wearable.devicemanager.bean.second.PairSecond;
import com.heytap.wearable.music.proto.MusicProto;
import com.heytap.wearable.proto.pair.UeStateInfo;
import com.op.proto.AutoPauseSport;
import com.op.proto.AutoRecognizeSport;
import com.op.proto.BatteryInfoRequester;
import com.op.proto.BindDeviceRequester;
import com.op.proto.CalorieGoal;
import com.op.proto.ECGMeasureType;
import com.op.proto.ExperienceStateProto;
import com.op.proto.HealthVersionInfo;
import com.op.proto.HeartRateMeasure;
import com.op.proto.HeartRateWarn;
import com.op.proto.LaunchWatchApp;
import com.op.proto.OximetryState;
import com.op.proto.QuiteHeartRateWarn;
import com.op.proto.SedentaryReminder;
import com.op.proto.StepGoal;
import com.op.proto.WatchAccountProto;
import com.oplus.aiunit.vision.gpj;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.zy4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
public class mzb {
    public static MessageEvent A(int i, int i2) {
        return new MessageEvent(1, 27, HealthVersionInfo.HealthVersionCode.newBuilder().setVersionCode(i).setPhoneOsType(i2).build().toByteArray());
    }

    public static MessageEvent A0() {
        return new MessageEvent(1, 26, BindDeviceRequester.bind_req_t.newBuilder().setReserved(0).build().toByteArray());
    }

    public static MessageEvent B(boolean z, int i, boolean z2) {
        return new MessageEvent(5, z2 ? 182 : 6, HeartRateWarn.HeartRateWarnData.newBuilder().setEnable(z ? 1 : 0).setHeartRate(i).build().toByteArray());
    }

    public static MessageEvent B0(int i, String str, int i2, int i3) {
        return new MessageEvent(1, 160, DMProto.VoicePacketSummary.newBuilder().setStatus(i).setPacketName(str).setPacketVersion(i2).setPacketSize(i3).build().toByteArray());
    }

    public static MessageEvent C() {
        return new MessageEvent(1, 161, (byte[]) null);
    }

    public static MessageEvent C0(DMProto.ControlCenterData controlCenterData) {
        return new MessageEvent(1, 48, controlCenterData.toByteArray());
    }

    public static MessageEvent D(boolean z) {
        return new MessageEvent(1, 145, IWatch.IWatchConnectResultData.newBuilder().setBindResult(!z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent D0(boolean z) {
        byte[] byteArray = IWatch.CallSwitch.newBuilder().setCallSwitchStatus(!z ? 1 : 0).build().toByteArray();
        StringBuilder sb = new StringBuilder();
        sb.append("setIWatchCallSwitchStatus ");
        sb.append(z);
        return new MessageEvent(1, 148, byteArray);
    }

    public static MessageEvent E() {
        return new MessageEvent(1, 143, IWatch.IWatchDeviceInfo.newBuilder().setAppVersionCode(if0.m()).build().toByteArray());
    }

    public static MessageEvent E0(DMProto.DeviceAppData deviceAppData) {
        return new MessageEvent(1, 75, deviceAppData.toByteArray());
    }

    public static MessageEvent F() {
        return new MessageEvent(1, 157, (byte[]) null);
    }

    public static MessageEvent G(String str) {
        return new MessageEvent(1, 144, IWatch.IWatchBindKey.newBuilder().setBindKey(str).build().toByteArray());
    }

    public static MessageEvent H() {
        return new MessageEvent(1, 146, IWatch.UnBindReq.newBuilder().setCode(1).build().toByteArray());
    }

    public static MessageEvent I() {
        return new MessageEvent(1, 146, IWatch.IWatchResetResult.newBuilder().setResultCode(AchievementSkipVM.SKIP_DEVICE_CODE_SUCCESS).build().toByteArray());
    }

    public static MessageEvent J() {
        return new MessageEvent(1, 137, PairSecond.JumpActivity.newBuilder().setType(1).build().toByteArray());
    }

    public static MessageEvent K(int i, boolean z, int i2) {
        byte[] byteArray = DMProto.SyncPhoneKeepAliveSettings.newBuilder().setKeepAlive(i).setSettingsFinish(z).setSettingsItemState(i2).build().toByteArray();
        return ((Boolean) gd5.c(wl4.managerApi.getCurrentConnectId()).a(new Function1() { // from class: com.oplus.aiunit.vision.lzb
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((DeviceInfo) obj).db());
            }
        })).booleanValue() ? new MessageEvent(1, 1073, byteArray) : new MessageEvent(1, 73, byteArray);
    }

    public static MessageEvent L(String str, String str2) {
        if (str2 == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        return new MessageEvent(1, 31, LaunchWatchApp.LaunchWatchAppMessage.newBuilder().setPackageName(str).setAction(str2).build().toByteArray());
    }

    public static MessageEvent M(int i) {
        return new MessageEvent(5, 217, FitnessProtoV2.MeditationBreathGoalSettingsData.newBuilder().setValue(i).build().toByteArray());
    }

    public static MessageEvent N(boolean z) {
        return new MessageEvent(5, 125, FitnessProtoV2.CycleRemindSettingsData.newBuilder().setValue(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent O(boolean z) {
        return new MessageEvent(8, 16, MusicProto.DeviceMusicControlConfig.newBuilder().setType(1).setShowControlView(z).build().toByteArray());
    }

    public static MessageEvent P() {
        return new MessageEvent(8, 16, MusicProto.DeviceMusicControlConfig.newBuilder().setType(0).build().toByteArray());
    }

    public static MessageEvent Q(List<FitnessProtoV2.AchievementType> list) {
        return new MessageEvent(5, 240, FitnessProtoV2.SettingsSelectedData.newBuilder().addAllType(list).setTime((int) (System.currentTimeMillis() / 1000)).build().toByteArray());
    }

    public static MessageEvent R() {
        return new MessageEvent(11, 11, (byte[]) null);
    }

    public static MessageEvent S() {
        return new MessageEvent(1, 118, (byte[]) null);
    }

    public static MessageEvent T(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 188 : 89, FitnessProto.OsaSwitch.newBuilder().setOsa(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent U(boolean z, int i) {
        return new MessageEvent(5, 22, OximetryState.SleepSetting_t.newBuilder().setSpo2DetectInSleep(z ? 1 : 0).setSpo2DetectInSleepType(i).build().toByteArray());
    }

    public static MessageEvent V(int i, String str) {
        FamilyDeviceProto.FamilyDevicePairInfo.Builder type = FamilyDeviceProto.FamilyDevicePairInfo.newBuilder().setType(i);
        if (!TextUtils.isEmpty(str)) {
            type.setId(str);
        }
        FamilyDeviceProto.FamilyDevicePairInfo familyDevicePairInfoBuild = type.build();
        StringBuilder sb = new StringBuilder();
        sb.append("getPairTypeMessage type:");
        sb.append(i);
        return new MessageEvent(266, 1, familyDevicePairInfoBuild.toByteArray());
    }

    public static MessageEvent W() {
        return new MessageEvent(1, 139, (byte[]) null);
    }

    public static MessageEvent X() {
        return new MessageEvent(1, 74, DMProto.DeviceAppData.newBuilder().build().toByteArray());
    }

    public static MessageEvent Y(boolean z, int i, int i2, boolean z2) {
        return new MessageEvent(5, z2 ? 181 : 19, QuiteHeartRateWarn.QuiteHeartRateWarnData.newBuilder().setSwitch(z ? 1 : 0).setHigh(i).setLow(i2).setDuration(10).build().toByteArray());
    }

    public static MessageEvent Z(int i) {
        return new MessageEvent(1, 18, DMProto.ResetDevice.newBuilder().setResetType(i).build().toByteArray());
    }

    public static MessageEvent a(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 183 : 59, FitnessProto.IntRequest.newBuilder().setValue(z ? 1 : 2).build().toByteArray());
    }

    public static MessageEvent a0(mb5.c cVar) {
        if (cVar == mb5.c.C0149c.INSTANCE) {
            return r0();
        }
        return ((Boolean) gd5.b(wl4.managerApi.j()).a(new zy4())).booleanValue() ? H() : Z(0);
    }

    public static MessageEvent b() {
        return new MessageEvent(1, 20, (byte[]) null);
    }

    public static MessageEvent b0(int i) {
        return new MessageEvent(5, 238, FitnessProtoV2.SettingsCommonData.newBuilder().setValue(i).setTime((int) (System.currentTimeMillis() / 1000)).build().toByteArray());
    }

    public static MessageEvent c(boolean z) {
        return new MessageEvent(5, 221, FitnessProtoV2.AchievementReminderSettingsData.newBuilder().setValue(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent c0(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 177 : 88, FitnessProto.ResumeActivityReminderSwitch.newBuilder().setResumeActivityReminder(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent d(int i, boolean z) {
        return new MessageEvent(5, z ? 175 : 111, FitnessProto.ActivityGoal.newBuilder().setActivityGoal(i).build().toByteArray());
    }

    public static MessageEvent d0(boolean z, int i, int i2, boolean z2, boolean z3) {
        return new MessageEvent(5, z3 ? 176 : 5, SedentaryReminder.SedentaryReminderData.newBuilder().setEnable(z ? 1 : 0).setStartTime(i).setEndTime(i2).setExcludeMidday(z2 ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent e(boolean z, int i, boolean z2) {
        return new MessageEvent(5, z2 ? 178 : 45, FitnessProto.ActivityNotifyState.newBuilder().setSwitchState(z ? 1 : 0).setType(i).build().toByteArray());
    }

    public static MessageEvent e0(boolean z) {
        return new MessageEvent(11, 13, ExperienceStateProto.ExperienceState.newBuilder().setExperienceState(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent f() {
        return new MessageEvent(11, 14, (byte[]) null);
    }

    public static MessageEvent f0(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 190 : 51, FitnessProto.SleepRemConfig.newBuilder().setEnable(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent g(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 191 : 36, AutoPauseSport.AutoPauseSportData.newBuilder().setEnable(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent g0(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 186 : 91, FitnessProto.Spo2AllDayMonitorSwitch.newBuilder().setSpo2AllDayMonitor(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent h(boolean z) {
        return new MessageEvent(5, 30, AutoPauseSport.AutoPauseSportData.newBuilder().setEnable(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent h0(boolean z, int i, boolean z2) {
        return new MessageEvent(5, z2 ? 187 : 92, FitnessProto.Spo2LowWarningSwitch.newBuilder().setSpo2LowWarning(z ? 1 : 0).setSpo2LowWarningValue(i).build().toByteArray());
    }

    public static MessageEvent i(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 192 : 31, AutoRecognizeSport.AutoRecognizeSportData.newBuilder().setEnable(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent i0(int i) {
        return new MessageEvent(5, 216, FitnessProtoV2.SportsGoalSettingsData.newBuilder().setValue(i).build().toByteArray());
    }

    public static MessageEvent j(boolean z, int i, int i2, boolean z2) {
        return new MessageEvent(5, z2 ? 193 : 102, FitnessProto.AutoRecognizeSportType.newBuilder().setSportEnable(z ? 1 : 0).setSportType(i).setSportRecordType(i2).build().toByteArray());
    }

    public static MessageEvent j0(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 194 : 93, FitnessProto.SportsVoiceBroadcastSwitch.newBuilder().setSportsVoiceBroadcast(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent k(String str) {
        return new MessageEvent(1, 99, DMProto.BindKey.newBuilder().setBindKey(str).build().toByteArray());
    }

    public static MessageEvent k0(int i, boolean z) {
        return new MessageEvent(5, z ? 172 : 1, StepGoal.StepGoalData.newBuilder().setGoalStep(i).build().toByteArray());
    }

    public static MessageEvent l(int i, boolean z, int i2, String str) {
        return new MessageEvent(5, 118, FitnessProto.BloodSugarSetting.newBuilder().setType(i).setEnable(z ? 1 : 0).setValue(i2).setTime(str).build().toByteArray());
    }

    public static MessageEvent l0(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 185 : 44, FitnessProto.IntRequest.newBuilder().setValue(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent m(String str, int i, int i2, int i3, int i4, long j, int i5) {
        if (str.length() != 8) {
            return null;
        }
        int i6 = Byte.parseByte(str.substring(6)) | (Short.parseShort(str.substring(0, 4)) << 16) | (Byte.parseByte(str.substring(4, 6)) << 8);
        if (x0()) {
            i3 = i3 == 1 ? 1 : 2;
        }
        byte[] byteArray = UserInfoProto.UserInfo.newBuilder().setAge(i6).setHeight(i).setWeight(i2).setSex(i3).setWeightOfg(i4).setModifierTime(j).setBloodPressureType(i5).build().toByteArray();
        return x0() ? new MessageEvent(5, 242, byteArray) : new MessageEvent(5, 3, byteArray);
    }

    public static MessageEvent m0(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 184 : 38, FitnessProto.IntRequest.newBuilder().setValue(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent n(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 189 : 90, FitnessProto.BreatheRateSwitch.newBuilder().setBreatheRate(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent n0(int i) {
        return new MessageEvent(5, 239, FitnessProtoV2.SettingsCommonData.newBuilder().setValue(i).setTime((int) (System.currentTimeMillis() / 1000)).build().toByteArray());
    }

    public static MessageEvent o(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 196 : 94, FitnessProto.ButtonToPauseOrResumeSwitch.newBuilder().setButtonToPauseOrResume(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent o0() {
        return new MessageEvent(1, 164, (byte[]) null);
    }

    public static MessageEvent p(int i, boolean z) {
        return new MessageEvent(5, z ? 173 : 2, CalorieGoal.CalorieGoalData.newBuilder().setGoalCalorie(i).build().toByteArray());
    }

    public static MessageEvent p0() {
        return new MessageEvent(1, 16, (byte[]) null);
    }

    public static MessageEvent q(String str) {
        return new MessageEvent(1, ((Boolean) gd5.c(str).a(new zy4())).booleanValue() ? 147 : 8, BatteryInfoRequester.BatteryInfoRequesterData.newBuilder().setDeviceBtMac(str).build().toByteArray());
    }

    public static MessageEvent q0(boolean z) {
        return new MessageEvent(1, 17, UeStateInfo.newBuilder().setUeState(z ? 1 : 0).build().toByteArray());
    }

    @NotNull
    public static MessageEvent r(String str, String str2) {
        int i;
        if (gpj.x()) {
            cm4.a("MessageEventBuild", "current phone is linkage phone");
            i = 1;
        } else {
            i = 0;
        }
        return new MessageEvent(1, 7, DMProto.DeviceInfoRequesterData.newBuilder().setDeviceBtMac(str2).setLinkagePhone(i).setDevicePhoneNumber(str).build().toByteArray());
    }

    public static MessageEvent r0() {
        return new MessageEvent(1, 140, DMProto.ResetDevice.newBuilder().setResetType(0).build().toByteArray());
    }

    public static MessageEvent s(boolean z) {
        return new MessageEvent(5, 226, FitnessProto.StatusReq.newBuilder().setValue(z ? 1 : 0).setType(1).build().toByteArray());
    }

    public static MessageEvent s0() {
        return new MessageEvent(1, 159, (byte[]) null);
    }

    public static MessageEvent t() {
        return new MessageEvent(1, 47, DMProto.ControlCenterData.newBuilder().build().toByteArray());
    }

    public static MessageEvent t0(String str, int i) {
        return new MessageEvent(1, 51, WatchAccountProto.WatchAccountData.newBuilder().setAccountToken(str).setPkgName(BaseApplication.a().getPackageName()).setVerifyStatus(i).build().toByteArray());
    }

    public static MessageEvent u(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 195 : 112, FitnessProto.ActivityNotifyState.newBuilder().setSwitchState(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent u0(String str) {
        return new MessageEvent(1, 48, WatchAccountProto.WatchAccountData.newBuilder().setAccountToken(str).setPkgName(BaseApplication.a().getPackageName()).build().toByteArray());
    }

    public static MessageEvent v(int i, int i2) {
        return new MessageEvent(5, 26, ECGMeasureType.ecg_measure_type_request_set_t.newBuilder().setMeasureType(i).setCapSensorType(i2).build().toByteArray());
    }

    public static MessageEvent v0(int i) {
        return new MessageEvent(5, 55, FitnessProto.WeightGoal.newBuilder().setWeight(i).build().toByteArray());
    }

    public static MessageEvent w(boolean z) {
        return new MessageEvent(5, 226, FitnessProto.StatusReq.newBuilder().setValue(z ? 1 : 0).setType(2).build().toByteArray());
    }

    public static MessageEvent w0(boolean z) {
        return new MessageEvent(5, 127, FitnessProto.WristTemperatureSetting.newBuilder().setEnable(z ? 1 : 0).build().toByteArray());
    }

    public static MessageEvent x(int i, boolean z) {
        return new MessageEvent(5, z ? 174 : 110, FitnessProto.ExerciseTimeGoal.newBuilder().setExerciseTimeGoal(i).build().toByteArray());
    }

    public static boolean x0() {
        return udj.a(wl4.managerApi.getCurrentConnectId()).k3();
    }

    public static MessageEvent y(boolean z, boolean z2) {
        return new MessageEvent(5, z2 ? 179 : 63, FitnessProto.IntRequest.newBuilder().setValue(z ? 1 : 2).build().toByteArray());
    }

    public static MessageEvent y0() {
        return new MessageEvent(1, 165, (byte[]) null);
    }

    public static MessageEvent z(boolean z, int i, boolean z2) {
        return new MessageEvent(5, z2 ? 180 : 4, HeartRateMeasure.HeartRateMeasureData.newBuilder().setSw(z ? 1 : 0).setInterval(i).build().toByteArray());
    }

    public static MessageEvent z0() {
        return new MessageEvent(1, 160, DMProto.VoicePacketSummary.newBuilder().setStatus(2).build().toByteArray());
    }
}
