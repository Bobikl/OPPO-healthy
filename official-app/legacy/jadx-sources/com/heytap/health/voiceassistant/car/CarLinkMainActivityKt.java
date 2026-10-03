package com.heytap.health.voiceassistant.car;

import com.heytap.health.base.switchManager.CKV;
import com.heytap.health.base.switchManager.SwitchStateUtil;
import com.heytap.health.voiceassistant.R$drawable;
import com.heytap.health.voiceassistant.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"", "Lcom/heytap/health/voiceassistant/car/ImageItem;", "a", "Lkotlin/Lazy;", "()Ljava/util/List;", "ImageItemList", "voiceassistant_impl_release"}, k = 2, mv = {1, 8, 0})
public final class CarLinkMainActivityKt {

    @NotNull
    public static final Lazy a = LazyKt__LazyJVMKt.lazy(new Function0<List<? extends ImageItem>>() { // from class: com.heytap.health.voiceassistant.car.CarLinkMainActivityKt$ImageItemList$2
        /* JADX WARN: Code duplicated, block: B:14:0x003d  */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends ImageItem> invoke() {
            String value;
            List<CKV> listB = SwitchStateUtil.b();
            if (listB != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (Intrinsics.areEqual(((CKV) obj).getKey(), "carlink")) {
                        arrayList.add(obj);
                    }
                }
                CKV ckv = (CKV) CollectionsKt___CollectionsKt.getOrNull(arrayList, 0);
                if (ckv == null || (value = ckv.getValue()) == null) {
                    value = "";
                }
            } else {
                value = "";
            }
            String str = value;
            return CollectionsKt__CollectionsJVMKt.listOf(new ImageItem(0, R$drawable.va_car_introduction, str, str, R$string.va_car_link_introduction_title, R$string.va_car_link_introduction_content));
        }
    });

    @NotNull
    public static final List<ImageItem> a() {
        return (List) a.getValue();
    }
}
