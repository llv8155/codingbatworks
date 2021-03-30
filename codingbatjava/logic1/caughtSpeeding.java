public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday)
  // Unless it is your birthday -- on that day, your speed can be 5 higher in all cases
  {
    if (0 <= speed && speed <= 65)
    {
      return 0;
    }
    else if (66 <= speed && speed <= 85)
    {
      return 1;
    }
    else
    {
      return 2;
    }
  }
  else
  {
    if (0 <= speed && speed <= 60)
    // If speed is 60 or less, the result is 0
    {
      return 0;
    }
    else if (61 <= speed && speed<= 80)
    // If speed is between 61 and 80 inclusive, the result is 1
    {
      return 1;
    }
    else
    // If speed is 81 or more, the result is 2
    {
      return 2;
    }
  }
}
