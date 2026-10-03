package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.impl.CameraFilters;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: com.oplus.aiunit.vision.dw2
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return CameraFilters.lambda$static$0(list);
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: com.oplus.aiunit.vision.ew2
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return CameraFilters.lambda$static$1(list);
        }
    };

    private CameraFilters() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$0(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$static$1(List list) {
        return Collections.emptyList();
    }
}
