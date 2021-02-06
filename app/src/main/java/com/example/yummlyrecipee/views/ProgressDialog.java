package com.example.yummlyrecipee.views;

import android.app.Activity;

import com.example.yummlyrecipee.R;


/**
 * Created by User on 9/2/2016.
 */
public class ProgressDialog {

    private android.app.ProgressDialog progressDialog;


    public void show(String message, Activity context) {
        progressDialog = new android.app.ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
        progressDialog.setCancelable(true);
        progressDialog.setMessage(message);
        progressDialog.setProgressStyle(android.app.ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);
        progressDialog.show();
    }

    public void show(Integer messageResId, Activity context) {
        progressDialog = new android.app.ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        String message = context.getString(messageResId);
        progressDialog.setMessage(message);
        progressDialog.setProgressStyle(android.app.ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);
        progressDialog.show();
    }

    public void showUncancelled(Integer messageResId, Activity context) {
        progressDialog = new android.app.ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
        progressDialog.setCancelable(false);
        String message = context.getString(messageResId);
        progressDialog.setMessage(message);
        progressDialog.setProgressStyle(android.app.ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);
        progressDialog.show();
    }

    public void showUncancelled(String message, Activity context) {
        progressDialog = new android.app.ProgressDialog(context, R.style.AppCompatAlertDialogStyle);
        progressDialog.setCancelable(false);
        progressDialog.setMessage(message);
        progressDialog.setProgressStyle(android.app.ProgressDialog.STYLE_SPINNER);
        progressDialog.setProgress(0);
        progressDialog.show();
    }

    public void dismiss() {
        if (progressDialog != null)
            progressDialog.dismiss();
    }
}
