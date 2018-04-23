package com.mim.bountyportals;

import android.app.Application;

import com.mim.bountyportals.utils.TypefaceUtil;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;
import org.acra.sender.HttpSender;

/**
 * Created by fazyab.pervaiz on 4/19/2018.
 */
@ReportsCrashes(
        httpMethod = HttpSender.Method.PUT,
        reportType = HttpSender.Type.JSON,
        formUriBasicAuthLogin = "tester",
        formUriBasicAuthPassword = "12345"
)
public class ApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ACRA.init(this);
        /*below method to use default font for alll*/
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/test.ttf"); // font from assets: "assets/fonts/Roboto-Regular.ttf

    }
}
