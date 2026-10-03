package com.platform.usercenter.tools.env;

/* JADX INFO: loaded from: classes9.dex */
public class EnvConstantManager implements IEnvConstant {
    private IEnvConstant install;

    public static class SingletonHolder {
        private static EnvConstantManager INSTANCE = new EnvConstantManager();

        private SingletonHolder() {
        }
    }

    public static EnvConstantManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override // com.platform.usercenter.tools.env.IEnvConstant
    public boolean DEBUG() {
        if (existInstall()) {
            return false;
        }
        return this.install.DEBUG();
    }

    @Override // com.platform.usercenter.tools.env.IEnvConstant
    public int ENV() {
        if (existInstall()) {
            return 0;
        }
        return this.install.ENV();
    }

    public boolean existInstall() {
        return this.install == null;
    }

    public void setInstall(IEnvConstant iEnvConstant) {
        this.install = iEnvConstant;
    }

    private EnvConstantManager() {
    }
}
