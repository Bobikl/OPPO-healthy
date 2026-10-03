package com.lifesense.plugin.ble.device.proto.A5;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Message;
import com.lifesense.plugin.ble.LSBluetoothManager;
import com.lifesense.plugin.ble.a.a.u;
import com.lifesense.plugin.ble.data.LSDisconnectStatus;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.device.proto.A5.parser.A5ProtoDecoder;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"InlinedApi"})
public class d extends com.lifesense.plugin.ble.device.proto.k {
    private int M;
    private A5ProtoDecoder N;
    private com.lifesense.plugin.ble.device.proto.g O;
    private LSProtocolType P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private LSUpgradeState U;
    private boolean V;
    private boolean W;
    private boolean X;
    private List Y;
    private File Z;
    private com.lifesense.plugin.ble.device.proto.A5.parser.b aa;
    private com.lifesense.plugin.ble.device.proto.A5.parser.d ab;
    private boolean ac;
    private boolean ad;
    private com.lifesense.plugin.ble.device.proto.A5.parser.c ae;
    private int af;
    private int ag;
    private String ah;
    private int ai;
    private com.lifesense.plugin.ble.device.proto.h aj;
    private com.lifesense.plugin.ble.device.proto.p ak;
    private Runnable al;

    public d(Context context, String str, Queue queue, File file) {
        super(str);
        this.M = 10;
        this.af = 3;
        this.ag = 0;
        this.aj = new e(this);
        this.ak = new f(this);
        this.al = new g(this);
        super.a(context, str, queue);
        this.U = LSUpgradeState.Unknown;
        this.k = 0;
        this.f = null;
        this.g = null;
        this.Z = file;
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public int c() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        com.lifesense.plugin.ble.device.proto.a aVarZ = z();
        com.lifesense.plugin.ble.device.proto.a aVar = com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_MODE_TO_DEVICE;
        if (aVarZ != aVar) {
            if (aVarZ != com.lifesense.plugin.ble.device.proto.a.SET_INDICATE_FOR_CHARACTERISTICS) {
                printLogMessage(getGeneralLogInfo(this.z, "failed to enable upgrade service,work flow error >> " + aVarZ, com.lifesense.plugin.ble.b.a.a.Program_Exception, null, true));
                c(LSDisconnectStatus.Cancel);
                return;
            }
            aVarZ = z();
            if (aVarZ == com.lifesense.plugin.ble.device.proto.a.WRITE_AUTH_RESPONSE_FOR_WECHAT) {
                aVarZ = z();
            }
            if (aVarZ != aVar) {
                return;
            }
        }
        this.R = true;
        this.Q = true;
        a(aVarZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        this.W = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add("A501");
        arrayList.add("A503");
        a(arrayList, this.x.d());
    }

    private boolean i() {
        if (!com.lifesense.plugin.ble.a.e.a().c() || LSUpgradeState.Connect != this.U) {
            return false;
        }
        printLogMessage(getGeneralLogInfo(this.y, "reconnect permission:" + com.lifesense.plugin.ble.device.a.a.a.DISABLE_RECONNECT + "; count=" + com.lifesense.plugin.ble.device.a.a.a.RECONNECT_COUNT + "(" + this.k + "); status=" + this.f8767e, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        com.lifesense.plugin.ble.device.proto.a aVar = this.f8767e;
        return !((aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE || aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND) && com.lifesense.plugin.ble.device.a.a.a.DISABLE_RECONNECT) && this.k <= com.lifesense.plugin.ble.device.a.a.a.RECONNECT_COUNT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f8769l.removeCallbacks(this.u);
        if (i()) {
            this.f8769l.postDelayed(this.u, 5000L);
            return;
        }
        printLogMessage(getGeneralLogInfo(this.z, x(), com.lifesense.plugin.ble.b.a.a.Abnormal_Disconnect, null, true));
        if (LSUpgradeState.UpgradeSuccess == this.U) {
            this.d = com.lifesense.plugin.ble.device.a.c.FREE;
            return;
        }
        int code = LSErrorCode.AbnormalDisconnect.getCode();
        if (!com.lifesense.plugin.ble.a.e.a().c()) {
            code = LSErrorCode.BluetoothUnavailable.getCode();
            k();
        }
        a(LSUpgradeState.UpgradeFailure, code);
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public LSUpgradeState d() {
        return this.U;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void f() {
        if (!com.lifesense.plugin.ble.a.e.a().c()) {
            printLogMessage(getGeneralLogInfo(this.z, "no permission to reconnect upgrade device,ble status error...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.BluetoothUnavailable.getCode());
            c(LSDisconnectStatus.Cancel);
            return;
        }
        if (LSUpgradeState.Connect != this.U) {
            printLogMessage(getGeneralLogInfo(this.z, "failed to reconnect upgrading device,status error=" + this.U, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.AbnormalDisconnect.getCode());
            c(LSDisconnectStatus.Cancel);
            return;
        }
        A();
        this.k++;
        printLogMessage(getGeneralLogInfo(this.z, "reconnect upgrade device[" + this.y + "]; count=" + this.k, com.lifesense.plugin.ble.b.a.a.Reconnect_Message, null, true));
        this.d = com.lifesense.plugin.ble.device.a.c.FREE;
        super.a(this.z, com.lifesense.plugin.ble.device.proto.c.b(), this.ak, com.lifesense.plugin.ble.device.a.c.UPGRADING);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void g() {
        C();
        if (com.lifesense.plugin.ble.a.e.a().c()) {
            q();
            j();
        } else {
            printLogMessage(getGeneralLogInfo(this.z, "connect timeout,failed to upgrade device,ble status error...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.BluetoothUnavailable.getCode());
            c(LSDisconnectStatus.Cancel);
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void b() {
        String str;
        if (LSUpgradeState.UpgradeSuccess != this.U) {
            int i = LSBluetoothManager.currentBluetoothState;
            if (i == 10 || i == 13) {
                a(LSUpgradeState.UpgradeFailure, LSErrorCode.BluetoothUnavailable.getCode());
                str = "cancel device upgrade process by bluetooth off...";
            } else {
                a(LSUpgradeState.UpgradeFailure, LSErrorCode.UserCancel.getCode());
                str = "cancel device upgrade process by user...";
            }
            printLogMessage(getGeneralLogInfo(this.z, str, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        }
        k();
        super.p();
        c(LSDisconnectStatus.Request);
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.a.a.l
    public String e() {
        com.lifesense.plugin.ble.device.proto.a aVar = com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_FILE_HEADER;
        com.lifesense.plugin.ble.device.proto.a aVar2 = this.f8767e;
        if (aVar == aVar2) {
            return "write/header";
        }
        if ((aVar2 == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE || aVar2 == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND) && this.ag <= 0) {
            return null;
        }
        return x().replace("operating/", "").replace("/command", "").replace("/to/device", "");
    }

    private void b(int i) {
        int i2 = this.s;
        if (i2 == i || i2 >= i) {
            return;
        }
        this.s = i;
        Message messageObtainMessage = this.f8769l.obtainMessage();
        messageObtainMessage.arg1 = 3;
        messageObtainMessage.arg2 = this.s;
        this.f8769l.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void c(com.lifesense.plugin.ble.a.a.m mVar) {
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.a.a.l
    public void d(com.lifesense.plugin.ble.a.a.m mVar) {
        super.d(mVar);
        C();
        if (com.lifesense.plugin.ble.a.e.a().c()) {
            q();
            j();
            return;
        }
        printLogMessage(getGeneralLogInfo(this.z, "#onWriteCharacteristicTimeout,upgrade failure=" + this.y, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        a(LSUpgradeState.UpgradeFailure, LSErrorCode.BluetoothUnavailable.getCode());
        c(LSDisconnectStatus.Cancel);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void e(com.lifesense.plugin.ble.a.a.m mVar) {
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public synchronized void c(LSDisconnectStatus lSDisconnectStatus) {
        super.D();
        super.C();
        this.k = 0;
        if (LSDisconnectStatus.Request != lSDisconnectStatus) {
            a(lSDisconnectStatus);
        }
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.device.proto.q
    public String a() {
        return this.z;
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void b(com.lifesense.plugin.ble.a.a.m mVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UUID uuid, UUID uuid2, byte[] bArr) {
        LSUpgradeState lSUpgradeState;
        LSErrorCode lSErrorCode;
        int iA;
        String strE = com.lifesense.plugin.ble.c.a.e(bArr);
        String strA = com.lifesense.plugin.ble.c.b.a(uuid2);
        byte[] bArrC = com.lifesense.plugin.ble.device.proto.A5.parser.d.c(bArr);
        if (bArrC[0] == 16) {
            byte b = bArrC[1];
            if (b == 2) {
                a(bArrC);
                return;
            }
            if (b == 3) {
                if (bArrC.length >= 9) {
                    byte[] bArr2 = new byte[2];
                    System.arraycopy(bArrC, bArrC.length - 2, bArr2, 0, 2);
                    iA = com.lifesense.plugin.ble.c.a.a(ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN).getShort()) / 100;
                } else {
                    com.lifesense.plugin.ble.device.proto.A5.parser.b bVar = this.aa;
                    com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.ab;
                    iA = com.lifesense.plugin.ble.c.c.a(100, (int) (Math.max(bVar.a(dVar.f8759c, dVar.d, dVar.f8760e), 0.01f) * 100.0f));
                }
                b(iA);
                a(bArrC, strE, strA);
                return;
            }
            if (b == 4) {
                if (bArrC[2] == 0) {
                    this.S = true;
                    com.lifesense.plugin.ble.device.proto.a aVar = this.f8767e;
                    if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND) {
                        a(aVar);
                    }
                    b(100);
                    return;
                }
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.FileVerificationFailed;
            } else {
                if (b == 5) {
                    this.S = true;
                    com.lifesense.plugin.ble.device.proto.a aVar2 = this.f8767e;
                    if (aVar2 == com.lifesense.plugin.ble.device.proto.a.WRITE_START_UPGRADING_NOTIFY_COMMAND) {
                        a(aVar2);
                        return;
                    }
                    return;
                }
                if (b != 6) {
                    return;
                }
                this.S = true;
                byte b2 = bArrC[2];
                if (b2 == 0) {
                    this.f8767e = z();
                    a(LSUpgradeState.UpgradeSuccess, 0);
                    return;
                } else if (b2 == 1) {
                    lSUpgradeState = LSUpgradeState.UpgradeFailure;
                    lSErrorCode = LSErrorCode.LowBattery;
                } else {
                    lSUpgradeState = LSUpgradeState.UpgradeFailure;
                    lSErrorCode = LSErrorCode.Unknown;
                }
            }
            a(lSUpgradeState, lSErrorCode.getCode());
            c(LSDisconnectStatus.Cancel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        com.lifesense.plugin.ble.device.proto.a aVarZ;
        this.aa.a(i);
        com.lifesense.plugin.ble.device.proto.A5.parser.b bVar = this.aa;
        com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.ab;
        com.lifesense.plugin.ble.device.proto.A5.parser.c cVarA = bVar.a(dVar.d, dVar.b);
        this.ae = cVarA;
        if (cVarA == null || cVarA.b()) {
            aVarZ = z();
        } else {
            aVarZ = this.f8767e;
            if (aVarZ != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE) {
                return;
            }
        }
        a(aVarZ);
    }

    @SuppressLint({"InlinedApi"})
    private synchronized void b(byte[] bArr, UUID uuid, int i) {
        UUID uuid2;
        UUID uuid3;
        int i2 = 1 != i ? 2 : 1;
        LSProtocolType lSProtocolType = this.P;
        if (lSProtocolType == LSProtocolType.A5) {
            uuid2 = com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5;
            uuid3 = com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID;
        } else if (lSProtocolType == LSProtocolType.UpgradeOfApollo) {
            uuid3 = uuid;
            uuid2 = com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_SERVICE_UUID;
        } else {
            uuid2 = null;
            uuid3 = null;
        }
        b(bArr, uuid2, uuid3, i2, 0, u.UNKNOWN);
        H();
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void a(BluetoothDevice bluetoothDevice, Queue queue, boolean z, com.lifesense.plugin.ble.device.a.c cVar) {
        if (com.lifesense.plugin.ble.device.a.c.FREE != this.d) {
            printLogMessage(getSupperLogInfo(this.z, "no permission to connect device again,status error >>" + cVar + "; currentStatus:" + this.d, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            return;
        }
        File file = this.Z;
        if (file == null || !file.exists() || !this.Z.isFile()) {
            printLogMessage(getSupperLogInfo(this.z, "failed to upgrade device,file error...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.FileFormatError.getCode());
            c(LSDisconnectStatus.Cancel);
            return;
        }
        this.y = bluetoothDevice.getAddress();
        this.aa = new com.lifesense.plugin.ble.device.proto.A5.parser.b(this.Z, 120, 20);
        printLogMessage(getGeneralLogInfo(this.y, "upgrade file=" + this.Z.getName() + "; fileSize=" + this.aa.b(), com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        this.ag = 0;
        this.d = cVar;
        LSUpgradeState lSUpgradeState = LSUpgradeState.Connect;
        this.U = lSUpgradeState;
        a(lSUpgradeState, 0);
        this.N = new A5ProtoDecoder(this.z, this.aj);
        super.a(this.y, queue, this.ak, cVar);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(Message message) {
        com.lifesense.plugin.ble.device.a.b bVar;
        if (message == null || (bVar = this.p) == null || 3 != message.arg1) {
            return;
        }
        bVar.a(this.z, message.arg2);
    }

    @Override // com.lifesense.plugin.ble.a.a.l
    public void a(com.lifesense.plugin.ble.a.a.m mVar) {
    }

    private void a(LSUpgradeState lSUpgradeState, int i) {
        LSUpgradeState lSUpgradeState2 = LSUpgradeState.UpgradeFailure;
        if (lSUpgradeState2 == this.U) {
            return;
        }
        if (lSUpgradeState2 == lSUpgradeState) {
            printLogMessage(getGeneralLogInfo(this.z, "failed to upgrade device,progress =" + this.s + ",offset=" + this.ai, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
        }
        this.U = lSUpgradeState;
        if (y() != null) {
            y().a(this, this.z, lSUpgradeState.getValue(), i);
        }
    }

    @Override // com.lifesense.plugin.ble.device.a.a.a.d
    public void a(com.lifesense.plugin.ble.device.a.a.a.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.lifesense.plugin.ble.device.proto.a aVar) {
        ArrayList arrayList;
        String str;
        if (aVar == null) {
            printLogMessage(getGeneralLogInfo(this.z, "failed to handle working flow,program exception....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.Unknown.getCode());
            c(LSDisconnectStatus.Cancel);
            return;
        }
        switch (h.a[aVar.ordinal()]) {
            case 1:
                this.Q = false;
                this.R = false;
                arrayList = new ArrayList();
                str = "A501";
                break;
            case 2:
                byte[] bArrB = com.lifesense.plugin.ble.device.proto.A5.parser.f.b("01", this.ah);
                a(this.N.formatResponsePacket(this.O.b(), bArrB, this.ah), com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID, 2);
                return;
            case 3:
                this.ac = false;
                printLogMessage(getGeneralLogInfo(this.z, "try to enable upgrade service now.....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                arrayList = new ArrayList();
                str = "A701";
                break;
            case 4:
                this.X = false;
                List listB = com.lifesense.plugin.ble.device.proto.A5.parser.d.b(this.aa.a());
                this.Y = listB;
                a((byte[]) listB.remove(0), com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                return;
            case 5:
                com.lifesense.plugin.ble.b.c.a();
                this.S = false;
                b(this.ae.a(), com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_WITHOUT_RESPONSE_UUID, 1);
                return;
            case 6:
                com.lifesense.plugin.ble.b.c.b();
                this.ad = false;
                this.S = false;
                byte[] bArrB2 = this.aa.b(this.ab.d, this.ae.b);
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.put((byte) 3);
                byteBufferOrder.put((byte) 1);
                byteBufferOrder.put((byte) 12);
                byteBufferOrder.putInt(this.ae.b);
                byteBufferOrder.put(bArrB2);
                byteBufferOrder.putInt(this.ab.d);
                a(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position()), com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                return;
            case 7:
                com.lifesense.plugin.ble.b.c.b();
                this.S = false;
                a(new byte[]{4, 1, 0}, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                return;
            case 8:
                this.S = false;
                a(new byte[]{5, 1, 0}, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                return;
            case 9:
                this.S = false;
                a(new byte[]{6, 1, 0}, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                return;
            case 10:
                return;
            default:
                c(LSDisconnectStatus.Cancel);
                return;
        }
        arrayList.add(str);
        b(arrayList, this.x.d());
    }

    @Override // com.lifesense.plugin.ble.device.proto.q
    public void a(String str, Queue queue, com.lifesense.plugin.ble.device.a.c cVar) {
        if (com.lifesense.plugin.ble.device.a.c.FREE != this.d) {
            printLogMessage(getSupperLogInfo(this.z, "no permission to connect again,status error >>" + cVar + "; currentStatus:" + this.d, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            return;
        }
        File file = this.Z;
        if (file == null || !file.exists() || !this.Z.isFile()) {
            printLogMessage(getSupperLogInfo(this.z, "failed to upgrade device,file error...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.FileFormatError.getCode());
            c(LSDisconnectStatus.Cancel);
            return;
        }
        this.aa = new com.lifesense.plugin.ble.device.proto.A5.parser.b(this.Z, 120, 20);
        printLogMessage(getGeneralLogInfo(str, "upgrade file=" + this.Z.getName() + "; fileSize=" + this.aa.b() + ";", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        this.ag = 0;
        this.d = cVar;
        LSUpgradeState lSUpgradeState = LSUpgradeState.Connect;
        this.U = lSUpgradeState;
        a(lSUpgradeState, 0);
        this.y = str;
        this.N = new A5ProtoDecoder(this.z, this.aj);
        super.a(str, queue, this.ak, cVar);
    }

    private void a(byte[] bArr) {
        byte b = bArr[2];
        if (b != 0) {
            a(LSUpgradeState.UpgradeFailure, com.lifesense.plugin.ble.device.proto.A5.parser.d.a(b));
            c(LSDisconnectStatus.Cancel);
            return;
        }
        this.X = true;
        com.lifesense.plugin.ble.device.proto.A5.parser.d dVarA = com.lifesense.plugin.ble.device.proto.A5.parser.d.a(bArr);
        this.ab = dVarA;
        dVarA.b = Math.min(dVarA.b, this.M);
        com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.ab;
        this.M = dVar.b;
        printLogMessage(getGeneralLogInfo(this.z, dVar.a(), com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        int i = this.ab.a;
        if (i <= 20 || i > 255) {
            a(20);
        } else {
            if (c(i + 3)) {
                return;
            }
            a(20);
        }
    }

    private void a(byte[] bArr, String str, String str2) {
        LSUpgradeState lSUpgradeState;
        LSErrorCode lSErrorCode;
        com.lifesense.plugin.ble.device.proto.a aVarZ;
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 3, bArr2, 0, 4);
        int iF = com.lifesense.plugin.ble.c.a.f(bArr2);
        this.ab.d = iF;
        this.ai = iF;
        byte b = bArr[2];
        if (b == 0) {
            if (this.ag > 0) {
                printLogMessage(getGeneralLogInfo(this.z, str, com.lifesense.plugin.ble.b.a.a.Receive_Data, str2, true));
            }
            this.ag = 0;
            this.S = true;
            this.T = 0;
            com.lifesense.plugin.ble.device.proto.A5.parser.b bVar = this.aa;
            com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.ab;
            com.lifesense.plugin.ble.device.proto.A5.parser.c cVarA = bVar.a(dVar.d, dVar.b);
            this.ae = cVarA;
            com.lifesense.plugin.ble.device.proto.a aVar = this.f8767e;
            if (aVar != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE) {
                if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND) {
                    a(aVar);
                    return;
                }
                return;
            }
            if (cVarA == null || cVarA.b()) {
                printLogMessage(getGeneralLogInfo(this.y, "Update Node=" + com.lifesense.plugin.ble.c.a.d(bArr) + "; offset=" + iF, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                aVarZ = z();
            }
            a(aVarZ);
        }
        if (b == 1) {
            printLogMessage(getGeneralLogInfo(this.z, str, com.lifesense.plugin.ble.b.a.a.Receive_Data, str2, true));
            int i = this.ag;
            if (i >= this.af) {
                this.ag = 0;
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.ConfirmTimeout;
            } else {
                this.ag = i + 1;
                this.S = true;
                this.T = 0;
                com.lifesense.plugin.ble.device.proto.A5.parser.b bVar2 = this.aa;
                com.lifesense.plugin.ble.device.proto.A5.parser.d dVar2 = this.ab;
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVarA2 = bVar2.a(dVar2.d, dVar2.b);
                this.ae = cVarA2;
                if (cVarA2 == null) {
                    printLogMessage(getGeneralLogInfo(this.z, "failed to send file block,exception=" + iF, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                    this.ag = 0;
                    a(LSUpgradeState.UpgradeFailure, LSErrorCode.ConfirmTimeout.getCode());
                    c(LSDisconnectStatus.Cancel);
                    return;
                }
                String str3 = "resend file block with offset address:[" + Long.toHexString(iF) + "]; count=" + this.ag;
                String str4 = this.z;
                com.lifesense.plugin.ble.b.a.a aVar2 = com.lifesense.plugin.ble.b.a.a.Upgrade_Message;
                printLogMessage(getGeneralLogInfo(str4, str3, aVar2, null, true));
                if (!this.ad || this.f8767e != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE) {
                    return;
                }
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVar = this.ae;
                if (cVar == null || cVar.b()) {
                    printLogMessage(getGeneralLogInfo(this.z, "failed to resend file block,program exception....", aVar2, null, false));
                    lSUpgradeState = LSUpgradeState.UpgradeFailure;
                    lSErrorCode = LSErrorCode.Unknown;
                }
            }
        } else {
            printLogMessage(getGeneralLogInfo(this.z, str, com.lifesense.plugin.ble.b.a.a.Receive_Data, str2, true));
            if (bArr[2] == 2) {
                printLogMessage(getGeneralLogInfo(this.z, "failed to send file block,device flash exception....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.FlashSaveFailed;
            } else {
                printLogMessage(getGeneralLogInfo(this.z, "failed to send file block,device exception....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.Unknown;
            }
        }
        a(lSUpgradeState, lSErrorCode.getCode());
        c(LSDisconnectStatus.Cancel);
        return;
        aVarZ = this.f8767e;
        a(aVarZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, UUID uuid) {
        com.lifesense.plugin.ble.device.proto.a aVarZ;
        int i;
        com.lifesense.plugin.ble.device.proto.A5.parser.c cVar;
        com.lifesense.plugin.ble.device.proto.a aVar = this.f8767e;
        if (aVar != com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_FILE_HEADER) {
            com.lifesense.plugin.ble.device.proto.a aVar2 = com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE;
            if (aVar == aVar2) {
                this.T++;
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVar2 = this.ae;
                if (cVar2 == null || cVar2.b() || ((i = this.T) > 0 && i % this.M == 0)) {
                    aVarZ = com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND;
                    this.f8767e = aVarZ;
                }
            } else if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND) {
                this.ad = true;
                this.f8767e = aVar2;
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVar3 = this.ae;
                if (cVar3 == null || cVar3.b()) {
                    if (this.S) {
                        aVarZ = z();
                        this.f8767e = aVarZ;
                        if (aVarZ != com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND) {
                            return;
                        }
                    } else {
                        if (this.T != 0) {
                            return;
                        }
                        this.f8767e = aVar2;
                        com.lifesense.plugin.ble.device.proto.A5.parser.c cVar4 = this.ae;
                        if (cVar4 == null || cVar4.b()) {
                            return;
                        }
                    }
                } else if (!this.S) {
                    return;
                }
            } else if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND) {
                aVarZ = z();
                this.f8767e = aVarZ;
                if (!this.S || aVarZ != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND) {
                    return;
                }
            } else {
                if (aVar != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND) {
                    return;
                }
                aVarZ = z();
                this.f8767e = aVarZ;
                if (!this.S || aVarZ != com.lifesense.plugin.ble.device.proto.a.WRITE_START_UPGRADING_NOTIFY_COMMAND) {
                    return;
                }
            }
            a(aVarZ);
        }
        byte[] bArr2 = this.Y.size() > 0 ? (byte[]) this.Y.remove(0) : null;
        if (bArr2 != null && bArr2.length > 0) {
            a(bArr2, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
            return;
        }
        printLogMessage(getGeneralLogInfo(this.y, "notify next task,state = " + this.X, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        H();
        com.lifesense.plugin.ble.device.proto.a aVarZ2 = z();
        this.f8767e = aVarZ2;
        if (aVarZ2 != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE || !this.X || (cVar = this.ae) == null || cVar.b()) {
            return;
        }
        aVarZ = this.f8767e;
        a(aVarZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public synchronized void a(byte[] bArr, UUID uuid, int i) {
        UUID uuid2;
        UUID uuid3;
        int i2 = 1 != i ? 2 : 1;
        LSProtocolType lSProtocolType = this.P;
        if (lSProtocolType == LSProtocolType.A5) {
            uuid2 = com.lifesense.plugin.ble.device.proto.j.PEDOMETER_SERVICE_UUID_A5;
            uuid3 = com.lifesense.plugin.ble.device.proto.j.PEDOMETER_A5_WRITE_CHARACTERISTIC_UUID;
        } else if (lSProtocolType == LSProtocolType.UpgradeOfApollo) {
            uuid3 = uuid;
            uuid2 = com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_SERVICE_UUID;
        } else {
            uuid2 = null;
            uuid3 = null;
        }
        a(bArr, uuid2, uuid3, i2, 0, u.UNKNOWN);
        H();
    }

    @Override // com.lifesense.plugin.ble.device.proto.k, com.lifesense.plugin.ble.a.a.l
    public boolean a(UUID uuid, int i, byte[] bArr) {
        com.lifesense.plugin.ble.device.proto.g gVarA;
        if (com.lifesense.plugin.ble.device.a.a.a.LOG_ALL_UPGRADE_FILE_DATA_PERMISSION || uuid == null) {
            return true;
        }
        int iA = (bArr == null || bArr.length < 1) ? 0 : com.lifesense.plugin.ble.c.a.a(bArr[0]);
        if (com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_WITHOUT_RESPONSE_UUID.equals(uuid) && 1 == i) {
            return com.lifesense.plugin.ble.device.a.a.a.LOG_ALL_UPGRADE_FILE_DATA_PERMISSION;
        }
        if (com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID.equals(uuid) && 3 == iA) {
            return com.lifesense.plugin.ble.device.a.a.a.LOG_ALL_UPGRADE_FILE_DATA_PERMISSION;
        }
        if (!com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_INDICATE_UUID.equals(uuid) || (gVarA = com.lifesense.plugin.ble.device.proto.A5.parser.a.a(bArr, null)) == null || gVarA.k() == null || 3 != com.lifesense.plugin.ble.c.a.a(gVarA.k()[0])) {
            return true;
        }
        return com.lifesense.plugin.ble.device.a.a.a.LOG_ALL_UPGRADE_FILE_DATA_PERMISSION;
    }
}
