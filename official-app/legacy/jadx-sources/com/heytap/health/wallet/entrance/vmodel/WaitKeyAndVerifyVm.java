package com.heytap.health.wallet.entrance.vmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.health.wallet.entrance.repository.DoorIdentifyRepo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 (2\u00020\u0001:\u0003)*+B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0017\u0010\u0007\u001a\u00060\u0006R\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8F¢\u0006\u0006\u001a\u0004\b$\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm;", "Landroidx/lifecycle/ViewModel;", "", ExifInterface.LONGITUDE_EAST, UserInfo.SEX_FEMALE, "A", "Lcom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm$c;", "G", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "i", "Ljava/lang/String;", "mServerInverseId", "", "j", "I", "reqCount", "Lcom/heytap/health/wallet/entrance/repository/DoorIdentifyRepo;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/wallet/entrance/repository/DoorIdentifyRepo;", "repository", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm$b;", LogFieldKey.LEVEL_KEY, "Landroidx/lifecycle/MutableLiveData;", "_decryptEnd", LogFieldKey.MESSAGE_KEY, "_progress", "n", "_expStr", "Landroidx/lifecycle/LiveData;", c8l.KEY_B, "()Landroidx/lifecycle/LiveData;", "decryptEnd", "D", "progress", "C", "expStr", "<init>", "()V", "Companion", "a", "b", "c", "entrance_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWaitKeyAndVerifyVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitKeyAndVerifyVm.kt\ncom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,118:1\n48#2,4:119\n*S KotlinDebug\n*F\n+ 1 WaitKeyAndVerifyVm.kt\ncom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm\n*L\n57#1:119,4\n*E\n"})
public final class WaitKeyAndVerifyVm extends ViewModel {

    @NotNull
    public static final String TAG = "KeyVerify";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String mServerInverseId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int reqCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final DoorIdentifyRepo repository = new DoorIdentifyRepo();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MutableLiveData<CrackRlt> _decryptEnd = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<Integer> _progress = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<String> _expStr = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.heytap.health.wallet.entrance.vmodel.WaitKeyAndVerifyVm$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "isEnd", "Ljava/lang/String;", "()Ljava/lang/String;", "inverseId", "<init>", "(ZLjava/lang/String;)V", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CrackRlt {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final boolean isEnd;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String inverseId;

        public CrackRlt(boolean z, @Nullable String str) {
            this.isEnd = z;
            this.inverseId = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInverseId() {
            return this.inverseId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsEnd() {
            return this.isEnd;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrackRlt)) {
                return false;
            }
            CrackRlt crackRlt = (CrackRlt) other;
            return this.isEnd == crackRlt.isEnd && Intrinsics.areEqual(this.inverseId, crackRlt.inverseId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.isEnd;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.inverseId;
            return i + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "CrackRlt(isEnd=" + this.isEnd + ", inverseId=" + this.inverseId + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm$c;", "", "", "a", "Z", "()Z", "verifySuc", "b", "isEnd", "<init>", "(Lcom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm;ZZ)V", "entrance_release"}, k = 1, mv = {1, 8, 0})
    public final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final boolean verifySuc;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isEnd;

        public c(boolean z, boolean z2) {
            this.verifySuc = z;
            this.isEnd = z2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getVerifySuc() {
            return this.verifySuc;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsEnd() {
            return this.isEnd;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WaitKeyAndVerifyVm.kt\ncom/heytap/health/wallet/entrance/vmodel/WaitKeyAndVerifyVm\n*L\n1#1,110:1\n58#2,3:111\n*E\n"})
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ WaitKeyAndVerifyVm i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Companion companion, WaitKeyAndVerifyVm waitKeyAndVerifyVm) {
            super(companion);
            this.i = waitKeyAndVerifyVm;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            t6b.b(WaitKeyAndVerifyVm.TAG, "CoroutineExceptionHandler: " + exception);
            this.i._expStr.postValue("deepRead-" + exception.getMessage() + " ");
        }
    }

    public WaitKeyAndVerifyVm() {
        E();
    }

    public final void A() {
        QualityTrack.INSTANCE.b(Scenes.WALLET_ENTRANCE_CRACK);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), new d(CoroutineExceptionHandler.INSTANCE, this), null, new WaitKeyAndVerifyVm$deepReadData$1(this, null), 2, null);
    }

    @NotNull
    public final LiveData<CrackRlt> B() {
        return this._decryptEnd;
    }

    @NotNull
    public final LiveData<String> C() {
        return this._expStr;
    }

    @NotNull
    public final LiveData<Integer> D() {
        return this._progress;
    }

    public final void E() {
        F();
        A();
    }

    public final void F() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new WaitKeyAndVerifyVm$startTheTimer$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x015b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010f -> B:19:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0128 -> B:19:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object G(p010kotlin.coroutines.Continuation<? super com.heytap.health.wallet.entrance.vmodel.WaitKeyAndVerifyVm.c> r13) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.wallet.entrance.vmodel.WaitKeyAndVerifyVm.G(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
