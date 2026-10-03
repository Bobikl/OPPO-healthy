package com.oplus.carlink.controlsdk;

import OO0.O000;
import OO0.O00O;
import OO0.OO0;
import OO0.OOO;
import OO0.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.gson.Gson;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.oplus.aiunit.vision.d1d;
import com.oplus.aiunit.vision.f3d;
import com.oplus.aiunit.vision.g1d;
import com.oplus.aiunit.vision.m0d;
import com.oplus.aiunit.vision.s3d;
import com.oplus.carlink.domain.entity.channel.ControlCommand;
import com.oplus.carlink.domain.entity.control.CarInfo;
import com.oplus.carlink.domain.entity.export.ExportCarStatus;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class CarControlManager {
    private static final String TAG = "CarControlManager";
    private static volatile CarControlManager sInstance;
    private static Object sLock = new Object();
    private Context mContext;
    private volatile boolean mInitialized = false;
    private O00O mControlImpl = new O00O();

    public static CarControlManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                if (sInstance == null) {
                    sInstance = new CarControlManager();
                }
            }
        }
        return sInstance;
    }

    private void warningIfInMainThread(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            d1d.e(TAG, "Warning In main thread," + str + " may take a long time.");
        }
    }

    public boolean activeCar(@NonNull String str) {
        if (str == null) {
            return false;
        }
        warningIfInMainThread("Active car");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("car_id", str);
        Bundle bundleA = o00o.a.a("active_car", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when active the car.");
        return false;
    }

    public boolean activeRkeCarInfo(@NonNull String str) {
        if (str == null) {
            return false;
        }
        warningIfInMainThread("activeRkeCarInfo");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("type", "VALUE_ACTIVATE_RKE_CAR_INFO");
        bundle.putString("car_id", str);
        Bundle bundleA = o00o.a.a("update_rke_car_info", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return false when activateRkeCarInfo.");
        return false;
    }

    public boolean addCarInfoToDb(@NonNull String str) {
        warningIfInMainThread("addCarInfoToDb");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("car_info", str);
        Bundle bundleA = o00o.a.a("add_car_info_to_db", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when unbind the car.");
        return false;
    }

    public void addControlCallback(f3d f3dVar) {
        if (f3dVar == null) {
            return;
        }
        this.mControlImpl.b();
        O00O o00o = this.mControlImpl;
        synchronized (o00o.f163c) {
            if (!o00o.f163c.contains(f3dVar)) {
                o00o.f163c.add(f3dVar);
            }
        }
    }

    public boolean associateCar(String str, String str2, String str3) {
        warningIfInMainThread("associateCar");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("company_id", str);
        bundle.putString("src_car_id", str2);
        bundle.putString("associated_car_id", str3);
        Bundle bundleA = o00o.a.a("associate_car", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when associateCar.");
        return false;
    }

    @WorkerThread
    public void connectRemote() {
        b bVar = this.mControlImpl.a;
        synchronized (bVar.f165c) {
            if (bVar.b != 2 && bVar.b == 0) {
                bVar.b = 1;
                bVar.b();
            }
        }
    }

    @WorkerThread
    public boolean deleteAssociatedCar(String str, String str2, String str3) {
        warningIfInMainThread("deleteAssociatedCar");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("company_id", str);
        bundle.putString("src_car_id", str2);
        bundle.putString("associated_car_id", str3);
        Bundle bundleA = o00o.a.a("delete_associated_car", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when deleteAssociatedCar.");
        return false;
    }

    @WorkerThread
    public List<String> getCacheAllSort(@Nullable String str) {
        warningIfInMainThread("getCacheAllSort");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("get_cache_all_sort", null, bundle);
        if (bundleA != null) {
            return (List) g1d.b(bundleA.getString("content"), new OO0().getType());
        }
        d1d.a("CarControlImpl", "Return null when getCacheSort.");
        return null;
    }

    @WorkerThread
    public List<String> getCacheSort(@Nullable String str) {
        warningIfInMainThread("updateCarSkillSort");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("get_cache_sort", null, bundle);
        if (bundleA != null) {
            return (List) g1d.b(bundleA.getString("content"), new OOO().getType());
        }
        d1d.a("CarControlImpl", "Return null when getCacheSort.");
        return null;
    }

    @WorkerThread
    public List<CarInfo> getCachedCarInfo(@Nullable String str) {
        warningIfInMainThread("getCarInfo");
        return this.mControlImpl.c(str, false);
    }

    @WorkerThread
    public ExportCarStatus getCarStatus(@Nullable String str) {
        warningIfInMainThread("getCarStatus");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("get_car_status", null, bundle);
        if (bundleA != null) {
            return (ExportCarStatus) g1d.a(bundleA.getString("content"), ExportCarStatus.class);
        }
        d1d.a("CarControlImpl", "Return null when get car status.");
        return null;
    }

    @Nullable
    public Context getContext() {
        return this.mContext;
    }

    @WorkerThread
    public List<String> getOriginSortList(@Nullable String str) {
        warningIfInMainThread("getCarSkillSort");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("get_car_skill_sort", null, bundle);
        if (bundleA != null) {
            return (List) g1d.b(bundleA.getString("content"), new O000().getType());
        }
        d1d.a("CarControlImpl", "Return null when carSkillSort.");
        return null;
    }

    public void init(@NonNull Context context) {
        if (context == null) {
            d1d.c(TAG, "Context is null when initialize the sdk.");
        } else {
            this.mInitialized = true;
            this.mContext = context.getApplicationContext();
        }
    }

    @WorkerThread
    public ExportCarStatus loadCarStatusWithoutLogin(@Nullable String str) {
        warningIfInMainThread("getCarStatus");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("get_car_status_without_login", null, bundle);
        if (bundleA != null) {
            return (ExportCarStatus) g1d.a(bundleA.getString("content"), ExportCarStatus.class);
        }
        d1d.a("CarControlImpl", "Return null when get car status.");
        return null;
    }

    public boolean notifyCarBindOrUnbindEvent(boolean z, int i, String str, String str2) {
        warningIfInMainThread("notifyCarBindEvent");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("type", z);
        bundle.putInt("code", i);
        bundle.putString("company_id", str);
        bundle.putString("car_id", str2);
        Bundle bundleA = o00o.a.a("notify_car_bind_or_unbind_event", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when unbind the car.");
        return false;
    }

    public boolean notifyUserAgreementResult(boolean z) {
        warningIfInMainThread("notifyUserAgreementResult");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("user_agreement_result", z);
        Bundle bundleA = o00o.a.a("notify_user_agreement_result", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when unbind the car.");
        return false;
    }

    @WorkerThread
    public boolean onControl(ControlCommand controlCommand) {
        if (controlCommand == null) {
            return false;
        }
        warningIfInMainThread("onControl");
        return this.mControlImpl.d(controlCommand, "");
    }

    @WorkerThread
    public boolean quit() {
        return false;
    }

    public m0d register(String str, s3d s3dVar) {
        return this.mControlImpl.d.a(str, s3dVar);
    }

    public void removeControlCallback(f3d f3dVar) {
        if (f3dVar == null) {
            return;
        }
        O00O o00o = this.mControlImpl;
        synchronized (o00o.f163c) {
            o00o.f163c.remove(f3dVar);
            o00o.f();
        }
    }

    public boolean setCurrentCarByCarId(String str) {
        warningIfInMainThread("setCurrentCarByCarId");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        if (str == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("car_id", str);
        Bundle bundleA = o00o.a.a("set_current_car", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return false when set current car.");
        return false;
    }

    public boolean unBindCar(@Nullable String str) {
        warningIfInMainThread("unBindCar");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        if (str == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("car_id", str);
        Bundle bundleA = o00o.a.a("unbind_car", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return false when unbind the car.");
        return false;
    }

    public boolean unBindCarByCompanyId(@Nullable String str) {
        warningIfInMainThread("unBindCar");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("company_id", str);
        Bundle bundleA = o00o.a.a("unbind_car_by_company_id", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return false when unbind the car.");
        return false;
    }

    @WorkerThread
    public void updateAllSortedCarSkills(@Nullable String str, List<String> list) {
        String json;
        warningIfInMainThread("updateAllSortedCarSkills");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
            if (list != null) {
                try {
                    json = new Gson().toJson(list);
                } catch (Exception unused) {
                    json = "";
                }
                bundle.putString("all_sort_list", json);
            }
        }
        o00o.a.a("update_cache_all_sort", null, bundle);
        d1d.a("CarControlImpl", "Return when updateAllSortedCarSkills.");
    }

    @WorkerThread
    public boolean updateCarInfo() {
        warningIfInMainThread("updateCarInfo");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundleA = o00o.a.a("update_car_info", null, new Bundle());
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when update car status.");
        return false;
    }

    @WorkerThread
    public void updateCarSkillSort(@Nullable String str, List<String> list) {
        String json;
        warningIfInMainThread("updateCarSkillSort");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
            if (list != null) {
                try {
                    json = new Gson().toJson(list);
                } catch (Exception unused) {
                    json = "";
                }
                bundle.putString("sort_list", json);
            }
        }
        o00o.a.a("update_cache_sort", null, bundle);
        d1d.a("CarControlImpl", "Return when updateCarSkillSort.");
    }

    @WorkerThread
    public boolean updateCarStatus(@Nullable String str) {
        warningIfInMainThread("updateCarStatus");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("update_car_status", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when update car status.");
        return false;
    }

    public boolean updateRkeCarInfo(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return false;
        }
        warningIfInMainThread("updateRkeCarInfo");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("type", "VALUE_UPDATE_RKE_CAR_INFO");
        bundle.putString("car_id", str);
        bundle.putString("name", str2);
        bundle.putString(DBHealthArchiveRecord.IMAGE_URL, str3);
        Bundle bundleA = o00o.a.a("update_rke_car_info", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return false when updateRkeCarInfo.");
        return false;
    }

    @WorkerThread
    public List<CarInfo> getCachedCarInfo(@Nullable String str, boolean z) {
        warningIfInMainThread("getCarInfo");
        return this.mControlImpl.c(str, z);
    }

    @WorkerThread
    public boolean onControl(ControlCommand controlCommand, String str) {
        if (controlCommand == null) {
            return false;
        }
        warningIfInMainThread("onControl");
        return this.mControlImpl.d(controlCommand, str);
    }

    @WorkerThread
    public boolean updateCarInfo(@Nullable String str) {
        warningIfInMainThread("updateCarInfo");
        O00O o00o = this.mControlImpl;
        o00o.getClass();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        Bundle bundleA = o00o.a.a("update_car_info", null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when update car status.");
        return false;
    }
}
