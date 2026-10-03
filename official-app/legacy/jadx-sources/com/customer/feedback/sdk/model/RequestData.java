package com.customer.feedback.sdk.model;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData;", "", "()V", TombstoneParser.keyBrand, "Companion", "Contact", "Feedback", "Log", "Model", "OpenId", "Os", "Statistics", "Lcom/customer/feedback/sdk/model/RequestData$Brand;", "Lcom/customer/feedback/sdk/model/RequestData$Contact;", "Lcom/customer/feedback/sdk/model/RequestData$Feedback;", "Lcom/customer/feedback/sdk/model/RequestData$Log;", "Lcom/customer/feedback/sdk/model/RequestData$Model;", "Lcom/customer/feedback/sdk/model/RequestData$OpenId;", "Lcom/customer/feedback/sdk/model/RequestData$Os;", "Lcom/customer/feedback/sdk/model/RequestData$Statistics;", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RequestData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TYPE_BRAND = "brand";

    @NotNull
    public static final String TYPE_CONTACT = "contact";

    @NotNull
    public static final String TYPE_FEEDBACK = "feedback";

    @NotNull
    public static final String TYPE_LOG = "log";

    @NotNull
    public static final String TYPE_MODEL = "model";

    @NotNull
    public static final String TYPE_OPEN_ID = "openId";

    @NotNull
    public static final String TYPE_OS = "os";

    @NotNull
    public static final String TYPE_STATISTICS = "statistics";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Brand;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Brand extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Brand(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Companion;", "", "()V", "TYPE_BRAND", "", "TYPE_CONTACT", "TYPE_FEEDBACK", "TYPE_LOG", "TYPE_MODEL", "TYPE_OPEN_ID", "TYPE_OS", "TYPE_STATISTICS", "fromString", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "content", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final RequestData fromString(@NotNull String des, @NotNull String content) {
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            switch (des.hashCode()) {
                case -1010580219:
                    if (des.equals("openId")) {
                        return new OpenId(des, content);
                    }
                    return null;
                case -191501435:
                    if (des.equals(RequestData.TYPE_FEEDBACK)) {
                        return new Feedback(des, content);
                    }
                    return null;
                case -94588637:
                    if (des.equals(RequestData.TYPE_STATISTICS)) {
                        return new Statistics(des, content);
                    }
                    return null;
                case 3556:
                    if (des.equals("os")) {
                        return new Os(des, content);
                    }
                    return null;
                case 107332:
                    if (des.equals("log")) {
                        return new Log(des, content);
                    }
                    return null;
                case 93997959:
                    if (des.equals("brand")) {
                        return new Brand(des, content);
                    }
                    return null;
                case 104069929:
                    if (des.equals("model")) {
                        return new Model(des, content);
                    }
                    return null;
                case 951526432:
                    if (des.equals(RequestData.TYPE_CONTACT)) {
                        return new Contact(des, content);
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Contact;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Contact extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Contact(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Feedback;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Feedback extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Feedback(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Log;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Log extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Log(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Model;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Model extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Model(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$OpenId;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OpenId extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenId(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Os;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Os extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Os(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/customer/feedback/sdk/model/RequestData$Statistics;", "Lcom/customer/feedback/sdk/model/RequestData;", "des", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDes", "Feedback_sdkRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Statistics extends RequestData {

        @NotNull
        private final String content;

        @NotNull
        private final String des;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Statistics(@NotNull String des, @NotNull String content) {
            super(null);
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(content, "content");
            this.des = des;
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    private RequestData() {
    }

    public /* synthetic */ RequestData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
