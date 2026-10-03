package com.heytap.health.cervical_vertebra.datamodel;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/Procedure;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "PREPARE", "ROTATE_LEFT", "ROTATE_RIGHT", "FORWARD", "BACKWARD", "LEFT_FLEXION", "RIGHT_FLEXION", "END", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum Procedure {
    PREPARE(0),
    ROTATE_LEFT(5),
    ROTATE_RIGHT(6),
    FORWARD(2),
    BACKWARD(1),
    LEFT_FLEXION(3),
    RIGHT_FLEXION(4),
    END(-1);

    private final int type;

    Procedure(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
