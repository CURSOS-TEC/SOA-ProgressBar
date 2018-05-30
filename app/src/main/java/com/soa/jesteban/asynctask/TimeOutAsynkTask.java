package com.soa.jesteban.asynctask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.util.Log;

class TimeOutAsynkTask extends AsyncTask<Void, Void, Void> {
    private String mUser;
    private String mPassword;
    private ProgressDialog mProgress;
    private Context mContext;

    public TimeOutAsynkTask(Context context,String username, String password) {
        this.mUser = username;
        this.mPassword = password;
        this.mContext = context;

    }


    @Override
    protected Void doInBackground(Void... voids) {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPreExecute() {

        super.onPreExecute();
        mProgress = new ProgressDialog(this.mContext);
        mProgress.setMessage("Cargando...");
        mProgress.setIndeterminate(true);
        mProgress.show();
        //Log.e("DEbug","Fail");

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        this.mProgress.dismiss();
    }
}
