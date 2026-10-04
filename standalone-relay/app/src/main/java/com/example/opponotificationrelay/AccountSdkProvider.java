package com.example.opponotificationrelay;
/** Private provider for the bundled account SDK; never opens the official health provider. */
public final class AccountSdkProvider extends com.oplus.accountsdk.open.core.AcOpenCoreProvider {
    @Override public boolean onCreate(){AccountSdk.silence();return super.onCreate();}
}
