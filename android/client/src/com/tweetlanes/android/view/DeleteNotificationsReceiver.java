package com.tweetlanes.android.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tweetlanes.android.Notifier;

/**
 * Created with IntelliJ IDEA.
 * User: Jason
 * Date: 4/8/13
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class DeleteNotificationsReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String accountKey = extras.getString("account_key");
            long postId = extras.getLong("post_id");

            Notifier.saveLastNotificationActioned(context, accountKey, postId);

        }
    }
}
