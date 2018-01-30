package cn.smartsean.lib.utils.filter;

import android.text.InputFilter;
import android.text.Spanned;

import cn.smartsean.lib.utils.RegexUtils;

/**
 * 设置EditText不能输入中文的Filter
 *
 * @author SmartSean on 18/1/4 11:38
 */
public class ChineseFilter implements InputFilter {
    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        if (RegexUtils.isZh(source)) {
            return "";
        }
        return null;
    }
}