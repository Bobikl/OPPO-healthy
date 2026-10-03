package com.pantanal.server.content.utils;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"com/pantanal/server/content/utils/UpkConstants$IMPORTANCE$Companion", "", "", StatisticsTrackUtil.KEY_ENTRANCE, JsonToSeedlingCardOptionsConvertor.KEY_GRADE, "", "shouldShowInEntrance", "IMPORTANCE_1", "I", "IMPORTANCE_2", "IMPORTANCE_3", "IMPORTANCE_4", "IMPORTANCE_5", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class UpkConstants$IMPORTANCE$Companion {
    static final /* synthetic */ UpkConstants$IMPORTANCE$Companion $$INSTANCE = new UpkConstants$IMPORTANCE$Companion();
    public static final int IMPORTANCE_1 = 1;
    public static final int IMPORTANCE_2 = 2;
    public static final int IMPORTANCE_3 = 3;
    public static final int IMPORTANCE_4 = 4;
    public static final int IMPORTANCE_5 = 5;

    private UpkConstants$IMPORTANCE$Companion() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0026  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final boolean shouldShowInEntrance(int entrance, int importance) {
        if (entrance == 1 || entrance == 2) {
            if (importance < 1) {
                return false;
            }
        } else if (entrance == 4) {
            if (importance < 3) {
                return false;
            }
        } else if (entrance != 8) {
            if (entrance == 16) {
                if (importance < 3) {
                    return false;
                }
            } else if (entrance != 128) {
                if (entrance != 256 && entrance != 512) {
                    return false;
                }
                if (importance < 3) {
                    return false;
                }
            } else if (importance < 5) {
                return false;
            }
        } else if (importance < 4) {
            return false;
        }
        return true;
    }
}
