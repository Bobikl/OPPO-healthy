package com.heytap.health.sleep.formula.formula.jni;

import com.heytap.health.sleep.formula.formula.DeviceMsgBean;
import com.heytap.health.sleep.formula.formula.OsaHistBean;
import com.heytap.health.sleep.formula.formula.OsaHrvBean;
import com.heytap.health.sleep.formula.formula.OsaSensorBean;
import com.heytap.health.sleep.formula.formula.OsaSleepBean;
import com.heytap.health.sleep.formula.formula.OsaSnoreMultiFragBean;
import com.heytap.health.sleep.formula.formula.OsaSpo2Bean;
import com.heytap.health.sleep.formula.formula.OsaStatisticsBean;
import com.heytap.health.sleep.formula.formula.OsaUserBean;
import com.heytap.health.sleep.formula.formula.result.OsaResultBean;
import com.heytap.health.sleep.formula.formula.result.SnoreFrgDbBean;

/* JADX INFO: loaded from: classes18.dex */
public class OsaAlgorithm {
    static {
        System.loadLibrary("OSALib");
    }

    public static native SnoreFrgDbBean getSnoreDb(short[] sArr, int i);

    public static native short initHealthLog(HealthLogProxy healthLogProxy);

    public static native OsaResultBean osaAlgProcess(OsaSpo2Bean osaSpo2Bean, OsaHrvBean osaHrvBean, OsaSensorBean osaSensorBean, OsaSnoreMultiFragBean osaSnoreMultiFragBean, OsaSleepBean osaSleepBean, OsaUserBean osaUserBean, OsaStatisticsBean osaStatisticsBean, DeviceMsgBean deviceMsgBean, OsaHistBean osaHistBean);

    public static native OsaResultBean phoneOsaAlgProcess(OsaSleepBean osaSleepBean, OsaSensorBean osaSensorBean, OsaSnoreMultiFragBean osaSnoreMultiFragBean, OsaUserBean osaUserBean, DeviceMsgBean deviceMsgBean, OsaHistBean osaHistBean);

    public static native void recycleGlobalRef();
}
