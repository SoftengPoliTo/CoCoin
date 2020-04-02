package com.nightonke.saver.util;

import android.content.Context;
import android.graphics.Color;
import android.widget.Toast;

import com.nightonke.saver.activity.CoCoinApplication;

/**
 * Created by Weiping on 2015/11/30.
 */
public class CoCoinToast {
    private static CoCoinToast ourInstance = new CoCoinToast();

    public static CoCoinToast getInstance() {
        return ourInstance;
    }

    private CoCoinToast() {
    }

    public void showToast(Context context, int text, int color) {
        Toast.makeText(context, context.getString(text), Toast.LENGTH_LONG).show();
    }

    public void showToast(Context context,String text, int color) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }


}
