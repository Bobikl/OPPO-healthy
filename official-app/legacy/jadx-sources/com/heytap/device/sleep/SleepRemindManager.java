package com.heytap.device.sleep;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.UserPreference;
import com.heytap.device.sleep.SleepRemindManager;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.protocol.fitness.FitnessProto$RemindPopUp;
import com.heytap.health.protocol.fitness.FitnessProto$SleepStateChangeNotify;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.NewSleepRest;
import com.oplus.aiunit.vision.a1e;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ad5;
import com.oplus.aiunit.vision.ao0;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ioh;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.joh;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.pvc;
import com.oplus.aiunit.vision.qs;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.tqg;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.weg;
import com.oplus.aiunit.vision.ykh;
import com.oplus.aiunit.vision.zqh;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class SleepRemindManager implements rl4.b {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3014j;
    public SleepSettingBean.SleepRestSetting k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ykh f3015l;

    public class a implements Runnable {
        public final /* synthetic */ SportHealthSetting i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f3016j;
        public final /* synthetic */ CountDownLatch k;

        public a(SportHealthSetting sportHealthSetting, boolean z, CountDownLatch countDownLatch) {
            this.i = sportHealthSetting;
            this.f3016j = z;
            this.k = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            SportHealthSetting sportHealthSetting = this.i;
            SleepRemindManager.this.r(this.i, sportHealthSetting == SportHealthSetting.USER_REST_NEW ? SleepModeRepository.c(this.f3016j) : SleepModeRepository.b(sportHealthSetting, true, this.f3016j));
            this.k.countDown();
            if (this.k.getCount() == 0) {
                SleepRemindManager.this.l();
            }
        }
    }

    public class b extends ao0<Pair<SportHealthSetting, String>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ FitnessProto$RemindPopUp f3018j;

        public b(FitnessProto$RemindPopUp fitnessProto$RemindPopUp) {
            this.f3018j = fitnessProto$RemindPopUp;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Pair<SportHealthSetting, String> pair) {
            SleepRemindManager.this.r((SportHealthSetting) pair.first, (String) pair.second);
            onComplete();
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onComplete() {
            super.onComplete();
            if (!pvc.c(b78.a())) {
                a7b.b("SleepRemindMgr", "Show sleep remind notification, but have no permission");
                return;
            }
            FitnessProto$RemindPopUp fitnessProto$RemindPopUpN = SleepRemindManager.this.n(this.f3018j.getPopUpType(), SleepRemindManager.this.j(this.f3018j.getBedTime(), SleepRemindManager.this.f3014j), this.f3018j.getWakeUpTime());
            a7b.f("SleepRemindMgr", "Show sleep remind notification, RemindPopUP=" + a1e.b(fitnessProto$RemindPopUpN));
            SleepRemindManager.this.f3015l.b(fitnessProto$RemindPopUpN);
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            super.onError(th);
            onComplete();
        }
    }

    public static /* synthetic */ class c {
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
                a[SportHealthSetting.USER_REST_NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class d {
        public static final SleepRemindManager a = new SleepRemindManager();
    }

    public static void k(String str) {
        a7b.f("SleepRemindMgr", "cancelRemindAlarm， reason=" + str);
        Context contextA = b78.a();
        Intent intent = new Intent(tqg.SLEEP_REMINDER);
        intent.setPackage(contextA.getPackageName());
        ((AlarmManager) contextA.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(PendingIntent.getBroadcast(contextA, SpeechErrorCode.MSP_ERROR_LOGIN_UNLOGIN, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728));
    }

    public static SleepRemindManager p() {
        return d.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        C(z());
    }

    public static /* synthetic */ jdd v(SportHealthSetting sportHealthSetting, CommonBackBean commonBackBean) throws Throwable {
        if (commonBackBean.getErrorCode() == 0) {
            a7b.f("SleepRemindMgr", "On SleepSoundManager read success: " + sportHealthSetting.name());
            ArrayList arrayList = (ArrayList) commonBackBean.getObj();
            if (arrayList != null && arrayList.size() != 0 && !TextUtils.isEmpty(((UserPreference) arrayList.get(0)).getValue())) {
                String value = ((UserPreference) arrayList.get(0)).getValue();
                a7b.f("SleepRemindMgr", "Read preference Sleep model success, value=" + value);
                return lbd.h0(Pair.create(sportHealthSetting, value));
            }
        }
        String strB = joh.b(sportHealthSetting);
        a7b.f("SleepRemindMgr", "Read preference is empty, name=" + sportHealthSetting.name() + ", use defaultValue=" + strB);
        return lbd.h0(Pair.create(sportHealthSetting, strB));
    }

    public void A(FitnessProto$RemindPopUp fitnessProto$RemindPopUp, boolean z) {
        if (z && ((Boolean) lc5.c(joh.a()).a(new ioh())).booleanValue()) {
            this.f3015l.b(fitnessProto$RemindPopUp);
            return;
        }
        a7b.f("SleepRemindMgr", "showSleepNotification  isDeviceSend=" + z);
        y(SportHealthSetting.BED_TIME).subscribe(new b(fitnessProto$RemindPopUp));
    }

    public final void B() {
        if (!s()) {
            k("Update bed remind, remind switch is close");
            return;
        }
        SleepSettingBean.SleepRestSetting sleepRestSetting = this.k;
        if (sleepRestSetting == null) {
            k("Update bed remind, rest is null");
            return;
        }
        List<SleepSettingBean.SleepRest> sleepRests = sleepRestSetting.getSleepRests();
        List<NewSleepRest> listM = SleepRestRepository.INSTANCE.m(sleepRests);
        a7b.f("SleepRemindMgr", "Merge rest, oldSize=}" + sleepRests.size() + " newSize=" + listM.size());
        NewSleepRest newSleepRestO = o(listM);
        if (newSleepRestO == null) {
            a7b.f("SleepRemindMgr", "Update remind next rest not found");
            return;
        }
        a7b.f("SleepRemindMgr", "Sleep remind found next rest=" + newSleepRestO);
        long jU = newSleepRestO.u();
        if (jU < 7200000) {
            a7b.f("SleepRemindMgr", "Found next rest, but gap < 2 hours");
            return;
        }
        long timeInMillis = newSleepRestO.f().getTimeInMillis();
        long jCurrentTimeMillis = (timeInMillis - System.currentTimeMillis()) - ((((long) zqh.h(this.f3014j)) * 60) * 1000);
        if (jCurrentTimeMillis <= 0) {
            a7b.f("SleepRemindMgr", "Found next rest, but interval <= 0");
            return;
        }
        a7b.f("SleepRemindMgr", "Create remind alarm, interval=" + jCurrentTimeMillis + ", bedTime=" + newSleepRestO.getBedTimeStr() + " wakeUp=" + newSleepRestO.getWakeUpTimeStr() + " gap=" + jU + " realBedTime=" + timeInMillis);
        m(FitnessProto$RemindPopUp.PopUpType.BED_TIME, newSleepRestO.getBedTime(), newSleepRestO.getWakeUpTime(), jCurrentTimeMillis);
    }

    public void C(final boolean z) {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.tmh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.w(z);
            }
        });
    }

    public final int j(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        int iA = zqh.a(i2);
        int iB = zqh.b(i2);
        int iA2 = zqh.a(i);
        int iB2 = ((i < i2 ? weg.WINDOW_NIGHT_END : 0) + ((iA2 * 60) + zqh.b(i))) - ((iA * 60) + iB);
        return zqh.c(iB2 / 60, iB2 % 60);
    }

    public final void l() {
        ThreadUtils.doInBackground("SleepRemind", new Runnable() { // from class: com.oplus.aiunit.vision.vmh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.B();
            }
        });
    }

    public final void m(FitnessProto$RemindPopUp.PopUpType popUpType, int i, int i2, long j2) {
        a7b.f("SleepRemindMgr", "createRemindAlarm, timeInterval=" + j2);
        Context contextA = b78.a();
        Intent intent = new Intent(tqg.SLEEP_REMINDER);
        intent.setPackage(contextA.getPackageName());
        intent.putExtra("SLEEP_REMIND_TYPE", popUpType.getNumber());
        intent.putExtra("SLEEP_REMIND_BED_TIME", i);
        intent.putExtra("SLEEP_REMIND_WAKE_UP_TIME", i2);
        qs.a((AlarmManager) contextA.getSystemService(NotificationCompat.CATEGORY_ALARM), 0, System.currentTimeMillis() + j2, PendingIntent.getBroadcast(contextA, SpeechErrorCode.MSP_ERROR_LOGIN_UNLOGIN, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728));
    }

    public FitnessProto$RemindPopUp n(FitnessProto$RemindPopUp.PopUpType popUpType, int i, int i2) {
        return FitnessProto$RemindPopUp.newBuilder().setBedTime(i).setWakeUpTime(i2).setPopUpType(popUpType).setPopUpTypeValue(popUpType.getNumber()).build();
    }

    public final NewSleepRest o(List<NewSleepRest> list) {
        List<NewSleepRest> arrayList = new ArrayList<>(list);
        while (true) {
            SleepRestRepository sleepRestRepository = SleepRestRepository.INSTANCE;
            NewSleepRest newSleepRestG = sleepRestRepository.g(arrayList);
            if (newSleepRestG == null) {
                return null;
            }
            if (!newSleepRestG.s() || !sleepRestRepository.i(newSleepRestG)) {
                return newSleepRestG;
            }
            a7b.f("SleepRemindMgr", "Update remind next rest is holiday=" + newSleepRestG);
            arrayList.remove(newSleepRestG);
        }
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NotNull String str, @NotNull MessageEvent messageEvent) {
        try {
            if (FitnessProto$SleepStateChangeNotify.parseFrom(messageEvent.getData()).getState() == 1) {
                this.f3015l.d();
            }
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("SleepRemindMgr", "Parse sleep state msg fail=" + e2);
        }
    }

    public final List<SportHealthSetting> q() {
        return Arrays.asList(SportHealthSetting.BED_TIME_SWITCH, SportHealthSetting.BED_TIME, SportHealthSetting.USER_REST_NEW);
    }

    public final void r(SportHealthSetting sportHealthSetting, String str) {
        int i = c.a[sportHealthSetting.ordinal()];
        if (i == 1) {
            this.i = zqh.f(str);
        } else if (i == 2) {
            this.f3014j = zqh.g(str);
        } else {
            if (i != 3) {
                return;
            }
            this.k = (SleepSettingBean.SleepRestSetting) sc8.b(str, new TypeToken<SleepSettingBean.SleepRestSetting>() { // from class: com.heytap.device.sleep.SleepRemindManager.3
            }.getType());
        }
    }

    public final boolean s() {
        SleepSettingBean.SleepRestSetting sleepRestSetting = this.k;
        return sleepRestSetting != null && sleepRestSetting.isSleepRestSwitch() && this.i;
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void w(boolean z) {
        k("Update remind cancel first");
        CountDownLatch countDownLatch = new CountDownLatch(q().size());
        Iterator<SportHealthSetting> it = q().iterator();
        while (it.hasNext()) {
            ThreadUtils.doInBackground("SleepRemind", new a(it.next(), z, countDownLatch));
        }
    }

    @SuppressLint({"CheckResult"})
    public final lbd<Pair<SportHealthSetting, String>> y(final SportHealthSetting sportHealthSetting) {
        return SportHealthDataAPI.getInstance().getUserPreferenceNew(um.c().getSsoid(), sportHealthSetting.name(), "", true).L0(su8.c()).n0(f30.c()).Q(new d08() { // from class: com.oplus.aiunit.vision.umh
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return SleepRemindManager.v(sportHealthSetting, (CommonBackBean) obj);
            }
        });
    }

    public final boolean z() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = v9g.w().B(ad5.SP_KEY_SLEEP_REMIND_LAST_FORCE_CLOUD_QUERY_TIME, 0L);
        long j2 = jCurrentTimeMillis - jB;
        boolean z = j2 >= 43200000;
        a7b.f("SleepRemindMgr", "Init update remind, lastForceQueryTime=" + jB + ", interval=" + j2 + ", needForceLoadFromCloud=" + z);
        if (z) {
            v9g.w().T(ad5.SP_KEY_SLEEP_REMIND_LAST_FORCE_CLOUD_QUERY_TIME, jCurrentTimeMillis);
        }
        return z;
    }

    public SleepRemindManager() {
        a7b.f("SleepRemindMgr", "SleepRemindManager init");
        this.f3015l = new ykh();
        gl4.devicePrimary.messageApi.f(5, 32, this);
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.smh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.u();
            }
        });
    }
}
