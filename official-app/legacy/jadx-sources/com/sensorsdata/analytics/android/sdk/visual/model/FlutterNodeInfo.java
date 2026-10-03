package com.sensorsdata.analytics.android.sdk.visual.model;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class FlutterNodeInfo extends NodeInfo {
    private final String flutter_lib_version;
    private final String screen_name;

    public static class FlutterNodeBuilder extends NodeInfo.Builder<FlutterNodeInfo> {
        private String flutter_lib_version;
        private String screen_name;

        public FlutterNodeBuilder setFlutter_lib_version(String str) {
            this.flutter_lib_version = str;
            return this;
        }

        public FlutterNodeBuilder setScreen_name(String str) {
            this.screen_name = str;
            return this;
        }

        @Override // com.sensorsdata.analytics.android.sdk.visual.model.NodeInfo.Builder
        public FlutterNodeInfo create() {
            return new FlutterNodeInfo(this.webNodes, this.alertInfos, this.title, this.screen_name, this.flutter_lib_version, this.status);
        }
    }

    public static FlutterNodeInfo createAlertInfo(List<NodeInfo.AlertInfo> list) {
        return (FlutterNodeInfo) new FlutterNodeBuilder().setAlertInfo(list).setStatus(NodeInfo.Status.FAILURE).create();
    }

    public static FlutterNodeInfo createNodesInfo(List<? extends CommonNode> list) {
        return (FlutterNodeInfo) new FlutterNodeBuilder().setWebNodes(list).setStatus(NodeInfo.Status.SUCCESS).create();
    }

    public static FlutterNodeInfo createPageInfo(String str, String str2, String str3) {
        return (FlutterNodeInfo) new FlutterNodeBuilder().setScreen_name(str2).setFlutter_lib_version(str3).setTitle(str).create();
    }

    public String getFlutter_lib_version() {
        return this.flutter_lib_version;
    }

    public String getScreen_name() {
        return this.screen_name;
    }

    private FlutterNodeInfo(List<? extends CommonNode> list, List<NodeInfo.AlertInfo> list2, String str, String str2, String str3, NodeInfo.Status status) {
        this.webNodes = list;
        this.alertInfos = list2;
        this.title = str;
        this.screen_name = str2;
        this.flutter_lib_version = str3;
        this.status = status;
    }
}
