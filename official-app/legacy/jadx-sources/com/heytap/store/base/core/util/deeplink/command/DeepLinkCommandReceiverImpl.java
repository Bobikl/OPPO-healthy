package com.heytap.store.base.core.util.deeplink.command;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.util.deeplink.DeepLinekUtilKt;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.deeplink.PatternUtil;
import com.heytap.store.base.core.util.statistics.bean.StatisticsBean;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.LogUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DeepLinkCommandReceiverImpl implements IDeepLinkCommandReceiver {
    private static final DeepLinkCommandReceiverImpl instance = new DeepLinkCommandReceiverImpl();
    private final List<DeepLinkCommand> linkCommandList = new ArrayList();

    private DeepLinkCommandReceiverImpl() {
    }

    public static DeepLinkCommandReceiverImpl getInstance() {
        return instance;
    }

    @Override // com.heytap.store.base.core.util.deeplink.command.IDeepLinkCommandReceiver
    public void addCommand(DeepLinkCommand deepLinkCommand) {
        if (deepLinkCommand == null || this.linkCommandList.contains(deepLinkCommand)) {
            return;
        }
        this.linkCommandList.add(deepLinkCommand);
    }

    @Override // com.heytap.store.base.core.util.deeplink.command.IDeepLinkCommandReceiver
    public DeepLinkCommand lookupCommandByAddress(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTransformHost = DeepLinekUtilKt.transformHost(str);
        Iterator<DeepLinkCommand> it = this.linkCommandList.iterator();
        while (it.hasNext()) {
            DeepLinkCommand next = it.next();
            String deepLinkUrl = next.getDeepLinkUrl();
            if (!TextUtils.isEmpty(deepLinkUrl)) {
                if (strTransformHost.startsWith(deepLinkUrl)) {
                    return next;
                }
                if (PatternUtil.find(strTransformHost, "/product/index[\\s\\S]*") && next.getDeepLinkUrlType() == 119) {
                    return next;
                }
                if ((PatternUtil.find(strTransformHost, "/products/[0-9]+.html[\\s\\S]*") && next.getDeepLinkUrlType() == 120) || strTransformHost.startsWith(deepLinkUrl.replaceFirst("oppostore://", ""))) {
                    return next;
                }
            }
        }
        return null;
    }

    @Override // com.heytap.store.base.core.util.deeplink.command.IDeepLinkCommandReceiver
    public DeepLinkCommand lookupCommandByType(int i) {
        for (DeepLinkCommand deepLinkCommand : this.linkCommandList) {
            if (deepLinkCommand.getDeepLinkUrlType() == i) {
                return deepLinkCommand;
            }
        }
        return null;
    }

    @Override // com.heytap.store.base.core.util.deeplink.command.IDeepLinkCommandReceiver
    public void runCommand(Activity activity, DeepLinkInterpreter deepLinkInterpreter, Handler handler, StatisticsBean statisticsBean) {
        DeepLinkCommand deepLinkCommand = deepLinkInterpreter.getDeepLinkCommand();
        if (deepLinkCommand != null) {
            deepLinkCommand.execute(activity, deepLinkInterpreter, handler, statisticsBean);
        } else {
            LogUtils.INSTANCE.i("DeepLinkCommandReceiverImpl", ContextGetterUtils.INSTANCE.getApp().getResources().getString(R.string.pf_core_base_params_type_unknow));
        }
    }
}
