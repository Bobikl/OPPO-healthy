package com.lifesense.plugin.ble.device.proto.A5;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.lifesense.plugin.ble.OnSettingListener;
import com.lifesense.plugin.ble.a.a.u;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDevicePairSetting;
import com.lifesense.plugin.ble.data.LSDisconnectStatus;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSPairCommand;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.data.tracker.ATControlStatus;
import com.lifesense.plugin.ble.data.tracker.ATLoginInfo;
import com.lifesense.plugin.ble.data.tracker.ATPairResultsCode;
import com.lifesense.plugin.ble.data.tracker.ATUserInfo;
import com.lifesense.plugin.ble.device.proto.A5.parser.A5ProtoDecoder;
import java.util.ArrayList;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale", "InlinedApi"})
public class i extends com.lifesense.plugin.ble.device.proto.k {
    private int M;
    private A5ProtoDecoder N;
    private com.lifesense.plugin.ble.device.proto.g O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private String S;
    private String T;
    private boolean U;
    private int V;
    private boolean W;
    private ATLoginInfo X;
    private com.lifesense.plugin.ble.device.proto.h Y;
    private com.lifesense.plugin.ble.device.proto.p Z;
    private Runnable aa;

    public i(String str, LSDeviceInfo lSDeviceInfo, Context context) {
        super(str);
        this.Q = false;
        this.R = false;
        this.S = "";
        this.T = "";
        this.U = false;
        this.V = -2;
        this.W = false;
        this.Y = new j(this);
        this.Z = new k(this);
        this.aa = new m(this);
        super.a(str, lSDeviceInfo, context);
        this.M = 0;
        this.f = null;
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        LSDisconnectStatus lSDisconnectStatus;
        int i;
        if (this.M < 2) {
            printLogMessage(getGeneralLogInfo(this.y, "post pairing reconnect request,count=" + this.M, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.f8769l.postDelayed(this.u, 1000L);
            return;
        }
        printLogMessage(getPrintLogInfo("failed to reconnect device with count=" + this.M, 1));
        if (this.f8767e == com.lifesense.plugin.ble.device.proto.a.READ_DEVICE_ID) {
            lSDisconnectStatus = LSDisconnectStatus.Cancel;
            i = 8;
        } else {
            lSDisconnectStatus = LSDisconnectStatus.Cancel;
            i = -1;
        }
        a(lSDisconnectStatus, i);
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
        if (y() != null) {
            y().a(w(), LSConnectState.Disconnect, this);
        }
    }

    public int a(String str) {
        if (this.f8767e == com.lifesense.plugin.ble.device.proto.a.WRITE_RANDOM_NUMBER_CHECK_RESULT) {
            this.T = str;
            if (!this.S.equals(str)) {
                printLogMessage(getGeneralLogInfo(this.y, "device pair,app input random code check err", com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
                return 10;
            }
            printLogMessage(getGeneralLogInfo(this.y, "device pair,app input random code success", com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
            a(this.f8767e);
            return 1;
        }
        String str2 = this.T;
        if (str2 != null && str != null && str.equals(str2)) {
            printLogMessage(getGeneralLogInfo(this.y, "device pair,app input repeat random code", com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
            return 12;
        }
        printLogMessage(getGeneralLogInfo(this.y, "device unrequest,app input random code:" + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
        return 13;
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public int c() {
        return this.M;
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public LSUpgradeState d() {
        return null;
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public LSConnectState h() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (c(false) != null) {
            H();
            return;
        }
        int i = n.a[this.f8767e.ordinal()];
        if (i != 4) {
            switch (i) {
                case 10:
                    a(this.B, 0);
                    a(LSDisconnectStatus.Cancel, 0);
                    break;
            }
        }
        a(z());
    }

    private void i() {
        this.f8766c = false;
    }

    private void j() {
        Handler handler = this.f8769l;
        if (handler != null) {
            handler.removeCallbacks(this.aa);
            this.f8769l.removeCallbacks(this.u);
        }
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void e(com.lifesense.plugin.ble.a.a.m mVar) {
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void f() {
        if (!com.lifesense.plugin.ble.a.e.a().c()) {
            printLogMessage(getSupperLogInfo(this.y, "failed to reconnect device,bluetooth status error..", com.lifesense.plugin.ble.b.a.a.Reconnect_Message, null, false));
            a(LSDisconnectStatus.Cancel, 5);
            return;
        }
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
        this.M++;
        printLogMessage(getSupperLogInfo(this.y, "pairing reconnect device,count=" + this.M, com.lifesense.plugin.ble.b.a.a.Reconnect_Message, null, true));
        a(this.y, com.lifesense.plugin.ble.device.proto.c.b(this.B), com.lifesense.plugin.ble.device.a.c.PAIRING);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void g() {
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void b() {
        super.r();
        a(LSDisconnectStatus.Request, 4);
        j();
        k();
        super.p();
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void c(com.lifesense.plugin.ble.a.a.m mVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(LSDisconnectStatus lSDisconnectStatus) {
        super.r();
        j();
        this.M = 0;
        if (LSDisconnectStatus.Request != lSDisconnectStatus) {
            a(lSDisconnectStatus);
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public String a() {
        return this.y;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void b(com.lifesense.plugin.ble.a.a.m mVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(LSConnectState lSConnectState) {
        a(lSConnectState);
        if ((LSConnectState.ConnectSuccess == lSConnectState || LSConnectState.Disconnect == lSConnectState || LSConnectState.ConnectFailure == lSConnectState) && y() != null) {
            y().a(w(), lSConnectState, this);
        }
    }

    private synchronized void b(com.lifesense.plugin.ble.device.a.a.a.b bVar) {
        bVar.c();
        a(this.N.formatResponsePacket("8000", bVar.b(), this.i), com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5, com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID, u.RESPONSE_PUSH_COMMAND);
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void a(BluetoothDevice bluetoothDevice, Queue queue, boolean z, com.lifesense.plugin.ble.device.a.c cVar) {
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(Message message) {
    }

    public void b(boolean z) {
        com.lifesense.plugin.ble.device.proto.a aVar = this.f8767e;
        if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_AUTH_RESPONSE) {
            if (z) {
                a(aVar);
                return;
            } else {
                b();
                return;
            }
        }
        printLogMessage(getGeneralLogInfo(this.y, "failed to send pair request confirm,status error" + this.f8767e, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    private void a(OnSettingListener onSettingListener) {
        byte[] bArrA = com.lifesense.plugin.ble.device.proto.A5.parser.f.a(new ATControlStatus(1));
        System.err.println("pushDisconnect,byte2hex:" + com.lifesense.plugin.ble.c.a.e(bArrA));
        com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
        bVar.a(bArrA);
        bVar.a(this.y);
        bVar.a(169);
        com.lifesense.plugin.ble.device.a.a.g.a().a(this.y, bVar, onSettingListener);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(com.lifesense.plugin.ble.a.a.m mVar) {
        printLogMessage(getSupperLogInfo(this.y, "failed to read character,times out....", com.lifesense.plugin.ble.b.a.a.Read_Character, null, false));
        if (com.lifesense.plugin.ble.a.e.a().c()) {
            c(LSDisconnectStatus.Cancel);
        } else {
            printLogMessage(getSupperLogInfo(this.y, "unhandle read character request,bluetooth status error..", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LSDeviceInfo lSDeviceInfo, int i) {
        boolean z;
        j();
        String str = "call back paired results >> failure, state:" + ATPairResultsCode.getValue(i);
        if (i == 0) {
            str = "call back paired results >> success";
            z = true;
        } else {
            z = false;
        }
        printLogMessage(getGeneralLogInfo(this.y, str, com.lifesense.plugin.ble.b.a.a.Pair_Results, null, z));
        if (y() != null && this.V == -2) {
            this.V = i;
            y().a(lSDeviceInfo, i);
        }
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public void a(LSDisconnectStatus lSDisconnectStatus, int i) {
        if (com.lifesense.plugin.ble.device.a.c.PAIRING == this.d) {
            printLogMessage(getPrintLogInfo("failed to pair device,status error >>" + x(), 1));
            a(this.B, i);
        }
        c(lSDisconnectStatus);
    }

    @Override // com.lifesense.plugin.ble.device.a.a.a.d
    public void a(com.lifesense.plugin.ble.device.a.a.a.b bVar) {
        if (bVar == null) {
            return;
        }
        printLogMessage(getPrintLogInfo("on push command notify with obj >>" + bVar.toString(), 3));
        if (LSConnectState.ConnectSuccess == this.A) {
            b(bVar);
        } else {
            s().a(this.y, bVar.c(), LSErrorCode.DeviceNotConnected.getCode());
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public void a(com.lifesense.plugin.ble.device.a.b bVar) {
        this.p = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.lifesense.plugin.ble.device.proto.a aVar) {
        float height;
        float weight;
        int i = n.a[aVar.ordinal()];
        if (i == 1) {
            if (!F()) {
                a(z());
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("2A28");
            a(arrayList);
            return;
        }
        switch (i) {
            case 4:
                int pairMode = l().getPairMode();
                int i2 = 4;
                if (pairMode != 4) {
                    i2 = 5;
                    if (pairMode != 5) {
                        i2 = 3;
                    }
                }
                a(this.N.formatResponsePacket(this.O.b(), com.lifesense.plugin.ble.device.proto.A5.parser.f.a(this.i, i2), this.i), com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5, com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID);
                break;
            case 5:
                if (this.Q) {
                    this.f8767e = z();
                    printLogMessage(getGeneralLogInfo(this.y, "call back paired request random number", com.lifesense.plugin.ble.b.a.a.Pair_Results, null, true));
                    LSDevicePairSetting lSDevicePairSetting = new LSDevicePairSetting();
                    lSDevicePairSetting.setPairCmd(LSPairCommand.RandomCodeConfirm);
                    y().a(this.B.getMacAddress(), lSDevicePairSetting);
                    this.Q = false;
                }
                break;
            case 6:
                a(new l(this));
                break;
            case 7:
                a(LSDisconnectStatus.Cancel, 0);
                break;
            case 8:
                boolean zEquals = this.S.equals(this.T);
                if (!zEquals) {
                    printLogMessage(getGeneralLogInfo(this.y, "random code check err", com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
                } else {
                    a(this.N.formatResponsePacket(this.O.b(), com.lifesense.plugin.ble.device.proto.A5.parser.f.a(this.T, zEquals), this.i), com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5, com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID);
                }
                break;
            case 9:
                if (!this.U) {
                    a(LSDisconnectStatus.Cancel, 2);
                } else {
                    ATUserInfo userInfo = this.B.getUserInfo();
                    if (userInfo != null) {
                        weight = userInfo.getWeight();
                        height = userInfo.getHeight();
                        printLogMessage(getGeneralLogInfo(this.y, "pairing,update user info=" + userInfo.formatUserInfo(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    } else {
                        height = 1.75f;
                        weight = 60.0f;
                    }
                    a(this.N.formatResponsePacket(this.O.b(), com.lifesense.plugin.ble.device.proto.A5.parser.f.a(this.U, weight, height), this.i), com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5, com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID);
                }
                break;
            case 10:
                com.lifesense.plugin.ble.device.proto.g gVar = this.O;
                a(this.N.encodePackage(gVar != null ? gVar.b() : "8000", new byte[]{123, this.W ? (byte) 1 : (byte) 0}, this.i), com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5, com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID);
                break;
            case 11:
                this.P = false;
                this.f8766c = false;
                this.T = "";
                this.U = false;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("A501");
                arrayList2.add("A503");
                super.b(arrayList2, this.x.d());
                break;
            case 12:
                if (this.R) {
                    z();
                    printLogMessage(getGeneralLogInfo(this.y, "call back paired confirm", com.lifesense.plugin.ble.b.a.a.Pair_Results, null, true));
                    y().a(this.B.getMacAddress());
                    this.R = false;
                }
                break;
            default:
                a(LSDisconnectStatus.Cancel, -1);
                break;
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void a(String str, Queue queue, com.lifesense.plugin.ble.device.a.c cVar) {
        if (com.lifesense.plugin.ble.device.a.c.FREE != this.d) {
            printLogMessage(getGeneralLogInfo(this.B.getMacAddress(), "failed to send connect device request,status error=" + this.d, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            return;
        }
        if (BluetoothAdapter.checkBluetoothAddress(str) && queue != null) {
            i();
            this.N = new A5ProtoDecoder(str, this.Y);
            super.a(str, queue, this.Z, cVar);
            com.lifesense.plugin.ble.device.a.a.g.a().a(this.y);
            return;
        }
        printLogMessage(getGeneralLogInfo(this.B.getMacAddress(), "failed to send connect device request with address=" + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
    }

    public void a(boolean z) {
        if (this.f8767e != com.lifesense.plugin.ble.device.proto.a.WRITE_PAIR_CONFIRM_RESULT || this.U) {
            return;
        }
        printLogMessage(getGeneralLogInfo(this.y, "device pair,app input confirm, state=" + z, com.lifesense.plugin.ble.b.a.a.Warning_Message, "", true));
        this.U = z;
        a(this.f8767e);
    }

    @SuppressLint({"InlinedApi"})
    private void a(byte[] bArr, UUID uuid, UUID uuid2) {
        a(bArr, uuid, uuid2, u.UNKNOWN);
    }

    public synchronized void a(byte[] bArr, UUID uuid, UUID uuid2, u uVar) {
        a(bArr, uuid, uuid2, 2, 0, uVar);
        H();
    }
}
