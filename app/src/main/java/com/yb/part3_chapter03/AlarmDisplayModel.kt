package com.yb.part3_chapter03

data class AlarmDisplayModel(
    val hour: Int,
    val minute: Int,
    var onOff: Boolean,
) {
    val timeText: String
        get() {
            val h = "%02d".format(if (hour > 12) { hour - 12 } else { hour })
            val m = "%02d".format(minute)

            return "$h:$m"
        }

    val ampmText: String
        get() {
            return if (hour > 12) "PM" else "AM"
        }

    val onOffText: String
        get() {
            return if (onOff) "알람 끄기" else "알람 켜기"
        }

    fun makeDataForDB() :String {
        return "$hour:$minute"
    }

}
