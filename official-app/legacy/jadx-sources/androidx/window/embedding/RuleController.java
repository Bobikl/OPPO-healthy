package androidx.window.embedding;

import android.content.Context;
import androidx.annotation.XmlRes;
import java.io.IOException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/RuleController;", "", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "(Landroidx/window/embedding/EmbeddingBackend;)V", "addRule", "", "rule", "Landroidx/window/embedding/EmbeddingRule;", "clearRules", "getRules", "", "removeRule", "setRules", "rules", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RuleController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EmbeddingBackend embeddingBackend;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Landroidx/window/embedding/RuleController$Companion;", "", "()V", "getInstance", "Landroidx/window/embedding/RuleController;", "context", "Landroid/content/Context;", "parseRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RuleController getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context applicationContext = context.getApplicationContext();
            EmbeddingBackend.Companion companion = EmbeddingBackend.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return new RuleController(companion.getInstance(applicationContext));
        }

        @JvmStatic
        @NotNull
        public final Set<EmbeddingRule> parseRules(@NotNull Context context, @XmlRes int staticRuleResourceId) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            RuleParser ruleParser = RuleParser.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            Set<EmbeddingRule> rules$window_release = ruleParser.parseRules$window_release(applicationContext, staticRuleResourceId);
            return rules$window_release == null ? SetsKt__SetsKt.emptySet() : rules$window_release;
        }
    }

    public RuleController(@NotNull EmbeddingBackend embeddingBackend) {
        Intrinsics.checkNotNullParameter(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    @JvmStatic
    @NotNull
    public static final RuleController getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }

    @JvmStatic
    @NotNull
    public static final Set<EmbeddingRule> parseRules(@NotNull Context context, @XmlRes int i) {
        return INSTANCE.parseRules(context, i);
    }

    public final void addRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.embeddingBackend.addRule(rule);
    }

    public final void clearRules() {
        this.embeddingBackend.setRules(SetsKt__SetsKt.emptySet());
    }

    @NotNull
    public final Set<EmbeddingRule> getRules() {
        return this.embeddingBackend.getRules();
    }

    public final void removeRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.embeddingBackend.removeRule(rule);
    }

    public final void setRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.embeddingBackend.setRules(rules);
    }
}
