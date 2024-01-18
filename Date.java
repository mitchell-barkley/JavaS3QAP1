package Problem2;

public class Date {
    private int year;
    private int day;
    private int month;

    public Date() {
        this.day = 8;
        this.month = 10;
        this.year = 1982;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day!");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month!");
        }
    }

    public void setYear(int year) {
        if (year >= 1000 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
