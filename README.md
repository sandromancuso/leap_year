Leap Year
=========

Rules

if year is not divisible by 4 then
    not leap year
else if year is not divisible by 100 then
    leap year
else if year is divisible by 400 then
    leap year
else
    not leap year

All the following rules must be satisfied:
- Is leap year if divisible by 400
- Is NOT leap year if divisible by 100 but not by 400
- Is leap year is divisible by 4


Examples:
1997 is NOT leap year  (not divisible by 4)
1996 is leap year      (divisible by 4)
1600 is leap year      (divisible by 400)
1800 is NOT leap year  (divisible by 4, divisible by 100, NOT divible by 400)
