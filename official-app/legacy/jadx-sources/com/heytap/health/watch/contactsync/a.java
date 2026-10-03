package com.heytap.health.watch.contactsync;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.BlockedNumberContract;
import android.provider.ContactsContract;
import android.util.ArraySet;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.a54;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b34;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.d34;
import com.oplus.aiunit.vision.e9g;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.u64;
import com.oplus.aiunit.vision.v0j;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.x64;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010'\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u001f\u0010&R$\u0010)\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b(\u0010%\"\u0004\b\"\u0010&R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/heytap/health/watch/contactsync/a;", "Lcom/oplus/aiunit/vision/wl4$b;", "", "i", "", "handle", LogFieldKey.MESSAGE_KEY, "j", "model", b2n.g, "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "Lcom/oplus/aiunit/vision/ra5;", "getInterestingStatus", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "onNodeStatusChanged", "", "nodeId", "", "c", b2n.f, "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "changeCount", "snapCount", "Landroid/os/Handler;", MapSchema.FIELD_NAME_KEY, "Landroid/os/Handler;", "mHandler", LogFieldKey.LEVEL_KEY, "Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "connectedMacAddress", "f", "preSyncDoneMacAddress", "Landroid/database/ContentObserver;", "n", "Landroid/database/ContentObserver;", "mContactsChangeObserver", "o", "mBlockedChangeObserver", "Lcom/heytap/health/watch/contactsync/a$a;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/watch/contactsync/a$a;", "mSwitchTimeoutRunnable", "Lcom/oplus/aiunit/vision/b34;", "d", "()Lcom/oplus/aiunit/vision/b34;", "ability", "<init>", "()V", "a", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a implements wl4.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String connectedMacAddress;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public static String preSyncDoneMacAddress;

    @NotNull
    public static final a INSTANCE = new a();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Integer> changeCount = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Integer> snapCount = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final Handler mHandler = new d(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ContentObserver mContactsChangeObserver = new c();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final ContentObserver mBlockedChangeObserver = new b();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static final RunnableC0692a mSwitchTimeoutRunnable = new RunnableC0692a();

    /* JADX INFO: renamed from: com.heytap.health.watch.contactsync.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/watch/contactsync/a$a;", "Ljava/lang/Runnable;", "", "model", "", "a", "run", "i", "I", "getMSwitchModel", "()I", "setMSwitchModel", "(I)V", "mSwitchModel", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class RunnableC0692a implements Runnable {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int mSwitchModel;

        public final void a(int model) {
            this.mSwitchModel = model;
        }

        @Override // java.lang.Runnable
        public void run() {
            ContactSyncOnceApi.INSTANCE.n(this.mSwitchModel);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/watch/contactsync/a$b", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "onChange", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ContentObserver {
        public b() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            ContactSyncOnceApi.INSTANCE.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/watch/contactsync/a$c", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "onChange", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ContentObserver {
        public c() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            super.onChange(selfChange, uri);
            String strQ = gl4.managerApi.q(ra5.a.INSTANCE);
            if (strQ.length() > 0) {
                ConcurrentHashMap concurrentHashMap = a.changeCount;
                Integer num = (Integer) a.changeCount.get(strQ);
                if (num == null) {
                    num = 0;
                }
                concurrentHashMap.put(strQ, Integer.valueOf(num.intValue() + 1));
                u64.d("ContactSyncManager", "onChange " + v0j.b(strQ) + HttpUtils.EQUAL_SIGN + a.changeCount.get(strQ), new Object[0]);
            }
            if (a.mHandler.hasMessages(5000)) {
                a.mHandler.removeMessages(5000);
            }
            a.mHandler.sendEmptyMessageDelayed(5000, 5000L);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watch/contactsync/a$d", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 5000) {
                u64.d("ContactSyncManager", "contact change done, start to sync", new Object[0]);
                ContactSyncOnceApi.INSTANCE.i();
            }
            super.handleMessage(msg);
        }
    }

    public final boolean c(String nodeId) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = changeCount;
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = snapCount;
        a7b.f("ContactSyncManager", "checkSnap(), nodeId = " + nodeId + " ,changeCount = " + concurrentHashMap + " ,snapCount = " + concurrentHashMap2);
        Integer num = concurrentHashMap.get(nodeId);
        boolean zG = false;
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue();
        Integer num2 = concurrentHashMap2.get(nodeId);
        if (num2 == null) {
            num2 = 0;
        }
        boolean z = iIntValue > num2.intValue();
        boolean z2 = concurrentHashMap.get(nodeId) == null && concurrentHashMap2.get(nodeId) == null;
        if (!z) {
            if (d().U5()) {
                zG = g(nodeId);
                a7b.f("ContactSyncManager", "checkSnap supportActive 24h: " + zG);
            } else if (z2) {
                a7b.f("ContactSyncManager", "checkSnap=true, non-support first init for node in process");
            }
            concurrentHashMap.put(nodeId, 0);
            concurrentHashMap2.put(nodeId, 0);
            a7b.f("ContactSyncManager", "checkSnap->result = " + zG);
            return zG;
        }
        a7b.f("ContactSyncManager", "checkSnap=true, change>snap");
        zG = true;
        concurrentHashMap.put(nodeId, 0);
        concurrentHashMap2.put(nodeId, 0);
        a7b.f("ContactSyncManager", "checkSnap->result = " + zG);
        return zG;
    }

    public final b34 d() {
        return d34.a(gl4.managerApi.getCurrentConnectId());
    }

    @Nullable
    public final String e() {
        return connectedMacAddress;
    }

    @Nullable
    public final String f() {
        return preSyncDoneMacAddress;
    }

    public final boolean g(String nodeId) {
        long jA = e9g.a(nodeId);
        long jCurrentTimeMillis = System.currentTimeMillis() - jA;
        u64.d("ContactSyncManager", "last_sync_time = " + jA + ",intervalTime = " + jCurrentTimeMillis, new Object[0]);
        return ((long) 86400000) < jCurrentTimeMillis;
    }

    @Override // com.oplus.aiunit.vision.wl4.b
    @NotNull
    public ra5 getInterestingStatus(@NotNull ArraySet<auc> interests) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        interests.add(auc.a.INSTANCE);
        interests.add(auc.f.INSTANCE);
        interests.add(auc.d.INSTANCE);
        interests.add(auc.e.INSTANCE);
        return ra5.a.INSTANCE;
    }

    public final void h(int model) {
        Handler handler = mHandler;
        RunnableC0692a runnableC0692a = mSwitchTimeoutRunnable;
        handler.removeCallbacks(runnableC0692a);
        runnableC0692a.a(model);
        handler.postDelayed(runnableC0692a, 30000L);
    }

    public final void i() {
        u64.d("ContactSyncManager", "registerContentObserver()", new Object[0]);
        m(14);
        ContentResolver contentResolver = b78.a().getContentResolver();
        b34 b34VarD = d();
        if (b34VarD.K1()) {
            contentResolver.registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, mContactsChangeObserver);
        } else {
            u64.d("ContactSyncManager", "registerContentObserver failed , unSupport contact sync or no permission", new Object[0]);
        }
        if (!b34VarD.l8() || !x64.a()) {
            u64.d("ContactSyncManager", "registerContentObserver failed , unSupport block num sync or no ColorOs7", new Object[0]);
            return;
        }
        try {
            contentResolver.registerContentObserver(BlockedNumberContract.BlockedNumbers.CONTENT_URI, true, mBlockedChangeObserver);
        } catch (Exception e2) {
            u64.d("ContactSyncManager", "registerContentObserver block num failed: ", e2.getMessage());
        }
    }

    public final void j() {
        mHandler.removeCallbacks(mSwitchTimeoutRunnable);
    }

    public final void k(@Nullable String str) {
        connectedMacAddress = str;
    }

    public final void l(@Nullable String str) {
        preSyncDoneMacAddress = str;
    }

    public final void m(int handle) {
        u64.d("ContactSyncManager", "unRegisterContentObserver()", new Object[0]);
        ContentResolver contentResolver = b78.a().getContentResolver();
        if (a54.c(handle)) {
            contentResolver.unregisterContentObserver(mContactsChangeObserver);
        }
        if (a54.a(handle)) {
            contentResolver.unregisterContentObserver(mBlockedChangeObserver);
        }
    }

    @Override // com.oplus.aiunit.vision.wl4.b
    public void onNodeStatusChanged(@NotNull ra5.c role, @NotNull Node node, @NotNull auc nodeStatus) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
        u64.d("ContactSyncManager", "onNodeStatusChanged, " + v0j.b(node.getNodeId()) + ", " + nodeStatus, new Object[0]);
        if (nodeStatus == auc.a.INSTANCE) {
            String nodeId = node.getNodeId();
            Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
            ContactSyncOnceApi.INSTANCE.e(node, c(nodeId));
            return;
        }
        if (nodeStatus != auc.f.INSTANCE) {
            if (nodeStatus == auc.d.INSTANCE) {
                ContactSyncOnceApi.INSTANCE.j(node);
                return;
            } else {
                if (nodeStatus == auc.e.INSTANCE) {
                    ContactSyncOnceApi.INSTANCE.l(node);
                    return;
                }
                return;
            }
        }
        Integer num = changeCount.get(node.getNodeId());
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue();
        snapCount.put(node.getNodeId(), Integer.valueOf(iIntValue));
        u64.d("ContactSyncManager", "NodeStatus.NodeDis, " + v0j.b(node.getNodeId()) + HttpUtils.EQUAL_SIGN + iIntValue, new Object[0]);
        ContactSyncOnceApi.INSTANCE.m(node);
    }
}
