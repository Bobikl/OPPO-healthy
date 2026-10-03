package com.heytap.health.operation.courses.constant;

import com.heytap.health.operation.R$string;

/* JADX INFO: loaded from: classes17.dex */
public enum CourseEnum$DifficultyCloud {
    ZERO_BASED(0, 0, R$string.operation_course_difficulty_zero_based),
    PRIMARY(1, 1, R$string.operation_course_difficulty_primary),
    INTERMEDIATE(2, 2, R$string.operation_course_difficulty_intermediate),
    ADVANCED(3, 3, R$string.operation_course_difficulty_advanced);

    public int cloudIndex;
    public int resourceId;
    public int tipResourceId;
    public int uiPosition;

    CourseEnum$DifficultyCloud(int i, int i2, int i3) {
        this.cloudIndex = i;
        this.uiPosition = i2;
        this.resourceId = i3;
    }
}
