package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.transport.consult.proto.ConsultProto;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wf3 implements mp9 {
    public final ModuleInfo a;
    public mp9.a c;
    public qdk d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public int m;
    public long n;
    public long o;
    public boolean p;
    public RSAPrivateKey q;
    public RSAPublicKey r;
    public byte[] s;
    public byte[] t;
    public Handler b = new Handler(Looper.getMainLooper());
    public int l = 0;
    public Runnable u = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (wf3.this) {
                if (wf3.this.m != 1 || wf3.this.l >= 3) {
                    uml.b("ClientConsultHelper", "run: consult timeout : " + wf3.this.m);
                    wf3.this.w(7);
                    return;
                }
                uml.a("ClientConsultHelper", "transport consult timeout retry: " + wf3.this.l);
                wf3 wf3Var = wf3.this;
                wf3Var.l = wf3Var.l + 1;
                wf3.this.M();
            }
        }
    }

    public class b implements lt2<Void> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.lt2
        public void a(Throwable th, int i) {
            wf3.this.d.e(new ao6(wf3.this.p, wf3.this.s, wf3.this.t, rb3.CIPHER_AES_256));
            rdk.e().k(wf3.this.a, wf3.this.d);
            wf3 wf3Var = wf3.this;
            wf3Var.x(wf3Var.d);
        }

        @Override // com.oplus.aiunit.vision.lt2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r5) {
            wf3.this.d.e(new ao6(wf3.this.p, wf3.this.s, wf3.this.t, rb3.CIPHER_AES_256));
            rdk.e().k(wf3.this.a, wf3.this.d);
            wf3 wf3Var = wf3.this;
            wf3Var.x(wf3Var.d);
        }
    }

    public wf3(ModuleInfo moduleInfo) {
        this.a = moduleInfo;
    }

    public final void A(byte[] bArr) {
        uml.a("ClientConsultHelper", "processIdentityConsult: ");
        R();
        try {
            this.o = ConsultProto.IdentityConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length)).getRandomNumber();
            uml.a("ClientConsultHelper", "processIdentityConsult: " + this.o);
            byte[] bArrF = utg.g().f(this.n, this.o, rb3.CIPHER_AES_128);
            if (bArrF == null) {
                uml.a("ClientConsultHelper", "processIdentityConsult: key empty");
                w(9);
            } else {
                this.i = bArrF;
                H();
            }
        } catch (InvalidProtocolBufferException e) {
            uml.b("ClientConsultHelper", "processIdentityConsult: " + e);
            w(4);
        }
    }

    public final void B(byte[] bArr) {
        R();
        try {
            int state = ConsultProto.KeyConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length)).getState();
            uml.a("ClientConsultHelper", "processKeyConsult: state " + state);
            if (state == 1) {
                if (this.e) {
                    utg.g().j(this.a.getNodeId(), this.h);
                }
                x(this.d);
            } else if (state != 5) {
                w(state);
            } else {
                uml.a("ClientConsultHelper", "processKeyConsult: state == ConsultCallback.ERROR_KEY_NOT_EXIST");
                J(true);
            }
        } catch (InvalidProtocolBufferException e) {
            uml.b("ClientConsultHelper", "receiveData: e " + e.getMessage());
            w(4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final void C(byte[] bArr) {
        boolean zEquals;
        R();
        try {
            uml.a("ClientConsultHelper", "processShakeHand: mNeedBond " + this.e);
            ConsultProto.ShakeHand from = ConsultProto.ShakeHand.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
            byte[] bArrU = u(from.getDataList());
            byte[] bArrU2 = u(from.getEncryptDataList());
            uml.a("ClientConsultHelper", "processShakeHand: source " + Arrays.toString(bArrU) + ", encrypt " + Arrays.toString(bArrU2));
            if (bArrU2 == null || this.k == null) {
                zEquals = false;
            } else {
                zEquals = Arrays.equals(this.k, wuk.a(utg.g().c(bArrU2, this.h, null, rb3.CIPHER_AES_128)));
            }
            if (!zEquals) {
                uml.a("ClientConsultHelper", "processShakeHand: key not match");
                if (this.a.isMainModule()) {
                    J(true);
                    return;
                } else {
                    w(8);
                    return;
                }
            }
            if (this.e) {
                utg.g().j(this.a.getNodeId(), this.h);
            }
            if (!this.a.isMainModule()) {
                this.d.e(new ao6(true, utg.g().i(this.a.getNodeId()), rb3.CIPHER_AES_128));
                rdk.e().k(this.a, this.d);
            }
            uml.a("ClientConsultHelper", "processShakeHand: " + this.p);
            if (this.p) {
                K();
            } else {
                x(this.d);
            }
        } catch (InvalidProtocolBufferException e) {
            uml.b("ClientConsultHelper", "sendMessage: " + e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final void D(byte[] bArr) {
        uml.a("ClientConsultHelper", "processTransportConsult: ");
        synchronized (this) {
            if (this.g) {
                uml.a("ClientConsultHelper", "processTransportConsult: already process ");
                return;
            }
            this.g = true;
            R();
            try {
                ConsultProto.TransportConsult from = ConsultProto.TransportConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
                int protocolVersion = from.getProtocolVersion();
                uml.d("ClientConsultHelper", "processTransportConsult: protocolVersion " + protocolVersion + ",frame " + from.getMaxFrameSize() + ",mtu " + from.getMaxTransimissionUnit() + ", interval " + from.getInterval() + ",getSupportProtocol " + from.getSupportProtocol());
                qdk qdkVarV = v(protocolVersion);
                this.d = qdkVarV;
                qdkVarV.g(from.getMaxFrameSize());
                this.d.h(from.getMaxTransimissionUnit());
                this.d.f(from.getInterval());
                this.p = (from.getSupportProtocol() & 3) > 0;
                uml.d("ClientConsultHelper", "processTransportConsult: mSupportEncrypt " + this.p);
                rdk.e().k(this.a, this.d);
                if (from.getProtocolVersion() >= 3) {
                    N();
                }
                if (from.getProtocolVersion() == 2) {
                    P();
                } else if (from.getProtocolVersion() == 1) {
                    O();
                }
            } catch (InvalidProtocolBufferException e) {
                uml.b("ClientConsultHelper", "receiveData: e " + e.getMessage());
                w(4);
            }
        }
    }

    public final void E() {
        uml.d("ClientConsultHelper", "sendAESConsultResponse: ");
        G(1, 37, ((ConsultProto.AESConsult) ConsultProto.AESConsult.newBuilder().setState(1).build()).toByteArray(), new b());
    }

    public final void F(int i, int i2, byte[] bArr) {
        G(i, i2, bArr, null);
    }

    public final void G(int i, int i2, byte[] bArr, lt2<Void> lt2Var) {
        int length = bArr != null ? bArr.length : 0;
        uml.d("ClientConsultHelper", "sendCommand: sid=" + i + " cid=" + i2 + " len=" + length);
        byte[] bArr2 = new byte[length + 2];
        bArr2[0] = (byte) (i & 255);
        bArr2[1] = (byte) (i2 & 255);
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 2, length);
        }
        sr0 sr0Var = new sr0(bArr2);
        sr0Var.h(false);
        sr0Var.g(lt2Var);
        kd5.v().e(this.a, sr0Var);
    }

    public final void H() {
        uml.a("ClientConsultHelper", "sendIdentityCheckRequest: ");
        ConsultProto.IdentityCheck.Builder builderNewBuilder = ConsultProto.IdentityCheck.newBuilder();
        byte[] bArrT = t();
        this.j = bArrT;
        builderNewBuilder.setData(ByteString.copyFrom(bArrT));
        if (this.i == null) {
            uml.a("ClientConsultHelper", "sendIdentityCheckRequest: key empty");
            w(9);
            return;
        }
        byte[] bArrD = utg.g().d(this.j, this.i, rb3.CIPHER_AES_128);
        if (bArrD == null) {
            uml.a("ClientConsultHelper", "sendIdentityCheckRequest: encrypt error");
            w(10);
            return;
        }
        builderNewBuilder.setEncryptData(ByteString.copyFrom(bArrD));
        byte[] byteArray = ((ConsultProto.IdentityCheck) builderNewBuilder.build()).toByteArray();
        uml.a("ClientConsultHelper", "sendIdentityCheckRequest: length " + byteArray.length + ",data = " + Arrays.toString(byteArray));
        F(1, 25, byteArray);
        Q(25, 6000L);
    }

    public final void I() {
        uml.a("ClientConsultHelper", "sendIdentityConsultRequest: ");
        ConsultProto.IdentityConsult.Builder builderNewBuilder = ConsultProto.IdentityConsult.newBuilder();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.n = jCurrentTimeMillis;
        builderNewBuilder.setRandomNumber(jCurrentTimeMillis);
        byte[] byteArray = ((ConsultProto.IdentityConsult) builderNewBuilder.build()).toByteArray();
        uml.a("ClientConsultHelper", "sendIdentityConsultRequest: length " + byteArray.length + ",data = " + Arrays.toString(byteArray));
        F(1, 24, byteArray);
        Q(24, 6000L);
    }

    public final void J(boolean z) {
        uml.a("ClientConsultHelper", "sendKeyConsultRequest: needSendKey " + z + " ,mNeedBond " + this.e);
        ConsultProto.KeyConsult.Builder builderNewBuilder = ConsultProto.KeyConsult.newBuilder();
        if (z) {
            if (this.h == null) {
                this.h = utg.g().i(this.a.getNodeId());
            }
            byte[] bArr = this.h;
            if (bArr == null) {
                uml.k("ClientConsultHelper", "sendKeyConsultRequest: key == null");
                w(5);
                return;
            }
            builderNewBuilder.setKey(ByteString.copyFrom(bArr)).setIsConsultKey(true);
        } else {
            if (!r()) {
                uml.k("ClientConsultHelper", "sendKeyConsultRequest: key == null");
                w(5);
                return;
            }
            builderNewBuilder.setIsConsultKey(false);
        }
        ConsultProto.KeyConsult keyConsult = (ConsultProto.KeyConsult) builderNewBuilder.build();
        Q(22, 6000L);
        F(1, 22, keyConsult.toByteArray());
    }

    public final void K() {
        uml.d("ClientConsultHelper", "sendRSAConsultRequest: ");
        s();
        byte[] byteArray = this.r.getModulus().toByteArray();
        byte[] byteArray2 = this.r.getPublicExponent().toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 1, bArr, 0, 256);
            byteArray = bArr;
        }
        F(1, 36, ((ConsultProto.RSAConsult) ConsultProto.RSAConsult.newBuilder().setRsaBits(2048).setRsaKeyModulus(ByteString.copyFrom(byteArray)).setRsaKeyExponent(ByteString.copyFrom(byteArray2)).build()).toByteArray());
        Q(36, 6000L);
    }

    public final void L() {
        uml.a("ClientConsultHelper", "sendShakeHandRequest: ");
        if (this.h == null) {
            this.h = utg.g().i(this.a.getNodeId());
        }
        if (this.h == null) {
            uml.b("ClientConsultHelper", "sendShakeHandRequest: key not exist");
            w(5);
            return;
        }
        this.k = t();
        byte[] bArrE = utg.g().e(this.k, this.h, null, rb3.CIPHER_AES_128);
        ConsultProto.ShakeHand.Builder builderNewBuilder = ConsultProto.ShakeHand.newBuilder();
        if (this.k != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.k;
                if (i >= bArr.length) {
                    break;
                }
                builderNewBuilder.addData(bArr[i] & 255);
                i++;
            }
        }
        if (bArrE != null) {
            for (byte b2 : bArrE) {
                builderNewBuilder.addEncryptData(b2 & 255);
            }
        }
        ConsultProto.ShakeHand shakeHand = (ConsultProto.ShakeHand) builderNewBuilder.build();
        Q(21, 6000L);
        byte[] byteArray = shakeHand.toByteArray();
        uml.a("ClientConsultHelper", "sendShakeHandRequest: length " + byteArray.length + ",data = " + Arrays.toString(byteArray));
        F(1, 21, byteArray);
    }

    public final void M() {
        qdk qdkVarV = v(5);
        ConsultProto.TransportConsult transportConsult = (ConsultProto.TransportConsult) ConsultProto.TransportConsult.newBuilder().setMaxFrameSize(qdkVarV.c()).setMaxTransimissionUnit(qdkVarV.d()).setInterval(qdkVarV.b()).setProtocolVersion(5).setSupportProtocol(3).build();
        Q(1, 2000L);
        uml.d("ClientConsultHelper", "startConsult: local protocol version 5");
        F(1, 1, transportConsult.toByteArray());
    }

    public final void N() {
        int connectionType = this.a.getConnectionType();
        if (xx3.b(connectionType) && !xx3.d(connectionType)) {
            I();
        } else if (!this.a.isMainModule()) {
            P();
        } else if (xx3.c(connectionType)) {
            I();
        }
    }

    public final void O() {
        if (!this.a.isMainModule()) {
            if (r()) {
                x(this.d);
                return;
            } else {
                w(5);
                return;
            }
        }
        if (xx3.a(this.a.getConnectionType())) {
            J(this.e);
        } else if (utg.g().i(this.a.getNodeId()) == null) {
            w(5);
        } else {
            x(this.d);
        }
    }

    public final void P() {
        int connectionType = this.a.getConnectionType();
        uml.a("ClientConsultHelper", "startKeyConsultWithShake: connectionType = " + connectionType + " , mNeedBond " + this.e);
        if (!this.a.isMainModule()) {
            L();
            return;
        }
        if (xx3.a(connectionType)) {
            if (this.e) {
                J(this.e);
                return;
            } else {
                L();
                return;
            }
        }
        if (utg.g().i(this.a.getNodeId()) == null) {
            w(5);
        } else {
            x(this.d);
        }
    }

    public final void Q(int i, long j) {
        R();
        synchronized (this) {
            this.m = i;
        }
        this.b.postDelayed(this.u, j);
    }

    public final void R() {
        this.b.removeCallbacks(this.u);
    }

    @Override // com.oplus.aiunit.vision.mp9
    public void a(byte[] bArr) {
        uml.a("ClientConsultHelper", "receiveData: ");
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        uml.a("ClientConsultHelper", "receiveData: serviceId " + i + ",commandId " + i2);
        if (i != 1) {
            return;
        }
        int i3 = i2 & 127;
        if (i3 == 1) {
            D(bArr);
            return;
        }
        if (i3 == 37) {
            y(bArr);
            return;
        }
        if (i3 == 21) {
            C(bArr);
            return;
        }
        if (i3 == 22) {
            B(bArr);
        } else if (i3 == 24) {
            A(bArr);
        } else {
            if (i3 != 25) {
                return;
            }
            z(bArr);
        }
    }

    @Override // com.oplus.aiunit.vision.mp9
    public void b() {
        R();
        synchronized (this) {
            this.l = 0;
            this.f = false;
            this.c = null;
            this.g = false;
        }
    }

    @Override // com.oplus.aiunit.vision.mp9
    public void c(boolean z) {
        this.e = z;
    }

    @Override // com.oplus.aiunit.vision.mp9
    public void d(byte[] bArr) {
        if (e() && Arrays.equals(bArr, this.h)) {
            uml.b("ClientConsultHelper", "setKey: consulting and setKey twice not equal");
        }
        this.h = bArr;
    }

    @Override // com.oplus.aiunit.vision.mp9
    public boolean e() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.mp9
    public void f(mp9.a aVar) {
        uml.a("ClientConsultHelper", "run: send req " + this.f);
        synchronized (this) {
            this.c = aVar;
            if (this.f) {
                return;
            }
            this.f = true;
            this.g = false;
            M();
        }
    }

    public final boolean r() {
        return utg.g().i(this.a.getNodeId()) != null;
    }

    public final synchronized void s() {
        if (this.r == null || this.q == null) {
            try {
                Map<String, RSAKey> mapC = hcf.c(2048);
                this.q = (RSAPrivateKey) mapC.get(hcf.PRIVATE_KEY);
                this.r = (RSAPublicKey) mapC.get(hcf.PUBLIC_KEY);
            } catch (Exception e) {
                uml.c("ClientConsultHelper", "generateRSAKey: error ", e);
            }
        }
    }

    public final byte[] t() {
        byte[] bArr = new byte[4];
        new Random().nextBytes(bArr);
        uml.a("ClientConsultHelper", "generateRandomData: data = " + Arrays.toString(bArr));
        return bArr;
    }

    public final byte[] u(List<Integer> list) {
        if (list == null) {
            return null;
        }
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) list.get(i).intValue();
        }
        return bArr;
    }

    public final qdk v(int i) {
        return rdk.e().f(this.a, i);
    }

    public final void w(int i) {
        mp9.a aVar = this.c;
        if (aVar != null) {
            aVar.a(i);
            this.c = null;
        }
        b();
    }

    public final void x(qdk qdkVar) {
        if (this.e) {
            utg.g().j(this.a.getNodeId(), this.h);
        }
        mp9.a aVar = this.c;
        if (aVar != null) {
            aVar.b(this.a, qdkVar);
            this.c = null;
        }
        b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final void y(byte[] bArr) {
        uml.d("ClientConsultHelper", "processAESConsultRequest");
        R();
        try {
            ConsultProto.AESConsult from = ConsultProto.AESConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
            ByteString aESKeyEncrypted = from.getAESKeyEncrypted();
            if (this.q == null) {
                uml.k("ClientConsultHelper", "processAESConsultRequest: not init RSA");
                w(12);
                return;
            }
            if (aESKeyEncrypted != null) {
                byte[] byteArray = aESKeyEncrypted.toByteArray();
                this.t = from.getAESIv().toByteArray();
                StringBuilder sb = new StringBuilder();
                sb.append("processAESConsultRequest: aesKeyEncrypted ");
                sb.append(byteArray == null);
                uml.a("ClientConsultHelper", sb.toString());
                this.s = hcf.b(byteArray, this.q.getEncoded());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("processAESConsultRequest: length ");
                byte[] bArr2 = this.s;
                sb2.append(bArr2 == null ? null : Integer.valueOf(bArr2.length));
                uml.a("ClientConsultHelper", sb2.toString());
                if (this.s == null) {
                    uml.k("ClientConsultHelper", "processAESConsultRequest: AES key == null");
                    w(13);
                    return;
                }
                byte[] byteArray2 = from.getEncryptData().toByteArray();
                byte[] byteArray3 = from.getData().toByteArray();
                byte[] bArrC = utg.g().c(byteArray2, this.s, this.t, rb3.CIPHER_AES_256);
                uml.a("ClientConsultHelper", "processAESConsultRequest: source " + if8.a(byteArray3));
                uml.a("ClientConsultHelper", "processAESConsultRequest: decrypt " + if8.a(bArrC));
                if (Arrays.equals(byteArray3, bArrC)) {
                    E();
                } else {
                    uml.b("ClientConsultHelper", "processAESConsult: AES key check error ");
                    w(4);
                }
            }
        } catch (InvalidProtocolBufferException e) {
            uml.b("ClientConsultHelper", "processAESConsult: e " + e.getMessage());
            w(4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final void z(byte[] bArr) {
        boolean zEquals;
        R();
        try {
            uml.a("ClientConsultHelper", "processIdentityCheck");
            ConsultProto.IdentityCheck from = ConsultProto.IdentityCheck.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
            byte[] byteArray = null;
            byte[] byteArray2 = from.getData() == null ? null : from.getData().toByteArray();
            if (from.getEncryptData() != null) {
                byteArray = from.getEncryptData().toByteArray();
            }
            uml.a("ClientConsultHelper", "processIdentityCheck: source " + Arrays.toString(byteArray2) + ", encrypt " + Arrays.toString(byteArray));
            if (this.i == null) {
                uml.a("ClientConsultHelper", "processIdentityCheck: key empty");
                w(9);
                return;
            }
            if (byteArray == null || this.j == null) {
                zEquals = false;
            } else {
                zEquals = Arrays.equals(this.j, wuk.a(utg.g().b(byteArray, this.i, rb3.CIPHER_AES_128)));
            }
            if (!zEquals) {
                uml.a("ClientConsultHelper", "IdentityCheck: failed");
                w(11);
                return;
            }
            int connectionType = this.a.getConnectionType();
            boolean zA = xx3.a(connectionType);
            uml.d("ClientConsultHelper", "processIdentityCheck: connectionType " + zA + " connectionType=" + connectionType);
            if (zA) {
                P();
            } else if (this.p) {
                K();
            } else {
                x(this.d);
            }
        } catch (InvalidProtocolBufferException e) {
            uml.b("ClientConsultHelper", "IdentityCheck: " + e);
            w(4);
        }
    }
}
