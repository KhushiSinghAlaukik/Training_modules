# Day-18

# Topics covered

* Optional
* LocalDate
* LocalTime
* LocalDateTime
* Date Formatting
* Java Time API

# 1. Optional

`Optional<T>` is a container object that may or may not contain a non-null value.
It was introduced in Java 8 to help developers handle situations where a value might be missing, reducing the need for explicit null checks.
Without Optional, accessing a null reference can result in a `NullPointerException`.

-Why Do We Need Optional?

Consider a situation where we search for an employee by ID. The employee may or may not exist in the database.
Instead of returning `null`, we can return an `Optional<Employee>` to represent the possibility of a missing employee.

- Important Optional Methods

| Method                       | Description                                                   |
| ---------------------------- | ------------------------------------------------------------- |
| `Optional.of(value)`         | Creates an Optional containing a non-null value.              |
| `Optional.ofNullable(value)` | Creates an Optional that can contain a nullable value.        |
| `Optional.empty()`           | Creates an empty Optional.                                    |
| `isPresent()`                | Returns `true` if a value is present.                         |
| `isEmpty()`                  | Returns `true` if no value is present.                        |
| `get()`                      | Returns the value if present; otherwise, throws an exception. |
| `orElse(value)`              | Returns the value or a default value.                         |
| `orElseGet(supplier)`        | Returns the value or obtains a default value from a Supplier. |
| `orElseThrow()`              | Returns the value or throws an exception if empty.            |
| `ifPresent(action)`          | Executes an action if a value is present.                     |
| `map(function)`              | Transforms the value if present.                              |
| `filter(predicate)`          | Keeps the value only if it matches a condition.               |

# 2. LocalDate

`LocalDate` represents a date without a time or time zone.
It was introduced in Java 8 as part of the `java.time` package.
A `LocalDate` contains:
* Year
* Month
* Day

The value returned by `LocalDate.now()` depends on the system's current date.

- Important LocalDate Methods

| Method                 | Description                             |
| ---------------------- | --------------------------------------- |
| `now()`                | Returns the current date.               |
| `of(year, month, day)` | Creates a specific date.                |
| `parse(text)`          | Parses an ISO-format date string.       |
| `getYear()`            | Returns the year.                       |
| `getMonth()`           | Returns the month as a `Month` enum.    |
| `getMonthValue()`      | Returns the month number.               |
| `getDayOfMonth()`      | Returns the day of the month.           |
| `getDayOfWeek()`       | Returns the day of the week.            |
| `plusDays(n)`          | Adds days.                              |
| `minusDays(n)`         | Subtracts days.                         |
| `plusMonths(n)`        | Adds months.                            |
| `minusMonths(n)`       | Subtracts months.                       |
| `plusYears(n)`         | Adds years.                             |
| `isBefore(date)`       | Checks whether a date is earlier.       |
| `isAfter(date)`        | Checks whether a date is later.         |
| `isLeapYear()`         | Checks whether the year is a leap year. |

- Real-World Applications
* Employee joining dates.
* Student admission dates.
* Birthdays.
* Appointment dates.
* Booking dates.
* Payment due dates.

# 3. LocalTime

`LocalTime` represents a time without a date or time zone.
It stores:
* Hour
* Minute
* Second
* Nanosecond

- Important LocalTime Methods

| Method             | Description                       |
| ------------------ | --------------------------------- |
| `now()`            | Returns the current time.         |
| `of(hour, minute)` | Creates a specific time.          |
| `parse(text)`      | Parses a time string.             |
| `getHour()`        | Returns the hour.                 |
| `getMinute()`      | Returns the minute.               |
| `getSecond()`      | Returns the second.               |
| `plusHours(n)`     | Adds hours.                       |
| `minusHours(n)`    | Subtracts hours.                  |
| `plusMinutes(n)`   | Adds minutes.                     |
| `minusMinutes(n)`  | Subtracts minutes.                |
| `isBefore(time)`   | Checks whether a time is earlier. |
| `isAfter(time)`    | Checks whether a time is later.   |


# 4. LocalDateTime

`LocalDateTime` represents both a date and a time without a time zone or UTC offset.
It combines the functionality of `LocalDate` and `LocalTime`.

- Important LocalDateTime Methods

| Method               | Description                        |
| -------------------- | ---------------------------------- |
| `now()`              | Returns the current date and time. |
| `of(...)`            | Creates a specific date and time.  |
| `parse(text)`        | Parses a date-time string.         |
| `toLocalDate()`      | Extracts the date.                 |
| `toLocalTime()`      | Extracts the time.                 |
| `plusDays(n)`        | Adds days.                         |
| `minusDays(n)`       | Subtracts days.                    |
| `plusHours(n)`       | Adds hours.                        |
| `minusHours(n)`      | Subtracts hours.                   |
| `plusMinutes(n)`     | Adds minutes.                      |
| `isBefore(dateTime)` | Checks whether it is earlier.      |
| `isAfter(dateTime)`  | Checks whether it is later.        |

**Important:** `LocalDateTime` does not store a time zone. For globally coordinated events, such as transactions across multiple countries, consider `Instant`, `OffsetDateTime`, or `ZonedDateTime`.

# 5. Date Formatting

Date formatting allows us to convert date and time objects into readable strings.
Java provides the `DateTimeFormatter` class for formatting and parsing dates and times.
It belongs to the `java.time.format` package.

### Common Date Formatting Patterns

| Pattern | Meaning                | Example   |
| ------- | ---------------------- | --------- |
| `dd`    | Day of month           | `21`      |
| `MM`    | Month number           | `10`      |
| `MMM`   | Short month name       | `Oct`     |
| `MMMM`  | Full month name        | `October` |
| `yyyy`  | Year                   | `2026`    |
| `HH`    | Hour in 24-hour format | `14`      |
| `hh`    | Hour in 12-hour format | `02`      |
| `mm`    | Minutes                | `30`      |
| `ss`    | Seconds                | `45`      |
| `a`     | AM/PM marker           | `PM`      |

**Remember:**

* `MM` means month.
* `mm` means minute.
* `HH` represents the 24-hour clock.
* `hh` represents the 12-hour clock.

# 6. Java Time API

The Java Time API is a modern date and time API introduced in Java 8 under the `java.time` package.
It replaces many limitations of the older `java.util.Date` and `java.util.Calendar` APIs.
The modern API is designed to be immutable and thread-safe for its core date/time value types.

- Important Classes in the Java Time API

| Class               | Purpose                             | Example                     |
| ------------------- | ----------------------------------- | --------------------------- |
| `LocalDate`         | Date only                           | `2026-10-21`                |
| `LocalTime`         | Time only                           | `14:30:00`                  |
| `LocalDateTime`     | Date and time without a zone        | `2026-10-21T14:30`          |
| `ZonedDateTime`     | Date and time with a time zone      | Date-time in `Asia/Kolkata` |
| `OffsetDateTime`    | Date and time with a UTC offset     | `2026-10-21T14:30+05:30`    |
| `Instant`           | A point on the UTC timeline         | `2026-10-21T09:00:00Z`      |
| `Period`            | Date-based amount of time           | `2 years, 3 months`         |
| `Duration`          | Time-based amount of time           | `5 hours, 30 minutes`       |
| `DateTimeFormatter` | Formats and parses date/time values | `21-10-2026`                |
| `ZoneId`            | Identifies a time zone              | `Asia/Kolkata`              |


# 7. Difference Between LocalDate, LocalTime, and LocalDateTime

| Feature          | LocalDate    | LocalTime    | LocalDateTime             |
| ---------------- | ------------ | ------------ | ------------------------- |
| Stores date      | Yes          | No           | Yes                       |
| Stores time      | No           | Yes          | Yes                       |
| Stores time zone | No           | No           | No                        |
| Common use       | Birthday     | Opening time | Appointment date and time |
| Example          | `2026-10-21` | `14:30:00`   | `2026-10-21T14:30:00`     |

# Task-1
Employee Attendance System
Features:
• Check-in
• Check-out
• Working hours
• Attendance report