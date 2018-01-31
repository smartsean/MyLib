package cn.smartsean.lib.widget.dialog;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


import cn.smartsean.lib.R;
import cn.smartsean.lib.utils.DensityUtils;

import static android.view.Gravity.CENTER;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

/**
 * @author SmartSean
 */
public abstract class BaseDialogFragment extends DialogFragment {

    private int mWidth = WRAP_CONTENT;
    private int mHeight = WRAP_CONTENT;
    private int mGravity = CENTER;
    private int mOffsetX = 0;
    private int mOffsetY = 0;
    private int mAnimation = R.style.DialogBaseAnimation;
    protected DialogResultListener mDialogResultListener;
    protected DialogDismissListener mDialogDismissListener;

    protected static Bundle getArgumentBundle(Builder b) {
        Bundle bundle = new Bundle();
        bundle.putInt("mWidth", b.mWidth);
        bundle.putInt("mHeight", b.mHeight);
        bundle.putInt("mGravity", b.mGravity);
        bundle.putInt("mOffsetX", b.mOffsetX);
        bundle.putInt("mOffsetY", b.mOffsetY);
        bundle.putInt("mAnimation", b.mAnimation);
        return bundle;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mWidth = getArguments().getInt("mWidth");
            mHeight = getArguments().getInt("mHeight");
            mOffsetX = getArguments().getInt("mOffsetX");
            mOffsetY = getArguments().getInt("mOffsetY");
            mAnimation = getArguments().getInt("mAnimation");
            mGravity = getArguments().getInt("mGravity");
        }
    }

    protected abstract View setView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        setStyle();
        return setView(inflater, container, savedInstanceState);
    }

    /**
     * 设置统一样式
     */
    private void setStyle() {
        //获取Window
        Window window = getDialog().getWindow();
        //无标题
        getDialog().requestWindowFeature(STYLE_NO_TITLE);
        // 透明背景
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //设置宽高
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams wlp = window.getAttributes();
        wlp.width = mWidth;
        wlp.height = mHeight;
        //设置对齐方式
        wlp.gravity = mGravity;
        //设置偏移量
        wlp.x = DensityUtils.dip2px(getDialog().getContext(), mOffsetX);
        wlp.y = DensityUtils.dip2px(getDialog().getContext(), mOffsetY);
        //设置动画
        window.setWindowAnimations(mAnimation);
        window.setAttributes(wlp);
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        if (mDialogDismissListener != null) {
            mDialogDismissListener.dismiss(this);
        }
    }

    public BaseDialogFragment setDialogResultListener(DialogResultListener dialogResultListener) {
        this.mDialogResultListener = dialogResultListener;
        return this;
    }

    public BaseDialogFragment setDialogDismissListener(DialogDismissListener dialogDismissListener) {
        this.mDialogDismissListener = dialogDismissListener;
        return this;
    }

    public static abstract class Builder<T extends Builder, D extends BaseDialogFragment> {
        private int mWidth = WRAP_CONTENT;
        private int mHeight = WRAP_CONTENT;
        private int mGravity = CENTER;
        private int mOffsetX = 0;
        private int mOffsetY = 0;
        private int mAnimation = R.style.DialogBaseAnimation;

        public T setSize(int mWidth, int mHeight) {
            this.mWidth = mWidth;
            this.mHeight = mHeight;
            return (T) this;
        }

        public T setGravity(int mGravity) {
            this.mGravity = mGravity;
            return (T) this;
        }

        public T setOffsetX(int mOffsetX) {
            this.mOffsetX = mOffsetX;
            return (T) this;
        }

        public T setOffsetY(int mOffsetY) {
            this.mOffsetY = mOffsetY;
            return (T) this;
        }

        public T setAnimation(int mAnimation) {
            this.mAnimation = mAnimation;
            return (T) this;
        }

        public abstract D build();

        protected void clear() {
            this.mWidth = WRAP_CONTENT;
            this.mHeight = WRAP_CONTENT;
            this.mGravity = CENTER;
            this.mOffsetX = 0;
            this.mOffsetY = 0;
        }
    }
}
