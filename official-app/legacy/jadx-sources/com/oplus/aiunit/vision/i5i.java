package com.oplus.aiunit.vision;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class i5i implements Appendable, CharSequence {
    public final StringBuilder i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Deque<a> f12387j;

    public static class a {
        public final Object a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12388c;
        public final int d;

        public a(@NonNull Object obj, int i, int i2, int i3) {
            this.a = obj;
            this.b = i;
            this.f12388c = i2;
            this.d = i3;
        }
    }

    public static class b extends SpannableStringBuilder {
        public b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public i5i() {
        this("");
    }

    @VisibleForTesting
    public static boolean g(int i, int i2, int i3) {
        return i3 > i2 && i2 >= 0 && i3 <= i;
    }

    public static void k(@NonNull i5i i5iVar, @Nullable Object obj, int i, int i2) {
        if (obj == null || !g(i5iVar.length(), i, i2)) {
            return;
        }
        l(i5iVar, obj, i, i2);
    }

    public static void l(@NonNull i5i i5iVar, @Nullable Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                i5iVar.j(obj, i, i2, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                l(i5iVar, obj2, i, i2);
            }
        }
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i5i append(char c2) {
        this.i.append(c2);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i5i append(@NonNull CharSequence charSequence) {
        e(length(), charSequence);
        this.i.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i5i append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        e(length(), charSequenceSubSequence);
        this.i.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.i.charAt(i);
    }

    @NonNull
    public i5i d(@NonNull String str) {
        this.i.append(str);
        return this;
    }

    public final void e(int i, @Nullable CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        j(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    j(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    @NonNull
    public List<a> f(int i, int i2) {
        int i3;
        int length = length();
        if (!g(length, i, i2)) {
            return Collections.emptyList();
        }
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(this.f12387j);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> itDescendingIterator = this.f12387j.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            a next = itDescendingIterator.next();
            int i4 = next.b;
            if ((i4 >= i && i4 < i2) || (((i3 = next.f12388c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char h() {
        return this.i.charAt(length() - 1);
    }

    @NonNull
    public CharSequence i(int i) {
        a next;
        int i2;
        int length = length();
        b bVar = new b(this.i.subSequence(i, length));
        Iterator<a> it = this.f12387j.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            int i3 = next.b;
            if (i3 >= i && (i2 = next.f12388c) <= length) {
                bVar.setSpan(next.a, i3 - i, i2 - i, 33);
                it.remove();
            }
        }
        this.i.replace(i, length, "");
        return bVar;
    }

    @NonNull
    public i5i j(@NonNull Object obj, int i, int i2, int i3) {
        this.f12387j.push(new a(obj, i, i2, i3));
        return this;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.i.length();
    }

    @NonNull
    public SpannableStringBuilder m() {
        b bVar = new b(this.i);
        for (a aVar : this.f12387j) {
            bVar.setSpan(aVar.a, aVar.b, aVar.f12388c, aVar.d);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        List<a> listF = f(i, i2);
        if (listF.isEmpty()) {
            return this.i.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.i.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (a aVar : listF) {
            int iMax = Math.max(0, aVar.b - i);
            spannableStringBuilder.setSpan(aVar.a, iMax, Math.min(length, (aVar.f12388c - aVar.b) + iMax), aVar.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.i.toString();
    }

    public i5i(@NonNull CharSequence charSequence) {
        this.f12387j = new ArrayDeque(8);
        this.i = new StringBuilder(charSequence);
        e(0, charSequence);
    }
}
