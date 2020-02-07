package eulerlibrary.MathLibrary;

public class Utilities
{
    /**
     * The FormatMilliseconds method takes a long integer that represents a
     * elasped time in milliseconds and returns a HH:MM:SS.mmm string.
     * 
     * @param totalMilliseconds  the number of milliseconds
     * @return                   the formatted string
     */
    public static String FormatMilliseconds(final long totalMilliseconds) {

        final Long milliseconds = totalMilliseconds % 1000;
        final Long totalseconds = totalMilliseconds / 1000;
        final Long seconds = totalseconds % 60;
        final Long totalminutes = totalseconds / 60;
        final Long minutes = totalminutes % 60;
        final Long hours = totalminutes / 60;

        String formatSeconds = seconds.toString();
        String formatMinutes = minutes.toString();
        String formatHours = hours.toString();
        String formatMilliseconds;

        if (milliseconds < 10)       formatMilliseconds = "00" + milliseconds.toString();
        else if (milliseconds < 100) formatMilliseconds = "0" + milliseconds.toString();
        else                         formatMilliseconds = milliseconds.toString();


        if (seconds < 10) formatSeconds = "0" + formatSeconds;
        if (minutes < 10) formatMinutes = "0" + formatMinutes;
        if (hours < 10) formatHours = "0" + formatHours;

        return formatHours + ":" + formatMinutes + ":" + formatSeconds + "." + formatMilliseconds;

    }

}