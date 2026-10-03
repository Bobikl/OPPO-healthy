package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.device_settings.entity.DeviceParam;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepSettingViewModel;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.model.byk;
import com.oplus.aiunit.model.dz9;
import com.oplus.aiunit.model.ez9;
import com.oplus.aiunit.model.gz9;
import com.oplus.aiunit.model.qrh;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gi8;
import com.oplus.aiunit.vision.m8b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
public class SleepSettingViewModel extends SHSettingViewModel implements gz9, ez9 {
    public qrh q;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportHealthSetting.values().length];
            a = iArr;
            try {
                iArr[SportHealthSetting.USER_REST_NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SportHealthSetting.BED_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SportHealthSetting.BED_TIME_SWITCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportHealthSetting.STAY_UP_BED_TIME_SWITCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportHealthSetting.SLEEP_MODEL_SETTINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static /* synthetic */ void e0(gz9 gz9Var, SportHealthSetting sportHealthSetting, MutableLiveData mutableLiveData, SportHealthSetting sportHealthSetting2, int i) {
        gz9Var.g(sportHealthSetting, i);
        mutableLiveData.postValue(Integer.valueOf(i));
    }

    public static /* synthetic */ void f0(MutableLiveData mutableLiveData, SportHealthSetting sportHealthSetting, int i) {
        mutableLiveData.postValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(MutableLiveData mutableLiveData, int i) {
        if (i == 0) {
            m0();
        }
        mutableLiveData.postValue(Integer.valueOf(i));
    }

    public static /* synthetic */ void h0(SportHealthSetting sportHealthSetting, int i) {
        m8b.f("Sleep-Setting", "Delete all old rest result=" + i);
    }

    public static /* synthetic */ boolean i0(List list, SleepSettingBean.SleepRest sleepRest) {
        return list.contains(Long.valueOf(sleepRest.getCreateTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(MutableLiveData mutableLiveData, SportHealthSetting sportHealthSetting, int i) {
        mutableLiveData.postValue(Integer.valueOf(i));
        if (i == 0) {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(SportHealthSetting sportHealthSetting) {
        E().setValue(sportHealthSetting);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel
    public boolean G() {
        return this.q.p();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel
    public void K() {
        this.q.h(this);
        this.q.f(this);
        if (this.q.p()) {
            return;
        }
        this.q.w();
    }

    public final SleepSettingBean.SleepRestSetting V(SleepSettingBean.SleepRest sleepRest, int i) {
        ArrayList arrayList = new ArrayList(c0().h());
        if (i == 1) {
            arrayList.add(sleepRest);
        } else if (i == 2) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((SleepSettingBean.SleepRest) arrayList.get(i2)).getCreateTime() == sleepRest.getCreateTime()) {
                    arrayList.set(i2, sleepRest);
                    break;
                }
            }
        }
        SleepSettingBean.SleepRestSetting sleepRestSetting = new SleepSettingBean.SleepRestSetting();
        sleepRestSetting.setSleepRests(arrayList);
        return sleepRestSetting;
    }

    @SuppressLint({"CheckResult"})
    public LiveData<Integer> W(final SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map, @NonNull final gz9 gz9Var) {
        super.w(sportHealthSetting, map);
        m8b.f("Sleep-Setting", "changeSetting type name  =" + sportHealthSetting.name());
        final MutableLiveData mutableLiveData = new MutableLiveData();
        this.q.i(sportHealthSetting, map, new gz9() { // from class: com.oplus.aiunit.vision.fsh
            @Override // com.oplus.aiunit.model.gz9
            public final void g(SportHealthSetting sportHealthSetting2, int i) {
                SleepSettingViewModel.e0(gz9Var, sportHealthSetting, mutableLiveData, sportHealthSetting2, i);
            }
        });
        return mutableLiveData;
    }

    public LiveData<Integer> X(SleepSettingBean.SleepRest sleepRest, int i) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        m8b.f("Sleep-Setting", "Change sleep rest editType=" + i + ", rest :" + sleepRest.toString());
        SleepSettingBean.SleepRestSetting sleepRestSettingV = V(sleepRest, i);
        HashMap map = new HashMap();
        SportHealthSetting sportHealthSetting = SportHealthSetting.USER_REST_NEW;
        map.put(sportHealthSetting, byk.t(sleepRestSettingV));
        super.w(sportHealthSetting, map);
        this.q.j(map, new dz9() { // from class: com.oplus.aiunit.vision.bsh
            @Override // com.oplus.aiunit.model.dz9
            public final void a(int i2) {
                this.a.g0(mutableLiveData, i2);
            }
        });
        return mutableLiveData;
    }

    public List<Integer> Y(SleepSettingBean.SleepRest sleepRest, int i) {
        ISleepDataService iSleepDataService = (ISleepDataService) e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
        return iSleepDataService != null ? iSleepDataService.R4(b0(), sleepRest, i) : new ArrayList();
    }

    public final void Z() {
        HashMap map = new HashMap();
        SleepSettingBean.SleepRestSetting sleepRestSetting = new SleepSettingBean.SleepRestSetting();
        SportHealthSetting sportHealthSetting = SportHealthSetting.USER_REST;
        map.put(sportHealthSetting, GsonUtil.e(sleepRestSetting));
        this.q.C(sportHealthSetting, map, new gz9() { // from class: com.oplus.aiunit.vision.hsh
            @Override // com.oplus.aiunit.model.gz9
            public final void g(SportHealthSetting sportHealthSetting2, int i) {
                SleepSettingViewModel.h0(sportHealthSetting2, i);
            }
        });
    }

    public LiveData<Integer> a0(final List<Long> list) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        SleepSettingBean sleepSettingBeanO = this.q.o();
        List sleepRests = sleepSettingBeanO.f().getSleepRests();
        sleepRests.removeIf(new Predicate() { // from class: com.oplus.aiunit.vision.dsh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SleepSettingViewModel.i0(list, (SleepSettingBean.SleepRest) obj);
            }
        });
        HashMap map = new HashMap();
        SportHealthSetting sportHealthSetting = SportHealthSetting.USER_REST_NEW;
        map.put(sportHealthSetting, byk.t(sleepSettingBeanO.f()));
        W(sportHealthSetting, map, new gz9() { // from class: com.oplus.aiunit.vision.esh
            @Override // com.oplus.aiunit.model.gz9
            public final void g(SportHealthSetting sportHealthSetting2, int i) {
                this.i.j0(mutableLiveData, sportHealthSetting2, i);
            }
        });
        if (sleepRests.isEmpty()) {
            Z();
        }
        return mutableLiveData;
    }

    public List<SleepSettingBean.SleepRest> b0() {
        return c0().h();
    }

    public SleepSettingBean c0() {
        return this.q.o();
    }

    public void d0(DeviceParam deviceParam) {
        super.F(deviceParam);
        qrh qrhVarM = qrh.m(deviceParam.deviceMac);
        this.q = qrhVarM;
        if (qrhVarM == null) {
            qrhVarM.H(deviceParam.deviceBleMac);
        }
    }

    @Override // com.oplus.aiunit.model.gz9
    public void g(final SportHealthSetting sportHealthSetting, int i) {
        gi8.b(new Runnable() { // from class: com.oplus.aiunit.vision.gsh
            @Override // java.lang.Runnable
            public final void run() {
                this.i.k0(sportHealthSetting);
            }
        });
    }

    @Override // com.oplus.aiunit.model.ez9
    public void l(SportHealthSetting sportHealthSetting) {
        m8b.f("Sleep-Setting", "cloud change item: " + sportHealthSetting.name() + ", value: " + c0().e());
        HashMap map = new HashMap();
        switch (a.a[sportHealthSetting.ordinal()]) {
            case 1:
                map.put(SportHealthSetting.USER_REST_NEW, byk.t(c0().f()));
                break;
            case 2:
                map.put(SportHealthSetting.BED_TIME, byk.o(c0().a().getRemindTime()));
                break;
            case 3:
                map.put(SportHealthSetting.BED_TIME_SWITCH, byk.o(c0().a().getRemindSwitch()));
                break;
            case 4:
                map.put(SportHealthSetting.STAY_UP_BED_TIME, byk.o(c0().g().getRemindTime()));
                break;
            case 5:
                map.put(SportHealthSetting.STAY_UP_BED_TIME_SWITCH, byk.o(c0().g().getRemindSwitch()));
                break;
            case 6:
                map.put(SportHealthSetting.SLEEP_MODEL_SETTINGS, new Gson().toJson(c0().e()));
                break;
        }
        if (map.isEmpty()) {
            return;
        }
        n0(sportHealthSetting, map);
    }

    public final void m0() {
        try {
            m8b.f("Sleep-Setting", "notifyUserRestUpdate");
            e88.b().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/open/menstrual"), null, null, null);
        } catch (Exception e) {
            m8b.b("Sleep-Setting", "notifyUserRestUpdate fail=" + e);
        }
    }

    public void n0(SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map) {
        this.q.G(sportHealthSetting, map);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel
    public void onCleared() {
        super.onCleared();
        this.q.F(this);
        this.q.D(this);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingViewModel
    @NonNull
    @SuppressLint({"CheckResult"})
    public MutableLiveData<Integer> w(SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map) {
        final MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        W(sportHealthSetting, map, new gz9() { // from class: com.oplus.aiunit.vision.csh
            @Override // com.oplus.aiunit.model.gz9
            public final void g(SportHealthSetting sportHealthSetting2, int i) {
                SleepSettingViewModel.f0(mutableLiveData, sportHealthSetting2, i);
            }
        });
        return mutableLiveData;
    }
}