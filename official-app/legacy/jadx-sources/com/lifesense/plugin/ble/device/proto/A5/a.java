package com.lifesense.plugin.ble.device.proto.A5;

import android.annotation.SuppressLint;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"InlinedApi"})
public class a extends com.lifesense.plugin.ble.b.a {
    private boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8751c;
    private LSUpgradeState d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8752e;
    private List f;
    private File g;
    private com.lifesense.plugin.ble.device.proto.A5.parser.b h;
    private com.lifesense.plugin.ble.device.proto.A5.parser.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8753j;
    private com.lifesense.plugin.ble.device.proto.A5.parser.c k;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8755n;
    private String o;
    private Queue p;
    private int q;
    private com.lifesense.plugin.ble.device.proto.a r;
    private com.lifesense.plugin.ble.device.proto.f s;
    private o t;
    private boolean u;
    private int a = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8754l = 3;
    private com.lifesense.plugin.ble.device.proto.p v = new b(this);

    public a(o oVar, String str, File file) {
        this.m = 0;
        this.o = str;
        this.g = file;
        this.h = new com.lifesense.plugin.ble.device.proto.A5.parser.b(file, 120, 20);
        printLogMessage(getGeneralLogInfo(this.o, "download file=" + this.g.getName() + "; fileSize=" + this.h.b(), com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        this.t = oVar;
        this.d = LSUpgradeState.Upgrading;
        this.m = 0;
        Queue queueE = e();
        this.p = queueE;
        com.lifesense.plugin.ble.device.proto.f fVar = (com.lifesense.plugin.ble.device.proto.f) queueE.remove();
        this.s = fVar;
        this.r = fVar.a();
    }

    private Queue e() {
        LinkedList linkedList = new LinkedList();
        com.lifesense.plugin.ble.device.proto.f fVar = new com.lifesense.plugin.ble.device.proto.f(com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_FILE_HEADER, null);
        com.lifesense.plugin.ble.device.proto.f fVar2 = new com.lifesense.plugin.ble.device.proto.f(com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE, null);
        com.lifesense.plugin.ble.device.proto.f fVar3 = new com.lifesense.plugin.ble.device.proto.f(com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND, null);
        com.lifesense.plugin.ble.device.proto.f fVar4 = new com.lifesense.plugin.ble.device.proto.f(com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND, null);
        com.lifesense.plugin.ble.device.proto.f fVar5 = new com.lifesense.plugin.ble.device.proto.f(com.lifesense.plugin.ble.device.proto.a.WRITE_START_UPGRADING_NOTIFY_COMMAND, null);
        com.lifesense.plugin.ble.device.proto.f fVar6 = new com.lifesense.plugin.ble.device.proto.f(com.lifesense.plugin.ble.device.proto.a.WAITING_TO_RECEIVE_DATA, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        linkedList.add(fVar6);
        return linkedList;
    }

    public synchronized com.lifesense.plugin.ble.device.proto.a d() {
        Queue queue = this.p;
        if (queue == null) {
            this.s = null;
            this.r = null;
            return null;
        }
        queue.remove(this.s);
        com.lifesense.plugin.ble.device.proto.f fVar = (com.lifesense.plugin.ble.device.proto.f) this.p.peek();
        this.s = fVar;
        if (fVar == null || fVar.a() == null) {
            return null;
        }
        this.r = this.s.a();
        StringBuilder sb = new StringBuilder();
        sb.append("next step is :");
        sb.append(this.r);
        return this.r;
    }

    public void a() {
        com.lifesense.plugin.ble.device.proto.a aVar = this.r;
        if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_FILE_HEADER) {
            this.u = false;
            a(aVar);
            return;
        }
        printLogMessage(getGeneralLogInfo(this.o, "failed to start downloading,status error=" + this.r, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    public com.lifesense.plugin.ble.device.proto.p c() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.h.a(i);
        com.lifesense.plugin.ble.device.proto.A5.parser.b bVar = this.h;
        com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.i;
        com.lifesense.plugin.ble.device.proto.A5.parser.c cVarA = bVar.a(dVar.d, dVar.b);
        this.k = cVarA;
        if (cVarA == null || cVarA.b()) {
            printLogMessage(getGeneralLogInfo(this.o, "no file block to send,is over=" + this.r + "; mtu=" + i, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            a(d());
            return;
        }
        com.lifesense.plugin.ble.device.proto.a aVar = this.r;
        if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE) {
            a(aVar);
            return;
        }
        printLogMessage(getGeneralLogInfo(this.o, "failed to send file block,state error=" + this.r + "; mtu=" + i, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    public void b() {
        printLogMessage(getGeneralLogInfo(this.o, "cancel file downloading.", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        this.u = true;
    }

    private void a(LSUpgradeState lSUpgradeState, int i) {
        LSUpgradeState lSUpgradeState2 = LSUpgradeState.UpgradeFailure;
        if (lSUpgradeState2 == this.d) {
            return;
        }
        if (lSUpgradeState2 == lSUpgradeState) {
            printLogMessage(getGeneralLogInfo(this.o, "failed to upgrade device,progress =" + this.q + ",offset=" + this.f8755n, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
        }
        this.d = lSUpgradeState;
        this.t.a(lSUpgradeState, i);
    }

    private void b(int i) {
        int i2 = this.q;
        if (i2 == i || i2 >= i) {
            return;
        }
        this.q = i;
        this.t.b(i);
    }

    @SuppressLint({"InlinedApi"})
    private synchronized void b(byte[] bArr, UUID uuid, int i) {
        o oVar = this.t;
        if (oVar != null) {
            oVar.b(bArr, uuid, i);
        }
    }

    private void a(com.lifesense.plugin.ble.device.proto.a aVar) {
        if (aVar == null) {
            printLogMessage(getGeneralLogInfo(this.o, "failed to handle working flow,program exception....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
            a(LSUpgradeState.UpgradeFailure, LSErrorCode.Unknown.getCode());
        }
        switch (c.a[aVar.ordinal()]) {
            case 1:
                this.f8752e = false;
                List listB = com.lifesense.plugin.ble.device.proto.A5.parser.d.b(this.h.a());
                this.f = listB;
                a((byte[]) listB.remove(0), com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                break;
            case 2:
                com.lifesense.plugin.ble.b.c.a();
                this.b = false;
                b(this.k.a(), com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_WITHOUT_RESPONSE_UUID, 1);
                break;
            case 3:
                com.lifesense.plugin.ble.b.c.b();
                this.f8753j = false;
                this.b = false;
                byte[] bArrB = this.h.b(this.i.d, this.k.b);
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.put((byte) 3);
                byteBufferOrder.put((byte) 1);
                byteBufferOrder.put((byte) 12);
                byteBufferOrder.putInt(this.k.b);
                byteBufferOrder.put(bArrB);
                byteBufferOrder.putInt(this.i.d);
                a(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position()), com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                break;
            case 4:
                com.lifesense.plugin.ble.b.c.b();
                this.b = false;
                a(new byte[]{4, 1, 0}, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                break;
            case 5:
                this.b = false;
                a(new byte[]{5, 1, 0}, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                break;
            case 6:
                this.b = false;
                a(new byte[]{6, 1, 0}, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
                break;
            case 7:
                break;
            default:
                printLogMessage(getGeneralLogInfo(this.o, "failed to handle this action,undefined." + aVar, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UUID uuid, UUID uuid2, byte[] bArr) {
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
                    com.lifesense.plugin.ble.device.proto.A5.parser.b bVar = this.h;
                    com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.i;
                    iA = com.lifesense.plugin.ble.c.c.a(100, (int) (Math.max(bVar.a(dVar.f8759c, dVar.d, dVar.f8760e), 0.01f) * 100.0f));
                }
                b(iA);
                a(bArrC, strE, strA);
                return;
            }
            if (b == 4) {
                if (bArrC[2] == 0) {
                    this.b = true;
                    com.lifesense.plugin.ble.device.proto.a aVar = this.r;
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
                    this.b = true;
                    com.lifesense.plugin.ble.device.proto.a aVar2 = this.r;
                    if (aVar2 == com.lifesense.plugin.ble.device.proto.a.WRITE_START_UPGRADING_NOTIFY_COMMAND) {
                        a(aVar2);
                        return;
                    }
                    return;
                }
                if (b != 6) {
                    return;
                }
                this.b = true;
                byte b2 = bArrC[2];
                if (b2 == 0) {
                    this.r = d();
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
        }
    }

    private void a(byte[] bArr) {
        byte b = bArr[2];
        if (b != 0) {
            a(LSUpgradeState.UpgradeFailure, com.lifesense.plugin.ble.device.proto.A5.parser.d.a(b));
            return;
        }
        this.f8752e = true;
        com.lifesense.plugin.ble.device.proto.A5.parser.d dVarA = com.lifesense.plugin.ble.device.proto.A5.parser.d.a(bArr);
        this.i = dVarA;
        dVarA.b = Math.min(dVarA.b, this.a);
        com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.i;
        this.a = dVar.b;
        printLogMessage(getGeneralLogInfo(this.o, dVar.a(), com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
        int i = this.i.a;
        if (i <= 20 || i > 255) {
            a(20);
        } else {
            if (this.t.a(i + 3)) {
                return;
            }
            a(20);
        }
    }

    private void a(byte[] bArr, String str, String str2) {
        com.lifesense.plugin.ble.b.b generalLogInfo;
        LSUpgradeState lSUpgradeState;
        LSErrorCode lSErrorCode;
        com.lifesense.plugin.ble.device.proto.a aVarD;
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 3, bArr2, 0, 4);
        int iF = com.lifesense.plugin.ble.c.a.f(bArr2);
        this.i.d = iF;
        this.f8755n = iF;
        byte b = bArr[2];
        if (b == 0) {
            if (this.m > 0) {
                printLogMessage(getGeneralLogInfo(this.o, str, com.lifesense.plugin.ble.b.a.a.Receive_Data, str2, true));
            }
            this.m = 0;
            this.b = true;
            this.f8751c = 0;
            com.lifesense.plugin.ble.device.proto.A5.parser.b bVar = this.h;
            com.lifesense.plugin.ble.device.proto.A5.parser.d dVar = this.i;
            com.lifesense.plugin.ble.device.proto.A5.parser.c cVarA = bVar.a(dVar.d, dVar.b);
            this.k = cVarA;
            com.lifesense.plugin.ble.device.proto.a aVar = this.r;
            if (aVar != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE) {
                if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND) {
                    a(aVar);
                    return;
                }
                return;
            }
            if (cVarA == null || cVarA.b()) {
                printLogMessage(getGeneralLogInfo(this.o, "Update Node=" + com.lifesense.plugin.ble.c.a.d(bArr) + "; offset=" + iF, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                aVarD = d();
            }
            a(aVarD);
        }
        if (b == 1) {
            printLogMessage(getGeneralLogInfo(this.o, str, com.lifesense.plugin.ble.b.a.a.Receive_Data, str2, true));
            int i = this.m;
            if (i >= this.f8754l) {
                this.m = 0;
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.ConfirmTimeout;
            } else {
                this.m = i + 1;
                this.b = true;
                this.f8751c = 0;
                com.lifesense.plugin.ble.device.proto.A5.parser.b bVar2 = this.h;
                com.lifesense.plugin.ble.device.proto.A5.parser.d dVar2 = this.i;
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVarA2 = bVar2.a(dVar2.d, dVar2.b);
                this.k = cVarA2;
                if (cVarA2 == null) {
                    printLogMessage(getGeneralLogInfo(this.o, "failed to send file block,exception=" + iF, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                    this.m = 0;
                    a(LSUpgradeState.UpgradeFailure, LSErrorCode.ConfirmTimeout.getCode());
                    return;
                }
                String str3 = "resend file block with offset address:[" + Long.toHexString(iF) + "]; count=" + this.m;
                String str4 = this.o;
                com.lifesense.plugin.ble.b.a.a aVar2 = com.lifesense.plugin.ble.b.a.a.Upgrade_Message;
                printLogMessage(getGeneralLogInfo(str4, str3, aVar2, null, true));
                if (!this.f8753j || this.r != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE) {
                    return;
                }
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVar = this.k;
                if (cVar == null || cVar.b()) {
                    generalLogInfo = getGeneralLogInfo(this.o, "failed to resend file block,program exception....", aVar2, null, false);
                    printLogMessage(generalLogInfo);
                    lSUpgradeState = LSUpgradeState.UpgradeFailure;
                    lSErrorCode = LSErrorCode.Unknown;
                }
            }
        } else {
            printLogMessage(getGeneralLogInfo(this.o, str, com.lifesense.plugin.ble.b.a.a.Receive_Data, str2, true));
            if (bArr[2] == 2) {
                printLogMessage(getGeneralLogInfo(this.o, "failed to send file block,device flash exception....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.FlashSaveFailed;
            } else {
                generalLogInfo = getGeneralLogInfo(this.o, "failed to send file block,device exception....", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false);
                printLogMessage(generalLogInfo);
                lSUpgradeState = LSUpgradeState.UpgradeFailure;
                lSErrorCode = LSErrorCode.Unknown;
            }
        }
        a(lSUpgradeState, lSErrorCode.getCode());
        return;
        aVarD = this.r;
        a(aVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, UUID uuid) {
        com.lifesense.plugin.ble.device.proto.a aVarD;
        int i;
        com.lifesense.plugin.ble.device.proto.A5.parser.c cVar;
        com.lifesense.plugin.ble.device.proto.a aVar = this.r;
        if (aVar != com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_FILE_HEADER) {
            com.lifesense.plugin.ble.device.proto.a aVar2 = com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE;
            if (aVar == aVar2) {
                this.f8751c++;
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVar2 = this.k;
                if (cVar2 == null || cVar2.b() || ((i = this.f8751c) > 0 && i % this.a == 0)) {
                    aVarD = com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND;
                    this.r = aVarD;
                }
            } else if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND) {
                this.f8753j = true;
                this.r = aVar2;
                com.lifesense.plugin.ble.device.proto.A5.parser.c cVar3 = this.k;
                if (cVar3 == null || cVar3.b()) {
                    if (this.b) {
                        aVarD = d();
                        this.r = aVarD;
                        if (aVarD != com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND) {
                            return;
                        }
                    } else {
                        if (this.f8751c != 0) {
                            return;
                        }
                        this.r = aVar2;
                        com.lifesense.plugin.ble.device.proto.A5.parser.c cVar4 = this.k;
                        if (cVar4 == null || cVar4.b()) {
                            return;
                        }
                    }
                } else if (!this.b) {
                    return;
                }
            } else if (aVar == com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND) {
                aVarD = d();
                this.r = aVarD;
                if (!this.b || aVarD != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND) {
                    return;
                }
            } else {
                if (aVar != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND) {
                    return;
                }
                aVarD = d();
                this.r = aVarD;
                if (!this.b || aVarD != com.lifesense.plugin.ble.device.proto.a.WRITE_START_UPGRADING_NOTIFY_COMMAND) {
                    return;
                }
            }
            a(aVarD);
        }
        byte[] bArr2 = this.f.size() > 0 ? (byte[]) this.f.remove(0) : null;
        if (bArr2 != null && bArr2.length > 0) {
            a(bArr2, com.lifesense.plugin.ble.device.proto.j.APOLLO_DEVICE_DFU_WRITE_RESPONSE_UUID, 2);
            return;
        }
        o oVar = this.t;
        if (oVar != null) {
            oVar.j();
        }
        com.lifesense.plugin.ble.device.proto.a aVarD2 = d();
        this.r = aVarD2;
        if (aVarD2 != com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE || !this.f8752e || (cVar = this.k) == null || cVar.b()) {
            return;
        }
        aVarD = this.r;
        a(aVarD);
    }

    @SuppressLint({"InlinedApi"})
    private synchronized void a(byte[] bArr, UUID uuid, int i) {
        o oVar = this.t;
        if (oVar != null) {
            oVar.a(bArr, uuid, i);
        }
    }

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
