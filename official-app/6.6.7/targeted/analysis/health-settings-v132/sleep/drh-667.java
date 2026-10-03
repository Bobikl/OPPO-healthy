package com.oplus.aiunit.model;

import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.c8c;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qr0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
public class drh {
    public static void b(SleepSettingBean sleepSettingBean, final SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map, final ln3<Integer> ln3Var) {
        if (!qr0.w().z()) {
            if (ln3Var != null) {
                ln3Var.onResult(1);
                return;
            }
            return;
        }
        if (map.get(sportHealthSetting) == null) {
            m8b.b("Sleep-Setting", "Setting item " + sportHealthSetting.name() + " without data");
            if (ln3Var != null) {
                ln3Var.onResult(3);
                return;
            }
            return;
        }
        m8b.f("Sleep-Setting", "Send change setting BT msg, setting name=" + sportHealthSetting.name() + " data=" + map);
        MessageEvent messageEventC = c(sleepSettingBean, sportHealthSetting, map);
        if (messageEventC != null) {
            qr0.w().T(messageEventC, new c8c() { // from class: com.oplus.aiunit.vision.crh
                public final void f(c8c.a aVar) {
                    drh.d(sportHealthSetting, ln3Var, aVar);
                }
            });
        } else if (ln3Var != null) {
            ln3Var.onResult(1);
        }
    }

    @Nullable
    public static MessageEvent c(SleepSettingBean sleepSettingBean, SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map) {
        ISleepDataService iSleepDataService = (ISleepDataService) e1.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
        if (iSleepDataService != null) {
            return (MessageEvent) iSleepDataService.u0(sleepSettingBean, sportHealthSetting, map);
        }
        m8b.b("Sleep-Setting", "ISleepDataService not found");
        return null;
    }

    public static /* synthetic */ void d(SportHealthSetting sportHealthSetting, ln3 ln3Var, c8c.a aVar) {
        MessageEvent messageEventE = aVar.e();
        if (!aVar.f() || messageEventE == null) {
            m8b.f("Sleep-Setting", "Change device setting by bt msg fail, error=" + aVar.b());
        } else {
            e(sportHealthSetting, messageEventE);
        }
        if (ln3Var != null) {
            ln3Var.onResult(Integer.valueOf(!aVar.f() ? 1 : 0));
        }
    }

    public static void e(SportHealthSetting sportHealthSetting, MessageEvent messageEvent) {
        if (messageEvent.getData() == null) {
            m8b.f("Sleep-Setting", "Sleep Setting response msg=null, type=" + sportHealthSetting.name());
            return;
        }
        try {
            m8b.f("Sleep-Setting", "Sleep setting response code=" + FitnessProto.IntRequest.parseFrom(messageEvent.getData()).getValue() + " setting=" + sportHealthSetting.name());
        } catch (Throwable th) {
            m8b.b("Sleep-Setting", "Parse sleep setting response msg fail, error=" + th);
        }
    }
}