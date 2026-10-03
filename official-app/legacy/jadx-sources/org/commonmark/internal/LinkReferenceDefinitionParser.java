package org.commonmark.internal;

import com.oplus.aiunit.vision.m8e;
import com.oplus.aiunit.vision.oxa;
import com.oplus.aiunit.vision.rxa;
import com.oplus.aiunit.vision.up6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class LinkReferenceDefinitionParser {
    public StringBuilder d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20747e;
    public String f;
    public char g;
    public StringBuilder h;
    public State a = State.START_DEFINITION;
    public final StringBuilder b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<oxa> f20746c = new ArrayList();
    public boolean i = false;

    public enum State {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.values().length];
            a = iArr;
            try {
                iArr[State.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final int a(CharSequence charSequence, int i) {
        int iM = m8e.m(charSequence, i, charSequence.length());
        int iA = rxa.a(charSequence, iM);
        if (iA == -1) {
            return -1;
        }
        this.f = charSequence.charAt(iM) == '<' ? charSequence.subSequence(iM + 1, iA - 1).toString() : charSequence.subSequence(iM, iA).toString();
        int iM2 = m8e.m(charSequence, iA, charSequence.length());
        if (iM2 >= charSequence.length()) {
            this.i = true;
            this.b.setLength(0);
        } else if (iM2 == iA) {
            return -1;
        }
        this.a = State.START_TITLE;
        return iM2;
    }

    public final void b() {
        if (this.i) {
            String strE = up6.e(this.f);
            StringBuilder sb = this.h;
            this.f20746c.add(new oxa(this.f20747e, strE, sb != null ? up6.e(sb.toString()) : null));
            this.d = null;
            this.i = false;
            this.f20747e = null;
            this.f = null;
            this.h = null;
        }
    }

    public List<oxa> c() {
        b();
        return this.f20746c;
    }

    public CharSequence d() {
        return this.b;
    }

    public final int e(CharSequence charSequence, int i) {
        int i2;
        int iC = rxa.c(charSequence, i);
        if (iC == -1) {
            return -1;
        }
        this.d.append(charSequence, i, iC);
        if (iC >= charSequence.length()) {
            this.d.append('\n');
            return iC;
        }
        if (charSequence.charAt(iC) != ']' || (i2 = iC + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.d.length() > 999) {
            return -1;
        }
        String strB = up6.b(this.d.toString());
        if (strB.isEmpty()) {
            return -1;
        }
        this.f20747e = strB;
        this.a = State.DESTINATION;
        return m8e.m(charSequence, i2 + 1, charSequence.length());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:6:0x0015->B:24:?, LOOP_END, SYNTHETIC] */
    public void f(CharSequence charSequence) {
        if (this.b.length() != 0) {
            this.b.append('\n');
        }
        this.b.append(charSequence);
        int iG = 0;
        while (iG < charSequence.length()) {
            switch (a.a[this.a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    iG = g(charSequence, iG);
                    if (iG == -1) {
                        this.a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 3:
                    iG = e(charSequence, iG);
                    if (iG == -1) {
                        this.a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 4:
                    iG = a(charSequence, iG);
                    if (iG == -1) {
                        this.a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 5:
                    iG = h(charSequence, iG);
                    if (iG == -1) {
                        this.a = State.PARAGRAPH;
                        return;
                    }
                    break;
                case 6:
                    iG = i(charSequence, iG);
                    if (iG == -1) {
                        this.a = State.PARAGRAPH;
                        return;
                    }
                    break;
                default:
                    if (iG == -1) {
                        this.a = State.PARAGRAPH;
                        return;
                    }
                    break;
            }
        }
    }

    public final int g(CharSequence charSequence, int i) {
        int iM = m8e.m(charSequence, i, charSequence.length());
        if (iM >= charSequence.length() || charSequence.charAt(iM) != '[') {
            return -1;
        }
        this.a = State.LABEL;
        this.d = new StringBuilder();
        int i2 = iM + 1;
        if (i2 >= charSequence.length()) {
            this.d.append('\n');
        }
        return i2;
    }

    public final int h(CharSequence charSequence, int i) {
        int iM = m8e.m(charSequence, i, charSequence.length());
        if (iM >= charSequence.length()) {
            this.a = State.START_DEFINITION;
            return iM;
        }
        this.g = (char) 0;
        char cCharAt = charSequence.charAt(iM);
        if (cCharAt == '\"' || cCharAt == '\'') {
            this.g = cCharAt;
        } else if (cCharAt == '(') {
            this.g = ')';
        }
        if (this.g != 0) {
            this.a = State.TITLE;
            this.h = new StringBuilder();
            iM++;
            if (iM == charSequence.length()) {
                this.h.append('\n');
            }
        } else {
            b();
            this.a = State.START_DEFINITION;
        }
        return iM;
    }

    public final int i(CharSequence charSequence, int i) {
        int iE = rxa.e(charSequence, i, this.g);
        if (iE == -1) {
            return -1;
        }
        this.h.append(charSequence.subSequence(i, iE));
        if (iE >= charSequence.length()) {
            this.h.append('\n');
            return iE;
        }
        int iM = m8e.m(charSequence, iE + 1, charSequence.length());
        if (iM != charSequence.length()) {
            return -1;
        }
        this.i = true;
        b();
        this.b.setLength(0);
        this.a = State.START_DEFINITION;
        return iM;
    }
}
