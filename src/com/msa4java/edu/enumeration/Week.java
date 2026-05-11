package com.msa4java.edu.enumeration;

public enum Week {
    // private Week MONDAY = new Week();
    MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    private final String krDay;

    private Week(String day) {
        this.krDay = day;
    }

    // Getter
    public String getKrDay() {
        return this.krDay;
    }
}
