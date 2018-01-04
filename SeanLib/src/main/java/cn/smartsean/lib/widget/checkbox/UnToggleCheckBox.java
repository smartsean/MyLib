package cn.smartsean.lib.widget.checkbox;

import android.content.Context;
import android.util.AttributeSet;

/**
 * 屏蔽check事件的CheckBox，用onclick事件实现需求
 *
 * @author SmartSean on 18/1/4 11:35
 */
public class UnToggleCheckBox extends android.support.v7.widget.AppCompatCheckBox {
    public UnToggleCheckBox(Context context) {
        super(context);
    }

    public UnToggleCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public UnToggleCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void toggle() {
        //关闭checked事件
        //super.toggle();
    }
}