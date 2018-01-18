package cn.alphabets;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by luohao on 2018/1/18.
 */

public class RNSGManager extends SimpleViewManager<RNSGView> {
    @Override
    public String getName() {
        return "RNSegmentedControlAndroid";
    }

    @Override
    protected RNSGView createViewInstance(ThemedReactContext reactContext) {
        return new RNSGView(reactContext);
    }
}
