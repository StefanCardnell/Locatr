package com.bignerdranch.android.locatr;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PermissionRationaleFragment extends DialogFragment {

    private static final String TAG = "PermissionRationaleFrag";

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_permission_rationale, null);

        return new AlertDialog.Builder(getActivity())
            .setView(v)
            .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    sendResult(Activity.RESULT_OK);
                }
            })
            .create();

    }

    @Override
    public void onCancel(@NonNull DialogInterface dialog) {
        Log.i(TAG, "onCancel called");
        sendResult(Activity.RESULT_CANCELED);
    }

    protected void sendResult(int resultCode){
        Intent intent = new Intent();
        getTargetFragment().onActivityResult(getTargetRequestCode(), resultCode, intent);
    }
}
