package com.coui.appcompat.dialog;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import com.coui.appcompat.buttonBar.COUIButtonBarLayout;
import com.coui.appcompat.dialog.widget.COUIAlertDialogMaxLinearLayout;
import com.coui.appcompat.dialog.widget.COUIAlertDialogMaxScrollView;
import com.coui.appcompat.dialog.widget.COUIMaxHeightNestedScrollView;
import com.coui.appcompat.grid.COUIResponsiveUtils;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.coui.appcompat.statement.COUIMaxHeightScrollView;
import com.coui.appcompat.uiutil.AnimLevel;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.jf2;
import com.oplus.aiunit.vision.k3j;
import com.oplus.aiunit.vision.la3;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.of2;
import com.oplus.aiunit.vision.qa0;
import com.oplus.aiunit.vision.wi2;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$color;
import com.support.dialog.R$dimen;
import com.support.dialog.R$id;
import com.support.dialog.R$style;
import com.support.dialog.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIAlertDialogBuilder extends AlertDialog.Builder {
    public static final int W = R.attr.alertDialogStyle;
    public static final int X = R$style.AlertDialogBuildStyle;
    public static final int Y = R$style.Animation_COUI_Dialog_Alpha;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public Configuration H;
    public boolean I;
    public int J;
    public boolean K;
    public Drawable L;
    public String M;
    public CharSequence N;
    public int O;
    public int Q;
    public boolean R;
    public jf2 S;
    public boolean T;
    public int U;
    public ComponentCallbacks V;
    public AlertDialog a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1681c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1682e;
    public int f;
    public boolean g;
    public CharSequence[] h;
    public CharSequence[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DialogInterface.OnClickListener f1683j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1684l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1685n;
    public boolean o;
    public wi2 p;
    public boolean q;
    public View r;
    public int s;
    public la3 t;
    public boolean u;
    public View v;
    public int[] w;
    public Point x;
    public Point y;
    public int z;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @RequiresApi(api = 29)
        public void onViewAttachedToWindow(View view) {
            COUIAlertDialogBuilder.this.v();
            try {
                COUIAlertDialogBuilder.this.u(view);
            } catch (Exception e2) {
                Log.e("COUIAlertDialogBuilder", "operateBlur error message:" + e2.getMessage());
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            COUIAlertDialogBuilder.this.w();
            COUIAlertDialogBuilder.this.S.k();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class b implements COUIMaxHeightNestedScrollView.b {
        public final /* synthetic */ ViewGroup a;

        public b(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // com.coui.appcompat.dialog.widget.COUIMaxHeightNestedScrollView.b
        public void onChange() {
            this.a.setPadding(0, COUIAlertDialogBuilder.this.getContext().getResources().getDimensionPixelOffset(R$dimen.bottom_dialog_scroll_padding_top), 0, COUIAlertDialogBuilder.this.getContext().getResources().getDimensionPixelOffset(R$dimen.bottom_dialog_scroll_padding_bottom));
        }
    }

    public class c implements View.OnTouchListener {
        public final /* synthetic */ COUIMaxHeightScrollView i;

        public c(COUIMaxHeightScrollView cOUIMaxHeightScrollView) {
            this.i = cOUIMaxHeightScrollView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.i.getHeight() < this.i.getMaxHeight();
        }
    }

    public class d implements ComponentCallbacks {
        public d() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NonNull Configuration configuration) {
            if (COUIAlertDialogBuilder.this.E) {
                COUIAlertDialogBuilder.this.H = configuration;
                COUIAlertDialogBuilder.this.b0(configuration);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    public static class e implements View.OnTouchListener {
        public final Dialog i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f1687j;

        public e(Dialog dialog) {
            this.i = dialog;
            this.f1687j = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            View viewFindViewById = view.findViewById(R$id.parentPanel);
            if (viewFindViewById == null) {
                bj2.c("COUIAlertDialogBuilder", "parentPanel is null; Need to check whether the application has a layout that covers the coui's");
                return this.i.onTouchEvent(motionEvent);
            }
            if (new RectF(viewFindViewById.getLeft() + viewFindViewById.getPaddingLeft(), viewFindViewById.getTop() + viewFindViewById.getPaddingTop(), viewFindViewById.getRight() - viewFindViewById.getPaddingRight(), viewFindViewById.getBottom() - viewFindViewById.getPaddingBottom()).contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            if (motionEvent.getAction() == 1) {
                motionEventObtain.setAction(4);
            }
            view.performClick();
            boolean zOnTouchEvent = this.i.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return zOnTouchEvent;
        }
    }

    public COUIAlertDialogBuilder(@NonNull Context context) {
        this(context, R$style.COUIAlertDialog_BottomWarning);
    }

    public static Context wrapColorContext(@NonNull Context context, int i, int i2) {
        return new ContextThemeWrapper(new ContextThemeWrapper(context, i), i2);
    }

    public COUIAlertDialogBuilder A(Drawable drawable) {
        this.L = drawable;
        return this;
    }

    public final void B() {
        if (this.K) {
            if (this.L != null) {
                View viewFindViewById = this.a.findViewById(R$id.customImageview);
                if (viewFindViewById instanceof COUIRoundImageView) {
                    COUIRoundImageView cOUIRoundImageView = (COUIRoundImageView) viewFindViewById;
                    if (cOUIRoundImageView != null) {
                        cOUIRoundImageView.setImageDrawable(this.L);
                        cOUIRoundImageView.setVisibility(0);
                    }
                } else {
                    bj2.c("COUIAlertDialogBuilder", "customImageview is error; Need to check whether the application has a layout that covers the coui's");
                }
            }
            if (this.M != null) {
                View viewFindViewById2 = this.a.findViewById(R$id.customTitle);
                if (viewFindViewById2 instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById2;
                    if (textView != null) {
                        textView.setText(this.M);
                        textView.setVisibility(0);
                    }
                } else {
                    bj2.c("COUIAlertDialogBuilder", "customTitle is error; Need to check whether the application has a layout that covers the coui's");
                }
            }
            if (this.N != null) {
                View viewFindViewById3 = this.a.findViewById(R$id.customMessage);
                if (!(viewFindViewById3 instanceof TextView)) {
                    bj2.c("COUIAlertDialogBuilder", "customMessage is error; Need to check whether the application has a layout that covers the coui's");
                    return;
                }
                TextView textView2 = (TextView) viewFindViewById3;
                if (textView2 != null) {
                    textView2.setText(this.N);
                    textView2.setVisibility(0);
                }
            }
        }
    }

    public COUIAlertDialogBuilder C(CharSequence charSequence) {
        this.N = charSequence;
        return this;
    }

    public COUIAlertDialogBuilder D(String str) {
        this.M = str;
        return this;
    }

    public COUIAlertDialogBuilder E(boolean z) {
        this.R = z;
        return this;
    }

    public void F(boolean z) {
        this.u = z;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setItems(int i, DialogInterface.OnClickListener onClickListener) {
        this.h = getContext().getResources().getTextArray(i);
        this.f1683j = onClickListener;
        super.setItems(i, onClickListener);
        return this;
    }

    public COUIAlertDialogBuilder H(int i, DialogInterface.OnClickListener onClickListener, int[] iArr) {
        this.h = getContext().getResources().getTextArray(i);
        this.f1683j = onClickListener;
        this.w = iArr;
        super.setItems(i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        this.h = charSequenceArr;
        this.f1683j = onClickListener;
        super.setItems(charSequenceArr, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setMessage(int i) {
        this.f1684l = !TextUtils.isEmpty(getContext().getString(i));
        super.setMessage(i);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setMessage(CharSequence charSequence) {
        this.f1684l = !TextUtils.isEmpty(charSequence);
        super.setMessage(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        F(true);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(charSequence, onClickListener);
        F(true);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(i, onClickListener);
        F(true);
        return this;
    }

    public COUIAlertDialogBuilder O(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        super.setNeutralButton(i, onClickListener);
        F(true);
        if (z) {
            this.J = android.R.id.button3;
        }
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(charSequence, onClickListener);
        F(true);
        return this;
    }

    public COUIAlertDialogBuilder Q(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z) {
        super.setNeutralButton(charSequence, onClickListener);
        F(true);
        if (z) {
            this.J = android.R.id.button3;
        }
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        F(true);
        return this;
    }

    public COUIAlertDialogBuilder S(int i, DialogInterface.OnClickListener onClickListener, boolean z) {
        super.setPositiveButton(i, onClickListener);
        F(true);
        if (z) {
            this.J = android.R.id.button1;
        }
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(charSequence, onClickListener);
        F(true);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        this.m = listAdapter != null;
        super.setSingleChoiceItems(listAdapter, i, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setTitle(int i) {
        this.k = !TextUtils.isEmpty(getContext().getString(i));
        super.setTitle(i);
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setTitle(CharSequence charSequence) {
        this.k = !TextUtils.isEmpty(charSequence);
        super.setTitle(charSequence);
        return this;
    }

    public COUIAlertDialogBuilder X(int i) {
        this.b = i;
        return this;
    }

    public final void Y(@NonNull Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = this.s;
        if (i > 0) {
            attributes.type = i;
        }
        window.setAttributes(attributes);
    }

    public final void Z(@NonNull Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = q() ? -2 : Math.min(ifk.m(getContext()), this.d);
        window.setAttributes(attributes);
    }

    public final void a0(Configuration configuration) {
        if (r(configuration)) {
            this.F = true;
            this.a.getWindow().setGravity(17);
            this.a.getWindow().setWindowAnimations(Y);
        } else {
            this.F = false;
            this.a.getWindow().setGravity(this.b);
            this.a.getWindow().setWindowAnimations(this.f1681c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    public void b0(Configuration configuration) {
        View viewFindViewById;
        View viewFindViewById2;
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            int i = this.O;
            int i2 = configuration.screenWidthDp;
            if (i == i2 || i2 != alertDialog.getContext().getResources().getConfiguration().screenWidthDp) {
                int i3 = this.Q;
                int i4 = configuration.screenHeightDp;
                if (i3 != i4 && i4 == this.a.getContext().getResources().getConfiguration().screenHeightDp) {
                    if (this.k) {
                        viewFindViewById2 = this.a.findViewById(R$id.alert_title_scroll_view);
                        if (viewFindViewById2 instanceof COUIMaxHeightScrollView) {
                            ((COUIMaxHeightScrollView) viewFindViewById2).setMaxHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_builder_title_scroll_max_height));
                        } else {
                            bj2.c("COUIAlertDialogBuilder", "alert_title_scroll_view is error; Need to check whether the application has a layout that covers the coui's");
                        }
                    }
                    if (this.f1684l) {
                        viewFindViewById = this.a.findViewById(R$id.scrollView);
                        if (viewFindViewById instanceof COUIMaxHeightNestedScrollView) {
                            ((COUIMaxHeightNestedScrollView) viewFindViewById).setMaxHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_builder_content_max_height));
                        } else {
                            bj2.c("COUIAlertDialogBuilder", "scrollView is error; Need to check whether the application has a layout that covers the coui's");
                        }
                    }
                }
            } else {
                if (this.k) {
                    viewFindViewById2 = this.a.findViewById(R$id.alert_title_scroll_view);
                    if (viewFindViewById2 instanceof COUIMaxHeightScrollView) {
                        ((COUIMaxHeightScrollView) viewFindViewById2).setMaxHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_builder_title_scroll_max_height));
                    } else {
                        bj2.c("COUIAlertDialogBuilder", "alert_title_scroll_view is error; Need to check whether the application has a layout that covers the coui's");
                    }
                }
                if (this.f1684l) {
                    viewFindViewById = this.a.findViewById(R$id.scrollView);
                    if (viewFindViewById instanceof COUIMaxHeightNestedScrollView) {
                        ((COUIMaxHeightNestedScrollView) viewFindViewById).setMaxHeight(getContext().getResources().getDimensionPixelSize(R$dimen.coui_alert_dialog_builder_content_max_height));
                    } else {
                        bj2.c("COUIAlertDialogBuilder", "scrollView is error; Need to check whether the application has a layout that covers the coui's");
                    }
                }
            }
            this.O = configuration.screenWidthDp;
            this.Q = configuration.screenHeightDp;
            if (!q()) {
                if (this.F != r(configuration)) {
                    a0(configuration);
                }
                Z(this.a.getWindow());
                return;
            }
            this.x = null;
            this.v = null;
            if (this.r != null) {
                View viewFindViewById3 = this.a.getWindow().findViewById(R$id.custom);
                if (viewFindViewById3 instanceof FrameLayout) {
                    ((FrameLayout) viewFindViewById3).removeView(this.r);
                } else {
                    bj2.c("COUIAlertDialogBuilder", "custom is error; Need to check whether the application has a layout that covers the coui's");
                }
            }
            this.a.dismiss();
            show();
        }
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    @NonNull
    public AlertDialog create() {
        initCustomPanel();
        initAdapter();
        AlertDialog alertDialogCreate = super.create();
        this.a = alertDialogCreate;
        initWindow(alertDialogCreate.getWindow());
        return this.a;
    }

    public final void disabledTitleScroll(AlertDialog alertDialog) {
        View viewFindViewById = alertDialog.findViewById(R$id.alert_title_scroll_view);
        if (!(viewFindViewById instanceof COUIMaxHeightScrollView)) {
            bj2.c("COUIAlertDialogBuilder", "alert_title_scroll_view is error; Need to check whether the application has a layout that covers the coui's");
        } else {
            COUIMaxHeightScrollView cOUIMaxHeightScrollView = (COUIMaxHeightScrollView) viewFindViewById;
            cOUIMaxHeightScrollView.setOnTouchListener(new c(cOUIMaxHeightScrollView));
        }
    }

    @NonNull
    public AlertDialog g(View view, int i, int i2) {
        return i(view, i, i2, 0, 0);
    }

    @NonNull
    public AlertDialog h(View view, Point point) {
        return g(view, point.x, point.y);
    }

    @NonNull
    public AlertDialog i(View view, int i, int i2, int i3, int i4) {
        if (t(getContext().getResources().getConfiguration())) {
            this.v = view;
            if (i != 0 || i2 != 0) {
                Point point = new Point();
                this.x = point;
                point.set(i, i2);
            }
            if (i3 != 0 || i4 != 0) {
                Point point2 = new Point();
                this.y = point2;
                point2.set(i3, i4);
            }
        }
        return create();
    }

    public void initAdapter() {
        wi2 wi2Var = this.p;
        if (wi2Var != null) {
            wi2Var.e((this.k || this.f1684l) ? false : true);
            this.p.d((this.q || this.u) ? false : true);
        }
        la3 la3Var = this.t;
        if (la3Var != null) {
            la3Var.n((this.k || this.f1684l) ? false : true);
            this.t.m((this.q || this.u) ? false : true);
        }
        if (this.m) {
            return;
        }
        CharSequence[] charSequenceArr = this.h;
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            setAdapter(new k3j(getContext(), (this.k || this.f1684l) ? false : true, (this.q || this.u) ? false : true, this.h, this.i, this.w), this.f1683j);
        }
    }

    public final void initAttrs() {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUIAlertDialogBuilder, W, X);
        this.b = typedArrayObtainStyledAttributes.getInt(R$styleable.COUIAlertDialogBuilder_android_gravity, 17);
        this.f1681c = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIAlertDialogBuilder_windowAnimStyle, Y);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIAlertDialogBuilder_contentMaxWidth, 0);
        this.f1682e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIAlertDialogBuilder_contentMaxHeight, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.COUIAlertDialogBuilder_customContentLayout, 0);
        this.g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIAlertDialogBuilder_isNeedToAdaptMessageAndList, false);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIAlertDialogBuilder_isTinyDialog, false);
        this.f1685n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIAlertDialogBuilder_hasLoading, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIAlertDialogBuilder_isAssignMentLayout, false);
        this.G = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIAlertDialogBuilder_isForceCenterStyleInLargeScreen, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIAlertDialogBuilder_isCustomStyle, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void initContentMaxWidth(@NonNull Window window) {
        if (this.d <= 0) {
            return;
        }
        View viewFindViewById = window.findViewById(R$id.parentPanel);
        if (viewFindViewById instanceof COUIAlertDialogMaxLinearLayout) {
            ((COUIAlertDialogMaxLinearLayout) viewFindViewById).setMaxWidth(this.d);
        } else if (viewFindViewById instanceof COUIAlertDialogMaxScrollView) {
            ((COUIAlertDialogMaxScrollView) viewFindViewById).setMaxWidth(this.d);
        } else {
            bj2.c("COUIAlertDialogBuilder", "parentPanel is error; Need to check whether the application has a layout that covers the coui's");
        }
    }

    public final void initCustomPanel() {
        int i;
        if (this.q || (i = this.f) == 0) {
            return;
        }
        setView(i);
    }

    public final void initCustomPanelVisibility(@NonNull Window window) {
        int dimensionPixelOffset;
        if (this.q) {
            View viewFindViewById = window.findViewById(R$id.customPanel);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = window.findViewById(R$id.custom);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(0);
            }
            if (this.f1685n || this.f1684l) {
                return;
            }
            if (this.k) {
                dimensionPixelOffset = !this.o ? getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_customer_layout_imageview_margin_top) : 0;
            } else {
                dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_builder_customstyle_padding_top_withouttitle);
            }
            viewFindViewById2.setPaddingRelative(viewFindViewById2.getPaddingStart(), dimensionPixelOffset, viewFindViewById2.getPaddingEnd(), this.o ? getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_customer_layout_imageview_margin_bottom) : 0);
        }
    }

    public final void initListPanel(@NonNull Window window) {
        View viewFindViewById = window.findViewById(R$id.listPanel);
        if (!(viewFindViewById instanceof ViewGroup)) {
            bj2.c("COUIAlertDialogBuilder", "listPanel is error; Need to check whether the application has a layout that covers the coui's");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        AlertDialog alertDialog = this.a;
        ListView listView = alertDialog != null ? alertDialog.getListView() : null;
        if (listView != null) {
            listView.setScrollIndicators(0);
        }
        boolean z = (viewGroup == null || listView == null) ? false : true;
        if (z) {
            if (listView.getParent() != null && (listView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) listView.getParent()).removeView(listView);
            }
            viewGroup.addView(listView, new ViewGroup.LayoutParams(-1, -1));
        }
        ViewGroup viewGroup2 = (ViewGroup) window.findViewById(R$id.scrollView);
        if (viewGroup2 != null) {
            viewGroup2.setScrollIndicators(0);
            if (this.g && z) {
                setViewHorizontalWeight(viewGroup2, 1);
                setViewHorizontalWeight(viewGroup, 1);
            }
            if (!(viewGroup2 instanceof COUIMaxHeightNestedScrollView)) {
                bj2.c("COUIAlertDialogBuilder", "scrollView isn't instanceof COUIMaxHeightNestedScrollView; Need to check whether the application has a layout that covers the coui's");
                return;
            }
            boolean zC = qa0.c(getContext());
            if (this.m && !zC) {
                ((COUIMaxHeightNestedScrollView) viewGroup2).setMaxHeight(getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_builder_content_max_height_with_adapter));
            }
            if (window.getAttributes().gravity == 80 && this.f1684l) {
                if (this.f1685n || this.C) {
                    ((COUIMaxHeightNestedScrollView) viewGroup2).setConfigChangeListener(new b(viewGroup2));
                }
            }
        }
    }

    public final void initSingleContentPadding(@NonNull Window window) {
        View viewFindViewById = window.findViewById(R$id.buttonPanel);
        CharSequence[] charSequenceArr = this.h;
        boolean z = this.k || this.f1684l || this.q || this.m || (charSequenceArr != null && charSequenceArr.length > 0);
        if (this.C) {
            if (viewFindViewById == null || z) {
                return;
            }
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), getContext().getResources().getDimensionPixelOffset(R$dimen.coui_tiny_dialog_btn_bar_padding_vertical), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
            return;
        }
        if (!(viewFindViewById instanceof COUIButtonBarLayout)) {
            bj2.c("COUIAlertDialogBuilder", "buttonPanel is error; Need to check whether the application has a layout that covers the coui's");
            return;
        }
        COUIButtonBarLayout cOUIButtonBarLayout = (COUIButtonBarLayout) viewFindViewById;
        cOUIButtonBarLayout.setRecommendButtonId(this.J);
        cOUIButtonBarLayout.setDynamicLayout(this.B);
        cOUIButtonBarLayout.setShowDividerWhenHasItems(this.h != null);
    }

    public final void initWindow(@NonNull Window window) {
        if (q()) {
            of2.c(window, this.v, this.x, this.y);
            window.getDecorView().setVisibility(4);
        } else {
            Configuration configuration = this.H;
            if (configuration == null) {
                configuration = window.getContext().getResources().getConfiguration();
            }
            a0(configuration);
        }
        window.getDecorView().setOnTouchListener(new e(this.a));
        Y(window);
        Z(window);
    }

    public final void j(@NonNull Context context) {
        jf2 jf2Var = new jf2(context);
        this.S = jf2Var;
        jf2Var.r(ifk.a(lh2.h(getContext(), R$color.coui_dialog_list_mix_blur_light)));
        this.S.q(ifk.a(lh2.h(getContext(), R$color.coui_dialog_list_mix_blur_dark)));
        this.S.m(ifk.a(lh2.h(getContext(), R$color.coui_dialog_list_blend_blur_light)));
        this.S.l(ifk.a(lh2.h(getContext(), R$color.coui_dialog_list_blend_blur_dark)));
    }

    public final void k() {
        this.a.getWindow().getDecorView().addOnAttachStateChangeListener(new a());
    }

    public final void l(View view) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public final void m(@NonNull Window window) {
        if (this.f1682e <= 0) {
            return;
        }
        View viewFindViewById = window.findViewById(R$id.parentPanel);
        if (viewFindViewById instanceof COUIAlertDialogMaxLinearLayout) {
            ((COUIAlertDialogMaxLinearLayout) viewFindViewById).setMaxHeight(this.f1682e);
        } else if (viewFindViewById instanceof COUIAlertDialogMaxScrollView) {
            ((COUIAlertDialogMaxScrollView) viewFindViewById).setMaxHeight(this.f1682e);
        } else {
            bj2.c("COUIAlertDialogBuilder", "parentPanel is error; Need to check whether the application has a layout that covers the coui's");
        }
    }

    public final void n() {
        AlertDialog alertDialog = this.a;
        if (alertDialog == null) {
            return;
        }
        int i = R$id.scrollView;
        View viewFindViewById = alertDialog.findViewById(i);
        View viewFindViewById2 = this.a.getWindow().findViewById(R$id.parentPanel);
        if (!(viewFindViewById2 instanceof COUIAlertDialogMaxLinearLayout)) {
            bj2.c("COUIAlertDialogBuilder", "parentPanel is error; Need to check whether the application has a layout that covers the coui's");
            return;
        }
        COUIAlertDialogMaxLinearLayout cOUIAlertDialogMaxLinearLayout = (COUIAlertDialogMaxLinearLayout) viewFindViewById2;
        cOUIAlertDialogMaxLinearLayout.setHasLoading(this.f1685n);
        cOUIAlertDialogMaxLinearLayout.setIsTiny(this.C);
        cOUIAlertDialogMaxLinearLayout.setSupportDynamicMarginTop(this.T);
        if (this.v != null) {
            this.U = 0;
        }
        cOUIAlertDialogMaxLinearLayout.setCustomDialogPaddingBottom(this.U);
        if (!this.C && !this.f1685n && this.f1684l && viewFindViewById != null) {
            if (this.k && this.o) {
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), 0, viewFindViewById.getPaddingRight(), getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_scroll_padding_bottom_message_has_title_in_assignment));
            }
            if (!this.C && !this.o) {
                cOUIAlertDialogMaxLinearLayout.setNeedSetPaddingLayoutId(i);
            }
        }
        cOUIAlertDialogMaxLinearLayout.setHasMessageMerge(this.R);
    }

    public final void o(@NonNull Window window) {
        if (this.C || this.f1685n) {
            return;
        }
        View viewFindViewById = window.findViewById(R$id.title_template);
        if (viewFindViewById == null || !(viewFindViewById instanceof LinearLayout)) {
            bj2.c("COUIAlertDialogBuilder", "title_template is error; Need to check whether the application has a layout that covers the coui's");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
        layoutParams.topMargin = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_no_message_alert_dialog_title_margin_top);
        layoutParams.bottomMargin = getContext().getResources().getDimensionPixelOffset(R$dimen.coui_no_message_alert_dialog_title_margin_bottom);
        viewFindViewById.setLayoutParams(layoutParams);
        p(window, window.findViewById(R$id.alert_title_scroll_view));
        l(window.findViewById(R$id.alertTitle));
    }

    public final void p(@NonNull Window window, View view) {
        if (view == null || !(view instanceof COUIMaxHeightScrollView)) {
            bj2.c("COUIAlertDialogBuilder", "alert_title_scroll_view is error; Need to check whether the application has a layout that covers the coui's");
            return;
        }
        COUIMaxHeightScrollView cOUIMaxHeightScrollView = (COUIMaxHeightScrollView) view;
        cOUIMaxHeightScrollView.setMinHeight((window.getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_builder_title_scroll_min_height) - getContext().getResources().getDimensionPixelOffset(R$dimen.coui_no_message_alert_dialog_title_margin_top)) - getContext().getResources().getDimensionPixelOffset(R$dimen.coui_no_message_alert_dialog_title_margin_bottom));
        cOUIMaxHeightScrollView.setFillViewport(true);
        View viewFindViewById = window.findViewById(R$id.parentPanel);
        if (!(viewFindViewById instanceof COUIAlertDialogMaxLinearLayout)) {
            bj2.c("COUIAlertDialogBuilder", "parentPanelView is error; Need to check whether the application has a layout that covers the coui's");
            return;
        }
        COUIAlertDialogMaxLinearLayout cOUIAlertDialogMaxLinearLayout = (COUIAlertDialogMaxLinearLayout) viewFindViewById;
        if (!this.f1684l) {
            cOUIAlertDialogMaxLinearLayout.setNeedMinHeight(window.getContext().getResources().getDimensionPixelOffset(R$dimen.coui_alert_dialog_builder_parent_panel_min_height_normal));
        }
        cOUIAlertDialogMaxLinearLayout.setNeedReMeasureLayoutId(cOUIMaxHeightScrollView.getId());
    }

    public final boolean q() {
        return (this.v == null && this.x == null) ? false : true;
    }

    public final boolean r(Configuration configuration) {
        return s(configuration) && this.G;
    }

    public final boolean s(Configuration configuration) {
        int iQ = configuration.screenWidthDp;
        int iQ2 = configuration.screenHeightDp;
        if (this.I) {
            iQ = ifk.q(getContext(), ifk.n(getContext()));
            iQ2 = ifk.q(getContext(), ifk.k(getContext()));
        }
        return COUIResponsiveUtils.isLargePadWindow(getContext(), iQ, iQ2);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog.Builder setView(int i) {
        this.q = true;
        return super.setView(i);
    }

    public final void setViewHorizontalWeight(View view, int i) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams.height = 0;
            ((LinearLayout.LayoutParams) layoutParams).weight = i;
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog show() {
        AlertDialog alertDialogShow = super.show();
        disabledTitleScroll(alertDialogShow);
        updateViewAfterShown();
        return alertDialogShow;
    }

    public final boolean t(Configuration configuration) {
        if (this.A) {
            return true;
        }
        return !COUIResponsiveUtils.isSmallScreenDp(configuration.screenWidthDp);
    }

    public final void u(View view) {
        if (!view.isHardwareAccelerated()) {
            bj2.c("COUIAlertDialogBuilder", "Hardware accelerate is disabled! Set background blur failed.");
            return;
        }
        if (this.S.y()) {
            View viewFindViewById = this.a.getWindow().findViewById(R$id.rootView);
            View viewFindViewById2 = this.a.getWindow().findViewById(R$id.parentPanel);
            this.S.u(viewFindViewById);
            this.S.s(view);
            if (viewFindViewById2 instanceof COUIAlertDialogMaxLinearLayout) {
                ((COUIAlertDialogMaxLinearLayout) viewFindViewById2).setBlurBackgroundWindow(this.S.y());
            } else {
                bj2.c("COUIAlertDialogBuilder", "operateBlur: parentPanel is not COUIAlertDialogMaxLinearLayout");
            }
            int i = R$attr.couiRoundCornerXXLWeight;
            if (this.f1685n) {
                i = R$attr.couiRoundCornerMWeight;
            }
            if (byf.e()) {
                this.S.t(lh2.e(getContext(), i));
            }
            int i2 = R$attr.couiRoundCornerXXLRadius;
            if (this.f1685n) {
                i2 = R$attr.couiRoundCornerMRadius;
            }
            float fC = lh2.c(getContext(), i2);
            if (this.C) {
                this.S.p(fC, fC, 0.0f, 0.0f);
            } else {
                this.S.o(fC);
            }
            this.S.e();
        }
    }

    public void updateViewAfterShown() {
        AlertDialog alertDialog = this.a;
        if (alertDialog == null) {
            return;
        }
        o(alertDialog.getWindow());
        n();
        initCustomPanelVisibility(this.a.getWindow());
        initListPanel(this.a.getWindow());
        initContentMaxWidth(this.a.getWindow());
        m(this.a.getWindow());
        initSingleContentPadding(this.a.getWindow());
        B();
        k();
        Z(this.a.getWindow());
    }

    public final void v() {
        getContext().registerComponentCallbacks(this.V);
    }

    public final void w() {
        if (this.V != null) {
            getContext().unregisterComponentCallbacks(this.V);
        }
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public COUIAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.m = listAdapter != null;
        if (listAdapter instanceof wi2) {
            this.p = (wi2) listAdapter;
        }
        super.setAdapter(listAdapter, onClickListener);
        return this;
    }

    public COUIAlertDialogBuilder y(boolean z) {
        z(z, ifk.ANIM_LEVEL_SUPPORT_BLUR_MIN);
        return this;
    }

    public COUIAlertDialogBuilder z(boolean z, AnimLevel animLevel) {
        this.S.v(z, animLevel);
        return this;
    }

    public COUIAlertDialogBuilder(@NonNull Context context, int i) {
        super(new ContextThemeWrapper(context, i));
        this.k = false;
        this.f1684l = false;
        this.m = false;
        this.f1685n = false;
        this.o = false;
        this.p = null;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.u = false;
        this.v = null;
        this.x = null;
        this.y = null;
        this.z = -1;
        this.B = true;
        this.C = false;
        this.E = true;
        this.G = false;
        this.I = false;
        this.J = -1;
        this.K = false;
        this.R = false;
        this.T = false;
        this.V = new d();
        this.D = i;
        initAttrs();
        j(context);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog.Builder setView(View view) {
        this.q = true;
        this.r = view;
        return super.setView(view);
    }

    public COUIAlertDialogBuilder(@NonNull Context context, int i, int i2) {
        super(wrapColorContext(context, i, i2));
        this.k = false;
        this.f1684l = false;
        this.m = false;
        this.f1685n = false;
        this.o = false;
        this.p = null;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.u = false;
        this.v = null;
        this.x = null;
        this.y = null;
        this.z = -1;
        this.B = true;
        this.C = false;
        this.E = true;
        this.G = false;
        this.I = false;
        this.J = -1;
        this.K = false;
        this.R = false;
        this.T = false;
        this.V = new d();
        initAttrs();
        j(context);
    }
}
