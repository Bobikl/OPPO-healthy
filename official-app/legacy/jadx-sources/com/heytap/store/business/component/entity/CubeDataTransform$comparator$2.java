package com.heytap.store.business.component.entity;

import java.util.Comparator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/Comparator;", "", "", "Lcom/heytap/store/business/component/entity/CubeRow;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class CubeDataTransform$comparator$2 extends Lambda implements Function0<Comparator<Map.Entry<? extends Integer, ? extends CubeRow>>> {
    public static final CubeDataTransform$comparator$2 INSTANCE = new CubeDataTransform$comparator$2();

    public CubeDataTransform$comparator$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final int m4839invoke$lambda0(Map.Entry entry, Map.Entry entry2) {
        return ((Number) entry.getKey()).intValue() - ((Number) entry2.getKey()).intValue();
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Comparator<Map.Entry<? extends Integer, ? extends CubeRow>> invoke() {
        return new Comparator() { // from class: com.heytap.store.business.component.entity.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CubeDataTransform$comparator$2.m4839invoke$lambda0((Map.Entry) obj, (Map.Entry) obj2);
            }
        };
    }
}
