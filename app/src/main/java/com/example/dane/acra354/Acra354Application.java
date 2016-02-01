package com.example.dane.acra354;
import android.app.Application;

import org.acra.*;
import org.acra.annotation.*;

@ReportsCrashes(
        formUri = "http://www.backendofyourchoice.com/reportpath"
)

public class Acra354Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // The following line triggers the initialization of ACRA
        ACRA.init(this);
    }
}

