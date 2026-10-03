package com.heytap.health.watch.contactsync;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.watch.contactsync.ContactSyncOnceApi;
import com.heytap.health.watch.contactsync.aidl.IContactSyncListener;
import com.heytap.health.watch.contactsync.aidl.IContactSyncOnce;
import com.heytap.health.watch.contactsync.db.ContactSyncDatabase;
import com.heytap.health.watch.contactsync.presenter.IPresenter;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.wearable.dialer.proto.ContactSyncProto;
import com.oplus.aiunit.vision.a54;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b34;
import com.oplus.aiunit.vision.bl4;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.d34;
import com.oplus.aiunit.vision.e54;
import com.oplus.aiunit.vision.e9g;
import com.oplus.aiunit.vision.f34;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.qfj;
import com.oplus.aiunit.vision.sl4;
import com.oplus.aiunit.vision.u64;
import com.oplus.aiunit.vision.ur6;
import com.oplus.aiunit.vision.vse;
import com.oplus.aiunit.vision.y54;
import com.oplus.aiunit.vision.z44;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\bJ\u0010KJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J(\u0010!\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\u0007H\u0002J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0005H\u0002J\u001e\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070'H\u0002J \u0010+\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0002J\b\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0007H\u0002J\u0018\u0010/\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0010H\u0002R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010!R\u0016\u0010C\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010!R\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006N"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncOnceApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncOnce;", "", "R", "", "syncReason", "", "C", c8l.KEY_B, UserInfo.SEX_FEMALE, SecureGcmConstants.MESSAGE_KEY, "Landroid/content/Context;", "context", "c", "b", "", "mac", "a0", EngineConstant.REASON, "H", "J", "status", "I", "macAddress", "G", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/oplus/aiunit/vision/b34;", "L", "N", "O", "handle", "firstPair", "Z", "c0", "Q", "model", "Y", "tag", "Lkotlin/Function0;", "code", ExifInterface.LONGITUDE_EAST, "countChange", "D", "X", "K", "action", ExifInterface.LONGITUDE_WEST, "Lio/reactivex/rxjava3/disposables/a;", "i", "Lio/reactivex/rxjava3/disposables/a;", "mSortDisposable", "Lcom/oplus/aiunit/vision/ur6;", "j", "Lcom/oplus/aiunit/vision/ur6;", "eventDispatcher", "Landroidx/lifecycle/LiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/LiveData;", "mObserveContactSyncStatus", "Landroidx/lifecycle/Observer;", LogFieldKey.LEVEL_KEY, "Landroidx/lifecycle/Observer;", "mSyncDoneObserver", LogFieldKey.MESSAGE_KEY, "mIsSyncing", "n", "mDelaySync", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncOnce$Stub;", "o", "Lkotlin/Lazy;", "M", "()Lcom/heytap/health/watch/contactsync/aidl/IContactSyncOnce$Stub;", "binder", "<init>", "()V", "Companion", "a", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ContactSyncOnceApi implements cm9<IContactSyncOnce> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "ContactSyncOnceApi";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public io.reactivex.rxjava3.disposables.a mSortDisposable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public LiveData<Boolean> mObserveContactSyncStatus;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Observer<Boolean> mSyncDoneObserver;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean mIsSyncing;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean mDelaySync;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ur6 eventDispatcher = new ur6();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy binder = LazyKt__LazyJVMKt.lazy(new Function0<ContactSyncOnceApi$binder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2

        /* JADX INFO: renamed from: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¨\u0006 "}, d2 = {"com/heytap/health/watch/contactsync/ContactSyncOnceApi$binder$2$1", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncOnce$Stub;", "onBlockedNumChange", "", "onBondConnected", l9d.BUNDLE_KEY_NODE, "Lcom/oplus/wearable/linkservice/sdk/Node;", "needSync", "", "onContactSyncAction", "mac", "", "action", "", "syncMode", "onContactsChange", "onContactsSyncDone", "isSuccess", "onDeviceMigrate", "onMessageReceived", "messageEvent", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "onNodeConnected", "onPeerDisconnected", "onSwitchTimeout", "model", "registerContactSyncListener", "listener", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncListener;", "registerContactsSyncDone", "sendContactsSortMessage", "unregisterContactSyncListener", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends IContactSyncOnce.Stub {
            final /* synthetic */ ContactSyncOnceApi this$0;

            public AnonymousClass1(ContactSyncOnceApi contactSyncOnceApi) {
                this.this$0 = contactSyncOnceApi;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void registerContactsSyncDone$lambda$1(final ContactSyncOnceApi this$0, final AnonymousClass1 this$1) {
                LiveData liveData;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                u64.d(ContactSyncOnceApi.TAG, "registerContactsSyncDone: ", new Object[0]);
                f34 f34VarF = ContactSyncDatabase.g().f();
                Observer observer = this$0.mSyncDoneObserver;
                if (observer != null && (liveData = this$0.mObserveContactSyncStatus) != null) {
                    liveData.removeObserver(observer);
                }
                this$0.mObserveContactSyncStatus = f34VarF.d(this$0.N());
                this$0.mSyncDoneObserver = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: IPUT 
                      (wrap androidx.lifecycle.Observer<java.lang.Boolean>:0x003a: CONSTRUCTOR 
                      (r3v0 'this$0' com.heytap.health.watch.contactsync.ContactSyncOnceApi A[DONT_INLINE])
                      (r4v0 'this$1' com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1 A[DONT_INLINE])
                     A[MD:(com.heytap.health.watch.contactsync.ContactSyncOnceApi, com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1):void (m), WRAPPED] call: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1$registerContactsSyncDone$1$2.<init>(com.heytap.health.watch.contactsync.ContactSyncOnceApi, com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1):void type: CONSTRUCTOR)
                      (r3v0 'this$0' com.heytap.health.watch.contactsync.ContactSyncOnceApi)
                     A[MD:(com.heytap.health.watch.contactsync.ContactSyncOnceApi, androidx.lifecycle.Observer):void (m)] com.heytap.health.watch.contactsync.ContactSyncOnceApi.l androidx.lifecycle.Observer in method: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2.1.registerContactsSyncDone$lambda$1(com.heytap.health.watch.contactsync.ContactSyncOnceApi, com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1):void, file: classes19.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1$registerContactsSyncDone$1$2, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:487)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 15 more
                    */
                /*
                    java.lang.String r0 = "this$0"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r0 = "this$1"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.String r1 = "ContactSyncOnceApi"
                    java.lang.String r2 = "registerContactsSyncDone: "
                    com.oplus.aiunit.vision.u64.d(r1, r2, r0)
                    com.heytap.health.watch.contactsync.db.ContactSyncDatabase r0 = com.heytap.health.watch.contactsync.db.ContactSyncDatabase.g()
                    com.oplus.aiunit.vision.f34 r0 = r0.f()
                    androidx.lifecycle.Observer r1 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.q(r3)
                    if (r1 == 0) goto L2d
                    androidx.lifecycle.LiveData r2 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.p(r3)
                    if (r2 == 0) goto L2d
                    r2.removeObserver(r1)
                L2d:
                    java.lang.String r1 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.l(r3)
                    androidx.lifecycle.LiveData r0 = r0.d(r1)
                    com.heytap.health.watch.contactsync.ContactSyncOnceApi.x(r3, r0)
                    com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1$registerContactsSyncDone$1$2 r0 = new com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1$registerContactsSyncDone$1$2
                    r0.<init>(r3, r4)
                    com.heytap.health.watch.contactsync.ContactSyncOnceApi.z(r3, r0)
                    com.heytap.health.watch.contactsync.ContactSyncTransportApi$a r4 = com.heytap.health.watch.contactsync.ContactSyncTransportApi.INSTANCE
                    java.lang.String r0 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.l(r3)
                    r4.j(r0)
                    androidx.lifecycle.LiveData r4 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.p(r3)
                    p010kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                    androidx.lifecycle.Observer r3 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.q(r3)
                    p010kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                    r4.observeForever(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2.AnonymousClass1.registerContactsSyncDone$lambda$1(com.heytap.health.watch.contactsync.ContactSyncOnceApi, com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1):void");
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onBlockedNumChange() {
                this.this$0.F(2);
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onBondConnected(@NotNull Node node, boolean needSync) {
                Intrinsics.checkNotNullParameter(node, "node");
                u64.a(ContactSyncOnceApi.TAG, "onBondConnected: " + this.this$0.N(), new Object[0]);
                b34 b34VarL = this.this$0.L();
                if (b34VarL.K1() || b34VarL.l8()) {
                    ContactSyncTransportApi.Companion companion = ContactSyncTransportApi.INSTANCE;
                    companion.i(node.getNodeId());
                    boolean zR = this.this$0.R();
                    if (zR) {
                        y54 y54Var = y54.INSTANCE;
                        y54Var.k(y54Var.f() + ";" + this.this$0.N());
                    }
                    u64.d(ContactSyncOnceApi.TAG, "onBondConnected syncMode = " + y54.INSTANCE.e(this.this$0.N()) + ", firstPair=" + zR + ", needSync=" + needSync, new Object[0]);
                    this.this$0.Q();
                    companion.g();
                    ContactSyncOnceApi contactSyncOnceApi = this.this$0;
                    contactSyncOnceApi.D(contactSyncOnceApi.N(), zR, needSync);
                }
                u64.a(ContactSyncOnceApi.TAG, "onConnect isSupportContactSync = " + b34VarL.K1() + " isSupportBlockNumSync = " + b34VarL.l8(), new Object[0]);
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onContactSyncAction(@NotNull String mac, int action, int syncMode) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                u64.d(ContactSyncOnceApi.TAG, "onContactSyncAction() called with action = [" + action + "]", new Object[0]);
                switch (action) {
                    case 1:
                        ContactSyncTransportApi.INSTANCE.g();
                        this.this$0.C(6);
                        break;
                    case 3:
                        ContactSyncTransportApi.INSTANCE.g();
                        this.this$0.C(1);
                        break;
                    case 4:
                        this.this$0.B(1);
                        break;
                    case 5:
                        this.this$0.F(1);
                        break;
                    case 6:
                        if (!TextUtils.isEmpty(mac)) {
                            this.this$0.G(mac);
                            e54.INSTANCE.a(new qfj(mac, z44.ACTION_CLEAR_DEVICE_DATA, 0, 14));
                        }
                        break;
                    case 7:
                        this.this$0.C(8);
                        break;
                    case 8:
                        this.this$0.X();
                        break;
                    case 9:
                        this.this$0.Y(syncMode);
                        break;
                    case 10:
                        ContactSyncTransportApi.INSTANCE.k(14);
                        this.this$0.Y(syncMode);
                        break;
                    case 11:
                        if (!TextUtils.isEmpty(mac)) {
                            this.this$0.a0(mac);
                        } else {
                            this.this$0.H(" mac is null");
                        }
                        break;
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onContactsChange() {
                if (!PermissionRequestDialog.D(9, "android.permission.READ_CONTACTS")) {
                    u64.c(ContactSyncOnceApi.TAG, "contact change ignore due to permission denied ", new Object[0]);
                    return;
                }
                if (this.this$0.mIsSyncing) {
                    this.this$0.mDelaySync = true;
                    u64.d(ContactSyncOnceApi.TAG, "onContactsChange delay sync", new Object[0]);
                } else {
                    this.this$0.mDelaySync = false;
                    this.this$0.C(2);
                    this.this$0.eventDispatcher.b();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onContactsSyncDone(boolean isSuccess) {
                y54.INSTANCE.j(this.this$0.N(), 1);
                this.this$0.I(isSuccess);
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onDeviceMigrate(@NotNull Node node) {
                Intrinsics.checkNotNullParameter(node, "node");
                ContactSyncOnceApi contactSyncOnceApi = this.this$0;
                String nodeId = node.getNodeId();
                Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
                contactSyncOnceApi.G(nodeId);
                e54 e54Var = e54.INSTANCE;
                String nodeId2 = node.getNodeId();
                Intrinsics.checkNotNullExpressionValue(nodeId2, "node.nodeId");
                e54Var.a(new qfj(nodeId2, z44.ACTION_CLEAR_DEVICE_DATA, 0, 14));
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onMessageReceived(@NotNull MessageEvent messageEvent) {
                int i;
                Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
                u64.d(ContactSyncOnceApi.TAG, "onMessageReceived, messageEvent = " + messageEvent, new Object[0]);
                int commandId = messageEvent.getCommandId();
                if (commandId == 4) {
                    try {
                        ContactSyncProto.ContactSyncCheck from = ContactSyncProto.ContactSyncCheck.parseFrom(messageEvent.getData());
                        ContactSyncTransportApi.INSTANCE.g();
                        if (ContactSyncProto.ContactSyncCheckType.CHECK_TYPE_CONTACT == from.getCheckType()) {
                            this.this$0.C(4);
                        } else if (ContactSyncProto.ContactSyncCheckType.CHECK_TYPE_CALL_LOG == from.getCheckType()) {
                            this.this$0.B(4);
                        } else if (ContactSyncProto.ContactSyncCheckType.CHECK_TYPE_BLOCK_NUM == from.getCheckType()) {
                            this.this$0.F(4);
                        }
                        return;
                    } catch (InvalidProtocolBufferException e2) {
                        u64.c(ContactSyncOnceApi.TAG, "onMessageReceived : " + e2.getMessage(), new Object[0]);
                        return;
                    }
                }
                if (commandId == 5) {
                    IPresenter<?, ?, ?> iPresenterC = vse.c(this.this$0.N());
                    byte[] data = messageEvent.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "messageEvent.data");
                    iPresenterC.I(data);
                    return;
                }
                if (commandId == 6) {
                    IPresenter<?, ?, ?> iPresenterB = vse.b(this.this$0.N());
                    byte[] data2 = messageEvent.getData();
                    Intrinsics.checkNotNullExpressionValue(data2, "messageEvent.data");
                    iPresenterB.I(data2);
                    return;
                }
                if (commandId == 7) {
                    IPresenter<?, ?, ?> iPresenterA = vse.a(this.this$0.N());
                    byte[] data3 = messageEvent.getData();
                    Intrinsics.checkNotNullExpressionValue(data3, "messageEvent.data");
                    iPresenterA.I(data3);
                    return;
                }
                if (commandId == 10) {
                    try {
                        ContactSyncTransportApi.Companion companion = ContactSyncTransportApi.INSTANCE;
                        companion.h();
                        ContactSyncProto.SwitchStatus from2 = ContactSyncProto.SwitchStatus.parseFrom(messageEvent.getData());
                        Intrinsics.checkNotNullExpressionValue(from2, "parseFrom(messageEvent.data)");
                        boolean z = from2.getCode() == 1;
                        int status = from2.getStatus();
                        u64.d(ContactSyncOnceApi.TAG, "switch model status, success:" + z + ", syncModel:" + status, new Object[0]);
                        if (!z) {
                            y54.INSTANCE.j(this.this$0.N(), status);
                        } else if (status == 1) {
                            companion.g();
                            y54.INSTANCE.j(this.this$0.N(), 3);
                            this.this$0.C(11);
                        } else if (status == 2) {
                            y54.INSTANCE.j(this.this$0.N(), status);
                            e54.INSTANCE.a(new qfj(this.this$0.N(), z44.ACTION_CLEAR_DEVICE_DATA, 0, 2));
                            companion.k(2);
                        }
                        this.this$0.eventDispatcher.e(z);
                        return;
                    } catch (InvalidProtocolBufferException e3) {
                        u64.c(ContactSyncOnceApi.TAG, "onMessageReceived : " + e3.getMessage(), new Object[0]);
                        return;
                    }
                }
                if (commandId != 11) {
                    return;
                }
                try {
                    int status2 = ContactSyncProto.WatchStatus.parseFrom(messageEvent.getData()).getStatus();
                    y54 y54Var = y54.INSTANCE;
                    int iE = y54Var.e(this.this$0.N());
                    u64.d(ContactSyncOnceApi.TAG, "get watch sync model: " + status2 + ", preMode: " + iE, new Object[0]);
                    boolean z2 = iE == 4;
                    boolean z3 = iE == 0;
                    if (status2 == 1) {
                        u64.d(ContactSyncOnceApi.TAG, "change local model:3", new Object[0]);
                        if (z2) {
                            i = 9;
                        } else {
                            i = z3 ? 12 : -1;
                        }
                        if (i != -1) {
                            y54Var.j(this.this$0.N(), 3);
                            this.this$0.C(i);
                        } else {
                            y54Var.j(this.this$0.N(), 1);
                        }
                    } else {
                        y54Var.j(this.this$0.N(), status2);
                        e54.INSTANCE.a(new qfj(this.this$0.N(), z44.ACTION_CLEAR_DEVICE_DATA, 0, 2));
                        ContactSyncTransportApi.INSTANCE.k(14);
                    }
                    this.this$0.eventDispatcher.f();
                } catch (InvalidProtocolBufferException e4) {
                    u64.c(ContactSyncOnceApi.TAG, "onMessageReceived : " + e4.getMessage(), new Object[0]);
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onNodeConnected(@NotNull Node node) {
                Intrinsics.checkNotNullParameter(node, "node");
                b34 b34VarL = this.this$0.L();
                if (b34VarL.K1() || b34VarL.l8()) {
                    ContactSyncTransportApi.INSTANCE.i(node.getNodeId());
                    u64.a(ContactSyncOnceApi.TAG, "NodeConn: " + node.getNodeId(), new Object[0]);
                }
                if (this.this$0.R()) {
                    this.this$0.V();
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onPeerDisconnected(@NotNull Node node) {
                Intrinsics.checkNotNullParameter(node, "node");
                u64.d(ContactSyncOnceApi.TAG, "onDisconnect: " + gdb.a(node.getNodeId()), new Object[0]);
                ContactSyncTransportApi.Companion companion = ContactSyncTransportApi.INSTANCE;
                companion.i(null);
                this.this$0.K();
                companion.h();
                companion.k(14);
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void onSwitchTimeout(int model) {
                int i = 2;
                if (model != 1) {
                    i = model != 2 ? 0 : 1;
                }
                if (i != 0) {
                    y54.INSTANCE.j(this.this$0.N(), i);
                }
                u64.d(ContactSyncOnceApi.TAG, "timeOut--->rollbackModel:" + i + "    mSwitchModel:" + model, new Object[0]);
                this.this$0.eventDispatcher.e(false);
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void registerContactSyncListener(@NotNull IContactSyncListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                this.this$0.eventDispatcher.a(listener);
                if (this.this$0.mIsSyncing) {
                    this.this$0.J("already in sync");
                }
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
            public void registerContactsSyncDone() {
                u64.d(ContactSyncOnceApi.TAG, "registerContactSyncDone: curMac: " + gdb.a(this.this$0.N()) + ", preMac: " + gdb.a(this.this$0.O()), new Object[0]);
                if (this.this$0.mObserveContactSyncStatus == null || !Intrinsics.areEqual(this.this$0.N(), this.this$0.O())) {
                    final ContactSyncOnceApi contactSyncOnceApi = this.this$0;
                    ThreadUtils.doInUiThread(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0056: INVOKE 
                          (wrap java.lang.Runnable:0x0053: CONSTRUCTOR 
                          (r0v7 'contactSyncOnceApi' com.heytap.health.watch.contactsync.ContactSyncOnceApi A[DONT_INLINE])
                          (r4v0 'this' com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1 A[DONT_INLINE, IMMUTABLE_TYPE, THIS])
                         A[MD:(com.heytap.health.watch.contactsync.ContactSyncOnceApi, com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1):void (m), WRAPPED] call: com.oplus.aiunit.vision.h54.<init>(com.heytap.health.watch.contactsync.ContactSyncOnceApi, com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2$1):void type: CONSTRUCTOR)
                         STATIC call: com.heytap.health.base.task.ThreadUtils.doInUiThread(java.lang.Runnable):java.lang.Object A[MD:(java.lang.Runnable):java.lang.Object (m)] in method: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2.1.registerContactsSyncDone():void, file: classes19.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.h54, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 23 more
                        */
                    /*
                        this = this;
                        com.heytap.health.watch.contactsync.ContactSyncOnceApi r0 = r4.this$0
                        java.lang.String r0 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.l(r0)
                        java.lang.String r0 = com.oplus.aiunit.vision.gdb.a(r0)
                        com.heytap.health.watch.contactsync.ContactSyncOnceApi r1 = r4.this$0
                        java.lang.String r1 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.r(r1)
                        java.lang.String r1 = com.oplus.aiunit.vision.gdb.a(r1)
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = "registerContactSyncDone: curMac: "
                        r2.append(r3)
                        r2.append(r0)
                        java.lang.String r0 = ", preMac: "
                        r2.append(r0)
                        r2.append(r1)
                        java.lang.String r0 = r2.toString()
                        r1 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        java.lang.String r2 = "ContactSyncOnceApi"
                        com.oplus.aiunit.vision.u64.d(r2, r0, r1)
                        com.heytap.health.watch.contactsync.ContactSyncOnceApi r0 = r4.this$0
                        androidx.lifecycle.LiveData r0 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.p(r0)
                        if (r0 == 0) goto L4f
                        com.heytap.health.watch.contactsync.ContactSyncOnceApi r0 = r4.this$0
                        java.lang.String r0 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.l(r0)
                        com.heytap.health.watch.contactsync.ContactSyncOnceApi r1 = r4.this$0
                        java.lang.String r1 = com.heytap.health.watch.contactsync.ContactSyncOnceApi.r(r1)
                        boolean r0 = p010kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                        if (r0 != 0) goto L59
                    L4f:
                        com.heytap.health.watch.contactsync.ContactSyncOnceApi r0 = r4.this$0
                        com.oplus.aiunit.vision.h54 r1 = new com.oplus.aiunit.vision.h54
                        r1.<init>(r0, r4)
                        com.heytap.health.base.task.ThreadUtils.doInUiThread(r1)
                    L59:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watch.contactsync.ContactSyncOnceApi$binder$2.AnonymousClass1.registerContactsSyncDone():void");
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
                public void sendContactsSortMessage() {
                    this.this$0.X();
                }

                @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncOnce
                public void unregisterContactSyncListener(@NotNull IContactSyncListener listener) {
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    this.this$0.eventDispatcher.g(listener);
                }
            }

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AnonymousClass1 invoke() {
                return new AnonymousClass1(this.this$0);
            }
        });

        /* JADX INFO: renamed from: com.heytap.health.watch.contactsync.ContactSyncOnceApi$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J$\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0007J\b\u0010\u0018\u001a\u00020\u0006H\u0007J\b\u0010\u0019\u001a\u00020\u0006H\u0007J\b\u0010\u001a\u001a\u00020\u0006H\u0007J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\b\u0010\u001f\u001a\u00020\u0006H\u0007R\u0014\u0010 \u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncOnceApi$a;", "", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncOnce;", "b", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", MapSchema.FIELD_NAME_KEY, "", "action", "", "mac", "syncMode", b2n.f, "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "needSync", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "j", LogFieldKey.LEVEL_KEY, "model", "n", "i", "d", "q", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncListener;", "listener", "o", "r", LogFieldKey.PROCESS_NAME_KEY, "TAG", "Ljava/lang/String;", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nContactSyncOnceApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSyncOnceApi.kt\ncom/heytap/health/watch/contactsync/ContactSyncOnceApi$Companion\n*L\n1#1,927:1\n86#1,6:928\n86#1,6:934\n86#1,6:940\n86#1,6:946\n86#1,6:952\n86#1,6:958\n86#1,6:964\n86#1,6:970\n86#1,6:976\n86#1,6:982\n86#1,6:988\n86#1,6:994\n86#1,6:1000\n*S KotlinDebug\n*F\n+ 1 ContactSyncOnceApi.kt\ncom/heytap/health/watch/contactsync/ContactSyncOnceApi$Companion\n*L\n108#1:928,6\n116#1:934,6\n120#1:940,6\n124#1:946,6\n128#1:952,6\n132#1:958,6\n136#1:964,6\n139#1:970,6\n142#1:976,6\n146#1:982,6\n150#1:988,6\n154#1:994,6\n158#1:1000,6\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final IContactSyncOnce c(IBinder iBinder) {
                return IContactSyncOnce.Stub.asInterface(iBinder);
            }

            public static /* synthetic */ void h(Companion companion, int i, String str, int i2, int i3, Object obj) {
                if ((i3 & 2) != 0) {
                    str = "";
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                companion.g(i, str, i2);
            }

            @JvmStatic
            @Nullable
            public final IContactSyncOnce b() {
                IContactSyncOnce iContactSyncOnce = (IContactSyncOnce) ClientManager.getInstance().getBuildService("api_provider_contact_sync_once", new ClientManager.a() { // from class: com.oplus.aiunit.vision.g54
                    @Override // com.oplus.health.apiprovider.ClientManager.a
                    public final Object a(IBinder iBinder) {
                        return ContactSyncOnceApi.Companion.c(iBinder);
                    }
                });
                if (iContactSyncOnce == null) {
                    return null;
                }
                if (!iContactSyncOnce.asBinder().isBinderAlive()) {
                    u64.c(ContactSyncOnceApi.TAG, "getApi isBinderAlive: false", new Object[0]);
                    iContactSyncOnce = null;
                }
                return iContactSyncOnce;
            }

            @JvmStatic
            public final void d() {
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onBlockedNumChange();
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void e(@NotNull Node node, boolean needSync) {
                Intrinsics.checkNotNullParameter(node, "node");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onBondConnected(node, needSync);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            @JvmOverloads
            public final void f(int i) {
                h(this, i, null, 0, 6, null);
            }

            @JvmStatic
            @JvmOverloads
            public final void g(int action, @NotNull String mac, int syncMode) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onContactSyncAction(mac, action, syncMode);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void i() {
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onContactsChange();
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void j(@NotNull Node node) {
                Intrinsics.checkNotNullParameter(node, "node");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onDeviceMigrate(node);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void k(@NotNull MessageEvent messageEvent) {
                Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onMessageReceived(messageEvent);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void l(@NotNull Node node) {
                Intrinsics.checkNotNullParameter(node, "node");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onNodeConnected(node);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void m(@NotNull Node node) {
                Intrinsics.checkNotNullParameter(node, "node");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onPeerDisconnected(node);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void n(int model) {
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.onSwitchTimeout(model);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void o(@NotNull IContactSyncListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.registerContactSyncListener(listener);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void p() {
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.registerContactsSyncDone();
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void q() {
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.sendContactsSortMessage();
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }

            @JvmStatic
            public final void r(@NotNull IContactSyncListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                try {
                    IContactSyncOnce iContactSyncOnceB = ContactSyncOnceApi.INSTANCE.b();
                    if (iContactSyncOnceB != null) {
                        iContactSyncOnceB.unregisterContactSyncListener(listener);
                    }
                } catch (Exception e2) {
                    u64.c(ContactSyncOnceApi.TAG, "remoteCallWithNoException " + e2.getMessage(), new Object[0]);
                }
            }
        }

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/heytap/health/watch/contactsync/ContactSyncOnceApi$b", "Lcom/oplus/aiunit/vision/sl4;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "Lcom/heytap/health/devicemanager/client/call/DMCallException;", "throwable", "b", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class b implements sl4 {
            public b() {
            }

            @Override // com.oplus.aiunit.vision.sl4
            public void a(@NotNull String mac, @NotNull MessageEvent response) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (ContactSyncProto.ContactCleanResponse.parseFrom(response.getData()).getResult() == 1) {
                        u64.d(ContactSyncOnceApi.TAG, "trySendClearContact onSuccess clear success", new Object[0]);
                        vse.c(mac).l();
                        vse.c(mac).G(13);
                    } else {
                        ContactSyncOnceApi.this.H("trySendClearContact onSuccess result != 1");
                    }
                } catch (Exception e2) {
                    ContactSyncOnceApi.this.H("trySendClearContact onSuccess error " + e2.getMessage());
                }
            }

            @Override // com.oplus.aiunit.vision.sl4
            public void b(@NotNull DMCallException throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                ContactSyncOnceApi.this.H("trySendClearContact onError " + throwable.getMessage());
            }
        }

        @JvmStatic
        @JvmOverloads
        public static final void S(int i) {
            INSTANCE.f(i);
        }

        @JvmStatic
        @JvmOverloads
        public static final void T(int i, @NotNull String str, int i2) {
            INSTANCE.g(i, str, i2);
        }

        @JvmStatic
        public static final void U(@NotNull IContactSyncListener iContactSyncListener) {
            INSTANCE.o(iContactSyncListener);
        }

        @JvmStatic
        public static final void b0(@NotNull IContactSyncListener iContactSyncListener) {
            INSTANCE.r(iContactSyncListener);
        }

        public final void B(int syncReason) {
            if (L().S3() && syncReason == 1) {
                Z(N(), syncReason, 4, false);
            } else {
                u64.d(TAG, "checkAndSyncCallsChange return ,not support calls sync or not in pair", new Object[0]);
                W(syncReason, z44.NATIVE_SYNC_CALL_LOG_ACTION);
            }
        }

        public final void C(int syncReason) {
            if (!L().K1()) {
                u64.d(TAG, "checkAndSyncContactsChange return, not support contact sync", new Object[0]);
                W(syncReason, z44.NATIVE_SYNC_CONTACT_ACTION);
                return;
            }
            u64.d(TAG, "checkAndSyncContactsChange sync:" + syncReason, new Object[0]);
            Z(N(), syncReason, 2, false);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x007d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0087  */
        /* JADX WARN: Code duplicated, block: B:21:0x0089  */
        /* JADX WARN: Code duplicated, block: B:23:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00df  */
        public final void D(String macAddress, boolean firstPair, boolean countChange) {
            int i;
            int i2;
            int i3;
            b34 b34VarL;
            int i4;
            y54 y54Var = y54.INSTANCE;
            String strD = y54Var.d();
            u64.d(TAG, "checkAndSyncFull macAddress: " + gdb.a(macAddress) + ", lastMacAddress: " + gdb.a(strD) + ", firstPair=" + firstPair + ", countChange=" + countChange, new Object[0]);
            if (TextUtils.isEmpty(strD) || Intrinsics.areEqual(macAddress, strD)) {
                if (firstPair) {
                    u64.d(TAG, "first pair , need sync", new Object[0]);
                    i = 1;
                } else if (y54Var.g(macAddress) && countChange) {
                    u64.d(TAG, "same device , count change", new Object[0]);
                    i = 7;
                } else {
                    i = 0;
                }
                i2 = i;
                if (i2 != 0) {
                    b34VarL = L();
                    if (b34VarL.K1()) {
                        i4 = 2;
                    } else {
                        if (b34VarL.D5()) {
                            com.heytap.health.base.track.a.i(z44.CONTACT_SYNC_REPORT_EVENT_ID).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_NOT, 1).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE, Integer.valueOf(i)).b();
                        }
                        i4 = 0;
                    }
                    if (b34VarL.l8()) {
                        i4 |= 8;
                    }
                    if (firstPair && b34VarL.S3()) {
                        i4 |= 4;
                    }
                    u64.d(TAG, "handle=" + i4, new Object[0]);
                    Z(macAddress, i, i4, firstPair);
                } else {
                    com.heytap.health.base.track.a.b bVarI = com.heytap.health.base.track.a.i(z44.CONTACT_SYNC_REPORT_EVENT_ID);
                    if (i37.c(macAddress)) {
                        i3 = 4;
                    } else {
                        i3 = 3;
                    }
                    bVarI.a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_NOT, Integer.valueOf(i3)).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE, Integer.valueOf(i)).b();
                }
                y54Var.i(macAddress);
            }
            u64.d(TAG, "device change, need sync", new Object[0]);
            i = 5;
            i2 = 1;
            if (i2 != 0) {
                b34VarL = L();
                if (b34VarL.K1()) {
                    i4 = 2;
                } else {
                    if (b34VarL.D5()) {
                        com.heytap.health.base.track.a.i(z44.CONTACT_SYNC_REPORT_EVENT_ID).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_NOT, 1).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE, Integer.valueOf(i)).b();
                    }
                    i4 = 0;
                }
                if (b34VarL.l8()) {
                    i4 |= 8;
                }
                if (firstPair) {
                    i4 |= 4;
                }
                u64.d(TAG, "handle=" + i4, new Object[0]);
                Z(macAddress, i, i4, firstPair);
            } else {
                com.heytap.health.base.track.a.b bVarI2 = com.heytap.health.base.track.a.i(z44.CONTACT_SYNC_REPORT_EVENT_ID);
                if (i37.c(macAddress)) {
                    i3 = 4;
                } else {
                    i3 = 3;
                }
                bVarI2.a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_NOT, Integer.valueOf(i3)).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE, Integer.valueOf(i)).b();
            }
            y54Var.i(macAddress);
        }

        public final void E(String tag, Function0<Unit> code) {
            String currentConnectId = gl4.managerApi.getCurrentConnectId();
            String strD = ContactSyncTransportApi.INSTANCE.d();
            if (Intrinsics.areEqual(currentConnectId, strD)) {
                code.invoke();
                return;
            }
            if (qe0.w()) {
                u64.INSTANCE.f(tag, "FAIL: nodeId not equal,current =" + currentConnectId + " cache=" + strD + " ", new Object[0]);
                return;
            }
            u64.INSTANCE.f(tag, "FAIL: nodeId not equal,current =" + gdb.a(currentConnectId) + " cache=" + gdb.a(strD) + " ", new Object[0]);
        }

        public final void F(int syncReason) {
            if (L().l8()) {
                Z(N(), syncReason, 8, false);
            } else {
                u64.d(TAG, "checkSyncBlockNumChange return ,not support block num sync", new Object[0]);
                W(syncReason, z44.NATIVE_SYNC_BLACK_LIST_ACTION);
            }
        }

        public final void G(String macAddress) {
            e9g.m(macAddress, 0L);
            y54 y54Var = y54.INSTANCE;
            y54Var.b(macAddress);
            y54Var.a(macAddress);
            String strF = y54Var.f();
            y54Var.k(strF != null ? StringsKt__StringsJVMKt.replace$default(strF, macAddress, "", false, 4, (Object) null) : null);
        }

        public final void H(String reason) {
            this.mIsSyncing = false;
            this.eventDispatcher.c(false);
            u64.c(TAG, "sync fail," + reason, new Object[0]);
        }

        public final void I(boolean status) {
            this.mIsSyncing = false;
            this.eventDispatcher.c(status);
            u64.d(TAG, "sync success, sync done " + status, new Object[0]);
        }

        public final void J(String reason) {
            this.mIsSyncing = true;
            this.eventDispatcher.d();
            u64.d(TAG, "syncing," + reason, new Object[0]);
        }

        public final void K() {
            io.reactivex.rxjava3.disposables.a aVar = this.mSortDisposable;
            if (aVar != null && !aVar.isDisposed()) {
                aVar.dispose();
            }
            this.mSortDisposable = null;
        }

        public final b34 L() {
            return d34.a(gl4.managerApi.getCurrentConnectId());
        }

        public final IContactSyncOnce.Stub M() {
            return (IContactSyncOnce.Stub) this.binder.getValue();
        }

        public final String N() {
            return ContactSyncTransportApi.INSTANCE.d();
        }

        public final String O() {
            return ContactSyncTransportApi.INSTANCE.e();
        }

        @Override // com.oplus.aiunit.vision.cm9
        @NotNull
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public IContactSyncOnce d() {
            return M();
        }

        public final void Q() {
            final MessageEvent messageEvent = new MessageEvent(15, 11, null);
            E("getWatchSyncModel", new Function0<Unit>() { // from class: com.heytap.health.watch.contactsync.ContactSyncOnceApi$getWatchSyncModel$1
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    u64.d(ContactSyncOnceApi.TAG, "getWatchSyncModel()-->", new Object[0]);
                    gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), messageEvent);
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        public final boolean R() {
            boolean z;
            String strF = y54.INSTANCE.f();
            boolean z2 = true;
            if (strF == null) {
                z = false;
            } else {
                if (strF.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                if (!((strF == null || StringsKt__StringsKt.contains$default((CharSequence) strF, (CharSequence) N(), false, 2, (Object) null)) ? false : true)) {
                    z2 = false;
                }
            }
            u64.d(TAG, "isFirstPair()=" + z2 + " --> mConnectedMacAddress: " + (qe0.w() ? N() : gdb.a(N())), new Object[0]);
            return z2;
        }

        public final void V() {
            final ContactSyncProto.DataClear dataClearBuild = ContactSyncProto.DataClear.newBuilder().setType(1).build();
            final MessageEvent messageEvent = new MessageEvent(15, 9, dataClearBuild.toByteArray());
            E("sendClearData", new Function0<Unit>() { // from class: com.heytap.health.watch.contactsync.ContactSyncOnceApi$sendClearData$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    u64.d(ContactSyncOnceApi.TAG, "sendClearData()-->" + dataClearBuild, new Object[0]);
                    gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), messageEvent);
                }
            });
        }

        public final void W(int syncReason, String action) {
            u64.d(TAG, "sendPairResult: action = " + action + "  syncReason = " + syncReason, new Object[0]);
            if (syncReason == 1) {
                ContactSyncMainApi.INSTANCE.d(action, false);
            }
        }

        public final void X() {
            E("sendSortMessage", new ContactSyncOnceApi$sendSortMessage$1(this));
        }

        public final void Y(final int model) {
            u64.d(TAG, "sendSwitchModel()--> model: " + model, new Object[0]);
            if (model == 0) {
                return;
            }
            E("sendSwitchModel", new Function0<Unit>() { // from class: com.heytap.health.watch.contactsync.ContactSyncOnceApi$sendSwitchModel$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    y54.INSTANCE.j(this.this$0.N(), 4);
                    ContactSyncProto.SwitchStatus switchStatusBuild = ContactSyncProto.SwitchStatus.newBuilder().setStatus(model).build();
                    MessageEvent messageEvent = new MessageEvent(15, 10, switchStatusBuild.toByteArray());
                    u64.d(ContactSyncOnceApi.TAG, "sendSwitchModel()--> " + switchStatusBuild, new Object[0]);
                    gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), messageEvent);
                    ContactSyncTransportApi.INSTANCE.f(model);
                }
            });
        }

        public final void Z(String macAddress, int syncReason, int handle, boolean firstPair) {
            boolean zC = i37.c(macAddress);
            int i = 0;
            u64.d(TAG, "startSyncAction mac: " + gdb.a(macAddress) + ", familyDevice: " + zC + ", reason: " + syncReason, new Object[0]);
            if (zC) {
                ContactSyncTransportApi.INSTANCE.k(14);
                com.heytap.health.base.track.a.i(z44.CONTACT_SYNC_REPORT_EVENT_ID).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_NOT, 4).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE, Integer.valueOf(syncReason)).b();
                return;
            }
            if (c0(macAddress)) {
                if (a54.c(handle)) {
                    handle ^= 2;
                }
                ContactSyncTransportApi.INSTANCE.k(2);
            }
            if (!firstPair || syncReason == 1) {
                i = handle;
            } else {
                u64.d(TAG, "startSyncAction: filter sync firstPair syncReason: " + syncReason, new Object[0]);
            }
            if (i == 0) {
                com.heytap.health.base.track.a.i(z44.CONTACT_SYNC_REPORT_EVENT_ID).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_NOT, 3).a(z44.CONTACT_SYNC_REPORT_EVENT_FIELD_SYNC_TYPE, Integer.valueOf(syncReason)).b();
                return;
            }
            if (syncReason != 1 && a54.b(i)) {
                i ^= 4;
            }
            if (TextUtils.isEmpty(macAddress)) {
                return;
            }
            if (a54.c(i)) {
                y54.INSTANCE.j(macAddress, 3);
            }
            J("handle action");
            e54.INSTANCE.a(new qfj(macAddress, z44.ACTION_FULL_CHECK, syncReason, i));
            y54.INSTANCE.l(macAddress);
        }

        public final void a0(String mac) {
            J("trySendClearContact");
            if (L().x1()) {
                bl4.a.a(gl4.deviceMultiple.callApi, gl4.managerApi.n(), mac, new MessageEvent(15, 12, ContactSyncProto.ContactCleanRequest.newBuilder().setTimeInterval(System.currentTimeMillis()).build().toByteArray()), new b(), null, 30000L, 0, 80, null);
            } else {
                vse.c(mac).l();
                vse.c(mac).G(13);
            }
        }

        @Override // com.oplus.aiunit.vision.cm9
        public void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            u64.d(TAG, "onDestroy()", new Object[0]);
        }

        @Override // com.oplus.aiunit.vision.cm9
        public void c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public final boolean c0(String macAddress) {
            int iE = y54.INSTANCE.e(macAddress);
            boolean z = iE == 2;
            boolean z2 = iE == 4;
            u64.d(TAG, "verifySyncModel: watchModel:" + z + ", switchIng:" + z2, new Object[0]);
            return z || z2;
        }
    }
