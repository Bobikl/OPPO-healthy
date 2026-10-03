package feedbackg;

import android.text.TextUtils;
import com.customer.feedback.sdk.FeedbackHelper;
import com.customer.feedback.sdk.model.RequestData;
import com.oplus.aiunit.vision.dxm;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class feedbackh {

    @NotNull
    public static final feedbackh feedbacka = new feedbackh();

    public static final class feedbacka extends Lambda implements Function1<feedbackh, Unit> {
        public final /* synthetic */ JSONObject feedbacka;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public feedbacka(JSONObject jSONObject) {
            super(1);
            this.feedbacka = jSONObject;
        }

        @Override // p010kotlin.jvm.functions.Function1
        public final Unit invoke(feedbackh feedbackhVar) {
            feedbackh ktxRunOnUi = feedbackhVar;
            Intrinsics.checkNotNullParameter(ktxRunOnUi, "$this$ktxRunOnUi");
            FeedbackHelper.RequestMadeCallback requestMadeCallback = com.customer.feedback.sdk.feedbacka.h;
            if (requestMadeCallback != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = this.feedbacka.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    String value = this.feedbacka.optString(key);
                    if (!TextUtils.isEmpty(value)) {
                        RequestData.Companion companion = RequestData.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        RequestData requestDataFromString = companion.fromString(key, value);
                        if (requestDataFromString != null) {
                            arrayList.add(requestDataFromString);
                        }
                    }
                }
                requestMadeCallback.onRequestMade(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void a(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        dxm.a(new feedbacka(jsonObject), feedbacka);
    }
}
