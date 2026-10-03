package com.sensorsdata.analytics.android.sdk.exposure;

import android.view.View;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureConfig;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureData;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SAExposureProtocolImpl implements SAModuleProtocol {
    private boolean mEnable = false;
    private SAExposedProcess mExposedProcess;

    private void addExposureView(View view, SAExposureData sAExposureData) {
        SAExposedProcess sAExposedProcess = this.mExposedProcess;
        if (sAExposedProcess != null) {
            sAExposedProcess.addExposureView(view, sAExposureData);
        }
    }

    private void init(SAExposureConfig sAExposureConfig) {
        if (sAExposureConfig == null) {
            sAExposureConfig = new SAExposureConfig(0.0f, 0.0d, true);
        }
        this.mExposedProcess = new SAExposedProcess(sAExposureConfig);
    }

    private void removeExposureView(View view, String str) {
        SAExposedProcess sAExposedProcess = this.mExposedProcess;
        if (sAExposedProcess != null) {
            sAExposedProcess.removeExposureView(view, str);
        }
    }

    private void setExposureIdentifier(View view, String str) {
        SAExposedProcess sAExposedProcess = this.mExposedProcess;
        if (sAExposedProcess != null) {
            sAExposedProcess.setExposureIdentifier(view, str);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public String getModuleName() {
        return Modules.Exposure.MODULE_NAME;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public int getPriority() {
        return 5;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void install(SAContextManager sAContextManager) {
        if (!sAContextManager.getInternalConfigs().saConfigOptions.isDisableSDK()) {
            setModuleState(true);
        }
        init(sAContextManager.getInternalConfigs().saConfigOptions.getExposureConfig());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public <T> T invokeModuleFunction(String str, Object... objArr) {
        str.hashCode();
        switch (str) {
            case "addExposureView":
                addExposureView((View) objArr[0], (SAExposureData) objArr[1]);
                return null;
            case "removeExposureView":
                if (objArr.length == 2) {
                    removeExposureView((View) objArr[0], (String) objArr[1]);
                } else {
                    removeExposureView((View) objArr[0], null);
                }
                return null;
            case "updateExposureProperties":
                this.mExposedProcess.updateExposureView((View) objArr[0], (JSONObject) objArr[1]);
                return null;
            case "setExposureIdentifier":
                setExposureIdentifier((View) objArr[0], (String) objArr[1]);
                return null;
            default:
                return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public boolean isEnable() {
        return this.mEnable;
    }

    @Override // com.sensorsdata.analytics.android.sdk.core.mediator.protocol.SAModuleProtocol
    public void setModuleState(boolean z) {
        if (this.mEnable != z) {
            this.mEnable = z;
        }
    }
}
