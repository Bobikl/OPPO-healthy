package com.heytap.device.sleep;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.NewSleepRest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface ISleepDataService extends IProvider {
    String C3(SportHealthSetting sportHealthSetting);

    boolean E5();

    boolean G();

    List<Integer> Q4(List<SleepSettingBean.SleepRest> list, SleepSettingBean.SleepRest sleepRest, int i);

    boolean R0(String str);

    boolean S9();

    void U5(SleepModelSettings sleepModelSettings);

    void W5(long j2);

    void Y4(long j2);

    boolean a9();

    String d();

    void f5(SportHealthSetting sportHealthSetting, String str);

    NewSleepRest ga(List<NewSleepRest> list);

    boolean i2();

    List<NewSleepRest> l1(List<SleepSettingBean.SleepRest> list);

    void r4(SportHealthSetting sportHealthSetting);

    Object u0(SleepSettingBean sleepSettingBean, SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map);

    boolean y1();
}
