package com.lifesense.device.scale.data.entity;

import com.lifesense.device.scale.infrastructure.entity.Device;
import com.lifesense.device.scale.infrastructure.entity.DeviceSetting;
import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.c6;
import com.oplus.aiunit.vision.cs4;
import com.oplus.aiunit.vision.wz4;
import java.util.Map;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes4.dex */
public class DaoSession extends c6 {
    public final DeviceDao deviceDao;
    public final cs4 deviceDaoConfig;
    public final DeviceSettingDao deviceSettingDao;
    public final cs4 deviceSettingDaoConfig;
    public final WeightDbDataDao weightDbDataDao;
    public final cs4 weightDbDataDaoConfig;

    public DaoSession(wz4 wz4Var, IdentityScopeType identityScopeType, Map<Class<? extends a6<?, ?>>, cs4> map) {
        super(wz4Var);
        cs4 cs4VarClone = map.get(WeightDbDataDao.class).clone();
        this.weightDbDataDaoConfig = cs4VarClone;
        cs4VarClone.d(identityScopeType);
        cs4 cs4VarClone2 = map.get(DeviceDao.class).clone();
        this.deviceDaoConfig = cs4VarClone2;
        cs4VarClone2.d(identityScopeType);
        cs4 cs4VarClone3 = map.get(DeviceSettingDao.class).clone();
        this.deviceSettingDaoConfig = cs4VarClone3;
        cs4VarClone3.d(identityScopeType);
        WeightDbDataDao weightDbDataDao = new WeightDbDataDao(cs4VarClone, this);
        this.weightDbDataDao = weightDbDataDao;
        DeviceDao deviceDao = new DeviceDao(cs4VarClone2, this);
        this.deviceDao = deviceDao;
        DeviceSettingDao deviceSettingDao = new DeviceSettingDao(cs4VarClone3, this);
        this.deviceSettingDao = deviceSettingDao;
        registerDao(a.class, weightDbDataDao);
        registerDao(Device.class, deviceDao);
        registerDao(DeviceSetting.class, deviceSettingDao);
    }

    public void clear() {
        this.weightDbDataDaoConfig.a();
        this.deviceDaoConfig.a();
        this.deviceSettingDaoConfig.a();
    }

    public DeviceDao getDeviceDao() {
        return this.deviceDao;
    }

    public DeviceSettingDao getDeviceSettingDao() {
        return this.deviceSettingDao;
    }

    public WeightDbDataDao getWeightDbDataDao() {
        return this.weightDbDataDao;
    }
}
