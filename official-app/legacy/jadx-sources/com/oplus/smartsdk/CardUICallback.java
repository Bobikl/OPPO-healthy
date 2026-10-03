package com.oplus.smartsdk;

import android.view.View;
import androidx.annotation.UiThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/oplus/smartsdk/CardUICallback;", "", "onCall", "", "view", "Landroid/view/View;", "code", "", "cardName", "", "Companion", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface CardUICallback {
    public static final int CODE_PARSE_ERROR = 1;
    public static final int CODE_REFRESH_ERROR = 2;
    public static final int CODE_SUCCESS = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/oplus/smartsdk/CardUICallback$Companion;", "", "()V", "CODE_PARSE_ERROR", "", "CODE_REFRESH_ERROR", "CODE_SUCCESS", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CODE_PARSE_ERROR = 1;
        public static final int CODE_REFRESH_ERROR = 2;
        public static final int CODE_SUCCESS = 0;

        private Companion() {
        }
    }

    @UiThread
    void onCall(@Nullable View view, int code, @NotNull String cardName);
}
