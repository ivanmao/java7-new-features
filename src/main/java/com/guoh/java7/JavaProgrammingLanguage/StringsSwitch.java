package com.guoh.java7.JavaProgrammingLanguage;


/**
 * The switch statement compares the String object in its expression with the expressions associated
 * with each case label as if it were using the String.equals method; consequently, the comparison
 * of String objects in switch statements is case sensitive.
 * 
 * @author mao_g
 *
 */
public class StringsSwitch {
  public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
    String typeOfDay;
    switch (dayOfWeekArg) {
      case "Monday":
        typeOfDay = "Start of work week";
        break;
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
        typeOfDay = "Midweek";
        break;
      case "Friday":
        typeOfDay = "End of work week";
        break;
      case "Saturday":
      case "Sunday":
        typeOfDay = "Weekend";
        break;
      default:
        throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
    }
    return typeOfDay;
  }

}
