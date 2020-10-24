class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes < 59 && hours <= 12) {
            minutes++;
        } else if (hours <= 12 && minutes == 59) {
            minutes = 0;
            if (hours == 12) {
                hours = 0;
            }
            hours++;
        }
    }
}