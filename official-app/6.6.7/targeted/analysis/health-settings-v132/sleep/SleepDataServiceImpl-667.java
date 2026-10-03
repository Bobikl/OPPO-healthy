package com.heytap.device.sleep;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugarWarning;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.asc;
import com.oplus.aiunit.vision.ash;
import com.oplus.aiunit.vision.kq5;
import com.oplus.aiunit.vision.nt1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
@Route(path = "/device_data_sync/SleepDataServiceImpl")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0016J,\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0016J.\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u00072\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040%H\u0016J\u0012\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0016¨\u00064"}, d2 = {"Lcom/heytap/device/sleep/SleepDataServiceImpl;", "Lcom/heytap/device/sleep/ISleepDataService;", kq5.NOT_SET, "F5", kq5.NOT_SET, "d", "b9", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "C3", "Lcom/heytap/databaseengine/model/SleepModelSettings;", "setting", kq5.NOT_SET, "V5", "type", "action", "g5", "s4", kq5.NOT_SET, DBBloodSugarWarning.TIMESTAMP, "Z4", "time", "X5", kq5.NOT_SET, "Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "rests", "Lcom/oplus/aiunit/vision/asc;", "l1", "restList", "ha", "allRests", "newRest", kq5.NOT_SET, "maxCount", "R4", "Lcom/heytap/wsport/data/SleepSettingBean;", "bean", kq5.NOT_SET, "data", kq5.NOT_SET, "u0", "mac", "R0", "T9", "G", "y1", "i2", "Landroid/content/Context;", "context", "init", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SleepDataServiceImpl implements ISleepDataService {
    @Override // com.heytap.device.sleep.ISleepDataService
    @NotNull
    public String C3(@NotNull SportHealthSetting item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String strB = ash.b(item);
        Intrinsics.checkNotNullExpressionValue(strB, "getDefaultSleepSettingValue(item)");
        return strB;
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean F5() {
        return ash.e();
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean G() {
        return ash.f();
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean R0(@Nullable String mac) {
        return nt1.INSTANCE.a(mac);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    @NotNull
    public List<Integer> R4(@NotNull List<? extends SleepSettingBean.SleepRest> allRests, @NotNull SleepSettingBean.SleepRest newRest, int maxCount) {
        Intrinsics.checkNotNullParameter(allRests, "allRests");
        Intrinsics.checkNotNullParameter(newRest, "newRest");
        return SleepRestRepository.INSTANCE.j(allRests, newRest, maxCount);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean T9() {
        return ash.d();
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public void V5(@NotNull SleepModelSettings setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        SleepModeRepository.INSTANCE.i(setting);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public void X5(long time) {
        SleepModeRepository.INSTANCE.p(time);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public void Z4(long timestamp) {
        SleepModeRepository.INSTANCE.o(timestamp);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean b9() {
        return ash.g();
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    @NotNull
    public String d() {
        String strA = ash.a();
        Intrinsics.checkNotNullExpressionValue(strA, "getCurrentMac()");
        return strA;
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public void g5(@NotNull SportHealthSetting type, @NotNull String action) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        SleepModeRepository.INSTANCE.r(type, action);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    @Nullable
    public asc ha(@NotNull List<asc> restList) {
        Intrinsics.checkNotNullParameter(restList, "restList");
        return SleepRestRepository.INSTANCE.g(CollectionsKt.toMutableList(restList));
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean i2() {
        return ash.k();
    }

    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    @NotNull
    public List<asc> l1(@NotNull List<? extends SleepSettingBean.SleepRest> rests) {
        Intrinsics.checkNotNullParameter(rests, "rests");
        return SleepRestRepository.INSTANCE.d(rests);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public void s4(@NotNull SportHealthSetting type) {
        Intrinsics.checkNotNullParameter(type, "type");
        SleepModeRepository.INSTANCE.n(type);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    @Nullable
    public Object u0(@NotNull SleepSettingBean bean, @NotNull SportHealthSetting type, @NotNull Map<SportHealthSetting, String> data) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        return SleepModeBTRepository.INSTANCE.h(bean, type, data);
    }

    @Override // com.heytap.device.sleep.ISleepDataService
    public boolean y1() {
        return ash.j();
    }
}