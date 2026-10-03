package com.oplus.pantanal.seedling.intent;

import android.content.Context;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/intent/IIntentManager;", "", "registerResultCallBack", "", "context", "Landroid/content/Context;", "actions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)V", "sendSeedling", "", TraceConstants.KEY_ACTION, "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "callBack", "Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack;", "sendSeedlings", "intents", "", "unRegisterResultCallBack", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IIntentManager {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ int sendSeedling$default(IIntentManager iIntentManager, Context context, SeedlingIntent seedlingIntent, IIntentResultCallBack iIntentResultCallBack, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSeedling");
        }
        if ((i & 4) != 0) {
            iIntentResultCallBack = null;
        }
        return iIntentManager.sendSeedling(context, seedlingIntent, iIntentResultCallBack);
    }

    void registerResultCallBack(@NotNull Context context, @NotNull String[] actions);

    int sendSeedling(@NotNull Context context, @NotNull SeedlingIntent intent, @Nullable IIntentResultCallBack callBack);

    int sendSeedlings(@NotNull Context context, @NotNull List<SeedlingIntent> intents);

    void unRegisterResultCallBack(@NotNull Context context);
}
