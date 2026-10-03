package OO0;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.oplus.aiunit.vision.d1d;
import com.oplus.aiunit.vision.f3d;
import com.oplus.aiunit.vision.g1d;
import com.oplus.aiunit.vision.p0d;
import com.oplus.aiunit.vision.s3d;
import com.oplus.carlink.domain.entity.channel.ChannelResponse;
import com.oplus.carlink.domain.entity.channel.ControlCommand;
import com.oplus.carlink.domain.entity.control.ActiveTask;
import com.oplus.carlink.domain.entity.control.CarInfo;
import com.oplus.carlink.domain.entity.control.CarInfoResult;
import com.oplus.carlink.domain.entity.control.CarStatusResult;
import com.oplus.carlink.domain.entity.control.ControlResult;
import com.oplus.carlink.domain.entity.control.ControlTask;
import com.oplus.carlink.domain.entity.control.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class O00O implements b.c {
    public final p0d d = new p0d();
    public final O00 b = new O00();
    public final b a = new b(g(), this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<f3d> f163c = new ArrayList<>();

    public class O00 extends O00.O00.AbstractBinderC0000O00 {
        public O00() {
        }

        @Override // O00.O00
        public final Bundle O00(String str, String str2, Bundle bundle) {
            ChannelResponse channelResponse;
            String str3;
            String str4;
            Bundle bundleA = null;
            if (str == null) {
                d1d.c("CarControlImpl", "Method is null when receive call from remote.");
                return null;
            }
            d1d.a("CarControlImpl", "Receive method ".concat(str));
            switch (str) {
                case "notify_car_info":
                    O00O(bundle);
                    return null;
                case "notify_control_result":
                    O000(bundle);
                    return null;
                case "notify_active_result":
                    O0O(bundle);
                    return null;
                case "notify_active_task":
                    OO0(bundle);
                    return null;
                case "notify_car_status":
                    O0O0(bundle);
                    return null;
                case "notify_car_bind_or_unbind_event":
                    OOO(bundle);
                    return null;
                case "notify_control_task":
                    if (bundle == null) {
                        d1d.c("CarControlImpl", "Param is null, when get response.");
                        channelResponse = null;
                    } else {
                        channelResponse = (ChannelResponse) g1d.a(bundle.getString("content", ""), ChannelResponse.class);
                    }
                    if (channelResponse != null) {
                        if (((ControlTask) g1d.a((String) channelResponse.getData(), ControlTask.class)) != null) {
                            O00O o00o = O00O.this;
                            channelResponse.getCode();
                            synchronized (o00o.f163c) {
                                Iterator<f3d> it = o00o.f163c.iterator();
                                while (it.hasNext()) {
                                    it.next().f();
                                }
                                break;
                            }
                        } else {
                            str3 = "CarControlImpl";
                            str4 = "Task is null when receive control task.";
                        }
                        return null;
                    }
                    str3 = "CarControlImpl";
                    str4 = "Response is null when receive car control error result.";
                    d1d.c(str3, str4);
                    return null;
                default:
                    d1d.c("CarControlImpl", "Unknown method ".concat(str));
                    p0d p0dVar = O00O.this.d;
                    Lock lock = p0dVar.b.readLock();
                    lock.lock();
                    try {
                        d1d.c("SimpleCarLinkCallbackRegistry", "callMethod: " + str + ", callbacks keys: " + p0dVar.a.keySet());
                        s3d s3dVar = (s3d) p0dVar.a.get(str);
                        if (s3dVar != null) {
                            bundleA = s3dVar.a();
                            break;
                        }
                        lock.unlock();
                        if (bundleA == null) {
                            return bundleA;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("code", -1);
                        return bundle2;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
            }
        }

        public final void O000(@Nullable Bundle bundle) {
            Response response;
            if (bundle == null) {
                d1d.c("CarControlImpl", "Param is null, when get response.");
                response = null;
            } else {
                response = (Response) g1d.a(bundle.getString("content", ""), Response.class);
            }
            if (response == null) {
                d1d.c("CarControlImpl", "Response is null when receive control result.");
                return;
            }
            if (((ControlResult) g1d.a((String) response.getData(), ControlResult.class)) == null) {
                d1d.c("CarControlImpl", "Control result is null.");
            }
            O00O o00o = O00O.this;
            response.getCode();
            response.getMessage();
            synchronized (o00o.f163c) {
                Iterator<f3d> it = o00o.f163c.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        public final void O00O(@Nullable Bundle bundle) {
            Response response;
            if (bundle == null) {
                d1d.c("CarControlImpl", "Param is null, when get response.");
                response = null;
            } else {
                response = (Response) g1d.a(bundle.getString("content", ""), Response.class);
            }
            if (response == null) {
                d1d.c("CarControlImpl", "Response is null when receive car info event.");
                return;
            }
            if (((CarInfoResult) g1d.a((String) response.getData(), CarInfoResult.class)) == null) {
                d1d.d("CarControlImpl", "Result is null when receive car info event.");
                return;
            }
            O00O o00o = O00O.this;
            response.getCode();
            response.getMessage();
            synchronized (o00o.f163c) {
                Iterator<f3d> it = o00o.f163c.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            }
        }

        public final void O0O(@Nullable Bundle bundle) {
            ChannelResponse channelResponse;
            if (bundle == null) {
                d1d.c("CarControlImpl", "Param is null, when get response.");
                channelResponse = null;
            } else {
                channelResponse = (ChannelResponse) g1d.a(bundle.getString("content", ""), ChannelResponse.class);
            }
            if (channelResponse == null) {
                d1d.c("CarControlImpl", "Response is null when receive car active result.");
                return;
            }
            O00O o00o = O00O.this;
            channelResponse.getCode();
            channelResponse.getData();
            channelResponse.getMsg();
            synchronized (o00o.f163c) {
                Iterator<f3d> it = o00o.f163c.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }

        public final void O0O0(@Nullable Bundle bundle) {
            Response response;
            String str;
            String str2;
            if (bundle == null) {
                d1d.c("CarControlImpl", "Param is null, when get response.");
                response = null;
            } else {
                response = (Response) g1d.a(bundle.getString("content", ""), Response.class);
            }
            if (response == null) {
                str = "CarControlImpl";
                str2 = "Response is null when receive car status result.";
            } else {
                if (((CarStatusResult) g1d.a((String) response.getData(), CarStatusResult.class)) != null) {
                    bundle.getString("car_id", null);
                    O00O o00o = O00O.this;
                    response.getCode();
                    response.getMessage();
                    synchronized (o00o.f163c) {
                        Iterator<f3d> it = o00o.f163c.iterator();
                        while (it.hasNext()) {
                            it.next().e();
                        }
                    }
                    return;
                }
                str = "CarControlImpl";
                str2 = "Error, Car status result is null when receive car status.";
            }
            d1d.c(str, str2);
        }

        public final void OO0(@Nullable Bundle bundle) {
            String str;
            String str2;
            if (bundle == null) {
                str = "CarControlImpl";
                str2 = "Param is null, when notify active task.";
            } else {
                String string = bundle.getString("content", "");
                if (string == null) {
                    str = "CarControlImpl";
                    str2 = "Response is null when notify active task.";
                } else {
                    if (((ActiveTask) g1d.a(string, ActiveTask.class)) != null) {
                        O00O o00o = O00O.this;
                        synchronized (o00o.f163c) {
                            Iterator<f3d> it = o00o.f163c.iterator();
                            while (it.hasNext()) {
                                it.next().g();
                            }
                        }
                        return;
                    }
                    str = "CarControlImpl";
                    str2 = "Task is null when receive control task.";
                }
            }
            d1d.c(str, str2);
        }

        public final void OOO(@Nullable Bundle bundle) {
            ChannelResponse channelResponse;
            if (bundle == null) {
                d1d.c("CarControlImpl", "Param is null, when get response.");
                channelResponse = null;
            } else {
                channelResponse = (ChannelResponse) g1d.a(bundle.getString("content", ""), ChannelResponse.class);
            }
            if (channelResponse == null) {
                d1d.c("CarControlImpl", "Response is null when receive notify bind or unbind result.");
                return;
            }
            if (bundle.getBoolean("type", true)) {
                return;
            }
            O00O o00o = O00O.this;
            channelResponse.getCode();
            synchronized (o00o.f163c) {
                Iterator<f3d> it = o00o.f163c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
    }

    public static Intent g() {
        Intent intent = new Intent();
        intent.setAction("oplus.intent.action.carlink.CAR_CONTROL_EXPORTED_SERVICE");
        intent.setPackage("com.heytap.opluscarlink");
        return intent;
    }

    @Override // OO0.b.c
    public final void a() {
    }

    @Override // OO0.b.c
    public final void b() {
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.oplus.aiunit.vision.n0d
            @Override // java.lang.Runnable
            public final void run() {
                this.i.e();
            }
        });
    }

    public final ArrayList c(@Nullable String str, boolean z) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("car_id", str);
        }
        if (z) {
            bundle.putBoolean("type", z);
        }
        Bundle bundleA = this.a.a("get_car_info", null, bundle);
        if (bundleA == null) {
            d1d.d("CarControlImpl", "Result is null when get car information.");
            return null;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("car_info_list");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            d1d.c("CarControlImpl", "Can't parse the car information list.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            CarInfo carInfo = (CarInfo) g1d.a(it.next(), CarInfo.class);
            if (carInfo != null) {
                arrayList.add(carInfo);
            }
        }
        d1d.a("CarControlImpl", "Return information list size " + arrayList.size());
        return arrayList;
    }

    public final boolean d(ControlCommand controlCommand, String str) {
        String json;
        if (controlCommand == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        try {
            json = new Gson().toJson(controlCommand);
        } catch (Exception unused) {
            json = "";
        }
        bundle.putString("control_command", json);
        bundle.putString("source", str);
        Bundle bundleA = this.a.a(ConnectConstant.CHANNEL_NAME_CONTROL, null, bundle);
        if (bundleA != null) {
            return bundleA.getInt("code", 1) == 0;
        }
        d1d.a("CarControlImpl", "Return null when control the command.");
        return false;
    }

    public final /* synthetic */ void e() {
        Bundle bundle = new Bundle();
        bundle.putBinder("callback", this.b);
        bundle.putInt("version", 2000004);
        bundle.putString("name", "2.0.4");
        this.a.a("init", "version", bundle);
    }

    public final void f() {
        synchronized (this.f163c) {
            if (this.f163c.isEmpty()) {
                this.a.c();
            } else {
                d1d.e("CarControlImpl", "Callback is not empty, no need unbind.");
            }
        }
    }
}
