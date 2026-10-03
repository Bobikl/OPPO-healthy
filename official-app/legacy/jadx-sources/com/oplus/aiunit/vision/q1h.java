package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.heytap.health.wallet.widget.ColouringCircleNetworkImageView;
import com.oppo.lib.common.R$animator;
import com.oppo.lib.common.R$dimen;
import com.oppo.lib.common.R$id;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class q1h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f15585l = {R$animator.bus_shift_in_front, R$animator.bus_shift_in_first, R$animator.bus_shift_in_second, R$animator.bus_shift_in_third, R$animator.bus_shift_in_end};
    public static final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f15586n;
    public static final int[] o;
    public ArrayList<b> a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f15587c;
    public c d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15588e;
    public float f;
    public float g;
    public float h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinkedList<d> f15589j;
    public boolean k;

    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ boolean i;

        public a(boolean z) {
            this.i = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            animator.removeAllListeners();
            if (q1h.this.f15588e) {
                return;
            }
            if (q1h.this.d != null) {
                q1h.this.d.b(q1h.this.b, q1h.this.f15587c);
            }
            q1h.this.b++;
            if (!q1h.this.k) {
                d dVar = (d) q1h.this.f15589j.pollFirst();
                if (q1h.this.a == null || q1h.this.a.size() <= q1h.this.b + 3) {
                    dVar.b(null);
                } else {
                    dVar.b((b) q1h.this.a.get(q1h.this.b + 3));
                }
                q1h.this.f15589j.addLast(dVar);
            } else if (this.i) {
                q1h.this.f15589j.addFirst((d) q1h.this.f15589j.pollLast());
                d dVar2 = (d) q1h.this.f15589j.getLast();
                if (q1h.this.a == null || q1h.this.a.size() <= q1h.this.b) {
                    dVar2.b(null);
                } else {
                    dVar2.b((b) q1h.this.a.get(q1h.this.b));
                }
            } else {
                d dVar3 = (d) q1h.this.f15589j.pollFirst();
                d dVar4 = (d) q1h.this.f15589j.pollLast();
                q1h.this.f15589j.addLast(dVar3);
                q1h.this.f15589j.addFirst(dVar4);
                if (q1h.this.a == null || q1h.this.a.size() <= q1h.this.b) {
                    dVar3.b(null);
                } else {
                    dVar3.b((b) q1h.this.a.get(q1h.this.b));
                }
            }
            q1h.this.m(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (q1h.this.d != null) {
                q1h.this.d.a(q1h.this.b, q1h.this.f15587c);
            }
        }
    }

    public interface b {
        String getImageUrl();
    }

    public interface c {
        void a(int i, b bVar);

        void b(int i, b bVar);
    }

    public static class d {
        public View a;
        public ColouringCircleNetworkImageView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CircleNetworkImageView f15591c;

        public static d a(View view) {
            if (view == null) {
                return null;
            }
            d dVar = new d();
            dVar.a = view;
            dVar.b = (ColouringCircleNetworkImageView) view.findViewById(R$id.mask);
            dVar.f15591c = (CircleNetworkImageView) view.findViewById(R$id.card);
            return dVar;
        }

        public void b(b bVar) {
            if (bVar != null) {
                this.b.setImageBitmap(bVar.getImageUrl());
                this.f15591c.setImageBitmap(bVar.getImageUrl());
            } else {
                this.b.setImageBitmap((String) null);
                this.f15591c.setImageBitmap((String) null);
            }
        }
    }

    static {
        int i = R$animator.bus_shift_mask_set_hide;
        m = new int[]{i, R$animator.bus_shift_in_first_mask, R$animator.bus_shift_mask_set_show, R$animator.bus_shift_in_third_mask, i};
        f15586n = new int[]{R$animator.bus_shift_in_front_fail, 0, 0, 0, R$animator.bus_shift_in_end_fail};
        o = new int[]{i, 0, 0, 0, i};
    }

    public static q1h j(View view, boolean z) {
        q1h q1hVar = new q1h();
        q1hVar.k = z;
        q1hVar.f = view.getResources().getDimension(R$dimen.shif_cards_piler_far_trans_y);
        q1hVar.g = view.getResources().getDimension(R$dimen.shif_cards_piler_front_trans_y);
        q1hVar.i = view.getResources().getDimensionPixelSize(R$dimen.shif_cards_piler_second_trans_y);
        q1hVar.h = view.getResources().getDimensionPixelSize(R$dimen.shif_cards_piler_first_trans_y);
        q1hVar.f15589j = new LinkedList<>();
        q1hVar.f15589j.add(d.a(view.findViewById(R$id.shift_cards_front)));
        q1hVar.f15589j.add(d.a(view.findViewById(R$id.shift_cards_0)));
        q1hVar.f15589j.add(d.a(view.findViewById(R$id.shift_cards_1)));
        q1hVar.f15589j.add(d.a(view.findViewById(R$id.shift_cards_2)));
        q1hVar.f15589j.add(d.a(view.findViewById(R$id.shift_cards_end)));
        q1hVar.m(true);
        return q1hVar;
    }

    public final void k(boolean z) {
        r(z);
    }

    public int l(boolean z) {
        int i = this.b;
        ArrayList<b> arrayList = this.a;
        if (arrayList != null && arrayList.size() > this.b) {
            k(z);
        }
        return i;
    }

    public final void m(boolean z) {
        for (int i = 0; i < this.f15589j.size(); i++) {
            d dVar = this.f15589j.get(i);
            dVar.a.setTranslationZ(this.f15589j.size() - i);
            if (i == 0 && !this.k) {
                dVar.a.setTranslationZ(0.0f);
            }
            if (z) {
                if (i == 0) {
                    dVar.a.setScaleX(0.705f);
                    dVar.a.setScaleY(0.705f);
                    dVar.a.setTranslationY(this.g);
                    dVar.a.setTranslationX(0.0f);
                } else if (i == 1) {
                    dVar.a.setScaleX(1.0f);
                    dVar.a.setScaleY(1.0f);
                    dVar.b.setAlpha(0.0f);
                    dVar.a.setTranslationY(this.h);
                    dVar.a.setTranslationX(0.0f);
                } else if (i == 2) {
                    dVar.a.setScaleX(0.96f);
                    dVar.a.setScaleY(0.96f);
                    dVar.a.setTranslationY(this.i);
                    dVar.a.setTranslationX(0.0f);
                } else {
                    dVar.a.setScaleX(0.922f);
                    dVar.a.setScaleY(0.922f);
                    dVar.a.setTranslationY(0.0f);
                    dVar.a.setTranslationX(0.0f);
                    if (i == 4) {
                        dVar.a.setAlpha(0.0f);
                        if (this.k) {
                            dVar.a.setScaleX(0.705f);
                            dVar.a.setScaleY(0.705f);
                        }
                    }
                }
            }
        }
    }

    public void n(c cVar) {
        this.d = cVar;
    }

    public final void o() {
        if (this.k) {
            p();
        } else {
            q();
        }
    }

    public final void p() {
        LinkedList<d> linkedList;
        if (this.a == null || (linkedList = this.f15589j) == null) {
            this.f15587c = null;
            return;
        }
        linkedList.get(0).b(null);
        for (int i = 1; i < this.f15589j.size() - 1; i++) {
            int i2 = this.b - i;
            if (i2 < 0 || i2 >= this.a.size()) {
                this.f15589j.get(i).b(null);
            } else {
                this.f15589j.get(i).b(this.a.get(i2));
            }
        }
        if (this.f15589j.size() <= 0 || this.b >= this.a.size()) {
            this.f15587c = null;
            return;
        }
        this.f15587c = this.a.get(this.b);
        LinkedList<d> linkedList2 = this.f15589j;
        linkedList2.get(linkedList2.size() - 1).b(this.f15587c);
    }

    public final void q() {
        LinkedList<d> linkedList;
        if (this.a == null || (linkedList = this.f15589j) == null) {
            this.f15587c = null;
            return;
        }
        linkedList.get(0).b(null);
        for (int i = 1; i < this.f15589j.size(); i++) {
            int i2 = (this.b + i) - 1;
            if (i2 < 0 || i2 >= this.a.size()) {
                if (i == 1) {
                    this.f15587c = null;
                }
                this.f15589j.get(i).b(null);
            } else {
                b bVar = this.a.get(i2);
                if (i == 1) {
                    this.f15587c = bVar;
                }
                this.f15589j.get(i).b(bVar);
            }
        }
    }

    public final void r(boolean z) {
        Animator animatorLoadAnimator;
        Animator animatorLoadAnimator2;
        AnimatorSet animatorSet = new AnimatorSet();
        int[] iArr = z ? f15585l : f15586n;
        int[] iArr2 = z ? m : o;
        AnimatorSet.Builder builderPlay = null;
        for (int i = 0; i < this.f15589j.size(); i++) {
            if (i < iArr.length) {
                d dVar = this.f15589j.get(i);
                if (iArr[i] > 0 && (animatorLoadAnimator2 = AnimatorInflater.loadAnimator(dVar.a.getContext(), iArr[i])) != null) {
                    if (builderPlay == null) {
                        builderPlay = animatorSet.play(animatorLoadAnimator2);
                    } else {
                        builderPlay.with(animatorLoadAnimator2);
                    }
                    animatorLoadAnimator2.setTarget(dVar.a);
                }
            }
            if (i < iArr2.length) {
                d dVar2 = this.f15589j.get(i);
                if (iArr2[i] > 0 && (animatorLoadAnimator = AnimatorInflater.loadAnimator(dVar2.a.getContext(), iArr2[i])) != null) {
                    if (builderPlay == null) {
                        builderPlay = animatorSet.play(animatorLoadAnimator);
                    } else {
                        builderPlay.with(animatorLoadAnimator);
                    }
                    animatorLoadAnimator.setTarget(dVar2.b);
                }
            }
        }
        if (builderPlay == null) {
            return;
        }
        animatorSet.addListener(new a(z));
        animatorSet.start();
    }

    public void s(List<? extends b> list) {
        if (list == null || list.size() <= 0) {
            this.a = new ArrayList<>();
        } else {
            ArrayList<b> arrayList = new ArrayList<>(list.size());
            arrayList.addAll(list);
            this.a = arrayList;
        }
        this.b = 0;
        this.f15587c = null;
        this.f15588e = false;
        m(true);
        o();
    }
}
