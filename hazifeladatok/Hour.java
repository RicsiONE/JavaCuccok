/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazifeladatok;

public class Hour {

    private int hr;
    private int min;
    private int sec;

    public void getTime() {
        System.out.println("A tárolt idő " + this.hr + ":" + this.min + ":" + this.sec);

    }

    public void addSec(int sec) {
        if ((this.sec + sec) >= 60) {
            int tarolo = (this.sec + sec) / 60;
            this.sec = (this.sec + sec) % 60;
            this.addMin(tarolo);
        } else {
            this.sec += sec;
        }
    }

    public void addMin(int addMinutes) {
        if ((this.min + addMinutes) >= 60) {
            int tarolo = (this.min + addMinutes) / 60;
            this.min = (this.min + addMinutes) % 60;
            this.addHour(tarolo);
        } else {
            this.min += addMinutes;
        }
    }

    public void addHour(int addHour) {
        if ((this.hr + addHour) >= 24 /*|| (this.hr == 24 && this.min > 0)*/) {
            int tarolo = (this.hr + addHour) / 24;
            this.hr = (this.hr + addHour) % 24;
            System.out.println("Túllépted a 24-órát: " + tarolo + " ennyi nappal");
        } else {
            this.hr += addHour;
        }
    }

    public Hour(int hr, int min, int sec) {
        if (hr >= 24 || hr < 0) {
            throw new IllegalArgumentException("\nNem megfelelő órát adtál meg!"
                    + "\n (0-24) között kell megnod!"
                    + "\n Megadott értéked:" + hr);
        }
        if (min >= 60 || min < 0) {
            throw new IllegalArgumentException("\nNem megfelelő percet adtál meg!"
                    + "\n (0-60) között kell megnod!"
                    + "\n Megadott értéked: " + min);
        }
        if (sec >= 60 || sec < 0) {
            throw new IllegalArgumentException("\nNem megfelelő másodpercet adtál meg!"
                    + "\n (0-60) között kell megnod!"
                    + "\n Megadott értéked: " + sec);
        }

        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public Hour(int hr) {
        this(hr, 0, 0);
    }

    public Hour(int hr, int min) {
        this(hr, min, 0);
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public static void main(String[] args) {
        // Hour h1 = new Hour(23, 10, 10);
        Hour h2 = null;
        try {
            h2 = new Hour(14, 14, 01);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println("Nem jött létre az óra példány!");
        } finally {
            if (null != h2) {
                h2.getTime();
            }
        h2.addSec(10000);
        h2.getTime();
            //h1.getTime();
//        h1.getTime();
//        h1.addMin(50);
//        h1.getTime();
//        h1.addSec(50);
//        h1.getTime();
        }

    }
