package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes13.dex */
public final class xne implements yu6<wne, tne> {
    public final yu6<sne, tne> a = new a();
    public final yu6<rne, tne> b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f18690c;

    public class a implements yu6<sne, tne> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.yu6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public yu6<sne, tne> a(sne sneVar, tne tneVar) {
            sneVar.a(tneVar);
            return this;
        }
    }

    public class b implements yu6<rne, tne> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.yu6
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public yu6<rne, tne> a(rne rneVar, tne tneVar) {
            if (!rneVar.getPopupMenuRuleEnabled()) {
                bj2.d("PopupMenuRuleExecutor", "Skip disabled rule " + rneVar);
                return this;
            }
            xne.this.k(rneVar, tneVar);
            int type = rneVar.getType();
            if (type == 0) {
                tneVar.a.set(rneVar.getDisplayFrame());
            } else if (type == 1) {
                tneVar.b.set(rneVar.getDisplayFrame());
                tneVar.h.set(rneVar.getOutsets());
            } else if (type == 2) {
                Rect rectI = xne.this.i(rneVar.getDisplayFrame(), rneVar.getOutsets());
                xne.this.g(rectI);
                int barrierDirection = rneVar.getBarrierDirection();
                if (barrierDirection == 0) {
                    Rect rect = tneVar.i;
                    rect.left = Math.max(rect.left, rectI.right - tneVar.a.left);
                } else if (barrierDirection == 1) {
                    Rect rect2 = tneVar.i;
                    rect2.top = Math.max(rect2.top, rectI.bottom - tneVar.a.top);
                } else if (barrierDirection == 2) {
                    Rect rect3 = tneVar.i;
                    rect3.right = Math.max(rect3.right, tneVar.a.right - rectI.left);
                } else if (barrierDirection == 3) {
                    Rect rect4 = tneVar.i;
                    rect4.bottom = Math.max(rect4.bottom, tneVar.a.bottom - rectI.top);
                } else if (barrierDirection == 4) {
                    Rect rect5 = tneVar.i;
                    rect5.left = Math.max(rect5.left, rectI.left - tneVar.a.left);
                    Rect rect6 = tneVar.i;
                    rect6.top = Math.max(rect6.top, rectI.top - tneVar.a.top);
                    Rect rect7 = tneVar.i;
                    rect7.right = Math.max(rect7.right, tneVar.a.right - rectI.right);
                    Rect rect8 = tneVar.i;
                    rect8.bottom = Math.max(rect8.bottom, tneVar.a.bottom - rectI.bottom);
                }
            } else if (type == 3) {
                tneVar.g.set(rneVar.getDisplayFrame());
            }
            return this;
        }
    }

    public void e() {
        this.f18690c = new StringBuilder();
    }

    public void f() {
        StringBuilder sb = this.f18690c;
        if (sb != null) {
            bj2.d("PopupMenuRuleExecutor", sb.toString());
        } else {
            bj2.c("PopupMenuRuleExecutor", "No config rules record! Not initialized!");
        }
    }

    public final void g(Rect rect) {
        if (rect.left < 0) {
            Log.e("PopupMenuRuleExecutor", "barrier left < 0 !!");
            rect.left = 0;
        }
        if (rect.top < 0) {
            Log.e("PopupMenuRuleExecutor", "barrier top < 0 !!");
            rect.top = 0;
        }
        if (rect.right < 0) {
            Log.e("PopupMenuRuleExecutor", "barrier right < 0 !!");
            rect.right = 0;
        }
        if (rect.bottom < 0) {
            Log.e("PopupMenuRuleExecutor", "barrier bottom < 0 !!");
            rect.bottom = 0;
        }
    }

    @Override // com.oplus.aiunit.vision.yu6
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public yu6<wne, tne> a(wne wneVar, tne tneVar) {
        if (wneVar instanceof sne) {
            this.a.a((sne) wneVar, tneVar);
        } else if (wneVar instanceof rne) {
            this.b.a((rne) wneVar, tneVar);
        }
        return this;
    }

    public final Rect i(Rect rect, Rect rect2) {
        return new Rect(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(rne rneVar, tne tneVar) {
        Rect rectI = i(rneVar.getDisplayFrame(), rneVar.getOutsets());
        int barrierDirection = rneVar.getBarrierDirection();
        if (barrierDirection == -1) {
            this.f18690c.append("#BARRIER_GONE:");
        } else if (barrierDirection == 0) {
            this.f18690c.append("#BARRIER_FROM_LEFT:");
        } else if (barrierDirection == 1) {
            this.f18690c.append("#BARRIER_FROM_TOP:");
        } else if (barrierDirection == 2) {
            this.f18690c.append("#BARRIER_FROM_RIGHT:");
        } else if (barrierDirection == 3) {
            this.f18690c.append("#BARRIER_FROM_BOTTOM:");
        } else if (barrierDirection == 4) {
            this.f18690c.append("#BARRIER_WINDOW:");
        }
        this.f18690c.append("old domain window barrier:");
        this.f18690c.append(tneVar.i);
        this.f18690c.append(" barrier:");
        this.f18690c.append(rectI);
        this.f18690c.append(" domain window:");
        this.f18690c.append(tneVar.a);
        this.f18690c.append(" rule: ");
        this.f18690c.append(rneVar);
        if (rneVar instanceof View) {
            this.f18690c.append(" parent: ");
            this.f18690c.append(((View) rneVar).getParent());
        }
        this.f18690c.append(Weather.SEPARATOR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(rne rneVar, tne tneVar) {
        if (this.f18690c == null) {
            this.f18690c = new StringBuilder();
        }
        int type = rneVar.getType();
        if (type == 0) {
            this.f18690c.append("#TYPE_WINDOW: display frame: ");
            this.f18690c.append(rneVar.getDisplayFrame());
            this.f18690c.append(" rule: ");
            this.f18690c.append(rneVar);
            if (rneVar instanceof View) {
                this.f18690c.append(" parent: ");
                this.f18690c.append(((View) rneVar).getParent());
            }
            this.f18690c.append(Weather.SEPARATOR);
            return;
        }
        if (type == 1) {
            this.f18690c.append("#TYPE_ANCHOR: display frame: ");
            this.f18690c.append(rneVar.getDisplayFrame());
            this.f18690c.append(" outsets: ");
            this.f18690c.append(rneVar.getOutsets());
            this.f18690c.append(" rule: ");
            this.f18690c.append(rneVar);
            if (rneVar instanceof View) {
                this.f18690c.append(" parent: ");
                this.f18690c.append(((View) rneVar).getParent());
            }
            this.f18690c.append(Weather.SEPARATOR);
            return;
        }
        if (type == 2) {
            j(rneVar, tneVar);
            return;
        }
        if (type != 3) {
            return;
        }
        this.f18690c.append("#TYPE_SUBMENU_ANCHOR: display frame: ");
        this.f18690c.append(rneVar.getDisplayFrame());
        this.f18690c.append(" rule: ");
        this.f18690c.append(rneVar);
        if (rneVar instanceof View) {
            this.f18690c.append(" parent: ");
            this.f18690c.append(((View) rneVar).getParent());
        }
        this.f18690c.append(Weather.SEPARATOR);
    }
}
