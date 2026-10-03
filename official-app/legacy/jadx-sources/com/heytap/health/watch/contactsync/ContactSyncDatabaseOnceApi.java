package com.heytap.health.watch.contactsync;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi;
import com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce;
import com.heytap.health.watch.contactsync.db.ContactSyncDatabase;
import com.heytap.health.watch.contactsync.db.table.DBSelectContactLite;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.trg;
import com.oplus.aiunit.vision.u64;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncDatabaseOnceApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncDatabaseOnce;", b2n.g, "Landroid/content/Context;", "context", "", "c", "b", "<init>", "()V", "Companion", "a", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ContactSyncDatabaseOnceApi implements cm9<IContactSyncDatabaseOnce> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy<ContactSyncDatabaseOnceApi$Companion$binder$2.AnonymousClass1> i = LazyKt__LazyJVMKt.lazy(new Function0<ContactSyncDatabaseOnceApi$Companion$binder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$Companion$binder$2

        /* JADX INFO: renamed from: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$Companion$binder$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J.\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0016¨\u0006\u0010"}, d2 = {"com/heytap/health/watch/contactsync/ContactSyncDatabaseOnceApi$Companion$binder$2$1", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncDatabaseOnce$Stub;", "deleteAndInsertInTransaction", "", "Lcom/heytap/health/watch/contactsync/db/table/DBSelectContactLite;", "mac", "", "contacts", "", "deleteAndUpdateInTransaction", "deleteIds", "", "querySelectContact", "updateSelectContact", "", "contatcs", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends IContactSyncDatabaseOnce.Stub {
            /* JADX INFO: Access modifiers changed from: private */
            public static final List deleteAndInsertInTransaction$lambda$0(ContactSyncDatabase contactSyncDatabase, String mac, List contacts) {
                Intrinsics.checkNotNullParameter(mac, "$mac");
                Intrinsics.checkNotNullParameter(contacts, "$contacts");
                trg trgVarH = contactSyncDatabase.h();
                trgVarH.c(mac);
                trgVarH.a(contacts);
                return contacts;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final List deleteAndUpdateInTransaction$lambda$1(ContactSyncDatabase contactSyncDatabase, String mac, long[] deleteIds, List contacts) {
                Intrinsics.checkNotNullParameter(mac, "$mac");
                Intrinsics.checkNotNullParameter(deleteIds, "$deleteIds");
                Intrinsics.checkNotNullParameter(contacts, "$contacts");
                trg trgVarH = contactSyncDatabase.h();
                u64.a("ContactSyncMainApi", "delete success!!!-->" + trgVarH.b(mac, ArraysKt___ArraysJvmKt.toTypedArray(deleteIds)), new Object[0]);
                u64.a("ContactSyncMainApi", "update success!!!-->" + trgVarH.d(contacts), new Object[0]);
                return contacts;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            @Nullable
            public List<DBSelectContactLite> deleteAndInsertInTransaction(@NotNull final String mac, @NotNull final List<DBSelectContactLite> contacts) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                final ContactSyncDatabase contactSyncDatabaseG = ContactSyncDatabase.g();
                return (List) contactSyncDatabaseG.runInTransaction(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: RETURN 
                      (wrap java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite>:0x0017: CHECK_CAST (java.util.List) (wrap java.lang.Object:0x0013: INVOKE 
                      (r1v3 'contactSyncDatabaseG' com.heytap.health.watch.contactsync.db.ContactSyncDatabase)
                      (wrap java.util.concurrent.Callable:0x0010: CONSTRUCTOR 
                      (r1v3 'contactSyncDatabaseG' com.heytap.health.watch.contactsync.db.ContactSyncDatabase A[DONT_INLINE])
                      (r2v0 'mac' java.lang.String A[DONT_INLINE])
                      (r3v0 'contacts' java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite> A[DONT_INLINE])
                     A[MD:(com.heytap.health.watch.contactsync.db.ContactSyncDatabase, java.lang.String, java.util.List):void (m), WRAPPED] call: com.oplus.aiunit.vision.d54.<init>(com.heytap.health.watch.contactsync.db.ContactSyncDatabase, java.lang.String, java.util.List):void type: CONSTRUCTOR)
                     VIRTUAL call: androidx.room.RoomDatabase.runInTransaction(java.util.concurrent.Callable):java.lang.Object A[MD:<V>:(java.util.concurrent.Callable<V>):V (m), WRAPPED]))
                     in method: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$Companion$binder$2.1.deleteAndInsertInTransaction(java.lang.String, java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite>):java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite>, file: classes19.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.d54, state: NOT_LOADED
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
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 15 more
                    */
                /*
                    this = this;
                    java.lang.String r1 = "mac"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    java.lang.String r1 = "contacts"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    com.heytap.health.watch.contactsync.db.ContactSyncDatabase r1 = com.heytap.health.watch.contactsync.db.ContactSyncDatabase.g()
                    com.oplus.aiunit.vision.d54 r0 = new com.oplus.aiunit.vision.d54
                    r0.<init>(r1, r2, r3)
                    java.lang.Object r1 = r1.runInTransaction(r0)
                    java.util.List r1 = (java.util.List) r1
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$Companion$binder$2.AnonymousClass1.deleteAndInsertInTransaction(java.lang.String, java.util.List):java.util.List");
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            @Nullable
            public List<DBSelectContactLite> deleteAndUpdateInTransaction(@NotNull final String mac, @NotNull final long[] deleteIds, @NotNull final List<DBSelectContactLite> contacts) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(deleteIds, "deleteIds");
                Intrinsics.checkNotNullParameter(contacts, "contacts");
                final ContactSyncDatabase contactSyncDatabaseG = ContactSyncDatabase.g();
                return (List) contactSyncDatabaseG.runInTransaction(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: RETURN 
                      (wrap java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite>:0x001c: CHECK_CAST (java.util.List) (wrap java.lang.Object:0x0018: INVOKE 
                      (r1v4 'contactSyncDatabaseG' com.heytap.health.watch.contactsync.db.ContactSyncDatabase)
                      (wrap java.util.concurrent.Callable:0x0015: CONSTRUCTOR 
                      (r1v4 'contactSyncDatabaseG' com.heytap.health.watch.contactsync.db.ContactSyncDatabase A[DONT_INLINE])
                      (r2v0 'mac' java.lang.String A[DONT_INLINE])
                      (r3v0 'deleteIds' long[] A[DONT_INLINE])
                      (r4v0 'contacts' java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite> A[DONT_INLINE])
                     A[MD:(com.heytap.health.watch.contactsync.db.ContactSyncDatabase, java.lang.String, long[], java.util.List):void (m), WRAPPED] call: com.oplus.aiunit.vision.c54.<init>(com.heytap.health.watch.contactsync.db.ContactSyncDatabase, java.lang.String, long[], java.util.List):void type: CONSTRUCTOR)
                     VIRTUAL call: androidx.room.RoomDatabase.runInTransaction(java.util.concurrent.Callable):java.lang.Object A[MD:<V>:(java.util.concurrent.Callable<V>):V (m), WRAPPED]))
                     in method: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$Companion$binder$2.1.deleteAndUpdateInTransaction(java.lang.String, long[], java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite>):java.util.List<com.heytap.health.watch.contactsync.db.table.DBSelectContactLite>, file: classes19.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.c54, state: NOT_LOADED
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
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:345)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 15 more
                    */
                /*
                    this = this;
                    java.lang.String r1 = "mac"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    java.lang.String r1 = "deleteIds"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    java.lang.String r1 = "contacts"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
                    com.heytap.health.watch.contactsync.db.ContactSyncDatabase r1 = com.heytap.health.watch.contactsync.db.ContactSyncDatabase.g()
                    com.oplus.aiunit.vision.c54 r0 = new com.oplus.aiunit.vision.c54
                    r0.<init>(r1, r2, r3, r4)
                    java.lang.Object r1 = r1.runInTransaction(r0)
                    java.util.List r1 = (java.util.List) r1
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$Companion$binder$2.AnonymousClass1.deleteAndUpdateInTransaction(java.lang.String, long[], java.util.List):java.util.List");
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            @NotNull
            public List<DBSelectContactLite> querySelectContact(@Nullable String mac) {
                List<DBSelectContactLite> listQuery = ContactSyncDatabase.g().h().query(mac);
                Intrinsics.checkNotNullExpressionValue(listQuery, "getInstance().selectCont…mac\n                    )");
                return listQuery;
            }

            @Override // com.heytap.health.watch.contactsync.aidl.IContactSyncDatabaseOnce
            public int updateSelectContact(@Nullable List<DBSelectContactLite> contatcs) {
                return ContactSyncDatabase.g().h().d(contatcs);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new AnonymousClass1();
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.watch.contactsync.ContactSyncDatabaseOnceApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J.\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/watch/contactsync/ContactSyncDatabaseOnceApi$a;", "", "", "mac", "", "Lcom/heytap/health/watch/contactsync/db/table/DBSelectContactLite;", "kotlin.jvm.PlatformType", b2n.g, "contacts", "c", "", "deleteIds", "d", "", "i", "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncDatabaseOnce;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/watch/contactsync/aidl/IContactSyncDatabaseOnce$Stub;", "binder$delegate", "Lkotlin/Lazy;", b2n.f, "()Lcom/heytap/health/watch/contactsync/aidl/IContactSyncDatabaseOnce$Stub;", "binder", "TAG", "Ljava/lang/String;", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final IContactSyncDatabaseOnce f(IBinder iBinder) {
            return IContactSyncDatabaseOnce.Stub.asInterface(iBinder);
        }

        @JvmStatic
        @Nullable
        public final List<DBSelectContactLite> c(@NotNull String mac, @NotNull List<? extends DBSelectContactLite> contacts) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            try {
                IContactSyncDatabaseOnce iContactSyncDatabaseOnceE = e();
                if (iContactSyncDatabaseOnceE != null) {
                    return iContactSyncDatabaseOnceE.deleteAndInsertInTransaction(mac, contacts);
                }
                return null;
            } catch (RemoteException e2) {
                u64.d("ContactSyncMainApi", "sendPairResult: error = " + e2.getMessage(), new Object[0]);
                return null;
            }
        }

        @JvmStatic
        @Nullable
        public final List<DBSelectContactLite> d(@NotNull String mac, @NotNull long[] deleteIds, @NotNull List<? extends DBSelectContactLite> contacts) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(deleteIds, "deleteIds");
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            try {
                IContactSyncDatabaseOnce iContactSyncDatabaseOnceE = e();
                if (iContactSyncDatabaseOnceE != null) {
                    return iContactSyncDatabaseOnceE.deleteAndUpdateInTransaction(mac, deleteIds, contacts);
                }
                return null;
            } catch (RemoteException e2) {
                u64.d("ContactSyncMainApi", "sendPairResult: error = " + e2.getMessage(), new Object[0]);
                return null;
            }
        }

        public final IContactSyncDatabaseOnce e() {
            return (IContactSyncDatabaseOnce) ClientManager.getInstance().getBuildService("api_provider_contact_sync_database_once", new ClientManager.a() { // from class: com.oplus.aiunit.vision.b54
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return ContactSyncDatabaseOnceApi.Companion.f(iBinder);
                }
            });
        }

        public final IContactSyncDatabaseOnce.Stub g() {
            return (IContactSyncDatabaseOnce.Stub) ContactSyncDatabaseOnceApi.i.getValue();
        }

        @JvmStatic
        @Nullable
        public final List<DBSelectContactLite> h(@NotNull String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            try {
                IContactSyncDatabaseOnce iContactSyncDatabaseOnceE = e();
                if (iContactSyncDatabaseOnceE != null) {
                    return iContactSyncDatabaseOnceE.querySelectContact(mac);
                }
                return null;
            } catch (RemoteException e2) {
                u64.d("ContactSyncMainApi", "sendPairResult: error = " + e2.getMessage(), new Object[0]);
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }

        @JvmStatic
        public final int i(@NotNull List<? extends DBSelectContactLite> contacts) {
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            try {
                IContactSyncDatabaseOnce iContactSyncDatabaseOnceE = e();
                if (iContactSyncDatabaseOnceE != null) {
                    return iContactSyncDatabaseOnceE.updateSelectContact(contacts);
                }
                return 0;
            } catch (RemoteException e2) {
                u64.d("ContactSyncMainApi", "sendPairResult: error = " + e2.getMessage(), new Object[0]);
                return 0;
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final List<DBSelectContactLite> f(@NotNull String str, @NotNull List<? extends DBSelectContactLite> list) {
        return INSTANCE.c(str, list);
    }

    @JvmStatic
    @Nullable
    public static final List<DBSelectContactLite> g(@NotNull String str, @NotNull long[] jArr, @NotNull List<? extends DBSelectContactLite> list) {
        return INSTANCE.d(str, jArr, list);
    }

    @JvmStatic
    @Nullable
    public static final List<DBSelectContactLite> i(@NotNull String str) {
        return INSTANCE.h(str);
    }

    @JvmStatic
    public static final int j(@NotNull List<? extends DBSelectContactLite> list) {
        return INSTANCE.i(list);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public IContactSyncDatabaseOnce d() {
        return INSTANCE.g();
    }
}
