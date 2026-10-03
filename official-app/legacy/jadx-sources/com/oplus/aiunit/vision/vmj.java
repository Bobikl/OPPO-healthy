package com.oplus.aiunit.vision;

import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.commonmark.ext.gfm.tables.TableCell;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class vmj extends j6 {
    public final bnj a;
    public final b b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TableCell.Alignment.values().length];
            a = iArr;
            try {
                iArr[TableCell.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TableCell.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {
        public final bnj a;
        public List<xmj.d> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17906c;
        public int d;

        public class a implements qgb.c<TableCell> {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.qgb.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(@NonNull qgb qgbVar, @NonNull TableCell tableCell) {
                int length = qgbVar.length();
                qgbVar.F(tableCell);
                if (b.this.b == null) {
                    b.this.b = new ArrayList(2);
                }
                b.this.b.add(new xmj.d(b.i(tableCell.m()), qgbVar.builder().i(length)));
                b.this.f17906c = tableCell.n();
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.vmj$b$b, reason: collision with other inner class name */
        public class C0937b implements qgb.c<umj> {
            public C0937b() {
            }

            @Override // com.oplus.aiunit.vision.qgb.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(@NonNull qgb qgbVar, @NonNull umj umjVar) {
                b.this.j(qgbVar, umjVar);
            }
        }

        public class c implements qgb.c<wmj> {
            public c() {
            }

            @Override // com.oplus.aiunit.vision.qgb.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(@NonNull qgb qgbVar, @NonNull wmj wmjVar) {
                b.this.j(qgbVar, wmjVar);
            }
        }

        public class d implements qgb.c<lmj> {
            public d() {
            }

            @Override // com.oplus.aiunit.vision.qgb.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(@NonNull qgb qgbVar, @NonNull lmj lmjVar) {
                qgbVar.F(lmjVar);
                b.this.d = 0;
            }
        }

        public class e implements qgb.c<jmj> {
            public e() {
            }

            @Override // com.oplus.aiunit.vision.qgb.c
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(@NonNull qgb qgbVar, @NonNull jmj jmjVar) {
                qgbVar.A(jmjVar);
                int length = qgbVar.length();
                qgbVar.F(jmjVar);
                qgbVar.a(length, new zmj());
                qgbVar.d(jmjVar);
            }
        }

        public b(@NonNull bnj bnjVar) {
            this.a = bnjVar;
        }

        public static int i(TableCell.Alignment alignment) {
            if (alignment == null) {
                return 0;
            }
            int i = a.a[alignment.ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }

        public void g() {
            this.b = null;
            this.f17906c = false;
            this.d = 0;
        }

        public void h(@NonNull qgb.b bVar) {
            bVar.a(jmj.class, new e()).a(lmj.class, new d()).a(wmj.class, new c()).a(umj.class, new C0937b()).a(TableCell.class, new a());
        }

        public final void j(@NonNull qgb qgbVar, @NonNull ltc ltcVar) {
            int length = qgbVar.length();
            qgbVar.F(ltcVar);
            if (this.b != null) {
                i5i i5iVarBuilder = qgbVar.builder();
                int length2 = i5iVarBuilder.length();
                boolean z = length2 > 0 && '\n' != i5iVarBuilder.charAt(length2 - 1);
                if (z) {
                    qgbVar.B();
                }
                i5iVarBuilder.append(Typography.nbsp);
                xmj xmjVar = new xmj(this.a, this.b, this.f17906c, this.d % 2 == 1);
                this.d = this.f17906c ? 0 : this.d + 1;
                if (z) {
                    length++;
                }
                qgbVar.a(length, xmjVar);
                this.b = null;
            }
        }
    }

    public interface c {
        void a(@NonNull bnj.a aVar);
    }

    public vmj(@NonNull bnj bnjVar) {
        this.a = bnjVar;
        this.b = new b(bnjVar);
    }

    @NonNull
    public static vmj l(@NonNull c cVar) {
        bnj.a aVar = new bnj.a();
        cVar.a(aVar);
        return new vmj(aVar.g());
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void a(@NonNull ltc ltcVar) {
        this.b.g();
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void b(@NonNull TextView textView) {
        ymj.b(textView);
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void d(@NonNull qgb.b bVar) {
        this.b.h(bVar);
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void j(@NonNull i8e.b bVar) {
        bVar.h(Collections.singleton(cnj.b()));
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void k(@NonNull TextView textView, @NonNull Spanned spanned) {
        ymj.c(textView);
    }
}
