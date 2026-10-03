package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.HealthOriginData;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.databaseengine.option.DataInsertOption;
import com.heytap.databaseengineservice.paramscheck.ParamsCheckException;
import com.oplus.onet.IONetService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class o9a {
    public final void a(int i, SportHealthData sportHealthData) throws ParamsCheckException {
        if (ttk.a(i, sportHealthData)) {
            if (!c(sportHealthData.getStartTimestamp(), sportHealthData.getEndTimestamp())) {
                throw new ParamsCheckException("checkDailyEventData time is not in whole minute");
            }
            return;
        }
        cj4.a("checkDailyEventData", "data: " + sportHealthData.toString());
        throw new ParamsCheckException("checkDailyEventData value is out of range table = " + i);
    }

    public List<SportHealthData> b(DataInsertOption dataInsertOption) throws ParamsCheckException {
        if (dataInsertOption != null) {
            return g(dataInsertOption.getDataTable(), dataInsertOption.getDatas());
        }
        throw new ParamsCheckException("checkInsertOption DataInsertOption is null");
    }

    public final boolean c(long j2, long j3) {
        return j2 % 60000 == 0 && j3 % 60000 == 0 && j3 - j2 == 60000;
    }

    public final void d(SportHealthData sportHealthData) throws ParamsCheckException {
        if (((OneTimeSport) sportHealthData).getMetaData() == null) {
            throw new ParamsCheckException("checkOneTimeSportData metaData is null");
        }
    }

    public final void e(SportHealthData sportHealthData) throws ParamsCheckException {
        HealthOriginData healthOriginData = (HealthOriginData) sportHealthData;
        if (hz.a(healthOriginData.getData())) {
            throw new ParamsCheckException("checkOriginData data is null or empty");
        }
        if (hz.a(healthOriginData.getDeviceType())) {
            throw new ParamsCheckException("checkOriginData device category is null or empty");
        }
    }

    public final void f(int i, SportHealthData sportHealthData) throws ParamsCheckException {
        if (sportHealthData == null) {
            throw new ParamsCheckException("checkSportHealthData data is null");
        }
        long startTimestamp = sportHealthData.getStartTimestamp();
        if (startTimestamp > sportHealthData.getEndTimestamp() || startTimestamp < 0) {
            throw new ParamsCheckException("startTime > endTime or startTime < 0");
        }
        i(i, sportHealthData);
    }

    public final List<SportHealthData> g(int i, List<SportHealthData> list) throws ParamsCheckException {
        if (hz.b(list)) {
            throw new ParamsCheckException("checkSportHealthDataList data is null");
        }
        String deviceUniqueId = list.get(0).getDeviceUniqueId();
        boolean zK = ttk.k(i);
        if (zK && hz.a(deviceUniqueId)) {
            throw new ParamsCheckException("deviceUniqueId is null or empty");
        }
        String ssoid = list.get(0).getSsoid();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (zK) {
                try {
                    if (!deviceUniqueId.equals(list.get(i2).getDeviceUniqueId())) {
                        throw new ParamsCheckException("deviceUniqueId is not the same in list");
                    }
                } catch (ParamsCheckException e2) {
                    cj4.d("checkSportHealthDataList", "e = : " + e2.getMessage() + ", data size: " + list.size() + ", data index: " + i2);
                }
            }
            if (!ssoid.equals(list.get(i2).getSsoid())) {
                throw new ParamsCheckException("data not belongs to the same user");
            }
            f(i, list.get(i2));
            arrayList.add(list.get(i2));
        }
        return arrayList;
    }

    public final void h(SportHealthData sportHealthData) {
        SportDataStat sportDataStat = (SportDataStat) sportHealthData;
        if (sportDataStat.getDate() != v05.i(System.currentTimeMillis())) {
            return;
        }
        if (ttk.i(sportDataStat.getTotalSteps()) && ttk.g(sportDataStat.getTotalDistance()) && ttk.d(sportDataStat.getTotalCalories()) && ttk.c(sportDataStat.getTotalAltitudeOffset())) {
            return;
        }
        cj4.a("checkStat", "bigger then max");
        throw new ParamsCheckException("checkStat data is bigger then max");
    }

    public final void i(int i, SportHealthData sportHealthData) throws ParamsCheckException {
        if (i == 1001) {
            a(i, sportHealthData);
            return;
        }
        if (i == 1002) {
            h(sportHealthData);
            return;
        }
        if (i == 1004) {
            d(sportHealthData);
            return;
        }
        if (i == 1005 || i == 1027) {
            return;
        }
        switch (i) {
            case 1008:
            case 1009:
            case 1010:
            case 1011:
            case 1012:
                return;
            default:
                switch (i) {
                    case 1014:
                    case 1015:
                    case 1017:
                    case 1018:
                    case 1019:
                    case 1020:
                    case 1021:
                    case 1022:
                    case 1023:
                    case 1024:
                    case 1025:
                        return;
                    case 1016:
                        e(sportHealthData);
                        return;
                    default:
                        switch (i) {
                            case 1030:
                            case IONetService.Stub.TRANSACTION_checkDiscoverability /* 1031 */:
                            case 1032:
                            case IONetService.Stub.TRANSACTION_createDefaultDeviceWithType /* 1033 */:
                            case IONetService.Stub.TRANSACTION_setAbilityCallback /* 1034 */:
                            case IONetService.Stub.TRANSACTION_registerContinuousSearch /* 1035 */:
                            case IONetService.Stub.TRANSACTION_unregisterContinuousSearch /* 1036 */:
                            case IONetService.Stub.TRANSACTION_getConnectionStatus /* 1037 */:
                            case IONetService.Stub.TRANSACTION_getLocalFullAbility /* 1038 */:
                            case IONetService.Stub.TRANSACTION_stopCertainScan /* 1039 */:
                                return;
                            default:
                                switch (i) {
                                    case IONetService.Stub.TRANSACTION_getCachedDevicesWithBundle /* 1042 */:
                                    case IONetService.Stub.TRANSACTION_setDevicesDiscoverable /* 1043 */:
                                    case IONetService.Stub.TRANSACTION_isDeviceDiscoverable /* 1044 */:
                                    case IONetService.Stub.TRANSACTION_getQrCodeMessage /* 1045 */:
                                    case IONetService.Stub.TRANSACTION_savePeripheralModelId /* 1046 */:
                                    case IONetService.Stub.TRANSACTION_resetConnection /* 1047 */:
                                    case IONetService.Stub.TRANSACTION_isAccountLogin /* 1048 */:
                                    case IONetService.Stub.TRANSACTION_setSenselessConnectionCallback /* 1049 */:
                                    case IONetService.Stub.TRANSACTION_removeSenselessConnectionCallback /* 1050 */:
                                    case IONetService.Stub.TRANSACTION_deInit /* 1051 */:
                                    case IONetService.Stub.TRANSACTION_setPassiveCallbackState /* 1052 */:
                                    case IONetService.Stub.TRANSACTION_getAccountLoginIntent /* 1053 */:
                                    case IONetService.Stub.TRANSACTION_queryAccountLoginStatusOnline /* 1054 */:
                                    case 1055:
                                    case 1056:
                                    case 1057:
                                    case 1058:
                                    case 1059:
                                    case 1060:
                                    case 1061:
                                    case 1062:
                                    case 1063:
                                    case 1064:
                                        return;
                                    default:
                                        switch (i) {
                                            case 1066:
                                            case 1067:
                                            case 1068:
                                            case 1069:
                                            case 1070:
                                            case 1071:
                                            case 1072:
                                            case CID_DM_SYNC_PHONE_KEEP_ALIVE_SMALL_VALUE:
                                            case 1074:
                                            case 1075:
                                                return;
                                            default:
                                                switch (i) {
                                                    case 1078:
                                                    case 1079:
                                                    case 1080:
                                                    case 1081:
                                                    case 1082:
                                                    case 1083:
                                                    case 1084:
                                                    case 1085:
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 1171:
                                                            case 1172:
                                                            case 1173:
                                                            case 1174:
                                                            case 1175:
                                                            case 1176:
                                                            case 1177:
                                                                return;
                                                            default:
                                                                throw new ParamsCheckException("Unknown data table: " + i);
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
