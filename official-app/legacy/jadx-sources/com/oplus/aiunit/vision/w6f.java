package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/u6f;", "", "b", "a", "c", "d", "", "OptionA", "I", "OptionB", "FeedbackNull", "FeedbackGood", "FeedbackBad", "operations_release"}, k = 2, mv = {1, 8, 0})
public final class w6f {
    public static final int FeedbackBad = 2;
    public static final int FeedbackGood = 1;
    public static final int FeedbackNull = 0;
    public static final int OptionA = 1;
    public static final int OptionB = 2;

    public static final boolean a(@NotNull Question question) {
        Intrinsics.checkNotNullParameter(question, "<this>");
        Integer userAnswer = question.getUserAnswer();
        return userAnswer != null && userAnswer.intValue() == 1;
    }

    public static final boolean b(@NotNull Question question) {
        Intrinsics.checkNotNullParameter(question, "<this>");
        return Intrinsics.areEqual(question.getUserAnswer(), question.getOptionAnswer());
    }

    public static final boolean c(@NotNull Question question) {
        Intrinsics.checkNotNullParameter(question, "<this>");
        return question.getUserAnswer() != null;
    }

    public static final boolean d(@NotNull Question question) {
        Intrinsics.checkNotNullParameter(question, "<this>");
        return Intrinsics.areEqual(question.getQuestionType(), "01");
    }
}
