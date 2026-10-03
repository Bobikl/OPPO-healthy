package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.RetryPolicy;
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

/* JADX INFO: loaded from: classes5.dex */
public class if3 implements go9 {
    public final ModuleInfo a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public go9.a f12505c;
    public o9k d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f12506e;
    public volatile boolean f;
    public volatile boolean g;
    public byte[] h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f12507j;
    public byte[] k;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12509n;
    public long o;
    public boolean p;
    public RSAPrivateKey q;
    public RSAPublicKey r;
    public byte[] s;
    public byte[] t;
    public Handler b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12508l = 0;
    public Runnable u = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (if3.this) {
                if (if3.this.m != 1 || if3.this.f12508l >= 3) {
                    wil.b("ClientConsultHelper", "run: consult timeout : " + if3.this.m);
                    if3.this.w(7);
                    return;
                }
                wil.a("ClientConsultHelper", "transport consult timeout retry: " + if3.this.f12508l);
                if3 if3Var = if3.this;
                if3Var.f12508l = if3Var.f12508l + 1;
                if3.this.M();
            }
        }
    }

    public class b implements xs2<Void> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.xs2
        public void a(Throwable th, int i) {
            if3.this.d.e(new cn6(if3.this.p, if3.this.s, if3.this.t, db3.CIPHER_AES_256));
            p9k.e().k(if3.this.a, if3.this.d);
            if3 if3Var = if3.this;
            if3Var.x(if3Var.d);
        }

        @Override // com.oplus.aiunit.vision.xs2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r5) {
            if3.this.d.e(new cn6(if3.this.p, if3.this.s, if3.this.t, db3.CIPHER_AES_256));
            p9k.e().k(if3.this.a, if3.this.d);
            if3 if3Var = if3.this;
            if3Var.x(if3Var.d);
        }
    }

    public if3(ModuleInfo moduleInfo) {
        this.a = moduleInfo;
    }

    public final void A(byte[] bArr) {
        wil.a("ClientConsultHelper", "processIdentityConsult: ");
        R();
        try {
            this.o = ConsultProto.IdentityConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length)).getRandomNumber();
            wil.a("ClientConsultHelper", "processIdentityConsult: " + this.o);
            byte[] bArrF = eqg.g().f(this.f12509n, this.o, db3.CIPHER_AES_128);
            if (bArrF == null) {
                wil.a("ClientConsultHelper", "processIdentityConsult: key empty");
                w(9);
            } else {
                this.i = bArrF;
                H();
            }
        } catch (InvalidProtocolBufferException e2) {
            wil.b("ClientConsultHelper", "processIdentityConsult: " + e2);
            w(4);
        }
    }

    public final void B(byte[] bArr) {
        R();
        try {
            int state = ConsultProto.KeyConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length)).getState();
            wil.a("ClientConsultHelper", "processKeyConsult: state " + state);
            if (state == 1) {
                if (this.f12506e) {
                    eqg.g().j(this.a.getNodeId(), this.h);
                }
                x(this.d);
            } else if (state != 5) {
                w(state);
            } else {
                wil.a("ClientConsultHelper", "processKeyConsult: state == ConsultCallback.ERROR_KEY_NOT_EXIST");
                J(true);
            }
        } catch (InvalidProtocolBufferException e2) {
            wil.b("ClientConsultHelper", "receiveData: e " + e2.getMessage());
            w(4);
        }
    }

    public final void C(byte[] bArr) {
        boolean zEquals;
        R();
        try {
            wil.a("ClientConsultHelper", "processShakeHand: mNeedBond " + this.f12506e);
            ConsultProto.ShakeHand from = ConsultProto.ShakeHand.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
            byte[] bArrU = u(from.getDataList());
            byte[] bArrU2 = u(from.getEncryptDataList());
            wil.a("ClientConsultHelper", "processShakeHand: source " + Arrays.toString(bArrU) + ", encrypt " + Arrays.toString(bArrU2));
            if (bArrU2 == null || this.k == null) {
                zEquals = false;
            } else {
                zEquals = Arrays.equals(this.k, ark.a(eqg.g().c(bArrU2, this.h, null, db3.CIPHER_AES_128)));
            }
            if (!zEquals) {
                wil.a("ClientConsultHelper", "processShakeHand: key not match");
                if (this.a.isMainModule()) {
                    J(true);
                    return;
                } else {
                    w(8);
                    return;
                }
            }
            if (this.f12506e) {
                eqg.g().j(this.a.getNodeId(), this.h);
            }
            if (!this.a.isMainModule()) {
                this.d.e(new cn6(true, eqg.g().i(this.a.getNodeId()), db3.CIPHER_AES_128));
                p9k.e().k(this.a, this.d);
            }
            wil.a("ClientConsultHelper", "processShakeHand: " + this.p);
            if (this.p) {
                K();
            } else {
                x(this.d);
            }
        } catch (InvalidProtocolBufferException e2) {
            wil.b("ClientConsultHelper", "sendMessage: " + e2);
        }
    }

    public final void D(byte[] bArr) {
        wil.a("ClientConsultHelper", "processTransportConsult: ");
        synchronized (this) {
            if (this.g) {
                wil.a("ClientConsultHelper", "processTransportConsult: already process ");
                return;
            }
            this.g = true;
            R();
            try {
                ConsultProto.TransportConsult from = ConsultProto.TransportConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
                int protocolVersion = from.getProtocolVersion();
                wil.d("ClientConsultHelper", "processTransportConsult: protocolVersion " + protocolVersion + ",frame " + from.getMaxFrameSize() + ",mtu " + from.getMaxTransimissionUnit() + ", interval " + from.getInterval() + ",getSupportProtocol " + from.getSupportProtocol());
                o9k o9kVarV = v(protocolVersion);
                this.d = o9kVarV;
                o9kVarV.g(from.getMaxFrameSize());
                this.d.h(from.getMaxTransimissionUnit());
                this.d.f(from.getInterval());
                this.p = (from.getSupportProtocol() & 3) > 0;
                wil.d("ClientConsultHelper", "processTransportConsult: mSupportEncrypt " + this.p);
                p9k.e().k(this.a, this.d);
                if (from.getProtocolVersion() >= 3) {
                    N();
                }
                if (from.getProtocolVersion() == 2) {
                    P();
                } else if (from.getProtocolVersion() == 1) {
                    O();
                }
            } catch (InvalidProtocolBufferException e2) {
                wil.b("ClientConsultHelper", "receiveData: e " + e2.getMessage());
                w(4);
            }
        }
    }

    public final void E() {
        wil.d("ClientConsultHelper", "sendAESConsultResponse: ");
        G(1, 37, ConsultProto.AESConsult.newBuilder().setState(1).build().toByteArray(), new b());
    }

    public final void F(int i, int i2, byte[] bArr) {
        G(i, i2, bArr, null);
    }

    public final void G(int i, int i2, byte[] bArr, xs2<Void> xs2Var) {
        int length = bArr != null ? bArr.length : 0;
        wil.d("ClientConsultHelper", "sendCommand: sid=" + i + " cid=" + i2 + " len=" + length);
        byte[] bArr2 = new byte[length + 2];
        bArr2[0] = (byte) (i & 255);
        bArr2[1] = (byte) (i2 & 255);
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 2, length);
        }
        br0 br0Var = new br0(bArr2);
        br0Var.h(false);
        br0Var.g(xs2Var);
        pc5.v().e(this.a, br0Var);
    }

    public final void H() {
        wil.a("ClientConsultHelper", "sendIdentityCheckRequest: ");
        ConsultProto.IdentityCheck.Builder builderNewBuilder = ConsultProto.IdentityCheck.newBuilder();
        byte[] bArrT = t();
        this.f12507j = bArrT;
        builderNewBuilder.setData(ByteString.copyFrom(bArrT));
        if (this.i == null) {
            wil.a("ClientConsultHelper", "sendIdentityCheckRequest: key empty");
            w(9);
            return;
        }
        byte[] bArrD = eqg.g().d(this.f12507j, this.i, db3.CIPHER_AES_128);
        if (bArrD == null) {
            wil.a("ClientConsultHelper", "sendIdentityCheckRequest: encrypt error");
            w(10);
            return;
        }
        builderNewBuilder.setEncryptData(ByteString.copyFrom(bArrD));
        byte[] byteArray = builderNewBuilder.build().toByteArray();
        wil.a("ClientConsultHelper", "sendIdentityCheckRequest: length " + byteArray.length + ",data = " + Arrays.toString(byteArray));
        F(1, 25, byteArray);
        Q(25, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
    }

    public final void I() {
        wil.a("ClientConsultHelper", "sendIdentityConsultRequest: ");
        ConsultProto.IdentityConsult.Builder builderNewBuilder = ConsultProto.IdentityConsult.newBuilder();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12509n = jCurrentTimeMillis;
        builderNewBuilder.setRandomNumber(jCurrentTimeMillis);
        byte[] byteArray = builderNewBuilder.build().toByteArray();
        wil.a("ClientConsultHelper", "sendIdentityConsultRequest: length " + byteArray.length + ",data = " + Arrays.toString(byteArray));
        F(1, 24, byteArray);
        Q(24, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
    }

    public final void J(boolean z) {
        wil.a("ClientConsultHelper", "sendKeyConsultRequest: needSendKey " + z + " ,mNeedBond " + this.f12506e);
        ConsultProto.KeyConsult.Builder builderNewBuilder = ConsultProto.KeyConsult.newBuilder();
        if (z) {
            if (this.h == null) {
                this.h = eqg.g().i(this.a.getNodeId());
            }
            byte[] bArr = this.h;
            if (bArr == null) {
                wil.k("ClientConsultHelper", "sendKeyConsultRequest: key == null");
                w(5);
                return;
            }
            builderNewBuilder.setKey(ByteString.copyFrom(bArr)).setIsConsultKey(true);
        } else {
            if (!r()) {
                wil.k("ClientConsultHelper", "sendKeyConsultRequest: key == null");
                w(5);
                return;
            }
            builderNewBuilder.setIsConsultKey(false);
        }
        ConsultProto.KeyConsult keyConsultBuild = builderNewBuilder.build();
        Q(22, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
        F(1, 22, keyConsultBuild.toByteArray());
    }

    public final void K() {
        wil.d("ClientConsultHelper", "sendRSAConsultRequest: ");
        s();
        byte[] byteArray = this.r.getModulus().toByteArray();
        byte[] byteArray2 = this.r.getPublicExponent().toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr = new byte[256];
            System.arraycopy(byteArray, 1, bArr, 0, 256);
            byteArray = bArr;
        }
        F(1, 36, ConsultProto.RSAConsult.newBuilder().setRsaBits(2048).setRsaKeyModulus(ByteString.copyFrom(byteArray)).setRsaKeyExponent(ByteString.copyFrom(byteArray2)).build().toByteArray());
        Q(36, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
    }

    public final void L() {
        wil.a("ClientConsultHelper", "sendShakeHandRequest: ");
        if (this.h == null) {
            this.h = eqg.g().i(this.a.getNodeId());
        }
        if (this.h == null) {
            wil.b("ClientConsultHelper", "sendShakeHandRequest: key not exist");
            w(5);
            return;
        }
        this.k = t();
        byte[] bArrE = eqg.g().e(this.k, this.h, null, db3.CIPHER_AES_128);
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
        ConsultProto.ShakeHand shakeHandBuild = builderNewBuilder.build();
        Q(21, RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
        byte[] byteArray = shakeHandBuild.toByteArray();
        wil.a("ClientConsultHelper", "sendShakeHandRequest: length " + byteArray.length + ",data = " + Arrays.toString(byteArray));
        F(1, 21, byteArray);
    }

    public final void M() {
        o9k o9kVarV = v(5);
        ConsultProto.TransportConsult transportConsultBuild = ConsultProto.TransportConsult.newBuilder().setMaxFrameSize(o9kVarV.c()).setMaxTransimissionUnit(o9kVarV.d()).setInterval(o9kVarV.b()).setProtocolVersion(5).setSupportProtocol(3).build();
        Q(1, 2000L);
        wil.d("ClientConsultHelper", "startConsult: local protocol version 5");
        F(1, 1, transportConsultBuild.toByteArray());
    }

    public final void N() {
        int connectionType = this.a.getConnectionType();
        if (jx3.b(connectionType) && !jx3.d(connectionType)) {
            I();
        } else if (!this.a.isMainModule()) {
            P();
        } else if (jx3.c(connectionType)) {
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
        if (jx3.a(this.a.getConnectionType())) {
            J(this.f12506e);
        } else if (eqg.g().i(this.a.getNodeId()) == null) {
            w(5);
        } else {
            x(this.d);
        }
    }

    public final void P() {
        int connectionType = this.a.getConnectionType();
        wil.a("ClientConsultHelper", "startKeyConsultWithShake: connectionType = " + connectionType + " , mNeedBond " + this.f12506e);
        if (!this.a.isMainModule()) {
            L();
            return;
        }
        if (jx3.a(connectionType)) {
            if (this.f12506e) {
                J(this.f12506e);
                return;
            } else {
                L();
                return;
            }
        }
        if (eqg.g().i(this.a.getNodeId()) == null) {
            w(5);
        } else {
            x(this.d);
        }
    }

    public final void Q(int i, long j2) {
        R();
        synchronized (this) {
            this.m = i;
        }
        this.b.postDelayed(this.u, j2);
    }

    public final void R() {
        this.b.removeCallbacks(this.u);
    }

    @Override // com.oplus.aiunit.vision.go9
    public void a(byte[] bArr) {
        wil.a("ClientConsultHelper", "receiveData: ");
        int i = bArr[0] & 255;
        int i2 = bArr[1] & 255;
        wil.a("ClientConsultHelper", "receiveData: serviceId " + i + ",commandId " + i2);
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

    @Override // com.oplus.aiunit.vision.go9
    public void b() {
        R();
        synchronized (this) {
            this.f12508l = 0;
            this.f = false;
            this.f12505c = null;
            this.g = false;
        }
    }

    @Override // com.oplus.aiunit.vision.go9
    public void c(boolean z) {
        this.f12506e = z;
    }

    @Override // com.oplus.aiunit.vision.go9
    public void d(byte[] bArr) {
        if (e() && Arrays.equals(bArr, this.h)) {
            wil.b("ClientConsultHelper", "setKey: consulting and setKey twice not equal");
        }
        this.h = bArr;
    }

    @Override // com.oplus.aiunit.vision.go9
    public boolean e() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.go9
    public void f(go9.a aVar) {
        wil.a("ClientConsultHelper", "run: send req " + this.f);
        synchronized (this) {
            this.f12505c = aVar;
            if (this.f) {
                return;
            }
            this.f = true;
            this.g = false;
            M();
        }
    }

    public final boolean r() {
        return eqg.g().i(this.a.getNodeId()) != null;
    }

    public final synchronized void s() {
        if (this.r == null || this.q == null) {
            try {
                Map<String, RSAKey> mapC = d9f.c(2048);
                this.q = (RSAPrivateKey) mapC.get(d9f.PRIVATE_KEY);
                this.r = (RSAPublicKey) mapC.get(d9f.PUBLIC_KEY);
            } catch (Exception e2) {
                wil.c("ClientConsultHelper", "generateRSAKey: error ", e2);
            }
        }
    }

    public final byte[] t() {
        byte[] bArr = new byte[4];
        new Random().nextBytes(bArr);
        wil.a("ClientConsultHelper", "generateRandomData: data = " + Arrays.toString(bArr));
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

    public final o9k v(int i) {
        return p9k.e().f(this.a, i);
    }

    public final void w(int i) {
        go9.a aVar = this.f12505c;
        if (aVar != null) {
            aVar.a(i);
            this.f12505c = null;
        }
        b();
    }

    public final void x(o9k o9kVar) {
        if (this.f12506e) {
            eqg.g().j(this.a.getNodeId(), this.h);
        }
        go9.a aVar = this.f12505c;
        if (aVar != null) {
            aVar.b(this.a, o9kVar);
            this.f12505c = null;
        }
        b();
    }

    public final void y(byte[] bArr) {
        wil.d("ClientConsultHelper", "processAESConsultRequest");
        R();
        try {
            ConsultProto.AESConsult from = ConsultProto.AESConsult.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
            ByteString aESKeyEncrypted = from.getAESKeyEncrypted();
            if (this.q == null) {
                wil.k("ClientConsultHelper", "processAESConsultRequest: not init RSA");
                w(12);
                return;
            }
            if (aESKeyEncrypted != null) {
                byte[] byteArray = aESKeyEncrypted.toByteArray();
                this.t = from.getAESIv().toByteArray();
                StringBuilder sb = new StringBuilder();
                sb.append("processAESConsultRequest: aesKeyEncrypted ");
                sb.append(byteArray == null);
                wil.a("ClientConsultHelper", sb.toString());
                this.s = d9f.b(byteArray, this.q.getEncoded());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("processAESConsultRequest: length ");
                byte[] bArr2 = this.s;
                sb2.append(bArr2 == null ? null : Integer.valueOf(bArr2.length));
                wil.a("ClientConsultHelper", sb2.toString());
                if (this.s == null) {
                    wil.k("ClientConsultHelper", "processAESConsultRequest: AES key == null");
                    w(13);
                    return;
                }
                byte[] byteArray2 = from.getEncryptData().toByteArray();
                byte[] byteArray3 = from.getData().toByteArray();
                byte[] bArrC = eqg.g().c(byteArray2, this.s, this.t, db3.CIPHER_AES_256);
                wil.a("ClientConsultHelper", "processAESConsultRequest: source " + fe8.a(byteArray3));
                wil.a("ClientConsultHelper", "processAESConsultRequest: decrypt " + fe8.a(bArrC));
                if (Arrays.equals(byteArray3, bArrC)) {
                    E();
                } else {
                    wil.b("ClientConsultHelper", "processAESConsult: AES key check error ");
                    w(4);
                }
            }
        } catch (InvalidProtocolBufferException e2) {
            wil.b("ClientConsultHelper", "processAESConsult: e " + e2.getMessage());
            w(4);
        }
    }

    public final void z(byte[] bArr) {
        boolean zEquals;
        R();
        try {
            wil.a("ClientConsultHelper", "processIdentityCheck");
            ConsultProto.IdentityCheck from = ConsultProto.IdentityCheck.parseFrom(Arrays.copyOfRange(bArr, 2, bArr.length));
            byte[] byteArray = null;
            byte[] byteArray2 = from.getData() == null ? null : from.getData().toByteArray();
            if (from.getEncryptData() != null) {
                byteArray = from.getEncryptData().toByteArray();
            }
            wil.a("ClientConsultHelper", "processIdentityCheck: source " + Arrays.toString(byteArray2) + ", encrypt " + Arrays.toString(byteArray));
            if (this.i == null) {
                wil.a("ClientConsultHelper", "processIdentityCheck: key empty");
                w(9);
                return;
            }
            if (byteArray == null || this.f12507j == null) {
                zEquals = false;
            } else {
                zEquals = Arrays.equals(this.f12507j, ark.a(eqg.g().b(byteArray, this.i, db3.CIPHER_AES_128)));
            }
            if (!zEquals) {
                wil.a("ClientConsultHelper", "IdentityCheck: failed");
                w(11);
                return;
            }
            int connectionType = this.a.getConnectionType();
            boolean zA = jx3.a(connectionType);
            wil.d("ClientConsultHelper", "processIdentityCheck: connectionType " + zA + " connectionType=" + connectionType);
            if (zA) {
                P();
            } else if (this.p) {
                K();
            } else {
                x(this.d);
            }
        } catch (InvalidProtocolBufferException e2) {
            wil.b("ClientConsultHelper", "IdentityCheck: " + e2);
            w(4);
        }
    }
}
