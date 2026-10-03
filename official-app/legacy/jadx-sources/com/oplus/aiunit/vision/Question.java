package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u6f, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\bB\u0010CJÀ\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b0\u0010$R\u001a\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b1\u0010$R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b2\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b6\u0010$R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b(\u0010$R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u00109R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b?\u0010/\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/oplus/aiunit/vision/u6f;", "", "", ClickApiEntity.TIME, "", "answerDetail", "businessType", "contentType", "homePageGuide", "optionA", "", "optionAnswer", "serialNo", "optionB", "question", "questionType", "Lcom/oplus/aiunit/vision/x6f;", "questionVote", "referenceSource", "jumpLink", "userAnswer", "", "notShow", "userFeedback", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/x6f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZI)Lcom/oplus/aiunit/vision/u6f;", "toString", "hashCode", "other", "equals", "J", "o", "()J", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "getContentType", MapSchema.FIELD_NAME_ENTRY, "f", b2n.f, "Ljava/lang/Integer;", b2n.g, "()Ljava/lang/Integer;", "I", "n", "()I", "i", "j", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/x6f;", "()Lcom/oplus/aiunit/vision/x6f;", LogFieldKey.MESSAGE_KEY, LogFieldKey.PROCESS_NAME_KEY, "setUserAnswer", "(Ljava/lang/Integer;)V", "Z", "getNotShow", "()Z", "setNotShow", "(Z)V", "q", "setUserFeedback", "(I)V", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/x6f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZI)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Question {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(ClickApiEntity.TIME)
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("answerDetail")
    @NotNull
    private final String answerDetail;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("businessType")
    @NotNull
    private final String businessType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("contentType")
    @NotNull
    private final String contentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("homePageGuide")
    @NotNull
    private final String homePageGuide;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("optionA")
    @NotNull
    private final String optionA;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("optionAnswer")
    @Nullable
    private final Integer optionAnswer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("serialNo")
    private final int serialNo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("optionB")
    @NotNull
    private final String optionB;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("question")
    @NotNull
    private final String question;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("questionType")
    @NotNull
    private final String questionType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("questionVote")
    @Nullable
    private final QuestionVote questionVote;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("referenceSource")
    @NotNull
    private final String referenceSource;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("jumpLink")
    @NotNull
    private final String jumpLink;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("userAnswer")
    @Nullable
    private Integer userAnswer;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @SerializedName("notShow")
    private boolean notShow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @SerializedName("userFeedback")
    private int userFeedback;

    public Question() {
        this(0L, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, 0, 131071, null);
    }

    @NotNull
    public final Question a(long time, @NotNull String answerDetail, @NotNull String businessType, @NotNull String contentType, @NotNull String homePageGuide, @NotNull String optionA, @Nullable Integer optionAnswer, int serialNo, @NotNull String optionB, @NotNull String question, @NotNull String questionType, @Nullable QuestionVote questionVote, @NotNull String referenceSource, @NotNull String jumpLink, @Nullable Integer userAnswer, boolean notShow, int userFeedback) {
        Intrinsics.checkNotNullParameter(answerDetail, "answerDetail");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(homePageGuide, "homePageGuide");
        Intrinsics.checkNotNullParameter(optionA, "optionA");
        Intrinsics.checkNotNullParameter(optionB, "optionB");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(questionType, "questionType");
        Intrinsics.checkNotNullParameter(referenceSource, "referenceSource");
        Intrinsics.checkNotNullParameter(jumpLink, "jumpLink");
        return new Question(time, answerDetail, businessType, contentType, homePageGuide, optionA, optionAnswer, serialNo, optionB, question, questionType, questionVote, referenceSource, jumpLink, userAnswer, notShow, userFeedback);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnswerDetail() {
        return this.answerDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBusinessType() {
        return this.businessType;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHomePageGuide() {
        return this.homePageGuide;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return this.time == question.time && Intrinsics.areEqual(this.answerDetail, question.answerDetail) && Intrinsics.areEqual(this.businessType, question.businessType) && Intrinsics.areEqual(this.contentType, question.contentType) && Intrinsics.areEqual(this.homePageGuide, question.homePageGuide) && Intrinsics.areEqual(this.optionA, question.optionA) && Intrinsics.areEqual(this.optionAnswer, question.optionAnswer) && this.serialNo == question.serialNo && Intrinsics.areEqual(this.optionB, question.optionB) && Intrinsics.areEqual(this.question, question.question) && Intrinsics.areEqual(this.questionType, question.questionType) && Intrinsics.areEqual(this.questionVote, question.questionVote) && Intrinsics.areEqual(this.referenceSource, question.referenceSource) && Intrinsics.areEqual(this.jumpLink, question.jumpLink) && Intrinsics.areEqual(this.userAnswer, question.userAnswer) && this.notShow == question.notShow && this.userFeedback == question.userFeedback;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOptionA() {
        return this.optionA;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getOptionAnswer() {
        return this.optionAnswer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v30, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v34 */
    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.time) * 31) + this.answerDetail.hashCode()) * 31) + this.businessType.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.homePageGuide.hashCode()) * 31) + this.optionA.hashCode()) * 31;
        Integer num = this.optionAnswer;
        int iHashCode2 = (((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.serialNo)) * 31) + this.optionB.hashCode()) * 31) + this.question.hashCode()) * 31) + this.questionType.hashCode()) * 31;
        QuestionVote questionVote = this.questionVote;
        int iHashCode3 = (((((iHashCode2 + (questionVote == null ? 0 : questionVote.hashCode())) * 31) + this.referenceSource.hashCode()) * 31) + this.jumpLink.hashCode()) * 31;
        Integer num2 = this.userAnswer;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.notShow;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode4 + r1) * 31) + Integer.hashCode(this.userFeedback);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOptionB() {
        return this.optionB;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getQuestionType() {
        return this.questionType;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final QuestionVote getQuestionVote() {
        return this.questionVote;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getReferenceSource() {
        return this.referenceSource;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSerialNo() {
        return this.serialNo;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Integer getUserAnswer() {
        return this.userAnswer;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getUserFeedback() {
        return this.userFeedback;
    }

    @NotNull
    public String toString() {
        return "Question(time=" + this.time + ", answerDetail=" + this.answerDetail + ", businessType=" + this.businessType + ", contentType=" + this.contentType + ", homePageGuide=" + this.homePageGuide + ", optionA=" + this.optionA + ", optionAnswer=" + this.optionAnswer + ", serialNo=" + this.serialNo + ", optionB=" + this.optionB + ", question=" + this.question + ", questionType=" + this.questionType + ", questionVote=" + this.questionVote + ", referenceSource=" + this.referenceSource + ", jumpLink=" + this.jumpLink + ", userAnswer=" + this.userAnswer + ", notShow=" + this.notShow + ", userFeedback=" + this.userFeedback + ")";
    }

    public Question(long j2, @NotNull String answerDetail, @NotNull String businessType, @NotNull String contentType, @NotNull String homePageGuide, @NotNull String optionA, @Nullable Integer num, int i, @NotNull String optionB, @NotNull String question, @NotNull String questionType, @Nullable QuestionVote questionVote, @NotNull String referenceSource, @NotNull String jumpLink, @Nullable Integer num2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(answerDetail, "answerDetail");
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(homePageGuide, "homePageGuide");
        Intrinsics.checkNotNullParameter(optionA, "optionA");
        Intrinsics.checkNotNullParameter(optionB, "optionB");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(questionType, "questionType");
        Intrinsics.checkNotNullParameter(referenceSource, "referenceSource");
        Intrinsics.checkNotNullParameter(jumpLink, "jumpLink");
        this.time = j2;
        this.answerDetail = answerDetail;
        this.businessType = businessType;
        this.contentType = contentType;
        this.homePageGuide = homePageGuide;
        this.optionA = optionA;
        this.optionAnswer = num;
        this.serialNo = i;
        this.optionB = optionB;
        this.question = question;
        this.questionType = questionType;
        this.questionVote = questionVote;
        this.referenceSource = referenceSource;
        this.jumpLink = jumpLink;
        this.userAnswer = num2;
        this.notShow = z;
        this.userFeedback = i2;
    }

    public /* synthetic */ Question(long j2, String str, String str2, String str3, String str4, String str5, Integer num, int i, String str6, String str7, String str8, QuestionVote questionVote, String str9, String str10, Integer num2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? System.currentTimeMillis() : j2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? 0 : num, (i3 & 128) != 0 ? 0 : i, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? "" : str8, (i3 & 2048) != 0 ? new QuestionVote(0, 0) : questionVote, (i3 & 4096) != 0 ? "" : str9, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? null : num2, (i3 & 32768) != 0 ? false : z, (i3 & 65536) != 0 ? 0 : i2);
    }
}
