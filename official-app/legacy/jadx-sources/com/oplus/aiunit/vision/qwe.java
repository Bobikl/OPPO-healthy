package com.oplus.aiunit.vision;

import com.heytap.health.cervical_vertebra.datamodel.Procedure;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "type", "Lcom/heytap/health/cervical_vertebra/datamodel/Procedure;", "a", "cervical_vertebra_release"}, k = 2, mv = {1, 8, 0})
public final class qwe {
    @Nullable
    public static final Procedure a(int i) {
        switch (i) {
            case 0:
                return Procedure.PREPARE;
            case 1:
                return Procedure.BACKWARD;
            case 2:
                return Procedure.FORWARD;
            case 3:
                return Procedure.LEFT_FLEXION;
            case 4:
                return Procedure.RIGHT_FLEXION;
            case 5:
                return Procedure.ROTATE_LEFT;
            case 6:
                return Procedure.ROTATE_RIGHT;
            default:
                return null;
        }
    }
}
