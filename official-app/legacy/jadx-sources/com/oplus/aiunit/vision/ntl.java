package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$MessageHeader;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;
import com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSync;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import com.heytap.health.watchface.utils.GenerateAdaptUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes19.dex */
public class ntl {
    public static final String TAG = "WfMessageDistributor";
    public final HashMap<String, i11> a;
    public final List<os4> b;

    public static class a {
        public static final ntl a = new ntl();
    }

    public static ntl m() {
        return a.a;
    }

    public static /* synthetic */ void n(Map.Entry entry) {
        ltl.a(TAG, "current " + ((String) entry.getKey()) + " -> " + entry.getValue());
    }

    public final i11 b(String str) {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ == null) {
            ltl.d(TAG, "Reverse sync fail， device not connect");
            return null;
        }
        if (userDeviceInfoJ.getExtraInfo() == null) {
            ltl.i(TAG, "screenInfo is null,check device is new devices.");
            return null;
        }
        Proto$DeviceInfo proto$DeviceInfoD = GenerateAdaptUtil.INSTANCE.d();
        ltl.a(TAG, "deviceInfo " + proto$DeviceInfoD);
        if (proto$DeviceInfoD == null) {
            return null;
        }
        return r(str, proto$DeviceInfoD);
    }

    public final synchronized void c(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        String strE = proto$WatchFaceMessage.getHeader().getProtocolVersion() == 0 ? GenerateAdaptUtil.INSTANCE.e() : "";
        if (TextUtils.isEmpty(strE)) {
            strE = l();
            ltl.a(TAG, "dispatchMsg getDeviceUniqueId deviceUniqueId " + strE);
        }
        ltl.a(TAG, "dispatchMsg dataManagers key " + strE);
        i11 i11Var = this.a.get(strE);
        if (i11Var != null) {
            i11Var.d(proto$WatchFaceMessage);
        } else {
            String strE2 = GenerateAdaptUtil.INSTANCE.e();
            if (strE2 == null) {
                ltl.i(TAG, "[dispatchMsg] deviceMac == null and not to dispatch");
                return;
            }
            if (grl.a(strE2).w3()) {
                ltl.d(TAG, "[dispatchMsg] --> try create deviceInfo to add manager ");
                i11 i11VarB = b(strE);
                if (i11VarB != null) {
                    i11VarB.d(proto$WatchFaceMessage);
                }
            } else {
                ltl.d(TAG, "[dispatchMsg] --> no manager and not to dispatch");
                if (!qe0.z()) {
                    this.a.entrySet().forEach(new Consumer() { // from class: com.oplus.aiunit.vision.mtl
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ntl.n((Map.Entry) obj);
                        }
                    });
                }
            }
        }
    }

    public void d(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        if (proto$WatchFaceMessage == null) {
            ltl.b(TAG, "[execute] --> Proto msg==null");
            return;
        }
        ltl.a(TAG, "[execute] --> received msg =" + proto$WatchFaceMessage);
        Proto$MessageHeader header = proto$WatchFaceMessage.getHeader();
        boolean isAck = header.getIsAck();
        int commandId = header.getCommandId();
        String actionAnchor = header.getActionAnchor();
        if (commandId == 3) {
            bzb.c().i();
        }
        if (isAck) {
            if (header.getErrorCode() == 11) {
                bzb.c().f(proto$WatchFaceMessage, 11);
                return;
            } else {
                if (commandId != 2) {
                    bzb.c().g(actionAnchor);
                    return;
                }
                return;
            }
        }
        bzb.c().j(nbl.a(actionAnchor, commandId));
        if (commandId == 6) {
            ltl.b(TAG, "[execute] --> location form watch , empty code");
            return;
        }
        if (commandId == 1) {
            p(proto$WatchFaceMessage);
            return;
        }
        if (commandId == 25) {
            bzb.c().i();
            eoi.a(-1, 3);
        } else {
            if (header.getProtocolVersion() == 0 && commandId == 3) {
                p(proto$WatchFaceMessage);
            }
            c(proto$WatchFaceMessage);
        }
    }

    @Deprecated
    public synchronized ConfigHolder e() {
        ConfigHolder configHolderE;
        String strE = GenerateAdaptUtil.INSTANCE.e();
        Iterator<i11> it = this.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                configHolderE = null;
                break;
            }
            i11 next = it.next();
            if (TextUtils.equals(next.i(), strE)) {
                configHolderE = next.e();
                ltl.d(TAG, "[getConfigHolder] --> connected is rs");
                break;
            }
        }
        if (configHolderE == null) {
            ltl.b(TAG, "[getConfigHolder] --> connected is watch, no SpecialBean");
        }
        return configHolderE;
    }

    @Deprecated
    public synchronized i11 f() {
        Proto$DeviceInfo proto$DeviceInfoH;
        String strE = GenerateAdaptUtil.INSTANCE.e();
        Iterator<i11> it = this.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                proto$DeviceInfoH = null;
                break;
            }
            i11 next = it.next();
            if (TextUtils.equals(next.i(), strE)) {
                proto$DeviceInfoH = next.h();
                break;
            }
        }
        if (proto$DeviceInfoH == null) {
            ltl.b(TAG, "[getCurrentDataManager] --> dataManager == null");
            return null;
        }
        return i(proto$DeviceInfoH);
    }

    @Deprecated
    public synchronized Proto$DeviceInfo g() {
        Proto$DeviceInfo proto$DeviceInfoH;
        String strE = GenerateAdaptUtil.INSTANCE.e();
        Iterator<i11> it = this.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                proto$DeviceInfoH = null;
                break;
            }
            i11 next = it.next();
            if (TextUtils.equals(next.i(), strE)) {
                proto$DeviceInfoH = next.h();
                break;
            }
        }
        if (proto$DeviceInfoH == null) {
            ltl.b(TAG, "[getCurrentDeviceInfo] --> deviceInfo == null");
        }
        return proto$DeviceInfoH;
    }

    @Deprecated
    public synchronized List<BaseWatchFaceBean> h() {
        List<BaseWatchFaceBean> listK;
        String strE = GenerateAdaptUtil.INSTANCE.e();
        Iterator<i11> it = this.a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                listK = null;
                break;
            }
            i11 next = it.next();
            if (TextUtils.equals(next.i(), strE)) {
                listK = next.k();
                break;
            }
        }
        if (listK == null) {
            ltl.b(TAG, "[getCurrentFavorites] --> favorites == null");
        }
        return listK;
    }

    public synchronized i11 i(Proto$DeviceInfo proto$DeviceInfo) {
        return j(proto$DeviceInfo.getDeviceMac());
    }

    public synchronized i11 j(String str) {
        for (i11 i11Var : this.a.values()) {
            if (TextUtils.equals(i11Var.i(), str)) {
                return i11Var;
            }
        }
        ltl.i(TAG, "[getDataManager] --> dataManager is null , id=" + v0j.b(str));
        return null;
    }

    public synchronized HashMap<String, i11> k() {
        return this.a;
    }

    public final String l() {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ != null) {
            return userDeviceInfoJ.getDeviceUniqueId();
        }
        ltl.i(TAG, "dispatchMsg sync fail， device not connect");
        return "";
    }

    public synchronized void o(String str, int i, int i2) {
        ltl.a(TAG, "[notifyDataChange] --> deviceMac=" + str + " , status=" + i);
        if (str == null) {
            return;
        }
        for (os4 os4Var : this.b) {
            if (TextUtils.equals(str, os4Var.getDeviceMac())) {
                os4Var.i6(str, i, i2);
            } else {
                ltl.d(TAG, "notifyDataChange invailed " + gdb.a(str));
            }
        }
    }

    public final synchronized void p(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        int protocolVersion = proto$WatchFaceMessage.getHeader().getProtocolVersion();
        if (protocolVersion == 0) {
            String strE = GenerateAdaptUtil.INSTANCE.e();
            if (this.a.get(strE) == null) {
                Proto$WatchFacesStatusSync statusSync = proto$WatchFaceMessage.getBody().getStatusSync();
                Proto$DeviceInfo.Builder builderNewBuilder = Proto$DeviceInfo.newBuilder();
                String model = statusSync.getModel();
                builderNewBuilder.setDeviceMac(strE).setDeviceUniqueId(strE).setDeviceCategory(String.valueOf(1)).setModel(model).setSku(statusSync.getSkuCode()).setScreenHeight(statusSync.getScreenHeight()).setScreenWidth(statusSync.getScreenWidth()).setDensity(statusSync.getDensity()).setScaledDensity(statusSync.getScaledDensity()).setScreenType(Proto$ScreenType.SCREEN_TYPE_SQUARE);
                if (model.equalsIgnoreCase("OW19W1") || model.equalsIgnoreCase("OW19W3")) {
                    builderNewBuilder.setScreenRadius(72);
                } else {
                    builderNewBuilder.setScreenRadius(54);
                }
                wrl.d(model);
                ltl.a(TAG, "[onGetDeviceInfo] --> v0 create oplus dataManager, model=" + model + " , address=" + strE);
                this.a.put(strE, new b0e(builderNewBuilder.build()));
            } else {
                ltl.d(TAG, "[onGetDeviceInfo] --> v0, dateManager already exist!");
            }
        } else if (protocolVersion == 1 || protocolVersion == 2) {
            Proto$DeviceInfo deviceInfo = proto$WatchFaceMessage.getEnhanceBody().getDeviceInfo();
            String strL = l();
            i11 i11Var = this.a.get(strL);
            if (i11Var == null) {
                r(strL, deviceInfo);
            } else {
                ltl.d(TAG, "[onGetDeviceInfo] --> v1, dataManager already exist update");
                i11Var.D(deviceInfo);
            }
        }
    }

    public synchronized void q(os4 os4Var) {
        if (os4Var != null) {
            if (!this.b.contains(os4Var)) {
                this.b.add(os4Var);
                ltl.a(TAG, "[register] --> " + os4Var.getClass() + " register success");
            }
        }
    }

    public final i11 r(String str, Proto$DeviceInfo proto$DeviceInfo) {
        i11 i11VarO3 = grl.b(proto$DeviceInfo.getModel()).O3(proto$DeviceInfo);
        if (i11VarO3 != null) {
            ltl.a(TAG, "[onGetDeviceInfo] -->  deviceUniqueId=" + str + " dataManager " + i11VarO3);
            this.a.put(str, i11VarO3);
        } else {
            ltl.b(TAG, "[onGetDeviceInfo] --> v1 not support device category, category=" + proto$DeviceInfo.getDeviceCategory());
        }
        wrl.a(str);
        wrl.c(proto$DeviceInfo.getDeviceMac());
        wrl.d(proto$DeviceInfo.getModel());
        wrl.b(proto$DeviceInfo.getFirmwareVersion());
        return i11VarO3;
    }

    public synchronized void s(String str) {
        Iterator<Map.Entry<String, i11>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            i11 value = it.next().getValue();
            if (value != null && TextUtils.equals(value.i(), str)) {
                it.remove();
            }
        }
    }

    public synchronized void t(os4 os4Var) {
        if (os4Var != null) {
            if (this.b.contains(os4Var) && this.b.remove(os4Var)) {
                ltl.a(TAG, "[unregister] --> " + os4Var.getClass() + " unregister success");
            }
        }
    }

    public ntl() {
        this.a = new HashMap<>();
        this.b = new CopyOnWriteArrayList();
    }
}
