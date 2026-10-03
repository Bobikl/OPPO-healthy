package com.heytap.health.step.detail.ui.stephistory2.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.view.adapter.MultiLayoutAdapter;
import com.heytap.health.step.card.bean.StepCardDetailsBean;
import com.heytap.health.step.detail.ui.stephistory2.datamanager.StepDetailViewModel;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.BaseItemView;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.StepDistanceView;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.StepFloorView;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.StepReachGoalView;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.StepTrentView;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.a;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.e;
import com.heytap.health.step.detail.ui.stephistory2.detailitem.f;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.StepStat;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.e7c;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.hsi;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.zri;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 a2\u00020\u0001:\u00012B!\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010?\u001a\u000208\u0012\u0006\u0010B\u001a\u00020\b¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J \u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016J\u0006\u0010\u0019\u001a\u00020\u0002J\"\u0010\u001d\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016J\u0006\u0010\u001e\u001a\u00020\u0002J\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\b\u0010\"\u001a\u0004\u0018\u00010!JO\u0010,\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u0002J\u000e\u00101\u001a\u00020\u00022\u0006\u00100\u001a\u00020/R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010B\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010RR(\u0010[\u001a\b\u0012\u0004\u0012\u00020U0T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010]\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/view/StepRecycleAttrHelper;", "", "", "y", "o", "Lcom/oplus/aiunit/vision/hsi;", LogFieldKey.LEVEL_KEY, "v", "", "s", "u", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/e;", LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/StepTrentView;", "n", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/StepDistanceView;", "i", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/StepFloorView;", "j", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lkotlin/Function0;", "explainViewHasRemoved", "q", "d", "Landroid/content/Context;", "context", "onAgreePerm", "w", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/a;", b2n.g, "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/StepReachGoalView;", b2n.f, "Ljava/time/LocalDate;", "beforeStartDate", "beforeEndDate", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "Lcom/oplus/aiunit/vision/hti;", "beforeData", "afterData", "t", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z", "Lcom/heytap/health/step/detail/ui/stephistory2/datamanager/StepDetailViewModel;", "detailViewModel", LogFieldKey.PROCESS_NAME_KEY, "a", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "b", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "getCardMode", "()Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "setCardMode", "(Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;)V", "cardMode", "c", "Z", "isFromFamily", "()Z", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "getMultiLayoutAdapter", "()Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;", "setMultiLayoutAdapter", "(Lcom/heytap/health/base/view/adapter/MultiLayoutAdapter;)V", "multiLayoutAdapter", "Lcom/heytap/health/base/permission/wxbpermission/PermissionRequestDialog;", "Lcom/heytap/health/base/permission/wxbpermission/PermissionRequestDialog;", "getDialog", "()Lcom/heytap/health/base/permission/wxbpermission/PermissionRequestDialog;", "setDialog", "(Lcom/heytap/health/base/permission/wxbpermission/PermissionRequestDialog;)V", EngineConstant.ROUTER_TYPE_DIALOG, "Lkotlin/jvm/functions/Function0;", "explainViewHasRemovedCallback", "", "Lcom/oplus/aiunit/vision/e7c;", "Ljava/util/List;", "getViewList", "()Ljava/util/List;", "setViewList", "(Ljava/util/List;)V", "viewList", "", "Ljava/lang/String;", "spShowInstructionKey", "<init>", "(Landroid/content/Context;Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;Z)V", "Companion", "step_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepRecycleAttrHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepRecycleAttrHelper.kt\ncom/heytap/health/step/detail/ui/stephistory2/view/StepRecycleAttrHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,361:1\n800#2,11:362\n800#2,11:373\n800#2,11:384\n800#2,11:395\n800#2,11:406\n800#2,11:417\n800#2,11:428\n800#2,11:439\n*S KotlinDebug\n*F\n+ 1 StepRecycleAttrHelper.kt\ncom/heytap/health/step/detail/ui/stephistory2/view/StepRecycleAttrHelper\n*L\n243#1:362,11\n253#1:373,11\n263#1:384,11\n273#1:395,11\n283#1:406,11\n293#1:417,11\n303#1:428,11\n336#1:439,11\n*E\n"})
public final class StepRecycleAttrHelper {

    @NotNull
    public static final String TAG = "StepDetailRecycleAttrHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public BaseItemView.CARD_MODE cardMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isFromFamily;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public MultiLayoutAdapter multiLayoutAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PermissionRequestDialog dialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> explainViewHasRemovedCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<e7c> viewList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String spShowInstructionKey;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/heytap/health/step/detail/ui/stephistory2/view/StepRecycleAttrHelper$b", "Lcom/oplus/aiunit/vision/hsi$b;", "", "a", "step_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements hsi.b {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.hsi.b
        public boolean a() {
            a7b.f(StepRecycleAttrHelper.TAG, "onClickEnable");
            StepRecycleAttrHelper stepRecycleAttrHelper = StepRecycleAttrHelper.this;
            StepRecycleAttrHelper.x(stepRecycleAttrHelper, stepRecycleAttrHelper.getContext(), null, 2, null);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/step/detail/ui/stephistory2/view/StepRecycleAttrHelper$c", "Lcom/heytap/health/base/permission/wxbpermission/PermissionRequestDialog$d;", "", "Z5", "Y1", "step_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements PermissionRequestDialog.d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6020j;

        public c(Function0<Unit> function0) {
            this.f6020j = function0;
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Y1() {
            StepRecycleAttrHelper.this.v();
            Function0 function0 = StepRecycleAttrHelper.this.explainViewHasRemovedCallback;
            if (function0 != null) {
                function0.invoke();
            }
            Function0<Unit> function1 = this.f6020j;
            if (function1 != null) {
                function1.invoke();
            }
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Z5() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public StepRecycleAttrHelper(@Nullable Context context, @NotNull BaseItemView.CARD_MODE cardMode, boolean z) {
        Intrinsics.checkNotNullParameter(cardMode, "cardMode");
        this.context = context;
        this.cardMode = cardMode;
        this.isFromFamily = z;
        this.viewList = !z ? cardMode == BaseItemView.CARD_MODE.DAY ? CollectionsKt__CollectionsKt.mutableListOf(new a(this.cardMode), new e(this.cardMode), new com.heytap.health.step.detail.ui.stephistory2.detailitem.b(this.cardMode)) : CollectionsKt__CollectionsKt.mutableListOf(new StepTrentView(this.cardMode), new StepReachGoalView(this.cardMode), new StepDistanceView(this.cardMode), new StepFloorView(this.cardMode)) : cardMode == BaseItemView.CARD_MODE.DAY ? CollectionsKt__CollectionsKt.mutableListOf(new e(this.cardMode)) : CollectionsKt__CollectionsKt.mutableListOf(new StepTrentView(this.cardMode), new StepReachGoalView(this.cardMode), new StepDistanceView(this.cardMode), new StepFloorView(this.cardMode));
        this.spShowInstructionKey = "step_detail_show_instruction" + v9g.w().E("user_ssoid", "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(StepRecycleAttrHelper stepRecycleAttrHelper, RecyclerView recyclerView, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        stepRecycleAttrHelper.q(recyclerView, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x(StepRecycleAttrHelper stepRecycleAttrHelper, Context context, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        stepRecycleAttrHelper.w(context, function0);
    }

    public final void d() {
        a7b.f(TAG, "checkForPermission");
        if (s()) {
            return;
        }
        v();
    }

    public final void e() {
        PermissionRequestDialog permissionRequestDialog = this.dialog;
        if (permissionRequestDialog != null) {
            permissionRequestDialog.G();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final StepReachGoalView g() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof StepReachGoalView) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (StepReachGoalView) arrayList.get(0);
    }

    @Nullable
    public final a h() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof a) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (a) arrayList.get(0);
    }

    public final StepDistanceView i() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof StepDistanceView) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (StepDistanceView) arrayList.get(0);
    }

    public final StepFloorView j() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof StepFloorView) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (StepFloorView) arrayList.get(0);
    }

    public final hsi k() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof hsi) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (hsi) arrayList.get(0);
    }

    public final hsi l() {
        return new hsi();
    }

    public final e m() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof e) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (e) arrayList.get(0);
    }

    public final StepTrentView n() {
        List<? extends e7c> data;
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof StepTrentView) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (StepTrentView) arrayList.get(0);
    }

    public final void o() {
        if (s()) {
            hsi hsiVarL = l();
            hsiVarL.setOnClickListener(new b());
            this.viewList.add(0, hsiVarL);
        }
    }

    public final void p(@NotNull final StepDetailViewModel detailViewModel) {
        Intrinsics.checkNotNullParameter(detailViewModel, "detailViewModel");
        if (this.context == null) {
            return;
        }
        LiveData<StepStat> liveDataW = detailViewModel.W();
        Object obj = this.context;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        liveDataW.observe((LifecycleOwner) obj, new d(new Function1<StepStat, Unit>() { // from class: com.heytap.health.step.detail.ui.stephistory2.view.StepRecycleAttrHelper$initDayViewObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StepStat stepStat) {
                invoke2(stepStat);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StepStat it) {
                zri.c(StepRecycleAttrHelper.TAG, "curDayStatChanged:" + it);
                e eVarM = this.this$0.m();
                if (eVarM != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    eVarM.B(it);
                }
                a aVarH = this.this$0.h();
                if (aVarH != null) {
                    StepCardDetailsBean value = detailViewModel.S().getValue();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    LocalDate value2 = detailViewModel.V().getValue();
                    Intrinsics.checkNotNull(value2);
                    aVarH.z(value, it, value2);
                }
            }
        }));
        MutableLiveData<StepCardDetailsBean> mutableLiveDataS = detailViewModel.S();
        Object obj2 = this.context;
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        mutableLiveDataS.observe((LifecycleOwner) obj2, new d(new Function1<StepCardDetailsBean, Unit>() { // from class: com.heytap.health.step.detail.ui.stephistory2.view.StepRecycleAttrHelper$initDayViewObserver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StepCardDetailsBean stepCardDetailsBean) {
                invoke2(stepCardDetailsBean);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable StepCardDetailsBean stepCardDetailsBean) {
                StepStat value = detailViewModel.W().getValue();
                Integer numValueOf = value != null ? Integer.valueOf(value.getStep()) : null;
                StepStat value2 = detailViewModel.W().getValue();
                a7b.f(StepRecycleAttrHelper.TAG, "checkInDetail has back:" + numValueOf + " / " + (value2 != null ? Integer.valueOf(value2.getStepGoal()) : null));
                LocalDate value3 = detailViewModel.V().getValue();
                Intrinsics.checkNotNull(value3);
                LocalDate localDate = value3;
                a aVarH = this.h();
                if (aVarH != null) {
                    StepStat value4 = detailViewModel.W().getValue();
                    if (value4 == null) {
                        value4 = detailViewModel.I(localDate);
                    }
                    Intrinsics.checkNotNullExpressionValue(value4, "detailViewModel.curDaySt…iewModel.fakeStat(curDay)");
                    aVarH.z(stepCardDetailsBean, value4, localDate);
                }
            }
        }));
    }

    public final void q(@NotNull RecyclerView recyclerView, @Nullable Function0<Unit> explainViewHasRemoved) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.explainViewHasRemovedCallback = explainViewHasRemoved;
        Context context = this.context;
        if (context != null) {
            this.multiLayoutAdapter = new MultiLayoutAdapter(context, this.viewList);
            if (this.cardMode == BaseItemView.CARD_MODE.DAY) {
                if (!this.isFromFamily) {
                    y();
                }
                o();
                if (g3k.x()) {
                    u();
                }
            }
            recyclerView.setAdapter(this.multiLayoutAdapter);
            final Context context2 = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context2) { // from class: com.heytap.health.step.detail.ui.stephistory2.view.StepRecycleAttrHelper$initRecycleView$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    return false;
                }
            });
            recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.heytap.health.step.detail.ui.stephistory2.view.StepRecycleAttrHelper$initRecycleView$1$2
                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                    Intrinsics.checkNotNullParameter(outRect, "outRect");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    super.getItemOffsets(outRect, view, parent, state);
                    outRect.top = ejg.a(view.getContext(), 12.0f);
                    outRect.left = ejg.a(view.getContext(), 16.0f);
                    outRect.right = ejg.a(view.getContext(), 16.0f);
                }
            });
        }
    }

    public final boolean s() {
        if (this.isFromFamily) {
            return false;
        }
        boolean z = PermissionRequestDialog.D(5, "android.permission.ACTIVITY_RECOGNITION");
        boolean zR = v9g.w().r(this.spShowInstructionKey, true);
        a7b.f(TAG, "needShowStepExplainView hasStepPerm:" + z + ",showInstruction key:" + zR);
        return !z && zR;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object t(@NotNull LocalDate localDate, @NotNull LocalDate localDate2, @NotNull LocalDate localDate3, @NotNull LocalDate localDate4, @NotNull List<StepStat> list, @NotNull List<StepStat> list2, @NotNull Continuation<? super Unit> continuation) {
        StepRecycleAttrHelper$refreshWeekStatView$1 stepRecycleAttrHelper$refreshWeekStatView$1;
        LocalDate localDate5;
        LocalDate localDate6;
        LocalDate localDate7;
        LocalDate localDate8;
        List<StepStat> list3;
        StepRecycleAttrHelper stepRecycleAttrHelper;
        List<StepStat> list4;
        LocalDate localDate9;
        StepRecycleAttrHelper stepRecycleAttrHelper2;
        LocalDate localDate10;
        LocalDate localDate11;
        LocalDate localDate12;
        StepDistanceView stepDistanceViewI;
        StepFloorView stepFloorViewJ;
        if (continuation instanceof StepRecycleAttrHelper$refreshWeekStatView$1) {
            stepRecycleAttrHelper$refreshWeekStatView$1 = (StepRecycleAttrHelper$refreshWeekStatView$1) continuation;
            int i = stepRecycleAttrHelper$refreshWeekStatView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stepRecycleAttrHelper$refreshWeekStatView$1.label = i - Integer.MIN_VALUE;
            } else {
                stepRecycleAttrHelper$refreshWeekStatView$1 = new StepRecycleAttrHelper$refreshWeekStatView$1(this, continuation);
            }
        } else {
            stepRecycleAttrHelper$refreshWeekStatView$1 = new StepRecycleAttrHelper$refreshWeekStatView$1(this, continuation);
        }
        Object obj = stepRecycleAttrHelper$refreshWeekStatView$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stepRecycleAttrHelper$refreshWeekStatView$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                list4 = (List) stepRecycleAttrHelper$refreshWeekStatView$1.L$6;
                list3 = (List) stepRecycleAttrHelper$refreshWeekStatView$1.L$5;
                LocalDate localDate13 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$4;
                LocalDate localDate14 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$3;
                LocalDate localDate15 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$2;
                LocalDate localDate16 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$1;
                stepRecycleAttrHelper = (StepRecycleAttrHelper) stepRecycleAttrHelper$refreshWeekStatView$1.L$0;
                ResultKt.throwOnFailure(obj);
                localDate8 = localDate13;
                localDate7 = localDate14;
                localDate6 = localDate15;
                localDate5 = localDate16;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list4 = (List) stepRecycleAttrHelper$refreshWeekStatView$1.L$6;
                list3 = (List) stepRecycleAttrHelper$refreshWeekStatView$1.L$5;
                localDate12 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$4;
                localDate11 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$3;
                localDate10 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$2;
                localDate9 = (LocalDate) stepRecycleAttrHelper$refreshWeekStatView$1.L$1;
                stepRecycleAttrHelper2 = (StepRecycleAttrHelper) stepRecycleAttrHelper$refreshWeekStatView$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            stepRecycleAttrHelper = stepRecycleAttrHelper2;
            localDate8 = localDate12;
            localDate7 = localDate11;
            localDate6 = localDate10;
            localDate5 = localDate9;
            stepDistanceViewI = stepRecycleAttrHelper.i();
            if (stepDistanceViewI != null) {
                stepDistanceViewI.u(localDate5, localDate6, localDate7, localDate8, list3, list4);
            }
            stepFloorViewJ = stepRecycleAttrHelper.j();
            if (stepFloorViewJ != null) {
                stepFloorViewJ.u(localDate5, localDate6, localDate7, localDate8, list3, list4);
            }
            stepRecycleAttrHelper.z();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        a7b.f(TAG, "refreshStepTrentView");
        StepTrentView stepTrentViewN = n();
        if (stepTrentViewN != null) {
            stepRecycleAttrHelper$refreshWeekStatView$1.L$0 = this;
            localDate5 = localDate;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$1 = localDate5;
            localDate6 = localDate2;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$2 = localDate6;
            localDate7 = localDate3;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$3 = localDate7;
            localDate8 = localDate4;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$4 = localDate8;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$5 = list;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$6 = list2;
            stepRecycleAttrHelper$refreshWeekStatView$1.label = 1;
            if (stepTrentViewN.B(localDate, localDate2, localDate3, localDate4, list, list2, stepRecycleAttrHelper$refreshWeekStatView$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            localDate5 = localDate;
            localDate6 = localDate2;
            localDate7 = localDate3;
            localDate8 = localDate4;
        }
        list3 = list;
        stepRecycleAttrHelper = this;
        list4 = list2;
        StepReachGoalView stepReachGoalViewG = stepRecycleAttrHelper.g();
        if (stepReachGoalViewG != null) {
            stepRecycleAttrHelper$refreshWeekStatView$1.L$0 = stepRecycleAttrHelper;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$1 = localDate5;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$2 = localDate6;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$3 = localDate7;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$4 = localDate8;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$5 = list3;
            stepRecycleAttrHelper$refreshWeekStatView$1.L$6 = list4;
            stepRecycleAttrHelper$refreshWeekStatView$1.label = 2;
            if (stepReachGoalViewG.M(localDate5, localDate6, localDate7, localDate8, list3, list4, stepRecycleAttrHelper$refreshWeekStatView$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            localDate9 = localDate5;
            stepRecycleAttrHelper2 = stepRecycleAttrHelper;
            localDate10 = localDate6;
            localDate11 = localDate7;
            localDate12 = localDate8;
            stepRecycleAttrHelper = stepRecycleAttrHelper2;
            localDate8 = localDate12;
            localDate7 = localDate11;
            localDate6 = localDate10;
            localDate5 = localDate9;
        }
        stepDistanceViewI = stepRecycleAttrHelper.i();
        if (stepDistanceViewI != null) {
            stepDistanceViewI.u(localDate5, localDate6, localDate7, localDate8, list3, list4);
        }
        stepFloorViewJ = stepRecycleAttrHelper.j();
        if (stepFloorViewJ != null) {
            stepFloorViewJ.u(localDate5, localDate6, localDate7, localDate8, list3, list4);
        }
        stepRecycleAttrHelper.z();
        return Unit.INSTANCE;
    }

    public final void u() {
        Iterator<e7c> it = this.viewList.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof com.heytap.health.step.detail.ui.stephistory2.detailitem.b) {
                it.remove();
                return;
            }
        }
    }

    public final void v() {
        a7b.f(TAG, "removeStepPermView");
        hsi hsiVarK = k();
        if (hsiVarK != null) {
            int iIndexOf = this.viewList.indexOf(hsiVarK);
            this.viewList.remove(iIndexOf);
            MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
            if (multiLayoutAdapter != null) {
                multiLayoutAdapter.notifyItemRemoved(iIndexOf);
            }
        }
    }

    public final void w(@Nullable Context context, @Nullable Function0<Unit> onAgreePerm) {
        a7b.f(TAG, "requestPermission");
        if (context == null) {
            return;
        }
        PermissionRequestDialog permissionRequestDialogX = new PermissionRequestDialog.b((AppCompatActivity) context, 5).t(new String[]{"android.permission.ACTIVITY_RECOGNITION"}).r(new c(onAgreePerm)).x();
        this.dialog = permissionRequestDialogX;
        a7b.f(TAG, "requestPermission:" + permissionRequestDialogX);
    }

    public final void y() {
        List<e7c> list = this.viewList;
        Context context = this.context;
        Intrinsics.checkNotNull(context);
        list.add(0, new f(context, this.cardMode));
    }

    public final void z() {
        List<? extends e7c> data;
        a7b.f(TAG, "stepRecycler startAnimator");
        MultiLayoutAdapter multiLayoutAdapter = this.multiLayoutAdapter;
        if (multiLayoutAdapter == null || (data = multiLayoutAdapter.getData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof BaseItemView) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BaseItemView) it.next()).o();
        }
    }
}
