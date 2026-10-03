package com.oplus.aiunit.vision;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.health.community.data.PostTopic;
import com.heytap.health.community.impl.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/a2k;", "", "", "text", "", "Lcom/heytap/health/community/data/PostTopic;", "highlightText", "Landroid/widget/TextView;", "textView", "", "a", "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicHighTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicHighTextView.kt\ncom/heytap/health/community/focus/TopicHighTextView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n1549#2:63\n1620#2,3:64\n766#2:67\n857#2,2:68\n*S KotlinDebug\n*F\n+ 1 TopicHighTextView.kt\ncom/heytap/health/community/focus/TopicHighTextView\n*L\n36#1:59\n36#1:60,3\n42#1:63\n42#1:64,3\n46#1:67\n46#1:68,2\n*E\n"})
public final class a2k {

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.a2k$a, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/a2k$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "from", "b", TypedValues.TransitionType.S_TO, "<init>", "(II)V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Index {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final int from;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int to;

        public Index(int i, int i2) {
            this.from = i;
            this.to = i2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTo() {
            return this.to;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Index)) {
                return false;
            }
            Index index = (Index) other;
            return this.from == index.from && this.to == index.to;
        }

        public int hashCode() {
            return (Integer.hashCode(this.from) * 31) + Integer.hashCode(this.to);
        }

        @NotNull
        public String toString() {
            return "Index(from=" + this.from + ", to=" + this.to + ")";
        }
    }

    public final void a(@NotNull String text, @Nullable List<PostTopic> highlightText, @NotNull TextView textView) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (highlightText != null) {
            List<PostTopic> list = highlightText;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PostTopic) it.next()).getName());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            textView.setText(text);
            return;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) text);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = "#" + ((String) it2.next()) + "#";
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) text, str, 0, false, 6, (Object) null);
            arrayList3.add(new Index(iIndexOf$default, str.length() + iIndexOf$default));
        }
        ArrayList<Index> arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            Index index = (Index) obj;
            if (index.getFrom() >= 0 && index.getTo() >= 0 && index.getFrom() < text.length() && index.getTo() < text.length()) {
                arrayList4.add(obj);
            }
        }
        for (Index index2 : arrayList4) {
            spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(qtf.f(R$color.community_22467D)), index2.getFrom(), index2.getTo(), 33);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilderAppend);
    }
}
