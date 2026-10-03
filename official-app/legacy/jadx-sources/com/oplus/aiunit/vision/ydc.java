package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.protobuf.ByteString;
import com.heytap.health.wallet.bean.NfcMifareCardBean;
import com.heytap.health.wallet.bean.SectorInfo;
import com.heytap.health.wallet.entrance.db.EntranceCardProto$EntranceCardInfo;
import com.heytap.health.wallet.entrance.db.EntranceCardProto$SectorInfo;
import com.heytap.health.wallet.healthcloud.request.RfFileListDownloadReq;
import com.heytap.health.wallet.model.NfcCardDetail;
import com.heytap.health.wallet.model.WatchImageInfo;
import com.heytap.health.wallet.model.response.PayCardInfo;
import com.heytap.health.wallet.router.WatchCardsUpdateService;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oppo.wear.wallet.proto.APDUTransmit$APDUTransmitMessage;
import com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessage;
import com.oppo.wear.wallet.proto.AddCardManager$SyncCardsMessage;
import com.oppo.wear.wallet.proto.CapOperation$CardUidInfo;
import com.oppo.wear.wallet.proto.CapOperation$CommandTypeApi;
import com.oppo.wear.wallet.proto.ChannelManger$ChannelMessage;
import com.oppo.wear.wallet.proto.ChannelManger$OpenChannelMessage;
import com.oppo.wear.wallet.proto.ChannelManger$OpenChannelReplyMessage;
import com.oppo.wear.wallet.proto.ChannelManger$WalletChanageRFpa;
import com.oppo.wear.wallet.proto.ChannelManger$WalletEventMessage;
import com.oppo.wear.wallet.proto.DefaultCardManager$SetDefaultCardMessage;
import com.oppo.wear.wallet.proto.NfcStatusManager$GetWatchApkVersionMessage;
import com.oppo.wear.wallet.proto.NfcStatusManager$NfcStatusMessage;
import com.oppo.wear.wallet.proto.SwipeSetting$CardGeoFenceUpdateMessage;
import com.oppo.wear.wallet.proto.SwipeSetting$CardsSwipeManner;
import com.oppo.wear.wallet.proto.SwipeSetting$CardsSwipeTime;
import com.oppo.wear.wallet.proto.SwipeSetting$DefaultSwipeCard;
import com.oppo.wear.wallet.proto.SwipeSetting$SwipeSetStatus;
import com.oppo.wear.wallet.proto.WalletAbilities$AbilitySupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes18.dex */
public class ydc implements uak {
    public static volatile ydc mInstance;
    public Context a;
    public final ReentrantLock b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f18981c;
    public final Condition d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String f18982e;
    public volatile ChannelManger$OpenChannelReplyMessage f;
    public volatile APDUTransmit$APDUTransmitMessage g;
    public volatile String h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Object f18983j;
    public volatile String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f18984l;
    public final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18985n;
    public String o;
    public int p;

    public static class a extends Observable {
        public void a(Object obj) {
            setChanged();
            notifyObservers(obj);
        }
    }

    public interface b<T> {
        void a(T t);

        void b();
    }

    public ydc() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.f18981c = reentrantLock.newCondition();
        this.d = reentrantLock.newCondition();
        this.f = null;
        this.g = null;
        this.p = 0;
        if (this.a == null) {
            this.a = qz0.mContext;
        }
        this.m = new a();
    }

    public static ydc n() {
        if (mInstance == null) {
            synchronized (ydc.class) {
                if (mInstance == null) {
                    mInstance = new ydc();
                }
            }
        }
        return mInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(boolean z, int i) {
        if (i != 0) {
            u();
        }
    }

    public final void A(MessageEvent messageEvent) {
        SwipeSetting$CardsSwipeManner swipeSetting$CardsSwipeMannerBuild;
        try {
            try {
                swipeSetting$CardsSwipeMannerBuild = SwipeSetting$CardsSwipeManner.parseFrom(messageEvent.getData());
                if (swipeSetting$CardsSwipeMannerBuild == null) {
                    swipeSetting$CardsSwipeMannerBuild = SwipeSetting$CardsSwipeManner.newBuilder().build();
                }
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", "onGetSwipeCardManner e = " + e2.getMessage());
            }
            this.m.a(swipeSetting$CardsSwipeMannerBuild);
        } catch (Throwable th) {
            this.m.a(SwipeSetting$CardsSwipeManner.newBuilder().build());
            throw th;
        }
    }

    public final void B(MessageEvent messageEvent) {
        WalletAbilities$AbilitySupport walletAbilities$AbilitySupportBuild;
        try {
            try {
                walletAbilities$AbilitySupportBuild = WalletAbilities$AbilitySupport.parseFrom(messageEvent.getData());
                if (walletAbilities$AbilitySupportBuild == null) {
                    walletAbilities$AbilitySupportBuild = WalletAbilities$AbilitySupport.newBuilder().build();
                }
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", "onGetWatchAbility e = " + e2.getMessage());
            }
            this.m.a(walletAbilities$AbilitySupportBuild);
        } catch (Throwable th) {
            this.m.a(WalletAbilities$AbilitySupport.newBuilder().build());
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.oplus.aiunit.vision.ydc$a] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final void C(MessageEvent messageEvent) {
        Boolean boolValueOf;
        try {
            try {
                boolean setSuc = SwipeSetting$SwipeSetStatus.parseFrom(messageEvent.getData()).getSetSuc();
                a aVar = this.m;
                boolValueOf = Boolean.valueOf(setSuc);
                this = aVar;
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", "onSetCardsSwipe e = " + e2.getMessage());
                a aVar2 = this.m;
                boolValueOf = Boolean.FALSE;
                this = aVar2;
            }
            this.a(boolValueOf);
        } catch (Throwable th) {
            this.m.a(Boolean.FALSE);
            throw th;
        }
    }

    public void D(String str, int i, vak vakVar, boolean z) {
        ChannelManger$OpenChannelMessage.Builder builderNewBuilder = ChannelManger$OpenChannelMessage.newBuilder();
        builderNewBuilder.setWalletAid(str);
        builderNewBuilder.setWalletChannelType(i);
        builderNewBuilder.setSessionSwitch(z);
        try {
            MessageEvent messageEventA = gl4.devicePrimary.callApi.a(gl4.managerApi.getCurrActiveMac(), new MessageEvent(12, 1, builderNewBuilder.build().toByteArray()), ko4.c.INSTANCE, 15000L, 0);
            if (messageEventA == null) {
                t6b.i("NFCTransmitManger", "openChannel response = null");
            } else {
                vakVar.f(ChannelManger$OpenChannelReplyMessage.parseFrom(messageEventA.getData()));
            }
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", "openChannel fail exception: " + e2.getMessage());
            vakVar.f(null);
        }
    }

    public final void E(MessageEvent messageEvent) {
        try {
            try {
                this.f = ChannelManger$OpenChannelReplyMessage.parseFrom(messageEvent.getData());
                t6b.d("NFCTransmitManger", this.f.getWalletChannelId());
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            u();
        }
    }

    public final void F(MessageEvent messageEvent) {
        String strH = e1j.h(messageEvent.getData());
        t6b.b("NFCTransmitManger", "cplc from watch = " + strH);
        if (TextUtils.isEmpty(strH) || !strH.endsWith("9000")) {
            t6b.i("NFCTransmitManger", "cplc from watch error");
            this.f18982e = null;
            u();
        } else {
            this.f18982e = strH.substring(6, strH.length() - 4).toUpperCase();
            n7a.INSTANCE.a(38, 6, v0j.a(this.f18982e, 6, 2));
            u();
        }
    }

    public final void G(byte[] bArr) {
        NfcMifareCardBean nfcMifareCardBean = null;
        if (bArr != null && bArr.length > 0) {
            try {
                EntranceCardProto$EntranceCardInfo from = EntranceCardProto$EntranceCardInfo.parseFrom(bArr);
                NfcMifareCardBean nfcMifareCardBean2 = new NfcMifareCardBean();
                try {
                    nfcMifareCardBean2.setAtqa(from.getAtqa());
                    nfcMifareCardBean2.setCpuCard(from.getIsCpuCard());
                    nfcMifareCardBean2.setEncrypt(from.getIsEncrypt());
                    nfcMifareCardBean2.setId(from.getId());
                    nfcMifareCardBean2.setSak(from.getSak());
                    nfcMifareCardBean2.setSectorCount(from.getSectorCount());
                    nfcMifareCardBean2.setType(from.getType());
                    SparseArray<SectorInfo> sparseArray = new SparseArray<>();
                    for (int i = 0; i < from.getSectorInfosCount(); i++) {
                        EntranceCardProto$SectorInfo sectorInfos = from.getSectorInfos(i);
                        SectorInfo sectorInfo = new SectorInfo();
                        sectorInfo.index = i;
                        sectorInfo.isEncrypt = sectorInfos.getIsEncrypt();
                        SparseArray<String> sparseArray2 = new SparseArray<>();
                        for (int i2 = 0; i2 < sectorInfos.getBlockInfosCount(); i2++) {
                            sparseArray2.put(i2, sectorInfos.getBlockInfos(i2));
                        }
                        sectorInfo.blockInfos = sparseArray2;
                        sparseArray.put(i, sectorInfo);
                    }
                    nfcMifareCardBean2.setSectorInfos(sparseArray);
                    t6b.f("NFCTransmitManger", "TransCardBean =" + nfcMifareCardBean2.toString());
                    nfcMifareCardBean = nfcMifareCardBean2;
                } catch (Exception e2) {
                    e = e2;
                    nfcMifareCardBean = nfcMifareCardBean2;
                    t6b.d("NFCTransmitManger", "parseEntranceData e = " + e.getMessage());
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        b bVar = this.f18984l;
        if (bVar != null) {
            bVar.a(nfcMifareCardBean);
        }
    }

    public void H() {
        t6b.f("NFCTransmitManger", "enter releseChannel");
        try {
            if (gl4.devicePrimary.callApi.a(gl4.managerApi.getCurrActiveMac(), new MessageEvent(12, 6, null), ko4.c.INSTANCE, 15000L, 0) == null) {
                t6b.i("NFCTransmitManger", "releseChannel response = null");
            }
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", "releseChannel fail exception: " + e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e A[PHI: r1
  0x002e: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:16:0x0062, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final void I(MessageEvent messageEvent) {
        String str = "";
        try {
            try {
                String commandType = CapOperation$CommandTypeApi.parseFrom(messageEvent.getData()).getCommandType();
                str = commandType != null ? commandType : "";
                if ("OPENAPIDISABLE".equals(str)) {
                    WatchCardsUpdateService watchCardsUpdateService = (WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation();
                    watchCardsUpdateService.N5(str);
                    this = watchCardsUpdateService;
                } else {
                    a aVar = this.m;
                    aVar.a(str);
                    this = aVar;
                }
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
                if (!"OPENAPIDISABLE".equals("")) {
                    a aVar2 = this.m;
                    aVar2.a(str);
                    this = aVar2;
                }
            }
        } catch (Throwable th) {
            if ("OPENAPIDISABLE".equals(str)) {
                ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).N5(str);
            } else {
                this.m.a(str);
            }
            throw th;
        }
    }

    public final void J() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.i < 5000) {
            this.i = jCurrentTimeMillis;
            return;
        }
        this.i = jCurrentTimeMillis;
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.a.getSystemService("activity")).getAppTasks();
        if (appTasks != null && appTasks.size() != 0) {
            for (ActivityManager.AppTask appTask : appTasks) {
                try {
                    if (appTask.getTaskInfo() != null && appTask.getTaskInfo().topActivity.getClassName().startsWith("com.heytap.health.wallet")) {
                        if (ax7.j().k()) {
                            return;
                        }
                        appTask.moveToFront();
                        return;
                    }
                } catch (Exception e2) {
                    t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
                }
            }
        }
        t6b.b("NFCTransmitManger", "oldTime:" + this.i);
        Intent intent = new Intent("com.heytap.health.wallet.nfc.ui.CardPackageActivity");
        intent.setFlags(268435456);
        intent.putExtra("isConnected", true);
        intent.putExtra("currentMac", gl4.managerApi.getCurrentConnectId());
        intent.setPackage(this.a.getPackageName());
        this.a.startActivity(intent);
    }

    public void K(String str, int i, String str2) {
        t6b.b("NFCTransmitManger", "sendFile: fileCatagory:" + str + ", serviceId:" + i + ", path:" + str2);
        gl4.devicePrimary.fileApi.a(gl4.managerApi.getCurrentConnectId(), str, i, str2);
    }

    public void L(String str, int i, String str2, long j2, String str3) {
        K(str, i, str2);
        this.f18985n = j2;
        this.o = str3;
    }

    public void M(int i, int i2, byte[] bArr) {
        this.b.lock();
        try {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("sendMessage: ");
                sb.append(i2);
                sb.append("  bytes: ");
                sb.append(bArr == null ? "" : bArr);
                t6b.d("NFCTransmitManger", sb.toString());
                gl4.devicePrimary.messageApi.e(new MessageEvent(i, i2, bArr), new rl4.c() { // from class: com.oplus.aiunit.vision.xdc
                    @Override // com.oplus.aiunit.vision.rl4.c
                    public final void a(boolean z, int i3) {
                        this.a.t(z, i3);
                    }
                });
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            this.b.unlock();
        }
    }

    public void N(List<PayCardInfo> list) {
        j7l.u();
        AddCardManager$SyncCardsMessage.Builder builderNewBuilder = AddCardManager$SyncCardsMessage.newBuilder();
        for (PayCardInfo payCardInfo : list) {
            AddCardManager$CardInfoMessage.Builder builderNewBuilder2 = AddCardManager$CardInfoMessage.newBuilder();
            if (!TextUtils.isEmpty(payCardInfo.getAppCode())) {
                builderNewBuilder2.setAppCode(payCardInfo.getAppCode());
            }
            try {
                builderNewBuilder2.setWalletCardType(Integer.valueOf(payCardInfo.getCardType()).intValue());
            } catch (Exception unused) {
                builderNewBuilder2.setWalletCardType(5);
            }
            builderNewBuilder2.setWalletCardAid(payCardInfo.getAid());
            builderNewBuilder2.setWalletCardName(payCardInfo.getDisplayName());
            builderNewBuilder.addCardInfo(builderNewBuilder2);
        }
        M(12, 9, builderNewBuilder.build().toByteArray());
    }

    public void O(String str, byte[] bArr, String str2, vak vakVar) {
        APDUTransmit$APDUTransmitMessage.Builder builderNewBuilder = APDUTransmit$APDUTransmitMessage.newBuilder();
        builderNewBuilder.setWalletChannelAPDU(ByteString.copyFrom(bArr));
        builderNewBuilder.setWalletChannelId(str2);
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            str = str.substring(str.length() - 3);
        }
        builderNewBuilder.setWalletRequestId(str);
        try {
            MessageEvent messageEventA = gl4.devicePrimary.callApi.a(gl4.managerApi.getCurrActiveMac(), new MessageEvent(12, 2, builderNewBuilder.build().toByteArray()), ko4.c.INSTANCE, 65000L, 0);
            if (messageEventA != null) {
                vakVar.d(APDUTransmit$APDUTransmitMessage.parseFrom(messageEventA.getData()));
            } else {
                vakVar.d(null);
                t6b.i("NFCTransmitManger", "transmitAPDU response = null");
            }
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", "transmitAPDU fail exception: " + e2.getMessage());
            vakVar.d(null);
        }
    }

    public final void P(MessageEvent messageEvent) {
        try {
            try {
                this.g = APDUTransmit$APDUTransmitMessage.parseFrom(messageEvent.getData());
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            u();
        }
    }

    public final void Q() {
        Context context = qz0.mContext;
        StringBuilder sb = new StringBuilder();
        sb.append(j7l.WALLET_COMBINATION_UPDATE_LAST);
        sb.append(z9g.h(context, j7l.KEY_DEVICE_BLUETOOTH_MAC));
        if (Math.abs(System.currentTimeMillis() - z9g.f(context, sb.toString(), 0L)) < 86400000) {
            return;
        }
        ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).N0();
    }

    public void b(Observer observer) {
        if (observer != null) {
            this.m.addObserver(observer);
        }
    }

    @WorkerThread
    public void c(@NonNull String str, @NonNull String str2) {
        this.b.lock();
        try {
            try {
                ChannelManger$WalletChanageRFpa.Builder builderNewBuilder = ChannelManger$WalletChanageRFpa.newBuilder();
                builderNewBuilder.setCity(str2);
                builderNewBuilder.setWalletAid(str);
                M(12, 16, builderNewBuilder.build().toByteArray());
                this.f18981c.await(15L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            this.b.unlock();
        }
    }

    public void d() {
        t6b.f("NFCTransmitManger", "enter closeAllChannel");
        this.b.lock();
        try {
            gl4.devicePrimary.messageApi.b(new MessageEvent(12, 6, null));
        } finally {
            this.b.unlock();
        }
    }

    public final void e(MessageEvent messageEvent) {
        try {
            String walletCardAid = DefaultCardManager$SetDefaultCardMessage.parseFrom(messageEvent.getData()).getWalletCardAid();
            t6b.b("NFCTransmitManger", "watch set defaultAid =" + walletCardAid);
            j7l.K(walletCardAid);
            sr6.c().l(new ts6());
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:3:0x0005, B:13:0x0045, B:14:0x0048, B:15:0x004d, B:16:0x0058, B:17:0x005d, B:19:0x0062, B:20:0x0081, B:21:0x00bc), top: B:27:0x0005 }] */
    public final void f(MessageEvent messageEvent) {
        try {
            ChannelManger$WalletEventMessage from = ChannelManger$WalletEventMessage.parseFrom(messageEvent.getData());
            int walletEvent = from.getWalletEvent();
            String walletAid = from.getWalletAid();
            t6b.f("NFCTransmitManger", "dealWithEvent, event:" + walletEvent + ", aid:" + walletAid);
            if (walletEvent == 32) {
                ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).j7(walletAid);
            } else if (walletEvent == 35) {
                Context context = qz0.mContext;
                z9g.o(context, j7l.WALLET_RF_FILE_UPDATE_LAST + z9g.h(context, j7l.KEY_DEVICE_BLUETOOTH_MAC), System.currentTimeMillis());
                z9g.o(context, j7l.WALLET_RF_FILE_UPDATE_VERSION + z9g.h(context, j7l.KEY_DEVICE_BLUETOOTH_MAC), this.f18985n);
            } else if (walletEvent == 36) {
                int i = this.p;
                if (i < 2) {
                    this.p = i + 1;
                    i7l.f();
                    RfFileListDownloadReq rfFileListDownloadReq = new RfFileListDownloadReq();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("common");
                    arrayList.add(walletAid);
                    rfFileListDownloadReq.setAidList(arrayList);
                    i7l.g(rfFileListDownloadReq);
                }
            } else if (walletEvent == 61) {
                Q();
            } else if (walletEvent != 62) {
                switch (walletEvent) {
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                        this.m.a(Integer.valueOf(walletEvent));
                        break;
                    default:
                        w();
                        break;
                }
            } else {
                this.m.a(Integer.valueOf(walletEvent));
            }
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    public final void g(MessageEvent messageEvent) {
        try {
            try {
                boolean isNfcOpen = NfcStatusManager$NfcStatusMessage.parseFrom(messageEvent.getData()).getIsNfcOpen();
                t6b.f("NFCTransmitManger", "isNfcOpen: " + isNfcOpen);
                this.f18983j = Boolean.valueOf(isNfcOpen);
            } catch (Exception e2) {
                this.f18983j = Boolean.FALSE;
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            u();
        }
    }

    public final void h(MessageEvent messageEvent) {
        try {
            String aid = SwipeSetting$CardGeoFenceUpdateMessage.parseFrom(messageEvent.getData()).getAid();
            t6b.b("NFCTransmitManger", "dealWithSwipeCard aid from watch = " + aid);
            fkj.d().h(b78.a(), aid);
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }

    public final void i(MessageEvent messageEvent) {
        try {
            try {
                NfcStatusManager$GetWatchApkVersionMessage from = NfcStatusManager$GetWatchApkVersionMessage.parseFrom(messageEvent.getData());
                String watchApkVersion = from.getWatchApkVersion();
                this.k = watchApkVersion;
                aec.x(new WatchImageInfo(from.getPixelX(), from.getPixelY()));
                t6b.f("NFCTransmitManger", "watchApkVersion: " + watchApkVersion + "getPixelX:" + from.getPixelX() + "getPixelY:" + from.getPixelY());
            } catch (Exception e2) {
                this.k = "0";
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            u();
        }
    }

    public void j(String str) {
        AddCardManager$CardInfoMessage.Builder builderNewBuilder = AddCardManager$CardInfoMessage.newBuilder();
        builderNewBuilder.setWalletCardAid(str);
        M(12, 10, builderNewBuilder.build().toByteArray());
    }

    public void k(Observer observer) {
        if (observer != null) {
            this.m.deleteObserver(observer);
        }
    }

    public void l(StringBuilder sb) {
        MessageEvent messageEvent = new MessageEvent(12, 8, ParserTag.TAG_GET.getBytes());
        try {
            this.h = null;
            MessageEvent messageEventA = gl4.devicePrimary.callApi.a(gl4.managerApi.getCurrActiveMac(), messageEvent, ko4.c.INSTANCE, 5000L, 0);
            if (messageEventA == null) {
                t6b.i("NFCTransmitManger", "getBasicChannel response = null");
            } else {
                this.h = ChannelManger$ChannelMessage.parseFrom(messageEventA.getData()).getChannelAid();
                sb.append(this.h);
            }
        } catch (Exception e2) {
            t6b.i("NFCTransmitManger", "getBasicChannel fail exception: " + e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.locks.ReentrantLock] */
    public void m(StringBuilder sb) {
        this.b.lock();
        this.f18982e = "";
        M(12, 4, null);
        try {
            try {
                this.f18981c.await(2L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            sb.append(this.f18982e);
            this.b.unlock();
        }
    }

    @Override // com.oplus.aiunit.vision.uak
    public void notifyOpenReaderMode(b bVar) {
        registerDetectListener(bVar);
        M(12, 17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.locks.ReentrantLock] */
    public void o(int i, vak vakVar) {
        this.b.lock();
        this.f18983j = null;
        M(12, i, null);
        try {
            try {
                this.f18981c.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            vakVar.e(this.f18983j);
            this.b.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.concurrent.locks.ReentrantLock] */
    public void p(StringBuilder sb) {
        this.b.lock();
        this.k = "0";
        M(12, 15, null);
        try {
            try {
                this.f18981c.await(10L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            sb.append(this.k);
            this.b.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x0005, B:15:0x0033, B:16:0x0036, B:18:0x003a, B:19:0x003e, B:20:0x0042, B:21:0x0046, B:22:0x004a, B:23:0x004e, B:24:0x0052, B:26:0x0056, B:27:0x005a, B:28:0x0062, B:29:0x0066, B:30:0x006a, B:31:0x006e, B:32:0x0072, B:33:0x0076, B:34:0x007a, B:35:0x007e, B:36:0x0082, B:37:0x0086, B:38:0x008a), top: B:44:0x0005 }] */
    public void q(int i, MessageEvent messageEvent) {
        this.b.lock();
        try {
            t6b.f("NFCTransmitManger", "messageEvent = " + messageEvent.toString());
            if (i == 1) {
                E(messageEvent);
            } else if (i == 2) {
                P(messageEvent);
            } else if (i == 4) {
                F(messageEvent);
            } else if (i == 6) {
                u();
            } else if (i == 31) {
                y(messageEvent);
            } else if (i != 81) {
                switch (i) {
                    case 11:
                        f(messageEvent);
                        break;
                    case 12:
                        J();
                        break;
                    case 13:
                        e(messageEvent);
                        break;
                    case 14:
                        g(messageEvent);
                        break;
                    case 15:
                        i(messageEvent);
                        break;
                    case 16:
                        u();
                        break;
                    case 17:
                        G(messageEvent.getData());
                        break;
                    case 18:
                        b bVar = this.f18984l;
                        if (bVar != null) {
                            bVar.b();
                        }
                        break;
                    default:
                        switch (i) {
                            case 22:
                                B(messageEvent);
                                break;
                            case 23:
                                A(messageEvent);
                                break;
                            case 24:
                                x(messageEvent);
                                break;
                            case 25:
                            case 26:
                            case 28:
                                C(messageEvent);
                                break;
                            case 27:
                                z(messageEvent);
                                break;
                            case 29:
                                I(messageEvent);
                                break;
                        }
                        break;
                }
            } else {
                h(messageEvent);
            }
        } finally {
            this.b.unlock();
        }
    }

    public void r(Context context) {
        if (context != null) {
            this.a = context.getApplicationContext();
        }
    }

    public void registerDetectListener(b bVar) {
        this.f18984l = bVar;
    }

    @WorkerThread
    public void s(NfcCardDetail nfcCardDetail, boolean z, String str) {
        t6b.f("NFCTransmitManger", "insertNFCCard, detail: " + nfcCardDetail);
        if (nfcCardDetail == null) {
            return;
        }
        AddCardManager$CardInfoMessage.Builder builderNewBuilder = AddCardManager$CardInfoMessage.newBuilder();
        builderNewBuilder.setWalletCardAid(nfcCardDetail.getAid());
        if (!TextUtils.isEmpty(nfcCardDetail.getAppCode())) {
            builderNewBuilder.setAppCode(nfcCardDetail.getAppCode());
        }
        if (!TextUtils.isEmpty(nfcCardDetail.getCardName())) {
            builderNewBuilder.setWalletCardName(nfcCardDetail.getCardName());
        }
        if (!TextUtils.isEmpty(nfcCardDetail.getCardNo())) {
            builderNewBuilder.setWalletCardNo(nfcCardDetail.getCardNo());
        }
        builderNewBuilder.setWalletCardType(Integer.valueOf(str).intValue());
        builderNewBuilder.setWalletCardDefault(nfcCardDetail.isDefault() ? 1 : 0);
        builderNewBuilder.setCardAmount(nfcCardDetail.getBalance());
        M(12, 5, builderNewBuilder.build().toByteArray());
    }

    public void u() {
        this.b.lock();
        try {
            this.f18981c.signal();
        } finally {
            this.b.unlock();
        }
    }

    public void v(int i, String str) {
        this.b.lock();
        try {
            try {
                ChannelManger$WalletEventMessage.Builder builderNewBuilder = ChannelManger$WalletEventMessage.newBuilder();
                builderNewBuilder.setWalletEvent(i);
                if (!TextUtils.isEmpty(str)) {
                    builderNewBuilder.setWalletAid(str);
                }
                M(12, 11, builderNewBuilder.build().toByteArray());
                this.d.await(15L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        } finally {
            this.b.unlock();
        }
    }

    public void w() {
        this.b.lock();
        try {
            this.d.signal();
        } finally {
            this.b.unlock();
        }
    }

    public final void x(MessageEvent messageEvent) {
        SwipeSetting$CardsSwipeTime swipeSetting$CardsSwipeTimeBuild;
        try {
            try {
                swipeSetting$CardsSwipeTimeBuild = SwipeSetting$CardsSwipeTime.parseFrom(messageEvent.getData());
                if (swipeSetting$CardsSwipeTimeBuild == null) {
                    swipeSetting$CardsSwipeTimeBuild = SwipeSetting$CardsSwipeTime.newBuilder().build();
                }
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", "onGeCardsSwipeTime e = " + e2.getMessage());
            }
            this.m.a(swipeSetting$CardsSwipeTimeBuild);
        } catch (Throwable th) {
            this.m.a(SwipeSetting$CardsSwipeTime.newBuilder().build());
            throw th;
        }
    }

    public final void y(MessageEvent messageEvent) {
        try {
            try {
                this.m.a(CapOperation$CardUidInfo.parseFrom(messageEvent.getData()));
            } catch (Exception e2) {
                t6b.d("NFCTransmitManger", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
                this.m.a(null);
            }
        } catch (Throwable th) {
            this.m.a(null);
            throw th;
        }
    }

    public final void z(MessageEvent messageEvent) {
        String str = "";
        try {
            String aid = SwipeSetting$DefaultSwipeCard.parseFrom(messageEvent.getData()).getAid();
            if (aid != null) {
                str = aid;
            }
        } catch (Exception e2) {
            t6b.d("NFCTransmitManger", "onGetDefaultSwipeCard e = " + e2.getMessage());
        } finally {
            this.m.a("");
        }
    }
}
