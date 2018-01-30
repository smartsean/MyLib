package cn.smartsean.lib.widget.common;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import cn.smartsean.lib.R;

/**
 * @author SmartSean on 18/1/4 11:33
 */
public class TitleBar extends Toolbar {

    private String mTitle;

    private Drawable mBackIcon;

    private float mTitleSize;

    private int mTitleColor;

    private Paint mTitlePaint;

    private PointF centerPoint;

    private float mMaxTitleWidth;

    private boolean showDivider;

    private Drawable mDivider;

    @ColorInt
    public static final int DEFAULT_TITLE_COLOR = 0xFF434343;

    public static final int DEFAULT_TITLE_MAX_LENGTH = 100;


    public TitleBar(Context context) {

        this(context, null);
    }

    public TitleBar(Context context, @Nullable AttributeSet attrs) {

        this(context, attrs, 0);
    }

    public TitleBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
        centerPoint = new PointF();
        if (null != attrs) initView(context, attrs);
    }

    private void initView(Context context, AttributeSet attributeSet) {

        TypedArray a = context.obtainStyledAttributes(attributeSet, R.styleable.TitleBar);
        mTitleSize = a.getDimension(R.styleable.TitleBar_tb_titleSize, 0.f);
        mBackIcon = a.getDrawable(R.styleable.TitleBar_tb_backIcon);
        mTitleColor = a.getColor(R.styleable.TitleBar_tb_titleColor, DEFAULT_TITLE_COLOR);
        mTitle = a.getString(R.styleable.TitleBar_tb_title);
        mMaxTitleWidth = a.getDimension(R.styleable.TitleBar_tb_maxTitleWidth, 0.f);
        showDivider = a.getBoolean(R.styleable.TitleBar_tb_showDivider, false);
        mDivider = a.getDrawable(R.styleable.TitleBar_tb_divider);
        a.recycle();

    }

    public void setTitle(String title) {

        if (null == title) return;
        if (title.length() > DEFAULT_TITLE_MAX_LENGTH)
            throw new IllegalArgumentException("mTitle is too long");
        this.mTitle = title;
        invalidate();
    }

    public void setTitle(@StringRes int titleRes) {

        if (0 == titleRes)
            throw new IllegalArgumentException("titleRes must be resource of type string");
        setTitle(getResources().getString(titleRes));
    }

    public void setTitleSize(float size) {

        setTitleSize(TypedValue.COMPLEX_UNIT_SP, size);
    }

    public void setTitleSize(int unit, float size) {

        this.mTitleSize = TypedValue.applyDimension(unit, size, getResources().getDisplayMetrics());
        invalidate();
    }

    public void setTitleColor(@ColorInt int color) {

        this.mTitleColor = color;
        invalidate();
    }


    public Resources getResources() {

        Context c = getContext();

        return null == c ? Resources.getSystem() : c.getResources();
    }

    private void setBackIcon(AppCompatActivity activity, Drawable backIcon) {

        this.mBackIcon = backIcon;
        if (null != this.mBackIcon) bindActivity(activity);
    }

    public void bindActivity(AppCompatActivity appCompatActivity) {

        appCompatActivity.setSupportActionBar(this);
        if (null != this.mBackIcon) {
            this.setNavigationIcon(mBackIcon);
//            appCompatActivity.getSupportActionBar().setHomeAsUpIndicator(mBackIcon);
//            appCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            appCompatActivity.getSupportActionBar().setDisplayShowTitleEnabled(false);
            this.setNavigationOnClickListener(new OnNavigationClickListener(appCompatActivity));
        }
    }

    class OnNavigationClickListener implements OnClickListener {

        private Activity activity;

        public OnNavigationClickListener(Activity activity) {

            this.activity = activity;
        }

        @Override
        public void onClick(View v) {

            activity.onBackPressed();
        }
    }

    public void setBackIcon(AppCompatActivity activity, @DrawableRes int backIconRes) {

        if (0 == backIconRes)
            throw new IllegalArgumentException("backIconRes must be resource of type drawable");
        setBackIcon(activity, ContextCompat.getDrawable(getContext(), backIconRes));
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        if (null != mTitle && mTitle.length() > 0) drawTitle(canvas);
        if (showDivider) drawDivider(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        super.onSizeChanged(w, h, oldw, oldh);
        centerPoint.set(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
    }

    private void drawDivider(Canvas canvas) {

        if (null == mDivider) return;
        int height = mDivider.getIntrinsicHeight();
        mDivider.setBounds(0, getHeight() - height, getWidth(), getHeight());
        mDivider.draw(canvas);
    }

    private void drawTitle(Canvas canvas) {

        Paint paint = getTitlePaint();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float y = (getBottom() + getTop() - fontMetrics.bottom - fontMetrics.top) / 2;
        int maxLength = paint.breakText(mTitle, 0, mTitle.length(), true, getMaxTitleWidth(), null);
        canvas.drawText(mTitle.substring(0, maxLength), centerPoint.x, y, paint);
    }

    private Paint getTitlePaint() {

        if (null == mTitlePaint) {
            mTitlePaint = new Paint();
        }
        mTitlePaint.reset();
        mTitlePaint.setColor(getTitleColor());
        mTitlePaint.setTextSize(getTitleSize());
        mTitlePaint.setStyle(Paint.Style.FILL);
        mTitlePaint.setTextAlign(Paint.Align.CENTER);
        mTitlePaint.setAntiAlias(true);
        return mTitlePaint;
    }

    private float getMaxTitleWidth() {

        if (mMaxTitleWidth > 0) return mMaxTitleWidth;
        else return getMeasuredWidth();
    }

    @ColorInt
    private int getTitleColor() {

        return 0 == mTitleColor ? DEFAULT_TITLE_COLOR : mTitleColor;
    }

    private float getTitleSize() {

        return mTitleSize > 0 ? mTitleSize : getMeasuredHeight() / 3;
    }

    class BackIconWrap extends LayerDrawable {

        /**
         * Creates a new layer drawable with the list of specified layers.
         *
         * @param layers a list of drawables to use as layers in this new drawable,
         *               must be non-null
         */
        public BackIconWrap(@NonNull Drawable[] layers) {

            super(layers);
        }


    }
}