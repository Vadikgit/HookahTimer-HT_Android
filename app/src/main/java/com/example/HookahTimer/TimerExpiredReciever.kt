package com.example.HookahTimer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import util.NotificationUtil
import util.PrefUtil

class TimerExpiredReciever : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)
        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0,context)


    }
}
