package com.heytap.health.base.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.R$styleable;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ejg;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 C2\u00020\u0001:\u0002DEB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b>\u0010?B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b>\u0010@B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010A\u001a\u00020\b¢\u0006\u0004\b>\u0010BJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014J0\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\fJ\u000e\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\fJ\b\u0010&\u001a\u00020\u0006H\u0002J\b\u0010'\u001a\u00020\fH\u0002R \u0010+\u001a\f\u0012\b\u0012\u00060)R\u00020\u00000(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010*R\u001c\u0010-\u001a\b\u0018\u00010)R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010,R\u0016\u00100\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010$\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00106R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00106R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00106¨\u0006F"}, d2 = {"Lcom/heytap/health/base/view/FlowLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", b2n.g, "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "", "changed", "p1", "p2", "p3", "p4", "onLayout", "", "mHorizontalSpacing", "setHorizontalSpacing", "mVerticalSpacing", "setVerticalSpacing", "mMaxLinesCount", "setMaxLinesCount", "ifAccordantTop", "setAccordantTop", "mNeedExpend", "setNeedExpend", "ifFillLayout", "setIfFillLayout", "mMaxChileEachLine", "setMaxChileEachLine", "mSequence", "setSequence", "ifCentre", "setCentre", "j", "i", "", "Lcom/heytap/health/base/view/FlowLayout$b;", "Ljava/util/List;", "lineList", "Lcom/heytap/health/base/view/FlowLayout$b;", "cLine", MapSchema.FIELD_NAME_KEY, UserInfo.SEX_FEMALE, "cUsedWidth", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "n", "I", "o", "Z", LogFieldKey.PROCESS_NAME_KEY, "q", "r", "s", "t", "u", "mNeedLayout", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class FlowLayout extends ViewGroup {

    @NotNull
    public static final String TAG = "FlowLayout";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<b> lineList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b cLine;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float cUsedWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float mHorizontalSpacing;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float mVerticalSpacing;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int mMaxLinesCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean ifAccordantTop;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int mMaxChileEachLine;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean mSequence;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean ifCentre;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public boolean mNeedExpend;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean ifFillLayout;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean mNeedLayout;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/base/view/FlowLayout$b;", "", "Landroid/view/View;", "view", "", "a", "", LogFieldKey.LEVEL_KEY, "t", "d", "I", "getMWidth", "()I", "setMWidth", "(I)V", "mWidth", "b", "setMHeight", "mHeight", "", "c", "Ljava/util/List;", "getViews", "()Ljava/util/List;", "setViews", "(Ljava/util/List;)V", "views", "viewCount", "<init>", "(Lcom/heytap/health/base/view/FlowLayout;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int mWidth;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int mHeight;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<View> views = new ArrayList();

        public b() {
        }

        public final void a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.views.add(view);
            this.mWidth += view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = this.mHeight;
            if (i >= measuredHeight) {
                measuredHeight = i;
            }
            this.mHeight = measuredHeight;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getMHeight() {
            return this.mHeight;
        }

        public final int c() {
            return this.views.size();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
        public final void d(int l2, int t) {
            float f;
            int iC = c();
            int measuredWidth = (FlowLayout.this.getMeasuredWidth() - FlowLayout.this.getPaddingLeft()) - FlowLayout.this.getPaddingRight();
            float f2 = iC - 1;
            float f3 = (measuredWidth - this.mWidth) - (FlowLayout.this.mHorizontalSpacing * f2);
            int i = FlowLayout.this.ifCentre ? (int) (f3 / 2) : l2;
            if (f3 < 0.0f) {
                if (iC == 1) {
                    View view = this.views.get(0);
                    view.layout(i, t, view.getMeasuredWidth() + i, view.getMeasuredHeight() + t);
                    return;
                }
                return;
            }
            float f4 = iC;
            for (int i2 = 0; i2 < iC; i2++) {
                View view2 = this.views.get(i2);
                int measuredWidth2 = view2.getMeasuredWidth();
                int measuredHeight = view2.getMeasuredHeight();
                int i3 = FlowLayout.this.ifAccordantTop ? 0 : (int) (((double) (this.mHeight - measuredHeight)) / 2.0d);
                if (i3 < 0) {
                    i3 = 0;
                }
                if (!FlowLayout.this.mNeedExpend || FlowLayout.this.mMaxChileEachLine == Integer.MAX_VALUE) {
                    if (FlowLayout.this.ifFillLayout && FlowLayout.this.mMaxChileEachLine != Integer.MAX_VALUE) {
                        f = (measuredWidth - (FlowLayout.this.mHorizontalSpacing * f2)) / f4;
                    }
                    view2.getLayoutParams().width = measuredWidth2;
                    view2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                    if (FlowLayout.this.mSequence) {
                        int i4 = i3 + t;
                        view2.layout(i, i4, i + measuredWidth2, measuredHeight + i4);
                    } else {
                        int i5 = measuredWidth - i;
                        int i6 = i3 + t;
                        view2.layout(i5 - measuredWidth2, i6, i5, measuredHeight + i6);
                    }
                    i += (int) (measuredWidth2 + FlowLayout.this.mHorizontalSpacing);
                } else {
                    f = (measuredWidth - (FlowLayout.this.mHorizontalSpacing * (FlowLayout.this.mMaxChileEachLine - 1))) / FlowLayout.this.mMaxChileEachLine;
                }
                measuredWidth2 = (int) f;
                view2.getLayoutParams().width = measuredWidth2;
                view2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                if (FlowLayout.this.mSequence) {
                    int i7 = i3 + t;
                    view2.layout(i, i7, i + measuredWidth2, measuredHeight + i7);
                } else {
                    int i8 = measuredWidth - i;
                    int i9 = i3 + t;
                    view2.layout(i8 - measuredWidth2, i9, i8, measuredHeight + i9);
                }
                i += (int) (measuredWidth2 + FlowLayout.this.mHorizontalSpacing);
            }
        }
    }

    public FlowLayout(@Nullable Context context) {
        this(context, null);
    }

    @SuppressLint({"Recycle", "CustomViewStyleable"})
    public final void h(@Nullable Context context, @Nullable AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context != null ? context.obtainStyledAttributes(attrs, R$styleable.lib_base_FlowLayout) : null;
        if (typedArrayObtainStyledAttributes != null) {
            setHorizontalSpacing(typedArrayObtainStyledAttributes.getFloat(R$styleable.lib_base_FlowLayout_horizontalSpacing, 5.0f));
            setVerticalSpacing(typedArrayObtainStyledAttributes.getFloat(R$styleable.lib_base_FlowLayout_verticalSpacing, 20.0f));
            this.mMaxChileEachLine = typedArrayObtainStyledAttributes.getInteger(R$styleable.lib_base_FlowLayout_maxChileEachLine, Integer.MAX_VALUE);
            this.mMaxLinesCount = typedArrayObtainStyledAttributes.getInteger(R$styleable.lib_base_FlowLayout_maxLinesCount, Integer.MAX_VALUE);
            this.ifAccordantTop = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_FlowLayout_ifAccordantTop, true);
            this.mNeedExpend = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_FlowLayout_needExpend, false);
            this.ifFillLayout = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_FlowLayout_ifFillLayout, false);
            this.mSequence = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_FlowLayout_sequence, true);
            this.ifCentre = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_base_FlowLayout_ifCentre, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        isInEditMode();
    }

    public final boolean i() {
        List<b> list = this.lineList;
        b bVar = this.cLine;
        Intrinsics.checkNotNull(bVar);
        list.add(bVar);
        if (this.lineList.size() >= this.mMaxLinesCount) {
            return false;
        }
        this.cLine = new b();
        this.cUsedWidth = 0.0f;
        return true;
    }

    public final void j() {
        this.lineList.clear();
        this.cLine = new b();
        this.cUsedWidth = 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int p1, int p2, int p3, int p4) {
        if (!this.mNeedLayout || changed) {
            this.mNeedLayout = false;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int size = this.lineList.size();
            for (int i = 0; i < size; i++) {
                b bVar = this.lineList.get(i);
                bVar.d(paddingLeft, paddingTop);
                paddingTop += (int) (bVar.getMHeight() + this.mVerticalSpacing);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int size = View.MeasureSpec.getSize(widthMeasureSpec) - paddingLeft;
        View.MeasureSpec.getSize(heightMeasureSpec);
        j();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View child = getChildAt(i2);
            if (child.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                child.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, paddingLeft, layoutParams.width), ViewGroup.getChildMeasureSpec(heightMeasureSpec, paddingTop, layoutParams.height));
                int measuredWidth = child.getMeasuredWidth();
                child.getMeasuredHeight();
                if (this.cLine == null) {
                    this.cLine = new b();
                }
                int i3 = this.mMaxChileEachLine;
                if (i3 != Integer.MAX_VALUE && ((this.mNeedExpend || this.ifFillLayout) && measuredWidth < (i = (int) ((size - (this.mHorizontalSpacing * (i3 - 1))) / i3)))) {
                    measuredWidth = i;
                }
                float f = measuredWidth;
                float f2 = this.cUsedWidth + f;
                this.cUsedWidth = f2;
                float f3 = size;
                if (f2 <= f3) {
                    b bVar = this.cLine;
                    Intrinsics.checkNotNull(bVar);
                    if (bVar.c() < this.mMaxChileEachLine) {
                        b bVar2 = this.cLine;
                        Intrinsics.checkNotNull(bVar2);
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        bVar2.a(child);
                        float f4 = this.cUsedWidth + this.mHorizontalSpacing;
                        this.cUsedWidth = f4;
                        if (f4 >= f3 && !i()) {
                            break;
                        }
                    }
                }
                b bVar3 = this.cLine;
                Intrinsics.checkNotNull(bVar3);
                if (bVar3.c() == 0) {
                    b bVar4 = this.cLine;
                    Intrinsics.checkNotNull(bVar4);
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    bVar4.a(child);
                    if (!i()) {
                        break;
                    }
                } else {
                    if (!i()) {
                        break;
                    }
                    b bVar5 = this.cLine;
                    Intrinsics.checkNotNull(bVar5);
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    bVar5.a(child);
                    this.cUsedWidth += f + this.mHorizontalSpacing;
                }
            }
        }
        b bVar6 = this.cLine;
        if (bVar6 != null) {
            Intrinsics.checkNotNull(bVar6);
            if (bVar6.c() > 0 && !CollectionsKt___CollectionsKt.contains(this.lineList, this.cLine)) {
                List<b> list = this.lineList;
                b bVar7 = this.cLine;
                Intrinsics.checkNotNull(bVar7);
                list.add(bVar7);
            }
        }
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        int size3 = this.lineList.size();
        int mHeight = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            mHeight += this.lineList.get(i4).getMHeight();
        }
        setMeasuredDimension(size2, View.resolveSize(mHeight + ((int) (this.mVerticalSpacing * (size3 - 1))) + paddingTop, heightMeasureSpec));
    }

    public final void setAccordantTop(boolean ifAccordantTop) {
        this.ifAccordantTop = ifAccordantTop;
    }

    public final void setCentre(boolean ifCentre) {
        this.ifCentre = ifCentre;
    }

    public final void setHorizontalSpacing(float mHorizontalSpacing) {
        this.mHorizontalSpacing = ejg.a(getContext(), mHorizontalSpacing);
    }

    public final void setIfFillLayout(boolean ifFillLayout) {
        this.ifFillLayout = ifFillLayout;
    }

    public final void setMaxChileEachLine(int mMaxChileEachLine) {
        this.mMaxChileEachLine = mMaxChileEachLine;
    }

    public final void setMaxLinesCount(int mMaxLinesCount) {
        this.mMaxLinesCount = mMaxLinesCount;
    }

    public final void setNeedExpend(boolean mNeedExpend) {
        this.mNeedExpend = mNeedExpend;
    }

    public final void setSequence(boolean mSequence) {
        this.mSequence = mSequence;
    }

    public final void setVerticalSpacing(float mVerticalSpacing) {
        this.mVerticalSpacing = ejg.a(getContext(), mVerticalSpacing);
    }

    public FlowLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public FlowLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineList = new ArrayList();
        this.mHorizontalSpacing = 5.0f;
        this.mVerticalSpacing = 5.0f;
        this.mMaxLinesCount = Integer.MAX_VALUE;
        this.ifAccordantTop = true;
        this.mMaxChileEachLine = Integer.MAX_VALUE;
        this.mSequence = true;
        this.mNeedLayout = true;
        h(context, attributeSet);
    }
}
