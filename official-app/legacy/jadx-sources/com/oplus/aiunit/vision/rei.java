package com.oplus.aiunit.vision;

import com.heytap.health.sport.coach.bean.SportMotive;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "Lcom/heytap/health/sport/coach/bean/SportMotive;", "a", "sport_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportMotive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportMotive.kt\ncom/heytap/health/sport/coach/bean/SportMotiveKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n13309#2,2:18\n*S KotlinDebug\n*F\n+ 1 SportMotive.kt\ncom/heytap/health/sport/coach/bean/SportMotiveKt\n*L\n13#1:18,2\n*E\n"})
public final class rei {
    @Nullable
    public static final SportMotive a(int i) {
        for (SportMotive sportMotive : SportMotive.values()) {
            if (sportMotive.getMotive() == i) {
                return sportMotive;
            }
        }
        return null;
    }
}
