package com.example.opponotificationrelay;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public final class SettingsActivity extends OfficialUiActivity {
    public static final String EXTRA_SECTION="section", NOTIFICATIONS="notifications", PROTECTION="protection", DEVICE="device", DIAGNOSTICS="diagnostics";
    private String section;
    private boolean rendering;
    private TextView tvListenerStatus;
    private TextView tvBtStatus;
    private TextView tvOfficialStatus;
    private TextView tvLastEvent;
    private TextView tvSelection;
    private TextView tvCredentials;
    private TextView tvStartup;
    private TextView tvWatchSettings;
    private android.widget.CompoundButton cbNapQuiet;
    private Button btnNapStart,btnNapEnd;
    private TextView tvNapQuiet;


    private EditText etMac;
    private RadioGroup rgProtocol;

    private RfcommWearTransport mTransport;

    private static final int REQ_BT_PERMS = 1001;
    private Runnable mPendingAction;
    private final android.os.Handler uiHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final Runnable uiRefresh = new Runnable() {
        @Override public void run() { refreshUi(); uiHandler.postDelayed(this, 2000); }
    };

    @Override
    protected void onUiCreate(Bundle savedInstanceState) {
        super.onUiCreate(savedInstanceState);
        FileLogger.init(this);
        FileLogger.i("SettingsActivity", "设置页打开");
        mTransport = RfcommWearTransport.getInstance(this);
        section=getIntent().getStringExtra(EXTRA_SECTION);
        if(!NOTIFICATIONS.equals(section) && !PROTECTION.equals(section) && !DEVICE.equals(section))section=DIAGNOSTICS;
        buildUi();
    }

    @Override
    protected void onUiResume() {
        super.onUiResume();
        refreshUi();
        uiHandler.postDelayed(uiRefresh, 2000);
        mTransport.setOnStatusChangeListener(new RfcommWearTransport.OnStatusChangeListener() {
            @Override
            public void onStatusChanged(final int state, final String message) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (tvBtStatus != null) {
                            tvBtStatus.setText("蓝牙链路：" + message);
                            if (state == RfcommWearTransport.STATE_READY) {
                                tvBtStatus.setTextColor(Color.parseColor("#72D4A3"));
                            } else if (state == RfcommWearTransport.STATE_CONNECTING || state == RfcommWearTransport.STATE_HANDSHAKE) {
                                tvBtStatus.setTextColor(Color.parseColor("#E5BD76"));
                            } else if (state == RfcommWearTransport.STATE_YIELDED) {
                                tvBtStatus.setTextColor(Color.parseColor("#AAAAAA"));
                            } else {
                                tvBtStatus.setTextColor(Color.parseColor("#F59D9D"));
                            }
                        }
                    }
                });
            }
        });
    }

    @Override protected void onUiPause() {
        uiHandler.removeCallbacks(uiRefresh);
        mTransport.setOnStatusChangeListener(null);
        super.onUiPause();
    }

    private void buildUi() {
        ScrollView scroll=new ScrollView(this);scroll.setFillViewport(true);scroll.setBackgroundColor(DeviceStyle.BG);
        LinearLayout root=new LinearLayout(this);root.setOrientation(LinearLayout.VERTICAL);
        int p=dp(20);root.setPadding(p,dp(8),p,dp(28));
        String title;
        if(NOTIFICATIONS.equals(section)){title="更多通知设置";buildNotifications(root);}
        else if(PROTECTION.equals(section)){title="防断连设置";buildConnection(root);buildListener(root,false);buildStartup(root);}
        else if(DEVICE.equals(section)){title="设备管理";buildPairing(root);buildConnection(root);}
        else {title="高级设置与诊断";buildHistoryData(root);buildListener(root,true);buildDiagnostics(root);}
        DeviceStyle.styleTree(root);scroll.addView(root);DeviceStyle.shell(this,title,scroll);
    }
    private boolean historyToggleRendering;
    private void buildHistoryData(LinearLayout root){
        LinearLayout box=card();TextView title=new TextView(this);title.setText("个人数据与历史记录");title.setTextSize(18);box.addView(title,wrap());
        TextView state=new TextView(this);state.setText(OfficialHistoryStore.status(this));state.setTextSize(13);
        Button importAll=new Button(this);importAll.setText("一键导入并合并全部个人数据");importAll.setEnabled(OfficialHistoryStore.allowed(this));
        addSwitchRow(box,"允许读取官方 App 数据","开启后可手动导入官方个人资料与全部历史；关闭后只读取独立版已保存的数据。",OfficialHistoryStore.allowed(this),(button,checked)->{
            if(historyToggleRendering)return;
            if(HistoryImportUi.running()){historyToggleRendering=true;button.setChecked(OfficialHistoryStore.allowed(this));historyToggleRendering=false;Toast.makeText(this,"请等待当前导入完成",Toast.LENGTH_SHORT).show();return;}
            try{OfficialHistoryStore.setAllowed(this,checked);importAll.setEnabled(checked);}catch(Exception e){button.setChecked(OfficialHistoryStore.allowed(this));}
        });
        importAll.setOnClickListener(v->HistoryImportUi.show(this,()->state.setText(OfficialHistoryStore.status(this))));box.addView(importAll,wrap());box.addView(state,wrap());root.addView(box,wrap());
        if(HistoryImportUi.running())uiHandler.post(()->HistoryImportUi.show(this,()->state.setText(OfficialHistoryStore.status(this))));
    }
    private void buildListener(LinearLayout root,boolean advanced) {
        // 状态卡片
        LinearLayout statusCard = card();
        tvListenerStatus = new TextView(this);
        tvListenerStatus.setTextSize(14);
        statusCard.addView(tvListenerStatus, wrap());

        if(advanced) {
        tvOfficialStatus = new TextView(this);
        tvOfficialStatus.setTextSize(14);
        tvOfficialStatus.setPadding(0,dp(8),0,dp(8));
        statusCard.addView(tvOfficialStatus, wrap());

        }
        tvBtStatus = new TextView(this);
        tvBtStatus.setTextSize(14);
        tvBtStatus.setText("蓝牙链路：未连接");
        tvBtStatus.setTextColor(Color.parseColor("#F59D9D"));
        statusCard.addView(tvBtStatus, wrap());

        Button btnSettings = new Button(this);
        btnSettings.setText("授予系统“通知使用权”");
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS));
            }
        });
        statusCard.addView(btnSettings, wrap());
        Button repairListener=new Button(this);
        repairListener.setText("重新绑定通知监听（不重连蓝牙）");
        repairListener.setOnClickListener(v -> {
            ListenerRecovery.request(this);
            Toast.makeText(this,"已请求系统重绑；15 秒后仍未绑定，请关闭再开启系统通知使用权。",Toast.LENGTH_LONG).show();
        });
        statusCard.addView(repairListener,wrap());
        if(advanced) {
        Button rebuildListener=new Button(this);
        rebuildListener.setText("修复监听组件（重绑失败时使用）");
        rebuildListener.setOnClickListener(v -> new android.app.AlertDialog.Builder(this)
            .setTitle("重建本应用通知监听组件？")
            .setMessage("仅短暂关闭再启用本应用的监听组件，触发系统重新绑定；不清空配对凭据、应用选择，不修改其他应用或自动切换通知授权。系统仍可能要求你重新开启通知使用权。")
            .setNegativeButton("取消",null).setPositiveButton("修复",(dialog,which)->ListenerRecovery.repairComponent(this)).show());
        statusCard.addView(rebuildListener,wrap());
        Button rootRepair=new Button(this);
        rootRepair.setText("Root 系统级重绑通知监听");
        rootRepair.setOnClickListener(v -> new android.app.AlertDialog.Builder(this)
            .setTitle("使用 Root 重置本应用监听授权？")
            .setMessage("仅短暂关闭再恢复本应用已获得的通知使用权，触发系统重新绑定；期间可能漏收通知。不修改其他应用，不重连蓝牙。若弹出 Root 授权，请允许。最终以“已实际绑定”为准。")
            .setNegativeButton("取消",null).setPositiveButton("执行重绑",(dialog,which)->ListenerRecovery.repairRoot(this)).show());
        statusCard.addView(rootRepair,wrap());

        }
        root.addView(statusCard, wrap());

    }

    private void addSwitchRow(LinearLayout parent,String title,String summary,boolean checked,android.widget.CompoundButton.OnCheckedChangeListener listener) {
        LinearLayout row=new LinearLayout(this);row.setOrientation(LinearLayout.HORIZONTAL);row.setGravity(android.view.Gravity.CENTER_VERTICAL);row.setPadding(0,dp(10),0,dp(10));
        LinearLayout labels=new LinearLayout(this);labels.setOrientation(LinearLayout.VERTICAL);
        TextView name=new TextView(this);name.setText(title);name.setTextSize(16);labels.addView(name);
        TextView hint=new TextView(this);hint.setText(summary);hint.setTextSize(12);labels.addView(hint);
        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(0,-2,1);lp.rightMargin=dp(16);row.addView(labels,lp);
        OfficialStyleSwitch toggle=new OfficialStyleSwitch(this);toggle.setContentDescription(title);toggle.setChecked(checked);toggle.setOnCheckedChangeListener(listener);row.addView(toggle,new LinearLayout.LayoutParams(-2,-2));
        row.setOnClickListener(v->toggle.toggle());parent.addView(row,wrap());
    }

    private void buildStartup(LinearLayout root) {
        LinearLayout startupCard=card();
        addSwitchRow(startupCard,"自动恢复","开机、系统重建进程或重新打开应用时，恢复上次开启的自动接管；手动停止后不会自动开启。",RelayConfig.autoRestore(this),(button,checked)-> {
            RelayConfig.setAutoRestore(this,checked);
            try {RelayForegroundService.refreshRestartPolicy(this);} catch(RuntimeException ignored) { }
            if(checked) BackgroundStart.restore(this,"用户开启自动恢复");
        });
        addSwitchRow(startupCard,"隐藏最近任务卡片","退到后台后隐藏任务卡片，转发继续运行；关闭后恢复显示。",RecentsVisibility.enabled(this),(button,checked)->RecentsVisibility.set(this,checked));
        addSwitchRow(startupCard,"接管切换提醒","切换到独立转发或让出给官方时发送提醒；关闭后仍正常接管和转发。",RelayConfig.handoverNotices(this),(button,checked)->RelayConfig.setHandoverNotices(this,checked));
        TextView startupHint=new TextView(this);
        startupHint.setText("请在系统中允许后台自启动并检查省电限制。隐藏任务卡片不等于防止系统清理。");
        startupHint.setTextSize(12);startupCard.addView(startupHint,wrap());
        Button systemAutostart=new Button(this);systemAutostart.setText("打开系统后台自启动设置");
        systemAutostart.setOnClickListener(v->BackgroundStart.openAutostart(this));startupCard.addView(systemAutostart,wrap());
        Button battery=new Button(this);battery.setText("打开本应用省电 / 后台限制设置");
        battery.setOnClickListener(v->BackgroundStart.openBattery(this));startupCard.addView(battery,wrap());
        tvStartup=new TextView(this);tvStartup.setTextSize(12);startupCard.addView(tvStartup,wrap());
        root.addView(startupCard,wrap());

    }

    private void buildNotifications(LinearLayout root) {
        addSwitchRow(root,"标题附带原应用名称","兼容手表将来源统一显示为转发程序的情况。",RelayConfig.sourceInTitle(this),(button,checked)->RelayConfig.setSourceInTitle(this,checked));
        Button sleep=new Button(this);sleep.setText("作息与午休设置（已移至睡眠）");
        sleep.setOnClickListener(v->startActivity(new Intent(this,SleepHabitsActivity.class)));root.addView(sleep,wrap());

    }

    private void buildPairing(LinearLayout root) {
        // 手表凭据与配置卡片
        LinearLayout configCard = card();
        TextView configTitle = new TextView(this);
        configTitle.setText("手表配对与鉴权参数");
        configTitle.setTextSize(16);
        configTitle.getPaint().setFakeBoldText(true);
        configCard.addView(configTitle, wrap());

        Button btnAutoExtract = new Button(this);
        btnAutoExtract.setText("读取 / 更新官方配对（Root，无需模块）");
        btnAutoExtract.setBackgroundColor(Color.parseColor("#3B82F6"));
        btnAutoExtract.setTextColor(Color.WHITE);
        btnAutoExtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mac=etMac.getText().toString().trim().toUpperCase(java.util.Locale.ROOT);
                if(!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(mac)){etMac.setError("请输入有效的蓝牙 MAC 地址");return;}
                RelayConfig.setTargetMac(SettingsActivity.this,mac);
                btnAutoExtract.setEnabled(false);
                new Thread(() -> {
                    RelayConfig.ImportResult res = RelayConfig.importOfficialPairing(getApplicationContext());
                    runOnUiThread(() -> {
                        if(isFinishing() || isDestroyed()) return;
                        btnAutoExtract.setEnabled(true);
                        if(res.updated && RelayForegroundService.enabled(SettingsActivity.this)) {
                            mTransport.stop();
                            RelayForegroundService.restartMonitoring(SettingsActivity.this);
                        }
                        refreshUi();
                        new android.app.AlertDialog.Builder(SettingsActivity.this).setTitle("配对读取结果")
                            .setMessage(res.message).setPositiveButton("确定",null).show();
                    });
                }, "OAF-import").start();
            }
        });
        configCard.addView(btnAutoExtract, wrap());
        Button readAppearance=new Button(this);readAppearance.setText("读取 / 更新设备外观（Root）");
        readAppearance.setOnClickListener(v->{readAppearance.setEnabled(false);DeviceIdentityStore.refresh(this,true,message->{
            if(isFinishing() || isDestroyed())return;readAppearance.setEnabled(true);
            new android.app.AlertDialog.Builder(this).setTitle("设备外观").setMessage(message).setPositiveButton("确定",null).show();
        });});configCard.addView(readAppearance,wrap());

        TextView lblMac = new TextView(this);
        lblMac.setText("手表蓝牙 MAC 地址：");
        lblMac.setTextSize(13);
        configCard.addView(lblMac, wrap());

        etMac = new EditText(this);
        etMac.setId(R.id.input_device_mac);etMac.setSingleLine(true);
        etMac.setHint("如 AA:BB:CC:DD:EE:FF");
        etMac.setText(RelayConfig.getTargetMac(this));
        configCard.addView(etMac, wrap());

        TextView lblKey = new TextView(this);
        lblKey.setText("已能独立连接时无需重复读取。重新配对请先用官方完成配对并连接，再直接读取；不再寻找模块导出文件。无模块读取仍需此设备允许访问官方 Keystore，暂不支持从零配对。");
        lblKey.setTextSize(13);
        configCard.addView(lblKey, wrap());
        tvCredentials=new TextView(this);
        tvCredentials.setTextSize(13);
        configCard.addView(tvCredentials,wrap());

        TextView lblProto = new TextView(this);
        lblProto.setText("协议代际选择：");
        lblProto.setTextSize(13);
        configCard.addView(lblProto, wrap());

        rgProtocol = new RadioGroup(this);rgProtocol.setId(R.id.protocol_group);
        RadioButton rb200 = new RadioButton(this);
        rb200.setId(R.id.protocol_watch_x2);
        rb200.setText("OPPO Watch X2 通知协议 (CID=200)");
        RadioButton rb1 = new RadioButton(this);
        rb1.setId(R.id.protocol_legacy);
        rb1.setText("兼容格式 CID=1（未验证）");
        rgProtocol.addView(rb200);
        rgProtocol.addView(rb1);
        if (RelayConfig.getProtocolCid(this) == 200) {
            rb200.setChecked(true);
        } else {
            rb1.setChecked(true);
        }
        configCard.addView(rgProtocol, wrap());

        Button btnSaveConfig = new Button(this);
        btnSaveConfig.setText("保存配对参数");
        btnSaveConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mac = etMac.getText().toString().trim().toUpperCase(java.util.Locale.ROOT);
                if(!android.bluetooth.BluetoothAdapter.checkBluetoothAddress(mac)){etMac.setError("请输入有效的蓝牙 MAC 地址");return;}
                int cid = (rgProtocol.getCheckedRadioButtonId() == rgProtocol.getChildAt(0).getId()) ? 200 : 1;
                RelayConfig.setTargetMac(SettingsActivity.this, mac);
                RelayConfig.setProtocolCid(SettingsActivity.this, cid);
                Toast.makeText(SettingsActivity.this, "配置已保存，下次连接时使用", Toast.LENGTH_SHORT).show();
            }
        });
        configCard.addView(btnSaveConfig, wrap());

        root.addView(configCard, wrap());


    }

    private void buildConnection(LinearLayout root) {
        // 蓝牙连接与测试控制
        LinearLayout actionCard = card();
        TextView actionTitle = new TextView(this);
        actionTitle.setText("自动接管");
        actionTitle.setTextSize(16);
        actionTitle.getPaint().setFakeBoldText(true);
        actionCard.addView(actionTitle, wrap());

        LinearLayout btnRow = new LinearLayout(this);
        btnRow.setOrientation(LinearLayout.HORIZONTAL);

        Button btnConnect = new Button(this);
        btnConnect.setText("开启自动接管");
        btnConnect.setBackgroundColor(Color.parseColor("#72D4A3"));
        btnConnect.setTextColor(Color.WHITE);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ensureBluetoothPermissions(new Runnable() {
                    @Override
                    public void run() {
                        // 先断开旧连接再重新发起，确保使用最新配置
                        mTransport.stop();
                        RelayForegroundService.restartMonitoring(SettingsActivity.this);
                        Toast.makeText(SettingsActivity.this, "已开启官方优先的自动接管", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        btnRow.addView(btnConnect, halfWidth());

        Button btnDisconnect = new Button(this);
        btnDisconnect.setText("停止自动接管");
        btnDisconnect.setBackgroundColor(Color.parseColor("#F59D9D"));
        btnDisconnect.setTextColor(Color.WHITE);
        btnDisconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelayForegroundService.stop(SettingsActivity.this);
                Toast.makeText(SettingsActivity.this, "已断开", Toast.LENGTH_SHORT).show();
            }
        });
        btnRow.addView(btnDisconnect, halfWidth());

        actionCard.addView(btnRow, wrap());

        root.addView(actionCard,wrap());

    }

    private void buildDiagnostics(LinearLayout root) {
        LinearLayout actionCard=card();
        Button btnTestSend = new Button(this);
        btnTestSend.setText("向手表发送测试通知");
        btnTestSend.setBackgroundColor(Color.parseColor("#E5BD76"));
        btnTestSend.setTextColor(Color.WHITE);
        btnTestSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ensureNotificationPermission();
                new android.app.AlertDialog.Builder(SettingsActivity.this).setTitle("测试通知")
                    .setMessage(RelayAlerts.test(SettingsActivity.this)).setPositiveButton("确定",null).show();
            }
        });
        actionCard.addView(btnTestSend, wrap());
        TextView alertHint=new TextView(this);
        alertHint.setText("切换提醒：官方启动后先让出，再发布手机通知，由官方转发；请在官方通知白名单中允许“手表通知转发”。官方退出后，独立通道鉴权成功才向手表发送接管提醒。提交发送不等于手表已收到。");
        actionCard.addView(alertHint,wrap());

        tvLastEvent = new TextView(this);
        tvLastEvent.setTextSize(13);
        actionCard.addView(tvLastEvent, wrap());

        Button trace=new Button(this);trace.setText("临时详细日志（15分钟）");
        trace.setOnClickListener(v -> {
            boolean enable=!FileLogger.wireTraceEnabled();FileLogger.setWireTrace(enable);
            Toast.makeText(this,enable?"详细日志已开启，15分钟后自动结束":"详细日志已关闭",Toast.LENGTH_SHORT).show();
        });actionCard.addView(trace,wrap());
        root.addView(actionCard, wrap());

        Button healthProbe=new Button(this);healthProbe.setText("手表健康同步测试");healthProbe.setOnClickListener(v->startActivity(new Intent(this,HealthSyncProbeActivity.class)));root.addView(healthProbe,wrap());

        // 日志信息卡片
        LinearLayout logCard = card();
        TextView logTitle = new TextView(this);
        logTitle.setText("调试日志");
        logTitle.setTextSize(16);
        logTitle.getPaint().setFakeBoldText(true);
        logCard.addView(logTitle, wrap());

        final TextView tvLogPath = new TextView(this);
        tvLogPath.setTextSize(12);
        tvLogPath.setTextColor(Color.parseColor("#374151"));
        tvLogPath.setText("日志文件: " + FileLogger.getLogFilePath());
        tvLogPath.setTextIsSelectable(true);
        logCard.addView(tvLogPath, wrap());

        TextView tvLogHint = new TextView(this);
        tvLogHint.setTextSize(11);
        tvLogHint.setTextColor(Color.parseColor("#9CA3AF"));
        tvLogHint.setText("提示: 可通过文件管理器打开上述路径查看完整日志，\n或通过 ADB 拉取: adb pull <路径> .");
        logCard.addView(tvLogHint, wrap());

        root.addView(logCard, wrap());

        Button officialPreview=new Button(this);
        officialPreview.setText("官方设置预览（Root）");
        officialPreview.setOnClickListener(v->startActivity(new Intent(this,OfficialSettingsActivity.class)));
        root.addView(officialPreview,wrap());
        tvWatchSettings=new TextView(this);tvWatchSettings.setTextSize(12);root.addView(tvWatchSettings,wrap());


    }

    private void pickNapTime(boolean startTime) {
        int minute=startTime ? NapQuietSettings.start(this) : NapQuietSettings.end(this);
        OfficialTimePicker.show(this,startTime?"请设置午休开始时间":"请设置午休结束时间",minute,chosen-> {
            int start=startTime?chosen:NapQuietSettings.start(this);
            int end=startTime?NapQuietSettings.end(this):chosen;
            if(!NapQuietPolicy.valid(start,end)) {
                new android.app.AlertDialog.Builder(this).setTitle("午休时间")
                    .setMessage("午休结束时间需要晚于开始时间，请重新设置。").setPositiveButton("确定",null).show();return;
            }
            NapQuietSettings.setRange(this,start,end);refreshUi();
        });
    }

    private static void text(TextView view,CharSequence value) {
        if(view!=null && !android.text.TextUtils.equals(view.getText(),value))view.setText(value);
    }
    @Override protected void onUiDestroy() {uiHandler.removeCallbacksAndMessages(null);mPendingAction=null;super.onUiDestroy();}
    private void refreshUi() {
        if(tvCredentials!=null) text(tvCredentials,RelayConfig.credentialStatus(this));
        if(tvStartup!=null) text(tvStartup,"应用自动恢复："+(RelayConfig.autoRestore(this)?"开启":"关闭")
            +"；系统后台自启动是否允许，请在系统设置确认。\n"+BackgroundStart.status);
        if(tvOfficialStatus!=null) {
            OfficialHealthMonitor.Snapshot s=OfficialHealthMonitor.snapshot();
            String label=s.presence==HandoverPolicy.Presence.ONLINE ? "在线（进程运行中）" :
                s.presence==HandoverPolicy.Presence.OFFLINE ? "离线（进程已退出或未安装）" : "状态未知";
            String auxiliary=s.listening ? (s.binders>0 ? "Binder 辅助：已监听 "+s.binders+" 个服务" : "Binder 辅助：暂无可监听服务") : "Binder 辅助：未启用";
            text(tvOfficialStatus,"官方健康："+label+"\n"+s.detail+"\n"+auxiliary+"\n接管状态："+s.ownership);
            tvOfficialStatus.setTextColor(Color.parseColor(s.presence==HandoverPolicy.Presence.UNKNOWN ? "#E5BD76" : "#72D4A3"));
        }
        if(tvSelection!=null)text(tvSelection,"应用通知 · 已选择 "+RelayConfig.selectedApps(this).size()+" 个应用");
        if(tvWatchSettings!=null)text(tvWatchSettings,"手表通知设置："+NotificationSettings.detail);
        if(cbNapQuiet!=null) {
            boolean napEnabled=NapQuietSettings.enabled(this);
            rendering=true;
            if(cbNapQuiet.isChecked()!=napEnabled)cbNapQuiet.setChecked(napEnabled);
            rendering=false;
            text(btnNapStart,"午休开始时间    "+NapQuietPolicy.time(NapQuietSettings.start(this)));
            text(btnNapEnd,"午休结束时间    "+NapQuietPolicy.time(NapQuietSettings.end(this)));
            btnNapStart.setEnabled(napEnabled);btnNapEnd.setEnabled(napEnabled);
            text(tvNapQuiet,!napEnabled ? "午休静默已关闭" :
                RelayConfig.getProtocolCid(this)!=RelayPayloadEncoder.COMMAND_POST_PARSED ? "兼容格式不支持午休静默，请选择Watch X2通知协议。" :
                NapQuietSettings.active(this) ? "当前处于午休时段：消息照常送达，静默提醒" : "当前不在午休时段：正常提醒");
        }

        boolean enabled = isNotificationListenerEnabled();
        text(tvListenerStatus,"通知监听服务：" + (RelayNotificationListenerService.bound ? "已实际绑定" : enabled ? "已授权但未绑定，真实应用通知无法接收" : "未授权 (点击下方按钮授予)")
            + (RelayNotificationListenerService.bound || ListenerRecovery.detail.isEmpty() ? "" : "\n"+ListenerRecovery.detail));
        if(tvListenerStatus!=null)tvListenerStatus.setTextColor(RelayNotificationListenerService.bound ? Color.parseColor("#72D4A3") : Color.parseColor("#F59D9D"));

        text(tvLastEvent,"处理事件数：" + RelayStore.eventCount(this)
                + "\n最近一次通知：" + RelayStore.lastEvent(this)+"\n当前处理结果："+RelayStore.lastDecision());
    }

    private boolean isNotificationListenerEnabled() {
        return ListenerRecovery.authorized(this);
    }

    private void ensureBluetoothPermissions(Runnable onGranted) {
        if (Build.VERSION.SDK_INT >= 31) {
            // Android 12+ 必须运行时请求蓝牙权限
            String[] perms = {
                Manifest.permission.BLUETOOTH_CONNECT,
                Manifest.permission.BLUETOOTH_SCAN
            };
            boolean allGranted = true;
            for (String p : perms) {
                if (checkSelfPermission(p) != PackageManager.PERMISSION_GRANTED) {
                    allGranted = false;
                    break;
                }
            }
            if (!allGranted) {
                mPendingAction = onGranted;
                requestPermissions(perms, REQ_BT_PERMS);
                return;
            }
        } else {
            // Android 10-11 需要位置权限才能使用蓝牙
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {
                mPendingAction = onGranted;
                requestPermissions(
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQ_BT_PERMS);
                return;
            }
        }
        ensureNotificationPermission();
        onGranted.run();
    }

    private void ensureNotificationPermission() {
        if(Build.VERSION.SDK_INT>=33 && checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS)!=PackageManager.PERMISSION_GRANTED)
            requestPermissions(new String[]{Manifest.permission.POST_NOTIFICATIONS},1002);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQ_BT_PERMS) {
            boolean allGranted = grantResults.length>0;
            for (int r : grantResults) {
                if (r != PackageManager.PERMISSION_GRANTED) {
                    allGranted = false;
                    break;
                }
            }
            if (allGranted && mPendingAction != null) {
                ensureNotificationPermission();
                mPendingAction.run();
            } else {
                Toast.makeText(this, "蓝牙权限未授予，无法连接手表。请在系统设置中手动授权。", Toast.LENGTH_LONG).show();
            }
            mPendingAction = null;
        }
    }

    private LinearLayout card() {
        LinearLayout c = new LinearLayout(this);
        c.setOrientation(LinearLayout.VERTICAL);
        c.setBackgroundResource(R.drawable.device_card);
        int p = dp(16);c.setPadding(p,p,p,p);
        return c;
    }

    private LinearLayout.LayoutParams wrap() {
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(-1,-2);
        params.bottomMargin=dp(10);return params;
    }

    private LinearLayout.LayoutParams halfWidth() {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);
        lp.setMargins(dp(4), dp(6), dp(4), dp(6));
        return lp;
    }

    private int dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }
}
