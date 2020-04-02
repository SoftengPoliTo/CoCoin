package com.nightonke.saver.ui;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;


/**
 * Created by 伟平 on 2015/10/30.
 */
public class DummyOperation extends AsyncTask<Void, Integer, Void> {


    private Context mContext;
    public DummyOperation(Context c) {
        mContext = c;

    }

    @Override
    protected Void doInBackground(Void... voids) {

        for(int i = 0; i < 11 ; i++) {

            try {

                Thread.sleep(70);

                onProgressUpdate(i * 10);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        return null;
    }

    @Override
    protected void onPostExecute(Void voids) {

    }

    @Override
    protected void onProgressUpdate(Integer... progress) {
        super.onProgressUpdate(progress);
        toast(progress[0]);

    }

    @Override
    protected void onCancelled() {
        super.onCancelled();

    }

    private void toast(int msg) {
        Toast.makeText(mContext,""+msg, Toast.LENGTH_LONG).show();
    }
}
