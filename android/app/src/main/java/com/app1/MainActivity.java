package com.app1;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactRootView;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;

public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReactRootView app1RootView = new ReactRootView(getApplication());
        ReactInstanceManagerBuilder builder = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setDefaultHardwareBackBtnHandler(this)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .addPackage(new MainReactPackage())
                .setCurrentActivity(this)
                .setBundleAssetName("app1.jsbundle")
                .setJSMainModuleName("app1")
                .setUseDeveloperSupport(false);
        ReactInstanceManager appReactInstanceManager = builder.build();

        app1RootView.startReactApplication(appReactInstanceManager, "app1", null);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.app1);
        linearLayout.addView(app1RootView);

        ReactRootView app2RootView = new ReactRootView(getApplication());
        builder = ReactInstanceManager.builder()
                .setApplication(getApplication())
                .setDefaultHardwareBackBtnHandler(this)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .addPackage(new MainReactPackage())
                .setCurrentActivity(this)
                .setBundleAssetName("app2.jsbundle")
                .setJSMainModuleName("app2")
                .setUseDeveloperSupport(false);
        ReactInstanceManager appReactInstanceManager2 = builder.build();

        app2RootView.startReactApplication(appReactInstanceManager2, "app2", null);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.app2);
        frameLayout.addView(app2RootView);
    }

    @Override
    public void invokeDefaultOnBackPressed() {

    }
}
