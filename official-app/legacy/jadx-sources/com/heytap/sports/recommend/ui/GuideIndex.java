package com.heytap.sports.recommend.ui;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/sports/recommend/ui/GuideIndex;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "GUIDE_1", "GUIDE_2", "GUIDE_3", "GUIDE_4", "GUIDE_END", "recommend_release"}, k = 1, mv = {1, 8, 0})
public enum GuideIndex {
    GUIDE_1(0),
    GUIDE_2(1),
    GUIDE_3(2),
    GUIDE_4(3),
    GUIDE_END(4);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    /* JADX INFO: renamed from: com.heytap.sports.recommend.ui.GuideIndex$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/heytap/sports/recommend/ui/GuideIndex$a;", "", "", "value", "Lcom/heytap/sports/recommend/ui/GuideIndex;", "a", "index", "b", "<init>", "()V", "recommend_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSettingGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingGuide.kt\ncom/heytap/sports/recommend/ui/GuideIndex$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,327:1\n1282#2,2:328\n*S KotlinDebug\n*F\n+ 1 SettingGuide.kt\ncom/heytap/sports/recommend/ui/GuideIndex$Companion\n*L\n80#1:328,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.heytap.sports.recommend.ui.GuideIndex$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0782a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GuideIndex.values().length];
                try {
                    iArr[GuideIndex.GUIDE_1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GuideIndex.GUIDE_2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GuideIndex.GUIDE_3.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GuideIndex.GUIDE_4.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GuideIndex.GUIDE_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final GuideIndex a(int value) {
            for (GuideIndex guideIndex : GuideIndex.values()) {
                if (guideIndex.getValue() == value) {
                    return guideIndex;
                }
            }
            return null;
        }

        public final int b(@NotNull GuideIndex index) {
            Intrinsics.checkNotNullParameter(index, "index");
            int i = C0782a.$EnumSwitchMapping$0[index.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return 1;
            }
            if (i == 5) {
                return 3;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    GuideIndex(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
