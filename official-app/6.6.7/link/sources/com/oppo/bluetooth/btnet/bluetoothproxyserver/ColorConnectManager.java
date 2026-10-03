package com.oppo.bluetooth.btnet.bluetoothproxyserver;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.ArraySet;
import androidx.annotation.NonNull;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.heytap.wearable.btnet.proto.ChannelConnect;
import com.heytap.wearable.btnet.proto.HttpDataProto;
import com.heytap.wearable.btnet.proto.OpenVpn;
import com.heytap.wearable.btnet.proto.PhoneStateProto;
import com.heytap.wearable.btnet.proto.SocketDataPB;
import com.heytap.wearable.btnet.proto.SocketDataType;
import com.oplus.aiunit.vision.HttpDataWrapper;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.cyg;
import com.oplus.aiunit.vision.g82;
import com.oplus.aiunit.vision.hm4;
import com.oplus.aiunit.vision.km4;
import com.oplus.aiunit.vision.lhd;
import com.oplus.aiunit.vision.o5f;
import com.oplus.aiunit.vision.ok9;
import com.oplus.aiunit.vision.svc;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.xm5;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@SuppressLint({"MissingPermission"})
public class ColorConnectManager {
    public final Context a;
    public boolean b;
    public final BluetoothAdapter d;
    public ConnectivityManager e;
    public final ExecutorService g;
    public final cyg h;
    public final int i;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicReference<Object> f = new AtomicReference<>();
    public final ConcurrentHashMap<Long, Long> j = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, Long> k = new ConcurrentHashMap<>();
    public final AtomicInteger l = new AtomicInteger();
    public final NetworkChange m = new NetworkChange();
    public final km4.a n = new b();
    public final hm4.b o = new c();

    public class NetworkChange extends BroadcastReceiver {
        public NetworkChange() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            o5f.c("BtNetMsg", "onReceive action:" + intent.getAction());
            final ColorConnectManager colorConnectManager = ColorConnectManager.this;
            lhd.a(new Runnable() { // from class: com.oplus.aiunit.vision.el3
                @Override // java.lang.Runnable
                public final void run() {
                    colorConnectManager.m();
                }
            });
        }
    }

    public class a implements km4.b {
        public a() {
        }

        public void d(@NotNull Node node, @NotNull svc svcVar) {
            if (svcVar == svc.n.INSTANCE) {
                o5f.c("BtNetMsg", "On p2p disconnect, close all p2p tunnel");
                ColorConnectManager.this.h.o();
            }
        }

        public void getInterestingStatus(@NotNull ArraySet<svc> arraySet) {
            arraySet.add(svc.n.INSTANCE);
        }
    }

    public class b implements km4.a {
        public b() {
        }

        public void onPeerConnected(Node node) {
            if (g82.c()) {
                Trace.beginSection("BtNet_accessory_connected");
                Trace.endSection();
            }
            o5f.b("BtNetMsg", "onPeerConnected:" + node.toString());
            if (ColorConnectManager.this.c.compareAndSet(false, true)) {
                ColorConnectManager.this.m();
            }
        }

        public void onPeerDisconnected(Node node) {
            if (g82.c()) {
                Trace.beginSection("BtNet_accessory_disconnected");
                Trace.endSection();
            }
            o5f.b("BtNetMsg", "onPeerDisconnected:" + node.toString());
            ColorConnectManager.this.c.set(false);
        }
    }

    public class c implements hm4.b {
        public c() {
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(MessageEvent messageEvent) {
            if (messageEvent.getServiceId() != ColorConnectManager.this.i) {
                o5f.b("BtNetMsg", "Not my bt network msg, sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
                return;
            }
            int commandId = messageEvent.getCommandId();
            if (commandId != 0) {
                if (commandId == 3) {
                    o5f.c("BtNetMsg", "======onMessageReceived===" + messageEvent.getCommandId());
                    try {
                        ColorConnectManager.this.k(ChannelConnect.parseFrom(messageEvent.getData()).getConnected());
                        return;
                    } catch (InvalidProtocolBufferException e) {
                        o5f.b("BtNetMsg", "onMessageReceived: ex " + e);
                        return;
                    }
                }
                if (commandId == 5) {
                    o5f.c("BtNetMsg", "======onMessageReceived===" + messageEvent.getCommandId());
                    ColorConnectManager.this.D();
                    return;
                }
                if (commandId != 16) {
                    if (commandId == 18) {
                        ColorConnectManager.this.q(messageEvent);
                        return;
                    } else {
                        if (commandId != 24) {
                            return;
                        }
                        ColorConnectManager.this.r(messageEvent);
                        return;
                    }
                }
            }
            try {
                if (messageEvent.getCommandId() == 0) {
                    ColorConnectManager.this.h.l(new HttpDataWrapper(HttpDataProto.parseFrom(messageEvent.getData()), messageEvent.getTransport()));
                } else {
                    ByteString payload = SocketDataPB.parseFrom(messageEvent.getData()).getPayload();
                    ColorConnectManager.this.h.l(new HttpDataWrapper(HttpDataProto.newBuilder().setHead(payload.substring(0, 15)).setBody(payload.substring(15)).build(), messageEvent.getTransport()));
                }
            } catch (InvalidProtocolBufferException e2) {
                o5f.b("BtNetMsg", "onMessageReceived: ex " + e2);
            }
        }

        public void onMessageReceived(@NonNull String str, final MessageEvent messageEvent) {
            o5f.a("BtNetMsg", "On bt_net msg received sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
            ColorConnectManager.this.g.submit(new Runnable() { // from class: com.oplus.aiunit.vision.dl3
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.b(messageEvent);
                }
            });
        }
    }

    public ColorConnectManager(Context context, int i, cyg cygVar) {
        this.e = null;
        this.i = i;
        this.h = cygVar;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = BluetoothAdapter.getDefaultAdapter();
        this.e = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.g = cs8.e("net-dispatch");
        s();
        wl4.devicePrimary.a.l(new a());
    }

    public static byte[] j(long j, long j2, int i, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(byteArrayOutputStream);
        codedOutputStreamNewInstance.writeInt64(1, j);
        codedOutputStreamNewInstance.writeInt64(2, j2);
        codedOutputStreamNewInstance.writeEnum(3, i);
        codedOutputStreamNewInstance.writeInt32(4, i2);
        codedOutputStreamNewInstance.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static long[] y(byte[] bArr) throws IOException {
        CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr);
        long int64 = 0;
        long int65 = 0;
        int i = 0;
        while (!codedInputStreamNewInstance.isAtEnd()) {
            int tag = codedInputStreamNewInstance.readTag();
            int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
            if (tagFieldNumber == 1) {
                int64 = codedInputStreamNewInstance.readInt64();
            } else if (tagFieldNumber == 2) {
                int65 = codedInputStreamNewInstance.readInt64();
            } else if (tagFieldNumber != 3) {
                codedInputStreamNewInstance.skipField(tag);
            } else {
                i = codedInputStreamNewInstance.readEnum();
            }
        }
        return new long[]{int64, int65, i};
    }

    public static long z(byte[] bArr) {
        long int64 = -1;
        if (bArr == null) {
            return -1L;
        }
        try {
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr);
            while (!codedInputStreamNewInstance.isAtEnd()) {
                int tag = codedInputStreamNewInstance.readTag();
                if (WireFormat.getTagFieldNumber(tag) == 2) {
                    int64 = codedInputStreamNewInstance.readInt64();
                    return int64;
                }
                codedInputStreamNewInstance.skipField(tag);
            }
        } catch (IOException e) {
            o5f.b("BtNetMsg", "parseRequestIdFromFlushAckWire: " + e.getMessage());
        }
        return int64;
    }

    public void A(long j, long j2, int i, int i2) {
        B(j, j2, i, i2);
    }

    public final void B(long j, long j2, int i, int i2) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long lRemove = this.j.remove(Long.valueOf(j2));
            long jLongValue = lRemove != null ? jElapsedRealtime - lRemove.longValue() : -1L;
            byte[] bArrJ = j(j, j2, i, i2);
            String strO = o();
            if (TextUtils.isEmpty(strO)) {
                o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send FLUSH_ACK(0x13) BLOCKED mac_empty reqId=" + j2 + " sid=" + j + " rc=" + i2 + " sinceFlushReqRecvMs=" + jLongValue);
                return;
            }
            MessageEvent messageEvent = new MessageEvent(this.i, 19, bArrJ);
            messageEvent.setTransport(2);
            wl4.devicePrimary.b.a(strO, messageEvent);
            o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send FLUSH_ACK(0x13) OAF sendMessage reqId=" + j2 + " sid=" + j + " dir=" + i + " rc=" + i2 + " sinceFlushReqRecvMs=" + jLongValue);
        } catch (Exception e) {
            o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send FLUSH_ACK(0x13) failed reqId=" + j2 + " " + e.getMessage());
        }
    }

    public void C(ok9 ok9Var) {
        boolean zC;
        String strO = o();
        if (TextUtils.isEmpty(strO)) {
            o5f.e("BtNetMsg", "ColorConnectManager FromPhoneContactPair macAddress is empty!");
            return;
        }
        if (ok9Var.l() == 1556) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jZ = z(ok9Var.e());
            Long lRemove = jZ >= 0 ? this.j.remove(Long.valueOf(jZ)) : null;
            long jLongValue = lRemove != null ? jElapsedRealtime - lRemove.longValue() : -1L;
            if (g82.c()) {
                Trace.beginSection("BtNet_sendFlushAck_viaQueue reqId=" + jZ);
            }
            try {
                MessageEvent messageEvent = new MessageEvent(this.i, 19, ok9Var.e());
                messageEvent.setTransport(2);
                wl4.devicePrimary.b.a(strO, messageEvent);
                o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send FLUSH_ACK(0x13) OAF (from mSendQueue) sid=" + ok9Var.i() + " reqId=" + jZ + " sinceFlushReqRecvMs=" + jLongValue);
                if (zC) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (g82.c()) {
                    Trace.endSection();
                }
            }
        }
        HttpDataProto.Builder builderNewBuilder = HttpDataProto.newBuilder();
        builderNewBuilder.setHead(ByteString.copyFrom(ok9Var.h()));
        builderNewBuilder.setBody(ByteString.copyFrom(ok9Var.e()));
        if (this.i == 100) {
            if (g82.c()) {
                StringBuilder sb = new StringBuilder();
                sb.append("BtNet_sendHttp sid=");
                sb.append(ok9Var.i());
                sb.append(" size=");
                sb.append(ok9Var.e() != null ? ok9Var.e().length : 0);
                Trace.beginSection(sb.toString());
            }
            MessageEvent messageEvent2 = new MessageEvent(this.i, 0, builderNewBuilder.build().toByteArray());
            messageEvent2.setTransport(ok9Var.f);
            wl4.devicePrimary.b.a(strO, messageEvent2);
            if (g82.c()) {
                Trace.endSection();
                return;
            }
            return;
        }
        byte[] bArrW = w(ok9Var.h(), ok9Var.e());
        SocketDataType socketDataType = SocketDataType.UNKNOWN_SOCKET_DATA_TYPE;
        SocketDataType socketDataType2 = ok9Var.l() == 1545 ? SocketDataType.UDP : SocketDataType.TCP;
        int iAddAndGet = this.l.addAndGet(1);
        if (g82.c()) {
            Trace.beginSection("BtNet_sendOaf seq=" + iAddAndGet + " sid=" + ok9Var.i() + " size=" + bArrW.length);
        }
        MessageEvent messageEvent3 = new MessageEvent(this.i, 17, SocketDataPB.newBuilder().setSeq(iAddAndGet).setType(socketDataType2).setSize(bArrW.length).setPayload(ByteString.copyFrom(bArrW)).build().toByteArray());
        messageEvent3.setTransport(ok9Var.f);
        wl4.devicePrimary.b.a(strO, messageEvent3);
        if (g82.c()) {
            Trace.endSection();
        }
    }

    public final void D() {
        o5f.b("BtNetMsg", "sendPhoneStatus ...");
        String strO = o();
        if (TextUtils.isEmpty(strO)) {
            o5f.e("BtNetMsg", "ColorConnectManager FromPhoneContactPair macAddress is empty!");
            return;
        }
        NetworkInfo networkInfoN = n();
        PhoneStateProto.Builder builderNewBuilder = PhoneStateProto.newBuilder();
        builderNewBuilder.setTetherStatus(v());
        if (networkInfoN != null) {
            builderNewBuilder.setNetAvialable(true);
            builderNewBuilder.setNetworkType(networkInfoN.getType());
            builderNewBuilder.setNetworkTypeName(networkInfoN.getTypeName());
        } else {
            builderNewBuilder.setNetAvialable(false);
        }
        wl4.devicePrimary.b.a(strO, new MessageEvent(this.i, 5, builderNewBuilder.build().toByteArray()));
    }

    public final void E(long j, long j2, int i, int i2, boolean z) {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long lRemove = this.k.remove(Long.valueOf(j2));
            long jLongValue = lRemove != null ? jElapsedRealtime - lRemove.longValue() : -1L;
            JSONObject jSONObject = new JSONObject();
            if (j >= 0) {
                jSONObject.put("socketId", j);
            }
            if (j2 >= 0) {
                jSONObject.put("requestId", j2);
            }
            jSONObject.put("resultCode", i);
            if (i == 0 && i2 >= 0) {
                jSONObject.put("targetTransport", i2);
            }
            if (i == 0 && z) {
                jSONObject.put("remoteResumeApplied", true);
            }
            byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            String strO = o();
            if (TextUtils.isEmpty(strO)) {
                o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send PHONE_TRANSPORT_SWITCH_ACK(0x19) BLOCKED mac_empty reqId=" + j2 + " rc=" + i + " sinceReqRecvMs=" + jLongValue);
                return;
            }
            MessageEvent messageEvent = new MessageEvent(this.i, 25, bytes);
            messageEvent.setTransport(2);
            wl4.devicePrimary.b.a(strO, messageEvent);
            o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send PHONE_TRANSPORT_SWITCH_ACK(0x19) OAF sendMessage reqId=" + j2 + " rc=" + i + " remoteResumeApplied=" + z + " sinceReqRecvMs=" + jLongValue);
        } catch (JSONException e) {
            o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone send PHONE_TRANSPORT_SWITCH_ACK(0x19) build ex " + e.getMessage());
        }
    }

    public ok9 i(long j, long j2, int i, int i2, int i3) {
        try {
            byte[] bArrJ = j(j, j2, i, i2);
            ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.BTNET_FLUSH_ACK_MSG, j, (byte) 0, bArrJ.length, bArrJ);
            if (ok9VarB == null) {
                return null;
            }
            ok9VarB.f = i3;
            return ok9VarB;
        } catch (IOException e) {
            o5f.b("BtNetMsg", "buildFlushAckHttpDataForSendQueue: " + e.getMessage());
            return null;
        }
    }

    public void k(boolean z) {
        BluetoothDevice bluetoothDeviceP = p();
        if (bluetoothDeviceP != null && z) {
            o5f.b("BtNetMsg", "connect to server ");
        } else if (bluetoothDeviceP == null) {
            o5f.e("BtNetMsg", "bluetoothDevice is null");
        }
    }

    public final void l(boolean z) {
        o5f.c("BtNetMsg", "enableBluetoothNet:" + z);
        String strO = o();
        if (TextUtils.isEmpty(strO)) {
            o5f.e("BtNetMsg", "ColorConnectManager FromPhoneContactPair macAddress is empty!");
            return;
        }
        OpenVpn.Builder builderNewBuilder = OpenVpn.newBuilder();
        builderNewBuilder.setEnablevpn(z);
        if (z) {
            NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                builderNewBuilder.setNetworkType(activeNetworkInfo.getType());
                builderNewBuilder.setNetworkTypeName(activeNetworkInfo.getTypeName());
            }
        } else {
            builderNewBuilder.setNetworkType(-1);
        }
        wl4.devicePrimary.b.a(strO, new MessageEvent(this.i, 4, builderNewBuilder.build().toByteArray()));
    }

    public final void m() {
        if (u()) {
            l(true);
            return;
        }
        l(false);
        cyg cygVar = this.h;
        if (cygVar != null) {
            cygVar.n();
        }
    }

    public final NetworkInfo n() {
        return ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public final String o() {
        if (!this.b) {
            o5f.e("BtNetMsg", "ColorConnectManager getConnectedDeviceAddress mIsConnected is false!");
            return null;
        }
        List connectedNodes = wl4.managerApi.getConnectedNodes();
        if (connectedNodes.isEmpty()) {
            o5f.e("BtNetMsg", "ColorConnectManager getConnectedDeviceAddress nodeList is empty!");
            return null;
        }
        Node node = (Node) connectedNodes.get(0);
        if (node != null) {
            return node.getMainModule().getMacAddress();
        }
        o5f.e("BtNetMsg", "ColorConnectManager getConnectedDeviceAddress node is null!");
        return null;
    }

    public final BluetoothDevice p() {
        Set<BluetoothDevice> bondedDevices = this.d.getBondedDevices();
        if (bondedDevices == null) {
            return null;
        }
        Iterator<BluetoothDevice> it = bondedDevices.iterator();
        while (it.hasNext()) {
            BluetoothDevice next = it.next();
            o5f.a("BtNetMsg", next == null ? "device is null" : next.getAddress());
            String strO = o();
            if (next != null && next.getAddress().equalsIgnoreCase(strO)) {
                return next;
            }
        }
        return null;
    }

    public final void q(MessageEvent messageEvent) {
        try {
            long[] jArrY = y(messageEvent.getData());
            long j = jArrY[0];
            long j2 = jArrY[1];
            int i = (int) jArrY[2];
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.j.put(Long.valueOf(j2), Long.valueOf(jElapsedRealtime));
            o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone recv FLUSH_REQ(0x12) sid=" + j + " reqId=" + j2 + " dir=" + i + " tRecv=" + jElapsedRealtime + " -> enqueue tunnel mNeedWriteData");
            com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVarF = this.h.s().f(j);
            if (aVarF != null) {
                aVarF.l(j2, i);
                return;
            }
            o5f.b("BtNetMsg", "FLUSH_REQ: no tunnel sid=" + j + " reqId=" + j2);
            A(j, j2, i, 1);
        } catch (Exception e) {
            o5f.b("BtNetMsg", "FLUSH_REQ: parse " + e.getMessage());
        }
    }

    public final void r(MessageEvent messageEvent) {
        Exception exc;
        int i;
        boolean z;
        long j;
        int i2;
        boolean z2;
        long j2;
        long j3;
        long j4 = -1;
        int i3 = 0;
        try {
            JSONObject jSONObject = new JSONObject(new String(messageEvent.getData(), StandardCharsets.UTF_8));
            long j5 = jSONObject.getLong("socketId");
            try {
                j4 = jSONObject.getLong("requestId");
                int i4 = jSONObject.getInt("targetTransport");
                boolean zOptBoolean = jSONObject.optBoolean("resumeRemoteWithSwitch", false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.k.put(Long.valueOf(j4), Long.valueOf(jElapsedRealtime));
                o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone recv PHONE_TRANSPORT_SWITCH_REQ(0x18) sid=" + j5 + " reqId=" + j4 + " targetTr=" + i4 + " resumeRemote=" + zOptBoolean + " tRecv=" + jElapsedRealtime);
                com.oppo.bluetooth.btnet.bluetoothproxyserver.server.a aVarF = this.h.s().f(j5);
                z = true;
                if (aVarF == null) {
                    o5f.b("BtNetMsg", "PHONE_TRANSPORT_SWITCH_REQ: no tunnel sid=" + j5);
                    z = false;
                    i3 = 1;
                } else {
                    aVarF.y(i4);
                    if (zOptBoolean) {
                        aVarF.w();
                    } else {
                        z = false;
                    }
                    try {
                        o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone PHONE_TRANSPORT_SWITCH applied sid=" + j5 + " targetTransport=" + i4 + " reqId=" + j4 + " remoteResumeBundled=" + z);
                    } catch (Exception e) {
                        exc = e;
                        i = i4;
                        j = j4;
                        j4 = j5;
                        o5f.b("BtNetMsg", "MIGRATE_LINK_DIAG phone PHONE_TRANSPORT_SWITCH_REQ parse/handle ex " + exc.getMessage());
                        i2 = i;
                        z2 = z;
                        i3 = 2;
                        j2 = j4;
                        j3 = j;
                    }
                }
                i2 = i4;
                j3 = j4;
                j2 = j5;
                z2 = z;
            } catch (Exception e2) {
                exc = e2;
                i = -1;
                z = false;
            }
        } catch (Exception e3) {
            exc = e3;
            i = -1;
            z = false;
            j = -1;
        }
        E(j2, j3, i3, i2, z2);
    }

    public final void s() {
        o5f.b("BtNetMsg", "======onConnected");
        x();
        this.b = true;
        xm5 xm5Var = wl4.devicePrimary;
        xm5Var.a.g(this.n);
        xm5Var.b.f(this.i, -1, this.o);
        if (t()) {
            o5f.b("BtNetMsg", "connectServer======onConnected");
            this.c.set(true);
        }
    }

    public boolean t() {
        if (!this.b) {
            o5f.e("BtNetMsg", "ColorConnectManager getConnectedDeviceAddress mIsConnected is false!");
            return false;
        }
        if (!wl4.managerApi.getConnectedNodes().isEmpty()) {
            return true;
        }
        o5f.e("BtNetMsg", "ColorConnectManager getConnectedDeviceAddress nodeList is empty!");
        return false;
    }

    public final boolean u() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"PrivateApi"})
    public final boolean v() {
        Object objInvoke;
        Object obj = this.f.get();
        try {
            Class<?> cls = Class.forName("android.bluetooth.BluetoothPan");
            if (obj != null && (objInvoke = cls.getMethod("isTetheringOn", new Class[0]).invoke(obj, new Object[0])) != null) {
                o5f.c("BtNetMsg", "isTetheringOn=" + objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (Exception e) {
            o5f.b("BtNetMsg", "isTetherOn: ex " + e);
        }
        return false;
    }

    public final byte[] w(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public final void x() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        vgf.a(this.a, this.m, intentFilter, 2);
    }
}
