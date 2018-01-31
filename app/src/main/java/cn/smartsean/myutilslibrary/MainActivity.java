package cn.smartsean.myutilslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wang.avi.AVLoadingIndicatorView;

import cn.smartsean.lib.utils.Logger;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AVLoadingIndicatorView avLoadingIndicatorView;
        Retrofit retrofit;
    }
}
