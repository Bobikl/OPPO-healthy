package com.heytap.nearx.uikit.internal.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ExpandableListAdapter;
import android.widget.HeterogeneousExpandableList;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.widget.NearExpandableListView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class b implements com.heytap.nearx.uikit.internal.widget.a {

    /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.b$b, reason: collision with other inner class name */
    public static class C0727b {
        public boolean a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7513c;

        public C0727b() {
            this.a = false;
            this.b = false;
            this.f7513c = 0;
        }
    }

    public static class c extends com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a {
        public NearExpandableListView a;
        public ExpandableListAdapter b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<C0727b> f7514c = new SparseArray<>();

        public class a implements Animation.AnimationListener {
            public final /* synthetic */ C0727b i;

            public a(C0727b c0727b) {
                this.i = c0727b;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C0727b c0727b = this.i;
                int i = c0727b.f7513c - 1;
                c0727b.f7513c = i;
                if (i <= 0) {
                    c0727b.f7513c = 0;
                    c0727b.a = false;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                this.i.f7513c++;
            }
        }

        /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.b$c$b, reason: collision with other inner class name */
        public class AnimationAnimationListenerC0728b implements Animation.AnimationListener {
            public final /* synthetic */ C0727b i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f7516j;

            public AnimationAnimationListenerC0728b(C0727b c0727b, int i) {
                this.i = c0727b;
                this.f7516j = i;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C0727b c0727b = this.i;
                int i = c0727b.f7513c - 1;
                c0727b.f7513c = i;
                if (i <= 0) {
                    c0727b.f7513c = 0;
                    c0727b.a = false;
                    c.this.a.originCollapseGroup(this.f7516j);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                this.i.f7513c++;
            }
        }

        public c(ExpandableListAdapter expandableListAdapter, NearExpandableListView nearExpandableListView) {
            this.a = nearExpandableListView;
            this.b = expandableListAdapter;
        }

        @Override // com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a
        public boolean a(int i) {
            C0727b c0727bE = e(i);
            if (c0727bE.a) {
                return false;
            }
            c0727bE.a = true;
            c0727bE.b = false;
            return true;
        }

        @Override // com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a
        public boolean b(int i) {
            C0727b c0727bE = e(i);
            if (c0727bE.a) {
                return false;
            }
            c0727bE.a = true;
            c0727bE.b = true;
            return true;
        }

        @Override // com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a
        public void c(int i) {
            e(i).a = false;
        }

        public final C0727b e(int i) {
            C0727b c0727b = this.f7514c.get(i);
            if (c0727b != null) {
                return c0727b;
            }
            C0727b c0727b2 = new C0727b();
            this.f7514c.put(i, c0727b2);
            return c0727b2;
        }

        public final int f(int i, int i2) {
            ExpandableListAdapter expandableListAdapter = this.b;
            if (!(expandableListAdapter instanceof HeterogeneousExpandableList)) {
                return 1;
            }
            int childType = ((HeterogeneousExpandableList) expandableListAdapter).getChildType(i, i2) + 1;
            if (childType >= 0) {
                return childType;
            }
            throw new RuntimeException("getChildType must is greater than 0");
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getChild(int i, int i2) {
            return this.b.getChild(i, i);
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i, int i2) {
            return this.b.getChildId(i, i2);
        }

        @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
        public final int getChildType(int i, int i2) {
            return f(i, i2);
        }

        @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
        public final int getChildTypeCount() {
            ExpandableListAdapter expandableListAdapter = this.b;
            if (expandableListAdapter instanceof HeterogeneousExpandableList) {
                return ((HeterogeneousExpandableList) expandableListAdapter).getChildTypeCount() + 1;
            }
            return 2;
        }

        @Override // android.widget.ExpandableListAdapter
        public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            View childView = this.b.getChildView(i, i2, z, view, this.a);
            C0727b c0727bE = e(i);
            if (c0727bE.a) {
                AnimationSet animationSet = new AnimationSet(true);
                if (c0727bE.b) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                    translateAnimation.setDuration(225L);
                    translateAnimation.setStartOffset(0L);
                    translateAnimation.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.6f, 1.0f));
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    alphaAnimation.setStartOffset(75L);
                    alphaAnimation.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.6f, 1.0f));
                    animationSet.addAnimation(translateAnimation);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.setDuration(225L);
                    animationSet.setStartOffset(i2 * 30);
                    animationSet.setAnimationListener(new a(c0727bE));
                } else {
                    TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation2.setDuration(225L);
                    translateAnimation2.setStartOffset(0L);
                    translateAnimation2.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.6f, 1.0f));
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setDuration(150L);
                    alphaAnimation2.setStartOffset(0L);
                    alphaAnimation2.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.6f, 1.0f));
                    animationSet.addAnimation(translateAnimation2);
                    animationSet.addAnimation(alphaAnimation2);
                    animationSet.setDuration(225L);
                    animationSet.setStartOffset(((getChildrenCount(i) - 1) - i2) * 30);
                    animationSet.setFillAfter(true);
                    animationSet.setAnimationListener(new AnimationAnimationListenerC0728b(c0727bE, i));
                }
                childView.startAnimation(animationSet);
            }
            return childView;
        }

        @Override // android.widget.ExpandableListAdapter
        public final int getChildrenCount(int i) {
            return this.b.getChildrenCount(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public Object getGroup(int i) {
            return this.b.getGroup(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return this.b.getGroupCount();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i) {
            return this.b.getGroupId(i);
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            return this.b.getGroupView(i, z, view, viewGroup);
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return this.b.hasStableIds();
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i, int i2) {
            if (e(i).a) {
                return false;
            }
            return this.b.isChildSelectable(i, i2);
        }
    }

    @Override // com.heytap.nearx.uikit.internal.widget.a
    @NotNull
    public com.heytap.nearx.uikit.internal.widget.a.AbstractC0726a a(@NotNull ExpandableListAdapter expandableListAdapter, @NotNull NearExpandableListView nearExpandableListView) {
        return new c(expandableListAdapter, nearExpandableListView);
    }
}
