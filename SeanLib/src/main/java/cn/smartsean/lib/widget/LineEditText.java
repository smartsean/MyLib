package cn.smartsean.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import cn.smartsean.lib.R;

/**
 * 带下划线的EditText
 *
 * @author SmartSean on 18/1/4 11:29
 */
public class LineEditText extends android.support.v7.widget.AppCompatEditText {

    private Paint mPaint;

    /**
     * @param context
     * @param attrs
     */
    public LineEditText(Context context, AttributeSet attrs) {

        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LineEditText);
        int color = a.getColor(R.styleable.LineEditText_line_color, Color.BLUE);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(color);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画底线
        canvas.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this
                .getHeight() - 1, mPaint);
    }
}